package com.ss.android.lark.todo.impl.features.common.screenshot.helper;

import com.alibaba.fastjson.JSON;
import com.bytedance.lark.sdk.Sdk;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.FilterEntity;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.FilterList;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0005\u001a\u00020\u00042\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\nH\u0002J:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/common/screenshot/helper/TodoMainLogHelper;", "", "()V", "TAG", "", "getFilterCountStr", "filterCountMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/todo/impl/features/mainview/entity/TodoFilterType;", "", "Lkotlin/collections/HashMap;", "logTodoDetailOnScreenShot", "", "todoFilter", "scenario", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.c.b.c */
public final class TodoMainLogHelper {

    /* renamed from: a */
    public static final TodoMainLogHelper f139386a = new TodoMainLogHelper();

    private TodoMainLogHelper() {
    }

    /* renamed from: a */
    private final String m219754a(HashMap<TodoFilterType, Integer> hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<TodoFilterType, Integer> entry : hashMap.entrySet()) {
            int i = C56324d.f139387a[entry.getKey().ordinal()];
            if (i == 1) {
                arrayList.add(new FilterEntity("ALL", entry.getValue().intValue()));
            } else if (i == 2) {
                arrayList.add(new FilterEntity("ASSIGN_FROM_ME", entry.getValue().intValue()));
            } else if (i == 3) {
                arrayList.add(new FilterEntity("ASSIGN_TO_ME", entry.getValue().intValue()));
            } else if (i == 4) {
                arrayList.add(new FilterEntity("COMPLETED", entry.getValue().intValue()));
            } else if (i == 5) {
                arrayList.add(new FilterEntity("FOLLOWED", entry.getValue().intValue()));
            }
        }
        String jSONString = JSON.toJSONString(new FilterList(arrayList));
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(FilterList(filters))");
        return jSONString;
    }

    /* renamed from: a */
    public final void mo191963a(TodoFilterType todoFilterType, HashMap<TodoFilterType, Integer> hashMap, String str) {
        Intrinsics.checkParameterIsNotNull(todoFilterType, "todoFilter");
        Intrinsics.checkParameterIsNotNull(hashMap, "filterCountMap");
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scenario", str).put("todo_list_views", m219754a(hashMap)).put("current_view", todoFilterType.getValue());
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
            Log.m165389i("TodoScreenShotLog", jSONObject2);
            Sdk.log("", "user screenshot accompanying infos: " + jSONObject2);
        } catch (Throwable th) {
            Log.m165383e("TodoMainLogHelper", "ScreenShot error : " + th.getMessage());
        }
    }
}
