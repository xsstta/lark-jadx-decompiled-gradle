package com.ss.android.lark.calendar.impl.features.meetingroom.append.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.ViewInfos;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.BuildingPageAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.BuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.p1436a.C30075i;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\"\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\"\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendBuildingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/LayoutBuildingPageViewBinding;", "getBinding", "()Lcom/ss/android/lark/calendar/impl/databinding/LayoutBuildingPageViewBinding;", "mBuildingPageViews", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/BuildingPageView;", "initSearchFilterViewPager", "", "initViewPager", "isShowChosenAttendee", "", "refreshResourceData", "validResourceData", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "allResourceData", "setAdapterActionListener", "buildingAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "meetingRoomAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "deleteResourceAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AppendBuildingView extends FrameLayout {

    /* renamed from: a */
    private final C30075i f81896a;

    /* renamed from: b */
    private final SparseArray<BuildingPageView> f81897b;

    public AppendBuildingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AppendBuildingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C30075i getBinding() {
        return this.f81896a;
    }

    /* renamed from: a */
    private final void m121885a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        BuildingPageView buildingPageView = new BuildingPageView(context, null, 0, 6, null);
        this.f81897b.put(1, buildingPageView);
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Calendar_Edit_AllRooms);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.Calendar_Edit_AllRooms)");
        arrayList.add(new ViewInfos(buildingPageView, string));
        ViewPager viewPager = this.f81896a.f74982a;
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "binding.buildingViewPager");
        viewPager.setAdapter(new BuildingPageAdapter(arrayList));
        UDTabLayout uDTabLayout = this.f81896a.f74983b;
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "binding.tabLayout");
        uDTabLayout.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo116961a(boolean z) {
        if (z) {
            m121885a();
            return;
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        BuildingPageView buildingPageView = new BuildingPageView(context, null, 0, 6, null);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        BuildingPageView buildingPageView2 = new BuildingPageView(context2, null, 0, 6, null);
        this.f81897b.put(0, buildingPageView);
        this.f81897b.put(1, buildingPageView2);
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Calendar_Edit_AvaliableRooms);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…ndar_Edit_AvaliableRooms)");
        arrayList.add(new ViewInfos(buildingPageView, string));
        String string2 = UIHelper.getString(R.string.Calendar_Edit_AllRooms);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(string.Calendar_Edit_AllRooms)");
        arrayList.add(new ViewInfos(buildingPageView2, string2));
        ViewPager viewPager = this.f81896a.f74982a;
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "binding.buildingViewPager");
        viewPager.setAdapter(new BuildingPageAdapter(arrayList));
        UDTabLayout uDTabLayout = this.f81896a.f74983b;
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout, "binding.tabLayout");
        uDTabLayout.setVisibility(0);
        UDTabLayout uDTabLayout2 = this.f81896a.f74983b;
        Intrinsics.checkExpressionValueIsNotNull(uDTabLayout2, "binding.tabLayout");
        ViewPager viewPager2 = this.f81896a.f74982a;
        Intrinsics.checkExpressionValueIsNotNull(viewPager2, "binding.buildingViewPager");
        new UDTabLayoutCoordinator(uDTabLayout2, viewPager2).attach();
    }

    /* renamed from: a */
    public final void mo116960a(List<? extends BaseModel> list, List<? extends BaseModel> list2) {
        Intrinsics.checkParameterIsNotNull(list, "validResourceData");
        Intrinsics.checkParameterIsNotNull(list2, "allResourceData");
        if (this.f81897b.size() == 1) {
            this.f81897b.get(1).mo116978a(list2);
            return;
        }
        this.f81897b.get(0).mo116978a(list);
        this.f81897b.get(1).mo116978a(list2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppendBuildingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        C30075i a = C30075i.m111288a(LayoutInflater.from(context), this, true);
        Intrinsics.checkExpressionValueIsNotNull(a, "LayoutBuildingPageViewBi…rom(context), this, true)");
        this.f81896a = a;
        this.f81897b = new SparseArray<>(2);
    }

    /* renamed from: a */
    public final void mo116959a(BuildingViewHolder.IActionListener bVar, MeetingRoomViewHolder.IActionListener bVar2, ChosenMeetingRoomViewHolder.IChosenResourceAction bVar3) {
        Intrinsics.checkParameterIsNotNull(bVar, "buildingAction");
        Intrinsics.checkParameterIsNotNull(bVar2, "meetingRoomAction");
        int size = this.f81897b.size();
        for (int i = 0; i < size; i++) {
            BuildingPageView.m121901a(this.f81897b.valueAt(i), bVar, bVar2, null, bVar3, 4, null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppendBuildingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
