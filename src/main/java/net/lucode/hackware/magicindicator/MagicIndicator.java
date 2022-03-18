package net.lucode.hackware.magicindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import net.lucode.hackware.magicindicator.p3481a.AbstractC69614a;

public class MagicIndicator extends FrameLayout {

    /* renamed from: a */
    private AbstractC69614a f174011a;

    public AbstractC69614a getNavigator() {
        return this.f174011a;
    }

    public MagicIndicator(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo243173a(int i) {
        AbstractC69614a aVar = this.f174011a;
        if (aVar != null) {
            aVar.mo67366a(i);
        }
    }

    /* renamed from: b */
    public void mo243175b(int i) {
        AbstractC69614a aVar = this.f174011a;
        if (aVar != null) {
            aVar.mo67369b(i);
        }
    }

    public void setNavigator(AbstractC69614a aVar) {
        AbstractC69614a aVar2 = this.f174011a;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo67368b();
            }
            this.f174011a = aVar;
            removeAllViews();
            if (this.f174011a instanceof View) {
                addView((View) this.f174011a, new FrameLayout.LayoutParams(-1, -1));
                this.f174011a.mo67365a();
            }
        }
    }

    public MagicIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo243174a(int i, float f, int i2) {
        AbstractC69614a aVar = this.f174011a;
        if (aVar != null) {
            aVar.mo67367a(i, f, i2);
        }
    }
}
