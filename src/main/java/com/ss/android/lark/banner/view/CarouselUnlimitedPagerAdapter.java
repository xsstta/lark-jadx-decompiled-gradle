package com.ss.android.lark.banner.view;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038TX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter;", "Lcom/ss/android/lark/banner/view/CarouselPagerAdapter;", "dataList", "", "Lcom/ss/android/lark/banner/view/CarouselItem;", "carouselListener", "Lcom/ss/android/lark/banner/view/CarouselBannerListener;", "(Ljava/util/List;Lcom/ss/android/lark/banner/view/CarouselBannerListener;)V", "getDataList", "()Ljava/util/List;", "newDataList", "", "unlimitedAvailable", "", "applyToViewPager", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "PageChangeListener", "ViewPagerAutoPlay", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.view.g */
public final class CarouselUnlimitedPagerAdapter extends CarouselPagerAdapter {

    /* renamed from: b */
    private final boolean f73786b;

    /* renamed from: c */
    private List<CarouselItem> f73787c;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.banner.view.CarouselPagerAdapter
    /* renamed from: b */
    public List<CarouselItem> mo104585b() {
        return this.f73787c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter$ViewPagerAutoPlay;", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "interval", "", "(Landroidx/viewpager/widget/ViewPager;J)V", "handler", "Lcom/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter$ViewPagerAutoPlay$ChangePageHandler;", "sf", "Ljava/util/concurrent/ScheduledFuture;", "start", "", "stop", "ChangePageHandler", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.g$b */
    public static final class ViewPagerAutoPlay {

        /* renamed from: a */
        public ChangePageHandler f73792a;

        /* renamed from: b */
        private ScheduledFuture<?> f73793b;

        /* renamed from: c */
        private final long f73794c;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.banner.view.g$b$b */
        public static final class RunnableC29514b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewPagerAutoPlay f73796a;

            RunnableC29514b(ViewPagerAutoPlay bVar) {
                this.f73796a = bVar;
            }

            public final void run() {
                this.f73796a.f73792a.sendEmptyMessage(1);
            }
        }

        /* renamed from: b */
        public final void mo104587b() {
            ScheduledFuture<?> scheduledFuture = this.f73793b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }

        /* renamed from: a */
        public final void mo104586a() {
            ScheduledFuture<?> scheduledFuture = this.f73793b;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            long j = this.f73794c;
            this.f73793b = coreThreadPool.getScheduleThreadPool().scheduleAtFixedRate(new RunnableC29514b(this), j, j, TimeUnit.MILLISECONDS);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter$ViewPagerAutoPlay$ChangePageHandler;", "Landroid/os/Handler;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "(Landroidx/viewpager/widget/ViewPager;)V", "viewPagerRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.banner.view.g$b$a */
        public static final class ChangePageHandler extends Handler {

            /* renamed from: a */
            private final WeakReference<ViewPager> f73795a;

            public ChangePageHandler(ViewPager viewPager) {
                Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
                this.f73795a = new WeakReference<>(viewPager);
            }

            public void handleMessage(Message message) {
                Intrinsics.checkParameterIsNotNull(message, "msg");
                ViewPager viewPager = this.f73795a.get();
                if (viewPager != null) {
                    Intrinsics.checkExpressionValueIsNotNull(viewPager, "it");
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
                }
            }
        }

        public ViewPagerAutoPlay(ViewPager viewPager, long j) {
            Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
            this.f73794c = j;
            this.f73792a = new ChangePageHandler(viewPager);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0016J \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\fj\b\u0012\u0004\u0012\u00020\t`\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter$PageChangeListener;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/banner/view/CarouselItem;", "(Landroidx/viewpager/widget/ViewPager;Ljava/util/List;)V", "curPosition", "", "dataSize", "positionSet", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "onAllPageShown", "", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.g$a */
    public static class PageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        private int f73788a;

        /* renamed from: b */
        private final int f73789b;

        /* renamed from: c */
        private final HashSet<Integer> f73790c;

        /* renamed from: d */
        private final ViewPager f73791d;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* renamed from: a */
        private final void m108711a() {
            PagerAdapter adapter = this.f73791d.getAdapter();
            if (!(adapter instanceof CarouselPagerAdapter)) {
                adapter = null;
            }
            CarouselPagerAdapter fVar = (CarouselPagerAdapter) adapter;
            if (fVar != null) {
                fVar.mo104583a();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            int i2 = this.f73789b;
            int i3 = 1;
            if (i2 > 1) {
                int i4 = this.f73788a;
                if (i4 == 0) {
                    i3 = i2 - 2;
                } else if (i4 != i2 - 1) {
                    i3 = i4;
                }
                if (i3 >= 0 && i3 != i4) {
                    this.f73791d.setCurrentItem(i3, false);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.f73788a = i;
            this.f73790c.remove(Integer.valueOf(i));
            if (this.f73790c.size() == 0) {
                m108711a();
                this.f73790c.add(0);
            }
        }

        public PageChangeListener(ViewPager viewPager, List<CarouselItem> list) {
            Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f73791d = viewPager;
            int size = list.size();
            this.f73789b = size;
            HashSet<Integer> hashSet = new HashSet<>();
            int i = size - 1;
            for (int i2 = 1; i2 < i; i2++) {
                hashSet.add(Integer.valueOf(i2));
            }
            this.f73790c = hashSet;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter$applyToViewPager$2", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.g$d */
    public static final class View$OnAttachStateChangeListenerC29516d implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ ViewPagerAutoPlay f73801a;

        View$OnAttachStateChangeListenerC29516d(ViewPagerAutoPlay bVar) {
            this.f73801a = bVar;
        }

        public void onViewAttachedToWindow(View view) {
            this.f73801a.mo104586a();
        }

        public void onViewDetachedFromWindow(View view) {
            this.f73801a.mo104587b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"com/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter$applyToViewPager$1", "Lcom/ss/android/lark/banner/view/CarouselUnlimitedPagerAdapter$PageChangeListener;", "isDragging", "", "()Z", "setDragging", "(Z)V", "onPageScrollStateChanged", "", "state", "", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.g$c */
    public static final class C29515c extends PageChangeListener {

        /* renamed from: a */
        final /* synthetic */ CarouselUnlimitedPagerAdapter f73797a;

        /* renamed from: b */
        final /* synthetic */ ViewPagerAutoPlay f73798b;

        /* renamed from: c */
        final /* synthetic */ ViewPager f73799c;

        /* renamed from: d */
        private boolean f73800d;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, com.ss.android.lark.banner.view.CarouselUnlimitedPagerAdapter.PageChangeListener
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 1) {
                this.f73800d = true;
                this.f73798b.mo104587b();
            } else if (i == 0 && this.f73800d) {
                this.f73800d = false;
                this.f73798b.mo104586a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29515c(CarouselUnlimitedPagerAdapter gVar, ViewPagerAutoPlay bVar, ViewPager viewPager, ViewPager viewPager2, List list) {
            super(viewPager2, list);
            this.f73797a = gVar;
            this.f73798b = bVar;
            this.f73799c = viewPager;
        }
    }

    @Override // com.ss.android.lark.banner.view.CarouselPagerAdapter
    /* renamed from: a */
    public void mo104584a(ViewPager viewPager) {
        Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
        super.mo104584a(viewPager);
        if (this.f73786b) {
            ViewPagerAutoPlay bVar = new ViewPagerAutoPlay(viewPager, 5000);
            viewPager.addOnPageChangeListener(new C29515c(this, bVar, viewPager, viewPager, mo104585b()));
            viewPager.setOffscreenPageLimit(7);
            viewPager.setCurrentItem(1);
            viewPager.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC29516d(bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselUnlimitedPagerAdapter(List<CarouselItem> list, CarouselBannerListener dVar) {
        super(list, dVar);
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        this.f73786b = z;
        this.f73787c = new ArrayList(list);
        if (z) {
            this.f73787c.add(0, list.get(list.size() - 1));
            this.f73787c.add(list.get(0));
        }
    }
}
