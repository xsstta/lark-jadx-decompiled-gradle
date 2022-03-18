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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import java.util.Objects;

public class PhoneInput extends BaseContactInput {

    /* renamed from: b */
    public AbstractC65287b f164387b;

    /* renamed from: c */
    public AbstractC65286a f164388c;

    /* renamed from: d */
    public AbstractC65288b.AbstractC65291c f164389d;

    /* renamed from: e */
    public AbstractC65288b.AbstractC65295g f164390e;

    /* renamed from: f */
    public AbstractC65288b.AbstractC65289a f164391f;

    /* renamed from: g */
    public AbstractC65288b.AbstractC65293e f164392g;

    /* renamed from: h */
    public boolean f164393h;

    /* renamed from: i */
    public boolean f164394i;

    /* renamed from: j */
    public StatefulInputBgDrawable f164395j;

    /* renamed from: k */
    private CountryBean f164396k;

    /* renamed from: l */
    private final TextWatcher f164397l = new TextWatcher() {
        /* class com.ss.lark.android.passport.biz.widget.PhoneInput.C652781 */

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            if (TextUtils.isEmpty(obj) && PhoneInput.this.f164389d != null) {
                PhoneInput.this.f164389d.mo223896a(false);
            }
            if (PhoneInput.this.f164388c != null) {
                PhoneInput.this.f164388c.mo223897a(obj);
            }
            if (PhoneInput.this.f164392g != null) {
                PhoneInput.this.f164392g.onInputPhoneChanged(obj, PhoneInput.this.getSimplePhoneNum());
            }
        }
    };

    /* renamed from: m */
    private final View.OnClickListener f164398m = new View.OnClickListener() {
        /* class com.ss.lark.android.passport.biz.widget.PhoneInput.View$OnClickListenerC652792 */

        public void onClick(View view) {
            if (PhoneInput.this.f164387b != null) {
                PhoneInput.this.f164387b.onRegionSelect();
            }
        }
    };
    @BindView(6552)
    View mDivideAround;
    @BindView(6570)
    ImageView mIvChoose;
    @BindView(6864)
    PhoneDivideEditText mPhoneInput;
    @BindView(6379)
    TextView mRegionCode;
    @BindView(6683)
    LinearLayout mRegionContainer;

    /* renamed from: n */
    private final View.OnFocusChangeListener f164399n = new View.OnFocusChangeListener() {
        /* class com.ss.lark.android.passport.biz.widget.PhoneInput.View$OnFocusChangeListenerC652803 */

        public void onFocusChange(View view, boolean z) {
            if (!z) {
                PhoneInput.this.f164393h = false;
                PhoneInput.this.f164395j.mo171824a();
                return;
            }
            if (PhoneInput.this.f164390e != null && view.hasFocus() && !PhoneInput.this.f164394i) {
                PhoneInput.this.f164390e.mo224644a();
            }
            PhoneInput.this.f164394i = false;
            if (view == PhoneInput.this.mRegionCode && PhoneInput.this.f164393h) {
                return;
            }
            if (view != PhoneInput.this.mPhoneInput || !PhoneInput.this.f164393h) {
                PhoneInput.this.f164393h = true;
                PhoneInput.this.f164395j.mo171827b();
            }
        }
    };

    /* renamed from: o */
    private final View.OnClickListener f164400o = new View.OnClickListener() {
        /* class com.ss.lark.android.passport.biz.widget.PhoneInput.View$OnClickListenerC652814 */

        public void onClick(View view) {
            if (PhoneInput.this.f164390e != null) {
                PhoneInput.this.f164390e.mo224644a();
            }
        }
    };

    /* renamed from: com.ss.lark.android.passport.biz.widget.PhoneInput$a */
    public interface AbstractC65286a {
        /* renamed from: a */
        void mo223897a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.PhoneInput$b */
    public interface AbstractC65287b {
        void onRegionSelect();
    }

    public CountryBean getCountryInfo() {
        return this.f164396k;
    }

    /* renamed from: d */
    public void mo224605d() {
        this.mPhoneInput.setText("");
    }

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput
    public String getContent() {
        return this.mPhoneInput.getPhoneText();
    }

    public String getSimplePhoneNum() {
        return this.mPhoneInput.getPhoneText();
    }

    /* renamed from: f */
    public void mo224607f() {
        PhoneDivideEditText phoneDivideEditText = this.mPhoneInput;
        phoneDivideEditText.setSelection(phoneDivideEditText.getText().length());
    }

    public String getRegionCode() {
        return this.mRegionCode.getText().toString();
    }

    /* renamed from: h */
    public boolean mo224614h() {
        PhoneDivideEditText phoneDivideEditText = this.mPhoneInput;
        if (phoneDivideEditText == null || !phoneDivideEditText.mo224593a()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo224608g() {
        if (!mo224614h()) {
            AbstractC65288b.AbstractC65291c cVar = this.f164389d;
            if (cVar != null) {
                cVar.mo223896a(false);
                return;
            }
            return;
        }
        AbstractC65288b.AbstractC65291c cVar2 = this.f164389d;
        if (cVar2 != null) {
            cVar2.mo223896a(true);
        }
    }

    public String getPhoneNum() {
        return getRegionWithPlus() + this.mPhoneInput.getPhoneText();
    }

    public String getRegionWithPlus() {
        return "+" + this.mRegionCode.getText().toString();
    }

    /* renamed from: e */
    public void mo224606e() {
        this.mPhoneInput.setFocusable(true);
        this.mPhoneInput.setFocusableInTouchMode(true);
        this.mPhoneInput.requestFocus();
        Activity a = ViewUtils.m224141a(getContext());
        if (a != null && !C49203q.m193977c(a)) {
            postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.widget.PhoneInput.RunnableC652858 */

                public void run() {
                    if (PhoneInput.this.mPhoneInput.isFocused()) {
                        C49203q.m193975a(PhoneInput.this.mPhoneInput);
                    }
                }
            }, 500);
        }
    }

    public void setInputEnabledChangeListener(AbstractC65288b.AbstractC65291c cVar) {
        this.f164389d = cVar;
    }

    public void setOnInputCompleteListener(AbstractC65288b.AbstractC65289a aVar) {
        this.f164391f = aVar;
    }

    public void setOnInputPhoneChangeListener(AbstractC65288b.AbstractC65293e eVar) {
        this.f164392g = eVar;
    }

    public void setOnKeyBoardWillOpenListener(AbstractC65288b.AbstractC65295g gVar) {
        this.f164390e = gVar;
    }

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput
    public void setOnKeyboardDetectorListener(AbstractC65288b.AbstractC65292d dVar) {
        this.f164322a = dVar;
    }

    public void setOnRegionSelectedListener(AbstractC65287b bVar) {
        this.f164387b = bVar;
    }

    public void setRegionCodeListener(AbstractC65286a aVar) {
        this.f164388c = aVar;
    }

    public void setCursorVisibility(boolean z) {
        this.mPhoneInput.setCursorVisible(z);
    }

    public void setInputHintColor(int i) {
        this.mPhoneInput.setHintTextColor(i);
    }

    public void setPhoneInputHint(String str) {
        this.mPhoneInput.setHint(str);
    }

    public void setRegionCode(String str) {
        this.mRegionCode.setText(str);
    }

    public void setSimplePhoneNum(String str) {
        this.mPhoneInput.setText(str);
    }

    public void setChangeCountryCodeEnable(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.mIvChoose.setVisibility(i);
    }

    public PhoneInput(Context context) {
        super(context);
        m256200a(context);
    }

    /* renamed from: a */
    private void m256200a(Context context) {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.signin_sdk_phone_input_v2, this));
        StatefulInputBgDrawable dVar = new StatefulInputBgDrawable(context);
        this.f164395j = dVar;
        this.mDivideAround.setBackground(dVar);
        this.mPhoneInput.setTypeface(Typeface.defaultFromStyle(0));
        this.mPhoneInput.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.widget.PhoneInput.C652825 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                PhoneInput.this.mo224508a(obj);
                if (!PhoneInput.this.mPhoneInput.mo224593a()) {
                    if (PhoneInput.this.f164389d != null) {
                        PhoneInput.this.f164389d.mo223896a(false);
                    }
                } else if (PhoneInput.this.f164389d != null) {
                    PhoneInput.this.f164389d.mo223896a(true);
                }
                if (PhoneInput.this.f164392g != null) {
                    PhoneInput.this.f164392g.onInputPhoneChanged(PhoneInput.this.getRegionCode(), obj);
                }
            }
        });
        this.mPhoneInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.lark.android.passport.biz.widget.PhoneInput.C652836 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (PhoneInput.this.f164391f != null && i == 6 && textView.getText() != null && !textView.getText().toString().isEmpty()) {
                    PhoneInput.this.f164391f.mo223887a();
                    return true;
                } else if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                    return false;
                } else {
                    return PhoneInput.this.mo224510c();
                }
            }
        });
        this.mClearBT.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.PhoneInput.View$OnClickListenerC652847 */

            public void onClick(View view) {
                PhoneInput.this.mPhoneInput.setText("");
            }
        });
        this.mPhoneInput.setOnFocusChangeListener(this.f164399n);
        this.mPhoneInput.setOnClickListener(this.f164400o);
        ak.m193850a(this.mRegionContainer, this.f164398m);
        C49154ag.m193833a(this.mClearBT, C49154ag.m193828a(getContext(), 10.0f));
    }

    /* renamed from: a */
    public void mo224604a(CountryBean countryBean) {
        String str;
        if (!Objects.equals(this.f164396k, countryBean)) {
            this.f164396k = countryBean;
            if (countryBean == null) {
                this.mPhoneInput.setDivideStyle(null);
                AbstractC65288b.AbstractC65291c cVar = this.f164389d;
                if (cVar != null) {
                    cVar.mo223896a(false);
                    return;
                }
                return;
            }
            if (TextUtils.isEmpty(countryBean.getCode()) || countryBean.getCode().length() <= 1) {
                str = "";
            } else {
                str = countryBean.getCode().substring(1);
            }
            this.mRegionCode.setText(str);
            this.mPhoneInput.setDivideStyle(countryBean.getPattern());
        }
    }

    /* renamed from: a */
    public void mo224603a(int i, float f) {
        this.mPhoneInput.setTextSize(i, f);
    }

    public PhoneInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m256200a(context);
    }

    public PhoneInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256200a(context);
    }
}
