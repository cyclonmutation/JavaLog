package jp.techacademy.yoshie.sekiguchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ログ出力用に追記

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 整数型の変数をnumという名前で作成して、10を代入する
        int num = 10;
        Log.d("javatest", String.valueOf(num));    // num出力

        // numに50を代入
        num = 50;
        Log.d("javatest", String.valueOf(num));    // num出力

    }
}
