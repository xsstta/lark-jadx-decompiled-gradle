package com.ss.android.lark.mail.impl.utils.toast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.larksuite.component.ui.p1153e.C25655d;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.utils.UIHelper;

public class MailToast {

    /* renamed from: a */
    private static Handler f111189a = new Handler(Looper.getMainLooper());

    public enum Type {
        UNSPECIFIC,
        SUCCESS,
        FAIL
    }

    /* renamed from: b */
    private static final void m173705b(String str) {
        m173701a(str, 0);
    }

    /* renamed from: a */
    public static final void m173697a(int i) {
        m173700a(C41816b.m166115a().mo150132b().getString(i));
    }

    /* renamed from: a */
    public static int m173696a(Context context) {
        Context b = C41816b.m166115a().mo150132b();
        int b2 = ((int) (((double) C25655d.m91902a(b).mo89314b()) * 0.191904047976012d)) - C25655d.m91903b(b);
        if (b2 <= 0) {
            return context.getResources().getDimensionPixelSize(R.dimen.mail_bottom_hint_margin);
        }
        return b2;
    }

    /* renamed from: a */
    public static final void m173699a(final UDToastImpl dVar) {
        RunnableC438242 r0 = new Runnable() {
            /* class com.ss.android.lark.mail.impl.utils.toast.MailToast.RunnableC438242 */

            public void run() {
                dVar.show();
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            r0.run();
        } else {
            f111189a.post(r0);
        }
    }

    /* renamed from: a */
    public static final void m173700a(String str) {
        if (!TextUtils.isEmpty(str)) {
            m173705b(str);
        }
    }

    /* renamed from: a */
    private static final void m173701a(String str, int i) {
        m173706b(str, i, 0);
    }

    /* renamed from: a */
    public static final void m173698a(int i, Type type) {
        m173704a(C41816b.m166115a().mo150132b().getString(i), type);
    }

    /* renamed from: a */
    private static final void m173703a(final String str, final Drawable drawable) {
        RunnableC438231 r0 = new Runnable() {
            /* class com.ss.android.lark.mail.impl.utils.toast.MailToast.RunnableC438231 */

            public void run() {
                UDToast.Builder a = UDToast.build(C41816b.m166115a().mo150132b()).mo91643a(str).mo91638a(81, 0, MailToast.m173696a(C41816b.m166115a().mo150132b()));
                Drawable drawable = drawable;
                if (drawable != null) {
                    a.mo91641a(drawable);
                }
                a.mo91655j().show();
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            r0.run();
        } else {
            f111189a.post(r0);
        }
    }

    /* renamed from: a */
    public static final void m173704a(String str, Type type) {
        if (!TextUtils.isEmpty(str)) {
            m173705b(str);
        }
    }

    /* renamed from: b */
    private static final void m173706b(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str)) {
            if (i == 0) {
                m173703a(str, (Drawable) null);
                return;
            }
            Drawable drawable = UIHelper.getDrawable(i);
            if (i2 != 0) {
                drawable.setTint(UIHelper.getColor(i2));
            }
            m173703a(str, drawable);
        }
    }

    /* renamed from: a */
    public static final void m173702a(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str)) {
            m173706b(str, i, i2);
        }
    }
}
