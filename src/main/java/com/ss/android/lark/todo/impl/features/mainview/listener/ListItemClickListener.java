package com.ss.android.lark.todo.impl.features.mainview.listener;

import android.view.View;
import com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/listener/ListItemClickListener;", "Lcom/ss/android/lark/todo/impl/features/common/listener/DebounceClickListener;", "listener", "Lcom/ss/android/lark/todo/impl/features/mainview/listener/ListItemClickListener$IListItemClickListener;", "(Lcom/ss/android/lark/todo/impl/features/mainview/listener/ListItemClickListener$IListItemClickListener;)V", "doClick", "", "v", "Landroid/view/View;", "IListItemClickListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.c.a */
public final class ListItemClickListener extends DebounceClickListener {

    /* renamed from: b */
    private final IListItemClickListener f140272b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/listener/ListItemClickListener$IListItemClickListener;", "", "onListItemClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.mainview.c.a$a */
    public interface IListItemClickListener {
        /* renamed from: a */
        void mo191811a();
    }

    public ListItemClickListener(IListItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f140272b = aVar;
    }

    @Override // com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener
    /* renamed from: a */
    public void mo191942a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.f140272b.mo191811a();
    }
}
