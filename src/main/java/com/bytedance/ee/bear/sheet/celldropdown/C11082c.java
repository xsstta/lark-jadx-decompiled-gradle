package com.bytedance.ee.bear.sheet.celldropdown;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.sheet.celldropdown.DropdownData;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.bear.sheet.celldropdown.c */
public class C11082c extends AbstractC1142af implements AbstractC6214a {
    private C1177w<Boolean> active;
    private C1177w<DropdownData.C11072a[]> data;
    private AbstractC11083a delegate;
    private C1177w<Boolean> isMultiple = new C1177w<>();
    private AbstractC11084b panelHeightDelegate;
    private C1177w<Boolean> showDropdown = new C1177w<>();
    private String textColor = null;

    /* renamed from: com.bytedance.ee.bear.sheet.celldropdown.c$a */
    public interface AbstractC11083a {
        /* renamed from: a */
        void mo42218a();

        /* renamed from: a */
        void mo42219a(String str);

        /* renamed from: b */
        void mo42220b();
    }

    /* renamed from: com.bytedance.ee.bear.sheet.celldropdown.c$b */
    public interface AbstractC11084b {
        int getPanelHeight();
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "dropdown";
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void requestNotFocus(Context context) {
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return false;
    }

    public C1177w<Boolean> getIsMultiple() {
        return this.isMultiple;
    }

    public C1177w<Boolean> getShowDropdown() {
        return this.showDropdown;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public void cancelDropdown() {
        AbstractC11083a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo42218a();
        }
    }

    public void switchToKeyboard() {
        AbstractC11083a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo42220b();
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public LiveData<Boolean> getActive() {
        if (this.active == null) {
            this.active = new C1177w<>();
        }
        return this.active;
    }

    public C1177w<DropdownData.C11072a[]> getData() {
        if (this.data == null) {
            this.data = new C1177w<>();
        }
        return this.data;
    }

    public void setDelegate(AbstractC11083a aVar) {
        this.delegate = aVar;
    }

    public void setPanelHeightDelegate(AbstractC11084b bVar) {
        this.panelHeightDelegate = bVar;
    }

    public void selectOption(String str) {
        AbstractC11083a aVar = this.delegate;
        if (aVar != null) {
            aVar.mo42219a(str);
        }
    }

    public void setIsMultiple(boolean z) {
        this.isMultiple.mo5929b(Boolean.valueOf(z));
    }

    public void setShowDropdown(boolean z) {
        this.showDropdown.mo5929b(Boolean.valueOf(z));
    }

    public void setTextColor(String str) {
        if (!TextUtils.equals(getTextColor(), str)) {
            this.textColor = str;
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        AbstractC11084b bVar = this.panelHeightDelegate;
        if (bVar != null) {
            return bVar.getPanelHeight();
        }
        C13479a.m54758a("DropdownViewModel", "panelHeightDelegate not set!");
        return 0;
    }

    public void setActive(Boolean bool) {
        Boolean b = getActive().mo5927b();
        if (b == null || !b.equals(bool)) {
            this.active.mo5929b(bool);
        }
    }

    public void setData(DropdownData.C11072a[] aVarArr) {
        DropdownData.C11072a[] b = getData().mo5927b();
        if (b == null || !Arrays.deepEquals(b, aVarArr)) {
            this.data.mo5929b(aVarArr);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
        bVar.requestUpdateWebContentHeight();
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
        this.active.mo5929b((Boolean) false);
    }
}
