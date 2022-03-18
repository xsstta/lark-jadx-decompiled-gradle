package com.bytedance.common.jato.shrinker;

import android.os.Build;
import com.ss.ttm.player.MediaPlayer;

public class Shrinker {
    private static Shrinker sInstance;

    public int doShrink() {
        return doShrink(MediaPlayer.MEDIA_PLAYER_OPTION_APPID, 2048);
    }

    public static synchronized Shrinker getInstance() {
        Shrinker shrinker;
        synchronized (Shrinker.class) {
            if (sInstance == null) {
                sInstance = new Shrinker();
            }
            shrinker = sInstance;
        }
        return shrinker;
    }

    public int doShrink(int i) {
        return doShrink(i, 2048);
    }

    public int doShrinkRegion(int i) {
        if (Build.VERSION.SDK_INT < 26 || !ShrinkerNativeHolder.ensureInited()) {
            return 0;
        }
        return ShrinkerNativeHolder.shrinkRegionNative(i);
    }

    public int doShrink(int i, int i2) {
        if (Build.VERSION.SDK_INT > 23 && Build.VERSION.SDK_INT <= 29 && ShrinkerNativeHolder.ensureInited()) {
            ShrinkerNativeHolder.shrinkMallocNative(2, 16);
        }
        if (Build.VERSION.SDK_INT <= 19 || !ShrinkerNativeHolder.ensureInited()) {
            return -1;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return ShrinkerNativeHolder.shrinkHeapNative(i);
        }
        return ShrinkerNativeHolder.shrinkRegionNative(i2);
    }
}
