package com.bytedance.ee.bear.document.toolbar.selectcolor;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6265i;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import java.util.Map;

public class SelectColorV2Plugin extends DocumentPluginV2 {
    private C6271a highlightHandle;
    private C6273c selectorModule;
    public AbstractC6243a showHighlightDelegate;
    public Boolean toolbarV2Mode;

    /* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.SelectColorV2Plugin$a */
    public interface AbstractC6243a {
        /* renamed from: a */
        void mo21365a(Highlight highlight);
    }

    public SelectColorV2Plugin() {
        init();
    }

    private void init() {
        this.selectorModule = new C6273c(new AbstractC6270b() {
            /* class com.bytedance.ee.bear.document.toolbar.selectcolor.SelectColorV2Plugin.C62411 */
        });
        this.highlightHandle = new C6271a(new C6271a.AbstractC6272a() {
            /* class com.bytedance.ee.bear.document.toolbar.selectcolor.SelectColorV2Plugin.C62422 */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: a */
            public boolean mo25203a() {
                return false;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: b */
            public AbstractC4941c mo25205b() {
                return SelectColorV2Plugin.this;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: c */
            public Boolean mo25206c() {
                return SelectColorV2Plugin.this.toolbarV2Mode;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: d */
            public FragmentManager mo25207d() {
                return SelectColorV2Plugin.this.getHost().mo19564f().getSupportFragmentManager();
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: a */
            public boolean mo25204a(Highlight highlight) {
                if (SelectColorV2Plugin.this.showHighlightDelegate == null) {
                    return false;
                }
                SelectColorV2Plugin.this.showHighlightDelegate.mo21365a(highlight);
                return true;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: a */
            public <F extends Fragment> F mo25202a(Class<F> cls, Bundle bundle) {
                return (F) SelectColorV2Plugin.this.instantiateFragment(cls, bundle);
            }
        });
    }

    public void setShowHighlightDelegate(AbstractC6243a aVar) {
        this.showHighlightDelegate = aVar;
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.navigation.setHighlightPanel", this.highlightHandle);
    }

    public SelectColorV2Plugin(Boolean bool) {
        this.toolbarV2Mode = bool;
        init();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        C6271a aVar = this.highlightHandle;
        aVar.getClass();
        ((C6265i) C4950k.m20476a(this, C6265i.class)).setDelegate(new C6265i.AbstractC6266a() {
            /* class com.bytedance.ee.bear.document.toolbar.selectcolor.$$Lambda$Eni1U1Dk6LeRMbnB5LqiQdQQABg */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6265i.AbstractC6266a
            public final void onColorSelected(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
                C6271a.this.mo25242a(colorItem, colorItem2, colorItem3, colorItem4);
            }
        });
    }

    public void processItemClick(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
        this.highlightHandle.mo25242a(colorItem, colorItem2, colorItem3, colorItem4);
    }
}
