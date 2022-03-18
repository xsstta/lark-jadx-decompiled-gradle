package com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1632a;

import android.view.View;
import com.huawei.hms.location.ActivityIdentificationData;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.C33348a;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.chat.export.ui.message.style.C34034b;
import com.ss.android.lark.chat.export.ui.message.style.C34035c;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.vo.AbsMessageVO;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f.a.g */
public class C33358g implements AbstractC34072a<PostContentVO> {
    @Override // com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: b */
    public C34035c mo122837b(AbsMessageVO<PostContentVO> aVar) {
        return C33348a.C33351c.m129130a(aVar.mo121695c());
    }

    @Override // com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public C34034b mo122836a(AbsMessageVO<PostContentVO> aVar) {
        int i = 2;
        if (aVar.mo121699g().mo121882n()) {
            return C34034b.m131984b(2);
        }
        if (aVar.mo121695c()) {
            i = 3;
        }
        return C34034b.m131984b(i);
    }

    @Override // com.ss.android.lark.chat.open.message.AbstractC34072a
    /* renamed from: a */
    public BubbleStyle mo122835a(AbsMessageVO<PostContentVO> aVar, View view) {
        View view2;
        int i;
        if (aVar.mo121699g().mo121882n()) {
            i = ActivityIdentificationData.WALKING;
            view2 = view.findViewById(R.id.chat_post).findViewById(R.id.title_division);
        } else {
            i = !aVar.mo121695c() ? 1 : 0;
            view2 = null;
        }
        return C33348a.C33349a.m129126a(i, view2, aVar.ah());
    }
}
