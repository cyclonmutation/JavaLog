package jp.techacademy.yoshie.sekiguchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ログ出力用に追記

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] points = new int[5];
        points[0] = 10;
        points[1] = 6;
        points[2] = 15;
        points[3] = 23;
        points[4] = 17;

        for (int i = 0; i < points.length; i++) {
            Log.d("javatest", String.valueOf(points[i]));
        }
    }
}
