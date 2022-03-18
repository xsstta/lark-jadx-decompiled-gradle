package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.p982c.C22197a;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.textfield.TextInputLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.textfield.d */
class C22477d extends AbstractC22488e {

    /* renamed from: a */
    public static final boolean f55285a;

    /* renamed from: b */
    public final TextWatcher f55286b = new TextWatcher() {
        /* class com.google.android.material.textfield.C22477d.C224781 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            C22477d dVar = C22477d.this;
            final AutoCompleteTextView a = dVar.mo78536a(dVar.f55312j.getEditText());
            a.post(new Runnable() {
                /* class com.google.android.material.textfield.C22477d.C224781.RunnableC224791 */

                public void run() {
                    boolean isPopupShowing = a.isPopupShowing();
                    C22477d.this.mo78540b(isPopupShowing);
                    C22477d.this.f55289e = isPopupShowing;
                }
            });
        }
    };

    /* renamed from: c */
    public final View.OnFocusChangeListener f55287c = new View.OnFocusChangeListener() {
        /* class com.google.android.material.textfield.C22477d.View$OnFocusChangeListenerC224813 */

        public void onFocusChange(View view, boolean z) {
            C22477d.this.f55312j.setEndIconActivated(z);
            if (!z) {
                C22477d.this.mo78540b(false);
                C22477d.this.f55289e = false;
            }
        }
    };

    /* renamed from: d */
    public final TextInputLayout.C22462a f55288d = new TextInputLayout.C22462a(this.f55312j) {
        /* class com.google.android.material.textfield.C22477d.C224824 */

        @Override // androidx.core.view.C0859a, com.google.android.material.textfield.TextInputLayout.C22462a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            super.mo4535a(view, dVar);
            if (C22477d.this.f55312j.getEditText().getKeyListener() == null) {
                dVar.mo4566b((CharSequence) Spinner.class.getName());
            }
            if (dVar.mo4622z()) {
                dVar.mo4585f((CharSequence) null);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: c */
        public void mo4539c(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4539c(view, accessibilityEvent);
            C22477d dVar = C22477d.this;
            AutoCompleteTextView a = dVar.mo78536a(dVar.f55312j.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C22477d.this.f55292h.isTouchExplorationEnabled()) {
                C22477d.this.mo78537a(a);
            }
        }
    };

    /* renamed from: e */
    public boolean f55289e = false;

    /* renamed from: f */
    public boolean f55290f = false;

    /* renamed from: g */
    public long f55291g = Long.MAX_VALUE;

    /* renamed from: h */
    public AccessibilityManager f55292h;

    /* renamed from: i */
    public ValueAnimator f55293i;

    /* renamed from: m */
    private final TextInputLayout.AbstractC22463b f55294m = new TextInputLayout.AbstractC22463b() {
        /* class com.google.android.material.textfield.C22477d.C224835 */

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC22463b
        /* renamed from: a */
        public void mo78520a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a = C22477d.this.mo78536a(textInputLayout.getEditText());
            C22477d.this.mo78539b(a);
            C22477d.this.mo78542c(a);
            C22477d.this.mo78544d(a);
            a.setThreshold(0);
            a.removeTextChangedListener(C22477d.this.f55286b);
            a.addTextChangedListener(C22477d.this.f55286b);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C22477d.this.f55288d);
            textInputLayout.setEndIconVisible(true);
        }
    };

    /* renamed from: n */
    private final TextInputLayout.AbstractC22464c f55295n = new TextInputLayout.AbstractC22464c() {
        /* class com.google.android.material.textfield.C22477d.C224846 */

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC22464c
        /* renamed from: a */
        public void mo78521a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.removeTextChangedListener(C22477d.this.f55286b);
                if (autoCompleteTextView.getOnFocusChangeListener() == C22477d.this.f55287c) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (C22477d.f55285a) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    };

    /* renamed from: o */
    private StateListDrawable f55296o;

    /* renamed from: p */
    private MaterialShapeDrawable f55297p;

    /* renamed from: q */
    private ValueAnimator f55298q;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC22488e
    /* renamed from: a */
    public boolean mo78538a(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC22488e
    /* renamed from: b */
    public boolean mo78541b() {
        return true;
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f55285a = z;
    }

    /* renamed from: c */
    public boolean mo78543c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f55291g;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m81589d() {
        this.f55293i = m81585a(67, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator a = m81585a(50, 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f55298q = a;
        a.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.textfield.C22477d.AnonymousClass10 */

            public void onAnimationEnd(Animator animator) {
                C22477d.this.f55314l.setChecked(C22477d.this.f55290f);
                C22477d.this.f55293i.start();
            }
        });
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC22488e
    /* renamed from: a */
    public void mo78522a() {
        int i;
        float dimensionPixelOffset = (float) this.f55313k.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f55313k.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f55313k.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        MaterialShapeDrawable a = m81586a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        MaterialShapeDrawable a2 = m81586a(BitmapDescriptorFactory.HUE_RED, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f55297p = a;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f55296o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a);
        this.f55296o.addState(new int[0], a2);
        if (f55285a) {
            i = R.drawable.mtrl_dropdown_arrow;
        } else {
            i = R.drawable.mtrl_ic_arrow_drop_down;
        }
        this.f55312j.setEndIconDrawable(C0215a.m655b(this.f55313k, i));
        this.f55312j.setEndIconContentDescription(this.f55312j.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f55312j.setEndIconOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.textfield.C22477d.View$OnClickListenerC224857 */

            public void onClick(View view) {
                C22477d.this.mo78537a((AutoCompleteTextView) C22477d.this.f55312j.getEditText());
            }
        });
        this.f55312j.mo78361a(this.f55294m);
        this.f55312j.mo78362a(this.f55295n);
        m81589d();
        ViewCompat.m4069d((View) this.f55314l, 2);
        this.f55292h = (AccessibilityManager) this.f55313k.getSystemService("accessibility");
    }

    /* renamed from: a */
    public AutoCompleteTextView mo78536a(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: b */
    public void mo78539b(AutoCompleteTextView autoCompleteTextView) {
        if (f55285a) {
            int boxBackgroundMode = this.f55312j.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f55297p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f55296o);
            }
        }
    }

    /* renamed from: d */
    public void mo78544d(final AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() {
            /* class com.google.android.material.textfield.C22477d.View$OnTouchListenerC224868 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (C22477d.this.mo78543c()) {
                        C22477d.this.f55289e = false;
                    }
                    C22477d.this.mo78537a(autoCompleteTextView);
                }
                return false;
            }
        });
        autoCompleteTextView.setOnFocusChangeListener(this.f55287c);
        if (f55285a) {
            autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
                /* class com.google.android.material.textfield.C22477d.C224879 */

                public void onDismiss() {
                    C22477d.this.f55289e = true;
                    C22477d.this.f55291g = System.currentTimeMillis();
                    C22477d.this.mo78540b(false);
                }
            });
        }
    }

    C22477d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: b */
    public void mo78540b(boolean z) {
        if (this.f55290f != z) {
            this.f55290f = z;
            this.f55293i.cancel();
            this.f55298q.start();
        }
    }

    /* renamed from: c */
    public void mo78542c(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f55312j.getBoxBackgroundMode();
            MaterialShapeDrawable boxBackground = this.f55312j.getBoxBackground();
            int a = C22197a.m80102a(autoCompleteTextView, (int) R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m81587a(autoCompleteTextView, a, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m81588b(autoCompleteTextView, a, iArr, boxBackground);
            }
        }
    }

    /* renamed from: a */
    public void mo78537a(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (mo78543c()) {
                this.f55289e = false;
            }
            if (!this.f55289e) {
                if (f55285a) {
                    mo78540b(!this.f55290f);
                } else {
                    this.f55290f = !this.f55290f;
                    this.f55314l.toggle();
                }
                if (this.f55290f) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f55289e = false;
        }
    }

    /* renamed from: a */
    private ValueAnimator m81585a(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C22116a.f53779a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.textfield.C22477d.C224802 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22477d.this.f55314l.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* renamed from: a */
    private MaterialShapeDrawable m81586a(float f, float f2, float f3, int i) {
        C22398l a = C22398l.m81156a().mo78025b(f).mo78030c(f).mo78038e(f2).mo78034d(f2).mo78024a();
        MaterialShapeDrawable a2 = MaterialShapeDrawable.m81080a(this.f55313k, f3);
        a2.setShapeAppearanceModel(a);
        a2.mo77964a(0, i, 0, i);
        return a2;
    }

    /* renamed from: a */
    private void m81587a(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, MaterialShapeDrawable materialShapeDrawable) {
        LayerDrawable layerDrawable;
        int a = C22197a.m80102a(autoCompleteTextView, (int) R.attr.colorSurface);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int a2 = C22197a.m80099a(i, a, 0.1f);
        materialShapeDrawable2.mo77973g(new ColorStateList(iArr, new int[]{a2, 0}));
        if (f55285a) {
            materialShapeDrawable2.setTint(a);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a2, a});
            MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
            materialShapeDrawable3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable});
        }
        ViewCompat.m4039a(autoCompleteTextView, layerDrawable);
    }

    /* renamed from: b */
    private void m81588b(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, MaterialShapeDrawable materialShapeDrawable) {
        int boxBackgroundColor = this.f55312j.getBoxBackgroundColor();
        int[] iArr2 = {C22197a.m80099a(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f55285a) {
            ViewCompat.m4039a(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), materialShapeDrawable, materialShapeDrawable));
            return;
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable2.mo77973g(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{materialShapeDrawable, materialShapeDrawable2});
        int l = ViewCompat.m4094l(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int m = ViewCompat.m4097m(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        ViewCompat.m4039a(autoCompleteTextView, layerDrawable);
        ViewCompat.m4058b(autoCompleteTextView, l, paddingTop, m, paddingBottom);
    }
}
