package org.examples.services;

import org.examples.data.DemoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoData demoData;

    public int sum(int a, int b){
        return demoData.sum(a,b);
    }

    public String concat(String s1, String s2){
        return demoData.concat(s1,s2);
    }
}
