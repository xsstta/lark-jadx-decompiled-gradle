package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.medialib.p2999b.C59381c;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings;
import com.ss.android.vesdk.settings.VEVideoEncodeProfile;
import com.ss.android.vesdk.settings.VEVideoSWEncodeSettings;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class VEVideoEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEVideoEncodeSettings> CREATOR = new Parcelable.Creator<VEVideoEncodeSettings>() {
        /* class com.ss.android.vesdk.VEVideoEncodeSettings.C639101 */

        /* renamed from: a */
        public VEVideoEncodeSettings[] newArray(int i) {
            return new VEVideoEncodeSettings[i];
        }

        /* renamed from: a */
        public VEVideoEncodeSettings createFromParcel(Parcel parcel) {
            return new VEVideoEncodeSettings(parcel);
        }
    };
    public ENCODE_BITRATE_MODE bitrateMode;
    public int bps;
    public COMPILE_TYPE compileType;
    private boolean enableAvInterLeave;
    public boolean enableByteVCRemuxVideo;
    public boolean enableHwBufferEncode;
    private boolean enableInterLeave;
    public boolean enableRemuxVideo;
    private int enableRemuxVideoBitrate;
    private int enableRemuxVideoFPS;
    public boolean enableRemuxVideoForRotation;
    public boolean enableRemuxVideoForShoot;
    private int enableRemuxVideoRes;
    public int encodeProfile;
    public int encodeStandard;
    public String externalSettingsJsonStr;
    public int fps;
    public int gopSize;
    public boolean hasBFrame;
    public boolean isSupportHWEncoder;
    public String mComment;
    public boolean mCompileSoftInfo;
    public String mDescription;
    public int[] mKeyFramePoints;
    public boolean mOptRemuxWithCopy;
    public boolean mReEncodeOpt;
    public boolean mRecordingMp4;
    public int mResolutionAlign;
    public boolean mTransitionKeyframeEnable;
    public VEVideoCompileEncodeSettings mVideoCompileEncodeSetting;
    public VEVideoCompileEncodeSettings mVideoWatermarkCompileEncodeSetting;
    public VEWatermarkParam mWatermarkParam;
    public VESize outputSize;
    public int resizeMode;
    public float resizeX;
    public float resizeY;
    public int rotate;
    public float speed;
    public int swCRF;
    public long swMaxrate;
    public int swPreset;
    public int swQP;
    public double swQPOffset;
    public VESize watermarkSize;

    public int describeContents() {
        return 0;
    }

    public ENCODE_BITRATE_MODE getBitrateMode() {
        return this.bitrateMode;
    }

    public int getBps() {
        return this.bps;
    }

    public String getComment() {
        return this.mComment;
    }

    public COMPILE_TYPE getCompileType() {
        return this.compileType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getEncodeProfile() {
        return this.encodeProfile;
    }

    public int getEncodeStandard() {
        return this.encodeStandard;
    }

    public int getFps() {
        return this.fps;
    }

    public int getGopSize() {
        return this.gopSize;
    }

    public int[] getKeyFramePoints() {
        return this.mKeyFramePoints;
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    public float getResizeX() {
        return this.resizeX;
    }

    public float getResizeY() {
        return this.resizeY;
    }

    public int getResolutionAlignment() {
        return this.mResolutionAlign;
    }

    public int getRotate() {
        return this.rotate;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getSwCRF() {
        return this.swCRF;
    }

    public long getSwMaxRate() {
        return this.swMaxrate;
    }

    public int getSwPreset() {
        return this.swPreset;
    }

    public int getSwQP() {
        return this.swQP;
    }

    public VEVideoCompileEncodeSettings getVideoCompileEncodeSetting() {
        return this.mVideoCompileEncodeSetting;
    }

    public VESize getVideoRes() {
        return this.outputSize;
    }

    public VEVideoCompileEncodeSettings getWatermarkCompileEncodeSetting() {
        return this.mVideoWatermarkCompileEncodeSetting;
    }

    public VEWatermarkParam getWatermarkParam() {
        return this.mWatermarkParam;
    }

    public VESize getWatermarkVideoRes() {
        return this.watermarkSize;
    }

    public boolean isCompileSoftInfo() {
        return this.mCompileSoftInfo;
    }

    public boolean isEnableAvInterLeave() {
        return this.enableAvInterLeave;
    }

    public boolean isEnableHwBufferEncode() {
        return this.enableHwBufferEncode;
    }

    public boolean isEnableInterLeave() {
        return this.enableInterLeave;
    }

    public boolean isEnableRemuxVideo() {
        return this.enableRemuxVideo;
    }

    public boolean isEnableRemuxVideoForRotation() {
        return this.enableRemuxVideoForRotation;
    }

    public boolean isEnableRemuxVideoForShoot() {
        return this.enableRemuxVideoForShoot;
    }

    public boolean isOptRemuxWithCopy() {
        return this.mOptRemuxWithCopy;
    }

    public boolean isReEncodeOpt() {
        return this.mReEncodeOpt;
    }

    public boolean isRecordingMp4() {
        return this.mRecordingMp4;
    }

    public boolean isSupportHwEnc() {
        return this.isSupportHWEncoder;
    }

    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$a */
    public static class C63917a {

        /* renamed from: a */
        private int f161401a;

        /* renamed from: b */
        private VEVideoEncodeSettings f161402b;

        /* renamed from: c */
        private Map<ENCODE_STANDARD, Integer> f161403c = new HashMap();

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.Map<com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD, java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        private void m250932b() {
            this.f161402b.encodeStandard = ((Integer) VEConfigCenter.m250617a().mo220632a("ve_compile_codec_type", (Object) 0)).intValue();
            this.f161403c.put(ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1, VEConfigCenter.m250617a().mo220632a("ve_compile_hw_bytevc1_max_pixel_count", (Object) 8294400));
        }

        /* renamed from: c */
        private void m250934c() {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f161402b.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.useHWEncoder = this.f161402b.isSupportHWEncoder;
            vEVideoCompileEncodeSettings.enableHwBufferEncode = this.f161402b.enableHwBufferEncode;
            if (vEVideoCompileEncodeSettings.useHWEncoder) {
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mBitrate = (long) this.f161402b.bps;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mProfile = this.f161402b.encodeProfile;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mGop = this.f161402b.gopSize;
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mCodecType = this.f161402b.encodeStandard;
            } else {
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = this.f161402b.bitrateMode.ordinal();
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBps = this.f161402b.bps;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf = this.f161402b.swCRF;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = this.f161402b.swQPOffset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate = this.f161402b.swMaxrate;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset = this.f161402b.swPreset;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile = this.f161402b.encodeProfile;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop = this.f161402b.gopSize;
            }
            this.f161402b.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            this.f161402b.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings;
        }

        /* renamed from: a */
        public VEVideoEncodeSettings mo221103a() {
            m250930a(this.f161402b);
            if (!TextUtils.isEmpty(this.f161402b.externalSettingsJsonStr)) {
                m250933b(this.f161402b.externalSettingsJsonStr);
            } else {
                m250934c();
            }
            C63929ab.m250974a("VEVideoEncodeSettings", "exportVideoEncodeSettings = " + this.f161402b);
            C63929ab.m250974a("VEVideoEncodeSettings", "exportVideoEncodeSettings.compile = " + this.f161402b.mVideoCompileEncodeSetting);
            return this.f161402b;
        }

        /* renamed from: a */
        public C63917a mo221098a(int i) {
            this.f161402b.fps = i;
            return this;
        }

        /* renamed from: b */
        public C63917a mo221104b(int i) {
            this.f161402b.resizeMode = i;
            return this;
        }

        /* renamed from: c */
        public C63917a mo221106c(boolean z) {
            this.f161402b.mRecordingMp4 = z;
            return this;
        }

        /* renamed from: b */
        public C63917a mo221105b(boolean z) {
            this.f161402b.isSupportHWEncoder = z;
            return this;
        }

        public C63917a(int i) {
            this.f161401a = i;
            this.f161402b = new VEVideoEncodeSettings();
            m250932b();
        }

        /* renamed from: a */
        public C63917a mo221100a(ENCODE_PROFILE encode_profile) {
            this.f161402b.encodeProfile = encode_profile.ordinal();
            return this;
        }

        /* renamed from: a */
        public C63917a mo221101a(String str) {
            this.f161402b.externalSettingsJsonStr = str;
            return this;
        }

        /* renamed from: a */
        private void m250930a(VEVideoEncodeSettings vEVideoEncodeSettings) {
            Integer num = this.f161403c.get(ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1);
            C63929ab.m250974a("VEVideoEncodeSettings", "hw_bytevc1 objMaxPixelCount= " + num + " settings.encodeStandard= " + vEVideoEncodeSettings.encodeStandard);
            if (vEVideoEncodeSettings.encodeStandard == ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal() && num != null && this.f161402b.outputSize.width * this.f161402b.outputSize.height > num.intValue()) {
                C63929ab.m250974a("VEVideoEncodeSettings", "hw_bytevc1 change encode standard outputsize= " + this.f161402b.outputSize.width + " x " + this.f161402b.outputSize.height);
                vEVideoEncodeSettings.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
            }
        }

        /* renamed from: b */
        private void m250933b(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("compile");
                this.f161402b.enableByteVCRemuxVideo = jSONObject.optBoolean("bytevc_remux_enable");
                this.f161402b.mTransitionKeyframeEnable = jSONObject.optBoolean("transition_keyframe_enable");
                C59381c.m230519a("VEVideoEncodeSettings", "parseExternalSettingsJsonStr keyframe mTransitionKeyframeEnable=" + this.f161402b.mTransitionKeyframeEnable);
                if (this.f161402b.mTransitionKeyframeEnable) {
                    VERuntime.m251382a().mo221791i(true);
                }
                Log.d("VEVideoEncodeSettings", "parseExternalSettingsJsonStr enableByteVCRemuxVideo= " + this.f161402b.enableByteVCRemuxVideo);
                this.f161402b.mVideoCompileEncodeSetting = m250929a(jSONObject2);
                JSONObject jSONObject3 = jSONObject.getJSONObject("watermark_compile");
                this.f161402b.mVideoWatermarkCompileEncodeSetting = m250929a(jSONObject3);
            } catch (JSONException e) {
                e.printStackTrace();
                C63929ab.m250980d("VEVideoEncodeSettings", "external json str parse error : " + e.getLocalizedMessage());
            }
        }

        /* renamed from: a */
        public C63917a mo221102a(boolean z) {
            this.f161402b.enableRemuxVideo = z;
            return this;
        }

        /* renamed from: a */
        private VEVideoCompileEncodeSettings m250929a(JSONObject jSONObject) {
            int i;
            long j;
            int i2;
            int i3;
            int i4;
            double d;
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = new VEVideoCompileEncodeSettings();
            try {
                vEVideoCompileEncodeSettings.isSupportHWEncoder = this.f161402b.isSupportHWEncoder;
                vEVideoCompileEncodeSettings.enableHwBufferEncode = this.f161402b.enableHwBufferEncode;
                String string = jSONObject.getString("encode_mode");
                if (!"unknown".equals(string) || this.f161401a != 2) {
                    vEVideoCompileEncodeSettings.useHWEncoder = "hw".equals(string);
                } else {
                    vEVideoCompileEncodeSettings.useHWEncoder = this.f161402b.isSupportHWEncoder;
                }
                vEVideoCompileEncodeSettings.mHWEncodeSetting = m250931b(jSONObject);
                vEVideoCompileEncodeSettings.mHWEncodeSetting.mCodecType = this.f161402b.encodeStandard;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mBitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF.ordinal();
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f161401a != 2 || jSONObject.getJSONObject("sw").getInt("crf") != -1) {
                    i = jSONObject.getJSONObject("sw").getInt("crf");
                } else if (this.f161402b.isSupportHWEncoder) {
                    i = vEVideoCompileEncodeSettings.mSWEncodeSetting.mCrf;
                } else {
                    i = this.f161402b.swCRF;
                }
                vEVideoSWEncodeSettings.mCrf = i;
                vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset = 0.0d;
                if (!jSONObject.getJSONObject("sw").isNull("qpoffset")) {
                    VEVideoSWEncodeSettings vEVideoSWEncodeSettings2 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                    if (this.f161401a != 2 || jSONObject.getJSONObject("sw").getDouble("qpoffset") != -1.0d) {
                        d = jSONObject.getJSONObject("sw").getDouble("qpoffset");
                    } else if (this.f161402b.isSupportHWEncoder) {
                        d = vEVideoCompileEncodeSettings.mSWEncodeSetting.mQPOffset;
                    } else {
                        d = this.f161402b.swQPOffset;
                    }
                    vEVideoSWEncodeSettings2.mQPOffset = d;
                }
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings3 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f161401a != 2 || jSONObject.getJSONObject("sw").getInt("maxrate") != -1) {
                    j = (long) jSONObject.getJSONObject("sw").getInt("maxrate");
                } else if (this.f161402b.isSupportHWEncoder) {
                    j = vEVideoCompileEncodeSettings.mSWEncodeSetting.mMaxRate;
                } else {
                    j = this.f161402b.swMaxrate;
                }
                vEVideoSWEncodeSettings3.mMaxRate = j;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings4 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f161401a != 2 || jSONObject.getJSONObject("sw").getInt("preset") != -1) {
                    i2 = jSONObject.getJSONObject("sw").getInt("preset");
                } else if (this.f161402b.isSupportHWEncoder) {
                    i2 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mPreset;
                } else {
                    i2 = this.f161402b.swPreset;
                }
                vEVideoSWEncodeSettings4.mPreset = i2;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings5 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f161401a != 2 || !"unknown".equals(jSONObject.getJSONObject("sw").getString("profile"))) {
                    i3 = VEVideoEncodeProfile.valueOfString(jSONObject.getJSONObject("sw").getString("profile")).ordinal();
                } else if (this.f161402b.isSupportHWEncoder) {
                    i3 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mProfile;
                } else {
                    i3 = this.f161402b.encodeProfile;
                }
                vEVideoSWEncodeSettings5.mProfile = i3;
                VEVideoSWEncodeSettings vEVideoSWEncodeSettings6 = vEVideoCompileEncodeSettings.mSWEncodeSetting;
                if (this.f161401a != 2 || jSONObject.getJSONObject("sw").getInt("gop") != -1) {
                    i4 = jSONObject.getJSONObject("sw").getInt("gop");
                } else if (this.f161402b.isSupportHWEncoder) {
                    i4 = vEVideoCompileEncodeSettings.mSWEncodeSetting.mGop;
                } else {
                    i4 = this.f161402b.gopSize;
                }
                vEVideoSWEncodeSettings6.mGop = i4;
            } catch (JSONException e) {
                e.printStackTrace();
                C63929ab.m250980d("VEVideoEncodeSettings", "parseJsonToSetting : external json str parse error : " + e.getLocalizedMessage());
            }
            return vEVideoCompileEncodeSettings;
        }

        /* JADX WARNING: Removed duplicated region for block: B:105:0x027d  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x02a7  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x02d1  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x02fb  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0202  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x022a  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0254  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ss.android.vesdk.settings.VEVideoHWEncodeSettings m250931b(org.json.JSONObject r21) {
            /*
            // Method dump skipped, instructions count: 867
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.C63917a.m250931b(org.json.JSONObject):com.ss.android.vesdk.settings.VEVideoHWEncodeSettings");
        }

        /* renamed from: a */
        public C63917a mo221099a(int i, int i2) {
            this.f161402b.outputSize.width = i;
            this.f161402b.outputSize.height = i2;
            return this;
        }
    }

    private void initFromVEConfigCenter() {
        boolean z = false;
        if (this.enableHwBufferEncode || ((Boolean) VEConfigCenter.m250617a().mo220632a("ve_enable_compile_buffer_hw_encode", (Object) false)).booleanValue()) {
            z = true;
        }
        this.enableHwBufferEncode = z;
        C63929ab.m250980d("VEVideoEncodeSettings", "KEY_ENABLE_BUFFER_HW_COMPILE: " + this.enableHwBufferEncode);
    }

    public int getBitrateValue() {
        int i = C639112.f161399a[this.bitrateMode.ordinal()];
        if (i == 1) {
            return getBps();
        }
        if (i == 2) {
            return getSwCRF();
        }
        if (i == 3) {
            return getSwQP();
        }
        if (i == 4) {
            return getBps();
        }
        throw new IllegalStateException("CompileTime BUG by SDK. Unhandled ENCODE_BITRATE_MODE enum value.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.VEVideoEncodeSettings$2 */
    public static /* synthetic */ class C639112 {

        /* renamed from: a */
        static final /* synthetic */ int[] f161399a;

        /* renamed from: b */
        static final /* synthetic */ int[] f161400b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        static {
            /*
                com.ss.android.medialib.util.VEPlatformUtils$VEPlatform[] r0 = com.ss.android.medialib.util.VEPlatformUtils.VEPlatform.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161400b = r0
                r1 = 1
                com.ss.android.medialib.util.VEPlatformUtils$VEPlatform r2 = com.ss.android.medialib.util.VEPlatformUtils.VEPlatform.PLATFORM_QCOM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161400b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.medialib.util.VEPlatformUtils$VEPlatform r3 = com.ss.android.medialib.util.VEPlatformUtils.VEPlatform.PLATFORM_MTK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161400b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.medialib.util.VEPlatformUtils$VEPlatform r4 = com.ss.android.medialib.util.VEPlatformUtils.VEPlatform.PLATFORM_HISI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161400b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.medialib.util.VEPlatformUtils$VEPlatform r5 = com.ss.android.medialib.util.VEPlatformUtils.VEPlatform.PLATFORM_EXYNOS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_BITRATE_MODE[] r4 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161399a = r4
                com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_BITRATE_MODE r5 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161399a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_BITRATE_MODE r4 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161399a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_BITRATE_MODE r1 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = com.ss.android.vesdk.VEVideoEncodeSettings.C639112.f161399a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_BITRATE_MODE r1 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEVideoEncodeSettings.C639112.<clinit>():void");
        }
    }

    private VEVideoEncodeSettings() {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.outputSize.width = 576;
        this.outputSize.height = 1024;
        this.watermarkSize.width = -1;
        this.watermarkSize.height = -1;
        this.fps = -1;
        this.bps = 4194304;
        this.isSupportHWEncoder = true;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public String toString() {
        return "VEVideoEncodeSettings{compileType=" + this.compileType + ", rotate=" + this.rotate + ", resizeMode=" + this.resizeMode + ", resizeX=" + this.resizeX + ", resizeY=" + this.resizeY + ", speed=" + this.speed + ", outputSize=" + this.outputSize + ", watermarkSize=" + this.watermarkSize + ", bitrateMode=" + this.bitrateMode + ", bps=" + this.bps + ", swCRF=" + this.swCRF + ", swQPOffset=" + this.swQPOffset + ", swQP=" + this.swQP + ", fps=" + this.fps + ", gopSize=" + this.gopSize + ", swPreset=" + this.swPreset + ", encodeStandard=" + this.encodeStandard + ", encodeProfile=" + this.encodeProfile + ", swMaxrate=" + this.swMaxrate + ", isSupportHWEncoder=" + this.isSupportHWEncoder + ", enableHwBufferEncode=" + this.enableHwBufferEncode + ", enableRemuxVideo=" + this.enableRemuxVideo + ", enableRemuxVideoForRotation=" + this.enableRemuxVideoForRotation + ", enableRemuxVideoForShoot=" + this.enableRemuxVideoForShoot + ", enableByteVCRemuxVideo=" + this.enableByteVCRemuxVideo + ", enableInterLeave=" + this.enableInterLeave + ", enableAvInterLeave=" + this.enableAvInterLeave + ", hasBFrame=" + this.hasBFrame + ", mWatermarkParam=" + this.mWatermarkParam + ", mVideoWatermarkCompileEncodeSetting=" + this.mVideoWatermarkCompileEncodeSetting + ", mVideoCompileEncodeSetting=" + this.mVideoCompileEncodeSetting + ", mOptRemuxWithCopy=" + this.mOptRemuxWithCopy + ", mReEncodeOpt=" + this.mReEncodeOpt + ", mDescripiton=" + this.mDescription + ", mComment=" + this.mComment + '}';
    }

    public void setCompileType(COMPILE_TYPE compile_type) {
        this.compileType = compile_type;
    }

    public void setEnableAvInterLeave(boolean z) {
        this.enableAvInterLeave = z;
    }

    public void setEnableInterLeave(boolean z) {
        this.enableInterLeave = z;
    }

    public void setEnableRemuxVideo(boolean z) {
        this.enableRemuxVideo = z;
    }

    public void setEnableRemuxVideoBitrate(int i) {
        this.enableRemuxVideoBitrate = i;
    }

    public void setEnableRemuxVideoFPS(int i) {
        this.enableRemuxVideoFPS = i;
    }

    public void setEnableRemuxVideoForRotation(boolean z) {
        this.enableRemuxVideoForRotation = z;
    }

    public void setEnableRemuxVideoForShoot(boolean z) {
        this.enableRemuxVideoForShoot = z;
    }

    public void setEnableRemuxVideoRes(int i) {
        this.enableRemuxVideoRes = i;
    }

    public void setFps(int i) {
        this.fps = i;
    }

    public void setGopSize(int i) {
        this.gopSize = i;
    }

    public void setResizeMode(int i) {
        this.resizeMode = i;
    }

    public void setResizeX(float f) {
        this.resizeX = f;
    }

    public void setResizeY(float f) {
        this.resizeY = f;
    }

    public void setRotate(int i) {
        this.rotate = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setSupportHwEnc(boolean z) {
        this.isSupportHWEncoder = z;
    }

    public enum ENCODE_BITRATE_MODE implements Parcelable {
        ENCODE_BITRATE_ABR,
        ENCODE_BITRATE_CRF,
        ENCODE_BITRATE_QP,
        ENCODE_BITRATE_VBR;
        
        public static final Parcelable.Creator<ENCODE_BITRATE_MODE> CREATOR = new Parcelable.Creator<ENCODE_BITRATE_MODE>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE.C639131 */

            /* renamed from: a */
            public ENCODE_BITRATE_MODE[] newArray(int i) {
                return new ENCODE_BITRATE_MODE[i];
            }

            /* renamed from: a */
            public ENCODE_BITRATE_MODE createFromParcel(Parcel parcel) {
                return ENCODE_BITRATE_MODE.values()[parcel.readInt()];
            }
        };
        private static final ENCODE_BITRATE_MODE[] values = values();

        public int describeContents() {
            return 0;
        }

        public static ENCODE_BITRATE_MODE fromInteger(int i) {
            return values[i];
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public void setBps(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_VBR;
        this.bps = i;
    }

    public void setEncodeProfile(ENCODE_PROFILE encode_profile) {
        this.encodeProfile = encode_profile.ordinal();
    }

    public void setQP(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_QP;
        this.swQP = i;
    }

    public void setSWCRF(int i) {
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF;
        this.swCRF = i;
    }

    public void setSwPreset(ENCODE_PRESET encode_preset) {
        this.swPreset = encode_preset.ordinal();
    }

    public void setVideoHWoptBitrate(float f) {
        this.mVideoCompileEncodeSetting.mHWEncodeSetting.mBitrate = (long) f;
    }

    public void setVideoSWOptCrf(int i) {
        this.mVideoCompileEncodeSetting.mSWEncodeSetting.mCrf = i;
    }

    public boolean setVideoHwEnc(boolean z) {
        if (this.mVideoCompileEncodeSetting.isSupportHWEncoder) {
            this.mVideoCompileEncodeSetting.useHWEncoder = z;
        } else {
            this.mVideoCompileEncodeSetting.useHWEncoder = false;
        }
        return this.mVideoCompileEncodeSetting.useHWEncoder;
    }

    public boolean setWatermark(VEWatermarkParam vEWatermarkParam) {
        if (vEWatermarkParam == null) {
            this.mWatermarkParam = null;
            return true;
        } else if (vEWatermarkParam.getEntities() == null) {
            return false;
        } else {
            this.mWatermarkParam = vEWatermarkParam;
            return true;
        }
    }

    public void adjustVideoCompileEncodeSetting(int i) {
        if (i == 1) {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings = this.mVideoWatermarkCompileEncodeSetting;
            if (vEVideoCompileEncodeSettings != null) {
                this.mVideoCompileEncodeSetting = vEVideoCompileEncodeSettings;
            }
            if (this.watermarkSize.isValid()) {
                this.outputSize.width = this.watermarkSize.width;
                this.outputSize.height = this.watermarkSize.height;
            }
        } else if (i == 2) {
            VEVideoCompileEncodeSettings vEVideoCompileEncodeSettings2 = this.mVideoCompileEncodeSetting;
            if (vEVideoCompileEncodeSettings2 != null) {
                this.mVideoWatermarkCompileEncodeSetting = vEVideoCompileEncodeSettings2;
            }
            if (this.outputSize.isValid()) {
                this.watermarkSize.width = this.outputSize.width;
                this.watermarkSize.height = this.outputSize.height;
            }
        }
    }

    protected VEVideoEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        boolean z12 = false;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.compileType = (COMPILE_TYPE) parcel.readParcelable(COMPILE_TYPE.class.getClassLoader());
        this.rotate = parcel.readInt();
        this.resizeMode = parcel.readInt();
        this.resizeX = parcel.readFloat();
        this.resizeY = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.outputSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.watermarkSize = (VESize) parcel.readParcelable(VESize.class.getClassLoader());
        this.bitrateMode = (ENCODE_BITRATE_MODE) parcel.readParcelable(ENCODE_BITRATE_MODE.class.getClassLoader());
        this.bps = parcel.readInt();
        this.fps = parcel.readInt();
        this.swCRF = parcel.readInt();
        this.swQPOffset = parcel.readDouble();
        this.swQP = parcel.readInt();
        this.gopSize = parcel.readInt();
        this.swPreset = parcel.readInt();
        this.encodeStandard = parcel.readInt();
        this.encodeProfile = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isSupportHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.enableRemuxVideo = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.enableRemuxVideoForRotation = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.enableRemuxVideoForShoot = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.enableInterLeave = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enableAvInterLeave = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.hasBFrame = z7;
        this.swMaxrate = parcel.readLong();
        this.mWatermarkParam = (VEWatermarkParam) parcel.readParcelable(VEWatermarkParam.class.getClassLoader());
        this.mVideoWatermarkCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.mVideoCompileEncodeSetting = (VEVideoCompileEncodeSettings) parcel.readParcelable(VEVideoCompileEncodeSettings.class.getClassLoader());
        this.externalSettingsJsonStr = parcel.readString();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mOptRemuxWithCopy = z8;
        this.mDescription = parcel.readString();
        this.mComment = parcel.readString();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.mCompileSoftInfo = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mRecordingMp4 = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.enableHwBufferEncode = z11;
        this.mReEncodeOpt = parcel.readByte() != 0 ? true : z12;
        this.mResolutionAlign = parcel.readInt();
    }

    public enum COMPILE_TYPE implements Parcelable {
        COMPILE_TYPE_MP4,
        COMPILE_TYPE_GIF,
        COMPILE_TYPE_HIGH_GIF,
        COMPILE_TYPE_TRANSPARENT_GIF;
        
        public static final Parcelable.Creator<COMPILE_TYPE> CREATOR = new Parcelable.Creator<COMPILE_TYPE>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.COMPILE_TYPE.C639121 */

            /* renamed from: a */
            public COMPILE_TYPE[] newArray(int i) {
                return new COMPILE_TYPE[i];
            }

            /* renamed from: a */
            public COMPILE_TYPE createFromParcel(Parcel parcel) {
                return COMPILE_TYPE.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_PRESET implements Parcelable {
        ENCODE_LEVEL_ULTRAFAST,
        ENCODE_LEVEL_SUPERFAST,
        ENCODE_LEVEL_VERYFAST,
        ENCODE_LEVEL_FASTER,
        ENCODE_LEVEL_FAST,
        ENCODE_LEVEL_MEDIUM,
        ENCODE_LEVEL_SLOW,
        ENCODE_LEVEL_SLOWER,
        ENCODE_LEVEL_VERYSLOW,
        ENCODE_LEVEL_PLACEBO;
        
        public static final Parcelable.Creator<ENCODE_PRESET> CREATOR = new Parcelable.Creator<ENCODE_PRESET>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET.C639141 */

            /* renamed from: a */
            public ENCODE_PRESET[] newArray(int i) {
                return new ENCODE_PRESET[i];
            }

            /* renamed from: a */
            public ENCODE_PRESET createFromParcel(Parcel parcel) {
                return ENCODE_PRESET.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_PROFILE implements Parcelable {
        ENCODE_PROFILE_UNKNOWN,
        ENCODE_PROFILE_BASELINE,
        ENCODE_PROFILE_MAIN,
        ENCODE_PROFILE_HIGH;
        
        public static final Parcelable.Creator<ENCODE_PROFILE> CREATOR = new Parcelable.Creator<ENCODE_PROFILE>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE.C639151 */

            /* renamed from: a */
            public ENCODE_PROFILE[] newArray(int i) {
                return new ENCODE_PROFILE[i];
            }

            /* renamed from: a */
            public ENCODE_PROFILE createFromParcel(Parcel parcel) {
                return ENCODE_PROFILE.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_H264,
        ENCODE_STANDARD_ByteVC1,
        ENCODE_STANDARD_MPEG4;
        
        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new Parcelable.Creator<ENCODE_STANDARD>() {
            /* class com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD.C639161 */

            /* renamed from: a */
            public ENCODE_STANDARD[] newArray(int i) {
                return new ENCODE_STANDARD[i];
            }

            /* renamed from: a */
            public ENCODE_STANDARD createFromParcel(Parcel parcel) {
                return ENCODE_STANDARD.values()[parcel.readInt()];
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public void setEnableRemuxVideo(boolean z, boolean z2) {
        this.enableRemuxVideo = z;
        this.enableRemuxVideoForRotation = z2;
    }

    public void setVideoRes(int i, int i2) {
        this.outputSize.width = i;
        this.outputSize.height = i2;
    }

    public void setWatermarkVideoRes(int i, int i2) {
        this.watermarkSize.width = i;
        this.watermarkSize.height = i2;
    }

    public void setVideoBitrate(ENCODE_BITRATE_MODE encode_bitrate_mode, int i) {
        this.bitrateMode = encode_bitrate_mode;
        int i2 = C639112.f161399a[this.bitrateMode.ordinal()];
        if (i2 == 1) {
            this.bps = i;
        } else if (i2 == 2) {
            this.swCRF = i;
        } else if (i2 == 3) {
            this.swQP = i;
        } else if (i2 == 4) {
            this.bps = i;
        } else {
            throw new IllegalStateException("CompileTime BUG by sdk. Unhandled bitrateMode");
        }
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.compileType, i);
        parcel.writeInt(this.rotate);
        parcel.writeInt(this.resizeMode);
        parcel.writeFloat(this.resizeX);
        parcel.writeFloat(this.resizeY);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.outputSize, i);
        parcel.writeParcelable(this.watermarkSize, i);
        parcel.writeParcelable(this.bitrateMode, i);
        parcel.writeInt(this.bps);
        parcel.writeInt(this.fps);
        parcel.writeInt(this.swCRF);
        parcel.writeDouble(this.swQPOffset);
        parcel.writeInt(this.swQP);
        parcel.writeInt(this.gopSize);
        parcel.writeInt(this.swPreset);
        parcel.writeInt(this.encodeStandard);
        parcel.writeInt(this.encodeProfile);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideo ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideoForRotation ? (byte) 1 : 0);
        parcel.writeByte(this.enableRemuxVideoForShoot ? (byte) 1 : 0);
        parcel.writeByte(this.enableInterLeave ? (byte) 1 : 0);
        parcel.writeByte(this.enableAvInterLeave ? (byte) 1 : 0);
        parcel.writeByte(this.hasBFrame ? (byte) 1 : 0);
        parcel.writeLong(this.swMaxrate);
        parcel.writeParcelable(this.mWatermarkParam, i);
        parcel.writeParcelable(this.mVideoWatermarkCompileEncodeSetting, i);
        parcel.writeParcelable(this.mVideoCompileEncodeSetting, i);
        parcel.writeString(this.externalSettingsJsonStr);
        parcel.writeByte(this.mOptRemuxWithCopy ? (byte) 1 : 0);
        parcel.writeString(this.mDescription);
        parcel.writeString(this.mComment);
        parcel.writeByte(this.mCompileSoftInfo ? (byte) 1 : 0);
        parcel.writeByte(this.mRecordingMp4 ? (byte) 1 : 0);
        parcel.writeByte(this.enableHwBufferEncode ? (byte) 1 : 0);
        parcel.writeByte(this.mReEncodeOpt ? (byte) 1 : 0);
        parcel.writeInt(this.mResolutionAlign);
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }

    public VEVideoEncodeSettings(VESize vESize, boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.resizeMode = 2;
        this.speed = 1.0f;
        this.outputSize = new VESize(576, 1024);
        this.watermarkSize = new VESize(-1, -1);
        this.externalSettingsJsonStr = null;
        this.bitrateMode = ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR;
        this.bps = 4194304;
        this.swCRF = 15;
        this.swQPOffset = 0.0d;
        this.swQP = 15;
        this.fps = -1;
        this.gopSize = 60;
        this.swPreset = ENCODE_PRESET.ENCODE_LEVEL_ULTRAFAST.ordinal();
        this.encodeStandard = ENCODE_STANDARD.ENCODE_STANDARD_H264.ordinal();
        this.encodeProfile = ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN.ordinal();
        this.swMaxrate = 15000000;
        this.enableRemuxVideoRes = -1;
        this.enableRemuxVideoFPS = -1;
        this.enableRemuxVideoBitrate = -1;
        this.hasBFrame = false;
        this.mRecordingMp4 = false;
        this.mTransitionKeyframeEnable = false;
        this.mReEncodeOpt = false;
        this.mResolutionAlign = 16;
        this.mKeyFramePoints = null;
        this.outputSize = vESize;
        this.isSupportHWEncoder = z;
        this.fps = i;
        this.gopSize = i2;
        this.bps = i3;
        this.swPreset = i4;
        this.hasBFrame = z2;
        this.compileType = COMPILE_TYPE.COMPILE_TYPE_MP4;
        initFromVEConfigCenter();
    }
}
