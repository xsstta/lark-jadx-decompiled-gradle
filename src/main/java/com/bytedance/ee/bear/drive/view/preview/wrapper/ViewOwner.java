package com.bytedance.ee.bear.drive.view.preview.wrapper;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.util.io.NonProguard;

public class ViewOwner implements NonProguard {
    private LifecycleOwner lifecycleOwner;
    private C1144ai provider;
    private ViewModelStoreOwner storeOwner;

    public LifecycleOwner lifecycleOwner() {
        return this.lifecycleOwner;
    }

    public ViewModelStoreOwner storeOwner() {
        return this.storeOwner;
    }

    public <T extends AbstractC1142af> T viewModel(Class<T> cls) {
        return (T) this.provider.mo6005a(cls);
    }

    public ViewOwner(ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner2) {
        this.storeOwner = viewModelStoreOwner;
        this.lifecycleOwner = lifecycleOwner2;
        this.provider = new C1144ai(viewModelStoreOwner);
    }
}
