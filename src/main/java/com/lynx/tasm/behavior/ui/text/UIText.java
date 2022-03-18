package com.lynx.tasm.behavior.ui.text;

import android.content.Context;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.p1221a.AbstractC26623a;
import com.lynx.tasm.behavior.shadow.text.C26733n;
import com.lynx.tasm.behavior.ui.LynxUI;

public class UIText extends LynxUI<AndroidText> {
    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        int i = this.f66245z + this.f66203I;
        int i2 = this.f66195A + this.f66204J;
        ((AndroidText) this.f66253Z).setPadding(i, this.f66196B + this.f66202H, i2, this.f66197C + this.f66205K);
    }

    public UIText(AbstractC26684l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AndroidText mo33942b(Context context) {
        return new AndroidText(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo94958a(Object obj) {
        if (obj instanceof C26733n) {
            ((AndroidText) this.f66253Z).setTextBundle((C26733n) obj);
        }
    }

    @LynxProp(name = "text-gradient")
    public void setTextGradient(String str) {
        ((AndroidText) this.f66253Z).setTextGradient(str);
        mo95041w();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    @LynxProp(name = "accessibility-label")
    public void setAccessibilityLabel(String str) {
        super.setAccessibilityLabel(str);
        if (this.f66253Z != null) {
            ((AndroidText) this.f66253Z).setFocusable(true);
            ((AndroidText) this.f66253Z).setContentDescription(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public AbstractC26623a mo94945a(float f, float f2) {
        if (this.f66253Z == null) {
            return this;
        }
        return C26822b.m97440a(f, f2, this, ((AndroidText) this.f66253Z).mTextLayout, C26822b.m97439a((AndroidText) this.f66253Z));
    }
}
