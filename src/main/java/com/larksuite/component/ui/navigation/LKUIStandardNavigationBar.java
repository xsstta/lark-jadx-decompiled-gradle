package com.larksuite.component.ui.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class LKUIStandardNavigationBar extends RelativeLayout {

    /* renamed from: a */
    private int f62836a;

    /* renamed from: b */
    private int f62837b;

    /* renamed from: c */
    private int f62838c;

    /* renamed from: d */
    private int f62839d;

    /* renamed from: e */
    private String f62840e;

    /* renamed from: f */
    private int f62841f;

    /* renamed from: g */
    private float f62842g;

    /* renamed from: h */
    private RightStyle f62843h;

    /* renamed from: i */
    private String f62844i;

    /* renamed from: j */
    private int f62845j;

    /* renamed from: k */
    private float f62846k;

    /* renamed from: l */
    private LinearLayout f62847l;

    /* renamed from: m */
    private ImageView f62848m;

    /* renamed from: n */
    private ImageView f62849n;

    /* renamed from: o */
    private LinearLayout f62850o;

    /* renamed from: p */
    private ImageView f62851p;

    /* renamed from: q */
    private ImageView f62852q;

    /* renamed from: r */
    private TextView f62853r;

    /* renamed from: s */
    private TextView f62854s;

    public enum RightStyle {
        ICON,
        TEXT
    }

    public LinearLayout getLeftContainer() {
        return this.f62847l;
    }

    public ImageView getLeftImageView1() {
        return this.f62848m;
    }

    public ImageView getLeftImageView2() {
        return this.f62849n;
    }

    public LinearLayout getRightContainer() {
        return this.f62850o;
    }

    public ImageView getRightImageView1() {
        return this.f62851p;
    }

    public ImageView getRightImageView2() {
        return this.f62852q;
    }

    public TextView getRightTextView() {
        return this.f62854s;
    }

    public String getTitle() {
        return this.f62844i;
    }

    public TextView getTitleView() {
        return this.f62853r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.ui.navigation.LKUIStandardNavigationBar$1 */
    public static /* synthetic */ class C256881 {

        /* renamed from: a */
        static final /* synthetic */ int[] f62855a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.larksuite.component.ui.navigation.LKUIStandardNavigationBar$RightStyle[] r0 = com.larksuite.component.ui.navigation.LKUIStandardNavigationBar.RightStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.ui.navigation.LKUIStandardNavigationBar.C256881.f62855a = r0
                com.larksuite.component.ui.navigation.LKUIStandardNavigationBar$RightStyle r1 = com.larksuite.component.ui.navigation.LKUIStandardNavigationBar.RightStyle.ICON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.ui.navigation.LKUIStandardNavigationBar.C256881.f62855a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.ui.navigation.LKUIStandardNavigationBar$RightStyle r1 = com.larksuite.component.ui.navigation.LKUIStandardNavigationBar.RightStyle.TEXT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.ui.navigation.LKUIStandardNavigationBar.C256881.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m92135a() {
        this.f62846k = (float) C25653b.m91897c(getContext(), 17.0f);
        this.f62845j = ContextCompat.getColor(getContext(), R.color.lkui_N900);
        this.f62842g = (float) C25653b.m91897c(getContext(), 16.0f);
        this.f62841f = ContextCompat.getColor(getContext(), R.color.lkui_N900);
    }

    /* renamed from: b */
    private void m92137b() {
        int i = C256881.f62855a[this.f62843h.ordinal()];
        if (i == 1) {
            this.f62854s.setVisibility(8);
            this.f62851p.setVisibility(0);
            this.f62852q.setVisibility(0);
        } else if (i == 2) {
            this.f62854s.setVisibility(0);
            this.f62851p.setVisibility(8);
            this.f62852q.setVisibility(8);
        }
    }

    public LKUIStandardNavigationBar(Context context) {
        this(context, null);
    }

    public void setLeftDrawable1Res(int i) {
        this.f62836a = i;
        this.f62848m.setImageResource(i);
    }

    public void setLeftDrawable2Res(int i) {
        this.f62837b = i;
        this.f62849n.setImageResource(i);
    }

    public void setRightDrawable1Res(int i) {
        this.f62838c = i;
        this.f62851p.setImageResource(i);
    }

    public void setRightDrawable2Res(int i) {
        this.f62839d = i;
        this.f62852q.setImageResource(i);
    }

    public void setRightStyle(RightStyle rightStyle) {
        this.f62843h = rightStyle;
        m92137b();
    }

    public void setRightText(String str) {
        this.f62840e = str;
        this.f62854s.setText(str);
    }

    public void setRightTextColor(int i) {
        this.f62841f = i;
        this.f62854s.setTextColor(i);
    }

    public void setRightTextSize(float f) {
        this.f62842g = f;
        this.f62854s.setTextSize(f);
    }

    public void setTitle(String str) {
        this.f62844i = str;
        this.f62853r.setText(str);
    }

    public void setTitleTextColor(int i) {
        this.f62845j = i;
        this.f62853r.setTextColor(i);
    }

    public void setTitleTextSize(float f) {
        this.f62846k = f;
        this.f62853r.setTextSize(f);
    }

    /* renamed from: a */
    private void m92136a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.standard_navigation_left_drawable1, R.attr.standard_navigation_left_drawable2, R.attr.standard_navigation_right_drawable1, R.attr.standard_navigation_right_drawable2, R.attr.standard_navigation_right_text, R.attr.standard_navigation_title, R.attr.standard_right_style, R.attr.standard_right_textColor, R.attr.standard_right_textSize, R.attr.standard_title_textColor, R.attr.standard_title_textSize});
            this.f62836a = obtainStyledAttributes.getResourceId(0, this.f62836a);
            this.f62837b = obtainStyledAttributes.getResourceId(1, this.f62837b);
            this.f62838c = obtainStyledAttributes.getResourceId(2, this.f62838c);
            this.f62839d = obtainStyledAttributes.getResourceId(3, this.f62839d);
            this.f62844i = obtainStyledAttributes.getString(5);
            this.f62845j = obtainStyledAttributes.getColor(9, ContextCompat.getColor(getContext(), R.color.lkui_N900));
            this.f62846k = obtainStyledAttributes.getDimension(10, (float) C25653b.m91897c(getContext(), 17.0f));
            this.f62840e = obtainStyledAttributes.getString(4);
            this.f62841f = obtainStyledAttributes.getColor(7, ContextCompat.getColor(getContext(), R.color.lkui_N900));
            this.f62842g = obtainStyledAttributes.getDimension(8, (float) C25653b.m91897c(getContext(), 16.0f));
            this.f62843h = RightStyle.values()[obtainStyledAttributes.getInt(6, RightStyle.ICON.ordinal())];
            obtainStyledAttributes.recycle();
        } else {
            m92135a();
        }
        this.f62848m.setImageResource(this.f62836a);
        this.f62849n.setImageResource(this.f62837b);
        this.f62851p.setImageResource(this.f62838c);
        this.f62852q.setImageResource(this.f62839d);
        this.f62853r.setText(this.f62844i);
        this.f62853r.setTextSize(0, this.f62846k);
        this.f62853r.setTextColor(this.f62845j);
        this.f62854s.setText(this.f62840e);
        this.f62854s.setTextSize(0, this.f62842g);
        this.f62854s.setTextColor(this.f62841f);
        m92137b();
    }

    public LKUIStandardNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LKUIStandardNavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62836a = R.drawable.lkui_navigation_back;
        this.f62843h = RightStyle.ICON;
        inflate(getContext(), R.layout.lkui_navigation_standard, this);
        this.f62847l = (LinearLayout) findViewById(R.id.leftContainer);
        this.f62848m = (ImageView) findViewById(R.id.leftImage1);
        this.f62849n = (ImageView) findViewById(R.id.leftImage2);
        this.f62853r = (TextView) findViewById(R.id.title);
        this.f62850o = (LinearLayout) findViewById(R.id.rightContainer);
        this.f62851p = (ImageView) findViewById(R.id.rightImage1);
        this.f62852q = (ImageView) findViewById(R.id.rightImage2);
        this.f62854s = (TextView) findViewById(R.id.rightText);
        m92136a(attributeSet);
    }
}
