package com.ss.android.lark.calendar.impl.features.events.edit;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26256ah;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.log.Log;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\nH\u0002J \u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J.\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditApplinkEntrance;", "", "()V", "generateInstanceByEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "event", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "startTimeStr", "", "getServerEventIfNeed", "", "context", "Landroid/content/Context;", "startTime", "startEditActivity", "startEditActivityFromEditEventAppLink", "calendarId", "key", "originalTimeStr", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d */
public final class EditApplinkEntrance {

    /* renamed from: a */
    public static final Companion f80167a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditApplinkEntrance$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditApplinkEntrance$getServerEventIfNeed$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "events", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d$b */
    public static final class C31614b implements IGetDataCallback<List<? extends CalendarEvent>> {

        /* renamed from: a */
        final /* synthetic */ EditApplinkEntrance f80168a;

        /* renamed from: b */
        final /* synthetic */ String f80169b;

        /* renamed from: c */
        final /* synthetic */ String f80170c;

        /* renamed from: d */
        final /* synthetic */ Context f80171d;

        /* renamed from: e */
        final /* synthetic */ String f80172e;

        /* renamed from: f */
        final /* synthetic */ CalendarEvent f80173f;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditApplinkEntrance", C32673y.m125370a(this.f80169b, this.f80170c, errorResult));
            this.f80168a.mo114846b(this.f80171d, this.f80173f, this.f80172e);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarEvent> list) {
            String str;
            Intrinsics.checkParameterIsNotNull(list, "events");
            List<? extends CalendarEvent> list2 = list;
            if (CollectionUtils.isEmpty(list2)) {
                str = "null";
            } else {
                str = String.valueOf(list.size()) + "";
            }
            Log.m165389i("EditApplinkEntrance", C32673y.m125373a(this.f80169b, this.f80170c, "calendar_events_size", str));
            if (!CollectionUtils.isEmpty(list2)) {
                this.f80168a.mo114846b(this.f80171d, (CalendarEvent) list.get(0), this.f80172e);
            }
        }

