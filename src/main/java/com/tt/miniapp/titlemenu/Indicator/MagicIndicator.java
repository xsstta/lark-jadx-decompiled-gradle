package com.tt.miniapp.titlemenu.Indicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class MagicIndicator extends FrameLayout {

    /* renamed from: a */
    private AbstractC66897b f168723a;

    public AbstractC66897b getNavigator() {
        return this.f168723a;
    }

    public MagicIndicator(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo232883a(int i) {
        AbstractC66897b bVar = this.f168723a;
        if (bVar != null) {
            bVar.mo232889a(i);
        }
    }

    /* renamed from: b */
    public void mo232885b(int i) {
        AbstractC66897b bVar = this.f168723a;
        if (bVar != null) {
            bVar.mo232892b(i);
        }
    }

    public void setNavigator(AbstractC66897b bVar) {
        AbstractC66897b bVar2 = this.f168723a;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.mo232891b();
            }
            this.f168723a = bVar;
            removeAllViews();
            if (this.f168723a instanceof View) {
                addView((View) this.f168723a, new FrameLayout.LayoutParams(-1, -1));
                this.f168723a.mo232888a();
            }
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo232884a(int i, float f, int i2) {
        AbstractC66897b bVar = this.f168723a;
        if (bVar != null) {
            bVar.mo232890a(i, f, i2);
        }
    }
}
