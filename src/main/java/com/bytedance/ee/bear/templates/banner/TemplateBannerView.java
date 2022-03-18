package com.bytedance.ee.bear.templates.banner;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.bizwidget.banner.banner.Banner;
import com.bytedance.ee.bear.bizwidget.banner.indicator.RectangleIndicator;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.templates.banner.TemplateBannerContract;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0006\u0010 \u001a\u00020\u001eJ\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0014H\u0016J \u0010&\u001a\u00020\u001e2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020)0(j\b\u0012\u0004\u0012\u00020)`*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerView;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView;", "activity", "Landroidx/fragment/app/FragmentActivity;", "root", "Landroid/view/View;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "banner", "Lcom/bytedance/ee/bear/bizwidget/banner/banner/Banner;", "Ljava/lang/Void;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerAdapter;", "getBanner", "()Lcom/bytedance/ee/bear/bizwidget/banner/banner/Banner;", "setBanner", "(Lcom/bytedance/ee/bear/bizwidget/banner/banner/Banner;)V", "hasInit", "", "getHasInit", "()Z", "setHasInit", "(Z)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getRoot", "()Landroid/view/View;", "create", "", "destroy", "initLifecycleListener", "setViewDelegate", "viewDelegate", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerContract$IView$IViewDelegate;", "setVisiable", "visiable", "showBanner", "banners", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/banner/BannerData;", "Lkotlin/collections/ArrayList;", "showLoading", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.banner.g */
public final class TemplateBannerView implements TemplateBannerContract.IView {

    /* renamed from: a */
    private Banner<Void, TemplateBannerAdapter> f30778a;

    /* renamed from: b */
    private boolean f30779b;

    /* renamed from: c */
    private final FragmentActivity f30780c;

    /* renamed from: d */
    private final View f30781d;

    /* renamed from: e */
    private final LifecycleOwner f30782e;

    /* renamed from: a */
    public void setViewDelegate(TemplateBannerContract.IView.IViewDelegate aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public final Banner<Void, TemplateBannerAdapter> mo43983a() {
        return this.f30778a;
    }

    /* renamed from: b */
    public final void mo43985b() {
        if (!this.f30779b) {
            this.f30779b = true;
            AbstractC1142af a = aj.m5366a(this.f30780c).mo6005a(TemplateCenterViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(ac…terViewModel::class.java)");
            TemplateCenterViewModel hVar = (TemplateCenterViewModel) a;
            hVar.getSystemFilterLiveData().mo5923a(this.f30782e, new C11447a(this));
            hVar.getCategoryIndex().mo5923a(this.f30782e, new C11448b(this, hVar));
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        Banner<Void, TemplateBannerAdapter> banner = (Banner) this.f30781d.findViewById(R.id.banner);
        banner.mo19051a(this.f30782e);
        banner.mo19054a(new RectangleIndicator(this.f30780c));
        banner.mo19050a(5000L);
        this.f30778a = banner;
    }

    @Override // com.bytedance.ee.bear.templates.banner.TemplateBannerContract.IView
    /* renamed from: a */
    public void mo43976a(boolean z) {
        int i;
        Banner<Void, TemplateBannerAdapter> banner = this.f30778a;
        if (banner != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            banner.setVisibility(i);
        }
    }

    @Override // com.bytedance.ee.bear.templates.banner.TemplateBannerContract.IView
    /* renamed from: a */
    public void mo43975a(ArrayList<BannerData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "banners");
        mo43976a(true);
        Banner<Void, TemplateBannerAdapter> banner = this.f30778a;
        if (banner != null) {
            banner.mo19052a(new TemplateBannerAdapter(arrayList));
        }
        mo43985b();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.g$b */
    public static final class C11448b<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ TemplateBannerView f30784a;

        /* renamed from: b */
        final /* synthetic */ TemplateCenterViewModel f30785b;

        C11448b(TemplateBannerView gVar, TemplateCenterViewModel hVar) {
            this.f30784a = gVar;
            this.f30785b = hVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            Banner<Void, TemplateBannerAdapter> a;
            int i;
            if (this.f30785b.getCurrentTab().mo5927b() == Tab2.SYSTEM && (a = this.f30784a.mo43983a()) != null) {
                if (num != null && num.intValue() == 0) {
                    i = 0;
                } else {
                    i = 8;
                }
                a.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.g$a */
    public static final class C11447a<T> implements AbstractC1178x<C8275a> {

        /* renamed from: a */
        final /* synthetic */ TemplateBannerView f30783a;

        C11447a(TemplateBannerView gVar) {
            this.f30783a = gVar;
        }

        /* renamed from: a */
        public final void onChanged(C8275a aVar) {
            List<Integer> obj_type_list;
            Banner<Void, TemplateBannerAdapter> a = this.f30783a.mo43983a();
            List<BannerData> list = null;
            TemplateBannerAdapter adapter = a != null ? a.getAdapter() : null;
            if (Intrinsics.areEqual(aVar, C8275a.f22369b)) {
                Banner<Void, TemplateBannerAdapter> a2 = this.f30783a.mo43983a();
                if (a2 != null) {
                    a2.setVisibility(0);
                }
                if (adapter != null) {
                    adapter.mo19044a(adapter.mo43970d());
                }
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (adapter != null) {
                list = adapter.mo43970d();
            }
            if (list != null) {
                List<BannerData> d = adapter.mo43970d();
                if (d == null) {
                    Intrinsics.throwNpe();
                }
                ArrayList arrayList = new ArrayList();
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    BannerData bannerData = d.get(i);
                    if (!(bannerData == null || (obj_type_list = bannerData.getObj_type_list()) == null)) {
                        Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
                        if (obj_type_list.contains(Integer.valueOf(aVar.mo32555b()))) {
                            arrayList.add(bannerData);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Banner<Void, TemplateBannerAdapter> a3 = this.f30783a.mo43983a();
                    if (a3 != null) {
                        a3.setVisibility(0);
                    }
                    adapter.mo19044a(arrayList);
                    adapter.notifyDataSetChanged();
                    return;
                }
            }
            Banner<Void, TemplateBannerAdapter> a4 = this.f30783a.mo43983a();
            if (a4 != null) {
                a4.setVisibility(8);
            }
        }
    }

    public TemplateBannerView(FragmentActivity fragmentActivity, View view, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "root");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        this.f30780c = fragmentActivity;
        this.f30781d = view;
        this.f30782e = lifecycleOwner;
    }
}
