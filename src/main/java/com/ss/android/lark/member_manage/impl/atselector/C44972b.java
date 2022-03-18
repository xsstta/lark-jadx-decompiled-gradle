package com.ss.android.lark.member_manage.impl.atselector;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.member_manage.dto.C44895d;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.b */
public class C44972b {

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.b$a */
    public interface AbstractC44973a extends IModel {

        /* renamed from: com.ss.android.lark.member_manage.impl.atselector.b$a$a */
        public interface AbstractC44974a {
            /* renamed from: a */
            void mo159100a(List<BaseAtBean> list, boolean z);
        }

        /* renamed from: a */
        Map<String, BaseAtBean> mo159119a();

        /* renamed from: a */
        Map<String, BaseAtBean> mo159120a(BaseAtBean baseAtBean);

        /* renamed from: a */
        void mo159121a(IGetDataCallback<List<BaseAtBean>> iGetDataCallback);

        /* renamed from: a */
        void mo159122a(AbstractC44974a aVar);

        /* renamed from: a */
        void mo159123a(String str, String str2, IGetDataCallback<C44895d> iGetDataCallback);

        /* renamed from: a */
        void mo159124a(String str, List<BaseAtBean> list);

        /* renamed from: b */
        Map<String, ChatChatter> mo159125b();

        /* renamed from: b */
        Map<String, BaseAtBean> mo159126b(BaseAtBean baseAtBean);

        /* renamed from: b */
        void mo159127b(String str, String str2, IGetDataCallback<C44895d> iGetDataCallback);

        /* renamed from: c */
        List<BaseAtBean> mo159128c();

        /* renamed from: d */
        List<BaseAtBean> mo159129d();

        /* renamed from: e */
        List<BaseAtBean> mo159130e();

        /* renamed from: f */
        List<BaseAtBean> mo159131f();

        /* renamed from: g */
        void mo159132g();

        /* renamed from: h */
        String mo159133h();

        /* renamed from: i */
        boolean mo159134i();

        /* renamed from: j */
        Chat mo159135j();
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.atselector.b$b */
    public interface AbstractC44975b extends IView<AbstractC44976a> {

        /* renamed from: com.ss.android.lark.member_manage.impl.atselector.b$b$a */
        public interface AbstractC44976a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo159101a();

            /* renamed from: a */
            void mo159102a(int i);

            /* renamed from: a */
            void mo159103a(BaseAtBean baseAtBean);

            /* renamed from: a */
            void mo159104a(String str);

            /* renamed from: b */
            void mo159105b();

            /* renamed from: b */
            void mo159106b(BaseAtBean baseAtBean);

            /* renamed from: c */
            void mo159107c(BaseAtBean baseAtBean);

            /* renamed from: c */
            boolean mo159108c();

            /* renamed from: d */
            void mo159109d();

            /* renamed from: d */
            void mo159110d(BaseAtBean baseAtBean);

            /* renamed from: e */
            void mo159111e();

            /* renamed from: f */
            void mo159112f();
        }

        /* renamed from: a */
        int mo159136a();

        /* renamed from: a */
        void mo159137a(String str);

        /* renamed from: a */
        void mo159138a(String str, List<BaseAtBean> list);

        /* renamed from: a */
        void mo159139a(List<BaseAtBean> list);

        /* renamed from: a */
        void mo159140a(Map<String, BaseAtBean> map);

        /* renamed from: a */
        void mo159141a(Map<String, BaseAtBean> map, boolean z);

        /* renamed from: b */
        void mo159142b(String str);

        /* renamed from: b */
        void mo159143b(String str, List<ChatChatter> list);

        /* renamed from: b */
        void mo159144b(List<BaseAtBean> list);

        /* renamed from: c */
        void mo159145c(List<BaseAtBean> list);
    }
}
