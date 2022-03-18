package com.bytedance.ee.bear.middleground.docsdk;

import com.bytedance.ee.bear.middleground.docsdk.analytic.AnalyticConstant;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.a */
public class C9306a {

    /* renamed from: a */
    public static final C9306a f25027a = new C9306a("mail", AnalyticConstant.LinkScene.EMAIL.getScene(), AnalyticConstant.LinkLocation.EMAIL_BODY.getLocation());

    /* renamed from: b */
    public static final C9306a f25028b = new C9306a("mini_program", AnalyticConstant.LinkScene.GADGET.getScene(), AnalyticConstant.LinkLocation.OP_GADGET.getLocation());

    /* renamed from: c */
    public static final C9306a f25029c = new C9306a("calendar", AnalyticConstant.LinkScene.CALENDAR.getScene(), AnalyticConstant.LinkLocation.EVENT_DESCRIPTION.getLocation());

    /* renamed from: d */
    private String f25030d;

    /* renamed from: e */
    private String f25031e;

    /* renamed from: f */
    private String f25032f;

    /* renamed from: a */
    public String mo35526a() {
        return this.f25030d;
    }

    /* renamed from: b */
    public String mo35527b() {
        return this.f25031e;
    }

    /* renamed from: c */
    public String mo35528c() {
        return this.f25032f;
    }

    private C9306a(String str, String str2, String str3) {
        this.f25030d = str;
        this.f25031e = str2;
        this.f25032f = str3;
    }
}
