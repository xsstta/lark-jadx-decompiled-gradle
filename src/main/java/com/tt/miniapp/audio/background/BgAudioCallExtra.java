package com.tt.miniapp.audio.background;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import org.json.JSONObject;

public class BgAudioCallExtra implements Parcelable {
    public static final Parcelable.Creator<BgAudioCallExtra> CREATOR = new Parcelable.Creator<BgAudioCallExtra>() {
        /* class com.tt.miniapp.audio.background.BgAudioCallExtra.C657611 */

        /* renamed from: a */
        public BgAudioCallExtra[] newArray(int i) {
            return new BgAudioCallExtra[i];
        }

        /* renamed from: a */
        public BgAudioCallExtra createFromParcel(Parcel parcel) {
            return new BgAudioCallExtra(parcel);
        }
    };

    /* renamed from: a */
    public String f165722a;

    /* renamed from: b */
    public String f165723b;

    /* renamed from: c */
    public boolean f165724c;

    public int describeContents() {
        return 0;
    }

    public BgAudioCallExtra() {
    }

    /* renamed from: a */
    public String mo230399a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("callAppId", this.f165722a);
            jSONObject.put("callProcessName", this.f165723b);
            jSONObject.put("isGame", this.f165724c);
            return jSONObject.toString();
        } catch (Exception e) {
            AppBrandLogger.m52829e("BgAudioCallExtra", "toJSONStr", e);
            return null;
        }
    }

    protected BgAudioCallExtra(Parcel parcel) {
        boolean z;
        this.f165722a = parcel.readString();
        this.f165723b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f165724c = z;
    }

    /* renamed from: a */
    public static BgAudioCallExtra m257789a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BgAudioCallExtra bgAudioCallExtra = new BgAudioCallExtra();
            bgAudioCallExtra.f165722a = jSONObject.optString("callAppId");
            bgAudioCallExtra.f165723b = jSONObject.optString("callProcessName");
            bgAudioCallExtra.f165724c = jSONObject.optBoolean("isGame");
            return bgAudioCallExtra;
        } catch (Exception e) {
            AppBrandLogger.m52829e("BgAudioCallExtra", "parseFromJSONStr", e);
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f165722a);
        parcel.writeString(this.f165723b);
        parcel.writeByte(this.f165724c ? (byte) 1 : 0);
    }
}
