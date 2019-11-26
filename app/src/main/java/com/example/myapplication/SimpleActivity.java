package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

/**
 * @author  zkk
 * 简书:    http://www.jianshu.com/u/61f41588151d
 * github: https://github.com/panacena
 */
public class SimpleActivity extends AppCompatActivity {
    private LottieAnimationView lottieanimationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // activity_simple.xml中 lottie_fileName="data.json"
        // 所以只需要在 app/src/main/assets 中添加AE 生成的 json文件，重命名为data.json就可以显示动画
        setContentView(R.layout.activity_simple);
        lottieanimationview=findViewById(R.id.animation_view);
        lottieanimationview.setAnimation("data.json");
        lottieanimationview.playAnimation();
        lottieanimationview.loop(true);
    }
}
