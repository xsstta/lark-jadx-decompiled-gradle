package com.ss.android.lark.mail.impl.message.p2206f;

import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.message.f.d */
public class C42901d {

    /* renamed from: f */
    private static final String[] f109251f = {"@", "3", "#", "噶", C14002h.f36692e, "N", "+", "^", "[", "*", "$", "}", "!", "*", "-", ContainerUtils.KEY_VALUE_DELIMITER, "x", "6", "1"};

    /* renamed from: a */
    public LinkedHashMap<String, C42903e> f109252a = new LinkedHashMap<>();

    /* renamed from: b */
    public C42913g f109253b;

    /* renamed from: c */
    private boolean f109254c;

    /* renamed from: d */
    private boolean f109255d;

    /* renamed from: e */
    private int f109256e;

    /* renamed from: c */
    public HashMap<String, C42903e> mo153928c() {
        return this.f109252a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo153929d() {
        return this.f109256e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo153926b() {
        this.f109254c = false;
        this.f109255d = false;
        this.f109256e = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153923a() {
        this.f109252a.clear();
        mo153926b();
    }

    public C42901d(C42913g gVar) {
        this.f109253b = gVar;
    }

    /* renamed from: c */
    private void m170858c(final String str) {
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42901d.RunnableC429021 */

            public void run() {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, C42903e> entry : C42901d.this.f109252a.entrySet()) {
                    C42903e value = entry.getValue();
                    Integer num = value.mo153934b().get(str);
                    if (num != null && num.intValue() > 0) {
                        if (!C42871i.m170779b() || !"mail_title".equals(value.mo153938d())) {
                            arrayList.add(value);
                        }
                    }
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    C42903e eVar = (C42903e) arrayList.get(i);
                    if (!eVar.mo153939e()) {
                        eVar.mo153932a(C43032aa.m171193e(C42901d.this.f109253b.mo153969b(eVar.mo153938d())));
                        eVar.mo153936b(true);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public C42903e mo153922a(String str) {
        return this.f109252a.get(str);
    }

    /* renamed from: b */
    public void mo153927b(String str) {
        m170858c(str);
        this.f109255d = true;
        Log.m165389i("SearchInputHandler", "testSearchABC onNativeSearchDone mIsJSSearchDone:" + this.f109254c);
        if (this.f109254c) {
            m170856a(str, 0);
        }
    }

    /* renamed from: a */
    private void m170857a(JSONArray jSONArray, String str) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string = jSONObject.getString("messageId");
                    int i2 = jSONObject.getInt("count");
                    C42903e eVar = this.f109252a.get(string);
                    if (eVar != null) {
                        if (!C42871i.m170779b() || !"mail_title".equals(string)) {
                            eVar.mo153934b().put(str, Integer.valueOf(i2));
                        }
                    } else if (!TextUtils.isEmpty(str)) {
                        C42903e eVar2 = new C42903e();
                        eVar2.mo153935b(string);
                        eVar2.mo153934b().put(str, Integer.valueOf(i2));
                        this.f109252a.put(string, eVar2);
                    }
                } catch (JSONException e) {
                    Log.m165389i("SearchInputHandler", "JSONException e:" + e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    private void m170856a(String str, int i) {
        this.f109256e = 0;
        C42903e eVar = null;
        for (Map.Entry<String, C42903e> entry : this.f109252a.entrySet()) {
            C42903e value = entry.getValue();
            Integer num = value.mo153934b().get(str);
            if (num != null && num.intValue() > 0) {
                if (eVar == null) {
                    eVar = value;
                }
                this.f109256e += num.intValue();
            }
        }
        if (this.f109256e > 0 && eVar != null && i == 0) {
            this.f109253b.mo153972b(null, "locateSearch", C43032aa.m171193e(eVar.mo153938d()), "0", "");
        }
        Log.m165389i("SearchInputHandler", "testSearchABC updateSearchUI mTotalSearchRetCount:" + this.f109256e);
        C42913g gVar = this.f109253b;
        gVar.mo153971b(gVar.mo153977d());
    }

    /* renamed from: a */
    public void mo153924a(C42903e eVar, String str) {
        String str2;
        int i = 0;
        this.f109255d = false;
        this.f109256e = 0;
        if ("".equals(str)) {
            eVar.mo153934b().put(str, 0);
        } else if (TextUtils.isEmpty(eVar.mo153931a())) {
            eVar.mo153934b().put(str, 0);
        } else {
            int i2 = 0;
            while (true) {
                String[] strArr = f109251f;
                if (i2 >= strArr.length) {
                    str2 = " ";
                    break;
                } else if (str.indexOf(strArr[i2]) == -1) {
                    str2 = strArr[i2];
                    break;
                } else {
                    i2++;
                }
            }
            String replaceAll = eVar.mo153931a().replaceAll("<([^>]*)>", str2);
            int indexOf = replaceAll.indexOf(str);
            while (indexOf != -1) {
                indexOf = replaceAll.indexOf(str, indexOf + 1);
                i++;
            }
            eVar.mo153934b().put(str, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public void mo153925a(String str, int i, JSONArray jSONArray) {
        m170857a(jSONArray, str);
        this.f109254c = true;
        Log.m165389i("SearchInputHandler", "testSearchABC onJSSearchDone mIsNativeSearchDone:" + this.f109255d);
        if (this.f109255d) {
            m170856a(str, i);
        }
    }
}
