package com.ss.android.lark.mm.module.detail.search;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/search/MmDetailSearchViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchListener;", "Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchDependency;", "Lcom/ss/android/lark/mm/module/detail/search/IMmDetailSearchInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "location", "", "mViewToolbar", "Landroid/view/View;", "searchContainer", "searchFragment", "Lcom/ss/android/lark/mm/module/detail/search/MmSearchFragment;", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "getSearchBarPositionY", "", "isSearching", "", "()Ljava/lang/Boolean;", "onSearchKeyword", "", "keyword", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.search.e */
public final class MmDetailSearchViewControl extends MmBaseViewControl<IMmDetailSearchListener, IMmDetailSearchDependency> implements IMmDetailSearchInquirer, IMmDetailSearchListener {

    /* renamed from: a */
    public final View f116241a;

    /* renamed from: b */
    public MmSearchFragment f116242b;

    /* renamed from: c */
    private final int[] f116243c = new int[2];

    /* renamed from: d */
    private final View f116244d;

    /* renamed from: e */
    private final IMmViewControlContext f116245e;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: f */
    public IMmDetailSearchListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchInquirer
    /* renamed from: a */
    public int mo162036a() {
        this.f116241a.getLocationOnScreen(this.f116243c);
        return this.f116243c[1];
    }

    @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchInquirer
    /* renamed from: b */
    public Boolean mo162037b() {
        MmSearchFragment hVar = this.f116242b;
        if (hVar != null) {
            return Boolean.valueOf(hVar.mo162054d());
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "fragment", "Landroidx/fragment/app/Fragment;", "invoke", "com/ss/android/lark/mm/module/detail/search/MmDetailSearchViewControl$onSearchKeyword$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.search.e$a */
    static final class C46124a extends Lambda implements Function1<Fragment, Unit> {
        final /* synthetic */ FragmentManager $it;
        final /* synthetic */ String $keyword$inlined;
        final /* synthetic */ MmDetailSearchViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46124a(FragmentManager fragmentManager, MmDetailSearchViewControl eVar, String str) {
            super(1);
            this.$it = fragmentManager;
            this.this$0 = eVar;
            this.$keyword$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Fragment fragment) {
            invoke(fragment);
            return Unit.INSTANCE;
        }

        public final void invoke(Fragment fragment) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            this.$it.beginTransaction().remove(fragment).commitAllowingStateLoss();
            this.this$0.f116242b = null;
            this.this$0.f116241a.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.search.IMmDetailSearchListener
    /* renamed from: a */
    public void mo162038a(String str) {
        FragmentManager supportFragmentManager;
        int i;
        if (str != null) {
            C47083e.m186423a(this.f116245e.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("key_words").mo165421c());
            C47083e.m186423a(this.f116245e.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("key_words").mo165423e("none").mo165421c());
        }
        Context n = this.f116245e.mo161232n();
        if (!(n instanceof FragmentActivity)) {
            n = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) n;
        if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
            if (this.f116242b == null) {
                if (this.f116244d.getVisibility() == 8) {
                    i = 0;
                } else {
                    i = this.f116244d.getHeight() - this.f116244d.getPaddingBottom();
                }
                this.f116241a.setVisibility(0);
                this.f116241a.setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f116241a.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                MmSearchFragment hVar = new MmSearchFragment(i, str, (IMmDetailSearchDependency) mo161247w(), new C46124a(supportFragmentManager, this, str));
                this.f116242b = hVar;
                if (hVar != null) {
                    supportFragmentManager.beginTransaction().replace(R.id.searchContainer, hVar).commitAllowingStateLoss();
                }
            }
            ((IMmDetailSearchDependency) mo161247w()).mo162032b();
            MmSearchFragment hVar2 = this.f116242b;
            if (hVar2 != null) {
                hVar2.mo162052a(str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailSearchViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmDetailSearchListener, IMmDetailSearchDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f116245e = gVar;
        View findViewById = gVar.mo161233o().findViewById(R.id.detail_video_toolbar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vcContext.getRootView().….id.detail_video_toolbar)");
        this.f116244d = findViewById;
        View findViewById2 = gVar.mo161233o().findViewById(R.id.searchContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "vcContext.getRootView().…yId(R.id.searchContainer)");
        this.f116241a = findViewById2;
    }
}
