package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.p017a.p018a.C0215a;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.textfield.TextInputLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.textfield.a */
class C22465a extends AbstractC22488e {

    /* renamed from: a */
    public final TextWatcher f55267a = new TextWatcher() {
        /* class com.google.android.material.textfield.C22465a.C224661 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            if (C22465a.this.f55312j.getSuffixText() == null) {
                C22465a.this.mo78524b(C22465a.m81567a(editable));
            }
        }
    };

    /* renamed from: b */
    public final View.OnFocusChangeListener f55268b = new View.OnFocusChangeListener() {
        /* class com.google.android.material.textfield.C22465a.View$OnFocusChangeListenerC224672 */

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C22465a aVar = C22465a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.mo78524b(z2);
        }
    };

    /* renamed from: c */
    private final TextInputLayout.AbstractC22463b f55269c = new TextInputLayout.AbstractC22463b() {
        /* class com.google.android.material.textfield.C22465a.C224683 */

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC22463b
        /* renamed from: a */
        public void mo78520a(TextInputLayout textInputLayout) {
            boolean z;
            EditText editText = textInputLayout.getEditText();
            if (!editText.hasFocus() || !C22465a.m81567a(editText.getText())) {
                z = false;
            } else {
                z = true;
            }
            textInputLayout.setEndIconVisible(z);
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C22465a.this.f55268b);
            editText.removeTextChangedListener(C22465a.this.f55267a);
            editText.addTextChangedListener(C22465a.this.f55267a);
        }
    };

    /* renamed from: d */
    private final TextInputLayout.AbstractC22464c f55270d = new TextInputLayout.AbstractC22464c() {
        /* class com.google.android.material.textfield.C22465a.C224694 */

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC22464c
        /* renamed from: a */
        public void mo78521a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.removeTextChangedListener(C22465a.this.f55267a);
                if (editText.getOnFocusChangeListener() == C22465a.this.f55268b) {
                    editText.setOnFocusChangeListener(null);
                }
            }
        }
    };

    /* renamed from: e */
    private AnimatorSet f55271e;

    /* renamed from: f */
    private ValueAnimator f55272f;

    /* renamed from: d */
    private ValueAnimator m81569d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C22116a.f53782d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.textfield.C22465a.C224749 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C22465a.this.f55314l.setScaleX(floatValue);
                C22465a.this.f55314l.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC22488e
    /* renamed from: a */
    public void mo78522a() {
        this.f55312j.setEndIconDrawable(C0215a.m655b(this.f55313k, R.drawable.mtrl_ic_cancel));
        this.f55312j.setEndIconContentDescription(this.f55312j.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f55312j.setEndIconOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.textfield.C22465a.View$OnClickListenerC224705 */

            public void onClick(View view) {
                Editable text = C22465a.this.f55312j.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
            }
        });
        this.f55312j.mo78361a(this.f55269c);
        this.f55312j.mo78362a(this.f55270d);
        m81568c();
    }

    /* renamed from: c */
    private void m81568c() {
        ValueAnimator d = m81569d();
        ValueAnimator a = m81566a(BitmapDescriptorFactory.HUE_RED, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f55271e = animatorSet;
        animatorSet.playTogether(d, a);
        this.f55271e.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.textfield.C22465a.C224716 */

            public void onAnimationStart(Animator animator) {
                C22465a.this.f55312j.setEndIconVisible(true);
            }
        });
        ValueAnimator a2 = m81566a(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f55272f = a2;
        a2.addListener(new AnimatorListenerAdapter() {
            /* class com.google.android.material.textfield.C22465a.C224727 */

            public void onAnimationEnd(Animator animator) {
                C22465a.this.f55312j.setEndIconVisible(false);
            }
        });
    }

    /* renamed from: a */
    public static boolean m81567a(Editable editable) {
        if (editable.length() > 0) {
            return true;
        }
        return false;
    }

    C22465a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private ValueAnimator m81566a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C22116a.f53779a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.textfield.C22465a.C224738 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C22465a.this.f55314l.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return ofFloat;
    }

    /* renamed from: b */
    public void mo78524b(boolean z) {
        boolean z2;
        if (this.f55312j.mo78374e() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            this.f55272f.cancel();
            this.f55271e.start();
            if (z2) {
                this.f55271e.end();
                return;
            }
            return;
        }
        this.f55271e.cancel();
        this.f55272f.start();
        if (z2) {
            this.f55272f.end();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC22488e
    /* renamed from: a */
    public void mo78523a(boolean z) {
        if (this.f55312j.getSuffixText() != null) {
            mo78524b(z);
        }
    }
}
