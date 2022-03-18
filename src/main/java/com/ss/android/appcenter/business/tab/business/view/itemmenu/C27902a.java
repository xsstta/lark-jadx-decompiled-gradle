package com.ss.android.appcenter.business.tab.business.view.itemmenu;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.hollow.SquircleShape;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.AbstractC27920e;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27917b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27918c;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27919d;
import com.ss.android.appcenter.common.util.C28209p;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.a */
public class C27902a {

    /* renamed from: a */
    FragmentActivity f69754a;

    /* renamed from: b */
    SparseArray<C27917b> f69755b = new SparseArray<>();

    /* renamed from: c */
    private C27917b f69756c;

    /* renamed from: d */
    private C27913b f69757d = new C27913b(this.f69754a);

    /* renamed from: b */
    private C27917b[] m101841b() {
        C27917b[] bVarArr = new C27917b[this.f69755b.size()];
        for (int i = 0; i < this.f69755b.size(); i++) {
            bVarArr[i] = this.f69755b.valueAt(i);
        }
        return bVarArr;
    }

    /* renamed from: a */
    public void mo99488a() {
        C27917b bVar = this.f69756c;
        if (bVar != null) {
            View view = bVar.f69800a;
            if (view.getWidth() == 0) {
                view.post(new Runnable() {
                    /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.C27902a.RunnableC279031 */

                    public void run() {
                        C27902a.this.mo99488a();
                    }
                });
                return;
            }
            C27918c cVar = new C27918c(this.f69754a);
            cVar.setMainTargetHollow(this.f69756c);
            cVar.setHollowInfo(m101841b());
            this.f69757d.mo99515a(cVar);
        }
    }

    /* renamed from: a */
    public C27902a mo99483a(ItemInfo itemInfo) {
        this.f69757d.mo99513a(itemInfo);
        return this;
    }

    /* renamed from: b */
    public C27902a mo99489b(boolean z) {
        this.f69757d.mo99521b(z);
        return this;
    }

    /* renamed from: c */
    public C27902a mo99490c(boolean z) {
        this.f69757d.mo99522c(z);
        return this;
    }

    /* renamed from: d */
    public C27902a mo99491d(boolean z) {
        this.f69757d.mo99523d(z);
        return this;
    }

    /* renamed from: b */
    private C27917b m101840b(View view) {
        C27917b bVar = new C27917b(view);
        bVar.f69800a = view;
        this.f69756c = bVar;
        return bVar;
    }

    public C27902a(Fragment fragment) {
        this.f69754a = fragment.getActivity();
    }

    /* renamed from: c */
    private C27917b m101842c(View view) {
        C27917b bVar = this.f69755b.get(view.hashCode());
        if (bVar != null) {
            return bVar;
        }
        C27917b bVar2 = new C27917b(view);
        bVar2.f69800a = view;
        this.f69755b.append(view.hashCode(), bVar2);
        return bVar2;
    }

    /* renamed from: a */
    public C27902a mo99480a(View view) {
        int a = C28209p.m103291a(4.0f);
        Rect rect = new Rect(a, a, a, a);
        C27917b b = m101840b(view);
        b.mo99528a(rect);
        b.mo99529a(new C27919d((float) C28209p.m103293a((Context) this.f69754a, 12.0f)));
        this.f69757d.mo99512a();
        return this;
    }

    /* renamed from: a */
    public C27902a mo99484a(C27913b.AbstractC27915a aVar) {
        this.f69757d.mo99514a(aVar);
        return this;
    }

    /* renamed from: a */
    public C27902a mo99485a(ItemMenuAdapter.AbstractC27933b bVar) {
        this.f69757d.mo99516a(bVar);
        return this;
    }

    /* renamed from: a */
    public C27902a mo99486a(String str) {
        this.f69757d.mo99517a(str);
        return this;
    }

    /* renamed from: a */
    public C27902a mo99487a(boolean z) {
        this.f69757d.mo99518a(z);
        return this;
    }

    /* renamed from: a */
    public C27902a mo99482a(View view, AbstractC27920e eVar) {
        if (view.getVisibility() == 0) {
            m101842c(view).mo99529a(eVar);
        }
        return this;
    }

    /* renamed from: a */
    public C27902a mo99481a(View view, float f) {
        m101840b(view).mo99529a(new SquircleShape((int) f));
        this.f69757d.mo99520b();
        return this;
    }
}
