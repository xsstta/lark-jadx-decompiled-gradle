package com.ss.android.lark.ai.smartreply.inter;

import android.content.Intent;
import android.text.TextWatcher;
import com.ss.android.lark.ai.smartreply.dto.SmartReplyItem;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout;
import java.util.List;

/* renamed from: com.ss.android.lark.ai.smartreply.inter.d */
public interface AbstractC28621d extends TextWatcher, AbstractC28620c, KeyboardDetectorFrameLayout.AbstractC58470a {

    /* renamed from: com.ss.android.lark.ai.smartreply.inter.d$a */
    public interface AbstractC28622a {
        /* renamed from: a */
        void mo101869a();
    }

    /* renamed from: a */
    void mo101811a(List<SmartReplyItem> list);

    /* renamed from: a */
    void mo101812a(boolean z);

    /* renamed from: a */
    boolean mo101813a(int i, int i2, Intent intent);

    /* renamed from: c */
    void mo101816c();
}
