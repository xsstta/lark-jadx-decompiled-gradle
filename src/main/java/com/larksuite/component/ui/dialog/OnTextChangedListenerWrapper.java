package com.larksuite.component.ui.dialog;

import com.larksuite.component.ui.dialog.C25642j;
import com.larksuite.component.universe_design.dialog.UDInputDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/larksuite/component/ui/dialog/OnTextChangedListenerWrapper;", "Lcom/larksuite/component/universe_design/dialog/UDInputDialogBuilder$OnTextChangedListener;", "listener", "Lcom/larksuite/component/ui/dialog/LKUIInputDialogBuilder$OnTextChangedListener;", "(Lcom/larksuite/component/ui/dialog/LKUIInputDialogBuilder$OnTextChangedListener;)V", "onTextChanged", "", "s", "", "suite-ui_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.dialog.q */
public final class OnTextChangedListenerWrapper implements UDInputDialogBuilder.OnTextChangedListener {

    /* renamed from: a */
    private final C25642j.AbstractC25643a f62611a;

    @Override // com.larksuite.component.universe_design.dialog.UDInputDialogBuilder.OnTextChangedListener
    /* renamed from: a */
    public void mo89293a(CharSequence charSequence) {
        this.f62611a.onTextChanged(charSequence);
    }

    public OnTextChangedListenerWrapper(C25642j.AbstractC25643a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f62611a = aVar;
    }
}
