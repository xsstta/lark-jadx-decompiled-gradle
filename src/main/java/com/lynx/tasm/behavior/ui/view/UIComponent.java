package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;

public class UIComponent extends UIView {

    /* renamed from: a */
    private AbstractC26838a f66662a;

    /* renamed from: b */
    private String f66663b;

    /* renamed from: com.lynx.tasm.behavior.ui.view.UIComponent$a */
    public interface AbstractC26838a {
        /* renamed from: a */
        void mo95591a(UIComponent uIComponent);
    }

    /* renamed from: d */
    public String mo53300d() {
        return this.f66663b;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        AbstractC26838a aVar = this.f66662a;
        if (aVar != null) {
            aVar.mo95591a(this);
        }
    }

    public UIComponent(AbstractC26684l lVar) {
        super(lVar);
    }

    @LynxProp(name = "item-key")
    public void setItemKey(String str) {
        this.f66663b = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.view.UIView
    /* renamed from: a */
    public C26840a mo95589a(Context context) {
        return new C26841b(context);
    }
}
