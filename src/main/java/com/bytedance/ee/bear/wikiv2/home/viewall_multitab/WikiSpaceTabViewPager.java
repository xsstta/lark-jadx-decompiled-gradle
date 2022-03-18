package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.list.homepage.tab.HomeViewPager;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewPager;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "init", "", "fm", "Landroidx/fragment/app/FragmentManager;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/SpaceTab;", "Companion", "TabAdapter", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSpaceTabViewPager extends LinearLayout {

    /* renamed from: a */
    public static final Companion f33078a = new Companion(null);

    /* renamed from: b */
    private HashMap f33079b;

    /* renamed from: a */
    public View mo46980a(int i) {
        if (this.f33079b == null) {
            this.f33079b = new HashMap();
        }
        View view = (View) this.f33079b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33079b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewPager$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceTabViewPager$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/WikiSpaceTabViewPager$TabAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "spaceTabs", "", "Lcom/bytedance/ee/bear/wikiv2/home/viewall_multitab/SpaceTab;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getSpaceTabs", "()Ljava/util/List;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getPageTitle", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceTabViewPager$b */
    public static final class TabAdapter extends AbstractC1045n {

        /* renamed from: a */
        private final List<SpaceTab> f33080a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f33080a.size();
        }

        @Override // androidx.fragment.app.AbstractC1045n
        /* renamed from: a */
        public Fragment mo5615a(int i) {
            return this.f33080a.get(i).mo46985b();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return C13615c.f35773a.getString(this.f33080a.get(i).mo46984a());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TabAdapter(FragmentManager fragmentManager, List<SpaceTab> list) {
            super(fragmentManager);
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(list, "spaceTabs");
            this.f33080a = list;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiSpaceTabViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.wiki_space_tab_viewpager, this);
    }

    /* renamed from: a */
    public final void mo46981a(FragmentManager fragmentManager, List<SpaceTab> list) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!C13657b.m55421a(list)) {
            ((TabLayout) mo46980a(R.id.tab_layout)).setupWithViewPager((HomeViewPager) mo46980a(R.id.tab_pager));
            TabAdapter bVar = new TabAdapter(fragmentManager, list);
            HomeViewPager homeViewPager = (HomeViewPager) mo46980a(R.id.tab_pager);
            Intrinsics.checkExpressionValueIsNotNull(homeViewPager, "tab_pager");
            homeViewPager.setAdapter(bVar);
            HomeViewPager homeViewPager2 = (HomeViewPager) mo46980a(R.id.tab_pager);
            Intrinsics.checkExpressionValueIsNotNull(homeViewPager2, "tab_pager");
            homeViewPager2.setOffscreenPageLimit(list.size());
        }
    }
}
