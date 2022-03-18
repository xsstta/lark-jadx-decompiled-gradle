package com.bytedance.ee.bear.list.list;

import android.view.View;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.dto.Document;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.list.g */
public interface AbstractC8538g {

    /* renamed from: com.bytedance.ee.bear.list.list.g$a */
    public interface AbstractC8539a {
        /* renamed from: e */
        void mo33341e(View view, int i, Document document, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.list.list.g$b */
    public interface AbstractC8540b {
        /* renamed from: a */
        void mo32606a(View view, int i, Document document, boolean z);

        /* renamed from: b */
        void mo32610b(View view, int i, Document document, boolean z);

        /* renamed from: d */
        void mo33338d(View view, int i, Document document, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.list.list.g$c */
    public interface AbstractC8541c {
        /* renamed from: d */
        void mo33339d(Document document, boolean z);
    }

    /* renamed from: a */
    int mo33375a(View view);

    /* renamed from: a */
    void mo33367a(int i, Document document);

    /* renamed from: a */
    void mo33368a(AccountService.Account account);

    /* renamed from: a */
    void mo33369a(AbstractC8539a aVar);

    /* renamed from: a */
    void mo33370a(AbstractC8540b bVar);

    /* renamed from: a */
    void mo33371a(AbstractC8541c cVar);

    /* renamed from: a */
    void mo33372a(List<Document> list);

    /* renamed from: b */
    List<Document> mo33376b();

    /* renamed from: b */
    void mo33373b(int i);

    /* renamed from: b */
    void mo33377b(View view);

    /* renamed from: b */
    void mo33374b(boolean z);

    /* renamed from: c */
    int mo33378c();

    int getItemCount();

    int getItemViewType(int i);

    void notifyDataSetChanged();

    void notifyItemMoved(int i, int i2);

    void notifyItemRangeChanged(int i, int i2, Object obj);

    void notifyItemRangeInserted(int i, int i2);

    void notifyItemRangeRemoved(int i, int i2);
}
