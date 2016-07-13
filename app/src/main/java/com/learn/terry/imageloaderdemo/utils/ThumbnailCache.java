package com.learn.terry.imageloaderdemo.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/**
 * Created by Terry on 2016/7/13.
 * email: hqp770@126.com
 */
public class ThumbnailCache extends LruCache<String, Bitmap> {
    /**
     * @param maxSize for caches that do not override {@link #sizeOf}, this is
     *                the maximum number of entries in the cache. For all other caches,
     *                this is the maximum sum of the sizes of the entries in this cache.
     */
    public ThumbnailCache(int maxSize) {
        super(maxSize);
    }

    public void loadImage(String url, ImageView imageView) {

    }
}
