package com.ss.android.lark.team.page.member;

import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.TagType;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.data.PieceViewModel;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.entity.MemberActionType;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.util.ChatMemberLoader;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012*\u0002\n!\b&\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0015H\u0016J\u0006\u00102\u001a\u00020\u0019J\u0006\u00103\u001a\u000204J\b\u00105\u001a\u00020)H\u0016J\f\u00106\u001a\b\u0012\u0004\u0012\u00020)0\u0014J\u0010\u00107\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0015H\u0016J\u0010\u00108\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0015H\u0016J\u0006\u00109\u001a\u000204J\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u0002042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0014H\u0002J\u0016\u0010?\u001a\u0002042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0014H\u0002J\u0014\u0010@\u001a\u0002042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020)0\u0014J\u0016\u0010B\u001a\u0002042\u0006\u00101\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\u0019J\u0006\u0010D\u001a\u000204J\u000e\u0010E\u001a\u0002042\u0006\u00101\u001a\u00020\u0015J'\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010G\u001a\u00020)2\u0006\u0010H\u001a\u00020)H@ø\u0001\u0000¢\u0006\u0002\u0010IJ\u0006\u0010J\u001a\u00020;J\u0006\u0010K\u001a\u000204J%\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020>0\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010NR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001e0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0010\u0010 \u001a\u00020!X\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001e0\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017R\u001b\u0010,\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b-\u0010.\u0002\u0004\n\u0002\b\u0019¨\u0006P"}, d2 = {"Lcom/ss/android/lark/team/page/member/BaseMemberViewModel;", "Lcom/ss/android/lark/piece/data/PieceViewModel;", "()V", "actionType", "Lcom/ss/android/lark/team/entity/MemberActionType;", "getActionType", "()Lcom/ss/android/lark/team/entity/MemberActionType;", "setActionType", "(Lcom/ss/android/lark/team/entity/MemberActionType;)V", "actionTypeObserver", "com/ss/android/lark/team/page/member/BaseMemberViewModel$actionTypeObserver$1", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel$actionTypeObserver$1;", "chatMemberLoader", "Lcom/ss/android/lark/team/util/ChatMemberLoader;", "getChatMemberLoader", "()Lcom/ss/android/lark/team/util/ChatMemberLoader;", "chatMemberLoader$delegate", "Lkotlin/Lazy;", "firstPageLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "getFirstPageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadFailedLiveData", "", "getLoadFailedLiveData", "loadMoreLiveData", "getLoadMoreLiveData", "memberListLiveData", "", "getMemberListLiveData", "memberLoadCallback", "com/ss/android/lark/team/page/member/BaseMemberViewModel$memberLoadCallback$1", "Lcom/ss/android/lark/team/page/member/BaseMemberViewModel$memberLoadCallback$1;", "needSearchLiveData", "getNeedSearchLiveData", "noMoreLiveData", "getNoMoreLiveData", "selectedMemberIds", "", "", "selectedMemberLiveData", "getSelectedMemberLiveData", "selfUserId", "getSelfUserId", "()Ljava/lang/String;", "selfUserId$delegate", "canChangeSelection", "member", "canLoadMore", "clearSelection", "", "getChatIdForLoadMember", "getSelectedMemberIdList", "isSelectable", "isSelected", "loadMore", "loadedMemberCount", "", "onFirstPage", "chatters", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "onLoadMore", "onMemberRemoved", "ids", "onSelectionChanged", "selected", "refreshMemberList", "removeGroupAdminTagInfo", "searchChatter", "key", "chatId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectedMemberCount", "setup", "transformDataList", "chatterList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.c */
public abstract class BaseMemberViewModel extends PieceViewModel {
    public static final Companion Companion = new Companion(null);
    private MemberActionType actionType = MemberActionType.BROWSE_LIST;
    private final C55574b actionTypeObserver = new C55574b(this, true);
    private final Lazy chatMemberLoader$delegate = LazyKt.lazy(new C55575c(this));
    private final C1177w<List<TeamMemberVO>> firstPageLiveData = new C1177w<>();
    private final C1177w<Boolean> loadFailedLiveData = new C1177w<>(false);
    private final C1177w<List<TeamMemberVO>> loadMoreLiveData = new C1177w<>();
    private final C1177w<List<TeamMemberVO>> memberListLiveData = new C1177w<>();
    public final C55576d memberLoadCallback = new C55576d(this);
    private final C1177w<Boolean> needSearchLiveData = new C1177w<>(false);
    private final C1177w<Boolean> noMoreLiveData = new C1177w<>(false);
    private final Set<String> selectedMemberIds = new LinkedHashSet();
    private final C1177w<List<TeamMemberVO>> selectedMemberLiveData = new C1177w<>(new ArrayList());
    private final Lazy selfUserId$delegate = LazyKt.lazy(C55582i.INSTANCE);

