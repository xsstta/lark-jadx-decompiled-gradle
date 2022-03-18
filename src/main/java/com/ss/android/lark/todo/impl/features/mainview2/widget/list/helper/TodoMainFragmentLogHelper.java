package com.ss.android.lark.todo.impl.features.mainview2.widget.list.helper;

import com.alibaba.fastjson.JSON;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.bytedance.lark.sdk.Sdk;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.FilterEntity;
import com.ss.android.lark.todo.impl.features.common.screenshot.entity.FilterList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\u00020\u00042*\u0010\u0006\u001a&\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u0007j\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n`\u000bH\u0002JF\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\bj\u0002`\t2*\u0010\u0006\u001a&\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u0007j\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n`\u000b2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/widget/list/helper/TodoMainFragmentLogHelper;", "", "()V", "TAG", "", "getFilterCountStr", "filterCountMap", "Ljava/util/HashMap;", "Lcom/bytedance/lark/pb/todo/v1/TodoListView$Type;", "Lcom/ss/android/lark/todo/impl/rustadapter/TodoFilterType;", "", "Lkotlin/collections/HashMap;", "logFilterCountOnScreenShot", "", "todoFilter", "scenario", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.list.b.c */
public final class TodoMainFragmentLogHelper {

    /* renamed from: a */
    public static final TodoMainFragmentLogHelper f140769a = new TodoMainFragmentLogHelper();

    private TodoMainFragmentLogHelper() {
    }

    /* renamed from: a */
    private final String m221300a(HashMap<TodoListView.Type, Integer> hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<TodoListView.Type, Integer> entry : hashMap.entrySet()) {
            switch (C57081d.f140770a[entry.getKey().ordinal()]) {
                case 1:
                    arrayList.add(new FilterEntity("ALL", entry.getValue().intValue()));
                    break;
                case 2:
                    arrayList.add(new FilterEntity("ASSIGN_FROM_ME", entry.getValue().intValue()));
                    break;
                case 3:
                    arrayList.add(new FilterEntity("ASSIGN_TO_ME", entry.getValue().intValue()));
                    break;
                case 4:
                    arrayList.add(new FilterEntity("COMPLETED", entry.getValue().intValue()));
                    break;
                case 5:
                    arrayList.add(new FilterEntity("FOLLOWED", entry.getValue().intValue()));
                    break;
                case 6:
                    arrayList.add(new FilterEntity("FROM_DOC", entry.getValue().intValue()));
                    break;
                default:
                    arrayList.add(new FilterEntity("ALL", entry.getValue().intValue()));
                    break;
            }
        }
        String jSONString = JSON.toJSONString(new FilterList(arrayList));
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(FilterList(filters))");
        return jSONString;
    }

    /* renamed from: a */
    public final void mo193772a(TodoListView.Type type, HashMap<TodoListView.Type, Integer> hashMap, String str) {
        Intrinsics.checkParameterIsNotNull(type, "todoFilter");
        Intrinsics.checkParameterIsNotNull(hashMap, "filterCountMap");
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scenario", str).put("todo_list_views", m221300a(hashMap)).put("current_view", type.getValue());
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "jsonObject.toString()");
            Log.m165389i("TodoScreenShotLog", jSONObject2);
            Sdk.log("", "user screenshot accompanying infos: " + jSONObject2);
        } catch (Throwable th) {
            Log.m165383e("TodoMainLogHelper", "ScreenShot error : " + th.getMessage());
        }
    }
}
