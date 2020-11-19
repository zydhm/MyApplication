package com.example.myapplication;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

/**
 * @author  zkk
 * 简书:    http://www.jianshu.com/u/61f41588151d
 * github:  https://github.com/panacena
 */
public class ClickActivity extends AppCompatActivity {//test again

    private Button button1,button2;
    private TextView tv_seek;

    LottieAnimationView animation_view_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        animation_view_click=(LottieAnimationView)findViewById(R.id.animation_view_click);
        tv_seek=(TextView)findViewById(R.id.tv_seek);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startAnima();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stopAnima();
            }
        });


        animation_view_click.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                tv_seek.setText(" 动画进度" +(int) (animation.getAnimatedFraction()*100) +"%");
            }
        });
    }

    /*
     * 开始动画
     */
    private  void startAnima(){

        boolean inPlaying = animation_view_click.isAnimating();
        if (!inPlaying) {
            animation_view_click.setProgress(0f);
            animation_view_click.playAnimation();
        }
    }
    /*
    * 停止动画
    */
    private  void stopAnima(){
        boolean inPlaying = animation_view_click.isAnimating();
        if (inPlaying) {
            animation_view_click.cancelAnimation();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        animation_view_click.cancelAnimation();
    }

}