    private final ChatMemberLoader getChatMemberLoader() {
        return (ChatMemberLoader) this.chatMemberLoader$delegate.getValue();
    }

    private final String getSelfUserId() {
        return (String) this.selfUserId$delegate.getValue();
    }

    public boolean canChangeSelection(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        return true;
    }

    public Object transformDataList(List<? extends ChatChatter> list, Continuation<? super List<TeamMemberVO>> cVar) {
        return transformDataList$suspendImpl(this, list, cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/team/page/member/BaseMemberViewModel$Companion;", "", "()V", "CONDITION_NO_LIMIT", "", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final MemberActionType getActionType() {
        return this.actionType;
    }

    public final C1177w<List<TeamMemberVO>> getFirstPageLiveData() {
        return this.firstPageLiveData;
    }

    public final C1177w<Boolean> getLoadFailedLiveData() {
        return this.loadFailedLiveData;
    }

    public final C1177w<List<TeamMemberVO>> getLoadMoreLiveData() {
        return this.loadMoreLiveData;
    }

    public final C1177w<List<TeamMemberVO>> getMemberListLiveData() {
        return this.memberListLiveData;
    }

    public final C1177w<Boolean> getNeedSearchLiveData() {
        return this.needSearchLiveData;
    }

    public final C1177w<Boolean> getNoMoreLiveData() {
        return this.noMoreLiveData;
    }

    public final C1177w<List<TeamMemberVO>> getSelectedMemberLiveData() {
        return this.selectedMemberLiveData;
    }

    public final void loadMore() {
        getChatMemberLoader().mo189199b();
    }

    public final int selectedMemberCount() {
        return this.selectedMemberIds.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/team/page/member/BaseMemberViewModel$memberLoadCallback$1", "Lcom/ss/android/lark/team/util/ChatMemberLoader$LoadCallback;", "needSearchForSecurity", "", "onFirstPage", "chatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "onLoadFailed", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadMore", "onNoMore", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.c$d */
    public static final class C55576d extends ChatMemberLoader.LoadCallback {

        /* renamed from: a */
        final /* synthetic */ BaseMemberViewModel f137127a;

        @Override // com.ss.android.lark.team.util.ChatMemberLoader.LoadCallback
        /* renamed from: a */
        public void mo189202a() {
            this.f137127a.getNeedSearchLiveData().mo5926a((Boolean) true);
        }

        @Override // com.ss.android.lark.team.util.ChatMemberLoader.LoadCallback
        /* renamed from: b */
        public void mo189205b() {
            this.f137127a.getNoMoreLiveData().mo5926a((Boolean) true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55576d(BaseMemberViewModel cVar) {
            this.f137127a = cVar;
        }

        @Override // com.ss.android.lark.team.util.ChatMemberLoader.LoadCallback
        /* renamed from: a */
        public void mo189203a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f137127a.getLoadFailedLiveData().mo5926a((Boolean) true);
        }

        @Override // com.ss.android.lark.team.util.ChatMemberLoader.LoadCallback
        /* renamed from: b */
        public void mo189206b(List<? extends ChatChatter> list) {
            Intrinsics.checkParameterIsNotNull(list, "chatters");
            this.f137127a.onLoadMore(list);
        }

        @Override // com.ss.android.lark.team.util.ChatMemberLoader.LoadCallback
        /* renamed from: a */
        public void mo189204a(List<? extends ChatChatter> list) {
            Intrinsics.checkParameterIsNotNull(list, "chatters");
            this.f137127a.onFirstPage(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.c$i */
    static final class C55582i extends Lambda implements Function0<String> {
        public static final C55582i INSTANCE = new C55582i();

        C55582i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return C55356a.m214819a().mo144123b().mo144130a();
        }
    }

    public final List<String> getSelectedMemberIdList() {
        return CollectionsKt.toList(this.selectedMemberIds);
    }

    public final void refreshMemberList() {
        getChatMemberLoader().mo189200c();
        getChatMemberLoader().mo189197a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/team/util/ChatMemberLoader;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.c$c */
    static final class C55575c extends Lambda implements Function0<ChatMemberLoader> {
        final /* synthetic */ BaseMemberViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55575c(BaseMemberViewModel cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ChatMemberLoader invoke() {
            return new ChatMemberLoader(this.this$0.getChatIdForLoadMember(), -1, this.this$0.memberLoadCallback);
        }
    }

    public final void clearSelection() {
        this.selectedMemberIds.clear();
        this.selectedMemberLiveData.mo5929b(new ArrayList());
    }

    public final int loadedMemberCount() {
        List<TeamMemberVO> b = this.memberListLiveData.mo5927b();
        if (b != null) {
            return b.size();
        }
        return 0;
    }

    public final void setup() {
        observeSharedData(MemberActionType.class, this.actionTypeObserver);
        getChatMemberLoader().mo189197a();
    }

    public final boolean canLoadMore() {
        if (!Intrinsics.areEqual((Object) this.noMoreLiveData.mo5927b(), (Object) false) || !Intrinsics.areEqual((Object) this.needSearchLiveData.mo5927b(), (Object) false)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getChatIdForLoadMember() {
        /*
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.getSharedData()
            java.lang.Class<com.ss.android.lark.team.entity.Team> r1 = com.ss.android.lark.team.entity.Team.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            if (r0 == 0) goto L_0x002b
            long r0 = r0.getDefaultChatId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            java.lang.String r0 = ""
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.member.BaseMemberViewModel.getChatIdForLoadMember():java.lang.String");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/member/BaseMemberViewModel$actionTypeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/MemberActionType;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.c$b */
    public static final class C55574b extends DataObserver<MemberActionType> {

        /* renamed from: a */
        final /* synthetic */ BaseMemberViewModel f137126a;

        /* renamed from: a */
        public void mo127664a(MemberActionType memberActionType) {
            if (memberActionType != null) {
                this.f137126a.setActionType(memberActionType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55574b(BaseMemberViewModel cVar, boolean z) {
            super(z);
            this.f137126a = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.c$h */
    static final class C55581h extends Lambda implements Function1<Throwable, Unit> {
        public static final C55581h INSTANCE = new C55581h();

        C55581h() {
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
            Log.m165379d("MemberViewModel", "searchChatter invokeOnCancellation: " + th);
        }
    }

    public final void setActionType(MemberActionType memberActionType) {
        Intrinsics.checkParameterIsNotNull(memberActionType, "<set-?>");
        this.actionType = memberActionType;
    }

    public boolean isSelected(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        return this.selectedMemberIds.contains(dVar.mo188945a());
    }

    public boolean isSelectable(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        return !Intrinsics.areEqual(dVar.mo188945a(), getSelfUserId());
    }

    public final void onFirstPage(List<? extends ChatChatter> list) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C55577e(this, list, null), 3, null);
    }

    public final void onLoadMore(List<? extends ChatChatter> list) {
        Job unused = C69553g.m266944a(C1143ag.m5356a(this), null, null, new C55578f(this, list, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/team/page/member/BaseMemberViewModel$searchChatter$2$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.c$g */
    public static final class C55579g implements IGetDataCallback<ChatChatterResponse> {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation f137128a;

        /* renamed from: b */
        final /* synthetic */ BaseMemberViewModel f137129b;

        /* renamed from: c */
        final /* synthetic */ String f137130c;

        /* renamed from: d */
        final /* synthetic */ String f137131d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("MemberViewModel", "searchChatter error: " + errorResult.getDebugMsg());
            Result.Companion aVar = Result.Companion;
            this.f137128a.resumeWith(Result.m271569constructorimpl(C69097g.m265890a((Throwable) errorResult)));
        }

        /* renamed from: a */
        public void onSuccess(final ChatChatterResponse aVar) {
            Object obj;
            if (aVar != null) {
                if (aVar.mo136071e().isEmpty()) {
                    CancellableContinuation kVar = this.f137128a;
                    Result.Companion aVar2 = Result.Companion;
                    kVar.resumeWith(Result.m271569constructorimpl(new ArrayList()));
                    obj = Unit.INSTANCE;
                } else {
                    obj = C69553g.m266944a(C1143ag.m5356a(this.f137129b), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
                        /* class com.ss.android.lark.team.page.member.BaseMemberViewModel.C55579g.C555801 */
                        Object L$0;
                        int label;
                        private CoroutineScope p$;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                            Intrinsics.checkParameterIsNotNull(cVar, "completion");
                            C555801 r0 = 

                            /* access modifiers changed from: package-private */
                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                            @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.BaseMemberViewModel$onFirstPage$1", mo239173f = "BaseMemberViewModel.kt", mo239174i = {0}, mo239175l = {SmEvents.EVENT_UA_ERROR}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                            /* renamed from: com.ss.android.lark.team.page.member.c$e */
                            public static final class C55577e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ List $chatters;
                                Object L$0;
                                int label;
                                private CoroutineScope p$;
                                final /* synthetic */ BaseMemberViewModel this$0;

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                C55577e(BaseMemberViewModel cVar, List list, Continuation cVar2) {
                                    super(2, cVar2);
                                    this.this$0 = cVar;
                                    this.$chatters = list;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                    C55577e eVar = new C55577e(this.this$0, this.$chatters, cVar);
                                    eVar.p$ = (CoroutineScope) obj;
                                    return eVar;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                    return ((C55577e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object a = C69086a.m265828a();
                                    int i = this.label;
                                    if (i == 0) {
                                        C69097g.m265891a(obj);
                                        CoroutineScope ahVar = this.p$;
                                        BaseMemberViewModel cVar = this.this$0;
                                        List<? extends ChatChatter> list = this.$chatters;
                                        this.L$0 = ahVar;
                                        this.label = 1;
                                        obj = cVar.transformDataList(list, this);
                                        if (obj == a) {
                                            return a;
                                        }
                                    } else if (i == 1) {
                                        CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                        C69097g.m265891a(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    List<TeamMemberVO> list2 = (List) obj;
                                    this.this$0.getMemberListLiveData().mo5926a(CollectionsKt.toMutableList((Collection) list2));
                                    this.this$0.getFirstPageLiveData().mo5926a(list2);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* access modifiers changed from: package-private */
                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
                            @DebugMetadata(mo239172c = "com.ss.android.lark.team.page.member.BaseMemberViewModel$onLoadMore$1", mo239173f = "BaseMemberViewModel.kt", mo239174i = {0}, mo239175l = {153}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
                            /* renamed from: com.ss.android.lark.team.page.member.c$f */
                            public static final class C55578f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ List $chatters;
                                Object L$0;
                                int label;
                                private CoroutineScope p$;
                                final /* synthetic */ BaseMemberViewModel this$0;

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                C55578f(BaseMemberViewModel cVar, List list, Continuation cVar2) {
                                    super(2, cVar2);
                                    this.this$0 = cVar;
                                    this.$chatters = list;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                                    C55578f fVar = new C55578f(this.this$0, this.$chatters, cVar);
                                    fVar.p$ = (CoroutineScope) obj;
                                    return fVar;
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
                                    return ((C55578f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object a = C69086a.m265828a();
                                    int i = this.label;
                                    if (i == 0) {
                                        C69097g.m265891a(obj);
                                        CoroutineScope ahVar = this.p$;
                                        BaseMemberViewModel cVar = this.this$0;
                                        List<? extends ChatChatter> list = this.$chatters;
                                        this.L$0 = ahVar;
                                        this.label = 1;
                                        obj = cVar.transformDataList(list, this);
                                        if (obj == a) {
                                            return a;
                                        }
                                    } else if (i == 1) {
                                        CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                                        C69097g.m265891a(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    List<TeamMemberVO> list2 = (List) obj;
                                    ArrayList b = this.this$0.getMemberListLiveData().mo5927b();
                                    if (b == null) {
                                        b = new ArrayList();
                                    }
                                    Intrinsics.checkExpressionValueIsNotNull(b, "memberListLiveData.value ?: mutableListOf()");
                                    b.addAll(list2);
                                    this.this$0.getMemberListLiveData().mo5926a(b);
                                    this.this$0.getLoadMoreLiveData().mo5926a(list2);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void removeGroupAdminTagInfo(TeamMemberVO dVar) {
                                boolean z;
                                Intrinsics.checkParameterIsNotNull(dVar, "member");
                                List<TagInfo> tagInfos = dVar.mo188959i().getTagInfos();
                                if (tagInfos == null || tagInfos.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    List<TagInfo> tagInfos2 = dVar.mo188959i().getTagInfos();
                                    Iterator<TagInfo> it = tagInfos2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (it.next().getType() == TagType.ADMIN_USER) {
                                                it.remove();
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    dVar.mo188959i().setTagInfos(tagInfos2);
                                }
                            }

                            public final void onMemberRemoved(List<String> list) {
                                Intrinsics.checkParameterIsNotNull(list, "ids");
                                this.selectedMemberIds.removeAll(list);
                                ArrayList b = this.selectedMemberLiveData.mo5927b();
                                if (b == null) {
                                    b = new ArrayList();
                                }
                                Intrinsics.checkExpressionValueIsNotNull(b, "selectedMemberLiveData.value ?: mutableListOf()");
                                Iterator<TeamMemberVO> it = b.iterator();
                                while (it.hasNext()) {
                                    if (list.contains(it.next().mo188945a())) {
                                        it.remove();
                                    }
                                }
                                this.selectedMemberLiveData.mo5926a(b);
                                ArrayList b2 = this.memberListLiveData.mo5927b();
                                if (b2 == null) {
                                    b2 = new ArrayList();
                                }
                                Intrinsics.checkExpressionValueIsNotNull(b2, "memberListLiveData.value ?: mutableListOf()");
                                Iterator<TeamMemberVO> it2 = b2.iterator();
                                while (it2.hasNext()) {
                                    if (list.contains(it2.next().mo188945a())) {
                                        it2.remove();
                                    }
                                }
                                this.memberListLiveData.mo5926a(b2);
                            }

                            public final void onSelectionChanged(TeamMemberVO dVar, boolean z) {
                                Intrinsics.checkParameterIsNotNull(dVar, "member");
                                String a = dVar.mo188945a();
                                Intrinsics.checkExpressionValueIsNotNull(a, "member.id");
                                ArrayList b = this.selectedMemberLiveData.mo5927b();
                                if (b == null) {
                                    b = new ArrayList();
                                }
                                Intrinsics.checkExpressionValueIsNotNull(b, "selectedMemberLiveData.value ?: mutableListOf()");
                                if (!z) {
                                    b.remove(dVar);
                                    this.selectedMemberIds.remove(a);
                                } else if (!this.selectedMemberIds.contains(a)) {
                                    b.add(dVar);
                                    this.selectedMemberIds.add(a);
                                }
                                this.selectedMemberLiveData.mo5926a(b);
                            }

                            public final Object searchChatter(String str, String str2, Continuation<? super List<TeamMemberVO>> cVar) {
                                CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
                                CancellableContinuationImpl lVar2 = lVar;
                                lVar2.mo243064a((Function1<? super Throwable, Unit>) C55581h.INSTANCE);
                                C55356a.m214819a().mo144124c().mo144139a(str2, str, -1, new C55579g(lVar2, this, str2, str));
                                Object g = lVar.mo243073g();
                                if (g == C69086a.m265828a()) {
                                    C69091e.m265847c(cVar);
                                }
                                return g;
                            }

                            static /* synthetic */ Object transformDataList$suspendImpl(BaseMemberViewModel cVar, List list, Continuation cVar2) {
                                Object obj = cVar.getSharedData().mo177165a().get(Team.class);
                                Team team = null;
                                if (obj != null) {
                                    Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
                                    if (!(obj instanceof Team)) {
                                        obj = null;
                                    }
                                    team = obj;
                                }
                                Team team2 = team;
                                String b = C55356a.m214819a().mo144123b().mo144131b();
                                List<ChatChatter> list2 = list;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                for (ChatChatter chatChatter : list2) {
                                    TeamMemberVO dVar = new TeamMemberVO(chatChatter);
                                    if (team2 != null) {
                                        dVar.mo188950c(Intrinsics.areEqual(dVar.mo188945a(), String.valueOf(team2.getOwnerId())));
                                    }
                                    if (C55356a.m214819a().mo144123b().mo144133d()) {
                                        dVar.mo188951d(false);
                                    } else {
                                        dVar.mo188951d(!Intrinsics.areEqual(b, chatChatter.getTenantId()));
                                    }
                                    arrayList.add(dVar);
                                }
                                return CollectionsKt.toMutableList((Collection) arrayList);
                            }
                        }
