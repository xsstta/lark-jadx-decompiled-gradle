package com.ss.lark.android.passport.biz.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.ss.android.lark.passport.infra.widget.dividetext.C49270a;
import java.util.List;
import java.util.regex.Pattern;

public class PhoneDivideEditText extends AppCompatEditText {

    /* renamed from: a */
    public C49270a f164382a;

    /* renamed from: b */
    public final TextWatcher f164383b = new TextWatcher() {
        /* class com.ss.lark.android.passport.biz.widget.PhoneDivideEditText.C652761 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (PhoneDivideEditText.this.f164382a != null && PhoneDivideEditText.this.f164382a.mo171841a() != 0) {
                if (PhoneDivideEditText.this.mo224590a(charSequence) > PhoneDivideEditText.this.f164382a.mo171841a()) {
                    String a = PhoneDivideEditText.this.mo224591a(charSequence.toString());
                    if (a.length() > PhoneDivideEditText.this.f164382a.mo171841a()) {
                        a = a.substring(0, PhoneDivideEditText.this.f164382a.mo171841a());
                    }
                    String charSequence2 = PhoneDivideEditText.this.mo224594b(a).toString();
                    PhoneDivideEditText.this.setText(charSequence2);
                    PhoneDivideEditText.this.setSelection(charSequence2.length());
                    return;
                }
                PhoneDivideEditText phoneDivideEditText = PhoneDivideEditText.this;
                phoneDivideEditText.mo224592a(charSequence, phoneDivideEditText.getSelectionStart(), PhoneDivideEditText.this.getSelectionEnd());
            }
        }
    };

    /* renamed from: c */
    private final TextWatcher f164384c = new TextWatcher() {
        /* class com.ss.lark.android.passport.biz.widget.PhoneDivideEditText.C652772 */

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (PhoneDivideEditText.this.f164382a != null && charSequence.length() <= PhoneDivideEditText.this.f164382a.mo171841a()) {
                PhoneDivideEditText.this.removeTextChangedListener(this);
                PhoneDivideEditText phoneDivideEditText = PhoneDivideEditText.this;
                phoneDivideEditText.mo224592a(charSequence, phoneDivideEditText.getSelectionStart(), PhoneDivideEditText.this.getSelectionEnd());
                PhoneDivideEditText phoneDivideEditText2 = PhoneDivideEditText.this;
                phoneDivideEditText2.addTextChangedListener(phoneDivideEditText2.f164383b);
            }
        }
    };

    /* renamed from: c */
    private void m256193c() {
        setImeOptions(6);
    }

    /* renamed from: b */
    private void m256192b() {
        addTextChangedListener(this.f164383b);
        m256193c();
    }

    public String getPhoneText() {
        return mo224591a(getText().toString());
    }

    /* renamed from: a */
    public boolean mo224593a() {
        C49270a aVar = this.f164382a;
        if (aVar == null || aVar.mo171841a() == 0) {
            if (getPhoneText().length() > 0) {
                return true;
            }
            return false;
        } else if (getPhoneText().length() == this.f164382a.mo171841a()) {
            return true;
        } else {
            return false;
        }
    }

    public PhoneDivideEditText(Context context) {
        super(context);
        m256192b();
    }

    /* renamed from: a */
    public int mo224590a(CharSequence charSequence) {
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

    /* renamed from: c */
    private void m256194c(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                if (charSequence.charAt(i) != ' ') {
                    sb.append(charSequence.charAt(i));
                }
            }
            if (!(TextUtils.isEmpty(sb.toString().trim()) || sb.toString().equals(charSequence.toString()))) {
                int b = m256191b(charSequence, getSelectionStart());
                int b2 = m256191b(charSequence, getSelectionEnd());
                setText(sb.toString());
                setSelection(b, b2);
            }
        }
    }

    /* renamed from: a */
    public String mo224591a(String str) {
        if (str != null) {
            return Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("");
        }
        return "";
    }

    public void setDivideStyle(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f164382a = null;
            m256194c(getText());
            return;
        }
        this.f164382a = new C49270a(str);
        if (getText().toString().length() > this.f164382a.mo171841a()) {
            m256194c(getText());
        } else {
            mo224592a(mo224591a(getText().toString()), getSelectionStart(), getSelectionEnd());
        }
    }

    /* renamed from: b */
    public CharSequence mo224594b(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        List<Integer> b = this.f164382a.mo171842b();
        List<Integer> subList = b.subList(0, b.size() - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) != ' ' || !subList.contains(Integer.valueOf(i))) {
                sb.append(charSequence.charAt(i));
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
        return sb;
    }

    /* renamed from: b */
    private int m256191b(CharSequence charSequence, int i) {
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
        m256192b();
    }

    /* renamed from: a */
    private int m256190a(CharSequence charSequence, int i) {
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
        m256192b();
    }

    /* renamed from: a */
    public void mo224592a(CharSequence charSequence, int i, int i2) {
        CharSequence b = mo224594b(charSequence);
        if (!TextUtils.isEmpty(b.toString().trim()) && !b.toString().equals(charSequence.toString())) {
            setText(b.toString());
            int a = m256190a(b, m256191b(charSequence, i));
            if (i >= i2) {
                setSelection(a);
            } else {
                setSelection(a, m256190a(b, m256191b(charSequence, i2)));
            }
        }
    }
}
