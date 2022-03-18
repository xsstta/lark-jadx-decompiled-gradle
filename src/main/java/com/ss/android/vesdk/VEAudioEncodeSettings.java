package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

public class VEAudioEncodeSettings implements Parcelable {
    public static final Parcelable.Creator<VEAudioEncodeSettings> CREATOR = new Parcelable.Creator<VEAudioEncodeSettings>() {
        /* class com.ss.android.vesdk.VEAudioEncodeSettings.C638121 */

        /* renamed from: a */
        public VEAudioEncodeSettings[] newArray(int i) {
            return new VEAudioEncodeSettings[i];
        }

        /* renamed from: a */
        public VEAudioEncodeSettings createFromParcel(Parcel parcel) {
            return new VEAudioEncodeSettings(parcel);
        }
    };

    /* renamed from: a */
    static final VEAudioEncodeSettings f161028a = new VEAudioEncodeSettings();

    /* renamed from: b */
    private ENCODE_STANDARD f161029b;

    /* renamed from: c */
    private int f161030c;

    /* renamed from: d */
    private int f161031d;

    /* renamed from: e */
    private int f161032e;

    /* renamed from: f */
    private boolean f161033f;

    public enum ENCODE_SCENE {
        RECORD,
        COMPILE,
        COMPILE_WATERMARK
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo220488a() {
        return this.f161030c;
    }

    /* renamed from: b */
    public int mo220489b() {
        return this.f161031d;
    }

    /* renamed from: c */
    public int mo220490c() {
        return this.f161032e;
    }

    /* renamed from: com.ss.android.vesdk.VEAudioEncodeSettings$a */
    public static final class C63814a {

        /* renamed from: a */
        public ENCODE_STANDARD f161034a = ENCODE_STANDARD.ENCODE_STANDARD_WAV;

        /* renamed from: b */
        public int f161035b = 44100;

        /* renamed from: c */
        public int f161036c = 131072;

        /* renamed from: d */
        public int f161037d = 2;

        /* renamed from: e */
        public boolean f161038e;

        /* renamed from: f */
        private String f161039f;

        /* renamed from: g */
        private ENCODE_SCENE f161040g = ENCODE_SCENE.COMPILE;

        /* renamed from: a */
        public VEAudioEncodeSettings mo220504a() {
            if (this.f161039f != null) {
                m250536b();
            }
            return new VEAudioEncodeSettings(this);
        }

        /* renamed from: b */
        private void m250536b() {
            try {
                JSONObject jSONObject = new JSONObject(this.f161039f);
                JSONObject jSONObject2 = null;
                if (this.f161040g.equals(ENCODE_SCENE.COMPILE)) {
                    jSONObject2 = jSONObject.getJSONObject("compile");
                } else if (this.f161040g.equals(ENCODE_SCENE.RECORD)) {
                    jSONObject2 = jSONObject.getJSONObject("record");
                } else if (this.f161040g.equals(ENCODE_SCENE.COMPILE_WATERMARK)) {
                    jSONObject2 = jSONObject.getJSONObject("watermark_compile");
                }
                m250535a(jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        private ENCODE_STANDARD m250534a(String str) {
            ENCODE_STANDARD encode_standard = ENCODE_STANDARD.ENCODE_STANDARD_AAC;
            if (str == null) {
                return ENCODE_STANDARD.ENCODE_STANDARD_AAC;
            }
            if ("AAC".equals(str.toUpperCase())) {
                return ENCODE_STANDARD.ENCODE_STANDARD_AAC;
            }
            if ("PCM".equals(str.toUpperCase())) {
                return ENCODE_STANDARD.ENCODE_STANDARD_PCM;
            }
            if ("WAV".equals(str.toUpperCase())) {
                return ENCODE_STANDARD.ENCODE_STANDARD_WAV;
            }
            return encode_standard;
        }

        /* renamed from: a */
        private void m250535a(JSONObject jSONObject) {
            try {
                this.f161034a = m250534a(jSONObject.getString("mCodec"));
                this.f161035b = jSONObject.getInt("mSampleRate");
                this.f161036c = jSONObject.getInt("mBps");
                this.f161037d = jSONObject.getInt("mChannelCount");
                this.f161038e = jSONObject.getBoolean("mHwEnc");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public VEAudioEncodeSettings() {
        this.f161030c = 44100;
        this.f161031d = 131072;
        this.f161032e = 2;
        this.f161030c = 44100;
        this.f161031d = 128000;
        this.f161032e = 2;
    }

    public String toString() {
        return "{" + "\"mCodec\":" + this.f161029b + ",\"mSampleRate\":" + this.f161030c + ",\"mBps\":" + this.f161031d + ",\"mChannelCount\":" + this.f161032e + ",\"mHwEnc\":" + this.f161033f + '}';
    }

    protected VEAudioEncodeSettings(Parcel parcel) {
        boolean z;
        this.f161030c = 44100;
        this.f161031d = 131072;
        this.f161032e = 2;
        this.f161029b = (ENCODE_STANDARD) parcel.readParcelable(ENCODE_STANDARD.class.getClassLoader());
        this.f161030c = parcel.readInt();
        this.f161031d = parcel.readInt();
        this.f161032e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f161033f = z;
    }

    private VEAudioEncodeSettings(C63814a aVar) {
        this.f161030c = 44100;
        this.f161031d = 131072;
        this.f161032e = 2;
        this.f161029b = aVar.f161034a;
        this.f161030c = aVar.f161035b;
        this.f161031d = aVar.f161036c;
        this.f161032e = aVar.f161037d;
        this.f161033f = aVar.f161038e;
    }

    public enum ENCODE_STANDARD implements Parcelable {
        ENCODE_STANDARD_WAV,
        ENCODE_STANDARD_PCM,
        ENCODE_STANDARD_AAC;
        
        public static final Parcelable.Creator<ENCODE_STANDARD> CREATOR = new Parcelable.Creator<ENCODE_STANDARD>() {
            /* class com.ss.android.vesdk.VEAudioEncodeSettings.ENCODE_STANDARD.C638131 */

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

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161029b, i);
        parcel.writeInt(this.f161030c);
        parcel.writeInt(this.f161031d);
        parcel.writeInt(this.f161032e);
        parcel.writeByte(this.f161033f ? (byte) 1 : 0);
    }
}
