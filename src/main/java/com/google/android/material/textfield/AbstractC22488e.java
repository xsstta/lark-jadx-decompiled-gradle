package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
abstract class AbstractC22488e {

    /* renamed from: j */
    TextInputLayout f55312j;

    /* renamed from: k */
    Context f55313k;

    /* renamed from: l */
    CheckableImageButton f55314l;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo78522a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo78523a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo78538a(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo78541b() {
        return false;
    }

    AbstractC22488e(TextInputLayout textInputLayout) {
        this.f55312j = textInputLayout;
        this.f55313k = textInputLayout.getContext();
        this.f55314l = textInputLayout.getEndIconView();
    }
}
