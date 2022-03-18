package com.tt.miniapp.audio.background;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67522b;
import org.json.JSONException;
import org.json.JSONObject;

public class BgAudioModel implements Parcelable {
    public static final Parcelable.Creator<BgAudioModel> CREATOR = new Parcelable.Creator<BgAudioModel>() {
        /* class com.tt.miniapp.audio.background.BgAudioModel.C657621 */

        /* renamed from: a */
        public BgAudioModel[] newArray(int i) {
            return new BgAudioModel[i];
        }

        /* renamed from: a */
        public BgAudioModel createFromParcel(Parcel parcel) {
            return new BgAudioModel(parcel);
        }
    };

    /* renamed from: a */
    public String f165725a;

    /* renamed from: b */
    public int f165726b;

    /* renamed from: c */
    public boolean f165727c;

    /* renamed from: d */
    public boolean f165728d;

    /* renamed from: e */
    public boolean f165729e;

    /* renamed from: f */
    public float f165730f;

    /* renamed from: g */
    public String f165731g;

    /* renamed from: h */
    public String f165732h;

    /* renamed from: i */
    public String f165733i;

    /* renamed from: j */
    public JSONObject f165734j;

    /* renamed from: k */
    public String f165735k;

    public int describeContents() {
        return 0;
    }

    public BgAudioModel() {
    }

    public String toString() {
        return mo230407a();
    }

    /* renamed from: a */
    public String mo230407a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("src", this.f165725a);
            jSONObject.put("startTime", this.f165726b);
            jSONObject.put("autoPlay", this.f165727c);
            jSONObject.put("obeyMuteSwitch", this.f165729e);
            jSONObject.put("loop", this.f165728d);
            jSONObject.put("volume", (double) this.f165730f);
            jSONObject.put("coverImgUrl", this.f165731g);
            jSONObject.put("title", this.f165732h);
            jSONObject.put("singer", this.f165733i);
            jSONObject.put("audioPage", this.f165734j);
            jSONObject.put("miniAppId", this.f165735k);
            return jSONObject.toString();
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(6, "tma_BgAudioModel", e.getStackTrace());
            return null;
        }
    }

    protected BgAudioModel(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f165725a = parcel.readString();
        this.f165726b = parcel.readInt();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f165727c = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f165728d = z2;
        this.f165729e = parcel.readByte() == 0 ? false : z3;
        this.f165730f = parcel.readFloat();
        this.f165731g = parcel.readString();
        this.f165732h = parcel.readString();
        this.f165733i = parcel.readString();
        this.f165735k = parcel.readString();
    }

    /* renamed from: a */
    public static BgAudioModel m257793a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BgAudioModel bgAudioModel = new BgAudioModel();
            bgAudioModel.f165725a = jSONObject.optString("src");
            bgAudioModel.f165726b = jSONObject.optInt("startTime");
            bgAudioModel.f165729e = jSONObject.optBoolean("obeyMuteSwitch");
            bgAudioModel.f165727c = jSONObject.optBoolean("autoPlay");
            bgAudioModel.f165728d = jSONObject.optBoolean("loop");
            bgAudioModel.f165730f = (float) jSONObject.optDouble("volume");
            bgAudioModel.f165731g = jSONObject.optString("coverImgUrl");
            bgAudioModel.f165732h = jSONObject.optString("title");
            bgAudioModel.f165733i = jSONObject.optString("singer");
            bgAudioModel.f165734j = jSONObject.optJSONObject("audioPage");
            bgAudioModel.f165735k = jSONObject.optString("miniAppId");
            return bgAudioModel;
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "tma_BgAudioModel", e.getStackTrace());
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f165725a);
        parcel.writeInt(this.f165726b);
        parcel.writeByte(this.f165727c ? (byte) 1 : 0);
        parcel.writeByte(this.f165728d ? (byte) 1 : 0);
        parcel.writeByte(this.f165729e ? (byte) 1 : 0);
        parcel.writeFloat(this.f165730f);
        parcel.writeString(this.f165731g);
        parcel.writeString(this.f165732h);
        parcel.writeString(this.f165733i);
        parcel.writeString(this.f165735k);
    }

    /* renamed from: a */
    public static BgAudioModel m257794a(String str, C67522b bVar, IAppContext iAppContext) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            bVar.mo234467a("args is null");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            BgAudioModel bgAudioModel = new BgAudioModel();
            bgAudioModel.f165725a = jSONObject.optString("src");
            bgAudioModel.f165726b = jSONObject.optInt("startTime");
            if (jSONObject.optInt("autoplay") == 1) {
                z = true;
            } else {
                z = false;
            }
            bgAudioModel.f165727c = z;
            bgAudioModel.f165728d = jSONObject.optBoolean("loop");
            bgAudioModel.f165731g = jSONObject.optString("coverImgUrl");
            bgAudioModel.f165732h = jSONObject.optString("title");
            bgAudioModel.f165733i = jSONObject.optString("singer");
            bgAudioModel.f165734j = jSONObject.optJSONObject("audioPage");
            AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
            if (appInfo != null) {
                if (TextUtils.isEmpty(bgAudioModel.f165731g)) {
                    bgAudioModel.f165731g = appInfo.icon;
                }
                if (TextUtils.isEmpty(bgAudioModel.f165732h)) {
                    bgAudioModel.f165732h = appInfo.appName;
                }
                bgAudioModel.f165735k = appInfo.appId;
            }
            return bgAudioModel;
        } catch (Exception e) {
            bVar.mo234467a("parse BgAudioModel exception");
            bVar.mo234469a((Throwable) e);
            AppBrandLogger.m52829e("tma_BgAudioModel", "parse", e);
            return null;
        }
    }
}
