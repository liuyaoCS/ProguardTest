package com.example.liuyao.proguardtest;

import android.app.Activity;
import android.os.Bundle;
import test.Add;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Add add = new Add();
        int c= add.add(1,2);
        System.out.print("c="+c);
        say();

    }
    private void say(){
        System.out.print("c=");
    }

}
