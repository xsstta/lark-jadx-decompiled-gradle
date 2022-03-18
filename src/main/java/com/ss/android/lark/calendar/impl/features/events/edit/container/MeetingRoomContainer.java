package com.ss.android.lark.calendar.impl.features.events.edit.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IHideFeatureListener;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32066d;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0001-B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006JN\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002J8\u0010!\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0001H\u0002JL\u0010%\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u000eJ\u000e\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0014J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020#H\u0016R\u0014\u0010\u0007\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/MeetingRoomContainer;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "addView", "Landroid/view/View;", "getAddView", "()Landroid/view/View;", "expandView", "getExpandView", "mDetailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "mHideFeatureListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IHideFeatureListener;", "mIsEditable", "", "addMeetingRoomItem", "", "chosenMeetingRooms", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "unusableMeetingRoom", "", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "needShowDisableFrom", "isExternalEvent", "eventEndTime", "", "checkAddExpandEditFormTip", "maxShowResourceCount", "", "boardroomContainer", "setData", "setDetailItemListener", "detailItemListener", "setOnHideListener", "hideFeatureListener", "setUnEditable", "setVisibility", "visibility", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomContainer extends LinearLayout {

    /* renamed from: c */
    public static final Companion f80119c = new Companion(null);

    /* renamed from: a */
    public IDetailItemListener f80120a;

    /* renamed from: b */
    public boolean f80121b;

    /* renamed from: d */
    private IHideFeatureListener f80122d;

    /* renamed from: e */
    private HashMap f80123e;

    public MeetingRoomContainer(Context context) {
        this(context, null, 2, null);
    }

    /* renamed from: a */
    public View mo114781a(int i) {
        if (this.f80123e == null) {
            this.f80123e = new HashMap();
        }
        View view = (View) this.f80123e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f80123e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo114782a() {
        this.f80121b = false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/container/MeetingRoomContainer$Companion;", "", "()V", "RESOURCE_MAX_SHOW_NUM", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.MeetingRoomContainer$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/container/MeetingRoomContainer$addMeetingRoomItem$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;", "getInstanceEndTime", "", "getUnusableMeetingRoom", "", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "isEditable", "", "isExternalEvent", "needShowDisableFrom", "onMeetingRoomDeleteClicked", "", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onMeetingRoomItemClicked", "calendarId", "onMtRoomScheduleClicked", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.MeetingRoomContainer$b */
    public static final class C31599b implements EditCommonResourceBinder.EditCommonResourceListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomContainer f80124a;

        /* renamed from: b */
        final /* synthetic */ Map f80125b;

        /* renamed from: c */
        final /* synthetic */ boolean f80126c;

        /* renamed from: d */
        final /* synthetic */ boolean f80127d;

        /* renamed from: e */
        final /* synthetic */ long f80128e;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: b */
        public Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo114791b() {
            return this.f80125b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: c */
        public boolean mo114792c() {
            return this.f80126c;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: d */
        public boolean mo114793d() {
            return this.f80127d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: e */
        public long mo114794e() {
            return this.f80128e;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public boolean mo114790a() {
            return this.f80124a.f80121b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public void mo114787a(CalendarEventAttendee calendarEventAttendee) {
            Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoom");
            IDetailItemListener bVar = this.f80124a.f80120a;
            if (bVar != null) {
                bVar.mo114361a(calendarEventAttendee);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public void mo114788a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            IDetailItemListener bVar = this.f80124a.f80120a;
            if (bVar != null) {
                bVar.mo114367b(str);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public void mo114789a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            IDetailItemListener bVar = this.f80124a.f80120a;
            if (bVar != null) {
                bVar.mo114363a(str, resourceCustomization);
            }
        }

        C31599b(MeetingRoomContainer meetingRoomContainer, Map map, boolean z, boolean z2, long j) {
            this.f80124a = meetingRoomContainer;
            this.f80125b = map;
            this.f80126c = z;
            this.f80127d = z2;
            this.f80128e = j;
        }
    }

    private final View getAddView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_event_edit_meeting_room, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_event_boardroom_name);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_boardroom_delete_icon);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_disabled_icon);
        TextView textView3 = (TextView) inflate.findViewById(R.id.editMtRoomScheduleTv);
        TextView textView4 = (TextView) inflate.findViewById(R.id.editFormTipTv);
        View findViewById = inflate.findViewById(R.id.resourceTopDivider);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvDisabledLabel");
        textView2.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivDeleteIcon");
        imageView.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "editScheduleTv");
        textView3.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "editFormTipTv");
        textView4.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "divider");
        findViewById.setVisibility(0);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvName");
        textView.setText(getContext().getString(R.string.Calendar_Edit_AddRoom));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextColor(context.getResources().getColor(R.color.primary_pri_700));
        if (!this.f80121b) {
            textView.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
            Intrinsics.checkExpressionValueIsNotNull(inflate, "addView");
            return inflate;
        }
        textView.setOnClickListener(new View$OnClickListenerC31600c(this));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "addView");
        return inflate;
    }

    private final View getExpandView() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_event_edit_meeting_room, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_event_boardroom_name);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_boardroom_delete_icon);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_disabled_icon);
        TextView textView3 = (TextView) inflate.findViewById(R.id.editMtRoomScheduleTv);
        TextView textView4 = (TextView) inflate.findViewById(R.id.editFormTipTv);
        View findViewById = inflate.findViewById(R.id.resourceTopDivider);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvDisabledLabel");
        textView2.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "ivDeleteIcon");
        imageView.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "editScheduleTv");
        textView3.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(textView4, "editFormTipTv");
        textView4.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "divider");
        findViewById.setVisibility(8);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvName");
        textView.setText(getContext().getString(R.string.Calendar_Edit_ViewAll));
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setTextColor(context.getResources().getColor(R.color.primary_pri_700));
        if (!this.f80121b) {
            textView.setTextColor(C32634ae.m125178a(R.color.text_placeholder));
            Intrinsics.checkExpressionValueIsNotNull(inflate, "addView");
            return inflate;
        }
        textView.setOnClickListener(new View$OnClickListenerC31601d(this));
        Intrinsics.checkExpressionValueIsNotNull(inflate, "addView");
        return inflate;
    }

    public final void setDetailItemListener(IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80120a = bVar;
    }

    public final void setOnHideListener(IHideFeatureListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "hideFeatureListener");
        this.f80122d = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.MeetingRoomContainer$c */
    public static final class View$OnClickListenerC31600c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomContainer f80129a;

        View$OnClickListenerC31600c(MeetingRoomContainer meetingRoomContainer) {
            this.f80129a = meetingRoomContainer;
        }

        public final void onClick(View view) {
            IDetailItemListener bVar = this.f80129a.f80120a;
            if (bVar != null) {
                bVar.mo114360a(10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.container.MeetingRoomContainer$d */
    public static final class View$OnClickListenerC31601d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomContainer f80130a;

        View$OnClickListenerC31601d(MeetingRoomContainer meetingRoomContainer) {
            this.f80130a = meetingRoomContainer;
        }

        public final void onClick(View view) {
            IDetailItemListener bVar = this.f80130a.f80120a;
            if (bVar != null) {
                bVar.mo114372f();
            }
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        IHideFeatureListener cVar = this.f80122d;
        if (cVar != null) {
            cVar.mo114309a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f80121b = true;
        LayoutInflater.from(context).inflate(R.layout.view_event_board_container, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingRoomContainer(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: a */
    private final void m119132a(ArrayList<CalendarEventAttendee> arrayList, int i, boolean z, LinearLayout linearLayout) {
        if (z) {
            boolean z2 = false;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                }
                CalendarEventAttendee calendarEventAttendee = arrayList.get(i);
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "chosenMeetingRooms[index]");
                if (MeetingRoomFormHelper.f82028a.mo117088b(C32066d.m121954a(calendarEventAttendee))) {
                    z2 = true;
                    break;
                }
                i++;
            }
            if (z2) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(UIHelper.dp2px(18.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(5.0f));
                TextView textView = new TextView(getContext());
                textView.setText(C32634ae.m125182b(R.string.Calendar_MeetingRoom_CustomizedSeriveDescription));
                textView.setTextColor(C32634ae.m125178a(R.color.function_danger_500));
                textView.setTextSize(1, 16.0f);
                linearLayout.addView(textView, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo114783a(ArrayList<CalendarEventAttendee> arrayList, Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> map, boolean z, boolean z2, long j) {
        Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRooms");
        ((LinearLayout) mo114781a(R.id.ll_boardrooms)).removeAllViews();
        if (!arrayList.isEmpty()) {
            m119133b(arrayList, map, z, z2, j);
        }
    }

    /* renamed from: b */
    private final void m119133b(ArrayList<CalendarEventAttendee> arrayList, Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> map, boolean z, boolean z2, long j) {
        int i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        if (C30022a.f74883b.mo112715w()) {
            i = 10;
        } else {
            i = Integer.MAX_VALUE;
        }
        Iterator<CalendarEventAttendee> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            CalendarEventAttendee next = it.next();
            if (i2 >= i) {
                break;
            }
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_event_edit_meeting_room, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            EditCommonResourceBinder aVar = new EditCommonResourceBinder(inflate);
            Intrinsics.checkExpressionValueIsNotNull(next, "meetingRoomData");
            aVar.mo115336a(arrayList, next, new C31599b(this, map, z, z2, j));
            ((LinearLayout) mo114781a(R.id.ll_boardrooms)).addView(inflate, layoutParams);
            i2++;
        }
        if (i2 < arrayList.size()) {
            LinearLayout linearLayout = (LinearLayout) mo114781a(R.id.ll_boardrooms);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "ll_boardrooms");
            m119132a(arrayList, i, z, linearLayout);
            ((LinearLayout) mo114781a(R.id.ll_boardrooms)).addView(getExpandView(), new LinearLayout.LayoutParams(-1, UIUtils.dp2px(getContext(), 52.0f)));
        }
        if (!z2) {
            ((LinearLayout) mo114781a(R.id.ll_boardrooms)).addView(getAddView(), new LinearLayout.LayoutParams(-1, UIUtils.dp2px(getContext(), 52.0f)));
        }
    }
}
