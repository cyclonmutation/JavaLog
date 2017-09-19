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

        switch (drink) {
            case 0:
                Log.d("javatest", "コーヒーを注文しました");
                break;
            case 1:
                Log.d("javatest", "紅茶を注文しました");
                break;
            case 2:
                Log.d("javatest", "ミルクを注文しました");
                break;
            default:
                Log.d("javatest", "オーダーミスです");
                break;
        }

    }
}
