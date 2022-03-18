package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.C33348a;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.e */
public class C33356e extends C33353b {
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a.C33353b, com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO aVar, View view) {
        if (!TextUtils.isEmpty(aVar.mo121700h()) || aVar.ah()) {
            return C33348a.C33349a.m129126a(!aVar.mo121695c(), null, aVar.ah());
        }
        return BubbleStyle.m131964a(9, (View) null, (int[]) null);
    }
}
