package com.chad.library.adapter.base.entity;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.chad.library.adapter.base.entity.a */
public abstract class AbstractC20928a<T> implements AbstractC20929b<T> {
    protected boolean mExpandable;
    protected List<T> mSubItems;

    @Override // com.chad.library.adapter.base.entity.AbstractC20929b
    public List<T> getSubItems() {
        return this.mSubItems;
    }

    @Override // com.chad.library.adapter.base.entity.AbstractC20929b
    public boolean isExpanded() {
        return this.mExpandable;
    }

    public boolean hasSubItem() {
        List<T> list = this.mSubItems;
        if (list == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.chad.library.adapter.base.entity.AbstractC20929b
    public void setExpanded(boolean z) {
        this.mExpandable = z;
    }

    public void setSubItems(List<T> list) {
        this.mSubItems = list;
    }

    public boolean contains(T t) {
        List<T> list = this.mSubItems;
        if (list == null || !list.contains(t)) {
            return false;
        }
        return true;
    }

    public int getSubItemPosition(T t) {
        List<T> list = this.mSubItems;
        if (list != null) {
            return list.indexOf(t);
        }
        return -1;
    }

    public boolean removeSubItem(T t) {
        List<T> list = this.mSubItems;
        if (list == null || !list.remove(t)) {
            return false;
        }
        return true;
    }

    public T getSubItem(int i) {
        if (!hasSubItem() || i >= this.mSubItems.size()) {
            return null;
        }
        return this.mSubItems.get(i);
    }

    public boolean removeSubItem(int i) {
        List<T> list = this.mSubItems;
        if (list == null || i < 0 || i >= list.size()) {
            return false;
        }
        this.mSubItems.remove(i);
        return true;
    }

    public void addSubItem(T t) {
        if (this.mSubItems == null) {
            this.mSubItems = new ArrayList();
        }
        this.mSubItems.add(t);
    }

    public void addSubItem(int i, T t) {
        List<T> list = this.mSubItems;
        if (list == null || i < 0 || i >= list.size()) {
            addSubItem(t);
        } else {
            this.mSubItems.add(i, t);
        }
    }
}
