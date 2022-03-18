package com.ss.android.lark.guide.landing.general.mvp;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.guide.landing.general.view.GuidePageItemView;
import java.util.List;

/* renamed from: com.ss.android.lark.guide.landing.general.mvp.c */
public class C38639c {

    /* renamed from: com.ss.android.lark.guide.landing.general.mvp.c$a */
    public interface AbstractC38640a extends IModel {
    }

    /* renamed from: com.ss.android.lark.guide.landing.general.mvp.c$b */
    public interface AbstractC38641b extends IView<AbstractC38642a> {

        /* renamed from: com.ss.android.lark.guide.landing.general.mvp.c$b$a */
        public interface AbstractC38642a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo141535a();

            /* renamed from: b */
            void mo141536b();
        }

        /* renamed from: a */
        void mo141526a(List<GuidePageItemView.C38647a> list);
    }
}
