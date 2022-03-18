package com.ss.android.lark.monitor.traffic;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TrafficReportData {

    /* renamed from: a */
    public String f121496a;

    /* renamed from: b */
    public String f121497b;

    /* renamed from: c */
    public String f121498c;

    /* renamed from: d */
    public long f121499d;

    /* renamed from: e */
    public long f121500e;

    /* renamed from: f */
    public String f121501f;

    /* renamed from: g */
    public String f121502g;

    /* renamed from: h */
    public int f121503h;

    /* renamed from: i */
    public int f121504i;

    /* renamed from: j */
    public double f121505j;

    /* renamed from: k */
    public double f121506k;

    /* renamed from: l */
    public double f121507l;

    /* renamed from: m */
    public double f121508m;

    /* renamed from: n */
    public int f121509n;

    /* renamed from: o */
    public double f121510o;

    /* renamed from: p */
    public double f121511p;

    /* renamed from: q */
    public int f121512q;

    /* renamed from: r */
    public String f121513r;

    /* renamed from: s */
    public int f121514s;

    /* renamed from: t */
    public String f121515t;

    /* renamed from: u */
    public int f121516u;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ApplicationStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Platform {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public String toString() {
        return "TrafficReportData{startMonitorSecond=" + this.f121499d + ", endMonitorSecond=" + this.f121500e + ", mobileKBTx=" + this.f121507l + ", mobileKBRx=" + this.f121508m + ", wifiKBTx=" + this.f121505j + ", wifiKBRx=" + this.f121506k + ", deviceId=" + this.f121501f + ", uId=" + this.f121502g + ", type=" + this.f121503h + ", platform=" + this.f121504i + ", appVersion=" + this.f121496a + ", deviceModel=" + this.f121497b + ", osVersion=" + this.f121498c + ", networkType=" + this.f121509n + ", tx=" + this.f121510o + ", rx=" + this.f121511p + ", sourceType=" + this.f121512q + ", requestUrl=" + this.f121513r + ", responseCode=" + this.f121514s + ", processName=" + this.f121515t + ", applicationStatus=" + this.f121516u + '}';
    }
}
