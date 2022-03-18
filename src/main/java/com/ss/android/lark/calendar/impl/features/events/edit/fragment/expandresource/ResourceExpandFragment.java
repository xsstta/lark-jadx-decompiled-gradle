package com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ResourceExpandFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.ExpandResourceAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.view.IDetailItemListener;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001c\u0018\u00002\u00020\u0001:\u00015B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\r\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u000bH\u0016J&\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u001a\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004J\u001a\u0010-\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010.\u001a\u00020\u000bH\u0002J\u0010\u0010/\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0018\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "fragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ResourceExpandFragmentData;", "fragmentAction", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$EditResourceExpandFragmentAction;", "detailItemListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ResourceExpandFragmentData;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$EditResourceExpandFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;)V", "isChildFragmentShow", "", "mIsFromLocalRecover", "mMeetingRoomFormFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment;", "meetingRoomFormFragmentAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment$MeetingRoomFormFragmentAction;", "getMeetingRoomFormFragmentAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment$MeetingRoomFormFragmentAction;", "resourceAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/ExpandResourceAdapter;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "getEditCommonResourceListener", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$getEditCommonResourceListener$1", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$getEditCommonResourceListener$1;", "hideChildFragment", "hideFragment", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshData", "showChildFragment", "isFirstAdd", "showFragment", "showMtRoomScheduleFragment", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "EditResourceExpandFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a */
public final class ResourceExpandFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public ResourceExpandFragmentData f80449a;

    /* renamed from: b */
    public IDetailItemListener f80450b;

    /* renamed from: e */
    public EditResourceExpandFragmentAction f80451e;

    /* renamed from: f */
    public MeetingRoomFormFragment f80452f;

    /* renamed from: g */
    private ExpandResourceAdapter f80453g;

    /* renamed from: h */
    private boolean f80454h;

    /* renamed from: i */
    private boolean f80455i = true;

    /* renamed from: j */
    private final MeetingRoomFormFragment.MeetingRoomFormFragmentAction f80456j = new C31657d(this);

    /* renamed from: k */
    private HashMap f80457k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$EditResourceExpandFragmentAction;", "", "onBackPressed", "", "onResourceFormSavePressed", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a$a */
    public interface EditResourceExpandFragmentAction {
        /* renamed from: a */
        void mo114373a();

        /* renamed from: a */
        void mo114374a(String str, SchemaExtraData.ResourceCustomization resourceCustomization);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80457k == null) {
            this.f80457k = new HashMap();
        }
        View view = (View) this.f80457k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80457k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80457k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: c */
    private final C31655b m119705c() {
        return new C31655b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$getEditCommonResourceListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/adapter/EditCommonResourceBinder$EditCommonResourceListener;", "getInstanceEndTime", "", "getUnusableMeetingRoom", "", "", "Lcom/bytedance/lark/pb/calendar/v1/GetUnusableMeetingRoomsResponse$UnusableReasons;", "isEditable", "", "isExternalEvent", "needShowDisableFrom", "onMeetingRoomDeleteClicked", "", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onMeetingRoomItemClicked", "calendarId", "onMtRoomScheduleClicked", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a$b */
    public static final class C31655b implements EditCommonResourceBinder.EditCommonResourceListener {

        /* renamed from: a */
        final /* synthetic */ ResourceExpandFragment f80458a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: b */
        public Map<String, GetUnusableMeetingRoomsResponse.UnusableReasons> mo114791b() {
            return ResourceExpandFragment.m119702b(this.f80458a).mo115120b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: c */
        public boolean mo114792c() {
            return ResourceExpandFragment.m119702b(this.f80458a).mo115121c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: d */
        public boolean mo114793d() {
            return ResourceExpandFragment.m119702b(this.f80458a).mo115123e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: e */
        public long mo114794e() {
            return ResourceExpandFragment.m119702b(this.f80458a).mo115125f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public boolean mo114790a() {
            return ResourceExpandFragment.m119702b(this.f80458a).mo115122d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31655b(ResourceExpandFragment aVar) {
            this.f80458a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public void mo114787a(CalendarEventAttendee calendarEventAttendee) {
            Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "meetingRoom");
            ResourceExpandFragment.m119700a(this.f80458a).mo114361a(calendarEventAttendee);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public void mo114788a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            ResourceExpandFragment.m119700a(this.f80458a).mo114367b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.expandresource.adapter.EditCommonResourceBinder.EditCommonResourceListener
        /* renamed from: a */
        public void mo114789a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            this.f80458a.mo115332a(str, resourceCustomization);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$meetingRoomFormFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment$MeetingRoomFormFragmentAction;", "onCompletePressed", "", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "onFragmentBackPressed", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a$d */
    public static final class C31657d implements MeetingRoomFormFragment.MeetingRoomFormFragmentAction {

        /* renamed from: a */
        final /* synthetic */ ResourceExpandFragment f80460a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114392a() {
            ResourceExpandFragment aVar = this.f80460a;
            aVar.mo115329a(aVar.f80452f);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31657d(ResourceExpandFragment aVar) {
            this.f80460a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114393a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            ResourceExpandFragment aVar = this.f80460a;
            aVar.mo115329a(aVar.f80452f);
            ResourceExpandFragment.m119704c(this.f80460a).mo114374a(str, resourceCustomization);
        }
    }

    public ResourceExpandFragment() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.fragmentContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "fragmentContainer");
        if (frameLayout.getVisibility() != 0 || !this.f80454h) {
            EditResourceExpandFragmentAction aVar = this.f80451e;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentAction");
            }
            aVar.mo114373a();
            return super.mo113714e();
        }
        MeetingRoomFormFragment aVar2 = this.f80452f;
        if (aVar2 == null) {
            return false;
        }
        aVar2.mo113714e();
        return false;
    }

    /* renamed from: b */
    private final void m119703b() {
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftClickListener(new C31656c(this));
        RecyclerView recyclerView = (RecyclerView) mo109250a(R.id.expandResourceRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "expandResourceRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        ResourceExpandFragmentData hVar = this.f80449a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentData");
        }
        this.f80453g = new ExpandResourceAdapter(new ArrayList(hVar.mo115119a()), m119705c());
        RecyclerView recyclerView2 = (RecyclerView) mo109250a(R.id.expandResourceRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "expandResourceRv");
        recyclerView2.setAdapter(this.f80453g);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/expandresource/ResourceExpandFragment$initView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c.a$c */
    public static final class C31656c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ResourceExpandFragment f80459a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31656c(ResourceExpandFragment aVar) {
            this.f80459a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            this.f80459a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IDetailItemListener m119700a(ResourceExpandFragment aVar) {
        IDetailItemListener bVar = aVar.f80450b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailItemListener");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ResourceExpandFragmentData m119702b(ResourceExpandFragment aVar) {
        ResourceExpandFragmentData hVar = aVar.f80449a;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentData");
        }
        return hVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditResourceExpandFragmentAction m119704c(ResourceExpandFragment aVar) {
        EditResourceExpandFragmentAction aVar2 = aVar.f80451e;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentAction");
        }
        return aVar2;
    }

    /* renamed from: a */
    public final void mo115329a(Fragment fragment) {
        this.f80454h = false;
        mo115334c(fragment);
    }

    /* renamed from: b */
    public final void mo115333b(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: c */
    public final void mo115334c(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo115331a(ResourceExpandFragmentData hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "fragmentData");
        this.f80449a = hVar;
        ExpandResourceAdapter bVar = this.f80453g;
        if (bVar != null) {
            bVar.mo115344a(hVar.mo115119a());
        }
        ExpandResourceAdapter bVar2 = this.f80453g;
        if (bVar2 != null) {
            bVar2.notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80455i) {
            m119703b();
        }
    }

    /* renamed from: a */
    private final void m119701a(Fragment fragment, boolean z) {
        this.f80454h = true;
        FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.fragmentContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "fragmentContainer");
        frameLayout.setVisibility(0);
        if (z) {
            FrameLayout frameLayout2 = (FrameLayout) mo109250a(R.id.fragmentContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "fragmentContainer");
            mo115330a(fragment, frameLayout2.getId());
            return;
        }
        mo115333b(fragment);
    }

    /* renamed from: a */
    public final void mo115330a(Fragment fragment, int i) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo115332a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
        boolean z;
        MeetingRoomFormFragment aVar = this.f80452f;
        if (aVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar != null) {
            MeetingRoomFormFragment.m121981a(aVar, str, resourceCustomization, null, 4, null);
        } else {
            this.f80452f = new MeetingRoomFormFragment(str, resourceCustomization, this.f80456j);
        }
        m119701a(this.f80452f, z);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_edit_expand_resource_layout, viewGroup, false);
    }

    public ResourceExpandFragment(ResourceExpandFragmentData hVar, EditResourceExpandFragmentAction aVar, IDetailItemListener bVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "fragmentData");
        Intrinsics.checkParameterIsNotNull(aVar, "fragmentAction");
        Intrinsics.checkParameterIsNotNull(bVar, "detailItemListener");
        this.f80449a = hVar;
        this.f80450b = bVar;
        this.f80451e = aVar;
    }
}
