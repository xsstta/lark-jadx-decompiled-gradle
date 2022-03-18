package com.ss.android.lark.security.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49203q;

public class SecurityVerifyEditText extends RelativeLayout {

    /* renamed from: a */
    public int f133921a = 4;

    /* renamed from: b */
    public boolean f133922b = true;

    /* renamed from: c */
    public EditText f133923c;

    /* renamed from: d */
    public AbstractC54106c f133924d;

    /* renamed from: e */
    public AbstractC54104a f133925e;

    /* renamed from: f */
    public AbstractC54105b f133926f;

    /* renamed from: g */
    private boolean f133927g;

    /* renamed from: h */
    private CodeView[] f133928h;

    /* renamed from: i */
    private LinearLayout f133929i;

    /* renamed from: j */
    private CheckBox f133930j;

    /* renamed from: com.ss.android.lark.security.widget.SecurityVerifyEditText$a */
    public interface AbstractC54104a {
        /* renamed from: a */
        void mo185095a(String str);
    }

    /* renamed from: com.ss.android.lark.security.widget.SecurityVerifyEditText$b */
    public interface AbstractC54105b {
        /* renamed from: a */
        void mo185097a(String str);
    }

    /* renamed from: com.ss.android.lark.security.widget.SecurityVerifyEditText$c */
    public interface AbstractC54106c {
        /* renamed from: a */
        void mo185139a(String str);
    }

    /* renamed from: e */
    private boolean m209920e() {
        if (!this.f133927g || this.f133922b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo185155a() {
        EditText editText = this.f133923c;
        if (editText != null) {
            editText.setFocusable(true);
            this.f133923c.setFocusableInTouchMode(true);
            this.f133923c.requestFocus();
            postDelayed(new Runnable() {
                /* class com.ss.android.lark.security.widget.SecurityVerifyEditText.RunnableC541001 */

                public void run() {
                    C49203q.m193975a(SecurityVerifyEditText.this.f133923c);
                }
            }, 500);
        }
    }

    /* renamed from: b */
    public void mo185158b() {
        this.f133923c.setText("");
        for (int i = 0; i < this.f133921a; i++) {
            this.f133928h[i].mo185150a();
        }
    }

    public String getVerifyCodeText() {
        EditText editText = this.f133923c;
        if (editText != null) {
            return editText.getText().toString().trim();
        }
        return "";
    }

    /* renamed from: d */
    private void m209919d() {
        this.f133928h = new CodeView[this.f133921a];
        int i = 0;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        while (true) {
            CodeView[] codeViewArr = this.f133928h;
            if (i < codeViewArr.length) {
                codeViewArr[i] = new CodeView(getContext());
                this.f133929i.addView(this.f133928h[i], layoutParams);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private void m209918c() {
        this.f133923c = (EditText) findViewById(R.id.et_pwd);
        this.f133929i = (LinearLayout) findViewById(R.id.layout_code);
        this.f133930j = (CheckBox) findViewById(R.id.iv_switch);
        this.f133930j.setButtonDrawable(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.lark_security_verify_preview_cb_bg, UDColorUtils.getColor(getContext(), R.color.icon_n3)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f133929i.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f133923c.getLayoutParams();
        if (this.f133927g) {
            layoutParams.removeRule(13);
            layoutParams2.removeRule(13);
            this.f133930j.setVisibility(0);
        } else {
            layoutParams.addRule(13, -1);
            layoutParams2.addRule(13, -1);
            this.f133930j.setVisibility(8);
        }
        this.f133929i.setLayoutParams(layoutParams);
        this.f133923c.setLayoutParams(layoutParams2);
        this.f133923c.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f133921a)});
        this.f133923c.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.security.widget.SecurityVerifyEditText.C541012 */

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                SecurityVerifyEditText.this.mo185156a(editable);
                if (editable.length() == SecurityVerifyEditText.this.f133921a && SecurityVerifyEditText.this.f133924d != null) {
                    SecurityVerifyEditText.this.f133924d.mo185139a(editable.toString().trim());
                }
                if (SecurityVerifyEditText.this.f133926f != null) {
                    SecurityVerifyEditText.this.f133926f.mo185097a(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Editable text = SecurityVerifyEditText.this.f133923c.getText();
                Selection.setSelection(text, text.length());
            }
        });
        this.f133923c.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.security.widget.SecurityVerifyEditText.C541023 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6 || SecurityVerifyEditText.this.f133925e == null) {
                    return false;
                }
                SecurityVerifyEditText.this.f133925e.mo185095a(textView.getText().toString());
                return true;
            }
        });
        this.f133930j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.security.widget.SecurityVerifyEditText.C541034 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    SecurityVerifyEditText.this.f133923c.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    SecurityVerifyEditText.this.f133923c.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                SecurityVerifyEditText.this.f133923c.setSelection(SecurityVerifyEditText.this.f133923c.getText().length());
                SecurityVerifyEditText.this.f133922b = !z;
                SecurityVerifyEditText securityVerifyEditText = SecurityVerifyEditText.this;
                securityVerifyEditText.mo185156a(securityVerifyEditText.f133923c.getText());
            }
        });
        m209919d();
    }

    public void setOnInputCompleteListener(AbstractC54104a aVar) {
        this.f133925e = aVar;
    }

    public void setOnInputProcessListener(AbstractC54105b bVar) {
        this.f133926f = bVar;
    }

    public void setOnTextFinishListener(AbstractC54106c cVar) {
        this.f133924d = cVar;
    }

    public SecurityVerifyEditText(Context context) {
        super(context);
        m209917a((AttributeSet) null);
    }

    /* renamed from: a */
    public void mo185157a(boolean z) {
        this.f133927g = true;
        if (z) {
            this.f133923c.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else {
            this.f133923c.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        EditText editText = this.f133923c;
        editText.setSelection(editText.getText().length());
        this.f133922b = !z;
        mo185156a(this.f133923c.getText());
    }

    /* renamed from: a */
    private void m209917a(AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(R.layout.lark_security_verify_edit_text, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.pwd_default_cipher, R.attr.pwd_length, R.attr.pwd_switch});
            this.f133927g = obtainStyledAttributes.getBoolean(2, false);
            this.f133921a = obtainStyledAttributes.getInt(1, 4);
            this.f133922b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        m209918c();
    }

    /* renamed from: a */
    public void mo185156a(Editable editable) {
        int i = 0;
        if (editable.length() > 0) {
            int length = editable.length();
            while (i < this.f133921a) {
                if (i < length) {
                    this.f133928h[i].setText(String.valueOf(editable.charAt(i)));
                    if (m209920e()) {
                        this.f133928h[i].mo185151b();
                    } else {
                        this.f133928h[i].mo185152c();
                    }
                } else {
                    this.f133928h[i].mo185150a();
                }
                i++;
            }
            return;
        }
        while (i < this.f133921a) {
            this.f133928h[i].mo185150a();
            i++;
        }
    }

    public SecurityVerifyEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m209917a(attributeSet);
    }

    public SecurityVerifyEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m209917a(attributeSet);
    }
}
