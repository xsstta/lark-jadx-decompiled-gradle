package com.bytedance.ee.bear.list.list;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.list.dto.Document;
import com.larksuite.framework.mvp.IModel;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.list.h */
public interface AbstractC8542h extends IModel {

    /* renamed from: com.bytedance.ee.bear.list.list.h$a */
    public interface AbstractC8543a {
        /* renamed from: a */
        void mo32648a(int i, boolean z);

        /* renamed from: a */
        void mo32655a(Throwable th);

        /* renamed from: b */
        void mo33303b(Throwable th);

        /* renamed from: b */
        void mo33304b(boolean z);

        /* renamed from: r */
        void mo33316r();

        /* renamed from: s */
        boolean mo33317s();
    }

    /* renamed from: a */
    LiveData<ArrayList<Document>> mo32587a();

    /* renamed from: a */
    void mo33357a(AbstractC8543a aVar);

    /* renamed from: o */
    void mo33359o();

    /* renamed from: p */
    void mo33360p();

    /* renamed from: q */
    void mo33361q();

    /* renamed from: s */
    boolean mo33363s();
}
