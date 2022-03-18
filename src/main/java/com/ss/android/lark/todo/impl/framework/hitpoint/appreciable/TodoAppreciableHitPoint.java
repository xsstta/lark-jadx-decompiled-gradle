package com.ss.android.lark.todo.impl.framework.hitpoint.appreciable;

import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001OB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015JH\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001cH\u0002J\"\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010!\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\"\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020\u0013J\u0006\u0010'\u001a\u00020\u0013J\u0006\u0010(\u001a\u00020\u0013J\u000e\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0010J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u0004J\u0016\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0006J\u0006\u00103\u001a\u00020\u0013J\u0006\u00104\u001a\u00020\u0013J\u0006\u00105\u001a\u00020\u0013J\u0016\u00106\u001a\u00020\u00132\u0006\u0010.\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00108\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u00109\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010:\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010;\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010<\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010=\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020\u0004J\u0006\u0010@\u001a\u00020\u0013J\u0006\u0010A\u001a\u00020\u0013J\u0006\u0010B\u001a\u00020\u0013J\u0006\u0010C\u001a\u00020\u0013J\u0006\u0010D\u001a\u00020\u0013J\u0006\u0010E\u001a\u00020\u0013J\u0006\u0010F\u001a\u00020\u0013J\u0006\u0010G\u001a\u00020\u0013J\u0006\u0010H\u001a\u00020\u0013J\u0006\u0010I\u001a\u00020\u0013J\u0006\u0010J\u001a\u00020\u0013J\u0006\u0010K\u001a\u00020\u0013J\u0006\u0010L\u001a\u00020\u0013J\u0006\u0010M\u001a\u00020\u0013J\u0006\u0010N\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R.\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000ej\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010`\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/hitpoint/appreciable/TodoAppreciableHitPoint;", "", "()V", "ERROR_CODE_NO_NETWORK", "", "isCenterLoadMore", "", "isChatTodoLoad", "isColdLaunchFinish", "isLoadDetail", "isLoadDetailSource", "isSwitchFilter", "itemCount", "keyMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/todo/impl/framework/hitpoint/appreciable/TodoAppreciableHitPoint$AppreciableKey;", "", "Lkotlin/collections/HashMap;", "addCommentReactionError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "appreciableEnd", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "extraCategory", "", "extraMetric", "appreciableError", "appreciableStart", "createTodoError", "deleteCommentError", "deleteCommentReactionError", "endChatTodoLoadFirstPage", "endChatTodoLoadMore", "endCommentAddReaction", "endCommentDelete", "endCommentDeleteReaction", "endCommentLoadFirstPage", "endCommentSend", "typeStr", "endDetailHistoryLoad", "endDetailHistoryLoadMore", "endTodoCenterLoadMore", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "endTodoColdLaunch", "category", "isListEmpty", "endTodoCreate", "endTodoDetailLoad", "endTodoDetailLoadSource", "endTodoSwitchFilter", "getTabStrByType", "loadCommentFirstPageError", "loadTodoDetailEditRecordError", "loadTodoDetailEditRecordMoreError", "loadTodoInChatFirstPageError", "loadTodoInChatMoreError", "sendCommentError", "setItemCount", "count", "startChatTodoLoadFirstPage", "startChatTodoLoadMore", "startCommentAddReaction", "startCommentDelete", "startCommentDeleteReaction", "startCommentLoadFirstPage", "startCommentSend", "startDetailHistoryLoad", "startDetailHistoryLoadMore", "startTodoCenterLoadMore", "startTodoColdLaunch", "startTodoCreate", "startTodoDetailLoad", "startTodoDetailLoadSource", "startTodoSwitchFilter", "AppreciableKey", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.framework.c.a.a */
public final class TodoAppreciableHitPoint {

    /* renamed from: a */
    public static final TodoAppreciableHitPoint f141058a = new TodoAppreciableHitPoint();

    /* renamed from: b */
    private static final HashMap<AppreciableKey, String> f141059b = new HashMap<>();

