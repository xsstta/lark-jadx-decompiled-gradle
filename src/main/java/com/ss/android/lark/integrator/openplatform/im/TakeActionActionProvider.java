package com.ss.android.lark.integrator.openplatform.im;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/integrator/openplatform/im/TakeActionActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "Companion", "TakeActionMessageAction", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.openplatform.a.c */
public final class TakeActionActionProvider implements ActionProvider {

    /* renamed from: a */
    public static final Companion f101638a = new Companion(null);

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/integrator/openplatform/im/TakeActionActionProvider$Companion;", "", "()V", "FEATURE_CONFIG_KEY_MESSAGE_ACITON", "", "FEATURE_KEY_MESSAGE_ACTION", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.openplatform.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/integrator/openplatform/im/TakeActionActionProvider$TakeActionMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/integrator/openplatform/im/TakeActionActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "useNewMessageAction", "", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "isEnable", "onClick", "", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.openplatform.a.c$b */
    public final class TakeActionMessageAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ TakeActionActionProvider f101639a;

        /* renamed from: b */
        private final boolean f101640b = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).useNewMessageAction();

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: a */
        public int mo106818a() {
            return 25;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: e */
        public boolean mo106822e() {
            return true;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: c */
        public Integer mo106820c() {
            return Integer.valueOf((int) R.color.open_platform_message_action_color_selector);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: b */
        public Integer mo106819b() {
            int i;
            if (this.f101640b) {
                i = R.drawable.ud_icon_keyboard_outlined;
            } else {
                i = R.drawable.ud_icon_take_action_outlined;
            }
            return Integer.valueOf(i);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: d */
        public String mo106821d() {
            int i;
            if (this.f101640b) {
                i = R.string.Lark_OpenPlatform_MsgScBttn;
            } else {
                i = R.string.Lark_Legacy_TakeAnAction;
            }
            String string = UIHelper.getString(i);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strRes)");
            return string;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            Context b = mo106825h().mo106782b();
            Chat e = mo106825h().mo106785e();
            if (e != null) {
                String id = e.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                AbsMessageVO<?> h = mo106825h().mo106788h();
                OpenPlatformModuleProvider.m158457a().mo170501a(b, CollectionsKt.listOf(h.mo121681a()), CollectionsKt.listOf(Integer.valueOf(h.mo121710r().getNumber())), id);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TakeActionMessageAction(TakeActionActionProvider cVar, ActionContext actionContext) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f101639a = cVar;
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.NORMAL_SINGLE_CHAT, ActionContext.PageType.NORMAL_GROUP_CHAT, ActionContext.PageType.CHAT_THREAD});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return new TakeActionMessageAction(this, actionContext);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        if (!((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isAppConfigOn("chat.messageAction")) {
            return false;
        }
        return C37239a.m146648b().mo136951a("lark.message_action");
    }
}
