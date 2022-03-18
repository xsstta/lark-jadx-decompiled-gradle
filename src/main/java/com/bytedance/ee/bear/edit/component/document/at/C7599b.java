package com.bytedance.ee.bear.edit.component.document.at;

import android.content.Context;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.atfinder.AbstractC4269d;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.atfinder.AtFinderJsCallbackData;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.edit.component.document.at.b */
public class C7599b extends AbstractC1142af implements AbstractC6214a, AbstractC10549e {
    protected C1177w<Boolean> active;
    private C1177w<AtFinderJsCallbackData> atFinderLiveData;
    protected IBridge bridge;
    private C6215b editPanelsManager;
    private C1177w<Integer> keyboardHeightLiveData;
    private AbstractC4269d mDataCallback;
    private AbstractC4270e mMentionDelegate;
    private C1177w<Integer> titlebarTopLiveData;

    public static String getTAG() {
        return "AtPanel";
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "editor";
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
    }

    public void onDetachFromUI() {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return false;
    }

    public String toString() {
        return "AtPanel";
    }

    public AbstractC4269d getDataCallback() {
        return this.mDataCallback;
    }

    public C6215b getEditPanelsManager() {
        return this.editPanelsManager;
    }

    public AbstractC4270e getMentionDelegate() {
        return this.mMentionDelegate;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public LiveData<Boolean> getActive() {
        if (this.active == null) {
            this.active = new C1177w<>();
        }
        return this.active;
    }

    public C1177w<AtFinderJsCallbackData> getAtFinderLiveData() {
        if (this.atFinderLiveData == null) {
            this.atFinderLiveData = new C1177w<>();
        }
        return this.atFinderLiveData;
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

    public LiveData<Integer> titleBarLocationLiveData() {
        if (this.titlebarTopLiveData == null) {
            this.titlebarTopLiveData = new C1177w<>();
        }
        return this.titlebarTopLiveData;
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

    public void setDataCallback(AbstractC4269d dVar) {
        this.mDataCallback = dVar;
    }

    public void setEditPanelsManager(C6215b bVar) {
        this.editPanelsManager = bVar;
    }

    public void setMentionDelegate(AbstractC4270e eVar) {
        this.mMentionDelegate = eVar;
    }

    public void setAtFinderLiveData(AtFinderJsCallbackData atFinderJsCallbackData) {
        getAtFinderLiveData().mo5929b(atFinderJsCallbackData);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height);
    }

    public void setTitleBarLocation(int i) {
        ((C1177w) titleBarLocationLiveData()).mo5929b(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public void onKeyboardStateChanged(int i) {
        ((C1177w) keyboardHeightLiveData()).mo5929b(Integer.valueOf(i));
        if (!isKeyboardShowing()) {
            setActive(false);
        }
    }

    public void setActive(boolean z) {
        C1177w wVar = (C1177w) getActive();
        if (wVar.mo5927b() == null || ((Boolean) wVar.mo5927b()).booleanValue() != z) {
            wVar.mo5929b(Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        onKeyboardStateChanged(i);
    }
}
