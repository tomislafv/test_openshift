package com.kaufland.demo_openshift;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {


        return "index";
    }
    @RequestMapping(value = {"/site2" }, method = RequestMethod.GET)
    public String site2(Model model) {


        System.out.println(Prime(100000));



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
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }


}
