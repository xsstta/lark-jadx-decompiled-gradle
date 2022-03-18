package com.bytedance.ee.bear.edit.component.toolbar2;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.f */
public abstract class AbstractC7616f<T extends ToolbarV2> extends AbstractC1142af implements AbstractC6214a, AbstractC10549e {
    protected C1177w<Boolean> active;
    protected IBridge bridge;
    private AbstractC7617a delegate;
    private C1177w<ItemV2> expandedSubToolbar;
    private C1177w<Boolean> hasWindowFocus = new C1177w<>();
    private C1177w<Integer> keyboardHeightLiveData;
    private String lastShowingItemIdV2;
    private C1177w<Rect> subToolbarV2Rect;
    private C1177w<T> toolbar;

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.f$a */
    public interface AbstractC7617a {
        /* renamed from: a */
        void mo22152a();

        /* renamed from: a */
        void mo22153a(LifecycleOwner lifecycleOwner, AbstractC1178x xVar);

        /* renamed from: a */
        <V> void mo22154a(ItemIdV2 itemIdV2, V v, int i);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
    }

    public void onDetachFromHost() {
        this.delegate = null;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return false;
    }

    public C1177w<Boolean> hasWindowFocus() {
        return this.hasWindowFocus;
    }

    public void onDetachFromUI() {
        hideToolbar();
    }

    /* access modifiers changed from: protected */
    public C1177w<T> mutableToolbar() {
        return (C1177w) getToolbar();
    }

