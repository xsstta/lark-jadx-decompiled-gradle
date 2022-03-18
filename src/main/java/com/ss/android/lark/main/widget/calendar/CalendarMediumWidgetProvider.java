package com.ss.android.lark.main.widget.calendar;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.router.RouterActivity;
import com.ss.android.lark.main.widget.BaseWidgetProvider;
import com.ss.android.lark.main.widget.presenter.UpdatePresenter;
import com.ss.android.lark.main.widget.ui.ListWidgetService;
import com.ss.android.lark.pb.ai.Event;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J<\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010 \u001a\u00020!H\u0002J&\u0010\"\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J&\u0010#\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014JB\u0010$\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0014J2\u0010&\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0004H\u0002J\u0012\u0010,\u001a\u00020-2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010.\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010/\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J&\u00100\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u00101\u001a\u0004\u0018\u00010\u00172\b\u00102\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00064"}, d2 = {"Lcom/ss/android/lark/main/widget/calendar/CalendarMediumWidgetProvider;", "Lcom/ss/android/lark/main/widget/BaseWidgetProvider;", "()V", "currentItemCount", "", "displayEventCount", "presenter", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "getPresenter", "()Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "setPresenter", "(Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;)V", "widgetSize", "", "getWidgetSize", "()Ljava/lang/String;", "setWidgetSize", "(Ljava/lang/String;)V", "bindEmptyView", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "widgetids", "", "context", "Landroid/content/Context;", "bindListView", "appWidgetId", "displayEvents", "", "Lcom/ss/android/lark/pb/ai/Event;", "allDayEvents", "remoteViews", "Landroid/widget/RemoteViews;", "bindLoadingView", "bindLoginView", "bindView", "events", "getCalendarItemView", "event", "index", "isAllDayEvent", "", "maxItemCount", "getPendingIntentTemplate", "Landroid/app/PendingIntent;", "onDisabled", "onEnabled", "onRestored", "oldWidgetIds", "newWidgetIds", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarMediumWidgetProvider extends BaseWidgetProvider {

    /* renamed from: d */
    public static final Lazy f112914d = LazyKt.lazy(C44539b.INSTANCE);

    /* renamed from: e */
    public static final Companion f112915e = new Companion(null);

    /* renamed from: j */
    private static final Integer[] f112916j = {Integer.valueOf((int) R.drawable.bg_widget_calendar_item_1), Integer.valueOf((int) R.drawable.bg_widget_calendar_item_2), Integer.valueOf((int) R.drawable.bg_widget_calendar_item_3)};

    /* renamed from: f */
    private String f112917f = "m";

    /* renamed from: g */
    private UpdatePresenter f112918g = f112915e.mo158022a();

    /* renamed from: h */
    private int f112919h;

    /* renamed from: i */
    private int f112920i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/main/widget/calendar/CalendarMediumWidgetProvider$Companion;", "", "()V", "DEFAULT_MAX_ITEM", "", "DRAWABLE_RES_ARRAY", "", "[Ljava/lang/Integer;", "MANUFACTURER_XIAOMI", "", "MAX_CALENDAR_NUM", "mediumWidgetPresenter", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "getMediumWidgetPresenter", "()Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "mediumWidgetPresenter$delegate", "Lkotlin/Lazy;", "isXiaomi", "", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.calendar.CalendarMediumWidgetProvider$a */
    public static final class Companion {
        /* renamed from: a */
        public final UpdatePresenter mo158022a() {
            Lazy lazy = CalendarMediumWidgetProvider.f112914d;
            Companion aVar = CalendarMediumWidgetProvider.f112915e;
            return (UpdatePresenter) lazy.getValue();
        }

        private Companion() {
        }

        /* renamed from: b */
        public final boolean mo158023b() {
            String str = Build.MANUFACTURER;
            Intrinsics.checkExpressionValueIsNotNull(str, "Build.MANUFACTURER");
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                return Intrinsics.areEqual(lowerCase, "xiaomi");
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: a */
    public String mo157987a() {
        return this.f112917f;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: b */
    public UpdatePresenter mo157991b() {
        return this.f112918g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.calendar.CalendarMediumWidgetProvider$b */
    static final class C44539b extends Lambda implements Function0<UpdatePresenter> {
        public static final C44539b INSTANCE = new C44539b();

        C44539b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UpdatePresenter invoke() {
            return new UpdatePresenter();
        }
    }

    /* renamed from: b */
    private final PendingIntent m176721b(Context context) {
        Intent intent = new Intent(context, RouterActivity.class);
        intent.putExtra("product_line", "calendar");
        intent.putExtra("size", "m");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        Intrinsics.checkExpressionValueIsNotNull(activity, "PendingIntent.getActivit…tent.FLAG_UPDATE_CURRENT)");
        Intrinsics.checkExpressionValueIsNotNull(activity, "Intent(context, RouterAc…URRENT)\n                }");
        return activity;
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
        if (context != null) {
            context.getSharedPreferences("lark_widget_provider_info", 0).edit().putBoolean("widget_enable_medium_calendar_widget", false).apply();
        }
        Log.m165389i("WidgetProcess", "medium widget disable");
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
        if (context != null) {
            context.getSharedPreferences("lark_widget_provider_info", 0).edit().putBoolean("widget_enable_medium_calendar_widget", true).apply();
        }
        Log.m165389i("WidgetProcess", "medium widget enable");
    }

    public void onRestored(Context context, int[] iArr, int[] iArr2) {
        super.onRestored(context, iArr, iArr2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: a */
    public void mo157988a(AppWidgetManager appWidgetManager, int[] iArr, Context context) {
        String str;
        if (iArr != null) {
            for (int i : iArr) {
                if (context != null) {
                    str = context.getPackageName();
                } else {
                    str = null;
                }
                RemoteViews remoteViews = new RemoteViews(str, (int) R.layout.widget_calendar_empty_medium_layout);
                remoteViews.setOnClickPendingIntent(R.id.background, mo157985a(context));
                Bundle bundle = new Bundle();
                bundle.putInt("miuiWidgetPriority", 3);
                if (appWidgetManager != null) {
                    appWidgetManager.updateAppWidgetOptions(i, bundle);
                }
                if (appWidgetManager != null) {
                    appWidgetManager.updateAppWidget(i, remoteViews);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: b */
    public void mo157992b(AppWidgetManager appWidgetManager, int[] iArr, Context context) {
        String str;
        if (iArr != null) {
            for (int i : iArr) {
                if (context != null) {
                    str = context.getPackageName();
                } else {
                    str = null;
                }
                RemoteViews remoteViews = new RemoteViews(str, (int) R.layout.widget_calendar_medium_login_layout);
                remoteViews.setOnClickPendingIntent(R.id.widget_btn_login, mo157985a(context));
                Bundle bundle = new Bundle();
                bundle.putInt("miuiWidgetPriority", 3);
                if (appWidgetManager != null) {
                    appWidgetManager.updateAppWidgetOptions(i, bundle);
                }
                if (appWidgetManager != null) {
                    appWidgetManager.updateAppWidget(i, remoteViews);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m176720a(Context context, int i, List<Event> list, List<Event> list2, RemoteViews remoteViews) {
        Intent intent = new Intent(context, ListWidgetService.class);
        intent.putExtra("appWidgetId", i);
        ListWidgetService.f112927c.mo158028a().clear();
        ListWidgetService.f112927c.mo158028a().addAll(list);
        ListWidgetService.f112927c.mo158029b().clear();
        ListWidgetService.f112927c.mo158029b().addAll(list2);
        Log.m165389i("WidgetProcess", "medium widget show, events=" + list + ", allDayEvents=" + list2);
        remoteViews.setRemoteAdapter(R.id.widget_calendar_list_layout, intent);
        remoteViews.setPendingIntentTemplate(R.id.widget_calendar_list_layout, m176721b(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.widget.RemoteViews m176719a(android.content.Context r18, com.ss.android.lark.pb.ai.Event r19, int r20, boolean r21, int r22) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.widget.calendar.CalendarMediumWidgetProvider.m176719a(android.content.Context, com.ss.android.lark.pb.ai.Event, int, boolean, int):android.widget.RemoteViews");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo157989a(android.appwidget.AppWidgetManager r25, int[] r26, android.content.Context r27, java.util.List<com.ss.android.lark.pb.ai.Event> r28, java.util.List<com.ss.android.lark.pb.ai.Event> r29) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.widget.calendar.CalendarMediumWidgetProvider.mo157989a(android.appwidget.AppWidgetManager, int[], android.content.Context, java.util.List, java.util.List):void");
    }
}
