package com.ss.android.lark.keyboard.plugin.tool.plugingroup;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\rH&J\u001c\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u000fH&J\b\u0010\u0013\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IKeyBoardPluginGroup;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "subPluginContainer", "Landroid/view/ViewGroup;", "getSubPluginContainer", "()Landroid/view/ViewGroup;", "transition", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IPluginGroupTransition;", "getTransition", "()Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IPluginGroupTransition;", "clearAllSubPlugin", "", "currentPluginPanel", "Landroid/view/View;", "onCreateSubPlugins", "", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IkeyBoardSubPlugin;", "", "unSelectCurrentSubPlugin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.d.a */
public interface IKeyBoardPluginGroup extends IKeyBoardPlugin {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.d.a$a */
    public static final class C40856a {
        /* renamed from: a */
        public static void m161792a(IKeyBoardPluginGroup aVar, boolean z) {
            IKeyBoardPlugin.C40806a.m161550a(aVar, z);
        }

        /* renamed from: a */
        public static boolean m161793a(IKeyBoardPluginGroup aVar) {
            return IKeyBoardPlugin.C40806a.m161551a(aVar);
        }

        /* renamed from: a */
        public static boolean m161794a(IKeyBoardPluginGroup aVar, int i, Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            return IKeyBoardPlugin.C40806a.m161552a(aVar, i, intent);
        }
    }

    /* renamed from: c */
    ViewGroup mo147296c();

    /* renamed from: e */
    IPluginGroupTransition mo147300e();

    /* renamed from: l */
    View mo147308l();

    /* renamed from: m */
    void mo147309m();
}
