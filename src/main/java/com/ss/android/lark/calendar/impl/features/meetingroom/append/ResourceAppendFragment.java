package com.ss.android.lark.calendar.impl.features.meetingroom.append;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.building.ResourceAppendViewControl;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.AppendMultiLevelViewControl;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel;
import com.ss.android.lark.calendar.impl.p1436a.C30067a;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0002-.B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010$\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020'J\u0014\u0010(\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u0010\u0010,\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "appendFragmentBaseView", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/AppendFragmentViewControl;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;", "fragmentAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment$IBuildingFragmentAction;", "getFragmentAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment$IBuildingFragmentAction;", "setFragmentAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment$IBuildingFragmentAction;)V", "resourceAppendViewModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/BaseAppendViewModel;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "hideFragment", "initAppendView", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "removeFragment", "routeToCalendarProfileActivity", "resourceCalendarId", "", "sendEditActivitySelectedResource", "resourceList", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "showFragment", "Companion", "IBuildingFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.e */
public final class ResourceAppendFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public static final Companion f81871a = new Companion(null);

    /* renamed from: b */
    private IBuildingFragmentAction f81872b;

    /* renamed from: e */
    private C30067a f81873e;

    /* renamed from: f */
    private BaseAppendViewModel f81874f;

    /* renamed from: g */
    private AppendFragmentViewControl f81875g;

    /* renamed from: h */
    private HashMap f81876h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment$IBuildingFragmentAction;", "", "cachePbMultiLevelData", "", "pbMultiLevelData", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "onBackPressed", "onDeletePressedWhenOneItem", "onMeetingRoomInfoClicked", "resourceCalendarId", "selectMeetingRoom", "resourceList", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.e$b */
    public interface IBuildingFragmentAction {
        /* renamed from: a */
        void mo114351a();

        /* renamed from: a */
        void mo114352a(String str);

        /* renamed from: a */
        void mo114353a(List<AppendResourceData> list);

        /* renamed from: a */
        void mo114354a(Map<String, LevelRelatedInfo> map);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f81876h == null) {
            this.f81876h = new HashMap();
        }
        View view = (View) this.f81876h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f81876h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f81876h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment$Companion;", "", "()V", "APPEND_RESOURCE_CALENDAR_EVENT_DATA", "", "getFragmentWithArgument", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "buildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ResourceAppendFragment mo116914a(ResourceAppendFragmentData resourceAppendFragmentData) {
            Intrinsics.checkParameterIsNotNull(resourceAppendFragmentData, "buildingFragmentData");
            ResourceAppendFragment eVar = new ResourceAppendFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("calendar_event_data", resourceAppendFragmentData);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    /* renamed from: b */
    public final IBuildingFragmentAction mo116913b() {
        return this.f81872b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        AppendFragmentViewControl aVar = this.f81875g;
        if (aVar != null && aVar.mo116626e()) {
            return false;
        }
        IBuildingFragmentAction bVar = this.f81872b;
        if (bVar != null) {
            bVar.mo114351a();
        }
        return true;
    }

    /* renamed from: c */
    private final void m121845c() {
        C30067a aVar;
        BaseAppendViewModel bVar;
        C30067a aVar2 = this.f81873e;
        if (!(aVar2 == null || (bVar = this.f81874f) == null)) {
            this.f81875g = new AppendFragmentViewControl(bVar, this, aVar2);
        }
        BaseAppendViewModel bVar2 = this.f81874f;
        if (bVar2 instanceof MultiLevelViewModel) {
            C30067a aVar3 = this.f81873e;
            if (aVar3 != null) {
                new AppendMultiLevelViewControl(aVar3, (MultiLevelViewModel) bVar2, this);
            }
        } else if ((bVar2 instanceof AppendBuildingViewModel) && (aVar = this.f81873e) != null) {
            new ResourceAppendViewControl(aVar, (AppendBuildingViewModel) bVar2, this);
        }
    }

    /* renamed from: a */
    public final void mo116910a(IBuildingFragmentAction bVar) {
        this.f81872b = bVar;
    }

    /* renamed from: a */
    public final void mo116911a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
        IBuildingFragmentAction bVar = this.f81872b;
        if (bVar != null) {
            bVar.mo114352a(str);
        }
    }

    /* renamed from: a */
    public final void mo116912a(List<AppendResourceData> list) {
        Intrinsics.checkParameterIsNotNull(list, "resourceList");
        IBuildingFragmentAction bVar = this.f81872b;
        if (bVar != null) {
            bVar.mo114353a(list);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        Serializable serializable;
        super.onCreate(bundle);
        if (C30022a.f74883b.mo112707o()) {
            obj = MultiLevelViewModel.class;
        } else {
            obj = AppendBuildingViewModel.class;
        }
        BaseAppendViewModel bVar = (BaseAppendViewModel) new C1144ai(this).mo6005a(obj);
        Bundle arguments = getArguments();
        ResourceAppendFragmentData resourceAppendFragmentData = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("calendar_event_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof ResourceAppendFragmentData) {
            resourceAppendFragmentData = serializable;
        }
        ResourceAppendFragmentData resourceAppendFragmentData2 = resourceAppendFragmentData;
        if (resourceAppendFragmentData2 != null) {
            bVar.init(resourceAppendFragmentData2);
            bVar.refresh();
        }
        this.f81874f = bVar;
    }

    /* renamed from: a */
    public final void mo116908a(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).remove(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m121845c();
    }

    /* renamed from: a */
    public final void mo116909a(Fragment fragment, int i) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        C30067a a = C30067a.m111264a(layoutInflater, viewGroup, false);
        this.f81873e = a;
        if (a != null) {
            frameLayout = a.mo108413a();
        } else {
            frameLayout = null;
        }
        return frameLayout;
    }
}
