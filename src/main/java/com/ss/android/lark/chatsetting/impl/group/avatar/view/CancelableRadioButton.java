package com.ss.android.lark.chatsetting.impl.group.avatar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;

public class CancelableRadioButton extends AppCompatRadioButton {
    public void toggle() {
        setChecked(!isChecked());
        if (!isChecked()) {
            ((RadioGroup) getParent()).clearCheck();
        }
    }

    public CancelableRadioButton(Context context) {
        super(context);
    }

    public CancelableRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
