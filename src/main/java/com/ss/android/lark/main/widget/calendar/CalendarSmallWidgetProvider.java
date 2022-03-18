package com.ss.android.lark.main.widget.calendar;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.widget.BaseWidgetProvider;
import com.ss.android.lark.main.widget.presenter.UpdatePresenter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J&\u0010\u0017\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J&\u0010\u0018\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014JB\u0010\u0019\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0014J\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\n2\b\u0010!\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\"\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010#\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/ss/android/lark/main/widget/calendar/CalendarSmallWidgetProvider;", "Lcom/ss/android/lark/main/widget/BaseWidgetProvider;", "()V", "presenter", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "getPresenter", "()Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "setPresenter", "(Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;)V", "widgetSize", "", "getWidgetSize", "()Ljava/lang/String;", "setWidgetSize", "(Ljava/lang/String;)V", "bindEmptyView", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "widgetids", "", "context", "Landroid/content/Context;", "bindLoadingView", "bindLoginView", "bindView", "events", "", "Lcom/ss/android/lark/pb/ai/Event;", "allDayEvent", "getLeftTime", "", "displayTimeStr", "startTimeStr", "onDisabled", "onEnabled", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSmallWidgetProvider extends BaseWidgetProvider {

    /* renamed from: d */
    public static final Lazy f112921d = LazyKt.lazy(C44540b.INSTANCE);

    /* renamed from: e */
    public static final Companion f112922e = new Companion(null);

    /* renamed from: f */
    private String f112923f = "s";

    /* renamed from: g */
    private UpdatePresenter f112924g = f112922e.mo158026a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/main/widget/calendar/CalendarSmallWidgetProvider$Companion;", "", "()V", "smallWidgetPresenter", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "getSmallWidgetPresenter", "()Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "smallWidgetPresenter$delegate", "Lkotlin/Lazy;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.calendar.CalendarSmallWidgetProvider$a */
    public static final class Companion {
        /* renamed from: a */
        public final UpdatePresenter mo158026a() {
            Lazy lazy = CalendarSmallWidgetProvider.f112921d;
            Companion aVar = CalendarSmallWidgetProvider.f112922e;
            return (UpdatePresenter) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: a */
    public String mo157987a() {
        return this.f112923f;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: b */
    public UpdatePresenter mo157991b() {
        return this.f112924g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.calendar.CalendarSmallWidgetProvider$b */
    static final class C44540b extends Lambda implements Function0<UpdatePresenter> {
        public static final C44540b INSTANCE = new C44540b();

        C44540b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UpdatePresenter invoke() {
            return new UpdatePresenter();
        }
    }

    public void onDisabled(Context context) {
        super.onDisabled(context);
        if (context != null) {
            context.getSharedPreferences("lark_widget_provider_info", 0).edit().putBoolean("sp_enable_small_calendar_widget", false).apply();
        }
        Log.m165389i("WidgetProcess", "small widget disable");
    }

    public void onEnabled(Context context) {
        super.onEnabled(context);
        if (context != null) {
            context.getSharedPreferences("lark_widget_provider_info", 0).edit().putBoolean("sp_enable_small_calendar_widget", true).apply();
        }
        Log.m165389i("WidgetProcess", "small widget enable");
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
                RemoteViews remoteViews = new RemoteViews(str, (int) R.layout.widget_calendar_small_empty_layout);
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
                RemoteViews remoteViews = new RemoteViews(str, (int) R.layout.widget_calendar_small_login_layout);
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c6  */
    @Override // com.ss.android.lark.main.widget.BaseWidgetProvider
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo157989a(android.appwidget.AppWidgetManager r26, int[] r27, android.content.Context r28, java.util.List<com.ss.android.lark.pb.ai.Event> r29, java.util.List<com.ss.android.lark.pb.ai.Event> r30) {
        /*
        // Method dump skipped, instructions count: 625
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.widget.calendar.CalendarSmallWidgetProvider.mo157989a(android.appwidget.AppWidgetManager, int[], android.content.Context, java.util.List, java.util.List):void");
    }
}
