package com.bytedance.ee.bear.todocenter.template;

import android.util.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.todocenter.api.TodoCenterApiException;
import com.bytedance.ee.bear.todocenter.template.entity.TodoTemplate;
import com.bytedance.ee.bear.todocenter.template.entity.TodoTemplateCategoryList;
import com.bytedance.ee.bear.todocenter.template.entity.TodoTemplateEntity;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

public class DefaultTodoTemplateModel implements AbstractC11716a {

    /* renamed from: a */
    private static final C10917c f31508a = new C10917c(new C10929e());

    public static class TodoTemplateCategoryResult extends NetService.Result<TodoTemplateCategoryList> {
    }

    public static class TodoTemplateResult extends NetService.Result<TodoTemplateEntity> {
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.template.DefaultTodoTemplateModel$a */
    public static class C11714a implements NetService.AbstractC5074c<TodoTemplateCategoryResult> {
        private C11714a() {
        }

        /* renamed from: a */
        public TodoTemplateCategoryResult parse(String str) {
            return (TodoTemplateCategoryResult) JSON.parseObject(str, TodoTemplateCategoryResult.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.template.DefaultTodoTemplateModel$b */
    public static class C11715b implements NetService.AbstractC5074c<TodoTemplateResult> {
        private C11715b() {
        }

        /* renamed from: a */
        public TodoTemplateResult parse(String str) {
            return (TodoTemplateResult) JSON.parseObject(str, TodoTemplateResult.class);
        }
    }

    @Override // com.bytedance.ee.bear.todocenter.template.AbstractC11716a
    /* renamed from: a */
    public AbstractC68307f<TodoTemplateEntity> mo44865a() {
        return m48567b().mo238014c(new Function() {
            /* class com.bytedance.ee.bear.todocenter.template.$$Lambda$DefaultTodoTemplateModel$2tXIDqI3U6hdZ5c5XmTpslruRpw */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DefaultTodoTemplateModel.this.m48564a((DefaultTodoTemplateModel) ((TodoTemplate) obj));
            }
        });
    }

    /* renamed from: b */
    private AbstractC68307f<TodoTemplate> m48567b() {
        C13479a.m54764b("TodoTemplateModel", "getTodoTemplateCategory");
        NetService.C5076e eVar = new NetService.C5076e();
        eVar.mo20143a(2);
        eVar.mo20150b("/space/api/platform/template/sys_list/");
        eVar.mo20145a("platform", "todo");
        eVar.mo20145a("obj_type", String.valueOf(2));
        eVar.mo20145a(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, String.valueOf(4));
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C11714a()).mo20141a(eVar).mo238014c($$Lambda$DefaultTodoTemplateModel$UUb0mh47t_Wje5ThWkOCQvyWsx0.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m48566a(TodoTemplateResult todoTemplateResult) throws Exception {
        if (todoTemplateResult.code == 0) {
            return AbstractC68307f.m265083a(todoTemplateResult.data);
        }
        return AbstractC68307f.m265084a((Throwable) new TodoCenterApiException(todoTemplateResult.code, todoTemplateResult.msg));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m48565a(TodoTemplateCategoryResult todoTemplateCategoryResult) throws Exception {
        if (todoTemplateCategoryResult.code == 0) {
            return AbstractC68307f.m265083a(((TodoTemplateCategoryList) todoTemplateCategoryResult.data).categories[0].templates[0]);
        }
        return AbstractC68307f.m265084a((Throwable) new TodoCenterApiException(todoTemplateCategoryResult.code, todoTemplateCategoryResult.msg));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private AbstractC68307f<TodoTemplateEntity> m48564a(TodoTemplate todoTemplate) {
        C13479a.m54764b("TodoTemplateModel", "createTodoTemplate");
        NetService.C5076e eVar = new NetService.C5076e();
        eVar.mo20143a(1);
        eVar.mo20150b("/space/api/obj_template/create_obj/");
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("parent_token", "");
        arrayMap.put(ShareHitPoint.f121869d, todoTemplate.obj_type);
        arrayMap.put("token", todoTemplate.obj_token);
        arrayMap.put("template_id", todoTemplate.id);
        eVar.mo20147a(arrayMap);
        return ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C11715b()).mo20141a(eVar).mo238014c($$Lambda$DefaultTodoTemplateModel$cATO0DnigqUJkrzmfdPuN0lVryk.INSTANCE);
    }
}
