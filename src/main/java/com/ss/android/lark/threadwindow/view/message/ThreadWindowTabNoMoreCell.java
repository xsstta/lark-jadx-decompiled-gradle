package com.ss.android.lark.threadwindow.view.message;

import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class ThreadWindowTabNoMoreCell extends AbstractC33290a<ContentVO<?>, ThreadWindowTabNoMoreViewHolder> {
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_tab_no_more;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadWindowTabNoMoreViewHolder extends AbstractC59010e {
        @BindView(8978)
        public TextView mNoMoreTV;

        ThreadWindowTabNoMoreViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return PostContentVO.class;
    }

    public class ThreadWindowTabNoMoreViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadWindowTabNoMoreViewHolder f139070a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadWindowTabNoMoreViewHolder threadWindowTabNoMoreViewHolder = this.f139070a;
            if (threadWindowTabNoMoreViewHolder != null) {
                this.f139070a = null;
                threadWindowTabNoMoreViewHolder.mNoMoreTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadWindowTabNoMoreViewHolder_ViewBinding(ThreadWindowTabNoMoreViewHolder threadWindowTabNoMoreViewHolder, View view) {
            this.f139070a = threadWindowTabNoMoreViewHolder;
            threadWindowTabNoMoreViewHolder.mNoMoreTV = (TextView) Utils.findRequiredViewAsType(view, R.id.thread_no_more, "field 'mNoMoreTV'", TextView.class);
        }
    }

    public ThreadWindowTabNoMoreCell(AbstractC33342d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadWindowTabNoMoreViewHolder threadWindowTabNoMoreViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        super.mo122648a((AbstractC59010e) threadWindowTabNoMoreViewHolder, (AbsMessageVO) aVar);
        C25649b.m91856a(threadWindowTabNoMoreViewHolder.mNoMoreTV, 14);
    }
}
