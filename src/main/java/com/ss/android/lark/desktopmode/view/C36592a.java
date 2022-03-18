package com.ss.android.lark.desktopmode.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.desktopmode.view.a */
public class C36592a extends PopupWindow {

    /* renamed from: a */
    private View f94157a;

    /* renamed from: b */
    private Rect f94158b = new Rect();

    /* renamed from: c */
    private int[] f94159c = new int[2];

    /* renamed from: d */
    private int f94160d = -1;

    /* renamed from: a */
    public int mo134994a() {
        return this.f94160d;
    }

    /* renamed from: com.ss.android.lark.desktopmode.view.a$a */
    public static class C36593a {

        /* renamed from: a */
        private String f94161a = "";

        /* renamed from: b */
        private int f94162b = 12;

        /* renamed from: c */
        private int f94163c = -1;

        /* renamed from: d */
        private int f94164d = R.drawable.hover_tips_bg;

        /* renamed from: a */
        public C36593a mo135002a(String str) {
            this.f94161a = str;
            return this;
        }

        /* renamed from: a */
        public C36592a mo135003a(Context context) {
            return new C36592a(context, this.f94161a, this.f94162b, this.f94163c, this.f94164d);
        }
    }

    /* renamed from: a */
    public void mo134995a(int i) {
        this.f94160d = i;
    }

    /* renamed from: b */
    public void mo135000b(View view) {
        m144361a(view, 0);
    }

    /* renamed from: a */
    public void mo134996a(View view) {
        m144362c(view, 0, UIUtils.dp2px(view.getContext(), 4.0f));
    }

    /* renamed from: a */
    public void mo134999a(String str) {
        ((TextView) this.f94157a.findViewById(R.id.tips)).setText(str);
    }

    /* renamed from: a */
    private void m144361a(View view, int i) {
        view.getLocationInWindow(this.f94159c);
        int screenWidth = DeviceUtils.getScreenWidth(view.getContext());
        int height = UIUtils.getHeight(this.f94157a) >> 1;
        int height2 = UIUtils.getHeight(view) >> 1;
        try {
            int[] iArr = this.f94159c;
            showAtLocation(view, 53, (screenWidth - iArr[0]) + i, (iArr[1] + height2) - height);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo134997a(View view, int i, int i2) {
        m144362c(view, UIUtils.dp2px(view.getContext(), (float) i), UIUtils.dp2px(view.getContext(), (float) i2));
    }

    /* renamed from: c */
    private void m144362c(View view, int i, int i2) {
        view.getLocationInWindow(this.f94159c);
        int width = UIUtils.getWidth(view) >> 1;
        this.f94157a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.f94157a.getMeasuredWidth() >> 1;
        int measuredHeight = this.f94157a.getMeasuredHeight();
        try {
            int[] iArr = this.f94159c;
            showAtLocation(view, 51, ((iArr[0] + width) - measuredWidth) - i, (iArr[1] - measuredHeight) - i2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void mo135001b(View view, int i, int i2) {
        view.getLocationInWindow(this.f94159c);
        this.f94157a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        try {
            showAtLocation(view, 51, ((this.f94159c[0] + (view.getWidth() / 2)) - (this.f94157a.getMeasuredWidth() / 2)) + UIUtils.dp2px(view.getContext(), (float) i), this.f94159c[1] + view.getHeight() + UIUtils.dp2px(view.getContext(), (float) i2));
        } catch (Exception unused) {
        }
    }

    public C36592a(Context context, String str, int i, int i2, int i3) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.window_hover_tips, (ViewGroup) null);
        this.f94157a = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.tips);
        textView.setTextSize((float) i);
        textView.setTextColor(i2);
        textView.setText(str);
        textView.setBackgroundResource(i3);
        setContentView(this.f94157a);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
    }

    /* renamed from: a */
    public void mo134998a(View view, int i, int i2, int i3, int i4) {
        int i5;
        view.getLocationInWindow(this.f94159c);
        if (i == -1) {
            i5 = UIUtils.getHeight(view);
        } else {
            i5 = UIUtils.dp2px(this.f94157a.getContext(), (float) i2);
        }
        int i6 = i5 >> 1;
        int dp2px = UIUtils.dp2px(this.f94157a.getContext(), (float) i);
        if (i == -1) {
            dp2px = UIUtils.getWidth(view);
        }
        this.f94157a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        try {
            showAtLocation(view, 51, this.f94159c[0] + dp2px + UIUtils.dp2px(view.getContext(), (float) i3), ((this.f94159c[1] + i6) - (this.f94157a.getMeasuredHeight() / 2)) + UIUtils.dp2px(view.getContext(), (float) i4));
        } catch (Exception unused) {
        }
    }
}
