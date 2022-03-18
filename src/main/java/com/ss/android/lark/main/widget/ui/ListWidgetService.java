package com.ss.android.lark.main.widget.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import com.ss.android.lark.pb.ai.Event;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/main/widget/ui/ListWidgetService;", "Landroid/widget/RemoteViewsService;", "()V", "onGetViewFactory", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "intent", "Landroid/content/Intent;", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ListWidgetService extends RemoteViewsService {

    /* renamed from: a */
    public static List<Event> f112925a = new ArrayList();

    /* renamed from: b */
    public static List<Event> f112926b = new ArrayList();

    /* renamed from: c */
    public static final Companion f112927c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/main/widget/ui/ListWidgetService$Companion;", "", "()V", "MAX_CALENDAR_NUM", "", "allDayEvents", "", "Lcom/ss/android/lark/pb/ai/Event;", "getAllDayEvents", "()Ljava/util/List;", "setAllDayEvents", "(Ljava/util/List;)V", "items", "getItems", "setItems", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.widget.ui.ListWidgetService$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final List<Event> mo158028a() {
            return ListWidgetService.f112925a;
        }

        /* renamed from: b */
        public final List<Event> mo158029b() {
            return ListWidgetService.f112926b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Context applicationContext = getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "this.applicationContext");
        return new ListRemoteViewsFactory(applicationContext, intent);
    }
}
