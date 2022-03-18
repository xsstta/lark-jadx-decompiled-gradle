package com.ss.android.ttve.mediacodec;

import android.media.MediaCodecInfo;

/* renamed from: com.ss.android.ttve.mediacodec.b */
class C60204b {
    /* renamed from: a */
    static MediaCodecInfo.CodecProfileLevel m233984a(MediaCodecInfo.CodecCapabilities codecCapabilities, int i, int i2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = null;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == i) {
                return codecProfileLevel2;
            }
            if ((codecProfileLevel == null || codecProfileLevel.profile < codecProfileLevel2.profile) && i2 != 1) {
                codecProfileLevel = codecProfileLevel2;
            }
        }
        return codecProfileLevel;
    }
}
