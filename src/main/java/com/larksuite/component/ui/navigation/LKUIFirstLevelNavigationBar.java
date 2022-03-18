package com.larksuite.component.ui.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class LKUIFirstLevelNavigationBar extends RelativeLayout {

    /* renamed from: a */
    private int f62785a;

    /* renamed from: b */
    private int f62786b;

    /* renamed from: c */
    private int f62787c;

    /* renamed from: d */
    private int f62788d;

    /* renamed from: e */
    private int f62789e;

    /* renamed from: f */
    private String f62790f;

    /* renamed from: g */
    private int f62791g;

    /* renamed from: h */
    private float f62792h;

    /* renamed from: i */
    private TextView f62793i;

    /* renamed from: j */
    private ImageView f62794j;

    /* renamed from: k */
    private ImageView f62795k;

    /* renamed from: l */
    private ImageView f62796l;

    /* renamed from: m */
    private ImageView f62797m;

    /* renamed from: n */
    private ImageView f62798n;

    public ImageView getLeftImageView() {
        return this.f62794j;
    }

    public ImageView getRightImageView1() {
        return this.f62795k;
    }

    public ImageView getRightImageView2() {
        return this.f62796l;
    }

    public ImageView getRightImageView3() {
        return this.f62797m;
    }

    public ImageView getRightImageView4() {
        return this.f62798n;
    }

    public String getTitle() {
        return this.f62790f;
    }

    public TextView getTitleView() {
        return this.f62793i;
    }

    /* renamed from: a */
    private void m92124a() {
        this.f62792h = (float) C25653b.m91897c(getContext(), 26.0f);
        this.f62791g = ContextCompat.getColor(getContext(), R.color.lkui_N900);
    }

    public LKUIFirstLevelNavigationBar(Context context) {
        this(context, null);
    }

    public void setLeftDrawableRes(int i) {
        this.f62785a = i;
        this.f62794j.setImageResource(i);
    }

    public void setRightDrawable1Res(int i) {
        this.f62786b = i;
        this.f62795k.setImageResource(i);
    }

    public void setRightDrawable2Res(int i) {
        this.f62787c = i;
        this.f62796l.setImageResource(i);
    }

    public void setRightDrawable3Res(int i) {
        this.f62788d = i;
        this.f62797m.setImageResource(i);
    }

    public void setRightDrawable4Res(int i) {
        this.f62789e = i;
        this.f62798n.setImageResource(i);
    }

    public void setTitle(String str) {
        this.f62790f = str;
        this.f62793i.setText(str);
    }

    public void setTitleTextColor(int i) {
        this.f62791g = i;
        this.f62793i.setTextColor(i);
    }

    public void setTitleTextSize(float f) {
        this.f62792h = f;
        this.f62793i.setTextSize(f);
    }

    /* renamed from: a */
    private void m92125a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.first_level_navigation_left_drawable, R.attr.first_level_navigation_right_drawable1, R.attr.first_level_navigation_right_drawable2, R.attr.first_level_navigation_right_drawable3, R.attr.first_level_navigation_right_drawable4, R.attr.first_level_navigation_title, R.attr.first_level_title_textColor, R.attr.first_level_title_textSize});
            this.f62785a = obtainStyledAttributes.getResourceId(0, this.f62785a);
            this.f62786b = obtainStyledAttributes.getResourceId(1, this.f62786b);
            this.f62787c = obtainStyledAttributes.getResourceId(2, this.f62787c);
            this.f62788d = obtainStyledAttributes.getResourceId(3, this.f62788d);
            this.f62789e = obtainStyledAttributes.getResourceId(4, this.f62789e);
            this.f62790f = obtainStyledAttributes.getString(5);
            this.f62791g = obtainStyledAttributes.getColor(6, ContextCompat.getColor(getContext(), R.color.lkui_N900));
            this.f62792h = obtainStyledAttributes.getDimension(7, (float) C25653b.m91897c(getContext(), 26.0f));
            obtainStyledAttributes.recycle();
        } else {
            m92124a();
        }
        this.f62793i.setText(this.f62790f);
        this.f62793i.setTextSize(0, this.f62792h);
        this.f62793i.setTextColor(this.f62791g);
        this.f62794j.setImageResource(this.f62785a);
        this.f62795k.setImageResource(this.f62786b);
        this.f62796l.setImageResource(this.f62787c);
        this.f62797m.setImageResource(this.f62788d);
        this.f62798n.setImageResource(this.f62789e);
    }

    public LKUIFirstLevelNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LKUIFirstLevelNavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(context, R.layout.lkui_navigation_first_level, this);
        this.f62793i = (TextView) findViewById(R.id.title);
        this.f62794j = (ImageView) findViewById(R.id.leftIcon);
        this.f62795k = (ImageView) findViewById(R.id.rightIcon1);
        this.f62796l = (ImageView) findViewById(R.id.rightIcon2);
        this.f62797m = (ImageView) findViewById(R.id.rightIcon3);
        this.f62798n = (ImageView) findViewById(R.id.rightIcon4);
        m92125a(attributeSet);
    }
}
