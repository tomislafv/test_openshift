package com.kaufland.demo_openshift;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//@Controller
public class TestController {


    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {


        return "index";

    }
    @RequestMapping(value = {"/CputUpTo1" }, method = RequestMethod.GET)
    public String Cpu1(Model model) {

        System.out.println("start Stufe 1");
        calculat(10000);


        return "index";
    }

    @RequestMapping(value = {"/CputUpTo2" }, method = RequestMethod.GET)
    public String Cpu2(Model model) {

        System.out.println("start Stufe 2");
       calculat(100000);


        return "index";
    }

    @RequestMapping(value = {"/CputUpTo3" }, method = RequestMethod.GET)
    public String Cpu3(Model model) {


        System.out.println("start Stufe 3");
        calculat(500000);


        return "index";
    }

    public static void calculat(int maxCheck){
        LocalDateTime start = LocalDateTime.now();
       // System.out.println(prime(maxCheck));
        LocalDateTime end = LocalDateTime.now();
        double between = ChronoUnit.MILLIS.between(start, end);
       // System.out.println(between/1000 + " sekunden");

    }

    public static String prime(int maxCheck){
        int i;
        int num = 0;
        boolean isPrime = true;

        String primeNumbersFound = "";

        for (i = 1; i<=maxCheck; i++){
            isPrime = checkPrime(i);
            if (isPrime){
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }


        return primeNumbersFound;
    }

    public static boolean checkPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0 ) {
                return false;
            }
        }
        return true;

    }

}
