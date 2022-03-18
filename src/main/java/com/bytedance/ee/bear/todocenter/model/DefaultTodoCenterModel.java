package com.bytedance.ee.bear.todocenter.model;

import android.util.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.todocenter.api.TodoCenterApiException;
import com.bytedance.ee.bear.todocenter.entity.AbstractC11690a;
import com.bytedance.ee.bear.todocenter.entity.TodoList;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

public class DefaultTodoCenterModel implements AbstractC11690a {

    /* renamed from: a */
    private static final C10917c f31479a = new C10917c(new C10929e());

    public static class TodoListResult extends NetService.Result<TodoList> {
    }

    public static class UpdateTodoResult extends NetService.Result<String> {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m48506a(Throwable th) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.model.DefaultTodoCenterModel$a */
    public static class C11692a implements NetService.AbstractC5074c<TodoListResult> {
        private C11692a() {
        }

        /* renamed from: a */
        public TodoListResult parse(String str) {
            return (TodoListResult) JSON.parseObject(str, TodoListResult.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m48504a(TodoListResult todoListResult) throws Exception {
        if (todoListResult.code == 0) {
            return AbstractC68307f.m265083a(todoListResult.data);
        }
        return AbstractC68307f.m265084a((Throwable) new TodoCenterApiException(todoListResult.code, todoListResult.msg));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m48505a(UpdateTodoResult updateTodoResult) throws Exception {
        if (updateTodoResult.code == 0) {
            return AbstractC68307f.m265083a((Object) true);
        }
        return AbstractC68307f.m265084a((Throwable) new TodoCenterApiException(updateTodoResult.code, updateTodoResult.msg));
    }

    @Override // com.bytedance.ee.bear.todocenter.entity.AbstractC11690a
    /* renamed from: a */
    public AbstractC68307f<Boolean> mo44792a(String str, boolean z) {
        return m48508b(str, z);
    }

    @Override // com.bytedance.ee.bear.todocenter.entity.AbstractC11690a
    /* renamed from: a */
    public AbstractC68307f<TodoList> mo44791a(int i, String str) {
        return m48507b(i, str).mo238020d(new C11694b());
    }

    /* renamed from: b */
    private AbstractC68307f<Boolean> m48508b(String str, boolean z) {
        C13479a.m54764b("TodoCenterApi", "updateTodo: " + str + " isDone " + z);
        NetService.C5076e eVar = new NetService.C5076e();
        eVar.mo20143a(1);
        eVar.mo20150b("/space/api/todo/status/update/");
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("todo_id", str);
        arrayMap.put("is_done", Boolean.valueOf(z));
        eVar.mo20153c(JSON.toJSONString(arrayMap));
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new NetService.AbstractC5074c<UpdateTodoResult>() {
            /* class com.bytedance.ee.bear.todocenter.model.DefaultTodoCenterModel.C116911 */

            /* renamed from: a */
            public UpdateTodoResult parse(String str) throws NetService.ParseException {
                return (UpdateTodoResult) JSON.parseObject(str, UpdateTodoResult.class);
            }
        }).mo20141a(eVar).mo238014c($$Lambda$DefaultTodoCenterModel$OKranPg3JclsiuNfgGu8A_fh22c.INSTANCE);
    }

    /* renamed from: b */
    private AbstractC68307f<TodoList> m48507b(int i, String str) {
        C13479a.m54764b("TodoCenterApi", "getTodoList: start request selectType: " + i + " pageToken: " + str);
        Locale d = C4484g.m18494b().mo17253d();
        String str2 = d.getLanguage() + "_" + d.getCountry();
        C13479a.m54772d("TodoCenterApi", "getTodoList: " + str2);
        NetService.C5076e eVar = new NetService.C5076e();
        eVar.mo20143a(2);
        eVar.mo20150b("/space/api/todo/list/");
        eVar.mo20145a("select_type", String.valueOf(i));
        eVar.mo20145a("locale", str2.toLowerCase());
        eVar.mo20145a("page_token", str);
        eVar.mo20145a("page_size", String.valueOf(50));
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C11692a()).mo20141a(eVar).mo238014c($$Lambda$DefaultTodoCenterModel$cbXNIHxKxKvO_AHSgKuhjaDRZDo.INSTANCE).mo237988a((Consumer<? super Throwable>) $$Lambda$DefaultTodoCenterModel$2S6Pgq5thfO32eLaDZYJX1x_LFA.INSTANCE);
    }
}
