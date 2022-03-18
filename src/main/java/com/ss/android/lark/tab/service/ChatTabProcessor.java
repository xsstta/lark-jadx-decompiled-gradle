package com.ss.android.lark.tab.service;

import android.util.LruCache;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tab.service.IChatTabService;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 12\u00020\u0001:\u000201B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000f2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0018J\u001e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0016\u0010'\u001a\u00020\u001d2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J\u0016\u0010(\u001a\u00020\u001d2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0018J2\u0010*\u001a\u00020\u001d2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J$\u0010-\u001a\u00020\u001d2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020!H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R#\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/tab/service/ChatTabProcessor;", "", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "chatTabService", "Lcom/ss/android/lark/tab/service/IChatTabService;", "getChatTabService", "()Lcom/ss/android/lark/tab/service/IChatTabService;", "chatTabService$delegate", "Lkotlin/Lazy;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "executor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getExecutor", "()Ljava/util/concurrent/ExecutorService;", "executor$delegate", "observers", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/tab/service/ChatTabProcessor$ChatTabDataChangeObserver;", "Lkotlin/collections/ArrayList;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "addChatTab", "", "chatTab", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "addObserver", "observer", "deleteChatTab", "tabId", "getCacheData", "loadChatTabsFromLocal", "loadChatTabsFromNet", "removeObserver", "updateChatTab", "deleteIds", "reOrderIds", "updateChatTabOrders", "updateChatTabResult", "result", "ChatTabDataChangeObserver", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.service.a */
public final class ChatTabProcessor {

    /* renamed from: d */
    public static final LruCache<String, ChatTabProcessor> f136406d = new LruCache<>(5);

    /* renamed from: e */
    public static final Companion f136407e = new Companion(null);

    /* renamed from: a */
    public List<ChatTab> f136408a = new ArrayList();

    /* renamed from: b */
    public ArrayList<ChatTabDataChangeObserver> f136409b = new ArrayList<>();

    /* renamed from: c */
    public long f136410c = -1;

    /* renamed from: f */
    private final Lazy f136411f = LazyKt.lazy(C55280d.INSTANCE);

    /* renamed from: g */
    private final Lazy f136412g = LazyKt.lazy(C55282f.INSTANCE);

    /* renamed from: h */
    private final String f136413h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/tab/service/ChatTabProcessor$ChatTabDataChangeObserver;", "", "onChatTabDataChanged", "", "chatId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$a */
    public interface ChatTabDataChangeObserver {
        /* renamed from: a */
        void mo123868a(String str, List<ChatTab> list, long j);
    }

    /* renamed from: c */
    private final IChatTabService m214370c() {
        return (IChatTabService) this.f136411f.getValue();
    }

