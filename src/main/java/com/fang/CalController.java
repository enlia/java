package com.fang.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalController {
    @RequestMapping("/cal")
    @ResponseBody
    double cal(double p,double yr,int m){
        double mr=yr/12/100;
        double pow = Math.pow(1 + mr, m);
        double payment=p*mr*pow/(pow-1);
        return payment*m;
    }
}
