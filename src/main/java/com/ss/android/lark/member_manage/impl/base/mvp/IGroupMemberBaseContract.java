package com.ss.android.lark.member_manage.impl.base.mvp;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public interface IGroupMemberBaseContract {

    @Retention(RetentionPolicy.SOURCE)
    public @interface SelectMember_FunctionType {
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract$a */
    public interface AbstractC45065a extends IModel {
        /* renamed from: a */
        SelectBeansResult mo159433a();

        /* renamed from: a */
        void mo159434a(Bundle bundle, IGetDataCallback<SelectMemberInitData> iGetDataCallback);

        /* renamed from: a */
        void mo159435a(IGetDataCallback<SelectBeansResult> iGetDataCallback);

        /* renamed from: a */
        void mo159436a(C45084c cVar, boolean z);

        /* renamed from: a */
        void mo159437a(String str, AbstractC45053b<List<C45084c>> bVar);

        /* renamed from: a */
        void mo159438a(String str, String str2, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo159439a(List<C45084c> list, boolean z);

        /* renamed from: b */
        List<C45084c> mo159440b();

        /* renamed from: c */
        Map<String, C45084c> mo159441c();

        /* renamed from: d */
        void mo159442d(IGetDataCallback<SelectBeansResult> iGetDataCallback);

        /* renamed from: e */
        void mo159443e();

        /* renamed from: g */
        String mo159444g();

        /* renamed from: h */
        boolean mo159445h();

        /* renamed from: i */
        boolean mo159446i();
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract$b */
    public interface AbstractC45066b<T extends AbstractC45067a> extends IView<T> {

        /* renamed from: com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract$b$a */
        public interface AbstractC45067a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo159450a();

            /* renamed from: a */
            void mo159451a(C45084c cVar);

            /* renamed from: a */
            void mo159452a(C45084c cVar, boolean z);

            /* renamed from: a */
            void mo159453a(String str);

            /* renamed from: a */
            void mo159454a(List<C45084c> list, boolean z);

            /* renamed from: b */
            void mo159455b();

            /* renamed from: c */
            void mo159456c(C45084c cVar);

            /* renamed from: c */
            boolean mo159457c();

            /* renamed from: d */
            void mo159458d(C45084c cVar);

            /* renamed from: d */
            boolean mo159459d();

            /* renamed from: e */
            void mo159460e();

            /* renamed from: f */
            void mo159461f();
        }

        /* renamed from: a */
        void mo159447a(Chat chat);

        /* renamed from: a */
        void mo159388a(Chatter chatter);

        /* renamed from: a */
        void mo159389a(Chatter chatter, String str, String str2);

        /* renamed from: a */
        void mo159392a(SelectBeansResult dVar, List<C45084c> list, Map<String, C45084c> map);

        /* renamed from: a */
        void mo159393a(String str);

        /* renamed from: a */
        void mo159395a(String str, ErrorResult errorResult);

        /* renamed from: a */
        void mo159396a(String str, List<C45084c> list);

        /* renamed from: b */
        void mo159401b(SelectBeansResult dVar);

        /* renamed from: b */
        void mo159402b(String str);

        /* renamed from: b */
        void mo159448b(List<C45084c> list);

        /* renamed from: c */
        void mo159407c(String str);

        /* renamed from: d */
        void mo159449d(SelectBeansResult dVar);

        /* renamed from: d */
        void mo159410d(String str);

        /* renamed from: f */
        void mo159412f();

        /* renamed from: g */
        void mo159413g();
    }
}
