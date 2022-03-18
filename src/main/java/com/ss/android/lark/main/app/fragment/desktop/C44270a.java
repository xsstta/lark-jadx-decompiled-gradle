package com.ss.android.lark.main.app.fragment.desktop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import butterknife.ButterKnife;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.fragment.AbstractC44239a;
import com.ss.android.lark.main.app.fragment.AbstractC44241b;
import com.ss.android.lark.main.app.fragment.C44274f;
import com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView;
import com.ss.android.lark.main.app.fragment.phone.C44302c;
import com.ss.android.lark.main.p2231a.AbstractC44136a;

/* renamed from: com.ss.android.lark.main.app.fragment.desktop.a */
public class C44270a extends AbstractC44239a {

    /* renamed from: f */
    public AbstractC44136a.AbstractC44163p f112285f = C44134a.m174959a().mo133250f();

    /* renamed from: g */
    private DesktopMainFragmentView.AbstractC44269a f112286g = new DesktopMainFragmentView.AbstractC44269a() {
        /* class com.ss.android.lark.main.app.fragment.desktop.C44270a.C442711 */

        @Override // com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.AbstractC44269a
        /* renamed from: a */
        public void mo157346a(Context context) {
            C44270a.this.f112285f.mo133311a(context);
        }

        @Override // com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.AbstractC44269a
        /* renamed from: a */
        public void mo157348a(C44274f.AbstractC44277b bVar) {
            ButterKnife.bind(bVar, C44270a.this.f112225d);
        }

        @Override // com.ss.android.lark.main.app.fragment.desktop.DesktopMainFragmentView.AbstractC44269a
        /* renamed from: a */
        public void mo157347a(Context context, int[] iArr) {
            C44270a.this.f112285f.mo133313a(context, iArr);
        }
    };

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.main.app.fragment.AbstractC44239a
    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: f */
    public static C44270a m175600f() {
        return new C44270a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.app.fragment.AbstractC44239a
    /* renamed from: e */
    public C44274f.AbstractC44277b mo157272e() {
        return new DesktopMainFragmentView(this.f112286g, getActivity(), getChildFragmentManager());
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: c */
    public void mo104602c() {
        super.mo104602c();
        if (this.f112226e != null && (this.f112226e instanceof C44272b)) {
            ((C44272b) this.f112226e).mo157349f();
        }
    }

    @Override // com.ss.android.lark.base.p1400a.C29520a
    /* renamed from: a */
    public void mo104597a(KeyEvent keyEvent) {
        boolean z;
        super.mo104597a(keyEvent);
        if (this.f112226e != null) {
            z = this.f112226e.mo157278a(keyEvent);
        } else {
            z = false;
        }
        if (!z) {
            C36512a.m144041a().mo134769a(keyEvent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.app.fragment.AbstractC44239a
    /* renamed from: a */
    public AbstractC44241b mo157269a(C44302c cVar, C44274f.AbstractC44277b bVar) {
        return new C44272b(cVar, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        C36516a b = C36512a.m144041a().mo134770b(ContainerType.Right);
        if (b != null) {
            b.onActivityResult(i, i2, intent);
        }
    }
}
