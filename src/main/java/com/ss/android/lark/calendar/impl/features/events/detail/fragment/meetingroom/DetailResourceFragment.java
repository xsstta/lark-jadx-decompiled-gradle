package com.ss.android.lark.calendar.impl.features.events.detail.fragment.meetingroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001d\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0014\u0010\u001b\u001a\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\t\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "resourceData", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "action", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;", "(Ljava/util/List;Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;)V", "fragmentAction", "mDetailResourceAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceAdapter;", "mIsFromLocalRecover", "", "initView", "", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshData", "DetailResourceFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.c */
public final class DetailResourceFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    private DetailResourceAdapter f79235a;

    /* renamed from: b */
    private List<? extends IBodyData.IMeetingRoomData> f79236b = CollectionsKt.emptyList();

    /* renamed from: e */
    private DetailResourceFragmentAction f79237e;

    /* renamed from: f */
    private boolean f79238f = true;

    /* renamed from: g */
    private HashMap f79239g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/meetingroom/DetailResourceFragment$DetailResourceFragmentAction;", "", "onBackPressed", "", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.c$a */
    public interface DetailResourceFragmentAction {
        /* renamed from: a */
        void mo113715a();

        /* renamed from: a */
        void mo113716a(String str);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f79239g == null) {
            this.f79239g = new HashMap();
        }
        View view = (View) this.f79239g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f79239g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f79239g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    public DetailResourceFragment() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        DetailResourceFragmentAction aVar = this.f79237e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentAction");
        }
        aVar.mo113715a();
        return true;
    }

    /* renamed from: b */
    private final void m117623b() {
        RecyclerView recyclerView = (RecyclerView) mo109250a(R.id.expandResourceRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "expandResourceRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DetailResourceFragmentAction aVar = this.f79237e;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentAction");
        }
        DetailResourceAdapter bVar = new DetailResourceAdapter(aVar);
        bVar.mo113712a(this.f79236b);
        this.f79235a = bVar;
        RecyclerView recyclerView2 = (RecyclerView) mo109250a(R.id.expandResourceRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "expandResourceRv");
        recyclerView2.setAdapter(this.f79235a);
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC31298b(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.a.c$b */
    public static final class View$OnClickListenerC31298b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DetailResourceFragment f79240a;

        View$OnClickListenerC31298b(DetailResourceFragment cVar) {
            this.f79240a = cVar;
        }

        public final void onClick(View view) {
            this.f79240a.mo113714e();
        }
    }

    /* renamed from: a */
    public final void mo113713a(List<? extends IBodyData.IMeetingRoomData> list) {
        Intrinsics.checkParameterIsNotNull(list, "resourceData");
        this.f79236b = list;
        DetailResourceAdapter bVar = this.f79235a;
        if (bVar != null) {
            bVar.mo113712a(list);
            bVar.notifyDataSetChanged();
        }
    }

    public DetailResourceFragment(List<? extends IBodyData.IMeetingRoomData> list, DetailResourceFragmentAction aVar) {
        Intrinsics.checkParameterIsNotNull(list, "resourceData");
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        this.f79236b = list;
        this.f79237e = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f79238f) {
            m117623b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_detail_expand_resource_layout, viewGroup, false);
    }
}
