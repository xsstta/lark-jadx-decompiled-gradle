package com.ss.android.lark.banner.controller;

import com.ss.android.lark.banner.p1394e.C29472a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/banner/controller/SimpleBannerController;", "Lcom/ss/android/lark/banner/controller/BaseBannerController;", "scene", "", "(Ljava/lang/String;)V", "getScene", "()Ljava/lang/String;", "getBannerScene", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.c.b */
public final class SimpleBannerController extends AbstractC29467a {

    /* renamed from: c */
    private final String f73603c;

    @Override // com.ss.android.lark.banner.export.AbstractC29482c, com.ss.android.lark.banner.p1392c.AbstractC29467a
    /* renamed from: b */
    public String mo104354b() {
        return this.f73603c;
    }

    public SimpleBannerController(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scene");
        this.f73603c = str;
        mo104349a("DYNAMIC", new C29472a());
    }
}
