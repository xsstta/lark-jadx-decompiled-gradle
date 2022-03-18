package com.ss.android.lark.feed.app.view.title;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LabelView extends LinearLayout {

    /* renamed from: f */
    private static final int f97647f;

    /* renamed from: g */
    private static final int f97648g = 18;

    /* renamed from: a */
    String f97649a;

    /* renamed from: b */
    ValueAnimator f97650b;

    /* renamed from: c */
    ValueAnimator f97651c;

    /* renamed from: d */
    public TextView f97652d;

    /* renamed from: e */
    public ImageView f97653e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MODE {
    }

    /* renamed from: e */
    private void m149519e() {
        ValueAnimator valueAnimator = this.f97650b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f97650b.end();
        }
    }

    /* renamed from: a */
    public void mo139144a() {
        m149519e();
        ValueAnimator valueAnimator = this.f97651c;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    static {
        int i;
        if (DesktopUtil.m144307b()) {
            i = 18;
        } else {
            i = 14;
        }
        f97647f = i;
        DesktopUtil.m144307b();
    }

    /* renamed from: b */
    private void m149516b() {
        m149517c();
        String string = UIUtils.getString(getContext(), R.string.Lark_Legacy_LoadingWait);
        this.f97649a = string.substring(0, string.length() - 3);
    }

    /* renamed from: d */
    private void m149518d() {
        final String[] strArr = {"", ".", "..", "..."};
        this.f97652d.setText(this.f97649a);
        if (this.f97650b == null) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 4).setDuration(900L);
            this.f97650b = duration;
            duration.setRepeatCount(-1);
            this.f97650b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.feed.app.view.title.LabelView.C380231 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    TextView textView = LabelView.this.f97652d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(LabelView.this.f97649a);
                    String[] strArr = strArr;
                    sb.append(strArr[intValue % strArr.length]);
                    textView.setText(sb.toString());
                }
            });
        }
        if (!this.f97650b.isRunning()) {
            this.f97650b.start();
        }
    }

    /* renamed from: c */
    private void m149517c() {
        int i;
        setGravity(16);
        setOrientation(0);
        this.f97652d = new TextView(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.f97652d.setTextSize(24.0f);
        this.f97652d.setTextColor(getContext().getResources().getColor(R.color.lkui_N900));
        this.f97652d.setTypeface(Typeface.defaultFromStyle(1));
        this.f97652d.setGravity(16);
        this.f97652d.setMaxLines(1);
        addView(this.f97652d, layoutParams);
        this.f97653e = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(UIHelper.dp2px(10.0f), UIHelper.dp2px(10.0f));
        layoutParams2.leftMargin = UIHelper.dp2px(4.0f);
        addView(this.f97653e, layoutParams2);
        ImageView imageView = this.f97653e;
        if (DesktopUtil.m144307b()) {
            i = R.drawable.title_arrow_desktop;
        } else {
            i = R.drawable.title_arrow;
        }
        imageView.setImageResource(i);
    }

    public LabelView(Context context) {
        super(context);
        m149516b();
    }

    /* renamed from: a */
    public void mo139145a(int i) {
        this.f97652d.setVisibility(0);
        if (i == 0) {
            this.f97653e.setVisibility(8);
            m149518d();
        } else if (i == 1) {
            m149519e();
            this.f97652d.setText(R.string.Lark_Legacy_FeedInboxHead);
            this.f97653e.setVisibility(0);
        } else if (i == 2) {
            m149519e();
            this.f97652d.setText(R.string.Lark_Legacy_TitleMessageDone);
            this.f97653e.setVisibility(0);
        } else if (i == 3) {
            m149519e();
            this.f97652d.setText(R.string.Lark_Legacy_ChatTableHeaderNotConnected);
            this.f97653e.setVisibility(0);
        }
    }

    public void setTextSizeMode(int i) {
        int i2;
        boolean z;
        if (i == 0) {
            i2 = 24;
        } else {
            i2 = f97648g;
        }
        TextView textView = this.f97652d;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        textView.setIncludeFontPadding(z);
        this.f97652d.setTextSize((float) i2);
        if (i == 1) {
            Paint.FontMetrics fontMetrics = this.f97652d.getPaint().getFontMetrics();
            if (fontMetrics.descent - fontMetrics.ascent > ((float) UIUtils.dp2px(getContext(), 18.0f))) {
                this.f97652d.setTextSize((float) f97647f);
            }
        }
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m149516b();
    }

    public LabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m149516b();
    }
}
