package com.fang.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.NumberFormat;

@Controller
public class CalController {
    @RequestMapping("/cal")
    @ResponseBody
    String[] cal(double p,double yr,int m){
        double mr=yr/12/100;
        double pow = Math.pow(1 + mr, m);
        double payment=p*mr*pow/(pow-1);
//        return payment*m;
        String[] arr=new String[]{
                NumberFormat.getCurrencyInstance().format(payment*m),
                NumberFormat.getCurrencyInstance().format((payment*m-p))
        };
        return arr;
    }


    @RequestMapping("/details")
    @ResponseBody
    void details(double p, int a,double pr){
//        new String[]{}

    }
}
