package com.bytedance.ee.bear.templates.search.custom;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.search.base.BasePresenter;
import com.bytedance.ee.bear.templates.search.base.BaseView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/custom/CustomPresenter;", "Lcom/bytedance/ee/bear/templates/search/base/BasePresenter;", "fragment", "Landroidx/fragment/app/Fragment;", "model", "Lcom/bytedance/ee/bear/templates/search/custom/CustomModel;", "view", "Lcom/bytedance/ee/bear/templates/search/base/BaseView;", "(Landroidx/fragment/app/Fragment;Lcom/bytedance/ee/bear/templates/search/custom/CustomModel;Lcom/bytedance/ee/bear/templates/search/base/BaseView;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getModel", "()Lcom/bytedance/ee/bear/templates/search/custom/CustomModel;", "getView", "()Lcom/bytedance/ee/bear/templates/search/base/BaseView;", "create", "", "observeCustom", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.c.b */
public final class CustomPresenter extends BasePresenter {

    /* renamed from: g */
    private final Fragment f31374g;

    /* renamed from: h */
    private final CustomModel f31375h;

    /* renamed from: i */
    private final BaseView f31376i;

    @Override // com.bytedance.ee.bear.templates.search.base.BasePresenter
    /* renamed from: f */
    public Fragment mo44643f() {
        return this.f31374g;
    }

    /* renamed from: i */
    public CustomModel mo44644g() {
        return this.f31375h;
    }

    /* renamed from: j */
    public BaseView mo44645h() {
        return this.f31376i;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m48362k();
    }

    /* renamed from: k */
    private final void m48362k() {
        mo44638b().getDeleteToken().mo5923a(mo44643f(), new C11652a(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "token", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.c.b$a */
    public static final class C11652a<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ CustomPresenter f31377a;

        C11652a(CustomPresenter bVar) {
            this.f31377a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            T t;
            CategoryTab e = this.f31377a.mo44645h().mo44673e();
            if (e != null) {
                for (T t2 : e.getCategoryList()) {
                    Iterator<T> it = t2.getTemplates().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (Intrinsics.areEqual(str, t.getObjToken())) {
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null) {
                        t2.getTemplates().remove(t3);
                        this.f31377a.mo44645h().mo44663a(e);
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomPresenter(Fragment fragment, CustomModel aVar, BaseView eVar) {
        super(fragment, aVar, eVar);
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(eVar, "view");
        this.f31374g = fragment;
        this.f31375h = aVar;
        this.f31376i = eVar;
    }
}
