package com.bytedance.ee.bear.sheet.toolbar2;

import android.content.Context;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.inputbar.AbstractC11188a;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.EmbedImageSegment;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetUpdateData;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.k */
public class C11359k extends AbstractC7616f<SheetBlockToolbarV2> implements AbstractC11188a {
    private C11088a analytic = new C11088a();
    private boolean isShowingInput = true;
    private int mInputHeight;
    private List<BaseSegment> mSegment;

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "sheet";
    }

    public C11088a getAnalytic() {
        return this.analytic;
    }

    public int getInputHeight() {
        return this.mInputHeight;
    }

    public void setInputHeight(int i) {
        this.mInputHeight = i;
    }

    public void setSegment(List<BaseSegment> list) {
        this.mSegment = list;
    }

    public void setShowingInput(boolean z) {
        this.isShowingInput = z;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f
    public int getPanelHeight(Context context) {
        if (!this.isShowingInput) {
            return super.getPanelHeight(context);
        }
        int panelHeight = super.getPanelHeight(context);
        int i = this.mInputHeight;
        if (i == 0) {
            i = context.getResources().getDimensionPixelSize(R.dimen.sheet_edit_inputbar_height);
        }
        return panelHeight + i;
    }

    private boolean shouldHandleEmbedImageSegment(List<BaseSegment> list) {
        if (this.mSegment == null || !list.isEmpty()) {
            return false;
        }
        for (BaseSegment baseSegment : this.mSegment) {
            if (baseSegment instanceof EmbedImageSegment) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f
    public void onKeyboardStateChanged(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.active != null && this.active.mo5927b() == Boolean.TRUE) {
                this.analytic.mo42270c();
            }
            C1177w mutableToolbar = mutableToolbar();
            SheetBlockToolbarV2 sheetBlockToolbarV2 = (SheetBlockToolbarV2) mutableToolbar.mo5927b();
            if (!(sheetBlockToolbarV2 == null || sheetBlockToolbarV2.getInput() == null)) {
                sheetBlockToolbarV2.setInput(null);
                mutableToolbar.mo5929b(sheetBlockToolbarV2);
            }
        }
        ((C1177w) keyboardHeightLiveData()).mo5929b(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public void onUpdateToolbar(SheetBlockToolbarV2 sheetBlockToolbarV2, SheetBlockToolbarV2 sheetBlockToolbarV22) {
        super.onUpdateToolbar((ToolbarV2) sheetBlockToolbarV2, (ToolbarV2) sheetBlockToolbarV22);
        if (sheetBlockToolbarV22 != null) {
            this.analytic.mo42260a(sheetBlockToolbarV22.getUrl());
        }
        if (sheetBlockToolbarV2 == null && sheetBlockToolbarV22 != null) {
            this.analytic.mo42258a();
        } else if (sheetBlockToolbarV2 != null && sheetBlockToolbarV22 == null) {
            this.analytic.mo42266b();
        }
    }

    @Override // com.bytedance.ee.bear.sheet.inputbar.AbstractC11188a
    public void updateSheetEdit(int i, List<BaseSegment> list, String str, String str2) {
        if (shouldHandleEmbedImageSegment(list)) {
            list = this.mSegment;
        } else {
            this.mSegment = null;
        }
        dispatchBridgeMsg("lark.biz.sheet.onUpdateEdit", new SheetUpdateData(i, list), null);
        SheetBlockToolbarV2 sheetBlockToolbarV2 = (SheetBlockToolbarV2) getToolbar().mo5927b();
        if (sheetBlockToolbarV2 != null && sheetBlockToolbarV2.getInput() != null) {
            sheetBlockToolbarV2.getInput().setSegments(list);
        }
    }
}
