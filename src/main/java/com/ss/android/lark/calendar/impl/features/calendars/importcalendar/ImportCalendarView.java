package com.ss.android.lark.calendar.impl.features.calendars.importcalendar;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.component.CompImportGoogle;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32650g;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u001fH\u0002J\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u001fH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \u000f*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u000f*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u000f*\u0004\u0018\u00010\u00160\u0016X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u000f*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u000f*\u0004\u0018\u00010\u00110\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \u000f*\u0004\u0018\u00010\u001a0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView;", "realView", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "compImportGoogle", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle;", "getCompImportGoogle", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle;", "getContext", "()Landroid/content/Context;", "fragmentContainer", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "importExchangeLl", "Landroid/widget/LinearLayout;", "importExchangeTips", "importGoogleLine", "importGoogleLl", "importGoogleTv", "Landroid/widget/TextView;", "importLocalLine", "importLocalLl", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "viewDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView$ViewDelegate;", "viewRoot", "create", "", "destroy", "finishActivity", "isNeedSetResult", "", "getFragmentContainerLayout", "initView", "setViewDelegate", "showBindFailToast", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.e */
public final class ImportCalendarView implements ImportCalendarContract.IGoogleCalendarSettingView {

    /* renamed from: a */
    public ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate f76038a;

    /* renamed from: b */
    private final CompImportGoogle f76039b = new CompImportGoogle();

    /* renamed from: c */
    private final View f76040c;

    /* renamed from: d */
    private final LinearLayout f76041d;

    /* renamed from: e */
    private final LinearLayout f76042e;

    /* renamed from: f */
    private final LinearLayout f76043f;

    /* renamed from: g */
    private final TextView f76044g;

    /* renamed from: h */
    private final View f76045h;

    /* renamed from: i */
    private final LinearLayout f76046i;

    /* renamed from: j */
    private final View f76047j;

    /* renamed from: k */
    private final CommonTitleBar f76048k;

    /* renamed from: l */
    private final FrameLayout f76049l;

    /* renamed from: m */
    private final Context f76050m;

