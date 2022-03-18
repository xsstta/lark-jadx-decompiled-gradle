package com.ss.android.lark.mail.impl.message.p2206f;

import android.webkit.ValueCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.message.f.g */
public class C42913g {

    /* renamed from: a */
    public C42899b f109286a = new C42899b(this);

    /* renamed from: b */
    public C42901d f109287b = new C42901d(this);

    /* renamed from: c */
    public C42904f f109288c;

    /* renamed from: d */
    private C42897a f109289d = new C42897a(this);

    /* renamed from: e */
    private C42900c f109290e = new C42900c(this);

    /* renamed from: f */
    private String f109291f;

    /* renamed from: g */
    private AbsMessageTemplateView f109292g;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo153974c() {
        return this.f109291f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo153977d() {
        return this.f109289d.mo153912c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153961a() {
        this.f109288c.mo153949c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public HashMap<String, C42903e> mo153970b() {
        return this.f109287b.mo153928c();
    }

    /* renamed from: a */
    public String mo153960a(C42097j jVar) {
        return this.f109288c.mo153940a(jVar);
    }

    /* renamed from: b */
    public String mo153969b(String str) {
        return this.f109288c.mo153941a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo153976c(boolean z) {
        this.f109288c.mo153945a(z);
    }

    /* renamed from: a */
    public void mo153962a(int i) {
        this.f109289d.mo153908a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo153971b(int i) {
        this.f109288c.mo153942a(i, this.f109287b.mo153929d());
        this.f109292g.mo154322a(this.f109291f, i);
    }

    /* renamed from: a */
    public void mo153964a(final String str) {
        this.f109290e.mo153920a();
        this.f109286a.mo153919b();
        this.f109287b.mo153926b();
        this.f109289d.mo153911b();
        this.f109291f = str;
        Log.m165389i("SearchViewModel", "testSearchABC startInput searchKey:" + str);
        mo153963a((ValueCallback<String>) null, "search", str);
        CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42913g.RunnableC429172 */

            public void run() {
                final ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, C42903e> entry : C42913g.this.f109287b.mo153928c().entrySet()) {
                    C42903e value = entry.getValue();
                    if (value.mo153937c()) {
                        arrayList.add(value);
                    }
                }
                int size = arrayList.size();
                if (size == 0) {
                    C42913g.this.f109287b.mo153927b(str);
                    return;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((C42903e) arrayList.get(i)).mo153934b().containsKey(str)) {
                        C42913g.this.f109287b.mo153927b(str);
                        return;
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (size == 1) {
                    C42913g.this.f109287b.mo153924a((C42903e) arrayList.get(0), str);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (final int i2 = 0; i2 < arrayList.size(); i2++) {
                        FutureTask futureTask = new FutureTask(new Callable<String>() {
                            /* class com.ss.android.lark.mail.impl.message.p2206f.C42913g.RunnableC429172.CallableC429181 */

                            /* renamed from: a */
                            public String call() throws Exception {
                                C42913g.this.f109287b.mo153924a((C42903e) arrayList.get(i2), str);
                                return "";
                            }
                        });
                        CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask);
                        arrayList2.add(futureTask);
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        try {
                            ((FutureTask) arrayList2.get(i3)).get();
                        } catch (ExecutionException e) {
                            Log.m165389i("SearchViewModel", "ExecutionException e:" + e.getMessage());
                        } catch (InterruptedException e2) {
                            Log.m165389i("SearchViewModel", "InterruptedException e:" + e2.getMessage());
                        }
                    }
                }
                Log.m165389i("SearchViewModel", "testSearchABC doSearch time:" + (System.currentTimeMillis() - currentTimeMillis));
                C42913g.this.f109287b.mo153927b(str);
            }
        });
        this.f109292g.mo154322a(str, 0);
    }

    /* renamed from: b */
    public void mo153973b(boolean z) {
        C42904f fVar = this.f109288c;
        if (fVar != null && fVar.mo153946a()) {
            this.f109290e.mo153921a(z);
            this.f109286a.mo153916a();
            this.f109287b.mo153923a();
            this.f109289d.mo153907a();
        }
        this.f109292g.mo154322a((String) null, -1);
    }

    /* renamed from: a */
    public void mo153968a(boolean z) {
        mo153972b(null, "startSearch", new String[0]);
        this.f109288c.mo153947b();
        C42187a.m168541h(z);
    }

    public C42913g(C42904f fVar, AbsMessageTemplateView absMessageTemplateView) {
        this.f109292g = absMessageTemplateView;
        this.f109288c = fVar;
    }

    /* renamed from: a */
    public void mo153965a(String str, int i) {
        this.f109289d.mo153910a(str, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo153975c(ValueCallback<String> valueCallback, String str, String... strArr) {
        this.f109288c.mo153948b(valueCallback, str, strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo153963a(ValueCallback<String> valueCallback, String str, String... strArr) {
        this.f109288c.mo153943a(valueCallback, str, strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo153972b(final ValueCallback<String> valueCallback, final String str, final String... strArr) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42913g.RunnableC429193 */

            public void run() {
                Log.m165389i("SearchViewModel", "testSearchABC runJsFuntion method:" + str);
                C42913g.this.f109288c.mo153948b(valueCallback, str, strArr);
            }
        });
    }

    /* renamed from: a */
    public void mo153967a(final List<C42097j> list, final ArrayList<String> arrayList, final String str) {
        if (this.f109287b.mo153928c().size() <= 0) {
            CoreThreadPool.getSerialTaskHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.p2206f.C42913g.RunnableC429141 */

                public void run() {
                    String str;
                    long currentTimeMillis = System.currentTimeMillis();
                    final ArrayList<C42097j> a = C42913g.this.f109286a.mo153915a(list, arrayList, C42913g.this.f109287b.mo153928c(), str);
                    int size = a.size();
                    Log.m165389i("SearchViewModel", "testSearchABC startPreSearch notLoadedMailMessageList:" + size + " getSearchTaskMap:" + C42913g.this.f109287b.mo153928c().size());
                    if (size != 0) {
                        JSONObject jSONObject = new JSONObject();
                        if (size == 1) {
                            try {
                                String b = a.get(0).mo151964g().mo151581b();
                                C42903e a2 = C42913g.this.f109287b.mo153922a(b);
                                if (a2 != null) {
                                    a2.mo153933a(false);
                                }
                                jSONObject.put(b, C42913g.this.f109286a.mo153914a(a.get(0)));
                                str = C43032aa.m171193e(jSONObject.toString());
                            } catch (JSONException e) {
                                Log.m165389i("SearchViewModel", "JSONException e:" + e.getMessage());
                                str = "";
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            final int i = 0;
                            while (i < size && i != 5) {
                                FutureTask futureTask = new FutureTask(new Callable<String>() {
                                    /* class com.ss.android.lark.mail.impl.message.p2206f.C42913g.RunnableC429141.CallableC429151 */

                                    /* renamed from: a */
                                    public String call() throws Exception {
                                        return C42913g.this.f109286a.mo153914a((C42097j) a.get(i));
                                    }
                                });
                                CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask);
                                arrayList.add(futureTask);
                                i++;
                            }
                            int i2 = 0;
                            while (i2 < size && i2 != 5) {
                                try {
                                    String b2 = a.get(i2).mo151964g().mo151581b();
                                    C42903e a3 = C42913g.this.f109287b.mo153922a(b2);
                                    if (a3 != null) {
                                        a3.mo153933a(false);
                                    }
                                    jSONObject.put(b2, ((FutureTask) arrayList.get(i2)).get());
                                } catch (JSONException e2) {
                                    try {
                                        Log.m165389i("SearchViewModel", "JSONException e:" + e2.getMessage());
                                    } catch (ExecutionException e3) {
                                        Log.m165389i("SearchViewModel", "ExecutionException e:" + e3.getMessage());
                                    } catch (InterruptedException e4) {
                                        Log.m165389i("SearchViewModel", "InterruptedException e:" + e4.getMessage());
                                    }
                                }
                                i2++;
                            }
                            str = C43032aa.m171193e(jSONObject.toString());
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Log.m165389i("SearchViewModel", "testSearchABC makeFirstMessage time:" + (currentTimeMillis2 - currentTimeMillis));
                        C42913g.this.f109286a.mo153917a(str);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (a.size() > 5) {
                            if (size == 6) {
                                MailMessage g = a.get(5).mo151964g();
                                C42903e a4 = C42913g.this.f109287b.mo153922a(g.mo151581b());
                                if (a4 != null) {
                                    a4.mo153932a(C42913g.this.f109286a.mo153918b(g.mo151606h()));
                                }
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                for (final int i3 = 5; i3 < size; i3++) {
                                    FutureTask futureTask2 = new FutureTask(new Callable<C42903e>() {
                                        /* class com.ss.android.lark.mail.impl.message.p2206f.C42913g.RunnableC429141.CallableC429162 */

                                        /* renamed from: a */
                                        public C42903e call() throws Exception {
                                            MailMessage g = ((C42097j) a.get(i3)).mo151964g();
                                            C42903e a = C42913g.this.f109287b.mo153922a(g.mo151581b());
                                            if (a != null) {
                                                a.mo153932a(C42913g.this.f109286a.mo153918b(g.mo151606h()));
                                            }
                                            return a;
                                        }
                                    });
                                    CoreThreadPool.getDefault().getFixedThreadPool().execute(futureTask2);
                                    arrayList2.add(futureTask2);
                                }
                                for (int i4 = 5; i4 < size; i4++) {
                                    try {
                                        ((FutureTask) arrayList2.get(i4 - 5)).get();
                                    } catch (ExecutionException e5) {
                                        Log.m165389i("SearchViewModel", "ExecutionException e:" + e5.getMessage());
                                    } catch (InterruptedException e6) {
                                        Log.m165389i("SearchViewModel", "InterruptedException e:" + e6.getMessage());
                                    }
                                }
                            }
                        }
                        Log.m165389i("SearchViewModel", "testSearchABC handleOtherMessage time:" + (System.currentTimeMillis() - currentTimeMillis3));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo153966a(String str, int i, int i2, JSONArray jSONArray) {
        if (!str.equals(this.f109291f)) {
            return;
        }
        if (i == 0) {
            this.f109287b.mo153925a(str, i, jSONArray);
        } else if (i == 1) {
            this.f109287b.mo153925a(str, i, jSONArray);
            this.f109289d.mo153909a(i2, jSONArray);
        }
    }
}
