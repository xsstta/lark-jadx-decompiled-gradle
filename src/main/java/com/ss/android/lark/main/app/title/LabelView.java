package com.ss.android.lark.main.app.title;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.main.app.title.LabelView;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.utils.UIHelper;

public class LabelView extends LinearLayout {

    /* renamed from: a */
    String f112613a;

    /* renamed from: b */
    ValueAnimator f112614b;

    /* renamed from: c */
    ValueAnimator f112615c;

    /* renamed from: d */
    public TextView f112616d;

    /* renamed from: e */
    public ImageView f112617e;

    /* renamed from: f */
    private TextView f112618f;

    /* renamed from: g */
    private String f112619g;

    /* renamed from: h */
    private LabelMode f112620h;

    /* renamed from: i */
    private IconStatus f112621i;

    /* renamed from: j */
    private IconStatus f112622j;

    /* renamed from: k */
    private ITitleInfo.C44543b f112623k;

    public enum IconStatus {
        Close,
        Open,
        Hide
    }

    public enum LabelMode {
        Large,
        Small
    }

    public enum LabelStatus {
        Normal,
        Loading,
        Error
    }

    public View getLabelTextView() {
        return this.f112616d;
    }

    /* renamed from: c */
    private void m176148c() {
        ValueAnimator valueAnimator = this.f112614b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f112614b.end();
        }
    }

    /* renamed from: a */
    private void m176141a() {
        m176145b();
        String string = UIUtils.getString(getContext(), R.string.Lark_Legacy_LoadingWait);
        this.f112613a = string.substring(0, string.length() - 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.main.app.title.LabelView$3 */
    public static /* synthetic */ class C443933 {

        /* renamed from: a */
        static final /* synthetic */ int[] f112629a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.main.app.title.LabelView$LabelStatus[] r0 = com.ss.android.lark.main.app.title.LabelView.LabelStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.main.app.title.LabelView.C443933.f112629a = r0
                com.ss.android.lark.main.app.title.LabelView$LabelStatus r1 = com.ss.android.lark.main.app.title.LabelView.LabelStatus.Normal     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.main.app.title.LabelView.C443933.f112629a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.main.app.title.LabelView$LabelStatus r1 = com.ss.android.lark.main.app.title.LabelView.LabelStatus.Error     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.main.app.title.LabelView.C443933.f112629a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.main.app.title.LabelView$LabelStatus r1 = com.ss.android.lark.main.app.title.LabelView.LabelStatus.Loading     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.app.title.LabelView.C443933.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m176145b() {
        setGravity(16);
        setOrientation(0);
        this.f112616d = new TextView(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.f112616d.setTextSize(24.0f);
        this.f112616d.setTextColor(getContext().getResources().getColor(R.color.text_title));
        this.f112616d.setTypeface(Typeface.defaultFromStyle(1));
        this.f112616d.setGravity(16);
        this.f112616d.setMaxLines(1);
        addView(this.f112616d, layoutParams);
        FrameLayout frameLayout = new FrameLayout(getContext());
        addView(frameLayout, new LinearLayout.LayoutParams(-2, -2));
        this.f112618f = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = UIHelper.dp2px(5.5f);
        layoutParams2.gravity = 19;
        layoutParams2.rightMargin = UIHelper.dp2px(4.0f) + UIHelper.dp2px(8.0f);
        this.f112618f.setTextSize(14.0f);
        this.f112618f.setPadding(UIHelper.dp2px(6.0f), UIHelper.dp2px(2.0f), UIHelper.dp2px(6.0f), UIHelper.dp2px(2.0f));
        this.f112618f.setTextColor(getContext().getResources().getColor(R.color.lkui_B500));
        this.f112618f.setGravity(16);
        this.f112618f.setBackgroundResource(R.drawable.main_bg_title_menu_selected_item);
        this.f112618f.setEllipsize(TextUtils.TruncateAt.END);
        this.f112618f.setMaxLines(1);
        frameLayout.addView(this.f112618f, layoutParams2);
        this.f112617e = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(UIHelper.dp2px(8.0f), UIHelper.dp2px(8.0f));
        layoutParams3.gravity = 21;
        layoutParams3.leftMargin = UIHelper.dp2px(4.0f);
        frameLayout.addView(this.f112617e, layoutParams3);
        this.f112617e.setImageResource(R.drawable.main_title_arrow);
        this.f112617e.setVisibility(8);
    }

    /* renamed from: a */
    public void mo157662a(IconStatus iconStatus) {
        this.f112621i = iconStatus;
    }

    public void setLabelName(String str) {
        this.f112619g = str;
    }

    public LabelView(Context context) {
        super(context);
        m176141a();
    }

    /* renamed from: a */
    public void mo157664a(ITitleInfo.C44543b bVar) {
        this.f112623k = bVar;
    }

    public void setTintedArrowView(int i) {
        Drawable drawable = UIHelper.getDrawable(R.drawable.main_title_arrow);
        drawable.setTint(i);
        this.f112617e.setImageDrawable(drawable);
    }

    /* renamed from: b */
    private void m176147b(ITitleInfo.C44543b bVar) {
        if (bVar == null) {
            this.f112618f.setVisibility(8);
        } else {
            this.f112618f.setVisibility(0);
            this.f112618f.setText(bVar.mo158046a());
        }
        this.f112623k = bVar;
    }

    /* renamed from: c */
    private void m176149c(IconStatus iconStatus) {
        if (this.f112622j != iconStatus) {
            this.f112622j = iconStatus;
            if (iconStatus == IconStatus.Hide) {
                this.f112617e.setVisibility(8);
                return;
            }
            this.f112617e.setVisibility(0);
            m176146b(iconStatus);
        }
    }

    /* renamed from: a */
    private void m176142a(final String str) {
        final String[] strArr = {"", ".", "..", "..."};
        this.f112616d.setText(str);
        if (this.f112614b == null) {
            ValueAnimator duration = ValueAnimator.ofInt(0, 4).setDuration(900L);
            this.f112614b = duration;
            duration.setRepeatCount(-1);
            this.f112614b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.ss.android.lark.main.app.title.LabelView.C443922 */

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    UICallbackExecutor.execute(new Runnable(str, strArr, ((Integer) valueAnimator.getAnimatedValue()).intValue()) {
                        /* class com.ss.android.lark.main.app.title.$$Lambda$LabelView$2$xHysnICQHRlpatK4ayv5l8RkgYY */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ String[] f$2;
                        public final /* synthetic */ int f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            LabelView.C443922.lambda$xHysnICQHRlpatK4ayv5l8RkgYY(LabelView.C443922.this, this.f$1, this.f$2, this.f$3);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m176153a(String str, String[] strArr, int i) {
                    TextView textView = LabelView.this.f112616d;
                    textView.setText(str + strArr[i % strArr.length]);
                }
            });
        }
        if (!this.f112614b.isRunning()) {
            this.f112614b.start();
        }
    }

    /* renamed from: b */
    private void m176146b(final IconStatus iconStatus) {
        if (iconStatus != IconStatus.Open || this.f112617e.getRotation() != 180.0f) {
            if (iconStatus != IconStatus.Close || this.f112617e.getRotation() != BitmapDescriptorFactory.HUE_RED) {
                ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(100L);
                this.f112615c = duration;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.lark.main.app.title.LabelView.C443911 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (iconStatus == IconStatus.Open) {
                            LabelView.this.f112617e.setRotation(animatedFraction * 180.0f);
                        } else if (iconStatus == IconStatus.Close) {
                            LabelView.this.f112617e.setRotation((1.0f - animatedFraction) * 180.0f);
                        }
                    }
                });
                this.f112615c.start();
            }
        }
    }

    public void setTextSizeMode(LabelMode labelMode) {
        int i;
        boolean z;
        int i2;
        if (labelMode != this.f112620h) {
            if (labelMode == LabelMode.Large) {
                i = 24;
            } else {
                i = 18;
            }
            TextView textView = this.f112616d;
            if (labelMode == LabelMode.Large) {
                z = true;
            } else {
                z = false;
            }
            textView.setIncludeFontPadding(z);
            this.f112616d.setTextSize((float) i);
            if (labelMode == LabelMode.Large) {
                i2 = 14;
            } else {
                i2 = 10;
            }
            this.f112618f.setTextSize((float) i2);
            if (labelMode == LabelMode.Small) {
                Paint.FontMetrics fontMetrics = this.f112616d.getPaint().getFontMetrics();
                if (fontMetrics.descent - fontMetrics.ascent > ((float) UIUtils.dp2px(getContext(), 18.0f))) {
                    this.f112616d.setTextSize(14.0f);
                }
            }
            this.f112620h = labelMode;
        }
    }

    public LabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m176141a();
    }

    /* renamed from: a */
    private void m176143a(String str, float f) {
        this.f112616d.setText(m176144b(str, f));
    }

    /* renamed from: b */
    private String m176144b(String str, float f) {
        if (str == null) {
            return str;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return str;
        }
        if (this.f112621i != IconStatus.Hide) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f112617e.getLayoutParams();
            f2 = BitmapDescriptorFactory.HUE_RED + ((float) (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + this.f112617e.getWidth()));
        }
        ITitleInfo.C44543b bVar = this.f112623k;
        if (!(bVar == null || bVar.mo158046a() == null)) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f112618f.getLayoutParams();
            f2 = f2 + ((float) marginLayoutParams2.leftMargin) + ((float) marginLayoutParams2.rightMargin) + this.f112618f.getPaint().measureText(this.f112623k.mo158046a());
        }
        float f3 = f - f2;
        float measureText = this.f112616d.getPaint().measureText(str);
        int i = 1;
        String str2 = str;
        while (measureText > f3 && str.length() > i) {
            str2 = str.substring(0, str.length() - i) + "...";
            measureText = this.f112616d.getPaint().measureText(str2);
            i++;
        }
        return str2;
    }

    /* renamed from: a */
    public void mo157663a(LabelStatus labelStatus, float f) {
        int i = C443933.f112629a[labelStatus.ordinal()];
        if (i == 1) {
            m176148c();
            m176143a(this.f112619g, f);
            m176147b(this.f112623k);
            m176149c(this.f112621i);
        } else if (i == 2) {
            m176148c();
            this.f112616d.setText(R.string.Lark_Legacy_ChatTableHeaderNotConnected);
            m176147b(this.f112623k);
            m176149c(this.f112621i);
        } else if (i == 3) {
            m176149c(IconStatus.Hide);
            this.f112618f.setVisibility(8);
            m176142a(this.f112613a);
        }
        setTextSizeMode(this.f112620h);
    }

    public LabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m176141a();
    }
}
