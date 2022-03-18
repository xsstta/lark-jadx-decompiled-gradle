package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0261c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.material.bottomsheet.b */
public class C22184b extends C0261c {

    /* renamed from: c */
    private boolean f54097c;

    /* renamed from: C */
    public void mo76743C() {
        if (this.f54097c) {
            super.mo5513b();
        } else {
            super.u_();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: b */
    public void mo5513b() {
        if (!mo38116c(true)) {
            super.mo5513b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void u_() {
        if (!mo38116c(false)) {
            super.u_();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.bottomsheet.b$a */
    public class C22186a extends BottomSheetBehavior.AbstractC22177a {
        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24937a(View view, float f) {
        }

        private C22186a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24938a(View view, int i) {
            if (i == 5) {
                C22184b.this.mo76743C();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        return new DialogC22179a(getContext(), mo5515e());
    }

    /* renamed from: c */
    private boolean mo38116c(boolean z) {
        Dialog v_ = v_();
        if (!(v_ instanceof DialogC22179a)) {
            return false;
        }
        DialogC22179a aVar = (DialogC22179a) v_;
        BottomSheetBehavior<FrameLayout> a = aVar.mo76733a();
        if (!a.mo76712b() || !aVar.mo76734b()) {
            return false;
        }
        m80020a(a, z);
        return true;
    }

    /* renamed from: a */
    private void m80020a(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f54097c = z;
        if (bottomSheetBehavior.mo76717d() == 5) {
            mo76743C();
            return;
        }
        if (v_() instanceof DialogC22179a) {
            ((DialogC22179a) v_()).mo76737d();
        }
        bottomSheetBehavior.mo76710b((BottomSheetBehavior.AbstractC22177a) new C22186a());
        bottomSheetBehavior.mo76718d(5);
    }
}
