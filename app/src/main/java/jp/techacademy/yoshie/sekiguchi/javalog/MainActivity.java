package jp.techacademy.yoshie.sekiguchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ログ出力用に追記

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int num1 = 10 + 5 - 2 * 4 / 2;
        Log.d("javatest", "10 + 5 - 2 * 4 / 2 = " + String.valueOf(num1));

        boolean flag1 = true;
        boolean flag2 = false;
        Log.d("javatest", "flag1 && flag2 = " + String.valueOf(flag1 && flag2));    // and条件
        Log.d("javatest", "flag1 || flag2 = " + String.valueOf(flag1 || flag2));    // or条件

        int num2 = 10;
        int num3 = 20;
        Log.d("javatest", "num2 < num3 = " + String.valueOf(num2 < num3));

    }
}
