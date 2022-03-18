package com.ss.android.lark.search.impl.func.pick.chatterpick.mvp;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.search.impl.func.pick.viewdata.PickChatterViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.a */
public interface AbstractC53672a {

    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.a$a */
    public interface AbstractC53673a extends IModel {
        /* renamed from: a */
        List<PickChatterViewData> mo183017a();

        /* renamed from: a */
        void mo183018a(PickChatterViewData pickChatterViewData, boolean z);

        /* renamed from: b */
        List<String> mo183019b();
    }

    /* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.a$b */
    public interface AbstractC53674b extends IView<AbstractC53675a> {

        /* renamed from: com.ss.android.lark.search.impl.func.pick.chatterpick.mvp.a$b$a */
        public interface AbstractC53675a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo183020a(int i);

            /* renamed from: a */
            void mo183021a(PickChatterViewData pickChatterViewData, boolean z);
        }

        /* renamed from: a */
        void mo183008a();

        /* renamed from: a */
        void mo183010a(List<PickChatterViewData> list);

        /* renamed from: a */
        void mo183011a(boolean z);

        /* renamed from: b */
        void mo183012b(List<PickChatterViewData> list);

        /* renamed from: b */
        void mo183013b(boolean z);

        /* renamed from: b */
        boolean mo183014b();

        /* renamed from: c */
        void mo183015c(List<SearchChatterInfo> list);

        /* renamed from: c */
        boolean mo183016c();
    }
}
