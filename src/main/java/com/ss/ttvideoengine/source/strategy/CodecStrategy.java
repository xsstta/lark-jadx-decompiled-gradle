package com.ss.ttvideoengine.source.strategy;

import android.text.TextUtils;
import com.ss.ttvideoengine.FeatureManager;
import com.ss.ttvideoengine.InfoWrapper;
import com.ss.ttvideoengine.source.DirectUrlSource;
import com.ss.ttvideoengine.source.Source;
import com.ss.ttvideoengine.source.VidPlayAuthTokenSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodecStrategy {
    private static final List<Dimension> COST_SAVING_FIST_LIST = Collections.unmodifiableList(Arrays.asList(Dimension.BYTEVC1_HARDWARE, Dimension.BYTEVC1_SOFTWARE, Dimension.H264_HARDWARE, Dimension.H264_SOFTWARE));
    private static final List<Dimension> FALLBACK_LIST = Collections.unmodifiableList(Arrays.asList(Dimension.H264_SOFTWARE, Dimension.H264_HARDWARE, Dimension.BYTEVC1_SOFTWARE, Dimension.BYTEVC1_HARDWARE));
    private static final List<Dimension> HARDWARE_DECODE_FIRST_LIST = Collections.unmodifiableList(Arrays.asList(Dimension.BYTEVC1_HARDWARE, Dimension.H264_HARDWARE, Dimension.BYTEVC1_SOFTWARE, Dimension.H264_SOFTWARE));

    public static List<Dimension> fallbackDimensions() {
        return supportedDimensions(FALLBACK_LIST);
    }

    public static final class Decoder {
        private static boolean isSupportByteVC1HardwareDecode() {
            if (InfoWrapper.getByteVC1HardwareEnable() == 1) {
                return true;
            }
            return false;
        }

        private static boolean isSupportByteVC1SoftwareCapability() {
            if (InfoWrapper.getByteVC1SoftwareCapabilityEnable() == 1) {
                return true;
            }
            return false;
        }

        private static boolean isSupportByteVC1SoftwareDecode() {
            if (InfoWrapper.getByteVC1SoftwareEnable() == 1) {
                return true;
            }
            return false;
        }

        private static boolean isSupportH264HardwareDecode() {
            if (InfoWrapper.getH264HardwareEnable() == 1) {
                return true;
            }
            return false;
        }

        public static String dump() {
            return "4_h = " + InfoWrapper.getH264HardwareEnable() + ", b_h = " + InfoWrapper.getByteVC1HardwareEnable() + ", b_s = " + InfoWrapper.getByteVC1SoftwareEnable() + ", b_s_cap = " + InfoWrapper.getByteVC1SoftwareCapabilityEnable();
        }

        static boolean isSupport(Dimension dimension) {
            if (!isDeviceSupport(dimension) || !isSDKSupport(dimension)) {
                return false;
            }
            return true;
        }

        private static boolean isDeviceSupport(Dimension dimension) {
            int i = C654811.$SwitchMap$com$ss$ttvideoengine$source$strategy$CodecStrategy$Dimension[dimension.ordinal()];
            if (i == 1) {
                return isSupportByteVC1HardwareDecode();
            }
            if (i == 2) {
                return isSupportByteVC1SoftwareDecode();
            }
            if (i == 3) {
                return isSupportH264HardwareDecode();
            }
            if (i == 4) {
                return true;
            }
            throw new IllegalArgumentException("unsupported dimension! " + dimension);
        }

        private static boolean isSDKSupport(Dimension dimension) {
            int i = C654811.$SwitchMap$com$ss$ttvideoengine$source$strategy$CodecStrategy$Dimension[dimension.ordinal()];
            if (i == 1) {
                return FeatureManager.hasPermission("bvc1");
            }
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                throw new IllegalArgumentException("unsupported dimension! " + dimension);
            } else if (!FeatureManager.hasPermission("bvc1") || !isSupportByteVC1SoftwareCapability()) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static class ResolveResult {
        public final Dimension dimension;
        public final Source source;
        public final DirectUrlSource.UrlItem urlItem;

        public String toString() {
            return "ResolveResult{dimension=" + this.dimension + ", source=" + this.source + ", urlItem=" + this.urlItem + '}';
        }

        public ResolveResult(Source source2, Dimension dimension2, DirectUrlSource.UrlItem urlItem2) {
            this.source = source2;
            this.dimension = dimension2;
            this.urlItem = urlItem2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.source.strategy.CodecStrategy$1 */
    public static /* synthetic */ class C654811 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$ttvideoengine$source$Source$Type;
        static final /* synthetic */ int[] $SwitchMap$com$ss$ttvideoengine$source$strategy$CodecStrategy$Dimension;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.ss.ttvideoengine.source.Source$Type[] r0 = com.ss.ttvideoengine.source.Source.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.ttvideoengine.source.strategy.CodecStrategy.C654811.$SwitchMap$com$ss$ttvideoengine$source$Source$Type = r0
                r1 = 1
                com.ss.ttvideoengine.source.Source$Type r2 = com.ss.ttvideoengine.source.Source.Type.DIRECT_URL_SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.ttvideoengine.source.strategy.CodecStrategy.C654811.$SwitchMap$com$ss$ttvideoengine$source$Source$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.ttvideoengine.source.Source$Type r3 = com.ss.ttvideoengine.source.Source.Type.VID_PLAY_AUTH_TOKEN_SOURCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.ss.ttvideoengine.source.strategy.CodecStrategy$Dimension[] r2 = com.ss.ttvideoengine.source.strategy.CodecStrategy.Dimension.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.ss.ttvideoengine.source.strategy.CodecStrategy.C654811.$SwitchMap$com$ss$ttvideoengine$source$strategy$CodecStrategy$Dimension = r2
                com.ss.ttvideoengine.source.strategy.CodecStrategy$Dimension r3 = com.ss.ttvideoengine.source.strategy.CodecStrategy.Dimension.BYTEVC1_HARDWARE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = com.ss.ttvideoengine.source.strategy.CodecStrategy.C654811.$SwitchMap$com$ss$ttvideoengine$source$strategy$CodecStrategy$Dimension     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.ss.ttvideoengine.source.strategy.CodecStrategy$Dimension r2 = com.ss.ttvideoengine.source.strategy.CodecStrategy.Dimension.BYTEVC1_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = com.ss.ttvideoengine.source.strategy.CodecStrategy.C654811.$SwitchMap$com$ss$ttvideoengine$source$strategy$CodecStrategy$Dimension     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.ttvideoengine.source.strategy.CodecStrategy$Dimension r1 = com.ss.ttvideoengine.source.strategy.CodecStrategy.Dimension.H264_HARDWARE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.ss.ttvideoengine.source.strategy.CodecStrategy.C654811.$SwitchMap$com$ss$ttvideoengine$source$strategy$CodecStrategy$Dimension     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ss.ttvideoengine.source.strategy.CodecStrategy$Dimension r1 = com.ss.ttvideoengine.source.strategy.CodecStrategy.Dimension.H264_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.source.strategy.CodecStrategy.C654811.<clinit>():void");
        }
    }

    private static List<Dimension> supportedDimensions(List<Dimension> list) {
        ArrayList arrayList = new ArrayList();
        for (Dimension dimension : list) {
            if (Decoder.isSupport(dimension)) {
                arrayList.add(dimension);
            }
        }
        return arrayList;
    }

    public static List<Dimension> dimensions(int i) {
        if (i == 1) {
            return supportedDimensions(COST_SAVING_FIST_LIST);
        }
        if (i == 2) {
            return supportedDimensions(HARDWARE_DECODE_FIRST_LIST);
        }
        throw new IllegalArgumentException("unsupported strategy! " + i);
    }

    public static ResolveResult resolveStartPlayback(Source source, int i) {
        List<Dimension> dimensions = dimensions(i);
        Source.Type type = source.type();
        int i2 = C654811.$SwitchMap$com$ss$ttvideoengine$source$Source$Type[type.ordinal()];
        if (i2 == 1) {
            return resolveDirectUrl((DirectUrlSource) source, dimensions, null);
        }
        if (i2 == 2) {
            return resolveVidPlayAuthToken((VidPlayAuthTokenSource) source, dimensions, null);
        }
        throw new IllegalArgumentException("unsupported type! " + type);
    }

    private static ResolveResult resolveDirectUrl(DirectUrlSource directUrlSource, List<Dimension> list, List<Dimension> list2) {
        for (Dimension dimension : list) {
            if (list2 == null || !list2.contains(dimension)) {
                for (DirectUrlSource.UrlItem urlItem : directUrlSource.allItems()) {
                    if (TextUtils.equals(urlItem.getEncodeType(), dimension.encodeType)) {
                        return new ResolveResult(directUrlSource, dimension, urlItem);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static ResolveResult resolveFallback(Source source, int i, List<Dimension> list) {
        List<Dimension> fallbackDimensions = fallbackDimensions();
        Source.Type type = source.type();
        int i2 = C654811.$SwitchMap$com$ss$ttvideoengine$source$Source$Type[type.ordinal()];
        if (i2 == 1) {
            return resolveDirectUrl((DirectUrlSource) source, fallbackDimensions, list);
        }
        if (i2 == 2) {
            return resolveVidPlayAuthToken((VidPlayAuthTokenSource) source, fallbackDimensions, list);
        }
        throw new IllegalArgumentException("unsupported type! " + type);
    }

    private static ResolveResult resolveVidPlayAuthToken(VidPlayAuthTokenSource vidPlayAuthTokenSource, List<Dimension> list, List<Dimension> list2) {
        for (Dimension dimension : list) {
            if ((list2 == null || !list2.contains(dimension)) && (vidPlayAuthTokenSource.encodeType() == null || TextUtils.equals(vidPlayAuthTokenSource.encodeType(), dimension.encodeType))) {
                return new ResolveResult(vidPlayAuthTokenSource, dimension, null);
            }
        }
        return null;
    }

    public enum Dimension {
        BYTEVC1_HARDWARE(1, "bytevc1"),
        BYTEVC1_SOFTWARE(0, "bytevc1"),
        H264_HARDWARE(1, "h264"),
        H264_SOFTWARE(0, "h264");
        
        public final int decoder;
        public final String encodeType;

        private Dimension(int i, String str) {
            this.decoder = i;
            this.encodeType = str;
        }
    }
}
