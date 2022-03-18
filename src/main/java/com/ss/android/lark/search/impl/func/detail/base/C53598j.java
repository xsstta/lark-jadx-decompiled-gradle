package com.ss.android.lark.search.impl.func.detail.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.search.impl.p2591a.C53330a;

/* renamed from: com.ss.android.lark.search.impl.func.detail.base.j */
public class C53598j {

    /* renamed from: a */
    public EditText f132351a;

    /* renamed from: b */
    public AbstractC53602a f132352b;

    /* renamed from: c */
    private Activity f132353c;

    /* renamed from: d */
    private boolean f132354d;

    /* renamed from: e */
    private FrameLayout f132355e;

    /* renamed from: f */
    private ViewGroup f132356f;

    /* renamed from: g */
    private TextView f132357g;

    /* renamed from: h */
    private C53330a f132358h;

    /* renamed from: i */
    private C53330a.AbstractC53333a f132359i;

    /* renamed from: com.ss.android.lark.search.impl.func.detail.base.j$a */
    public interface AbstractC53602a {
        /* renamed from: a */
        void mo182828a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.search.impl.func.detail.base.j$b */
    public static class RunnableC53603b implements Runnable {

        /* renamed from: a */
        private Runnable f132363a;

        public void run() {
            this.f132363a.run();
        }

        RunnableC53603b(Runnable runnable) {
            this.f132363a = runnable;
        }
    }

    /* renamed from: a */
    public void mo182884a() {
        if (this.f132354d) {
            m207527e();
        }
    }

    /* renamed from: f */
    private void m207528f() {
        this.f132358h.mo181961c(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.search.impl.func.detail.base.C53598j.C536013 */

            public void onAnimationEnd(Animator animator) {
                if (C53598j.this.f132352b != null) {
                    C53598j.this.f132352b.mo182828a();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo182893b() {
        if (this.f132354d) {
            m207528f();
            return;
        }
        Activity activity = this.f132353c;
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    private void m207527e() {
        C53330a aVar = new C53330a(this.f132359i);
        this.f132358h = aVar;
        aVar.mo181957a(new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.search.impl.func.detail.base.C53598j.C536002 */

            public void onAnimationEnd(Animator animator) {
                KeyboardUtils.showKeyboard(C53598j.this.f132351a);
            }
        });
    }

    /* renamed from: c */
    public void mo182894c() {
        if (this.f132354d) {
            this.f132351a.requestFocus();
        } else {
            this.f132351a.postDelayed(new RunnableC53603b(new Runnable() {
                /* class com.ss.android.lark.search.impl.func.detail.base.C53598j.RunnableC535991 */

                public void run() {
                    KeyboardUtils.showKeyboard(C53598j.this.f132351a);
                }
            }), 200);
        }
    }

    /* renamed from: d */
    public void mo182895d() {
        if (!this.f132354d) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f132357g.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, UIUtils.dp2px(this.f132353c, 16.0f), 0);
            this.f132357g.setLayoutParams(marginLayoutParams);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f132355e.getLayoutParams();
            layoutParams.width = (DeviceUtils.getScreenWidth(this.f132353c) - (UIUtils.dp2px(this.f132353c, 16.0f) * 3)) - UIUtils.getWidth(this.f132357g);
            this.f132355e.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo182885a(Activity activity) {
        this.f132353c = activity;
    }

    /* renamed from: a */
    public void mo182886a(ViewGroup viewGroup) {
        this.f132356f = viewGroup;
    }

    /* renamed from: a */
    public void mo182887a(EditText editText) {
        this.f132351a = editText;
    }

    /* renamed from: a */
    public void mo182888a(FrameLayout frameLayout) {
        this.f132355e = frameLayout;
    }

    /* renamed from: a */
    public void mo182889a(TextView textView) {
        this.f132357g = textView;
    }

    /* renamed from: a */
    public void mo182890a(C53330a.AbstractC53333a aVar) {
        this.f132359i = aVar;
    }

    /* renamed from: a */
    public void mo182891a(AbstractC53602a aVar) {
        this.f132352b = aVar;
    }

    /* renamed from: a */
    public void mo182892a(boolean z) {
        this.f132354d = z;
    }
}
