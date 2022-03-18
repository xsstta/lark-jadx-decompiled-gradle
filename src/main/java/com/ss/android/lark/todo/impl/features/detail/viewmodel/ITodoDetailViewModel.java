package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.todo.v1.TodoOrigin;
import com.bytedance.lark.pb.todo.v1.TodoReferResource;
import com.bytedance.lark.pb.todo.v1.TodoSource;
import com.bytedance.lark.pb.todo.v1.TodoSourceHref;
import com.ss.android.lark.todo.impl.features.common.share.entity.ShareEntity;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.r */
public interface ITodoDetailViewModel {
    LiveData<Boolean> getActivityFinished();

    String getBlockId();

    boolean getCanRead();

    String getGuid();

    boolean getHasValidTodo();

    LiveData<Boolean> getLoading();

    LiveData<Boolean> getNeedUpdate();

    String getReferResourceId();

    C1177w<TodoReferResource> getReferResourceLv();

    C1177w<ShareEntity> getShareEntity();

    LiveData<Integer> getToastStringResId();

    TodoOrigin getTodoOrigin();

    TodoSource getTodoSource();

    TodoSourceHref getTodoSourceHref();

    boolean isChatKeyboardCreateTodo();

    boolean isCreateFromMessage();

    boolean isCreateFromMultiMessage();

    boolean isCreateTodo();

    boolean isDeleted();

    boolean isEditable();

    boolean isShouldFastCreate();

    void logTodoDetailOnScreenShot();

    void saveDraft();

    void setReferResourceId(String str);

    void shareTodo(ArrayList<String> arrayList, String str);

    void toastPrompt(boolean z);

    void updateTodo();

    /* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.r$a */
    public static final class C56785a {
        /* renamed from: a */
        public static /* synthetic */ void m220654a(ITodoDetailViewModel rVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                rVar.toastPrompt(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toastPrompt");
        }
    }
}
