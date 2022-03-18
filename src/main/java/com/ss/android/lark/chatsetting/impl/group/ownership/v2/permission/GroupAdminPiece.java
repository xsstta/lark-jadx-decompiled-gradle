package com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.GetChatAdminUsersRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.chat_admin.ChatAdminItemListener;
import com.ss.android.lark.chatsetting.impl.group.setting.C34942d;
import com.ss.android.lark.chatsetting.impl.p1698b.C34526a;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0014J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0013J\b\u0010&\u001a\u00020$H\u0014J\u001e\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/GroupAdminPiece;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece;", "()V", "addChatAdminView", "Landroid/widget/TextView;", "getAddChatAdminView", "()Landroid/widget/TextView;", "addChatAdminView$delegate", "Lkotlin/Lazy;", "chatAdminAdapter", "Lcom/ss/android/lark/chatsetting/impl/group/setting/GroupMemberGridViewAdapter;", "chatAdminList", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "chatAdminsNumView", "getChatAdminsNumView", "chatAdminsNumView$delegate", "chatObserver", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "gridView", "Landroid/widget/GridView;", "getGridView", "()Landroid/widget/GridView;", "gridView$delegate", "getContentClickListener", "Landroid/view/View$OnClickListener;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "itemType", "", "loadChatAdmins", "", "chat", "registerShareData", "updateAdminGridView", "adminList", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupAdminPiece extends SettingBasePiece<GroupAdminPiece> {

    /* renamed from: b */
    public static final Companion f90086b = new Companion(null);

    /* renamed from: a */
    public final List<ChatChatter> f90087a = new ArrayList();

    /* renamed from: g */
    private final Lazy f90088g = LazyKt.lazy(new C34902b(this));

    /* renamed from: h */
    private final Lazy f90089h = LazyKt.lazy(new C34906f(this));

    /* renamed from: i */
    private final Lazy f90090i = LazyKt.lazy(new C34903c(this));

    /* renamed from: j */
    private C34942d f90091j;

    /* renamed from: k */
    private final DataObserver<Chat> f90092k = new C34904d(this, true);

    /* renamed from: j */
    private final TextView m135791j() {
        return (TextView) this.f90088g.getValue();
    }

    /* renamed from: k */
    private final GridView m135792k() {
        return (GridView) this.f90089h.getValue();
    }

    /* renamed from: l */
    private final TextView m135793l() {
        return (TextView) this.f90090i.getValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: f */
    public int mo127635f() {
        return 18;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/GroupAdminPiece$Companion;", "", "()V", "CHAT_MEMBER_COUNT_THRESHOLD", "", "LOG_TAG", "", "MAX_LARGE_CHAT_ADMIN_COUNT", "MAX_NORMAL_CHAT_ADMIN_COUNT", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: e */
    public void mo127634e() {
        mo177190a(Chat.class, this.f90092k);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: g */
    public View.OnClickListener mo127636g() {
        return new View$OnClickListenerC34905e(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$b */
    static final class C34902b extends Lambda implements Function0<TextView> {
        final /* synthetic */ GroupAdminPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34902b(GroupAdminPiece groupAdminPiece) {
            super(0);
            this.this$0 = groupAdminPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.this$0.mo177201f(R.id.add_chat_admin_tv);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$c */
    static final class C34903c extends Lambda implements Function0<TextView> {
        final /* synthetic */ GroupAdminPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34903c(GroupAdminPiece groupAdminPiece) {
            super(0);
            this.this$0 = groupAdminPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final TextView invoke() {
            return (TextView) this.this$0.mo177201f(R.id.chat_admin_num_tv);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/GridView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$f */
    static final class C34906f extends Lambda implements Function0<GridView> {
        final /* synthetic */ GroupAdminPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34906f(GroupAdminPiece groupAdminPiece) {
            super(0);
            this.this$0 = groupAdminPiece;
        }

        @Override // kotlin.jvm.functions.Function0
        public final GridView invoke() {
            return (GridView) this.this$0.mo177201f(R.id.chat_admin_gv);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/v2/permission/GroupAdminPiece$chatObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$d */
    public static final class C34904d extends DataObserver<Chat> {

        /* renamed from: a */
        final /* synthetic */ GroupAdminPiece f90093a;

        /* renamed from: a */
        public void mo127664a(Chat chat) {
            int i;
            if (chat != null) {
                View s = this.f90093a.mo177205s();
                if (C34526a.m134090a(chat)) {
                    this.f90093a.mo128705a(chat);
                    i = 0;
                } else {
                    i = 8;
                }
                s.setVisibility(i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34904d(GroupAdminPiece groupAdminPiece, boolean z) {
            super(z);
            this.f90093a = groupAdminPiece;
        }
    }

    /* renamed from: a */
    public final void mo128705a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Job unused = C69553g.m266944a(this, null, null, new C34907g(this, chat, null), 3, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$e */
    static final class View$OnClickListenerC34905e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAdminPiece f90094a;

        View$OnClickListenerC34905e(GroupAdminPiece groupAdminPiece) {
            this.f90094a = groupAdminPiece;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
            if ((r6 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece r6 = r5.f90094a
                com.ss.android.lark.piece.a.c r6 = r6.mo177203q()
                java.lang.Class<com.ss.android.lark.chat.entity.chat.Chat> r0 = com.ss.android.lark.chat.entity.chat.Chat.class
                java.util.concurrent.ConcurrentHashMap r6 = r6.mo177165a()
                java.lang.Object r6 = r6.get(r0)
                r0 = 0
                if (r6 == 0) goto L_0x001d
                java.lang.String r1 = "dataMap[key] ?: return null"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)
                boolean r1 = r6 instanceof com.ss.android.lark.chat.entity.chat.Chat
                if (r1 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r6 = r0
            L_0x001e:
                com.ss.android.lark.chat.entity.chat.Chat r6 = (com.ss.android.lark.chat.entity.chat.Chat) r6
                if (r6 == 0) goto L_0x005f
                java.lang.String r6 = r6.getId()
                java.lang.String r1 = "chat.getId()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)
                com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece r1 = r5.f90094a
                android.content.Context r1 = r1.mo177180C()
                boolean r2 = r1 instanceof android.app.Activity
                if (r2 != 0) goto L_0x0036
                r1 = r0
            L_0x0036:
                android.app.Activity r1 = (android.app.Activity) r1
                if (r1 == 0) goto L_0x005f
                com.ss.android.lark.chatsetting.a.c r2 = com.ss.android.lark.chatsetting.ChatSettingModule.m133639a()
                java.lang.String r3 = "ChatSettingModule.getDependency()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                com.ss.android.lark.chatsetting.a.c$l r2 = r2.mo127281k()
                com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece r3 = r5.f90094a
                java.util.List<com.ss.android.lark.chat.entity.chatter.ChatChatter> r3 = r3.f90087a
                boolean r3 = r3.isEmpty()
                r4 = 0
                if (r3 == 0) goto L_0x0056
                r2.mo127401a(r1, r6, r4)
                goto L_0x0059
            L_0x0056:
                r2.mo127403a(r1, r6, r4)
            L_0x0059:
                com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew$GroupManageParam r6 = com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew.GroupManageParam.GROUP_ADMIN_MEMBER
                r1 = 2
                com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew.m136625a(r6, r0, r1, r0)
            L_0x005f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece.View$OnClickListenerC34905e.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$loadChatAdmins$1", mo239173f = "GroupAdminPiece.kt", mo239174i = {0, 0}, mo239175l = {140}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "request"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece$g */
    public static final class C34907g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Chat $chat;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ GroupAdminPiece this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34907g(GroupAdminPiece groupAdminPiece, Chat chat, Continuation cVar) {
            super(2, cVar);
            this.this$0 = groupAdminPiece;
            this.$chat = chat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C34907g gVar = new C34907g(this.this$0, this.$chat, cVar);
            gVar.p$ = (CoroutineScope) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C34907g) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                GetChatAdminUsersRequest a2 = new GetChatAdminUsersRequest.C17482a().mo61267a(this.$chat.getId()).mo61266a(SyncDataStrategy.FORCE_SERVER).build();
                ChatSettingService bVar = ChatSettingService.f88988a;
                Intrinsics.checkExpressionValueIsNotNull(a2, "request");
                RucketJob<List<Chatter>> a3 = bVar.mo127455a(a2);
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.label = 1;
                obj = a3.mo93484a(this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                GetChatAdminUsersRequest getChatAdminUsersRequest = (GetChatAdminUsersRequest) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RucketResult bVar2 = (RucketResult) obj;
            if (bVar2 instanceof RucketResult.Success) {
                this.this$0.mo128706a(this.$chat, (List) bVar2.mo93490a());
            } else if (bVar2 instanceof RucketResult.Error) {
                Log.m165383e("GroupAdminPiece", String.valueOf(((RucketResult.Error) bVar2).mo93493c()));
                this.this$0.mo128706a(this.$chat, CollectionsKt.emptyList());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece, com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        View d = C51468a.m199494d(R.layout.item_manage_chat_admin_layout_new, context);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        layoutParams.f2816h = 0;
        layoutParams.f2819k = 0;
        d.setLayoutParams(layoutParams);
        View a = super.mo127619a(context, marginLayoutParams);
        if (a != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a;
            constraintLayout.addView(d);
            return constraintLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
    }

    /* renamed from: a */
    public final void mo128706a(Chat chat, List<? extends Chatter> list) {
        int i;
        int i2;
        String str;
        int i3;
        this.f90087a.clear();
        for (Chatter chatter : list) {
            ChatChatter chatChatter = new ChatChatter(chatter);
            chatChatter.setChatId(chat.getId());
            this.f90087a.add(chatChatter);
        }
        C34942d dVar = new C34942d(mo177180C(), this.f90087a, chat, C34526a.m134090a(chat));
        dVar.mo128863a(new ChatAdminItemListener(mo177180C(), chat, this.f90087a.size()));
        this.f90091j = dVar;
        m135792k().setAdapter((ListAdapter) this.f90091j);
        TextView j = m135791j();
        int i4 = 0;
        if (this.f90087a.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        j.setVisibility(i);
        TextView l = m135793l();
        if (this.f90087a.isEmpty()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        l.setVisibility(i2);
        TextView l2 = m135793l();
        if (!this.f90087a.isEmpty()) {
            if (chat.getMemberCount() <= 5000) {
                i3 = 10;
            } else {
                i3 = 20;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f90087a.size());
            sb.append('/');
            sb.append(i3);
            str = sb.toString();
        }
        l2.setText(str);
        GridView k = m135792k();
        if (this.f90087a.isEmpty()) {
            i4 = 8;
        }
        k.setVisibility(i4);
    }
}
