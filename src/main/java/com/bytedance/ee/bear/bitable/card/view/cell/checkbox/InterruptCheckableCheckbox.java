package com.bytedance.ee.bear.bitable.card.view.cell.checkbox;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

public class InterruptCheckableCheckbox extends AppCompatCheckBox {

    /* renamed from: a */
    private boolean f13603a;

    /* renamed from: b */
    private boolean f13604b;

    /* renamed from: c */
    private AbstractC4604a f13605c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.checkbox.InterruptCheckableCheckbox$a */
    public interface AbstractC4604a {
        /* renamed from: a */
        boolean mo18126a(boolean z);
    }

    public InterruptCheckableCheckbox(Context context) {
        super(context);
    }

    public void setEnableUserSetChecked(boolean z) {
        this.f13603a = z;
    }

    public void setSetCheckedInterceptor(AbstractC4604a aVar) {
        this.f13605c = aVar;
    }

    /* renamed from: a */
    public void mo18122a(boolean z) {
        this.f13604b = true;
        setChecked(z);
        this.f13604b = false;
    }

    public void setChecked(boolean z) {
        AbstractC4604a aVar;
        if (this.f13604b) {
            super.setChecked(z);
        } else if (this.f13603a && (aVar = this.f13605c) != null) {
            aVar.mo18126a(z);
        }
    }

    public InterruptCheckableCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterruptCheckableCheckbox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
