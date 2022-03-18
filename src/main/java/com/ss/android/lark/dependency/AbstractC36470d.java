package com.ss.android.lark.dependency;

import android.view.ViewGroup;
import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.ai.smartreply.inter.AbstractC28621d;
import com.ss.android.lark.ai.smartreply.inter.ISmartReplyInterface;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.keyboard.KeyBoard;

/* renamed from: com.ss.android.lark.dependency.d */
public interface AbstractC36470d {
    /* renamed from: a */
    IComposeController mo134484a(String str, IComposeController.ConvoType convoType, IComposeController.EditorType editorType);

    /* renamed from: a */
    AbstractC28621d mo134485a(Chat chat, ViewGroup viewGroup, KeyBoard fVar, ISmartReplyInterface iSmartReplyInterface);

    /* renamed from: a */
    boolean mo134486a();
}
