package com.ss.android.lark.chat.open.message;

import android.view.View;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.open.message.a */
public interface AbstractC34072a<T extends ContentVO<?>> {
    /* renamed from: a */
    BubbleStyle mo122835a(AbsMessageVO<T> aVar, View view);

    /* renamed from: a */
    C34034b mo122836a(AbsMessageVO<T> aVar);

    /* renamed from: b */
    C34035c mo122837b(AbsMessageVO<T> aVar);
}
