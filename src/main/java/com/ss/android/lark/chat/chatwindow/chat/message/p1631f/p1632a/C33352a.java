package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.C33348a;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.utils.MessageCellUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.a */
public class C33352a extends C33353b {
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO aVar, View view) {
        int i;
        boolean z;
        if (TextUtils.isEmpty(aVar.mo121700h()) && !aVar.ah()) {
            i = 9;
        } else if (aVar.mo121695c()) {
            i = 0;
        } else {
            i = 1;
        }
        if (!TextUtils.isEmpty(aVar.mo121700h()) || aVar.ah()) {
            return C33348a.C33349a.m129127a(i, aVar.ah());
        }
        if (aVar instanceof ChatMessageVO) {
            z = MessageCellUtils.m133199b(aVar);
        } else {
            z = false;
        }
        return BubbleStyle.m131964a(i, (View) null, z ? new int[]{UIHelper.dp2px(6.0f), 0, 0, 0} : new int[]{0, 0, UIHelper.dp2px(6.0f), 0});
    }
}
