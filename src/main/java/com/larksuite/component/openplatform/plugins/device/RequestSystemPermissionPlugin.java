package com.larksuite.component.openplatform.plugins.device;

import android.app.Activity;
import android.content.Context;
import com.larksuite.component.openplatform.plugins.utils.C25613c;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.SystemPermission;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.ss.android.lark.permission.C51325d;
import com.ss.android.lark.permission.C51327f;
import com.ss.android.lark.permission.rxPermission.C51331a;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

public class RequestSystemPermissionPlugin extends AbstractC25889a {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"requestSystemPermission"})
    public void requestSystemPermission(SystemPermission.Request request, final AbstractC25897h<SystemPermission.Response> hVar, AbstractC25905b bVar) {
        final SystemPermission.Response response = new SystemPermission.Response();
        final Context a = bVar.mo92207a();
        if (!(a instanceof Activity)) {
            response.mErrorMessage = "context is not activity";
            hVar.callback(response);
        } else if (request == null || request.mPermissions == null || request.mPermissions.isEmpty()) {
            response.mErrorMessage = "invalid params.";
            hVar.callback(response);
        } else {
            final ArrayList arrayList = new ArrayList();
            boolean isForceUiThread = request.isForceUiThread();
            for (String str : request.mPermissions) {
                if (isForceUiThread) {
                    arrayList.add(str);
                } else if (C51327f.m199081a(a, str)) {
                    response.mGrantedPermissions.add(str);
                } else {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                hVar.callback(response);
            } else {
                C25613c.m91382a(new Runnable() {
                    /* class com.larksuite.component.openplatform.plugins.device.RequestSystemPermissionPlugin.RunnableC255781 */

                    public void run() {
                        new C51331a((Activity) a).mo176925d((String[]) arrayList.toArray(new String[0])).subscribe(new Consumer<C51325d>() {
                            /* class com.larksuite.component.openplatform.plugins.device.RequestSystemPermissionPlugin.RunnableC255781.C255791 */

                            /* renamed from: a */
                            public void accept(C51325d dVar) {
                                arrayList.remove(dVar.f127817a);
                                if (dVar.f127818b) {
                                    response.mGrantedPermissions.add(dVar.f127817a);
                                } else {
                                    response.mDeniedPermissions.add(dVar.f127817a);
                                }
                                if (arrayList.isEmpty()) {
                                    hVar.callback(response);
                                }
                            }
                        });
                    }
                });
            }
        }
    }
}
