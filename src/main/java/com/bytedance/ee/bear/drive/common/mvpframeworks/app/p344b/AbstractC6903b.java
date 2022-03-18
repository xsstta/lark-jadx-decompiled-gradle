package com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6908d;
import com.bytedance.ee.bear.drive.common.mvpframeworks.base.mvp.AbstractC6909e;

/* renamed from: com.bytedance.ee.bear.drive.common.mvpframeworks.app.b.b */
public abstract class AbstractC6903b<P extends AbstractC6908d> extends AbstractC6902a implements AbstractC6909e {

    /* renamed from: a */
    private P f18676a;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract P mo25877b(Context context);

    /* renamed from: f */
    public P mo27144f() {
        return this.f18676a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f18676a.mo25893f();
        this.f18676a.mo26654b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f18676a.mo27150i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f18676a.mo27149h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f18676a.mo27148g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f18676a.mo27151j();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b.AbstractC6902a
    /* renamed from: b */
    public final void mo27142b(Bundle bundle) {
        this.f18676a.mo27147a(this);
        this.f18676a.mo25880a(getArguments(), bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f18676a.mo27146a(bundle);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f18676a == null) {
            this.f18676a = mo25877b(getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f18676a.mo27145a(i, i2, intent);
    }
}
