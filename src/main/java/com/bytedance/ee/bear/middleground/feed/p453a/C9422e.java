package com.bytedance.ee.bear.middleground.feed.p453a;

import android.text.TextUtils;
import androidx.core.util.C0844e;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.C5201a;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9495h;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9496i;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.middleground.feed.statistics.FeedReportV2;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.middleground.feed.a.e */
public class C9422e {

    /* renamed from: a */
    private static volatile C9422e f25337a;

    /* renamed from: b */
    private C10917c f25338b;

    /* renamed from: c */
    private volatile String f25339c = "";

    /* renamed from: d */
    private C1177w<C0844e<String, List<AbstractC9495h>>> f25340d = new C1177w<>();

    /* renamed from: e */
    private AbstractC9496i f25341e;

    /* renamed from: a */
    public void mo35919a(AbstractC9496i iVar) {
        if (this.f25341e == null) {
            this.f25341e = iVar;
        }
    }

    /* renamed from: a */
    public void mo35918a(OfflineDoc offlineDoc) {
        C13479a.m54764b("FeedMessageManager", "pullMessage");
        m38978a(offlineDoc, false);
    }

    /* renamed from: a */
    private void m38978a(OfflineDoc offlineDoc, boolean z) {
        if (z) {
            this.f25339c = offlineDoc.getObj_token();
        }
        AbstractC68307f.m265083a(offlineDoc).mo237998a((AbstractC68322n) new AbstractC68322n(offlineDoc) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$AjU6jVDBAgicNYP7gFjJKRCJlUs */
            public final /* synthetic */ OfflineDoc f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.AbstractC68322n
            public final boolean test(Object obj) {
                return C9422e.this.m38982a(this.f$1, (OfflineDoc) obj);
            }
        }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48480d()).mo238014c(new Function(offlineDoc, z) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$8iwdeLKL6bM3cQmspgrPQFPzE1A */
            public final /* synthetic */ OfflineDoc f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9422e.this.m38976a(this.f$1, this.f$2, (OfflineDoc) obj);
            }
        }).mo237998a((AbstractC68322n) $$Lambda$EFU00xcq_rVXUy8YDI9rrO_4kYY.INSTANCE).mo238014c(new Function(offlineDoc) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$gpCPOSzpsTXgbsa3PUtplgjAyc */
            public final /* synthetic */ OfflineDoc f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9422e.this.m38975a(this.f$1, (String) obj);
            }
        }).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c()).mo238014c(new Function(offlineDoc, z) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$MJ8SININXVIzONstx5h257p_a0 */
            public final /* synthetic */ OfflineDoc f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9422e.this.m38977a(this.f$1, this.f$2, (String) obj);
            }
        }).mo237978a($$Lambda$e$JC8BoT7SIhsQAFcdm62TdBG3Sn4.INSTANCE, new Consumer(z) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$xiuYwGXXuOf4Ii__Ic0fb2hoimI */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9422e.this.m38981a((C9422e) this.f$1, (boolean) ((Throwable) obj));
            }
        }, $$Lambda$e$XuwL1UTj2Qkj3mxImw83wQ8WahI.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m38982a(OfflineDoc offlineDoc, OfflineDoc offlineDoc2) throws Exception {
        return mo35922a(offlineDoc.getFrom_source());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m38976a(OfflineDoc offlineDoc, boolean z, OfflineDoc offlineDoc2) throws Exception {
        return m38969a(offlineDoc.getObj_token(), offlineDoc.getType(), z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m38975a(OfflineDoc offlineDoc, String str) throws Exception {
        return m38983b(offlineDoc.getObj_token(), offlineDoc.getType());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m38977a(OfflineDoc offlineDoc, boolean z, String str) throws Exception {
        C9420b bVar = new C9420b(str, "network");
        MessageResultBean a = m38967a(bVar, offlineDoc.getObj_token(), offlineDoc.getType(), z);
        if (a.getCode() == 0) {
            if (((a.getData() == null || a.getData().getMessage() == null) ? 0 : a.getData().getMessage().size()) <= 0) {
                return AbstractC68307f.m265097b();
            }
            String jSONObject = C9423f.m39005e(bVar.f25322b).toString();
            if (!TextUtils.isEmpty(jSONObject)) {
                return m38984b(offlineDoc.getObj_token(), offlineDoc.getType(), jSONObject);
            }
            return AbstractC68307f.m265084a(new Throwable("parse data error"));
        }
        return AbstractC68307f.m265084a(new Throwable("code: " + a.getCode()));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m38981a(boolean z, Throwable th) throws Exception {
        if (z) {
            this.f25339c = "";
        }
        if (th == null) {
            th = new Throwable("... known error ...");
        }
        String b = FeedReportV2.f25356a.mo35958b(th);
        FeedReportV2.f25356a.mo35956a("stage_native_pull_data", b);
        FeedReportV2.f25356a.mo35955a(b);
        C13479a.m54759a("FeedMessageManager", "preload feed message fail", th);
        this.f25340d.mo5926a((C0844e<String, List<AbstractC9495h>>) null);
    }

    /* renamed from: a */
    public boolean mo35922a(String str) {
        return "docs_feed".equals(str);
    }

    /* renamed from: a */
    public void mo35920a(String str, int i, String str2) {
        m38984b(str, i, str2).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c()).mo238001b($$Lambda$e$Ilmdhez4QJj5SSw_AbFZCZiRdU.INSTANCE, $$Lambda$e$pjOfSdQ9Q26F8elJ8wXq82Iaeg.INSTANCE);
    }

    /* renamed from: a */
    public Disposable mo35917a(AbstractC68307f<MessageResultBean> fVar, String str, int i) {
        return fVar.mo238020d(new Function(str, i) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$SvDVCEFIqoum_GM_FFFAUoH3zg */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9422e.this.m38971a(this.f$1, this.f$2, (MessageResultBean) obj);
            }
        }).mo238004b(C11678b.m48480d()).mo238001b($$Lambda$e$fENRheZaqYhlnKgHeqmNbUx1WG8.INSTANCE, $$Lambda$e$CG9XagDxGnLeL_TPzC0zoeZ0BQ.INSTANCE);
    }

    /* renamed from: a */
    public LiveData<C0844e<String, List<AbstractC9495h>>> mo35916a(String str, int i) {
        if (TextUtils.isEmpty(this.f25339c) || (str != null && !str.equals(this.f25339c))) {
            this.f25340d = new C1177w<>();
            OfflineDoc offlineDoc = new OfflineDoc();
            offlineDoc.setObj_token(str);
            offlineDoc.setToken(str);
            offlineDoc.setType(i);
            offlineDoc.setFrom_source("docs_feed");
            m38978a(offlineDoc, true);
        } else {
            this.f25340d.mo5927b();
        }
        return this.f25340d;
    }

    /* renamed from: a */
    public boolean mo35921a() {
        C1177w<C0844e<String, List<AbstractC9495h>>> wVar;
        return !TextUtils.isEmpty(this.f25339c) && (wVar = this.f25340d) != null && wVar.mo5927b() != null && !TextUtils.isEmpty(this.f25340d.mo5927b().f3317a) && this.f25340d.mo5927b().f3318b != null && !this.f25340d.mo5927b().f3318b.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m38985b() throws Exception {
        FeedReportV2.f25356a.mo35960b("stage_native_pull_data");
        C13479a.m54772d("FeedMessageManager", "do not pull message");
    }

    private C9422e(C10917c cVar) {
        this.f25338b = cVar;
    }

    /* renamed from: a */
    public static C9422e m38966a(C10917c cVar) {
        if (f25337a == null) {
            synchronized (C9422e.class) {
                if (f25337a == null) {
                    f25337a = new C9422e(cVar);
                }
            }
        }
        return f25337a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m38986b(Boolean bool) throws Exception {
        FeedReportV2.f25356a.mo35960b("stage_native_pull_data");
        C13479a.m54764b("FeedMessageManager", "preload feed message success");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m38974a(NetService.C5077f fVar) throws Exception {
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C5201a()).mo20141a(fVar);
    }

    /* renamed from: b */
    private AbstractC68307f<String> m38983b(String str, int i) {
        return AbstractC68307f.m265083a(str).mo238020d(new Function(str, i) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$ULkkyVuPXjjF2DU0X74Ll3ou02M */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9422e.m38989c(this.f$0, this.f$1, (String) obj);
            }
        }).mo238014c($$Lambda$e$J9fdB35QpFczwpy_LjdgY8lZQ.INSTANCE).mo238004b(C11678b.m48480d()).mo238020d($$Lambda$gPNqIq1hLrBC4rkGO920iYgQv2I.INSTANCE);
    }

    /* renamed from: a */
    private String m38973a(String str, String str2) {
        return str + "_" + str2 + "_/api/message/get_message.v3/native";
    }

    /* renamed from: a */
    private AbstractC68307f<String> m38969a(String str, int i, boolean z) {
        return AbstractC68307f.m265083a(str).mo238020d(new Function(str, i, z) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$Q4ngA7luOi7BdbmhGnMtYWEfu8 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ boolean f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9422e.this.m38972a(this.f$1, this.f$2, this.f$3, (String) obj);
            }
        });
    }

    /* renamed from: b */
    private AbstractC68307f<Boolean> m38984b(String str, int i, String str2) {
        return AbstractC68307f.m265083a(str).mo238020d(new Function(str, str2) {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.$$Lambda$e$YujNJO0PKOoQBLpMDgD1LP_bPwo */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9422e.this.m38970a(this.f$1, this.f$2, (String) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ NetService.C5077f m38989c(String str, int i, String str2) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", str + "");
        hashMap.put("obj_type", i + "");
        C13479a.m54764b("FeedMessageManager", "get message from net: " + i);
        NetService.C5077f fVar = new NetService.C5077f("/api/message/get_message.v3/");
        fVar.mo20143a(1);
        fVar.mo20147a(hashMap);
        return fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Boolean m38970a(String str, String str2, String str3) throws Exception {
        AccountService.Account d = ((an) KoinJavaComponent.m268610a(an.class)).mo16406d();
        String a = m38973a(d.f14592i, d.f14584a);
        AbstractC9496i iVar = this.f25341e;
        if (iVar == null) {
            return false;
        }
        C0844e<Integer, String> a2 = iVar.mo23885a(a, str);
        if (a2 == null || TextUtils.isEmpty(a2.f3318b)) {
            int a3 = this.f25341e.mo23884a(a, str, str2);
            C13479a.m54764b("FeedMessageManager", "insert result:" + a3);
        } else if (a2.f3317a != null) {
            int a4 = this.f25341e.mo23883a(a2.f3317a.intValue(), a, str, str2);
            C13479a.m54764b("FeedMessageManager", "update result:" + a4);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m38971a(String str, int i, MessageResultBean messageResultBean) throws Exception {
        try {
            m38968a("rn", messageResultBean, str, i, true);
            return "";
        } catch (Exception e) {
            C13479a.m54761a("FeedMessageManager", e);
            return "";
        }
    }

    /* renamed from: a */
    private MessageResultBean m38967a(C9420b bVar, String str, int i, boolean z) throws JSONException {
        MessageResultBean messageResultBean;
        if ("network".equals(bVar.f25321a)) {
            messageResultBean = C9423f.m39003c(bVar.f25322b);
        } else {
            messageResultBean = C9423f.m38997a(bVar.f25322b);
        }
        return m38968a(bVar.f25321a, messageResultBean, str, i, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ String m38972a(String str, int i, boolean z, String str2) throws Exception {
        C0844e<Integer, String> eVar;
        C13479a.m54772d("FeedMessageManager", "get feed message from cache start...");
        AccountService.Account d = ((an) KoinJavaComponent.m268610a(an.class)).mo16406d();
        String a = m38973a(d.f14592i, d.f14584a);
        AbstractC9496i iVar = this.f25341e;
        if (iVar != null) {
            eVar = iVar.mo23885a(a, str);
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return "";
        }
        m38967a(new C9420b(eVar.f3318b, "cache"), str, i, z);
        return eVar.f3318b;
    }

    /* renamed from: a */
    private MessageResultBean m38968a(String str, MessageResultBean messageResultBean, String str2, int i, boolean z) {
        if (messageResultBean.getData().getMessage() == null) {
            C13479a.m54775e("FeedMessageManager", "message is empty");
            messageResultBean.getData().setMessage(Collections.emptyList());
        }
        C9423f.m39000a("feed manager parse data", messageResultBean, new int[2]);
        AccountService.Account d = ((an) KoinJavaComponent.m268610a(an.class)).mo16406d();
        if (str2.equals(this.f25339c) && z) {
            C9423f.m38999a(this.f25338b, messageResultBean, d.f14584a, str2, i, new C9419a(this.f25338b));
            this.f25340d.mo5926a(new C0844e<>(str, new FeedDataFilter().mo35902a(C13615c.f35773a, messageResultBean)));
        }
        return messageResultBean;
    }
}
