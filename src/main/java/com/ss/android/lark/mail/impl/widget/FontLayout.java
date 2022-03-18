package com.ss.android.lark.mail.impl.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0689b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.bubble.BubbleLayout;
import com.ss.android.lark.utils.UIHelper;

public class FontLayout extends ConstraintLayout {

    /* renamed from: a */
    public String f111616a = "";

    /* renamed from: b */
    public View f111617b;

    /* renamed from: c */
    private AbstractC43984a f111618c;

    /* renamed from: d */
    private BubbleLayout f111619d;

    /* renamed from: e */
    private TextView f111620e;

    /* renamed from: f */
    private int f111621f;

    /* renamed from: g */
    private int f111622g;

    /* renamed from: h */
    private int f111623h;

    /* renamed from: i */
    private int f111624i = -1;

    /* renamed from: j */
    private long f111625j;

    /* renamed from: k */
    private View f111626k;

    /* renamed from: l */
    private final Runnable f111627l = new Runnable() {
        /* class com.ss.android.lark.mail.impl.widget.FontLayout.RunnableC439821 */

        public void run() {
            if (FontLayout.this.f111617b != null && FontLayout.this.f111616a != null) {
                int[] iArr = new int[2];
                FontLayout.this.f111617b.getLocationInWindow(iArr);
                FontLayout fontLayout = FontLayout.this;
                fontLayout.mo156532a(fontLayout.f111616a, FontLayout.this.f111617b, iArr);
            }
        }
    };

    /* renamed from: com.ss.android.lark.mail.impl.widget.FontLayout$a */
    public interface AbstractC43984a {
        /* renamed from: a */
        void mo153673a();

        /* renamed from: a */
        void mo153674a(String str);

        /* renamed from: b */
        int mo153675b();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: a */
    private void m174203a() {
        C43849u.m173829b(this.f111627l);
        this.f111616a = "";
        BubbleLayout bubbleLayout = this.f111619d;
        if (bubbleLayout != null) {
            bubbleLayout.mo155902a();
        }
        AbstractC43984a aVar = this.f111618c;
        if (aVar != null) {
            aVar.mo153673a();
        }
    }

    public void setFontChangeCallback(AbstractC43984a aVar) {
        this.f111618c = aVar;
    }

    public FontLayout(Context context) {
        super(context);
        m174205a(context);
    }

    /* renamed from: a */
    private void m174205a(Context context) {
        BubbleLayout bubbleLayout = (BubbleLayout) LayoutInflater.from(context).inflate(R.layout.mail_toolbar_font_tip_layout, (ViewGroup) null);
        this.f111619d = bubbleLayout;
        this.f111620e = (TextView) bubbleLayout.findViewById(R.id.mail_font_tip_title);
    }

