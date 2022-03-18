package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.view.AbstractC0915q;
import androidx.core.widget.TextViewCompat;
import com.larksuite.suite.R;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements AbstractC0915q {

    /* renamed from: a */
    private static final int[] f1311a = {16843126};

    /* renamed from: b */
    private final C0443d f1312b;

    /* renamed from: c */
    private final C0452l f1313c;

    @Override // androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        C0443d dVar = this.f1312b;
        if (dVar != null) {
            return dVar.mo2570a();
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0443d dVar = this.f1312b;
        if (dVar != null) {
            return dVar.mo2576b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0443d dVar = this.f1312b;
        if (dVar != null) {
            dVar.mo2578c();
        }
        C0452l lVar = this.f1313c;
        if (lVar != null) {
            lVar.mo2624b();
        }
    }

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m4488a(this, callback));
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0443d dVar = this.f1312b;
        if (dVar != null) {
            dVar.mo2572a(colorStateList);
        }
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0443d dVar = this.f1312b;
        if (dVar != null) {
            dVar.mo2573a(mode);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0447g.m1927a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0443d dVar = this.f1312b;
        if (dVar != null) {
            dVar.mo2574a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0443d dVar = this.f1312b;
        if (dVar != null) {
            dVar.mo2571a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0215a.m655b(getContext(), i));
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0452l lVar = this.f1313c;
        if (lVar != null) {
            lVar.mo2616a(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0424ac.m1773a(context), attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0427af a = C0427af.m1778a(getContext(), attributeSet, f1311a, i, 0);
        if (a.mo2492g(0)) {
            setDropDownBackgroundDrawable(a.mo2477a(0));
        }
        a.mo2482b();
        C0443d dVar = new C0443d(this);
        this.f1312b = dVar;
        dVar.mo2575a(attributeSet, i);
        C0452l lVar = new C0452l(this);
        this.f1313c = lVar;
        lVar.mo2619a(attributeSet, i);
        lVar.mo2624b();
    }
}
