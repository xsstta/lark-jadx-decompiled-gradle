package com.bytedance.ee.bear.document.magic;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.p278b.AbstractC5115a;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.comment.C5711a;
import com.bytedance.ee.bear.document.feed.C5797a;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.log.C13479a;
import org.koin.java.KoinJavaComponent;

public class MagicPlugin extends DocumentPlugin implements AbstractC10549e {
    private boolean isKeyboardShowing;

    private String getDocumentScenarioId() {
        String str = getDocViewModel().getOriginBearUrl().f17446a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1363649724:
                if (str.equals("mindnote")) {
                    c = 0;
                    break;
                }
                break;
            case -102775833:
                if (str.equals("bitable")) {
                    c = 1;
                    break;
                }
                break;
            case 99640:
                if (str.equals("doc")) {
                    c = 2;
                    break;
                }
                break;
            case 3088960:
                if (str.equals("docx")) {
                    c = 3;
                    break;
                }
                break;
            case 3649456:
                if (str.equals("wiki")) {
                    c = 4;
                    break;
                }
                break;
            case 109403487:
                if (str.equals("sheet")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "ccm_mindnote_content";
            case 1:
                return "ccm_bitable_content";
            case 2:
                return "ccm_doc_content";
            case 3:
                return "ccm_docx_content";
            case 4:
                return "ccm_wiki_content";
            case 5:
                return "ccm_sheet_content";
            default:
                return "";
        }
    }

    /* access modifiers changed from: private */
    public boolean canShowMagicPanel() {
        if (this.isKeyboardShowing) {
            C13479a.m54764b("MagicPlugin", "can not show MagicPanel >> keyboard is showing");
            return false;
        }
        AbstractC6214a b = ((C6095s) getHost()).mo24599n().getActiveEditPanel().mo5927b();
        if (b != null) {
            C13479a.m54764b("MagicPlugin", "can not show MagicPanel >> activeEditPanel = " + b);
            return false;
        }
        SelectionPlugin selectionPlugin = (SelectionPlugin) findPlugin(SelectionPlugin.class);
        if (selectionPlugin == null || !selectionPlugin.isShowingActionMode()) {
            C5711a aVar = (C5711a) viewModel(C5711a.class);
            if (aVar == null || aVar.isShowingComment().mo5927b() != Boolean.TRUE) {
                C5797a aVar2 = (C5797a) viewModel(C5797a.class);
                if (aVar2 == null || !aVar2.isShowing()) {
                    for (Fragment fragment : getActivity().getSupportFragmentManager().getFragments()) {
                        if (fragment instanceof DialogInterface$OnCancelListenerC1021b) {
                            C13479a.m54764b("MagicPlugin", "can not show MagicPanel >> DialogFragment " + fragment.getClass().getSimpleName() + " is showing");
                            return false;
                        }
                    }
                    for (Fragment fragment2 : ((C6095s) getHost()).mo24597l().getChildFragmentManager().getFragments()) {
                        if (fragment2 instanceof DialogInterface$OnCancelListenerC1021b) {
                            C13479a.m54764b("MagicPlugin", "can not show MagicPanel >> DialogFragment " + fragment2.getClass().getSimpleName() + " is showing");
                            return false;
                        }
                    }
                    C13479a.m54764b("MagicPlugin", "can show MagicPanel");
                    return true;
                }
                C13479a.m54764b("MagicPlugin", "can not show MagicPanel >> feed panel is showing");
                return false;
            }
            C13479a.m54764b("MagicPlugin", "can not show MagicPanel >> comment panel is showing");
            return false;
        }
        C13479a.m54764b("MagicPlugin", "can not show MagicPanel >> ActionMode is showing");
        return false;
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39928b(this);
        ((AbstractC5115a) KoinJavaComponent.m268610a(AbstractC5115a.class)).mo20220a(getDocumentScenarioId());
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        AbstractC10550f.AbstractC10551a.m43717b(sVar.mo19564f()).mo39924a(this);
        ((AbstractC5115a) KoinJavaComponent.m268610a(AbstractC5115a.class)).mo20221a(getDocumentScenarioId(), null, getContext(), new AbstractC5115a.AbstractC5116a() {
            /* class com.bytedance.ee.bear.document.magic.$$Lambda$MagicPlugin$XEBk1k49W2dqeTVRaEuIirkA0dQ */

            @Override // com.bytedance.ee.bear.contract.p278b.AbstractC5115a.AbstractC5116a
            public final boolean canShow() {
                return MagicPlugin.this.canShowMagicPanel();
            }
        });
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.isKeyboardShowing = z;
    }
}
