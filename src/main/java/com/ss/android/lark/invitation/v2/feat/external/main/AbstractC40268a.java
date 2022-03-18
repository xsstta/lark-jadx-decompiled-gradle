package com.ss.android.lark.invitation.v2.feat.external.main;

import android.app.Activity;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.invitation.v2.feat.external.main.p2058a.AbstractC40273a;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.a */
public interface AbstractC40268a {

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.a$a */
    public interface AbstractC40269a extends IModel, AbstractC40273a {

        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.a$a$a */
        public interface AbstractC40270a {
            void updateAddMeSetting(boolean z);
        }

        /* renamed from: a */
        void mo146069a(AbstractC40270a aVar);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.a$b */
    public interface AbstractC40271b extends IView<AbstractC40272a> {

        /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.a$b$a */
        public interface AbstractC40272a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo146076a();

            /* renamed from: b */
            void mo146077b();

            /* renamed from: c */
            void mo146078c();

            /* renamed from: d */
            void mo146079d();
        }

        /* renamed from: a */
        Activity mo146070a();

        /* renamed from: a */
        void mo146071a(C40219a aVar);

        /* renamed from: a */
        void mo146072a(String str);

        /* renamed from: a */
        void mo146073a(boolean z);

        /* renamed from: b */
        void mo146074b();

        /* renamed from: c */
        void mo146075c();
    }
}
