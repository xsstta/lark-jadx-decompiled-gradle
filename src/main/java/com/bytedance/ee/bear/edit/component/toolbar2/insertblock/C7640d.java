package com.bytedance.ee.bear.edit.component.toolbar2.insertblock;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.document.model.toolbar.insertblock.InsertNewBlock;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.d */
public class C7640d extends AbstractC1142af {
    private AbstractC7641a delegate;
    private C1177w<InsertNewBlock> insertNewBlockLiveData = new C1177w<>();

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.d$a */
    public interface AbstractC7641a {
        void onItemClick(String str, String str2);
    }

    public AbstractC7641a getDelegate() {
        return this.delegate;
    }

    public LiveData<InsertNewBlock> getInsertNewBlockLiveData() {
        return this.insertNewBlockLiveData;
    }

    public void clearInsertNewBlockData() {
        if (this.insertNewBlockLiveData.mo5927b() != null) {
            this.insertNewBlockLiveData.mo5929b((InsertNewBlock) null);
        }
    }

    public void setDelegate(AbstractC7641a aVar) {
        this.delegate = aVar;
    }

    public void updateInsertNewBlock(InsertNewBlock insertNewBlock) {
        if (insertNewBlock != null) {
            this.insertNewBlockLiveData.mo5929b(insertNewBlock);
        }
    }
}
