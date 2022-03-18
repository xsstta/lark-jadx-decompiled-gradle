package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.d */
public class C33355d extends C33353b {

    /* renamed from: a */
    private static final int f85910a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    private static final int f85911b = UIHelper.dp2px(8.0f);

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public C34034b mo122836a(AbsMessageVO aVar) {
        return C34034b.m131983a(f85910a, 0, 0, f85911b, false, 2);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: b */
    public C34035c mo122837b(AbsMessageVO aVar) {
        C34035c b = super.mo122837b(aVar);
        int i = f85910a;
        b.mo126162a(new int[]{i, f85911b, i, 0});
        return b;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO aVar, View view) {
        return BubbleStyle.m131964a(14, view.findViewById(R.id.top_part_layout), new int[]{0, 0, 0, 0});
    }
}
