package com.ss.android.vc.meeting.module.livestream.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;

public class LiveReactionView extends LinearLayout {

    /* renamed from: a */
    private LKUISwitchButton f156000a;

    /* renamed from: b */
    private AbstractC62096a f156001b;

    /* renamed from: com.ss.android.vc.meeting.module.livestream.view.LiveReactionView$a */
    public interface AbstractC62096a {
        void onEnable(boolean z);
    }

    public boolean getEnable() {
        return this.f156000a.isChecked();
    }

    public void setOnEnableListener(AbstractC62096a aVar) {
        this.f156001b = aVar;
    }

    public LiveReactionView(Context context) {
        super(context);
        m242589a(context, (AttributeSet) null);
    }

    public LiveReactionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242589a(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m242590a(CompoundButton compoundButton, boolean z) {
        AbstractC62096a aVar = this.f156001b;
        if (aVar != null) {
            aVar.onEnable(this.f156000a.isChecked());
        }
    }

    /* renamed from: a */
    private void m242589a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.dialog_live_setting_item_reaction, this);
        LKUISwitchButton lKUISwitchButton = (LKUISwitchButton) findViewById(R.id.btn_switch);
        this.f156000a = lKUISwitchButton;
        lKUISwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.$$Lambda$LiveReactionView$RPQExhKihaVsTzffNT0metyFues */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LiveReactionView.lambda$RPQExhKihaVsTzffNT0metyFues(LiveReactionView.this, compoundButton, z);
            }
        });
    }

    /* renamed from: a */
    public void mo214855a(Boolean bool, Boolean bool2) {
        boolean z;
        LKUISwitchButton lKUISwitchButton = this.f156000a;
        if (bool != null) {
            z = bool.booleanValue();
        } else if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        lKUISwitchButton.setCheckedImmediately(z);
    }

    public LiveReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242589a(context, attributeSet);
    }
}
