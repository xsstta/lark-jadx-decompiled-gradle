package com.ss.android.lark.member_manage.impl.join_group;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.impl.statistics.GroupMemberManageHitPointNew;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil;", "", "()V", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.a.a */
public final class JoinGroupChatUtil {

    /* renamed from: a */
    public static final int f113675a;

    /* renamed from: b */
    public static final Companion f113676b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001:\u00010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jd\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J?\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u001f¢\u0006\u0002\u0010 JB\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001fJB\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0019\u001a\u00020\u001fJ@\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001fJJ\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u001fJ<\u0010(\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001fJ\u0010\u0010-\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\\\u0010.\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion;", "", "()V", "ERROR_CODE_ADD_CHAT_CHATTER_APPLY_NOT_OPEN", "", "ERROR_CODE_ADD_CHAT_CHATTER_RICH_MEMBER_LIMIT", "ERROR_CODE_LOGIN_USER_AUTHENTICATEED_DENIED", "ERROR_CODE_NEED_UPGRADE_FOR_APPLY_CHECK", "ERROR_CODE_REPEATED_PUT_CHAT_CHATTER_REQUEST", "ERROR_CODE_SHARE_GROUP_CHAT_HAVE_ENTERED", "handleJoinGroupError", "", "context", "Landroid/content/Context;", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "chatId", "", "userList", "", "inviterId", "joinToken", "ways", "wrapCallback", "Lcom/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$CallbackWrap;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "joinGroupChat", "pickEntities", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;)V", "joinGroupViaLink", "token", "joinGroupViaQRCode", "joinGroupViaShare", "messageId", "joinGroupViaToken", "fromLink", "joinTopicGroup", "topicGroupId", "chatterIds", "subscribeTopic", "joinWay", "sendJoinGroupFailHitPointIfNeed", "showChatChatterApplyDialog", "inviteeIds", "CallbackWrap", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a */
    public static final class Companion {

        /* access modifiers changed from: private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$CallbackWrap;", "Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "callback", "(Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;)V", "getCallback", "()Lcom/ss/android/lark/member_manage/export/callback/IJoinGroupCallback;", "joinGroupChatSuccess", "", "chatId", "", "onCancelSendApply", "onError", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSendApplyError", "sendApplySuccess", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$a */
        public static final class CallbackWrap implements AbstractC44896a {

            /* renamed from: a */
            private final AbstractC44896a f113677a;

