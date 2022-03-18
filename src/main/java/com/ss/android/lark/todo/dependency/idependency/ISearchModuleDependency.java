package com.ss.android.lark.todo.dependency.idependency;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.todo.dependency.entity.SearchChatterResult;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J&\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/dependency/idependency/ISearchModuleDependency;", "", "openSearchPage", "", "context", "Landroid/content/Context;", "titleKey", "", "titleHeight", "", "searchChatter", "key", "count", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/todo/dependency/entity/SearchChatterResult;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.a.r */
public interface ISearchModuleDependency {
    /* renamed from: a */
    void mo145424a(Context context, String str, int i);

    /* renamed from: a */
    void mo145425a(String str, int i, IGetDataCallback<SearchChatterResult> iGetDataCallback);
}
