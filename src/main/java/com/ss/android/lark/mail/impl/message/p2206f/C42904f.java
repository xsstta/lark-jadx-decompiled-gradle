package com.ss.android.lark.mail.impl.message.p2206f;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.utils.StatusBarUtil;

/* renamed from: com.ss.android.lark.mail.impl.message.f.f */
public class C42904f {

    /* renamed from: a */
    public AbsMessageTemplateView f109264a;

    /* renamed from: b */
    public ImageView f109265b;

    /* renamed from: c */
    public ImageView f109266c;

    /* renamed from: d */
    public UDEditText f109267d;

    /* renamed from: e */
    public TextView f109268e;

    /* renamed from: f */
    public TextView f109269f;

    /* renamed from: g */
    public C42913g f109270g;

    /* renamed from: h */
    private View f109271h;

    /* renamed from: i */
    private View f109272i;

    /* renamed from: j */
    private View f109273j;

    /* renamed from: k */
    private View f109274k;

    /* renamed from: l */
    private TextWatcher f109275l;

    /* renamed from: c */
    public void mo153949c() {
        ((InputMethodManager) this.f109264a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f109267d.getWindowToken(), 0);
    }

    /* renamed from: d */
    private void m170877d() {
        RelativeLayout.LayoutParams layoutParams;
        Log.m165389i("SearchView", "testSearchABC initView");
        this.f109271h = ((ViewStub) ((Activity) this.f109264a.getContext()).findViewById(R.id.mail_readmail_search_top)).inflate();
        if (C42871i.m170779b() && this.f109264a.getThreadType() == 1 && (layoutParams = (RelativeLayout.LayoutParams) this.f109271h.getLayoutParams()) != null) {
            layoutParams.topMargin = StatusBarUtil.getStatusBarHeight(this.f109264a.getContext());
            this.f109271h.setLayoutParams(layoutParams);
        }
        this.f109272i = ((ViewStub) ((Activity) this.f109264a.getContext()).findViewById(R.id.mail_readmail_search_bottom)).inflate();
        this.f109273j = ((Activity) this.f109264a.getContext()).findViewById(R.id.mail_readmail_search_bottom_layout);
        m170878e();
    }

    /* renamed from: e */
    private void m170878e() {
        Log.m165389i("SearchView", "testSearchABC findView");
        this.f109267d = (UDEditText) this.f109271h.findViewById(R.id.mail_readmail_search_input);
        this.f109268e = (TextView) this.f109271h.findViewById(R.id.mail_readmail_search_ret_curindex);
        this.f109269f = (TextView) this.f109271h.findViewById(R.id.mail_readmail_search_ret_total);
        this.f109274k = this.f109271h.findViewById(R.id.mail_readmail_search_close);
        this.f109266c = (ImageView) this.f109272i.findViewById(R.id.mai_icon_readmail_search_left);
        this.f109265b = (ImageView) this.f109272i.findViewById(R.id.mai_icon_readmail_search_right);
    }

