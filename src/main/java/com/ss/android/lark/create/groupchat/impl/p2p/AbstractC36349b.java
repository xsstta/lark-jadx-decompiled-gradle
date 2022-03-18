package com.ss.android.lark.create.groupchat.impl.p2p;

import android.content.Context;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.b */
public interface AbstractC36349b {

    /* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.b$a */
    public interface AbstractC36350a extends IModel {
        /* renamed from: a */
        Set<String> mo134089a();

        /* renamed from: a */
        void mo134091a(SearchBaseInfo searchBaseInfo);

        /* renamed from: a */
        void mo134102a(String str, Chat chat, List<String> list);

        /* renamed from: a */
        void mo134092a(List<SearchBaseInfo> list);

        /* renamed from: b */
        List<String> mo134093b();

        /* renamed from: b */
        void mo134094b(SearchBaseInfo searchBaseInfo);

        /* renamed from: c */
        Map<String, SearchBaseInfo> mo134095c();

        /* renamed from: d */
        List<SearchBaseInfo> mo134096d();

        /* renamed from: e */
        Map<String, SearchBaseInfo> mo134097e();

        /* renamed from: f */
        Chat mo134103f();

        /* renamed from: g */
        String mo134104g();

        CallbackManager getCallbackManager();

        /* renamed from: h */
        boolean mo134098h();

        /* renamed from: i */
        String mo134105i();
    }

    /* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.b$b */
    public interface AbstractC36351b extends IView<AbstractC36352a> {

        /* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.b$b$a */
        public interface AbstractC36352a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo134119a();

            /* renamed from: a */
            boolean mo134120a(String str, SearchBaseInfo searchBaseInfo);

            /* renamed from: a */
            boolean mo134121a(List<String> list, List<SearchBaseInfo> list2);

            /* renamed from: b */
            void mo134122b();

            /* renamed from: b */
            boolean mo134123b(String str, SearchBaseInfo searchBaseInfo);

            /* renamed from: c */
            void mo134124c();

            /* renamed from: d */
            void mo134125d();

            /* renamed from: e */
            List<String> mo134126e();

            /* renamed from: f */
            String mo134127f();

            /* renamed from: g */
            Map<String, SearchBaseInfo> mo134128g();
        }

        /* renamed from: a */
        void mo134107a();

        /* renamed from: a */
        void mo134108a(int i);

        /* renamed from: a */
        void mo134109a(String str);

        /* renamed from: a */
        void mo134110a(List<SearchBaseInfo> list);

        /* renamed from: a */
        void mo134111a(Map<String, SearchBaseInfo> map);

        /* renamed from: a */
        void mo134112a(boolean z);

        /* renamed from: b */
        boolean mo134113b();

        /* renamed from: c */
        Department mo134114c();

        /* renamed from: d */
        int mo134115d();

        /* renamed from: e */
        void mo134116e();

        /* renamed from: f */
        String mo134117f();

        /* renamed from: g */
        Context mo134118g();
    }
}
