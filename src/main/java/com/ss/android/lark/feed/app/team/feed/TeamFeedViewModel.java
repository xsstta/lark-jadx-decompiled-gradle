package com.ss.android.lark.feed.app.team.feed;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.feed.app.team.TeamService;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.entity.C37878g;
import com.ss.android.lark.feed.app.team.entity.ChatVisibilityUpdateResult;
import com.ss.android.lark.feed.app.team.entity.PatchItemResponse;
import com.ss.android.lark.feed.app.team.entity.TeamLoadStatus;
import com.ss.android.lark.feed.app.team.feed.TeamFeedModel;
import com.ss.android.lark.team.entity.Item;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69388e;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0014J\u0006\u0010)\u001a\u00020(J\u0006\u0010*\u001a\u00020(J\u0016\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.J\u0016\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020.R)\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017R#\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\nR#\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\n¨\u00062"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "chatListLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "getChatListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "chatRemoveLiveData", "", "getChatRemoveLiveData", "chatUpdateLiveData", "getChatUpdateLiveData", "chatVisibilityUpdateLiveData", "Lcom/ss/android/lark/feed/app/team/entity/ChatVisibilityUpdateResult;", "getChatVisibilityUpdateLiveData", "model", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel;", "modelDependency", "com/ss/android/lark/feed/app/team/feed/TeamFeedViewModel$modelDependency$1", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedViewModel$modelDependency$1;", "teamAddLiveData", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "", "getTeamAddLiveData", "teamListLiveData", "getTeamListLiveData", "teamLoadStatusLiveData", "Lcom/ss/android/lark/feed/app/team/entity/TeamLoadStatus;", "getTeamLoadStatusLiveData", "teamPositionUpdateLiveData", "getTeamPositionUpdateLiveData", "teamRemoveLiveData", "getTeamRemoveLiveData", "teamUpdateLiveData", "getTeamUpdateLiveData", "onCleared", "", "saveTeamExpandSnapshot", "setup", "updateChatVisibility", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "hideChat", "", "updateTeamExpandStatus", "teamItemId", "isExpanded", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.a.h */
public final class TeamFeedViewModel extends AbstractC1142af {
    private final C1177w<Pair<Long, List<C37874d>>> chatListLiveData = new C1177w<>();
    private final C1177w<Pair<Long, String>> chatRemoveLiveData = new C1177w<>();
    private final C1177w<C37874d> chatUpdateLiveData = new C1177w<>();
    private final C1177w<ChatVisibilityUpdateResult> chatVisibilityUpdateLiveData = new C1177w<>();
    private final TeamFeedModel model;
    private final C37861a modelDependency;
    private final C1177w<Pair<C37878g, Integer>> teamAddLiveData = new C1177w<>();
    private final C1177w<List<C37878g>> teamListLiveData = new C1177w<>();
    private final C1177w<TeamLoadStatus> teamLoadStatusLiveData = new C1177w<>();
    private final C1177w<Pair<Integer, Integer>> teamPositionUpdateLiveData = new C1177w<>();
    private final C1177w<Long> teamRemoveLiveData = new C1177w<>();
    private final C1177w<C37878g> teamUpdateLiveData = new C1177w<>();

    public final C1177w<Pair<Long, List<C37874d>>> getChatListLiveData() {
        return this.chatListLiveData;
    }

    public final C1177w<Pair<Long, String>> getChatRemoveLiveData() {
        return this.chatRemoveLiveData;
    }

    public final C1177w<C37874d> getChatUpdateLiveData() {
        return this.chatUpdateLiveData;
    }

    public final C1177w<ChatVisibilityUpdateResult> getChatVisibilityUpdateLiveData() {
        return this.chatVisibilityUpdateLiveData;
    }

    public final C1177w<Pair<C37878g, Integer>> getTeamAddLiveData() {
        return this.teamAddLiveData;
    }

    public final C1177w<List<C37878g>> getTeamListLiveData() {
        return this.teamListLiveData;
    }

    public final C1177w<TeamLoadStatus> getTeamLoadStatusLiveData() {
        return this.teamLoadStatusLiveData;
    }

    public final C1177w<Pair<Integer, Integer>> getTeamPositionUpdateLiveData() {
        return this.teamPositionUpdateLiveData;
    }

    public final C1177w<Long> getTeamRemoveLiveData() {
        return this.teamRemoveLiveData;
    }

    public final C1177w<C37878g> getTeamUpdateLiveData() {
        return this.teamUpdateLiveData;
    }

    public final void saveTeamExpandSnapshot() {
        this.model.mo138676d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        this.model.mo138673b();
        super.onCleared();
    }

    public final void setup() {
        this.model.mo138667a();
        this.model.mo138675c();
    }

    public TeamFeedViewModel() {
        C37861a aVar = new C37861a(this);
        this.modelDependency = aVar;
        this.model = new TeamFeedModel(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u001e\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/lark/feed/app/team/feed/TeamFeedViewModel$modelDependency$1", "Lcom/ss/android/lark/feed/app/team/feed/TeamFeedModel$Dependency;", "onAddTeam", "", "team", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "position", "", "onChatChanged", "teamId", "", "chat", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "onRemoveChat", "chatId", "", "onRemoveTeam", "onTeamChanged", "onTeamPositionChanged", "fromPosition", "toPosition", "resetChatList", "chatList", "", "resetTeamList", "teamList", "clearChatList", "", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.h$a */
    public static final class C37861a implements TeamFeedModel.Dependency {

        /* renamed from: a */
        final /* synthetic */ TeamFeedViewModel f97111a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37861a(TeamFeedViewModel hVar) {
            this.f97111a = hVar;
        }

        @Override // com.ss.android.lark.feed.app.team.feed.TeamFeedModel.Dependency
        /* renamed from: a */
        public void mo138677a(long j) {
            this.f97111a.getTeamRemoveLiveData().mo5926a(Long.valueOf(j));
        }

        @Override // com.ss.android.lark.feed.app.team.feed.TeamFeedModel.Dependency
        /* renamed from: a */
        public void mo138681a(C37878g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "team");
            this.f97111a.getTeamUpdateLiveData().mo5926a(gVar);
        }

        @Override // com.ss.android.lark.feed.app.team.feed.TeamFeedModel.Dependency
        /* renamed from: a */
        public void mo138682a(List<? extends C37878g> list) {
            Intrinsics.checkParameterIsNotNull(list, "teamList");
            mo138683a(list, false);
        }

        @Override // com.ss.android.lark.feed.app.team.feed.TeamFeedModel.Dependency
        /* renamed from: a */
        public void mo138678a(long j, C37874d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "chat");
            this.f97111a.getChatUpdateLiveData().mo5926a(dVar);
        }

        @Override // com.ss.android.lark.feed.app.team.feed.TeamFeedModel.Dependency
        /* renamed from: a */
        public void mo138679a(long j, String str) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            this.f97111a.getChatRemoveLiveData().mo5926a(TuplesKt.to(Long.valueOf(j), str));
        }

        @Override // com.ss.android.lark.feed.app.team.feed.TeamFeedModel.Dependency
        /* renamed from: a */
        public void mo138680a(long j, List<? extends C37874d> list) {
            Intrinsics.checkParameterIsNotNull(list, "chatList");
            this.f97111a.getChatListLiveData().mo5926a(TuplesKt.to(Long.valueOf(j), list));
        }

        @Override // com.ss.android.lark.feed.app.team.feed.TeamFeedModel.Dependency
        /* renamed from: a */
        public void mo138683a(List<? extends C37878g> list, boolean z) {
            Intrinsics.checkParameterIsNotNull(list, "teamList");
            this.f97111a.getTeamListLiveData().mo5926a((List<C37878g>) list);
            if (list.isEmpty()) {
                this.f97111a.getTeamLoadStatusLiveData().mo5926a(TeamLoadStatus.STATUS_EMPTY);
            } else {
                this.f97111a.getTeamLoadStatusLiveData().mo5926a(TeamLoadStatus.STATUS_SUCCESS);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.feed.TeamFeedViewModel$updateChatVisibility$1", mo239173f = "TeamFeedViewModel.kt", mo239174i = {0}, mo239175l = {104}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.feed.app.team.a.h$b */
    public static final class C37862b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C37874d $data;
        final /* synthetic */ boolean $hideChat;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamFeedViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37862b(TeamFeedViewModel hVar, C37874d dVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = hVar;
            this.$data = dVar;
            this.$hideChat = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C37862b bVar = new C37862b(this.this$0, this.$data, this.$hideChat, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C37862b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/feed/app/team/entity/PatchItemResponse;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.feed.app.team.feed.TeamFeedViewModel$updateChatVisibility$1$response$1", mo239173f = "TeamFeedViewModel.kt", mo239174i = {0}, mo239175l = {104}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.feed.app.team.a.h$b$a */
        public static final class C37863a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PatchItemResponse>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;
            final /* synthetic */ C37862b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37863a(C37862b bVar, Continuation cVar) {
                super(2, cVar);
                this.this$0 = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C37863a aVar = new C37863a(this.this$0, cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super PatchItemResponse> cVar) {
                return ((C37863a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    Item k = this.this$0.$data.mo138754k();
                    Intrinsics.checkExpressionValueIsNotNull(k, "data.item");
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = TeamService.m149003a(k.getId(), !this.this$0.$hideChat, this);
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
                obj = C69388e.m266829a(Dispatchers.m266326d(), new C37863a(this, null), this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar = (CoroutineScope) this.L$0;
                try {
                    C69097g.m265891a(obj);
                } catch (ErrorResult e) {
                    this.this$0.getChatVisibilityUpdateLiveData().mo5926a(new ChatVisibilityUpdateResult.Error(e));
                    return Unit.INSTANCE;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TeamService bVar = TeamService.f97112a;
            String b = this.$data.mo138742b();
            Intrinsics.checkExpressionValueIsNotNull(b, "data.id");
            bVar.mo138704a(b);
            Item a2 = ((PatchItemResponse) obj).mo138721a();
            if (a2 != null) {
                this.$data.mo138737a(a2);
            } else {
                Item k = this.$data.mo138754k();
                Intrinsics.checkExpressionValueIsNotNull(k, "data.item");
                k.setHidden(this.$hideChat);
            }
            this.this$0.getChatVisibilityUpdateLiveData().mo5926a(new ChatVisibilityUpdateResult.Success(this.$data));
            return Unit.INSTANCE;
        }
    }

    public final void updateTeamExpandStatus(long j, boolean z) {
        this.model.mo138669a(j, z);
    }

    public final void updateChatVisibility(C37874d dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C37862b(this, dVar, z, null), 3, null);
    }
}
