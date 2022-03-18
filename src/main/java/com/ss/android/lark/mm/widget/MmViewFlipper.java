package com.ss.android.lark.mm.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewFlipper;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.lang.reflect.Field;

public class MmViewFlipper extends ViewFlipper {
    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception unused) {
        }
    }

    public void showNext() {
        super.showNext();
    }

    /* renamed from: a */
    public void mo165621a() {
        stopFlipping();
        m186657b();
    }

    /* renamed from: b */
    private void m186657b() {
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mReceiver");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            if (obj instanceof BroadcastReceiver) {
                getContext().unregisterReceiver((BroadcastReceiver) obj);
            }
        } catch (Exception e) {
            C45855f.m181666e("MmViewFlipper", "[unregisterReceiver] error: " + e);
        }
    }

    public MmViewFlipper(Context context) {
        super(context);
    }

    public MmViewFlipper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
