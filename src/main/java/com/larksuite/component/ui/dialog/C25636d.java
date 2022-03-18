package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.universe_design.dialog.UDCheckBoxDialogBuilder;

/* renamed from: com.larksuite.component.ui.dialog.d */
public class C25636d extends C25639g<C25636d> {

    /* renamed from: a */
    private boolean f62576a;

    /* renamed from: i */
    private final UDCheckBoxDialogBuilder f62577i;

    /* renamed from: a */
    public final boolean mo89216a() {
        return this.f62576a;
    }

    /* renamed from: a */
    public final C25636d mo89215a(boolean z) {
        this.f62576a = z;
        this.f62577i.mo90893a(z);
        return this;
    }

    /* renamed from: a */
    public final C25636d mo89214a(CharSequence charSequence) {
        UDCheckBoxDialogBuilder cVar = this.f62577i;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "";
        }
        cVar.mo90892a(charSequence);
        return this;
    }

    public C25636d(Context context) {
        super(context);
        UDCheckBoxDialogBuilder cVar = new UDCheckBoxDialogBuilder(context);
        this.f62577i = cVar;
        mo89231a(cVar);
        mo89232a(new LKUICheckBoxDialogControllerCompat(context));
        this.f62586f = true;
    }
}
