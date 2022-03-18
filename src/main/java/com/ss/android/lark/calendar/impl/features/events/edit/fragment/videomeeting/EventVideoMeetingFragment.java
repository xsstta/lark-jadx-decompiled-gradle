package com.ss.android.lark.calendar.impl.features.events.edit.fragment.videomeeting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.aj;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.VideoMeeting;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001'B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016J&\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0003R\u001b\u0010\u0007\u001a\u00020\b8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "videoMeeting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;", "videoMeetingFragmentAction", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment$VideoMeetingFragmentAction;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment$VideoMeetingFragmentAction;)V", "eventVideoVideoModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingViewModel;", "getEventVideoVideoModel", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingViewModel;", "eventVideoVideoModel$delegate", "Lkotlin/Lazy;", "getVideoMeeting", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;", "setVideoMeeting", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;)V", "getVideoMeetingFragmentAction", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment$VideoMeetingFragmentAction;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "viewModelProvider$delegate", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "updateVideoMeetingData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "VideoMeetingFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.a */
public final class EventVideoMeetingFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    private final Lazy f80576a = LazyKt.lazy(new C31692c(this));

    /* renamed from: b */
    private final Lazy f80577b = LazyKt.lazy(new C31691b(this));

    /* renamed from: e */
    private VideoMeeting f80578e;

    /* renamed from: f */
    private final VideoMeetingFragmentAction f80579f;

    /* renamed from: g */
    private HashMap f80580g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingFragment$VideoMeetingFragmentAction;", "", "onSavePressed", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/VideoMeeting;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.a$a */
    public interface VideoMeetingFragmentAction {
        /* renamed from: a */
        void mo114378a(VideoMeeting aaVar);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80580g == null) {
            this.f80580g = new HashMap();
        }
        View view = (View) this.f80580g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80580g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80580g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final C1144ai mo115478b() {
        return (C1144ai) this.f80576a.getValue();
    }

    /* renamed from: c */
    public final EventVideoMeetingViewModel mo115479c() {
        return (EventVideoMeetingViewModel) this.f80577b.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: d */
    public final VideoMeeting mo115480d() {
        return this.f80578e;
    }

    /* renamed from: f */
    public final VideoMeetingFragmentAction mo115481f() {
        return this.f80579f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/videomeeting/EventVideoMeetingViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.a$b */
    static final class C31691b extends Lambda implements Function0<EventVideoMeetingViewModel> {
        final /* synthetic */ EventVideoMeetingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31691b(EventVideoMeetingFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EventVideoMeetingViewModel invoke() {
            return (EventVideoMeetingViewModel) this.this$0.mo115478b().mo6005a(EventVideoMeetingViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.e.a$c */
    static final class C31692c extends Lambda implements Function0<C1144ai> {
        final /* synthetic */ EventVideoMeetingFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31692c(EventVideoMeetingFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1144ai invoke() {
            return aj.m5365a(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.videomeeting.EventVideoMeetingFragment.C31692c.C316931 */

                /* renamed from: a */
                final /* synthetic */ C31692c f80581a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f80581a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    return new EventVideoMeetingViewModel(this.f80581a.this$0.mo115480d());
                }
            });
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        mo115479c().onBackPressed();
        return true;
    }

    /* renamed from: a */
    public final void mo115477a(VideoMeeting aaVar) {
        Intrinsics.checkParameterIsNotNull(aaVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80578e = aaVar;
        mo115479c().create();
    }

    public EventVideoMeetingFragment(VideoMeeting aaVar, VideoMeetingFragmentAction aVar) {
        Intrinsics.checkParameterIsNotNull(aaVar, "videoMeeting");
        Intrinsics.checkParameterIsNotNull(aVar, "videoMeetingFragmentAction");
        this.f80578e = aaVar;
        this.f80579f = aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        C1144ai b = mo115478b();
        Intrinsics.checkExpressionValueIsNotNull(b, "viewModelProvider");
        new EventVideoMeetingView(view, this, b).mo115485b();
        mo115479c().create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_edit_video_meeting, viewGroup, false);
    }
}
