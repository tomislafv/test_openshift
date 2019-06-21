package com.kaufland.demo_openshift;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Controller
public class HelloController {

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {


        return "index";
    }
    @RequestMapping(value = {"/CputUpTo1" }, method = RequestMethod.GET)
    public String Cpu1(Model model) {

        System.out.println(LocalTime.now());
        System.out.println(Prime(10000));
        System.out.println(LocalTime.now());


        return "index";
    }

    @RequestMapping(value = {"/CputUpTo2" }, method = RequestMethod.GET)
    public String Cpu2(Model model) {

        System.out.println(LocalTime.now());
        System.out.println(Prime(100000));
        System.out.println(LocalTime.now());


        return "index";
    }

    @RequestMapping(value = {"/CputUpTo3" }, method = RequestMethod.GET)
    public String Cpu3(Model model) {

        System.out.println(LocalTime.now());
        System.out.println(Prime(1000000));
        System.out.println(LocalTime.now());


        return "index";
    }

    public static String Prime(int maxCheck){
        int i;
        int num = 0;
        boolean isPrime = true;

        String primeNumbersFound = "";

        for (i = 1; i<=maxCheck; i++){
            isPrime = CheckPrime(i);
            if (isPrime){
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }


        return primeNumbersFound;
    }

    public static boolean CheckPrime(int numberToCheck) {
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
