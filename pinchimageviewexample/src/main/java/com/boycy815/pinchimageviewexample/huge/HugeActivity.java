package com.boycy815.pinchimageviewexample.huge;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import com.boycy815.pinchimageview.PinchImageView;
import com.boycy815.pinchimageview.huge.HugeUtil;
import com.boycy815.pinchimageview.huge.TileDrawable;
import com.boycy815.pinchimageviewexample.R;


public class HugeActivity extends Activity {

    private TileDrawable mTileDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huge);
        final PinchImageView pinchImageView = (PinchImageView) findViewById(R.id.pic);
        pinchImageView.post(new Runnable() {
            @Override
            public void run() {
                mTileDrawable = HugeUtil.setImageUri(pinchImageView, Uri.parse("file:///android_asset/card.png"));
            }
        });
    }

    @Override
    protected void onDestroy() {
        if (mTileDrawable != null) {
            mTileDrawable.recycle();
        }
        super.onDestroy();
    }
}