        C31614b(EditApplinkEntrance dVar, String str, String str2, Context context, String str3, CalendarEvent calendarEvent) {
            this.f80168a = dVar;
            this.f80169b = str;
            this.f80170c = str2;
            this.f80171d = context;
            this.f80172e = str3;
            this.f80173f = calendarEvent;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "kotlin.jvm.PlatformType", "onLoadSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d$c */
    public static final class C31615c implements C30076a.AbstractC30082b {

        /* renamed from: a */
        final /* synthetic */ EditApplinkEntrance f80174a;

        /* renamed from: b */
        final /* synthetic */ CalendarEvent f80175b;

        /* renamed from: c */
        final /* synthetic */ String f80176c;

        /* renamed from: d */
        final /* synthetic */ Context f80177d;

        C31615c(EditApplinkEntrance dVar, CalendarEvent calendarEvent, String str, Context context) {
            this.f80174a = dVar;
            this.f80175b = calendarEvent;
            this.f80176c = str;
            this.f80177d = context;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.AbstractC30082b
        public final void onLoadSucceed(Calendar calendar) {
            CalendarEventInstance a = this.f80174a.mo114843a(this.f80175b, calendar, this.f80176c);
            AbstractC30023a a2 = EditActivityEntrance.f79940a.mo114662a(this.f80177d, true);
            a2.mo108154a("append_from_detail_page", true).mo108152a("calendarInstance", a);
            LargeCalendarTransmitHelper.m116184a(a2, this.f80175b);
            a2.mo108156b(this.f80177d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditApplinkEntrance$startEditActivityFromEditEventAppLink$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "event", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.d$d */
    public static final class C31616d implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ EditApplinkEntrance f80178a;

        /* renamed from: b */
        final /* synthetic */ String f80179b;

        /* renamed from: c */
        final /* synthetic */ String f80180c;

        /* renamed from: d */
        final /* synthetic */ Context f80181d;

        /* renamed from: e */
        final /* synthetic */ String f80182e;

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            boolean z;
            if (calendarEvent != null) {
                z = true;
            } else {
                z = false;
            }
            Log.m165389i("EditApplinkEntrance", C32673y.m125373a(this.f80179b, this.f80180c, "isEventExist", String.valueOf(z)));
            if (calendarEvent != null) {
                this.f80178a.mo114844a(this.f80181d, calendarEvent, this.f80182e);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("EditApplinkEntrance", C32673y.m125370a(this.f80179b, this.f80180c, errorResult));
            EditActivityEntrance.Companion.m118934a(EditActivityEntrance.f79940a, this.f80181d, new CalendarDate(), false, 4, (Object) null);
        }

        C31616d(EditApplinkEntrance dVar, String str, String str2, Context context, String str3) {
            this.f80178a = dVar;
            this.f80179b = str;
            this.f80180c = str2;
            this.f80181d = context;
            this.f80182e = str3;
        }
    }

    /* renamed from: b */
    public final void mo114846b(Context context, CalendarEvent calendarEvent, String str) {
        C30076a.m111290a().mo108424a(calendarEvent.getCalendarId(), new CallbackManager(), new C31615c(this, calendarEvent, str, context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance mo114843a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r7, com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar r8, java.lang.String r9) {
        /*
            r6 = this;
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance r0 = new com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance
            r0.<init>()
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r1 != 0) goto L_0x001c
            long r4 = java.lang.Long.parseLong(r9)     // Catch:{ Exception -> 0x0015 }
            goto L_0x001d
        L_0x0015:
            java.lang.String r9 = "EditApplinkEntrance"
            java.lang.String r1 = "invalid startTime"
            com.ss.android.lark.log.Log.m165383e(r9, r1)
        L_0x001c:
            r4 = r2
        L_0x001d:
            java.lang.String r9 = r7.getRRule()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0049
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x002e
            goto L_0x0049
        L_0x002e:
            r0.setStartTime(r4)
            long r1 = r7.getEndTime()
            long r4 = r4 + r1
            long r1 = r7.getStartTime()
            long r4 = r4 - r1
            r0.setEndTime(r4)
            r9 = 0
            if (r8 != 0) goto L_0x0045
            com.ss.android.lark.calendar.impl.utils.C32661n.m125344a(r0, r7, r9)
            goto L_0x0052
        L_0x0045:
            com.ss.android.lark.calendar.impl.utils.C32661n.m125343a(r0, r7, r8, r9)
            goto L_0x0052
        L_0x0049:
            if (r8 != 0) goto L_0x004f
            com.ss.android.lark.calendar.impl.utils.C32661n.m125341a(r0, r7)
            goto L_0x0052
        L_0x004f:
            com.ss.android.lark.calendar.impl.utils.C32661n.m125342a(r0, r7, r8)
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.EditApplinkEntrance.mo114843a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent, com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar, java.lang.String):com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance");
    }

    /* renamed from: a */
    public final void mo114844a(Context context, CalendarEvent calendarEvent, String str) {
        if (C26256ah.m95011a(calendarEvent.getServerId()) > 0) {
            String valueOf = String.valueOf(new Date().getTime());
            String serverId = calendarEvent.getServerId();
            Log.m165389i("EditApplinkEntrance", C32673y.m125376b(valueOf, "getServerEventForAppLink", "ser_ids", serverId));
            C32533b.m124620a().mo118873a(CollectionsKt.listOf(serverId), true, (IGetDataCallback<List<CalendarEvent>>) new CallbackManager().wrapAndAddGetDataCallback(new C31614b(this, valueOf, "getServerEventForAppLink", context, str, calendarEvent)));
            return;
        }
        mo114846b(context, calendarEvent, str);
    }

    /* renamed from: a */
    public final void mo114845a(Context context, String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(str3, "originalTimeStr");
        Intrinsics.checkParameterIsNotNull(str4, "startTime");
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String str5 = str3;
            if (!TextUtils.isEmpty(str5)) {
                long j = 0;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        j = Long.parseLong(str3);
                    } catch (Exception unused) {
                        Log.m165383e("EditApplinkEntrance", "invalid originalTime");
                    }
                }
                String valueOf = String.valueOf(new Date().getTime());
                Log.m165389i("EditApplinkEntrance", C32673y.m125376b(valueOf, "getSDKEventForAppLink", new String[0]));
                C32533b.m124620a().mo118878b(str, str2, j, new CallbackManager().wrapAndAddGetDataCallback(new C31616d(this, valueOf, "getSDKEventForAppLink", context, str4)));
                return;
            }
        }
        Log.m165383e("EditApplinkEntrance", "missing params");
    }
}
