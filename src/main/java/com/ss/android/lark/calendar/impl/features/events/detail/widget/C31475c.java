package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.ui.BasePopupWindow;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.c */
public class C31475c extends BasePopupWindow {

    /* renamed from: a */
    public View f79781a;

    /* renamed from: b */
    public AbstractC31480a f79782b;

    /* renamed from: c */
    private TextView f79783c;

    /* renamed from: d */
    private Activity f79784d;

    /* renamed from: e */
    private View f79785e;

    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.c$a */
    public interface AbstractC31480a {
        /* renamed from: a */
        void mo113999a();

        /* renamed from: a */
        boolean mo114000a(int i);

        /* renamed from: b */
        void mo114001b();

        /* renamed from: c */
        String mo114002c();

        /* renamed from: d */
        void mo114003d();
    }

    /* renamed from: b */
    public void mo114216b() {
        mo114214a();
        this.f79784d = null;
    }

    /* renamed from: a */
    public void mo114214a() {
        Activity activity = this.f79784d;
        if (activity != null && !activity.isFinishing() && isShowing()) {
            dismiss();
        }
    }

    /* renamed from: c */
    private void m118431c() {
        this.f79785e.setFocusable(true);
        this.f79785e.setFocusableInTouchMode(true);
        setFocusable(true);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable(C32634ae.m125181b(), (Bitmap) null));
        this.f79785e.measure(m118430a(getWidth()), m118430a(getHeight()));
        m118432d();
    }

    /* renamed from: d */
    private void m118432d() {
        this.f79785e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.View$OnClickListenerC314761 */

            public void onClick(View view) {
                C31475c.this.mo114216b();
            }
        });
        this.f79785e.setOnKeyListener(new View.OnKeyListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.View$OnKeyListenerC314772 */

            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                C31475c.this.mo114216b();
                return true;
            }
        });
        setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.C314783 */

            public void onDismiss() {
                C31475c.this.f79782b.mo114001b();
            }
        });
        this.f79783c.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.detail.widget.C31475c.View$OnClickListenerC314794 */

            public void onClick(View view) {
                ((ClipboardManager) C31475c.this.f79781a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, C31475c.this.f79782b.mo114002c()));
                C31475c.this.f79782b.mo114003d();
                C31475c.this.mo114216b();
            }
        });
    }

    /* renamed from: a */
    private int m118430a(int i) {
        int i2;
        if (i == -2) {
            i2 = 0;
        } else {
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i2);
    }

    public C31475c(View view, AbstractC31480a aVar) {
        super(-2, -2);
        Activity activity = (Activity) view.getContext();
        this.f79784d = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.calendar_menu_chat_message, (ViewGroup) null);
        this.f79781a = view;
        this.f79785e = inflate;
        this.f79782b = aVar;
        this.f79783c = (TextView) inflate.findViewById(R.id.copy);
        setContentView(this.f79785e);
        m118431c();
    }

    /* renamed from: a */
    public void mo114215a(int i, int i2) {
        int measuredWidth = i - (getContentView().getMeasuredWidth() / 2);
        int[] iArr = new int[2];
        this.f79781a.getLocationOnScreen(iArr);
        showAtLocation(this.f79781a, 0, measuredWidth, iArr[1] - getContentView().getMeasuredHeight());
    }
}
