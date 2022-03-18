package com.ss.android.lark.live.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeData;
import com.ss.android.lark.live.webview.bridgev2.entity.CallNativeParams;

public class VCLiveData implements Parcelable {
    public static final Parcelable.Creator<VCLiveData> CREATOR = new Parcelable.Creator<VCLiveData>() {
        /* class com.ss.android.lark.live.model.VCLiveData.C415181 */

        /* renamed from: a */
        public VCLiveData[] newArray(int i) {
            return new VCLiveData[i];
        }

        /* renamed from: a */
        public VCLiveData createFromParcel(Parcel parcel) {
            return new VCLiveData(parcel);
        }
    };

    /* renamed from: a */
    public String f105545a = "";

    /* renamed from: b */
    public String f105546b = "";

    /* renamed from: c */
    public String f105547c = "";

    /* renamed from: d */
    public String f105548d = "";

    /* renamed from: e */
    public boolean f105549e;

    /* renamed from: f */
    public boolean f105550f;

    /* renamed from: g */
    public LivePlayerState f105551g = LivePlayerState.UNKNOWN;

    public int describeContents() {
        return 0;
    }

    public enum LivePlayerState {
        UNKNOWN(0),
        PLAY(1),
        PAUSE(2),
        END(3),
        ERROR(4);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static LivePlayerState valueOf(int i) {
            if (i == 1) {
                return PLAY;
            }
            if (i == 2) {
                return PAUSE;
            }
            if (i == 3) {
                return END;
            }
            if (i != 4) {
                return UNKNOWN;
            }
            return ERROR;
        }

        private LivePlayerState(int i) {
            this.value = i;
        }
    }

    public VCLiveData() {
    }

    public String toString() {
        return "live link is empty: " + TextUtils.isEmpty(this.f105545a) + ", stream link is empty: " + TextUtils.isEmpty(this.f105546b) + ", live host is empty: " + TextUtils.isEmpty(this.f105547c) + ", live id is empty: " + TextUtils.isEmpty(this.f105548d) + ", muted: " + this.f105549e + ", danmaku enable: " + this.f105550f + ", live state: " + this.f105551g;
    }

    /* renamed from: a */
    public void mo149392a(CallNativeData callNativeData) {
        if (callNativeData.params != null) {
            CallNativeParams callNativeParams = callNativeData.params;
            this.f105547c = callNativeParams.live_host;
            this.f105546b = callNativeParams.stream_link;
            this.f105548d = callNativeParams.live_id;
            this.f105549e = callNativeParams.muted;
            this.f105550f = callNativeParams.danmaku_active;
        }
    }

    protected VCLiveData(Parcel parcel) {
        boolean z;
        this.f105545a = parcel.readString();
        this.f105546b = parcel.readString();
        this.f105547c = parcel.readString();
        this.f105548d = parcel.readString();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f105549e = z;
        this.f105550f = parcel.readByte() == 0 ? false : z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105545a);
        parcel.writeString(this.f105546b);
        parcel.writeString(this.f105547c);
        parcel.writeString(this.f105548d);
        parcel.writeByte(this.f105549e ? (byte) 1 : 0);
        parcel.writeByte(this.f105550f ? (byte) 1 : 0);
    }
}
