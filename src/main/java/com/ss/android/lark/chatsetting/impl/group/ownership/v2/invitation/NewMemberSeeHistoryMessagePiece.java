package com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.im.v1.UpdateChatRequest;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\tH\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/invitation/NewMemberSeeHistoryMessagePiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/chatsetting/ChatSettingSwitchPiece;", "()V", "getCheckedState", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isContentViewVisible", "itemType", "", "onCheckedChanged", "", "isChecked", "sendHitPointBeforeRequest", "titleRes", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NewMemberSeeHistoryMessagePiece extends ChatSettingSwitchPiece {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 28;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingSwitchPiece
    /* renamed from: j */
    public int mo127642j() {
        return R.string.Lark_Group_NewMembersCanViewHistoryMessages;
    }

    /* renamed from: e */
    private final void m135716e(boolean z) {
        ChatSettingHitPointNew.ManagePermissionParams managePermissionParams;
        if (z) {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.OFF_TO_ON;
        } else {
            managePermissionParams = ChatSettingHitPointNew.ManagePermissionParams.ON_TO_OFF;
        }
        ChatSettingHitPointNew.m136624a(ChatSettingHitPointNew.GroupManageParam.IS_HISTORY_MESSAGE_VIEW, managePermissionParams);
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece
    /* renamed from: b */
    public boolean mo127674b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        return chat.canSeeHistoryMessage();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece
    /* renamed from: c */
    public boolean mo127675c(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        if (chat.isSecret() || chat.isThread() || chat.isPublic()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingSwitchPiece
    /* renamed from: d */
    public void mo127676d(boolean z) {
        Chat.MessageVisibilitySetting.Enum r1;
        com.ss.android.lark.chat.entity.chat.Chat n = mo127678n();
        if (n != null) {
            m135716e(z);
            if (z) {
                r1 = Chat.MessageVisibilitySetting.Enum.ALL_MESSAGES;
            } else {
                r1 = Chat.MessageVisibilitySetting.Enum.ONLY_NEW_MESSAGES;
            }
            Job unused = C69553g.m266944a(this, null, null, new C34884a(this, new UpdateChatRequest.C18137a().mo62912a(n.getId()).mo62904a(r1), z, null), 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.NewMemberSeeHistoryMessagePiece$onCheckedChanged$1", mo239173f = "NewMemberSeeHistoryMessagePiece.kt", mo239174i = {0}, mo239175l = {36}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.NewMemberSeeHistoryMessagePiece$a */
    static final class C34884a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UpdateChatRequest.C18137a $builder;
        final /* synthetic */ boolean $isChecked;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ NewMemberSeeHistoryMessagePiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34884a(NewMemberSeeHistoryMessagePiece newMemberSeeHistoryMessagePiece, UpdateChatRequest.C18137a aVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = newMemberSeeHistoryMessagePiece;
            this.$builder = aVar;
            this.$isChecked = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34884a aVar = new C34884a(this.this$0, this.$builder, this.$isChecked, cVar);
            aVar.p$ = (CoroutineScope) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34884a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                ChatSettingService bVar = ChatSettingService.f88988a;
                UpdateChatRequest.C18137a aVar = this.$builder;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "builder");
                RucketJob<com.ss.android.lark.chat.entity.chat.Chat> a2 = bVar.mo127456a(aVar);
                this.L$0 = ahVar;
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
            RucketResult bVar2 = (RucketResult) obj;
            if (!(bVar2 instanceof RucketResult.Success) && (bVar2 instanceof RucketResult.Error)) {
                this.this$0.mo127649c(!this.$isChecked);
            }
            return Unit.INSTANCE;
        }
    }
}
