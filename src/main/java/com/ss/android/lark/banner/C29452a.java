package com.ss.android.lark.banner;

import com.ss.android.lark.banner.controller.SimpleBannerController;
import com.ss.android.lark.banner.entity.p1395a.C29475c;
import com.ss.android.lark.banner.export.AbstractC29479b;
import com.ss.android.lark.banner.p1393d.AbstractC29471a;
import com.ss.android.lark.banner.p1398g.AbstractC29499a;

/* renamed from: com.ss.android.lark.banner.a */
public class C29452a {

    /* renamed from: a */
    private static volatile AbstractC29471a f73564a;

    /* renamed from: a */
    public static AbstractC29471a m108408a() {
        return f73564a;
    }

    public C29452a(AbstractC29471a aVar) {
        f73564a = aVar;
    }

    /* renamed from: a */
    public AbstractC29479b mo104319a(String str) {
        return new SimpleBannerController(str);
    }

    /* renamed from: b */
    public void mo104320b(String str) {
        AbstractC29499a.CC.m108592a().mo104455a(new C29475c(str));
    }
}
