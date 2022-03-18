package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.ViewInfos;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/BuildingPageAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "buildingContentViewInfos", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/ViewInfos;", "(Ljava/util/List;)V", "viewInfos", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "any", "", "getCount", "getPageTitle", "", "instantiateItem", "Landroid/view/View;", "isViewFromObject", "", "view", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.b */
public final class BuildingPageAdapter extends PagerAdapter {

    /* renamed from: a */
    private final List<ViewInfos> f81035a;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f81035a.size();
    }

    public BuildingPageAdapter(List<ViewInfos> list) {
        Intrinsics.checkParameterIsNotNull(list, "buildingContentViewInfos");
        this.f81035a = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.f81035a.get(i).mo110524b();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(obj, "any");
        return Intrinsics.areEqual(view, obj);
    }

    /* renamed from: a */
    public View instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        View a = this.f81035a.get(i).mo110523a();
        viewGroup.addView(a);
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(obj, "any");
        viewGroup.removeView((View) obj);
    }
}
