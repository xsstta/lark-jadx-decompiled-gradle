package com.bytedance.ee.bear.templates.center.list.base;

import com.bytedance.ee.bear.list.loadstateview.EmptyCategory;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.Tab2;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.templates.center.list.a.f */
public interface IBaseTemplateListView extends IView<IViewDelegate> {

    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.f$b */
    public interface IViewDelegate extends IView.IViewDelegate {
        /* renamed from: a */
        void mo44148a(TemplateV4 templateV4);

        /* renamed from: a */
        void mo44151a(CategoryTab categoryTab);

        /* renamed from: b */
        void mo44154b(TemplateV4 templateV4);

        /* renamed from: e */
        void mo44157e();

        /* renamed from: f */
        void mo44158f();

        /* renamed from: h */
        void mo44160h();
    }

    /* renamed from: a */
    void mo44179a(CategoryTab categoryTab);

    /* renamed from: a */
    void mo44180a(TemplateGroupTab templateGroupTab);

    /* renamed from: a */
    void mo44182a(Throwable th);

    /* renamed from: a */
    void mo44183a(ArrayList<CategoryTab> arrayList, int i, int i2);

    /* renamed from: a */
    void mo44184a(boolean z);

    /* renamed from: b */
    void mo44186b(int i);

    /* renamed from: b */
    void mo44187b(TemplateGroupTab templateGroupTab);

    /* renamed from: h */
    CategoryTab mo44193h();

    /* renamed from: i */
    void mo44194i();

    /* renamed from: j */
    void mo44195j();

    /* renamed from: k */
    void mo44196k();

    /* renamed from: o */
    EmptyCategory mo44204o();

    /* renamed from: p */
    int mo44205p();

    /* renamed from: q */
    boolean mo44206q();

    /* renamed from: r */
    Tab2 mo44207r();

    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.f$a */
    public static final class C11503a {
        /* renamed from: a */
        public static /* synthetic */ void m47849a(IBaseTemplateListView fVar, ArrayList arrayList, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    i = 0;
                }
                if ((i3 & 4) != 0) {
                    i2 = 0;
                }
                fVar.mo44183a(arrayList, i, i2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTemplateGroup");
        }
    }
}
