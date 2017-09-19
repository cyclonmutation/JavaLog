package jp.techacademy.yoshie.sekiguchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ログ出力用に追記

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int drink = 1;


        for (int i = 1; i < 6; i++) {
            Log.d("javatest", "for文の " + String.valueOf(i) + "回目");
        }

        int num = 1;

        while (num < 6) {
            Log.d("javatest", "while文の " + String.valueOf(num) + "回目");
            num++;
        }
    }
}
