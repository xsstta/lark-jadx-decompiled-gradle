package com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.AbstractC54376b;
import java.util.List;

/* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a */
public interface AbstractC54318a {

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$a */
    public interface AbstractC54319a<H, V, P> extends IModel {
        /* renamed from: a */
        void mo185849a(AbstractC54376b<V> bVar, IGetDataCallback<H> iGetDataCallback);

        /* renamed from: a */
        void mo185850a(H h, IGetDataCallback<P> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$b */
    public interface AbstractC54320b<H> extends IView<AbstractC54321a> {

        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$b$a */
        public interface AbstractC54321a<H> extends IView.IViewDelegate {
            /* renamed from: a */
            void mo185853a();

            /* renamed from: a */
            void mo185854a(H h);
        }

        /* renamed from: a */
        void mo185851a(H h);

        /* renamed from: a */
        void mo185852a(String str);
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$c */
    public interface AbstractC54322c<V> extends IModel {

        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$c$a */
        public interface AbstractC54323a<V> {
            void onSettingUpdated(List<AbstractC54376b<V>> list);
        }

        /* renamed from: a */
        void mo185855a(IGetDataCallback<List<AbstractC54376b<V>>> iGetDataCallback);

        /* renamed from: a */
        void mo185856a(AbstractC54323a<V> aVar);

        /* renamed from: a */
        void mo185857a(String str, IGetDataCallback<List<AbstractC54376b<V>>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$d */
    public interface AbstractC54324d<V, H> extends IView<AbstractC54325a> {

        /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$d$a */
        public interface AbstractC54325a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo185859a();

            /* renamed from: a */
            void mo185860a(String str);
        }

        /* renamed from: a */
        void mo185837a(String str);

        /* renamed from: a */
        void mo185838a(List<AbstractC54376b<H>> list);
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$e */
    public interface AbstractC54326e<V> {
        /* renamed from: a */
        void mo185861a(AbstractC54376b<V> bVar);
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.impl.translate.v2.effect.a$f */
    public interface AbstractC54327f {
        /* renamed from: a */
        void mo185862a();

        /* renamed from: b */
        String mo185863b();
    }
}
