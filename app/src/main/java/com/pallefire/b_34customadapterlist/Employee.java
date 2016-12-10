package com.pallefire.b_34customadapterlist;

import android.app.Activity;

/**
 * Created by Mirzaaqibbeg on 07-12-2016.
 */

public class Employee extends Activity {
    private String eno,ename,esalary;

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsalary() {
        return esalary;
    }

    public void setEsalary(String esalary) {
        this.esalary = esalary;
    }
}
