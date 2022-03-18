package com.ss.android.lark.integrator.todo.im;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.biz.im.extension.ChatContext;
import com.ss.android.lark.biz.im.extension.ChatWindowObserver;
import com.ss.android.lark.biz.im.extension.ExtensionCallback;
import com.ss.android.lark.biz.im.extension.ExtensionFactory;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.integrator.todo.TodoModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.BinderC57853n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/TodoChatWindowObserverFactory;", "Lcom/ss/android/lark/biz/im/extension/ExtensionFactory;", "Lcom/ss/android/lark/biz/im/extension/ChatContext;", "Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "()V", "create", "param", "TodoChatWindowObserver", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoChatWindowObserverFactory implements ExtensionFactory<ChatContext, ChatWindowObserver> {
    /* renamed from: a */
    public ChatWindowObserver mo106814a(ChatContext cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "param");
        return new TodoChatWindowObserver(this, cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/integrator/todo/im/TodoChatWindowObserverFactory$TodoChatWindowObserver;", "Lcom/ss/android/lark/biz/im/extension/ChatWindowObserver;", "chatContext", "Lcom/ss/android/lark/biz/im/extension/ChatContext;", "(Lcom/ss/android/lark/integrator/todo/im/TodoChatWindowObserverFactory;Lcom/ss/android/lark/biz/im/extension/ChatContext;)V", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public final class TodoChatWindowObserver extends ChatWindowObserver {

        /* renamed from: a */
        final /* synthetic */ TodoChatWindowObserverFactory f101813a;

        /* renamed from: b */
        private final ChatContext f101814b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0005¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/integrator/todo/im/TodoChatWindowObserverFactory$TodoChatWindowObserver$onActivityResult$1$1", "Lcom/ss/android/lark/biz/im/extension/ExtensionCallback;", "", "invoke", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.integrator.todo.im.TodoChatWindowObserverFactory$TodoChatWindowObserver$a */
        public static final class C40062a implements ExtensionCallback<Unit> {

            /* renamed from: a */
            final /* synthetic */ TodoChatWindowObserver f101815a;

            /* renamed from: b */
            final /* synthetic */ String f101816b;

            /* renamed from: c */
            final /* synthetic */ String f101817c;

            /* renamed from: a */
            public void mo106813a(Unit unit) {
                Intrinsics.checkParameterIsNotNull(unit, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (this.f101815a.mo106794a()) {
                    TodoModuleProvider.f101780b.mo145355b().mo191658a(this.f101816b, this.f101817c);
                }
            }

            C40062a(TodoChatWindowObserver todoChatWindowObserver, String str, String str2) {
                this.f101815a = todoChatWindowObserver;
                this.f101816b = str;
                this.f101817c = str2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TodoChatWindowObserver(TodoChatWindowObserverFactory todoChatWindowObserverFactory, ChatContext cVar) {
            super("TodoChatWindowObserver");
            Intrinsics.checkParameterIsNotNull(cVar, "chatContext");
            this.f101813a = todoChatWindowObserverFactory;
            this.f101814b = cVar;
        }

        @Override // com.ss.android.lark.biz.im.extension.ChatWindowObserver
        /* renamed from: a */
        public boolean mo106795a(int i, int i2, Intent intent) {
            Bundle bundle;
            Bundle extras;
            String string;
            String id;
            Bundle extras2;
            if (i != 1) {
                return super.mo106795a(i, i2, intent);
            }
            Drawable drawable = null;
            if (intent == null || (extras2 = intent.getExtras()) == null) {
                bundle = null;
            } else {
                bundle = extras2.getBundle("message_alert_bundle");
            }
            if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("message_alert_todo_guid")) == null) {
                Log.m165383e(mo106796b(), "todoGuid is null");
                return false;
            }
            Intrinsics.checkExpressionValueIsNotNull(string, "data?.extras?.getString(…n false\n                }");
            Chat b = this.f101814b.mo106812b();
            if (b == null || (id = b.getId()) == null) {
                Log.m165383e(mo106796b(), "chatId is null");
                return false;
            }
            Intrinsics.checkExpressionValueIsNotNull(id, "chatContext.getChat()?.g…n false\n                }");
            if (bundle != null) {
                IBinder binder = bundle.getBinder("message_alert_drawable");
                String string2 = bundle.getString("message_alert_text");
                ChatContext cVar = this.f101814b;
                if (!(binder instanceof BinderC57853n)) {
                    binder = null;
                }
                BinderC57853n nVar = (BinderC57853n) binder;
                if (nVar != null) {
                    drawable = nVar.mo196197a();
                }
                cVar.mo106811a(drawable, string2, new C40062a(this, string, id));
            }
            TodoModuleProvider.f101780b.mo145355b().mo191655a(this.f101814b.mo106810a(), string);
            return true;
        }
    }
}
