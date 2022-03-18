package com.ss.android.lark.voip;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.exception.crash.C37008a;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.vc.api.AbstractC57901c;
import com.ss.android.lark.voip.p2911a.AbstractC57983b;
import com.ss.android.lark.voip.p2911a.AbstractC57985c;
import com.ss.android.lark.voip.p2911a.AbstractC57987d;
import com.ss.android.lark.voip.p2912b.C58000a;
import com.ss.android.lark.voip.service.AbstractC58001a;
import com.ss.android.lark.voip.service.AbstractC58002c;
import com.ss.android.lark.voip.service.AbstractC58003d;
import com.ss.android.lark.voip.service.impl.C58138b;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.voip.service.impl.app.C58103o;
import com.ss.android.lark.voip.service.impl.notification.missed.C58161a;
import com.ss.android.lark.voip.service.impl.notification.p2917a.C58154a;
import com.ss.android.lark.voip.service.impl.p2914b.C58141a;
import com.ss.android.lark.voip.service.impl.service.C58168a;
import com.ss.android.lark.voip.service.impl.service.C58170b;
import com.ss.android.lark.voip.service.impl.service.C58186f;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.statistics.event.cb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.lark.voip.a */
public class C57977a {

    /* renamed from: a */
    private final AbstractC58001a f142670a = new C58138b();

    /* renamed from: b */
    private final ReentrantLock f142671b = new ReentrantLock();

    /* renamed from: c */
    private final AtomicBoolean f142672c = new AtomicBoolean(false);

    /* renamed from: d */
    public AbstractC58001a mo196604d() {
        return this.f142670a;
    }

    /* renamed from: k */
    private boolean m224906k() {
        return this.f142672c.get();
    }

    /* renamed from: n */
    private void m224909n() {
        C58186f.m225741a().mo197151b();
    }

    /* renamed from: c */
    public static AbstractC57987d m224905c() {
        return (AbstractC57987d) ApiUtils.getApi(AbstractC57987d.class);
    }

    /* renamed from: b */
    public void mo196602b() {
        mo196596a();
        this.f142670a.mo196631d();
    }

    /* renamed from: e */
    public boolean mo196605e() {
        return C58103o.m225371a().mo196952i();
    }

    /* renamed from: g */
    public boolean mo196607g() {
        return C58168a.m225700a().mo197123b();
    }

    /* renamed from: h */
    public C58000a mo196608h() {
        return C58168a.m225700a().mo197124c();
    }

    /* renamed from: i */
    public int mo196609i() {
        return C58168a.m225700a().mo197125d();
    }

    /* renamed from: j */
    public int mo196610j() {
        return C58168a.m225700a().mo197126e();
    }

