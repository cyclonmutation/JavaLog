package jp.techacademy.yoshie.sekiguchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ログ出力用に追記

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int t = total(100, 1000);   //totalからsumを返却しtに代入
        Log.d("javatest", String.valueOf(t));   //tをLog出力
    }

    private int total(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {   //firstをlastまで1ずつ増量
            sum = sum + i;  //firstから増量した値を合計
        }

        return sum;
    }
}
