package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.view.View;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.c */
public class C33354c extends C33353b {

    /* renamed from: a */
    private static final int f85908a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    private static final int f85909b = UIHelper.dp2px(8.0f);

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public C34034b mo122836a(AbsMessageVO aVar) {
        return C34034b.m131982a(f85908a, 2);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO aVar, View view) {
        int i;
        if (aVar.mo121698f() || !aVar.ah()) {
            i = 0;
        } else {
            i = f85909b;
        }
        return BubbleStyle.m131964a(12, (View) null, new int[]{0, 0, 0, i});
    }
}