    public void setCurrentFont(final String str) {
        if (!TextUtils.isEmpty(str)) {
            final View findViewWithTag = findViewWithTag(str);
            if (findViewWithTag == null) {
                this.f111616a = "";
                View view = this.f111626k;
                if (view != null) {
                    view.setVisibility(4);
                }
            } else if (findViewWithTag.getWidth() == 0) {
                getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class com.ss.android.lark.mail.impl.widget.FontLayout.ViewTreeObserver$OnGlobalLayoutListenerC439832 */

                    public void onGlobalLayout() {
                        FontLayout.this.mo156531a(str, findViewWithTag);
                        FontLayout.this.f111616a = str;
                        FontLayout.this.f111617b = findViewWithTag;
                        FontLayout.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
            } else {
                mo156531a(str, findViewWithTag);
                this.f111616a = str;
                this.f111617b = findViewWithTag;
            }
        } else {
            this.f111616a = str;
            View view2 = this.f111626k;
            if (view2 != null) {
                view2.setVisibility(4);
            }
        }
    }

    /* renamed from: a */
    private void m174206a(String str) {
        if (!TextUtils.equals(this.f111616a, str)) {
            this.f111616a = str;
            AbstractC43984a aVar = this.f111618c;
            if (aVar != null) {
                aVar.mo153674a(str);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        motionEvent.getY();
        if (actionMasked == 0) {
            this.f111625j = System.currentTimeMillis();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (actionMasked == 3 || actionMasked == 4 || actionMasked == 1) {
            m174203a();
        } else {
            String str = "";
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                Object tag = childAt.getTag();
                if ((childAt instanceof ViewGroup) && tag != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    if (x > ((float) iArr[0]) && x < ((float) (iArr[0] + childAt.getWidth()))) {
                        String str2 = (String) tag;
                        View view = this.f111617b;
                        if (view != null) {
                            view.setSelected(false);
                        }
                        childAt.setSelected(true);
                        mo156531a(str2, childAt);
                        this.f111617b = childAt;
                        if (!TextUtils.equals(this.f111616a, str2) || this.f111624i != actionMasked) {
                            long currentTimeMillis = System.currentTimeMillis() - this.f111625j;
                            C43849u.m173829b(this.f111627l);
                            Runnable runnable = this.f111627l;
                            long j = 350;
                            if (currentTimeMillis >= 350) {
                                j = 0;
                            }
                            C43849u.m173827a(runnable, j);
                        }
                        str = str2;
                    }
                }
            }
            if (!str.isEmpty() && (actionMasked == 0 || actionMasked == 2)) {
                m174206a(str);
            }
        }
        this.f111624i = actionMasked;
        return true;
    }

    /* renamed from: a */
    private void m174204a(int i, int i2) {
        TextView textView = this.f111620e;
        if (textView != null) {
            textView.setText(i);
            this.f111620e.setTextSize(1, (float) i2);
        }
    }

    public FontLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m174205a(context);
    }

    /* renamed from: a */
    public void mo156531a(String str, View view) {
        if (!TextUtils.equals(this.f111616a, str)) {
            BubbleLayout bubbleLayout = this.f111619d;
            if (bubbleLayout != null) {
                bubbleLayout.mo155902a();
            }
            if (this.f111626k != null) {
                if (this.f111623h == 0) {
                    this.f111623h = view.getWidth() + (UIHelper.getDimens(R.dimen.mail_toolbar_shadow_width) * 2);
                }
                this.f111626k.setVisibility(0);
                C0689b bVar = new C0689b();
                bVar.mo3907d(this.f111626k.getId(), this.f111623h);
                bVar.mo3880a(this.f111626k.getId(), view.getId());
                bVar.mo3905c(this);
            }
        }
    }

    public FontLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m174205a(context);
    }

    /* renamed from: a */
    public void mo156532a(String str, View view, int[] iArr) {
        if (this.f111619d != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 429928378:
                    if (str.equals("FontHuge")) {
                        c = 0;
                        break;
                    }
                    break;
                case 445986828:
                    if (str.equals("FontLarge")) {
                        c = 1;
                        break;
                    }
                    break;
                case 452792792:
                    if (str.equals("FontSmall")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1010883126:
                    if (str.equals("FontNormal")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    m174204a(R.string.Mail_Compose_FontHuge, 32);
                    break;
                case 1:
                    m174204a(R.string.Mail_Compose_FontLarge, 18);
                    break;
                case 2:
                    m174204a(R.string.Mail_Compose_FontSmall, 12);
                    break;
                case 3:
                    m174204a(R.string.Mail_Compose_FontNormal, 14);
                    break;
                default:
                    m174204a(R.string.Mail_Compose_FontNormal, 14);
                    break;
            }
            if (this.f111621f == 0) {
                int i = this.f111622g;
                if (i != 0) {
                    this.f111621f = i - UIHelper.getDimens(R.dimen.mail_toolbar_bubble_padding);
                } else if (this.f111618c != null) {
                    this.f111621f = (DeviceUtils.getScreenHeight(getContext()) - this.f111618c.mo153675b()) + UIHelper.getDimens(R.dimen.mail_toolbar_menu_height);
                }
            }
            iArr[1] = iArr[1] + this.f111621f;
            this.f111619d.mo155903a(view, iArr);
        }
    }
}
