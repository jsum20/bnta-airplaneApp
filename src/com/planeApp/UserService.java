package com.planeApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;


public class UserService {
    List<String> user = new ArrayList<>();
    public void makeUser() {
        Scanner User = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = User.nextLine();
        user.add(name);

        Scanner email1 = new Scanner(System.in);
        System.out.println("What is your email?");
        String email = email1.nextLine();
        user.add(email);

        Scanner phone = new Scanner(System.in);
        System.out.println("What is your number?");
        String phoneNumber = phone.nextLine();
        user.add(phoneNumber);

        Scanner passport = new Scanner(System.in);
        System.out.println("What is your passport number?");
        String passportNumber = passport.nextLine();
        user.add(passportNumber);

        String ID = UUID.randomUUID().toString();
        user.add(ID);
    }
}

