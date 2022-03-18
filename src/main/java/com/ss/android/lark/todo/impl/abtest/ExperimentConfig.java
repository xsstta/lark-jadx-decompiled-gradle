package com.ss.android.lark.todo.impl.abtest;

import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/abtest/ExperimentConfig;", "", "()V", "EXPERIMENTS", "", "Lcom/ss/android/lark/abtest/api/experiment/LarkExperimentConfig;", "isChatInlineCreateTodoEnabled", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.a.a */
public final class ExperimentConfig {

    /* renamed from: a */
    public static final List<AbstractC28490a<?>> f139254a;

    /* renamed from: b */
    public static final ExperimentConfig f139255b = new ExperimentConfig();

    private ExperimentConfig() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        f139254a = arrayList;
        arrayList.add(new TodoExperiment());
    }
}
