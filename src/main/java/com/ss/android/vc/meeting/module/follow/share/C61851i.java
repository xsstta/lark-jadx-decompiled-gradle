package com.ss.android.vc.meeting.module.follow.share;

import android.text.Editable;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.vc.entity.VcDoc;
import com.ss.android.vc.meeting.module.follow.share.C61821c;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.i */
public class C61851i implements C61821c.AbstractC61824b.AbstractC61825a {

    /* renamed from: a */
    protected C61821c.AbstractC61822a f155291a;

    /* renamed from: b */
    protected C61821c.AbstractC61824b f155292b;

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b.AbstractC61825a
    /* renamed from: a */
    public boolean mo214154a() {
        return this.f155291a.mo214144e();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b.AbstractC61825a
    /* renamed from: c */
    public void mo214156c() {
        this.f155291a.mo214141b();
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b.AbstractC61825a
    /* renamed from: b */
    public void mo214155b() {
        m241620a(this.f155291a.mo214139a(), true);
    }

    public C61851i(C61850h hVar) {
        this.f155291a = hVar.mo214207d();
        this.f155292b = hVar.mo214206c();
    }

    /* renamed from: a */
    private void m241620a(String str, boolean z) {
        this.f155291a.mo214140a(str, z, new C61821c.AbstractC61822a.AbstractC61823a<List<VcDoc>>() {
            /* class com.ss.android.vc.meeting.module.follow.share.C61851i.C618521 */

            @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a.AbstractC61823a
            /* renamed from: a */
            public void mo214145a(ErrorResult errorResult) {
                C61851i.this.f155292b.mo214149a(errorResult);
            }

            /* renamed from: b */
            public void mo214148b(List<VcDoc> list) {
                C61851i.this.f155292b.mo214151a(C61851i.this.f155291a.mo214139a(), list);
            }

            @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61822a.AbstractC61823a
            /* renamed from: a */
            public void mo214147a(String str) {
                C61851i.this.f155292b.mo214150a(str);
            }

            /* renamed from: a */
            public void mo214146a(List<VcDoc> list) {
                C61851i.this.f155292b.mo214152a(C61851i.this.f155291a.mo214139a(), list, false);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.follow.share.C61821c.AbstractC61824b.AbstractC61825a
    /* renamed from: a */
    public void mo214153a(Editable editable, boolean z) {
        if (z && this.f155291a.mo214143d() > 0) {
            this.f155292b.mo214152a(this.f155291a.mo214139a(), this.f155291a.mo214142c(), true);
        } else if (editable == null || TextUtils.isEmpty(editable.toString())) {
            mo214156c();
            m241620a("", false);
        } else if (!TextUtils.equals(editable.toString().trim(), this.f155291a.mo214139a())) {
            mo214156c();
            m241620a(editable.toString().trim(), false);
        }
    }
}
