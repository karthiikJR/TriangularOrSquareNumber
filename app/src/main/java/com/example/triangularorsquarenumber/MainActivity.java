package com.example.triangularorsquarenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Checksqrtri ck;

    static class Checksqrtri{
        int num;

        public boolean isSqr(){
            int root = (int) Math.sqrt(num);
            return root * root == num;
        }

        public boolean isTri(){
            int a = 0;
            int flag = 0;
            for(int i = 1;i <= num;i++){
                a+=i;
                if(a==num)
                    flag = 1;

            }
            return flag == 1;
        }

    }

    public void checkNum(View view){

        String message;

        try {

            TextView tv = findViewById(R.id.etInput);
            ck.num = Integer.parseInt(tv.getText().toString());

            Log.i("number", tv.getText().toString());



            if(ck.isSqr() && ck.isTri()){
                message = "It is both Square number and Triangular number";
            }
            else if(ck.isSqr())
                message = "It is a Square number";
            else if (ck.isTri())
                message = "It is a Triangular number";
            else
                message = "It is not a Square number or a Triangular number";

        }catch(Exception e){
            message = "Enter a valid number!";
        }
        Toast t = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ck = new Checksqrtri();
    }
}