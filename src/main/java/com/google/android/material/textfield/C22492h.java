package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.p017a.p018a.C0215a;
import com.google.android.material.textfield.TextInputLayout;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.textfield.h */
class C22492h extends AbstractC22488e {

    /* renamed from: a */
    public final TextWatcher f55342a = new TextWatcher() {
        /* class com.google.android.material.textfield.C22492h.C224931 */

        public void afterTextChanged(Editable editable) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C22492h.this.f55314l.setChecked(!C22492h.this.mo78583c());
        }
    };

    /* renamed from: b */
    private final TextInputLayout.AbstractC22463b f55343b = new TextInputLayout.AbstractC22463b() {
        /* class com.google.android.material.textfield.C22492h.C224942 */

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC22463b
        /* renamed from: a */
        public void mo78520a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C22492h.this.f55314l.setChecked(true ^ C22492h.this.mo78583c());
            editText.removeTextChangedListener(C22492h.this.f55342a);
            editText.addTextChangedListener(C22492h.this.f55342a);
        }
    };

    /* renamed from: c */
    private final TextInputLayout.AbstractC22464c f55344c = new TextInputLayout.AbstractC22464c() {
        /* class com.google.android.material.textfield.C22492h.C224953 */

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC22464c
        /* renamed from: a */
        public void mo78521a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.removeTextChangedListener(C22492h.this.f55342a);
            }
        }
    };

    /* renamed from: c */
    public boolean mo78583c() {
        EditText editText = this.f55312j.getEditText();
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC22488e
    /* renamed from: a */
    public void mo78522a() {
        this.f55312j.setEndIconDrawable(C0215a.m655b(this.f55313k, R.drawable.design_password_eye));
        this.f55312j.setEndIconContentDescription(this.f55312j.getResources().getText(R.string.password_toggle_content_description));
        this.f55312j.setEndIconOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.textfield.C22492h.View$OnClickListenerC224964 */

            public void onClick(View view) {
                EditText editText = C22492h.this.f55312j.getEditText();
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    if (C22492h.this.mo78583c()) {
                        editText.setTransformationMethod(null);
                    } else {
                        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        editText.setSelection(selectionEnd);
                    }
                }
            }
        });
        this.f55312j.mo78361a(this.f55343b);
        this.f55312j.mo78362a(this.f55344c);
        EditText editText = this.f55312j.getEditText();
        if (m81646a(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    C22492h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: a */
    private static boolean m81646a(EditText editText) {
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            return false;
        }
        return true;
    }
}
