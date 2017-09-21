package jp.techacademy.yoshie.sekiguchi.javalog;

import android.util.Log;

class Human extends Animal {
    // class変数
    static String to_jp = "人間";

    // class関数
    public static void introduce() {
        Log.d("javatest", "これは" + to_jp + "クラスです。");
    }

    // menber変数
    String hobby;   //hobby変数定義

    // コンストラクタ（member変数の初期化）
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // 名乗りを上げるmember関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。歳は" + this.age + "歳です。");
    }

    // hobbyについて考えるmember関数
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }


}
