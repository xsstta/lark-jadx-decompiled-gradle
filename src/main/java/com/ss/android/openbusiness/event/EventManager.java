package com.ss.android.openbusiness.event;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.netdata.C59570b;
import com.ss.android.openbusiness.data.netdata.C59571c;
import com.ss.android.openbusiness.data.netdata.C59572d;
import com.ss.android.openbusiness.data.netdata.C59573e;
import com.ss.android.openbusiness.event.p3008a.C59593a;
import com.ss.android.openbusiness.event.p3008a.C59594b;
import com.ss.android.openbusiness.event.p3008a.C59595c;
import com.ss.android.openbusiness.event.p3008a.C59596d;
import com.ss.android.openbusiness.event.p3008a.C59597e;
import com.ss.android.openbusiness.event.p3008a.C59598f;
import com.ss.android.openbusiness.p3003a.C59457d;
import com.ss.android.openbusiness.p3003a.C59460e;
import com.ss.android.openbusiness.p3006c.C59549f;
import com.ss.android.openbusiness.p3007d.AbstractC59555c;
import com.ss.android.openbusiness.p3007d.C59551b;
import com.ss.android.openbusiness.ui.StatusController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 32\u00020\u0001:\u000223B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ$\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020$H\u0007J\u0012\u0010%\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010&H\u0007J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020(H\u0007J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020*H\u0007J\u0016\u0010+\u001a\u00020\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\u0006\u0010-\u001a\u00020\u001dJ\u001e\u0010.\u001a\u00020\u001d2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001a2\u0006\u00100\u001a\u000201H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/openbusiness/event/EventManager;", "", "mContext", "Landroid/content/Context;", "mAdapter", "Lcom/ss/android/openbusiness/adapter/OpbAdapter;", "mStatusControl", "Lcom/ss/android/openbusiness/ui/StatusController;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mScene", "Lcom/ss/android/openbusiness/OpbScene;", "(Landroid/content/Context;Lcom/ss/android/openbusiness/adapter/OpbAdapter;Lcom/ss/android/openbusiness/ui/StatusController;Landroidx/recyclerview/widget/RecyclerView;Lcom/ss/android/openbusiness/OpbScene;)V", "mBeforeDragList", "Ljava/util/ArrayList;", "Lcom/ss/android/openbusiness/data/netdata/OpbBaseAppItem;", "Lkotlin/collections/ArrayList;", "mRequestUseUpdateConfigList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getMScene", "()Lcom/ss/android/openbusiness/OpbScene;", "setMScene", "(Lcom/ss/android/openbusiness/OpbScene;)V", "checkListEqual", "", "one", "", "two", "clear", "", "onOpbAppsOperate", "event", "Lcom/ss/android/openbusiness/event/eventdata/OpbAppsOperateEvent;", "onOpbUpdateConfig", "Lcom/ss/android/openbusiness/event/eventdata/OpbAppsUpdateConfigEvent;", "onOpenOpbApp", "Lcom/ss/android/openbusiness/event/eventdata/OpbOpenAppEvent;", "onRequestAppsData", "Lcom/ss/android/openbusiness/event/eventdata/OpbAppsRequestEvent;", "onRequestResult", "Lcom/ss/android/openbusiness/event/eventdata/OpbAppsResultEvent;", "onStartDrag", "Lcom/ss/android/openbusiness/event/eventdata/OpbStartDragEvent;", "refreshRequestAppsList", "list", "setUp", "updateConfig", "configApps", "callResult", "Lcom/ss/android/openbusiness/event/EventManager$CallResultWithList;", "CallResultWithList", "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EventManager {

    /* renamed from: e */
    public static final Companion f147876e = new Companion(null);

    /* renamed from: a */
    public final CopyOnWriteArrayList<C59572d> f147877a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public ArrayList<C59572d> f147878b = new ArrayList<>();

    /* renamed from: c */
    public final Context f147879c;

    /* renamed from: d */
    public final C59457d f147880d;

    /* renamed from: f */
    private final StatusController f147881f;

    /* renamed from: g */
    private final RecyclerView f147882g;

    /* renamed from: h */
    private OpbScene f147883h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/openbusiness/event/EventManager$CallResultWithList;", "", "onFail", "", "items", "", "Lcom/ss/android/openbusiness/data/netdata/OpbBaseAppItem;", "msg", "", "onSuccess", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$a */
    public interface CallResultWithList {
        /* renamed from: a */
        void mo202994a(List<? extends C59572d> list);

        /* renamed from: a */
        void mo202995a(List<? extends C59572d> list, String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/openbusiness/event/EventManager$onRequestAppsData$1", "Lcom/ss/android/openbusiness/net/OpbApiService$ICallResult;", "Lcom/ss/android/openbusiness/data/netdata/ExternalAppData;", "onFail", "", "errorMsg", "", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$f */
    public static final class C59580f implements AbstractC59555c.AbstractC59556a<C59570b> {

        /* renamed from: a */
        final /* synthetic */ EventManager f147893a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/openbusiness/event/EventManager$onRequestAppsData$1$onSuccess$innerTypeToken$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/ss/android/openbusiness/data/netdata/ResponseResult;", "Lcom/ss/android/openbusiness/data/netdata/MoreAppData;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.event.EventManager$f$b */
        public static final class C59582b extends TypeToken<C59573e<C59571c>> {
            C59582b() {
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59580f(EventManager eventManager) {
            this.f147893a = eventManager;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/openbusiness/event/EventManager$onRequestAppsData$1$onSuccess$1", "Lcom/ss/android/openbusiness/net/OpbApiService$ICallResult;", "Lcom/ss/android/openbusiness/data/netdata/MoreAppData;", "onFail", "", "errorMsg", "", "onSuccess", "innerData", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.event.EventManager$f$a */
        public static final class C59581a implements AbstractC59555c.AbstractC59556a<C59571c> {

            /* renamed from: a */
            final /* synthetic */ C59580f f147894a;

            /* renamed from: b */
            final /* synthetic */ C59570b f147895b;

            @Override // com.ss.android.openbusiness.p3007d.AbstractC59555c.AbstractC59556a
            /* renamed from: a */
            public void mo202803a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "errorMsg");
                Log.m165383e("Opb_EventManager", "request more apps data fail " + str);
                EventBus.getDefault().trigger(new C59595c());
            }

            /* renamed from: a */
            public void mo202801a(C59571c cVar) {
                ArrayList arrayList;
                ArrayList arrayList2;
                if (cVar != null) {
                    Log.m165389i("Opb_EventManager", "request more apps data success");
                    if (this.f147895b.mo202966b() != null) {
                        arrayList = this.f147895b.mo202966b();
                    } else {
                        arrayList = new ArrayList();
                    }
                    if (cVar.mo202968b() != null) {
                        arrayList2 = cVar.mo202968b();
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    OpbScene c = this.f147894a.f147893a.mo202987c();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(arrayList);
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(arrayList2);
                    Integer c2 = this.f147895b.mo202967c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "data.maxCommonItems");
                    EventBus.getDefault().trigger(new C59595c(c, copyOnWriteArrayList, copyOnWriteArrayList2, c2.intValue()));
                    return;
                }
                Log.m165383e("Opb_EventManager", "request more apps data fail");
                EventBus.getDefault().trigger(new C59595c());
            }

            C59581a(C59580f fVar, C59570b bVar) {
                this.f147894a = fVar;
                this.f147895b = bVar;
            }
        }

        /* renamed from: a */
        public void mo202801a(C59570b bVar) {
            if (bVar != null) {
                Log.m165389i("Opb_EventManager", "request external app data success");
                C59551b.m231043a().mo202934b(this.f147893a.mo202987c(), new C59582b(), new C59581a(this, bVar));
                return;
            }
            Log.m165383e("Opb_EventManager", "request external app data fail");
            EventBus.getDefault().trigger(new C59595c());
        }

        @Override // com.ss.android.openbusiness.p3007d.AbstractC59555c.AbstractC59556a
        /* renamed from: a */
        public void mo202803a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "errorMsg");
            Log.m165383e("Opb_EventManager", "request external app data fail " + str);
            EventBus.getDefault().trigger(new C59595c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/openbusiness/event/EventManager$Companion;", "", "()V", "TAG", "", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/ss/android/openbusiness/event/EventManager$onRequestAppsData$typeToken$1", "Lcom/google/gson/reflect/TypeToken;", "Lcom/ss/android/openbusiness/data/netdata/ResponseResult;", "Lcom/ss/android/openbusiness/data/netdata/ExternalAppData;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$g */
    public static final class C59583g extends TypeToken<C59573e<C59570b>> {
        C59583g() {
        }
    }

    /* renamed from: c */
    public final OpbScene mo202987c() {
        return this.f147883h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/openbusiness/event/EventManager$onOpbAppsOperate$1", "Lcom/ss/android/openbusiness/event/EventManager$CallResultWithList;", "onFail", "", "items", "", "Lcom/ss/android/openbusiness/data/netdata/OpbBaseAppItem;", "msg", "", "onSuccess", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$c */
    public static final class C59574c implements CallResultWithList {

        /* renamed from: a */
        final /* synthetic */ EventManager f147884a;

        /* renamed from: b */
        final /* synthetic */ C59572d f147885b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.event.EventManager$c$a */
        static final class RunnableC59575a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C59574c f147886a;

            RunnableC59575a(C59574c cVar) {
                this.f147886a = cVar;
            }

            public final void run() {
                this.f147886a.f147884a.f147880d.notifyDataSetChanged();
            }
        }

        @Override // com.ss.android.openbusiness.event.EventManager.CallResultWithList
        /* renamed from: a */
        public void mo202994a(List<? extends C59572d> list) {
            Intrinsics.checkParameterIsNotNull(list, "items");
            EventManager eventManager = this.f147884a;
            if (eventManager.mo202985a(eventManager.f147877a, list)) {
                Log.m165389i("Opb_EventManager", "update config success, refresh UI");
                this.f147884a.f147880d.mo202754c().clear();
                this.f147884a.f147880d.mo202754c().addAll(this.f147884a.f147877a);
                this.f147884a.f147880d.mo202755d().remove(this.f147885b);
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getUIExecutor().execute(new RunnableC59575a(this));
                return;
            }
            Log.m165383e("Opb_EventManager", "has new config request, ignore");
        }

        C59574c(EventManager eventManager, C59572d dVar) {
            this.f147884a = eventManager;
            this.f147885b = dVar;
        }

        @Override // com.ss.android.openbusiness.event.EventManager.CallResultWithList
        /* renamed from: a */
        public void mo202995a(List<? extends C59572d> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "items");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            EventManager eventManager = this.f147884a;
            if (eventManager.mo202985a(eventManager.f147877a, list)) {
                EventManager eventManager2 = this.f147884a;
                CopyOnWriteArrayList<C59572d> c = eventManager2.f147880d.mo202754c();
                Intrinsics.checkExpressionValueIsNotNull(c, "mAdapter.userConfigApps");
                eventManager2.mo202984a(c);
                UDToast.build(this.f147884a.f147879c).mo91641a(UDIconUtils.getIconDrawable(this.f147884a.f147879c, (int) R.drawable.ud_icon_more_close_outlined, UDColorUtils.getColor(this.f147884a.f147879c, R.color.static_white))).mo91637a(R.string.Lark_OpenPlatform_ScFailLoadMsg).mo91656k();
                return;
            }
            Log.m165383e("Opb_EventManager", "has new config request, ignore");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/openbusiness/event/EventManager$onOpbAppsOperate$2", "Lcom/ss/android/openbusiness/event/EventManager$CallResultWithList;", "onFail", "", "items", "", "Lcom/ss/android/openbusiness/data/netdata/OpbBaseAppItem;", "msg", "", "onSuccess", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$d */
    public static final class C59576d implements CallResultWithList {

        /* renamed from: a */
        final /* synthetic */ EventManager f147887a;

        /* renamed from: b */
        final /* synthetic */ C59572d f147888b;

        /* renamed from: c */
        final /* synthetic */ boolean f147889c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.event.EventManager$d$a */
        static final class RunnableC59577a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C59576d f147890a;

            RunnableC59577a(C59576d dVar) {
                this.f147890a = dVar;
            }

            public final void run() {
                this.f147890a.f147887a.f147880d.notifyDataSetChanged();
            }
        }

        @Override // com.ss.android.openbusiness.event.EventManager.CallResultWithList
        /* renamed from: a */
        public void mo202994a(List<? extends C59572d> list) {
            Intrinsics.checkParameterIsNotNull(list, "items");
            EventManager eventManager = this.f147887a;
            if (eventManager.mo202985a(eventManager.f147877a, list)) {
                Log.m165389i("Opb_EventManager", "update config success, refresh UI");
                this.f147887a.f147880d.mo202755d().add(0, this.f147888b);
                if (this.f147889c) {
                    this.f147887a.f147880d.mo202754c().clear();
                    this.f147887a.f147880d.mo202754c().addAll(this.f147887a.f147877a);
                    CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                    Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                    coreThreadPool.getUIExecutor().execute(new RunnableC59577a(this));
                    return;
                }
                Log.m165383e("Opb_EventManager", "item not present in list, ignore");
                return;
            }
            Log.m165383e("Opb_EventManager", "has new config request, ignore");
        }

        @Override // com.ss.android.openbusiness.event.EventManager.CallResultWithList
        /* renamed from: a */
        public void mo202995a(List<? extends C59572d> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "items");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            EventManager eventManager = this.f147887a;
            if (eventManager.mo202985a(eventManager.f147877a, list)) {
                EventManager eventManager2 = this.f147887a;
                CopyOnWriteArrayList<C59572d> c = eventManager2.f147880d.mo202754c();
                Intrinsics.checkExpressionValueIsNotNull(c, "mAdapter.userConfigApps");
                eventManager2.mo202984a(c);
                UDToast.build(this.f147887a.f147879c).mo91641a(UDIconUtils.getIconDrawable(this.f147887a.f147879c, (int) R.drawable.ud_icon_more_close_outlined, UDColorUtils.getColor(this.f147887a.f147879c, R.color.static_white))).mo91637a(R.string.Lark_OpenPlatform_ScFailLoadMsg).mo91656k();
                return;
            }
            Log.m165383e("Opb_EventManager", "has new config request, ignore");
        }

        C59576d(EventManager eventManager, C59572d dVar, boolean z) {
            this.f147887a = eventManager;
            this.f147888b = dVar;
            this.f147889c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/openbusiness/event/EventManager$updateConfig$1", "Lcom/ss/android/openbusiness/net/OpbApiService$ISimpleCallResult;", "onFail", "", "msg", "", "onSuccess", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$h */
    public static final class C59584h implements AbstractC59555c.AbstractC59557b {

        /* renamed from: a */
        final /* synthetic */ CallResultWithList f147896a;

        /* renamed from: b */
        final /* synthetic */ List f147897b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.event.EventManager$h$b */
        static final class RunnableC59586b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C59584h f147900a;

            RunnableC59586b(C59584h hVar) {
                this.f147900a = hVar;
            }

            public final void run() {
                this.f147900a.f147896a.mo202994a(this.f147900a.f147897b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.event.EventManager$h$a */
        static final class RunnableC59585a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C59584h f147898a;

            /* renamed from: b */
            final /* synthetic */ String f147899b;

            RunnableC59585a(C59584h hVar, String str) {
                this.f147898a = hVar;
                this.f147899b = str;
            }

            public final void run() {
                CallResultWithList aVar = this.f147898a.f147896a;
                List<? extends C59572d> list = this.f147898a.f147897b;
                String str = this.f147899b;
                if (str == null) {
                    str = "";
                }
                aVar.mo202995a(list, str);
            }
        }

        @Override // com.ss.android.openbusiness.p3007d.AbstractC59555c.AbstractC59557b
        /* renamed from: a */
        public void mo202935a() {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC59586b(this));
        }

        @Override // com.ss.android.openbusiness.p3007d.AbstractC59555c.AbstractC59557b
        /* renamed from: a */
        public void mo202936a(String str) {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getUIExecutor().execute(new RunnableC59585a(this, str));
        }

        C59584h(CallResultWithList aVar, List list) {
            this.f147896a = aVar;
            this.f147897b = list;
        }
    }

    /* renamed from: a */
    public final void mo202983a() {
        Log.m165389i("Opb_EventManager", "setUp");
        EventBus.getDefault().register(this);
    }

    /* renamed from: b */
    public final void mo202986b() {
        Log.m165389i("Opb_EventManager", "clear");
        EventBus.getDefault().unregister(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/openbusiness/event/EventManager$onOpbUpdateConfig$1", "Lcom/ss/android/openbusiness/event/EventManager$CallResultWithList;", "onFail", "", "items", "", "Lcom/ss/android/openbusiness/data/netdata/OpbBaseAppItem;", "msg", "", "onSuccess", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.event.EventManager$e */
    public static final class C59578e implements CallResultWithList {

        /* renamed from: a */
        final /* synthetic */ EventManager f147891a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.openbusiness.event.EventManager$e$a */
        static final class RunnableC59579a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C59578e f147892a;

            RunnableC59579a(C59578e eVar) {
                this.f147892a = eVar;
            }

            public final void run() {
                EventManager eventManager = this.f147892a.f147891a;
                CopyOnWriteArrayList<C59572d> c = this.f147892a.f147891a.f147880d.mo202754c();
                Intrinsics.checkExpressionValueIsNotNull(c, "mAdapter.userConfigApps");
                eventManager.mo202984a(c);
                this.f147892a.f147891a.f147880d.mo202753a(new C59460e(new CopyOnWriteArrayList(this.f147892a.f147891a.f147878b), this.f147892a.f147891a.f147880d.mo202755d()), this.f147892a.f147891a.f147880d.mo202756e());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59578e(EventManager eventManager) {
            this.f147891a = eventManager;
        }

        @Override // com.ss.android.openbusiness.event.EventManager.CallResultWithList
        /* renamed from: a */
        public void mo202994a(List<? extends C59572d> list) {
            Intrinsics.checkParameterIsNotNull(list, "items");
            EventManager eventManager = this.f147891a;
            if (eventManager.mo202985a(eventManager.f147877a, list)) {
                EventManager eventManager2 = this.f147891a;
                CopyOnWriteArrayList<C59572d> c = eventManager2.f147880d.mo202754c();
                Intrinsics.checkExpressionValueIsNotNull(c, "mAdapter.userConfigApps");
                eventManager2.mo202984a(c);
            }
            this.f147891a.f147878b.clear();
        }

        @Override // com.ss.android.openbusiness.event.EventManager.CallResultWithList
        /* renamed from: a */
        public void mo202995a(List<? extends C59572d> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "items");
            Intrinsics.checkParameterIsNotNull(str, "msg");
            EventManager eventManager = this.f147891a;
            if (eventManager.mo202985a(eventManager.f147877a, list)) {
                StringBuilder sb = new StringBuilder();
                Log.m165383e("Opb_EventManager", "resume ui after update config fail: " + ((Object) sb));
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getUIExecutor().execute(new RunnableC59579a(this));
                UDToast.build(this.f147891a.f147879c).mo91641a(UDIconUtils.getIconDrawable(this.f147891a.f147879c, (int) R.drawable.ud_icon_more_close_outlined, UDColorUtils.getColor(this.f147891a.f147879c, R.color.static_white))).mo91637a(R.string.Lark_OpenPlatform_ScFailLoadMsg).mo91656k();
                return;
            }
            Log.m165383e("Opb_EventManager", "has new config request, ignore");
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onRequestAppsData(C59594b bVar) {
        Log.m165389i("Opb_EventManager", "receive request event");
        C59551b.m231043a().mo202932a(this.f147883h, new C59583g(), new C59580f(this));
    }

    @Subscribe
    public final void onStartDrag(C59598f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "event");
        Log.m165389i("Opb_EventManager", "start drag, save before drag list");
        this.f147878b = new ArrayList<>(this.f147880d.mo202754c());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpbUpdateConfig(C59596d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "event");
        CopyOnWriteArrayList<C59572d> c = this.f147880d.mo202754c();
        Intrinsics.checkExpressionValueIsNotNull(c, "mAdapter.userConfigApps");
        mo202984a(c);
        m231101a(new ArrayList(this.f147880d.mo202754c()), new C59578e(this));
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpenOpbApp(C59597e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "event");
        Log.m165389i("Opb_EventManager", "receive open app event, " + eVar.mo203011b() + " scene: " + this.f147883h);
        C59549f.m231039a(this.f147883h, eVar.mo203012c());
        C59480b.m230865a().mo144874a(this.f147883h, eVar);
    }

    /* renamed from: a */
    public final void mo202984a(List<? extends C59572d> list) {
        Log.m165389i("Opb_EventManager", "refresh request list data: " + list.size());
        this.f147877a.clear();
        this.f147877a.addAll(list);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onRequestResult(C59595c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "event");
        Log.m165389i("Opb_EventManager", "receive request result, " + cVar.mo203008c());
        if (!cVar.mo203008c()) {
            this.f147881f.mo203016a(StatusController.Status.ERROR);
        } else if (cVar.mo203006a().size() == 0 && cVar.mo203007b().size() == 0) {
            this.f147881f.mo203016a(StatusController.Status.EMPTY);
        } else {
            this.f147881f.mo203016a(StatusController.Status.CONTENT);
            CopyOnWriteArrayList<C59572d> a = cVar.mo203006a();
            Intrinsics.checkExpressionValueIsNotNull(a, "event.external");
            mo202984a(a);
            this.f147880d.mo202753a(new C59460e(cVar.mo203006a(), cVar.mo203007b()), cVar.mo203009d());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onOpbAppsOperate(C59593a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        StringBuilder sb = new StringBuilder();
        sb.append("receive operate apps event ");
        sb.append(aVar.mo203003a());
        sb.append(",");
        sb.append(aVar.mo203005c());
        sb.append(",");
        C59572d b = aVar.mo203004b();
        Intrinsics.checkExpressionValueIsNotNull(b, "event.baseAppItem");
        sb.append(b.mo202974f());
        Log.m165389i("Opb_EventManager", sb.toString());
        C59572d b2 = aVar.mo203004b();
        if (!aVar.mo203003a()) {
            boolean remove = this.f147877a.remove(b2);
            if (remove) {
                m231101a(new ArrayList(this.f147877a), new C59576d(this, b2, remove));
            } else {
                Log.m165383e("Opb_EventManager", "item not present in list, ignore");
            }
        } else if (this.f147877a.contains(b2)) {
            Log.m165383e("Opb_EventManager", "already contains item, ignore");
        } else if (this.f147877a.size() >= this.f147880d.mo202756e()) {
            Log.m165383e("Opb_EventManager", "max count, ignore");
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_OpenPlatform_ScMaxFreqAppsMsg, "max_count", String.valueOf(this.f147880d.mo202756e()));
            Context context = this.f147879c;
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "msg");
            UDToast.show(context, mustacheFormat);
        } else {
            this.f147877a.add(b2);
            m231101a(new ArrayList(this.f147877a), new C59574c(this, b2));
        }
    }

    /* renamed from: a */
    private final void m231101a(List<? extends C59572d> list, CallResultWithList aVar) {
        ArrayList arrayList = new ArrayList();
        for (C59572d dVar : list) {
            String f = dVar.mo202974f();
            Intrinsics.checkExpressionValueIsNotNull(f, "item.appId");
            arrayList.add(f);
        }
        C59551b.m231043a().mo202933a(this.f147883h, arrayList, new C59584h(aVar, list));
    }

    /* renamed from: a */
    public final boolean mo202985a(List<? extends C59572d> list, List<? extends C59572d> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!Intrinsics.areEqual((C59572d) list2.get(i), t)) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    public EventManager(Context context, C59457d dVar, StatusController statusController, RecyclerView recyclerView, OpbScene opbScene) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(dVar, "mAdapter");
        Intrinsics.checkParameterIsNotNull(statusController, "mStatusControl");
        Intrinsics.checkParameterIsNotNull(recyclerView, "mRecyclerView");
        Intrinsics.checkParameterIsNotNull(opbScene, "mScene");
        this.f147879c = context;
        this.f147880d = dVar;
        this.f147881f = statusController;
        this.f147882g = recyclerView;
        this.f147883h = opbScene;
    }
}
