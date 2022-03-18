package com.ss.android.lark.invitation.v2.feat.external.contact.v1;

import android.app.Activity;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.invitation.v2.feat.external.common.InviteExternalViewDependency;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40201a;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40203b;
import com.ss.android.lark.invitation.v2.feat.external.p2054a.C40205c;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.ViewUtils;
import java.util.List;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.d */
public class C40230d implements AbstractC40220a.AbstractC40222b {

    /* renamed from: a */
    private final InviteExternalViewDependency f102203a;

    /* renamed from: b */
    private AbstractC40220a.AbstractC40222b.AbstractC40223a f102204b;

    /* renamed from: c */
    private ViewUtils.C57751a f102205c;

    /* renamed from: d */
    private C40203b f102206d;

    /* renamed from: e */
    private C40205c f102207e;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40222b
    /* renamed from: a */
    public Activity mo145924a() {
        return this.f102203a.mo145900a();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40222b
    /* renamed from: d */
    public void mo145930d() {
        C40205c cVar = this.f102207e;
        if (cVar != null) {
            cVar.mo197766g();
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40222b
    /* renamed from: c */
    public void mo145929c() {
        ViewUtils.C57751a aVar = this.f102205c;
        if (aVar != null) {
            aVar.mo196042e();
        }
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40222b
    /* renamed from: b */
    public void mo145928b() {
        if (this.f102205c == null) {
            this.f102205c = ViewUtils.m224154c(this.f102203a.mo145900a());
        }
        this.f102205c.mo196039b();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC40220a.AbstractC40222b.AbstractC40223a aVar) {
        this.f102204b = aVar;
    }

    public C40230d(InviteExternalViewDependency eVar) {
        this.f102203a = eVar;
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40222b
    /* renamed from: a */
    public void mo145925a(String str) {
        LKUIToast.show(this.f102203a.mo145900a(), str);
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40222b
    /* renamed from: a */
    public void mo145927a(List<C40201a> list) {
        this.f102206d = (C40203b) new C40203b(this.f102203a.mo145900a(), list).mo197765f();
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40222b
    /* renamed from: a */
    public void mo145926a(String str, String str2, boolean z, C40205c.AbstractC40215a aVar) {
        this.f102207e = (C40205c) new C40205c(mo145924a(), str, str2, z, aVar, new ApiUtils.AbstractC57748a<Boolean>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.contact.v1.C40230d.C402311 */

            /* renamed from: a */
            public void consume(Boolean bool) {
                InvHitPoint.m160360a(bool.booleanValue());
            }
        }).mo197765f();
    }
}
