package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.AbstractC0915q;
import androidx.core.widget.TextViewCompat;
import com.larksuite.suite.R;

public class AppCompatEditText extends EditText implements AbstractC0915q {

    /* renamed from: a */
    private final C0443d f1319a;

    /* renamed from: b */
    private final C0452l f1320b;

    /* renamed from: c */
    private final C0451k f1321c;

    @Override // androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        C0443d dVar = this.f1319a;
        if (dVar != null) {
            return dVar.mo2570a();
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0443d dVar = this.f1319a;
        if (dVar != null) {
            return dVar.mo2576b();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0443d dVar = this.f1319a;
        if (dVar != null) {
            dVar.mo2578c();
        }
        C0452l lVar = this.f1320b;
        if (lVar != null) {
            lVar.mo2624b();
        }
    }

    public TextClassifier getTextClassifier() {
        C0451k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f1321c) == null) {
            return super.getTextClassifier();
        }
        return kVar.mo2610a();
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m4488a(this, callback));
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0443d dVar = this.f1319a;
        if (dVar != null) {
            dVar.mo2572a(colorStateList);
        }
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0443d dVar = this.f1319a;
        if (dVar != null) {
            dVar.mo2573a(mode);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0447g.m1927a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0443d dVar = this.f1319a;
        if (dVar != null) {
            dVar.mo2574a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0443d dVar = this.f1319a;
        if (dVar != null) {
            dVar.mo2571a(i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0451k kVar;
        if (Build.VERSION.SDK_INT >= 28 || (kVar = this.f1321c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kVar.mo2611a(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0452l lVar = this.f1320b;
        if (lVar != null) {
            lVar.mo2616a(context, i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0424ac.m1773a(context), attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0443d dVar = new C0443d(this);
        this.f1319a = dVar;
        dVar.mo2575a(attributeSet, i);
        C0452l lVar = new C0452l(this);
        this.f1320b = lVar;
        lVar.mo2619a(attributeSet, i);
        lVar.mo2624b();
        this.f1321c = new C0451k(this);
    }
}
