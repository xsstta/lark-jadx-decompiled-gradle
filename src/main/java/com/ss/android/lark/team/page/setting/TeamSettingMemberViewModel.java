package com.ss.android.lark.team.page.setting;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.team.bean.ChatterTeamMember;
import com.ss.android.lark.team.common.vm.TeamMemberViewModel;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.util.ChatMemberLoader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0002\u0004\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/team/page/setting/TeamSettingMemberViewModel;", "Lcom/ss/android/lark/team/common/vm/TeamMemberViewModel;", "()V", "memberLoadCallback", "com/ss/android/lark/team/page/setting/TeamSettingMemberViewModel$memberLoadCallback$1", "Lcom/ss/android/lark/team/page/setting/TeamSettingMemberViewModel$memberLoadCallback$1;", "memberLoader", "Lcom/ss/android/lark/team/util/ChatMemberLoader;", "teamChangeObserver", "com/ss/android/lark/team/page/setting/TeamSettingMemberViewModel$teamChangeObserver$1", "Lcom/ss/android/lark/team/page/setting/TeamSettingMemberViewModel$teamChangeObserver$1;", "canAddMember", "", "onCleared", "", "setup", "supportAddMember", "supportRemoveMember", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.setting.b */
public final class TeamSettingMemberViewModel extends TeamMemberViewModel {
    public final C55636a memberLoadCallback = new C55636a(this);
    public ChatMemberLoader memberLoader;
    private final C55637b teamChangeObserver = new C55637b(this, true);

    @Override // com.ss.android.lark.team.common.vm.TeamMemberViewModel
    public boolean supportAddMember() {
        return true;
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
        observeSharedData("intent_team", this.teamChangeObserver);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean canAddMember() {
        /*
            r4 = this;
            com.ss.android.lark.piece.a.c r0 = r4.getSharedData()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
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
            if (r0 == 0) goto L_0x004b
            long r2 = r0.getOwnerId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.ss.android.lark.team.a.a r3 = com.ss.android.lark.team.C55356a.m214819a()
            com.ss.android.lark.team.a.a$f r3 = r3.mo144123b()
            java.lang.String r3 = r3.mo144130a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 1
            if (r2 == 0) goto L_0x003c
            return r3
        L_0x003c:
            com.ss.android.lark.team.entity.TeamSetting r0 = r0.getTeamSetting()
            if (r0 == 0) goto L_0x0046
            com.ss.android.lark.team.entity.TeamSetting$AddMemberPermission r1 = r0.getAddMemberPermission()
        L_0x0046:
            com.ss.android.lark.team.entity.TeamSetting$AddMemberPermission r0 = com.ss.android.lark.team.entity.TeamSetting.AddMemberPermission.ALL_MEMBERS
            if (r1 != r0) goto L_0x004b
            return r3
        L_0x004b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingMemberViewModel.canAddMember():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    @Override // com.ss.android.lark.team.common.vm.TeamMemberViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean supportRemoveMember() {
        /*
            r5 = this;
            com.ss.android.lark.piece.a.c r0 = r5.getSharedData()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
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
            r1 = 0
            if (r0 == 0) goto L_0x0050
            int r2 = r0.getMemberCount()
            r3 = 1
            if (r2 > r3) goto L_0x0029
            return r1
        L_0x0029:
            com.ss.android.lark.team.a.a r2 = com.ss.android.lark.team.C55356a.m214819a()
            com.ss.android.lark.team.a.a$f r2 = r2.mo144123b()
            java.lang.String r2 = r2.mo144130a()
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r3 == 0) goto L_0x0043
            return r1
        L_0x0043:
            long r0 = r0.getOwnerId()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            return r0
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.TeamSettingMemberViewModel.supportRemoveMember():boolean");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/team/page/setting/TeamSettingMemberViewModel$memberLoadCallback$1", "Lcom/ss/android/lark/team/util/ChatMemberLoader$LoadCallback;", "onFirstPage", "", "chatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.b$a */
    public static final class C55636a extends ChatMemberLoader.LoadCallback {

        /* renamed from: a */
        final /* synthetic */ TeamSettingMemberViewModel f137253a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55636a(TeamSettingMemberViewModel bVar) {
            this.f137253a = bVar;
        }

        @Override // com.ss.android.lark.team.util.ChatMemberLoader.LoadCallback
        /* renamed from: a */
        public void mo189204a(List<? extends ChatChatter> list) {
            Intrinsics.checkParameterIsNotNull(list, "chatters");
            ArrayList arrayList = new ArrayList();
            for (ChatChatter chatChatter : list) {
                arrayList.add(new ChatterTeamMember(chatChatter));
            }
            this.f137253a.resetTeamMembers(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/setting/TeamSettingMemberViewModel$teamChangeObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/team/entity/Team;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.b$b */
    public static final class C55637b extends DataObserver<Team> {

        /* renamed from: a */
        final /* synthetic */ TeamSettingMemberViewModel f137254a;

        /* renamed from: a */
        public void mo127664a(Team team) {
            if (team != null) {
                this.f137254a.updateMemberCount(team.getMemberCount(), 0, 0);
                ChatMemberLoader aVar = this.f137254a.memberLoader;
                if (aVar != null) {
                    aVar.mo189201d();
                }
                TeamSettingMemberViewModel bVar = this.f137254a;
                ChatMemberLoader aVar2 = new ChatMemberLoader(String.valueOf(team.getDefaultChatId()), -1, this.f137254a.memberLoadCallback);
                aVar2.mo189197a();
                bVar.memberLoader = aVar2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55637b(TeamSettingMemberViewModel bVar, boolean z) {
            super(z);
            this.f137254a = bVar;
        }
    }
}
