package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;


/**
 * @author  zkk
 * 简书:    http://www.jianshu.com/u/61f41588151d
 * github:  https://github.com/panacena
 */
public class NetworkActivity extends AppCompatActivity {

    LottieAnimationView animation_view_network;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network);

        animation_view_network=(LottieAnimationView)findViewById(R.id.animation_view_network);
//        loadUrl("http://www.chenailing.cn/EmptyState.json");
    }

//    private void loadUrl(String url) {
//        Request request;
//        try {
//            request = new Request.Builder()
//                    .url(url)
//                    .build();
//        } catch (IllegalArgumentException e) {
//            return;
//        }
//
//
//        if (client == null) {
//            client = new OkHttpClient();
//        }
//        client.newCall(request).enqueue(new Callback() {
//            @Override public void onFailure(Call call, IOException e) {
//
//            }
//
//            @Override public void onResponse(Call call, Response response) throws IOException {
//                if (!response.isSuccessful()) {
//                }
//
//                try {
//                    JSONObject json = new JSONObject(response.body().string());
//                    LottieComposition
//                            .fromJson(getResources(), json, new LottieComposition.OnCompositionLoadedListener() {
//                                @Override
//                                public void onCompositionLoaded(LottieComposition composition) {
//                                    setComposition(composition);
//                                }
//                            });
//                } catch (JSONException e) {
//                }
//            }
//        });
//    }

    @Override
    protected void onStop() {
        super.onStop();
        animation_view_network.cancelAnimation();
    }
}
