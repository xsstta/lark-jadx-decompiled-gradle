package com.bytedance.ee.bear.document.toolbar;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.edit.component.document.AbstractC7593a;
import com.bytedance.ee.bear.util.keyboard.HardKeyboardUtils;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.bytedance.ee.bear.document.toolbar.e */
public abstract class AbstractC6212e<T extends Toolbar> extends AbstractC7593a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    protected Context context;
    private ItemId currItemId;
    private AbstractC6213a delegate;
    private C1177w<Stack<ItemId>> expandedSubToolbars;
    private C1177w<Boolean> hasWindowFocus = new C1177w<>();
    private ItemId lastItemId;
    private Map<ItemId, C1177w<Item[]>> subToolbars;
    private C1177w<T> toolbar;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.e$a */
    public interface AbstractC6213a {
        void onToolbarItemClick(ItemId itemId, String str);
    }

    public ItemId getCurrItemId() {
        return this.currItemId;
    }

    public ItemId getLastItemId() {
        return this.lastItemId;
    }

    public C1177w<Boolean> hasWindowFocus() {
        return this.hasWindowFocus;
    }

    /* access modifiers changed from: protected */
    public C1177w<T> mutableToolbar() {
        return (C1177w) getToolbar();
    }

    public LiveData<T> getToolbar() {
        if (this.toolbar == null) {
            this.toolbar = new C1177w<>();
        }
        return this.toolbar;
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void onDetachFromUI() {
        super.onDetachFromUI();
        this.delegate = null;
        this.toolbar = null;
        this.expandedSubToolbars = null;
        this.subToolbars = null;
    }

    public boolean clearSubToolbars() {
        C1177w wVar = (C1177w) getExpandedSubToolbars();
        Stack stack = (Stack) wVar.mo5927b();
        if (stack.isEmpty()) {
            return false;
        }
        stack.clear();
        wVar.mo5929b(stack);
        return true;
    }

    public LiveData<Stack<ItemId>> getExpandedSubToolbars() {
        if (this.expandedSubToolbars == null) {
            C1177w<Stack<ItemId>> wVar = new C1177w<>();
            wVar.mo5929b(new Stack<>());
            this.expandedSubToolbars = wVar;
        }
        return this.expandedSubToolbars;
    }

    public boolean hasExpandedSubToolbar() {
        Stack<ItemId> b;
        C1177w<Stack<ItemId>> wVar = this.expandedSubToolbars;
        if (wVar == null || (b = wVar.mo5927b()) == null || b.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void updateExpandedSubToolbars() {
        boolean z;
        T b = getToolbar().mo5927b();
        if (b == null) {
            C1177w<Stack<ItemId>> wVar = this.expandedSubToolbars;
            if (wVar != null) {
                wVar.mo5929b(new Stack<>());
                return;
            }
            return;
        }
        C1177w wVar2 = (C1177w) getExpandedSubToolbars();
        Stack stack = (Stack) wVar2.mo5927b();
        Item[] children = b.getChildren();
        boolean z2 = false;
        for (Item item : children) {
            ItemId id = item.id();
            if (!item.isEnable() && stack.contains(id)) {
                stack.remove(id);
                z2 = true;
            }
        }
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ItemId itemId = (ItemId) it.next();
            int length = children.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (children[i].id() == itemId) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                it.remove();
                z2 = true;
            }
        }
        if (z2) {
            wVar2.mo5929b(stack);
        }
    }

    public void configToolbar(T t) {
        updateToolbar(t);
    }

    public void setCurrItemId(ItemId itemId) {
        this.currItemId = itemId;
    }

    public void setDelegate(AbstractC6213a aVar) {
        this.delegate = aVar;
    }

    public void setLastItemId(ItemId itemId) {
        this.lastItemId = itemId;
    }

    public /* synthetic */ void lambda$onAttachToUI$0$e(AbstractC6214a aVar) {
        if (this != aVar) {
            clearSubToolbars();
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context2) {
        return context2.getResources().getDimensionPixelSize(R.dimen.toolbar_menu_height);
    }

    /* access modifiers changed from: package-private */
    public boolean isExpanded(Item item) {
        Stack<ItemId> b = getExpandedSubToolbars().mo5927b();
        if (b.isEmpty() || b.peek() != item.id()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void requestNotFocus(Context context2) {
        super.requestNotFocus(context2);
        C1177w wVar = (C1177w) getExpandedSubToolbars();
        Stack stack = (Stack) wVar.mo5927b();
        if (stack != null && !stack.isEmpty()) {
            stack.clear();
            wVar.mo5929b(stack);
        }
    }

    public LiveData<Item[]> getSubToolbar(ItemId itemId) {
        if (this.subToolbars == null) {
            this.subToolbars = new HashMap();
        }
        C1177w<Item[]> wVar = this.subToolbars.get(itemId);
        if (wVar != null) {
            return wVar;
        }
        C1177w<Item[]> wVar2 = new C1177w<>();
        this.subToolbars.put(itemId, wVar2);
        return wVar2;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void onKeyboardStateChanged(int i) {
        super.onKeyboardStateChanged(i);
        if (i == 0) {
            C13479a.m54764b("BaseToolbarPanelViewModel", "onKeyboardStateChanged(): keyboardHeight = 0");
            if ((!hasExpandedSubToolbar() || this.hasWindowFocus.mo5927b() != Boolean.FALSE) && !HardKeyboardUtils.m43694a(this.context)) {
                clearSubToolbars();
                updateToolbar(null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void updateToolbar(T t) {
        boolean z;
        C13479a.m54764b("BaseToolbarPanelViewModel", "updateToolbar:" + t);
        T b = getToolbar().mo5927b();
        if (!Toolbar.equals(t, b)) {
            onUpdateToolbar(b, t);
            if (t != null) {
                z = true;
            } else {
                z = false;
            }
            setActive(z);
        }
    }

    private void updateSubToolbars(T t) {
        if (t == null) {
            Map<ItemId, C1177w<Item[]>> map = this.subToolbars;
            if (map != null) {
                for (C1177w<Item[]> wVar : map.values()) {
                    wVar.mo5929b(new Item[0]);
                }
                return;
            }
            return;
        }
        Item[] children = t.getChildren();
        for (Item item : children) {
            updateSubToolbarValues(item.id(), item.getChildren());
        }
        Map<ItemId, C1177w<Item[]>> map2 = this.subToolbars;
        if (map2 != null) {
            for (Map.Entry<ItemId, C1177w<Item[]>> entry : map2.entrySet()) {
                ItemId key = entry.getKey();
                if (!t.contains(key)) {
                    updateSubToolbarValues(key, new Item[0]);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void updateExpandedSubToolbars(ItemId itemId) {
        boolean z;
        C1177w wVar = (C1177w) getExpandedSubToolbars();
        Stack stack = (Stack) wVar.mo5927b();
        if (stack.isEmpty() || stack.peek() != itemId) {
            z = false;
        } else {
            z = true;
        }
        while (!stack.isEmpty() && stack.contains(itemId) && stack.peek() != itemId) {
            stack.pop();
        }
        if (stack.isEmpty() || stack.peek() != itemId) {
            stack.push(itemId);
        } else if (z) {
            stack.clear();
        }
        wVar.mo5929b(stack);
    }

    private void updateSubToolbarValues(ItemId itemId, Item[] itemArr) {
        C1177w wVar = (C1177w) getSubToolbar(itemId);
        if (!Arrays.equals((Item[]) wVar.mo5927b(), itemArr)) {
            wVar.mo5929b(itemArr);
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void onAttachToUI(FragmentActivity fragmentActivity, AbstractC4931i iVar) {
        super.onAttachToUI(fragmentActivity, iVar);
        this.context = fragmentActivity.getApplicationContext();
        panelsViewModel().getActiveEditPanel().mo5923a(fragmentActivity, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.toolbar.$$Lambda$e$sgwCOmJV16l11VnXFbWjh3qTsOc */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC6212e.this.lambda$onAttachToUI$0$e((AbstractC6214a) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onUpdateToolbar(T t, T t2) {
        C13479a.m54772d("BaseToolbarPanelViewModel", "onUpdateToolbar:" + t2);
        updateSubToolbars(t2);
        mutableToolbar().mo5929b(t2);
        updateExpandedSubToolbars();
    }

    public void processToolbarItemClick(ItemId itemId, String str) {
        C13479a.m54772d("BaseToolbarPanelViewModel", "processToolbarItemClick:" + itemId + "," + str);
        T b = getToolbar().mo5927b();
        if (b != null) {
            if (b.supportSubToolbar(itemId)) {
                updateExpandedSubToolbars(itemId);
            }
            if (ItemId.BusinessId.mention.name().equals(itemId.name())) {
                clearSubToolbars();
            }
            AbstractC6213a aVar = this.delegate;
            if (aVar != null) {
                if (str == null) {
                    str = "";
                }
                aVar.onToolbarItemClick(itemId, str);
            }
        }
    }
}
