package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.r */
class C39543r implements AbstractC36450aa {

    /* renamed from: a */
    AbstractC49389b f100999a = C39603g.m157159a().getPassportDependency().mo143678i();

    /* renamed from: b */
    private ConcurrentHashMap<AbstractC36450aa.AbstractC36451a, AbstractC49379a> f101000b = new ConcurrentHashMap<>();

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: b */
    public boolean mo134399b() {
        return this.f100999a.mo172429j();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: c */
    public String mo134400c() {
        return this.f100999a.mo172424e();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: d */
    public boolean mo134401d() {
        return this.f100999a.mo172430k();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: f */
    public boolean mo134403f() {
        return this.f100999a.mo172423d();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: g */
    public boolean mo134404g() {
        return this.f100999a.mo172428i();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: a */
    public String mo134394a() {
        String c = this.f100999a.mo172422c();
        if (c == null) {
            return "";
        }
        return c;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: e */
    public boolean mo134402e() {
        return C39603g.m157159a().getCoreDependency().mo143397W();
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: h */
    public String mo134405h() {
        LoginInfo a = this.f100999a.mo172419a();
        if (a != null) {
            return a.getTenantId();
        }
        return "";
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: i */
    public boolean mo134406i() {
        if (this.f100999a.mo172421b().getTenantTag() != 0) {
            return true;
        }
        return false;
    }

    C39543r() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: a */
    public boolean mo134398a(String str) {
        return this.f100999a.mo172420a(str);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: a */
    public void mo134395a(Context context) {
        C39603g.m157159a().getPassportDependency().mo143682m().mo172412a(context, true, "NoLoginData makes logout. Activity onCreate but not login", null);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: a */
    public void mo134397a(AbstractC36450aa.AbstractC36451a aVar) {
        $$Lambda$r$FHnHVUo_GjR7wn2PlgJDiWcXvB8 r0 = new AbstractC49379a() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$r$FHnHVUo_GjR7wn2PlgJDiWcXvB8 */

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102549a(C49380b bVar) {
                AbstractC49379a.CC.$default$a(this, bVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102550a(C49381c cVar) {
                AbstractC49379a.CC.$default$a(this, cVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            public final void onUserSwitchSuccess(C49382d dVar) {
                C39543r.lambda$FHnHVUo_GjR7wn2PlgJDiWcXvB8(AbstractC36450aa.AbstractC36451a.this, dVar);
            }
        };
        this.f101000b.put(aVar, r0);
        C39603g.m157159a().getPassportDependency().mo143662a(r0);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36450aa
    /* renamed from: a */
    public void mo134396a(View view, Context context) {
        C39603g.m157159a().getCoreDependency().mo143531b(view);
    }
}
