package com.wecare.controller;

import java.io.File;

public class Demo_con {

    public static void main(String[] args) {
        File directory = new File("src\\com\\wecare\\assets\\image\\logo\\rbc.jpg");
        System.out.println(directory.getAbsolutePath());
        System.out.println(directory.exists());
    }
}
