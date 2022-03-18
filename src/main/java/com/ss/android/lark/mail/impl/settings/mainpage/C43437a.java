package com.ss.android.lark.mail.impl.settings.mainpage;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.settings.component.p2220a.AbstractC43400b;
import com.ss.android.lark.mail.impl.settings.component.p2221b.AbstractC43405a;
import com.ss.android.lark.mail.impl.settings.component.settingitem.ISettingItemModel;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.a */
public class C43437a {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.a$a */
    public interface AbstractC43438a extends AbstractC43400b, AbstractC43405a, ISettingItemModel {

        /* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.a$a$a */
        public interface AbstractC43439a {
            /* renamed from: a */
            LifecycleOwner mo155251a();
        }

        /* renamed from: a */
        void mo155247a(AbstractC43439a aVar);

        /* renamed from: e */
        C1177w<Integer> mo155248e();

        /* renamed from: f */
        C1177w<List<C42087a>> mo155249f();

        /* renamed from: g */
        void mo155250g();
    }

    /* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.a$b */
    interface AbstractC43440b extends IView<AbstractC43441a> {

        /* renamed from: com.ss.android.lark.mail.impl.settings.mainpage.a$b$a */
        public interface AbstractC43441a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo155252a();
        }
    }
}
