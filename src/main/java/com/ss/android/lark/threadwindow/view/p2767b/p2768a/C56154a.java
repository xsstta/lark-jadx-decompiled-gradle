package com.ss.android.lark.threadwindow.view.p2767b.p2768a;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;

/* renamed from: com.ss.android.lark.threadwindow.view.b.a.a */
public class C56154a implements AbstractC32928b<ThreadMessageVO<?>> {
    /* renamed from: a */
    public boolean accept(C34029b bVar, ThreadMessageVO<?> threadMessageVO) {
        if (!threadMessageVO.mo121674T() && threadMessageVO.mo121708p()) {
            return true;
        }
        return false;
    }
}
