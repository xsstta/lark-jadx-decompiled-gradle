package com.bytedance.notification;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PushNotificationExtra implements Parcelable {
    public static final Parcelable.Creator<PushNotificationExtra> CREATOR = new Parcelable.Creator<PushNotificationExtra>() {
        /* class com.bytedance.notification.PushNotificationExtra.C202171 */

        /* renamed from: a */
        public PushNotificationExtra[] newArray(int i) {
            return new PushNotificationExtra[i];
        }

        /* renamed from: a */
        public PushNotificationExtra createFromParcel(Parcel parcel) {
            return new PushNotificationExtra(parcel);
        }
    };

    /* renamed from: a */
    public String f49370a;

    /* renamed from: b */
    public JSONObject f49371b;

    /* renamed from: c */
    public boolean f49372c;

    /* renamed from: d */
    public int f49373d = -1;

    /* renamed from: e */
    public int f49374e;

    /* renamed from: f */
    public int f49375f;

    /* renamed from: g */
    public int f49376g;

    /* renamed from: h */
    public boolean f49377h;

    /* renamed from: i */
    public boolean f49378i;

    /* renamed from: j */
    public int f49379j = 2;

    /* renamed from: k */
    public int f49380k = C20229c.f49502a;

    /* renamed from: l */
    public boolean f49381l;

    /* renamed from: m */
    public boolean f49382m;

    /* renamed from: n */
    public int f49383n = -1;

    /* renamed from: o */
    public int f49384o;

    /* renamed from: p */
    public int f49385p;

    /* renamed from: q */
    public int f49386q;

    /* renamed from: r */
    public double f49387r = 1.0d;

    /* renamed from: s */
    public boolean f49388s;

    /* renamed from: t */
    public boolean f49389t;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    private void m73789a() {
        JSONObject jSONObject = this.f49371b;
        if (jSONObject != null) {
            try {
                this.f49372c = jSONObject.optBoolean("enable_notification_highlight", false);
                this.f49373d = m73788a(this.f49371b, "notification_color", -1);
                this.f49374e = m73788a(this.f49371b, "notification_header_color", 0);
                this.f49375f = m73788a(this.f49371b, "notification_title_color", 0);
                this.f49376g = m73788a(this.f49371b, "notification_content_color", 0);
                this.f49388s = this.f49371b.optBoolean("reset_all_text_to_black", false);
                this.f49381l = this.f49371b.optBoolean("enable_banner_show", false);
                this.f49382m = this.f49371b.optBoolean("enable_banner_highlight", false);
                this.f49383n = m73788a(this.f49371b, "banner_color", -1);
                this.f49384o = m73788a(this.f49371b, "banner_header_color", 0);
                this.f49385p = m73788a(this.f49371b, "banner_title_color", 0);
                this.f49386q = m73788a(this.f49371b, "banner_content_color", 0);
                this.f49387r = this.f49371b.optDouble("banner_show_duration", 1.0d);
                this.f49377h = this.f49371b.optBoolean("enable_sticky", false);
                this.f49378i = this.f49371b.optBoolean("enable_on_top", false);
                this.f49379j = this.f49371b.optInt("on_top_time", 2);
                this.f49380k = this.f49371b.optInt("notification_style", C20229c.f49502a);
                this.f49389t = this.f49371b.optBoolean("handle_by_sdk", true);
            } catch (Throwable unused) {
            }
        }
    }

    public PushNotificationExtra(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f49370a = str;
            try {
                this.f49371b = new JSONObject(this.f49370a);
                m73789a();
            } catch (Throwable unused) {
            }
        }
    }

    protected PushNotificationExtra(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f49370a = parcel.readString();
        try {
            this.f49371b = new JSONObject(parcel.readString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        boolean z5 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f49372c = z;
        this.f49373d = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f49377h = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f49378i = z3;
        this.f49379j = parcel.readInt();
        this.f49380k = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f49381l = z4;
        this.f49382m = parcel.readByte() == 0 ? false : z5;
        this.f49383n = parcel.readInt();
        this.f49387r = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f49370a);
        JSONObject jSONObject = this.f49371b;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeByte(this.f49372c ? (byte) 1 : 0);
        parcel.writeInt(this.f49373d);
        parcel.writeByte(this.f49377h ? (byte) 1 : 0);
        parcel.writeByte(this.f49378i ? (byte) 1 : 0);
        parcel.writeInt(this.f49379j);
        parcel.writeInt(this.f49380k);
        parcel.writeByte(this.f49381l ? (byte) 1 : 0);
        parcel.writeByte(this.f49382m ? (byte) 1 : 0);
        parcel.writeInt(this.f49383n);
        parcel.writeDouble(this.f49387r);
    }

    /* renamed from: a */
    private int m73788a(JSONObject jSONObject, String str, int i) {
        try {
            String optString = jSONObject.optString(str);
            if (!TextUtils.isEmpty(optString)) {
                return Color.parseColor(optString);
            }
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }
}
