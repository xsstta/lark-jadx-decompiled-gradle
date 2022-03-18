package com.bytedance.ee.bear.middleground.feed.p457e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.C0844e;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.architecture.DisposableBase;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.net.C5201a;
import com.bytedance.ee.bear.contract.net.DefaultResponse;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9494g;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9495h;
import com.bytedance.ee.bear.middleground.feed.export.bean.BaseFeedMessageDetailBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.CardBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageConfig;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.middleground.feed.p453a.C9419a;
import com.bytedance.ee.bear.middleground.feed.p453a.C9420b;
import com.bytedance.ee.bear.middleground.feed.p453a.C9422e;
import com.bytedance.ee.bear.middleground.feed.p453a.C9423f;
import com.bytedance.ee.bear.middleground.feed.statistics.FeedReportV2;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.feed.e.c */
public class C9486c extends DisposableBase {

    /* renamed from: a */
    public static volatile long f25495a;

    /* renamed from: b */
    public final AbstractC9494g f25496b;

    /* renamed from: c */
    private final AbstractC9492e f25497c;

    /* renamed from: d */
    private final C10917c f25498d;

    /* renamed from: e */
    private MessageConfig f25499e;

    /* renamed from: f */
    private Runnable f25500f = new Runnable() {
        /* class com.bytedance.ee.bear.middleground.feed.p457e.C9486c.RunnableC94871 */

        public void run() {
            C9486c.this.mo36082j();
        }
    };

    /* renamed from: g */
    private C1177w<List<AbstractC9495h>> f25501g = new C1177w<>();

    /* renamed from: h */
    private C1177w<Integer> f25502h = new C1177w<>();

    /* renamed from: i */
    private LiveData<C0844e<String, List<AbstractC9495h>>> f25503i;

    /* renamed from: j */
    private MessageResultBean f25504j;

    /* renamed from: k */
    private Disposable f25505k;

    /* renamed from: l */
    private Disposable f25506l;

    /* renamed from: m */
    private C9419a f25507m;

