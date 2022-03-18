package com.ss.android.lark.oncall.ui;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.oncall.entity.OnCall;
import com.ss.android.lark.oncall.entity.OnCallTag;
import java.util.List;

/* renamed from: com.ss.android.lark.oncall.ui.a */
public interface AbstractC48732a {

    /* renamed from: com.ss.android.lark.oncall.ui.a$a */
    public interface AbstractC48733a extends IModel {

        /* renamed from: com.ss.android.lark.oncall.ui.a$a$a */
        public interface AbstractC48734a {
            /* renamed from: a */
            void mo170004a();

            /* renamed from: a */
            void mo170005a(List<OnCall> list, int i, boolean z);
        }

        /* renamed from: a */
        void mo169996a();

        /* renamed from: a */
        void mo169997a(IGetDataCallback<List<OnCallTag>> iGetDataCallback);

        /* renamed from: a */
        void mo169998a(AbstractC48734a aVar);

        /* renamed from: a */
        void mo169999a(String str);

        /* renamed from: a */
        void mo170000a(String str, String str2, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo170001b();

        /* renamed from: b */
        void mo170002b(String str);

        /* renamed from: c */
        boolean mo170003c();
    }

    /* renamed from: com.ss.android.lark.oncall.ui.a$b */
    public interface AbstractC48735b extends IView<AbstractC48736a> {

        /* renamed from: com.ss.android.lark.oncall.ui.a$b$a */
        public interface AbstractC48736a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo170006a(String str);

            /* renamed from: a */
            boolean mo170007a();

            /* renamed from: b */
            void mo170008b();

            /* renamed from: b */
            void mo170009b(String str);

            /* renamed from: c */
            void mo170010c();

            /* renamed from: c */
            void mo170011c(String str);
        }

        /* renamed from: a */
        void mo169981a(String str);

        /* renamed from: a */
        void mo169982a(List<OnCallTag> list);

        /* renamed from: a */
        void mo169983a(List<OnCall> list, int i, boolean z);

        /* renamed from: b */
        void mo169985b(String str);
    }
}
