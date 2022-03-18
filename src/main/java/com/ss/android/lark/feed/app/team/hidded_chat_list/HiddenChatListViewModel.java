package com.ss.android.lark.feed.app.team.hidded_chat_list;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.team.TeamService;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.entity.PatchItemResponse;
import com.ss.android.lark.feed.app.team.p1869a.C37860g;
import com.ss.android.lark.feed.interfaces.AbstractC38106o;
import com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener;
import com.ss.android.lark.feed.service.impl.C38128e;
import com.ss.android.lark.feed.service.impl.C38166k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Item;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002*\u0001\u000e\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006J\u0014\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00110\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "chatId2ChatMap", "", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "chatUpdateLiveData", "Landroidx/lifecycle/MutableLiveData;", "getChatUpdateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "pushFeedCardPreviewListener", "Lcom/ss/android/lark/feed/interfaces/IPushFeedCardPreviewListener;", "pushFeedEntityPreviewListener", "com/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel$pushFeedEntityPreviewListener$1", "Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel$pushFeedEntityPreviewListener$1;", "showChatErrorLiveData", "Lkotlin/Pair;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "getShowChatErrorLiveData", "showChatSuccessLiveData", "getShowChatSuccessLiveData", "onCleared", "", "setChatVisible", "chat", "setup", "list", "", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.b */
public final class HiddenChatListViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    public final Map<String, C37874d> chatId2ChatMap = new LinkedHashMap();
    private final C1177w<C37874d> chatUpdateLiveData = new C1177w<>();
    private final AbstractC38106o pushFeedCardPreviewListener = new C37889b(this);
    private final C37890c pushFeedEntityPreviewListener = new C37890c(this);
    private final C1177w<Pair<C37874d, ErrorResult>> showChatErrorLiveData = new C1177w<>();
    private final C1177w<C37874d> showChatSuccessLiveData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel$Companion;", "", "()V", "TAG", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C1177w<C37874d> getChatUpdateLiveData() {
        return this.chatUpdateLiveData;
    }

    public final C1177w<Pair<C37874d, ErrorResult>> getShowChatErrorLiveData() {
        return this.showChatErrorLiveData;
    }

    public final C1177w<C37874d> getShowChatSuccessLiveData() {
        return this.showChatSuccessLiveData;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        C38128e.m149952a().mo139483b(this.pushFeedCardPreviewListener);
        C38128e.m149952a().mo139485b(this.pushFeedEntityPreviewListener);
        super.onCleared();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/feed/app/team/hidded_chat_list/HiddenChatListViewModel$pushFeedEntityPreviewListener$1", "Lcom/ss/android/lark/feed/interfaces/IPushFeedEntityPreviewListener;", "onPushFeedEntityPreview", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.b$c */
    public static final class C37890c implements IPushFeedEntityPreviewListener {

        /* renamed from: a */
        final /* synthetic */ HiddenChatListViewModel f97175a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37890c(HiddenChatListViewModel bVar) {
            this.f97175a = bVar;
        }

        @Override // com.ss.android.lark.feed.interfaces.IPushFeedEntityPreviewListener
        /* renamed from: a */
        public void mo137415a(JSONObject jSONObject) {
            List<FeedPreviewInfo> list;
            List filterNotNull;
            boolean z;
            if (jSONObject != null) {
                Object obj = jSONObject.get("params_feed_preview_update_info");
                if (!(obj instanceof C38166k)) {
                    obj = null;
                }
                C38166k kVar = (C38166k) obj;
                if (!(kVar == null || (list = kVar.f97854a) == null || (filterNotNull = CollectionsKt.filterNotNull(list)) == null)) {
                    ArrayList<FeedPreviewInfo> arrayList = new ArrayList();
                    for (Object obj2 : filterNotNull) {
                        FeedPreviewInfo feedPreviewInfo = (FeedPreviewInfo) obj2;
                        if (feedPreviewInfo.mo106109w() == FeedCard.FeedType.INBOX && (feedPreviewInfo.mo106051c() == Chat.Type.GROUP || feedPreviewInfo.mo106051c() == Chat.Type.TOPIC_GROUP)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj2);
                        }
                    }
                    for (FeedPreviewInfo feedPreviewInfo2 : arrayList) {
                        C37874d dVar = this.f97175a.chatId2ChatMap.get(feedPreviewInfo2.mo106098p());
                        if (dVar != null) {
                            C37860g.m148992a(dVar, feedPreviewInfo2);
                            this.f97175a.getChatUpdateLiveData().mo5926a(dVar);
                        }
                    }
                }
            }
        }
    }

    public final void setChatVisible(C37874d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chat");
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C37891d(this, dVar, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListViewModel$setChatVisible$1", mo239173f = "HiddenChatListViewModel.kt", mo239174i = {0}, mo239175l = {92}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.b$d */
    public static final class C37891d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C37874d $chat;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ HiddenChatListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37891d(HiddenChatListViewModel bVar, C37874d dVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$chat = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C37891d dVar = new C37891d(this.this$0, this.$chat, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C37891d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/entity/PatchItemResponse;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.hidded_chat_list.HiddenChatListViewModel$setChatVisible$1$response$1", mo239173f = "HiddenChatListViewModel.kt", mo239174i = {0}, mo239175l = {92}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.b$d$a */
        public static final class C37892a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PatchItemResponse>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C37891d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37892a(C37891d dVar, Continuation cVar) {
                super(2, cVar);
                this.this$0 = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C37892a aVar = new C37892a(this.this$0, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super PatchItemResponse> cVar) {
                return ((C37892a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    Item k = this.this$0.$chat.mo138754k();
                    Intrinsics.checkExpressionValueIsNotNull(k, "chat.item");
                    long id = k.getId();
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = TeamService.m149003a(id, true, (Continuation<? super PatchItemResponse>) this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                this.L$0 = this.p$;
                this.label = 1;
                obj = C69388e.m266829a(Dispatchers.m266326d(), new C37892a(this, null), this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                try {
                    C69097g.m265891a(obj);
                } catch (ErrorResult e) {
                    this.this$0.getShowChatErrorLiveData().mo5926a(TuplesKt.to(this.$chat, e));
                    return Unit.INSTANCE;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Item a2 = ((PatchItemResponse) obj).mo138721a();
            if (a2 != null) {
                this.$chat.mo138737a(a2);
            }
            this.this$0.getShowChatSuccessLiveData().mo5926a(this.$chat);
            this.this$0.chatId2ChatMap.remove(this.$chat.mo138742b());
            return Unit.INSTANCE;
        }
    }

    public final void setup(List<? extends C37874d> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        for (T t : list) {
            Map<String, C37874d> map = this.chatId2ChatMap;
            String b = t.mo138742b();
            Intrinsics.checkExpressionValueIsNotNull(b, "it.id");
            map.put(b, t);
        }
        C38128e.m149952a().mo139474a(this.pushFeedCardPreviewListener);
        C38128e.m149952a().mo139476a(this.pushFeedEntityPreviewListener);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "onPushFeedPreview"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.hidded_chat_list.b$b */
    static final class C37889b implements AbstractC38106o {

        /* renamed from: a */
        final /* synthetic */ HiddenChatListViewModel f97174a;

        C37889b(HiddenChatListViewModel bVar) {
            this.f97174a = bVar;
        }

        @Override // com.ss.android.lark.feed.interfaces.AbstractC38106o
        /* renamed from: a */
        public final void mo137401a(JSONObject jSONObject) {
            List filterNotNull;
            boolean z;
            if (jSONObject != null) {
                Object obj = jSONObject.get("params_feed_preview_update_info");
                if (!(obj instanceof C38166k)) {
                    obj = null;
                }
                C38166k kVar = (C38166k) obj;
                if (kVar == null) {
                    Log.m165397w("HiddenChatViewModel", "pushFeedInfo is null");
                    return;
                }
                List<FeedPreviewInfo> list = kVar.f97854a;
                if (!(list == null || (filterNotNull = CollectionsKt.filterNotNull(list)) == null)) {
                    ArrayList<FeedPreviewInfo> arrayList = new ArrayList();
                    for (Object obj2 : filterNotNull) {
                        FeedPreviewInfo feedPreviewInfo = (FeedPreviewInfo) obj2;
                        if (feedPreviewInfo.mo106109w() == FeedCard.FeedType.INBOX && (feedPreviewInfo.mo106051c() == Chat.Type.GROUP || feedPreviewInfo.mo106051c() == Chat.Type.TOPIC_GROUP)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Log.m165397w("HiddenChatViewModel", "unsupported info id = " + feedPreviewInfo.mo106098p() + ", name = " + feedPreviewInfo.mo106105s());
                        }
                        if (z) {
                            arrayList.add(obj2);
                        }
                    }
                    for (FeedPreviewInfo feedPreviewInfo2 : arrayList) {
                        C37874d dVar = this.f97174a.chatId2ChatMap.get(feedPreviewInfo2.mo106098p());
                        if (dVar != null) {
                            C37860g.m148992a(dVar, feedPreviewInfo2);
                            this.f97174a.getChatUpdateLiveData().mo5926a(dVar);
                        }
                    }
                }
            }
        }
    }
}
