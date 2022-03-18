package com.ss.lark.android.passport.biz.widget.verifycode;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.p2441c.C49173f;
import com.ss.lark.android.passport.biz.widget.verifycode.CodeView;
import java.lang.reflect.Field;

public class VerifyCodeEditText extends RelativeLayout {

    /* renamed from: a */
    public EditText f164608a;

    /* renamed from: b */
    public CodeView[] f164609b;

    /* renamed from: c */
    public int f164610c;

    /* renamed from: d */
    public AbstractC65371e f164611d;

    /* renamed from: e */
    public AbstractC65369c f164612e;

    /* renamed from: f */
    public AbstractC65367a f164613f;

    /* renamed from: g */
    public AbstractC65368b f164614g;

    /* renamed from: h */
    public AbstractC65370d f164615h;

    /* renamed from: i */
    private final Context f164616i;

    /* renamed from: j */
    private LinearLayout f164617j;

    /* renamed from: com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText$a */
    public interface AbstractC65367a {
        /* renamed from: a */
        void mo224856a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText$b */
    public interface AbstractC65368b {
        /* renamed from: a */
        void mo224857a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText$c */
    public interface AbstractC65369c {
        /* renamed from: a */
        void mo224858a();
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText$d */
    public interface AbstractC65370d {
        /* renamed from: a */
        void mo223210a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText$e */
    public interface AbstractC65371e {
        /* renamed from: a */
        void mo223212a(String str);
    }

    /* renamed from: b */
    public void mo224836b() {
        this.f164613f = null;
    }

    /* renamed from: e */
    private void m256380e() {
        this.f164608a.post(new Runnable() {
            /* class com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.RunnableC653656 */

            public void run() {
                if (VerifyCodeEditText.this.f164609b != null && VerifyCodeEditText.this.f164609b.length > 0) {
                    VerifyCodeEditText.this.f164608a.setPadding(VerifyCodeEditText.this.f164609b[0].getWidth() / 2, 0, 0, 0);
                }
            }
        });
    }

    /* renamed from: f */
    private void m256381f() {
        int length = this.f164608a.getText().length();
        int i = this.f164610c;
        if (length >= i) {
            this.f164609b[i - 1].mo224815c();
        } else {
            this.f164609b[length].mo224815c();
        }
    }

    /* renamed from: c */
    public void mo224837c() {
        CodeView[] codeViewArr = this.f164609b;
        if (codeViewArr != null) {
            for (CodeView codeView : codeViewArr) {
                codeView.mo224814b();
                m256381f();
            }
        }
    }

    /* renamed from: d */
    public void mo224838d() {
        EditText editText = this.f164608a;
        if (editText != null) {
            editText.setFocusable(true);
            this.f164608a.setFocusableInTouchMode(true);
            this.f164608a.requestFocus();
            postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.RunnableC653667 */

                public void run() {
                    Activity a = C49173f.m193886a(VerifyCodeEditText.this);
                    if (a != null && !C49203q.m193977c(a) && VerifyCodeEditText.this.f164608a.isFocused()) {
                        C49203q.m193975a(VerifyCodeEditText.this.f164608a);
                    }
                }
            }, 500);
        }
    }

    public String getVerifyCodeText() {
        EditText editText = this.f164608a;
        if (editText != null) {
            return editText.getText().toString().trim();
        }
        return "";
    }

