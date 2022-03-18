package com.ss.video.rtc.engine;

import com.ss.video.rtc.engine.VideoStreamDescription;

public class InternalVideoStreamDescription {
    public EncoderPreference encodePreference = EncoderPreference.MaintainFramerate;
    public int frameRate;
    public int height;
    public int maxKbps;
    public ScaleMode scaleMode = ScaleMode.Auto;
    public int width;

    public enum CodecMode {
        AutoMode(0),
        HardwareMode(1),
        SoftwareMode(2);
        
        private int value;

        public int getIntValue() {
            return this.value;
        }

        private CodecMode(int i) {
            this.value = i;
        }
    }

    public enum EncoderPreference {
        Disabled(0),
        MaintainFramerate(1),
        MaintainQuality(2),
        Balance(3);
        
        private int value;

        public int getIntValue() {
            return this.value;
        }

        private EncoderPreference(int i) {
            this.value = i;
        }
    }

    public enum ScaleMode {
        Auto(0),
        Stretch(1),
        FitWithCropping(2),
        FitWithFilling(3);
        
        private int value;

        /* access modifiers changed from: package-private */
        public int getIntValue() {
            return this.value;
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    public enum VideoCodecType {
        AutoCodec(0),
        H264Codec(1),
        ByteVC1Codec(2);
        
        private int value;

        public int getIntValue() {
            return this.value;
        }

        private VideoCodecType(int i) {
            this.value = i;
        }
    }

    /* access modifiers changed from: package-private */
    public EncoderPreference getEncoderPreference() {
        return this.encodePreference;
    }

    /* access modifiers changed from: package-private */
    public int getFrameRate() {
        return this.frameRate;
    }

    /* access modifiers changed from: package-private */
    public int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: package-private */
    public int getMaxKBps() {
        return this.maxKbps;
    }

    /* access modifiers changed from: package-private */
    public ScaleMode getScaleMode() {
        return this.scaleMode;
    }

    /* access modifiers changed from: package-private */
    public int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.video.rtc.engine.InternalVideoStreamDescription$1 */
    public static /* synthetic */ class C655601 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$CodecMode;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$EncoderPreference;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$ScaleMode;
        static final /* synthetic */ int[] $SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$VideoCodecType;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0097 */
        static {
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.video.rtc.engine.InternalVideoStreamDescription.C655601.<clinit>():void");
        }
    }

    private CodecMode ConvertEnumValue(VideoStreamDescription.CodecMode codecMode) {
        CodecMode codecMode2 = CodecMode.AutoMode;
        int i = C655601.$SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$CodecMode[codecMode.ordinal()];
        if (i == 1) {
            return CodecMode.AutoMode;
        }
        if (i == 2) {
            return CodecMode.HardwareMode;
        }
        if (i != 3) {
            return CodecMode.AutoMode;
        }
        return CodecMode.SoftwareMode;
    }

    public InternalVideoStreamDescription(VideoStreamDescription videoStreamDescription) {
        this.width = ((Integer) videoStreamDescription.videoSize.first).intValue();
        this.height = ((Integer) videoStreamDescription.videoSize.second).intValue();
        this.frameRate = videoStreamDescription.frameRate;
        this.maxKbps = videoStreamDescription.maxKbps;
        this.scaleMode = ConvertEnumValue(videoStreamDescription.scaleMode);
        this.encodePreference = ConvertEnumValue(videoStreamDescription.encodePreference);
    }

    private EncoderPreference ConvertEnumValue(VideoStreamDescription.EncoderPreference encoderPreference) {
        EncoderPreference encoderPreference2 = EncoderPreference.MaintainFramerate;
        int i = C655601.$SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$EncoderPreference[encoderPreference.ordinal()];
        if (i == 1) {
            return EncoderPreference.MaintainFramerate;
        }
        if (i == 2) {
            return EncoderPreference.MaintainQuality;
        }
        if (i != 3) {
            return encoderPreference2;
        }
        return EncoderPreference.Balance;
    }

    private ScaleMode ConvertEnumValue(VideoStreamDescription.ScaleMode scaleMode2) {
        ScaleMode scaleMode3 = ScaleMode.Auto;
        int i = C655601.$SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$ScaleMode[scaleMode2.ordinal()];
        if (i == 1) {
            return ScaleMode.Auto;
        }
        if (i == 2) {
            return ScaleMode.Stretch;
        }
        if (i == 3) {
            return ScaleMode.FitWithCropping;
        }
        if (i != 4) {
            return ScaleMode.Auto;
        }
        return ScaleMode.FitWithFilling;
    }

    private VideoCodecType ConvertEnumValue(VideoStreamDescription.VideoCodecType videoCodecType) {
        VideoCodecType videoCodecType2 = VideoCodecType.AutoCodec;
        int i = C655601.$SwitchMap$com$ss$video$rtc$engine$VideoStreamDescription$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1) {
            return VideoCodecType.AutoCodec;
        }
        if (i == 2) {
            return VideoCodecType.H264Codec;
        }
        if (i != 3) {
            return VideoCodecType.AutoCodec;
        }
        return VideoCodecType.ByteVC1Codec;
    }
}
