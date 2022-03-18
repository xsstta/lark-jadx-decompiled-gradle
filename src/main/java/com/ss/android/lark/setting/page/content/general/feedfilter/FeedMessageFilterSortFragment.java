package com.ss.android.lark.setting.page.content.general.feedfilter;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView;
import com.ss.android.lark.setting.page.content.general.feedfilter.dto.FeedFilter;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterSortFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "presenter", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterPresenter;", "rootView", "Landroid/view/View;", "viewDependency", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$ViewDependency;", "initMVP", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.i */
public final class FeedMessageFilterSortFragment extends BaseFragment {

    /* renamed from: b */
    public static final Companion f134798b = new Companion(null);

    /* renamed from: a */
    public View f134799a;

    /* renamed from: c */
    private FeedMessageFilterPresenter f134800c;

    /* renamed from: d */
    private final FeedMessageFilterView.ViewDependency f134801d = new C54524b(this);

    /* renamed from: e */
    private HashMap f134802e;

    /* renamed from: a */
    public void mo186336a() {
        HashMap hashMap = this.f134802e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo186336a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterSortFragment$Companion;", "", "()V", "KEY_HIGHLIGHTED_FILTER", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterSortFragment$viewDependency$1", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView$ViewDependency;", "finish", "", "getHighlightedFilter", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/dto/FeedFilter;", "injectView", "translateSettingView", "Lcom/ss/android/lark/setting/page/content/general/feedfilter/FeedMessageFilterView;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.general.feedfilter.i$b */
    public static final class C54524b extends FeedMessageFilterView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ FeedMessageFilterSortFragment f134803a;

        @Override // com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView.ViewDependency
        /* renamed from: a */
        public void mo186196a() {
            this.f134803a.finish();
        }

        @Override // com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView.ViewDependency
        /* renamed from: b */
        public FeedFilter mo186198b() {
            Intent intent;
            FeedFilter.Companion aVar = FeedFilter.Companion;
            FragmentActivity activity = this.f134803a.getActivity();
            int i = 0;
            if (!(activity == null || (intent = activity.getIntent()) == null)) {
                i = intent.getIntExtra("HIGHLIGHTED_FILTER", 0);
            }
            return aVar.mo186305b(i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54524b(FeedMessageFilterSortFragment iVar) {
            this.f134803a = iVar;
        }

        @Override // com.ss.android.lark.setting.page.content.general.feedfilter.FeedMessageFilterView.ViewDependency
        /* renamed from: a */
        public void mo186197a(FeedMessageFilterView feedMessageFilterView) {
            Intrinsics.checkParameterIsNotNull(feedMessageFilterView, "translateSettingView");
            ButterKnife.bind(feedMessageFilterView, FeedMessageFilterSortFragment.m211525a(this.f134803a));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FeedMessageFilterPresenter hVar = this.f134800c;
        if (hVar != null) {
            hVar.destroy();
        }
    }

    /* renamed from: b */
    private final void m211526b() {
        FeedMessageFilterPresenter hVar = new FeedMessageFilterPresenter(new FeedMessageFilterModel(), new FeedMessageFilterView(this.f134801d));
        this.f134800c = hVar;
        if (hVar != null) {
            hVar.create();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m211525a(FeedMessageFilterSortFragment iVar) {
        View view = iVar.f134799a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m211526b();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.feed_message_filter_layout, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…layout, container, false)");
        this.f134799a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }
}
