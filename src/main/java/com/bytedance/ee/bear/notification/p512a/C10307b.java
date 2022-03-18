package com.bytedance.ee.bear.notification.p512a;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.TypeReference;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.C6306d;
import com.bytedance.ee.bear.notification.bean.Notification;
import com.bytedance.ee.bear.notification.bean.NotificationResult;
import com.bytedance.ee.bear.notification.db.C10338d;
import com.bytedance.ee.bear.notification.p512a.C10302a;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.rn.RnPushProtocol;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.koin.core.p3519d.C70039b;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.notification.a.b */
public class C10307b {

    /* renamed from: b */
    static final /* synthetic */ boolean f27809b = true;

    /* renamed from: a */
    public C10338d f27810a = C10338d.m43016a();

    /* renamed from: c */
    private NetService f27811c = ((NetService) KoinJavaComponent.m268610a(NetService.class));

    /* renamed from: d */
    private RnPushProtocol f27812d;

    /* renamed from: e */
    private C10302a f27813e;

    /* renamed from: f */
    private String f27814f;

    /* renamed from: g */
    private boolean f27815g;

    /* renamed from: a */
    public void mo39358a() {
        this.f27812d.mo40241a();
    }

    /* renamed from: d */
    public LiveData<List<Notification>> mo39368d() {
        return this.f27810a.mo39454c();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ DefinitionParameters m42945f() {
        return C70039b.m268661a("BULLETIN_android_lark_", this.f27814f);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ DefinitionParameters m42946g() {
        return C70039b.m268661a("BULLETIN_android_larkdocs_", this.f27814f);
    }

    /* renamed from: c */
    public AbstractC68307f<List<String>> mo39366c() {
        return AbstractC68307f.m265080a(new AbstractC68324h<List<String>>() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.C103114 */

            @Override // io.reactivex.AbstractC68324h
            public void subscribe(AbstractC68323g<List<String>> gVar) {
                gVar.onNext(C10307b.this.f27810a.mo39453b());
                gVar.onComplete();
            }
        }, BackpressureStrategy.BUFFER).mo238004b(C11678b.m48479c());
    }

    /* renamed from: e */
    private void m42944e() {
        if (this.f27815g) {
            this.f27812d = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0() {
                /* class com.bytedance.ee.bear.notification.p512a.$$Lambda$b$m2ydflFBaklsKJIISF9GwvxNfQ4 */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C10307b.lambda$m2ydflFBaklsKJIISF9GwvxNfQ4(C10307b.this);
                }
            });
        } else {
            this.f27812d = (RnPushProtocol) KoinJavaComponent.m268612a(RnPushProtocol.class, RnPushProtocol.VersionQualifier.Default, new Function0() {
                /* class com.bytedance.ee.bear.notification.p512a.$$Lambda$b$esiH_jb5Dn3UXoy8VAjt11foojo */

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C10307b.lambda$esiH_jb5Dn3UXoy8VAjt11foojo(C10307b.this);
                }
            });
        }
    }

    /* renamed from: b */
    public AbstractC68307f<List<Notification>> mo39363b() {
        return this.f27811c.mo20118a(new C10316a().getType()).mo20141a(new NetService.C5077f("/api/bulletin/get/")).mo238020d(new Function<NetService.Result<NotificationResult>, List<Notification>>() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.C103103 */

            /* renamed from: a */
            public List<Notification> apply(NetService.Result<NotificationResult> result) throws Exception {
                return result.getData().getNotificationResults();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.notification.a.b$a */
    public class C10316a extends TypeReference<NetService.Result<NotificationResult>> {
        private C10316a() {
        }
    }

    /* renamed from: a */
    public void mo39359a(C10302a.AbstractC10306b bVar) {
        C10302a aVar = new C10302a(this.f27811c, bVar);
        this.f27813e = aVar;
        this.f27812d.mo40242a(aVar);
    }

    /* renamed from: b */
    public void mo39364b(final String str) {
        C11678b.m48479c().scheduleDirect(new Runnable() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.RunnableC103136 */

            public void run() {
                C10307b.this.f27810a.mo39449a(str);
            }
        });
    }

    /* renamed from: c */
    public void mo39367c(final String str) {
        C11678b.m48479c().scheduleDirect(new Runnable() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.RunnableC103158 */

            public void run() {
                C10307b.this.f27810a.mo39452b(str);
            }
        });
    }

    /* renamed from: a */
    public void mo39360a(final Notification notification) {
        C11678b.m48479c().scheduleDirect(new Runnable() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.RunnableC103147 */

            public void run() {
                C10307b.this.f27810a.mo39450a(notification);
            }
        });
    }

    /* renamed from: b */
    public void mo39365b(final List<Notification> list) {
        C11678b.m48479c().scheduleDirect(new Runnable() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.RunnableC103125 */

            public void run() {
                C10307b.this.f27810a.mo39455d();
                C10307b.this.f27810a.mo39451a(list);
            }
        });
    }

    /* renamed from: a */
    public void mo39361a(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(this.f27814f, str)) {
            this.f27814f = str;
            mo39358a();
            m42944e();
            C10302a aVar = this.f27813e;
            if (aVar != null) {
                this.f27812d.mo40242a(aVar);
            }
        }
    }

    public C10307b(C10917c cVar) {
        boolean z;
        String string = new PersistenceSharedPreference(C6306d.f17467a).getString(C6306d.f17474h, "cn");
        this.f27814f = string;
        if (f27809b || string != null) {
            if (C4511g.m18594d().mo17344E() == 2) {
                z = f27809b;
            } else {
                z = false;
            }
            this.f27815g = z;
            m42944e();
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo39362a(final List<String> list) {
        NetService.AbstractC5075d a = this.f27811c.mo20118a(NetService.Result.class);
        NetService.C5077f fVar = new NetService.C5077f("/api/bulletin/close/");
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("id", list);
        fVar.mo20151b(hashMap);
        a.mo20141a(fVar).mo238001b(new Consumer<NetService.Result>() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.C103081 */

            /* renamed from: a */
            public void accept(NetService.Result result) throws Exception {
                for (String str : list) {
                    C10307b.this.mo39364b(str);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.notification.p512a.C10307b.C103092 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("NotificationRepository", "syncCloseNotification failed", th);
            }
        });
    }
}
