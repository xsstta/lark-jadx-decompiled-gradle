package com.ss.android.videoshop.p3203i;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.ttvideoengine.Resolution;
import com.ss.ttvideoengine.model.VideoInfo;
import com.ss.ttvideoengine.model.VideoRef;

/* renamed from: com.ss.android.videoshop.i.b */
public class C64173b {
    /* renamed from: a */
    public static Resolution m252208a(String str) {
        Resolution[] values = Resolution.values();
        for (Resolution resolution : values) {
            if (TextUtils.equals(str, resolution.toString(VideoRef.TYPE_VIDEO))) {
                return resolution;
            }
        }
        return Resolution.Standard;
    }

    /* renamed from: a */
    private static int m252206a(VideoInfo videoInfo) {
        int ordinal;
        if (videoInfo != null) {
            String valueStr = videoInfo.getValueStr(7);
            Resolution[] allResolutions = Resolution.getAllResolutions();
            int length = allResolutions.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ordinal = Resolution.Undefine.ordinal();
                    break;
                }
                Resolution resolution = allResolutions[i];
                if (resolution.toString(VideoRef.TYPE_VIDEO).equals(valueStr)) {
                    ordinal = resolution.ordinal();
                    break;
                }
                i++;
            }
        } else {
            ordinal = Resolution.Undefine.ordinal();
        }
        return ordinal - 1;
    }

    /* renamed from: a */
    public static SparseArray<VideoInfo> m252207a(VideoRef videoRef) {
        SparseArray<VideoInfo> sparseArray = new SparseArray<>();
        if (!(videoRef == null || videoRef.getVideoInfoList() == null)) {
            for (VideoInfo videoInfo : videoRef.getVideoInfoList()) {
                int a = m252206a(videoInfo);
                if (a >= 0) {
                    sparseArray.put(a, videoInfo);
                }
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static VideoInfo m252209a(VideoRef videoRef, int i) {
        return m252207a(videoRef).get(i);
    }
}
