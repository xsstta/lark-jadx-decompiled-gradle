package com.ss.android.lark.banner.view;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.banner.export.AbstractC29484e;
import com.ss.android.lark.banner.view.BannerNormalView;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012H\u0002J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u000eJ\b\u0010\u001e\u001a\u00020\u0012H\u0016J\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/banner/view/CarouselPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "dataList", "", "Lcom/ss/android/lark/banner/view/CarouselItem;", "carouselListener", "Lcom/ss/android/lark/banner/view/CarouselBannerListener;", "(Ljava/util/List;Lcom/ss/android/lark/banner/view/CarouselBannerListener;)V", "getDataList", "()Ljava/util/List;", "viewList", "Landroid/util/SparseArray;", "Landroid/view/View;", "applyToViewPager", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "calculateMaxHeight", "", "context", "Landroid/content/Context;", "expectWidth", "createView", "position", "destroyItem", "container", "Landroid/view/ViewGroup;", "object", "", "enableClose", "getCount", "getHeight", "view", "instantiateItem", "isViewFromObject", "", "prepareViews", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.banner.view.f */
public class CarouselPagerAdapter extends PagerAdapter {

    /* renamed from: a */
    public final CarouselBannerListener f73781a;

    /* renamed from: b */
    private final SparseArray<View> f73782b = new SparseArray<>();

    /* renamed from: c */
    private final List<CarouselItem> f73783c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<CarouselItem> mo104585b() {
        return this.f73783c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return mo104585b().size();
    }

    /* renamed from: a */
    public final void mo104583a() {
        int size = this.f73782b.size();
        for (int i = 0; i < size; i++) {
            SparseArray<View> sparseArray = this.f73782b;
            View view = sparseArray.get(sparseArray.keyAt(i));
            if (view instanceof BannerNormalView) {
                ((BannerNormalView) view).setCloseIconShow(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/banner/view/CarouselPagerAdapter$createView$1$1", "Lcom/ss/android/lark/banner/export/BannerViewCallback;", "onClose", "", "view", "Landroid/view/View;", "onOpen", "link", "", "onShow", "core_banner_banner_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.banner.view.f$a */
    public static final class C29513a implements AbstractC29484e {

        /* renamed from: a */
        final /* synthetic */ CarouselPagerAdapter f73784a;

        /* renamed from: b */
        final /* synthetic */ int f73785b;

        @Override // com.ss.android.lark.banner.export.AbstractC29484e
        /* renamed from: a */
        public void mo104367a(View view) {
        }

        @Override // com.ss.android.lark.banner.export.AbstractC29484e
        /* renamed from: b */
        public void mo104371b(View view) {
            CarouselBannerListener dVar = this.f73784a.f73781a;
            if (dVar != null) {
                dVar.mo104340a();
            }
        }

        C29513a(CarouselPagerAdapter fVar, int i) {
            this.f73784a = fVar;
            this.f73785b = i;
        }

        @Override // com.ss.android.lark.banner.export.AbstractC29484e
        /* renamed from: a */
        public void mo104368a(View view, String str) {
            CarouselBannerListener dVar = this.f73784a.f73781a;
            if (dVar != null) {
                dVar.mo104341a(view, str);
            }
        }
    }

    /* renamed from: a */
    private final void m108700a(Context context) {
        int size = mo104585b().size();
        for (int i = 0; i < size; i++) {
            this.f73782b.put(i, m108701b(context, i));
        }
    }

    /* renamed from: a */
    public void mo104584a(ViewPager viewPager) {
        Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
        Context context = viewPager.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "viewPager.context");
        m108700a(context);
        viewPager.setAdapter(this);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(obj, "object");
        return Intrinsics.areEqual(view, obj);
    }

    public CarouselPagerAdapter(List<CarouselItem> list, CarouselBannerListener dVar) {
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        this.f73783c = list;
        this.f73781a = dVar;
    }

    /* renamed from: a */
    private final int m108699a(View view, int i) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
        View b = m108701b(context, i);
        viewGroup.addView(b, b.getLayoutParams());
        return b;
    }

    /* renamed from: a */
    public final int mo104582a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int size = this.f73782b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f73782b.get(i3);
            int a = m108699a(view, i);
            if (view instanceof BannerNormalView) {
                ((BannerNormalView) view).mo104483a();
                a = m108699a(view, i);
            }
            if (a > i2) {
                i2 = a;
            }
        }
        if (i2 < UIUtils.getScreenHeight(context) / 2) {
            return i2;
        }
        Log.m165383e("BannerCarouselView", "calculate maxHeight happen some error");
        return 0;
    }

    /* renamed from: b */
    private final View m108701b(Context context, int i) {
        boolean z = true;
        if (i > mo104585b().size() - 1) {
            return new View(context);
        }
        View view = this.f73782b.get(i);
        if (view != null) {
            return view;
        }
        BannerNormalView.C29507b bVar = new BannerNormalView.C29507b();
        if (mo104585b().size() != 1) {
            z = false;
        }
        CarouselItem eVar = mo104585b().get(i);
        bVar.mo104517d(eVar.mo104567a());
        bVar.mo104518e(eVar.mo104568b());
        bVar.mo104519f(eVar.mo104569c());
        bVar.mo104520g(eVar.mo104570d());
        bVar.mo104521h(eVar.mo104571e());
        bVar.mo104522i(eVar.mo104573f());
        bVar.mo104523j(eVar.mo104574g());
        bVar.mo104515b(eVar.mo104575h());
        bVar.mo104512a(eVar.mo104577i());
        bVar.mo104516c(eVar.mo104579k());
        bVar.mo104526m(eVar.mo104578j());
        bVar.mo104525l(eVar.mo104580l());
        bVar.mo104513a(z);
        bVar.mo104511a(new C29513a(this, i));
        BannerNormalView a = bVar.mo104514a(context, 0);
        this.f73782b.put(i, a);
        Intrinsics.checkExpressionValueIsNotNull(a, "BannerNormalView.Builder…t(position, it)\n        }");
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(obj, "object");
        if (!(obj instanceof View)) {
            obj = null;
        }
        viewGroup.removeView((View) obj);
    }
}
