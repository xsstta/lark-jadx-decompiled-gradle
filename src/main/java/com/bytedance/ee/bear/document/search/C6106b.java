package com.bytedance.ee.bear.document.search;

import android.content.Context;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.edit.component.document.AbstractC7593a;
import com.larksuite.suite.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.document.search.b */
public class C6106b extends AbstractC7593a {
    private Set<AbstractC6107a> closeKeyboardOnDestroyInterceptorSet = new HashSet();
    private C1177w<Integer> currentIndex;
    private AbstractC6108b delegate;
    private C1177w<Integer> total;

    /* renamed from: com.bytedance.ee.bear.document.search.b$a */
    public interface AbstractC6107a {
        boolean intercept();
    }

    /* renamed from: com.bytedance.ee.bear.document.search.b$b */
    public interface AbstractC6108b {
        /* renamed from: a */
        void mo24618a();

        /* renamed from: a */
        void mo24619a(int i);

        /* renamed from: a */
        void mo24620a(String str, boolean z);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "search";
    }

    /* access modifiers changed from: package-private */
    public void clearSearchResult() {
        AbstractC6108b bVar = this.delegate;
        if (bVar != null) {
            bVar.mo24618a();
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void onDetachFromUI() {
        super.onDetachFromUI();
        this.delegate = null;
    }

    /* access modifiers changed from: package-private */
    public C1177w<Integer> getCurrentIndex() {
        if (this.currentIndex == null) {
            this.currentIndex = new C1177w<>();
        }
        return this.currentIndex;
    }

    /* access modifiers changed from: package-private */
    public C1177w<Integer> getTotal() {
        if (this.total == null) {
            this.total = new C1177w<>();
        }
        return this.total;
    }

    public boolean shouldCloseKeyboardOnDestroy() {
        for (AbstractC6107a aVar : this.closeKeyboardOnDestroyInterceptorSet) {
            if (aVar.intercept()) {
                return false;
            }
        }
        return true;
    }

    public void setDelegate(AbstractC6108b bVar) {
        this.delegate = bVar;
    }

    public void addCloseKeyboardOnDestroyInterceptor(AbstractC6107a aVar) {
        if (aVar != null) {
            this.closeKeyboardOnDestroyInterceptorSet.add(aVar);
        }
    }

    public void removeCloseKeyboardOnDestroyInterceptor(AbstractC6107a aVar) {
        if (aVar != null) {
            this.closeKeyboardOnDestroyInterceptorSet.remove(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void switchResult(int i) {
        AbstractC6108b bVar = this.delegate;
        if (bVar != null) {
            bVar.mo24619a(i);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.searchbar_height);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void onKeyboardStateChanged(int i) {
        super.onKeyboardStateChanged(i);
        if (this.editPanelsManager != null && Boolean.TRUE.equals(getActive().mo5927b())) {
            this.editPanelsManager.requestUpdateWebContentHeight();
        }
    }

    /* access modifiers changed from: package-private */
    public void search(String str, boolean z) {
        AbstractC6108b bVar = this.delegate;
        if (bVar != null) {
            bVar.mo24620a(str, z);
        }
    }

    public void updateSearchResult(int i, int i2) {
        setActive(true);
        getCurrentIndex().mo5929b(Integer.valueOf(i));
        getTotal().mo5929b(Integer.valueOf(i2));
    }
}
