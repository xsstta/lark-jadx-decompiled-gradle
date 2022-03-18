package com.bytedance.ee.bear.list.create;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.create.h */
public class C8242h {

    /* renamed from: com.bytedance.ee.bear.list.create.h$a */
    public interface AbstractC8243a extends IModel {
        /* renamed from: a */
        ArrayList<SelectCreationMenuItem> mo32339a();

        /* renamed from: a */
        void mo32340a(boolean z);

        /* renamed from: b */
        ArrayList<SelectCreationMenuItem> mo32341b();
    }

    /* renamed from: com.bytedance.ee.bear.list.create.h$b */
    public interface AbstractC8244b extends IView<AbstractC8245a> {

        /* renamed from: com.bytedance.ee.bear.list.create.h$b$a */
        public interface AbstractC8245a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo32343a(int i);
        }

        /* renamed from: a */
        void mo32342a(ArrayList<SelectCreationMenuItem> arrayList, ArrayList<SelectCreationMenuItem> arrayList2);
    }
}
