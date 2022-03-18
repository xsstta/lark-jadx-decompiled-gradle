package com.ss.android.openbusiness.bot.net.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bot implements Parcelable {
    public static final Parcelable.Creator<Bot> CREATOR = new Parcelable.Creator<Bot>() {
        /* class com.ss.android.openbusiness.bot.net.data.Bot.C595361 */

        /* renamed from: a */
        public Bot[] newArray(int i) {
            return new Bot[i];
        }

        /* renamed from: a */
        public Bot createFromParcel(Parcel parcel) {
            return new Bot(parcel);
        }
    };
    @SerializedName("functional_bot_id")
    @Expose

    /* renamed from: a */
    private String f147783a;
    @SerializedName("bot_type")
    @Expose

    /* renamed from: b */
    private int f147784b;
    @SerializedName("name")
    @Expose

    /* renamed from: c */
    private String f147785c;
    @SerializedName("description")
    @Expose

    /* renamed from: d */
    private String f147786d;
    @SerializedName("avatar")
    @Expose

    /* renamed from: e */
    private Avatar f147787e;
    @SerializedName("is_invited")
    @Expose

    /* renamed from: f */
    private boolean f147788f;
    @SerializedName("state")
    @Expose

    /* renamed from: g */
    private int f147789g;
    @SerializedName("bot_id")
    @Expose

    /* renamed from: h */
    private String f147790h;
    @SerializedName("app_id")
    @Expose

    /* renamed from: i */
    private String f147791i;
    @SerializedName("mobile_detail_micro_app_url")
    @Expose

    /* renamed from: j */
    private String f147792j;
    @SerializedName("mobile_get_micro_app_url")
    @Expose

    /* renamed from: k */
    private String f147793k;

    public int describeContents() {
        return 0;
    }

    public Bot() {
    }

    /* renamed from: d */
    public String mo202900d() {
        return this.f147783a;
    }

    /* renamed from: e */
    public int mo202903e() {
        return this.f147784b;
    }

    /* renamed from: f */
    public String mo202905f() {
        return this.f147785c;
    }

    /* renamed from: g */
    public String mo202907g() {
        return this.f147786d;
    }

    /* renamed from: h */
    public Avatar mo202908h() {
        return this.f147787e;
    }

    /* renamed from: i */
    public boolean mo202909i() {
        return this.f147788f;
    }

    /* renamed from: j */
    public String mo202910j() {
        return this.f147790h;
    }

    /* renamed from: k */
    public String mo202911k() {
        return this.f147791i;
    }

    /* renamed from: l */
    public String mo202912l() {
        return this.f147792j;
    }

    /* renamed from: m */
    public String mo202913m() {
        return this.f147793k;
    }

    /* renamed from: a */
    public void mo202894a(int i) {
        this.f147784b = i;
    }

    /* renamed from: b */
    public void mo202898b(String str) {
        this.f147786d = str;
    }

    /* renamed from: c */
    public void mo202899c(String str) {
        this.f147790h = str;
    }

    /* renamed from: a */
    public void mo202895a(Avatar avatar) {
        this.f147787e = avatar;
    }

    /* renamed from: d */
    public void mo202901d(String str) {
        this.f147791i = str;
    }

    /* renamed from: e */
    public void mo202904e(String str) {
        this.f147792j = str;
    }

    /* renamed from: f */
    public void mo202906f(String str) {
        this.f147793k = str;
    }

    /* renamed from: a */
    public void mo202896a(String str) {
        this.f147785c = str;
    }

    /* renamed from: a */
    public void mo202897a(boolean z) {
        this.f147788f = z;
    }

    protected Bot(Parcel parcel) {
        boolean z;
        this.f147783a = parcel.readString();
        this.f147784b = parcel.readInt();
        this.f147785c = parcel.readString();
        this.f147786d = parcel.readString();
        this.f147787e = (Avatar) parcel.readParcelable(Avatar.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f147788f = z;
        this.f147789g = parcel.readInt();
        this.f147790h = parcel.readString();
        this.f147791i = parcel.readString();
        this.f147792j = parcel.readString();
        this.f147793k = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f147783a);
        parcel.writeInt(this.f147784b);
        parcel.writeString(this.f147785c);
        parcel.writeString(this.f147786d);
        parcel.writeParcelable(this.f147787e, i);
        parcel.writeByte(this.f147788f ? (byte) 1 : 0);
        parcel.writeInt(this.f147789g);
        parcel.writeString(this.f147790h);
        parcel.writeString(this.f147791i);
        parcel.writeString(this.f147792j);
        parcel.writeString(this.f147793k);
    }
}
