package com.ss.android.vc.meeting.framework.meeting;

import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.w */
public class C61330w {

    /* renamed from: a */
    private String f153669a;

    /* renamed from: b */
    private String f153670b;

    /* renamed from: c */
    private String f153671c;

    /* renamed from: d */
    private String f153672d;

    /* renamed from: e */
    private String f153673e;

    /* renamed from: f */
    private String f153674f;

    /* renamed from: g */
    private String f153675g;

    /* renamed from: h */
    private String f153676h;

    /* renamed from: i */
    private String f153677i;

    /* renamed from: j */
    private String f153678j;

    /* renamed from: k */
    private final String f153679k;

    /* renamed from: l */
    private final String f153680l;

    /* renamed from: m */
    private final String f153681m;

    /* renamed from: n */
    private String f153682n;

    public C61330w() {
        this.f153669a = "";
        this.f153670b = "";
        this.f153671c = "sequenceDiagram";
        this.f153672d = "";
        this.f153673e = "";
        this.f153674f = "";
        this.f153675g = "";
        this.f153676h = "";
        this.f153677i = "";
        this.f153678j = "";
        this.f153679k = "Title: ";
        this.f153680l = "Note over DATA : ";
        this.f153681m = "participant ";
        this.f153682n = "";
        this.f153678j = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date());
    }

    /* renamed from: a */
    public C61330w mo212274a(String str, String str2) {
        this.f153672d += "Note over " + str + " : " + str2 + "\n";
        return this;
    }
}