    /* renamed from: c */
    public final Context mo109662c() {
        return this.f76050m;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f76039b.mo109610d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingView
    /* renamed from: b */
    public void mo109600b() {
        LKUIToast.show(this.f76050m, C32634ae.m125182b(R.string.Calendar_GoogleCal_ImportGoogleFailed));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m112893d();
        this.f76039b.mo109609c();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingView
    /* renamed from: a */
    public View mo109598a() {
        FrameLayout frameLayout = this.f76049l;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "fragmentContainer");
        return frameLayout;
    }

    /* renamed from: d */
    private final void m112893d() {
        if (C30022a.f74883b.mo112712t()) {
            this.f76048k.setTitle(C32634ae.m125182b(R.string.Calendar_Sync_AddThirdPartyCalendarTitle));
        } else {
            this.f76048k.setTitle(C32634ae.m125182b(R.string.Calendar_GoogleCal_ImportCalendars));
        }
        TextView textView = this.f76044g;
        Intrinsics.checkExpressionValueIsNotNull(textView, "importGoogleTv");
        textView.setText(C32634ae.m125182b(R.string.Calendar_GoogleCal_Title));
        ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate aVar = this.f76038a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        if (!aVar.mo109604d()) {
            this.f76048k.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        }
        this.f76048k.setLeftClickListener(new C30366a(this));
        if (!C30022a.f74883b.mo112712t()) {
            LinearLayout linearLayout = this.f76041d;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "importExchangeLl");
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.f76042e;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "importExchangeTips");
            linearLayout2.setVisibility(8);
        }
        this.f76041d.setOnClickListener(new C30367b(this));
        CompImportGoogle aVar2 = this.f76039b;
        LinearLayout linearLayout3 = this.f76043f;
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "importGoogleLl");
        aVar2.mo109605a(linearLayout3);
        this.f76046i.setOnClickListener(new C30368c(this));
        ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate aVar3 = this.f76038a;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        if (aVar3.mo109603c()) {
            ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate aVar4 = this.f76038a;
            if (aVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
            }
            if (aVar4.mo109604d()) {
                LinearLayout linearLayout4 = this.f76046i;
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "importLocalLl");
                linearLayout4.setVisibility(8);
                View view = this.f76047j;
                Intrinsics.checkExpressionValueIsNotNull(view, "importLocalLine");
                view.setVisibility(8);
            }
        }
        if (C30022a.f74883b.mo112694b()) {
            LinearLayout linearLayout5 = this.f76043f;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "importGoogleLl");
            linearLayout5.setVisibility(8);
            View view2 = this.f76045h;
            Intrinsics.checkExpressionValueIsNotNull(view2, "importGoogleLine");
            view2.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView$initView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.e$a */
    public static final class C30366a extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarView f76051a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30366a(ImportCalendarView eVar) {
            this.f76051a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Context c = this.f76051a.mo109662c();
            if (c != null) {
                ((Activity) c).finish();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView$initView$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.e$b */
    public static final class C30367b extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarView f76052a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30367b(ImportCalendarView eVar) {
            this.f76052a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            GeneralHitPoint.f83331a.mo118715B("exchange");
            ImportCalendarView.m112892a(this.f76052a).mo109601a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarView$initView$3", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.e$c */
    public static final class C30368c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ImportCalendarView f76053a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30368c(ImportCalendarView eVar) {
            this.f76053a = eVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.e$c$a */
        static final class C30369a implements C32650g.AbstractC32653a {

            /* renamed from: a */
            final /* synthetic */ C30368c f76054a;

            C30369a(C30368c cVar) {
                this.f76054a = cVar;
            }

            @Override // com.ss.android.lark.calendar.impl.utils.C32650g.AbstractC32653a
            /* renamed from: a */
            public final void mo109663a(boolean z) {
                if (z) {
                    if (ImportCalendarView.m112892a(this.f76054a.f76053a).mo109604d()) {
                        this.f76054a.f76053a.mo109599a(true);
                    } else {
                        ImportCalendarView.m112892a(this.f76054a.f76053a).mo109602b();
                    }
                    GeneralHitPoint.f83331a.mo118715B("local");
                    EventBus.getDefault().trigger(new C32493l());
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            Context c = this.f76053a.mo109662c();
            if (c != null) {
                C32650g.m125313b((Activity) c);
                C32650g.m125310a((Activity) this.f76053a.mo109662c(), new C30369a(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public void setViewDelegate(ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f76038a = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate m112892a(ImportCalendarView eVar) {
        ImportCalendarContract.IGoogleCalendarSettingView.ViewDelegate aVar = eVar.f76038a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewDelegate");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarContract.IGoogleCalendarSettingView
    /* renamed from: a */
    public void mo109599a(boolean z) {
        Context context = this.f76050m;
        if (context instanceof Activity) {
            if (z) {
                ((Activity) context).setResult(-1);
            }
            ((Activity) this.f76050m).finish();
        }
    }

    public ImportCalendarView(View view, Context context) {
        Intrinsics.checkParameterIsNotNull(view, "realView");
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f76050m = context;
        this.f76040c = view;
        this.f76041d = (LinearLayout) view.findViewById(R.id.importExchangeLl);
        this.f76042e = (LinearLayout) view.findViewById(R.id.importExchangeTips);
        this.f76043f = (LinearLayout) view.findViewById(R.id.importGoogleLl);
        this.f76044g = (TextView) view.findViewById(R.id.importGoogleTv);
        this.f76045h = view.findViewById(R.id.googleCalendarLine);
        this.f76046i = (LinearLayout) view.findViewById(R.id.importLocalLl);
        this.f76047j = view.findViewById(R.id.localCalendarLine);
        this.f76048k = (CommonTitleBar) view.findViewById(R.id.titleBar);
        this.f76049l = (FrameLayout) view.findViewById(R.id.fragmentContainer);
    }
}
