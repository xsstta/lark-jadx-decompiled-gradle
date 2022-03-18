package com.bytedance.bdturing.p207c;

import android.text.TextUtils;
import com.bytedance.bdturing.AbstractC3526b;
import com.bytedance.bdturing.C3520a;
import com.bytedance.bdturing.C3555i;
import com.bytedance.bdturing.C3567l;
import com.bytedance.bdturing.EventReport;
import com.bytedance.bdturing.LogUtil;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c.e */
public class C3537e implements AbstractC3528a {
    /* renamed from: a */
    public void mo14319a() {
    }

    /* renamed from: a */
    public void mo14320a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo14247a(int i, String str, String str2, String str3, String str4) {
    }

    /* renamed from: a */
    public void mo14248a(C3534c cVar) {
    }

    /* renamed from: a */
    public void mo14249a(String str, AbstractC3526b bVar) {
    }

    /* renamed from: b */
    public void mo14322b() {
    }

    /* renamed from: c */
    private void m14883c(final C3534c cVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(cVar.f11163c);
            final String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("method");
            JSONObject optJSONObject = jSONObject.optJSONObject(SearchIntents.EXTRA_QUERY);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            final String str2 = null;
            if (optJSONObject != null) {
                StringBuilder sb = new StringBuilder(string);
                sb.append("?");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (optJSONObject.get(next) != null) {
                        str = optJSONObject.get(next).toString();
                    } else {
                        str = null;
                    }
                    sb.append(ContainerUtils.FIELD_DELIMITER + next + ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(str);
                }
                string = sb.toString();
            }
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.toString().replaceAll("\\\\/", "/");
            }
            if (LogUtil.m14896a()) {
                LogUtil.m14899d("CallNativeRequest", string);
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json; charset=utf-8");
            if (string2.equals("post")) {
                C3567l.m15030a().mo14386a(new Runnable() {
                    /* class com.bytedance.bdturing.p207c.C3537e.RunnableC35392 */

                    public void run() {
                        C3537e.this.mo14321a(cVar, new String(C3520a.m14831a().mo14275c().mo14231t().post(string, hashMap, str2.getBytes()), Charsets.f173341a));
                    }
                });
            } else {
                C3567l.m15030a().mo14386a(new Runnable() {
                    /* class com.bytedance.bdturing.p207c.C3537e.RunnableC35403 */

                    public void run() {
                        C3537e.this.mo14321a(cVar, new String(C3520a.m14831a().mo14275c().mo14231t().get(string, hashMap), Charsets.f173341a));
                    }
                });
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.bdturing.p207c.AbstractC3528a
    /* renamed from: b */
    public void mo14302b(final C3534c cVar) {
        String str;
        try {
            String str2 = cVar.f11162b;
            char c = 65535;
            switch (str2.hashCode()) {
                case -1759249244:
                    if (str2.equals("bytedcert.verifyResult")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1628743486:
                    if (str2.equals("bytedcert.h5_state_changed")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1563440329:
                    if (str2.equals("bytedcert.getTouch")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1534238297:
                    if (str2.equals("bytedcert.verify")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1471628194:
                    if (str2.equals("bytedcert.pageEnd")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1366167938:
                    if (str2.equals("bytedcert.refreshVerifyViewFinish")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1028963129:
                    if (str2.equals("bytedcert.preLoadVerifyFinish")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -514719849:
                    if (str2.equals("bytedcert.dialogSize")) {
                        c = 0;
                        break;
                    }
                    break;
                case 428780843:
                    if (str2.equals("bytedcert.getSettings")) {
                        c = 7;
                        break;
                    }
                    break;
                case 491779646:
                    if (str2.equals("bytedcert.eventToNative")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1154510586:
                    if (str2.equals("bytedcert.readyView")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1176627553:
                    if (str2.equals("bytedcert.network.request")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    JSONObject jSONObject = new JSONObject(cVar.f11163c);
                    mo14320a(jSONObject.getInt("w"), jSONObject.getInt(C14002h.f36692e));
                    return;
                case 1:
                    C3567l.m15030a().mo14383a(2, cVar);
                    return;
                case 2:
                    mo14319a();
                    return;
                case 3:
                    JSONObject jSONObject2 = new JSONObject(cVar.f11163c);
                    mo14247a(jSONObject2.optInt("result"), jSONObject2.optString("mode"), jSONObject2.optString(ShareHitPoint.f121869d), jSONObject2.optString("token"), jSONObject2.optString("mobile"));
                    return;
                case 4:
                    JSONObject jSONObject3 = new JSONObject(cVar.f11163c);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject3.opt(next);
                        if (opt != null) {
                            str = opt.toString();
                        } else {
                            str = null;
                        }
                        hashMap.put(next, str);
                    }
                    return;
                case 5:
                    JSONObject jSONObject4 = new JSONObject(cVar.f11163c);
                    EventReport.m14811a(jSONObject4.optString("event"), jSONObject4);
                    return;
                case 6:
                    m14883c(cVar);
                    return;
                case 7:
                    mo14248a(cVar);
                    return;
                case '\b':
                    mo14249a(new JSONObject(cVar.f11163c).getString("params"), new AbstractC3526b() {
                        /* class com.bytedance.bdturing.p207c.C3537e.C35381 */

                        @Override // com.bytedance.bdturing.AbstractC3526b
                        /* renamed from: b */
                        public void mo14294b(int i, JSONObject jSONObject) {
                            mo14293a(i, jSONObject);
                        }

                        @Override // com.bytedance.bdturing.AbstractC3526b
                        /* renamed from: a */
                        public void mo14293a(int i, JSONObject jSONObject) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("result", i);
                                cVar.mo14311a(1, jSONObject2);
                            } catch (JSONException unused) {
                            }
                        }
                    });
                    return;
                case '\t':
                    mo14322b();
                    return;
                case '\n':
                    C3555i.m15002a().mo14366d();
                    EventReport.m14814b(System.currentTimeMillis() - C3555i.m15002a().mo14364b());
                    return;
                case 11:
                    EventReport.m14817c(System.currentTimeMillis() - C3555i.m15002a().mo14365c());
                    return;
                default:
                    return;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo14321a(C3534c cVar, String str) {
        if (LogUtil.m14896a()) {
            LogUtil.m14899d("CallNativeRequest", str);
        }
        int i = !TextUtils.isEmpty(str) ? 1 : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", str);
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            e.printStackTrace();
            i = 0;
        }
        cVar.mo14311a(i, jSONObject);
    }
}
