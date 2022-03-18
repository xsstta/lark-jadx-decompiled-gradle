package com.ss.android.lark.contact.impl.department;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.contact.impl.department.DepartmentStructureModel;

/* renamed from: com.ss.android.lark.contact.impl.department.c */
public class C35812c {

    /* renamed from: com.ss.android.lark.contact.impl.department.c$a */
    interface AbstractC35813a extends IModel {

        /* renamed from: com.ss.android.lark.contact.impl.department.c$a$a */
        public interface AbstractC35814a {
            /* renamed from: a */
            void mo131743a(String str);

            /* renamed from: a */
            void mo131744a(String str, String str2);
        }

        /* renamed from: a */
        void mo131711a(Context context, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo131712a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo131713a(DepartmentStructureModel.UnregisterCheckData unregisterCheckData);

        /* renamed from: a */
        void mo131714a(AbstractC35814a aVar);

        /* renamed from: b */
        void mo131715b(IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.department.c$b */
    public interface AbstractC35815b extends IView<AbstractC35816a> {

        /* renamed from: com.ss.android.lark.contact.impl.department.c$b$a */
        public interface AbstractC35816a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo131745a(Bundle bundle, String str, boolean z, boolean z2, String str2);
        }

        /* renamed from: a */
        void mo131718a();

        /* renamed from: a */
        void mo131719a(Bundle bundle);

        /* renamed from: a */
        void mo131720a(DepartmentStructureModel.UnregisterCheckData unregisterCheckData, String str);

        /* renamed from: a */
        void mo131724a(String str, String str2);

        /* renamed from: d */
        void mo131727d();
    }
}
