package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001b\u0018\u00002\u00020\u0001:\u00015B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020\u001eH\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020 H\u0016J\u001a\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u000e\u00103\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u00104\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$BuildingFragmentAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$BuildingFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;)V", "mBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel;", "getMBuildingModel", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel;", "mBuildingModel$delegate", "Lkotlin/Lazy;", "mBuildingPresenter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter;", "getMBuildingPresenter", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter;", "mBuildingPresenter$delegate", "mBuildingView", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView;", "getMBuildingView", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView;", "mBuildingView$delegate", "mFragmentAction", "mFragmentData", "mFragmentDependency", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$mFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$mFragmentDependency$1;", "mIsFromLocalRecover", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "hideFragment", "initMVP", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "refreshData", "showFragment", "BuildingFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a */
public final class BuildingFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public BuildingFragmentAction f80668a;

    /* renamed from: b */
    public BuildingFragmentData f80669b;

    /* renamed from: e */
    public final C31743e f80670e;

    /* renamed from: f */
    private final Lazy f80671f;

    /* renamed from: g */
    private final Lazy f80672g;

    /* renamed from: h */
    private final Lazy f80673h;

    /* renamed from: i */
    private boolean f80674i;

    /* renamed from: j */
    private HashMap f80675j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$BuildingFragmentAction;", "", "onBackPressed", "", "chosenMeetingRoomList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Lkotlin/collections/ArrayList;", "onDeletePressedWhenOneItem", "onMeetingRoomInfoClicked", "calendarId", "", "onSearchItemSavePressed", "meetingRoom", "startBoardRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a$a */
    public interface BuildingFragmentAction {
        /* renamed from: a */
        void mo114346a();

        /* renamed from: a */
        void mo114347a(MeetingRoomFragmentData meetingRoomFragmentData);

        /* renamed from: a */
        void mo114348a(String str);

        /* renamed from: a */
        void mo114349a(ArrayList<EventMeetingRoomData> arrayList);

        /* renamed from: b */
        void mo114350b(ArrayList<EventMeetingRoomData> arrayList);
    }

    /* renamed from: d */
    private final BuildingPresenter m120224d() {
        return (BuildingPresenter) this.f80673h.getValue();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80675j == null) {
            this.f80675j = new HashMap();
        }
        View view = (View) this.f80675j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80675j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80675j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final BuildingView mo115669b() {
        return (BuildingView) this.f80671f.getValue();
    }

    /* renamed from: c */
    public final BuildingModel mo115671c() {
        return (BuildingModel) this.f80672g.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: f */
    private final void m120225f() {
        m120224d().create();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a$b */
    static final class C31740b extends Lambda implements Function0<BuildingModel> {
        final /* synthetic */ BuildingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31740b(BuildingFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BuildingModel invoke() {
            return new BuildingModel(BuildingFragment.m120222a(this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u00032\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016¨\u0006\u001a"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$mFragmentDependency$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$FragmentDependency;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "getContext", "Landroid/content/Context;", "hideFragment", "onBackPressed", "chosenMeetingRoomList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Lkotlin/collections/ArrayList;", "onDeletePressedWhenOneItem", "onMeetingRoomInfoClicked", "calendarId", "", "onSavePressed", "meetingRoom", "showFragment", "startBoardRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a$e */
    public static final class C31743e implements BuildingPresenter.FragmentDependency {

        /* renamed from: a */
        final /* synthetic */ BuildingFragment f80676a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: a */
        public Context mo115672a() {
            return this.f80676a.getActivity();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: b */
        public void mo115678b() {
            BuildingFragment.m120223b(this.f80676a).mo114346a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31743e(BuildingFragment aVar) {
            this.f80676a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: a */
        public void mo115673a(Fragment fragment) {
            this.f80676a.mo115666a(fragment);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: b */
        public void mo115679b(Fragment fragment) {
            this.f80676a.mo115670b(fragment);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: b */
        public void mo115680b(ArrayList<EventMeetingRoomData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoom");
            BuildingFragment.m120223b(this.f80676a).mo114350b(arrayList);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: a */
        public void mo115675a(MeetingRoomFragmentData meetingRoomFragmentData) {
            Intrinsics.checkParameterIsNotNull(meetingRoomFragmentData, "meetingRoomFragmentData");
            BuildingFragment.m120223b(this.f80676a).mo114347a(meetingRoomFragmentData);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: a */
        public void mo115676a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            BuildingFragment.m120223b(this.f80676a).mo114348a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: a */
        public void mo115677a(ArrayList<EventMeetingRoomData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRoomList");
            BuildingFragment.m120223b(this.f80676a).mo114349a(arrayList);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter.FragmentDependency
        /* renamed from: a */
        public void mo115674a(Fragment fragment, int i) {
            this.f80676a.mo115667a(fragment, i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        if (!this.f80674i) {
            return m120224d().mo115867l();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (!this.f80674i) {
            m120224d().destroy();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a$c */
    static final class C31741c extends Lambda implements Function0<BuildingPresenter> {
        final /* synthetic */ BuildingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31741c(BuildingFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BuildingPresenter invoke() {
            return new BuildingPresenter(this.this$0.mo115669b(), this.this$0.mo115671c(), this.this$0.f80670e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.a$d */
    static final class C31742d extends Lambda implements Function0<BuildingView> {
        final /* synthetic */ BuildingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31742d(BuildingFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BuildingView invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo109250a(R.id.ll_boardroom_content);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "ll_boardroom_content");
            return new BuildingView(frameLayout, this.this$0.f80670e);
        }
    }

    public BuildingFragment() {
        this.f80671f = LazyKt.lazy(new C31742d(this));
        this.f80672g = LazyKt.lazy(new C31740b(this));
        this.f80673h = LazyKt.lazy(new C31741c(this));
        this.f80670e = new C31743e(this);
        this.f80674i = true;
    }

    /* renamed from: a */
    public static final /* synthetic */ BuildingFragmentData m120222a(BuildingFragment aVar) {
        BuildingFragmentData buildingFragmentData = aVar.f80669b;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        return buildingFragmentData;
    }

    /* renamed from: b */
    public static final /* synthetic */ BuildingFragmentAction m120223b(BuildingFragment aVar) {
        BuildingFragmentAction aVar2 = aVar.f80668a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        return aVar2;
    }

    /* renamed from: a */
    public final void mo115668a(BuildingFragmentData buildingFragmentData) {
        Intrinsics.checkParameterIsNotNull(buildingFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m120224d().mo115852a(buildingFragmentData);
    }

    /* renamed from: b */
    public final void mo115670b(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo115666a(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (!this.f80674i) {
            m120225f();
        }
    }

    public BuildingFragment(BuildingFragmentAction aVar, BuildingFragmentData buildingFragmentData) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        Intrinsics.checkParameterIsNotNull(buildingFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80671f = LazyKt.lazy(new C31742d(this));
        this.f80672g = LazyKt.lazy(new C31740b(this));
        this.f80673h = LazyKt.lazy(new C31741c(this));
        this.f80670e = new C31743e(this);
        this.f80668a = aVar;
        this.f80669b = buildingFragmentData;
        this.f80674i = false;
    }

    /* renamed from: a */
    public final void mo115667a(Fragment fragment, int i) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_boardroom_building, viewGroup, false);
    }
}
