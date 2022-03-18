package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0945h;
import com.larksuite.suite.R;

class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1327a;

    /* renamed from: b */
    private boolean f1328b;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        f1327a = z;
    }

    /* renamed from: a */
    private void m1626a(boolean z) {
        if (f1327a) {
            this.f1328b = z;
        } else {
            C0945h.m4561a(this, z);
        }
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1625a(context, attributeSet, i, 0);
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1327a && this.f1328b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1625a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1625a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0427af a = C0427af.m1778a(context, attributeSet, new int[]{16843126, 16843465, R.attr.overlapAnchor}, i, i2);
        if (a.mo2492g(2)) {
            m1626a(a.mo2478a(2, false));
        }
        setBackgroundDrawable(a.mo2477a(0));
        a.mo2482b();
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1327a && this.f1328b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1327a && this.f1328b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
