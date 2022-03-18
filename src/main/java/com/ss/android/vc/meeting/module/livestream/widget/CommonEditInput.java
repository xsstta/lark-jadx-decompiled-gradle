package com.ss.android.vc.meeting.module.livestream.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.livestream.widget.AbstractC62106a;
import java.util.regex.Pattern;

public class CommonEditInput extends ConstraintLayout {

    /* renamed from: i */
    private static final int f156002i = Color.parseColor("#E6E8EB");

    /* renamed from: j */
    private static final int f156003j = Color.parseColor("#3377FF");

    /* renamed from: a */
    public Boolean f156004a = false;

    /* renamed from: b */
    public EditText f156005b;

    /* renamed from: c */
    public View f156006c;

    /* renamed from: d */
    public AbstractC62106a.AbstractC62108b f156007d;

    /* renamed from: e */
    public AbstractC62106a.AbstractC62110d f156008e;

    /* renamed from: f */
    public AbstractC62106a.AbstractC62107a f156009f;

    /* renamed from: g */
    public AbstractC62106a.AbstractC62109c f156010g;

    /* renamed from: h */
    public String f156011h;

    /* renamed from: k */
    private boolean f156012k = true;

    /* renamed from: l */
    private ImageView f156013l;

    /* renamed from: m */
    private GradientDrawable f156014m = C62112c.m242606a();

    public String getContentRegex() {
        return this.f156011h;
    }

    /* renamed from: b */
    public void mo214862b() {
        this.f156012k = true;
        mo214861a(null);
    }

    /* renamed from: c */
    public void mo214863c() {
        this.f156012k = false;
        mo214861a(null);
    }

    /* access modifiers changed from: protected */
    public String getContact() {
        return getInputText();
    }

    public static Interpolator getBezierInterpolator() {
        return PathInterpolatorCompat.create(0.32f, 0.94f, 0.6f, 1.0f);
    }

    public String getInputText() {
        return this.f156005b.getText().toString();
    }