    /* renamed from: d */
    private final ExecutorService m214371d() {
        return (ExecutorService) this.f136412g.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/tab/service/ChatTabProcessor$Companion;", "", "()V", "POOL_NAME", "", "TAG", "cacheMap", "Landroid/util/LruCache;", "Lcom/ss/android/lark/tab/service/ChatTabProcessor;", "of", "chatId", "unInit", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ChatTabProcessor mo188387a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            ChatTabProcessor aVar = ChatTabProcessor.f136406d.get(str);
            if (aVar != null) {
                return aVar;
            }
            ChatTabProcessor aVar2 = new ChatTabProcessor(str);
            ChatTabProcessor.f136406d.put(str, aVar2);
            return aVar2;
        }
    }

    /* renamed from: a */
    public final List<ChatTab> mo188378a() {
        return this.f136408a;
    }

    /* renamed from: b */
    public final String mo188386b() {
        return this.f136413h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/tab/service/ChatTabService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$d */
    static final class C55280d extends Lambda implements Function0<ChatTabService> {
        public static final C55280d INSTANCE = new C55280d();

        C55280d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ChatTabService invoke() {
            return ChatTabService.f136426a.mo188394a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$f */
    static final class C55282f extends Lambda implements Function0<ExecutorService> {
        public static final C55282f INSTANCE = new C55282f();

        C55282f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("chat_tab");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$j */
    public static final class RunnableC55286j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatTabProcessor f136424a;

        /* renamed from: b */
        final /* synthetic */ ChatTabsListResult f136425b;

        RunnableC55286j(ChatTabProcessor aVar, ChatTabsListResult aVar2) {
            this.f136424a = aVar;
            this.f136425b = aVar2;
        }

        public final void run() {
            if (this.f136425b.mo188426b() >= this.f136424a.f136410c) {
                this.f136424a.f136408a = this.f136425b.mo188425a();
                this.f136424a.f136410c = this.f136425b.mo188426b();
                Iterator<T> it = this.f136424a.f136409b.iterator();
                while (it.hasNext()) {
                    it.next().mo123868a(this.f136424a.mo188386b(), this.f136424a.f136408a, this.f136424a.f136410c);
                }
            }
        }
    }

    /* renamed from: a */
    public final ChatTabProcessor mo188377a(ChatTabDataChangeObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f136409b.add(aVar);
        return this;
    }

    /* renamed from: b */
    public final ChatTabProcessor mo188385b(ChatTabDataChangeObserver aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "observer");
        this.f136409b.remove(aVar);
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/service/ChatTabProcessor$addChatTab$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$c */
    public static final class C55279c implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ ChatTabProcessor f136414a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f136415b;

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "result");
            this.f136414a.mo188382a(aVar);
            IGetDataCallback iGetDataCallback = this.f136415b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(aVar);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatTabLoader", "add chat tab failed " + errorResult.getDisplayMsg());
            IGetDataCallback iGetDataCallback = this.f136415b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        C55279c(ChatTabProcessor aVar, IGetDataCallback iGetDataCallback) {
            this.f136414a = aVar;
            this.f136415b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/service/ChatTabProcessor$deleteChatTab$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$e */
    public static final class C55281e implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ ChatTabProcessor f136416a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f136417b;

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "result");
            this.f136416a.mo188382a(aVar);
            IGetDataCallback iGetDataCallback = this.f136417b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(aVar);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatTabLoader", "delete chat tab failed " + errorResult.getDisplayMsg());
            IGetDataCallback iGetDataCallback = this.f136417b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        C55281e(ChatTabProcessor aVar, IGetDataCallback iGetDataCallback) {
            this.f136416a = aVar;
            this.f136417b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/service/ChatTabProcessor$loadChatTabsFromLocal$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$g */
    public static final class C55283g implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ ChatTabProcessor f136418a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f136419b;

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "result");
            this.f136418a.mo188382a(aVar);
            IGetDataCallback iGetDataCallback = this.f136419b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(aVar);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatTabLoader", "sync chat tab failed " + errorResult.getDisplayMsg());
            IGetDataCallback iGetDataCallback = this.f136419b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        C55283g(ChatTabProcessor aVar, IGetDataCallback iGetDataCallback) {
            this.f136418a = aVar;
            this.f136419b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/service/ChatTabProcessor$updateChatTab$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$h */
    public static final class C55284h implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ ChatTabProcessor f136420a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f136421b;

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "result");
            this.f136420a.mo188382a(aVar);
            IGetDataCallback iGetDataCallback = this.f136421b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(aVar);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatTabLoader", "update chat tab failed " + errorResult.getDisplayMsg());
            IGetDataCallback iGetDataCallback = this.f136421b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        C55284h(ChatTabProcessor aVar, IGetDataCallback iGetDataCallback) {
            this.f136420a = aVar;
            this.f136421b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/service/ChatTabProcessor$updateChatTabOrders$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.service.a$i */
    public static final class C55285i implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ ChatTabProcessor f136422a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f136423b;

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "result");
            this.f136422a.mo188382a(aVar);
            IGetDataCallback iGetDataCallback = this.f136423b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(aVar);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatTabLoader", "update chat tab orders failed " + errorResult.getDisplayMsg());
            IGetDataCallback iGetDataCallback = this.f136423b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        C55285i(ChatTabProcessor aVar, IGetDataCallback iGetDataCallback) {
            this.f136422a = aVar;
            this.f136423b = iGetDataCallback;
        }
    }

    public ChatTabProcessor(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f136413h = str;
    }

    /* renamed from: a */
    public final void mo188380a(IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        m214370c().mo188372a(this.f136413h, IChatTabService.SyncStrategy.OLD_THEN_TRIGGER, new C55283g(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo188382a(ChatTabsListResult aVar) {
        m214371d().execute(new RunnableC55286j(this, aVar));
    }

    /* renamed from: a */
    public final void mo188379a(long j, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        m214370c().mo188371a(this.f136413h, j, new C55281e(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo188381a(ChatTab chatTab, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(chatTab, "chatTab");
        m214370c().mo188373a(this.f136413h, chatTab.getName(), chatTab.getType(), chatTab.getPayloadString(), new C55279c(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo188383a(List<Long> list, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "reOrderIds");
        m214370c().mo188374a(this.f136413h, list, new C55285i(this, iGetDataCallback));
    }

    /* renamed from: a */
    public final void mo188384a(List<Long> list, List<Long> list2, IGetDataCallback<ChatTabsListResult> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "deleteIds");
        Intrinsics.checkParameterIsNotNull(list2, "reOrderIds");
        m214370c().mo188375a(this.f136413h, list, list2, new C55284h(this, iGetDataCallback));
    }
}
