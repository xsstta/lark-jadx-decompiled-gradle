package com.ss.android.lark.chatsetting.impl.group.ownership.v2;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.impl.common_view.base.CustomizeLinearPieceGroup;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingPieceTypeManager;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingSectionNamePiece;
import com.ss.android.lark.chatsetting.impl.common_view.chatsetting.ChatSettingOrderManage;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.calendar.MeetingToChatPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.AllowSearchPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveHistoryPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.JoinLeaveMessageVisibilityPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.MembershipApprovalPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.NewMemberSeeHistoryMessagePiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.ShareHistoryPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.invitation.Type;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.other.TransferOwnerPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AddAndSharePermissionPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AllowAnonymousPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.AtAllPermissionPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.BuzzPermissionPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EditGroupInfoPermissionPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.EmailSettingPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.GroupAdminPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.PinPermissionPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.PostSettingPiece;
import com.ss.android.lark.chatsetting.impl.group.ownership.v2.permission.VCPermissionPiece;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.data.SharedData;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\"\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0012\u0010(\u001a\u00020\u001d2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u001dH\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/GroupOwnershipActivityV2;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "contentView$delegate", "Lkotlin/Lazy;", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "getPieceGroup", "()Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceGroup$delegate", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "getPieceManager", "()Lcom/ss/android/lark/piece/core/PieceManager;", "pieceManager$delegate", "pushChatListener", "Lcom/ss/android/lark/chatsetting/dto/PushChatRelationListener;", "getPushChatListener", "()Lcom/ss/android/lark/chatsetting/dto/PushChatRelationListener;", "pushChatListener$delegate", "createSettingItems", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/CustomizeLinearPieceGroup;", ShareHitPoint.f121869d, "", "finishActivityWithResult", "", "ownerId", "", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "handleData", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GroupOwnershipActivityV2 extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f90030a = new Companion(null);

    /* renamed from: b */
    private final Lazy f90031b = LazyKt.lazy(new C34866c(this));

    /* renamed from: c */
    private final Lazy f90032c = LazyKt.lazy(new C34867d(this));

    /* renamed from: d */
    private final Lazy f90033d = LazyKt.lazy(new C34865b(this));

    /* renamed from: e */
    private final Lazy f90034e = LazyKt.lazy(new C34868e(this));

    /* renamed from: f */
    private final PieceManager m135653f() {
        return (PieceManager) this.f90032c.getValue();
    }

    /* renamed from: g */
    private final View m135654g() {
        return (View) this.f90033d.getValue();
    }

    /* renamed from: h */
    private final PushChatRelationListener m135655h() {
        return (PushChatRelationListener) this.f90034e.getValue();
    }

    /* renamed from: a */
    public Context mo128656a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public final LinearPieceGroup mo128657a() {
        return (LinearPieceGroup) this.f90031b.getValue();
    }

    /* renamed from: a */
    public void mo128658a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m135649a(this, context);
    }

    /* renamed from: c */
    public Resources mo128661c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m135646a(this, configuration);
    }

    /* renamed from: d */
    public void mo128663d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo128664e() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m135652c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m135647a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m135651b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/GroupOwnershipActivityV2$Companion;", "", "()V", "ITEMS_PADDING_BOTTOM", "", "ITEMS_PADDING_HORIZONTAL", "ITEM_MARGIN_VERTICAL", "LOG_TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/chatsetting/impl/group/ownership/v2/GroupOwnershipActivityV2$pushChatListener$2$1", "invoke", "()Lcom/ss/android/lark/chatsetting/impl/group/ownership/v2/GroupOwnershipActivityV2$pushChatListener$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2$e */
    static final class C34868e extends Lambda implements Function0<C348691> {
        final /* synthetic */ GroupOwnershipActivityV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34868e(GroupOwnershipActivityV2 groupOwnershipActivityV2) {
            super(0);
            this.this$0 = groupOwnershipActivityV2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C348691 invoke() {
            return new PushChatRelationListener(this) {
                /* class com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2.C34868e.C348691 */

                /* renamed from: a */
                final /* synthetic */ C34868e f90035a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f90035a = r1;
                }

                @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
                /* renamed from: a */
                public void mo127537a(Chat chat) {
                    String str;
                    boolean z;
                    Intrinsics.checkParameterIsNotNull(chat, "pushChat");
                    Chat b = this.f90035a.this$0.mo128660b();
                    if (b != null) {
                        str = b.getId();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, chat.getId())) {
                        SharedData q = this.f90035a.this$0.mo128657a().mo177203q();
                        if (!b.isMeeting() || chat.isMeeting()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        q.mo177168a("is_meeting_changed", Boolean.valueOf(z));
                        this.f90035a.this$0.mo128657a().mo177203q().mo177168a(Chat.class, chat);
                    }
                }

                @Override // com.ss.android.lark.chatsetting.dto.PushChatRelationListener
                /* renamed from: a */
                public void mo127538a(Chat chat, Map<String, ? extends Chatter> map) {
                    Intrinsics.checkParameterIsNotNull(chat, "pushChat");
                    Intrinsics.checkParameterIsNotNull(map, "chatterMap");
                    Chat b = this.f90035a.this$0.mo128660b();
                    if (b != null && !(!Intrinsics.areEqual(b.getId(), chat.getId()))) {
                        AbstractC34461c a = ChatSettingModule.m133639a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
                        AbstractC34461c.AbstractC34476o g = a.mo127277g();
                        Intrinsics.checkExpressionValueIsNotNull(g, "ChatSettingModule.getDependency().loginDependency");
                        if (map.containsKey(g.mo127412a())) {
                            Log.m165389i("GroupOwnershipActivityV2", "PUSH_CHAT_REMOVE_USERS self is not in this chat:" + chat.getId());
                            GroupOwnershipActivityV2 groupOwnershipActivityV2 = this.f90035a.this$0;
                            String ownerId = chat.getOwnerId();
                            Intrinsics.checkExpressionValueIsNotNull(ownerId, "pushChat.ownerId");
                            groupOwnershipActivityV2.mo128659a(ownerId);
                        }
                    }
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2$b */
    static final class C34865b extends Lambda implements Function0<View> {
        final /* synthetic */ GroupOwnershipActivityV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34865b(GroupOwnershipActivityV2 groupOwnershipActivityV2) {
            super(0);
            this.this$0 = groupOwnershipActivityV2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.mo128657a().mo177214a(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2$c */
    static final class C34866c extends Lambda implements Function0<LinearPieceGroup> {
        final /* synthetic */ GroupOwnershipActivityV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34866c(GroupOwnershipActivityV2 groupOwnershipActivityV2) {
            super(0);
            this.this$0 = groupOwnershipActivityV2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearPieceGroup invoke() {
            return (LinearPieceGroup) new LinearPieceGroup(1).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) this.this$0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/piece/core/PieceManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2$d */
    static final class C34867d extends Lambda implements Function0<PieceManager> {
        final /* synthetic */ GroupOwnershipActivityV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34867d(GroupOwnershipActivityV2 groupOwnershipActivityV2) {
            super(0);
            this.this$0 = groupOwnershipActivityV2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PieceManager invoke() {
            Bundle bundle;
            PieceManager.Builder a = new PieceManager.Builder(this.this$0.mo128657a(), this.this$0).mo177234a(this.this$0);
            Intent intent = this.this$0.getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            return a.mo177233a(bundle).mo177237d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Chat b = mo128660b();
        if (b != null) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127275e().mo127433b(String.valueOf(hashCode()), b.getId(), m135655h());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ((r0 instanceof com.ss.android.lark.chat.entity.chat.Chat) != false) goto L_0x0020;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.lark.chat.entity.chat.Chat mo128660b() {
        /*
            r3 = this;
            com.ss.android.lark.piece.layout.LinearPieceGroup r0 = r3.mo128657a()
            com.ss.android.lark.piece.a.c r0 = r0.mo177203q()
            java.lang.Class<com.ss.android.lark.chat.entity.chat.Chat> r1 = com.ss.android.lark.chat.entity.chat.Chat.class
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.chat.entity.chat.Chat
            if (r2 == 0) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            com.ss.android.lark.chat.entity.chat.Chat r0 = (com.ss.android.lark.chat.entity.chat.Chat) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chatsetting.impl.group.ownership.v2.GroupOwnershipActivityV2.mo128660b():com.ss.android.lark.chat.entity.chat.Chat");
    }

    /* renamed from: a */
    public static Resources m135647a(GroupOwnershipActivityV2 groupOwnershipActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupOwnershipActivityV2);
        }
        return groupOwnershipActivityV2.mo128661c();
    }

    /* renamed from: c */
    public static AssetManager m135652c(GroupOwnershipActivityV2 groupOwnershipActivityV2) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupOwnershipActivityV2);
        }
        return groupOwnershipActivityV2.mo128664e();
    }

    /* renamed from: b */
    public static void m135651b(GroupOwnershipActivityV2 groupOwnershipActivityV2) {
        groupOwnershipActivityV2.mo128663d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GroupOwnershipActivityV2 groupOwnershipActivityV22 = groupOwnershipActivityV2;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    groupOwnershipActivityV22.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private final void m135650b(int i) {
        Object obj;
        Bundle extras;
        Bundle extras2;
        Intent intent = getIntent();
        Chat chat = null;
        if (intent == null || (extras2 = intent.getExtras()) == null) {
            obj = null;
        } else {
            obj = extras2.get("key_group_management_chat");
        }
        if (obj instanceof Chat) {
            chat = obj;
        }
        Chat chat2 = chat;
        Intent intent2 = getIntent();
        boolean z = false;
        if (!(intent2 == null || (extras = intent2.getExtras()) == null)) {
            z = extras.getBoolean("key_group_management_need_scroll_bottom", false);
        }
        PieceManager b = m135653f().mo177230b();
        if (chat2 != null) {
            b.mo177229a().mo177168a(Chat.class, chat2);
            b.mo177229a().mo177168a("current_page_type", Integer.valueOf(i));
            b.mo177229a().mo177168a("is_scroll_bottom", Boolean.valueOf(z));
        }
        if (chat2 != null) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127275e().mo127431a(String.valueOf(hashCode()), chat2.getId(), m135655h());
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        CustomizeLinearPieceGroup a = m135648a(2);
        LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a(mo128657a(), new GroupOwnershipToolbarPiece(), false, 2, null);
        ScrollViewPiece scrollViewPiece = (ScrollViewPiece) new ScrollViewPiece().mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) this));
        if (a != null) {
            linearPieceGroup.mo177217a((Piece) PieceGroup.m199535a(scrollViewPiece, a, false, 2, null), (ViewGroup.MarginLayoutParams) new LinearLayout.LayoutParams(-1, -2), true);
            setContentView(m135654g());
            m135650b(2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.piece.core.Piece<*>");
    }

    /* renamed from: a */
    public final void mo128659a(String str) {
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
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    private final CustomizeLinearPieceGroup m135648a(int i) {
        GroupOwnershipActivityV2 groupOwnershipActivityV2 = this;
        return new SettingPieceTypeManager().mo127657b((SettingBasePiece) new SettingSectionNamePiece(R.string.Lark_Chat_MemberPermissionManagement).mo127623a(17)).mo127657b(new GroupAdminPiece()).mo127657b(new EditGroupInfoPermissionPiece()).mo127657b(new VCPermissionPiece()).mo127657b(new AtAllPermissionPiece()).mo127657b(new BuzzPermissionPiece()).mo127657b(new PinPermissionPiece()).mo127657b(new PostSettingPiece()).mo127657b(new EmailSettingPiece()).mo127657b(new AllowAnonymousPiece()).mo127657b((SettingBasePiece) new SettingSectionNamePiece(R.string.Lark_Legacy_InvitationSettings).mo127623a(24)).mo127657b(new MembershipApprovalPiece()).mo127657b(new AllowSearchPiece()).mo127657b(new AddAndSharePermissionPiece()).mo127657b(new NewMemberSeeHistoryMessagePiece()).mo127657b((SettingBasePiece) new JoinLeaveMessageVisibilityPiece(Type.JOIN_CHAT).mo127623a(29)).mo127657b((SettingBasePiece) new JoinLeaveMessageVisibilityPiece(Type.LEAVE_CHAT).mo127623a(30)).mo127657b(new JoinLeaveHistoryPiece()).mo127657b(new ShareHistoryPiece()).mo127657b((SettingBasePiece) new TransferOwnerPiece().mo177196b((Context) groupOwnershipActivityV2, 0, 8, 0, 0)).mo127657b((SettingBasePiece) new MeetingToChatPiece().mo177196b((Context) groupOwnershipActivityV2, 0, 8, 0, 0)).mo127655a(ChatSettingOrderManage.m134191a(i)).mo127621a((Context) groupOwnershipActivityV2, 16, 0, 16, 60);
    }

    /* renamed from: a */
    public static void m135649a(GroupOwnershipActivityV2 groupOwnershipActivityV2, Context context) {
        groupOwnershipActivityV2.mo128658a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(groupOwnershipActivityV2);
        }
    }

    /* renamed from: a */
    public static Context m135646a(GroupOwnershipActivityV2 groupOwnershipActivityV2, Configuration configuration) {
        Context a = groupOwnershipActivityV2.mo128656a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m135653f().onActivityResult(i, i2, intent);
    }
}
