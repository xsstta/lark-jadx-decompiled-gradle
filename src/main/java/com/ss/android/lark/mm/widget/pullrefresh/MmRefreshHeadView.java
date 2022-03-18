package com.ss.android.lark.mm.widget.pullrefresh;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26394b;
import com.lcodecore.tkrefreshlayout.AbstractC26398c;
import com.lcodecore.tkrefreshlayout.header.progresslayout.MaterialProgressDrawable;
import com.ss.android.lark.mm.widget.BoldTextView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

public class MmRefreshHeadView extends FrameLayout implements AbstractC26394b {

    /* renamed from: a */
    private int f118877a;

    /* renamed from: b */
    private int f118878b;

    /* renamed from: c */
    private ImageView f118879c;

    /* renamed from: d */
    private BoldTextView f118880d;

    /* renamed from: e */
    private boolean f118881e;

    /* renamed from: f */
    private MaterialProgressDrawable f118882f;

    /* renamed from: g */
    private boolean f118883g;

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    public View getView() {
        return this;
    }

    /* renamed from: b */
    private void m186818b() {
        this.f118879c = new ImageView(getContext());
        MaterialProgressDrawable materialProgressDrawable = new MaterialProgressDrawable(getContext(), this);
        this.f118882f = materialProgressDrawable;
        this.f118879c.setImageDrawable(materialProgressDrawable);
        this.f118879c.setVisibility(8);
        this.f118879c.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(this.f118879c);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93668a() {
        this.f118879c.clearAnimation();
        this.f118882f.stop();
        this.f118879c.setVisibility(8);
        this.f118880d.setVisibility(8);
        this.f118882f.setAlpha(255);
        ViewCompat.m4081g(this.f118879c, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4083h(this.f118879c, (float) BitmapDescriptorFactory.HUE_RED);
        ViewCompat.m4064c((View) this.f118879c, 1.0f);
    }

    /* renamed from: c */
    private void m186819c() {
        BoldTextView boldTextView = new BoldTextView(getContext());
        this.f118880d = boldTextView;
        boldTextView.setTextColor(getResources().getColor(R.color.mm_blue));
        this.f118880d.setTextSize(0, (float) UIUtils.dp2px(getContext(), 14.0f));
        this.f118880d.setVisibility(8);
        this.f118880d.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(this.f118880d);
    }

    public void setFinishTipEnabled(boolean z) {
        this.f118881e = z;
    }

    public MmRefreshHeadView(Context context) {
        this(context, null);
    }

    public void setColorSchemeColors(int... iArr) {
        this.f118882f.mo93730a(iArr);
    }

    public void setFinishTipText(String str) {
        this.f118880d.setText(str);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f118879c.setBackgroundColor(i);
        this.f118882f.mo93733b(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getResources().getColor(i));
    }

    public void setColorSchemeResources(int... iArr) {
        Resources resources = getResources();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = resources.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                int i2 = (int) (displayMetrics.density * 56.0f);
                this.f118877a = i2;
                this.f118878b = i2;
            } else {
                int i3 = (int) (displayMetrics.density * 40.0f);
                this.f118877a = i3;
                this.f118878b = i3;
            }
            this.f118879c.setImageDrawable(null);
            this.f118882f.mo93729a(i);
            this.f118879c.setImageDrawable(this.f118882f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93671a(AbstractC26398c cVar) {
        if (this.f118881e) {
            this.f118879c.setVisibility(8);
            this.f118880d.setVisibility(0);
            Observable.timer(1, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
                /* class com.ss.android.lark.mm.widget.pullrefresh.$$Lambda$MmRefreshHeadView$73wJ_QL_alIC5trguKRS9Jt_BRc */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    Long l = (Long) obj;
                    AbstractC26398c.this.mo93557a();
                }
            });
            return;
        }
        cVar.mo93557a();
    }

    public MmRefreshHeadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93669a(float f, float f2) {
        this.f118879c.setVisibility(0);
        this.f118882f.setAlpha(255);
        ViewCompat.m4081g((View) this.f118879c, 1.0f);
        ViewCompat.m4083h((View) this.f118879c, 1.0f);
        this.f118882f.mo93726a(1.0f);
        this.f118882f.start();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: b */
    public void mo93672b(float f, float f2, float f3) {
        this.f118883g = false;
        if (f >= 1.0f) {
            ViewCompat.m4081g((View) this.f118879c, 1.0f);
            ViewCompat.m4083h((View) this.f118879c, 1.0f);
            return;
        }
        ViewCompat.m4081g(this.f118879c, f);
        ViewCompat.m4083h(this.f118879c, f);
    }

    public MmRefreshHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f118877a = (int) (displayMetrics.density * 40.0f);
        this.f118878b = (int) (displayMetrics.density * 40.0f);
        m186818b();
        m186819c();
        setColorSchemeColors(ContextCompat.getColor(context, R.color.primary_pri_500));
        ViewCompat.m4050a((ViewGroup) this, true);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26394b
    /* renamed from: a */
    public void mo93670a(float f, float f2, float f3) {
        this.f118880d.setVisibility(8);
        if (!this.f118883g) {
            this.f118883g = true;
            this.f118882f.setAlpha(76);
        }
        if (this.f118879c.getVisibility() != 0) {
            this.f118879c.setVisibility(0);
        }
        if (f >= 1.0f) {
            ViewCompat.m4081g((View) this.f118879c, 1.0f);
            ViewCompat.m4083h((View) this.f118879c, 1.0f);
        } else if (f != Float.NaN) {
            ViewCompat.m4081g(this.f118879c, f);
            ViewCompat.m4083h(this.f118879c, f);
        }
        if (f <= 1.0f) {
            this.f118882f.setAlpha((int) ((179.0f * f) + 76.0f));
        }
        float max = (((float) Math.max(((double) f) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        this.f118882f.mo93727a(BitmapDescriptorFactory.HUE_RED, Math.min(0.8f, max * 0.8f));
        this.f118882f.mo93726a(Math.min(1.0f, max));
        this.f118882f.mo93731b(((max * 0.4f) - 16.0f) * 0.5f);
    }
}
