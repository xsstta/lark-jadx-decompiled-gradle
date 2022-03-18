package com.ss.lark.android.passport.biz.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import java.util.regex.Pattern;

public class MailInput extends BaseContactInput {

    /* renamed from: b */
    public AbstractC65288b.AbstractC65291c f164369b;

    /* renamed from: c */
    public AbstractC65288b.AbstractC65295g f164370c;

    /* renamed from: d */
    public AbstractC65288b.AbstractC65289a f164371d;

    /* renamed from: e */
    public AbstractC65288b.AbstractC65290b f164372e;

    /* renamed from: f */
    public StatefulInputBgDrawable f164373f;

    /* renamed from: g */
    private String f164374g;
    @BindView(6935)
    View mDivider;
    @BindView(6453)
    EditText mMailInput;

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput
    public String getContent() {
        return getMail();
    }

    /* renamed from: g */
    private void m256186g() {
        this.mMailInput.setHint(R.string.Lark_Login_V3_InputEmailPlaceholder);
    }

    public String getMail() {
        return this.mMailInput.getText().toString();
    }

    public String getMailRegex() {
        if (this.f164374g == null) {
            this.f164374g = PassportConfigHelper.m193031m();
        }
        return this.f164374g;
    }

    /* renamed from: d */
    public void mo224571d() {
        this.mMailInput.setFocusable(true);
        this.mMailInput.setFocusableInTouchMode(true);
        this.mMailInput.requestFocus();
        Activity a = ViewUtils.m224141a(getContext());
        if (a != null && !C49203q.m193977c(a)) {
            postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.widget.MailInput.RunnableC652756 */

                public void run() {
                    if (MailInput.this.mMailInput.isFocused()) {
                        C49203q.m193975a(MailInput.this.mMailInput);
                    }
                }
            }, 500);
        }
    }

    /* renamed from: e */
    public void mo224572e() {
        String obj = this.mMailInput.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            AbstractC65288b.AbstractC65291c cVar = this.f164369b;
            if (cVar != null) {
                cVar.mo223896a(false);
            }
        } else if (this.f164369b != null) {
            this.f164369b.mo223896a(Pattern.compile(getMailRegex()).matcher(obj).matches());
        }
    }

    /* renamed from: f */
    private void m256185f() {
        this.f164373f = new StatefulInputBgDrawable(getContext());
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.signin_sdk_widget_mail_number_input_v2, this));
        this.mDivider.setBackground(this.f164373f);
        this.mMailInput.setTypeface(Typeface.defaultFromStyle(0));
        this.mMailInput.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.widget.MailInput.C652701 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                MailInput.this.mo224508a(obj);
                if (TextUtils.isEmpty(obj)) {
                    if (MailInput.this.f164369b != null) {
                        MailInput.this.f164369b.mo223896a(false);
                    }
                } else if (MailInput.this.f164369b != null) {
                    MailInput.this.f164369b.mo223896a(Boolean.valueOf(Pattern.compile(MailInput.this.getMailRegex()).matcher(obj).matches()).booleanValue());
                }
                if (MailInput.this.f164372e != null) {
                    MailInput.this.f164372e.onInputEmailChanged(obj);
                }
            }
        });
        this.mClearBT.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.MailInput.View$OnClickListenerC652712 */

            public void onClick(View view) {
                MailInput.this.mMailInput.setText("");
            }
        });
        this.mMailInput.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.widget.MailInput.View$OnFocusChangeListenerC652723 */

            public void onFocusChange(View view, boolean z) {
                if (MailInput.this.f164370c != null && !view.hasFocus() && z) {
                    MailInput.this.f164370c.mo224644a();
                }
                if (z) {
                    MailInput.this.f164373f.mo171827b();
                } else {
                    MailInput.this.f164373f.mo171824a();
                }
            }
        });
        this.mMailInput.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.MailInput.View$OnClickListenerC652734 */

            public void onClick(View view) {
                if (MailInput.this.f164370c != null) {
                    MailInput.this.f164370c.mo224644a();
                }
            }
        });
        this.mMailInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.lark.android.passport.biz.widget.MailInput.C652745 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (MailInput.this.f164371d != null && i == 6 && textView.getText() != null && !textView.getText().toString().isEmpty()) {
                    MailInput.this.f164371d.mo223887a();
                    return true;
                } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    return false;
                } else {
                    return MailInput.this.mo224510c();
                }
            }
        });
        C49154ag.m193833a(this.mClearBT, C49154ag.m193828a(getContext(), 10.0f));
        m256186g();
    }

    public void setInputEnabledChangeListener(AbstractC65288b.AbstractC65291c cVar) {
        this.f164369b = cVar;
    }

    public void setOnInputCompleteListener(AbstractC65288b.AbstractC65289a aVar) {
        this.f164371d = aVar;
    }

    public void setOnInputEmailChangeListener(AbstractC65288b.AbstractC65290b bVar) {
        this.f164372e = bVar;
    }

    public void setOnKeyBoardWillOpenListener(AbstractC65288b.AbstractC65295g gVar) {
        this.f164370c = gVar;
    }

    public MailInput(Context context) {
        super(context);
        m256185f();
    }

    public void setContactPoint(String str) {
        this.mMailInput.setText(str);
    }

    public void setEmailInputHint(String str) {
        this.mMailInput.setHint(str);
    }

    public void setInputHintColor(int i) {
        this.mMailInput.setHintTextColor(i);
    }

    /* renamed from: a */
    public void mo224570a(int i, float f) {
        this.mMailInput.setTextSize(i, f);
    }

    public MailInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m256185f();
    }

    public MailInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256185f();
    }
}
