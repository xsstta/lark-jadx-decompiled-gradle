package com.ss.android.lark.todo.dependency.idependency;

import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.Domain;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/dependency/idependency/IBlockitDependency;", "", "generateBlockIDFromLocal", "", "domain", "Lcom/larksuite/component/blockit/entity/Domain;", "uuid", "", "blockType", "Lcom/larksuite/component/blockit/entity/BlockTypeID;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.dependency.a.d */
public interface IBlockitDependency {
    /* renamed from: a */
    void mo145367a(Domain domain, String str, BlockTypeID blockTypeID, IGetDataCallback<String> iGetDataCallback);
}
