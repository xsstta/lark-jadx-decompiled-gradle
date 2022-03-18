package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
public class aj {

    /* renamed from: a */
    private final Context f1584a;

    /* renamed from: b */
    private final View f1585b;

    /* renamed from: c */
    private final TextView f1586c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1587d;

    /* renamed from: e */
    private final Rect f1588e = new Rect();

    /* renamed from: f */
    private final int[] f1589f = new int[2];

    /* renamed from: g */
    private final int[] f1590g = new int[2];

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2542b() {
        if (this.f1585b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2540a() {
        if (mo2542b()) {
            ((WindowManager) this.f1584a.getSystemService("window")).removeView(this.f1585b);
        }
    }

    /* renamed from: a */
    private static View m1854a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    aj(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1587d = layoutParams;
        this.f1584a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f1585b = inflate;
        this.f1586c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131886106;
        layoutParams.flags = 24;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2541a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo2542b()) {
            mo2540a();
        }
        this.f1586c.setText(charSequence);
        m1855a(view, i, i2, z, this.f1587d);
        ((WindowManager) this.f1584a.getSystemService("window")).addView(this.f1585b, this.f1587d);
    }

    /* renamed from: a */
    private void m1855a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int i3;
        int i4;
        int i5;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1584a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1584a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.f1584a.getResources();
        if (z) {
            i5 = R.dimen.tooltip_y_offset_touch;
        } else {
            i5 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
        View a = m1854a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f1588e);
        if (this.f1588e.left < 0 && this.f1588e.top < 0) {
            Resources resources2 = this.f1584a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i6 = resources2.getDimensionPixelSize(identifier);
            } else {
                i6 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.f1588e.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f1590g);
        view.getLocationOnScreen(this.f1589f);
        int[] iArr = this.f1589f;
        int i7 = iArr[0];
        int[] iArr2 = this.f1590g;
        iArr[0] = i7 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1585b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1585b.getMeasuredHeight();
        int[] iArr3 = this.f1589f;
        int i8 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i9 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i8 >= 0) {
                layoutParams.y = i8;
            } else {
                layoutParams.y = i9;
            }
        } else if (measuredHeight + i9 <= this.f1588e.height()) {
            layoutParams.y = i9;
        } else {
            layoutParams.y = i8;
        }
    }
}