    /* renamed from: f */
    public List<AbstractNotification> mo196606f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C58154a());
        arrayList.add(new C58161a());
        return arrayList;
    }

    /* renamed from: l */
    private void m224907l() {
        m224909n();
        mo196604d().mo196627a(m224905c().getContext());
        m224908m();
        C37008a.m146044a().mo136535a(m224902a(m224905c().getContext()));
    }

    /* renamed from: m */
    private void m224908m() {
        m224905c().getAppStateDependency().mo145494a(new AbstractC57983b.AbstractC57984a() {
            /* class com.ss.android.lark.voip.C57977a.C579781 */

            @Override // com.ss.android.lark.voip.p2911a.AbstractC57983b.AbstractC57984a
            /* renamed from: a */
            public void mo196611a(boolean z) {
                C57977a.this.mo196601a(z);
            }
        });
        m224905c().getWsChannelDependency().mo145495a(new AbstractC57987d.AbstractC57998i.AbstractC57999a() {
            /* class com.ss.android.lark.voip.C57977a.C579792 */

            @Override // com.ss.android.lark.voip.p2911a.AbstractC57987d.AbstractC57998i.AbstractC57999a
            /* renamed from: a */
            public void mo196612a(boolean z) {
                C57977a.this.mo196603b(z);
            }
        });
        m224905c().getLoginDependency().mo145498a(new AbstractC57985c.AbstractC57986a() {
            /* class com.ss.android.lark.voip.C57977a.C579803 */

            @Override // com.ss.android.lark.voip.p2911a.AbstractC57985c.AbstractC57986a
            /* renamed from: a */
            public boolean mo196613a() {
                return C57977a.this.mo196607g();
            }

            @Override // com.ss.android.lark.voip.p2911a.AbstractC57985c.AbstractC57986a
            /* renamed from: b */
            public C58000a mo196614b() {
                return C57977a.this.mo196608h();
            }

            @Override // com.ss.android.lark.voip.p2911a.AbstractC57985c.AbstractC57986a
            /* renamed from: c */
            public int mo196615c() {
                return C57977a.this.mo196609i();
            }

            @Override // com.ss.android.lark.voip.p2911a.AbstractC57985c.AbstractC57986a
            /* renamed from: d */
            public int mo196616d() {
                return C57977a.this.mo196610j();
            }
        });
    }

    /* renamed from: a */
    public void mo196596a() {
        if (!m224906k()) {
            try {
                this.f142671b.lock();
                if (!m224906k()) {
                    C58151d.m225577a("VoIpModule", "[checkAndInit]");
                    m224907l();
                    this.f142672c.compareAndSet(false, true);
                    mo196602b();
                    m224905c().initVideoChat();
                    this.f142671b.unlock();
                }
            } finally {
                this.f142671b.unlock();
            }
        }
    }

    /* renamed from: a */
    private C58141a m224902a(Context context) {
        return new C58141a(context);
    }

    /* renamed from: b */
    public void mo196603b(boolean z) {
        if (z) {
            C58151d.m225578a("rust", "ui", "wschannel connected", "[VoIpModule] handleOnConnStateChanged: wschannel connected");
            C58103o.m225371a().mo196935a(true);
        }
    }

    /* renamed from: a */
    public void mo196599a(AbstractC58002c cVar) {
        C58103o.m225371a().mo196929a(cVar);
    }

    /* renamed from: a */
    public void mo196600a(AbstractC58003d dVar) {
        C58103o.m225371a().mo196930a(dVar);
    }

    /* renamed from: a */
    public void mo196601a(boolean z) {
        C58170b.m225706a().mo197128a(z);
    }

    /* renamed from: a */
    public void mo196597a(Activity activity, OpenChatter openChatter, String str) {
        mo196596a();
        this.f142670a.mo196625a(activity, openChatter, str);
    }

    /* renamed from: a */
    public void mo196598a(Activity activity, OpenChatter openChatter, String str, AbstractC57901c cVar) {
        C58151d.m225577a("VoIpModule", "[startVoIpActivityCheckPermission]");
        mo196596a();
        if (m224905c().getVideoChatDependency().mo145480d()) {
            VCDialogUtils.m236174a((int) R.string.View_G_WatchingLivestream, 2, UIHelper.getString(R.string.View_G_WatchingLivestreamInfo), (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$a$JCKD9pNpa_lf4lmdVp06wht1ffk.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(activity, openChatter, str, cVar) {
                /* class com.ss.android.lark.voip.$$Lambda$a$Ahgz5H4ojn7IYtYbr34bs1woc3U */
                public final /* synthetic */ Activity f$1;
                public final /* synthetic */ OpenChatter f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ AbstractC57901c f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C57977a.this.m224903a(this.f$1, this.f$2, this.f$3, this.f$4, dialogInterface, i);
                }
            }, true);
        } else {
            this.f142670a.mo196626a(activity, openChatter, str, cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m224903a(Activity activity, OpenChatter openChatter, String str, AbstractC57901c cVar, DialogInterface dialogInterface, int i) {
        cb.m250253a("confirm");
        m224905c().getVideoChatDependency().mo145481e();
        this.f142670a.mo196626a(activity, openChatter, str, cVar);
    }
}
