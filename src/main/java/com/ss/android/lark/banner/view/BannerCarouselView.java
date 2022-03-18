package com.ss.android.lark.banner.view;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006J\u0014\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerCarouselView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "carouselListener", "Lcom/ss/android/lark/banner/view/CarouselBannerListener;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "initViews", "", "setCarouselListener", "listener", "updateData", "dataList", "", "Lcom/ss/android/lark/banner/view/CarouselItem;", "Companion", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.view.b */
public final class BannerCarouselView extends FrameLayout {

    /* renamed from: a */
    public static final Companion f73729a = new Companion(null);

    /* renamed from: b */
    private ViewPager f73730b;

    /* renamed from: c */
    private CarouselBannerListener f73731c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/banner/view/BannerCarouselView$Companion;", "", "()V", "TAG", "", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m108660a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        AutoHeightViewPager aVar = new AutoHeightViewPager(context);
        this.f73730b = aVar;
        addView(aVar, new FrameLayout.LayoutParams(-1, -2));
    }

    public final void setCarouselListener(CarouselBannerListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        this.f73731c = dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerCarouselView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m108660a();
    }

    /* renamed from: a */
    public final void mo104530a(List<CarouselItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        ViewPager viewPager = this.f73730b;
        if (viewPager == null) {
            return;
        }
        if (list.size() > 1) {
            new CarouselUnlimitedPagerAdapter(list, this.f73731c).mo104584a(viewPager);
        } else {
            viewPager.setAdapter(new CarouselPagerAdapter(list, this.f73731c));
        }
    }
}
