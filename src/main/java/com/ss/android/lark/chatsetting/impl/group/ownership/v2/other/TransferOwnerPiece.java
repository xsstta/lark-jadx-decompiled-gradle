package com.ss.android.lark.chatsetting.impl.group.ownership.v2.other;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.C34501a;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece;
import com.ss.android.lark.chatsetting.impl.p1698b.C34526a;
import com.ss.android.lark.chatsetting.impl.statistics.ChatStatisticUtil;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.impl.statistics.ownership.OwnershipHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.entity.Team;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\"\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u001a\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/other/TransferOwnerPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingNavigationPiece;", "()V", "mIsTeamEnable", "", "mTeam", "Lcom/ss/android/lark/team/entity/Team;", "fetchTeam", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "finishWithOwnerId", "ownerId", "", "isContentViewVisible", "itemType", "", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onChatChanged", "onClick", "sendHitPoint", "startGroupChatSelectActivity", "titleRes", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TransferOwnerPiece extends ChatSettingNavigationPiece {

    /* renamed from: b */
    public static final Companion f90066b = new Companion(null);

    /* renamed from: a */
    public Team f90067a;

    /* renamed from: g */
    private final boolean f90068g = C34501a.m133933a();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 33;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingNavigationPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Legacy_ChangeOwner;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/other/TransferOwnerPiece$Companion;", "", "()V", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.other.TransferOwnerPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: m */
    public void mo127669m() {
        Chat n = mo127670n();
        if (n != null) {
            Team team = this.f90067a;
            if (this.f90068g && n.isTeam() && team != null && Intrinsics.areEqual(String.valueOf(team.getDefaultChatId()), n.getId())) {
                UDToast.show(mo177180C(), (int) R.string.Project_MV_MustBeAligned);
            } else if (n.getUserCount() == 1) {
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(mo177180C()).title(R.string.Lark_Legacy_ChangeOwner)).message(R.string.Lark_Legacy_ChatGroupInfoTransferOnlyownerContent)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmDone, (DialogInterface.OnClickListener) null)).show();
            } else {
                m135728e(n);
                mo128690d(n);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/other/TransferOwnerPiece$onActivityResult$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.other.TransferOwnerPiece$c */
    public static final class C34887c implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ TransferOwnerPiece f90069a;

        /* renamed from: b */
        final /* synthetic */ Chatter f90070b;

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            ChatStatisticUtil.m136658a(chat, "chat_manage");
            TransferOwnerPiece transferOwnerPiece = this.f90069a;
            String id = this.f90070b.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
            transferOwnerPiece.mo128688a(id);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Context C = this.f90069a.mo177180C();
            String displayMsg = errorResult.getDisplayMsg(C51468a.m199493c(R.string.Lark_Legacy_ChangeOwnerFailed, this.f90069a.mo177180C()));
            Intrinsics.checkExpressionValueIsNotNull(displayMsg, "err.getDisplayMsg(R.stri…String(requireContext()))");
            UDToast.show(C, displayMsg);
        }

        C34887c(TransferOwnerPiece transferOwnerPiece, Chatter chatter) {
            this.f90069a = transferOwnerPiece;
            this.f90070b = chatter;
        }
    }

    /* renamed from: f */
    private final void m135729f(Chat chat) {
        Job unused = C69553g.m266944a(this, null, null, new C34886b(this, chat, null), 3, null);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: a */
    public void mo127665a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        super.mo127665a(chat);
        if (this.f90068g) {
            long teamId = chat.getTeamId();
            Team team = this.f90067a;
            if (team == null || teamId != team.getId()) {
                m135729f(chat);
            }
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingNavigationPiece
    /* renamed from: b */
    public boolean mo127667b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (!C34526a.m134090a(chat) || chat.isCustomerService()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final void m135728e(Chat chat) {
        OwnershipHitPoint.Companion aVar = OwnershipHitPoint.f90525a;
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
        aVar.mo129286a("manage_group", id);
        GroupHitPoint.f90519a.mo129245h();
        GroupHitPoint.Companion aVar2 = GroupHitPoint.f90519a;
        String id2 = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
        aVar2.mo129227c(id2);
    }

    /* renamed from: a */
    public final void mo128688a(String str) {
        boolean z;
        Intent intent = new Intent();
        intent.putExtra("owner_id", str);
        int i = 0;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = -1;
        }
        mo177185a(i, intent);
        mo177212z();
    }

    /* renamed from: d */
    public final void mo128690d(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Context C = mo177180C();
        if (C != null) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127281k().mo127402a((Activity) C, chat.getId(), 1002, chat.isThread());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.other.TransferOwnerPiece$fetchTeam$1", mo239173f = "TransferOwnerPiece.kt", mo239174i = {0, 0}, mo239175l = {94}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "teamId"}, mo239178s = {"L$0", "J$0"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.other.TransferOwnerPiece$b */
    public static final class C34886b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Chat $chat;
        long J$0;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ TransferOwnerPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34886b(TransferOwnerPiece transferOwnerPiece, Chat chat, Continuation cVar) {
            super(2, cVar);
            this.this$0 = transferOwnerPiece;
            this.$chat = chat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34886b bVar = new C34886b(this.this$0, this.$chat, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34886b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                long teamId = this.$chat.getTeamId();
                RucketJob<Team> a2 = ChatSettingService.f88988a.mo127454a(teamId, true);
                this.L$0 = ahVar;
                this.J$0 = teamId;
                this.label = 1;
                obj = a2.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar = (RucketResult) obj;
            Log.m165379d("TransferOwnerPiece", "fetch team done");
            if (bVar instanceof RucketResult.Success) {
                Team team = (Team) bVar.mo93490a();
                Log.m165379d("TransferOwnerPiece", "fetch team success, team:" + team);
                this.this$0.f90067a = team;
            } else if (bVar instanceof RucketResult.Error) {
                Log.m165397w("TransferOwnerPiece", "fetch team failed, " + ((RucketResult.Error) bVar).mo93493c().getDebugMsg());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        String id;
        Object obj;
        Bundle extras;
        if (i2 != -1 && i != 1002) {
            return false;
        }
        Chat n = mo127670n();
        if (!(n == null || (id = n.getId()) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(id, "getChat()?.getId() ?: return true");
            Chatter chatter = null;
            if (intent == null || (extras = intent.getExtras()) == null) {
                obj = null;
            } else {
                obj = extras.get("key_group_new_owner");
            }
            if (obj instanceof Chatter) {
                chatter = obj;
            }
            Chatter chatter2 = chatter;
            if (chatter2 != null) {
                AbstractC34461c a = ChatSettingModule.m133639a();
                Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                a.mo127274d().mo127373e(id, chatter2.getId(), (IGetDataCallback) mo177209w().wrapAndAddCallback(new UIGetDataCallback(new C34887c(this, chatter2))));
            }
        }
        return true;
    }
}
