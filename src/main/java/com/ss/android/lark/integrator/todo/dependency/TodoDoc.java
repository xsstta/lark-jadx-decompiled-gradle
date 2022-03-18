package com.ss.android.lark.integrator.todo.dependency;

import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.todo.dependency.p2789a.AbstractC56254i;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/integrator/todo/dependency/TodoDoc;", "Lcom/ss/android/lark/todo/dependency/idependency/IDocDependency;", "()V", "ccmApi", "Lcom/ss/android/lark/ccm_api/ICCMApi;", "kotlin.jvm.PlatformType", "canOpenDocs", "", "url", "", "getDocInlineBlueIcon", "", "docType", "Lcom/ss/android/lark/doc/entity/DocType;", "getDocInlineGrayIcon", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.todo.a.i */
public final class TodoDoc implements AbstractC56254i {

    /* renamed from: a */
    private final ICCMApi f101797a = ((ICCMApi) ApiUtils.getApi(ICCMApi.class));

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56254i
    /* renamed from: a */
    public int mo145383a(DocType docType) {
        return this.f101797a.getDocInlineBlueIcon(docType);
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56254i
    /* renamed from: b */
    public int mo145385b(DocType docType) {
        return this.f101797a.getDocInlineGrayIcon(docType);
    }

    @Override // com.ss.android.lark.todo.dependency.p2789a.AbstractC56254i
    /* renamed from: a */
    public boolean mo145384a(String str) {
        return this.f101797a.canOpen(str);
    }
}
