package com.bytedance.push;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.notification.PushNotificationExtra;
import org.json.JSONObject;

public class PushBody implements Parcelable {
    public static final Parcelable.Creator<PushBody> CREATOR = new Parcelable.Creator<PushBody>() {
        /* class com.bytedance.push.PushBody.C203791 */

        /* renamed from: a */
        public PushBody[] newArray(int i) {
            return new PushBody[i];
        }

        /* renamed from: a */
        public PushBody createFromParcel(Parcel parcel) {
            return new PushBody(parcel);
        }
    };

    /* renamed from: A */
    public String f49732A;

    /* renamed from: a */
    public String f49733a;

    /* renamed from: b */
    public long f49734b;

    /* renamed from: c */
    public long f49735c;

    /* renamed from: d */
    public final String f49736d;

    /* renamed from: e */
    public final boolean f49737e;

    /* renamed from: f */
    public final String f49738f;

    /* renamed from: g */
    public final boolean f49739g;

    /* renamed from: h */
    public String f49740h;

    /* renamed from: i */
    public String f49741i;

    /* renamed from: j */
    public boolean f49742j;

    /* renamed from: k */
    public JSONObject f49743k;

    /* renamed from: l */
    public String f49744l;

    /* renamed from: m */
    public String f49745m;

    /* renamed from: n */
    public String f49746n;

    /* renamed from: o */
    public int f49747o;

    /* renamed from: p */
    public String f49748p;

    /* renamed from: q */
    public boolean f49749q;

    /* renamed from: r */
    public boolean f49750r;

    /* renamed from: s */
    public boolean f49751s;

    /* renamed from: t */
    public int f49752t;

    /* renamed from: u */
    public PushNotificationExtra f49753u;

    /* renamed from: v */
    public JSONObject f49754v;

    /* renamed from: w */
    public long f49755w;

    /* renamed from: x */
    public int f49756x;

    /* renamed from: y */
    public int f49757y;

    /* renamed from: z */
    public String f49758z;

    public @interface ImageType {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo68710a() {
        return this.f49741i;
    }

    /* renamed from: b */
    public String mo68711b() {
        JSONObject jSONObject = this.f49743k;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo68712c() {
        if (this.f49734b > 0 && !TextUtils.isEmpty(this.f49748p) && !TextUtils.isEmpty(this.f49736d)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "PushBody{groupId='" + this.f49736d + '\'' + ", extra='" + this.f49740h + '\'' + ", mNotificationChannelId='" + this.f49741i + '\'' + ", mIsPassThough=" + this.f49742j + ", msgData=" + this.f49743k + ", text='" + this.f49744l + '\'' + ", title='" + this.f49745m + '\'' + ", imageUrl='" + this.f49746n + '\'' + ", imageType=" + this.f49747o + ", id=" + this.f49734b + ", open_url='" + this.f49748p + '\'' + ", useLED=" + this.f49749q + ", useSound=" + this.f49750r + ", useVibrator=" + this.f49751s + ", messageType=" + this.f49752t + '}';
    }

    protected PushBody(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f49734b = parcel.readLong();
        this.f49735c = parcel.readLong();
        this.f49736d = parcel.readString();
        boolean z6 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f49737e = z;
        this.f49738f = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f49739g = z2;
        this.f49740h = parcel.readString();
        this.f49753u = (PushNotificationExtra) parcel.readParcelable(PushNotificationExtra.class.getClassLoader());
        this.f49741i = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f49742j = z3;
        try {
            this.f49743k = new JSONObject(parcel.readString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f49744l = parcel.readString();
        this.f49745m = parcel.readString();
        this.f49746n = parcel.readString();
        this.f49747o = parcel.readInt();
        this.f49748p = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f49749q = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f49750r = z5;
        this.f49751s = parcel.readByte() == 0 ? false : z6;
        this.f49752t = parcel.readInt();
        this.f49755w = parcel.readLong();
        this.f49733a = parcel.readString();
        try {
            this.f49754v = new JSONObject(parcel.readString());
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public PushBody(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        this.f49743k = jSONObject;
        this.f49748p = jSONObject.optString("open_url");
        this.f49744l = jSONObject.optString("text");
        this.f49745m = jSONObject.optString("title");
        this.f49746n = jSONObject.optString("image_url");
        this.f49734b = jSONObject.optLong("id", 0);
        this.f49735c = jSONObject.optLong("rid64", 0);
        this.f49749q = m74234a(jSONObject, "use_led", false);
        this.f49750r = m74234a(jSONObject, "sound", false);
        this.f49751s = m74234a(jSONObject, "use_vibrator", false);
        this.f49747o = jSONObject.optInt("image_type", 0);
        boolean z3 = true;
        if (jSONObject.optInt("pass_through", 1) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f49742j = z;
        this.f49741i = jSONObject.optString("notify_channel");
        this.f49752t = jSONObject.optInt("msg_from");
        this.f49736d = jSONObject.optString("group_id_str");
        if (jSONObject.optInt("st", 1) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f49737e = z2;
        this.f49738f = jSONObject.optString("ttpush_sec_target_uid");
        this.f49739g = jSONObject.optInt("ttpush_need_filter_uid", 0) <= 0 ? false : z3;
        this.f49755w = jSONObject.optLong("revoke_id");
        this.f49740h = jSONObject.optString("extra_str");
        this.f49753u = new PushNotificationExtra(jSONObject.optString("bdpush_str"));
        this.f49733a = jSONObject.optString("sign");
        this.f49754v = jSONObject.optJSONObject("ttpush_event_extra");
        this.f49756x = jSONObject.optInt("badge");
        this.f49757y = jSONObject.optInt("push_show_type", 0);
        this.f49758z = jSONObject.optString("business_type", "");
        this.f49732A = jSONObject.optString("voip_params", "");
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeLong(this.f49734b);
        parcel.writeLong(this.f49735c);
        parcel.writeString(this.f49736d);
        parcel.writeByte(this.f49737e ? (byte) 1 : 0);
        parcel.writeString(this.f49738f);
        parcel.writeByte(this.f49739g ? (byte) 1 : 0);
        parcel.writeString(this.f49740h);
        parcel.writeParcelable(this.f49753u, i);
        parcel.writeString(this.f49741i);
        parcel.writeByte(this.f49742j ? (byte) 1 : 0);
        parcel.writeString(this.f49743k.toString());
        parcel.writeString(this.f49744l);
        parcel.writeString(this.f49745m);
        parcel.writeString(this.f49746n);
        parcel.writeInt(this.f49747o);
        parcel.writeString(this.f49748p);
        parcel.writeByte(this.f49749q ? (byte) 1 : 0);
        parcel.writeByte(this.f49750r ? (byte) 1 : 0);
        parcel.writeByte(this.f49751s ? (byte) 1 : 0);
        parcel.writeInt(this.f49752t);
        parcel.writeLong(this.f49755w);
        parcel.writeString(this.f49733a);
        JSONObject jSONObject = this.f49754v;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.toString();
        }
        parcel.writeString(str);
    }

    /* renamed from: a */
    private static boolean m74234a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt >= 1) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }
}