    /* renamed from: d */
    private void m242594d() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.live_auth_widget_common_input, this);
        this.f156013l = (ImageView) inflate.findViewById(R.id.input_clear);
        this.f156005b = (EditText) inflate.findViewById(R.id.common_input);
        View findViewById = inflate.findViewById(R.id.rootView);
        this.f156006c = findViewById;
        findViewById.setBackground(this.f156014m);
        mo214863c();
        this.f156005b.setTypeface(Typeface.defaultFromStyle(0));
        this.f156005b.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.C620971 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                CommonEditInput.this.mo214861a(obj);
                if (TextUtils.isEmpty(obj)) {
                    if (CommonEditInput.this.f156007d != null) {
                        CommonEditInput.this.f156007d.mo214892a(false);
                    }
                } else if (CommonEditInput.this.f156007d != null) {
                    CommonEditInput.this.f156007d.mo214892a(Boolean.valueOf(Pattern.compile(CommonEditInput.this.getContentRegex()).matcher(obj).matches()).booleanValue());
                }
                if (CommonEditInput.this.f156010g != null) {
                    CommonEditInput.this.f156010g.mo214763a(CommonEditInput.this.f156005b.getText().toString());
                }
                if (TextUtils.isEmpty(obj) && CommonEditInput.this.f156004a.booleanValue()) {
                    CommonEditInput.this.f156005b.setTypeface(Typeface.defaultFromStyle(0));
                }
                if (!TextUtils.isEmpty(obj) && CommonEditInput.this.f156004a.booleanValue()) {
                    CommonEditInput.this.f156005b.setTypeface(Typeface.defaultFromStyle(1));
                }
            }
        });
        this.f156013l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.View$OnClickListenerC620982 */

            public void onClick(View view) {
                CommonEditInput.this.f156005b.setText("");
            }
        });
        this.f156005b.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.View$OnFocusChangeListenerC620993 */

            public void onFocusChange(View view, boolean z) {
                if (CommonEditInput.this.f156008e != null && !view.hasFocus() && z) {
                    CommonEditInput.this.f156008e.mo214893a();
                }
                CommonEditInput commonEditInput = CommonEditInput.this;
                commonEditInput.mo214860a(commonEditInput.f156006c, z);
            }
        });
        this.f156005b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.View$OnClickListenerC621004 */

            public void onClick(View view) {
                if (CommonEditInput.this.f156008e != null) {
                    CommonEditInput.this.f156008e.mo214893a();
                }
            }
        });
        this.f156005b.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.C621015 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (CommonEditInput.this.f156009f == null || i != 6 || textView.getText() == null || textView.getText().toString().isEmpty()) {
                    return false;
                }
                CommonEditInput.this.f156009f.mo214891a();
                return true;
            }
        });
        m242592a(this.f156013l, C60773o.m236115a(10.0d));
    }

    /* renamed from: a */
    public void mo214859a() {
        this.f156005b.setFocusable(true);
        this.f156005b.setFocusableInTouchMode(true);
        this.f156005b.requestFocus();
        if (!KeyboardUtils.isSoftShowing((Activity) getContext())) {
            postDelayed(new Runnable() {
                /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.RunnableC621037 */

                public void run() {
                    ((InputMethodManager) CommonEditInput.this.f156005b.getContext().getSystemService("input_method")).showSoftInput(CommonEditInput.this.f156005b, 0);
                }
            }, 500);
        }
    }

    public void setContentRegex(String str) {
        this.f156011h = str;
    }

    public void setInputEnabledChangeListener(AbstractC62106a.AbstractC62108b bVar) {
        this.f156007d = bVar;
    }

    public void setOnInputCompleteListener(AbstractC62106a.AbstractC62107a aVar) {
        this.f156009f = aVar;
    }

    public void setOnKeyBoardWillOpenListener(AbstractC62106a.AbstractC62110d dVar) {
        this.f156008e = dVar;
    }

    public void setmOnInputContentListener(AbstractC62106a.AbstractC62109c cVar) {
        this.f156010g = cVar;
    }

    public void setContactPoint(String str) {
        this.f156005b.setText(str);
    }

    public void setContentTypeFace(boolean z) {
        this.f156004a = Boolean.valueOf(z);
    }

    public void setInputHint(String str) {
        this.f156005b.setHint(str);
    }

    public void setInputType(int i) {
        this.f156005b.setInputType(i);
    }

    public CommonEditInput(Context context) {
        super(context);
        m242594d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo214861a(String str) {
        int i;
        if (str == null) {
            str = getContact();
        }
        ImageView imageView = this.f156013l;
        if (TextUtils.isEmpty(str) || !this.f156012k) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public void setInputLength(int i) {
        this.f156005b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* renamed from: a */
    public static void m242592a(View view, int i) {
        m242593a(view, i, i, i, i);
    }

    public CommonEditInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242594d();
    }

    /* renamed from: a */
    public void mo214860a(View view, boolean z) {
        int i;
        int i2;
        if (z) {
            i = f156002i;
        } else {
            i = f156003j;
        }
        if (z) {
            i2 = f156003j;
        } else {
            i2 = f156002i;
        }
        final Drawable background = view.getBackground();
        if (background != null && (background instanceof GradientDrawable)) {
            ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(300L);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.C621026 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C62112c.m242607a((GradientDrawable) background, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            duration.setInterpolator(getBezierInterpolator());
            duration.setEvaluator(new ArgbEvaluator());
            duration.start();
        }
    }

    public CommonEditInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242594d();
    }

    /* renamed from: a */
    public static void m242593a(final View view, final int i, final int i2, final int i3, final int i4) {
        if (view != null) {
            final View view2 = (View) view.getParent();
            if (view2 != null) {
                view2.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.livestream.widget.CommonEditInput.RunnableC621048 */

                    public void run() {
                        Rect rect = new Rect();
                        view.getHitRect(rect);
                        rect.top -= i;
                        rect.bottom += i4;
                        rect.left -= i2;
                        rect.right += i3;
                        view2.setTouchDelegate(new TouchDelegate(rect, view));
                    }
                });
                return;
            }
            throw new RuntimeException("view set TouchDelegate must have parent view");
        }
    }
}
