package com.ss.android.lark.chat.chatwindow.secretchat.plugin;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.chat.chatwindow.biz.plugin.SkeletonPlugin;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.PluginFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretChatPluginFactory;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/PluginFactory;", "()V", "providePlugins", "", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/IChatPlugin;", "activity", "Landroidx/fragment/app/FragmentActivity;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.b */
public final class SecretChatPluginFactory extends PluginFactory {
    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.PluginFactory
    /* renamed from: a */
    public List<IChatPlugin> mo122135a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        List<IChatPlugin> a = super.mo122135a(fragmentActivity);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a);
        arrayList.add(new SkeletonPlugin(true));
        arrayList.add(new SecretChatPlugin());
        arrayList.add(new SecretStatusBarPlugin());
        arrayList.add(new SecretVoicePlugin());
        arrayList.add(new SecretDocPlugin());
        arrayList.add(new SecretLocationPlugin());
        arrayList.add(new SecretProfilePlugin());
        return arrayList;
    }
}
