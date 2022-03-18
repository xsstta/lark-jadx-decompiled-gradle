package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.widget.TextViewCompat;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f1317a = {16843016};

    /* renamed from: b */
    private final C0452l f1318b;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0452l lVar = this.f1318b;
        if (lVar != null) {
            lVar.mo2624b();
        }
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m4488a(this, callback));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0447g.m1927a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0215a.m655b(getContext(), i));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0452l lVar = this.f1318b;
        if (lVar != null) {
            lVar.mo2616a(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0424ac.m1773a(context), attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0452l lVar = new C0452l(this);
        this.f1318b = lVar;
        lVar.mo2619a(attributeSet, i);
        lVar.mo2624b();
        C0427af a = C0427af.m1778a(getContext(), attributeSet, f1317a, i, 0);
        setCheckMarkDrawable(a.mo2477a(0));
        a.mo2482b();
    }
}
