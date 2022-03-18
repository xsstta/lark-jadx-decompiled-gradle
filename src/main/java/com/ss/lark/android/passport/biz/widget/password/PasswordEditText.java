package com.ss.lark.android.passport.biz.widget.password;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.widget.StatefulInput;
import com.ss.android.lark.passport.infra.widget.StatefulInputBgDrawable;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class PasswordEditText extends RelativeLayout {

    /* renamed from: a */
    public EditText f164455a;

    /* renamed from: b */
    public ImageView f164456b;

    /* renamed from: c */
    public final Context f164457c;

    /* renamed from: d */
    public View.OnFocusChangeListener f164458d;

    /* renamed from: e */
    public AbstractC65325e f164459e;

    /* renamed from: f */
    public AbstractC65323c f164460f;

    /* renamed from: g */
    public AbstractC65321a f164461g;

    /* renamed from: h */
    public AbstractC65322b f164462h;

    /* renamed from: i */
    public final List<ValueAnimator> f164463i;

    /* renamed from: j */
    public final StatefulInputBgDrawable f164464j;

    /* renamed from: k */
    public boolean f164465k;

    /* renamed from: l */
    private CheckBox f164466l;

    /* renamed from: m */
    private C65324d f164467m;

    /* renamed from: com.ss.lark.android.passport.biz.widget.password.PasswordEditText$a */
    public interface AbstractC65321a {
        /* renamed from: a */
        void mo222923a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.password.PasswordEditText$b */
    public interface AbstractC65322b {
        /* renamed from: a */
        void mo222924a(String str);
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.password.PasswordEditText$c */
    public interface AbstractC65323c {
        /* renamed from: a */
        void mo224710a();
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.password.PasswordEditText$e */
    public interface AbstractC65325e {
        /* renamed from: a */
        void mo222922a(String str);
    }

    /* renamed from: f */
    public void mo224693f() {
        this.f164455a.clearFocus();
    }

    /* renamed from: b */
    public void mo224689b() {
        if (this.f164465k) {
            mo224692e();
            this.f164465k = false;
        }
    }

    public String getString() {
        EditText editText = this.f164455a;
        if (editText != null) {
            return editText.getText().toString();
        }
        return "";
    }

    /* renamed from: c */
    public void mo224690c() {
        for (ValueAnimator valueAnimator : this.f164463i) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
        }
    }

    /* renamed from: e */
    public void mo224692e() {
        C65324d dVar = this.f164467m;
        if (dVar != null) {
            EditText editText = this.f164455a;
            if (editText != null) {
                editText.setTextColor(dVar.f164479e);
            }
            this.f164464j.mo171823a(this.f164467m.f164476b);
        }
    }

    /* renamed from: g */
    public void mo224694g() {
        EditText editText = this.f164455a;
        if (editText != null) {
            editText.setFocusable(true);
            this.f164455a.setFocusableInTouchMode(true);
            this.f164455a.requestFocus();
            postDelayed(new Runnable() {
                /* class com.ss.lark.android.passport.biz.widget.password.PasswordEditText.RunnableC653207 */

                public void run() {
                    if (!C49203q.m193977c((Activity) PasswordEditText.this.f164457c)) {
                        ((InputMethodManager) PasswordEditText.this.f164455a.getContext().getSystemService("input_method")).showSoftInput(PasswordEditText.this.f164455a, 0);
                    }
                }
            }, 500);
        }
    }

    /* renamed from: a */
    public void mo224687a() {
        C65324d dVar;
        if (!this.f164465k && (dVar = this.f164467m) != null) {
            EditText editText = this.f164455a;
            if (editText != null) {
                editText.setTextColor(dVar.f164480f);
            }
            this.f164463i.add(this.f164464j.mo171826b(StatefulInput.InputState.f123626c));
            this.f164465k = true;
        }
    }

    /* renamed from: d */
    public void mo224691d() {
        if (this.f164467m != null) {
            EditText editText = this.f164455a;
            if (editText != null) {
                editText.setText("");
                this.f164455a.setTextColor(this.f164467m.f164479e);
            }
            this.f164464j.mo171823a(this.f164467m.f164475a);
        }
    }

    /* renamed from: com.ss.lark.android.passport.biz.widget.password.PasswordEditText$d */
    public static class C65324d {

        /* renamed from: a */
        public int f164475a;

        /* renamed from: b */
        public int f164476b;

        /* renamed from: c */
        public int f164477c;

        /* renamed from: d */
        public int f164478d;

        /* renamed from: e */
        public int f164479e;

        /* renamed from: f */
        public int f164480f;

        /* renamed from: g */
        public int f164481g;

        /* renamed from: h */
        public String f164482h;

        /* renamed from: i */
        public int f164483i = R.drawable.signin_sdk_pw_cursor_bg_v2;

        /* renamed from: a */
        public C65324d mo224711a(int i) {
            this.f164475a = i;
            return this;
        }

        /* renamed from: b */
        public C65324d mo224713b(int i) {
            this.f164476b = i;
            return this;
        }

        /* renamed from: c */
        public C65324d mo224714c(int i) {
            this.f164477c = i;
            return this;
        }

        /* renamed from: d */
        public C65324d mo224715d(int i) {
            this.f164478d = i;
            return this;
        }

        /* renamed from: e */
        public C65324d mo224716e(int i) {
            this.f164479e = i;
            return this;
        }

        /* renamed from: f */
        public C65324d mo224717f(int i) {
            this.f164480f = i;
            return this;
        }

        /* renamed from: g */
        public C65324d mo224718g(int i) {
            this.f164481g = i;
            return this;
        }

        /* renamed from: h */
        public C65324d mo224719h(int i) {
            this.f164483i = i;
            return this;
        }

        /* renamed from: a */
        public C65324d mo224712a(String str) {
            this.f164482h = str;
            return this;
        }

        /* renamed from: a */
        public static int m256265a(Resources resources, int i) throws Resources.NotFoundException {
            ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
            if (matchConfig == null) {
                return resources.getInteger(i);
            }
            try {
                if (!matchConfig.mockCrash) {
                    return resources.getInteger(i);
                }
                throw new Resources.NotFoundException("unknown resource from mocked");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                for (int i2 = 0; i2 < min; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (stackTraceElement != null) {
                        if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                            if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                                Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                                return matchConfig.mReturnIdWhenException;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return resources.getInteger(i);
            }
        }

        /* renamed from: a */
        public static C65324d m256266a(Context context, String str) {
            return new C65324d().mo224715d(m256265a(context.getResources(), (int) R.integer.signin_sdk_textsize_int_password)).mo224717f(C57582a.m223616d(context, R.color.function_danger_500)).mo224714c(C57582a.m223616d(context, R.color.function_danger_500)).mo224711a(C57582a.m223616d(context, R.color.line_border_component)).mo224713b(C57582a.m223616d(context, R.color.primary_pri_500)).mo224712a(str).mo224718g(C57582a.m223616d(context, R.color.line_border_component)).mo224716e(C57582a.m223616d(context, R.color.text_title)).mo224719h(R.drawable.signin_sdk_pw_cursor_bg);
        }
    }

    public void setKeyboardWillOpenListener(AbstractC65323c cVar) {
        this.f164460f = cVar;
    }

    public void setOnInputCompleteListener(AbstractC65321a aVar) {
        this.f164461g = aVar;
    }

    public void setOnInputFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f164458d = onFocusChangeListener;
    }

    public void setOnKeyboardDetectorListener(AbstractC65322b bVar) {
        this.f164462h = bVar;
    }

    public void setTextChangeListener(AbstractC65325e eVar) {
        this.f164459e = eVar;
    }

    public PasswordEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m256253a(float f) {
        return (int) ((f * this.f164457c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public void mo224688a(C65324d dVar) {
        if (dVar != null) {
            setBackground(this.f164464j);
            removeAllViews();
            this.f164467m = dVar;
            this.f164464j.mo171825a(StatefulInput.InputState.f123624a, this.f164467m.f164475a);
            this.f164464j.mo171825a(StatefulInput.InputState.f123625b, this.f164467m.f164476b);
            this.f164464j.mo171825a(StatefulInput.InputState.f123626c, this.f164467m.f164477c);
            LinearLayout linearLayout = new LinearLayout(this.f164457c);
            linearLayout.setOrientation(0);
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            linearLayout.setId(R.id.signin_sdk_pw_text_id);
            addView(linearLayout, layoutParams);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
            layoutParams2.weight = 1.0f;
            layoutParams2.leftMargin = C49154ag.m193828a(getContext(), 12.0f);
            this.f164455a = new EditText(this.f164457c);
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(this.f164455a, Integer.valueOf(dVar.f164483i));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            this.f164455a.setId(R.id.signin_sdk_input_pass_word_edit_text);
            this.f164455a.setCursorVisible(true);
            this.f164455a.setTextSize((float) dVar.f164478d);
            this.f164455a.setTextColor(dVar.f164479e);
            this.f164455a.setHintTextColor(dVar.f164481g);
            this.f164455a.setHint(dVar.f164482h);
            this.f164455a.setInputType(129);
            this.f164455a.setBackgroundColor(0);
            this.f164455a.setImeOptions(6);
            this.f164455a.addTextChangedListener(new TextWatcher() {
                /* class com.ss.lark.android.passport.biz.widget.password.PasswordEditText.C653141 */

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void afterTextChanged(Editable editable) {
                    int i;
                    String str;
                    PasswordEditText.this.mo224692e();
                    ImageView imageView = PasswordEditText.this.f164456b;
                    if (TextUtils.isEmpty(editable)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    if (PasswordEditText.this.f164459e != null) {
                        AbstractC65325e eVar = PasswordEditText.this.f164459e;
                        if (editable != null) {
                            str = editable.toString();
                        } else {
                            str = "";
                        }
                        eVar.mo222922a(str);
                    }
                }
            });
            this.f164455a.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.ss.lark.android.passport.biz.widget.password.PasswordEditText.View$OnFocusChangeListenerC653152 */

                public void onFocusChange(View view, boolean z) {
                    StatefulInput.InputState bVar;
                    if (PasswordEditText.this.f164460f != null && !view.hasFocus() && z) {
                        PasswordEditText.this.f164460f.mo224710a();
                    }
                    if (PasswordEditText.this.f164458d != null) {
                        PasswordEditText.this.f164458d.onFocusChange(view, z);
                    }
                    if (PasswordEditText.this.f164465k) {
                        bVar = StatefulInput.InputState.f123626c;
                    } else if (z) {
                        bVar = StatefulInput.InputState.f123625b;
                    } else {
                        bVar = StatefulInput.InputState.f123624a;
                    }
                    PasswordEditText.this.f164463i.add(PasswordEditText.this.f164464j.mo171826b(bVar));
                }
            });
            this.f164455a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.lark.android.passport.biz.widget.password.PasswordEditText.View$OnClickListenerC653163 */

                public void onClick(View view) {
                    if (PasswordEditText.this.f164460f != null) {
                        PasswordEditText.this.f164460f.mo224710a();
                    }
                }
            });
            this.f164455a.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                /* class com.ss.lark.android.passport.biz.widget.password.PasswordEditText.C653174 */

                public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i == 6 && PasswordEditText.this.f164461g != null) {
                        PasswordEditText.this.f164461g.mo222923a(textView.getText().toString());
                        return true;
                    } else if (!DesktopUtil.m144301a(PasswordEditText.this.f164457c) || keyEvent.getKeyCode() != 66 || PasswordEditText.this.f164462h == null) {
                        return false;
                    } else {
                        PasswordEditText.this.f164462h.mo222924a(textView.getText().toString());
                        return true;
                    }
                }
            });
            linearLayout.addView(this.f164455a, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams3.gravity = 16;
            this.f164456b = new ImageView(getContext());
            int color = UDColorUtils.getColor(this.f164457c, R.color.icon_n3);
            this.f164456b.setImageDrawable(UDIconUtils.getIconDrawable(this.f164457c, (int) R.drawable.signin_sdk_input_clear, color));
            this.f164456b.setPadding(m256253a(4.0f), 0, m256253a(10.0f), 0);
            this.f164456b.setScaleType(ImageView.ScaleType.CENTER);
            this.f164456b.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.lark.android.passport.biz.widget.password.PasswordEditText.View$OnClickListenerC653185 */

                public void onClick(View view) {
                    PasswordEditText.this.f164455a.setText("");
                    PasswordEditText.this.f164455a.requestFocus();
                    PasswordEditText.this.f164456b.setVisibility(8);
                }
            });
            this.f164456b.setVisibility(8);
            linearLayout.addView(this.f164456b, layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams4.gravity = 16;
            CheckBox checkBox = new CheckBox(this.f164457c);
            this.f164466l = checkBox;
            checkBox.setChecked(false);
            this.f164466l.setButtonDrawable(UDIconUtils.getIconDrawable(this.f164457c, (int) R.drawable.signin_sdk_preview_cb_bg, color));
            this.f164466l.setPadding(m256253a(2.0f), 0, m256253a(12.0f), 0);
            this.f164466l.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.lark.android.passport.biz.widget.password.PasswordEditText.C653196 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        PasswordEditText.this.f164455a.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    } else {
                        PasswordEditText.this.f164455a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    PasswordEditText.this.f164455a.requestFocus();
                    PasswordEditText.this.f164455a.setSelection(PasswordEditText.this.f164455a.getText().length());
                }
            });
            linearLayout.addView(this.f164466l, layoutParams4);
        }
    }

    public PasswordEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PasswordEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f164463i = new ArrayList();
        this.f164464j = new StatefulInputBgDrawable(getContext());
        this.f164465k = false;
        this.f164457c = context;
    }
}
