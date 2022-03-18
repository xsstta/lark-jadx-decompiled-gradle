package com.bytedance.ee.bear.list.route;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.contract.route.parcelable.DriveRouteBean;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.RouteBean;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.route.b */
public class C8695b implements AbstractC8705e {

    /* renamed from: a */
    private final Context f23514a;

    /* renamed from: b */
    private final List<Document> f23515b;

    /* renamed from: c */
    private final String f23516c;

    /* renamed from: d */
    private final String f23517d;

    /* renamed from: e */
    private final String f23518e;

    /* renamed from: f */
    private final String f23519f;

    @Override // com.bytedance.ee.bear.list.route.AbstractC8705e
    /* renamed from: a */
    public RouteBean mo33720a(Document document) {
        DriveRouteBean driveRouteBean = new DriveRouteBean();
        driveRouteBean.mo20997a(this.f23515b);
        driveRouteBean.mo40615d(C8292f.m34193g(this.f23514a, document));
        Bundle bundle = new Bundle();
        bundle.putString("module", this.f23516c);
        bundle.putString("sub_module", this.f23517d);
        bundle.putString("src_module", this.f23518e);
        bundle.putString("parent_token", this.f23519f);
        driveRouteBean.mo40613b(bundle);
        return driveRouteBean;
    }

    C8695b(Context context, List<Document> list, String str, String str2, String str3, String str4) {
        this.f23514a = context;
        this.f23515b = list;
        this.f23516c = str;
        this.f23517d = str2;
        this.f23518e = str3;
        this.f23519f = str4;
    }
}
