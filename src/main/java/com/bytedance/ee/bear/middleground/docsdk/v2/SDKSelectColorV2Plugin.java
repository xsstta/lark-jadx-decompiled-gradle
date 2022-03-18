package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.bear.document.toolbar.selectcolor.AbstractC6270b;
import com.bytedance.ee.bear.document.toolbar.selectcolor.C6273c;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6265i;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.AbsEditorSdkPlugin;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;
import java.util.Map;

public class SDKSelectColorV2Plugin extends AbsEditorSdkPlugin {
    private C6271a highlightHandle;
    private C6273c selectorModule;

    public SDKSelectColorV2Plugin() {
        init();
    }

    private void init() {
        this.selectorModule = new C6273c(new AbstractC6270b() {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.SDKSelectColorV2Plugin.C93311 */
        });
        this.highlightHandle = new C6271a(new C6271a.AbstractC6272a() {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.SDKSelectColorV2Plugin.C93322 */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: a */
            public boolean mo25203a() {
                return false;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: a */
            public boolean mo25204a(Highlight highlight) {
                return false;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: b */
            public AbstractC4941c mo25205b() {
                return SDKSelectColorV2Plugin.this;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: c */
            public Boolean mo25206c() {
                return false;
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: d */
            public FragmentManager mo25207d() {
                return ((C9344a) SDKSelectColorV2Plugin.this.getHost()).mo19564f().getSupportFragmentManager();
            }

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p323b.C6271a.AbstractC6272a
            /* renamed from: a */
            public <F extends Fragment> F mo25202a(Class<F> cls, Bundle bundle) {
                return (F) SDKSelectColorV2Plugin.this.instantiateFragment(cls, bundle);
            }
        });
    }

    @Override // com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.navigation.setHighlightPanel", this.highlightHandle);
    }

    public void onAttachToUIContainer(C9344a aVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        ((C6265i) C4950k.m20476a(this, C6265i.class)).setDelegate(new C6265i.AbstractC6266a() {
            /* class com.bytedance.ee.bear.middleground.docsdk.v2.$$Lambda$SDKSelectColorV2Plugin$RGjNC0kXwtlJQ1SvV_rKeWH1GMw */

            @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6265i.AbstractC6266a
            public final void onColorSelected(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
                SDKSelectColorV2Plugin.this.lambda$onAttachToUIContainer$0$SDKSelectColorV2Plugin(colorItem, colorItem2, colorItem3, colorItem4);
            }
        });
    }

    public /* synthetic */ void lambda$onAttachToUIContainer$0$SDKSelectColorV2Plugin(Highlight.ColorItem colorItem, Highlight.ColorItem colorItem2, Highlight.ColorItem colorItem3, Highlight.ColorItem colorItem4) {
        this.highlightHandle.mo25242a(colorItem, colorItem2, colorItem3, colorItem4);
    }
}
