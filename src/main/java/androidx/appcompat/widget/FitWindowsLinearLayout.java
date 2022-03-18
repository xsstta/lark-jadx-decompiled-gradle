package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AbstractC0464r;

public class FitWindowsLinearLayout extends LinearLayout implements AbstractC0464r {

    /* renamed from: a */
    private AbstractC0464r.AbstractC0465a f1376a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AbstractC0464r
    public void setOnFitSystemWindowsListener(AbstractC0464r.AbstractC0465a aVar) {
        this.f1376a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        AbstractC0464r.AbstractC0465a aVar = this.f1376a;
        if (aVar != null) {
            aVar.mo864a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
