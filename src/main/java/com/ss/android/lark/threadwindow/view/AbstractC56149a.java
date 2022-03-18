package com.ss.android.lark.threadwindow.view;

import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.view.a */
public interface AbstractC56149a {
    /* renamed from: a */
    List<ThreadMessageVO> mo191465a();

    /* renamed from: a */
    List<ThreadMessageVO> mo191466a(int i, int i2, boolean z);

    /* renamed from: a */
    void mo191467a(List<ThreadMessageVO> list);

    /* renamed from: b */
    ThreadMessageVO mo191468b(int i);

    /* renamed from: b */
    void mo191469b();

    /* renamed from: c */
    int mo191470c(int i);

    int getItemCount();

    void notifyDataSetChanged();

    void notifyItemChanged(int i);
}
