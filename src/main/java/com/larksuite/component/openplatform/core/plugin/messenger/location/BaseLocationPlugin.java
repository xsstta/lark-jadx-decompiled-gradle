package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.suite.R;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.util.C67029c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import java.util.HashSet;

public abstract class BaseLocationPlugin extends OPPlugin {
    public AbstractC25897h mInvokeCallback;
    public long startTime;

    /* access modifiers changed from: protected */
    public abstract void onSystemPermissionGranted(LKEvent lKEvent, AbstractC25905b bVar, AbstractC25895f fVar);

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mInvokeCallback = null;
    }

    /* access modifiers changed from: protected */
    public void openDialog(final Activity activity, final AbstractC25895f fVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin.RunnableC251831 */

            public void run() {
                Activity activity = activity;
                C13351i.m54345a(activity, "", activity.getString(R.string.lark_brand_location_need_open), activity.getString(R.string.microapp_m_brand_title_permission_cancel), activity.getString(R.string.lark_brand_open_location), new C13351i.AbstractC13357a() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin.RunnableC251831.C251841 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: a */
                    public void mo49040a(View view) {
                        fVar.mo92190b().mo92224i("locationPlugin", "To open button is clicked");
                        activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    }

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13357a
                    /* renamed from: b */
                    public void mo49041b(View view) {
                        fVar.mo92190b().mo92224i("locationPlugin", "I got it button is clicked");
                        if (AppbrandContext.getInst().isGame()) {
                            C67029c.m261245a(activity);
                        }
                    }
                });
            }
        });
    }

    /* access modifiers changed from: protected */
    public boolean checkGPSIsOpen(Context context, AbstractC25895f fVar) {
        boolean z;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            z = locationManager.isProviderEnabled("gps");
        } else {
            z = false;
        }
        fVar.mo92190b().mo92224i("locationPlugin", "gps state:", Boolean.valueOf(z));
        return z;
    }

    /* access modifiers changed from: protected */
    public void checkPermission(final LKEvent lKEvent, final AbstractC25905b bVar, final AbstractC25895f fVar) {
        final Activity f = getApiDependency().mo235051f();
        fVar.mo92190b().mo92224i("locationPlugin", "start request app permission");
        getApiDependency().mo235021a(f, lKEvent.mo92146m(), C66578b.C66579a.m260113b(getAppContext()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin.C251852 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                fVar.mo92190b().mo92224i("locationPlugin", "location permission is granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.ACCESS_FINE_LOCATION");
                BaseLocationPlugin.this.getApiDependency().mo235022a(f, "getLocation", hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.location.BaseLocationPlugin.C251852.C251861 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        fVar.mo92190b().mo92224i("locationPlugin", "system permission is granted. cost time:", Long.valueOf(System.currentTimeMillis() - BaseLocationPlugin.this.startTime));
                        BaseLocationPlugin.this.onSystemPermissionGranted(lKEvent, bVar, fVar);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        fVar.mo92190b().mo92223e("locationPlugin", "system permission is denied");
                        BaseLocationPlugin.this.mInvokeCallback.callback(BaseLocationPlugin.this.createFailedResponse(C25906a.f64075e, "system permission is denied"));
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                fVar.mo92190b().mo92223e("locationPlugin", "location permission is denied");
                BaseLocationPlugin.this.mInvokeCallback.callback(BaseLocationPlugin.this.createFailedResponse(C25906a.f64076f, "location permission is denied"));
            }
        });
    }
}
