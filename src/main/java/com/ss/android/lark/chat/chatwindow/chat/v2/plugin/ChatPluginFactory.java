package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.chat.chatwindow.biz.plugin.MessageTopNoticePlugin;
import com.ss.android.lark.chat.chatwindow.biz.plugin.SkeletonPlugin;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.PluginFactory;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/ChatPluginFactory;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/PluginFactory;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "getChat", "()Lcom/ss/android/lark/chat/entity/chat/Chat;", "providePlugins", "", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/IChatPlugin;", "activity", "Landroidx/fragment/app/FragmentActivity;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.b */
public final class ChatPluginFactory extends PluginFactory {

    /* renamed from: a */
    private final Chat f86925a;

    public ChatPluginFactory(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.f86925a = chat;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.PluginFactory
    /* renamed from: a */
    public List<IChatPlugin> mo122135a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        List<IChatPlugin> a = super.mo122135a(fragmentActivity);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        arrayList.add(new SkeletonPlugin(false));
        arrayList.add(new CalendarPlugin());
        arrayList.add(new EduPlugin());
        arrayList.add(new OnCallPlugin());
        arrayList.add(new VoicePlugin());
        arrayList.add(new TranslatePlugin());
        arrayList.add(new MessageSelectPlugin());
        arrayList.add(new TimeZonePlugin());
        arrayList.add(new SmartReplyPlugin());
        arrayList.add(new SmartComposePlugin());
        arrayList.add(new StatusBarPlugin());
        arrayList.add(new OneWayContactPlugin());
        arrayList.add(new MagicPlugin());
        arrayList.add(new TabPlugin());
        arrayList.add(new MessageTopNoticePlugin());
        arrayList.add(new RedPacketPlugin());
        arrayList.add(new GadgetPlugin());
        arrayList.add(new TodoPlugin());
        arrayList.add(new DocPlugin());
        arrayList.add(new LocationPlugin());
        arrayList.add(new ProfilePlugin());
        arrayList.add(new MeegoPlugin());
        return arrayList;
    }
}
