package com.ss.android.lark.calendar.impl.features.events.edit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.ss.android.lark.widget.switch_button.SwitchButton;

public class SwitchView extends SwitchButton {

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.widget.SwitchView$a */
    public interface AbstractC31889a {
        /* renamed from: a */
        void mo116433a(SwitchView switchView);

        /* renamed from: b */
        void mo116434b(SwitchView switchView);
    }

    public SwitchView(Context context) {
        super(context);
    }

    public void setOpened(boolean z) {
        setCheckedImmediately(z);
    }

    public void setOnStateChangedListener(final AbstractC31889a aVar) {
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.widget.SwitchView.C318881 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractC31889a aVar = aVar;
                if (aVar == null) {
                    return;
                }
                if (z) {
                    aVar.mo116433a(SwitchView.this);
                } else {
                    aVar.mo116434b(SwitchView.this);
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
