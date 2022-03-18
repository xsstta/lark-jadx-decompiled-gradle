package com.ss.android.lark.contact.feat.mobile.mvp;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.e */
public class C35489e {

    /* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.e$a */
    public interface AbstractC35490a extends IModel {
        /* renamed from: a */
        LinkedHashMap<Integer, String> mo130921a();

        /* renamed from: b */
        List<ContactMobileBean> mo130922b();

        /* renamed from: c */
        void mo130923c();
    }

    /* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.e$b */
    public interface AbstractC35491b extends IView<AbstractC35492a> {

        /* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.e$b$a */
        public interface AbstractC35492a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo130925a();

            /* renamed from: a */
            void mo130926a(ContactMobileBean contactMobileBean);

            /* renamed from: a */
            void mo130927a(List<ContactMobileBean> list);
        }

        /* renamed from: a */
        void mo130902a(LinkedHashMap<Integer, String> linkedHashMap);

        /* renamed from: a */
        void mo130903a(List<ContactMobileBean> list);
    }
}
