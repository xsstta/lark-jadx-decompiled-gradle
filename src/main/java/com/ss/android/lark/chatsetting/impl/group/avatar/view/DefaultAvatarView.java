package com.ss.android.lark.chatsetting.impl.group.avatar.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.group.avatar.p1699a.C34568b;
import com.ss.android.lark.chatsetting.impl.group.avatar.p1703e.C34582a;
import com.ss.android.lark.utils.UIHelper;

public class DefaultAvatarView extends RelativeLayout {

    /* renamed from: a */
    private final Paint f89342a = new Paint();

    /* renamed from: b */
    private final Paint f89343b = new Paint();

    /* renamed from: c */
    private TextView f89344c;

    /* renamed from: d */
    private ImageView f89345d;

    /* renamed from: e */
    private boolean f89346e = false;

    /* renamed from: f */
    private int f89347f = R.drawable.ud_icon_group_filled;

    /* renamed from: a */
    public void mo127826a() {
        this.f89344c.setText("");
    }

    public int getBackgroundColor() {
        return this.f89342a.getColor();
    }

    public int getBorderColor() {
        return this.f89343b.getColor();
    }

    /* renamed from: b */
    private void m134444b() {
        setGravity(17);
        m134445c();
        m134446d();
        m134447e();
    }

    public int getCenterColor() {
        if (this.f89346e) {
            return UIUtils.getColor(getContext(), R.color.static_white);
        }
        return this.f89343b.getColor();
    }

    public int getColor() {
        if (this.f89346e) {
            return UIUtils.getColor(getContext(), R.color.static_white);
        }
        return this.f89343b.getColor();
    }

    public String getText() {
        String str = (String) this.f89344c.getText();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("\n")) {
            return str.replace("\n", "");
        }
        return str;
    }

    /* renamed from: c */
    private void m134445c() {
        this.f89342a.setDither(true);
        setWillNotDraw(false);
        this.f89342a.setAntiAlias(true);
        this.f89342a.setStyle(Paint.Style.FILL);
        this.f89343b.setDither(true);
        setWillNotDraw(false);
        this.f89343b.setAntiAlias(true);
        this.f89343b.setStrokeWidth((float) UIHelper.dp2px(3.0f));
        this.f89343b.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: d */
    private void m134446d() {
        TextView textView = new TextView(getContext());
        this.f89344c = textView;
        textView.setTypeface(Typeface.defaultFromStyle(1));
        this.f89344c.setGravity(17);
        this.f89344c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f89344c.setVisibility(8);
        addView(this.f89344c);
    }

    /* renamed from: e */
    private void m134447e() {
        this.f89345d = new ImageView(getContext());
        this.f89345d.setLayoutParams(new RelativeLayout.LayoutParams(UIHelper.dp2px(40.0f), UIHelper.dp2px(40.0f)));
        this.f89345d.setVisibility(8);
        addView(this.f89345d);
    }

    public DefaultAvatarView(Context context) {
        super(context);
        m134444b();
    }

    public void setIconWithColor(int i) {
        this.f89344c.setVisibility(8);
        this.f89345d.setVisibility(0);
        this.f89344c.setText("");
        if (i != -1 && i != 0) {
            setViewColor(i);
        }
    }

    public void setTextSize(int i) {
        this.f89344c.setVisibility(0);
        this.f89345d.setVisibility(8);
        this.f89344c.setTextSize((float) i);
    }

    public void setTextWithColor(int i) {
        this.f89344c.setVisibility(0);
        this.f89345d.setVisibility(8);
        setViewColor(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = ((float) getMeasuredWidth()) / 2.0f;
        float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - ((float) UIHelper.dp2px(1.5f)), this.f89342a);
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - ((float) UIHelper.dp2px(1.5f)), this.f89343b);
    }

    private void setViewColor(int i) {
        int i2;
        Context context = getContext();
        boolean z = this.f89346e;
        int i3 = R.color.static_white;
        if (z) {
            i2 = i;
        } else {
            i2 = R.color.static_white;
        }
        int color = UIUtils.getColor(context, i2);
        Context context2 = getContext();
        if (!this.f89346e) {
            i3 = i;
        }
        int color2 = UIUtils.getColor(context2, i3);
        this.f89342a.setColor(color);
        this.f89343b.setColor(UIUtils.getColor(getContext(), i));
        this.f89344c.setTextColor(color2);
        this.f89345d.setImageDrawable(UDIconUtils.getIconDrawable(getContext(), this.f89347f, color2));
        invalidate();
    }

    public void setText(String str) {
        this.f89344c.setVisibility(0);
        this.f89345d.setVisibility(8);
        if (!TextUtils.isEmpty(str)) {
            C34568b a = C34582a.m134367a(8, str);
            String a2 = a.mo127743a();
            int b = a.mo127746b();
            if (b == 1) {
                this.f89344c.setTextSize(54.0f);
            } else if (b == 2) {
                this.f89344c.setTextSize(42.0f);
            } else if (b == 3 || b == 4) {
                this.f89344c.setTextSize(34.0f);
            } else {
                a2 = C34582a.m134368a(4, "\n", a2);
                this.f89344c.setTextSize(28.0f);
            }
            this.f89344c.setText(a2);
        }
    }

    /* renamed from: a */
    public void mo127827a(boolean z, int i) {
        this.f89346e = z;
        this.f89347f = i;
    }

    public DefaultAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m134444b();
    }

    public DefaultAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m134444b();
    }
}
