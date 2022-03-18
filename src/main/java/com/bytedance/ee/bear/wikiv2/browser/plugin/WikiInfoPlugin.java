package com.bytedance.ee.bear.wikiv2.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.BasePluginV2;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;

public class WikiInfoPlugin extends BasePluginV2 {
    private WikiViewModel wikiViewModel;

    public TreeNode getWikiMeta() {
        WikiViewModel hVar = this.wikiViewModel;
        if (hVar != null) {
            return hVar.getWikiMeta();
        }
        return null;
    }

    public WikNodePerm getWikiPerm() {
        WikiViewModel hVar = this.wikiViewModel;
        if (hVar != null) {
            return hVar.getWikiPerm();
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.wikiViewModel = (WikiViewModel) C4950k.m20479a(getHost(), WikiViewModel.class, WikiViewModel.newFactory(((FragmentHostAbility) getHostAbility(FragmentHostAbility.class)).mo23794b().getArguments()));
    }
}
