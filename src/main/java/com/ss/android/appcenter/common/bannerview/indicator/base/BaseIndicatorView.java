package com.ss.android.appcenter.common.bannerview.indicator.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b/*\u0001\u0015\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\u000bJ\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\bJ\u0006\u0010$\u001a\u00020\u000bJ\b\u0010%\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\bH\u0016J \u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\bH\u0016J\u0010\u0010,\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\bH\u0016J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0010\u0010.\u001a\u00020\u001f2\b\b\u0001\u0010/\u001a\u00020\bJ\u000e\u00100\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\bJ\u000e\u00103\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bJ\u0010\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u000fH\u0016J\u000e\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\bJ\u0010\u00108\u001a\u00020\u001f2\b\b\u0001\u0010/\u001a\u00020\bJ\u000e\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020\u000bJ\u000e\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\bJ\u000e\u0010=\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\bJ\u000e\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020\u000bJ\u001a\u0010A\u001a\u00020\u00002\b\b\u0001\u0010/\u001a\u00020\b2\b\b\u0001\u0010B\u001a\u00020\bJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u000bJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u000bJ\u000e\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u000bJ\u0016\u0010G\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000bJ\b\u0010J\u001a\u00020\u001fH\u0002J\u000e\u0010K\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u0018J\u000e\u0010K\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020\u001aR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/appcenter/common/bannerview/indicator/base/BaseIndicatorView;", "Landroid/view/View;", "Lcom/ss/android/appcenter/common/bannerview/indicator/base/IIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checkedSliderWidth", "", "getCheckedSliderWidth", "()F", "mIndicatorOptions", "Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "getMIndicatorOptions", "()Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;", "setMIndicatorOptions", "(Lcom/ss/android/appcenter/common/bannerview/indicator/option/IndicatorOptions;)V", "mOnPageChangeCallback", "com/ss/android/appcenter/common/bannerview/indicator/base/BaseIndicatorView$mOnPageChangeCallback$1", "Lcom/ss/android/appcenter/common/bannerview/indicator/base/BaseIndicatorView$mOnPageChangeCallback$1;", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "mViewPager2", "Landroidx/viewpager2/widget/ViewPager2;", "getCheckedColor", "getCheckedSlideWidth", "getCurrentPosition", "getIndicatorGap", "", "indicatorGap", "getNormalSlideWidth", "getPageSize", "getSlideMode", "getSlideProgress", "notifyDataChanged", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "positionOffsetPixels", "onPageSelected", "scrollSlider", "setCheckedColor", "normalColor", "setCheckedSlideWidth", "setCurrentPosition", "currentPosition", "setIndicatorGap", "setIndicatorOptions", "options", "setIndicatorStyle", "indicatorStyle", "setNormalColor", "setNormalSlideWidth", "normalSliderWidth", "setPageSize", "pageSize", "setSlideMode", "slideMode", "setSlideProgress", "slideProgress", "setSliderColor", "selectedColor", "setSliderGap", "sliderGap", "setSliderHeight", "sliderHeight", "setSliderWidth", "sliderWidth", "selectedSliderWidth", "setupViewPager", "setupWithViewPager", "viewPager", "viewPager2", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public class BaseIndicatorView extends View implements IIndicator {

    /* renamed from: a */
    private IndicatorOptions f70524a = new IndicatorOptions();

    /* renamed from: b */
    private ViewPager f70525b;

    /* renamed from: c */
    private ViewPager2 f70526c;

    /* renamed from: d */
    private final C28140a f70527d = new C28140a(this);

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    public final IndicatorOptions getMIndicatorOptions() {
        return this.f70524a;
    }

    public final int getCheckedColor() {
        return this.f70524a.mo100241f();
    }

    public final float getCheckedSlideWidth() {
        return this.f70524a.mo100248j();
    }

    public final float getCheckedSliderWidth() {
        return this.f70524a.mo100248j();
    }

    public final int getCurrentPosition() {
        return this.f70524a.mo100249k();
    }

    public final float getNormalSlideWidth() {
        return this.f70524a.mo100247i();
    }

    public final int getPageSize() {
        return this.f70524a.mo100235d();
    }

    public final int getSlideMode() {
        return this.f70524a.mo100232c();
    }

    public final float getSlideProgress() {
        return this.f70524a.mo100250l();
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.base.IIndicator
    /* renamed from: a */
    public void mo100200a() {
        m103044b();
        requestLayout();
        invalidate();
    }

    /* renamed from: b */
    private final void m103044b() {
        ViewPager viewPager = this.f70525b;
        if (viewPager != null) {
            if (viewPager != null) {
                viewPager.removeOnPageChangeListener(this);
            }
            ViewPager viewPager2 = this.f70525b;
            if (viewPager2 != null) {
                viewPager2.addOnPageChangeListener(this);
            }
            ViewPager viewPager3 = this.f70525b;
            if (!(viewPager3 == null || viewPager3.getAdapter() == null)) {
                ViewPager viewPager4 = this.f70525b;
                if (viewPager4 == null) {
                    Intrinsics.throwNpe();
                }
                PagerAdapter adapter = viewPager4.getAdapter();
                if (adapter == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(adapter, "mViewPager!!.adapter!!");
                mo100251a(adapter.getCount());
            }
        }
        ViewPager2 viewPager22 = this.f70526c;
        if (viewPager22 != null) {
            if (viewPager22 != null) {
                viewPager22.unregisterOnPageChangeCallback(this.f70527d);
            }
            ViewPager2 viewPager23 = this.f70526c;
            if (viewPager23 != null) {
                viewPager23.registerOnPageChangeCallback(this.f70527d);
            }
            ViewPager2 viewPager24 = this.f70526c;
            if (viewPager24 != null && viewPager24.getAdapter() != null) {
                ViewPager2 viewPager25 = this.f70526c;
                if (viewPager25 == null) {
                    Intrinsics.throwNpe();
                }
                RecyclerView.Adapter adapter2 = viewPager25.getAdapter();
                if (adapter2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(adapter2, "mViewPager2!!.adapter!!");
                mo100251a(adapter2.getItemCount());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/appcenter/common/bannerview/indicator/base/BaseIndicatorView$mOnPageChangeCallback$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.common.bannerview.indicator.base.BaseIndicatorView$a */
    public static final class C28140a extends ViewPager2.AbstractC1603e {

        /* renamed from: a */
        final /* synthetic */ BaseIndicatorView f70528a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C28140a(BaseIndicatorView baseIndicatorView) {
            this.f70528a = baseIndicatorView;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageScrollStateChanged(int i) {
            this.f70528a.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageSelected(int i) {
            this.f70528a.onPageSelected(i);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageScrolled(int i, float f, int i2) {
            this.f70528a.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: a */
    public final BaseIndicatorView mo100251a(int i) {
        this.f70524a.mo100237d(i);
        return this;
    }

    public final void setCheckedColor(int i) {
        this.f70524a.mo100242f(i);
    }

    public final void setCheckedSlideWidth(float f) {
        this.f70524a.mo100236d(f);
    }

    public final void setCurrentPosition(int i) {
        this.f70524a.mo100244g(i);
    }

    public final void setIndicatorGap(float f) {
        this.f70524a.mo100225a(f);
    }

    @Override // com.ss.android.appcenter.common.bannerview.indicator.base.IIndicator
    public void setIndicatorOptions(IndicatorOptions bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "options");
        this.f70524a = bVar;
    }

    public final void setMIndicatorOptions(IndicatorOptions bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f70524a = bVar;
    }

    public final void setNormalColor(int i) {
        this.f70524a.mo100240e(i);
    }

    public final void setNormalSlideWidth(float f) {
        this.f70524a.mo100233c(f);
    }

    public final void setSlideProgress(float f) {
        this.f70524a.mo100239e(f);
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
        this.f70525b = viewPager;
        mo100200a();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (getSlideMode() == 0) {
            setCurrentPosition(i);
            setSlideProgress(BitmapDescriptorFactory.HUE_RED);
            invalidate();
        }
    }

    public final void setupWithViewPager(ViewPager2 viewPager2) {
        Intrinsics.checkParameterIsNotNull(viewPager2, "viewPager2");
        this.f70526c = viewPager2;
        mo100200a();
    }

    /* renamed from: a */
    private final void m103043a(int i, float f) {
        if (this.f70524a.mo100232c() == 4 || this.f70524a.mo100232c() == 5) {
            setCurrentPosition(i);
            setSlideProgress(f);
        } else if (i % getPageSize() != getPageSize() - 1) {
            setCurrentPosition(i);
            setSlideProgress(f);
        } else if (((double) f) < 0.5d) {
            setCurrentPosition(i);
            setSlideProgress(BitmapDescriptorFactory.HUE_RED);
        } else {
            setCurrentPosition(0);
            setSlideProgress(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (getSlideMode() != 0 && getPageSize() > 1) {
            m103043a(i, f);
            invalidate();
        }
    }
}
