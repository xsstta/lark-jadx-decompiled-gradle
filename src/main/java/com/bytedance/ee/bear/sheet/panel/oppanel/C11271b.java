package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.sheet.panel.AbstractC11261b;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.b */
public class C11271b extends AbstractC11261b<SheetItem> {
    private AbstractC11272a mFabPanelDelegate;
    private AbstractC11273b mFabPanelDelegate2;
    private C1177w<Boolean> showKeyboardFab = new C1177w<>();

    /* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.b$a */
    public interface AbstractC11272a {
        void openChildFragment(Class<?> cls, Bundle bundle);
    }

    /* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.b$b */
    public interface AbstractC11273b {
        void removeFragment();
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "oppanel";
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public C1177w<Boolean> showKeyboardFab() {
        return this.showKeyboardFab;
    }

    /* access modifiers changed from: package-private */
    public void removerFabPanel() {
        AbstractC11273b bVar = this.mFabPanelDelegate2;
        if (bVar != null) {
            bVar.removeFragment();
        }
    }

    /* access modifiers changed from: package-private */
    public void setFabPanelDelegate2(AbstractC11273b bVar) {
        this.mFabPanelDelegate2 = bVar;
    }

    /* access modifiers changed from: package-private */
    public void setToolkitDelegate(AbstractC11272a aVar) {
        this.mFabPanelDelegate = aVar;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.sheet_panel_height);
    }

    /* access modifiers changed from: package-private */
    public void openChildFragment(Class<?> cls) {
        AbstractC11272a aVar = this.mFabPanelDelegate;
        if (aVar != null) {
            aVar.openChildFragment(cls, new Bundle());
        }
    }

    /* access modifiers changed from: package-private */
    public void openChildFragment(Class<?> cls, Bundle bundle) {
        AbstractC11272a aVar = this.mFabPanelDelegate;
        if (aVar != null) {
            aVar.openChildFragment(cls, bundle);
        }
    }
}
