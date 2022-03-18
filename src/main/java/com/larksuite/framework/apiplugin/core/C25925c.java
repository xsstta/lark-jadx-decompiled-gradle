package com.larksuite.framework.apiplugin.core;

import android.text.TextUtils;
import com.larksuite.framework.apiplugin.AbstractC25915c;
import com.larksuite.framework.apiplugin.AbstractC25932d;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25892c;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25900k;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1177c.C25918b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.framework.apiplugin.core.c */
public class C25925c {

    /* renamed from: a */
    private AbstractC25892c f64223a;

    /* renamed from: b */
    private AbstractC25915c f64224b;

    /* renamed from: a */
    public void mo92247a(AbstractC25892c cVar) {
        this.f64223a = cVar;
    }

    /* renamed from: a */
    public void mo92248a(AbstractC25915c cVar) {
        this.f64224b = cVar;
    }

    /* renamed from: a */
    public ILogger mo92246a(LKEvent lKEvent) {
        if (lKEvent != null) {
            return lKEvent.mo92134c().mo92190b();
        }
        return new C25918b.C25919a(OPTraceService.m192757a().subTrace());
    }

    /* renamed from: d */
    private boolean m93870d(LKEvent lKEvent) {
        if (lKEvent == null) {
            Log.m165383e("LKEventDispatcher", "event is null");
            return false;
        } else if (lKEvent.mo92151r() != null) {
            return true;
        } else {
            mo92246a(lKEvent).mo92224i("LKEventDispatcher", "source node is null");
            return false;
        }
    }

    /* renamed from: b */
    public LKBasePluginResult mo92249b(final LKEvent lKEvent) {
        if (!m93870d(lKEvent)) {
            mo92246a(lKEvent).mo92224i("LKEventDispatcher", "invalid event.");
            return LKBasePluginResult.f64237b;
        }
        AbstractC25915c cVar = this.f64224b;
        if (cVar == null || !cVar.mo87198a(lKEvent, new AbstractC25932d() {
            /* class com.larksuite.framework.apiplugin.core.C25925c.C259261 */

            @Override // com.larksuite.framework.apiplugin.AbstractC25932d
            /* renamed from: a */
            public void mo92251a() {
                ILogger a = C25925c.this.mo92246a(lKEvent);
                a.mo92224i("LKEventDispatcher", "event:" + lKEvent.mo92146m() + " onGranted");
                C25925c.this.mo92250c(lKEvent);
            }

            @Override // com.larksuite.framework.apiplugin.AbstractC25932d
            /* renamed from: a */
            public void mo92252a(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, C25906a.f64076f.f64117J);
                    jSONObject.put("denyPermission", str);
                    lKEvent.mo92116a(C25906a.f64076f.f64115H, jSONObject);
                } catch (JSONException e) {
                    C25925c.this.mo92246a(lKEvent).mo92223e("LKEventDispatcher", "JSONException", e);
                }
                ILogger a = C25925c.this.mo92246a(lKEvent);
                a.mo92224i("LKEventDispatcher", "event:" + lKEvent.mo92146m() + " on denied permission:" + str);
            }
        })) {
            return mo92250c(lKEvent);
        }
        ILogger a = mo92246a(lKEvent);
        a.mo92224i("LKEventDispatcher", "event:" + lKEvent.mo92146m() + " need checkPermission");
        return LKBasePluginResult.f64238c;
    }

    /* renamed from: c */
    public LKBasePluginResult mo92250c(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        if (TextUtils.isEmpty(m)) {
            mo92246a(lKEvent).mo92223e("LKEventDispatcher", "eventName is empty!");
            return LKBasePluginResult.f64237b;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC25891b r = lKEvent.mo92151r(); r != null; r = r.mo92182t()) {
            arrayList.add(r);
        }
        if (arrayList.isEmpty()) {
            mo92246a(lKEvent).mo92223e("LKEventDispatcher", "target list is empty!");
            return LKBasePluginResult.f64237b;
        }
        int size = arrayList.size();
        ILogger a = mo92246a(lKEvent);
        a.mo92224i("LKEventDispatcher", "event: " + m + " targetList size:" + size);
        for (int i = size + -1; i >= 0; i--) {
            AbstractC25900k kVar = (AbstractC25900k) arrayList.get(i);
            try {
                LKPluginInterceptResult a2 = kVar.mo87280a(lKEvent);
                if (a2.mo92284f()) {
                    a.mo92224i("LKEventDispatcher", "intercept:" + kVar.getClass().getName());
                    return a2;
                }
            } catch (Exception e) {
                a.mo92224i("LKEventDispatcher", "dispatch intercept exception", e);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC25900k kVar2 = (AbstractC25900k) arrayList.get(i2);
            try {
                LKPluginHandleResult handleEvent = kVar2.handleEvent(lKEvent);
                if (handleEvent.mo92281f()) {
                    a.mo92224i("LKEventDispatcher", "success handle:" + kVar2.getClass().getName());
                    return handleEvent;
                }
            } catch (Exception e2) {
                a.mo92223e("LKEventDispatcher", "dispatch handle exception", e2);
            }
        }
        if (this.f64223a != null) {
            a.mo92224i("LKEventDispatcher", "event:" + m + " call custom event dispatcher.");
            return this.f64223a.dispatchEvent(lKEvent);
        }
        a.mo92224i("LKEventDispatcher", "[" + m + "] handled by nobody");
        return LKBasePluginResult.f64237b;
    }
}
