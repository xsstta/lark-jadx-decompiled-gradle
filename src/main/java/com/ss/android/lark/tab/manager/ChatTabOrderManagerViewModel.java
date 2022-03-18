package com.ss.android.lark.tab.manager;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.tab.service.ChatTabProcessor;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.bl;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fJ\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010/\u001a\u00020\u001fH@ø\u0001\u0000¢\u0006\u0002\u00100J\u0006\u00101\u001a\u00020,J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@ø\u0001\u0000¢\u0006\u0002\u00103J\b\u00104\u001a\u00020,H\u0014J\u0014\u00105\u001a\u00020,2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001f0\nJ\u0006\u00107\u001a\u00020,J\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@ø\u0001\u0000¢\u0006\u0002\u00103R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001f0%j\b\u0012\u0004\u0012\u00020\u001f`&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lkotlinx/coroutines/CoroutineScope;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "chatTabListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "getChatTabListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setChatTabListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "errorResultLiveData", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getErrorResultLiveData", "setErrorResultLiveData", "modifiedTabIds", "", "getModifiedTabIds", "()Ljava/util/List;", "setModifiedTabIds", "(Ljava/util/List;)V", "removeIds", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getRemoveIds", "()Ljava/util/HashSet;", "setRemoveIds", "(Ljava/util/HashSet;)V", "addRemoveId", "", "id", "deleteChatTab", "deleteId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "modifyChatOrders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "reorderIds", "ids", "saveDeleteChange", "updateChatOrders", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.manager.b */
public final class ChatTabOrderManagerViewModel extends AbstractC1142af implements CoroutineScope {
    private final String chatId;
    private C1177w<List<ChatTab>> chatTabListLiveData = new C1177w<>();
    private final Lazy dispatcher$delegate = LazyKt.lazy(C55261b.INSTANCE);
    private C1177w<ErrorResult> errorResultLiveData = new C1177w<>();
    private List<Long> modifiedTabIds = new ArrayList();
    private HashSet<Long> removeIds = new HashSet<>();

    public final ExecutorCoroutineDispatcher getDispatcher() {
        return (ExecutorCoroutineDispatcher) this.dispatcher$delegate.getValue();
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final C1177w<List<ChatTab>> getChatTabListLiveData() {
        return this.chatTabListLiveData;
    }

    public final C1177w<ErrorResult> getErrorResultLiveData() {
        return this.errorResultLiveData;
    }

    public final List<Long> getModifiedTabIds() {
        return this.modifiedTabIds;
    }

    public final HashSet<Long> getRemoveIds() {
        return this.removeIds;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        C69364ai.m266267a(this, null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.b$b */
    static final class C55261b extends Lambda implements Function0<ExecutorCoroutineDispatcher> {
        public static final C55261b INSTANCE = new C55261b();

        C55261b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorCoroutineDispatcher invoke() {
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            ExecutorService fixedThreadPool = coreThreadPool.getFixedThreadPool();
            Intrinsics.checkExpressionValueIsNotNull(fixedThreadPool, "CoreThreadPool.getDefault().fixedThreadPool");
            return bl.m266382a(fixedThreadPool);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return cr.m266795a(null, 1, null).plus(Dispatchers.m266324b());
    }

    public final void load() {
        Job unused = C69553g.m266944a(this, null, null, new C55262c(this, null), 3, null);
    }

    public final void saveDeleteChange() {
        Job unused = C69553g.m266944a(this, null, null, new C55267f(this, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel$deleteChatTab$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.b$a */
    public static final class C55260a implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f136369a;

        C55260a(CancellableContinuation kVar) {
            this.f136369a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            CancellableContinuation kVar = this.f136369a;
            Result.Companion aVar2 = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(aVar.mo188425a()));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CancellableContinuation kVar = this.f136369a;
            Result.Companion aVar = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel$modifyChatOrders$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.b$d */
    public static final class C55265d implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f136371a;

        C55265d(CancellableContinuation kVar) {
            this.f136371a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            CancellableContinuation kVar = this.f136371a;
            Result.Companion aVar2 = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(aVar.mo188425a()));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CancellableContinuation kVar = this.f136371a;
            Result.Companion aVar = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/manager/ChatTabOrderManagerViewModel$updateChatOrders$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.manager.b$g */
    public static final class C55269g implements IGetDataCallback<ChatTabsListResult> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f136373a;

        C55269g(CancellableContinuation kVar) {
            this.f136373a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(ChatTabsListResult aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            CancellableContinuation kVar = this.f136373a;
            Result.Companion aVar2 = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(aVar.mo188425a()));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CancellableContinuation kVar = this.f136373a;
            Result.Companion aVar = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    public final void setChatTabListLiveData(C1177w<List<ChatTab>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.chatTabListLiveData = wVar;
    }

    public final void setErrorResultLiveData(C1177w<ErrorResult> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.errorResultLiveData = wVar;
    }

    public final void setModifiedTabIds(List<Long> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.modifiedTabIds = list;
    }

    public final void setRemoveIds(HashSet<Long> hashSet) {
        Intrinsics.checkParameterIsNotNull(hashSet, "<set-?>");
        this.removeIds = hashSet;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.tab.manager.ChatTabOrderManagerViewModel$load$1", mo239173f = "ChatTabOrderManagerViewModel.kt", mo239174i = {0}, mo239175l = {59}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.tab.manager.b$c */
    public static final class C55262c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ ChatTabOrderManagerViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55262c(ChatTabOrderManagerViewModel bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C55262c cVar2 = new C55262c(this.this$0, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C55262c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                if (C69388e.m266829a(this.this$0.getDispatcher(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                    /* class com.ss.android.lark.tab.manager.ChatTabOrderManagerViewModel.C55262c.C552631 */
                    int label;
                    private CoroutineScope p$;
                    final /* synthetic */ C55262c this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                        Intrinsics.checkParameterIsNotNull(cVar, "completion");
                        C552631 r0 = 

                        /* access modifiers changed from: package-private */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                        @DebugMetadata(mo239172c = "com.ss.android.lark.tab.manager.ChatTabOrderManagerViewModel$saveDeleteChange$1", mo239173f = "ChatTabOrderManagerViewModel.kt", mo239174i = {0}, mo239175l = {81}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                        /* renamed from: com.ss.android.lark.tab.manager.b$f */
                        public static final class C55267f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            Object L$0;
                            int label;
                            private CoroutineScope p$;
                            final /* synthetic */ ChatTabOrderManagerViewModel this$0;

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C55267f(ChatTabOrderManagerViewModel bVar, Continuation cVar) {
                                super(2, cVar);
                                this.this$0 = bVar;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                C55267f fVar = new C55267f(this.this$0, cVar);
                                fVar.p$ = (CoroutineScope) obj;
                                return fVar;
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                return ((C55267f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object a = C69086a.m265828a();
                                int i = this.label;
                                if (i == 0) {
                                    C69097g.m265891a(obj);
                                    this.L$0 = this.p$;
                                    this.label = 1;
                                    if (C69388e.m266829a(this.this$0.getDispatcher(), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                                        /* class com.ss.android.lark.tab.manager.ChatTabOrderManagerViewModel.C55267f.C552681 */
                                        Object L$0;
                                        int label;
                                        private CoroutineScope p$;
                                        final /* synthetic */ C55267f this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                            C552681 r0 = 

                                            public ChatTabOrderManagerViewModel(String str) {
                                                Intrinsics.checkParameterIsNotNull(str, "chatId");
                                                this.chatId = str;
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final /* synthetic */ Object modifyChatOrders(Continuation<? super List<ChatTab>> cVar) {
                                                CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
                                                lVar.mo243071d();
                                                ChatTabProcessor.f136407e.mo188387a(getChatId()).mo188383a(getModifiedTabIds(), new C55265d(lVar));
                                                Object g = lVar.mo243073g();
                                                if (g == C69086a.m265828a()) {
                                                    C69091e.m265847c(cVar);
                                                }
                                                return g;
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final /* synthetic */ Object updateChatOrders(Continuation<? super List<ChatTab>> cVar) {
                                                CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
                                                lVar.mo243071d();
                                                ChatTabProcessor.f136407e.mo188387a(getChatId()).mo188384a(CollectionsKt.toMutableList((Collection) getRemoveIds()), getModifiedTabIds(), new C55269g(lVar));
                                                Object g = lVar.mo243073g();
                                                if (g == C69086a.m265828a()) {
                                                    C69091e.m265847c(cVar);
                                                }
                                                return g;
                                            }

                                            public final void addRemoveId(long j) {
                                                boolean z;
                                                this.removeIds.add(Long.valueOf(j));
                                                List<ChatTab> b = this.chatTabListLiveData.mo5927b();
                                                if (b != null) {
                                                    ArrayList arrayList = new ArrayList();
                                                    for (T t : b) {
                                                        if (t.getId() == j) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (!z) {
                                                            arrayList.add(t);
                                                        }
                                                    }
                                                    this.chatTabListLiveData.mo5926a(arrayList);
                                                }
                                            }

                                            public final void reorderIds(List<Long> list) {
                                                List<ChatTab> list2;
                                                Intrinsics.checkParameterIsNotNull(list, "ids");
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                Iterator<T> it = list.iterator();
                                                int i = 0;
                                                while (it.hasNext()) {
                                                    linkedHashMap.put(Long.valueOf(it.next().longValue()), Integer.valueOf(i));
                                                    i++;
                                                }
                                                List<ChatTab> b = this.chatTabListLiveData.mo5927b();
                                                if (b != null) {
                                                    list2 = CollectionsKt.sortedWith(b, new C55266e(linkedHashMap));
                                                } else {
                                                    list2 = null;
                                                }
                                                this.chatTabListLiveData.mo5926a(list2);
                                            }

                                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
                                            /* renamed from: com.ss.android.lark.tab.manager.b$e */
                                            public static final class C55266e<T> implements Comparator<T> {

                                                /* renamed from: a */
                                                final /* synthetic */ LinkedHashMap f136372a;

                                                public C55266e(LinkedHashMap linkedHashMap) {
                                                    this.f136372a = linkedHashMap;
                                                }

                                                @Override // java.util.Comparator
                                                public final int compare(T t, T t2) {
                                                    return ComparisonsKt.compareValues((Integer) this.f136372a.get(Long.valueOf(t.getId())), (Integer) this.f136372a.get(Long.valueOf(t2.getId())));
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            public final /* synthetic */ Object deleteChatTab(long j, Continuation<? super List<ChatTab>> cVar) {
                                                CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
                                                lVar.mo243071d();
                                                ChatTabProcessor.f136407e.mo188387a(getChatId()).mo188379a(j, new C55260a(lVar));
                                                Object g = lVar.mo243073g();
                                                if (g == C69086a.m265828a()) {
                                                    C69091e.m265847c(cVar);
                                                }
                                                return g;
                                            }
                                        }
