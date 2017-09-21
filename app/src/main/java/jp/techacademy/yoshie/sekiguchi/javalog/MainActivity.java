package jp.techacademy.yoshie.sekiguchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ログ出力用に追記

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Human.introduce();   //Human class呼んでること確認用
         */

        Human human1 = new Human("のび太", 12, "あやとり");
        Human human2 = new Human("スネ夫", 11, "ラジコン");
        Human human3 = new Human("タケシ", 10, "リサイタル");

        human1.say();
        human1.think();

        human2.say();
        human2.think();

        human3.say();
        human3.think();

    }

}