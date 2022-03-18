package com.ss.android.lark.biz.im.api;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/biz/im/api/HomeOnCallInfo;", "", "onCallId", "", "onCallAvatar", "onCallEntityId", "onCallName", "phoneNum", "needReportLocation", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getNeedReportLocation", "()Z", "getOnCallAvatar", "()Ljava/lang/String;", "getOnCallEntityId", "getOnCallId", "getOnCallName", "getPhoneNum", "im_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.api.h */
public final class HomeOnCallInfo {

    /* renamed from: a */
    private final String f74248a;

    /* renamed from: b */
    private final String f74249b;

    /* renamed from: c */
    private final String f74250c;

    /* renamed from: d */
    private final String f74251d;

    /* renamed from: e */
    private final String f74252e;

    /* renamed from: f */
    private final boolean f74253f;

    /* renamed from: a */
    public final String mo106718a() {
        return this.f74248a;
    }

    /* renamed from: b */
    public final String mo106719b() {
        return this.f74249b;
    }

    /* renamed from: c */
    public final String mo106720c() {
        return this.f74250c;
    }

    /* renamed from: d */
    public final String mo106721d() {
        return this.f74251d;
    }

    /* renamed from: e */
    public final String mo106722e() {
        return this.f74252e;
    }

    /* renamed from: f */
    public final boolean mo106723f() {
        return this.f74253f;
    }

    public HomeOnCallInfo(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.f74248a = str;
        this.f74249b = str2;
        this.f74250c = str3;
        this.f74251d = str4;
        this.f74252e = str5;
        this.f74253f = z;
    }
}
