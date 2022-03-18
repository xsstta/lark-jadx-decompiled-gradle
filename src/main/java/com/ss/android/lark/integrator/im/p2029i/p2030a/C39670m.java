package com.ss.android.lark.integrator.im.p2029i.p2030a;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.feed.dto.StrongGuideInfo;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.integrator.im.i.a.m */
public class C39670m implements AbstractC38037a.AbstractC38055o {
    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: d */
    public boolean mo139274d() {
        return C39603g.m157159a().getCoreDependency().ad();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: e */
    public boolean mo139275e() {
        return C37239a.m146648b().mo136951a("suite_to_c_enable");
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: f */
    public void mo139276f() {
        C39603g.m157159a().getCoreDependency().mo143483a((C57865c.AbstractC57871b<Boolean>) null);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: g */
    public String mo139277g() {
        return C39603g.m157159a().getCoreDependency().ae();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: c */
    public boolean mo139273c() {
        return C39603g.m157159a().getCoreDependency().ac();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: b */
    public boolean mo139271b() {
        return C39603g.m157159a().getCoreDependency().ab();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: a */
    public boolean mo139267a() {
        return C39603g.m157159a().getCoreDependency().aa();
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: a */
    public void mo139263a(Context context) {
        C39603g.m157159a().getCoreDependency().mo143526b(context, "invite_member_banner");
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: b */
    public void mo139268b(Context context) {
        C39603g.m157159a().getCoreDependency().mo143526b(context, "feed_menu");
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: c */
    public void mo139272c(Context context) {
        C39603g.m157159a().getCoreDependency().mo143564c(context, "feed_menu");
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: b */
    public void mo139270b(IGetDataCallback<InvitationServiceApi.InviteActivityBannerResult> iGetDataCallback) {
        C39603g.m157159a().getCoreDependency().mo143588g(iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: a */
    public void mo139266a(IGetDataCallback<InvitationServiceApi.InvitePermissionResult> iGetDataCallback) {
        C39603g.m157159a().getCoreDependency().mo143584f(iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: a */
    public void mo139264a(Context context, String str) {
        C39603g.m157159a().getCoreDependency().mo143530b(context, "feed_menu", false);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: a */
    public void mo139265a(Context context, String str, StrongGuideInfo dVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_access_experiment", dVar.mo139399c());
        bundle.putInt("invitation_method", dVar.mo139400d());
        bundle.putInt("version_id", dVar.mo139401e());
        C39603g.m157159a().getCoreDependency().mo143439a(context, str, bundle);
    }

    @Override // com.ss.android.lark.feed.p1871b.AbstractC38037a.AbstractC38055o
    /* renamed from: b */
    public void mo139269b(Context context, String str, StrongGuideInfo dVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_access_experiment", dVar.mo139399c());
        bundle.putInt("invitation_method", dVar.mo139400d());
        bundle.putInt("version_id", dVar.mo139401e());
        C39603g.m157159a().getCoreDependency().mo143527b(context, str, bundle);
    }
}