    /* renamed from: f */
    private void m170879f() {
        this.f109271h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.View$OnClickListenerC429062 */

            public void onClick(View view) {
            }
        });
        this.f109272i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.View$OnClickListenerC429073 */

            public void onClick(View view) {
            }
        });
        C429084 r0 = new TextWatcher() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.C429084 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence != null) {
                    C42904f.this.f109270g.mo153964a(charSequence.toString());
                }
            }
        };
        this.f109275l = r0;
        this.f109267d.addTextChangedListener(r0);
        this.f109267d.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.$$Lambda$f$XjO0ddcf5J8_cARP3Of_tfWqVIg */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return C42904f.lambda$XjO0ddcf5J8_cARP3Of_tfWqVIg(C42904f.this, textView, i, keyEvent);
            }
        });
        this.f109266c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.View$OnClickListenerC429095 */

            public void onClick(View view) {
                C42904f.this.mo153949c();
                C42904f.this.f109270g.mo153962a(-1);
            }
        });
        this.f109265b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.View$OnClickListenerC429106 */

            public void onClick(View view) {
                C42904f.this.mo153949c();
                C42904f.this.f109270g.mo153962a(1);
            }
        });
        this.f109274k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.View$OnClickListenerC429117 */

            public void onClick(View view) {
                C42904f.this.f109270g.mo153973b(false);
            }
        });
    }

    /* renamed from: b */
    public void mo153947b() {
        this.f109264a.mo154372n();
        Log.m165389i("SearchView", "testSearchABC showSearchView");
        if (this.f109271h == null) {
            if (((Activity) this.f109264a.getContext()).findViewById(R.id.mail_readmail_search_input) == null) {
                m170877d();
            } else {
                this.f109271h = ((Activity) this.f109264a.getContext()).findViewById(R.id.mail_readmail_search_top_v);
                this.f109272i = ((Activity) this.f109264a.getContext()).findViewById(R.id.mail_readmail_search_bottom_v);
                this.f109273j = ((Activity) this.f109264a.getContext()).findViewById(R.id.mail_readmail_search_bottom_layout);
                if (this.f109267d == null) {
                    m170878e();
                }
            }
        }
        m170879f();
        this.f109271h.setVisibility(0);
        this.f109272i.setVisibility(0);
        View view = this.f109273j;
        if (view != null) {
            view.setVisibility(0);
        }
        mo153942a(0, 0);
        this.f109267d.setText("");
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.RunnableC429051 */

            public void run() {
                C42904f.this.f109267d.setFocusable(true);
                C42904f.this.f109267d.setFocusableInTouchMode(true);
                C42904f.this.f109267d.requestFocus();
                ((InputMethodManager) C42904f.this.f109264a.getContext().getSystemService("input_method")).showSoftInput(C42904f.this.f109267d, 1);
            }
        }, 300);
        com.jaeger.library.StatusBarUtil.setColorNoTranslucent((Activity) this.f109264a.getContext(), this.f109264a.getContext().getResources().getColor(R.color.bg_body));
    }

    /* renamed from: a */
    public boolean mo153946a() {
        View view = this.f109271h;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo153944a(C42913g gVar) {
        this.f109270g = gVar;
    }

    public C42904f(AbsMessageTemplateView absMessageTemplateView) {
        this.f109264a = absMessageTemplateView;
    }

    /* renamed from: a */
    public String mo153940a(C42097j jVar) {
        return this.f109264a.mo154309a(jVar);
    }

    /* renamed from: a */
    public String mo153941a(String str) {
        for (int i = 0; i < this.f109264a.f109693a.size(); i++) {
            if (str.equals(this.f109264a.f109693a.get(i).mo151964g().mo151581b())) {
                AbsMessageTemplateView absMessageTemplateView = this.f109264a;
                return absMessageTemplateView.mo154309a(absMessageTemplateView.f109693a.get(i));
            }
        }
        return "";
    }

    /* renamed from: a */
    public void mo153945a(boolean z) {
        Log.m165389i("SearchView", "testSearchABC hideSearchView");
        UDEditText uDEditText = this.f109267d;
        if (uDEditText != null) {
            uDEditText.removeTextChangedListener(this.f109275l);
        }
        AbsMessageTemplateView absMessageTemplateView = this.f109264a;
        if (absMessageTemplateView != null) {
            absMessageTemplateView.mo154371m();
        }
        View view = this.f109271h;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.f109272i;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        View view3 = this.f109273j;
        if (view3 != null) {
            view3.setVisibility(4);
        }
        AbsMessageTemplateView absMessageTemplateView2 = this.f109264a;
        if (absMessageTemplateView2 == null) {
            return;
        }
        if (z) {
            com.jaeger.library.StatusBarUtil.setColorNoTranslucent((Activity) absMessageTemplateView2.getContext(), this.f109264a.getContext().getResources().getColor(R.color.bg_body));
        } else {
            com.jaeger.library.StatusBarUtil.setColorNoTranslucent((Activity) absMessageTemplateView2.getContext(), this.f109264a.getContext().getResources().getColor(R.color.ud_N100));
        }
    }

    /* renamed from: a */
    public void mo153942a(final int i, final int i2) {
        Log.m165389i("SearchView", "testSearchABC updateSearchView currentRetIndex:" + i + " totalRetCount:" + i2);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2206f.C42904f.RunnableC429128 */

            public void run() {
                int i = i;
                int i2 = 0;
                if (i2 == 0) {
                    C42904f.this.f109266c.setEnabled(false);
                    C42904f.this.f109266c.setClickable(false);
                    C42904f.this.f109265b.setEnabled(false);
                    C42904f.this.f109265b.setClickable(false);
                } else {
                    int i3 = i + 1;
                    if (i == 0) {
                        C42904f.this.f109266c.setEnabled(false);
                        C42904f.this.f109266c.setClickable(false);
                    } else {
                        C42904f.this.f109266c.setEnabled(true);
                        C42904f.this.f109266c.setClickable(true);
                    }
                    int i4 = i;
                    int i5 = i2;
                    if (i4 >= i5 - 1) {
                        C42904f.this.f109265b.setEnabled(false);
                        C42904f.this.f109265b.setClickable(false);
                        i2 = i5;
                    } else {
                        C42904f.this.f109265b.setEnabled(true);
                        C42904f.this.f109265b.setClickable(true);
                        i2 = i3;
                    }
                }
                TextView textView = C42904f.this.f109268e;
                textView.setText(i2 + "");
                TextView textView2 = C42904f.this.f109269f;
                textView2.setText(i2 + "");
            }
        });
    }

    /* renamed from: b */
    public void mo153948b(ValueCallback<String> valueCallback, String str, String... strArr) {
        this.f109264a.mo154333b(valueCallback, str, strArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m170876a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mo153949c();
        return true;
    }

    /* renamed from: a */
    public void mo153943a(ValueCallback<String> valueCallback, String str, String... strArr) {
        this.f109264a.mo154313a(valueCallback, str, strArr);
    }
}
