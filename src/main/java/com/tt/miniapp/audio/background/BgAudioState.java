package com.tt.miniapp.audio.background;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class BgAudioState implements Parcelable {
    public static final Parcelable.Creator<BgAudioState> CREATOR = new Parcelable.Creator<BgAudioState>() {
        /* class com.tt.miniapp.audio.background.BgAudioState.C657631 */

        /* renamed from: a */
        public BgAudioState[] newArray(int i) {
            return new BgAudioState[i];
        }

        /* renamed from: a */
        public BgAudioState createFromParcel(Parcel parcel) {
            return new BgAudioState(parcel);
        }
    };

    /* renamed from: a */
    public int f165736a;

    /* renamed from: b */
    public int f165737b;

    /* renamed from: c */
    public boolean f165738c;

    /* renamed from: d */
    public int f165739d;

    /* renamed from: e */
    public int f165740e;

    public int describeContents() {
        return 0;
    }

    public BgAudioState() {
    }

    /* renamed from: a */
    public String mo230415a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", this.f165736a);
            jSONObject.put("currentTime", this.f165737b);
            jSONObject.put("paused", this.f165738c);
            jSONObject.put("bufferd", this.f165739d);
            jSONObject.put("volume", this.f165740e);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("tma_BgAudioState", "", e);
        }
        return jSONObject.toString();
    }

    protected BgAudioState(Parcel parcel) {
        boolean z;
        this.f165736a = parcel.readInt();
        this.f165737b = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f165738c = z;
        this.f165739d = parcel.readInt();
        this.f165740e = parcel.readInt();
    }

    /* renamed from: a */
    public static BgAudioState m257798a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BgAudioState bgAudioState = new BgAudioState();
            bgAudioState.f165736a = jSONObject.optInt("duration");
            bgAudioState.f165737b = jSONObject.optInt("currentTime");
            bgAudioState.f165738c = jSONObject.optBoolean("paused");
            bgAudioState.f165739d = jSONObject.optInt("bufferd");
            bgAudioState.f165740e = jSONObject.optInt("volume");
            return bgAudioState;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_BgAudioState", e.getStackTrace());
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f165736a);
        parcel.writeInt(this.f165737b);
        parcel.writeByte(this.f165738c ? (byte) 1 : 0);
        parcel.writeInt(this.f165739d);
        parcel.writeInt(this.f165740e);
    }
}
