package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.material.internal.C22332d;
import com.google.android.material.internal.C22358l;
import com.google.android.material.theme.p992a.C22497a;
import com.larksuite.suite.R;

public class TextInputEditText extends AppCompatEditText {

    /* renamed from: a */
    private final Rect f55209a;

    /* renamed from: b */
    private boolean f55210b;

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !textInputLayout.mo78364a()) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.mo78364a() && super.getHint() == null && C22332d.m80914a()) {
            setHint("");
        }
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f55210b = z;
    }

    public TextInputEditText(Context context) {
        this(context, null);
    }

    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f55210b && rect != null) {
            textInputLayout.getFocusedRect(this.f55209a);
            rect.bottom = this.f55209a.bottom;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            accessibilityNodeInfo.setText(m81486a(textInputLayout));
        }
    }

    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f55210b) {
            this.f55209a.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(R.dimen.mtrl_edittext_rectangle_top_offset), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f55209a, true);
        }
        return requestRectangleOnScreen;
    }

    /* renamed from: a */
    private String m81486a(TextInputLayout textInputLayout) {
        String str;
        String str2;
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        String str3 = "";
        if (z2) {
            str = hint.toString();
        } else {
            str = str3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if ((z4 || z3) && !TextUtils.isEmpty(str)) {
            str2 = ", ";
        } else {
            str2 = str3;
        }
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = str3;
        }
        sb3.append((Object) helperText);
        String sb4 = sb3.toString();
        if (z) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append((Object) text);
            if (!TextUtils.isEmpty(sb4)) {
                str3 = ", " + sb4;
            }
            sb5.append(str3);
            return sb5.toString();
        } else if (!TextUtils.isEmpty(sb4)) {
            return sb4;
        } else {
            return str3;
        }
    }

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!(textInputLayout == null || !this.f55210b || rect == null)) {
            textInputLayout.getGlobalVisibleRect(this.f55209a, point);
            rect.bottom = this.f55209a.bottom;
        }
        return globalVisibleRect;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(C22497a.m81662a(context, attributeSet, i, 0), attributeSet, i);
        this.f55209a = new Rect();
        TypedArray a = C22358l.m80999a(context, attributeSet, new int[]{R.attr.textInputLayoutFocusedRectEnabled}, i, 2131887310, new int[0]);
        setTextInputLayoutFocusedRectEnabled(a.getBoolean(0, false));
        a.recycle();
    }
}
