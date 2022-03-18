package com.bytedance.ee.bear.edit.component.document;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

/* renamed from: com.bytedance.ee.bear.edit.component.document.a */
public abstract class AbstractC7593a extends AbstractC1142af implements AbstractC6214a, AbstractC10549e {
    protected C1177w<Boolean> active;
    protected C6215b editPanelsManager;
    private C1177w<Integer> keyboardHeightLiveData;
    private AbstractC4931i webService;

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return false;
    }

    public AbstractC4931i getWebService() {
        return this.webService;
    }

    /* access modifiers changed from: protected */
    public C6215b panelsViewModel() {
        return this.editPanelsManager;
    }

    public void onDetachFromUI() {
        this.webService = null;
        this.editPanelsManager = null;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public LiveData<Boolean> getActive() {
        if (this.active == null) {
            this.active = new C1177w<>();
        }
        return this.active;
    }

    /* access modifiers changed from: protected */
    public boolean isKeyboardShowing() {
        if (getKeyboardHeight() > 0) {
            return true;
        }
        return false;
    }

    public LiveData<Integer> keyboardHeightLiveData() {
        if (this.keyboardHeightLiveData == null) {
            this.keyboardHeightLiveData = new C1177w<>();
        }
        return this.keyboardHeightLiveData;
    }

    public int getKeyboardHeight() {
        Integer b = keyboardHeightLiveData().mo5927b();
        if (b == null) {
            return 0;
        }
        return b.intValue();
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void requestNotFocus(Context context) {
        C10548d.m43696a(context);
    }

    /* access modifiers changed from: protected */
    public void onKeyboardStateChanged(int i) {
        ((C1177w) keyboardHeightLiveData()).mo5929b(Integer.valueOf(i));
    }

    public void setActive(boolean z) {
        C1177w wVar = (C1177w) getActive();
        if (wVar.mo5927b() == null || ((Boolean) wVar.mo5927b()).booleanValue() != z) {
            wVar.mo5929b(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: protected */
    public void execJS(String str, JSONObject jSONObject) {
        AbstractC4931i iVar = this.webService;
        if (iVar != null) {
            iVar.mo19428a(str, jSONObject);
        } else {
            C13479a.m54759a("BaseEditPanelViewModel", "", new IllegalStateException("execJS while web null!"));
        }
    }

    public void onAttachToUI(FragmentActivity fragmentActivity, AbstractC4931i iVar) {
        this.webService = iVar;
        this.editPanelsManager = (C6215b) aj.m5366a(fragmentActivity).mo6005a(C6215b.class);
    }

    /* access modifiers changed from: protected */
    public void execJS(String str, NonProguard nonProguard) {
        AbstractC4931i iVar = this.webService;
        if (iVar != null) {
            iVar.mo19433a(str, nonProguard);
        } else {
            C13479a.m54759a("BaseEditPanelViewModel", "", new IllegalStateException("execJS while web null!"));
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        onKeyboardStateChanged(i);
    }
}
