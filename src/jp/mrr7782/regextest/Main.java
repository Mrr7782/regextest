package jp.mrr7782.regextest;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Button text test
        System.out.println("Button text test");
        String[] btn = { "Button@75908473[styleClass=button]'ZERO'",
                         "Button@75908474[styleClass=button]'ONE'",
                         "Button@75908475[styleClass=button]'TWO'",
                         "Button@75908476[styleClass=button]'UwU'" };
        for (String x : btn) System.out.println(x.replaceAll(".*'(.*)'", "$1"));
        System.out.println();
        //IP validation test
        System.out.println("IP validation test");
        String[] iplist = { "192.168.1.116",
                            "1.1.1.1",
                            "255.255.255.255",
                            "255.255.255.256",
                            "1.0.2.1",
                            "465.493.213.123",
                            "a.3255.3.UW",
                            "35.44.23.68",
                            "1.2.3..4",
                            "8.8.8.8." };
        for (String x : iplist) {
            System.out.print(x + ": ");
            System.out.println((Pattern.matches("(?:(?:[01]\\d{0,2}|2(?:[0-4]\\d|5[0-5]|\\d?)|[3-9]\\d?)(?:\\.(?!$)|$)){4}", x) ? "" : "in") + "valid");
        }
        System.out.println();
        //Email validation test
        System.out.println("Email validation test");
        String[] emails = { "test@mail.com",
                            "double@tld.co.uk",
                            "onionv2@0n1osite7a90oeue5h4c26tn65bxt4c3.onion",
                            "name.dot@mail.ie",
                            "this.is@sub.retarded.ac.jp",
                            "@definitelyAn.email",
                            "real@email.com@haha",
                            "0018003825968",
                            "www.example.com",
                            "i#love-spec!&l'ch*rac+er$@email.ca" };
        for (String x : emails) {
            System.out.print(x + ": ");
            //!#$%&'*+-/=?^_`{|}~
            System.out.println((Pattern.matches("[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+", x) ? "" : "in") + "valid");
        }
    }
}
