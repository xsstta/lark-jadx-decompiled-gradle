package com.ss.android.vc.meeting.module.searchInvite;

import android.text.Editable;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.searchInvite.g */
public class C62934g implements AbstractC62918b.AbstractC62921b.AbstractC62922a {

    /* renamed from: a */
    protected AbstractC62918b.AbstractC62919a f158524a;

    /* renamed from: b */
    protected AbstractC62918b.AbstractC62921b f158525b;

    /* renamed from: c */
    private boolean f158526c = true;

    /* renamed from: d */
    private Boolean f158527d = false;

    /* renamed from: b */
    public void mo217446b() {
        this.f158525b.mo217429e();
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62921b.AbstractC62922a
    /* renamed from: a */
    public void mo217430a() {
        if (this.f158527d.booleanValue()) {
            m246410b(this.f158524a.mo217419a());
        } else {
            m246409a(this.f158524a.mo217419a());
        }
    }

    /* renamed from: a */
    private void m246409a(String str) {
        this.f158524a.mo217420a(str, new AbstractC62918b.AbstractC62919a.AbstractC62920a<List<SearchParticipantInfo>>() {
            /* class com.ss.android.vc.meeting.module.searchInvite.C62934g.C629351 */

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a.AbstractC62920a
            /* renamed from: a */
            public void mo217423a(ErrorResult errorResult) {
                C62934g.this.f158525b.mo217426a(errorResult);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a.AbstractC62920a
            /* renamed from: a */
            public void mo217425a(String str) {
                C62934g.this.f158525b.mo217427a(str);
            }

            /* renamed from: a */
            public void mo217424a(List<SearchParticipantInfo> list) {
                C62934g.this.f158525b.mo217428a(C62934g.this.f158524a.mo217419a(), list);
            }
        });
    }

    /* renamed from: b */
    private void m246410b(String str) {
        this.f158524a.mo217422b(str, new AbstractC62918b.AbstractC62919a.AbstractC62920a<List<SearchParticipantInfo>>() {
            /* class com.ss.android.vc.meeting.module.searchInvite.C62934g.C629362 */

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a.AbstractC62920a
            /* renamed from: a */
            public void mo217423a(ErrorResult errorResult) {
                C62934g.this.f158525b.mo217426a(errorResult);
            }

            @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62919a.AbstractC62920a
            /* renamed from: a */
            public void mo217425a(String str) {
                C62934g.this.f158525b.mo217427a(str);
            }

            /* renamed from: a */
            public void mo217424a(List<SearchParticipantInfo> list) {
                C62934g.this.f158525b.mo217428a(C62934g.this.f158524a.mo217419a(), list);
            }
        });
    }

    public C62934g(C62926e eVar) {
        this.f158524a = eVar.mo217435d();
        this.f158525b = eVar.mo217434c();
    }

    @Override // com.ss.android.vc.meeting.module.searchInvite.AbstractC62918b.AbstractC62921b.AbstractC62922a
    /* renamed from: a */
    public void mo217431a(Editable editable) {
        if (editable == null || TextUtils.isEmpty(editable.toString())) {
            this.f158526c = true;
            mo217446b();
            return;
        }
        String trim = editable.toString().trim();
        if (this.f158526c || !TextUtils.equals(trim, this.f158524a.mo217419a())) {
            this.f158526c = false;
            this.f158524a.mo217421b();
            if (this.f158527d.booleanValue()) {
                m246410b(trim);
            } else {
                m246409a(trim);
            }
        }
    }

    public C62934g(C62926e eVar, Boolean bool) {
        this.f158524a = eVar.mo217435d();
        this.f158525b = eVar.mo217434c();
        this.f158527d = bool;
    }
}
