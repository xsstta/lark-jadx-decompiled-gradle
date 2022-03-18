package com.ss.android.lark.calendar.impl.features.calendarview.diskcache;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.calendar.impl.framework.C32484a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.diskcache.DiskCache;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.ArrayList;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002J\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001c\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\bH\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\bH\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskCacheManager;", "", "()V", "mChipDataCache", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/ChipDiskData;", "Lkotlin/collections/ArrayList;", "mChipDiskDataInfo", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskDataInfo;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext$delegate", "Lkotlin/Lazy;", "checkReady", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "createDataInfo", "getChipDataCache", "isNeedSave", "startDay", "", "endDay", "diskCacheRange", "Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/IDiskCacheRange;", "loadDiskData", "saveChipDiskData", "chipData", "saveSettingDiskData", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "verifyDataUserInfo", "info", "verifyTimeZoneInfo", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.b */
public final class DiskCacheManager {

    /* renamed from: c */
    public static final Companion f77437c = new Companion(null);

    /* renamed from: a */
    public volatile ArrayList<ChipDiskData> f77438a;

    /* renamed from: b */
    public volatile DiskDataInfo f77439b;

    /* renamed from: d */
    private final Lazy f77440d = LazyKt.lazy(C30795d.INSTANCE);

    /* renamed from: a */
    public final Context mo111477a() {
        return (Context) this.f77440d.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/diskcache/DiskCacheManager$Companion;", "", "()V", "DATA_CHIP_FILE_NAME", "", "DATA_SETTING_FILE_NAME", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final ArrayList<ChipDiskData> mo111482b() {
        return this.f77438a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.b$d */
    static final class C30795d extends Lambda implements Function0<Context> {
        public static final C30795d INSTANCE = new C30795d();

        C30795d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            return new C32484a().mo118635a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.b$e */
    static final class RunnableC30796e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCacheManager f77445a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f77446b;

        RunnableC30796e(DiskCacheManager bVar, ArrayList arrayList) {
            this.f77445a = bVar;
            this.f77446b = arrayList;
        }

        public final void run() {
            ChipDataDiskData chipDataDiskData = new ChipDataDiskData(this.f77445a.mo111484c(), this.f77446b);
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
            String a = loginDependency.mo108269a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder….loginDependency().userId");
            DiskCache.f83772a.mo120343a(this.f77445a.mo111477a(), "calendar_instance_data", chipDataDiskData, a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.b$f */
    public static final class RunnableC30797f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCacheManager f77447a;

        /* renamed from: b */
        final /* synthetic */ CalendarSetting f77448b;

        RunnableC30797f(DiskCacheManager bVar, CalendarSetting calendarSetting) {
            this.f77447a = bVar;
            this.f77448b = calendarSetting;
        }

        public final void run() {
            SettingDiskData settingDiskData = new SettingDiskData(this.f77447a.mo111484c(), this.f77448b);
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
            String a = loginDependency.mo108269a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder….loginDependency().userId");
            DiskCache.f83772a.mo120343a(this.f77447a.mo111477a(), "calendar_setting_data", settingDiskData, a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.b$b */
    static final class RunnableC30793b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCacheManager f77441a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f77442b;

        RunnableC30793b(DiskCacheManager bVar, IGetDataCallback iGetDataCallback) {
            this.f77441a = bVar;
            this.f77442b = iGetDataCallback;
        }

        public final void run() {
            Object a = DiskCache.f83772a.mo120342a(this.f77441a.mo111477a(), "calendar_instance_data");
            if (!(a instanceof ChipDataDiskData)) {
                a = null;
            }
            ChipDataDiskData chipDataDiskData = (ChipDataDiskData) a;
            if (chipDataDiskData == null) {
                this.f77442b.onError(new ErrorResult("restore chip data error"));
            } else if (this.f77441a.mo111481a(chipDataDiskData.getInfo())) {
                this.f77441a.f77439b = chipDataDiskData.getInfo();
                this.f77441a.f77438a = chipDataDiskData.getChipData();
                this.f77441a.mo111483b(this.f77442b);
            } else {
                this.f77442b.onError(new ErrorResult("verify chip user info error"));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.diskcache.b$c */
    static final class RunnableC30794c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiskCacheManager f77443a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f77444b;

        RunnableC30794c(DiskCacheManager bVar, IGetDataCallback iGetDataCallback) {
            this.f77443a = bVar;
            this.f77444b = iGetDataCallback;
        }

        public final void run() {
            Object a = DiskCache.f83772a.mo120342a(this.f77443a.mo111477a(), "calendar_setting_data");
            if (!(a instanceof SettingDiskData)) {
                a = null;
            }
            SettingDiskData settingDiskData = (SettingDiskData) a;
            if (settingDiskData == null) {
                this.f77444b.onError(new ErrorResult("restore setting data error"));
            } else if (this.f77443a.mo111481a(settingDiskData.getInfo())) {
                C30022a.f74884c.mo108454b(settingDiskData.getCalendarSetting());
                this.f77443a.mo111483b(this.f77444b);
            } else {
                this.f77444b.onError(new ErrorResult("verify setting user info error"));
            }
        }
    }

    /* renamed from: c */
    public final DiskDataInfo mo111484c() {
        String mobileNormalViewTimezone = C30022a.f74884c.mo108456c().getMobileNormalViewTimezone();
        if (TextUtils.isEmpty(mobileNormalViewTimezone)) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            mobileNormalViewTimezone = timeZone.getID();
        }
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        String a = loginDependency.mo108269a();
        String str = "";
        if (a == null) {
            a = str;
        }
        AbstractC30054s loginDependency2 = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "CalendarDependencyHolder…endency.loginDependency()");
        String c = loginDependency2.mo108271c();
        if (c != null) {
            str = c;
        }
        Intrinsics.checkExpressionValueIsNotNull(mobileNormalViewTimezone, "timeZoneId");
        return new DiskDataInfo(str, a, mobileNormalViewTimezone);
    }

    /* renamed from: a */
    public final void mo111480a(CalendarSetting calendarSetting) {
        Intrinsics.checkParameterIsNotNull(calendarSetting, "setting");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC30797f(this, calendarSetting));
    }

    /* renamed from: b */
    public final void mo111483b(IGetDataCallback<Boolean> iGetDataCallback) {
        DiskDataInfo diskDataInfo = this.f77439b;
        if (diskDataInfo == null) {
            return;
        }
        if (m114876b(diskDataInfo)) {
            iGetDataCallback.onSuccess(true);
        } else {
            iGetDataCallback.onError(new ErrorResult("verify timezone info error"));
        }
    }

    /* renamed from: b */
    private final boolean m114876b(DiskDataInfo diskDataInfo) {
        String mobileNormalViewTimezone = C30022a.f74884c.mo108456c().getMobileNormalViewTimezone();
        if (TextUtils.isEmpty(mobileNormalViewTimezone)) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            mobileNormalViewTimezone = timeZone.getID();
        }
        return Intrinsics.areEqual(diskDataInfo.getTimeZone(), mobileNormalViewTimezone);
    }

    /* renamed from: a */
    public final void mo111478a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getFixedThreadPool().submit(new RunnableC30793b(this, iGetDataCallback));
        CoreThreadPool coreThreadPool2 = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool2, "CoreThreadPool.getDefault()");
        coreThreadPool2.getCachedThreadPool().submit(new RunnableC30794c(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final boolean mo111481a(DiskDataInfo diskDataInfo) {
        boolean z;
        boolean z2;
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        String a = loginDependency.mo108269a();
        String str = "";
        if (a == null) {
            a = str;
        }
        String userId = diskDataInfo.getUserId();
        if (TextUtils.isEmpty(userId) || !Intrinsics.areEqual(a, userId)) {
            z = false;
        } else {
            z = true;
        }
        AbstractC30054s loginDependency2 = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency2, "CalendarDependencyHolder…endency.loginDependency()");
        String c = loginDependency2.mo108271c();
        if (c != null) {
            str = c;
        }
        String tenantId = diskDataInfo.getTenantId();
        if (TextUtils.isEmpty(tenantId) || !Intrinsics.areEqual(str, tenantId)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo111479a(ChipDiskData chipDiskData, IDiskCacheRange cVar) {
        if (!(chipDiskData == null || cVar == null || !m114875a(chipDiskData.startDay(), chipDiskData.endDay(), cVar))) {
            ArrayList<ChipDiskData> arrayList = new ArrayList<>(cVar.mo110736a().size());
            arrayList.add(chipDiskData);
            ArrayList<ChipDiskData> arrayList2 = this.f77438a;
            if (arrayList2 != null) {
                for (T t : arrayList2) {
                    if (m114875a(t.startDay(), t.endDay(), cVar) && !t.hasSameDay(chipDiskData)) {
                        arrayList.add(t);
                    }
                }
            }
            this.f77438a = arrayList;
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getCachedThreadPool().submit(new RunnableC30796e(this, arrayList));
        }
    }

    /* renamed from: a */
    private final boolean m114875a(int i, int i2, IDiskCacheRange cVar) {
        for (DayRange aVar : cVar.mo110736a()) {
            if (i == aVar.mo111472a() && aVar.mo111473b() == i2) {
                return true;
            }
        }
        return false;
    }
}
