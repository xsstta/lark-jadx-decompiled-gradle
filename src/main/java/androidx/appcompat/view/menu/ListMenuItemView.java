package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.widget.C0427af;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, AbstractC0339m.AbstractC0340a {

    /* renamed from: a */
    private C0326h f990a;

    /* renamed from: b */
    private ImageView f991b;

    /* renamed from: c */
    private RadioButton f992c;

    /* renamed from: d */
    private TextView f993d;

    /* renamed from: e */
    private CheckBox f994e;

    /* renamed from: f */
    private TextView f995f;

    /* renamed from: g */
    private ImageView f996g;

    /* renamed from: h */
    private ImageView f997h;

    /* renamed from: i */
    private LinearLayout f998i;

    /* renamed from: j */
    private Drawable f999j;

    /* renamed from: k */
    private int f1000k;

    /* renamed from: l */
    private Context f1001l;

    /* renamed from: m */
    private boolean f1002m;

    /* renamed from: n */
    private Drawable f1003n;

    /* renamed from: o */
    private boolean f1004o;

    /* renamed from: p */
    private LayoutInflater f1005p;

    /* renamed from: q */
    private boolean f1006q;

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public boolean mo1215a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    public C0326h getItemData() {
        return this.f990a;
    }

    /* renamed from: b */
    private void m1264b() {
        ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f991b = imageView;
        m1263a(imageView, 0);
    }

    /* renamed from: c */
    private void m1265c() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f992c = radioButton;
        m1262a(radioButton);
    }

    /* renamed from: d */
    private void m1266d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f994e = checkBox;
        m1262a(checkBox);
    }

    private LayoutInflater getInflater() {
        if (this.f1005p == null) {
            this.f1005p = LayoutInflater.from(getContext());
        }
        return this.f1005p;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.m4039a(this, this.f999j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f993d = textView;
        int i = this.f1000k;
        if (i != -1) {
            textView.setTextAppearance(this.f1001l, i);
        }
        this.f995f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f996g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1003n);
        }
        this.f997h = (ImageView) findViewById(R.id.group_divider);
        this.f998i = (LinearLayout) findViewById(R.id.content);
    }

    /* renamed from: a */
    private void m1262a(View view) {
        m1263a(view, -1);
    }

    public void setForceShowIcon(boolean z) {
        this.f1006q = z;
        this.f1002m = z;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f996g;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f990a.mo1477g()) {
            if (this.f992c == null) {
                m1265c();
            }
            compoundButton = this.f992c;
        } else {
            if (this.f994e == null) {
                m1266d();
            }
            compoundButton = this.f994e;
        }
        compoundButton.setChecked(z);
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f997h;
        if (imageView != null) {
            if (this.f1004o || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f997h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f997h.getLayoutParams();
            rect.top += this.f997h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f993d.setText(charSequence);
            if (this.f993d.getVisibility() != 0) {
                this.f993d.setVisibility(0);
            }
        } else if (this.f993d.getVisibility() != 8) {
            this.f993d.setVisibility(8);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f992c != null || this.f994e != null) {
            if (this.f990a.mo1477g()) {
                if (this.f992c == null) {
                    m1265c();
                }
                compoundButton2 = this.f992c;
                compoundButton = this.f994e;
            } else {
                if (this.f994e == null) {
                    m1266d();
                }
                compoundButton2 = this.f994e;
                compoundButton = this.f992c;
            }
            if (z) {
                compoundButton2.setChecked(this.f990a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f994e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f992c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (this.f990a.mo1492i() || this.f1006q) {
            z = true;
        } else {
            z = false;
        }
        if (z || this.f1002m) {
            ImageView imageView = this.f991b;
            if (imageView != null || drawable != null || this.f1002m) {
                if (imageView == null) {
                    m1264b();
                }
                if (drawable != null || this.f1002m) {
                    ImageView imageView2 = this.f991b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f991b.getVisibility() != 0) {
                        this.f991b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f991b.setVisibility(8);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    /* renamed from: a */
    private void m1263a(View view, int i) {
        LinearLayout linearLayout = this.f998i;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    public void mo1270a(boolean z, char c) {
        int i;
        if (!z || !this.f990a.mo1476f()) {
            i = 8;
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f995f.setText(this.f990a.mo1474e());
        }
        if (this.f995f.getVisibility() != i) {
            this.f995f.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f991b != null && this.f1002m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f991b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m.AbstractC0340a
    /* renamed from: a */
    public void mo1214a(C0326h hVar, int i) {
        int i2;
        this.f990a = hVar;
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(hVar.mo1463a((AbstractC0339m.AbstractC0340a) this));
        setCheckable(hVar.isCheckable());
        mo1270a(hVar.mo1476f(), hVar.mo1472d());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0427af a = C0427af.m1778a(getContext(), attributeSet, new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow}, i, 0);
        this.f999j = a.mo2477a(5);
        this.f1000k = a.mo2491g(1, -1);
        this.f1002m = a.mo2478a(7, false);
        this.f1001l = context;
        this.f1003n = a.mo2477a(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f1004o = obtainStyledAttributes.hasValue(0);
        a.mo2482b();
        obtainStyledAttributes.recycle();
    }
}
