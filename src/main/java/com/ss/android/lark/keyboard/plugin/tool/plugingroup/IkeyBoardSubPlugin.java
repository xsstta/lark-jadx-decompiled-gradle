package com.ss.android.lark.keyboard.plugin.tool.plugingroup;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "parent", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IKeyBoardPluginGroup;", "getParent", "()Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IKeyBoardPluginGroup;", "cancelSelect", "", "isSelected", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.d.c */
public interface IkeyBoardSubPlugin extends IKeyBoardPlugin {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d.c$a */
    public static final class C40857a {
        /* renamed from: a */
        public static void m161798a(IkeyBoardSubPlugin cVar, boolean z) {
            IKeyBoardPlugin.C40806a.m161550a(cVar, z);
        }

        /* renamed from: a */
        public static boolean m161799a(IkeyBoardSubPlugin cVar) {
            return IKeyBoardPlugin.C40806a.m161551a(cVar);
        }

        /* renamed from: a */
        public static boolean m161800a(IkeyBoardSubPlugin cVar, int i, Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return IKeyBoardPlugin.C40806a.m161552a(cVar, i, intent);
        }
    }

    /* renamed from: m */
    void mo147331m();
}
