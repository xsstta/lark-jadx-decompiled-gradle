package com.ss.android.lark.integrator.im.dependency;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\bH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/integrator/im/dependency/ITodoDependency;", "", "getChatTodoListReadState", "", "chatId", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "gotoChatTodoListActivity", "context", "Landroid/content/Context;", "isThread", "isTodoTabEnable", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.dependency.w */
public interface ITodoDependency {
    /* renamed from: a */
    void mo143689a(Context context, String str, boolean z);

    /* renamed from: a */
    void mo143690a(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo143691a();
}
