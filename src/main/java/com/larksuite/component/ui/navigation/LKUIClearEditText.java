package com.larksuite.component.ui.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;

public class LKUIClearEditText extends AppCompatEditText implements TextWatcher, View.OnFocusChangeListener {

    /* renamed from: a */
    private boolean f62780a;

    /* renamed from: b */
    private boolean f62781b = true;

    /* renamed from: c */
    private int f62782c = R.drawable.ud_icon_close_filled;

    /* renamed from: d */
    private float f62783d;

    /* renamed from: e */
    private ArrayList<TextWatcher> f62784e;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void setClearEnable(boolean z) {
        this.f62781b = z;
    }

    public void setClearDrawable(int i) {
        this.f62782c = i;
        invalidate();
    }

    public void setClearDrawableSize(float f) {
        this.f62783d = f;
        invalidate();
    }

    public void setCursorColor(int i) {
        UIUtils.setTextViewCursorColor(getContext(), this, i);
    }

    public LKUIClearEditText(Context context) {
        super(context);
        m92123a(null);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.f62784e;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
        }
        super.removeTextChangedListener(textWatcher);
    }

    public void setCursorDrawable(int i) {
        UIUtils.setTextViewEditorDrawable(this, getResources().getDrawable(i));
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f62784e == null) {
            this.f62784e = new ArrayList<>();
        }
        this.f62784e.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public void setClearDrawable(Drawable drawable) {
        if (drawable != null) {
            float f = this.f62783d;
            drawable.setBounds(0, 0, (int) f, (int) f);
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], drawable, getCompoundDrawables()[3]);
        }
    }

    public void setClearIconVisible(boolean z) {
        Drawable drawable = getCompoundDrawables()[2];
        if (drawable == null && this.f62782c != 0) {
            drawable = ContextCompat.getDrawable(getContext(), this.f62782c);
        }
        float f = this.f62783d;
        drawable.setBounds(0, 0, (int) f, (int) f);
        if (!z) {
            drawable = null;
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], drawable, getCompoundDrawables()[3]);
    }

    /* renamed from: a */
    private void m92123a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.clear_drawable, R.attr.clear_size});
            this.f62782c = obtainStyledAttributes.getResourceId(0, this.f62782c);
            this.f62783d = obtainStyledAttributes.getDimension(1, C25653b.m91892a(getContext(), 16.0f));
            obtainStyledAttributes.recycle();
        }
        setOnFocusChangeListener(this);
        addTextChangedListener(this);
        setCompoundDrawablePadding((int) C25653b.m91892a(getContext(), 8.0f));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1 && getCompoundDrawables()[2] != null) {
            if (motionEvent.getX() <= ((float) (getWidth() - getTotalPaddingRight())) || motionEvent.getX() >= ((float) (getWidth() - getPaddingRight()))) {
                z = false;
            }
            if (z && this.f62781b) {
                setText("");
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public LKUIClearEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m92123a(attributeSet);
    }

    public void onFocusChange(View view, boolean z) {
        this.f62780a = z;
        boolean z2 = false;
        if (z) {
            if (getText().length() > 0) {
                z2 = true;
            }
            setClearIconVisible(z2);
            return;
        }
        setClearIconVisible(false);
    }

    public LKUIClearEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m92123a(attributeSet);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (this.f62780a) {
            if (charSequence.length() <= 0 || !this.f62781b) {
                z = false;
            } else {
                z = true;
            }
            setClearIconVisible(z);
        }
    }
}
