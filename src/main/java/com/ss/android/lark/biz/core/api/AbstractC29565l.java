package com.ss.android.lark.biz.core.api;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.base.fragment.BaseFragment;
import java.util.List;

/* renamed from: com.ss.android.lark.biz.core.api.l */
public interface AbstractC29565l {

    /* renamed from: com.ss.android.lark.biz.core.api.l$a */
    public interface AbstractC29566a {
        /* renamed from: a */
        void mo102951a();

        /* renamed from: a */
        void mo102952a(String str);

        /* renamed from: a */
        void mo102953a(String str, String str2);

        /* renamed from: b */
        void mo102954b();

        /* renamed from: c */
        void mo102955c();

        /* renamed from: d */
        void mo102956d();

        /* renamed from: e */
        void mo102957e();

        /* renamed from: f */
        void mo102958f();

        /* renamed from: g */
        void mo102959g();

        /* renamed from: h */
        void mo102960h();

        /* renamed from: i */
        void mo102961i();
    }

    /* renamed from: com.ss.android.lark.biz.core.api.l$b */
    public interface AbstractC29567b {
        void onReady();
    }

    /* renamed from: com.ss.android.lark.biz.core.api.l$c */
    public interface AbstractC29568c {
        RecyclerView.Adapter<?> convert(View view);
    }

    /* renamed from: a */
    BaseFragment mo105769a();

    /* renamed from: a */
    AbstractC29565l mo105770a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, AbstractC29566a aVar, AbstractC29567b bVar);

    /* renamed from: a */
    void mo105771a(int i);

    /* renamed from: a */
    void mo105772a(List<RecyclerView.Adapter<?>> list);

    /* renamed from: a */
    void mo105773a(boolean z);

    /* renamed from: b */
    AbstractC29568c mo105774b();

    /* renamed from: b */
    void mo105775b(List<RecyclerView.Adapter<?>> list);

    /* renamed from: b */
    void mo105776b(boolean z);
}
