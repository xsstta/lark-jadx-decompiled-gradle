package com.ss.android.lark.integrator.im.chat.dependency;

import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.ao;
import com.ss.android.lark.dependency.an;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.p2392o.AbstractC48707q;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.af */
public class C39503af implements an {

    /* renamed from: a */
    private Map<AbstractC48707q, ao> f100929a = new ConcurrentHashMap();

    @Override // com.ss.android.lark.dependency.an
    /* renamed from: a */
    public boolean mo134469a() {
        if (C39603g.m157159a().getCoreDependency().mo143579e().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.dependency.an
    /* renamed from: a */
    public void mo134468a(AbstractC48707q qVar) {
        $$Lambda$af$G6_53UabD9hnw4h9lVH_xf7Od0U r0 = new ao() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$af$G6_53UabD9hnw4h9lVH_xf7Od0U */

            @Override // com.ss.android.lark.biz.core.api.ao
            public final void onTimeFormatChange(TimeFormatSetting timeFormatSetting) {
                C39503af.lambda$G6_53UabD9hnw4h9lVH_xf7Od0U(AbstractC48707q.this, timeFormatSetting);
            }
        };
        C39603g.m157159a().getCoreDependency().mo143470a(r0);
        this.f100929a.put(qVar, r0);
    }

    @Override // com.ss.android.lark.dependency.an
    /* renamed from: b */
    public void mo134470b(AbstractC48707q qVar) {
        ao aoVar = this.f100929a.get(qVar);
        this.f100929a.remove(qVar);
        if (aoVar != null) {
            C39603g.m157159a().getCoreDependency().mo143540b(aoVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m156079a(AbstractC48707q qVar, TimeFormatSetting timeFormatSetting) {
        boolean z;
        if (timeFormatSetting.mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
            z = true;
        } else {
            z = false;
        }
        qVar.mo123873a(z);
    }
}