            /* renamed from: c */
            public final AbstractC44896a mo158922c() {
                return this.f113677a;
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$a$a */
            public static final class RunnableC44898a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ CallbackWrap f113678a;

                /* renamed from: b */
                final /* synthetic */ String f113679b;

                RunnableC44898a(CallbackWrap aVar, String str) {
                    this.f113678a = aVar;
                    this.f113679b = str;
                }

                public final void run() {
                    AbstractC44896a c = this.f113678a.mo158922c();
                    if (c != null) {
                        c.mo128965a(this.f113679b);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$a$b */
            public static final class RunnableC44899b implements Runnable {

                /* renamed from: a */
                final /* synthetic */ CallbackWrap f113680a;

                RunnableC44899b(CallbackWrap aVar) {
                    this.f113680a = aVar;
                }

                public final void run() {
                    AbstractC44896a c = this.f113680a.mo158922c();
                    if (c != null) {
                        c.mo128966b();
                    }
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$a$c */
            public static final class RunnableC44900c implements Runnable {

                /* renamed from: a */
                final /* synthetic */ CallbackWrap f113681a;

                /* renamed from: b */
                final /* synthetic */ ErrorResult f113682b;

                RunnableC44900c(CallbackWrap aVar, ErrorResult errorResult) {
                    this.f113681a = aVar;
                    this.f113682b = errorResult;
                }

                public final void run() {
                    AbstractC44896a c = this.f113681a.mo158922c();
                    if (c != null) {
                        c.mo128964a(this.f113682b);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$a$d */
            public static final class RunnableC44901d implements Runnable {

                /* renamed from: a */
                final /* synthetic */ CallbackWrap f113683a;

                /* renamed from: b */
                final /* synthetic */ ErrorResult f113684b;

                RunnableC44901d(CallbackWrap aVar, ErrorResult errorResult) {
                    this.f113683a = aVar;
                    this.f113684b = errorResult;
                }

                public final void run() {
                    AbstractC44896a c = this.f113683a.mo158922c();
                    if (c != null) {
                        c.mo128967b(this.f113684b);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$a$e */
            public static final class RunnableC44902e implements Runnable {

                /* renamed from: a */
                final /* synthetic */ CallbackWrap f113685a;

                RunnableC44902e(CallbackWrap aVar) {
                    this.f113685a = aVar;
                }

                public final void run() {
                    AbstractC44896a c = this.f113685a.mo158922c();
                    if (c != null) {
                        c.mo128963a();
                    }
                }
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128963a() {
                UICallbackExecutor.execute(new RunnableC44902e(this));
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: b */
            public void mo128966b() {
                UICallbackExecutor.execute(new RunnableC44899b(this));
            }

            public CallbackWrap(AbstractC44896a aVar) {
                this.f113677a = aVar;
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128964a(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
                UICallbackExecutor.execute(new RunnableC44900c(this, errorResult));
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: b */
            public void mo128967b(ErrorResult errorResult) {
                UICallbackExecutor.execute(new RunnableC44901d(this, errorResult));
            }

            @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
            /* renamed from: a */
            public void mo128965a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "chatId");
                UICallbackExecutor.execute(new RunnableC44898a(this, str));
            }
        }

        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$b */
        public static final class RunnableC44903b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f113686a;

            /* renamed from: b */
            final /* synthetic */ String f113687b;

            /* renamed from: c */
            final /* synthetic */ List f113688c;

            /* renamed from: d */
            final /* synthetic */ String f113689d;

            /* renamed from: e */
            final /* synthetic */ String f113690e;

            /* renamed from: f */
            final /* synthetic */ int f113691f;

            /* renamed from: g */
            final /* synthetic */ CallbackWrap f113692g;

            /* renamed from: h */
            final /* synthetic */ IGetDataCallback f113693h;

            RunnableC44903b(Context context, String str, List list, String str2, String str3, int i, CallbackWrap aVar, IGetDataCallback iGetDataCallback) {
                this.f113686a = context;
                this.f113687b = str;
                this.f113688c = list;
                this.f113689d = str2;
                this.f113690e = str3;
                this.f113691f = i;
                this.f113692g = aVar;
                this.f113693h = iGetDataCallback;
            }

            public final void run() {
                JoinGroupChatUtil.f113676b.mo158917a(this.f113686a, this.f113687b, this.f113688c, this.f113689d, this.f113690e, this.f113691f, this.f113692g, this.f113693h);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$c */
        public static final class RunnableC44904c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f113694a;

            /* renamed from: b */
            final /* synthetic */ List f113695b;

            /* renamed from: c */
            final /* synthetic */ Integer f113696c;

            /* renamed from: d */
            final /* synthetic */ Context f113697d;

            /* renamed from: e */
            final /* synthetic */ CallbackWrap f113698e;

            /* renamed from: f */
            final /* synthetic */ AbstractC44896a f113699f;

            RunnableC44904c(String str, List list, Integer num, Context context, CallbackWrap aVar, AbstractC44896a aVar2) {
                this.f113694a = str;
                this.f113695b = list;
                this.f113696c = num;
                this.f113697d = context;
                this.f113698e = aVar;
                this.f113699f = aVar2;
            }

            public final void run() {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                a.getChatDependency().mo143757a(this.f113694a, this.f113695b, (IGetDataCallback<Chat>) new IGetDataCallback<Chat>(this) {
                    /* class com.ss.android.lark.member_manage.impl.join_group.JoinGroupChatUtil.Companion.RunnableC44904c.C449051 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC44904c f113700a;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$joinGroupChat$1$1$onError$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$c$1$a */
                    public static final class C44906a implements IGetDataCallback<Boolean> {

                        /* renamed from: a */
                        final /* synthetic */ C449051 f113701a;

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        C44906a(C449051 r1) {
                            this.f113701a = r1;
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            this.f113701a.f113700a.f113698e.mo128963a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            int errorCode = errorResult.getErrorCode();
                            if (errorCode == 5008) {
                                CallbackWrap aVar = this.f113701a.f113700a.f113698e;
                                String str = this.f113701a.f113700a.f113694a;
                                if (str == null) {
                                    str = "";
                                }
                                aVar.mo128965a(str);
                            } else if (errorCode != 5027) {
                                this.f113701a.f113700a.f113698e.mo128967b(errorResult);
                            } else {
                                JoinGroupChatUtil.f113676b.mo158916a(this.f113701a.f113700a.f113697d, this.f113701a.f113700a.f113694a, this.f113701a.f113700a.f113695b, this.f113701a.f113700a.f113696c, this.f113701a.f113700a.f113699f);
                            }
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f113700a = r1;
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        CallbackWrap aVar = this.f113700a.f113698e;
                        String str = this.f113700a.f113694a;
                        if (str == null) {
                            str = "";
                        }
                        aVar.mo128965a(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        String str;
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        Integer num = this.f113700a.f113696c;
                        ArrayList arrayList = null;
                        if (num != null && num.intValue() == 2) {
                            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                            IGroupMemberManageModuleDependency.AbstractC44878a accountDependency = a.getAccountDependency();
                            Intrinsics.checkExpressionValueIsNotNull(accountDependency, "GroupMemberManageModule.…dency().accountDependency");
                            str = accountDependency.mo143795b();
                        } else {
                            str = null;
                        }
                        List list = this.f113700a.f113695b;
                        if (list != null) {
                            ArrayList<PickChatEntity> arrayList2 = new ArrayList();
                            for (Object obj : list) {
                                boolean z = true;
                                if (((PickChatEntity) obj).mo124689a() != 1) {
                                    z = false;
                                }
                                if (z) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (PickChatEntity pickChatEntity : arrayList2) {
                                String b = pickChatEntity.mo124690b();
                                if (b != null) {
                                    arrayList3.add(b);
                                }
                            }
                            arrayList = arrayList3;
                        }
                        JoinGroupChatUtil.f113676b.mo158913a(this.f113700a.f113697d, errorResult, this.f113700a.f113694a, arrayList, str, null, this.f113700a.f113696c.intValue(), this.f113700a.f113698e, new C44906a(this));
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$d */
        public static final class RunnableC44907d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f113702a;

            /* renamed from: b */
            final /* synthetic */ CallbackWrap f113703b;

            /* renamed from: c */
            final /* synthetic */ String f113704c;

            /* renamed from: d */
            final /* synthetic */ Context f113705d;

            /* renamed from: e */
            final /* synthetic */ List f113706e;

            /* renamed from: f */
            final /* synthetic */ String f113707f;

            /* renamed from: g */
            final /* synthetic */ AbstractC44896a f113708g;

            RunnableC44907d(String str, CallbackWrap aVar, String str2, Context context, List list, String str3, AbstractC44896a aVar2) {
                this.f113702a = str;
                this.f113703b = aVar;
                this.f113704c = str2;
                this.f113705d = context;
                this.f113706e = list;
                this.f113707f = str3;
                this.f113708g = aVar2;
            }

            public final void run() {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                a.getChatDependency().mo143749a(this.f113702a, new IGetDataCallback<Chat>(this) {
                    /* class com.ss.android.lark.member_manage.impl.join_group.JoinGroupChatUtil.Companion.RunnableC44907d.C449081 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC44907d f113709a;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$joinGroupViaLink$1$1$onError$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$d$1$a */
                    public static final class C44909a implements IGetDataCallback<Boolean> {

                        /* renamed from: a */
                        final /* synthetic */ C449081 f113710a;

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        C44909a(C449081 r1) {
                            this.f113710a = r1;
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            this.f113710a.f113709a.f113703b.mo128963a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            int errorCode = errorResult.getErrorCode();
                            if (errorCode == 5008) {
                                CallbackWrap aVar = this.f113710a.f113709a.f113703b;
                                String str = this.f113710a.f113709a.f113704c;
                                if (str == null) {
                                    str = "";
                                }
                                aVar.mo128965a(str);
                            } else if (errorCode != 5027) {
                                this.f113710a.f113709a.f113703b.mo128967b(errorResult);
                            } else {
                                JoinGroupChatUtil.f113676b.mo158914a(this.f113710a.f113709a.f113705d, this.f113710a.f113709a.f113704c, this.f113710a.f113709a.f113702a, this.f113710a.f113709a.f113706e, this.f113710a.f113709a.f113707f, this.f113710a.f113709a.f113708g);
                            }
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f113709a = r1;
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        CallbackWrap aVar = this.f113709a.f113703b;
                        String str = this.f113709a.f113704c;
                        if (str == null) {
                            str = "";
                        }
                        aVar.mo128965a(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        JoinGroupChatUtil.f113676b.mo158920a(errorResult);
                        JoinGroupChatUtil.f113676b.mo158913a(this.f113709a.f113705d, errorResult, this.f113709a.f113704c, this.f113709a.f113706e, this.f113709a.f113707f, this.f113709a.f113702a, 6, this.f113709a.f113703b, new C44909a(this));
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$e */
        public static final class RunnableC44910e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f113711a;

            /* renamed from: b */
            final /* synthetic */ String f113712b;

            /* renamed from: c */
            final /* synthetic */ String f113713c;

            /* renamed from: d */
            final /* synthetic */ CallbackWrap f113714d;

            /* renamed from: e */
            final /* synthetic */ Context f113715e;

            /* renamed from: f */
            final /* synthetic */ List f113716f;

            /* renamed from: g */
            final /* synthetic */ AbstractC44896a f113717g;

            RunnableC44910e(String str, String str2, String str3, CallbackWrap aVar, Context context, List list, AbstractC44896a aVar2) {
                this.f113711a = str;
                this.f113712b = str2;
                this.f113713c = str3;
                this.f113714d = aVar;
                this.f113715e = context;
                this.f113716f = list;
                this.f113717g = aVar2;
            }

            public final void run() {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                a.getChatDependency().mo143754a(this.f113711a, this.f113712b, this.f113713c, new IGetDataCallback<Chat>(this) {
                    /* class com.ss.android.lark.member_manage.impl.join_group.JoinGroupChatUtil.Companion.RunnableC44910e.C449111 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC44910e f113718a;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$joinGroupViaQRCode$1$1$onError$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$e$1$a */
                    public static final class C44912a implements IGetDataCallback<Boolean> {

                        /* renamed from: a */
                        final /* synthetic */ C449111 f113719a;

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        C44912a(C449111 r1) {
                            this.f113719a = r1;
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            this.f113719a.f113718a.f113714d.mo128963a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            JoinGroupChatUtil.f113676b.mo158920a(errorResult);
                            int errorCode = errorResult.getErrorCode();
                            if (errorCode == 5008) {
                                CallbackWrap aVar = this.f113719a.f113718a.f113714d;
                                String str = this.f113719a.f113718a.f113711a;
                                if (str == null) {
                                    str = "";
                                }
                                aVar.mo128965a(str);
                            } else if (errorCode != 5027) {
                                this.f113719a.f113718a.f113714d.mo128967b(errorResult);
                            } else {
                                JoinGroupChatUtil.f113676b.mo158921b(this.f113719a.f113718a.f113715e, this.f113719a.f113718a.f113711a, this.f113719a.f113718a.f113716f, this.f113719a.f113718a.f113712b, this.f113719a.f113718a.f113713c, this.f113719a.f113718a.f113717g);
                            }
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f113718a = r1;
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        CallbackWrap aVar = this.f113718a.f113714d;
                        String str = this.f113718a.f113711a;
                        if (str == null) {
                            str = "";
                        }
                        aVar.mo128965a(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        JoinGroupChatUtil.f113676b.mo158913a(this.f113718a.f113715e, errorResult, this.f113718a.f113711a, this.f113718a.f113716f, this.f113718a.f113712b, this.f113718a.f113713c, 3, this.f113718a.f113714d, new C44912a(this));
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$f */
        public static final class RunnableC44913f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f113720a;

            /* renamed from: b */
            final /* synthetic */ String f113721b;

            /* renamed from: c */
            final /* synthetic */ CallbackWrap f113722c;

            /* renamed from: d */
            final /* synthetic */ Context f113723d;

            /* renamed from: e */
            final /* synthetic */ String f113724e;

            /* renamed from: f */
            final /* synthetic */ List f113725f;

            /* renamed from: g */
            final /* synthetic */ AbstractC44896a f113726g;

            RunnableC44913f(String str, String str2, CallbackWrap aVar, Context context, String str3, List list, AbstractC44896a aVar2) {
                this.f113720a = str;
                this.f113721b = str2;
                this.f113722c = aVar;
                this.f113723d = context;
                this.f113724e = str3;
                this.f113725f = list;
                this.f113726g = aVar2;
            }

            public final void run() {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                a.getChatDependency().mo143765b(this.f113720a, this.f113721b, new IGetDataCallback<Chat>(this) {
                    /* class com.ss.android.lark.member_manage.impl.join_group.JoinGroupChatUtil.Companion.RunnableC44913f.C449141 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC44913f f113727a;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$joinGroupViaShare$1$1$onError$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$f$1$a */
                    public static final class C44915a implements IGetDataCallback<Boolean> {

                        /* renamed from: a */
                        final /* synthetic */ C449141 f113728a;

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        C44915a(C449141 r1) {
                            this.f113728a = r1;
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            this.f113728a.f113727a.f113722c.mo128963a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            JoinGroupChatUtil.f113676b.mo158920a(errorResult);
                            int errorCode = errorResult.getErrorCode();
                            if (errorCode == 5008) {
                                CallbackWrap aVar = this.f113728a.f113727a.f113722c;
                                String str = this.f113728a.f113727a.f113724e;
                                if (str == null) {
                                    str = "";
                                }
                                aVar.mo128965a(str);
                            } else if (errorCode != 5027) {
                                this.f113728a.f113727a.f113722c.mo128967b(errorResult);
                            } else {
                                JoinGroupChatUtil.f113676b.mo158918a(this.f113728a.f113727a.f113723d, this.f113728a.f113727a.f113724e, this.f113728a.f113727a.f113725f, this.f113728a.f113727a.f113720a, this.f113728a.f113727a.f113721b, this.f113728a.f113727a.f113726g);
                            }
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f113727a = r1;
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        String str;
                        CallbackWrap aVar = this.f113727a.f113722c;
                        if (chat == null || (str = chat.getId()) == null) {
                            str = "";
                        }
                        aVar.mo128965a(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        JoinGroupChatUtil.f113676b.mo158913a(this.f113727a.f113723d, errorResult, this.f113727a.f113724e, this.f113727a.f113725f, null, this.f113727a.f113721b, 1, this.f113727a.f113722c, new C44915a(this));
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$g */
        public static final class RunnableC44916g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f113729a;

            /* renamed from: b */
            final /* synthetic */ List f113730b;

            /* renamed from: c */
            final /* synthetic */ boolean f113731c;

            /* renamed from: d */
            final /* synthetic */ Context f113732d;

            /* renamed from: e */
            final /* synthetic */ int f113733e;

            /* renamed from: f */
            final /* synthetic */ CallbackWrap f113734f;

            /* renamed from: g */
            final /* synthetic */ AbstractC44896a f113735g;

            RunnableC44916g(String str, List list, boolean z, Context context, int i, CallbackWrap aVar, AbstractC44896a aVar2) {
                this.f113729a = str;
                this.f113730b = list;
                this.f113731c = z;
                this.f113732d = context;
                this.f113733e = i;
                this.f113734f = aVar;
                this.f113735g = aVar2;
            }

            public final void run() {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                a.getChatDependency().mo143760a(this.f113729a, this.f113730b, this.f113731c, new IGetDataCallback<Chat>(this) {
                    /* class com.ss.android.lark.member_manage.impl.join_group.JoinGroupChatUtil.Companion.RunnableC44916g.C449171 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC44916g f113736a;

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$joinTopicGroup$1$1$onError$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
                    /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$g$1$a */
                    public static final class C44918a implements IGetDataCallback<Boolean> {

                        /* renamed from: a */
                        final /* synthetic */ C449171 f113737a;

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        C44918a(C449171 r1) {
                            this.f113737a = r1;
                        }

                        /* renamed from: a */
                        public void onSuccess(Boolean bool) {
                            this.f113737a.f113736a.f113734f.mo128963a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Intrinsics.checkParameterIsNotNull(errorResult, "err");
                            int errorCode = errorResult.getErrorCode();
                            if (errorCode == 5008) {
                                CallbackWrap aVar = this.f113737a.f113736a.f113734f;
                                String str = this.f113737a.f113736a.f113729a;
                                if (str == null) {
                                    str = "";
                                }
                                aVar.mo128965a(str);
                            } else if (errorCode != 5027) {
                                this.f113737a.f113736a.f113734f.mo128967b(errorResult);
                            } else {
                                JoinGroupChatUtil.f113676b.mo158919a(this.f113737a.f113736a.f113732d, this.f113737a.f113736a.f113729a, this.f113737a.f113736a.f113730b, this.f113737a.f113736a.f113731c, this.f113737a.f113736a.f113733e, this.f113737a.f113736a.f113735g);
                            }
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f113736a = r1;
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        CallbackWrap aVar = this.f113736a.f113734f;
                        String str = this.f113736a.f113729a;
                        if (str == null) {
                            str = "";
                        }
                        aVar.mo128965a(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Intrinsics.checkParameterIsNotNull(errorResult, "err");
                        JoinGroupChatUtil.f113676b.mo158913a(this.f113736a.f113732d, errorResult, this.f113736a.f113729a, this.f113736a.f113730b, null, null, this.f113736a.f113733e, this.f113736a.f113734f, new C44918a(this));
                    }
                });
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo158920a(ErrorResult errorResult) {
            if (errorResult.getErrorCode() == 4013) {
                GroupMemberManageHitPointNew.m179745a(true);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/ss/android/lark/member_manage/impl/join_group/JoinGroupChatUtil$Companion$showChatChatterApplyDialog$1", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder$LifecycleCallback;", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "onCreated", "", "dialog", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$h */
        public static final class C44919h extends C25639g.AbstractC25641b<DialogC25637f> {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f113738a;

            /* renamed from: b */
            final /* synthetic */ Context f113739b;

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: b */
            public void mo89274b(DialogC25637f fVar) {
                super.mo89274b(fVar);
                TextView textView = null;
                this.f113738a.element = fVar != null ? (T) ((EditText) fVar.findViewById(R.id.mReasonEt)) : null;
                T t = this.f113738a.element;
                if (t != null) {
                    t.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                }
                if (fVar != null) {
                    textView = (TextView) fVar.findViewById(R.id.mDescTv);
                }
                if (textView != null) {
                    textView.setText(UIUtils.getString(this.f113739b, R.string.Lark_Legacy_MembershipApprovalEnabledPlaceholder));
                }
            }

            C44919h(Ref.ObjectRef objectRef, Context context) {
                this.f113738a = objectRef;
                this.f113739b = context;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "iDialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$i */
        public static final class DialogInterface$OnClickListenerC44920i implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ CallbackWrap f113740a;

            DialogInterface$OnClickListenerC44920i(CallbackWrap aVar) {
                this.f113740a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                this.f113740a.mo128966b();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "iDialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.a.a$a$j */
        public static final class DialogInterface$OnClickListenerC44921j implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f113741a;

            /* renamed from: b */
            final /* synthetic */ List f113742b;

            /* renamed from: c */
            final /* synthetic */ String f113743c;

            /* renamed from: d */
            final /* synthetic */ String f113744d;

            /* renamed from: e */
            final /* synthetic */ Ref.ObjectRef f113745e;

            /* renamed from: f */
            final /* synthetic */ int f113746f;

            /* renamed from: g */
            final /* synthetic */ IGetDataCallback f113747g;

            DialogInterface$OnClickListenerC44921j(String str, List list, String str2, String str3, Ref.ObjectRef objectRef, int i, IGetDataCallback iGetDataCallback) {
                this.f113741a = str;
                this.f113742b = list;
                this.f113743c = str2;
                this.f113744d = str3;
                this.f113745e = objectRef;
                this.f113746f = i;
                this.f113747g = iGetDataCallback;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Editable editable;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                IGroupMemberManageModuleDependency.IChatDependency chatDependency = a.getChatDependency();
                String str = this.f113741a;
                List<String> list = this.f113742b;
                String str2 = this.f113743c;
                String str3 = this.f113744d;
                T t = this.f113745e.element;
                if (t != null) {
                    editable = t.getText();
                } else {
                    editable = null;
                }
                chatDependency.mo143758a(str, list, str2, str3, String.valueOf(editable), this.f113746f, this.f113747g);
            }
        }

        /* renamed from: a */
        public final void mo158916a(Context context, String str, List<? extends PickChatEntity> list, Integer num, AbstractC44896a aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            if (!TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list) && num != null) {
                C57865c.m224576a(new RunnableC44904c(str, list, num, context, new CallbackWrap(aVar), aVar));
            }
        }

        /* renamed from: a */
        public final void mo158914a(Context context, String str, String str2, List<String> list, String str3, AbstractC44896a aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str3, "inviterId");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                C57865c.m224576a(new RunnableC44907d(str2, new CallbackWrap(aVar), str, context, list, str3, aVar));
            }
        }

        /* renamed from: b */
        public final void mo158921b(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str2, "inviterId");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
                C57865c.m224576a(new RunnableC44910e(str, str2, str3, new CallbackWrap(aVar), context, list, aVar));
            }
        }

        /* renamed from: a */
        public final void mo158918a(Context context, String str, List<String> list, String str2, String str3, AbstractC44896a aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str2, "messageId");
            Intrinsics.checkParameterIsNotNull(str3, "joinToken");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
                C57865c.m224576a(new RunnableC44913f(str2, str3, new CallbackWrap(aVar), context, str, list, aVar));
            }
        }

        /* renamed from: a */
        public final void mo158919a(Context context, String str, List<String> list, boolean z, int i, AbstractC44896a aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "topicGroupId");
            Intrinsics.checkParameterIsNotNull(list, "chatterIds");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            if (!TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
                C57865c.m224576a(new RunnableC44916g(str, list, z, context, i, new CallbackWrap(aVar), aVar));
            }
        }

        /* renamed from: a */
        public final void mo158915a(Context context, String str, String str2, List<String> list, String str3, boolean z, AbstractC44896a aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str3, "inviterId");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            if (z) {
                mo158914a(context, str, str2, list, str3, aVar);
            } else {
                mo158921b(context, str, list, str3, str2, aVar);
            }
        }

        /* renamed from: a */
        public final void mo158917a(Context context, String str, List<String> list, String str2, String str3, int i, CallbackWrap aVar, IGetDataCallback<Boolean> iGetDataCallback) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) null;
            new C25639g(context).mo89258q(R.layout.group_manage_applicant_dialog).mo89265x(R.style.UtilsPopDialog).mo89230a(new C44919h(objectRef, context)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, new DialogInterface$OnClickListenerC44920i(aVar)).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface$OnClickListenerC44921j(str, list, str2, str3, objectRef, i, iGetDataCallback)).mo89239c();
        }

        /* renamed from: a */
        public final void mo158913a(Context context, ErrorResult errorResult, String str, List<String> list, String str2, String str3, int i, CallbackWrap aVar, IGetDataCallback<Boolean> iGetDataCallback) {
            String str4;
            int errorCode = errorResult.getErrorCode();
            String str5 = "";
            if (errorCode == 5008) {
                if (str != null) {
                    str5 = str;
                }
                aVar.mo128965a(str5);
            } else if (errorCode == 4012) {
                if (str != null) {
                    str5 = str;
                }
                aVar.mo128965a(str5);
            } else if (errorCode == 5020) {
                UICallbackExecutor.execute(new RunnableC44903b(context, str, list, str2, str3, i, aVar, iGetDataCallback));
            } else if (errorCode == JoinGroupChatUtil.f113675a) {
                IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
                IGroupMemberManageModuleDependency.AbstractC44892n userAuthorityDependency = a.getUserAuthorityDependency();
                Intrinsics.checkExpressionValueIsNotNull(userAuthorityDependency, "GroupMemberManageModule.…).userAuthorityDependency");
                String d = userAuthorityDependency.mo143808d();
                IGroupMemberManageModuleDependency a2 = GroupMemberManageModule.m177902a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "GroupMemberManageModule.getDependency()");
                IGroupMemberManageModuleDependency.AbstractC44892n userAuthorityDependency2 = a2.getUserAuthorityDependency();
                if (errorResult != null) {
                    str4 = errorResult.getDisplayMsg(d);
                } else {
                    str4 = null;
                }
                userAuthorityDependency2.mo143805a(context, str4);
            } else {
                aVar.mo128964a(errorResult);
            }
        }
    }

    static {
        IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
        Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
        IGroupMemberManageModuleDependency.AbstractC44892n userAuthorityDependency = a.getUserAuthorityDependency();
        Intrinsics.checkExpressionValueIsNotNull(userAuthorityDependency, "GroupMemberManageModule.…).userAuthorityDependency");
        f113675a = userAuthorityDependency.mo143804a();
    }
}
