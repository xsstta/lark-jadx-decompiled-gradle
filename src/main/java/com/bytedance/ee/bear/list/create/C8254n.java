package com.bytedance.ee.bear.list.create;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;

/* renamed from: com.bytedance.ee.bear.list.create.n */
public class C8254n extends AbstractC1142af {
    private C1177w<Integer> selectCreationMenuState = new C1177w<>();
    private C1177w<Integer> selectedCreationType = new C1177w<>();

    public LiveData<Integer> getSelectCreationMenuStateLiveData() {
        return this.selectCreationMenuState;
    }

    public LiveData<Integer> getSelectedCreationTypeLiveData() {
        return this.selectedCreationType;
    }

    public void setSelectCreationMenuState(Integer num) {
        this.selectCreationMenuState.mo5929b(num);
    }

    public void setSelectedCreationType(int i) {
        this.selectedCreationType.mo5929b(Integer.valueOf(i));
    }
}
