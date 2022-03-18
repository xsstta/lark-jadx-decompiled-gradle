package com.bytedance.ee.webapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.lark.ui.CommonTitleBar;

public class CustomTitleBar extends CommonTitleBar {

    /* renamed from: a */
    private View.OnClickListener f35949a;

    /* renamed from: b */
    private View.OnClickListener f35950b;

    public CustomTitleBar(Context context) {
        super(context);
    }

    public void setDefaultLeftClickListener(View.OnClickListener onClickListener) {
        this.f35949a = onClickListener;
        setLeftClickListener(onClickListener);
    }

    public void setDefaultSecLeftClickListener(View.OnClickListener onClickListener) {
        this.f35950b = onClickListener;
        setSecLeftClickListener(onClickListener);
    }

    @Override // com.ss.android.lark.ui.CommonTitleBar
    public void setLeftClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            super.setLeftClickListener(onClickListener);
        } else {
            super.setLeftClickListener(this.f35949a);
        }
    }

    @Override // com.ss.android.lark.ui.CommonTitleBar
    public void setSecLeftClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            super.setSecLeftClickListener(onClickListener);
        } else {
            super.setSecLeftClickListener(this.f35950b);
        }
    }

    public CustomTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
