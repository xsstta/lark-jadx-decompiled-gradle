package org.webrtc;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Log;
import com.bytedance.realx.RXDeviceInfo;
import java.util.ArrayList;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;

public class HardwareVideoEncoderFactory {
    private EglBase14.Context sharedContext;

    /* access modifiers changed from: package-private */
    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1 */
    public static /* synthetic */ class C701251 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$RXVideoCodecStandard;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.webrtc.RXVideoCodecStandard[] r0 = org.webrtc.RXVideoCodecStandard.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.HardwareVideoEncoderFactory.C701251.$SwitchMap$org$webrtc$RXVideoCodecStandard = r0
                org.webrtc.RXVideoCodecStandard r1 = org.webrtc.RXVideoCodecStandard.H264     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.C701251.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.RXVideoCodecStandard r1 = org.webrtc.RXVideoCodecStandard.ByteVC1     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.C701251.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.RXVideoCodecStandard r1 = org.webrtc.RXVideoCodecStandard.VP8     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.C701251.$SwitchMap$org$webrtc$RXVideoCodecStandard     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.webrtc.RXVideoCodecStandard r1 = org.webrtc.RXVideoCodecStandard.VP9     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoderFactory.C701251.<clinit>():void");
        }
    }

    public static RXVideoCodecDesc[] getSupportedCodecs() {
        if (Build.VERSION.SDK_INT < 19) {
            return new RXVideoCodecDesc[0];
        }
        ArrayList arrayList = new ArrayList();
        RXVideoCodecStandard[] rXVideoCodecStandardArr = {RXVideoCodecStandard.H264};
        for (int i = 0; i < 1; i++) {
            RXVideoCodecStandard rXVideoCodecStandard = rXVideoCodecStandardArr[i];
            MediaCodecInfo findCodecForType = findCodecForType(rXVideoCodecStandard);
            if (findCodecForType != null) {
                if (rXVideoCodecStandard == RXVideoCodecStandard.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileHigh));
                }
                arrayList.add(new RXVideoCodecDesc(rXVideoCodecStandard, RXVideoCodecProfile.ProfileBaseline));
            }
        }
        return (RXVideoCodecDesc[]) arrayList.toArray(new RXVideoCodecDesc[arrayList.size()]);
    }

    public void setHardwareContext(EglBase.Context context) {
        if (context instanceof EglBase14.Context) {
            this.sharedContext = (EglBase14.Context) context;
        }
    }

    private static boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        if (!RXDeviceInfo.GetCpuModel().contains("Amlogic") && Build.VERSION.SDK_INT > 23) {
            return true;
        }
        return false;
    }

    public static boolean isTrustedCodec(RXVideoCodecDesc rXVideoCodecDesc) {
        MediaCodecInfo findCodecForType;
        RXVideoCodecStandard standard = rXVideoCodecDesc.getStandard();
        if (standard == RXVideoCodecStandard.H264 && (findCodecForType = findCodecForType(standard)) == null) {
            return findCodecForType.getName().startsWith("OMX.qcom.");
        }
        return false;
    }

    private static MediaCodecInfo findCodecForType(RXVideoCodecStandard rXVideoCodecStandard) {
        int i = 0;
        while (true) {
            MediaCodecInfo mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Log.e("HwVideoEncoderFactory", "Cannot retrieve encoder codec info", e);
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, rXVideoCodecStandard)) {
                return mediaCodecInfo;
            }
            i++;
        }
    }

    private static int getKeyFrameIntervalSec(RXVideoCodecStandard rXVideoCodecStandard) {
        int i = C701251.$SwitchMap$org$webrtc$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1) {
            return 240;
        }
        if (i == 2) {
            return 20;
        }
        if (i == 3 || i == 4) {
            return 100;
        }
        throw new IllegalArgumentException("Unsupported VideoCodecType " + rXVideoCodecStandard);
    }

    private static boolean isHardwareSupportedInCurrentSdkByteVC1(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if ((!name.startsWith("OMX.qcom.") || Build.VERSION.SDK_INT < 19) && (!name.startsWith("OMX.Exynos.") || Build.VERSION.SDK_INT < 21)) {
            return false;
        }
        return true;
    }

    private static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.")) {
            if (Build.VERSION.SDK_INT >= 19) {
                return true;
            }
            return false;
        } else if (name.startsWith("OMX.Exynos.")) {
            if (Build.VERSION.SDK_INT >= 21) {
                return true;
            }
            return false;
        } else if (Build.VERSION.SDK_INT >= 21) {
            return true;
        } else {
            return false;
        }
    }

    public VideoEncoder createEncoder(RXVideoCodecDesc rXVideoCodecDesc) {
        RXVideoCodecStandard standard;
        MediaCodecInfo findCodecForType;
        if (Build.VERSION.SDK_INT < 19 || (findCodecForType = findCodecForType((standard = rXVideoCodecDesc.getStandard()))) == null) {
            return null;
        }
        String name = findCodecForType.getName();
        String mimeType = standard.mimeType();
        Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        Integer selectColorFormat2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (this.sharedContext == null) {
            Log.w("HwVideoEncoderFactory", "No shared EglBase.Context.  Encoders will not use texture mode.");
        }
        return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, rXVideoCodecDesc, selectColorFormat, selectColorFormat2, getKeyFrameIntervalSec(standard), getForcedKeyFrameIntervalMs(standard, name), this.sharedContext);
    }

    private static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        int i = C701251.$SwitchMap$org$webrtc$RXVideoCodecStandard[rXVideoCodecStandard.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (i != 2) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkByteVC1(mediaCodecInfo);
    }

    private static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, RXVideoCodecStandard rXVideoCodecStandard) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, rXVideoCodecStandard)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(rXVideoCodecStandard.mimeType())) == null) {
                return false;
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, rXVideoCodecStandard);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static int getForcedKeyFrameIntervalMs(RXVideoCodecStandard rXVideoCodecStandard, String str) {
        if (rXVideoCodecStandard != RXVideoCodecStandard.VP8 || !str.startsWith("OMX.qcom.")) {
            return 0;
        }
        if (!(Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22)) {
            if (Build.VERSION.SDK_INT == 23) {
                return 20000;
            }
            if (Build.VERSION.SDK_INT > 23) {
                return 15000;
            }
            return 0;
        }
        return 15000;
    }
}
