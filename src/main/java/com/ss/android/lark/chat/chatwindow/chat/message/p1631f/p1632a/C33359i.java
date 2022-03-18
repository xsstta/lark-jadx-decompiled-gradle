package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.i */
public class C33359i extends C33353b {

    /* renamed from: a */
    private static final int f85913a = UIHelper.dp2px(12.0f);

    /* renamed from: b */
    private static final int f85914b = UIHelper.dp2px(8.0f);

    /* renamed from: c */
    private final AbstractC33342d f85915c;

    public C33359i(AbstractC33342d dVar) {
        this.f85915c = dVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public C34034b mo122836a(AbsMessageVO aVar) {
        return C34034b.m131982a(f85913a, 2);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO aVar, View view) {
        int i;
        if (aVar.mo121698f() || !aVar.ah() || this.f85915c.mo122559w()) {
            i = 0;
        } else {
            i = f85914b;
        }
        return BubbleStyle.m131964a(101, view.findViewById(R.id.merge_forward_title), new int[]{0, 0, 0, i});
    }
}
