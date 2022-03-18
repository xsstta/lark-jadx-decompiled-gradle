package com.ss.android.lark.todo.impl.features.setting.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.larksuite.component.universe_design.udswitch.UDSwitch;

public class TodoSwitchView extends UDSwitch {

    /* renamed from: e */
    private CompoundButton.OnCheckedChangeListener f141028e;

    /* renamed from: com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView$a */
    public interface AbstractC57201a {
        /* renamed from: a */
        void mo194030a(TodoSwitchView todoSwitchView);

        /* renamed from: b */
        void mo194031b(TodoSwitchView todoSwitchView);
    }

    public TodoSwitchView(Context context) {
        super(context);
    }

    public void setOnStateChangedListener(final AbstractC57201a aVar) {
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.todo.impl.features.setting.widget.TodoSwitchView.C572001 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AbstractC57201a aVar = aVar;
                if (aVar == null) {
                    return;
                }
                if (z) {
                    aVar.mo194030a(TodoSwitchView.this);
                } else {
                    aVar.mo194031b(TodoSwitchView.this);
                }
            }
        });
    }

    public void setCheckedNoEvent(boolean z) {
        if (this.f141028e == null) {
            setChecked(z);
            return;
        }
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.f141028e);
    }

    public TodoSwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TodoSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
