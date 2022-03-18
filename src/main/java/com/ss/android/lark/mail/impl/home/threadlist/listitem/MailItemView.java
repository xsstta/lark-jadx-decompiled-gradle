package com.ss.android.lark.mail.impl.home.threadlist.listitem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.by.inflate_lib.C2599a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.utils.UIHelper;

public class MailItemView extends ConstraintLayout {

    /* renamed from: a */
    private static final int f108619a;

    /* renamed from: b */
    private static final int f108620b;

    /* renamed from: c */
    private static final int f108621c;

    /* renamed from: d */
    private static final int f108622d;

    /* renamed from: e */
    private static final int f108623e;

    /* renamed from: f */
    private RelativeLayout f108624f;

    /* renamed from: g */
    private LinearLayout f108625g;

    /* renamed from: h */
    private LinearLayout f108626h;

    /* renamed from: i */
    private TextView f108627i;

    /* renamed from: j */
    private TextView f108628j;

    /* renamed from: k */
    private RelativeLayout f108629k;

    /* renamed from: l */
    private View f108630l;

    /* renamed from: m */
    private View f108631m;

    /* renamed from: n */
    private boolean f108632n;

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView$a */
    public interface AbstractC42696a {
        /* renamed from: a */
        void mo153138a();

        /* renamed from: b */
        void mo153139b();
    }

    /* renamed from: a */
    public void mo153351a() {
        this.f108631m.setBackground(null);
        this.f108632n = true;
    }

    /* renamed from: b */
    public void mo153354b() {
        this.f108630l = null;
        RelativeLayout relativeLayout = this.f108624f;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    /* renamed from: c */
    private void m170182c() {
        C2599a.m10958a(getContext(), R.layout.mail_home_thread_item_layout, this, true);
        this.f108631m = findViewById(R.id.mail_home_container);
        this.f108629k = (RelativeLayout) findViewById(R.id.mail_home_item_layout);
    }

    /* renamed from: d */
    private void m170183d() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f108624f = relativeLayout;
        relativeLayout.setLayoutDirection(1);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, 0);
        layoutParams.f2816h = 0;
        layoutParams.f2819k = 0;
        addView(this.f108624f, 0, layoutParams);
    }

    static {
        int dp2px = UIUtils.dp2px(C41816b.m166115a().mo150132b(), 1.0f);
        f108619a = dp2px;
        f108620b = dp2px * 16;
        f108621c = dp2px * 0;
        f108622d = dp2px * 0;
        f108623e = dp2px * 5;
    }

    /* renamed from: e */
    private void m170184e() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f108625g = linearLayout;
        linearLayout.setOrientation(0);
        this.f108625g.setGravity(3);
        TextView textView = new TextView(getContext());
        this.f108627i = textView;
        textView.setGravity(16);
        this.f108627i.setCompoundDrawablePadding(f108623e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        this.f108625g.addView(this.f108627i, layoutParams);
        this.f108624f.addView(this.f108625g, 0, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: f */
    private void m170185f() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f108626h = linearLayout;
        linearLayout.setOrientation(0);
        this.f108626h.setGravity(5);
        TextView textView = new TextView(getContext());
        this.f108628j = textView;
        textView.setGravity(16);
        this.f108628j.setCompoundDrawablePadding(f108623e);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        this.f108626h.addView(this.f108628j, layoutParams);
        this.f108624f.addView(this.f108626h, 0, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo153352a(boolean z) {
        this.f108632n = false;
    }

    public MailItemView(Context context) {
        this(context, null);
    }

    public void setVisibleBehindSwipe(int i) {
        RelativeLayout relativeLayout = this.f108624f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(i);
        }
    }

    public MailItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MailItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m170182c();
    }

    /* renamed from: a */
    public float mo153350a(float f, String str, int i, int i2, Drawable drawable, int i3, final AbstractC42696a aVar) {
        if (this.f108624f == null) {
            m170183d();
        }
        if (this.f108625g == null) {
            m170184e();
        }
        if (this.f108630l != this.f108625g) {
            this.f108624f.removeAllViews();
            this.f108624f.addView(this.f108625g);
            this.f108630l = this.f108625g;
        }
        this.f108630l.setClickable(true);
        this.f108630l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView.View$OnClickListenerC426941 */

            public void onClick(View view) {
                AbstractC42696a aVar = aVar;
                if (aVar != null) {
                    aVar.mo153139b();
                }
            }
        });
        this.f108625g.setVisibility(0);
        this.f108625g.setBackgroundColor(i3);
        this.f108627i.setText(str);
        this.f108627i.setTextSize((float) i);
        this.f108627i.setTextColor(i2);
        this.f108627i.setLines(1);
        drawable.setBounds(0, 0, UIHelper.dp2px(20.0f), UIHelper.dp2px(20.0f));
        this.f108627i.setCompoundDrawables(drawable, null, null, null);
        int width = this.f108627i.getWidth();
        int i4 = f108620b;
        float f2 = (float) (width + (i4 * 2));
        this.f108627i.setTranslationX((((float) i4) + f) - f2);
        return f2 / ((float) UIHelper.getWindowWidth(getContext()));
    }

    /* renamed from: b */
    public float mo153353b(float f, String str, int i, int i2, Drawable drawable, int i3, final AbstractC42696a aVar) {
        if (this.f108624f == null) {
            m170183d();
        }
        if (this.f108626h == null) {
            m170185f();
        }
        if (this.f108630l != this.f108626h) {
            this.f108624f.removeAllViews();
            this.f108624f.addView(this.f108626h);
            this.f108630l = this.f108626h;
        }
        this.f108630l.setClickable(true);
        this.f108630l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView.View$OnClickListenerC426952 */

            public void onClick(View view) {
                AbstractC42696a aVar = aVar;
                if (aVar != null) {
                    aVar.mo153138a();
                }
            }
        });
        this.f108626h.setVisibility(0);
        this.f108626h.setBackgroundColor(i3);
        this.f108628j.setText(str);
        this.f108628j.setTextSize((float) i);
        this.f108628j.setLines(1);
        this.f108628j.setTextColor(i2);
        drawable.setBounds(0, 0, UIHelper.dp2px(20.0f), UIHelper.dp2px(20.0f));
        this.f108628j.setCompoundDrawables(drawable, null, null, null);
        int width = this.f108628j.getWidth();
        int i4 = f108620b;
        float f2 = (float) (width + (i4 * 2));
        this.f108628j.setTranslationX(((float) (-i4)) + f + f2);
        return f2 / ((float) UIHelper.getWindowWidth(getContext()));
    }
}
