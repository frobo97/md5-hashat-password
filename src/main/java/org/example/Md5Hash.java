package org.example;


import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Md5Hash {


    public  String getMd5Hash(String password) throws NoSuchAlgorithmException {

        password = password.trim();

        MessageDigest messageDigest = MessageDigest.getInstance("MD5");

        messageDigest.update(password.getBytes());

        byte[] digest = messageDigest.digest();

        String hashBytes = Base64.getEncoder().encodeToString(digest);

        return DigestUtils.md5Hex(hashBytes);

    }

}
