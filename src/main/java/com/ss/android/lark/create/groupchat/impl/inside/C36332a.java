package com.ss.android.lark.create.groupchat.impl.inside;

import android.content.Context;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.create.groupchat.impl.inside.a */
public class C36332a {

    /* renamed from: com.ss.android.lark.create.groupchat.impl.inside.a$a */
    interface AbstractC36333a extends IModel {
        /* renamed from: a */
        List<String> mo134041a();

        /* renamed from: a */
        void mo134042a(GroupCreateInfo groupCreateInfo);

        /* renamed from: a */
        void mo134043a(SearchBaseInfo searchBaseInfo);

        /* renamed from: a */
        void mo134044a(List<SearchBaseInfo> list);

        /* renamed from: a */
        void mo134045a(boolean z);

        /* renamed from: b */
        Map<String, SearchBaseInfo> mo134046b();

        /* renamed from: b */
        void mo134047b(SearchBaseInfo searchBaseInfo);

        /* renamed from: b */
        void mo134048b(boolean z);

        /* renamed from: c */
        List<SearchBaseInfo> mo134049c();

        /* renamed from: d */
        Set<SearchBaseInfo> mo134050d();

        /* renamed from: e */
        Map<String, SearchBaseInfo> mo134051e();

        /* renamed from: f */
        boolean mo134052f();

        /* renamed from: g */
        GroupCreateInfo mo134053g();

        CallbackManager getCallbackManager();

        /* renamed from: h */
        String mo134055h();
    }

    /* renamed from: com.ss.android.lark.create.groupchat.impl.inside.a$b */
    interface AbstractC36334b extends IView<AbstractC36335a> {

        /* renamed from: com.ss.android.lark.create.groupchat.impl.inside.a$b$a */
        public interface AbstractC36335a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo134056a();

            /* renamed from: a */
            void mo134057a(Context context);

            /* renamed from: a */
            void mo134058a(String str, SearchBaseInfo searchBaseInfo);

            /* renamed from: a */
            void mo134059a(List<String> list, List<SearchBaseInfo> list2);

            /* renamed from: a */
            void mo134060a(boolean z);

            /* renamed from: b */
            List<String> mo134061b();

            /* renamed from: b */
            void mo134062b(String str, SearchBaseInfo searchBaseInfo);

            /* renamed from: c */
            String mo134063c();

            /* renamed from: d */
            Map<String, SearchBaseInfo> mo134064d();
        }

        /* renamed from: a */
        void mo134015a();

        /* renamed from: a */
        void mo134016a(GroupCreateInfo groupCreateInfo);

        /* renamed from: a */
        void mo134018a(String str);

        /* renamed from: a */
        void mo134019a(List<SearchBaseInfo> list);

        /* renamed from: a */
        void mo134020a(Map<String, SearchBaseInfo> map);

        /* renamed from: a */
        void mo134021a(boolean z);

        /* renamed from: b */
        Department mo134022b();

        /* renamed from: b */
        void mo134023b(List<SearchBaseInfo> list);

        /* renamed from: b */
        void mo134024b(boolean z);

        /* renamed from: c */
        int mo134025c();

        /* renamed from: d */
        boolean mo134027d();

        /* renamed from: e */
        void mo134028e();

        /* renamed from: f */
        C36516a<?> mo134029f();
    }
}
