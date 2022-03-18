package com.ss.android.lark.calendar.impl.features.meetingroom.form;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.aj;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a */
public final class MeetingRoomFormFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public String f81982a;

    /* renamed from: b */
    public SchemaExtraData.ResourceCustomization f81983b;

    /* renamed from: e */
    public MeetingRoomFormFragmentAction f81984e;

    /* renamed from: f */
    private boolean f81985f;

    /* renamed from: g */
    private final Lazy f81986g;

    /* renamed from: h */
    private HashMap f81987h;

    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a$a */
    public interface MeetingRoomFormFragmentAction {
        /* renamed from: a */
        void mo114392a();

        /* renamed from: a */
        void mo114393a(String str, SchemaExtraData.ResourceCustomization resourceCustomization);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f81987h == null) {
            this.f81987h = new HashMap();
        }
        View view = (View) this.f81987h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f81987h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f81987h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: d */
    public final C1144ai mo117038d() {
        return (C1144ai) this.f81986g.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a$d */
    public static final class C32071d extends Lambda implements Function0<C1144ai> {
        final /* synthetic */ MeetingRoomFormFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32071d(MeetingRoomFormFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1144ai invoke() {
            return aj.m5365a(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.C32071d.C320721 */

                /* renamed from: a */
                final /* synthetic */ C32071d f81990a;

                {
                    this.f81990a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    return new MeetingRoomFormViewModel(this.f81990a.this$0.mo117036b(), this.f81990a.this$0.mo117037c());
                }
            });
        }
    }

    /* renamed from: i */
    private final void m121984i() {
        Context context = getContext();
        if (context != null) {
            KeyboardUtils.hideKeyboard(context);
        }
    }

    /* renamed from: b */
    public final String mo117036b() {
        String str = this.f81982a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarId");
        }
        return str;
    }

    /* renamed from: c */
    public final SchemaExtraData.ResourceCustomization mo117037c() {
        SchemaExtraData.ResourceCustomization resourceCustomization = this.f81983b;
        if (resourceCustomization == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceCustomization");
        }
        return resourceCustomization;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        if (!isAdded()) {
            return true;
        }
        mo117039f().onBackPressed();
        return true;
    }

    public MeetingRoomFormFragment() {
        this.f81986g = LazyKt.lazy(new C32071d(this));
        this.f81985f = true;
    }

    /* renamed from: f */
    public final MeetingRoomFormViewModel mo117039f() {
        AbstractC1142af a = mo117038d().mo6005a(MeetingRoomFormViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "viewModelProvider.get(Me…ormViewModel::class.java)");
        return (MeetingRoomFormViewModel) a;
    }

    /* renamed from: h */
    private final void m121983h() {
        mo117039f().getRouteProfileLiveData().mo5923a(getViewLifecycleOwner(), new C32069b(this));
        mo117039f().getQuitActivityWithResult().mo5923a(getViewLifecycleOwner(), new C32070c(this));
    }

    /* renamed from: g */
    private final void m121982g() {
        MeetingRoomFormViewModel f = mo117039f();
        String str = this.f81982a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarId");
        }
        SchemaExtraData.ResourceCustomization resourceCustomization = this.f81983b;
        if (resourceCustomization == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourceCustomization");
        }
        f.refreshBaseData(str, resourceCustomization);
        m121983h();
        RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.mtroomScheduleRootView);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mtroomScheduleRootView");
        C1144ai d = mo117038d();
        Intrinsics.checkExpressionValueIsNotNull(d, "viewModelProvider");
        new MeetingRoomFormView(this, relativeLayout, d).mo117064c();
        mo117039f().create();
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a$c */
    public static final class C32070c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormFragment f81989a;

        C32070c(MeetingRoomFormFragment aVar) {
            this.f81989a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            MeetingRoomFormFragment aVar = this.f81989a;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            aVar.mo117035a(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.a$b */
    public static final class C32069b<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormFragment f81988a;

        C32069b(MeetingRoomFormFragment aVar) {
            this.f81988a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            Context context = this.f81988a.getContext();
            if (context != null) {
                C30022a.f74882a.oldModuleDependency().mo108285a(context, str, "", "");
                GeneralHitPoint.m124264o("cal_format_page");
            }
        }
    }

    /* renamed from: a */
    public final void mo117035a(boolean z) {
        m121984i();
        if (z) {
            SchemaExtraData.ResourceCustomization resultCustomizationData = mo117039f().getResultCustomizationData();
            MeetingRoomFormFragmentAction aVar = this.f81984e;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragmentAction");
            }
            aVar.mo114393a(mo117039f().getCalendarId(), resultCustomizationData);
            GeneralHitPoint.f83331a.mo118727f(true);
            return;
        }
        MeetingRoomFormFragmentAction aVar2 = this.f81984e;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragmentAction");
        }
        aVar2.mo114392a();
        GeneralHitPoint.f83331a.mo118727f(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f81985f) {
            m121982g();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_calendar_mtroom_schedule, (ViewGroup) null);
    }

    /* renamed from: a */
    public final void mo117034a(String str, SchemaExtraData.ResourceCustomization resourceCustomization, MeetingRoomFormFragmentAction aVar) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
        if (aVar != null) {
            this.f81984e = aVar;
        }
        mo117039f().refreshBaseData(str, resourceCustomization);
        mo117039f().create();
    }

    public MeetingRoomFormFragment(String str, SchemaExtraData.ResourceCustomization resourceCustomization, MeetingRoomFormFragmentAction aVar) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
        Intrinsics.checkParameterIsNotNull(aVar, "fragmentAction");
        this.f81986g = LazyKt.lazy(new C32071d(this));
        this.f81982a = str;
        this.f81983b = resourceCustomization;
        this.f81984e = aVar;
        this.f81985f = false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m121981a(MeetingRoomFormFragment aVar, String str, SchemaExtraData.ResourceCustomization resourceCustomization, MeetingRoomFormFragmentAction aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        aVar.mo117034a(str, resourceCustomization, aVar2);
    }
}
