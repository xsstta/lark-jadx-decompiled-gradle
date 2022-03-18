package com.bytedance.ee.bear.mindnote.toolbar;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.util.keyboard.HardKeyboardUtils;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;

/* renamed from: com.bytedance.ee.bear.mindnote.toolbar.c */
public class C10192c extends AbstractC6212e<MindNoteToolbar> {
    private boolean isShowingFunctionPanel;
    private boolean isShowingSubToolBar;

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "editor";
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public boolean shouldNotifyVCKeyboardEvent() {
        return this.isShowingFunctionPanel;
    }

    public C10192c() {
        getToolbar().mo5925a((AbstractC1178x) new AbstractC1178x() {
            /* class com.bytedance.ee.bear.mindnote.toolbar.$$Lambda$c$ftZ5YkqaqKaWckYmkibLeQoxLI */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10192c.this.lambda$new$0$c((MindNoteToolbar) obj);
            }
        });
        keyboardHeightLiveData().mo5925a(new AbstractC1178x() {
            /* class com.bytedance.ee.bear.mindnote.toolbar.$$Lambda$c$3k2ZHlJ_lSk7yCuLvu3s54eAnmo */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C10192c.this.lambda$new$1$c((Integer) obj);
            }
        });
    }

    private void updateToolbarPanelActive() {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (getToolbar().mo5927b() != null) {
            z = true;
        } else {
            z = false;
        }
        if (getKeyboardHeight() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13479a.m54764b("BaseToolbarPanelViewModel", "updateToolbarPanelActive:" + z + "," + z2);
        if (C13749l.m55763g(this.context)) {
            if (!z && !z2 && !HardKeyboardUtils.m43694a(this.context)) {
                z3 = false;
            }
            setActive(z3);
        } else if (!this.isShowingFunctionPanel) {
            if (!z || (!z2 && !HardKeyboardUtils.m43694a(this.context))) {
                z3 = false;
            }
            setActive(z3);
        }
    }

    public /* synthetic */ void lambda$new$0$c(MindNoteToolbar mindNoteToolbar) {
        updateToolbarPanelActive();
    }

    public /* synthetic */ void lambda$new$1$c(Integer num) {
        updateToolbarPanelActive();
    }

    public void setIsShowingSubToolBar(boolean z) {
        this.isShowingSubToolBar = z;
    }

    public void setShowingFunctionPanel(boolean z) {
        this.isShowingFunctionPanel = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.AbstractC6212e
    public void onKeyboardStateChanged(int i) {
        if (C13749l.m55763g(this.context) && i == 0 && this.isShowingSubToolBar) {
            return;
        }
        if (!this.isShowingFunctionPanel || i != 0) {
            super.onKeyboardStateChanged(i);
        }
    }

    public void updateToolbar(MindNoteToolbar mindNoteToolbar) {
        C13479a.m54764b("BaseToolbarPanelViewModel", "updateToolbar:" + mindNoteToolbar);
        MindNoteToolbar mindNoteToolbar2 = (MindNoteToolbar) getToolbar().mo5927b();
        if (!Toolbar.equals(mindNoteToolbar, mindNoteToolbar2)) {
            onUpdateToolbar(mindNoteToolbar2, mindNoteToolbar);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6212e
    public void processToolbarItemClick(ItemId itemId, String str) {
        super.processToolbarItemClick(itemId, str);
        if (itemId == MindNoteTxtAttrId.h1 || itemId == MindNoteTxtAttrId.h2 || itemId == MindNoteTxtAttrId.h3) {
            clearSubToolbars();
        }
    }
}
