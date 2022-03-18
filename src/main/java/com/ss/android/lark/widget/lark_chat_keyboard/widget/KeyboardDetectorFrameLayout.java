package com.ss.android.lark.widget.lark_chat_keyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.KeyboardUtils;
import java.util.ArrayList;
import java.util.List;

public class KeyboardDetectorFrameLayout extends FrameLayout {

    /* renamed from: a */
    private List<AbstractC58470a> f144034a;

    /* renamed from: b */
    private boolean f144035b;

    /* renamed from: com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout$a */
    public interface AbstractC58470a {
        /* renamed from: a */
        void mo101540a(int i);

        /* renamed from: b */
        void mo101542b();
    }

    public KeyboardDetectorFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo197981a(AbstractC58470a aVar) {
        if (this.f144034a.indexOf(aVar) == -1) {
            this.f144034a.add(aVar);
        }
    }

    public KeyboardDetectorFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int height = getHeight() - View.MeasureSpec.getSize(i2);
        if (height > 400) {
            KeyboardUtils.setKeyboardHeight(height);
            this.f144035b = true;
            for (AbstractC58470a aVar : this.f144034a) {
                aVar.mo101540a(height);
            }
        } else if (height < -400) {
            this.f144035b = false;
            for (AbstractC58470a aVar2 : this.f144034a) {
                aVar2.mo101542b();
            }
        }
        super.onMeasure(i, i2);
    }

    public KeyboardDetectorFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f144034a = new ArrayList(2);
    }
}
