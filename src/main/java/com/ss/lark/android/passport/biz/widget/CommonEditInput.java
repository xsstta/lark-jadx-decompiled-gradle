package com.ss.lark.android.passport.biz.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;
import com.ss.android.lark.passport.infra.widget.dividetext.C49270a;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import java.util.List;
import java.util.regex.Pattern;

public class CommonEditInput extends BaseContactInput {

    /* renamed from: b */
    public C49270a f164327b;

    /* renamed from: c */
    public boolean f164328c;

    /* renamed from: d */
    public boolean f164329d;

    /* renamed from: e */
    public AbstractC65288b.AbstractC65291c f164330e;

    /* renamed from: f */
    public AbstractC65288b.AbstractC65295g f164331f;

    /* renamed from: g */
    public AbstractC65288b.AbstractC65289a f164332g;

    /* renamed from: h */
    public AbstractC65288b.AbstractC65294f f164333h;

    /* renamed from: i */
    public String f164334i;

    /* renamed from: j */
    public final StatefulInputBgDrawable f164335j = new StatefulInputBgDrawable(getContext());
    @BindView(6353)
    EditText mContentInput;
    @BindView(6935)
    View mDivider;

    public String getContentRegex() {
        return this.f164334i;
    }

    @Override // com.ss.lark.android.passport.biz.widget.BaseContactInput
    public String getContent() {
        return this.mContentInput.getText().toString();
    }

    public String getRemoveBlankText() {
        return getContent().replace(" ", "");
    }

