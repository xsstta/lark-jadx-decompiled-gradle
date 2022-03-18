package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.utils.StatusBarUtil;

public class MsgListScrollContainer extends ScrollView {

    /* renamed from: a */
    private int f109893a;

    /* renamed from: b */
    private boolean f109894b;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public MsgListScrollContainer(Context context) {
        super(context);
        m171602a(context);
    }

    /* renamed from: a */
    private void m171602a(Context context) {
        setFadingEdgeLength(0);
    }

    /* renamed from: a */
    public void mo154536a(int i) {
        this.f109893a = i;
        requestLayout();
    }

    public MsgListScrollContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m171602a(context);
    }

    /* renamed from: a */
    public void mo154537a(int i, boolean z) {
        this.f109893a = i;
        this.f109894b = z;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (!this.f109894b) {
            i3 = StatusBarUtil.getStatusBarHeight(getContext());
        } else {
            i3 = 0;
        }
        if (this.f109893a <= 0) {
            setMeasuredDimension(DeviceUtils.getScreenWidth(getContext()), C42871i.m170775a().mo153856f() + i3);
        } else {
            setMeasuredDimension(DeviceUtils.getScreenWidth(getContext()), this.f109893a + i3);
        }
    }
}
