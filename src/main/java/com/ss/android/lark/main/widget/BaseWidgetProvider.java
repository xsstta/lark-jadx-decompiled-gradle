package com.ss.android.lark.main.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.router.RouterActivity;
import com.ss.android.lark.main.widget.presenter.UpdatePresenter;
import com.ss.android.lark.pb.ai.Event;
import com.ss.android.lark.pb.ai.GetSmartWidgetResponse;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.ttm.player.MediaPlayer;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH$J&\u0010\u001c\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH$J&\u0010\u001d\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH$JB\u0010\u001e\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H$J\u001a\u0010#\u001a\u00020$2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020\u0004H\u0004J\u0012\u0010&\u001a\u00020$2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0004J\u001c\u0010'\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J&\u0010*\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010+\u001a\u0004\u0018\u00010\u0019H\u0016J.\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020!2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0004R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00020\u000bX¤\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u00020\u0004X¤\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\u0013¨\u0006/"}, d2 = {"Lcom/ss/android/lark/main/widget/BaseWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "calendarSchema", "", "getCalendarSchema", "()Ljava/lang/String;", "countDownDispose", "Lio/reactivex/disposables/Disposable;", "dispose", "presenter", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "getPresenter", "()Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "setPresenter", "(Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;)V", "widgetSize", "getWidgetSize", "setWidgetSize", "(Ljava/lang/String;)V", "bindEmptyView", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "widgetids", "", "context", "Landroid/content/Context;", "bindLoadingView", "bindLoginView", "bindView", "events", "", "Lcom/ss/android/lark/pb/ai/Event;", "allDayEvents", "getOpenAppLinkIntent", "Landroid/app/PendingIntent;", "appLink", "getOpenCalendarIntent", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetIds", "startCountDownByCurrentEvent", "currentEvent", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseWidgetProvider extends AppWidgetProvider {

    /* renamed from: c */
    public static final Companion f112889c = new Companion(null);

    /* renamed from: a */
    public Disposable f112890a;

    /* renamed from: b */
    public Disposable f112891b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo157987a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo157988a(AppWidgetManager appWidgetManager, int[] iArr, Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo157989a(AppWidgetManager appWidgetManager, int[] iArr, Context context, List<Event> list, List<Event> list2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract UpdatePresenter mo157991b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo157992b(AppWidgetManager appWidgetManager, int[] iArr, Context context);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/main/widget/BaseWidgetProvider$Companion;", "", "()V", "ALL_DAY_HOUR_IN_DAY", "", "CLICK_VIEW_ACTION", "", "CLICK_VIEW_EXTRA", "EVENT_START_10_MIN", "MIUI_WIDGET_PRIORITY", "RETRY_TIMES", "", "UPDATE_ACTION", "getTimeRange", "context", "Landroid/content/Context;", "startTimeMillis", "endTimeMillis", "isAllDayEvent", "", "event", "Lcom/ss/android/lark/pb/ai/Event;", "isSameDay", "firstTime", "secondTime", "(Ljava/lang/Long;Ljava/lang/Long;)Z", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.BaseWidgetProvider$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo157996a(Event event) {
            Long l;
            Long longOrNull;
            Long longOrNull2;
            Intrinsics.checkParameterIsNotNull(event, "event");
            String str = event.mstart_time;
            Long l2 = null;
            if (str == null || (longOrNull2 = StringsKt.toLongOrNull(str)) == null) {
                l = null;
            } else {
                l = Long.valueOf(C44532a.m176698a(longOrNull2.longValue()));
            }
            String str2 = event.mend_time;
            if (!(str2 == null || (longOrNull = StringsKt.toLongOrNull(str2)) == null)) {
                l2 = Long.valueOf(C44532a.m176698a(longOrNull.longValue()));
            }
            if (l == null || l2 == null) {
                return false;
            }
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance, "startCalendar");
            instance.setTimeInMillis(l.longValue());
            instance.set(instance.get(1), instance.get(2), instance.get(5), 8, 0, 0);
            if (l2.longValue() - instance.getTimeInMillis() == TimeUnit.DAYS.toMillis(1)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo157997a(Long l, Long l2) {
            if (l == null || l2 == null) {
                return false;
            }
            return C26279i.m95156a(l.longValue(), l2.longValue());
        }

        /* renamed from: a */
        public final String mo157995a(Context context, long j, long j2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Date date = new Date(j);
            Date date2 = new Date(j2);
            if (mo157997a(Long.valueOf(j), Long.valueOf(j2))) {
                return TimeFormatUtils.m219281a(context, date, date2, (Options) null);
            }
            if (date.getYear() == date2.getYear()) {
                Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
                aVar.mo191593a(LengthType.SHORT);
                return TimeFormatUtils.m219284b(context, date, date2, aVar);
            }
            Options aVar2 = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
            aVar2.mo191593a(LengthType.LONG);
            return TimeFormatUtils.m219284b(context, date, date2, aVar2);
        }
    }

    /* renamed from: c */
    private final String m176681c() {
        boolean z;
        String string = C57744a.m224104a().getString("widget_provider_applink_pre");
        if (string != null) {
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "lark://" + string + "/client/calendar/view?type=week";
            }
        }
        return "lark://client/calendar/view?type=week";
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.BaseWidgetProvider$d */
    public static final class C44529d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C44529d f112897a = new C44529d();

        C44529d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Log.m165384e("WidgetProcess", th.getMessage(), th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.BaseWidgetProvider$f */
    static final class C44531f<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C44531f f112902a = new C44531f();

        C44531f() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Log.m165384e("WidgetProcess", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/ai/GetSmartWidgetResponse;", "it", "", "apply", "(Ljava/lang/Integer;)Lcom/ss/android/lark/pb/ai/GetSmartWidgetResponse;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.BaseWidgetProvider$b */
    public static final class C44527b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ BaseWidgetProvider f112892a;

        C44527b(BaseWidgetProvider baseWidgetProvider) {
            this.f112892a = baseWidgetProvider;
        }

        /* renamed from: a */
        public final GetSmartWidgetResponse apply(Integer num) {
            Intrinsics.checkParameterIsNotNull(num, "it");
            return this.f112892a.mo157991b().mo158003a(MapsKt.mutableMapOf(TuplesKt.to("product_line", "calendar"), TuplesKt.to("size", this.f112892a.mo157987a())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Integer;)V", "com/ss/android/lark/main/widget/BaseWidgetProvider$startCountDownByCurrentEvent$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.BaseWidgetProvider$e */
    static final class C44530e<T> implements Consumer<Integer> {

        /* renamed from: a */
        final /* synthetic */ BaseWidgetProvider f112898a;

        /* renamed from: b */
        final /* synthetic */ AppWidgetManager f112899b;

        /* renamed from: c */
        final /* synthetic */ int[] f112900c;

        /* renamed from: d */
        final /* synthetic */ Context f112901d;

        C44530e(BaseWidgetProvider baseWidgetProvider, AppWidgetManager appWidgetManager, int[] iArr, Context context) {
            this.f112898a = baseWidgetProvider;
            this.f112899b = appWidgetManager;
            this.f112900c = iArr;
            this.f112901d = context;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            int[] iArr;
            Context context;
            AppWidgetManager appWidgetManager = this.f112899b;
            if (!(appWidgetManager == null || (iArr = this.f112900c) == null || (context = this.f112901d) == null)) {
                this.f112898a.onUpdate(context, appWidgetManager, iArr);
            }
            Disposable disposable = this.f112898a.f112891b;
            if (disposable != null && !disposable.isDisposed()) {
                Disposable disposable2 = this.f112898a.f112891b;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                this.f112898a.f112891b = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PendingIntent mo157985a(Context context) {
        Intent intent = new Intent(context, RouterActivity.class);
        intent.setData(Uri.parse(m176681c() + "&widget_size=" + mo157987a()));
        intent.putExtra("product_line", "calendar");
        intent.putExtra("size", mo157987a());
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        Intrinsics.checkExpressionValueIsNotNull(activity, "PendingIntent.getActivit…ent, FLAG_UPDATE_CURRENT)");
        Intrinsics.checkExpressionValueIsNotNull(activity, "Intent(context, RouterAc…URRENT)\n                }");
        return activity;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/lark/pb/ai/GetSmartWidgetResponse;", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.BaseWidgetProvider$c */
    public static final class C44528c<T> implements Consumer<GetSmartWidgetResponse> {

        /* renamed from: a */
        final /* synthetic */ BaseWidgetProvider f112893a;

        /* renamed from: b */
        final /* synthetic */ AppWidgetManager f112894b;

        /* renamed from: c */
        final /* synthetic */ int[] f112895c;

        /* renamed from: d */
        final /* synthetic */ Context f112896d;

        C44528c(BaseWidgetProvider baseWidgetProvider, AppWidgetManager appWidgetManager, int[] iArr, Context context) {
            this.f112893a = baseWidgetProvider;
            this.f112894b = appWidgetManager;
            this.f112895c = iArr;
            this.f112896d = context;
        }

        /* renamed from: a */
        public final void accept(GetSmartWidgetResponse getSmartWidgetResponse) {
            List<Event> list;
            Long longOrNull;
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!(getSmartWidgetResponse == null || (list = getSmartWidgetResponse.mevents) == null)) {
                ArrayList arrayList3 = new ArrayList();
                for (T t : list) {
                    Companion aVar = BaseWidgetProvider.f112889c;
                    String str = t.mstart_time;
                    if (aVar.mo157997a((str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? null : Long.valueOf(C44532a.m176698a(longOrNull.longValue())), Long.valueOf(currentTimeMillis))) {
                        arrayList3.add(t);
                    }
                }
                for (T t2 : arrayList3) {
                    Companion aVar2 = BaseWidgetProvider.f112889c;
                    Intrinsics.checkExpressionValueIsNotNull(t2, "event");
                    if (aVar2.mo157996a(t2)) {
                        arrayList2.add(t2);
                    } else {
                        arrayList.add(t2);
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (!arrayList.isEmpty()) {
                this.f112893a.mo157989a(this.f112894b, this.f112895c, this.f112896d, arrayList, arrayList2);
            } else {
                this.f112893a.mo157988a(this.f112894b, this.f112895c, this.f112896d);
            }
            Disposable disposable = this.f112893a.f112890a;
            if (!(disposable == null || disposable.isDisposed())) {
                Disposable disposable2 = this.f112893a.f112890a;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                this.f112893a.f112890a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final PendingIntent mo157986a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(str, "appLink");
        Intent intent = new Intent(context, RouterActivity.class);
        intent.setData(Uri.parse(str + "&widget_size=" + mo157987a()));
        intent.putExtra("product_line", "calendar");
        intent.putExtra("size", mo157987a());
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        Intrinsics.checkExpressionValueIsNotNull(activity, "PendingIntent.getActivit…ent, FLAG_UPDATE_CURRENT)");
        Intrinsics.checkExpressionValueIsNotNull(activity, "Intent(context, RouterAc…URRENT)\n                }");
        return activity;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        String str3;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("widget provider onReceive, class=");
        sb.append(getClass());
        sb.append(", action=");
        int[] iArr = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        sb.append(str);
        Log.m165389i("WidgetProcess", sb.toString());
        if (intent != null) {
            str2 = intent.getAction();
        } else {
            str2 = null;
        }
        if (Intrinsics.areEqual("miui.appwidget.action.APPWIDGET_UPDATE", str2)) {
            int[] intArrayExtra = intent.getIntArrayExtra("appWidgetIds");
            if (intArrayExtra != null) {
                onUpdate(context, AppWidgetManager.getInstance(context), intArrayExtra);
                return;
            }
            return;
        }
        if (intent != null) {
            str3 = intent.getAction();
        } else {
            str3 = null;
        }
        if (!Intrinsics.areEqual("com.ss.android.lark.action.APPWIDGET_UPDATE", str3) || context == null) {
            super.onReceive(context, intent);
            return;
        }
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, getClass()));
        Log.m165383e("WidgetProcess", "onReceive: update widget from main process class=" + getClass() + ", ids=" + appWidgetIds);
        if (appWidgetIds != null) {
            if (appWidgetIds.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                iArr = appWidgetIds;
            }
            if (iArr != null) {
                onUpdate(context, AppWidgetManager.getInstance(context), appWidgetIds);
            }
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        if (!mo157991b().mo158004a()) {
            mo157992b(appWidgetManager, iArr, context);
        } else {
            this.f112890a = Observable.just(0).map(new C44527b(this)).retry(3).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C44528c(this, appWidgetManager, iArr, context), C44529d.f112897a);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo157990a(com.ss.android.lark.pb.ai.Event r10, android.appwidget.AppWidgetManager r11, int[] r12, android.content.Context r13) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.widget.BaseWidgetProvider.mo157990a(com.ss.android.lark.pb.ai.Event, android.appwidget.AppWidgetManager, int[], android.content.Context):void");
    }
}
