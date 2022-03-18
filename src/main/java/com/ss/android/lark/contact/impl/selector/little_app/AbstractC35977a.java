package com.ss.android.lark.contact.impl.selector.little_app;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.selector.little_app.a */
public interface AbstractC35977a {

    /* renamed from: com.ss.android.lark.contact.impl.selector.little_app.a$a */
    public interface AbstractC35978a extends IModel {
        /* renamed from: a */
        List<String> mo132344a();

        /* renamed from: a */
        void mo132345a(SearchBaseInfo searchBaseInfo);

        /* renamed from: a */
        void mo132346a(String str, Chat chat, List<String> list);

        /* renamed from: a */
        void mo132347a(List<SearchBaseInfo> list);

        /* renamed from: b */
        List<String> mo132348b();

        /* renamed from: b */
        boolean mo132349b(SearchBaseInfo searchBaseInfo);

        /* renamed from: c */
        Map<String, SearchBaseInfo> mo132350c();

        /* renamed from: d */
        Chat mo132351d();

        /* renamed from: e */
        List<SearchBaseInfo> mo132352e();

        /* renamed from: f */
        String mo132353f();

        /* renamed from: g */
        boolean mo132354g();
    }

    /* renamed from: com.ss.android.lark.contact.impl.selector.little_app.a$b */
    public interface AbstractC35979b extends IView<AbstractC35980a> {

        /* renamed from: com.ss.android.lark.contact.impl.selector.little_app.a$b$a */
        public interface AbstractC35980a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo132355a();

            /* renamed from: a */
            boolean mo132356a(SearchBaseInfo searchBaseInfo);

            /* renamed from: b */
            void mo132357b();

            /* renamed from: b */
            boolean mo132358b(SearchBaseInfo searchBaseInfo);

            /* renamed from: c */
            void mo132359c();

            /* renamed from: c */
            boolean mo132360c(SearchBaseInfo searchBaseInfo);

            /* renamed from: d */
            void mo132361d();

            /* renamed from: e */
            List<String> mo132362e();

            /* renamed from: f */
            String mo132363f();

            /* renamed from: g */
            Map<String, SearchBaseInfo> mo132364g();

            /* renamed from: h */
            boolean mo132365h();
        }

        /* renamed from: a */
        Department mo132332a();

        /* renamed from: a */
        void mo132334a(String str);

        /* renamed from: a */
        void mo132335a(List<SearchBaseInfo> list);

        /* renamed from: a */
        void mo132336a(Map<String, SearchBaseInfo> map);

        /* renamed from: b */
        int mo132338b();

        /* renamed from: b */
        void mo132339b(List<SearchBaseInfo> list);

        /* renamed from: c */
        void mo132340c();

        /* renamed from: d */
        String mo132341d();
    }
}
