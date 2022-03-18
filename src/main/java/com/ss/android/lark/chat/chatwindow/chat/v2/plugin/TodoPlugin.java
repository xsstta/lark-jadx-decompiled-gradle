package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import android.text.Editable;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.blockit.C24062d;
import com.larksuite.component.blockit.entity.ActionType;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockExtra;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.component.blockit.entity.richtext.MessageContentEntity;
import com.larksuite.component.blockit.entity.richtext.RichTextMessage;
import com.larksuite.component.blockit.entity.richtext.TextEntity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.ChatKeyboardFgUtil;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.keyboard.IPlusItem;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.ao;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.more.todo.IToDoDependency;
import com.ss.android.lark.keyboard.plugin.tool.more.todo.TodoPlusItem;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.todo.TodoHitPoint;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "()V", "isTodoTabEnable", "", "onCreate", "", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "TodoPlusItemPlugin", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.u */
public final class TodoPlugin extends BaseChatPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0016\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0004\n\u0002\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin$TodoPlusItemPlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$IPlugin;", "Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "pluginContext", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin;Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;)V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "item", "getItem", "()Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;", "setItem", "(Lcom/ss/android/lark/chat/entity/keyboard/IPlusItem;)V", "getPluginContext", "()Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardCreator$PluginContext;", "todoDependency", "com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin$TodoPlusItemPlugin$todoDependency$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin$TodoPlusItemPlugin$todoDependency$1;", "getName", "", "getPlugin", "isEnable", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.u$a */
    public final class TodoPlusItemPlugin implements IKeyboardCreator.IPlugin<IPlusItem> {

        /* renamed from: a */
        final /* synthetic */ TodoPlugin f87222a;

        /* renamed from: b */
        private final Chat f87223b;

        /* renamed from: c */
        private final Context f87224c;

        /* renamed from: d */
        private IPlusItem f87225d;

        /* renamed from: e */
        private final C33853a f87226e = new C33853a(this);

        /* renamed from: f */
        private final IKeyboardCreator.PluginContext f87227f;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: a */
        public String mo122012a() {
            return "plus_todo";
        }

        /* renamed from: b */
        public final Context mo123883b() {
            return this.f87224c;
        }

        /* renamed from: f */
        public final IKeyboardCreator.PluginContext mo123885f() {
            return this.f87227f;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin$TodoPlusItemPlugin$todoDependency$1", "Lcom/ss/android/lark/keyboard/plugin/tool/more/todo/IToDoDependency;", "getContext", "Landroid/content/Context;", "startTodo", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "fromPlugin", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.u$a$a */
        public static final class C33853a implements IToDoDependency {

            /* renamed from: a */
            final /* synthetic */ TodoPlusItemPlugin f87228a;

            /* renamed from: a */
            public Context mo123886a() {
                return this.f87228a.mo123883b();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33853a(TodoPlusItemPlugin aVar) {
                this.f87228a = aVar;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin$TodoPlusItemPlugin$todoDependency$1$startTodo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "blockId", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.u$a$a$a */
            public static final class C33854a implements IGetDataCallback<String> {

                /* renamed from: a */
                final /* synthetic */ C33853a f87229a;

                /* renamed from: b */
                final /* synthetic */ Chat f87230b;

                /* renamed from: c */
                final /* synthetic */ boolean f87231c;

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    Log.m165383e("ChatWindowLog", errorResult.toString());
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    BlockExtra.SceneType sceneType;
                    RichText richText;
                    String str2;
                    Editable text;
                    Intrinsics.checkParameterIsNotNull(str, "blockId");
                    StringBuilder sb = new StringBuilder();
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    if (b.mo134575c()) {
                        sb.append("https://applink.larksuite.com/client/chat/open");
                    } else {
                        sb.append("https://applink.feishu.cn/client/chat/open");
                    }
                    sb.append("?");
                    sb.append("chatId=");
                    sb.append(this.f87230b.getId());
                    String sb2 = sb.toString();
                    Intrinsics.checkExpressionValueIsNotNull(sb2, "appLinkBuilder.toString()");
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = jSONObject;
                    jSONObject2.put((Object) "chat_id", (Object) this.f87230b.getId());
                    jSONObject2.put((Object) "is_public", (Object) Boolean.valueOf(this.f87230b.isPublic()));
                    String jSONString = jSONObject.toJSONString();
                    AbstractC36474h b2 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                    BlockEntity a = b2.ak().mo86315a(str, BlockTypeID.CHAT, sb2, "", jSONString, "", "");
                    Intrinsics.checkExpressionValueIsNotNull(a, "ChatModuleInstanceHolder…, \"\", sourceMeta, \"\", \"\")");
                    AbstractC36474h b3 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "ChatModuleInstanceHolder.getDependency()");
                    C24062d ak = b3.ak();
                    Context a2 = this.f87229a.mo123886a();
                    ActionType actionType = ActionType.Todo;
                    BlockExtra blockExtra = new BlockExtra();
                    if (this.f87231c) {
                        sceneType = BlockExtra.SceneType.INPUT_BOX;
                    } else {
                        sceneType = BlockExtra.SceneType.MESSAGE_TOOLBAR;
                    }
                    blockExtra.sceneType = sceneType;
                    KeyBoard b4 = this.f87229a.f87228a.mo123885f().mo122077b();
                    if (b4 != null) {
                        EditText l = b4.mo146827h().mo146904l();
                        if (l instanceof RichTextEmojiconEditText) {
                            richText = ((RichTextEmojiconEditText) l).getRichText();
                        } else {
                            if (l == null || (text = l.getText()) == null || (str2 = text.toString()) == null) {
                                str2 = "";
                            }
                            richText = C59029c.m229161b(str2);
                        }
                        if (!C59035h.m229210a(richText)) {
                            blockExtra.richTextMessage = new RichTextMessage(Message.Type.TEXT, new MessageContentEntity(new TextEntity(richText, null)));
                        }
                    }
                    ak.mo86317a(a2, actionType, a, blockExtra);
                }

                C33854a(C33853a aVar, Chat chat, boolean z) {
                    this.f87229a = aVar;
                    this.f87230b = chat;
                    this.f87231c = z;
                }
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.more.todo.IToDoDependency
            /* renamed from: a */
            public void mo123231a(Chat chat, boolean z) {
                String str;
                String str2;
                Intrinsics.checkParameterIsNotNull(chat, "chat");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (z) {
                    str = "input_box";
                } else {
                    str = "message_toolbar";
                }
                org.json.JSONObject put = jSONObject.put(ShareHitPoint.f121868c, str).put("chat_id", chat.getId());
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                ao R = b.mo134519R();
                Intrinsics.checkExpressionValueIsNotNull(R, "ChatModuleInstanceHolder…pendency().todoDependency");
                if (R.mo134473a()) {
                    str2 = "inline";
                } else {
                    str2 = "pop_up";
                }
                Statistics.sendEvent("todo_create", put.put("ab_version", str2));
                TodoHitPoint.f135910a.mo187756a(chat);
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                b2.ak().mo86324b(Domain.chat, chat.getId(), BlockTypeID.CHAT, new C33854a(this, chat, z));
            }
        }

        /* renamed from: e */
        public IPlusItem mo122014c() {
            if (this.f87225d == null) {
                this.f87225d = new TodoPlusItem(this.f87223b, this.f87226e);
            }
            return this.f87225d;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardCreator.IPlugin
        /* renamed from: d */
        public boolean mo122015d() {
            if (!this.f87222a.mo123882b() || this.f87223b.isCrossWithKa() || this.f87223b.isThread() || this.f87223b.isSuper()) {
                return false;
            }
            return true;
        }

        public TodoPlusItemPlugin(TodoPlugin uVar, IKeyboardCreator.PluginContext cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "pluginContext");
            this.f87222a = uVar;
            this.f87227f = cVar;
            this.f87223b = cVar.mo122078c();
            Context requireContext = cVar.mo122076a().requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "pluginContext.host.requireContext()");
            this.f87224c = requireContext;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TodoPlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.u$b */
    public static final class C33855b implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ TodoPlugin f87232a;

        /* renamed from: b */
        final /* synthetic */ IChatWindowApp f87233b;

        /* renamed from: c */
        final /* synthetic */ C35219b f87234c;

        /* renamed from: d */
        final /* synthetic */ IKeyboardComponent f87235d;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127735a(this, fVar);
            Object o = this.f87233b.mo123193o();
            if (o != null) {
                Chat chat = this.f87234c.f90956f;
                Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
                TodoPlusItemPlugin aVar = new TodoPlusItemPlugin(this.f87232a, new IKeyboardCreator.PluginContext((Fragment) o, fVar, chat, this.f87234c.f90957g, null));
                this.f87235d.mo121977a(aVar.mo122012a(), aVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        C33855b(TodoPlugin uVar, IChatWindowApp dVar, C35219b bVar, IKeyboardComponent cVar) {
            this.f87232a = uVar;
            this.f87233b = dVar;
            this.f87234c = bVar;
            this.f87235d = cVar;
        }
    }

    /* renamed from: b */
    public final boolean mo123882b() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        ao R = b.mo134519R();
        Intrinsics.checkExpressionValueIsNotNull(R, "ChatModuleInstanceHolder…pendency().todoDependency");
        return R.mo134474b();
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        if (ChatKeyboardFgUtil.f85002a.mo122016a()) {
            IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
            cVar.mo121971a(new C33855b(this, dVar, bVar, cVar));
        }
    }
}
