package com.ss.android.lark.team.page.upgrade_chat;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.ChatterTeamMember;
import com.ss.android.lark.team.common.vm.TeamMemberViewModel;
import com.ss.android.lark.team.util.ChatMemberLoader;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0002\n\u000f\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0014J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel;", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "()V", "defaultTeamChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getDefaultTeamChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "setDefaultTeamChat", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "memberLoadCallback", "com/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel$memberLoadCallback$1", "Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel$memberLoadCallback$1;", "memberLoader", "Lcom/ss/android/lark/team/util/ChatMemberLoader;", "searchChatInfoObserver", "com/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel$searchChatInfoObserver$1", "Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel$searchChatInfoObserver$1;", "getChatInfo", "", "chatId", "", "isConversionType", "", "onCleared", "setup", "supportAddMember", "supportRemoveMember", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.upgrade_chat.a */
public final class UpgradeChatMemberViewModel extends TeamMemberViewModel {
    public static final Companion Companion = new Companion(null);
    private Chat defaultTeamChat;
    public final C55645e memberLoadCallback = new C55645e(this);
    public ChatMemberLoader memberLoader;
    private final C55646f searchChatInfoObserver = new C55646f(this, true);

    @Override // com.ss.android.lark.team.common.vm.TeamMemberViewModel
    public boolean supportAddMember() {
        return false;
    }

    @Override // com.ss.android.lark.team.common.vm.TeamMemberViewModel
    public boolean supportRemoveMember() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel$Companion;", "", "()V", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Chat getDefaultTeamChat() {
        return this.defaultTeamChat;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af, com.ss.android.lark.piece.data.PieceViewModel
    public void onCleared() {
        ChatMemberLoader aVar = this.memberLoader;
        if (aVar != null) {
            aVar.mo189201d();
        }
        super.onCleared();
    }

    @Override // com.ss.android.lark.team.common.vm.TeamMemberViewModel
    public void setup() {
        observeSharedData("intent_search_info", this.searchChatInfoObserver);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.a$b */
    public static final class C55642b<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ String f137264a;

        C55642b(String str) {
            this.f137264a = str;
        }

        /* renamed from: a */
        public final Chat produce() {
            Chat a = C55356a.m214819a().mo144124c().mo144135a(this.f137264a);
            if (a != null) {
                return a;
            }
            throw new Exception();
        }
    }

    public final boolean isConversionType() {
        Chat chat = this.defaultTeamChat;
        if (chat == null) {
            return true;
        }
        if (chat == null) {
            Intrinsics.throwNpe();
        }
        if (chat.getType() == Chat.Type.GROUP) {
            return true;
        }
        return false;
    }

    public final void setDefaultTeamChat(Chat chat) {
        this.defaultTeamChat = chat;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel$memberLoadCallback$1", "Lcom/ss/android/lark/team/util/ChatMemberLoader$LoadCallback;", "onFirstPage", "", "chatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.a$e */
    public static final class C55645e extends ChatMemberLoader.LoadCallback {

        /* renamed from: a */
        final /* synthetic */ UpgradeChatMemberViewModel f137267a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55645e(UpgradeChatMemberViewModel aVar) {
            this.f137267a = aVar;
        }

        @Override // com.ss.android.lark.team.util.ChatMemberLoader.LoadCallback
        /* renamed from: a */
        public void mo189204a(List<? extends ChatChatter> list) {
            Intrinsics.checkParameterIsNotNull(list, "chatters");
            ArrayList arrayList = new ArrayList();
            for (ChatChatter chatChatter : list) {
                arrayList.add(new ChatterTeamMember(chatChatter));
            }
            this.f137267a.resetTeamMembers(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.a$c */
    public static final class C55643c<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ UpgradeChatMemberViewModel f137265a;

        C55643c(UpgradeChatMemberViewModel aVar) {
            this.f137265a = aVar;
        }

        /* renamed from: a */
        public final void consume(Chat chat) {
            this.f137265a.setDefaultTeamChat(chat);
            this.f137265a.updateMemberCount(chat.getUserCount(), 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.a$d */
    public static final class C55644d<T> implements C57865c.AbstractC57871b<Throwable> {

        /* renamed from: a */
        final /* synthetic */ String f137266a;

        C55644d(String str) {
            this.f137266a = str;
        }

        /* renamed from: a */
        public final void consume(Throwable th) {
            Log.m165383e("UpgradeChatMemberViewModel", "get chat by id " + this.f137266a + " returns null");
        }
    }

    public final void getChatInfo(String str) {
        C57865c.m224575a(new C55642b(str), new C55643c(this), new C55644d(str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/upgrade_chat/UpgradeChatMemberViewModel$searchChatInfoObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.a$f */
    public static final class C55646f extends DataObserver<SearchChatInfo> {

        /* renamed from: a */
        final /* synthetic */ UpgradeChatMemberViewModel f137268a;

        /* renamed from: a */
        public void mo127664a(SearchChatInfo searchChatInfo) {
            boolean z;
            if (searchChatInfo != null) {
                String id = searchChatInfo.getId();
                if (id == null || id.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UpgradeChatMemberViewModel aVar = this.f137268a;
                    String id2 = searchChatInfo.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id2, "data.id");
                    aVar.memberLoader = new ChatMemberLoader(id2, -1, this.f137268a.memberLoadCallback);
                    ChatMemberLoader aVar2 = this.f137268a.memberLoader;
                    if (aVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar2.mo189197a();
                    UpgradeChatMemberViewModel aVar3 = this.f137268a;
                    String id3 = searchChatInfo.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id3, "data.id");
                    aVar3.getChatInfo(id3);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55646f(UpgradeChatMemberViewModel aVar, boolean z) {
            super(z);
            this.f137268a = aVar;
        }
    }
}
