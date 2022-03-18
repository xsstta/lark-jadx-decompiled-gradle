package com.bytedance.ee.bear.domain;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import java.util.HashMap;
import java.util.Map;

public class BearUrl implements Parcelable {
    public static final Parcelable.Creator<BearUrl> CREATOR = new Parcelable.Creator<BearUrl>() {
        /* class com.bytedance.ee.bear.domain.BearUrl.C62971 */

        /* renamed from: a */
        public BearUrl[] newArray(int i) {
            return new BearUrl[i];
        }

        /* renamed from: a */
        public BearUrl createFromParcel(Parcel parcel) {
            return new BearUrl(parcel);
        }
    };

    /* renamed from: a */
    public String f17446a;

    /* renamed from: b */
    public String f17447b;

    /* renamed from: c */
    public String f17448c;

    /* renamed from: d */
    public Map<String, String> f17449d = new HashMap();

    /* renamed from: e */
    public String f17450e;

    /* renamed from: f */
    public String f17451f;

    /* renamed from: g */
    public String f17452g;

    /* renamed from: h */
    public String f17453h;

    /* renamed from: i */
    public String f17454i;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo25322a() {
        return this.f17446a;
    }

    /* renamed from: b */
    public String mo25325b() {
        return this.f17447b;
    }

    /* renamed from: c */
    public Map<String, String> mo25327c() {
        return this.f17449d;
    }

    /* renamed from: d */
    public String mo25329d() {
        return this.f17450e;
    }

    /* renamed from: e */
    public void mo25332e(String str) {
        this.f17452g = str;
    }

    /* renamed from: f */
    public void mo25333f(String str) {
        this.f17453h = str;
    }

    /* renamed from: g */
    public void mo25334g(String str) {
        this.f17454i = str;
    }

    /* renamed from: a */
    public void mo25323a(String str) {
        this.f17446a = str;
    }

    /* renamed from: b */
    public void mo25326b(String str) {
        this.f17447b = str;
    }

    /* renamed from: c */
    public void mo25328c(String str) {
        this.f17448c = str;
    }

    /* renamed from: d */
    public void mo25330d(String str) {
        this.f17451f = str;
    }

    public BearUrl(String str) {
        this.f17450e = str;
    }

    /* renamed from: h */
    private String m25257h(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        C13479a.m54758a("BearUrl", "the document type is empty");
        return C8275a.f22369b.mo32553a();
    }

    protected BearUrl(Parcel parcel) {
        this.f17446a = m25257h(parcel.readString());
        this.f17447b = parcel.readString();
        this.f17448c = parcel.readString();
        this.f17450e = parcel.readString();
        this.f17451f = parcel.readString();
        this.f17453h = parcel.readString();
        this.f17452g = parcel.readString();
        this.f17454i = parcel.readString();
        this.f17449d = parcel.readHashMap(getClass().getClassLoader());
    }

    /* renamed from: a */
    public void mo25324a(String str, String str2) {
        this.f17449d.put(str, str2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17446a);
        parcel.writeString(this.f17447b);
        parcel.writeString(this.f17448c);
        parcel.writeString(this.f17450e);
        parcel.writeString(this.f17451f);
        parcel.writeString(this.f17453h);
        parcel.writeString(this.f17452g);
        parcel.writeString(this.f17454i);
        Map<String, String> map = this.f17449d;
        if (map != null) {
            parcel.writeMap(map);
        }
    }
}
