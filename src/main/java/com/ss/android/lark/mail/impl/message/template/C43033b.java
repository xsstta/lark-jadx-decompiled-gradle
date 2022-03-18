package com.ss.android.lark.mail.impl.message.template;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.C14205b;
import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.p769e.AbstractC14267a;
import com.bytedance.geckox.utils.C14367l;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43765h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.mail.impl.message.template.b */
public class C43033b {

    /* renamed from: a */
    public long f109550a;

    /* renamed from: b */
    public C14205b f109551b;

    /* renamed from: c */
    public Map<String, List<CheckRequestBodyModel.TargetChannel>> f109552c;

    /* renamed from: d */
    public AbstractC43038a f109553d;

    /* renamed from: e */
    private AtomicBoolean f109554e;

    /* renamed from: com.ss.android.lark.mail.impl.message.template.b$a */
    public interface AbstractC43038a {
        /* renamed from: a */
        void mo154216a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.message.template.b$b */
    public static class C43039b {

        /* renamed from: a */
        static final C43033b f109559a = new C43033b();
    }

    private C43033b() {
        this.f109554e = new AtomicBoolean(false);
        this.f109550a = -1;
    }

    /* renamed from: a */
    public static final C43033b m171194a() {
        if (!C43039b.f109559a.f109554e.getAndSet(true)) {
            C43039b.f109559a.m171195d();
        }
        return C43039b.f109559a;
    }

    /* renamed from: d */
    private void m171195d() {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.template.C43033b.RunnableC430341 */

            public void run() {
                String b = C41816b.m166115a().mo150119I().mo150200b();
                String c = C41816b.m166115a().mo150119I().mo150201c();
                if (!TextUtils.isEmpty(c)) {
                    C14218d dVar = null;
                    try {
                        dVar = new C14218d.C14220a(C41816b.m166115a().mo150132b()).mo52161a(b).mo52165b(b).mo52154a(C41816b.m166115a().mo150119I().mo150199a()).mo52166c(c).mo52158a(C41816b.m166115a().mo150119I().mo150203e()).mo52163b(C41816b.m166115a().mo150119I().mo150202d()).mo52157a(C43765h.m173483a(C41816b.m166115a().mo150119I().mo150204f())).mo52162a();
                    } catch (Throwable th) {
                        Log.m165384e("DynamicTemplateResManager", "gecko init error", th);
                    }
                    if (dVar != null) {
                        C14205b a = C14205b.m57334a(dVar);
                        HashMap hashMap = new HashMap();
                        hashMap.put(b, new ArrayList<CheckRequestBodyModel.TargetChannel>() {
                            /* class com.ss.android.lark.mail.impl.message.template.C43033b.RunnableC430341.C430351 */

                            {
                                add(new CheckRequestBodyModel.TargetChannel("mail_template"));
                            }
                        });
                        C43033b.this.f109552c = hashMap;
                        C43033b.this.f109551b = a;
                        C43033b.this.mo154212b();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo154212b() {
        if (this.f109554e.get() && this.f109551b != null && this.f109552c != null) {
            if (System.currentTimeMillis() - this.f109550a < 600000) {
                Log.m165389i("DynamicTemplateResManager", "checkUpdateMultiAsync : ignore");
                return;
            }
            final C430362 r0 = new AbstractC14267a() {
                /* class com.ss.android.lark.mail.impl.message.template.C43033b.C430362 */

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21857a() {
                    Log.m165389i("DynamicTemplateResManager", "onUpdateFinish");
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21858a(UpdatePackage updatePackage) {
                    Log.m165389i("DynamicTemplateResManager", "onUpdateStart | " + updatePackage.toString());
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: b */
                public void mo21867b(String str) {
                    Log.m165389i("DynamicTemplateResManager", "onClean | channel = " + str);
                    if (C43033b.this.f109553d != null) {
                        C43033b.this.f109553d.mo154216a();
                    }
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21861a(String str, long j) {
                    Log.m165389i("DynamicTemplateResManager", "onUpdateSuccess | channel = " + str + ", version = " + j);
                    if (C43033b.this.f109553d != null) {
                        C43033b.this.f109553d.mo154216a();
                    }
                }

                @Override // com.bytedance.geckox.p769e.AbstractC14267a
                /* renamed from: a */
                public void mo21864a(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
                    Log.m165389i("DynamicTemplateResManager", "onCheckServerVersionSuccess | requestMap = " + map.toString() + ", responseMap = " + map2.toString());
                    C43033b.this.f109550a = System.currentTimeMillis();
                }
            };
            CoreThreadPool.getDefault();
            CoreThreadPool.getBackgroundHandler().post(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.template.C43033b.RunnableC430373 */

                public void run() {
                    C43033b.this.f109551b.mo52091a(C43033b.this.f109552c, r0);
                }
            });
        }
    }

    /* renamed from: c */
    public String mo154213c() {
        String str;
        String b = C14367l.m57846b(C43765h.m173483a(C41816b.m166115a().mo150119I().mo150204f()), C41816b.m166115a().mo150119I().mo150200b(), "mail_template");
        StringBuilder sb = new StringBuilder();
        sb.append("dynamicTemplatePath=");
        if (b != null) {
            str = b;
        } else {
            str = "null";
        }
        sb.append(str);
        Log.m165389i("DynamicTemplateResManager", sb.toString());
        return b;
    }

    /* renamed from: a */
    public void mo154211a(AbstractC43038a aVar) {
        this.f109553d = aVar;
    }
}