    public void requestUpdateContentHeight() {
        this.delegate.mo22152a();
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public LiveData<Boolean> getActive() {
        if (this.active == null) {
            this.active = new C1177w<>();
        }
        return this.active;
    }

    /* access modifiers changed from: protected */
    public LiveData<ItemV2> getExpandedSubToolbar() {
        if (this.expandedSubToolbar == null) {
            this.expandedSubToolbar = new C1177w<>();
        }
        return this.expandedSubToolbar;
    }

    public LiveData<T> getToolbar() {
        if (this.toolbar == null) {
            this.toolbar = new C1177w<>();
        }
        return this.toolbar;
    }

    public boolean hasExpandedSubToolbar() {
        C1177w<ItemV2> wVar = this.expandedSubToolbar;
        if (wVar == null || wVar.mo5927b() == null) {
            return false;
        }
        return true;
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

    public String getShowingItemId() {
        if (mutableToolbar().mo5927b() == null) {
            return null;
        }
        return mutableToolbar().mo5927b().getShowingItemId();
    }

    /* access modifiers changed from: protected */
    public LiveData<Rect> getSubToolbarV2Rect() {
        if (this.subToolbarV2Rect == null) {
            C1177w<Rect> wVar = new C1177w<>();
            this.subToolbarV2Rect = wVar;
            wVar.mo5929b(new Rect());
        }
        return this.subToolbarV2Rect;
    }

    public boolean hasToolbarV2() {
        if (getToolbar() == null || getToolbar().mo5927b() == null) {
            return false;
        }
        return true;
    }

    public void hideToolbar() {
        C13479a.m54764b("BaseToolbarV2PanelViewM", "dismissToolBar:" + this.toolbar);
        clearSubToolbar();
        updateToolbar(null);
    }

    public boolean clearSubToolbar() {
        if (!hasExpandedSubToolbar()) {
            return false;
        }
        ItemIdV2 id = this.expandedSubToolbar.mo5927b().id();
        updateExpandedSubToolbar(null);
        if (id.displayMode() == ItemIdV2.DisplayMode.FunctionPanel) {
            return true;
        }
        return false;
    }

    public boolean hasFunctionPanel() {
        C1177w<ItemV2> wVar = this.expandedSubToolbar;
        if (wVar == null || wVar.mo5927b() == null || this.expandedSubToolbar.mo5927b().id().displayMode() != ItemIdV2.DisplayMode.FunctionPanel) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean hasSubToolBarV2() {
        C1177w<ItemV2> wVar = this.expandedSubToolbar;
        if (wVar == null || wVar.mo5927b() == null || this.expandedSubToolbar.mo5927b().id().displayMode() != ItemIdV2.DisplayMode.SubToolBarV2) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void updateExpandedSubToolbar() {
        T b = getToolbar().mo5927b();
        if (b == null) {
            clearSubToolbar();
            return;
        }
        ItemV2[] items = b.getItems();
        C13479a.m54764b("BaseToolbarV2PanelViewM", "current showing item id: " + getExpandedSubToolbar().mo5927b());
        if (TextUtils.isEmpty(b.getShowingItemId())) {
            clearSubToolbar();
            return;
        }
        for (ItemV2 itemV2 : items) {
            if (itemV2.id().name().equals(b.getShowingItemId())) {
                C13479a.m54764b("BaseToolbarV2PanelViewM", "update show subToolbarV2 " + itemV2);
                updateExpandedSubToolbar(itemV2);
                return;
            }
        }
    }

    public void setDelegate(AbstractC7617a aVar) {
        this.delegate = aVar;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height);
    }

    public boolean isLastShowingId(String str) {
        if (str == null || !str.equals(this.lastShowingItemIdV2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onKeyboardStateChanged(int i) {
        ((C1177w) keyboardHeightLiveData()).mo5929b(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public boolean isExpanded(ItemV2 itemV2) {
        ItemV2 b = getExpandedSubToolbar().mo5927b();
        if (b == null || b.id() != itemV2.id()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void requestNotFocus(Context context) {
        C10548d.m43696a(context);
        C13479a.m54764b("BaseToolbarV2PanelViewM", "requestNotFocus");
        if (hasFunctionPanel()) {
            hideToolbar();
        }
    }

    public void setActive(boolean z) {
        C1177w wVar = (C1177w) getActive();
        if (wVar.mo5927b() == null || ((Boolean) wVar.mo5927b()).booleanValue() != z) {
            wVar.mo5929b(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: protected */
    public void updateSubToolbarV2Rect(Rect rect) {
        if (rect != null) {
            C13479a.m54772d("BaseToolbarV2PanelViewM", "updateSubToolbarV2Rect=" + rect.toString());
            if (!rect.equals(getSubToolbarV2Rect().mo5927b())) {
                this.subToolbarV2Rect.mo5929b(rect);
            }
        }
    }

    private void updateExpandedSubToolbar(ItemV2 itemV2) {
        getExpandedSubToolbar();
        ItemV2 b = this.expandedSubToolbar.mo5927b();
        C13479a.m54758a("BaseToolbarV2PanelViewM", "updateExpandedSubToolbar from " + b + " to " + itemV2);
        if (!(b == null || itemV2 == null || !TextUtils.equals(b.getId(), itemV2.getId()))) {
            C13479a.m54764b("BaseToolbarV2PanelViewM", "item no changed , ignore updateExpandedSubToolbar");
        }
        this.expandedSubToolbar.mo5929b(itemV2);
    }

    public void updateToolbar(T t) {
        boolean z;
        C13479a.m54764b("BaseToolbarV2PanelViewM", getClass().getSimpleName() + " updateToolbar:" + t);
        T b = getToolbar().mo5927b();
        updateLastShowingItemId(b, t);
        if (!ToolbarV2.equals(t, b)) {
            onUpdateToolbar(b, t);
            StringBuilder sb = new StringBuilder();
            sb.append("setActive ");
            boolean z2 = true;
            if (t != null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(" getActive ");
            sb.append(getActive().mo5927b());
            C13479a.m54764b("BaseToolbarV2PanelViewM", sb.toString());
            if (t == null) {
                z2 = false;
            }
            setActive(z2);
        } else if (b == null) {
            C13479a.m54764b("BaseToolbarV2PanelViewM", "all toolbar is null");
        }
    }

    public void onAttachToUI(FragmentActivity fragmentActivity, IBridge iVar) {
        this.bridge = iVar;
    }

    public void observeActivePanel(LifecycleOwner lifecycleOwner, AbstractC1178x xVar) {
        AbstractC7617a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo22153a(lifecycleOwner, xVar);
        } else {
            C13479a.m54758a("BaseToolbarV2PanelViewM", "observeActivePanel delegate == null");
        }
    }

    /* access modifiers changed from: protected */
    public void onUpdateToolbar(T t, T t2) {
        C13479a.m54772d("BaseToolbarV2PanelViewM", " onUpdateToolbar:" + t2);
        mutableToolbar().mo5929b(t2);
        updateExpandedSubToolbar();
    }

    public <V> void processSubToolbarItemClick(ItemIdV2 itemIdV2, V v) {
        AbstractC7617a aVar;
        C13479a.m54772d("BaseToolbarV2PanelViewM", "processSubToolbarItemClick:" + itemIdV2 + "," + ((Object) v));
        if (getToolbar().mo5927b() != null && (aVar = this.delegate) != null) {
            if (v == null) {
                v = (V) "";
            }
            aVar.mo22154a(itemIdV2, v, 2);
        }
    }

    public void processToolbarItemClick(ItemIdV2 itemIdV2, String str) {
        C13479a.m54772d("BaseToolbarV2PanelViewM", "processToolbarItemClick:" + itemIdV2 + "," + str);
        if (getToolbar().mo5927b() == null) {
            C13479a.m54764b("BaseToolbarV2PanelViewM", "Toolbar is null");
            return;
        }
        AbstractC7617a aVar = this.delegate;
        if (aVar != null) {
            if (str == null) {
                str = "";
            }
            aVar.mo22154a(itemIdV2, str, 1);
        }
    }

    private void updateLastShowingItemId(T t, T t2) {
        C13479a.m54764b("BaseToolbarV2PanelViewM", "before updateLastShowingItemId: " + this.lastShowingItemIdV2);
        if (t == null) {
            this.lastShowingItemIdV2 = null;
        } else {
            if (t2 != null) {
                C13479a.m54764b("BaseToolbarV2PanelViewM", "### new showing item =" + t2.getShowingItemId());
            } else {
                C13479a.m54764b("BaseToolbarV2PanelViewM", "### new showing item is null");
            }
            this.lastShowingItemIdV2 = t.getShowingItemId();
        }
        C13479a.m54764b("BaseToolbarV2PanelViewM", "after updateLastShowingItemId =" + this.lastShowingItemIdV2);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        onKeyboardStateChanged(i);
    }

    public void dispatchBridgeMsg(String str, Object obj, AbstractC7947h hVar) {
        this.bridge.mo19350a(str, obj, hVar);
    }
}
