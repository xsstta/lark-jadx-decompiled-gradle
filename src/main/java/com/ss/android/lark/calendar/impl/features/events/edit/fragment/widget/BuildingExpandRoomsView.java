package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.ViewInfos;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.CalendarSubscribeIndicator;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0015j\b\u0012\u0004\u0012\u00020\u0010`\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013J\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J@\u0010\u001c\u001a\u00020\u000e28\u0010\u001d\u001a4\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00150\u001ej\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f0\u0015j\b\u0012\u0004\u0012\u00020\u001f`\u0016` J$\u0010!\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/BuildingExpandRoomsView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mBuildingPageViews", "Landroid/util/SparseArray;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/BuildingPageView;", "selectPageIndex", "addBuildingLoadingStatus", "", "clickBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "clearAndLoadingExpandBuilding", "getBuildingPageView", "", "getCurrentPageExpandBuildings", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getExpandBuildings", "getPageIndex", "initAvailableAndAllView", "initOnlyAllRoomsView", "refreshCloseMeetingRooms", "refreshExpandMeetingRooms", "buildingRoomsMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "Lkotlin/collections/HashMap;", "setViewHolderListener", "onBuildingItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "onMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "onDeleteBtnClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BuildingExpandRoomsView extends FrameLayout {

    /* renamed from: b */
    public static final Companion f80916b = new Companion(null);

    /* renamed from: a */
    public int f80917a;

    /* renamed from: c */
    private final SparseArray<BuildingPageView> f80918c;

    /* renamed from: d */
    private HashMap f80919d;

    public BuildingExpandRoomsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BuildingExpandRoomsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo115914a(int i) {
        if (this.f80919d == null) {
            this.f80919d = new HashMap();
        }
        View view = (View) this.f80919d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80919d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/BuildingExpandRoomsView$Companion;", "", "()V", "DIVIDER_HEIGHT", "", "INDICATOR_HEIGHT", "INDICATOR_TITLE_TEXT_SIZE", "PAGE_ALL_BUILDING", "", "PAGE_AVAILABLE_BUILDING", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.BuildingExpandRoomsView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getPageIndex() {
        return this.f80917a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/BuildingExpandRoomsView$initAvailableAndAllView$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "index", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.BuildingExpandRoomsView$b */
    public static final class C31795b extends AbstractC69621a {

        /* renamed from: a */
        final /* synthetic */ BuildingExpandRoomsView f80920a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f80921b;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return this.f80921b.size();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.BuildingExpandRoomsView$b$a */
        static final class View$OnClickListenerC31796a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C31795b f80922a;

            /* renamed from: b */
            final /* synthetic */ int f80923b;

            View$OnClickListenerC31796a(C31795b bVar, int i) {
                this.f80922a = bVar;
                this.f80923b = i;
            }

            public final void onClick(View view) {
                ViewPager viewPager = (ViewPager) this.f80922a.f80920a.mo115914a(R.id.buildingViewPager);
                Intrinsics.checkExpressionValueIsNotNull(viewPager, "buildingViewPager");
                viewPager.setCurrentItem(this.f80923b);
            }
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            CalendarSubscribeIndicator aVar = new CalendarSubscribeIndicator(context);
            aVar.setColors(Integer.valueOf(C32634ae.m125178a(R.color.primary_pri_500)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIUtils.dp2px(context, 2.0f));
            aVar.setDividerHeight((float) UIUtils.dp2px(context, 1.0f));
            return aVar;
        }

        C31795b(BuildingExpandRoomsView buildingExpandRoomsView, ArrayList arrayList) {
            this.f80920a = buildingExpandRoomsView;
            this.f80921b = arrayList;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, int i) {
            C69627a aVar = new C69627a(context);
            aVar.setTextSize(14.0f);
            aVar.setNormalColor(C32634ae.m125178a(R.color.text_caption));
            aVar.setSelectedColor(C32634ae.m125178a(R.color.primary_pri_500));
            aVar.setOnClickListener(new View$OnClickListenerC31796a(this, i));
            aVar.setText(((ViewInfos) this.f80921b.get(i)).mo110524b());
            return aVar;
        }
    }

    public final ArrayList<MeetingRoomBuildingModel> getCurrentPageExpandBuildings() {
        return this.f80918c.get(this.f80917a).getExpandBuildings();
    }

    /* renamed from: c */
    public final void mo115921c() {
        int size = this.f80918c.size();
        for (int i = 0; i < size; i++) {
            BuildingPageView valueAt = this.f80918c.valueAt(i);
            if (valueAt != null) {
                valueAt.mo116014a();
            }
        }
    }

    public final List<BuildingPageView> getBuildingPageView() {
        ArrayList arrayList = new ArrayList(this.f80918c.size());
        int size = this.f80918c.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(this.f80918c.valueAt(i));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final List<MeetingRoomBuildingModel> getExpandBuildings() {
        ArrayList<MeetingRoomBuildingModel> expandBuildings;
        ArrayList arrayList = new ArrayList();
        int size = this.f80918c.size();
        for (int i = 0; i < size; i++) {
            BuildingPageView valueAt = this.f80918c.valueAt(i);
            if (!(valueAt == null || (expandBuildings = valueAt.getExpandBuildings()) == null)) {
                arrayList.addAll(expandBuildings);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo115919b() {
        LayoutInflater.from(getContext()).inflate(R.layout.calendar_buildings_expand_meeting_rooms, (ViewGroup) this, true);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        BuildingPageView cVar = new BuildingPageView(context);
        cVar.setPageIndex(1);
        this.f80918c.put(1, cVar);
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Calendar_Edit_AllRooms);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(string.Calendar_Edit_AllRooms)");
        arrayList.add(new ViewInfos(cVar, string));
        ViewPager viewPager = (ViewPager) mo115914a(R.id.buildingViewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "buildingViewPager");
        viewPager.setAdapter(new BuildingPageAdapter(arrayList));
        MagicIndicator magicIndicator = (MagicIndicator) mo115914a(R.id.buildingIndicator);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "buildingIndicator");
        magicIndicator.setVisibility(8);
        View a = mo115914a(R.id.indicatorShadow);
        Intrinsics.checkExpressionValueIsNotNull(a, "indicatorShadow");
        a.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo115915a() {
        LayoutInflater.from(getContext()).inflate(R.layout.calendar_buildings_expand_meeting_rooms, (ViewGroup) this, true);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        BuildingPageView cVar = new BuildingPageView(context);
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        BuildingPageView cVar2 = new BuildingPageView(context2);
        cVar.setPageIndex(0);
        cVar2.setPageIndex(1);
        this.f80918c.put(0, cVar);
        this.f80918c.put(1, cVar2);
        ArrayList arrayList = new ArrayList();
        String string = UIHelper.getString(R.string.Calendar_Edit_AvaliableRooms);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…ndar_Edit_AvaliableRooms)");
        arrayList.add(new ViewInfos(cVar, string));
        String string2 = UIHelper.getString(R.string.Calendar_Edit_AllRooms);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(string.Calendar_Edit_AllRooms)");
        arrayList.add(new ViewInfos(cVar2, string2));
        ViewPager viewPager = (ViewPager) mo115914a(R.id.buildingViewPager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "buildingViewPager");
        viewPager.setAdapter(new BuildingPageAdapter(arrayList));
        C69619a aVar = new C69619a(getContext());
        aVar.setAdjustMode(true);
        aVar.setAdapter(new C31795b(this, arrayList));
        MagicIndicator magicIndicator = (MagicIndicator) mo115914a(R.id.buildingIndicator);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "buildingIndicator");
        magicIndicator.setNavigator(aVar);
        ((MagicIndicator) mo115914a(R.id.buildingIndicator)).setBackgroundColor(C32634ae.m125178a(R.color.bg_body));
        C69634c.m267483a((MagicIndicator) mo115914a(R.id.buildingIndicator), (ViewPager) mo115914a(R.id.buildingViewPager));
        ((ViewPager) mo115914a(R.id.buildingViewPager)).addOnPageChangeListener(new C31797c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/BuildingExpandRoomsView$initAvailableAndAllView$2", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.BuildingExpandRoomsView$c */
    public static final class C31797c implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ BuildingExpandRoomsView f80924a;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31797c(BuildingExpandRoomsView buildingExpandRoomsView) {
            this.f80924a = buildingExpandRoomsView;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.f80924a.f80917a = i;
        }
    }

    /* renamed from: b */
    public final void mo115920b(MeetingRoomBuildingModel hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "clickBuildingModel");
        BuildingPageView cVar = this.f80918c.get(hVar.mo115774f());
        if (cVar != null) {
            cVar.mo116016a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo115917a(MeetingRoomBuildingModel hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "clickBuildingModel");
        BuildingPageView cVar = this.f80918c.get(hVar.mo115774f());
        if (cVar != null) {
            cVar.mo116019b(hVar);
        }
    }

    /* renamed from: a */
    public final void mo115918a(HashMap<ItemModel, ArrayList<ItemModel>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "buildingRoomsMap");
        int size = this.f80918c.size();
        for (int i = 0; i < size; i++) {
            BuildingPageView valueAt = this.f80918c.valueAt(i);
            if (valueAt != null) {
                valueAt.mo116018a(hashMap);
            }
        }
    }

    /* renamed from: a */
    public final void mo115916a(MeetingRoomBuildingViewHolder.OnItemClickListener aVar, MeetingRoomViewHolder.OnItemClickListener aVar2, ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener aVar3) {
        int size = this.f80918c.size();
        for (int i = 0; i < size; i++) {
            this.f80918c.valueAt(i).mo116015a(aVar, aVar2, aVar3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuildingExpandRoomsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80918c = new SparseArray<>(2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BuildingExpandRoomsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
