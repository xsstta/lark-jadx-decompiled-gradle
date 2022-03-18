package com.larksuite.component.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.universe_design.dialog.UDInputDialogBuilder;

/* renamed from: com.larksuite.component.ui.dialog.j */
public class C25642j extends C25639g<C25642j> {

    /* renamed from: a */
    private final UDInputDialogBuilder f62605a;

    /* renamed from: com.larksuite.component.ui.dialog.j$a */
    public interface AbstractC25643a {
        void onTextChanged(CharSequence charSequence);
    }

    /* renamed from: a */
    public final C25642j mo89280a(int i) {
        this.f62605a.mo90899a(i);
        return this;
    }

    /* renamed from: a */
    public final C25642j mo89282a(CharSequence charSequence) {
        UDInputDialogBuilder gVar = this.f62605a;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "";
        }
        gVar.mo90901a(charSequence);
        return this;
    }

    /* renamed from: d */
    public final C25642j mo89283d(CharSequence charSequence) {
        UDInputDialogBuilder gVar = this.f62605a;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "";
        }
        gVar.mo90904b(charSequence);
        return this;
    }

    public C25642j(Context context) {
        super(context);
        UDInputDialogBuilder gVar = new UDInputDialogBuilder(context);
        this.f62605a = gVar;
        mo89231a(gVar);
        mo89232a(new LKUIInputDialogControllerCompat(context));
        this.f62586f = true;
    }

    /* renamed from: a */
    public final C25642j mo89281a(AbstractC25643a aVar) {
        if (aVar == null) {
            this.f62605a.mo90900a((UDInputDialogBuilder.OnTextChangedListener) null);
        } else {
            this.f62605a.mo90900a(new OnTextChangedListenerWrapper(aVar));
        }
        return this;
    }
}
