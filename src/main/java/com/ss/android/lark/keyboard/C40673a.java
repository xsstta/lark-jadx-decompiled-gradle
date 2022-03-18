package com.ss.android.lark.keyboard;

import com.ss.android.lark.chat.entity.keyboard.ISupportForItem;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.statistics.extensions.IParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"inputContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;", "getInputContext", "(Lcom/ss/android/lark/chat/entity/keyboard/ISupportForItem;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "fullScreenParam", "Lcom/ss/android/lark/statistics/extensions/IParam;", "isFullScreen", "", "im_keyboard_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.a */
public final class C40673a {
    /* renamed from: a */
    public static final IParam m160698a(boolean z) {
        if (z) {
            return KeyboardHitPointExtraParams.IsFullScreen.TRUE;
        }
        return KeyboardHitPointExtraParams.IsFullScreen.FALSE;
    }

    /* renamed from: a */
    public static final IKeyBoardPlugin.IKeyBoardContext m160697a(ISupportForItem cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$inputContext");
        if (cVar instanceof PlusKBPlugin) {
            return ((PlusKBPlugin) cVar).mo147662l();
        }
        return null;
    }
}
