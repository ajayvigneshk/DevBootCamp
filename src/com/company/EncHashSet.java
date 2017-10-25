package com.company;

import java.util.HashSet;

public class EncHashSet extends HashSet<String> {


    private String encrypt(String toEnc) {
        return toEnc+"123";
    }


    @Override
    public boolean add(String s) {
        return super.add(encrypt(s));
    }
}
