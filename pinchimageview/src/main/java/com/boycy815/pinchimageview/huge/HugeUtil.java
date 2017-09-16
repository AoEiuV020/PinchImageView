package com.boycy815.pinchimageview.huge;

import android.graphics.Point;
import android.net.Uri;
import android.widget.ImageView;

/**
 * 封装设置大图的方法，
 * Created by AoEiuV020 on 17-9-16.
 */

public class HugeUtil {
    public static TileDrawable setImageUri(final ImageView image, Uri uri) {
        final TileDrawable tile = new TileDrawable();
        tile.setInitCallback(new TileDrawable.InitCallback() {
            @Override
            public void onInit() {
                image.setImageDrawable(tile);
            }
        });
        tile.init(new HugeImageRegionLoader(image.getContext(), uri), new Point(image.getWidth(), image.getHeight()));
        return tile;
    }
}
