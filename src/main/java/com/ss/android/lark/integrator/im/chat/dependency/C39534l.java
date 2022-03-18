package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.dependency.AbstractC36504r;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.interfaces.AbstractC38098i;
import com.ss.android.lark.feed.service.p1884a.AbstractC38117a;
import com.ss.android.lark.integrator.im.p2029i.C39640a;
import com.ss.android.lark.listener.OnBadgeChangeListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.l */
class C39534l implements AbstractC36504r {

    /* renamed from: d */
    private static Map<OnBadgeChangeListener, AbstractC38098i.AbstractC38100b> f100987d = new ConcurrentHashMap();

    /* renamed from: a */
    C37262a f100988a;

    /* renamed from: b */
    AbstractC38098i f100989b;

    /* renamed from: c */
    AbstractC38117a f100990c = this.f100988a.mo136981e();

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: c */
    public String mo134695c() {
        return "switch_to_inbox";
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: a */
    public int mo134686a() {
        return this.f100989b.mo137460i();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: b */
    public String mo134692b() {
        return this.f100989b.mo137459h();
    }

    C39534l() {
        C37262a a = C39640a.m157299a();
        this.f100988a = a;
        this.f100989b = a.mo136983g();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: b */
    public void mo134694b(String str) {
        this.f100990c.mo139436a(str, FeedCard.Type.CHAT);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: a */
    public void mo134688a(Channel channel) {
        this.f100990c.mo139432a(channel);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: b */
    public void mo134693b(OnBadgeChangeListener rVar) {
        AbstractC38098i.AbstractC38100b bVar;
        if (rVar != null && (bVar = f100987d.get(rVar)) != null) {
            f100987d.remove(rVar);
            this.f100989b.mo137453b(bVar);
        }
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: a */
    public void mo134690a(OnBadgeChangeListener rVar) {
        rVar.getClass();
        $$Lambda$QE4iygW8tjwphP6qOGhuXg7BP4w r0 = new AbstractC38098i.AbstractC38100b() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$QE4iygW8tjwphP6qOGhuXg7BP4w */

            @Override // com.ss.android.lark.feed.interfaces.AbstractC38098i.AbstractC38100b
            public final void onBadgeChange(int i) {
                OnBadgeChangeListener.this.mo123062a(i);
            }
        };
        this.f100989b.mo137447a(r0);
        f100987d.put(rVar, r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: a */
    public void mo134691a(String str) {
        this.f100990c.mo139438b(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: a */
    public void mo134687a(Context context, String str) {
        C39640a.m157299a().mo136975a(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36504r
    /* renamed from: a */
    public void mo134689a(Channel channel, int i) {
        this.f100990c.mo139433a(channel, i);
    }
}
