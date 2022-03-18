package com.larksuite.component.dybrid.h5core.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.dybrid.h5api.api.AbstractC24163f;
import com.larksuite.component.dybrid.h5api.api.AbstractC24167j;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26320t;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: com.larksuite.component.dybrid.h5core.core.b */
public class C24201b {
    /* renamed from: a */
    public boolean mo86828a(final H5Event h5Event) {
        if (!m88397c(h5Event)) {
            return false;
        }
        C24246a.m88563a((Runnable) new Runnable() {
            /* class com.larksuite.component.dybrid.h5core.core.C24201b.RunnableC242021 */

            public void run() {
                C24201b.this.mo86829b(h5Event);
            }
        });
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r3 == null) goto L_0x0026;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m88397c(com.larksuite.component.dybrid.h5api.api.H5Event r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.String r1 = "H5EventDispatcher"
            if (r5 != 0) goto L_0x000b
            java.lang.String r5 = "invalid message body!"
            com.larksuite.component.dybrid.h5api.p1071b.C24174b.m88299b(r1, r5)
            return r0
        L_0x000b:
            com.larksuite.component.dybrid.h5api.api.f r2 = r5.mo86711e()
            if (r2 != 0) goto L_0x0026
            com.larksuite.component.dybrid.h5core.core.impl.e r3 = com.larksuite.component.dybrid.h5core.core.impl.C24210e.m88437g()
            if (r3 != 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            com.larksuite.component.dybrid.h5api.api.n r2 = r3.mo86827f()
            if (r2 != 0) goto L_0x0020
        L_0x001e:
            r2 = r3
            goto L_0x0026
        L_0x0020:
            com.larksuite.component.dybrid.h5api.api.k r3 = r2.mo86768g()
            if (r3 != 0) goto L_0x001e
        L_0x0026:
            if (r2 != 0) goto L_0x002e
            java.lang.String r5 = "invalid message target!"
            com.larksuite.component.dybrid.h5api.p1071b.C24174b.m88299b(r1, r5)
            return r0
        L_0x002e:
            r5.mo86703a(r2)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.dybrid.h5core.core.C24201b.m88397c(com.larksuite.component.dybrid.h5api.api.H5Event):boolean");
    }

    /* renamed from: b */
    public boolean mo86829b(H5Event h5Event) {
        String b = h5Event.mo86707b();
        if (TextUtils.isEmpty(b)) {
            C24174b.m88299b("H5EventDispatcher", "invalid action name");
            h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC24163f e = h5Event.mo86711e(); e != null; e = e.mo86732a()) {
            arrayList.add(e);
        }
        if (arrayList.isEmpty()) {
            C24174b.m88299b("H5EventDispatcher", "no intent target!");
            h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
            return false;
        }
        C24174b.m88296a("H5EventDispatcher", "routing intent " + b);
        int size = arrayList.size();
        for (int i = size + -1; i >= 0; i--) {
            AbstractC24167j jVar = (AbstractC24167j) arrayList.get(i);
            if (h5Event.mo86713g()) {
                C24174b.m88296a("H5EventDispatcher", "intent been canceld on intercept!");
                return false;
            }
            try {
                if (jVar.mo86747a(h5Event)) {
                    return true;
                }
            } catch (JSONException e2) {
                C24174b.m88297a("H5EventDispatcher", jVar.toString() + ApiHandler.API_CALLBACK_EXCEPTION, e2);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (h5Event.mo86713g()) {
                C24174b.m88296a("H5EventDispatcher", "intent been canceled on handle!");
                return false;
            }
            AbstractC24167j jVar2 = (AbstractC24167j) arrayList.get(i2);
            try {
                if (jVar2.mo86748b(h5Event)) {
                    return true;
                }
            } catch (JSONException e3) {
                C24174b.m88297a("H5EventDispatcher", jVar2.toString() + ApiHandler.API_CALLBACK_EXCEPTION, e3);
            }
        }
        C24174b.m88296a("H5EventDispatcher", "[" + b + "] handled by nobody in mainProcess:" + C26252ad.m94993b(h5Event.mo86712f()));
        if (!C26252ad.m94993b(h5Event.mo86712f())) {
            C24174b.m88296a("H5EventDispatcher", "Send action:" + b + " to main process!");
            AbstractC24163f e4 = h5Event.mo86711e();
            if (e4 instanceof AbstractC24168k) {
                AbstractC24168k kVar = (AbstractC24168k) e4;
                Bundle bundle = new Bundle();
                bundle.putInt("nodeId", e4.mo86738b());
                bundle.putString("eventName", h5Event.mo86707b());
                bundle.putString("eventId", h5Event.mo86709c());
                if (h5Event.mo86710d() != null) {
                    return m88395a(h5Event, b, e4, kVar, bundle);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m88396a(String str, AbstractC24163f fVar, AbstractC24168k kVar, Bundle bundle) {
        Message obtain = Message.obtain((Handler) null, (int) LocationRequest.PRIORITY_HD_ACCURACY);
        obtain.replyTo = kVar.mo86752e();
        obtain.setData(bundle);
        try {
            C24174b.m88296a("H5EventDispatcher", "nodeID" + fVar.mo86738b());
            if (kVar.mo86753f() == null) {
                C24174b.m88296a("H5EventDispatcher", "[" + str + "] handled by nobody because messenger is null");
                return true;
            }
            kVar.mo86753f().send(obtain);
            return true;
        } catch (RemoteException e) {
            C24174b.m88297a("H5EventDispatcher", "dispatch event exception:", e);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m88395a(H5Event h5Event, String str, AbstractC24163f fVar, AbstractC24168k kVar, Bundle bundle) {
        String jSONObject = h5Event.mo86710d().toString();
        if (jSONObject.length() > 131072) {
            int length = jSONObject.length() / 131072;
            bundle.putString("ipcParamsMd5", C26320t.m95318a(jSONObject));
            bundle.putInt("ipcParamsSegmentTotal", length);
            for (int i = 0; i < length; i++) {
                bundle.putInt("ipcParamsSegmentIndex", i);
                int i2 = i * 131072;
                bundle.putString("ipcParams", jSONObject.substring(i2, i2 + 131072));
                if (!m88396a(str, fVar, kVar, bundle)) {
                    return false;
                }
            }
            bundle.putInt("ipcParamsSegmentIndex", length);
            bundle.putString("ipcParams", jSONObject.substring(length * 131072));
            return !m88396a(str, fVar, kVar, bundle);
        }
        bundle.putInt("ipcParamsSegmentTotal", 0);
        bundle.putString("ipcParams", jSONObject);
        return !m88396a(str, fVar, kVar, bundle);
    }
}
