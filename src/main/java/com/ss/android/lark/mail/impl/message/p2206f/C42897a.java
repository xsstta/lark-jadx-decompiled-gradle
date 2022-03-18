package com.ss.android.lark.mail.impl.message.p2206f;

import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.lark.mail.impl.message.f.a */
public class C42897a {

    /* renamed from: a */
    public C42913g f109242a;

    /* renamed from: b */
    private long f109243b;

    /* renamed from: c */
    private int f109244c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153907a() {
        mo153911b();
    }

    /* renamed from: c */
    public int mo153912c() {
        return this.f109244c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo153911b() {
        this.f109243b = 0;
        this.f109244c = 0;
    }

    /* renamed from: d */
    private void m170839d() {
        String str;
        int i;
        int i2;
        Iterator<Map.Entry<String, C42903e>> it = this.f109242a.mo153970b().entrySet().iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                str = "";
                i = 0;
                break;
            }
            C42903e value = it.next().getValue();
            Integer num = value.mo153934b().get(this.f109242a.mo153974c());
            if (num != null) {
                i2 = num.intValue() + i3;
            } else {
                i2 = i3;
            }
            if (i2 - 1 >= this.f109244c) {
                str = value.mo153938d();
                i = this.f109244c - i3;
                break;
            }
            i3 = i2;
        }
        Log.m165389i("ChangeRetIndexHandler", "testSearchABC toJsStartChangeIndex msgID:" + str + " msgRetIndex:" + i);
        if (!TextUtils.isEmpty(str)) {
            C42913g gVar = this.f109242a;
            gVar.mo153972b(null, "locateSearch", C43032aa.m171193e(str), i + "", "");
        }
    }

    public C42897a(C42913g gVar) {
        this.f109242a = gVar;
    }

    /* renamed from: a */
    public void mo153908a(int i) {
        int i2 = this.f109244c + i;
        this.f109244c = i2;
        this.f109242a.mo153971b(i2);
        Log.m165389i("ChangeRetIndexHandler", "testSearchABC doChangeIndex mCurrentRetIndex:" + this.f109244c);
        m170839d();
    }

    /* renamed from: a */
    public void mo153910a(String str, int i) {
        m170838b(str, i);
    }

    /* renamed from: b */
    private void m170838b(final String str, final int i) {
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42897a.RunnableC428981 */

            public void run() {
                String a = C42897a.this.f109242a.mo153970b().get(str).mo153931a();
                Log.m165389i("ChangeRetIndexHandler", "testSearchABC sendOneMessageToJs msgID:" + str + " idx:" + i);
                C42913g gVar = C42897a.this.f109242a;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("");
                gVar.mo153972b(null, "locateSearch", C43032aa.m171193e(str), sb.toString(), a);
            }
        });
    }

    /* renamed from: a */
    public void mo153909a(int i, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            m170839d();
            return;
        }
        try {
            if (i >= jSONArray.getJSONObject(0).getInt("count")) {
                m170839d();
            }
        } catch (JSONException e) {
            Log.m165389i("ChangeRetIndexHandler", "JSONException e:" + e.getMessage());
        }
    }
}
