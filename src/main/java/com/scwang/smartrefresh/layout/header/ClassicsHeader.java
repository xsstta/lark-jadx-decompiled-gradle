package com.scwang.smartrefresh.layout.header;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.C27161a;
import com.scwang.smartrefresh.layout.internal.pathview.C27166b;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ClassicsHeader extends RelativeLayout implements AbstractC27126e {

    /* renamed from: a */
    public static String f67512a = "下拉可以刷新";

    /* renamed from: b */
    public static String f67513b = "正在刷新...";

    /* renamed from: c */
    public static String f67514c = "正在加载...";

    /* renamed from: d */
    public static String f67515d = "释放立即刷新";

    /* renamed from: e */
    public static String f67516e = "刷新完成";

    /* renamed from: f */
    public static String f67517f = "刷新失败";

    /* renamed from: g */
    public static String f67518g = "上次更新 M-d HH:mm";

    /* renamed from: h */
    public static String f67519h = "释放进入二楼";

    /* renamed from: i */
    protected String f67520i = "LAST_UPDATE_TIME";

    /* renamed from: j */
    protected Date f67521j;

    /* renamed from: k */
    protected TextView f67522k;

    /* renamed from: l */
    protected TextView f67523l;

    /* renamed from: m */
    protected ImageView f67524m;

    /* renamed from: n */
    protected ImageView f67525n;

    /* renamed from: o */
    protected SharedPreferences f67526o;

    /* renamed from: p */
    protected AbstractC27128g f67527p;

    /* renamed from: q */
    protected C27166b f67528q;

    /* renamed from: r */
    protected C27161a f67529r;

    /* renamed from: s */
    protected SpinnerStyle f67530s = SpinnerStyle.Translate;

    /* renamed from: t */
    protected DateFormat f67531t = new SimpleDateFormat(f67518g, Locale.CHINA);

    /* renamed from: u */
    protected int f67532u = ParticipantRepo.f117150c;

    /* renamed from: v */
    protected int f67533v;

    /* renamed from: w */
    protected int f67534w = 20;

    /* renamed from: x */
    protected int f67535x = 20;

    /* renamed from: y */
    protected boolean f67536y = true;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void b_(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    public ImageView getArrowView() {
        return this.f67524m;
    }

    public TextView getLastUpdateText() {
        return this.f67523l;
    }

    public ImageView getProgressView() {
        return this.f67525n;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return this.f67530s;
    }

    public TextView getTitleText() {
        return this.f67522k;
    }

    /* renamed from: com.scwang.smartrefresh.layout.header.ClassicsHeader$1 */
    static /* synthetic */ class C271541 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67537a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.f67537a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.f67537a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullDownToRefresh     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.f67537a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.f67537a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.RefreshReleased     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.f67537a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToRefresh     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.f67537a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToTwoLevel     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.f67537a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.header.ClassicsHeader.C271541.<clinit>():void");
        }
    }

    /* renamed from: a */
    public ClassicsHeader mo96531a(int i) {
        this.f67533v = i;
        setBackgroundColor(i);
        AbstractC27128g gVar = this.f67527p;
        if (gVar != null) {
            gVar.mo96456a(this.f67533v);
        }
        return this;
    }

    public ClassicsHeader(Context context) {
        super(context);
        m98732a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public ClassicsHeader mo96532a(Date date) {
        this.f67521j = date;
        this.f67523l.setText(this.f67531t.format(date));
        if (this.f67526o != null && !isInEditMode()) {
            this.f67526o.edit().putLong(this.f67520i, date.getTime()).apply();
        }
        return this;
    }

    /* renamed from: b */
    public ClassicsHeader mo96533b(int i) {
        C27166b bVar = this.f67528q;
        if (bVar != null) {
            bVar.mo96583a(i);
        }
        C27161a aVar = this.f67529r;
        if (aVar != null) {
            aVar.mo96567a(i);
        }
        this.f67522k.setTextColor(i);
        this.f67523l.setTextColor((i & 16777215) | -872415232);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable)) {
                mo96531a(iArr[0]);
            }
            if (iArr.length > 1) {
                mo96533b(iArr[1]);
                return;
            }
            int i = -1;
            if (iArr[0] == -1) {
                i = -10066330;
            }
            mo96533b(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), this.f67534w, getPaddingRight(), this.f67535x);
        }
        super.onMeasure(i, i2);
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m98732a(context, attributeSet);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        C27161a aVar = this.f67529r;
        if (aVar != null) {
            aVar.stop();
        } else {
            Drawable drawable = this.f67525n.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            } else {
                this.f67525n.animate().rotation(BitmapDescriptorFactory.HUE_RED).setDuration(300);
            }
        }
        this.f67525n.setVisibility(8);
        if (z) {
            this.f67522k.setText(f67516e);
            if (this.f67521j != null) {
                mo96532a(new Date());
            }
        } else {
            this.f67522k.setText(f67517f);
        }
        return this.f67532u;
    }

    /* renamed from: a */
    private void m98732a(Context context, AttributeSet attributeSet) {
        FragmentManager supportFragmentManager;
        List<Fragment> fragments;
        C27144b bVar = new C27144b();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(16908312);
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f67522k = textView;
        textView.setText(f67512a);
        this.f67522k.setTextColor(-10066330);
        TextView textView2 = new TextView(context);
        this.f67523l = textView2;
        textView2.setTextColor(-8618884);
        linearLayout.addView(this.f67522k, new LinearLayout.LayoutParams(-2, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        linearLayout.addView(this.f67523l, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        addView(linearLayout, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(bVar.mo96505c(20.0f), bVar.mo96505c(20.0f));
        layoutParams3.addRule(15);
        layoutParams3.addRule(0, 16908312);
        ImageView imageView = new ImageView(context);
        this.f67524m = imageView;
        addView(imageView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((ViewGroup.LayoutParams) layoutParams3);
        layoutParams4.addRule(15);
        layoutParams4.addRule(0, 16908312);
        ImageView imageView2 = new ImageView(context);
        this.f67525n = imageView2;
        imageView2.animate().setInterpolator(new LinearInterpolator());
        addView(this.f67525n, layoutParams4);
        int i = 8;
        if (isInEditMode()) {
            this.f67524m.setVisibility(8);
            this.f67522k.setText(f67513b);
        } else {
            this.f67525n.setVisibility(8);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.srlAccentColor, R.attr.srlClassicsSpinnerStyle, R.attr.srlDrawableArrow, R.attr.srlDrawableArrowSize, R.attr.srlDrawableMarginRight, R.attr.srlDrawableProgress, R.attr.srlDrawableProgressSize, R.attr.srlDrawableSize, R.attr.srlEnableLastTime, R.attr.srlFinishDuration, R.attr.srlPrimaryColor, R.attr.srlTextSizeTime, R.attr.srlTextSizeTitle, R.attr.srlTextTimeMarginTop});
        layoutParams.topMargin = obtainStyledAttributes.getDimensionPixelSize(13, bVar.mo96505c(BitmapDescriptorFactory.HUE_RED));
        layoutParams4.rightMargin = obtainStyledAttributes.getDimensionPixelSize(4, bVar.mo96505c(20.0f));
        layoutParams3.rightMargin = layoutParams4.rightMargin;
        layoutParams3.width = obtainStyledAttributes.getLayoutDimension(3, layoutParams3.width);
        layoutParams3.height = obtainStyledAttributes.getLayoutDimension(3, layoutParams3.height);
        layoutParams4.width = obtainStyledAttributes.getLayoutDimension(6, layoutParams4.width);
        layoutParams4.height = obtainStyledAttributes.getLayoutDimension(6, layoutParams4.height);
        layoutParams3.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams3.width);
        layoutParams3.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams3.height);
        layoutParams4.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams4.width);
        layoutParams4.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams4.height);
        this.f67532u = obtainStyledAttributes.getInt(9, this.f67532u);
        this.f67536y = obtainStyledAttributes.getBoolean(8, this.f67536y);
        this.f67530s = SpinnerStyle.values()[obtainStyledAttributes.getInt(1, this.f67530s.ordinal())];
        TextView textView3 = this.f67523l;
        if (this.f67536y) {
            i = 0;
        }
        textView3.setVisibility(i);
        if (obtainStyledAttributes.hasValue(2)) {
            this.f67524m.setImageDrawable(obtainStyledAttributes.getDrawable(2));
        } else {
            C27166b bVar2 = new C27166b();
            this.f67528q = bVar2;
            bVar2.mo96583a(-10066330);
            this.f67528q.mo96584a("M20,12l-1.41,-1.41L13,16.17V4h-2v12.17l-5.58,-5.59L4,12l8,8 8,-8z");
            this.f67524m.setImageDrawable(this.f67528q);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.f67525n.setImageDrawable(obtainStyledAttributes.getDrawable(5));
        } else {
            C27161a aVar = new C27161a();
            this.f67529r = aVar;
            aVar.mo96567a(-10066330);
            this.f67525n.setImageDrawable(this.f67529r);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            this.f67522k.setTextSize(0, (float) obtainStyledAttributes.getDimensionPixelSize(12, C27144b.m98678a(16.0f)));
        } else {
            this.f67522k.setTextSize(16.0f);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f67523l.setTextSize(0, (float) obtainStyledAttributes.getDimensionPixelSize(11, C27144b.m98678a(12.0f)));
        } else {
            this.f67523l.setTextSize(12.0f);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            mo96531a(obtainStyledAttributes.getColor(10, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            mo96533b(obtainStyledAttributes.getColor(0, 0));
        }
        obtainStyledAttributes.recycle();
        if (getPaddingTop() == 0) {
            if (getPaddingBottom() == 0) {
                int paddingLeft = getPaddingLeft();
                int c = bVar.mo96505c(20.0f);
                this.f67534w = c;
                int paddingRight = getPaddingRight();
                int c2 = bVar.mo96505c(20.0f);
                this.f67535x = c2;
                setPadding(paddingLeft, c, paddingRight, c2);
            } else {
                int paddingLeft2 = getPaddingLeft();
                int c3 = bVar.mo96505c(20.0f);
                this.f67534w = c3;
                int paddingRight2 = getPaddingRight();
                int paddingBottom = getPaddingBottom();
                this.f67535x = paddingBottom;
                setPadding(paddingLeft2, c3, paddingRight2, paddingBottom);
            }
        } else if (getPaddingBottom() == 0) {
            int paddingLeft3 = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f67534w = paddingTop;
            int paddingRight3 = getPaddingRight();
            int c4 = bVar.mo96505c(20.0f);
            this.f67535x = c4;
            setPadding(paddingLeft3, paddingTop, paddingRight3, c4);
        } else {
            this.f67534w = getPaddingTop();
            this.f67535x = getPaddingBottom();
        }
        try {
            if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && (fragments = supportFragmentManager.getFragments()) != null && fragments.size() > 0) {
                mo96532a(new Date());
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f67520i += context.getClass().getName();
        this.f67526o = context.getSharedPreferences("ClassicsHeader", 0);
        mo96532a(new Date(this.f67526o.getLong(this.f67520i, System.currentTimeMillis())));
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        this.f67527p = gVar;
        gVar.mo96456a(this.f67533v);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27126e
    public void a_(AbstractC27129h hVar, int i, int i2) {
        C27161a aVar = this.f67529r;
        if (aVar != null) {
            aVar.start();
            return;
        }
        Drawable drawable = this.f67525n.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        } else {
            this.f67525n.animate().rotation(36000.0f).setDuration(100000);
        }
    }

    public ClassicsHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m98732a(context, attributeSet);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        int i;
        switch (C271541.f67537a[refreshState2.ordinal()]) {
            case 1:
                TextView textView = this.f67523l;
                if (this.f67536y) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.f67522k.setText(f67513b);
                this.f67525n.setVisibility(0);
                this.f67524m.setVisibility(8);
                return;
            case 5:
                this.f67522k.setText(f67515d);
                this.f67524m.animate().rotation(180.0f);
                return;
            case 6:
                this.f67522k.setText(f67519h);
                this.f67524m.animate().rotation(BitmapDescriptorFactory.HUE_RED);
                return;
            case 7:
                this.f67524m.setVisibility(8);
                this.f67525n.setVisibility(8);
                this.f67523l.setVisibility(8);
                this.f67522k.setText(f67514c);
                return;
            default:
                return;
        }
        this.f67522k.setText(f67512a);
        this.f67524m.setVisibility(0);
        this.f67525n.setVisibility(8);
        this.f67524m.animate().rotation(BitmapDescriptorFactory.HUE_RED);
    }
}
