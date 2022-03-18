package com.ss.android.lark.integrator.im.chat.dependency;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.dependency.IChatSettingDependency;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.integrator.im.groupmember.C39633a;
import com.ss.android.lark.integrator.im.p2023c.C39452a;
import com.ss.android.lark.p2392o.AbstractC48697c;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionBinder;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.g */
public class C39526g implements IChatSettingDependency {

    /* renamed from: a */
    private static final Map<AbstractC48697c, ChatSettingModule.AbstractC34454a> f100978a = new ConcurrentHashMap();

    /* renamed from: b */
    private final ChatSettingModule f100979b = C39452a.m155775a();

    /* renamed from: a */
    private String m156259a(int i) {
        return i == 0 ? "group_name_mobile" : i == 1 ? "more_mobile" : "";
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134358a(Context context, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f100979b.mo127235a(context, str, i, z, z2, z3, z4);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134356a(Context context, C36516a aVar, String str, int i, boolean z, int i2, int i3) {
        this.f100979b.mo127232a(context, aVar, str, i, z, i2, m156259a(i3));
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134357a(Context context, String str) {
        this.f100979b.mo127233a(context, str);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134359a(final AbstractC48697c cVar) {
        C395271 r0 = new ChatSettingModule.AbstractC34454a() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.C39526g.C395271 */

            @Override // com.ss.android.lark.chatsetting.ChatSettingModule.AbstractC34454a
            /* renamed from: a */
            public void mo127247a(ChatAnnouncement chatAnnouncement) {
                cVar.mo123105a(chatAnnouncement);
            }

            @Override // com.ss.android.lark.chatsetting.ChatSettingModule.AbstractC34454a
            /* renamed from: b */
            public void mo127249b(String str, boolean z) {
                cVar.mo123107b(str, z);
            }

            @Override // com.ss.android.lark.chatsetting.ChatSettingModule.AbstractC34454a
            /* renamed from: a */
            public void mo127248a(String str, boolean z) {
                cVar.mo123106a(str, z);
            }
        };
        f100978a.put(cVar, r0);
        this.f100979b.mo127237a(r0);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134355a(Context context, IChatSettingDependency.AbstractC36448a aVar) {
        C39452a.m155775a().mo127230a(context, ChatSettingApplyWay.SELF_APPLY, new AbstractC29611c() {
            /* class com.ss.android.lark.integrator.im.chat.dependency.$$Lambda$g$s0vbbov5FdaxFaKRyMhZBoyFoMc */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29611c
            public final void onClick(View view, String str) {
                C39526g.lambda$s0vbbov5FdaxFaKRyMhZBoyFoMc(IChatSettingDependency.AbstractC36448a.this, view, str);
            }
        });
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: b */
    public int mo134360b() {
        return ChatSettingModule.HideSettingItemMask.HIDE_NOTICE_ITEM.getNumber();
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: c */
    public int mo134364c() {
        return ChatSettingModule.HideSettingItemMask.HIDE_CONVERSATION_BOX_ITEM.getNumber();
    }

    C39526g() {
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public int mo134347a() {
        return ChatSettingModule.HideSettingItemMask.HIDE_SHORTCUT_ITEM.getNumber();
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: c */
    public boolean mo134365c(Chat chat) {
        return this.f100979b.mo127244c(chat);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: b */
    public void mo134362b(AbstractC48697c cVar) {
        Map<AbstractC48697c, ChatSettingModule.AbstractC34454a> map = f100978a;
        ChatSettingModule.AbstractC34454a aVar = map.get(cVar);
        if (aVar != null) {
            map.remove(cVar);
            this.f100979b.mo127242b(aVar);
        }
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: b */
    public boolean mo134363b(Chat chat) {
        return this.f100979b.mo127243b(chat);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public List<IChatFunctionItem> mo134350a(Chat chat) {
        return this.f100979b.mo127223a(chat);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: b */
    public void mo134361b(Context context, String str) {
        this.f100979b.mo127241b(context, str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m156260a(IChatSettingDependency.AbstractC36448a aVar, View view, String str) {
        if (aVar != null) {
            aVar.onClick(view, str);
        }
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134352a(Activity activity, Chat chat, int i) {
        this.f100979b.mo127227a(activity, chat, i);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134354a(Activity activity, String str, boolean z) {
        C39633a.m157280a().mo158792a(activity, str, z, false);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public IChatFunctionController mo134349a(Activity activity, Chat chat, Chatter chatter, List<IChatFunctionItem> list) {
        return this.f100979b.mo127222a(activity, chat, chatter, list);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public List<IChatFunctionItem> mo134351a(ChatChatter chatChatter, ChatChatter chatChatter2, Chat chat, boolean z) {
        return this.f100979b.mo127224a(chatChatter, chatChatter2, chat, z);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public <VH extends RecyclerView.ViewHolder, B extends IChatFunctionBinder<VH>> IChatFunctionController mo134348a(Activity activity, Chat chat, Chatter chatter, ChatFunctionView chatFunctionView, B b, RecyclerView.LayoutManager layoutManager, List<IChatFunctionItem> list) {
        return this.f100979b.mo127221a(activity, chat, chatter, chatFunctionView, b, layoutManager, list);
    }

    @Override // com.ss.android.lark.dependency.IChatSettingDependency
    /* renamed from: a */
    public void mo134353a(Activity activity, C36516a aVar, Chatter chatter, Chat chat, int i, int i2, int i3) {
        this.f100979b.mo127229a(activity, aVar, chatter, chat, i, i2, m156259a(i3));
    }
}
