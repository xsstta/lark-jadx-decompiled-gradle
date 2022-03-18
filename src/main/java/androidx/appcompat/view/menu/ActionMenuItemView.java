package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0431ah;

public class ActionMenuItemView extends AppCompatTextView implements View.OnClickListener, AbstractC0339m.AbstractC0340a, ActionMenuView.AbstractC0361a {

    /* renamed from: a */
    C0326h f938a;

    /* renamed from: b */
    C0322f.AbstractC0324b f939b;

    /* renamed from: c */
    AbstractC0310b f940c;

    /* renamed from: e */
    private CharSequence f941e;

    /* renamed from: f */
    private Drawable f942f;

    /* renamed from: g */
    private AbstractView$OnAttachStateChangeListenerC0466s f943g;

    /* renamed from: h */
    private boolean f944h;

    /* renamed from: i */
    private boolean f945i;

    /* renamed from: j */
    private int f946j;

    /* renamed from: k */
    private int f947k;

    /* renamed from: l */
    private int f948l;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0310b {
        /* renamed from: a */
        public abstract AbstractC0342o mo1235a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public boolean mo1215a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    public C0326h getItemData() {
        return this.f938a;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0361a
    /* renamed from: d */
    public boolean mo1218d() {
        return mo1216b();
    }

    /* renamed from: b */
    public boolean mo1216b() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0309a extends AbstractView$OnAttachStateChangeListenerC0466s {
        @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
        /* renamed from: a */
        public AbstractC0342o mo1233a() {
            if (ActionMenuItemView.this.f940c != null) {
                return ActionMenuItemView.this.f940c.mo1235a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0466s
        /* renamed from: b */
        public boolean mo1234b() {
            AbstractC0342o a;
            if (ActionMenuItemView.this.f939b == null || !ActionMenuItemView.this.f939b.mo1266a(ActionMenuItemView.this.f938a) || (a = mo1233a()) == null || !a.isShowing()) {
                return false;
            }
            return true;
        }

        public C0309a() {
            super(ActionMenuItemView.this);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0361a
    /* renamed from: c */
    public boolean mo1217c() {
        if (!mo1216b() || this.f938a.getIcon() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m1225e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m1226f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f941e);
        if (this.f942f != null && (!this.f938a.mo1500m() || (!this.f944h && !this.f945i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f941e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f938a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f938a.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f938a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence3 = this.f938a.getTitle();
            }
            C0431ah.m1845a(this, charSequence3);
            return;
        }
        C0431ah.m1845a(this, tooltipText);
    }

    public void setItemInvoker(C0322f.AbstractC0324b bVar) {
        this.f939b = bVar;
    }

    public void setPopupCallback(AbstractC0310b bVar) {
        this.f940c = bVar;
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f941e = charSequence;
        m1226f();
    }

    public void onClick(View view) {
        C0322f.AbstractC0324b bVar = this.f939b;
        if (bVar != null) {
            bVar.mo1266a(this.f938a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f944h = m1225e();
        m1226f();
    }

    public void setExpandedFormat(boolean z) {
        if (this.f945i != z) {
            this.f945i = z;
            C0326h hVar = this.f938a;
            if (hVar != null) {
                hVar.mo1490h();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnAttachStateChangeListenerC0466s sVar;
        if (!this.f938a.hasSubMenu() || (sVar = this.f943g) == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setIcon(Drawable drawable) {
        this.f942f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f948l;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1226f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public void mo1214a(C0326h hVar, int i) {
        int i2;
        this.f938a = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.mo1463a((AbstractC0339m.AbstractC0340a) this));
        setId(hVar.getItemId());
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f943g == null) {
            this.f943g = new C0309a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean b = mo1216b();
        if (b && (i4 = this.f947k) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f946j);
        } else {
            i3 = this.f946j;
        }
        if (mode != 1073741824 && this.f946j > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!b && this.f942f != null) {
            super.setPadding((getMeasuredWidth() - this.f942f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f944h = m1225e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071}, i, 0);
        this.f946j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f948l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f947k = -1;
        setSaveEnabled(false);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f947k = i;
        super.setPadding(i, i2, i3, i4);
    }
}
