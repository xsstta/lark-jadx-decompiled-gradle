package com.ss.android.lark.mail.impl.widget.time;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.ss.android.lark.widget.switch_button.SwitchButton;

public class SwitchView extends SwitchButton {

    /* renamed from: com.ss.android.lark.mail.impl.widget.time.SwitchView$a */
    public interface AbstractC44072a {
        /* renamed from: a */
        void mo156806a(SwitchView switchView);

        /* renamed from: b */
        void mo156807b(SwitchView switchView);
    }

    public SwitchView(Context context) {
        super(context);
    }

    public void setOpened(boolean z) {
        setCheckedImmediately(z);
    }

    public void setOnStateChangedListener(final AbstractC44072a aVar) {
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.mail.impl.widget.time.SwitchView.C440711 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractC44072a aVar = aVar;
                if (aVar == null) {
                    return;
                }
                if (z) {
                    aVar.mo156806a(SwitchView.this);
                } else {
                    aVar.mo156807b(SwitchView.this);
                }
            }
        });
    }

    public SwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
