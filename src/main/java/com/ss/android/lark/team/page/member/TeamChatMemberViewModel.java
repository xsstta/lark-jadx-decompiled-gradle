package com.ss.android.lark.team.page.member;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.entity.Team;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H@ø\u0001\u0000¢\u0006\u0002\u0010\u001aR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamChatMemberViewModel;", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "()V", "privateChatId", "", "getPrivateChatId", "()Ljava/lang/String;", "privateChatId$delegate", "Lkotlin/Lazy;", "canChangeSelection", "", "member", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "checkMemberInChat", "", "memberList", "", "chatId", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatIdForLoadMember", "isSelectable", "isSelected", "transformDataList", "", "chatterList", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.i */
public final class TeamChatMemberViewModel extends BaseMemberViewModel {
    private final Lazy privateChatId$delegate = LazyKt.lazy(new C55588c(this));

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H@"}, d2 = {"transformDataList", "", "chatterList", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "continuation", "Lkotlin/coroutines/Continuation;", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamChatMemberViewModel", mo239173f = "TeamChatMemberViewModel.kt", mo239174i = {0, 0, 1, 1, 1}, mo239175l = {69, 71}, mo239176m = "transformDataList", mo239177n = {"this", "chatterList", "this", "chatterList", "memberList"}, mo239178s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.team.page.member.i$d */
    public static final class C55589d extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ TeamChatMemberViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55589d(TeamChatMemberViewModel iVar, Continuation cVar) {
            super(cVar);
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformDataList(null, this);
        }
    }

    public final String getPrivateChatId() {
        return (String) this.privateChatId$delegate.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.i$c */
    static final class C55588c extends Lambda implements Function0<String> {
        final /* synthetic */ TeamChatMemberViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55588c(TeamChatMemberViewModel iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
            if ((r0 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x001e;
         */
        @Override // kotlin.jvm.functions.Function0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r3 = this;
                com.ss.android.lark.team.page.member.i r0 = r3.this$0
                com.ss.android.lark.piece.a.c r0 = r0.getSharedData()
                java.lang.Class<com.ss.android.lark.chat.entity.chat.Chat> r1 = com.ss.android.lark.chat.entity.chat.Chat.class
                java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
                java.lang.Object r0 = r0.get(r1)
                r1 = 0
                if (r0 == 0) goto L_0x001d
                java.lang.String r2 = "dataMap[key] ?: return null"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                boolean r2 = r0 instanceof com.ss.android.lark.chat.entity.chat.Chat
                if (r2 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r0 = r1
            L_0x001e:
                com.ss.android.lark.chat.entity.chat.Chat r0 = (com.ss.android.lark.chat.entity.chat.Chat) r0
                if (r0 == 0) goto L_0x0029
                java.lang.String r0 = r0.getId()
                if (r0 == 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                java.lang.String r0 = ""
            L_0x002b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamChatMemberViewModel.C55588c.invoke():java.lang.String");
        }
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberViewModel
    public String getChatIdForLoadMember() {
        String str;
        Chat chat = null;
        if (C55591j.f137145d[getActionType().ordinal()] != 1) {
            Object obj = getSharedData().mo177165a().get(Chat.class);
            if (obj != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
                if (obj instanceof Chat) {
                    chat = obj;
                }
            }
            Chat chat2 = chat;
            if (chat2 == null || (str = chat2.getId()) == null) {
                return "";
            }
        } else {
            Object obj2 = getSharedData().mo177165a().get(Team.class);
            if (obj2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(obj2, "dataMap[key] ?: return null");
                if (obj2 instanceof Team) {
                    chat = obj2;
                }
            }
            Team team = (Team) chat;
            if (team == null || (str = String.valueOf(team.getDefaultChatId())) == null) {
                return "";
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.i$a */
    public static final class C55586a extends Lambda implements Function1<Throwable, Unit> {
        public static final C55586a INSTANCE = new C55586a();

        C55586a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Log.m165379d("MemberViewModel", "checkMemberInChat, invokeOnCancellation: " + th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/team/page/member/TeamChatMemberViewModel$checkMemberInChat$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.i$b */
    public static final class C55587b implements IGetDataCallback<Map<String, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f137141a;

        C55587b(CancellableContinuation kVar) {
            this.f137141a = kVar;
        }

        /* renamed from: a */
        public void onSuccess(Map<String, Boolean> map) {
            Intrinsics.checkParameterIsNotNull(map, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            CancellableContinuation kVar = this.f137141a;
            Result.Companion aVar = Result.Companion;
            kVar.resumeWith(Result.m271569constructorimpl(map));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MemberViewModel", "checkMemberInChat error: " + errorResult.getDebugMsg());
            Result.Companion aVar = Result.Companion;
            this.f137141a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberViewModel
    public boolean isSelectable(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        if (C55591j.f137142a[getActionType().ordinal()] != 1) {
            return super.isSelectable(dVar);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.TeamChatMemberViewModel$transformDataList$map$1", mo239173f = "TeamChatMemberViewModel.kt", mo239174i = {0}, mo239175l = {71}, mo239176m = "invokeSuspend", mo239177n = {"$this$withContext"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.team.page.member.i$e */
    public static final class C55590e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends Boolean>>, Object> {
        final /* synthetic */ List $memberList;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TeamChatMemberViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55590e(TeamChatMemberViewModel iVar, List list, Continuation cVar) {
            super(2, cVar);
            this.this$0 = iVar;
            this.$memberList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C55590e eVar = new C55590e(this.this$0, this.$memberList, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Map<String, ? extends Boolean>> cVar) {
            return ((C55590e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                TeamChatMemberViewModel iVar = this.this$0;
                List<TeamMemberVO> list = this.$memberList;
                String privateChatId = iVar.getPrivateChatId();
                Intrinsics.checkExpressionValueIsNotNull(privateChatId, "privateChatId");
                this.L$0 = ahVar;
                this.label = 1;
                obj = iVar.checkMemberInChat(list, privateChatId, this);
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

    @Override // com.ss.android.lark.team.page.member.BaseMemberViewModel
    public boolean canChangeSelection(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        if (C55591j.f137143b[getActionType().ordinal()] != 1) {
            return super.canChangeSelection(dVar);
        }
        if (!dVar.mo188952d()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.team.page.member.BaseMemberViewModel
    public boolean isSelected(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        if (C55591j.f137144c[getActionType().ordinal()] != 1) {
            return super.isSelected(dVar);
        }
        if (dVar.mo188952d()) {
            return true;
        }
        return super.isSelected(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        if ((r1 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.ss.android.lark.team.page.member.BaseMemberViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object transformDataList(java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> r11, kotlin.coroutines.Continuation<? super java.util.List<com.ss.android.lark.team.bean.TeamMemberVO>> r12) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.TeamChatMemberViewModel.transformDataList(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object checkMemberInChat(List<TeamMemberVO> list, String str, Continuation<? super Map<String, Boolean>> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CancellableContinuationImpl lVar2 = lVar;
        lVar2.mo243064a((Function1<? super Throwable, Unit>) C55586a.INSTANCE);
        C55587b bVar = new C55587b(lVar2);
        List<TeamMemberVO> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo188945a());
        }
        C55356a.m214819a().mo144124c().mo144144a(arrayList, str, bVar);
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }
}
