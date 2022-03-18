package com.ss.android.lark.readstate.impl.fragment;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.readstate.impl.detail.C53123f;
import java.util.List;

/* renamed from: com.ss.android.lark.readstate.impl.fragment.b */
public class C53127b {

    /* renamed from: com.ss.android.lark.readstate.impl.fragment.b$a */
    interface AbstractC53128a extends IModel {
        /* renamed from: a */
        int mo181455a();

        /* renamed from: a */
        List<C53123f> mo181456a(List<C53123f> list);

        /* renamed from: a */
        List<C53123f> mo181457a(List<C53123f> list, String str);

        /* renamed from: a */
        void mo181458a(IGetDataCallback<List<C53123f>> iGetDataCallback);

        /* renamed from: b */
        int mo181459b();

        /* renamed from: c */
        boolean mo181460c();

        /* renamed from: d */
        boolean mo181461d();
    }

    /* renamed from: com.ss.android.lark.readstate.impl.fragment.b$b */
    interface AbstractC53129b extends IView<AbstractC53130a> {

        /* renamed from: com.ss.android.lark.readstate.impl.fragment.b$b$a */
        public interface AbstractC53130a extends IView.IViewDelegate {
            /* renamed from: a */
            boolean mo181462a();

            /* renamed from: b */
            void mo181463b();
        }

        /* renamed from: a */
        void mo181446a();

        /* renamed from: a */
        void mo181447a(ErrorResult errorResult);

        /* renamed from: a */
        void mo181449a(List<C53123f> list);

        /* renamed from: a */
        void mo181450a(boolean z, boolean z2, int i);

        /* renamed from: b */
        void mo181451b();

        /* renamed from: b */
        void mo181452b(List<C53123f> list);
    }
}
