package com.ss.android.lark.todo.dependency.idependency;

import android.content.Context;
import android.view.View;
import com.larksuite.component.blockit.todo.ITodoBlockViewClickListener;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/dependency/idependency/IMessengerDependency;", "", "getBlockView", "", "blockId", "", "listener", "Lcom/larksuite/component/blockit/todo/ITodoBlockViewClickListener;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/view/View;", "goUserProfile", "context", "Landroid/content/Context;", "userId", "mountBlockById", "viewGroup", "Landroid/view/ViewGroup;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.a.o */
public interface IMessengerDependency {
    /* renamed from: a */
    void mo145420a(Context context, String str);

    /* renamed from: a */
    void mo145421a(String str, ITodoBlockViewClickListener aVar, IGetDataCallback<View> iGetDataCallback);
}
