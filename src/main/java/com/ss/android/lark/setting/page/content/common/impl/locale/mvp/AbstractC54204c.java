package com.ss.android.lark.setting.page.content.common.impl.locale.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.setting.page.content.common.impl.locale.LanguagePickBean;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.c */
public interface AbstractC54204c {

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.c$a */
    public interface AbstractC54205a extends IModel {

        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.c$a$a */
        public interface AbstractC54206a {
            /* renamed from: a */
            void mo185533a(List<LanguagePickBean> list);

            /* renamed from: a */
            void mo185534a(boolean z);
        }

        /* renamed from: a */
        Locale mo185517a();

        /* renamed from: a */
        void mo185518a(IGetDataCallback<List<LanguagePickBean>> iGetDataCallback);

        /* renamed from: a */
        void mo185519a(LanguagePickBean languagePickBean);

        /* renamed from: a */
        void mo185520a(AbstractC54206a aVar);

        /* renamed from: a */
        void mo185521a(Locale locale);

        /* renamed from: a */
        void mo185522a(Locale locale, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo185523a(boolean z);

        /* renamed from: b */
        Locale mo185524b();

        /* renamed from: b */
        boolean mo185525b(Locale locale);

        /* renamed from: c */
        Locale mo185526c();

        /* renamed from: c */
        void mo185527c(Locale locale);

        /* renamed from: d */
        String mo185528d();

        /* renamed from: e */
        Set<String> mo185529e();

        /* renamed from: f */
        boolean mo185530f();

        /* renamed from: g */
        Locale mo185531g();

        /* renamed from: h */
        void mo185532h();
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.c$b */
    public interface AbstractC54207b extends IView<AbstractC54208a> {

        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.locale.mvp.c$b$a */
        public interface AbstractC54208a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo185535a();

            /* renamed from: a */
            void mo185536a(LanguagePickBean languagePickBean);

            /* renamed from: b */
            void mo185537b();

            /* renamed from: c */
            Set<String> mo185538c();
        }

        /* renamed from: a */
        void mo185491a();

        /* renamed from: a */
        void mo185493a(String str);

        /* renamed from: a */
        void mo185494a(List<LanguagePickBean> list);

        /* renamed from: a */
        void mo185495a(boolean z);

        /* renamed from: b */
        void mo185496b();

        /* renamed from: b */
        void mo185497b(boolean z);

        /* renamed from: c */
        void mo185499c();

        /* renamed from: d */
        boolean mo185500d();

        /* renamed from: e */
        void mo185501e();
    }
}
