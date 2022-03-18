package com.larksuite.component.dybrid.h5core.p1073b;

import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.api.AbstractC24161d;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.AbstractC24171m;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.ss.android.lark.jsbridge.AbstractC40669e;
import com.ss.android.lark.openapi.jsapi.AbstractC48759a;
import com.ss.android.lark.util.share_preference.C57744a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.b.a */
public class C24189a {

    /* renamed from: a */
    private static C24189a f59792a = new C24189a();

    /* renamed from: b */
    private List<H5PluginConfig> f59793b = Collections.synchronizedList(new ArrayList());

    private C24189a() {
    }

    /* renamed from: a */
    public static C24189a m88341a() {
        C24174b.m88296a("H5PluginConfigManager", "service:" + f59792a);
        return f59792a;
    }

    /* renamed from: com.larksuite.component.dybrid.h5core.b.a$a */
    private static abstract class AbstractC24192a<T> extends AbstractC48759a<T> {

        /* renamed from: c */
        AbstractC24168k f59799c;

        AbstractC24192a(AbstractC24168k kVar) {
            this.f59799c = kVar;
        }
    }

    /* renamed from: a */
    public Map<String, AbstractC48759a<String>> mo86796a(AbstractC24168k kVar) {
        if (!C57744a.m224104a().contains("extraEventNamesSpKey")) {
            return null;
        }
        String string = C57744a.m224104a().getString("extraEventNamesSpKey");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : Arrays.asList(string.split("\\|"))) {
            final String trim = str.trim();
            if (!TextUtils.isEmpty(trim)) {
                C24174b.m88296a("H5PluginConfigManager", "create JSHandler eventName:" + trim);
                hashMap.put(trim, new AbstractC24192a<String>(kVar) {
                    /* class com.larksuite.component.dybrid.h5core.p1073b.C24189a.C241901 */

                    /* renamed from: a */
                    public void mo86799a(final String str, final AbstractC40669e eVar) {
                        C24174b.m88296a("H5PluginConfigManager", "H5 call event:" + trim + " data:" + str);
                        if (this.f59799c != null) {
                            try {
                                C24174b.m88296a("H5PluginConfigManager", "h5Page send event:" + trim);
                                this.f59799c.mo86737a(trim, new JSONObject(str), new AbstractC24161d() {
                                    /* class com.larksuite.component.dybrid.h5core.p1073b.C24189a.C241901.C241911 */

                                    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24161d
                                    /* renamed from: a */
                                    public void mo86730a(JSONObject jSONObject) {
                                        if (jSONObject != null) {
                                            C24174b.m88296a("H5PluginConfigManager", "eventName:" + trim + " data:" + str + " callback:" + jSONObject.toString());
                                            JSONObject a = C24246a.m88562a(jSONObject, "eventData", new JSONObject());
                                            AbstractC40669e eVar = eVar;
                                            if (eVar != null) {
                                                eVar.mo107242a(a.toString());
                                            }
                                        }
                                    }
                                });
                            } catch (JSONException e) {
                                C24174b.m88297a("H5PluginConfigManager", "JSONException", e);
                            }
                        }
                    }
                });
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public synchronized void mo86797a(H5PluginConfig h5PluginConfig) {
        if (h5PluginConfig != null) {
            if (!h5PluginConfig.mo86721a()) {
                C24174b.m88296a("H5PluginConfigManager", "addConfig /" + h5PluginConfig.f59746b + "/" + h5PluginConfig.f59747c.toString());
                f59792a.f59793b.add(h5PluginConfig);
                mo86798a(h5PluginConfig.f59747c);
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo86798a(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                StringBuilder sb = null;
                if (C57744a.m224104a().contains("extraEventNamesSpKey")) {
                    String string = C57744a.m224104a().getString("extraEventNamesSpKey");
                    if (!TextUtils.isEmpty(string)) {
                        sb = new StringBuilder(string);
                    }
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                C24174b.m88296a("H5PluginConfigManager", "events :" + sb.toString());
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                for (String str : list) {
                    atomicBoolean.compareAndSet(false, m88342a(str, sb));
                }
                if (atomicBoolean.get()) {
                    C24174b.m88296a("H5PluginConfigManager", "update Sp");
                    C57744a.m224104a().putString("extraEventNamesSpKey", sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m88342a(String str, StringBuilder sb) {
        String trim = sb.toString().trim();
        if (trim.contains(str + "|")) {
            C24174b.m88296a("H5PluginConfigManager", "已经存在该 event，不允许重复添加. Event Name:" + str);
            return false;
        }
        C24174b.m88296a("H5PluginConfigManager", "updateEventNameSp eventName:" + str);
        sb.append(str);
        sb.append("|");
        return true;
    }

    /* renamed from: a */
    public AbstractC24169l mo86795a(H5PluginConfig.Scope scope, AbstractC24171m mVar) {
        List<H5PluginConfig> list = f59792a.f59793b;
        if (list == null || list.isEmpty() || mVar == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (H5PluginConfig h5PluginConfig : f59792a.f59793b) {
            if (scope.equals(h5PluginConfig.f59748d)) {
                arrayList.add(h5PluginConfig);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C24193b bVar = new C24193b(arrayList, mVar);
        C24174b.m88296a("H5PluginConfigManager", "createPlugin " + scope + " elapse " + (System.currentTimeMillis() - currentTimeMillis));
        return bVar;
    }
}
