package com.ss.android.lark.integrator.todo.im;

import android.content.Context;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.PostEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.OpenThreadMessageVO;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ThreadTodoActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "isMessageCanAddTODO", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "message", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "Companion", "ThreadTodoMessageAction", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.im.e */
public final class ThreadTodoActionProvider implements ActionProvider {

    /* renamed from: a */
    public static final Companion f101833a = new Companion(null);

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ThreadTodoActionProvider$Companion;", "", "()V", "TAG", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.im.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\r\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J8\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u0016H\u0016J,\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000eH\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0014H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ThreadTodoActionProvider$ThreadTodoMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/integrator/todo/im/ThreadTodoActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "blockKitInstance", "Lcom/larksuite/component/blockit/BlockitInstance;", "kotlin.jvm.PlatformType", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "getTodoCreateSummary", "", "itemData", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "isEnable", "", "needMergeMessageTodo", "", "title", "chatId", "messageId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "blockExtra", "Lcom/larksuite/component/blockit/entity/BlockExtra;", "onBlockIdGenerated", "blockId", "onClick", "sendMsgMenuMoreClick", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "click", "target", "sendTodoHitPoint", "isFromMore", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.im.e$b */
    public final class ThreadTodoMessageAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ ThreadTodoActionProvider f101834a;

