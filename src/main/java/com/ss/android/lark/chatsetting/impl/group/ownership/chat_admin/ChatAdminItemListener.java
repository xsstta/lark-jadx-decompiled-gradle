package com.ss.android.lark.chatsetting.impl.group.ownership.chat_admin;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.setting.C34942d;
import com.ss.android.lark.chatsetting.impl.group.setting.C34945e;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/chat_admin/ChatAdminItemListener;", "Lcom/ss/android/lark/chatsetting/impl/group/setting/GroupMemberGridViewAdapter$OnItemClickListener;", "context", "Landroid/content/Context;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatAdminCount", "", "(Landroid/content/Context;Lcom/ss/android/lark/chat/entity/chat/Chat;I)V", "onItemClick", "", "item", "Lcom/ss/android/lark/chatsetting/impl/group/setting/GroupMemberItem;", "view", "Landroid/view/View;", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.a.a */
public final class ChatAdminItemListener implements C34942d.AbstractC34944a {

    /* renamed from: a */
    public static final Companion f89538a = new Companion(null);

    /* renamed from: b */
    private final Context f89539b;

    /* renamed from: c */
    private final Chat f89540c;

    /* renamed from: d */
    private final int f89541d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/chat_admin/ChatAdminItemListener$Companion;", "", "()V", "LOG_TAG", "", "goAddChatAdminActivity", "", "context", "Landroid/content/Context;", "chatId", "chatAdminCount", "", "goChatAdminActivity", "goUserProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo128072a(Context context, String str) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34473l k = a.mo127281k();
            if (context != null) {
                k.mo127403a((Activity) context, str, true);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }

        /* renamed from: a */
        public final void mo128071a(Context context, Chatter chatter) {
            if (chatter.isAnonymous()) {
                Log.m165389i("ChatAdminItemListener", "chatter is anonymous block avatar click");
                return;
            }
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            a.mo127280j().mo127428b(context, chatter.getId());
        }

        /* renamed from: a */
        public final void mo128073a(Context context, String str, int i) {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            AbstractC34461c.AbstractC34473l k = a.mo127281k();
            if (context != null) {
                k.mo127401a((Activity) context, str, i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.setting.C34942d.AbstractC34944a
    /* renamed from: a */
    public void mo128070a(C34945e eVar, View view) {
        if (eVar != null && view != null) {
            int a = eVar.mo128870a();
            if (a == 1) {
                Companion aVar = f89538a;
                Context context = this.f89539b;
                Chatter b = eVar.mo128875b();
                Intrinsics.checkExpressionValueIsNotNull(b, "item.chatter");
                aVar.mo128071a(context, b);
            } else if (a == 2) {
                Companion aVar2 = f89538a;
                Context context2 = this.f89539b;
                String id = this.f89540c.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "chat.getId()");
                aVar2.mo128073a(context2, id, this.f89541d);
            } else if (a == 3) {
                Companion aVar3 = f89538a;
                Context context3 = this.f89539b;
                String id2 = this.f89540c.getId();
                Intrinsics.checkExpressionValueIsNotNull(id2, "chat.getId()");
                aVar3.mo128072a(context3, id2);
            }
        }
    }

    public ChatAdminItemListener(Context context, Chat chat, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.f89539b = context;
        this.f89540c = chat;
        this.f89541d = i;
    }
}