    /* renamed from: a */
    public void mo224832a() {
        this.f164608a.setText("");
        for (int i = 0; i < this.f164610c; i++) {
            this.f164609b[i].mo224816d();
            if (i == 0) {
                this.f164609b[i].mo224812a();
            }
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText$f */
    public static class C65372f {

        /* renamed from: a */
        public boolean f164625a = true;

        /* renamed from: b */
        public boolean f164626b;

        /* renamed from: c */
        public int f164627c = Color.rgb(51, 119, 255);

        /* renamed from: d */
        public int f164628d = 17;

        /* renamed from: e */
        public int f164629e = Color.rgb(20, 31, 51);

        /* renamed from: f */
        public int f164630f = Color.rgb(237, 237, 240);

        /* renamed from: g */
        public int f164631g = Color.rgb(51, 119, 255);

        /* renamed from: h */
        public int f164632h = Color.rgb(255, 91, 76);

        /* renamed from: i */
        public int f164633i;

        /* renamed from: j */
        public int f164634j = 4;

        /* renamed from: k */
        public int f164635k = 0;

        /* renamed from: l */
        public int f164636l = 18;

        /* renamed from: a */
        public C65372f mo224859a(int i) {
            this.f164627c = i;
            return this;
        }

        /* renamed from: b */
        public C65372f mo224861b(int i) {
            this.f164628d = i;
            return this;
        }

        /* renamed from: c */
        public C65372f mo224863c(int i) {
            this.f164629e = i;
            return this;
        }

        /* renamed from: d */
        public C65372f mo224864d(int i) {
            this.f164630f = i;
            return this;
        }

        /* renamed from: e */
        public C65372f mo224865e(int i) {
            this.f164631g = i;
            return this;
        }

        /* renamed from: f */
        public C65372f mo224866f(int i) {
            this.f164633i = i;
            return this;
        }

        /* renamed from: g */
        public C65372f mo224867g(int i) {
            this.f164634j = i;
            return this;
        }

        /* renamed from: h */
        public C65372f mo224868h(int i) {
            this.f164635k = i;
            return this;
        }

        /* renamed from: i */
        public C65372f mo224869i(int i) {
            this.f164636l = i;
            return this;
        }

        /* renamed from: j */
        public C65372f mo224870j(int i) {
            this.f164632h = i;
            return this;
        }

        /* renamed from: a */
        public C65372f mo224860a(boolean z) {
            this.f164625a = z;
            return this;
        }

        /* renamed from: b */
        public C65372f mo224862b(boolean z) {
            this.f164626b = z;
            return this;
        }

        /* renamed from: a */
        public static C65372f m256394a(Context context) {
            return new C65372f().mo224860a(true).mo224862b(true).mo224859a(C49154ag.m193840c(context, R.color.primary_pri_500)).mo224861b(22).mo224863c(C49154ag.m193840c(context, R.color.text_title)).mo224864d(C49154ag.m193840c(context, R.color.line_border_component)).mo224865e(C49154ag.m193840c(context, R.color.primary_pri_500)).mo224867g(6).mo224868h(0).mo224869i(2).mo224870j(C49154ag.m193840c(context, R.color.function_warning_500));
        }
    }

    public void setOnCreateContextMenuListener(View.OnCreateContextMenuListener onCreateContextMenuListener) {
        super.setOnCreateContextMenuListener(onCreateContextMenuListener);
    }

    public void setOnInputCompleteListener(AbstractC65367a aVar) {
        this.f164613f = aVar;
    }

    public void setOnInputProcessListener(AbstractC65368b bVar) {
        this.f164614g = bVar;
    }

    public void setOnKeyboardWillShowListener(AbstractC65369c cVar) {
        this.f164612e = cVar;
    }

    public void setOnTextChangeListener(AbstractC65370d dVar) {
        this.f164615h = dVar;
    }

    public void setOnTextFinishListener(AbstractC65371e eVar) {
        this.f164611d = eVar;
    }

    public VerifyCodeEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo224834a(C65372f fVar) {
        this.f164610c = fVar.f164634j;
        m256377a(fVar.f164635k, fVar.f164636l);
        m256378b(fVar);
    }

    /* renamed from: c */
    private void m256379c(C65372f fVar) {
        View view = new View(this.f164616i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C49154ag.m193828a(this.f164616i, 10.0f), C49154ag.m193828a(this.f164616i, 2.0f));
        layoutParams.gravity = 16;
        view.setBackgroundColor(this.f164616i.getResources().getColor(R.color.text_title));
        this.f164617j.addView(view, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m256376a(this.f164616i, (float) fVar.f164633i), -1);
        View view2 = new View(this.f164616i);
        view2.setBackgroundColor(0);
        this.f164617j.addView(view2, layoutParams2);
    }

    /* renamed from: a */
    public void mo224833a(Editable editable) {
        int i = 0;
        if (editable.length() > 0) {
            int length = editable.length();
            while (i < this.f164610c) {
                if (i < length) {
                    this.f164609b[i].setText(String.valueOf(editable.charAt(i)));
                } else if (i == length) {
                    this.f164609b[i].mo224812a();
                } else {
                    this.f164609b[i].mo224816d();
                }
                i++;
            }
            return;
        }
        while (i < this.f164610c) {
            this.f164609b[i].mo224816d();
            if (i == 0) {
                this.f164609b[i].mo224812a();
            }
            i++;
        }
    }

    /* renamed from: b */
    private void m256378b(C65372f fVar) {
        LinearLayout linearLayout = new LinearLayout(this.f164616i);
        this.f164617j = linearLayout;
        linearLayout.setBackgroundColor(fVar.f164635k);
        this.f164617j.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.f164617j.setOrientation(0);
        this.f164617j.setClipChildren(false);
        setClipChildren(false);
        addView(this.f164617j);
        this.f164609b = new CodeView[this.f164610c];
        CodeView.C65359a g = new CodeView.C65359a(getContext()).mo224823a(fVar.f164627c).mo224826b(fVar.f164626b).mo224829e(fVar.f164631g).mo224828d(fVar.f164630f).mo224824a(fVar.f164625a).mo224825b(fVar.f164628d).mo224827c(fVar.f164629e).mo224830f(fVar.f164636l).mo224831g(fVar.f164632h);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(m256376a(this.f164616i, (float) fVar.f164633i), -1);
        int length = this.f164609b.length;
        for (int i = 0; i < length; i++) {
            this.f164609b[i] = new CodeView(this.f164616i);
            this.f164609b[i].mo224813a(g);
            if (length / 2 == i) {
                m256379c(fVar);
            }
            this.f164617j.addView(this.f164609b[i], layoutParams);
            if (i < this.f164609b.length - 1) {
                View view = new View(this.f164616i);
                view.setBackgroundColor(0);
                this.f164617j.addView(view, layoutParams2);
            }
        }
        mo224833a(this.f164608a.getText());
        m256380e();
    }

    /* renamed from: a */
    public void mo224835a(boolean z) {
        if (z) {
            mo224833a(this.f164608a.getText());
            return;
        }
        CodeView[] codeViewArr = this.f164609b;
        if (codeViewArr != null) {
            for (CodeView codeView : codeViewArr) {
                codeView.mo224818f();
            }
        }
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m256376a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        CodeView[] codeViewArr = this.f164609b;
        int i3 = 0;
        if (codeViewArr != null && codeViewArr.length > 0) {
            i3 = codeViewArr[0].getMeasuredHeight();
        }
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private void m256377a(int i, int i2) {
        EditText editText = new EditText(this.f164616i);
        this.f164608a = editText;
        editText.setId(R.id.signin_sdk_input_verify_code_edit_text);
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(this.f164608a, Integer.valueOf((int) R.drawable.signin_sdk_verify_code_cursor_bg));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
        this.f164608a.setCursorVisible(false);
        this.f164608a.setBackgroundColor(i);
        this.f164608a.setTextSize(BitmapDescriptorFactory.HUE_RED);
        this.f164608a.setInputType(i2);
        this.f164608a.setImeOptions(6);
        this.f164608a.addTextChangedListener(new TextWatcher() {
            /* class com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.C653601 */

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                VerifyCodeEditText.this.mo224833a(editable);
                String trim = editable.toString().trim();
                if (trim.length() > VerifyCodeEditText.this.f164610c) {
                    VerifyCodeEditText.this.f164608a.setText(trim.substring(0, VerifyCodeEditText.this.f164610c));
                    return;
                }
                if (VerifyCodeEditText.this.f164615h != null) {
                    VerifyCodeEditText.this.f164615h.mo223210a(trim);
                }
                if (editable.length() == VerifyCodeEditText.this.f164610c && VerifyCodeEditText.this.f164611d != null) {
                    VerifyCodeEditText.this.f164611d.mo223212a(trim);
                }
                if (VerifyCodeEditText.this.f164614g != null) {
                    VerifyCodeEditText.this.f164614g.mo224857a(editable.toString().trim());
                }
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Editable text = VerifyCodeEditText.this.f164608a.getText();
                Selection.setSelection(text, text.length());
            }
        });
        this.f164608a.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.C653612 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6 || VerifyCodeEditText.this.f164613f == null) {
                    return false;
                }
                VerifyCodeEditText.this.f164613f.mo224856a(textView.getText().toString());
                return true;
            }
        });
        addView(this.f164608a, new RelativeLayout.LayoutParams(-1, -1));
        this.f164608a.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.View$OnLongClickListenerC653623 */

            public boolean onLongClick(View view) {
                VerifyCodeEditText.this.f164608a.setCursorVisible(true);
                return false;
            }
        });
        this.f164608a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.View$OnClickListenerC653634 */

            public void onClick(View view) {
                if (VerifyCodeEditText.this.f164612e != null) {
                    VerifyCodeEditText.this.f164612e.mo224858a();
                }
                VerifyCodeEditText.this.f164608a.setCursorVisible(false);
            }
        });
        this.f164608a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.lark.android.passport.biz.widget.verifycode.VerifyCodeEditText.View$OnFocusChangeListenerC653645 */

            public void onFocusChange(View view, boolean z) {
                if (VerifyCodeEditText.this.f164612e != null && !view.hasFocus() && z) {
                    VerifyCodeEditText.this.f164612e.mo224858a();
                }
                VerifyCodeEditText.this.mo224835a(z);
                if (!z) {
                    C49203q.m193973a(VerifyCodeEditText.this.getContext());
                }
            }
        });
    }

    public VerifyCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164610c = 4;
        this.f164616i = context;
    }
}
