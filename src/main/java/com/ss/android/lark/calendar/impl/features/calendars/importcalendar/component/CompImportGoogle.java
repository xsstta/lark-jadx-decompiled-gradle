package com.ss.android.lark.calendar.impl.features.calendars.importcalendar.component;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarModel;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.log.Log;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/IComponent;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "callbackManager$delegate", "Lkotlin/Lazy;", "isDestroyed", "", "()Z", "setDestroyed", "(Z)V", "bindImportGoogleView", "", "importGoogle", "Landroid/view/View;", "compCreate", "compDestroy", "getGoogleAuthUrlForCal", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "importGoogleCalendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a.a */
public final class CompImportGoogle {

    /* renamed from: a */
    public final String f75980a = ImportCalendarModel.class.getSimpleName();

    /* renamed from: b */
    private boolean f75981b;

    /* renamed from: c */
    private final Lazy f75982c = LazyKt.lazy(C30344b.INSTANCE);

    /* renamed from: b */
    public final CallbackManager mo109608b() {
        return (CallbackManager) this.f75982c.getValue();
    }

    /* renamed from: c */
    public void mo109609c() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/larksuite/framework/callback/CallbackManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a.a$b */
    static final class C30344b extends Lambda implements Function0<CallbackManager> {
        public static final C30344b INSTANCE = new C30344b();

        C30344b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CallbackManager invoke() {
            return new CallbackManager();
        }
    }

    /* renamed from: a */
    public final boolean mo109607a() {
        return this.f75981b;
    }

    /* renamed from: d */
    public void mo109610d() {
        mo109608b().cancelCallbacks();
        this.f75981b = true;
    }

    /* renamed from: a */
    public final void mo109606a(IGetDataCallback<String> iGetDataCallback) {
        m112829b(iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle$bindImportGoogleView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a.a$a */
    public static final class C30342a extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ CompImportGoogle f75983a;

        /* renamed from: b */
        final /* synthetic */ View f75984b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle$bindImportGoogleView$1$doClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "url", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a.a$a$a */
        public static final class C30343a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ C30342a f75985a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30343a(C30342a aVar) {
                this.f75985a = aVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                if (!this.f75985a.f75983a.mo109607a()) {
                    LKUIToast.show(this.f75985a.f75984b.getContext(), C32634ae.m125182b(R.string.Calendar_GoogleCal_TryLater));
                }
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "url");
                if (!this.f75985a.f75983a.mo109607a() && !TextUtils.isEmpty(str)) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.addFlags(268435456);
                    try {
                        this.f75985a.f75984b.getContext().startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        LKUIToast.show(this.f75985a.f75984b.getContext(), C32634ae.m125182b(R.string.Calendar_GoogleCal_TryLater));
                    }
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            GeneralHitPoint.f83331a.mo118715B("google");
            CalendarHitPoint.m124108J();
            this.f75983a.mo109606a(new C30343a(this));
        }

        C30342a(CompImportGoogle aVar, View view) {
            this.f75983a = aVar;
            this.f75984b = view;
        }
    }

    /* renamed from: a */
    public final void mo109605a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "importGoogle");
        view.setOnClickListener(new C30342a(this, view));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/component/CompImportGoogle$getGoogleAuthUrlForCal$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "url", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a.a$c */
    public static final class C30345c implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ CompImportGoogle f75986a;

        /* renamed from: b */
        final /* synthetic */ String f75987b;

        /* renamed from: c */
        final /* synthetic */ String f75988c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f75989d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f75986a.f75980a, C32673y.m125370a(this.f75987b, this.f75988c, errorResult));
            this.f75989d.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Log.m165389i(this.f75986a.f75980a, C32673y.m125373a(this.f75987b, this.f75988c, new String[0]));
            if (!TextUtils.isEmpty(str)) {
                this.f75989d.onSuccess(str);
            } else {
                this.f75989d.onError(new ErrorResult("empty url"));
            }
        }

        C30345c(CompImportGoogle aVar, String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f75986a = aVar;
            this.f75987b = str;
            this.f75988c = str2;
            this.f75989d = iGetDataCallback;
        }
    }

    /* renamed from: b */
    private final void m112829b(IGetDataCallback<String> iGetDataCallback) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.f75980a, C32673y.m125376b(valueOf, "importGoogleCalendar", new String[0]));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = mo109608b().wrapAndAddGetDataCallback(new C30345c(this, valueOf, "importGoogleCalendar", iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        aVar.mo118927a(wrapAndAddGetDataCallback);
    }
}
