package com.ss.android.lark.keyboard.widget;

import com.ss.android.lark.keyboard.widget.emoji.EmojiOperator;
import com.ss.android.lark.keyboard.widget.emoji.EmojiPanel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/widget/KeyboardPanelsFacade;", "", "()V", "emojiPanelInstance", "Lcom/ss/android/lark/keyboard/widget/IPanel;", "operator", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator;", "dependency", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency;", "keyboard-component_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.keyboard.widget.f */
public final class KeyboardPanelsFacade {
    /* renamed from: a */
    public final IPanel mo148279a(EmojiOperator bVar, EmojiPanel.EmojiPanelDependency bVar2) {
        Intrinsics.checkParameterIsNotNull(bVar, "operator");
        Intrinsics.checkParameterIsNotNull(bVar2, "dependency");
        return new EmojiPanel(bVar, bVar2);
    }
}
