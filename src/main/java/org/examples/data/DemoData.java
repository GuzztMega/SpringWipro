package org.examples.data;

import org.springframework.stereotype.Component;

@Component
public class DemoData {

    public int sum(int a, int b){
        return a+b;
    }

    public String concat(String a, String b){
        return a+" "+b;
    }
}
