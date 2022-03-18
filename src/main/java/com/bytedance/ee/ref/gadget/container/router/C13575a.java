package com.bytedance.ee.ref.gadget.container.router;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ee.ref.gadget.container.p696a.C13572a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.ref.gadget.container.router.a */
public class C13575a extends LinearLayout {

    /* renamed from: a */
    private C13572a f35698a;

    /* renamed from: b */
    private int f35699b;

    /* renamed from: c */
    private Map<Integer, View> f35700c;

    public C13572a getTabLayout() {
        return this.f35698a;
    }

    /* renamed from: a */
    public void mo50378a() {
        this.f35698a.setTabChangeListener(null);
    }

    public View getCurrentView() {
        return this.f35700c.get(Integer.valueOf(this.f35699b));
    }

    public List<View> getPageList() {
        return new ArrayList(this.f35700c.values());
    }
}
