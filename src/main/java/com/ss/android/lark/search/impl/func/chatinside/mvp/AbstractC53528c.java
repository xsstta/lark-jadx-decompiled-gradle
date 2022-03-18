package com.ss.android.lark.search.impl.func.chatinside.mvp;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.base.fragment.C29527a;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.mvp.c */
public interface AbstractC53528c {

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.mvp.c$a */
    public interface AbstractC53529a extends IModel {
        /* renamed from: a */
        List<C29527a> mo182757a();

        /* renamed from: b */
        int mo182758b();
    }

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.mvp.c$b */
    public interface AbstractC53530b extends IView<AbstractC53531a> {

        /* renamed from: com.ss.android.lark.search.impl.func.chatinside.mvp.c$b$a */
        public interface AbstractC53531a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo182753a(int i);

        /* renamed from: a */
        void mo182755a(List<C29527a> list);
    }
}
