package com.ss.android.lark.browser.biz.messenger.jsapi.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.openapi.jsapi.entity.GeoLocationGetParams;
import com.ss.android.lark.openapi.p2397a.C48758b;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40636c;

public class GeoOnceLocationHandlerV2 extends AbstractInjectJSApiHandler<GeoLocationGetParams> implements Parcelable {
    public static final Parcelable.Creator<GeoOnceLocationHandlerV2> CREATOR = new Parcelable.Creator<GeoOnceLocationHandlerV2>() {
        /* class com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoOnceLocationHandlerV2.C298492 */

        /* renamed from: a */
        public GeoOnceLocationHandlerV2[] newArray(int i) {
            return new GeoOnceLocationHandlerV2[i];
        }

        /* renamed from: a */
        public GeoOnceLocationHandlerV2 createFromParcel(Parcel parcel) {
            return new GeoOnceLocationHandlerV2(parcel);
        }
    };

    /* renamed from: a */
    C29853a f74571a;

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    public GeoOnceLocationHandlerV2() {
    }

    /* renamed from: b */
    public void mo107459b() {
        new OPMonitor("mp_old_once_location_sum", C40636c.f103067d).reportPlatform(2).flush();
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public boolean mo91862a() {
        C29853a aVar = this.f74571a;
        if (aVar == null) {
            return true;
        }
        aVar.mo107479a();
        return true;
    }

    protected GeoOnceLocationHandlerV2(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
        if (mo91995c("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API") == null) {
            C29853a aVar = new C29853a(mo91997u());
            this.f74571a = aVar;
            mo91992a("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API", aVar);
            return;
        }
        this.f74571a = (C29853a) mo91995c("GEO_LOCATION_HANDLER_V2_GEO_LOCATION_API");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo107457a(AbstractC25832c cVar, IBrowserModuleDependency.ILocationDependency iLocationDependency) {
        iLocationDependency.mo107636a(new IBrowserModuleDependency.ILocationDependency.AbstractC29882a(cVar) {
            /* class com.ss.android.lark.browser.biz.messenger.jsapi.location.$$Lambda$GeoOnceLocationHandlerV2$346r11SAHY0YMTznQe5TIjzCxs */
            public final /* synthetic */ AbstractC25832c f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.browser.dependency.IBrowserModuleDependency.ILocationDependency.AbstractC29882a
            public final void onLocationChange(IBrowserModuleDependency.ILocationDependency.LarkLocation larkLocation) {
                GeoOnceLocationHandlerV2.m270293lambda$346r11SAHY0YMTznQe5TIjzCxs(GeoOnceLocationHandlerV2.this, this.f$1, larkLocation);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m110343a(AbstractC25832c cVar, IBrowserModuleDependency.ILocationDependency.LarkLocation larkLocation) {
        C29853a aVar = this.f74571a;
        if (aVar != null && !aVar.mo107486f()) {
            cVar.mo91902a(C48758b.m192085a(C29854b.m110378a(this.f74571a.mo107483c(), larkLocation)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(GeoLocationGetParams geoLocationGetParams, final AbstractC25832c cVar) {
        if (C29638a.m109622a().isFeatureGatingEnable("gadget.web.browser.oncelocation.open")) {
            Logger.m15173i("GeoOnceLocationHandlerV2", "geo Once Location is close");
            return;
        }
        C29853a aVar = this.f74571a;
        if (aVar != null && !aVar.mo107486f()) {
            final IBrowserModuleDependency.ILocationDependency b = this.f74571a.mo107482b();
            if (this.f74571a.mo107484d()) {
                mo107457a(cVar, b);
            } else {
                this.f74571a.mo107481a(new Runnable() {
                    /* class com.ss.android.lark.browser.biz.messenger.jsapi.location.GeoOnceLocationHandlerV2.RunnableC298481 */

                    public void run() {
                        GeoOnceLocationHandlerV2.this.mo107457a(cVar, b);
                    }
                });
            }
            mo107459b();
        }
    }
}
