package com.ss.android.lark.contact.impl.selected_confirm;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.entity.SelectedData;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.selected_confirm.a */
public interface AbstractC35958a {

    /* renamed from: com.ss.android.lark.contact.impl.selected_confirm.a$a */
    public interface AbstractC35959a extends IModel {
        /* renamed from: a */
        List<SelectedData> mo132301a();

        /* renamed from: a */
        List<SelectedData> mo132302a(int i);
    }

    /* renamed from: com.ss.android.lark.contact.impl.selected_confirm.a$b */
    public interface AbstractC35960b extends IView<AbstractC35961a> {

        /* renamed from: com.ss.android.lark.contact.impl.selected_confirm.a$b$a */
        public interface AbstractC35961a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo132303a();

            /* renamed from: a */
            void mo132304a(int i);
        }

        /* renamed from: a */
        void mo132299a(List<SelectedData> list);

        /* renamed from: b */
        void mo132300b(List<SelectedData> list);
    }
}
