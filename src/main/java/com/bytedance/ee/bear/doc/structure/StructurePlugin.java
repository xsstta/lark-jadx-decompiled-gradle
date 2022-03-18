package com.bytedance.ee.bear.doc.structure;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.doc.structure.Structure;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Map;

public class StructurePlugin extends DocumentPlugin {
    private WebViewClient clientDelegate = new WebViewClient() {
        /* class com.bytedance.ee.bear.doc.structure.StructurePlugin.C55201 */

        public void onPageFinished(WebView webView, String str) {
            boolean z;
            StructurePlugin structurePlugin = StructurePlugin.this;
            if (str == null || !str.endsWith("#history")) {
                z = false;
            } else {
                z = true;
            }
            structurePlugin.inHistoryMode = z;
            C13479a.m54764b("StructurePlugin", "Page finished inHistoryMode? " + StructurePlugin.this.inHistoryMode);
            if (StructurePlugin.this.inHistoryMode) {
                StructurePlugin.this.structureViewModel.setStructure(null);
            }
        }
    };
    public boolean inHistoryMode;
    public C5538e structureViewModel;

    public C5538e getStructureViewModel() {
        return this.structureViewModel;
    }

    /* access modifiers changed from: package-private */
    public boolean exitStructure() {
        if (this.structureViewModel.getContent().mo5927b() != null) {
            return true;
        }
        return false;
    }

    private void ensureStructureFragment() {
        AbstractC4958n uIContainer = getUIContainer();
        if (uIContainer.mo19586a((AbstractC4941c) this) == null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("enableFontScale", "doc".equals(getDocViewModel().getBearUrl().f17446a));
            uIContainer.mo19589a(this, instantiateFragment(C5527b.class, bundle));
        }
    }

    /* access modifiers changed from: package-private */
    public void showFixedStructure() {
        if (isUIContainerDetached()) {
            C13479a.m54775e("StructurePlugin", "showFixedStructure while ui detached");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enableFontScale", "doc".equals(getDocViewModel().getBearUrl().f17446a));
        C5522a aVar = (C5522a) instantiateFragment(C5522a.class, bundle);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.add(aVar, aVar.getClass().getSimpleName());
        beginTransaction.commitAllowingStateLoss();
        this.structureViewModel.getStructureAnalytic().mo22104a(false);
    }

    /* renamed from: com.bytedance.ee.bear.doc.structure.StructurePlugin$a */
    private class C5521a implements AbstractC7945d<Structure> {
        private C5521a() {
        }

        /* renamed from: a */
        private Structure m22432a(Structure structure) {
            Structure structure2 = new Structure();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < structure.paragraphs.length; i++) {
                if (structure.paragraphs[i].showParagraph) {
                    arrayList.add(structure.paragraphs[i]);
                }
            }
            structure2.paragraphs = (Structure.Paragraph[]) arrayList.toArray(new Structure.Paragraph[0]);
            return structure2;
        }

        /* renamed from: a */
        public void handle(Structure structure, AbstractC7947h hVar) {
            int i;
            if (StructurePlugin.this.inHistoryMode) {
                C13479a.m54775e("StructurePlugin", "update structure while in history mode");
                return;
            }
            if (structure == null) {
                i = 0;
            } else {
                i = structure.getParagraphCount();
            }
            C13479a.m54764b("StructurePlugin", "Structure:" + i);
            if (structure != null) {
                structure.transformDip2Px();
                structure.trimAllTitle();
            }
            StructurePlugin.this.structureViewModel.setStructure(m22432a(structure));
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$0$StructurePlugin(Structure structure) {
        if (structure != null) {
            ensureStructureFragment();
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.navigation.setDocumentStructure", new C5521a());
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        getWeb().mo19438b(this.clientDelegate);
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        C5538e eVar = (C5538e) viewModel(C5538e.class);
        this.structureViewModel = eVar;
        eVar.resetAnalytic(getDocViewModel(), C5234y.m21391b());
        this.structureViewModel.getContent().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$StructurePlugin$u7x1koZT6CyOJLMdugp_dVUBzQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                StructurePlugin.this.lambda$onAttachToHost$0$StructurePlugin((Structure) obj);
            }
        });
        getWeb().mo19425a(this.clientDelegate);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        this.structureViewModel.setWeb(getWeb());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        this.structureViewModel.onDetach();
    }
}
