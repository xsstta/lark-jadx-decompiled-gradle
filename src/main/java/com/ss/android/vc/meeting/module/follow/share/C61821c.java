package com.ss.android.vc.meeting.module.follow.share;

import android.text.Editable;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.vc.entity.VcDoc;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.c */
public class C61821c {

    /* renamed from: com.ss.android.vc.meeting.module.follow.share.c$a */
    public interface AbstractC61822a extends IModel {

        /* renamed from: com.ss.android.vc.meeting.module.follow.share.c$a$a */
        public interface AbstractC61823a<T> {
            /* renamed from: a */
            void mo214145a(ErrorResult errorResult);

            /* renamed from: a */
            void mo214146a(T t);

            /* renamed from: a */
            void mo214147a(String str);

            /* renamed from: b */
            void mo214148b(T t);
        }

        /* renamed from: a */
        String mo214139a();

        /* renamed from: a */
        void mo214140a(String str, boolean z, AbstractC61823a<List<VcDoc>> aVar);

        /* renamed from: b */
        void mo214141b();

        /* renamed from: c */
        List<VcDoc> mo214142c();

        /* renamed from: d */
        int mo214143d();

        /* renamed from: e */
        boolean mo214144e();
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.share.c$b */
    public interface AbstractC61824b extends IView<AbstractC61825a> {

        /* renamed from: com.ss.android.vc.meeting.module.follow.share.c$b$a */
        public interface AbstractC61825a extends IView.IViewDelegate {
            /* renamed from: a */
            void mo214153a(Editable editable, boolean z);

            /* renamed from: a */
            boolean mo214154a();

            /* renamed from: b */
            void mo214155b();

            /* renamed from: c */
            void mo214156c();
        }

        /* renamed from: a */
        void mo214149a(ErrorResult errorResult);

        /* renamed from: a */
        void mo214150a(String str);

        /* renamed from: a */
        void mo214151a(String str, List<VcDoc> list);

        /* renamed from: a */
        void mo214152a(String str, List<VcDoc> list, boolean z);
    }
}
