package com.bytedance.ee.bear.docshost;

import com.bytedance.ee.bear.contract.darkmode.AbstractC5126a;
import com.bytedance.ee.bear.contract.darkmode.BinderIDarkModeChangedListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.docshost.a */
public class C5581a extends AbstractC5126a {

    /* renamed from: a */
    private final Map<String, BinderIDarkModeChangedListener> f15825a = new ConcurrentHashMap();

    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
        this.f15825a.clear();
    }

    @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
    public void addDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener) {
        this.f15825a.put(binderIDarkModeChangedListener.getClass().getSimpleName(), binderIDarkModeChangedListener);
    }

    @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
    public void removeDarkModeListener(BinderIDarkModeChangedListener binderIDarkModeChangedListener) {
        this.f15825a.remove(binderIDarkModeChangedListener.getClass().getSimpleName());
    }

    @Override // com.bytedance.ee.bear.contract.darkmode.AbstractC5128c
    public void notifyDarkModeChangedListeners(int i) {
        for (Map.Entry<String, BinderIDarkModeChangedListener> entry : this.f15825a.entrySet()) {
            entry.getValue().onChanged(i);
        }
    }
}
