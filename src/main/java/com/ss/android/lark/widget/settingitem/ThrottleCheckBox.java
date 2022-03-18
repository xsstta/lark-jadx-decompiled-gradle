package com.ss.android.lark.widget.settingitem;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.larksuite.component.ui.button.LKUICheckBox;
import com.ss.android.lark.log.Log;

public class ThrottleCheckBox extends LKUICheckBox {

    /* renamed from: a */
    private long f146706a = 200;

    /* renamed from: b */
    private long f146707b;

    /* renamed from: c */
    private CompoundButton.OnCheckedChangeListener f146708c;

    public void setMinClickInterval(long j) {
        this.f146706a = j;
    }

    public ThrottleCheckBox(Context context) {
        super(context);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        super.setOnCheckedChangeListener(onCheckedChangeListener);
        this.f146708c = onCheckedChangeListener;
    }

    public void setCheckedImmediatelyNoEvent(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f146708c;
        setOnCheckedChangeListener(null);
        super.setChecked(z);
        setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setChecked(boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f146707b < this.f146706a) {
            Log.m165389i("OnLimitingListener", "elapsedTime is short than LENGTH_SHORT");
            return;
        }
        this.f146707b = uptimeMillis;
        super.setChecked(z);
    }

    public ThrottleCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ThrottleCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
