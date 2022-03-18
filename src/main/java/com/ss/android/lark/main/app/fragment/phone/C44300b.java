package com.ss.android.lark.main.app.fragment.phone;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.ss.android.lark.main.app.fragment.AbstractC44239a;
import com.ss.android.lark.main.app.fragment.AbstractC44241b;
import com.ss.android.lark.main.app.fragment.AbstractC44285k;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.p2235b.C44490a;

/* renamed from: com.ss.android.lark.main.app.fragment.phone.b */
public class C44300b extends AbstractC44239a {

    /* renamed from: f */
    private AbstractC44285k f112357f = new AbstractC44285k() {
        /* class com.ss.android.lark.main.app.fragment.phone.C44300b.C443011 */

        @Override // com.ss.android.lark.main.app.fragment.AbstractC44285k
        /* renamed from: a */
        public void mo157372a(C44274f.AbstractC44277b bVar) {
            ButterKnife.bind(bVar, C44300b.this.f112225d);
        }
    };

    /* renamed from: f */
    public static C44300b m175786f() {
        return new C44300b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.app.fragment.AbstractC44239a
    /* renamed from: e */
    public C44274f.AbstractC44277b mo157272e() {
        return new MainFragmentView(this.f112357f, getActivity(), getChildFragmentManager());
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a, com.ss.android.lark.main.app.fragment.AbstractC44239a
    /* renamed from: a */
    public void mo104596a(Intent intent) {
        super.mo104596a(intent);
        C44490a.m176500a().mo157924a(getActivity(), intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C44490a.m176500a().mo157923a(getActivity());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.app.fragment.AbstractC44239a
    /* renamed from: a */
    public AbstractC44241b mo157269a(C44302c cVar, C44274f.AbstractC44277b bVar) {
        return new C44313d(cVar, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2890) {
            this.f112226e.mo157275a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }
}
