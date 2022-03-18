package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimeZoneItemData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32490h;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.TimeZoneUtils;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001a2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\fH\u0002J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewAction;", "timeZoneView", "timeZoneModel", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;)V", "mDependency", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$Dependency;", "create", "", "getViewAction", "loadRecentSelectTimeZone", "modifyViewForDesktop", "onMiddleStatus", "searchTimeZoneByCity", "searchCity", "", "setDependency", "dependency", "setDeviceTimeZoneData", "setShowSelectedToast", "isShow", "", "Companion", "Dependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i */
public final class TimeZoneSelectorPresenter extends BasePresenterCalendar<ITimeZoneSelectorContract.ITimeZoneSelectorModel, ITimeZoneSelectorContract.ITimeZoneSelectorView, ITimeZoneSelectorContract.IViewData, ITimeZoneSelectorContract.IViewAction> {

    /* renamed from: b */
    public static final Companion f82756b = new Companion(null);

    /* renamed from: a */
    public Dependency f82757a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$Dependency;", "", "scrollToMiddleStatus", "", "scrollToTopStatus", "smoothDismissDialog", "timeZoneSelected", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$b */
    public interface Dependency {
        /* renamed from: a */
        void mo112545a();

        /* renamed from: a */
        void mo112546a(String str);

        /* renamed from: b */
        void mo112547b();

        /* renamed from: c */
        void mo112548c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public ITimeZoneSelectorContract.IViewAction mo109713b() {
        return new C32326c(this);
    }

