package com.ss.android.lark.mail.impl.settings.subsetting.undo;

import androidx.lifecycle.LiveData;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.C42101o;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.a */
public interface AbstractC43618a {

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.a$a */
    public interface AbstractC43619a extends IModel {
        /* renamed from: a */
        LiveData<C42101o> mo155643a();

        /* renamed from: a */
        void mo155644a(C42101o oVar);
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.a$b */
    public interface AbstractC43620b extends IView<AbstractC43621a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.a$b$a */
        public interface AbstractC43621a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155645a(C42101o oVar);
        }
    }
}
