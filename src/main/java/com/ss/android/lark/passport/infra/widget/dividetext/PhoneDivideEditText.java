package com.ss.android.lark.passport.infra.widget.dividetext;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.List;
import java.util.regex.Pattern;

public class PhoneDivideEditText extends AppCompatEditText {

    /* renamed from: a */
    public C49270a f123668a;

    /* renamed from: b */
    public final TextWatcher f123669b = new TextWatcher() {
        /* class com.ss.android.lark.passport.infra.widget.dividetext.PhoneDivideEditText.C492681 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (PhoneDivideEditText.this.f123668a != null) {
                if (PhoneDivideEditText.this.mo171830a(charSequence) > PhoneDivideEditText.this.f123668a.mo171841a()) {
                    PhoneDivideEditText.this.removeTextChangedListener(this);
                    PhoneDivideEditText.this.mo171832b(charSequence);
                    PhoneDivideEditText phoneDivideEditText = PhoneDivideEditText.this;
                    phoneDivideEditText.addTextChangedListener(phoneDivideEditText.f123670c);
                    return;
                }
                PhoneDivideEditText phoneDivideEditText2 = PhoneDivideEditText.this;
                phoneDivideEditText2.mo171831a(charSequence, phoneDivideEditText2.getSelectionStart(), PhoneDivideEditText.this.getSelectionEnd());
            }
        }
    };

    /* renamed from: c */
    public final TextWatcher f123670c = new TextWatcher() {
        /* class com.ss.android.lark.passport.infra.widget.dividetext.PhoneDivideEditText.C492692 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (PhoneDivideEditText.this.f123668a != null && charSequence.length() <= PhoneDivideEditText.this.f123668a.mo171841a()) {
                PhoneDivideEditText.this.removeTextChangedListener(this);
                PhoneDivideEditText phoneDivideEditText = PhoneDivideEditText.this;
                phoneDivideEditText.mo171831a(charSequence, phoneDivideEditText.getSelectionStart(), PhoneDivideEditText.this.getSelectionEnd());
                PhoneDivideEditText phoneDivideEditText2 = PhoneDivideEditText.this;
                phoneDivideEditText2.addTextChangedListener(phoneDivideEditText2.f123669b);
            }
        }
    };

    /* renamed from: b */
    private void m194155b() {
        setImeOptions(6);
    }

    /* renamed from: a */
    private void m194153a() {
        addTextChangedListener(this.f123669b);
        m194155b();
    }

    public String getPhoneText() {
        return m194152a(getText().toString());
    }

    public PhoneDivideEditText(Context context) {
        super(context);
        m194153a();
    }

    /* renamed from: a */
    private String m194152a(String str) {
        if (str != null) {
            return Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("");
        }
        return "";
    }

    /* renamed from: a */
    public int mo171830a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) != ' ') {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public void mo171832b(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                if (charSequence.charAt(i) != ' ') {
                    sb.append(charSequence.charAt(i));
                }
            }
            if (!(TextUtils.isEmpty(sb.toString().trim()) || sb.toString().equals(charSequence.toString()))) {
                int b = m194154b(charSequence, getSelectionStart());
                int b2 = m194154b(charSequence, getSelectionEnd());
                setText(sb.toString());
                setSelection(b, b2);
            }
        }
    }

    public void setDivideStyle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f123668a = null;
            mo171832b(getText());
            return;
        }
        this.f123668a = new C49270a(str);
        if (getText().toString().length() > this.f123668a.mo171841a()) {
            mo171832b(getText());
        } else {
            mo171831a(m194152a(getText().toString()), getSelectionStart(), getSelectionEnd());
        }
    }

    /* renamed from: b */
    private int m194154b(CharSequence charSequence, int i) {
        if (i < 0) {
            return charSequence.length();
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < charSequence.length() && i2 < i) {
            if (charSequence.charAt(i2) != ' ') {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    public PhoneDivideEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m194153a();
    }

    /* renamed from: a */
    private int m194151a(CharSequence charSequence, int i) {
        if (i < 0) {
            return charSequence.length();
        }
        if (i == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (charSequence.charAt(i3) != ' ' && (i2 = i2 + 1) == i) {
                return i3 + 1;
            }
        }
        return charSequence.length();
    }

    public PhoneDivideEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m194153a();
    }

    /* renamed from: a */
    public void mo171831a(CharSequence charSequence, int i, int i2) {
        if (charSequence != null && charSequence.length() != 0) {
            List<Integer> b = this.f123668a.mo171842b();
            List<Integer> subList = b.subList(0, b.size() - 1);
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < charSequence.length(); i3++) {
                if (charSequence.charAt(i3) != ' ' || !subList.contains(Integer.valueOf(i3))) {
                    sb.append(charSequence.charAt(i3));
                    if (sb.charAt(sb.length() - 1) != ' ') {
                        for (Integer num : subList) {
                            if (sb.length() == num.intValue() + 1) {
                                sb.insert(sb.length() - 1, ' ');
                            }
                        }
                    }
                    if (sb.charAt(sb.length() - 1) == ' ') {
                        sb = sb.deleteCharAt(sb.length() - 1);
                    }
                }
            }
            if (!TextUtils.isEmpty(sb.toString().trim()) && !sb.toString().equals(charSequence.toString())) {
                setText(sb.toString());
                int a = m194151a(sb, m194154b(charSequence, i));
                if (i >= i2) {
                    setSelection(a);
                } else {
                    setSelection(a, m194151a(sb, m194154b(charSequence, i2)));
                }
            }
        }
    }
}