    /* renamed from: n */
    private boolean f25508n = true;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public LiveData<Integer> mo36070b() {
        return this.f25502h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C10917c mo36077e() {
        return this.f25498d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public MessageConfig mo36078f() {
        return this.f25499e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC9494g mo36079g() {
        return this.f25496b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo36080h() {
        return this.f25508n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36062a(LifecycleOwner lifecycleOwner) {
        FeedReportV2.f25356a.mo35973m();
        this.f25501g.mo5922a(lifecycleOwner);
        this.f25502h.mo5922a(lifecycleOwner);
        this.f25499e.setAuto(false);
        this.f25507m.mo35897a();
        mo36059a(this.f25499e.isOwner(), "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36061a(Context context, List<String> list) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C13479a.m54764b("PanelViewModel", "readMessages:" + elapsedRealtimeNanos);
        if (this.f25504j != null) {
            C13479a.m54764b("PanelViewModel", "readMessage messageResultBean != null");
            try {
                List<MessageBean> message = this.f25504j.getData().getMessage();
                for (String str : list) {
                    Iterator<MessageBean> it = message.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MessageBean next = it.next();
                        if (Objects.equals(str, next.getMessageId())) {
                            C13479a.m54764b("PanelViewModel", "local readMessage: " + str + " " + next.getCreateTime());
                            next.setReadStatus(2);
                            break;
                        }
                    }
                }
                C13479a.m54764b("PanelViewModel", "end readMessages:" + (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos));
                this.f25496b.mo23346a(list);
                mo36064a(this.f25504j, context);
            } catch (Exception e) {
                C13479a.m54761a("PanelViewModel", e);
            }
        }
        if (m39211a(this.f25498d)) {
            mo36081i();
        }
        this.f25507m.mo35900a(list, this.f25499e.getToken(), this.f25499e.getDocumentType().mo32555b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36065a(String str) {
        C9419a.m38934a(this.f25498d, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36066a(String str, Context context) {
        AbstractC68307f<MessageResultBean> a = AbstractC68307f.m265083a(str).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$c$PcodwDHmQa6zk1RAQtkA20KNnMY */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9486c.this.m39217d((String) obj);
            }
        }).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$c$aFXIED4hoSiMkwh_B85YWku2A */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9486c.this.m39203a((MessageResultBean) obj);
            }
        }).mo237985a(C11678b.m48480d());
        mo16332b(this.f25506l);
        mo16332b(this.f25505k);
        Disposable a2 = m39204a(a);
        this.f25506l = a2;
        mo16331a(a2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36064a(MessageResultBean messageResultBean, Context context) {
        this.f25504j = messageResultBean;
        AbstractC68307f<MessageResultBean> a = AbstractC68307f.m265083a(messageResultBean);
        mo16332b(this.f25505k);
        Disposable a2 = m39204a(a);
        this.f25505k = a2;
        mo16331a(a2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36069a(Context context, String str, ValueAnimator valueAnimator) {
        Exception e;
        final MessageBean messageBean;
        String str2;
        boolean z = false;
        try {
            List<MessageBean> message = this.f25504j.getData().getMessage();
            Iterator<MessageBean> it = message.iterator();
            while (true) {
                if (!it.hasNext()) {
                    messageBean = null;
                    break;
                }
                MessageBean next = it.next();
                if (str.equals(next.getMessageId())) {
                    messageBean = next;
                    break;
                }
            }
            if (messageBean == null) {
                C13479a.m54758a("PanelViewModel", "can't found messageId:" + str);
                return false;
            }
            C13479a.m54764b("PanelViewModel", "at:" + messageBean.getType() + " messageId:" + str + " isWhole:" + messageBean.getIs_whole() + " commentId:" + messageBean.getComment_id() + " replyId:" + messageBean.getReply_id());
            String str3 = "";
            if (!CardBean.isComment(messageBean)) {
                if (!"MESSAGE_DOC_COMMENT".equals(messageBean.getType())) {
                    if (!"MESSAGE_DOC_MENTION".equals(messageBean.getType())) {
                        this.f25496b.mo23342a(messageBean);
                    } else if (messageBean.isOriginContentDelete()) {
                        Toast.showText(context, (int) R.string.Doc_Feed_At_OriginText_Deleted);
                        str2 = str3;
                        m39206a(context, str, message, messageBean, str2);
                        return z;
                    } else {
                        try {
                            this.f25496b.mo23342a(messageBean);
                        } catch (Exception e2) {
                            e = e2;
                            z = true;
                            C13479a.m54761a("PanelViewModel", e);
                            return z;
                        }
                    }
                    str2 = str3;
                    z = true;
                    m39206a(context, str, message, messageBean, str2);
                    return z;
                }
            }
            str3 = messageBean.getComment_id();
            if (messageBean.getFinish() == 1) {
                Toast.showText(context, (int) R.string.Doc_Feed_Comment_Resolve);
            } else if (messageBean.getDelete() == 1) {
                Toast.showText(context, (int) R.string.Doc_Feed_Comment_Delete);
            } else if (messageBean.isOriginContentDelete()) {
                Toast.showText(context, (int) R.string.Doc_Feed_Comment_OriginText_Deleted);
            } else {
                if (!((AbstractC9224g) KoinJavaComponent.m268610a(AbstractC9224g.class)).mo34614c().mo34623d() || messageBean.getIs_whole() != 0) {
                    valueAnimator.removeAllListeners();
                    this.f25496b.mo23342a(messageBean);
                } else {
                    valueAnimator.addListener(new AnimatorListenerAdapter() {
                        /* class com.bytedance.ee.bear.middleground.feed.p457e.C9486c.C94882 */

                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C9486c.this.f25496b.mo23342a(messageBean);
                        }
                    });
                    valueAnimator.start();
                }
                str2 = str3;
                z = true;
                m39206a(context, str, message, messageBean, str2);
                return z;
            }
            str2 = str3;
            m39206a(context, str, message, messageBean, str2);
            return z;
        } catch (Exception e3) {
            e = e3;
            C13479a.m54761a("PanelViewModel", e);
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36068a(boolean z) {
        C13479a.m54764b("PanelViewModel", "setFirstUpdateData:" + z);
        this.f25508n = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36063a(MessageConfig messageConfig) {
        this.f25499e = messageConfig;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36060a(Context context) {
        MessageResultBean messageResultBean = this.f25504j;
        if (messageResultBean != null) {
            mo36064a(messageResultBean, context);
        }
    }

    /* renamed from: a */
    public void mo36067a(String str, C10917c cVar) {
        AbstractC9494g gVar;
        if (TextUtils.isEmpty(str) || (gVar = this.f25496b) == null) {
            C13479a.m54758a("PanelViewModel", "gotoProfile()... userid is empty or  feedListener is null");
        } else {
            gVar.mo23345a(str, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo36076d() {
        return C4484g.m18494b().mo17252c();
    }

    /* renamed from: i */
    public void mo36081i() {
        C13742g.m55710c(this.f25500f);
        C13742g.m55706a(this.f25500f, 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo36073c() {
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f == null || f.f14584a == null) {
            return "";
        }
        return f.f14584a;
    }

    /* renamed from: k */
    private void m39219k() {
        C13479a.m54764b("PanelViewModel", "getDataFromRN");
        C13479a.m54772d("zxzxxx", "getDataFromRN");
        mo36059a(this.f25499e.isOwner(), "").mo238004b(C11678b.m48478b()).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$c$zqmnMGpLEzOhut48w4Yhy7vUbo.INSTANCE, $$Lambda$c$IgXhVcxl8IgxHCU0liqpMex3c.INSTANCE);
    }

    /* renamed from: l */
    private void m39220l() {
        FeedReportV2.f25356a.mo35963c("stage_native_check_permission");
        NetService.C5077f fVar = new NetService.C5077f("/api/message/get_message.v3/");
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", this.f25499e.getToken() + "");
        hashMap.put("obj_type", this.f25499e.getDocumentType().mo32555b() + "");
        fVar.mo20147a(hashMap);
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C5201a());
        if (a != null) {
            mo16331a(a.mo20141a(fVar).mo238001b($$Lambda$c$a6RXvED1Er0ocWGmenLTtMtUScM.INSTANCE, new Consumer() {
                /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$c$w4cDVnlVGYtSsLtxhPYDhDVqwtk */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C9486c.this.m39214b((C9486c) ((Throwable) obj));
                }
            }));
        }
    }

    /* renamed from: j */
    public void mo36082j() {
        C13479a.m54764b("PanelViewModel", "message_sync");
        NetService.C5077f fVar = new NetService.C5077f("/api/notice/message_sync");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("obj_token", this.f25499e.getToken());
            jSONObject.put("obj_type", this.f25499e.getDocumentType().mo32555b());
        } catch (Exception e) {
            C13479a.m54761a("PanelViewModel", e);
        }
        fVar.mo20153c(jSONObject.toString());
        ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C5201a()).mo20141a(fVar).mo238001b($$Lambda$c$WCyGjR5Wzwj0l3WFtZBqLddi1NE.INSTANCE, $$Lambda$c$3AqBBROgFFea_tHudcako8dFAU.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ MessageResultBean m39203a(MessageResultBean messageResultBean) throws Exception {
        this.f25504j = messageResultBean;
        return messageResultBean;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m39212b(DefaultResponse defaultResponse) throws Exception {
        FeedReportV2.f25356a.mo35960b("stage_native_check_permission");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LiveData<List<AbstractC9495h>> mo36075d(LifecycleOwner lifecycleOwner) {
        mo36074c(lifecycleOwner);
        return this.f25501g;
    }

    /* renamed from: a */
    public static boolean m39211a(C10917c cVar) {
        if (C4511g.m18594d().mo17344E() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Disposable m39204a(AbstractC68307f<MessageResultBean> fVar) {
        return C9422e.m38966a(this.f25498d).mo35917a(fVar, this.f25499e.getToken(), this.f25499e.getDocumentType().mo32555b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36071b(LifecycleOwner lifecycleOwner) {
        this.f25504j = null;
        this.f25501g.mo5929b((List<AbstractC9495h>) null);
        this.f25502h.mo5929b((Integer) null);
        LiveData<C0844e<String, List<AbstractC9495h>>> liveData = this.f25503i;
        if (liveData != null) {
            liveData.mo5922a(lifecycleOwner);
        }
        this.f25497c.mo35924a();
        mo16330a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m39208a(DefaultResponse defaultResponse) throws Exception {
        C13479a.m54764b("PanelViewModel", "message_sync code = " + defaultResponse.code + " msg = " + defaultResponse.msg);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ String m39215c(String str) throws Exception {
        try {
            MessageResultBean.Data.Badge badge = C9423f.m39002b(str).getData().getBadge();
            if (badge != null) {
                C9419a.m38935a(this.f25498d, this.f25499e.getToken(), badge.getCount(), badge.getVer());
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m39214b(Throwable th) throws Exception {
        FeedReportV2.f25356a.mo35956a("stage_native_check_permission", FeedReportV2.f25356a.mo35951a(th));
        if (th instanceof NetService.ServerErrorException) {
            int code = ((NetService.ServerErrorException) th).getCode();
            C13479a.m54764b("PanelViewModel", "permission code: " + code);
            if (code == 4) {
                this.f25502h.mo5926a((Integer) 4);
                this.f25507m.mo35899a(this.f25499e.getToken(), this.f25499e.getDocumentType().mo32555b());
                return;
            }
            return;
        }
        C13479a.m54759a("PanelViewModel", "permission code:", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ MessageResultBean m39217d(String str) throws Exception {
        int i;
        MessageResultBean a = C9423f.m38997a(C9423f.m39004d(str).toString());
        try {
            i = a.getData().getMessage().size();
        } catch (Exception e) {
            C13479a.m54761a("PanelViewModel", e);
            i = 0;
        }
        C13479a.m54764b("PanelViewModel", "from web, messageCount:" + i);
        C9423f.m38999a(this.f25498d, a, mo36073c(), this.f25499e.getToken(), this.f25499e.getDocumentType().mo32555b(), this.f25507m);
        return a;
    }

    /* renamed from: e */
    private void m39218e(LifecycleOwner lifecycleOwner) {
        C13479a.m54764b("PanelViewModel", "feed panel start get data...");
        this.f25502h.mo5929b((Integer) 1);
        this.f25503i = C9422e.m38966a(this.f25498d).mo35916a(this.f25499e.getToken(), this.f25499e.getDocumentType().mo32555b());
        C9422e.m38966a(this.f25498d).mo35921a();
        this.f25503i.mo5923a(lifecycleOwner, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$c$I1EffSkdnqPq7B7jH8HeVgV8MM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C9486c.this.m39207a((C9486c) ((C0844e) obj));
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo36074c(LifecycleOwner lifecycleOwner) {
        if (this.f25502h.mo5927b() != null && this.f25502h.mo5927b().intValue() == 3) {
            m39218e(lifecycleOwner);
            m39219k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m39207a(C0844e eVar) {
        int i = 2;
        if (eVar == null || eVar.f3318b == null) {
            this.f25502h.mo5929b((Integer) 2);
            return;
        }
        C13479a.m54764b("PanelViewModel", "feed panel  get data success:" + (SystemClock.elapsedRealtime() - f25495a) + " source:" + ((String) eVar.f3317a));
        C1177w<Integer> wVar = this.f25502h;
        if (!eVar.f3318b.isEmpty()) {
            i = 0;
        }
        wVar.mo5929b(Integer.valueOf(i));
        this.f25501g.mo5929b((List<AbstractC9495h>) eVar.f3318b);
        if (!eVar.f3317a.equals("rn") && FeedReportV2.f25356a.mo35962c().get() && !FeedReportV2.f25356a.mo35959b().getAndSet(true)) {
            FeedReportV2.f25356a.mo35970j();
        }
        if ((eVar.f3317a.equals("rn") || eVar.f3317a.equals("network")) && FeedReportV2.f25356a.mo35962c().get() && !FeedReportV2.f25356a.mo35952a().getAndSet(true)) {
            FeedReportV2.f25356a.mo35971k();
            FeedReportV2.f25356a.mo35953a(new C9420b("", eVar.f3317a));
            FeedReportV2.f25356a.mo35972l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36072b(String str, String str2) {
        this.f25497c.mo35926a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public BaseFeedMessageDetailBean mo36058a(String str, String str2) {
        MessageResultBean messageResultBean = this.f25504j;
        if (messageResultBean == null) {
            return null;
        }
        try {
            for (MessageBean messageBean : messageResultBean.getData().getMessage()) {
                if (Objects.equals(str2, messageBean.getReply_id())) {
                    return messageBean;
                }
            }
            return null;
        } catch (Exception e) {
            C13479a.m54759a("PanelViewModel", "get comment reply error", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AbstractC68307f<String> mo36059a(boolean z, String str) {
        return this.f25497c.mo35923a(z, str).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$c$keBYVP3J9ArBuqQDmIERyuerkLc */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9486c.this.m39215c((String) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Unit m39205a(C10917c cVar, MessageConfig messageConfig, AbstractC9494g gVar, String str) {
        try {
            MessageResultBean a = C9423f.m38997a(str);
            int[] iArr = new int[2];
            C13479a.m54772d("zxzxxx", "registerDataListener: removeDispose getDataDisposable getDataFromCacheDisposable, " + str.length());
            C9423f.m39000a("update measage", a, iArr);
            C9423f.m38999a(cVar, a, mo36073c(), messageConfig.getToken(), messageConfig.getDocumentType().mo32555b(), this.f25507m);
            if (iArr[0] != 0) {
                C9422e.m38966a(cVar).mo35920a(messageConfig.getToken(), messageConfig.getDocumentType().mo32555b(), str);
            }
            C13742g.m55705a(new Runnable(iArr, str, a) {
                /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$c$rtV8eZJzaDVQRoPkCx7TXNN2s */
                public final /* synthetic */ int[] f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ MessageResultBean f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    C9486c.m39209a(AbstractC9494g.this, this.f$1, this.f$2, this.f$3);
                }
            });
        } catch (Throwable th) {
            C13479a.m54759a("PanelViewModel", "message update error ", th);
        }
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m39209a(AbstractC9494g gVar, int[] iArr, String str, MessageResultBean messageResultBean) {
        gVar.mo23348b(iArr[1]);
        C13479a.m54772d("zxzxxx", "registerDataListener: dataChange, " + str.length());
        gVar.mo23344a(str);
        gVar.mo23343a(messageResultBean, "rn");
    }

    C9486c(AbstractC9492e eVar, AbstractC9494g gVar, C10917c cVar, MessageConfig messageConfig, LifecycleOwner lifecycleOwner) {
        this.f25497c = eVar;
        this.f25496b = gVar;
        this.f25498d = cVar;
        this.f25499e = messageConfig;
        this.f25507m = new C9419a(cVar);
        FeedReportV2.f25356a.mo35975o();
        m39220l();
        m39218e(lifecycleOwner);
        eVar.mo35927a(new Function1(cVar, messageConfig, gVar) {
            /* class com.bytedance.ee.bear.middleground.feed.p457e.$$Lambda$c$k2h77MftmYvuuHplkJsnkAos6JA */
            public final /* synthetic */ C10917c f$1;
            public final /* synthetic */ MessageConfig f$2;
            public final /* synthetic */ AbstractC9494g f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9486c.this.m39205a(this.f$1, this.f$2, this.f$3, (String) obj);
            }
        });
    }

    /* renamed from: a */
    private void m39206a(Context context, String str, List<MessageBean> list, MessageBean messageBean, String str2) {
        if (TextUtils.isEmpty(str2)) {
            this.f25497c.mo35928a(new String[]{str}, this.f25499e.isOwner());
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        for (MessageBean messageBean2 : list) {
            if ("MESSAGE_DOC_COMMENT".equals(messageBean.getType()) && !str.equals(messageBean2.getMessageId()) && str2.equals(messageBean2.getComment_id())) {
                arrayList.add(messageBean2.getMessageId());
                messageBean2.setSolveStatus(1);
            }
        }
        C13479a.m54764b("PanelViewModel", "solve messages:" + arrayList.size());
        mo36064a(this.f25504j, context);
        this.f25497c.mo35928a((String[]) arrayList.toArray(new String[0]), this.f25499e.isOwner());
    }
}
