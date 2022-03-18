package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/common/widget/VCLKUISwitchButton;", "Lcom/larksuite/component/ui/button/LKUISwitchButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "init", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class VCLKUISwitchButton extends LKUISwitchButton {
    /* renamed from: a */
    public final void mo208545a() {
        setThumbDrawable(C60773o.m236128f(R.drawable.vc_lkui_switchbutton_thumb));
        setBackColorRes(R.color.vc_lkui_switchbutton_back_color);
    }

    public VCLKUISwitchButton(Context context) {
        super(context, null, 0);
    }

    public VCLKUISwitchButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VCLKUISwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo208545a();
    }
}
