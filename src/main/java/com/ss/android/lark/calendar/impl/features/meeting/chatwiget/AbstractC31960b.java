package com.ss.android.lark.calendar.impl.features.meeting.chatwiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.calendar.impl.features.meeting.chatwiget.b */
public abstract class AbstractC31960b extends LinearLayout {

    /* renamed from: s */
    protected int f81704s = UIUtils.dp2px(getContext(), 5.0f);

    /* renamed from: t */
    protected int f81705t = UIUtils.dp2px(getContext(), 40.0f);

    /* renamed from: u */
    protected int f81706u = UIUtils.dp2px(getContext(), 56.0f);

    /* renamed from: v */
    protected int f81707v = UIUtils.dp2px(getContext(), 36.0f);

    /* renamed from: w */
    protected int f81708w = 0;

    /* renamed from: x */
    protected int f81709x = 0;

    /* renamed from: y */
    protected float f81710y = ((float) UIUtils.dp2px(getContext(), 6.0f));

    /* renamed from: z */
    protected float f81711z = ((float) UIUtils.dp2px(getContext(), 22.0f));

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo116603a(String str, String str2, String str3);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo116605c();

    /* access modifiers changed from: package-private */
    public abstract void setCloseListener(View.OnClickListener onClickListener);

    /* access modifiers changed from: package-private */
    public abstract void setConfirmListener(View.OnClickListener onClickListener);

    AbstractC31960b(Context context) {
        super(context);
    }

    AbstractC31960b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = this.f81706u;
        if (this.f81708w + i5 < i) {
            this.f81708w = i - i5;
        }
        int i6 = this.f81707v;
        if (this.f81709x + i6 < i2) {
            this.f81709x = i2 - i6;
        }
    }
}
