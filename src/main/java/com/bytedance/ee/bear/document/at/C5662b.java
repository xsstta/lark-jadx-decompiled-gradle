package com.bytedance.ee.bear.document.at;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.atfinder.AbstractC4271f;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.bear.atfinder.MentionModel;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.at.b */
public class C5662b implements AbstractC4271f {

    /* renamed from: a */
    private NetService.C5077f f16016a;

    /* renamed from: b */
    private NetService.AbstractC5075d<AtFinderNetServiceResult> f16017b;

    /* renamed from: c */
    private final AbstractC5197b f16018c;

    /* renamed from: d */
    private String f16019d;

    /* renamed from: a */
    public static C5662b m22968a(C10917c cVar, Context context) {
        return new C5662b((NetService) KoinJavaComponent.m268610a(NetService.class), C4484g.m18494b(), (AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class), C4511g.m18594d(), (an) KoinJavaComponent.m268610a(an.class), context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22970a(String str, AbstractC4272g gVar, Throwable th) throws Exception {
        C13479a.m54759a("AtFinderRepository", "search failure. ", th);
        AtFinderResult atFinderResult = new AtFinderResult();
        atFinderResult.keyword = str;
        gVar.mo16697a(atFinderResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m22969a(String str, AbstractC4272g gVar, AtFinderNetServiceResult atFinderNetServiceResult) throws Exception {
        C13479a.m54772d("AtFinderRepository", "AtFinderRepository.accept:72 result size=" + atFinderNetServiceResult.list.size());
        atFinderNetServiceResult.keyword = str;
        gVar.mo16697a(AtFinderNetServiceResult.convertTo(atFinderNetServiceResult));
    }

    @Override // com.bytedance.ee.bear.atfinder.AbstractC4271f
    /* renamed from: a */
    public void mo16667a(MentionModel mentionModel, String str, AbstractC4272g gVar) {
        gVar.mo16696a();
        m22971a(mentionModel.getToken(), mentionModel.getKeyword(), str, mentionModel.getSource(), mentionModel.getChatId());
        String keyword = mentionModel.getKeyword();
        this.f16017b.mo20141a(this.f16016a).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(keyword, gVar) {
            /* class com.bytedance.ee.bear.document.at.$$Lambda$b$PuRVBJENntPJG6d_Oj0aez1Nhk */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AbstractC4272g f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5662b.m269223lambda$PuRVBJENntPJG6d_Oj0aez1Nhk(this.f$0, this.f$1, (AtFinderNetServiceResult) obj);
            }
        }, new Consumer(keyword, gVar) {
            /* class com.bytedance.ee.bear.document.at.$$Lambda$b$GdIjyFeJ_p3ZPhFx1swwrCN2rwI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ AbstractC4272g f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C5662b.lambda$GdIjyFeJ_p3ZPhFx1swwrCN2rwI(this.f$0, this.f$1, (Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    private void m22971a(String str, String str2, String str3, int i, String str4) {
        if (i == 24) {
            str3 = "0";
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("token", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        hashMap.put("content", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put(ShareHitPoint.f121869d, str3);
        hashMap.put(ShareHitPoint.f121868c, Integer.toString(i));
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("chat_id", str4);
        }
        hashMap.put("user_type", this.f16019d);
        if (!this.f16018c.mo20801b().mo20782g().f14914a) {
            hashMap.put("config_source", Integer.toString(1));
        }
        NetService.C5077f fVar = new NetService.C5077f("/api/mention/recommend.v2/");
        this.f16016a = fVar;
        fVar.mo20147a(hashMap);
        this.f16016a.mo20143a(1);
    }

    private C5662b(NetService netService, ao aoVar, AbstractC5197b bVar, al alVar, an anVar, Context context) {
        boolean z;
        String str;
        this.f16017b = netService.mo20117a(new C5663c(context, aoVar));
        this.f16018c = bVar;
        boolean z2 = true;
        if (alVar.mo17344E() == 2) {
            z = true;
        } else {
            z = false;
        }
        AccountService.Account f = anVar.mo16408f();
        z2 = (f == null || !f.mo19681c()) ? false : z2;
        if (!z || !z2) {
            str = "0";
        } else {
            str = "1";
        }
        this.f16019d = str;
    }
}
