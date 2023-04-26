package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;


public class FileHelper {

    public ArrayList<String> matchedPasswordList = new ArrayList<>();
    public ArrayList<String> originalHashPasswordList = new ArrayList<>();

    public void addPasswords() {
        originalHashPasswordList.add("788d4feee88a6b50e37e6547a6ca7fa4");
        originalHashPasswordList.add("c0717bbd02f1819950c4d6f269efef81");
        originalHashPasswordList.add("900b8a3414a93a2efc286d866317503f");
        originalHashPasswordList.add("b9b549591de5e8275873058a85a43f61");
        originalHashPasswordList.add("1ff0ea9c8f5bafaab8cb01947f3c3166");
    }

    public void fileReader() {

        Md5Hash md5Hash = new Md5Hash();

        String filePath = "10-million-password-list-top-1000000.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            //System.out.println(line);

            while (line != null) {
                line = reader.readLine();

                //System.out.println(line);

                if (line != null){
                    String hashedPassword = md5Hash.getMd5Hash(line);
                    if (originalHashPasswordList.contains(hashedPassword)) {
                        matchedPasswordList.add(line);
                        matchedPasswordList.add(hashedPassword);
                        matchedPasswordList.add("------------");
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}



