package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.content.Context;
import android.preference.PreferenceManager;
import android.widget.AutoCompleteTextView;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.dependency.AbstractC36507u;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.groupmember.C39633a;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.n */
class C39536n implements AbstractC36507u {

    /* renamed from: a */
    final GroupMemberManageModule f100991a = C39633a.m157280a();

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: b */
    public void mo134717b() {
        this.f100991a.mo158805c();
    }

    C39536n() {
    }

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: a */
    public int mo134710a() {
        C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
        if (v != null) {
            return v.mo105654i();
        }
        return 1;
    }

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: a */
    public int mo134711a(String str, boolean z, boolean z2) {
        return this.f100991a.mo158780a(str, z, z2);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: a */
    public void mo134714a(Activity activity, String str, Boolean bool, int i) {
        this.f100991a.mo158788a(activity, str, bool, i);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: a */
    public void mo134712a(int i, String str, boolean z, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
        this.f100991a.mo158782a(i, str, z, autoCompleteTextView, onActivityResultListener);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: a */
    public void mo134713a(Activity activity, C36516a aVar, String str, String str2, int i) {
        C39633a.m157280a().mo158785a(activity, aVar, str, str2, i);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: a */
    public void mo134715a(Context context, String str, List<String> list, int i, AbstractC44896a aVar) {
        this.f100991a.mo158795a(context, str, list, i, aVar);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36507u
    /* renamed from: a */
    public void mo134716a(Context context, String str, List<String> list, boolean z, int i, AbstractC44896a aVar) {
        this.f100991a.mo158798a(context, str, list, z, i, aVar);
    }
}
