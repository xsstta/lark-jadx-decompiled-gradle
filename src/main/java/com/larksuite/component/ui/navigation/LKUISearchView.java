package com.larksuite.component.ui.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class LKUISearchView extends LinearLayout implements TextWatcher {

    /* renamed from: A */
    private ImageView f62799A;

    /* renamed from: B */
    private ImageView f62800B;

    /* renamed from: C */
    private TextView f62801C;

    /* renamed from: D */
    private ImageView f62802D;

    /* renamed from: E */
    private RelativeLayout f62803E;

    /* renamed from: a */
    public LKUIClearEditText f62804a;

    /* renamed from: b */
    public View.OnFocusChangeListener f62805b;

    /* renamed from: c */
    private int f62806c;

    /* renamed from: d */
    private int f62807d;

    /* renamed from: e */
    private int f62808e;

    /* renamed from: f */
    private int f62809f;

    /* renamed from: g */
    private float f62810g;

    /* renamed from: h */
    private float f62811h;

    /* renamed from: i */
    private boolean f62812i;

    /* renamed from: j */
    private boolean f62813j;

    /* renamed from: k */
    private String f62814k;

    /* renamed from: l */
    private String f62815l;

    /* renamed from: m */
    private CharSequence f62816m;

    /* renamed from: n */
    private int f62817n;

    /* renamed from: o */
    private boolean f62818o;

    /* renamed from: p */
    private int f62819p;

    /* renamed from: q */
    private int f62820q;

    /* renamed from: r */
    private int f62821r;

    /* renamed from: s */
    private int f62822s;

    /* renamed from: t */
    private boolean f62823t;

    /* renamed from: u */
    private int f62824u;

    /* renamed from: v */
    private int f62825v;

    /* renamed from: w */
    private int f62826w;

    /* renamed from: x */
    private int f62827x;

    /* renamed from: y */
    private SearchIconGravity f62828y;

    /* renamed from: z */
    private TextView f62829z;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ImageView getBackImageView() {
        return this.f62802D;
    }

    public TextView getCancelView() {
        return this.f62801C;
    }

    public LKUIClearEditText getEditView() {
        return this.f62804a;
    }

    public TextView getHintView() {
        return this.f62829z;
    }

    public RelativeLayout getInputLayout() {
        return this.f62803E;
    }

    public ImageView getLeftImageView() {
        return this.f62799A;
    }

    public ImageView getRightImageView() {
        return this.f62800B;
    }

    public CharSequence getSearchText() {
        return this.f62816m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.ui.navigation.LKUISearchView$6 */
    public static /* synthetic */ class C256876 {

        /* renamed from: a */
        static final /* synthetic */ int[] f62835a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.larksuite.component.ui.navigation.LKUISearchView$SearchIconGravity[] r0 = com.larksuite.component.ui.navigation.LKUISearchView.SearchIconGravity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.ui.navigation.LKUISearchView.C256876.f62835a = r0
                com.larksuite.component.ui.navigation.LKUISearchView$SearchIconGravity r1 = com.larksuite.component.ui.navigation.LKUISearchView.SearchIconGravity.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.ui.navigation.LKUISearchView.C256876.f62835a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.ui.navigation.LKUISearchView$SearchIconGravity r1 = com.larksuite.component.ui.navigation.LKUISearchView.SearchIconGravity.CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.ui.navigation.LKUISearchView.C256876.<clinit>():void");
        }
    }

    public enum SearchIconGravity {
        LEFT,
        CENTER;

        public int toGravity() {
            if (C256876.f62835a[ordinal()] != 2) {
                return 8388611;
            }
            return 17;
        }
    }

    /* renamed from: b */
    private void m92128b() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(200);
        this.f62801C.startAnimation(translateAnimation);
    }

    /* renamed from: c */
    private void m92129c() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, 1.5f, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(200);
        this.f62801C.startAnimation(translateAnimation);
    }

    /* renamed from: a */
    private void m92126a() {
        int i;
        int i2;
        int i3;
        int i4;
        this.f62806c = ContextCompat.getColor(getContext(), R.color.lkui_N100);
        this.f62811h = (float) C25653b.m91897c(getContext(), 14.0f);
        this.f62807d = ContextCompat.getColor(getContext(), R.color.lkui_N900);
        this.f62810g = (float) C25653b.m91897c(getContext(), 14.0f);
        this.f62808e = ContextCompat.getColor(getContext(), R.color.lkui_B500);
        this.f62809f = ContextCompat.getColor(getContext(), R.color.lkui_B500);
        this.f62814k = getResources().getString(R.string.Lark_Legacy_Search);
        this.f62827x = ContextCompat.getColor(getContext(), R.color.lkui_N100);
        if (ContextCompat.getDrawable(getContext(), this.f62819p) != null) {
            i = ContextCompat.getDrawable(getContext(), this.f62819p).getIntrinsicWidth();
        } else {
            i = (int) C25653b.m91892a(getContext(), 16.0f);
        }
        this.f62820q = i;
        if (ContextCompat.getDrawable(getContext(), this.f62819p) != null) {
            i2 = ContextCompat.getDrawable(getContext(), this.f62819p).getIntrinsicHeight();
        } else {
            i2 = (int) C25653b.m91892a(getContext(), 16.0f);
        }
        this.f62821r = i2;
        if (ContextCompat.getDrawable(getContext(), this.f62822s) != null) {
            i3 = ContextCompat.getDrawable(getContext(), this.f62822s).getIntrinsicHeight();
        } else {
            i3 = (int) C25653b.m91892a(getContext(), 16.0f);
        }
        this.f62825v = i3;
        if (ContextCompat.getDrawable(getContext(), this.f62822s) != null) {
            i4 = ContextCompat.getDrawable(getContext(), this.f62822s).getIntrinsicWidth();
        } else {
            i4 = (int) C25653b.m91892a(getContext(), 16.0f);
        }
        this.f62824u = i4;
    }

    public void afterTextChanged(Editable editable) {
        this.f62816m = editable;
    }

    public void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f62805b = onFocusChangeListener;
    }

    public LKUISearchView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo89897a(TextWatcher textWatcher) {
        LKUIClearEditText lKUIClearEditText = this.f62804a;
        if (lKUIClearEditText != null) {
            lKUIClearEditText.addTextChangedListener(textWatcher);
        }
    }

    public void setCancelTextColor(int i) {
        this.f62808e = i;
        this.f62801C.setTextColor(i);
    }

    public void setCancelTextSize(float f) {
        this.f62810g = f;
        this.f62801C.setTextSize(f);
    }

    public void setClearDrawable(Drawable drawable) {
        this.f62804a.setClearDrawable(drawable);
    }

    public void setClearDrawableResId(int i) {
        this.f62817n = i;
        this.f62804a.setClearDrawable(i);
    }

    public void setClearEnabled(boolean z) {
        this.f62818o = z;
        this.f62804a.setClearIconVisible(z);
    }

    public void setEditTextCursorColor(int i) {
        this.f62809f = i;
        this.f62804a.setCursorColor(i);
    }

    public void setLeftDrawable(Drawable drawable) {
        this.f62799A.setImageDrawable(drawable);
    }

    public void setLeftDrawableResId(int i) {
        this.f62819p = i;
        this.f62799A.setImageResource(i);
    }

    public void setRightDrawable(Drawable drawable) {
        this.f62800B.setImageDrawable(drawable);
    }

    public void setRightDrawableResId(int i) {
        this.f62822s = i;
        this.f62800B.setImageResource(i);
    }

    public void setCancelEnabled(boolean z) {
        this.f62812i = z;
        if (!z) {
            this.f62801C.setVisibility(8);
        }
    }

    public void setHintTextColor(int i) {
        this.f62806c = i;
        this.f62829z.setTextColor(i);
        this.f62804a.setHintTextColor(i);
        invalidate();
    }

    public void setRightDrawableEnabled(boolean z) {
        int i;
        this.f62823t = z;
        ImageView imageView = this.f62800B;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setTextSize(float f) {
        this.f62811h = f;
        this.f62829z.setTextSize(f);
        this.f62804a.setTextSize(f);
    }

    /* renamed from: a */
    public void mo89898a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    /* renamed from: a */
    public void mo89899a(boolean z) {
        this.f62804a.setText(this.f62816m);
        this.f62829z.setVisibility(8);
        this.f62804a.setVisibility(0);
        this.f62804a.requestFocus();
        if (this.f62812i) {
            this.f62801C.setVisibility(0);
        }
        m92128b();
        if (z) {
            postDelayed(new Runnable() {
                /* class com.larksuite.component.ui.navigation.LKUISearchView.RunnableC256854 */

                public void run() {
                    if (LKUISearchView.this.f62805b != null) {
                        LKUISearchView.this.f62805b.onFocusChange(LKUISearchView.this.f62804a, true);
                    }
                    LKUISearchView lKUISearchView = LKUISearchView.this;
                    lKUISearchView.mo89898a((View) lKUISearchView.f62804a);
                }
            }, 50);
        }
    }

    /* renamed from: b */
    public void mo89901b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null && inputMethodManager.isActive()) {
            inputMethodManager.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        }
    }

    public void setInputLayoutBackGroundColor(int i) {
        RelativeLayout relativeLayout = this.f62803E;
        if (relativeLayout != null && relativeLayout.getBackground() != null) {
            Drawable background = this.f62803E.getBackground();
            background.mutate();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i);
            } else if (background instanceof ShapeDrawable) {
                ((ShapeDrawable) background).getPaint().setColor(i);
            } else if (background instanceof ColorDrawable) {
                ((ColorDrawable) background).setColor(i);
            }
        }
    }

    /* renamed from: b */
    public void mo89902b(boolean z) {
        this.f62816m = "";
        this.f62804a.setText("");
        this.f62804a.setVisibility(8);
        this.f62829z.setVisibility(0);
        this.f62801C.setVisibility(8);
        this.f62804a.clearFocus();
        m92129c();
        if (z) {
            postDelayed(new Runnable() {
                /* class com.larksuite.component.ui.navigation.LKUISearchView.RunnableC256865 */

                public void run() {
                    if (LKUISearchView.this.f62805b != null) {
                        LKUISearchView.this.f62805b.onFocusChange(LKUISearchView.this.f62804a, false);
                    }
                    LKUISearchView lKUISearchView = LKUISearchView.this;
                    lKUISearchView.mo89901b(lKUISearchView.f62804a);
                }
            }, 50);
        }
    }

    /* renamed from: a */
    private void m92127a(AttributeSet attributeSet) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        int i2 = 8;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.search_back_enabled, R.attr.search_cancel_enabled, R.attr.search_cancel_text, R.attr.search_cancel_textColor, R.attr.search_cancel_textSize, R.attr.search_clear_drawable, R.attr.search_clear_enabled, R.attr.search_edit_text_cursorColor, R.attr.search_hint_text, R.attr.search_hint_textColor, R.attr.search_input_background, R.attr.search_input_background_color, R.attr.search_left_drawable, R.attr.search_left_drawable_height, R.attr.search_left_drawable_width, R.attr.search_right_drawable, R.attr.search_right_drawable_enabled, R.attr.search_right_drawable_height, R.attr.search_right_drawable_width, R.attr.search_search_icon_gravity, R.attr.search_textColor, R.attr.search_textSize});
            this.f62806c = obtainStyledAttributes.getColor(9, ContextCompat.getColor(getContext(), R.color.text_placeholder));
            this.f62811h = obtainStyledAttributes.getDimension(21, (float) C25653b.m91897c(getContext(), 14.0f));
            this.f62807d = obtainStyledAttributes.getColor(20, ContextCompat.getColor(getContext(), R.color.text_title));
            this.f62813j = obtainStyledAttributes.getBoolean(0, false);
            this.f62812i = obtainStyledAttributes.getBoolean(1, true);
            this.f62808e = obtainStyledAttributes.getColor(3, ContextCompat.getColor(getContext(), R.color.primary_pri_500));
            this.f62815l = obtainStyledAttributes.getString(2);
            this.f62810g = obtainStyledAttributes.getDimension(4, (float) C25653b.m91897c(getContext(), 14.0f));
            this.f62809f = obtainStyledAttributes.getColor(7, ContextCompat.getColor(getContext(), R.color.primary_pri_500));
            this.f62819p = obtainStyledAttributes.getResourceId(12, R.drawable.lkui_navigation_search);
            if (ContextCompat.getDrawable(getContext(), this.f62819p) != null) {
                f = (float) ContextCompat.getDrawable(getContext(), this.f62819p).getIntrinsicWidth();
            } else {
                f = C25653b.m91892a(getContext(), 16.0f);
            }
            this.f62820q = (int) obtainStyledAttributes.getDimension(14, f);
            if (ContextCompat.getDrawable(getContext(), this.f62819p) != null) {
                f2 = (float) ContextCompat.getDrawable(getContext(), this.f62819p).getIntrinsicHeight();
            } else {
                f2 = C25653b.m91892a(getContext(), 16.0f);
            }
            this.f62821r = (int) obtainStyledAttributes.getDimension(13, f2);
            this.f62822s = obtainStyledAttributes.getResourceId(15, R.drawable.lkui_navigation_search);
            if (ContextCompat.getDrawable(getContext(), this.f62822s) != null) {
                f3 = (float) ContextCompat.getDrawable(getContext(), this.f62822s).getIntrinsicWidth();
            } else {
                f3 = C25653b.m91892a(getContext(), 16.0f);
            }
            this.f62824u = (int) obtainStyledAttributes.getDimension(18, f3);
            if (ContextCompat.getDrawable(getContext(), this.f62822s) != null) {
                f4 = (float) ContextCompat.getDrawable(getContext(), this.f62822s).getIntrinsicHeight();
            } else {
                f4 = C25653b.m91892a(getContext(), 16.0f);
            }
            this.f62825v = (int) obtainStyledAttributes.getDimension(17, f4);
            this.f62823t = obtainStyledAttributes.getBoolean(16, false);
            this.f62817n = obtainStyledAttributes.getResourceId(5, R.drawable.lkui_navigation_search_clear);
            this.f62818o = obtainStyledAttributes.getBoolean(6, true);
            this.f62827x = obtainStyledAttributes.getColor(11, ContextCompat.getColor(getContext(), R.color.bg_filler));
            this.f62826w = obtainStyledAttributes.getResourceId(10, R.drawable.lkui_navigation_searchview_bg);
            String string = obtainStyledAttributes.getString(8);
            this.f62814k = string;
            if (string == null) {
                this.f62814k = getResources().getString(R.string.Lark_Legacy_Search);
                this.f62815l = getResources().getString(R.string.Lark_Legacy_Cancel);
            }
            this.f62828y = SearchIconGravity.values()[obtainStyledAttributes.getInt(19, SearchIconGravity.LEFT.ordinal())];
            obtainStyledAttributes.recycle();
        } else {
            m92126a();
        }
        this.f62829z.setTextSize(0, this.f62811h);
        this.f62829z.setTextColor(this.f62806c);
        this.f62804a.setHintTextColor(this.f62806c);
        this.f62804a.setTextSize(0, this.f62811h);
        this.f62804a.setTextColor(this.f62807d);
        this.f62804a.setCursorColor(this.f62809f);
        this.f62801C.setTextColor(this.f62808e);
        this.f62801C.setTextSize(0, this.f62810g);
        if (!this.f62812i) {
            this.f62801C.setVisibility(8);
        }
        this.f62799A.setImageResource(this.f62819p);
        ViewGroup.LayoutParams layoutParams = this.f62799A.getLayoutParams();
        layoutParams.width = this.f62820q;
        layoutParams.height = this.f62821r;
        this.f62799A.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f62800B.getLayoutParams();
        layoutParams2.width = this.f62824u;
        layoutParams2.height = this.f62825v;
        this.f62800B.setLayoutParams(layoutParams2);
        this.f62800B.setImageResource(this.f62822s);
        ImageView imageView = this.f62800B;
        if (this.f62823t) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        this.f62804a.setClearDrawable(this.f62817n);
        this.f62804a.setClearEnable(this.f62818o);
        this.f62829z.setText(this.f62814k);
        this.f62804a.setHint(this.f62814k);
        this.f62803E.setGravity(this.f62828y.toGravity());
        this.f62803E.setBackgroundResource(this.f62826w);
        setInputLayoutBackGroundColor(this.f62827x);
        ImageView imageView2 = this.f62802D;
        if (this.f62813j) {
            i2 = 0;
        }
        imageView2.setVisibility(i2);
        if (this.f62813j) {
            this.f62802D.setOnClickListener(new View.OnClickListener() {
                /* class com.larksuite.component.ui.navigation.LKUISearchView.View$OnClickListenerC256843 */

                public void onClick(View view) {
                    LKUISearchView.this.mo89902b(true);
                }
            });
        }
        ((ViewGroup) findViewById(R.id.root)).getLayoutTransition().setDuration(200);
    }

    public LKUISearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LKUISearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62812i = true;
        this.f62817n = R.drawable.lkui_navigation_search_clear;
        this.f62818o = true;
        this.f62819p = R.drawable.lkui_navigation_search;
        this.f62822s = R.drawable.lkui_navigation_search;
        this.f62826w = R.drawable.lkui_navigation_searchview_bg;
        this.f62828y = SearchIconGravity.LEFT;
        inflate(context, R.layout.lkui_navigation_search_layout, this);
        this.f62804a = (LKUIClearEditText) findViewById(R.id.input_view);
        this.f62799A = (ImageView) findViewById(R.id.drawable_left);
        this.f62800B = (ImageView) findViewById(R.id.drawable_right);
        this.f62803E = (RelativeLayout) findViewById(R.id.input_layout);
        this.f62829z = (TextView) findViewById(R.id.hint_text);
        this.f62801C = (TextView) findViewById(R.id.cancel);
        this.f62802D = (ImageView) findViewById(R.id.search_titlebar_left);
        this.f62804a.setSingleLine(true);
        this.f62804a.setInputType(1);
        m92127a(attributeSet);
        this.f62803E.setOnClickListener(new View.OnClickListener() {
            /* class com.larksuite.component.ui.navigation.LKUISearchView.View$OnClickListenerC256821 */

            public void onClick(View view) {
                LKUISearchView.this.mo89899a(true);
            }
        });
        this.f62801C.setOnClickListener(new View.OnClickListener() {
            /* class com.larksuite.component.ui.navigation.LKUISearchView.View$OnClickListenerC256832 */

            public void onClick(View view) {
                LKUISearchView.this.mo89902b(true);
            }
        });
        this.f62804a.addTextChangedListener(this);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f62816m = charSequence;
        if (!TextUtils.isEmpty(charSequence) && this.f62818o && this.f62800B.getVisibility() == 0) {
            this.f62800B.setVisibility(8);
        } else if (TextUtils.isEmpty(charSequence) && this.f62823t) {
            this.f62800B.setVisibility(0);
        }
    }
}
