package com.tt.miniapp.feedback.entrance.vo;

import android.os.Parcel;
import android.os.Parcelable;

public class FeedbackParam implements Parcelable {
    public static final Parcelable.Creator<FeedbackParam> CREATOR = new Parcelable.Creator<FeedbackParam>() {
        /* class com.tt.miniapp.feedback.entrance.vo.FeedbackParam.C661551 */

        /* renamed from: a */
        public FeedbackParam[] newArray(int i) {
            return new FeedbackParam[i];
        }

        /* renamed from: a */
        public FeedbackParam createFromParcel(Parcel parcel) {
            return new FeedbackParam(parcel);
        }
    };

    /* renamed from: a */
    private String f166995a;

    /* renamed from: b */
    private String f166996b;

    /* renamed from: c */
    private String f166997c;

    /* renamed from: d */
    private String f166998d;

    /* renamed from: e */
    private String f166999e;

    /* renamed from: f */
    private String f167000f;

    /* renamed from: g */
    private String f167001g;

    /* renamed from: h */
    private String f167002h;

    /* renamed from: i */
    private String f167003i;

    /* renamed from: j */
    private String f167004j;

    /* renamed from: k */
    private String f167005k;

    /* renamed from: l */
    private String f167006l;

    /* renamed from: m */
    private String f167007m;

    /* renamed from: n */
    private int f167008n;

    /* renamed from: o */
    private String f167009o;

    public int describeContents() {
        return 0;
    }

    public FeedbackParam() {
    }

    /* renamed from: a */
    public String mo231406a() {
        return this.f166995a;
    }

    /* renamed from: b */
    public String mo231411b() {
        return this.f166996b;
    }

    /* renamed from: c */
    public String mo231413c() {
        return this.f166997c;
    }

    /* renamed from: d */
    public String mo231415d() {
        return this.f166998d;
    }

    /* renamed from: e */
    public String mo231418e() {
        return this.f166999e;
    }

    /* renamed from: f */
    public String mo231420f() {
        return this.f167000f;
    }

    /* renamed from: g */
    public String mo231422g() {
        return this.f167001g;
    }

    /* renamed from: h */
    public String mo231424h() {
        return this.f167002h;
    }

    /* renamed from: i */
    public int mo231426i() {
        return this.f167008n;
    }

    /* renamed from: j */
    public String mo231428j() {
        return this.f167009o;
    }

    /* renamed from: k */
    public String mo231430k() {
        return this.f167005k;
    }

    /* renamed from: l */
    public String mo231432l() {
        return this.f167006l;
    }

    /* renamed from: m */
    public String mo231434m() {
        return this.f167007m;
    }

    /* renamed from: n */
    public String mo231436n() {
        return this.f167003i;
    }

    /* renamed from: o */
    public String mo231438o() {
        return this.f167004j;
    }

    /* renamed from: a */
    public void mo231409a(int i) {
        this.f167008n = i;
    }

    /* renamed from: b */
    public void mo231412b(String str) {
        this.f166996b = str;
    }

    /* renamed from: c */
    public void mo231414c(String str) {
        this.f166997c = str;
    }

    /* renamed from: d */
    public void mo231416d(String str) {
        this.f166998d = str;
    }

    /* renamed from: e */
    public void mo231419e(String str) {
        this.f166999e = str;
    }

    /* renamed from: f */
    public void mo231421f(String str) {
        this.f167000f = str;
    }

    /* renamed from: g */
    public void mo231423g(String str) {
        this.f167001g = str;
    }

    /* renamed from: h */
    public void mo231425h(String str) {
        this.f167002h = str;
    }

    /* renamed from: i */
    public void mo231427i(String str) {
        this.f167009o = str;
    }

    /* renamed from: j */
    public void mo231429j(String str) {
        this.f167005k = str;
    }

    /* renamed from: k */
    public void mo231431k(String str) {
        this.f167006l = str;
    }

    /* renamed from: l */
    public void mo231433l(String str) {
        this.f167007m = str;
    }

    /* renamed from: m */
    public void mo231435m(String str) {
        this.f167003i = str;
    }

    /* renamed from: n */
    public void mo231437n(String str) {
        this.f167004j = str;
    }

    /* renamed from: a */
    public void mo231410a(String str) {
        this.f166995a = str;
    }

    protected FeedbackParam(Parcel parcel) {
        this.f166995a = parcel.readString();
        this.f166996b = parcel.readString();
        this.f166997c = parcel.readString();
        this.f166998d = parcel.readString();
        this.f166999e = parcel.readString();
        this.f167000f = parcel.readString();
        this.f167001g = parcel.readString();
        this.f167002h = parcel.readString();
        this.f167003i = parcel.readString();
        this.f167004j = parcel.readString();
        this.f167005k = parcel.readString();
        this.f167006l = parcel.readString();
        this.f167007m = parcel.readString();
        this.f167008n = parcel.readInt();
        this.f167009o = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f166995a);
        parcel.writeString(this.f166996b);
        parcel.writeString(this.f166997c);
        parcel.writeString(this.f166998d);
        parcel.writeString(this.f166999e);
        parcel.writeString(this.f167000f);
        parcel.writeString(this.f167001g);
        parcel.writeString(this.f167002h);
        parcel.writeString(this.f167003i);
        parcel.writeString(this.f167004j);
        parcel.writeString(this.f167005k);
        parcel.writeString(this.f167006l);
        parcel.writeString(this.f167007m);
        parcel.writeInt(this.f167008n);
        parcel.writeString(this.f167009o);
    }

    /* renamed from: a */
    public String mo231407a(String str, String str2, String str3) {
        return "?app_name=" + str3 + "&channel=" + this.f166996b + "&device_id=" + this.f166997c + "&aid=" + str2 + "&appkey=" + str + "&iid=" + this.f166999e;
    }

    /* renamed from: a */
    public String mo231408a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return "?app_name=" + str3 + "&channel=" + this.f166996b + "&device_id=" + this.f166997c + "&aid=" + str2 + "&appkey=" + str + "&iid=" + this.f166999e + "&app_version=" + str4 + "&os_version=" + str5 + "&device_type=" + str6 + "&update_version_code=" + str7;
    }
}
