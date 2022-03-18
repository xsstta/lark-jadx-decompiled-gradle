package com.ss.android.lark.main.widget.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.widget.BaseWidgetProvider;
import com.ss.android.lark.main.widget.C44532a;
import com.ss.android.lark.main.widget.presenter.UpdatePresenter;
import com.ss.android.lark.pb.ai.Event;
import com.ss.android.lark.pb.ai.GetSmartWidgetResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\tH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006!"}, d2 = {"Lcom/ss/android/lark/main/widget/ui/ListRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;)V", "DRAWABLE_RES_ARRAY", "", "", "[Ljava/lang/Integer;", "getContext", "()Landroid/content/Context;", "getIntent", "()Landroid/content/Intent;", "presenter", "Lcom/ss/android/lark/main/widget/presenter/UpdatePresenter;", "widgetId", "Ljava/lang/Integer;", "getCount", "getItemId", "", "position", "getLoadingView", "Landroid/widget/RemoteViews;", "getViewAt", "getViewTypeCount", "hasStableIds", "", "onCreate", "", "onDataSetChanged", "onDestroy", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.widget.ui.a */
public final class ListRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a */
    private final Integer[] f112928a = {Integer.valueOf((int) R.drawable.bg_widget_calendar_item_1), Integer.valueOf((int) R.drawable.bg_widget_calendar_item_2), Integer.valueOf((int) R.drawable.bg_widget_calendar_item_3)};

    /* renamed from: b */
    private Integer f112929b;

    /* renamed from: c */
    private UpdatePresenter f112930c;

    /* renamed from: d */
    private final Context f112931d;

    /* renamed from: e */
    private final Intent f112932e;

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
        Log.m165389i("WidgetProcess", "ListRemoteViewsFactory#onCreate");
    }

    public int getCount() {
        return ListWidgetService.f112927c.mo158028a().size();
    }

    public void onDestroy() {
        ListWidgetService.f112927c.mo158028a().clear();
        ListWidgetService.f112927c.mo158029b().clear();
    }

    public void onDataSetChanged() {
        List<Event> list;
        Long l;
        Long longOrNull;
        Log.m165389i("WidgetProcess", "ListRemoteViewsFactory#onDataSetChanged， list=" + ListWidgetService.f112927c.mo158028a());
        if (ListWidgetService.f112927c.mo158028a().isEmpty()) {
            Log.m165397w("WidgetProcess", "ListRemoteViewsFactory onDataSetChanged，but data is empty, try request data again, synchronously.");
            if (this.f112930c == null) {
                this.f112930c = new UpdatePresenter();
            }
            try {
                UpdatePresenter aVar = this.f112930c;
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                GetSmartWidgetResponse a = aVar.mo158003a(MapsKt.mutableMapOf(TuplesKt.to("product_line", "calendar"), TuplesKt.to("size", "m")));
                long currentTimeMillis = System.currentTimeMillis();
                List arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!(a == null || (list = a.mevents) == null)) {
                    ArrayList<Event> arrayList3 = new ArrayList();
                    for (T t : list) {
                        BaseWidgetProvider.Companion aVar2 = BaseWidgetProvider.f112889c;
                        String str = t.mstart_time;
                        if (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) {
                            l = null;
                        } else {
                            l = Long.valueOf(C44532a.m176698a(longOrNull.longValue()));
                        }
                        if (aVar2.mo157997a(l, Long.valueOf(currentTimeMillis))) {
                            arrayList3.add(t);
                        }
                    }
                    for (Event event : arrayList3) {
                        BaseWidgetProvider.Companion aVar3 = BaseWidgetProvider.f112889c;
                        Intrinsics.checkExpressionValueIsNotNull(event, "event");
                        if (aVar3.mo157996a(event)) {
                            arrayList2.add(event);
                        } else {
                            arrayList.add(event);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
                if (arrayList.size() >= 3) {
                    arrayList = arrayList.subList(0, 3);
                }
                ListWidgetService.f112927c.mo158028a().clear();
                ListWidgetService.f112927c.mo158028a().addAll(arrayList);
                ListWidgetService.f112927c.mo158029b().clear();
                ListWidgetService.f112927c.mo158029b().addAll(arrayList2);
            } catch (Throwable th) {
                Log.m165384e("WidgetProcess", th.getMessage(), th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.RemoteViews getViewAt(int r19) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.widget.ui.ListRemoteViewsFactory.getViewAt(int):android.widget.RemoteViews");
    }

    public ListRemoteViewsFactory(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        this.f112931d = context;
        this.f112932e = intent;
        this.f112929b = Integer.valueOf(intent.getIntExtra("appWidgetId", 0));
    }
}
