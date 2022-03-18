package com.ss.android.lark.forward.impl.p1899a;

import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.impl.model.C38437b;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.impl.a.b */
public class C38413b {

    /* renamed from: com.ss.android.lark.forward.impl.a.b$a */
    public interface AbstractC38414a extends IView<AbstractC38415a> {

        /* renamed from: com.ss.android.lark.forward.impl.a.b$a$a */
        public interface AbstractC38415a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo140952a(int i);

            /* renamed from: a */
            void mo140953a(SearchBaseInfo searchBaseInfo);

            /* renamed from: a */
            void mo140954a(SearchBaseInfo searchBaseInfo, boolean z);

            /* renamed from: a */
            void mo140955a(List<ForwardTarget> list);

            /* renamed from: a */
            void mo140956a(List<SearchBaseInfo> list, String str);

            /* renamed from: b */
            boolean mo140957b(int i);
        }

        /* renamed from: a */
        void mo140941a();

        /* renamed from: a */
        void mo140942a(C38437b bVar);

        /* renamed from: a */
        void mo140943a(String str, String str2, boolean z);

        /* renamed from: a */
        void mo140944a(String str, boolean z);

        /* renamed from: a */
        void mo140945a(List<SearchBaseInfo> list);

        /* renamed from: a */
        void mo140946a(List<SearchBaseInfo> list, String str);

        /* renamed from: b */
        void mo140947b();

        /* renamed from: b */
        void mo140948b(List<SearchBaseInfo> list);

        /* renamed from: c */
        void mo140949c();

        /* renamed from: c */
        void mo140950c(List<SearchBaseInfo> list);

        /* renamed from: d */
        void mo140951d();
    }

    /* renamed from: com.ss.android.lark.forward.impl.a.b$b */
    public interface AbstractC38416b extends AbstractC38414a {
        /* renamed from: d */
        void mo140958d(List<SearchBaseInfo> list);

        /* renamed from: e */
        void mo140959e(List<SearchBaseInfo> list);

        /* renamed from: f */
        void mo140960f(List<ForwardTarget> list);
    }
}