        /* renamed from: b */
        private final C24062d f101835b;

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: a */
        public int mo106818a() {
            return 21;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: e */
        public boolean mo106822e() {
            return true;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: b */
        public Integer mo106819b() {
            return Integer.valueOf((int) R.drawable.ud_icon_tab_todo_outlined);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: c */
        public Integer mo106820c() {
            return Integer.valueOf((int) R.color.todo_message_action_color_selector);
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: d */
        public String mo106821d() {
            String string = UIHelper.getString(R.string.Todo_Task_CreateATask);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Todo_Task_CreateATask)");
            return string;
        }

        @Override // com.ss.android.lark.biz.im.extension.MessageAction
        /* renamed from: f */
        public void mo106823f() {
            Chat e = mo106825h().mo106785e();
            if (e != null) {
                AbsMessageVO<?> h = mo106825h().mo106788h();
                m158845a(e, h, "todo", "todo_create_view");
                m158847a(false);
                this.f101835b.mo86324b(Domain.message, h.mo121681a(), BlockTypeID.MESSAGE, new C40067a(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/todo/im/ThreadTodoActionProvider$ThreadTodoMessageAction$onClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockId", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.integrator.todo.im.e$b$a */
        public static final class C40067a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ThreadTodoMessageAction f101836a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C40067a(ThreadTodoMessageAction bVar) {
                this.f101836a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "blockId");
                this.f101836a.mo145445a(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("ThreadTodoAction", errorResult.toString());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.lang.CharSequence m158844a(com.ss.android.lark.chat.vo.AbsMessageVO<?> r7) {
            /*
            // Method dump skipped, instructions count: 243
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.todo.im.ThreadTodoActionProvider.ThreadTodoMessageAction.m158844a(com.ss.android.lark.chat.e.a):java.lang.CharSequence");
        }

        /* renamed from: a */
        private final void m158847a(boolean z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ShareHitPoint.f121868c, ChatTypeStateKeeper.f135670e);
                if (z) {
                    jSONObject.put("sub_source", "topic_point");
                } else {
                    jSONObject.put("sub_source", "topic_press");
                }
            } catch (JSONException e) {
                Log.m165383e("ThreadTodoAction", e.toString());
            }
            Statistics.sendEvent("todo_create", jSONObject);
        }

        /* renamed from: a */
        public final void mo145445a(String str) {
            Chat e = mo106825h().mo106785e();
            if (e != null) {
                AbsMessageVO<?> h = mo106825h().mo106788h();
                Context b = mo106825h().mo106782b();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("chat_id", e.getId());
                if (h != null) {
                    jSONObject.put("message_id", ((OpenThreadMessageVO) h).mo121707o());
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
                    CharSequence a = m158844a(h);
                    Log.m165379d("ThreadTodoAction", "summary = " + a);
                    BlockEntity a2 = this.f101835b.mo86315a(str, BlockTypeID.MESSAGE, "", "", jSONObject2, "", "");
                    BlockExtra blockExtra = new BlockExtra();
                    blockExtra.sceneType = BlockExtra.SceneType.THREAD_TOPIC;
                    int i = C40068f.f101837a[h.mo121710r().ordinal()];
                    if (i == 1) {
                        Content z = h.mo121699g().mo126168z();
                        if (z != null) {
                            TextContent textContent = (TextContent) z;
                            blockExtra.richTextMessage = new RichTextMessage(Message.Type.TEXT, new MessageContentEntity(new TextEntity(textContent.getRichText(), textContent.getDocEntityMap())));
                            this.f101835b.mo86317a(b, ActionType.Todo, a2, blockExtra);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.TextContent");
                    } else if (i == 2) {
                        Content z2 = h.mo121699g().mo126168z();
                        if (z2 != null) {
                            PostContent postContent = (PostContent) z2;
                            blockExtra.richTextMessage = new RichTextMessage(Message.Type.POST, new MessageContentEntity(new PostEntity(postContent.getTitle(), postContent.getRichText(), postContent.getDocEntityMap())));
                            this.f101835b.mo86317a(b, ActionType.Todo, a2, blockExtra);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.PostContent");
                    } else if (i == 3 || i == 4) {
                        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Todo_Task_FromTopic, "Topic", e.getName());
                        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…e()\n                    )");
                        String id = e.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                        String a3 = h.mo121681a();
                        Message.Type r = h.mo121710r();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "blockEntity");
                        m158846a(mustacheFormat, id, a3, r, a2, blockExtra);
                    } else if (i != 5) {
                        String obj = a.toString();
                        String id2 = e.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
                        String a4 = h.mo121681a();
                        Message.Type r2 = h.mo121710r();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "blockEntity");
                        m158846a(obj, id2, a4, r2, a2, blockExtra);
                    } else {
                        blockExtra.richTextMessage = new RichTextMessage(Message.Type.TEXT, new MessageContentEntity(new TextEntity(C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromTopic, "Topic", e.getName())), null)));
                        this.f101835b.mo86317a(b, ActionType.Todo, a2, blockExtra);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.export.vo.OpenThreadMessageVO");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ThreadTodoMessageAction(ThreadTodoActionProvider eVar, ActionContext actionContext) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f101834a = eVar;
            Object api = ApiUtils.getApi(IOpenPlatformApi.class);
            Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IOpenPlatformApi::class.java)");
            this.f101835b = ((IOpenPlatformApi) api).getBlockitInstance();
        }

        /* renamed from: a */
        private final void m158845a(Chat chat, AbsMessageVO<?> aVar, String str, String str2) {
            Object api = ApiUtils.getApi(IPassportApi.class);
            Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IPassportApi::class.java)");
            AbstractC49389b accountManager = ((IPassportApi) api).getAccountManager();
            Intrinsics.checkExpressionValueIsNotNull(accountManager, "ApiUtils.getApi(IPasspor…lass.java).accountManager");
            Statistics.sendEvent("im_msg_menu_more_click", new JSONObject(ChatParamUtils.m133137a(chat, accountManager.mo172422c(), (Chatter) null, 4, (Object) null)).put("click", str).put("target", str2).put("msg_id", aVar.mo121681a()).put("cid", aVar.mo121696d()).put("msg_type", ChatParamUtils.f88665a.mo126911a(aVar.mo121710r())));
        }

        /* renamed from: a */
        private final void m158846a(String str, String str2, String str3, Message.Type type, BlockEntity blockEntity, BlockExtra blockExtra) {
            TextEntity textEntity = new TextEntity(C59029c.m229161b(str), null);
            MultiMessage multiMessage = new MultiMessage();
            multiMessage.chatId = str2;
            multiMessage.messageIds = CollectionsKt.listOf(str3);
            blockExtra.multiMessage = multiMessage;
            blockExtra.richTextMessage = new RichTextMessage(type, new MessageContentEntity(textEntity));
            this.f101835b.mo86317a(mo106825h().mo106782b(), ActionType.Todo, blockEntity, blockExtra);
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf(ActionContext.PageType.THREAD);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return new ThreadTodoMessageAction(this, actionContext);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Chat e;
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        Object api = ApiUtils.getApi(ICalendarApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICalendarApi::class.java)");
        if (((ICalendarApi) api).isTodoTabEnable() && (e = actionContext.mo106785e()) != null && m158839a(e, actionContext.mo106788h()) && !e.isCrossWithKa()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m158839a(Chat chat, AbsMessageVO<?> aVar) {
        if (chat.isSuper() || aVar.ai() || aVar.mo121698f() || aVar.mo121710r() == Message.Type.UNKNOWN) {
            return false;
        }
        return true;
    }
}
