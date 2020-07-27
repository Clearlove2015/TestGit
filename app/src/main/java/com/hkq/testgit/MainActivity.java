package com.hkq.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Author:zc
 * TIME:2020-7-15 13:14:06
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("first_t");
        System.out.println("second_t");
        System.out.println("third_t");
        System.out.println("four_t");
        System.out.println("five_t");
        System.out.println("测试中文乱码1");
    }
}
