package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44487b;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.b */
public class C44464b {

    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.b$a */
    public interface AbstractC44465a extends IModel {

        /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.b$a$a */
        public interface AbstractC44466a {
            /* renamed from: a */
            void mo157884a();

            /* renamed from: a */
            void mo157885a(List<C44487b> list);
        }

        /* renamed from: a */
        void mo157880a(AbstractC44466a aVar);

        /* renamed from: a */
        void mo157881a(C44487b bVar, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo157882a(boolean z);

        /* renamed from: a */
        boolean mo157883a();
    }

    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.b$b */
    public interface AbstractC44467b extends IView<AbstractC44468a> {

        /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.b$b$a */
        public interface AbstractC44468a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo157886a();

            /* renamed from: a */
            void mo157887a(C44487b bVar);

            /* renamed from: a */
            void mo157888a(boolean z);

            /* renamed from: b */
            void mo157889b(C44487b bVar);
        }

        /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.b$b$b */
        public interface AbstractC44469b {
            /* renamed from: a */
            void mo157890a();
        }

        /* renamed from: a */
        void mo157854a();

        /* renamed from: a */
        void mo157855a(int i);

        /* renamed from: a */
        void mo157857a(AbstractC44469b bVar);

        /* renamed from: a */
        void mo157858a(List<C44487b> list);

        /* renamed from: a */
        void mo157859a(boolean z);

        /* renamed from: b */
        void mo157860b(int i);
    }
}
