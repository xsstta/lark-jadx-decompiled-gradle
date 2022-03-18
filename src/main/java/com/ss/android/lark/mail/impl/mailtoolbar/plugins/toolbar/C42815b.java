package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import android.content.Context;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.subpanel.MailTxtAttrId;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import java.util.Stack;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.b */
public class C42815b extends AbstractC6212e<MailToolbar> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean hasToolbar;
    private AbstractC42825f mToolbarCallback;
    private int toolbarPos;

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "editor";
    }

    public String toString() {
        return "MailToolbar";
    }

    public boolean needFetchToolbarPos() {
        if (this.toolbarPos < 1) {
            return true;
        }
        return false;
    }

    public void hideToolbar() {
        onKeyboardStateChanged(0);
        if (hasWindowFocus().mo5927b() == Boolean.FALSE) {
            clearSubToolbars();
            updateToolbar((MailToolbar) null);
        }
    }

    public void clearAttrSubToolbars() {
        ItemId itemId;
        C1177w wVar = (C1177w) getExpandedSubToolbars();
        Stack stack = (Stack) wVar.mo5927b();
        int size = stack.size();
        if (size > 0 && (itemId = (ItemId) stack.get(size - 1)) != null && MailItemId.attribution.name().equals(itemId.name())) {
            stack.clear();
            wVar.mo5929b(stack);
        }
    }

    public void setToolbarCallback(AbstractC42825f fVar) {
        this.mToolbarCallback = fVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.AbstractC6212e
    public void onKeyboardStateChanged(int i) {
        super.onKeyboardStateChanged(i);
        AbstractC42825f fVar = this.mToolbarCallback;
        if (fVar != null) {
            fVar.mo150666a(i);
        }
    }

    public void onShowKeyboardPanel(Context context) {
        processToolbarItemClick(ItemId.ConstId.keyboard, "false");
        clearSubToolbars();
        C10548d.m43702b(context);
    }

    /* access modifiers changed from: protected */
    public void updateToolbar(MailToolbar mailToolbar) {
        boolean z;
        if (mailToolbar != null) {
            z = true;
        } else {
            z = false;
        }
        this.hasToolbar = z;
        super.updateToolbar((Toolbar) mailToolbar);
    }

    public void onFontChange(MailTxtAttrId mailTxtAttrId) {
        if (this.mToolbarCallback != null) {
            C42330c.m169051a("fontsize", String.valueOf(mailTxtAttrId.getFontSize()));
            this.mToolbarCallback.mo150667a(mailTxtAttrId.name());
        }
    }

    public void updateToolbarPos(int i) {
        C13479a.m54764b("MailToolbarViewModel", "updateToolbarPos:" + i);
        this.toolbarPos = i;
        this.mToolbarCallback.mo150668b(i);
    }

    private Item findItemById(ItemId itemId) {
        Item[] b = getSubToolbar(MailItemId.attribution).mo5927b();
        if (b == null) {
            return null;
        }
        for (Item item : b) {
            if (item.id() == itemId) {
                return item;
            }
        }
        return null;
    }

    private void selectSpecifiedItem(MailToolbar mailToolbar) {
        Item[] children = mailToolbar.getChildren();
        for (Item item : children) {
            if (item.isSelected()) {
                C13479a.m54764b("MailToolbarViewModel", "selectSpecifiedItem(): " + item);
                updateExpandedSubToolbars(item.id());
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onUpdateToolbar(MailToolbar mailToolbar, MailToolbar mailToolbar2) {
        super.onUpdateToolbar((Toolbar) mailToolbar, (Toolbar) mailToolbar2);
        if (mailToolbar2 != null) {
            selectSpecifiedItem(mailToolbar2);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6212e
    public void processToolbarItemClick(ItemId itemId, String str) {
        super.processToolbarItemClick(itemId, str);
        Item findItemById = findItemById(itemId);
        if (findItemById != null && "true".equals(str) && findItemById.isEnable() && !findItemById.isSelected()) {
            C42187a.m168530f(itemId.name());
            if (itemId instanceof MailTxtAttrId) {
                MailTxtAttrId mailTxtAttrId = (MailTxtAttrId) itemId;
                if (mailTxtAttrId.isFontOrSize()) {
                    if (mailTxtAttrId.getFontSize() > 0) {
                        C42330c.m169051a("fontsize", String.valueOf(mailTxtAttrId.getFontSize()));
                        return;
                    } else {
                        C42330c.m169051a("fontfamily", mailTxtAttrId.getFontName());
                        return;
                    }
                }
            }
            C42330c.m169079f(itemId.name());
        }
    }
}
