package com.bytedance.ee.bear.block.codeblock;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/block/codeblock/CodeBlockViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "codeLanguageData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/block/codeblock/CodeLanguageData;", "getCodeLanguageData", "()Landroidx/lifecycle/MutableLiveData;", "isShowingCodeLanguageSelectionPanel", "", "onSelectCodeLanguage", "", "getOnSelectCodeLanguage", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.codeblock.a */
public final class CodeBlockViewModel extends AbstractC1142af {
    private final C1177w<CodeLanguageData> codeLanguageData = new C1177w<>();
    private final C1177w<Boolean> isShowingCodeLanguageSelectionPanel = new C1177w<>();
    private final C1177w<String> onSelectCodeLanguage = new C1177w<>();

    public final C1177w<CodeLanguageData> getCodeLanguageData() {
        return this.codeLanguageData;
    }

    public final C1177w<String> getOnSelectCodeLanguage() {
        return this.onSelectCodeLanguage;
    }

    public final C1177w<Boolean> isShowingCodeLanguageSelectionPanel() {
        return this.isShowingCodeLanguageSelectionPanel;
    }
}