    /* renamed from: d */
    public void mo224520d() {
        this.mContentInput.setFocusable(true);
        this.mContentInput.setFocusableInTouchMode(true);
        this.mContentInput.requestFocus();
        Activity a = ViewUtils.m224142a(this);
        if (a != null && !C49203q.m193977c(a)) {
            postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.widget.CommonEditInput.RunnableC652596 */

                public void run() {
                    if (CommonEditInput.this.mContentInput.isFocused()) {
                        C49203q.m193975a(CommonEditInput.this.mContentInput);
                    }
                }
            }, 500);
        }
    }

    /* renamed from: e */
    private void m256159e() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.signin_sdk_widget_common_input, this));
        this.mDivider.setBackground(this.f164335j);
        mo224509b();
        this.mContentInput.setTypeface(Typeface.defaultFromStyle(0));
        this.mContentInput.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.widget.CommonEditInput.C652541 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                CommonEditInput.this.mo224508a(obj);
                if (TextUtils.isEmpty(obj)) {
                    if (CommonEditInput.this.f164330e != null) {
                        CommonEditInput.this.f164330e.mo223896a(false);
                    }
                } else if (CommonEditInput.this.f164330e != null) {
                    CommonEditInput.this.f164330e.mo223896a(Boolean.valueOf(Pattern.compile(CommonEditInput.this.getContentRegex()).matcher(obj).matches()).booleanValue());
                }
                if (CommonEditInput.this.f164333h != null) {
                    CommonEditInput.this.f164333h.mo222970a(CommonEditInput.this.mContentInput.getText().toString());
                }
                if (TextUtils.isEmpty(obj) && CommonEditInput.this.f164328c) {
                    CommonEditInput.this.mContentInput.setTypeface(Typeface.defaultFromStyle(0));
                }
                if (!TextUtils.isEmpty(obj) && CommonEditInput.this.f164328c) {
                    CommonEditInput.this.mContentInput.setTypeface(Typeface.defaultFromStyle(1));
                }
                if (CommonEditInput.this.f164329d && CommonEditInput.this.f164327b != null && CommonEditInput.this.f164327b.mo171841a() != 0) {
                    if (CommonEditInput.this.mo224518b(editable) > CommonEditInput.this.f164327b.mo171841a()) {
                        String b = CommonEditInput.this.mo224519b(editable.toString());
                        if (b.length() > CommonEditInput.this.f164327b.mo171841a()) {
                            b = b.substring(0, CommonEditInput.this.f164327b.mo171841a());
                        }
                        String charSequence = CommonEditInput.this.mo224515a((CharSequence) b).toString();
                        CommonEditInput.this.mContentInput.setText(charSequence);
                        CommonEditInput.this.mContentInput.setSelection(charSequence.length());
                        return;
                    }
                    CommonEditInput commonEditInput = CommonEditInput.this;
                    commonEditInput.mo224516a(editable, commonEditInput.mContentInput.getSelectionStart(), CommonEditInput.this.mContentInput.getSelectionEnd());
                }
            }
        });
        this.mClearBT.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.CommonEditInput.View$OnClickListenerC652552 */

            public void onClick(View view) {
                CommonEditInput.this.mContentInput.setText("");
            }
        });
        this.mContentInput.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.widget.CommonEditInput.View$OnFocusChangeListenerC652563 */

            public void onFocusChange(View view, boolean z) {
                if (CommonEditInput.this.f164331f != null && !view.hasFocus() && z) {
                    CommonEditInput.this.f164331f.mo224644a();
                }
                if (z) {
                    CommonEditInput.this.f164335j.mo171827b();
                } else {
                    CommonEditInput.this.f164335j.mo171824a();
                }
            }
        });
        this.mContentInput.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.CommonEditInput.View$OnClickListenerC652574 */

            public void onClick(View view) {
                if (CommonEditInput.this.f164331f != null) {
                    CommonEditInput.this.f164331f.mo224644a();
                }
            }
        });
        this.mContentInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.lark.android.passport.biz.widget.CommonEditInput.C652585 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (CommonEditInput.this.f164332g == null || i != 6 || textView.getText() == null || textView.getText().toString().isEmpty()) {
                    return false;
                }
                CommonEditInput.this.f164332g.mo223887a();
                return true;
            }
        });
        C49154ag.m193833a(this.mClearBT, C49154ag.m193828a(getContext(), 10.0f));
    }

    public void setContentRegex(String str) {
        this.f164334i = str;
    }

    public void setContentTypeFace(boolean z) {
        this.f164328c = z;
    }

    public void setInputEnabledChangeListener(AbstractC65288b.AbstractC65291c cVar) {
        this.f164330e = cVar;
    }

    public void setOnInputCompleteListener(AbstractC65288b.AbstractC65289a aVar) {
        this.f164332g = aVar;
    }

    public void setOnInputContentListener(AbstractC65288b.AbstractC65294f fVar) {
        this.f164333h = fVar;
    }

    public void setOnKeyBoardWillOpenListener(AbstractC65288b.AbstractC65295g gVar) {
        this.f164331f = gVar;
    }

    public void setContent(String str) {
        this.mContentInput.setText(str);
    }

    public void setInputHint(CharSequence charSequence) {
        this.mContentInput.setHint(charSequence);
    }

    public void setInputSpanningHint(CharSequence charSequence) {
        this.mContentInput.setHint(charSequence);
    }

    public void setInputType(int i) {
        this.mContentInput.setInputType(i);
    }

    public void setKeyListener(KeyListener keyListener) {
        this.mContentInput.setKeyListener(keyListener);
    }

    public CommonEditInput(Context context) {
        super(context);
        m256159e();
    }

    public void setInputLength(int i) {
        this.mContentInput.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* renamed from: b */
    public int mo224518b(CharSequence charSequence) {
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
    private void m256158c(CharSequence charSequence) {
        if (!(charSequence == null || charSequence.length() == 0)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charSequence.length(); i++) {
                if (charSequence.charAt(i) != ' ') {
                    sb.append(charSequence.charAt(i));
                }
            }
            if (!(TextUtils.isEmpty(sb.toString().trim()) || sb.toString().equals(charSequence.toString()))) {
                int b = m256157b(charSequence, this.mContentInput.getSelectionStart());
                int b2 = m256157b(charSequence, this.mContentInput.getSelectionEnd());
                this.mContentInput.setText(sb.toString());
                this.mContentInput.setSelection(b, b2);
            }
        }
    }

    /* renamed from: b */
    public String mo224519b(String str) {
        if (str != null) {
            return Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("");
        }
        return "";
    }

    /* renamed from: a */
    public CharSequence mo224515a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "";
        }
        List<Integer> b = this.f164327b.mo171842b();
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
    private int m256157b(CharSequence charSequence, int i) {
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

    public CommonEditInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m256159e();
    }

    /* renamed from: a */
    private int m256156a(CharSequence charSequence, int i) {
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

    /* renamed from: a */
    public void mo224517a(String str, boolean z) {
        this.f164329d = z;
        if (TextUtils.isEmpty(str)) {
            this.f164327b = null;
            m256158c(getContent());
            return;
        }
        this.f164327b = new C49270a(str);
        if (getContent().length() > this.f164327b.mo171841a()) {
            m256158c(getContent());
        } else {
            mo224516a(mo224519b(getContent()), this.mContentInput.getSelectionStart(), this.mContentInput.getSelectionEnd());
        }
    }

    public CommonEditInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m256159e();
    }

    /* renamed from: a */
    public void mo224516a(CharSequence charSequence, int i, int i2) {
        CharSequence a = mo224515a(charSequence);
        if (!TextUtils.isEmpty(a.toString().trim()) && !a.toString().equals(charSequence.toString())) {
            this.mContentInput.setText(a.toString());
            int a2 = m256156a(a, m256157b(charSequence, i));
            if (i >= i2) {
                this.mContentInput.setSelection(a2);
                return;
            }
            this.mContentInput.setSelection(a2, m256156a(a, m256157b(charSequence, i2)));
        }
    }
}
