package com.bytedance.ee.bear.document.toolbar.selectcolor.p323b;

import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6261g;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6265i;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.b.a */
public class C6271a implements AbstractC7945d<Highlight> {

    /* renamed from: a */
    private AbstractC7947h f17395a;

    /* renamed from: b */
    private AbstractC6272a f17396b;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.b.a$a */
    public interface AbstractC6272a {
        /* renamed from: a */
        <F extends Fragment> F mo25202a(Class<F> cls, Bundle bundle);

        /* renamed from: a */
        boolean mo25203a();

        /* renamed from: a */
        boolean mo25204a(Highlight highlight);

        /* renamed from: b */
        AbstractC4941c mo25205b();

        /* renamed from: c */
        Boolean mo25206c();

        /* renamed from: d */
        FragmentManager mo25207d();
    }

    public C6271a(AbstractC6272a aVar) {
        this.f17396b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void m25166b(Highlight highlight) {
        DialogInterface$OnCancelListenerC1021b bVar;
        Fragment findFragmentByTag = this.f17396b.mo25207d().findFragmentByTag("select_color_v2");
        if (findFragmentByTag != null && !highlight.isShow()) {
            C13479a.m54764b("SelectorColorModule#HighlightHandle", "select color v2 fragment exist, and isShow = false");
            if (findFragmentByTag instanceof DialogInterface$OnCancelListenerC1021b) {
                ((DialogInterface$OnCancelListenerC1021b) findFragmentByTag).mo5513b();
            }
        } else if (findFragmentByTag != null || !highlight.isShow()) {
            C13479a.m54764b("SelectorColorModule#HighlightHandle", "select color v2 fragment=" + findFragmentByTag + " and isShow=" + highlight.isShow());
        } else {
            C13479a.m54764b("SelectorColorModule#HighlightHandle", "select color v2 fragment not exist, and isShow = true");
            Bundle bundle = new Bundle();
            Boolean c = this.f17396b.mo25206c();
            if (c == null) {
                c = Boolean.valueOf(!this.f17396b.mo25203a());
            }
            C13479a.m54764b("SelectorColorModule#HighlightHandle", "checkAndShowPanel: isAnnounceDoc=" + this.f17396b.mo25203a());
            if (c.booleanValue()) {
                bVar = (DialogInterface$OnCancelListenerC1021b) this.f17396b.mo25202a(C6261g.class, bundle);
            } else {
                bVar = (DialogInterface$OnCancelListenerC1021b) this.f17396b.mo25202a(C6262h.class, bundle);
            }
            bVar.mo5511a(this.f17396b.mo25207d(), "select_color_v2");
        }
    }

    /* renamed from: a */
    public void handle(Highlight highlight, AbstractC7947h hVar) {
        String str;
        this.f17395a = hVar;
        if (highlight == null) {
            str = "null";
        } else {
            str = highlight.toString();
        }
        C13479a.m54764b("SelectorColorModule#HighlightHandle", str);
        if (highlight == null) {
            highlight = new Highlight();
        }
        highlight.ensureItemType();
        if (this.f17396b.mo25204a(highlight)) {
            C13479a.m54764b("SelectorColorModule#HighlightHandle", "interceptHandler() true, return it");
            return;
        }
        ((C6265i) C4950k.m20476a(this.f17396b.mo25205b(), C6265i.class)).updateHighlight(highlight);
        C13742g.m55705a(new Runnable(highlight) {
            /* class com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.$$Lambda$a$LHc2Uq17o9TWYyNfoHEvsSMTvX4 */
            public final /* synthetic */ Highlight f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C6271a.this.m25166b(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo25242a(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
        if (this.f17395a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (colorItem != null) {
                    colorItem.setType(null);
                    jSONObject.put("background", (Object) colorItem);
                }
                if (colorItem2 != null) {
                    colorItem2.setType(null);
                    jSONObject.put("text", (Object) colorItem2);
                }
                if (colorItem3 != null) {
                    jSONObject.clear();
                    colorItem3.setType(null);
                    colorItem3.setValue(null);
                    jSONObject.put("clear", (Object) colorItem3);
                }
                if (colorItem4 != null) {
                    jSONObject.clear();
                    colorItem4.setType(null);
                    colorItem4.setValue(null);
                    jSONObject.put("reset", (Object) colorItem4);
                }
                C13479a.m54764b("SelectorColorModule#HighlightHandle", jSONObject.toJSONString());
                this.f17395a.mo17188a(jSONObject);
            } catch (Exception e) {
                C13479a.m54761a("SelectorColorModule#HighlightHandle", e);
            }
        } else {
            C13479a.m54758a("SelectorColorModule#HighlightHandle", "callback is null");
        }
    }
}
