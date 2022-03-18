package org.webrtc;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;

class MediaCodecUtils {
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, 2141391876};
    static final String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC."};
    static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    private MediaCodecUtils() {
    }

    private static int[] getTextureColorFormats() {
        if (Build.VERSION.SDK_INT < 18) {
            return new int[0];
        }
        return new int[]{2130708361};
    }

    /* renamed from: org.webrtc.MediaCodecUtils$1 */
    static /* synthetic */ class C701271 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RXVideoCodecStandard;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.webrtc.RXVideoCodecStandard[] r0 = org.webrtc.RXVideoCodecStandard.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.MediaCodecUtils.C701271.$SwitchMap$org$webrtc$RXVideoCodecStandard = r0
                org.webrtc.RXVideoCodecStandard r1 = org.webrtc.RXVideoCodecStandard.VP8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.webrtc.MediaCodecUtils.C701271.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.RXVideoCodecStandard r1 = org.webrtc.RXVideoCodecStandard.VP9     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.webrtc.MediaCodecUtils.C701271.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.RXVideoCodecStandard r1 = org.webrtc.RXVideoCodecStandard.H264     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecUtils.C701271.<clinit>():void");
        }
    }

    static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        for (String str : mediaCodecInfo.getSupportedTypes()) {
            if (rXVideoCodecStandard.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i : iArr) {
            int[] iArr2 = codecCapabilities.colorFormats;
            for (int i2 : iArr2) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }

    static Map<String, String> getCodecProperties(RXVideoCodecStandard rXVideoCodecStandard, boolean z) {
        int i = C701271.$SwitchMap$org$webrtc$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1 || i == 2) {
            return new HashMap();
        }
        if (i == 3) {
            return new HashMap();
        }
        throw new IllegalArgumentException("Unsupported codec: " + rXVideoCodecStandard);
    }
}
