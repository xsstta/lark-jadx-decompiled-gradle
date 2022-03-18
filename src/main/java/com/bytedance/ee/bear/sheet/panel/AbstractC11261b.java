package com.bytedance.ee.bear.sheet.panel;

import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.edit.component.document.AbstractC7593a;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.sheet.panel.b */
public abstract class AbstractC11261b<T extends SheetItem> extends AbstractC7593a {
    private String[] badges;
    private AbstractC11262a mDelegate;
    private C1177w<T[]> mItems = new C1177w<>();
    private List<String> mNewSubItems = new ArrayList();
    private Map<String, C1177w<T[]>> mSubItems = new HashMap();
    private Map<String, String> mTitles = new HashMap();

    /* renamed from: com.bytedance.ee.bear.sheet.panel.b$a */
    public interface AbstractC11262a {
        /* renamed from: a */
        <V> void mo43183a(String str, V v);
    }

    public C1177w<T[]> getTopItems() {
        return this.mItems;
    }

    private void removeUnusedSubItems() {
        Iterator<String> it = this.mSubItems.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!this.mNewSubItems.contains(next)) {
                this.mSubItems.get(next).mo5929b((T[]) null);
                it.remove();
            }
        }
    }

    public void setBadges(String[] strArr) {
        this.badges = strArr;
    }

    public void setDelegate(AbstractC11262a aVar) {
        this.mDelegate = aVar;
    }

    public String getPanelTitle(String str) {
        String str2 = this.mTitles.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public C1177w<T[]> getSubItems(String str) {
        C1177w<T[]> wVar = this.mSubItems.get(str);
        if (wVar != null) {
            return wVar;
        }
        C1177w<T[]> wVar2 = new C1177w<>();
        this.mSubItems.put(str, wVar2);
        return wVar2;
    }

    public boolean showBadges(String str) {
        String[] strArr = this.badges;
        if (strArr == null || !Arrays.asList(strArr).contains(str)) {
            return false;
        }
        return true;
    }

    public void updateItems(T[] tArr) {
        this.mItems.mo5929b(tArr);
        this.mNewSubItems.clear();
        updateSubItems(tArr);
        removeUnusedSubItems();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.bytedance.ee.bear.sheet.panel.b<T extends com.bytedance.ee.bear.sheet.panel.SheetItem> */
    /* JADX WARN: Multi-variable type inference failed */
    private void updateSubItems(T[] tArr) {
        for (T t : tArr) {
            SheetItem[] items = t.getItems();
            if (items != null && items.length > 0) {
                SheetItem.sortByGroupId(items);
                this.mNewSubItems.add(t.getId());
                SheetItem[] sheetItemArr = items;
                getSubItems(t.getId()).mo5929b(sheetItemArr);
                this.mTitles.put(t.getId(), t.getTitle());
                updateSubItems(sheetItemArr);
            }
        }
    }

    public void clearBadges(String str) {
        if (showBadges(str)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("panelName", (Object) getPanelName());
            jSONObject.put("badges", (Object) new String[]{str});
            execJS("javascript:window.lark.biz.sheet.clearBadges", jSONObject);
            C13479a.m54772d("BaseCellPanelViewModel", "clear badges: " + jSONObject.toJSONString());
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
        bVar.requestUpdateWebContentHeight();
    }

    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a, com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
        setActive(false);
    }

    public <V> void clickItem(String str, V v) {
        AbstractC11262a aVar = this.mDelegate;
        if (aVar != null) {
            if (v == null) {
                v = (V) "";
            }
            aVar.mo43183a(str, v);
        }
    }
}
