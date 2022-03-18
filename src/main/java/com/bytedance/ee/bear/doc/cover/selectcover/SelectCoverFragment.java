package com.bytedance.ee.bear.doc.cover.selectcover;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.AbstractC1142af;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.doc.cover.CoverViewModel;
import com.bytedance.ee.bear.doc.cover.CurrentCoverData;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverData;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p708k.AbstractC13687a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge.C69631a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002%&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J&\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "mCoverViewModel", "Lcom/bytedance/ee/bear/doc/cover/CoverViewModel;", "mSubSelectCoverPanels", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/SubSelectCoverPanel;", "[Lcom/bytedance/ee/bear/doc/cover/selectcover/SubSelectCoverPanel;", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "closeSelectCoverPanel", "", "initDeleteView", "rootView", "Landroid/view/View;", "initPager", "initRandomView", "initView", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "TabFragmentAdapter", "TabNavigatorAdapter", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a */
public final class SelectCoverFragment extends C7667e {

    /* renamed from: a */
    public CoverViewModel f15390a;

    /* renamed from: b */
    public ViewPager f15391b;

    /* renamed from: c */
    public final SubSelectCoverPanel[] f15392c = {SubSelectCoverPanel.Official, SubSelectCoverPanel.Local};

    /* renamed from: d */
    private HashMap f15393d;

    /* renamed from: b */
    public void mo21538b() {
        HashMap hashMap = this.f15393d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo21538b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment$TabFragmentAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lcom/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$a */
    public final class TabFragmentAdapter extends FragmentPagerAdapter {

        /* renamed from: a */
        final /* synthetic */ SelectCoverFragment f15394a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f15394a.f15392c.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            Bundle bundle = new Bundle();
            C4943e.m20406a(this.f15394a, bundle);
            Context context = this.f15394a.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            Fragment instantiate = Fragment.instantiate(context, this.f15394a.f15392c[i].fragment, bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…sition].fragment, bundle)");
            return instantiate;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TabFragmentAdapter(SelectCoverFragment aVar, FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            this.f15394a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment$TabNavigatorAdapter;", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "(Lcom/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment;)V", "getCount", "", "getIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "index", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$b */
    public final class TabNavigatorAdapter extends AbstractC69621a {
        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return SelectCoverFragment.this.f15392c.length;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public TabNavigatorAdapter() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment$TabNavigatorAdapter$getTitleView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$b$a */
        public static final class C5389a extends AbstractView$OnClickListenerC11839e {

            /* renamed from: a */
            final /* synthetic */ TabNavigatorAdapter f15396a;

            /* renamed from: b */
            final /* synthetic */ int f15397b;

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "v");
                SelectCoverFragment.m21926a(SelectCoverFragment.this).setCurrentItem(this.f15397b);
            }

            C5389a(TabNavigatorAdapter bVar, int i) {
                this.f15396a = bVar;
                this.f15397b = i;
            }
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C69625a aVar = new C69625a(context);
            aVar.setMode(1);
            aVar.setColors(Integer.valueOf(context.getResources().getColor(R.color.primary_pri_500)));
            aVar.setLineHeight((float) context.getResources().getDimensionPixelSize(R.dimen.space_kit_len_2));
            aVar.setXOffset(-((float) C13749l.m55738a(4)));
            aVar.setStartInterpolator(new AccelerateInterpolator());
            aVar.setEndInterpolator(new DecelerateInterpolator(10.0f));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C69631a aVar = new C69631a(context);
            C69633c cVar = new C69633c(context);
            cVar.setNormalColor(context.getResources().getColor(R.color.text_caption));
            cVar.setSelectedColor(context.getResources().getColor(R.color.primary_pri_500));
            cVar.setText(SelectCoverFragment.this.f15392c[i].titleResId);
            cVar.setTextSize(14.0f);
            aVar.setInnerPagerTitleView(cVar);
            aVar.setPadding(C13749l.m55738a(5), 0, C13749l.m55738a(5), 0);
            aVar.setOnClickListener(new C5389a(this, i));
            return aVar;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo21537a();
        return true;
    }

    /* renamed from: a */
    public final void mo21537a() {
        CoverViewModel aVar = this.f15390a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        aVar.getSelectCoverActive().mo5929b((Boolean) false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment$initDeleteView$2", "Lcom/bytedance/ee/util/observer/DiffObserver;", "Lcom/bytedance/ee/bear/doc/cover/CurrentCoverData;", "onChange", "", "coverData", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$d */
    public static final class C5391d extends AbstractC13687a<CurrentCoverData> {

        /* renamed from: a */
        final /* synthetic */ View f15399a;

        C5391d(View view) {
            this.f15399a = view;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo18510a(CurrentCoverData currentCoverData) {
            int i;
            View view = this.f15399a;
            Intrinsics.checkExpressionValueIsNotNull(view, "deleteView");
            if (currentCoverData == null || !currentCoverData.isExistCover()) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment$initPager$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$e */
    public static final class C5392e implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ MagicIndicator f15400a;

        C5392e(MagicIndicator magicIndicator) {
            this.f15400a = magicIndicator;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f15400a.mo243175b(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.f15400a.mo243173a(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            this.f15400a.mo243174a(i, f, i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment$initRandomView$2", "Lcom/bytedance/ee/util/observer/DiffObserver;", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverSeries;", "onChange", "", "coverSeries", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$g */
    public static final class C5394g extends AbstractC13687a<List<? extends OfficialCoverData.CoverSeries>> {

        /* renamed from: a */
        final /* synthetic */ View f15402a;

        C5394g(View view) {
            this.f15402a = view;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ee.util.p708k.AbstractC13687a
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo18510a(List<? extends OfficialCoverData.CoverSeries> list) {
            mo21542a((List<OfficialCoverData.CoverSeries>) list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo21542a(List<OfficialCoverData.CoverSeries> list) {
            int i;
            View view = this.f15402a;
            Intrinsics.checkExpressionValueIsNotNull(view, "randomView");
            if (list == null || !(!list.isEmpty())) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$h */
    public static final class View$OnClickListenerC5395h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectCoverFragment f15403a;

        View$OnClickListenerC5395h(SelectCoverFragment aVar) {
            this.f15403a = aVar;
        }

        public final void onClick(View view) {
            this.f15403a.mo21537a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/doc/cover/selectcover/SelectCoverFragment$onCreateAnimation$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$i  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC5396i implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ SelectCoverFragment f15404a;

        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC5396i(SelectCoverFragment aVar) {
            this.f15404a = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            SelectCoverFragment.m21928b(this.f15404a).isEnterAnimationShowing().mo5929b((Boolean) false);
        }

        public void onAnimationStart(Animation animation) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            SelectCoverFragment.m21928b(this.f15404a).isEnterAnimationShowing().mo5929b((Boolean) true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$c */
    public static final class View$OnClickListenerC5390c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectCoverFragment f15398a;

        View$OnClickListenerC5390c(SelectCoverFragment aVar) {
            this.f15398a = aVar;
        }

        public final void onClick(View view) {
            SelectCoverFragment.m21928b(this.f15398a).deleteCover();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.a$f */
    public static final class View$OnClickListenerC5393f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectCoverFragment f15401a;

        View$OnClickListenerC5393f(SelectCoverFragment aVar) {
            this.f15401a = aVar;
        }

        public final void onClick(View view) {
            SelectCoverFragment.m21928b(this.f15401a).randomCover(2);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewPager m21926a(SelectCoverFragment aVar) {
        ViewPager viewPager = aVar.f15391b;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        return viewPager;
    }

    /* renamed from: b */
    public static final /* synthetic */ CoverViewModel m21928b(SelectCoverFragment aVar) {
        CoverViewModel aVar2 = aVar.f15390a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        return aVar2;
    }

    /* renamed from: a */
    private final void m21927a(View view) {
        view.findViewById(R.id.close_icon).setOnClickListener(new View$OnClickListenerC5395h(this));
        m21931d(view);
        m21930c(view);
        m21929b(view);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, CoverViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…verViewModel::class.java)");
        this.f15390a = (CoverViewModel) a;
    }

    /* renamed from: b */
    private final void m21929b(View view) {
        View findViewById = view.findViewById(R.id.delete_tv);
        findViewById.setOnClickListener(new View$OnClickListenerC5390c(this));
        CoverViewModel aVar = this.f15390a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        aVar.getCurrentCoverData().mo5923a(this, new C5391d(findViewById));
    }

    /* renamed from: c */
    private final void m21930c(View view) {
        View findViewById = view.findViewById(R.id.random_view);
        findViewById.setOnClickListener(new View$OnClickListenerC5393f(this));
        CoverViewModel aVar = this.f15390a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverViewModel");
        }
        aVar.getCoverSeriesList().mo5923a(this, new C5394g(findViewById));
    }

    /* renamed from: d */
    private final void m21931d(View view) {
        MagicIndicator magicIndicator = (MagicIndicator) view.findViewById(R.id.tab_indicator);
        C69619a aVar = new C69619a(getContext());
        aVar.setAdapter(new TabNavigatorAdapter());
        aVar.setAdjustMode(false);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "magicIndicator");
        magicIndicator.setNavigator(aVar);
        View findViewById = view.findViewById(R.id.viewpager);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.viewpager)");
        ViewPager viewPager = (ViewPager) findViewById;
        this.f15391b = viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        viewPager.setAdapter(new TabFragmentAdapter(this, childFragmentManager));
        ViewPager viewPager2 = this.f15391b;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
        }
        viewPager2.addOnPageChangeListener(new C5392e(magicIndicator));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m21927a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.doc_cover_selection_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.dialog_in_from_bottom);
            loadAnimation.setAnimationListener(new animationAnimation$AnimationListenerC5396i(this));
            Intrinsics.checkExpressionValueIsNotNull(loadAnimation, "enterAnim");
            return loadAnimation;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.dialog_out_to_bottom);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation2, "AnimationUtils.loadAnima…nim.dialog_out_to_bottom)");
        return loadAnimation2;
    }
}
