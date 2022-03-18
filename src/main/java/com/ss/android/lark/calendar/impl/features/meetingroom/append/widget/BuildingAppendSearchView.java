package com.ss.android.lark.calendar.impl.features.meetingroom.append.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.ViewInfos;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.BuildingPageAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.p1436a.C30075i;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\"\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/BuildingAppendSearchView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/LayoutBuildingPageViewBinding;", "getBinding", "()Lcom/ss/android/lark/calendar/impl/databinding/LayoutBuildingPageViewBinding;", "mBuildingPageViews", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/BuildingPageView;", "initViewPager", "", "refreshResourceData", "validResourceData", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "allResourceData", "setAdapterActionListener", "meetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "baseActionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BuildingAppendSearchView extends FrameLayout {

    /* renamed from: a */
    private final C30075i f81909a;

    /* renamed from: b */
    private final SparseArray<BuildingPageView> f81910b;

    /* renamed from: c */
    private HashMap f81911c;

    public BuildingAppendSearchView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BuildingAppendSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo116973a(int i) {
        if (this.f81911c == null) {
            this.f81911c = new HashMap();
        }
        View view = (View) this.f81911c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f81911c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C30075i getBinding() {
        return this.f81909a;
    }

    /* renamed from: a */
    private final void m121897a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        BuildingPageView buildingPageView = new BuildingPageView(context, null, 0, 6, null);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        BuildingPageView buildingPageView2 = new BuildingPageView(context2, null, 0, 6, null);
        this.f81910b.put(0, buildingPageView);
        this.f81910b.put(1, buildingPageView2);
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Calendar_Edit_AvaliableRooms);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…ndar_Edit_AvaliableRooms)");
        arrayList.add(new ViewInfos(buildingPageView, string));
        String string2 = UIHelper.getString(R.string.Calendar_Edit_AllRooms);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(string.Calendar_Edit_AllRooms)");
        arrayList.add(new ViewInfos(buildingPageView2, string2));
        ViewPager viewPager = (ViewPager) mo116973a(R.id.buildingViewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "buildingViewPager");
        viewPager.setAdapter(new BuildingPageAdapter(arrayList));
        UDTabLayout uDTabLayout = this.f81909a.f74983b;
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "binding.tabLayout");
        ViewPager viewPager2 = this.f81909a.f74982a;
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "binding.buildingViewPager");
        new UDTabLayoutCoordinator(uDTabLayout, viewPager2).attach();
    }

    /* renamed from: a */
    public final void mo116974a(MeetingRoomViewHolder.IActionListener bVar, ResourceDisplayAdapter.IBaseActionListener aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "meetingRoomAction");
        int size = this.f81910b.size();
        for (int i = 0; i < size; i++) {
            BuildingPageView.m121901a(this.f81910b.valueAt(i), null, bVar, aVar, null, 8, null);
        }
    }

    /* renamed from: a */
    public final void mo116975a(List<? extends BaseModel> list, List<? extends BaseModel> list2) {
        Intrinsics.checkParameterIsNotNull(list, "validResourceData");
        Intrinsics.checkParameterIsNotNull(list2, "allResourceData");
        this.f81910b.get(0).mo116978a(list);
        this.f81910b.get(1).mo116978a(list2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuildingAppendSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        C30075i a = C30075i.m111288a(LayoutInflater.from(context), this, true);
        Intrinsics.checkExpressionValueIsNotNull(a, "LayoutBuildingPageViewBi…rom(context), this, true)");
        this.f81909a = a;
        this.f81910b = new SparseArray<>(2);
        m121897a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuildingAppendSearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