    /* renamed from: c */
    public final void mo118115c() {
        ((ITimeZoneSelectorContract.ITimeZoneSelectorView) mo118651s()).mo112511e();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m123376d();
        m123377e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0017"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$getViewAction$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewAction;", "onClearAllRecentTimeZoneClick", "", "delTimeZoneIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onDeleteRecentTimeZoneClick", "delTimeZoneId", "onSearchCancelClick", "onSearchClick", "searchKey", "onSearchEditViewClick", "onTimeZoneSelected", "timeZoneId", "onTitleBarCloseClicked", "updateModelAndView", "needCloseDialog", "", "updateRecentTimeZone", "addTimeZoneId", "updateSelectTimeZone", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$c */
    public static final class C32326c implements ITimeZoneSelectorContract.IViewAction {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorPresenter f82758a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: a */
        public void mo112515a() {
            Dependency bVar = this.f82758a.f82757a;
            if (bVar != null) {
                bVar.mo112545a();
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82758a.mo118651s()).mo112512f();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: b */
        public void mo112518b() {
            Dependency bVar = this.f82758a.f82757a;
            if (bVar != null) {
                bVar.mo112547b();
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82758a.mo118651s()).mo112511e();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32326c(TimeZoneSelectorPresenter iVar) {
            this.f82758a = iVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$getViewAction$1$updateSelectTimeZone$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isSuc", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$c$d */
        public static final class C32330d implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C32326c f82768a;

            /* renamed from: b */
            final /* synthetic */ String f82769b;

            /* renamed from: c */
            final /* synthetic */ boolean f82770c;

            /* renamed from: d */
            final /* synthetic */ boolean f82771d;

            /* renamed from: e */
            final /* synthetic */ String f82772e;

            /* renamed from: f */
            final /* synthetic */ String f82773f;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C30022a.f74884c.mo108450a(new C32331a(this, bool));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82772e, this.f82773f, new String[0]));
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$c$d$a */
            public static final class C32331a implements C30086b.AbstractC30090a {

                /* renamed from: a */
                final /* synthetic */ C32330d f82774a;

                /* renamed from: b */
                final /* synthetic */ Boolean f82775b;

                C32331a(C32330d dVar, Boolean bool) {
                    this.f82774a = dVar;
                    this.f82775b = bool;
                }

                @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
                public final void onGetSucceed(CalendarSetting calendarSetting) {
                    String str;
                    Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
                    calendarSetting.setMobileNormalViewTimezone(this.f82774a.f82769b);
                    calendarSetting.setUseSystemMobileNormalViewTimezone(this.f82774a.f82770c);
                    EventBus.getDefault().trigger(new C32490h());
                    if (TextUtils.isEmpty(this.f82774a.f82769b)) {
                        TimeZone timeZone = TimeZone.getDefault();
                        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
                        str = timeZone.getID();
                    } else {
                        str = this.f82774a.f82769b;
                    }
                    C32326c cVar = this.f82774a.f82768a;
                    Intrinsics.checkExpressionValueIsNotNull(str, "viewTimeZoneId");
                    cVar.mo118116a(str, this.f82774a.f82771d);
                    Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82774a.f82772e, this.f82774a.f82773f, "isSuc", String.valueOf(this.f82775b)));
                }
            }

            C32330d(C32326c cVar, String str, boolean z, boolean z2, String str2, String str3) {
                this.f82768a = cVar;
                this.f82769b = str;
                this.f82770c = z;
                this.f82771d = z2;
                this.f82772e = str2;
                this.f82773f = str3;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: a */
        public void mo112516a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "searchKey");
            this.f82758a.mo118113a(str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$getViewAction$1$onClearAllRecentTimeZoneClick$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isUpdatedSuc", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$c$a */
        public static final class C32327a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C32326c f82759a;

            /* renamed from: b */
            final /* synthetic */ String f82760b;

            /* renamed from: c */
            final /* synthetic */ String f82761c;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82760b, this.f82761c, new String[0]));
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82760b, this.f82761c, new String[0]));
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82759a.f82758a.mo118652t()).mo112505e();
                    ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82759a.f82758a.mo118651s()).mo112508b();
                }
            }

            C32327a(C32326c cVar, String str, String str2) {
                this.f82759a = cVar;
                this.f82760b = str;
                this.f82761c = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$getViewAction$1$onDeleteRecentTimeZoneClick$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isUpdatedSuc", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$c$b */
        public static final class C32328b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C32326c f82762a;

            /* renamed from: b */
            final /* synthetic */ String f82763b;

            /* renamed from: c */
            final /* synthetic */ String f82764c;

            /* renamed from: d */
            final /* synthetic */ String f82765d;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82763b, this.f82764c, new String[0]));
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82763b, this.f82764c, new String[0]));
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82762a.f82758a.mo118652t()).mo112500b(this.f82765d);
                    ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82762a.f82758a.mo118651s()).mo112508b();
                }
            }

            C32328b(C32326c cVar, String str, String str2, String str3) {
                this.f82762a = cVar;
                this.f82763b = str;
                this.f82764c = str2;
                this.f82765d = str3;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$getViewAction$1$updateRecentTimeZone$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isUpdatedSuc", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$c$c */
        public static final class C32329c implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ String f82766a;

            /* renamed from: b */
            final /* synthetic */ String f82767b;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82766a, this.f82767b, new String[0]));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("TimeZoneSelectorPresenter", C32673y.m125373a(this.f82766a, this.f82767b, new String[0]));
            }

            C32329c(String str, String str2) {
                this.f82766a = str;
                this.f82767b = str2;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: b */
        public void mo112519b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            m123389d(str);
            if (((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112495a() == TimeZoneEnterView.Source.THREE_DAY || ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112495a() == TimeZoneEnterView.Source.ONE_DAY) {
                m123388b(str, true);
            } else {
                mo118116a(str, true);
            }
        }

        /* renamed from: d */
        private final void m123389d(String str) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125376b(valueOf, "addRecentTimeZone", new String[0]));
            UIGetDataCallback wrapAndAddGetDataCallback = this.f82758a.mo118653u().wrapAndAddGetDataCallback(new C32329c(valueOf, "addRecentTimeZone"));
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
            CalendarSDKService.f83473a.mo118947a(arrayList, new ArrayList(), wrapAndAddGetDataCallback);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: c */
        public void mo112520c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "delTimeZoneId");
            ArrayList arrayList = new ArrayList();
            if (Intrinsics.areEqual(((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112503c(), str)) {
                String d = ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112504d();
                if (d == null) {
                    d = "";
                }
                arrayList.add(d);
                m123388b(d, false);
            }
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125376b(valueOf, "onDeleteRecentTimeZone", new String[0]));
            UIGetDataCallback wrapAndAddGetDataCallback = this.f82758a.mo118653u().wrapAndAddGetDataCallback(new C32328b(this, valueOf, "onDeleteRecentTimeZone", str));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(str);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
            CalendarSDKService.f83473a.mo118947a(arrayList, arrayList2, wrapAndAddGetDataCallback);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: a */
        public void mo112517a(ArrayList<String> arrayList) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(arrayList, "delTimeZoneIds");
            Iterator<String> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (Intrinsics.areEqual(((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112503c(), it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                String d = ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112504d();
                if (d == null) {
                    d = "";
                }
                m123388b(d, false);
            }
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125376b(valueOf, "onDeleteAllRecentTimeZones", new String[0]));
            UIGetDataCallback wrapAndAddGetDataCallback = this.f82758a.mo118653u().wrapAndAddGetDataCallback(new C32327a(this, valueOf, "onDeleteAllRecentTimeZones"));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
            CalendarSDKService.f83473a.mo118947a(new ArrayList(), arrayList, wrapAndAddGetDataCallback);
        }

        /* renamed from: b */
        private final void m123388b(String str, boolean z) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            boolean areEqual = Intrinsics.areEqual(timeZone.getID(), str);
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i("TimeZoneSelectorPresenter", C32673y.m125376b(valueOf, "onSearchTimeZoneClick", new String[0]));
            UIGetDataCallback wrapAndAddGetDataCallback = this.f82758a.mo118653u().wrapAndAddGetDataCallback(new C32330d(this, str, areEqual, z, valueOf, "onSearchTimeZoneClick"));
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
            aVar.mo118944a(str, areEqual, wrapAndAddGetDataCallback);
        }

        /* renamed from: a */
        public final void mo118116a(String str, boolean z) {
            Dependency bVar = this.f82758a.f82757a;
            if (bVar != null) {
                bVar.mo112546a(str);
            }
            if (z) {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82758a.mo118651s()).mo112514h();
                Dependency bVar2 = this.f82758a.f82757a;
                if (bVar2 != null) {
                    bVar2.mo112548c();
                }
            } else {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112497a(str);
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82758a.mo118651s()).mo112513g();
            }
            if (((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82758a.mo118652t()).mo112502b()) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                String a = TimeZoneUtils.m125205a(timeZone.getOffset(System.currentTimeMillis()) / 1000);
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
                sb.append(timeZone.getDisplayName());
                sb.append("\n");
                sb.append(a);
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82758a.mo118651s()).mo112507a(sb.toString());
            }
        }
    }

    /* renamed from: e */
    private final void m123377e() {
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C32332d(this));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118958c(wrapAndAddGetDataCallback);
    }

    /* renamed from: d */
    private final void m123376d() {
        TimeZone timeZone = TimeZone.getDefault();
        String a = TimeZoneUtils.m125205a(timeZone.getOffset(System.currentTimeMillis()) / 1000);
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timezone");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
        String displayName = timeZone.getDisplayName();
        Intrinsics.checkExpressionValueIsNotNull(displayName, "timezone.displayName");
        ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) mo118652t()).mo112496a(new TimeZoneItemData(id, displayName, a));
        ((ITimeZoneSelectorContract.ITimeZoneSelectorView) mo118651s()).mo112506a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00062\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$loadRecentSelectTimeZone$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "timezoneIds", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$d */
    public static final class C32332d implements IGetDataCallback<ArrayList<String>> {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorPresenter f82776a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32332d(TimeZoneSelectorPresenter iVar) {
            this.f82776a = iVar;
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<String> arrayList) {
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82776a.mo118652t()).mo112498a(arrayList);
            ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82776a.mo118651s()).mo112508b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82776a.mo118652t()).mo112498a(new ArrayList<>());
            ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82776a.mo118651s()).mo112508b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorPresenter$searchTimeZoneByCity$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "searchResultData", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.i$e */
    public static final class C32333e implements IGetDataCallback<ArrayList<TimeZoneItemData>> {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorPresenter f82777a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32333e(TimeZoneSelectorPresenter iVar) {
            this.f82777a = iVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82777a.mo118652t()).mo112501b((ArrayList<TimeZoneItemData>) null);
            ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82777a.mo118651s()).mo112510d();
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<TimeZoneItemData> arrayList) {
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f82777a.mo118652t()).mo112501b(arrayList);
            if (CollectionUtils.isNotEmpty(arrayList)) {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82777a.mo118651s()).mo112509c();
            } else {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f82777a.mo118651s()).mo112510d();
            }
        }
    }

    /* renamed from: a */
    public final void mo118112a(Dependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f82757a = bVar;
    }

    /* renamed from: a */
    public final void mo118113a(String str) {
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C32333e(this));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118971j(str, wrapAndAddGetDataCallback);
    }

    /* renamed from: a */
    public final void mo118114a(boolean z) {
        ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) mo118652t()).mo112499a(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneSelectorPresenter(ITimeZoneSelectorContract.ITimeZoneSelectorView bVar, ITimeZoneSelectorContract.ITimeZoneSelectorModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bVar, "timeZoneView");
        Intrinsics.checkParameterIsNotNull(aVar, "timeZoneModel");
    }
}
