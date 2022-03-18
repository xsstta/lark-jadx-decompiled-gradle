package com.ss.android.lark.integrator.todo.im;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.richtext.CommonEntity;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.PostEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.component.blockit.entity.todo.MultiMessage;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.biz.im.api.param.DisplayTextParams;
import com.ss.android.lark.biz.im.extension.ActionContext;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageAction;
import com.ss.android.lark.calendar_api.ICalendarApi;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ChatTodoActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "Companion", "TodoMessageAction", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.im.a */
public final class ChatTodoActionProvider implements ActionProvider {

    /* renamed from: a */
    public static final Companion f101818a = new Companion(null);

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ChatTodoActionProvider$Companion;", "", "()V", "TAG", "", "getCalendarMessageSummary", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.im.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CharSequence mo145439a(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "message");
            if (message.getType() != Message.Type.CALENDAR) {
                return r0;
            }
            String calendarTitle = ((ICalendarApi) ApiUtils.getApi(ICalendarApi.class)).getCalendarTitle(message);
            Intrinsics.checkExpressionValueIsNotNull(calendarTitle, "ApiUtils.getApi(ICalenda…getCalendarTitle(message)");
            return calendarTitle;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ChatTodoActionProvider$TodoMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/integrator/todo/im/ChatTodoActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "getTodoCreateSummary", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "isEnable", "", "onBlockIdGenerated", "", "blockId", "onClick", "sendTODOCreate", "messageId", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.im.a$b */
    public final class TodoMessageAction extends MessageAction {

