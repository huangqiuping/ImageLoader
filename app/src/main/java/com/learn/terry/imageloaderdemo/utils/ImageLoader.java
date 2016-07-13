package com.learn.terry.imageloaderdemo.utils;

import android.app.ActivityManager;
import android.content.Context;

/**
 * Created by Terry on 2016/7/13.
 * email: hqp770@126.com
 */
public class ImageLoader {
    private static ImageLoader mImageLoader;
    private static Context mContext;

    public static ImageLoader getInstance(Context context) {
        if (mImageLoader == null) {
            synchronized (ImageLoader.class) {
                if (mImageLoader == null) {
                    mImageLoader = new ImageLoader();
                }
            }
        }
        mContext = context;

        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        int memoryClassBytes = activityManager.getMemoryClass() * 1024 * 1024;
        return mImageLoader;
    }

}
