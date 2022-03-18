package com.ss.android.lark.setting.page.content.common.impl.translate.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.setting.page.content.common.dto.LanguageInfo;
import com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.e */
public interface AbstractC54282e {

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.e$a */
    public interface AbstractC54283a extends IModel {

        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.e$a$a */
        public interface AbstractC54284a {
            /* renamed from: a */
            void mo185773a(MineTranslateLanguageSetting mineTranslateLanguageSetting);

            /* renamed from: a */
            void mo185774a(boolean z);
        }

        /* renamed from: a */
        MineTranslateLanguageSetting mo185798a();

        /* renamed from: a */
        void mo185799a(int i, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo185800a(int i, Set<String> set);

        /* renamed from: a */
        void mo185801a(int i, Set<String> set, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo185802a(IGetDataCallback<MineTranslateLanguageSetting> iGetDataCallback);

        /* renamed from: a */
        void mo185803a(AbstractC54284a aVar);

        /* renamed from: a */
        void mo185804a(String str, int i, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo185805a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo185806a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo185807a(Set<String> set);

        /* renamed from: a */
        void mo185808a(boolean z, IGetDataCallback<MineTranslateLanguageSetting> iGetDataCallback);

        /* renamed from: b */
        void mo185809b(boolean z, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.e$b */
    public interface AbstractC54285b extends IView<AbstractC54286a> {

        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.mvp.e$b$a */
        public interface AbstractC54286a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo185792a(int i);

            /* renamed from: a */
            void mo185793a(int i, Set<String> set);

            /* renamed from: a */
            void mo185794a(String str);

            /* renamed from: a */
            void mo185775a(List<String> list);

            /* renamed from: a */
            void mo185776a(Set<String> set);

            /* renamed from: a */
            void mo185795a(boolean z);

            /* renamed from: b */
            void mo185796b(int i);

            /* renamed from: b */
            void mo185797b(int i, Set<String> set);
        }

        /* renamed from: a */
        void mo185763a();

        /* renamed from: a */
        void mo185767a(int i);

        /* renamed from: a */
        void mo185766a(int i, List<LanguageInfo> list);

        /* renamed from: a */
        void mo185778a(MineTranslateLanguageSetting mineTranslateLanguageSetting);

        /* renamed from: a */
        void mo185768a(String str);

        /* renamed from: a */
        void mo185764a(List<LanguageInfo> list);

        /* renamed from: a */
        void mo185765a(boolean z);

        /* renamed from: b */
        void mo185780b();

        /* renamed from: b */
        void mo185781b(int i);

        /* renamed from: b */
        void mo185782b(List<LanguageInfo> list);

        /* renamed from: b */
        void mo185783b(boolean z);

        /* renamed from: c */
        void mo185784c();

        /* renamed from: c */
        void mo185785c(int i);

        /* renamed from: c */
        void mo185769c(boolean z);

        /* renamed from: d */
        void mo185786d();

        /* renamed from: e */
        void mo185787e();

        /* renamed from: f */
        void mo185788f();
    }
}
