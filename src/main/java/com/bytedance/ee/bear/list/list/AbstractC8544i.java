package com.bytedance.ee.bear.list.list;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.list.common.header.DriveUploadView;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.AbstractC8544i.AbstractC8545a;
import com.larksuite.framework.mvp.IView;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.list.i */
public interface AbstractC8544i<VD extends AbstractC8545a> extends DriveUploadView.AbstractC8225a, IView<VD> {

    /* renamed from: com.bytedance.ee.bear.list.list.i$a */
    public interface AbstractC8545a extends IView.IViewDelegate {
        /* renamed from: a */
        void mo33298a(RecyclerView recyclerView, int i);

        /* renamed from: a */
        void mo32594a(Document document);

        /* renamed from: a */
        void mo32595a(Document document, int i, boolean z);

        /* renamed from: d */
        void mo33305d(Document document);

        /* renamed from: o */
        void mo33313o();

        /* renamed from: p */
        void mo33314p();
    }

    /* renamed from: B */
    boolean mo33323B();

    /* renamed from: C */
    void mo33324C();

    /* renamed from: D */
    boolean mo33325D();

    /* renamed from: a */
    void mo32744a(int i);

    /* renamed from: a */
    void mo33328a(int i, Document document);

    /* renamed from: a */
    void mo32732a(int i, boolean z);

    /* renamed from: a */
    void mo32746a(Throwable th);

    /* renamed from: b */
    void mo33333b(Throwable th);

    /* renamed from: b */
    void mo33334b(ArrayList<Document> arrayList);

    void b_(boolean z);

    /* renamed from: c */
    AbstractC68307f<List<Document>> mo33335c(int i);

    /* renamed from: c */
    void mo33336c(Throwable th);

    /* renamed from: d */
    void mo33340d(boolean z);

    /* renamed from: e */
    void mo33342e(boolean z);

    /* renamed from: o */
    void mo33343o();

    /* renamed from: w */
    List<Document> mo33351w();

    /* renamed from: y */
    void mo33353y();

    /* renamed from: z */
    void mo33354z();
}
