package com.ss.android.lark.integrator.todo.im;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
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
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ThreadDetailTodoActionProvider;", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "()V", "getSupportPageTypes", "", "Lcom/ss/android/lark/biz/im/extension/ActionContext$PageType;", "provideAction", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "shouldShowAction", "", "supportMessage", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "Companion", "TodoMessageAction", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.im.c */
public final class ThreadDetailTodoActionProvider implements ActionProvider {

    /* renamed from: a */
    public static final Companion f101823a = new Companion(null);

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public boolean mo106808a(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ThreadDetailTodoActionProvider$Companion;", "", "()V", "TAG", "", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.im.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\r\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J8\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0016J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/ThreadDetailTodoActionProvider$TodoMessageAction;", "Lcom/ss/android/lark/biz/im/extension/MessageAction;", "actionContext", "Lcom/ss/android/lark/biz/im/extension/ActionContext;", "(Lcom/ss/android/lark/integrator/todo/im/ThreadDetailTodoActionProvider;Lcom/ss/android/lark/biz/im/extension/ActionContext;)V", "blockKitInstance", "Lcom/larksuite/component/blockit/BlockitInstance;", "kotlin.jvm.PlatformType", "getIconDrawableRes", "", "()Ljava/lang/Integer;", "getIconTintColorRes", "getId", "getLabel", "", "getTodoCreateSummary", "", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "isEnable", "", "needMergeMessageTodo", "", "title", "chatId", "messageId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "blockExtra", "Lcom/larksuite/component/blockit/entity/BlockExtra;", "onClick", "sendTodoHitPonit", "isThread", "isFromMore", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.todo.im.c$b */
    public final class TodoMessageAction extends MessageAction {

        /* renamed from: a */
        public final C24062d f101824a;

        /* renamed from: b */
        final /* synthetic */ ThreadDetailTodoActionProvider f101825b;

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
            Chat e;
            Message j;
            boolean z;
            if (mo106825h().mo106789i() != null && (e = mo106825h().mo106785e()) != null && (j = mo106825h().mo106790j()) != null) {
                String id = j.getId();
                if (mo106825h().mo106787g() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                m158829a(z, false);
                this.f101824a.mo86324b(Domain.message, id, BlockTypeID.MESSAGE, new C40065a(this, e, id, j, z));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/todo/im/ThreadDetailTodoActionProvider$TodoMessageAction$onClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockId", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.integrator.todo.im.c$b$a */
        public static final class C40065a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ TodoMessageAction f101826a;

            /* renamed from: b */
            final /* synthetic */ Chat f101827b;

            /* renamed from: c */
            final /* synthetic */ String f101828c;

            /* renamed from: d */
            final /* synthetic */ Message f101829d;

            /* renamed from: e */
            final /* synthetic */ boolean f101830e;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165383e("TDetailTodoAction", errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "blockId");
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONObject;
                jSONObject2.put((Object) "chat_id", (Object) this.f101827b.getId());
                jSONObject2.put((Object) "is_public", (Object) Boolean.valueOf(this.f101827b.isPublic()));
                jSONObject2.put((Object) "message_id", (Object) this.f101828c);
                String jSONString = jSONObject.toJSONString();
                KeyboardUtils.hideKeyboard(this.f101826a.mo106825h().mo106782b());
                CharSequence a = this.f101826a.mo145442a(this.f101829d);
                Log.m165379d("TDetailTodoAction", "summary = " + a);
                BlockEntity a2 = this.f101826a.f101824a.mo86315a(str, BlockTypeID.MESSAGE, "", "", jSONString, "", String.valueOf(a));
                BlockExtra blockExtra = new BlockExtra();
                if (this.f101830e) {
                    blockExtra.sceneType = BlockExtra.SceneType.THREAD_TOPIC;
                } else {
                    blockExtra.sceneType = BlockExtra.SceneType.THREAD_REPLY;
                }
                Context b = this.f101826a.mo106825h().mo106782b();
                Message.Type type = this.f101829d.getType();
                if (type != null) {
                    int i = C40066d.f101831a[type.ordinal()];
                    if (i == 1) {
                        Content content = this.f101829d.getContent();
                        if (content != null) {
                            TextContent textContent = (TextContent) content;
                            blockExtra.richTextMessage = new RichTextMessage(Message.Type.TEXT, new MessageContentEntity(new TextEntity(textContent.getRichText(), textContent.getDocEntityMap())));
                            this.f101826a.f101824a.mo86317a(b, ActionType.Todo, a2, blockExtra);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.TextContent");
                    } else if (i == 2) {
                        Content content2 = this.f101829d.getContent();
                        Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<PostContent>()");
                        PostContent postContent = (PostContent) content2;
                        blockExtra.richTextMessage = new RichTextMessage(Message.Type.POST, new MessageContentEntity(new PostEntity(postContent.getTitle(), postContent.getRichText(), postContent.getDocEntityMap())));
                        this.f101826a.f101824a.mo86317a(b, ActionType.Todo, a2, blockExtra);
                        return;
                    } else if (i == 3 || i == 4) {
                        TodoMessageAction bVar = this.f101826a;
                        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Todo_Task_FromTopic, "Topic", this.f101827b.getName());
                        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…                        )");
                        String id = this.f101827b.getId();
                        Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                        String str2 = this.f101828c;
                        Intrinsics.checkExpressionValueIsNotNull(str2, "messageId");
                        Message.Type type2 = this.f101829d.getType();
                        Intrinsics.checkExpressionValueIsNotNull(type2, "message.type");
                        Intrinsics.checkExpressionValueIsNotNull(a2, "blockEntity");
                        bVar.mo145443a(mustacheFormat, id, str2, type2, a2, blockExtra);
                        return;
                    } else if (i == 5) {
                        blockExtra.richTextMessage = new RichTextMessage(Message.Type.MERGE_FORWARD, new MessageContentEntity(new CommonEntity(this.f101828c, this.f101827b.getId()), new TextEntity(C59029c.m229161b(UIHelper.mustacheFormat((int) R.string.Todo_Task_FromTopic, "Topic", this.f101827b.getName())), null)));
                        this.f101826a.f101824a.mo86317a(b, ActionType.Todo, a2, blockExtra);
                        return;
                    }
                }
                TodoMessageAction bVar2 = this.f101826a;
                String valueOf = String.valueOf(a);
                String id2 = this.f101827b.getId();
                Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
                String str3 = this.f101828c;
                Intrinsics.checkExpressionValueIsNotNull(str3, "messageId");
                Message.Type type3 = this.f101829d.getType();
                Intrinsics.checkExpressionValueIsNotNull(type3, "message.type");
                Intrinsics.checkExpressionValueIsNotNull(a2, "blockEntity");
                bVar2.mo145443a(valueOf, id2, str3, type3, a2, blockExtra);
            }

            C40065a(TodoMessageAction bVar, Chat chat, String str, Message message, boolean z) {
                this.f101826a = bVar;
                this.f101827b = chat;
                this.f101828c = str;
                this.f101829d = message;
                this.f101830e = z;
            }
        }

        /* renamed from: a */
        public final CharSequence mo145442a(Message message) {
            String str;
            DisplayTextParams bVar = new DisplayTextParams(mo106825h().mo106782b(), message);
            bVar.mo106737a(false);
            bVar.mo106739b(true);
            bVar.mo106741c(false);
            CharSequence a = ((IIMApi) ApiUtils.getApi(IIMApi.class)).messageApi().mo106772a(bVar);
            Message.Type type = message.getType();
            if (type == null) {
                return a;
            }
            int i = C40066d.f101832b[type.ordinal()];
            if (i == 1) {
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<CardContent>()");
                CardContent cardContent = (CardContent) content;
                if (cardContent.getType() == CardContent.Type.VOTE) {
                    return a;
                }
                CardContent.CardHeader cardHeader = cardContent.getCardHeader();
                if (cardHeader == null || TextUtils.isEmpty(cardHeader.getTitle())) {
                    String string = UIHelper.getString(R.string.Lark_Legacy_MessagePoCard);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…ark_Legacy_MessagePoCard)");
                    str = string;
                } else {
                    String title = cardHeader.getTitle();
                    if (title == null) {
                        Intrinsics.throwNpe();
                    }
                    str = title;
                }
            } else if (i == 2) {
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Calendar_CreateTaskFromEvent_TaskTitle, "title", ChatTodoActionProvider.f101818a.mo145439a(message).toString());
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…tring()\n                )");
                return mustacheFormat;
            } else if (i != 3) {
                return a;
            } else {
                Content content2 = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<TodoContent>()");
                TodoOperationContent cardContentData = ((TodoContent) content2).getCardContentData();
                if (cardContentData == null) {
                    Intrinsics.throwNpe();
                }
                if (cardContentData.operation_type != TodoOperationContent.Type.DAILY_REMIND) {
                    return a;
                }
                if (TodoDependencyHolder.f139242a.mo191731b().mo191935h()) {
                    String string2 = UIHelper.getString(R.string.Todo_Task_RecentTodoTask);
                    Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…Todo_Task_RecentTodoTask)");
                    str = string2;
                } else {
                    String string3 = UIHelper.getString(R.string.Todo_BotNotification_DailyNotificationTitle);
                    Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(\n    …                        )");
                    str = string3;
                }
            }
            return str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TodoMessageAction(ThreadDetailTodoActionProvider cVar, ActionContext actionContext) {
            super(actionContext);
            Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
            this.f101825b = cVar;
            Object api = ApiUtils.getApi(IOpenPlatformApi.class);
            Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(IOpenPlatformApi::class.java)");
            this.f101824a = ((IOpenPlatformApi) api).getBlockitInstance();
        }

        /* renamed from: a */
        private final void m158829a(boolean z, boolean z2) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(ShareHitPoint.f121868c, ChatTypeStateKeeper.f135670e);
                if (z2) {
                    jSONObject.put("sub_source", "topic_point");
                } else if (z) {
                    jSONObject.put("sub_source", "topic_press");
                } else {
                    jSONObject.put("sub_source", "topic_commend");
                }
            } catch (JSONException e) {
                Log.m165383e("TDetailTodoAction", e.toString());
            }
            Statistics.sendEvent("todo_create", jSONObject);
        }

        /* renamed from: a */
        public final void mo145443a(String str, String str2, String str3, Message.Type type, BlockEntity blockEntity, BlockExtra blockExtra) {
            TextEntity textEntity = new TextEntity(C59029c.m229161b(str), null);
            MultiMessage multiMessage = new MultiMessage();
            multiMessage.chatId = str2;
            multiMessage.messageIds = CollectionsKt.listOf(str3);
            blockExtra.multiMessage = multiMessage;
            blockExtra.richTextMessage = new RichTextMessage(type, new MessageContentEntity(textEntity));
            this.f101824a.mo86317a(mo106825h().mo106782b(), ActionType.Todo, blockEntity, blockExtra);
        }
    }

    @Override // com.ss.android.lark.biz.im.extension.ActionProvider
    /* renamed from: a */
    public Collection<ActionContext.PageType> mo106806a() {
        return CollectionsKt.listOf(ActionContext.PageType.THREAD_DETAIL);
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
        Chat e;
        Intrinsics.checkParameterIsNotNull(actionContext, "actionContext");
        Object api = ApiUtils.getApi(ICalendarApi.class);
        Intrinsics.checkExpressionValueIsNotNull(api, "ApiUtils.getApi(ICalendarApi::class.java)");
        if (((ICalendarApi) api).isTodoTabEnable() && (e = actionContext.mo106785e()) != null) {
            AbsMessageVO<?> h = actionContext.mo106788h();
            if (e.isSuper() || e.isCrossWithKa() || h.ai() || h.mo121698f() || h.mo121710r() == Message.Type.UNKNOWN) {
                return false;
            }
            return true;
        }
        return false;
    }
}
