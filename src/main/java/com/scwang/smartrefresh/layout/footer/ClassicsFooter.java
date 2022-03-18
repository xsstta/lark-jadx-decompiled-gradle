package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.internal.C27161a;
import com.scwang.smartrefresh.layout.internal.pathview.C27166b;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public class ClassicsFooter extends RelativeLayout implements AbstractC27125d {

    /* renamed from: a */
    public static String f67470a = "上拉加载更多";

    /* renamed from: b */
    public static String f67471b = "释放立即加载";

    /* renamed from: c */
    public static String f67472c = "正在加载...";

    /* renamed from: d */
    public static String f67473d = "正在刷新...";

    /* renamed from: e */
    public static String f67474e = "加载完成";

    /* renamed from: f */
    public static String f67475f = "加载失败";

    /* renamed from: g */
    public static String f67476g = "全部加载完成";

    /* renamed from: h */
    protected TextView f67477h;

    /* renamed from: i */
    protected ImageView f67478i;

    /* renamed from: j */
    protected ImageView f67479j;

    /* renamed from: k */
    protected C27166b f67480k;

    /* renamed from: l */
    protected C27161a f67481l;

    /* renamed from: m */
    protected SpinnerStyle f67482m = SpinnerStyle.Translate;

    /* renamed from: n */
    protected AbstractC27128g f67483n;

    /* renamed from: o */
    protected int f67484o = ParticipantRepo.f117150c;

    /* renamed from: p */
    protected int f67485p;

    /* renamed from: q */
    protected boolean f67486q;

    /* renamed from: r */
    protected int f67487r = 20;

    /* renamed from: s */
    protected int f67488s = 20;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30298a(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public void mo30336a(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public boolean mo30301a() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: b */
    public void mo30339b(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: b */
    public void mo30304b(AbstractC27129h hVar, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public View getView() {
        return this;
    }

    public ImageView getArrowView() {
        return this.f67478i;
    }

    public ImageView getProgressView() {
        return this.f67479j;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public SpinnerStyle getSpinnerStyle() {
        return this.f67482m;
    }

    public TextView getTitleText() {
        return this.f67477h;
    }

    /* renamed from: com.scwang.smartrefresh.layout.footer.ClassicsFooter$1 */
    static /* synthetic */ class C271471 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67489a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.scwang.smartrefresh.layout.constant.RefreshState[] r0 = com.scwang.smartrefresh.layout.constant.RefreshState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.scwang.smartrefresh.layout.footer.ClassicsFooter.C271471.f67489a = r0
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.None     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.C271471.f67489a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.PullToUpLoad     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.C271471.f67489a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Loading     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.C271471.f67489a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.LoadReleased     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.C271471.f67489a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.ReleaseToLoad     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.scwang.smartrefresh.layout.footer.ClassicsFooter.C271471.f67489a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.scwang.smartrefresh.layout.constant.RefreshState r1 = com.scwang.smartrefresh.layout.constant.RefreshState.Refreshing     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.footer.ClassicsFooter.C271471.<clinit>():void");
        }
    }

    /* renamed from: b */
    public ClassicsFooter mo96510b(int i) {
        this.f67485p = i;
        setBackgroundColor(i);
        AbstractC27128g gVar = this.f67483n;
        if (gVar != null) {
            gVar.mo96461b(this.f67485p);
        }
        return this;
    }

    public ClassicsFooter(Context context) {
        super(context);
        m98701a(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    public ClassicsFooter mo96509a(int i) {
        this.f67477h.setTextColor(i);
        C27161a aVar = this.f67481l;
        if (aVar != null) {
            aVar.mo96567a(i);
        }
        C27166b bVar = this.f67480k;
        if (bVar != null) {
            bVar.mo96583a(i);
        }
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    public void setPrimaryColors(int... iArr) {
        if (this.f67482m == SpinnerStyle.FixedBehind && iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable)) {
                mo96510b(iArr[0]);
            }
            if (iArr.length > 1) {
                mo96509a(iArr[1]);
                return;
            }
            int i = -1;
            if (iArr[0] == -1) {
                i = -10066330;
            }
            mo96509a(i);
        }
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public boolean mo30338a(boolean z) {
        if (this.f67486q == z) {
            return true;
        }
        this.f67486q = z;
        if (z) {
            this.f67477h.setText(f67476g);
            this.f67478i.setVisibility(8);
        } else {
            this.f67477h.setText(f67470a);
            this.f67478i.setVisibility(0);
        }
        C27161a aVar = this.f67481l;
        if (aVar != null) {
            aVar.stop();
        } else {
            this.f67479j.animate().rotation(BitmapDescriptorFactory.HUE_RED).setDuration(300);
        }
        this.f67479j.setVisibility(8);
        return true;
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m98701a(context, attributeSet, 0);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public int mo30297a(AbstractC27129h hVar, boolean z) {
        if (this.f67486q) {
            return 0;
        }
        C27161a aVar = this.f67481l;
        if (aVar != null) {
            aVar.stop();
        } else {
            this.f67479j.animate().rotation(BitmapDescriptorFactory.HUE_RED).setDuration(300);
        }
        this.f67479j.setVisibility(8);
        if (z) {
            this.f67477h.setText(f67474e);
        } else {
            this.f67477h.setText(f67475f);
        }
        return this.f67484o;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
        } else {
            setPadding(getPaddingLeft(), this.f67487r, getPaddingRight(), this.f67488s);
        }
        super.onMeasure(i, i2);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27127f
    /* renamed from: a */
    public void mo30299a(AbstractC27128g gVar, int i, int i2) {
        this.f67483n = gVar;
        gVar.mo96461b(this.f67485p);
    }

    public ClassicsFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m98701a(context, attributeSet, i);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27125d
    /* renamed from: a */
    public void mo30337a(AbstractC27129h hVar, int i, int i2) {
        if (!this.f67486q) {
            this.f67479j.setVisibility(0);
            C27161a aVar = this.f67481l;
            if (aVar != null) {
                aVar.start();
            } else {
                this.f67479j.animate().rotation(36000.0f).setDuration(100000);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.scwang.smartrefresh.layout.p1236c.AbstractC27141e
    /* renamed from: a */
    public void mo30300a(AbstractC27129h hVar, RefreshState refreshState, RefreshState refreshState2) {
        if (!this.f67486q) {
            switch (C271471.f67489a[refreshState2.ordinal()]) {
                case 1:
                    this.f67478i.setVisibility(0);
                    break;
                case 2:
                    break;
                case 3:
                case 4:
                    this.f67478i.setVisibility(8);
                    this.f67477h.setText(f67472c);
                    return;
                case 5:
                    this.f67477h.setText(f67471b);
                    this.f67478i.animate().rotation(BitmapDescriptorFactory.HUE_RED);
                    return;
                case 6:
                    this.f67477h.setText(f67473d);
                    this.f67479j.setVisibility(8);
                    this.f67478i.setVisibility(8);
                    return;
                default:
                    return;
            }
            this.f67477h.setText(f67470a);
            this.f67478i.animate().rotation(180.0f);
        }
    }

    /* renamed from: a */
    private void m98701a(Context context, AttributeSet attributeSet, int i) {
        C27144b bVar = new C27144b();
        TextView textView = new TextView(context);
        this.f67477h = textView;
        textView.setId(16908312);
        this.f67477h.setTextColor(-10066330);
        this.f67477h.setText(f67470a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(this.f67477h, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(bVar.mo96505c(20.0f), bVar.mo96505c(20.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, 16908312);
        ImageView imageView = new ImageView(context);
        this.f67478i = imageView;
        addView(imageView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((ViewGroup.LayoutParams) layoutParams2);
        layoutParams3.addRule(15);
        layoutParams3.addRule(0, 16908312);
        ImageView imageView2 = new ImageView(context);
        this.f67479j = imageView2;
        imageView2.animate().setInterpolator(new LinearInterpolator());
        addView(this.f67479j, layoutParams3);
        if (!isInEditMode()) {
            this.f67479j.setVisibility(8);
        } else {
            this.f67478i.setVisibility(8);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.srlAccentColor, R.attr.srlClassicsSpinnerStyle, R.attr.srlDrawableArrow, R.attr.srlDrawableArrowSize, R.attr.srlDrawableMarginRight, R.attr.srlDrawableProgress, R.attr.srlDrawableProgressSize, R.attr.srlDrawableSize, R.attr.srlFinishDuration, R.attr.srlPrimaryColor, R.attr.srlTextSizeTitle});
        layoutParams3.rightMargin = obtainStyledAttributes.getDimensionPixelSize(4, bVar.mo96505c(20.0f));
        layoutParams2.rightMargin = layoutParams3.rightMargin;
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(3, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(3, layoutParams2.height);
        layoutParams3.width = obtainStyledAttributes.getLayoutDimension(6, layoutParams3.width);
        layoutParams3.height = obtainStyledAttributes.getLayoutDimension(6, layoutParams3.height);
        layoutParams2.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams2.width);
        layoutParams2.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams2.height);
        layoutParams3.width = obtainStyledAttributes.getLayoutDimension(7, layoutParams3.width);
        layoutParams3.height = obtainStyledAttributes.getLayoutDimension(7, layoutParams3.height);
        this.f67484o = obtainStyledAttributes.getInt(8, this.f67484o);
        this.f67482m = SpinnerStyle.values()[obtainStyledAttributes.getInt(1, this.f67482m.ordinal())];
        if (obtainStyledAttributes.hasValue(2)) {
            this.f67478i.setImageDrawable(obtainStyledAttributes.getDrawable(2));
        } else {
            C27166b bVar2 = new C27166b();
            this.f67480k = bVar2;
            bVar2.mo96583a(-10066330);
            this.f67480k.mo96584a("M20,12l-1.41,-1.41L13,16.17V4h-2v12.17l-5.58,-5.59L4,12l8,8 8,-8z");
            this.f67478i.setImageDrawable(this.f67480k);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.f67479j.setImageDrawable(obtainStyledAttributes.getDrawable(5));
        } else {
            C27161a aVar = new C27161a();
            this.f67481l = aVar;
            aVar.mo96567a(-10066330);
            this.f67479j.setImageDrawable(this.f67481l);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            this.f67477h.setTextSize(0, (float) obtainStyledAttributes.getDimensionPixelSize(10, C27144b.m98678a(16.0f)));
        } else {
            this.f67477h.setTextSize(16.0f);
        }
        if (obtainStyledAttributes.hasValue(9)) {
            mo96510b(obtainStyledAttributes.getColor(9, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            mo96509a(obtainStyledAttributes.getColor(0, 0));
        }
        obtainStyledAttributes.recycle();
        if (getPaddingTop() == 0) {
            if (getPaddingBottom() == 0) {
                int paddingLeft = getPaddingLeft();
                int c = bVar.mo96505c(20.0f);
                this.f67487r = c;
                int paddingRight = getPaddingRight();
                int c2 = bVar.mo96505c(20.0f);
                this.f67488s = c2;
                setPadding(paddingLeft, c, paddingRight, c2);
                return;
            }
            int paddingLeft2 = getPaddingLeft();
            int c3 = bVar.mo96505c(20.0f);
            this.f67487r = c3;
            int paddingRight2 = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            this.f67488s = paddingBottom;
            setPadding(paddingLeft2, c3, paddingRight2, paddingBottom);
        } else if (getPaddingBottom() == 0) {
            int paddingLeft3 = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f67487r = paddingTop;
            int paddingRight3 = getPaddingRight();
            int c4 = bVar.mo96505c(20.0f);
            this.f67488s = c4;
            setPadding(paddingLeft3, paddingTop, paddingRight3, c4);
        } else {
            this.f67487r = getPaddingTop();
            this.f67488s = getPaddingBottom();
        }
    }
}
