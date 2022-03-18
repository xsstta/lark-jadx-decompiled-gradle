package com.ss.android.lark.chatwindow.view.tip.p1728a;

import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import java.util.Objects;

/* renamed from: com.ss.android.lark.chatwindow.view.tip.a.a */
public class C35314a implements AbstractC35310a.AbstractC35312b<ThreadMessageVO> {
    /* renamed from: a */
    public int mo122236a(ThreadMessageVO threadMessageVO) {
        if (threadMessageVO.mo121674T()) {
            return -1;
        }
        return threadMessageVO.mo121718z();
    }

    /* renamed from: a */
    public boolean mo122238a(String str, ThreadMessageVO threadMessageVO) {
        return Objects.equals(str, threadMessageVO.mo121681a());
    }
}
