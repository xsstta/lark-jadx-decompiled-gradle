package com.bytedance.ee.bear.templates.center;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.bytedance.ee.bear.templates.center.list.business.BusinessTemplateListFragment;
import com.bytedance.ee.bear.templates.center.list.custom.CustomTemplateListFragment;
import com.bytedance.ee.bear.templates.center.list.system.SystemTemplateListFragment;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TabAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "tabList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "map", "", "Landroidx/fragment/app/Fragment;", "getCount", "", "getItem", "position", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.a */
public final class TabAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private final Map<Tab2, Fragment> f30800a;

    /* renamed from: b */
    private final FragmentActivity f30801b;

    /* renamed from: c */
    private final FragmentManager f30802c;

    /* renamed from: d */
    private final ArrayList<Tab2> f30803d;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f30803d.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Tab2 tab2 = this.f30803d.get(i);
        Intrinsics.checkExpressionValueIsNotNull(tab2, "tabList[position]");
        Fragment fragment = this.f30800a.get(tab2);
        if (fragment != null) {
            return fragment;
        }
        return (Fragment) MapsKt.getValue(this.f30800a, Tab2.SYSTEM);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabAdapter(FragmentActivity fragmentActivity, FragmentManager fragmentManager, ArrayList<Tab2> arrayList) {
        super(fragmentManager);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(arrayList, "tabList");
        this.f30801b = fragmentActivity;
        this.f30802c = fragmentManager;
        this.f30803d = arrayList;
        this.f30800a = MapsKt.mapOf(TuplesKt.to(Tab2.SYSTEM, SystemTemplateListFragment.f30974a.mo44218a(fragmentActivity)), TuplesKt.to(Tab2.CUSTOM, CustomTemplateListFragment.f30952a.mo44213a(fragmentActivity)), TuplesKt.to(Tab2.BUSNISS, BusinessTemplateListFragment.f30935a.mo44209a(fragmentActivity)));
    }
}
