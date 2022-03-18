package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimeZoneItemData;
import com.ss.android.lark.calendar.impl.utils.TimeZoneUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0002J\u0012\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010#\u001a\u00020\u00162\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0016J\u0018\u0010%\u001a\u00020\u00162\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0016J\u0012\u0010'\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorModel;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;", "mSelectedTimeZoneId", "", "(Ljava/lang/String;)V", "isShowToast", "", "()Z", "setShowToast", "(Z)V", "mDeviceTimeZone", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "mRecentTimeZoneList", "Ljava/util/ArrayList;", "mSearchTimeZoneList", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "getSource", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "setSource", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;)V", "create", "", "deleteAllRecentTimeZone", "deleteRecentTimeZone", "timeZoneId", "destroy", "getDeviceTimeZoneId", "getSelectedTimeZoneId", "getTimeZoneDataById", "getViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewData;", "handleSelectTimeZoneId", "setDeviceTimeZone", "timeZoneData", "setRecentTomeZone", "recentTimeZoneIdList", "setSearchResult", "searchTimeZoneList", "setSelectedTimeZoneId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.h */
public final class TimeZoneSelectorModel implements ITimeZoneSelectorContract.ITimeZoneSelectorModel {

    /* renamed from: a */
    public TimeZoneItemData f82749a;

    /* renamed from: b */
    public final ArrayList<TimeZoneItemData> f82750b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<TimeZoneItemData> f82751c = new ArrayList<>();

    /* renamed from: d */
    private TimeZoneEnterView.Source f82752d = TimeZoneEnterView.Source.THREE_DAY;

    /* renamed from: e */
    private boolean f82753e = true;

    /* renamed from: f */
    private String f82754f;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public TimeZoneEnterView.Source mo112495a() {
        return this.f82752d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: b */
    public boolean mo112502b() {
        return this.f82753e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: c */
    public String mo112503c() {
        return this.f82754f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorModel$getViewData$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewData;", "getDeviceTimeZone", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "getRecentResult", "Ljava/util/ArrayList;", "getSearchResult", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.h$a */
    public static final class C32325a implements ITimeZoneSelectorContract.IViewData {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorModel f82755a;

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewData
        /* renamed from: a */
        public TimeZoneItemData mo112521a() {
            return this.f82755a.f82749a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewData
        /* renamed from: b */
        public ArrayList<TimeZoneItemData> mo112522b() {
            return this.f82755a.f82750b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.IViewData
        /* renamed from: c */
        public ArrayList<TimeZoneItemData> mo112523c() {
            return this.f82755a.f82751c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32325a(TimeZoneSelectorModel hVar) {
            this.f82755a = hVar;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: e */
    public void mo112505e() {
        this.f82750b.clear();
    }

    /* renamed from: g */
    public ITimeZoneSelectorContract.IViewData mo109793f() {
        return new C32325a(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: d */
    public String mo112504d() {
        TimeZoneItemData aVar = this.f82749a;
        if (aVar != null) {
            return aVar.mo112478d();
        }
        return null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f82750b.clear();
        this.f82751c.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, r1) != false) goto L_0x001c;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m123358h() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.search.calendar.TimeZoneSelectorModel.m123358h():void");
    }

    /* renamed from: a */
    public void mo118109a(TimeZoneEnterView.Source source) {
        Intrinsics.checkParameterIsNotNull(source, "<set-?>");
        this.f82752d = source;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public void mo112497a(String str) {
        this.f82754f = str;
        m123358h();
    }

    public TimeZoneSelectorModel(String str) {
        this.f82754f = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public void mo112496a(TimeZoneItemData aVar) {
        if (aVar != null) {
            if (TextUtils.isEmpty(this.f82754f) || Intrinsics.areEqual(this.f82754f, aVar.mo112478d())) {
                aVar.mo112475b(true);
            }
            this.f82749a = aVar;
        }
    }

    /* renamed from: c */
    private final TimeZoneItemData m123357c(String str) {
        TimeZone timeZone = TimeZone.getTimeZone(str);
        String a = TimeZoneUtils.m125205a(timeZone.getOffset(System.currentTimeMillis()) / 1000);
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timezone");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
        String displayName = timeZone.getDisplayName();
        Intrinsics.checkExpressionValueIsNotNull(displayName, "timezone.displayName");
        return new TimeZoneItemData(id, displayName, a);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public void mo112499a(boolean z) {
        this.f82753e = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: b */
    public void mo112500b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        for (T t : this.f82750b) {
            if (Intrinsics.areEqual(t.mo112478d(), str)) {
                this.f82750b.remove(t);
                return;
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: a */
    public void mo112498a(ArrayList<String> arrayList) {
        String str;
        this.f82750b.clear();
        if (arrayList != null) {
            for (T t : arrayList) {
                TimeZoneItemData aVar = this.f82749a;
                if (aVar != null) {
                    str = aVar.mo112478d();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(t, str)) {
                    TimeZoneItemData c = m123357c(t);
                    c.mo112475b(Intrinsics.areEqual(c.mo112478d(), this.f82754f));
                    this.f82750b.add(c);
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorModel
    /* renamed from: b */
    public void mo112501b(ArrayList<TimeZoneItemData> arrayList) {
        this.f82751c.clear();
        if (arrayList != null) {
            this.f82751c.addAll(arrayList);
        }
        for (T t : this.f82751c) {
            t.mo112475b(Intrinsics.areEqual(t.mo112478d(), this.f82754f));
        }
    }
}
