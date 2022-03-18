package com.bytedance.ee.bear.document.menu;

import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.List;

public class MenuData implements BaseJSModel {
    private List<MenuItem> items;

    public MenuData() {
    }

    public List<MenuItem> getItems() {
        return this.items;
    }

    public String toString() {
        return "NavigationMenu{items=" + this.items + '}';
    }

    public void setItems(List<MenuItem> list) {
        this.items = list;
    }

    public MenuData(List<MenuItem> list) {
        this.items = list;
    }
}
