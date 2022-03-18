package com.bytedance.ee.bear.list.route;

import android.content.Context;
import com.bytedance.ee.bear.contract.offline.route.parcelable.FolderRouteBean;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.route.RouteBean;

/* renamed from: com.bytedance.ee.bear.list.route.c */
public class C8696c implements AbstractC8705e {

    /* renamed from: a */
    private final Context f23520a;

    /* renamed from: b */
    private final String f23521b;

    /* renamed from: c */
    private final int f23522c;

    /* renamed from: d */
    private final String f23523d;

    @Override // com.bytedance.ee.bear.list.route.AbstractC8705e
    /* renamed from: a */
    public RouteBean mo33720a(Document document) {
        FolderRouteBean folderRouteBean = new FolderRouteBean();
        folderRouteBean.mo20908b(document.mo32399O());
        folderRouteBean.mo20912c(this.f23523d);
        folderRouteBean.mo20904a(this.f23521b);
        folderRouteBean.mo20903a(this.f23522c);
        folderRouteBean.mo20907b(document.mo32398N());
        folderRouteBean.mo20911c(document.mo32397M());
        folderRouteBean.mo40615d(C8292f.m34193g(this.f23520a, document));
        folderRouteBean.mo20905a(document.mo32400P());
        folderRouteBean.mo20914d(document.an());
        folderRouteBean.mo20909b(FolderVersion.isPersonalFolder(document.an(), document.ap()));
        return folderRouteBean;
    }

    public C8696c(Context context, String str, int i, String str2) {
        this.f23520a = context;
        this.f23521b = str;
        this.f23522c = i;
        this.f23523d = str2;
    }
}
