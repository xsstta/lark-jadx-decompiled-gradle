package com.ss.android.lark.chat.service.impl;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.PushChannelNickname;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.service.AbstractC34122c;
import com.ss.android.lark.chat.service.AbstractC34296k;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57309d;
import com.ss.android.lark.p2851u.p2852a.C57314g;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.chat.service.impl.g */
public class C34209g {

    /* renamed from: a */
    public List<AbstractC29623p> f88505a;

    /* renamed from: b */
    public List<AbstractC34214b> f88506b;

    /* renamed from: c */
    public List<AbstractC29627s> f88507c;

    /* renamed from: d */
    private AbstractC34296k f88508d;

    /* renamed from: e */
    private AbstractC34122c f88509e;

    /* renamed from: f */
    private AbstractC36450aa f88510f;

    /* renamed from: g */
    private List<Object> f88511g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.g$a */
    public static class C34213a {

        /* renamed from: a */
        public static final C34209g f88520a = new C34209g();
    }

    /* renamed from: com.ss.android.lark.chat.service.impl.g$b */
    public interface AbstractC34214b {
        /* renamed from: a */
        void mo123066a(String str, String str2, Channel channel);
    }

    /* renamed from: a */
    public static C34209g m132771a() {
        return C34213a.f88520a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m132774b() {
        C53248k.m205912a().mo181696a(Command.PUSH_CHATTERS);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m132777c() {
        C53248k.m205912a().mo181697a(Command.PUSH_CHATTERS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$g$tHBWj59k_HoVsR9jKbQMsWwQi0 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34209g.this.m132773a(bArr, str, z, z2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m132778d() {
        C53248k.m205912a().mo181696a(Command.PUSH_CHANNEL_NICKNAME);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m132779e() {
        C53248k.m205912a().mo181697a(Command.PUSH_CHANNEL_NICKNAME, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$g$QFWFHDLZrITpI0qBtFxKBv2SKFM */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public final void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C34209g.this.m132776b(bArr, str, z, z2);
            }
        });
    }

    private C34209g() {
        this.f88505a = new CopyOnWriteArrayList();
        this.f88506b = new CopyOnWriteArrayList();
        this.f88507c = new CopyOnWriteArrayList();
        this.f88511g = new CopyOnWriteArrayList();
        this.f88508d = C32821b.m126120a();
        this.f88510f = C29990c.m110930b().mo134515N();
        this.f88509e = C34206f.m132767a();
    }

    /* renamed from: b */
    private void m132775b(Object obj) {
        C53246j.m205911b(this.f88511g, obj, $$Lambda$g$b9uj9CFx0GTNkP_KSl_gf7S_aI.INSTANCE);
    }

    /* renamed from: a */
    private void m132772a(Object obj) {
        C53246j.m205910a(this.f88511g, obj, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$g$vQkgSpsEuWyGCg5tLLyHPf3Sew */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34209g.this.m132777c();
            }
        });
    }

    /* renamed from: a */
    public void mo126756a(AbstractC29623p pVar) {
        this.f88505a.add(pVar);
        m132772a((Object) pVar);
    }

    /* renamed from: b */
    public void mo126760b(AbstractC29623p pVar) {
        this.f88505a.remove(pVar);
        m132775b((Object) pVar);
    }

    /* renamed from: a */
    public void mo126757a(AbstractC29627s sVar) {
        this.f88507c.add(sVar);
        m132772a((Object) sVar);
    }

    /* renamed from: b */
    public void mo126761b(AbstractC29627s sVar) {
        this.f88507c.remove(sVar);
        m132775b((Object) sVar);
    }

    /* renamed from: a */
    public void mo126758a(final Chatter chatter) {
        if (chatter.getId().equals(this.f88510f.mo134394a())) {
            final Chat g = this.f88508d.mo121064g(chatter.getId());
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.C34209g.RunnableC342123 */

                public void run() {
                    for (AbstractC29627s sVar : C34209g.this.f88507c) {
                        sVar.onPushMineChatterChanged(chatter, g);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public void mo126762b(AbstractC34214b bVar) {
        C53246j.m205911b(this.f88506b, bVar, $$Lambda$g$dTK1seDgaZaegcn1pmu_DTm0ECw.INSTANCE);
    }

    /* renamed from: a */
    public void mo126759a(AbstractC34214b bVar) {
        C53246j.m205910a(this.f88506b, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.chat.service.impl.$$Lambda$g$leIhYICZH5JqOao3KTO2Jp8F_ys */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public final void handle() {
                C34209g.this.m132779e();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m132776b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            final PushChannelNickname decode = PushChannelNickname.ADAPTER.decode(bArr);
            final Channel a = C57309d.m222073a(decode.channel);
            this.f88509e.mo126550a(a.getId());
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.chat.service.impl.C34209g.RunnableC342112 */

                public void run() {
                    for (AbstractC34214b bVar : C34209g.this.f88506b) {
                        bVar.mo123066a(decode.user_id, decode.nickname, a);
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
            Log.m165387e("ChatterPush", (Throwable) e, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m132773a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            C33982a b = C57314g.m222106b(C14928Entity.ADAPTER.decode(bArr));
            Map<String, Chatter> a = b.mo124894a();
            a.putAll(b.mo124898c());
            for (Map.Entry<String, Chatter> entry : a.entrySet()) {
                final Chatter value = entry.getValue();
                this.f88509e.mo126550a(entry.getKey());
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.chat.service.impl.C34209g.RunnableC342101 */

                    public void run() {
                        for (AbstractC29623p pVar : C34209g.this.f88505a) {
                            pVar.onPushChatter(value);
                        }
                    }
                });
                mo126758a(value);
            }
        } catch (Exception e) {
            Log.m165387e("ChatterPush", (Throwable) e, true);
        }
    }
}
