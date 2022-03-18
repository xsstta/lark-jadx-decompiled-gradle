package com.bytedance.ee.bear.wiki.wikitree;

import android.view.View;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.i */
public class C12117i {

    /* renamed from: a */
    private BaseTitleBar f32642a;

    /* renamed from: b */
    private BaseTitleBar f32643b;

    /* renamed from: a */
    public BaseTitleBar mo46290a() {
        return this.f32642a;
    }

    /* renamed from: b */
    public BaseTitleBar mo46295b() {
        return this.f32643b;
    }

    public C12117i(BaseTitleBar baseTitleBar) {
        this.f32642a = baseTitleBar;
    }

    /* renamed from: a */
    public void mo46292a(BaseTitleBar baseTitleBar) {
        this.f32643b = baseTitleBar;
    }

    /* renamed from: a */
    public void mo46293a(String str) {
        this.f32642a.setTitle(str);
        BaseTitleBar baseTitleBar = this.f32643b;
        if (baseTitleBar != null) {
            baseTitleBar.setTitle(str);
        }
    }

    /* renamed from: a */
    public ArrayList<View> mo46291a(BaseTitleBar.AbstractC11800a aVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(this.f32642a.mo45070a(aVar));
        BaseTitleBar baseTitleBar = this.f32643b;
        if (baseTitleBar != null) {
            arrayList.add(baseTitleBar.mo45070a(aVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo46294a(boolean z) {
        this.f32642a.setDividerVisible(z);
        BaseTitleBar baseTitleBar = this.f32643b;
        if (baseTitleBar != null) {
            baseTitleBar.setDividerVisible(z);
        }
    }
}
