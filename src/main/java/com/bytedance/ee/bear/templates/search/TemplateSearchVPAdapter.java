package com.bytedance.ee.bear.templates.search;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.search.business.SearchBusinessFragment;
import com.bytedance.ee.bear.templates.search.custom.SearchCustomFragment;
import com.bytedance.ee.bear.templates.search.system.SearchSystemFragment;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\nX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/TemplateSearchVPAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "tabList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/center/Tab2;", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;)V", "map", "", "getCount", "", "getItem", "position", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.c */
public final class TemplateSearchVPAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private final Map<Tab2, Fragment> f31370a;

    /* renamed from: b */
    private final Fragment f31371b;

    /* renamed from: c */
    private final ArrayList<Tab2> f31372c;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f31372c.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Tab2 tab2 = this.f31372c.get(i);
        Intrinsics.checkExpressionValueIsNotNull(tab2, "tabList[position]");
        Fragment fragment = this.f31370a.get(tab2);
        if (fragment != null) {
            return fragment;
        }
        return (Fragment) MapsKt.getValue(this.f31370a, Tab2.SYSTEM);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateSearchVPAdapter(Fragment fragment, ArrayList<Tab2> arrayList) {
        super(fragment.getChildFragmentManager());
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(arrayList, "tabList");
        this.f31371b = fragment;
        this.f31372c = arrayList;
        Pair[] pairArr = new Pair[3];
        Tab2 tab2 = Tab2.SYSTEM;
        SearchSystemFragment.Companion aVar = SearchSystemFragment.f31380a;
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "fragment.activity!!");
        pairArr[0] = TuplesKt.to(tab2, aVar.mo44685a(activity));
        Tab2 tab22 = Tab2.CUSTOM;
        SearchCustomFragment.Companion aVar2 = SearchCustomFragment.f31378a;
        FragmentActivity activity2 = fragment.getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity2, "fragment.activity!!");
        pairArr[1] = TuplesKt.to(tab22, aVar2.mo44684a(activity2));
        Tab2 tab23 = Tab2.BUSNISS;
        SearchBusinessFragment.Companion aVar3 = SearchBusinessFragment.f31368a;
        FragmentActivity activity3 = fragment.getActivity();
        if (activity3 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity3, "fragment.activity!!");
        pairArr[2] = TuplesKt.to(tab23, aVar3.mo44680a(activity3));
        this.f31370a = MapsKt.mapOf(pairArr);
    }
}
