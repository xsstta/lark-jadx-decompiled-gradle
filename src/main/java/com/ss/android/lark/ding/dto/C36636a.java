package com.ss.android.lark.ding.dto;

import com.ss.android.lark.ding.entity.DingStatus;

/* renamed from: com.ss.android.lark.ding.dto.a */
public class C36636a {

    /* renamed from: a */
    private String f94236a;

    /* renamed from: b */
    private String f94237b;

    /* renamed from: c */
    private UrgentType f94238c;

    /* renamed from: d */
    private long f94239d;

    /* renamed from: e */
    private DingStatus f94240e;

    /* renamed from: f */
    private String f94241f;

    /* renamed from: a */
    public String mo135167a() {
        return this.f94236a;
    }

    /* renamed from: b */
    public String mo135172b() {
        return this.f94237b;
    }

    /* renamed from: c */
    public UrgentType mo135174c() {
        return this.f94238c;
    }

    /* renamed from: d */
    public long mo135176d() {
        return this.f94239d;
    }

    /* renamed from: e */
    public String mo135177e() {
        return this.f94241f;
    }

    public String toString() {
        return "DingInfo{ackId='" + this.f94236a + '\'' + ", messageId='" + this.f94237b + '\'' + ", type=" + this.f94238c + ", sendTime=" + this.f94239d + ", ackChatterId='" + this.f94241f + '\'' + '}';
    }

    /* renamed from: a */
    public void mo135168a(long j) {
        this.f94239d = j;
    }

    /* renamed from: b */
    public void mo135173b(String str) {
        this.f94237b = str;
    }

    /* renamed from: c */
    public void mo135175c(String str) {
        this.f94241f = str;
    }

    /* renamed from: a */
    public void mo135169a(UrgentType urgentType) {
        this.f94238c = urgentType;
    }

    /* renamed from: a */
    public void mo135170a(DingStatus dingStatus) {
        this.f94240e = dingStatus;
    }

    /* renamed from: a */
    public void mo135171a(String str) {
        this.f94236a = str;
    }
}