        /* renamed from: a */
        final /* synthetic */ ChatTodoActionProvider f101819a;

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
            String a = mo106825h().mo106788h().mo121681a();
            Object api = ApiUtils.getApi(IOpenPlatformApi.class);
            Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IOpenPlatformApi::class.java)");
            ((IOpenPlatformApi) api).getBlockitInstance().mo86324b(Domain.message, a, BlockTypeID.MESSAGE, new C40063a(this));
            m158816b(a);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/todo/im/ChatTodoActionProvider$TodoMessageAction$onClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockId", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.integrator.todo.im.a$b$a */
        public static final class C40063a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ TodoMessageAction f101820a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C40063a(TodoMessageAction bVar) {
                this.f101820a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "blockId");
                this.f101820a.mo145440a(str);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("ChatTodoActionProvider", errorResult.getDebugMsg());
            }
        }

        /* renamed from: b */
        private final void m158816b(String str) {
            Statistics.sendEvent("todo_create", new JSONObject().put(ShareHitPoint.f121868c, "message_add").put("message_id", str));
        }

        /* renamed from: a */
        private final CharSequence m158815a(Message message) {
            String str;
            String str2;
            TodoOperationContent.Type type;
            DisplayTextParams bVar = new DisplayTextParams(mo106825h().mo106782b(), message);
            bVar.mo106737a(false);
            bVar.mo106739b(true);
            bVar.mo106741c(false);
            CharSequence a = ((IIMApi) ApiUtils.getApi(IIMApi.class)).messageApi().mo106772a(bVar);
            Message.Type type2 = message.getType();
            if (type2 == null) {
                return a;
            }
            int i = C40064b.f101822b[type2.ordinal()];
            Object obj = null;
            if (i == 1) {
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<CardContent>()");
                CardContent cardContent = (CardContent) content;
                if (cardContent.getType() == CardContent.Type.VOTE) {
                    return a;
                }
                CardContent.CardHeader cardHeader = cardContent.getCardHeader();
                if (cardHeader != null) {
                    str = cardHeader.getTitle();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    CardContent.CardHeader cardHeader2 = cardContent.getCardHeader();
                    if (cardHeader2 != null) {
                        obj = cardHeader2.getTitle();
                    }
                    if (obj == null) {
                        Intrinsics.throwNpe();
                    }
                    return (CharSequence) obj;
                }
                String string = UIHelper.getString(R.string.Lark_Legacy_MessagePoCard);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ark_Legacy_MessagePoCard)");
                str2 = string;
            } else if (i == 2) {
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_CreateTaskFromEvent_TaskTitle, "title", ChatTodoActionProvider.f101818a.mo145439a(message).toString());
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…mary(message).toString())");
                return mustacheFormat;
            } else if (i != 3) {
                return a;
            } else {
                Content content2 = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<TodoContent>()");
                TodoContent todoContent = (TodoContent) content2;
                TodoOperationContent cardContentData = todoContent.getCardContentData();
                if (cardContentData != null) {
                    type = cardContentData.operation_type;
                } else {
                    type = null;
                }
                if (type != TodoOperationContent.Type.DAILY_REMIND) {
                    return a;
                }
                TodoOperationContent cardContentData2 = todoContent.getCardContentData();
                if (cardContentData2 != null) {
                    obj = cardContentData2.operation_type;
                }
                if (obj != TodoOperationContent.Type.DAILY_REMIND) {
                    return a;
                }
                if (TodoDependencyHolder.f139242a.mo191731b().mo191935h()) {
                    String string2 = UIHelper.getString(R.string.Todo_Task_RecentTodoTask);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…Todo_Task_RecentTodoTask)");
                    str2 = string2;
                } else {
                    String string3 = UIHelper.getString(R.string.Todo_BotNotification_DailyNotificationTitle);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.str…n_DailyNotificationTitle)");
                    str2 = string3;
                }
            }
            return str2;
        }

        /* renamed from: a */
        public final void mo145440a(String str) {
            String str2;
            String str3;
            ChatChatter messageSender;
            Chatter chatter;
            Context b = mo106825h().mo106782b();
            Chat e = mo106825h().mo106785e();
            if (e != null) {
                OpenMessageInfo i = mo106825h().mo106789i();
                if (i != null) {
                    MessageInfo messageInfo = (MessageInfo) i;
                    Message j = mo106825h().mo106790j();
                    if (j != null) {
                        String a = mo106825h().mo106788h().mo121681a();
                        MessageInfo parentMessageInfo = messageInfo.getParentMessageInfo();
                        if (parentMessageInfo == null || (messageSender = parentMessageInfo.getMessageSender()) == null || (chatter = messageSender.getChatter()) == null || (str2 = chatter.getId()) == null) {
                            str2 = "";
                        }
                        Intrinsics.checkExpressionValueIsNotNull(str2, "messageInfo.parentMessag…)?.chatter?.getId() ?: \"\"");
                        Object api = ApiUtils.getApi(IPassportApi.class);
                        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IPassportApi::class.java)");
                        if (((IPassportApi) api).isOverseaTenantBrand()) {
                            str3 = "https://applink.larksuite.com/client/chat/open";
                        } else {
                            str3 = "https://applink.feishu.cn/client/chat/open";
                        }
                        String str4 = str3 + "?chatId=" + e.getId() + "&position=" + j.getPosition();
                        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
                        jSONObject.put("chat_id", (Object) e.getId());
                        jSONObject.put("is_public", (Object) Boolean.valueOf(e.isPublic()));
                        jSONObject.put("message_id", (Object) a);
                        String jSONString = jSONObject.toJSONString();
                        KeyboardUtils.hideKeyboard(mo106825h().mo106782b());
                        CharSequence a2 = m158815a(j);
                        Log.m165379d("ChatTodoActionProvider", "summary = " + a2);
                        Object api2 = ApiUtils.getApi(IOpenPlatformApi.class);
                        Intrinsics.checkExpressionValueIsNotNull(api2, "ApiUtils.getApi(IOpenPlatformApi::class.java)");
                        C24062d blockitInstance = ((IOpenPlatformApi) api2).getBlockitInstance();
                        BlockEntity a3 = blockitInstance.mo86315a(str, BlockTypeID.MESSAGE, str4, "", jSONString, "", a2.toString());
                        Intrinsics.checkExpressionValueIsNotNull(a3, "blockKitInstance.generat…, \"\", summary.toString())");
                        Message.Type type = j.getType();
                        if (type != null) {
                            int i2 = C40064b.f101821a[type.ordinal()];
                            if (i2 == 1) {
                                Content content = j.getContent();
                                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<TextContent>()");
                                TextContent textContent = (TextContent) content;
                                RichText richText = textContent.getRichText();
                                Map<String, Doc> docEntityMap = textContent.getDocEntityMap();
                                ActionType actionType = ActionType.Todo;
                                BlockExtra blockExtra = new BlockExtra();
                                blockExtra.richTextMessage = new RichTextMessage(Message.Type.TEXT, new MessageContentEntity(new TextEntity(richText, docEntityMap)));
                                blockExtra.parentMsgSenderId = str2;
                                blockitInstance.mo86317a(b, actionType, a3, blockExtra);
                                return;
                            } else if (i2 == 2) {
                                Content content2 = j.getContent();
                                Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<PostContent>()");
                                PostContent postContent = (PostContent) content2;
                                String title = postContent.getTitle();
                                RichText richText2 = postContent.getRichText();
                                Map<String, Doc> docEntityMap2 = postContent.getDocEntityMap();
                                ActionType actionType2 = ActionType.Todo;
                                BlockExtra blockExtra2 = new BlockExtra();
                                blockExtra2.richTextMessage = new RichTextMessage(Message.Type.POST, new MessageContentEntity(new PostEntity(title, richText2, docEntityMap2)));
                                blockExtra2.parentMsgSenderId = str2;
                                blockitInstance.mo86317a(b, actionType2, a3, blockExtra2);
                                return;
                            } else if (i2 == 3 || i2 == 4) {
                                TextEntity textEntity = new TextEntity(C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromChat, "Chat", e.getName())), null);
                                ActionType actionType3 = ActionType.Todo;
                                BlockExtra blockExtra3 = new BlockExtra();
                                blockExtra3.multiMessage = new MultiMessage();
                                blockExtra3.multiMessage.chatId = e.getId();
                                blockExtra3.multiMessage.messageIds = CollectionsKt.listOf(a);
                                Message.Type type2 = j.getType();
                                Intrinsics.checkExpressionValueIsNotNull(type2, "message.type");
                                blockExtra3.richTextMessage = new RichTextMessage(type2, new MessageContentEntity(textEntity));
                                blockExtra3.parentMsgSenderId = str2;
                                blockitInstance.mo86317a(b, actionType3, a3, blockExtra3);
                                return;
                            } else if (i2 == 5) {
                                RichText b2 = C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromChat, "Chat", e.getName()));
                                ActionType actionType4 = ActionType.Todo;
                                BlockExtra blockExtra4 = new BlockExtra();
                                blockExtra4.richTextMessage = new RichTextMessage(Message.Type.MERGE_FORWARD, new MessageContentEntity(new CommonEntity(a, e.getId()), new TextEntity(b2, null)));
                                blockExtra4.parentMsgSenderId = str2;
                                blockitInstance.mo86317a(b, actionType4, a3, blockExtra4);
                                return;
                            }
                        }
                        RichText b3 = C59029c.m229161b(a2.toString());
                        ActionType actionType5 = ActionType.Todo;
                        BlockExtra blockExtra5 = new BlockExtra();
                        blockExtra5.multiMessage = new MultiMessage();
                        blockExtra5.multiMessage.chatId = e.getId();
                        blockExtra5.multiMessage.messageIds = CollectionsKt.listOf(a);
                        Message.Type type3 = j.getType();
                        Intrinsics.checkExpressionValueIsNotNull(type3, "message.type");
                        blockExtra5.richTextMessage = new RichTextMessage(type3, new MessageContentEntity(new TextEntity(b3, null)));
                        blockExtra5.parentMsgSenderId = str2;
                        blockitInstance.mo86317a(b, actionType5, a3, blockExtra5);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.MessageInfo");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TodoMessageAction(ChatTodoActionProvider aVar, ActionContext actionContext) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f101819a = aVar;
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf((Object[]) new ActionContext.PageType[]{ActionContext.PageType.NORMAL_SINGLE_CHAT, ActionContext.PageType.NORMAL_GROUP_CHAT});
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: b */
    public MessageAction mo106809b(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        return new TodoMessageAction(this, actionContext);
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106807a(ActionContext actionContext) {
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        Chat e = actionContext.mo106785e();
        if (e == null) {
            return false;
        }
        AbsMessageVO<?> h = actionContext.mo106788h();
        Object api = ApiUtils.getApi(ICalendarApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICalendarApi::class.java)");
        if (((ICalendarApi) api).isTodoTabEnable() && !e.isSuper() && !h.ai() && !h.mo121698f() && h.mo121710r() != Message.Type.UNKNOWN && !e.isCrossWithKa()) {
            return true;
        }
        return false;
    }
}
