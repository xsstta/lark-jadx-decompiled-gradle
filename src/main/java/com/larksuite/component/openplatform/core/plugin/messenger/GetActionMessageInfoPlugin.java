package com.larksuite.component.openplatform.core.plugin.messenger;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.launchaction.ActionMessageLoadManager;
import com.tt.miniapp.launchaction.bean.ActionMessageResult;
import com.tt.miniapp.launchaction.bean.C66303a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0006\u0018\u0019\u001a\u001b\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J.\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\b\u0010\u0017\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "mILogger", "Lcom/ss/android/lark/optrace/api/ILogger;", "mInvokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$GetActionMessageInfoResponse;", "callbackOkWithMessages", "", "actionTime", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "messages", "", "Lcom/tt/miniapp/launchaction/bean/ActionMessageResult$ContentDetail;", "getActionMessageInfoAsync", "getActionMessageInfoRequest", "Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$GetActionMessageInfoRequest;", "lkEventContext", "Lcom/larksuite/framework/apiplugin/api/LKEventContext;", "invokeCallback", "onRelease", "Companion", "ContentDetail", "GetActionMessageInfoRequest", "GetActionMessageInfoResponse", "Message", "Sender", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GetActionMessageInfoPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);
    public ILogger mILogger;
    public AbstractC25897h<GetActionMessageInfoResponse> mInvokeCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$ContentDetail;", "", "()V", "actionTime", "", "getActionTime", "()Ljava/lang/Long;", "setActionTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "messages", "", "Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$Message;", "getMessages", "()Ljava/util/List;", "setMessages", "(Ljava/util/List;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class ContentDetail {
        @JSONField(name = "actionTime")
        private Long actionTime = 0L;
        @JSONField(name = "messages")
        private List<Message> messages;

        public final Long getActionTime() {
            return this.actionTime;
        }

        public final List<Message> getMessages() {
            return this.messages;
        }

        public final void setActionTime(Long l) {
            this.actionTime = l;
        }

        public final void setMessages(List<Message> list) {
            this.messages = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$GetActionMessageInfoResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "bizType", "", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "content", "Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$ContentDetail;", "getContent", "()Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$ContentDetail;", "setContent", "(Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$ContentDetail;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class GetActionMessageInfoResponse extends C25921b {
        @JSONField(name = "bizType")
        private String bizType;
        @JSONField(name = "content")
        private ContentDetail content;

        public final String getBizType() {
            return this.bizType;
        }

        public final ContentDetail getContent() {
            return this.content;
        }

        public final void setBizType(String str) {
            this.bizType = str;
        }

        public final void setContent(ContentDetail contentDetail) {
            this.content = contentDetail;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$¨\u0006)"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$Message;", "", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "createTime", "", "getCreateTime", "()Ljava/lang/Long;", "setCreateTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "messageType", "getMessageType", "setMessageType", "openChatId", "getOpenChatId", "setOpenChatId", "openMessageId", "getOpenMessageId", "setOpenMessageId", "sender", "Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$Sender;", "getSender", "()Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$Sender;", "setSender", "(Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$Sender;)V", UpdateKey.STATUS, "", "getStatus", "()Ljava/lang/Boolean;", "setStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "support", "getSupport", "setSupport", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Message {
        @JSONField(name = "content")
        private String content;
        @JSONField(name = "createTime")
        private Long createTime = 0L;
        @JSONField(name = "messageType")
        private String messageType;
        @JSONField(name = "openChatId")
        private String openChatId;
        @JSONField(name = "openMessageId")
        private String openMessageId;
        @JSONField(name = "sender")
        private Sender sender;
        @JSONField(name = UpdateKey.STATUS)
        private Boolean status = false;
        @JSONField(name = "support")
        private Boolean support = false;

        public final String getContent() {
            return this.content;
        }

        public final Long getCreateTime() {
            return this.createTime;
        }

        public final String getMessageType() {
            return this.messageType;
        }

        public final String getOpenChatId() {
            return this.openChatId;
        }

        public final String getOpenMessageId() {
            return this.openMessageId;
        }

        public final Sender getSender() {
            return this.sender;
        }

        public final Boolean getStatus() {
            return this.status;
        }

        public final Boolean getSupport() {
            return this.support;
        }

        public final void setContent(String str) {
            this.content = str;
        }

        public final void setCreateTime(Long l) {
            this.createTime = l;
        }

        public final void setMessageType(String str) {
            this.messageType = str;
        }

        public final void setOpenChatId(String str) {
            this.openChatId = str;
        }

        public final void setOpenMessageId(String str) {
            this.openMessageId = str;
        }

        public final void setSender(Sender sender2) {
            this.sender = sender2;
        }

        public final void setStatus(Boolean bool) {
            this.status = bool;
        }

        public final void setSupport(Boolean bool) {
            this.support = bool;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$Sender;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "openId", "getOpenId", "setOpenId", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Sender {
        @JSONField(name = "name")
        private String name;
        @JSONField(name = "open_id")
        private String openId;

        public final String getName() {
            return this.name;
        }

        public final String getOpenId() {
            return this.openId;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setOpenId(String str) {
            this.openId = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.GetActionMessageInfoPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$GetActionMessageInfoRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "triggerCode", "", "getTriggerCode", "()Ljava/lang/String;", "setTriggerCode", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class GetActionMessageInfoRequest extends C25920a {
        @JSONField(name = "triggerCode")
        @LKRequiredParam
        public String triggerCode;

        public final String getTriggerCode() {
            String str = this.triggerCode;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("triggerCode");
            }
            return str;
        }

        public final void setTriggerCode(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.triggerCode = str;
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mInvokeCallback = null;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.GetActionMessageInfoPlugin$c */
    public static final class C25060c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ GetActionMessageInfoPlugin f61225a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f61226b;

        C25060c(GetActionMessageInfoPlugin getActionMessageInfoPlugin, Ref.ObjectRef objectRef) {
            this.f61225a = getActionMessageInfoPlugin;
            this.f61226b = objectRef;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;", "com/larksuite/component/openplatform/core/plugin/messenger/GetActionMessageInfoPlugin$getActionMessageInfoAsync$2$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.GetActionMessageInfoPlugin$c$a */
        public static final class C25061a extends Lambda implements Function0<Unit> {
            final /* synthetic */ String $it1;
            final /* synthetic */ C25060c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25061a(String str, C25060c cVar) {
                super(0);
                this.$it1 = str;
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                this.this$0.f61225a.fillFailedResponse(this.this$0.f61226b.element, C25906a.f64080j, this.$it1);
                AbstractC25897h<GetActionMessageInfoResponse> hVar = this.this$0.f61225a.mInvokeCallback;
                if (hVar == null) {
                    return null;
                }
                hVar.callback(this.this$0.f61226b.element);
                return Unit.INSTANCE;
            }
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            ILogger aVar = this.f61225a.mILogger;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(th, "it");
                aVar.mo92223e("GetActionMessageInfo", th);
            }
            String message = th.getMessage();
            if (message != null) {
                new C25061a(message, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tt/miniapp/launchaction/bean/ActionMessageLoadResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.GetActionMessageInfoPlugin$b */
    static final class C25059b<T> implements Consumer<C66303a> {

        /* renamed from: a */
        final /* synthetic */ GetActionMessageInfoPlugin f61222a;

        /* renamed from: b */
        final /* synthetic */ LKEvent f61223b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f61224c;

        C25059b(GetActionMessageInfoPlugin getActionMessageInfoPlugin, LKEvent lKEvent, Ref.ObjectRef objectRef) {
            this.f61222a = getActionMessageInfoPlugin;
            this.f61223b = lKEvent;
            this.f61224c = objectRef;
        }

        /* renamed from: a */
        public final void accept(C66303a aVar) {
            Unit unit;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
            ActionMessageResult b = aVar.mo231755b();
            if (b != null) {
                Intrinsics.checkExpressionValueIsNotNull(b, "messageResult");
                if (b.isSuccess()) {
                    GetActionMessageInfoPlugin getActionMessageInfoPlugin = this.f61222a;
                    long c = aVar.mo231756c();
                    LKEvent lKEvent = this.f61223b;
                    Map<String, ActionMessageResult.ContentDetail> messageContents = b.getMessageContents();
                    if (messageContents == null) {
                        Intrinsics.throwNpe();
                    }
                    getActionMessageInfoPlugin.callbackOkWithMessages(c, lKEvent, messageContents.values());
                    unit = Unit.INSTANCE;
                } else {
                    ILogger aVar2 = this.f61222a.mILogger;
                    if (aVar2 != null) {
                        aVar2.mo92223e("GetActionMessageInfo", "get block action failed");
                    }
                    this.f61222a.fillFailedResponse(this.f61224c.element, C25913h.f64186p, C25913h.f64186p.f64117J);
                    AbstractC25897h<GetActionMessageInfoResponse> hVar = this.f61222a.mInvokeCallback;
                    if (hVar != null) {
                        hVar.callback(this.f61224c.element);
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                }
                if (unit != null) {
                    return;
                }
            }
            GetActionMessageInfoPlugin getActionMessageInfoPlugin2 = this.f61222a;
            int a = aVar.mo231754a();
            if (a == C66303a.f167330d) {
                ILogger aVar3 = getActionMessageInfoPlugin2.mILogger;
                if (aVar3 != null) {
                    aVar3.mo92223e("GetActionMessageInfo", "invalid triggerCode");
                }
                getActionMessageInfoPlugin2.fillFailedResponse(this.f61224c.element, C25913h.f64184n, C25913h.f64184n.f64117J);
                AbstractC25897h<GetActionMessageInfoResponse> hVar2 = getActionMessageInfoPlugin2.mInvokeCallback;
                if (hVar2 != null) {
                    hVar2.callback(this.f61224c.element);
                    Unit unit2 = Unit.INSTANCE;
                }
            } else if (a == C66303a.f167329c) {
                ILogger aVar4 = getActionMessageInfoPlugin2.mILogger;
                if (aVar4 != null) {
                    aVar4.mo92223e("GetActionMessageInfo", "internal error json");
                }
                getActionMessageInfoPlugin2.fillFailedResponse(this.f61224c.element, C25906a.f64080j, "internal error json");
                AbstractC25897h<GetActionMessageInfoResponse> hVar3 = getActionMessageInfoPlugin2.mInvokeCallback;
                if (hVar3 != null) {
                    hVar3.callback(this.f61224c.element);
                    Unit unit3 = Unit.INSTANCE;
                }
            } else {
                ILogger aVar5 = getActionMessageInfoPlugin2.mILogger;
                if (aVar5 != null) {
                    aVar5.mo92223e("GetActionMessageInfo", "get block action failed");
                }
                getActionMessageInfoPlugin2.fillFailedResponse(this.f61224c.element, C25913h.f64186p, C25913h.f64186p.f64117J);
                AbstractC25897h<GetActionMessageInfoResponse> hVar4 = getActionMessageInfoPlugin2.mInvokeCallback;
                if (hVar4 != null) {
                    hVar4.callback(this.f61224c.element);
                    Unit unit4 = Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b8 A[Catch:{ JSONException -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ba A[Catch:{ JSONException -> 0x00eb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void callbackOkWithMessages(long r8, com.larksuite.framework.apiplugin.LKEvent r10, java.util.Collection<? extends com.tt.miniapp.launchaction.bean.ActionMessageResult.ContentDetail> r11) {
        /*
        // Method dump skipped, instructions count: 278
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.GetActionMessageInfoPlugin.callbackOkWithMessages(long, com.larksuite.framework.apiplugin.LKEvent, java.util.Collection):void");
    }

    @LKPluginFunction(async = true, eventName = {"getBlockActionSourceDetail"})
    public final void getActionMessageInfoAsync(LKEvent lKEvent, GetActionMessageInfoRequest getActionMessageInfoRequest, AbstractC25895f fVar, AbstractC25897h<GetActionMessageInfoResponse> hVar) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(lKEvent, "lkEvent");
        Intrinsics.checkParameterIsNotNull(getActionMessageInfoRequest, "getActionMessageInfoRequest");
        Intrinsics.checkParameterIsNotNull(fVar, "lkEventContext");
        Intrinsics.checkParameterIsNotNull(hVar, "invokeCallback");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) new GetActionMessageInfoResponse();
        this.mInvokeCallback = hVar;
        this.mILogger = fVar.mo92190b();
        if (getAppContext() == null) {
            ILogger aVar = this.mILogger;
            if (aVar != null) {
                aVar.mo92223e("GetActionMessageInfo", "app context is null");
            }
            fillFailedResponse(objectRef.element, C25906a.f64080j, "app context is null");
            hVar.callback(objectRef.element);
            return;
        }
        AbstractC67709b.AbstractC67710a apiDependency = getApiDependency();
        IAppContext appContext = getAppContext();
        Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
        String g = apiDependency.mo235054g(appContext.getAppId());
        if (g != null) {
            if (g.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String triggerCode = getActionMessageInfoRequest.getTriggerCode();
                if (triggerCode.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    ILogger aVar2 = this.mILogger;
                    if (aVar2 != null) {
                        aVar2.mo92223e("GetActionMessageInfo", "triggerCode is empty");
                    }
                    fillFailedResponse(objectRef.element, C25913h.f64183m, C25913h.f64183m.f64117J);
                    hVar.callback(objectRef.element);
                    return;
                }
                ActionMessageLoadManager aVar3 = ActionMessageLoadManager.f167308a;
                IAppContext appContext2 = getAppContext();
                Intrinsics.checkExpressionValueIsNotNull(appContext2, "appContext");
                aVar3.mo231697a(appContext2, triggerCode).subscribe(new C25059b(this, lKEvent, objectRef), new C25060c(this, objectRef));
                return;
            }
        }
        ILogger aVar4 = this.mILogger;
        if (aVar4 != null) {
            aVar4.mo92223e("GetActionMessageInfo", "not login");
        }
        fillFailedResponse(objectRef.element, C25913h.f64185o, C25913h.f64185o.f64117J);
        hVar.callback(objectRef.element);
    }
}
