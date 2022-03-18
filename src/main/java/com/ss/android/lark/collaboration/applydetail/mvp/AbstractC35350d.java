package com.ss.android.lark.collaboration.applydetail.mvp;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.entity.Contact;
import java.util.List;

/* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.d */
public interface AbstractC35350d {

    /* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.d$a */
    public interface AbstractC35351a extends IModel {

        /* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.d$a$a */
        public interface AbstractC35352a {
        }

        /* renamed from: a */
        void mo130083a(IGetDataCallback<List<Contact>> iGetDataCallback);

        /* renamed from: a */
        void mo130084a(AbstractC35352a aVar);
    }

    /* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.d$b */
    public interface AbstractC35353b extends IView<AbstractC35354a> {

        /* renamed from: com.ss.android.lark.collaboration.applydetail.mvp.d$b$a */
        public interface AbstractC35354a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo130080a();

        /* renamed from: a */
        void mo130082a(List<Contact> list);
    }
}