    /* renamed from: c */
    private static volatile boolean f141060c;

    /* renamed from: d */
    private static boolean f141061d;

    /* renamed from: e */
    private static boolean f141062e;

    /* renamed from: f */
    private static boolean f141063f;

    /* renamed from: g */
    private static boolean f141064g;

    /* renamed from: h */
    private static boolean f141065h;

    /* renamed from: i */
    private static int f141066i;

    private TodoAppreciableHitPoint() {
    }

    /* renamed from: a */
    public final void mo194133a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "category");
        if (!f141060c) {
            f141060c = true;
            HashMap hashMap = new HashMap();
            hashMap.put("tab", str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("item_count", Integer.valueOf(z ? 0 : f141066i));
            m221624a(Scene.TodoCenter, Event.todo_center_cold_launch, hashMap, hashMap2);
        }
    }

    /* renamed from: a */
    public final void mo194132a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "typeStr");
        HashMap hashMap = new HashMap();
        hashMap.put(ShareHitPoint.f121869d, str);
        m221625a(this, Scene.TodoComment, Event.todo_comment_send, hashMap, null, 8, null);
    }

    /* renamed from: h */
    public final void mo194151h() {
        m221622a(Scene.TodoDetail, Event.todo_detail_edit_record_load);
    }

    /* renamed from: i */
    public final void mo194153i() {
        m221622a(Scene.TodoDetail, Event.todo_detail_edit_record_load_more);
    }

    /* renamed from: j */
    public final void mo194155j() {
        m221622a(Scene.TodoCreate, Event.todo_create);
    }

    /* renamed from: l */
    public final void mo194158l() {
        m221622a(Scene.TodoComment, Event.todo_comment_load_first_page);
    }

    /* renamed from: n */
    public final void mo194160n() {
        m221622a(Scene.TodoComment, Event.todo_comment_send);
    }

    /* renamed from: o */
    public final void mo194161o() {
        m221622a(Scene.TodoComment, Event.todo_comment_delete);
    }

    /* renamed from: q */
    public final void mo194163q() {
        m221622a(Scene.TodoComment, Event.todo_comment_reaction_add);
    }

    /* renamed from: s */
    public final void mo194165s() {
        m221622a(Scene.TodoComment, Event.todo_comment_reaction_delete);
    }

    /* renamed from: v */
    public final void mo194168v() {
        m221622a(Scene.TodoListInChat, Event.todo_inchat_load_more);
    }

    /* renamed from: a */
    public final void mo194128a() {
        if (!f141060c) {
            m221622a(Scene.TodoCenter, Event.todo_center_cold_launch);
        }
    }

    /* renamed from: b */
    public final void mo194134b() {
        m221622a(Scene.TodoCenter, Event.todo_center_switch_filter);
        f141061d = true;
    }

    /* renamed from: c */
    public final void mo194138c() {
        m221622a(Scene.TodoCenter, Event.todo_center_load_more);
        f141062e = true;
    }

    /* renamed from: d */
    public final void mo194141d() {
        m221622a(Scene.TodoDetail, Event.todo_detail_load);
        f141063f = true;
    }

    /* renamed from: f */
    public final void mo194147f() {
        if (!f141064g) {
            m221622a(Scene.TodoDetail, Event.todo_detail_load_source);
            f141064g = true;
        }
    }

    /* renamed from: k */
    public final void mo194157k() {
        m221625a(this, Scene.TodoCreate, Event.todo_create, null, null, 12, null);
    }

    /* renamed from: m */
    public final void mo194159m() {
        m221625a(this, Scene.TodoComment, Event.todo_comment_load_first_page, null, null, 12, null);
    }

    /* renamed from: p */
    public final void mo194162p() {
        m221625a(this, Scene.TodoComment, Event.todo_comment_delete, null, null, 12, null);
    }

    /* renamed from: r */
    public final void mo194164r() {
        m221625a(this, Scene.TodoComment, Event.todo_comment_reaction_add, null, null, 12, null);
    }

    /* renamed from: t */
    public final void mo194166t() {
        m221625a(this, Scene.TodoComment, Event.todo_comment_reaction_delete, null, null, 12, null);
    }

    /* renamed from: u */
    public final void mo194167u() {
        m221622a(Scene.TodoListInChat, Event.todo_inchat_load_first_page);
        f141065h = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/hitpoint/appreciable/TodoAppreciableHitPoint$AppreciableKey;", "", "scene", "Lcom/ss/android/lark/appreciablelib/Scene;", "event", "Lcom/ss/android/lark/appreciablelib/Event;", "(Lcom/ss/android/lark/appreciablelib/Scene;Lcom/ss/android/lark/appreciablelib/Event;)V", "getEvent", "()Lcom/ss/android/lark/appreciablelib/Event;", "getScene", "()Lcom/ss/android/lark/appreciablelib/Scene;", "equals", "", "other", "hashCode", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.framework.c.a.a$a */
    public static final class AppreciableKey {

        /* renamed from: a */
        private final Scene f141067a;

        /* renamed from: b */
        private final Event f141068b;

        public int hashCode() {
            return Objects.hash(this.f141067a, this.f141068b);
        }

        public boolean equals(Object obj) {
            if (obj instanceof AppreciableKey) {
                AppreciableKey aVar = (AppreciableKey) obj;
                if (this.f141067a == aVar.f141067a && this.f141068b == aVar.f141068b) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public AppreciableKey(Scene scene, Event event) {
            Intrinsics.checkParameterIsNotNull(scene, "scene");
            Intrinsics.checkParameterIsNotNull(event, "event");
            this.f141067a = scene;
            this.f141068b = event;
        }
    }

    /* renamed from: e */
    public final void mo194144e() {
        if (f141063f) {
            m221625a(this, Scene.TodoDetail, Event.todo_detail_load, null, null, 12, null);
            f141063f = false;
        }
    }

    /* renamed from: g */
    public final void mo194149g() {
        if (f141064g) {
            m221625a(this, Scene.TodoDetail, Event.todo_detail_load_source, null, null, 12, null);
            f141064g = false;
        }
    }

    /* renamed from: a */
    public final void mo194129a(int i) {
        if (!f141060c) {
            f141066i = i;
        }
    }

    /* renamed from: b */
    public final void mo194137b(ErrorResult errorResult) {
        m221623a(Scene.TodoDetail, Event.todo_detail_edit_record_load_more, errorResult);
    }

    /* renamed from: c */
    public final void mo194140c(ErrorResult errorResult) {
        m221623a(Scene.TodoCreate, Event.todo_create, errorResult);
    }

    /* renamed from: d */
    public final void mo194143d(ErrorResult errorResult) {
        m221623a(Scene.TodoComment, Event.todo_comment_load_first_page, errorResult);
    }

    /* renamed from: e */
    public final void mo194146e(ErrorResult errorResult) {
        m221623a(Scene.TodoComment, Event.todo_comment_send, errorResult);
    }

    /* renamed from: f */
    public final void mo194148f(ErrorResult errorResult) {
        m221623a(Scene.TodoComment, Event.todo_comment_delete, errorResult);
    }

    /* renamed from: g */
    public final void mo194150g(ErrorResult errorResult) {
        m221623a(Scene.TodoComment, Event.todo_comment_reaction_add, errorResult);
    }

    /* renamed from: h */
    public final void mo194152h(ErrorResult errorResult) {
        m221623a(Scene.TodoComment, Event.todo_comment_reaction_delete, errorResult);
    }

    /* renamed from: i */
    public final void mo194154i(ErrorResult errorResult) {
        m221623a(Scene.TodoListInChat, Event.todo_inchat_load_first_page, errorResult);
    }

    /* renamed from: j */
    public final void mo194156j(ErrorResult errorResult) {
        m221623a(Scene.TodoListInChat, Event.todo_inchat_load_more, errorResult);
    }

    /* renamed from: b */
    public final void mo194135b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_count", Integer.valueOf(i));
        m221624a(Scene.TodoDetail, Event.todo_detail_edit_record_load, null, hashMap);
    }

    /* renamed from: c */
    public final void mo194139c(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_count", Integer.valueOf(i));
        m221624a(Scene.TodoDetail, Event.todo_detail_edit_record_load_more, null, hashMap);
    }

    /* renamed from: a */
    private final String m221621a(TodoListView.Type type) {
        switch (C57207b.f141069a[type.ordinal()]) {
            case 1:
                return "ongoing";
            case 2:
                return "assigned";
            case 3:
                return "received";
            case 4:
                return "completed";
            case 5:
                return "following";
            case 6:
                return "from_doc";
            default:
                return "";
        }
    }

    /* renamed from: d */
    public final void mo194142d(int i) {
        if (f141065h) {
            HashMap hashMap = new HashMap();
            hashMap.put("item_count", Integer.valueOf(i));
            m221624a(Scene.TodoListInChat, Event.todo_inchat_load_first_page, null, hashMap);
            f141065h = false;
        }
    }

    /* renamed from: e */
    public final void mo194145e(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_count", Integer.valueOf(i));
        m221624a(Scene.TodoListInChat, Event.todo_inchat_load_more, null, hashMap);
    }

    /* renamed from: a */
    public final void mo194131a(ErrorResult errorResult) {
        m221623a(Scene.TodoDetail, Event.todo_detail_edit_record_load, errorResult);
    }

    /* renamed from: a */
    private final void m221622a(Scene scene, Event event) {
        f141059b.put(new AppreciableKey(scene, event), AppreciableKit.m107386a(AppreciableKit.f73094h.mo103524a(), Biz.Todo, scene, event, (String) null, false, 16, (Object) null));
    }

    /* renamed from: b */
    public final void mo194136b(TodoListView.Type type, int i) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (f141062e) {
            HashMap hashMap = new HashMap();
            hashMap.put("tab", m221621a(type));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("item_count", Integer.valueOf(i));
            m221624a(Scene.TodoCenter, Event.todo_center_load_more, hashMap, hashMap2);
            f141062e = false;
        }
    }

    /* renamed from: a */
    public final void mo194130a(TodoListView.Type type, int i) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (f141061d) {
            HashMap hashMap = new HashMap();
            hashMap.put("tab", m221621a(type));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("item_count", Integer.valueOf(i));
            m221624a(Scene.TodoCenter, Event.todo_center_switch_filter, hashMap, hashMap2);
            f141061d = false;
        }
    }

    /* renamed from: a */
    private final void m221623a(Scene scene, Event event, ErrorResult errorResult) {
        ErrorType errorType;
        String str;
        Biz biz = Biz.Todo;
        if (errorResult == null || errorResult.getErrorCode() != 10008) {
            errorType = ErrorType.Other;
        } else {
            errorType = ErrorType.Network;
        }
        ErrorLevel errorLevel = ErrorLevel.Fatal;
        String name = event.name();
        if (errorResult != null) {
            str = errorResult.getMessage();
        } else {
            str = null;
        }
        AppreciableKit.f73094h.mo103524a().mo103514a(new ErrorParams(biz, scene, errorType, errorLevel, name, null, str, null, SmActions.ACTION_ONTHECALL_EXIT, null));
    }

    /* renamed from: a */
    private final void m221624a(Scene scene, Event event, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        HashMap<AppreciableKey, String> hashMap = f141059b;
        String str = hashMap.get(new AppreciableKey(scene, event));
        if (str != null) {
            AppreciableKit a = AppreciableKit.f73094h.mo103524a();
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            a.mo103518a(str, (String) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, map2, map);
            hashMap.put(new AppreciableKey(scene, event), null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.todo.impl.framework.c.a.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m221625a(TodoAppreciableHitPoint aVar, Scene scene, Event event, Map map, Map map2, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        aVar.m221624a(scene, event, map, map2);
    }
}
