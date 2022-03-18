package com.ss.android.vesdk;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.ttve.monitor.C60223e;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.vesdk.keyvaluepair.C64030a;

public class VEUtils {

    public enum CompatibleMode {
        Legacy,
        Skip_invalid,
        Fill_silence
    }

    public enum ImgType {
        Img_png,
        Img_jpeg
    }

    public enum Resolution {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_4K
    }

    public enum AVFileType {
        type_Unknown(-1),
        type_AudioVideo(0),
        type_Video(1),
        type_Audio(2),
        type_Image(3),
        type_Camera(4),
        type_Color(5),
        type_ImageVideo(6);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        private AVFileType(int i) {
            this.value = i;
        }
    }

    public static class VEVideoFileInfo {
        public boolean bHDR;
        public int bitDepth;
        public int bitrate;
        public int codec;
        public int duration;
        public String formatName;
        public int fps;
        public int height;
        public int keyFrameCount;
        public int maxDuration;
        public int rotation;
        public int width;

        public String toString() {
            return "width = " + this.width + ", height = " + this.height + ", rotation = " + this.rotation + ", duration = " + this.duration + ", bitrate = " + this.bitrate + ", fps = " + this.fps + ", codec = " + this.codec + ", keyFrameCount = " + this.keyFrameCount + ", maxDuration = " + this.maxDuration + ", formatName = " + this.formatName;
        }
    }

    /* renamed from: b */
    public static int m250916b(String str) {
        C60223e.m234073a("iesve_veutils_if_video_support_import", 1, (C64030a) null);
        return TEVideoUtils.isCanImport(str);
    }

    /* renamed from: a */
    public static VEVideoFileInfo m250915a(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVideoFileInfo(str, null);
        if (vEVideoFileInfo != null) {
            return vEVideoFileInfo;
        }
        C63929ab.m250980d("VEUtils", "getVideoFileInfo error!!!");
        return null;
    }

    /* renamed from: a */
    public static int m250914a(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    /* renamed from: a */
    public static int m250913a(String str, int[] iArr) {
        C60223e.m234073a("iesve_veutils_get_video_info", 1, (C64030a) null);
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVideoFileInfo(str, null);
        if (vEVideoFileInfo == null) {
            C63929ab.m250980d("VEUtils", "getVideoFileInfo2 error!!!");
            return -1;
        }
        switch (Math.min(iArr.length, 12)) {
            case HwBuildEx.VersionCodes.EMUI_5_1:
                iArr[11] = vEVideoFileInfo.bitDepth;
            case 11:
                iArr[10] = vEVideoFileInfo.maxDuration;
            case 10:
                iArr[9] = vEVideoFileInfo.keyFrameCount;
            case 9:
                iArr[8] = vEVideoFileInfo.codec;
            case 8:
                iArr[7] = vEVideoFileInfo.fps;
            case 7:
                iArr[6] = vEVideoFileInfo.bitrate;
            case 4:
            case 5:
            case 6:
                iArr[3] = vEVideoFileInfo.duration;
            case 3:
                iArr[2] = vEVideoFileInfo.rotation;
            case 2:
                iArr[1] = vEVideoFileInfo.height;
            case 1:
                iArr[0] = vEVideoFileInfo.width;
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public static int m250911a(String str, int i, int i2) {
        int isCanTransCode = TEVideoUtils.isCanTransCode(str, i, i2);
        if (isCanTransCode != 0) {
            C63929ab.m250978c("VEUtils", "isCanTransCode not supported!  path=" + str);
        }
        return isCanTransCode;
    }

    /* renamed from: a */
    public static int m250912a(String str, int i, AbstractC64077u uVar, boolean z, int i2, int i3, long j, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(uVar);
        C60223e.m234073a("iesve_veutils_extract_video_thumb", 1, (C64030a) null);
        return TEVideoUtils.getVideoThumb(str, i, tEVideoUtilsCallback, z, i2, i3, j, i4);
    }
}
