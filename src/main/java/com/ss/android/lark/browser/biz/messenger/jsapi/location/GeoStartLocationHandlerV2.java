package com.ss.android.lark.browser.biz.messenger.jsapi.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.openapi.jsapi.entity.GeoLocationStartParams;
import com.ss.android.lark.openapi.p2397a.C48758b;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40636c;

public class GeoStartLocationHandlerV2 extends AbstractInjectJSApiHandler<GeoLocationStartParams> implements Parcelable {
    public static final Parcelable.Creator<GeoStartLocationHandlerV2> CREATOR = new Parcelable.Creator<GeoStartLocationHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStartLocationHandlerV2.C298512 */

        /* renamed from: a */
        public GeoStartLocationHandlerV2[] newArray(int i) {
            return new GeoStartLocationHandlerV2[i];
        }

        /* renamed from: a */
        public GeoStartLocationHandlerV2 createFromParcel(Parcel parcel) {
            return new GeoStartLocationHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    C29853a f74575a;

    /* renamed from: b */
    IBrowserModuleDependency.ILocationDependency.AbstractC29882a f74576b;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public GeoStartLocationHandlerV2() {
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public boolean mo91862a() {
        C29853a aVar = this.f74575a;
        if (aVar != null) {
            aVar.mo107479a();
        }
        mo107467b();
        return true;
    }

    /* renamed from: b */
    public void mo107467b() {
        C29853a aVar;
        if (this.f74576b != null && (aVar = this.f74575a) != null) {
            aVar.mo107482b().mo107638b(this.f74576b);
        }
    }

    /* renamed from: c */
    public void mo107468c() {
        new OPMonitor("mp_old_start_location_sum", C40636c.f103068e).reportPlatform(2).flush();
    }

    protected GeoStartLocationHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        if (mo91995c("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API") == null) {
            C29853a aVar = new C29853a(mo91997u());
            this.f74575a = aVar;
            mo91992a("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API", aVar);
        } else {
            this.f74575a = (C29853a) mo91995c("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API");
        }
        this.f74575a.mo107480a(this);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m110352a(AbstractC25832c cVar, IBrowserModuleDependency.ILocationDependency.LarkLocation larkLocation) {
        C29853a aVar = this.f74575a;
        if (aVar != null && !aVar.mo107486f()) {
            cVar.mo91902a(C48758b.m192085a(C29854b.m110378a(this.f74575a.mo107483c(), larkLocation)));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = r3.f74575a.mo107482b();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo91861a(final com.ss.android.lark.openapi.jsapi.entity.GeoLocationStartParams r4, final com.larksuite.component.webview.container.dto.AbstractC25832c r5) {
        /*
            r3 = this;
            com.ss.android.lark.browser.dependency.IBrowserModuleDependency r0 = com.ss.android.lark.browser.C29638a.m109622a()
            java.lang.String r1 = "gadget.web.browser.updatelocation.open"
            boolean r0 = r0.isFeatureGatingEnable(r1)
            if (r0 == 0) goto L_0x0014
            java.lang.String r4 = "GeoStartLocationHandlerV2"
            java.lang.String r5 = "geo start Location is close"
            com.bytedance.common.utility.Logger.m15173i(r4, r5)
            return
        L_0x0014:
            com.ss.android.lark.browser.biz.messenger.jsapi.location.a r0 = r3.f74575a
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.mo107486f()
            if (r0 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            com.ss.android.lark.browser.biz.messenger.jsapi.location.a r0 = r3.f74575a
            com.ss.android.lark.browser.dependency.IBrowserModuleDependency$ILocationDependency r0 = r0.mo107482b()
            if (r0 != 0) goto L_0x0028
            return
        L_0x0028:
            com.ss.android.lark.browser.biz.messenger.jsapi.location.a r1 = r3.f74575a
            boolean r1 = r1.mo107484d()
            if (r1 == 0) goto L_0x0034
            r3.mo107465a(r0, r4, r5)
            goto L_0x003e
        L_0x0034:
            com.ss.android.lark.browser.biz.messenger.jsapi.location.a r1 = r3.f74575a
            com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStartLocationHandlerV2$1 r2 = new com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStartLocationHandlerV2$1
            r2.<init>(r0, r4, r5)
            r1.mo107481a(r2)
        L_0x003e:
            r3.mo107468c()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoStartLocationHandlerV2.mo91861a(com.ss.android.lark.openapi.jsapi.entity.GeoLocationStartParams, com.larksuite.component.webview.container.dto.c):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo107465a(IBrowserModuleDependency.ILocationDependency iLocationDependency, GeoLocationStartParams geoLocationStartParams, AbstractC25832c cVar) {
        if (this.f74576b != null) {
            mo107467b();
        }
        $$Lambda$GeoStartLocationHandlerV2$rJ3sTDMCP2b3i_tfmoOrsY_304 r0 = new IBrowserModuleDependency.ILocationDependency.AbstractC29882a(cVar) {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.location.$$Lambda$GeoStartLocationHandlerV2$rJ3sTDMCP2b3i_tfmoOrsY_304 */
            public final /* synthetic */ AbstractC25832c f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.ILocationDependency.AbstractC29882a
            public final void onLocationChange(IBrowserModuleDependency.ILocationDependency.LarkLocation larkLocation) {
                GeoStartLocationHandlerV2.m270294lambda$rJ3sTDMCP2b3i_tfmoOrsY_304(GeoStartLocationHandlerV2.this, this.f$1, larkLocation);
            }
        };
        this.f74576b = r0;
        iLocationDependency.mo107637a(r0, (int) geoLocationStartParams.getInterval());
    }
}
