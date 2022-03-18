package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.dependency.IBrowserDependency;
import com.ss.android.lark.integrator.im.C39603g;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.c */
class C39507c implements IBrowserDependency {
    C39507c() {
    }

    /* renamed from: a */
    private UrlParams.Source m156095a(int i) {
        if (i == 1) {
            return UrlParams.Source.APP_GROUP_CHAT;
        }
        if (i != 2) {
            return UrlParams.Source.APP_P2P_CHAT;
        }
        return UrlParams.Source.APP_THREAD_TOPIC;
    }

    @Override // com.ss.android.lark.dependency.IBrowserDependency
    /* renamed from: a */
    public void mo134330a(Context context, String str) {
        C39603g.m157159a().getCoreDependency().mo143489a("messenger", "messenger_chat");
        C39603g.m157159a().getCoreDependency().mo143437a(context, str);
    }

    @Override // com.ss.android.lark.dependency.IBrowserDependency
    /* renamed from: b */
    public void mo134332b(Context context, String str) {
        C39603g.m157159a().getCoreDependency().mo143441a(context, str, UrlParams.m108857a().mo105523a(), C39603g.m157159a().getCCMDependency().mo143303c());
    }

    @Override // com.ss.android.lark.dependency.IBrowserDependency
    /* renamed from: c */
    public void mo134334c(Context context, String str) {
        C39603g.m157159a().getCoreDependency().mo143441a(context, str, UrlParams.m108857a().mo105523a(), C39603g.m157159a().getCCMDependency().mo143303c());
    }

    @Override // com.ss.android.lark.dependency.IBrowserDependency
    /* renamed from: a */
    public void mo134331a(Context context, String str, int i) {
        C39603g.m157159a().getCoreDependency().mo143489a("messenger", "messenger_chat");
        C39603g.m157159a().getCoreDependency().mo143438a(context, str, i);
    }

    @Override // com.ss.android.lark.dependency.IBrowserDependency
    /* renamed from: b */
    public void mo134333b(Context context, String str, int i) {
        C39603g.m157159a().getCoreDependency().mo143489a("messenger", "messenger_chat");
        C39603g.m157159a().getCoreDependency().mo143441a(context, str, UrlParams.m108857a().mo105518a(m156095a(i)).mo105523a(), C39603g.m157159a().getCCMDependency().mo143290a());
    }
}
