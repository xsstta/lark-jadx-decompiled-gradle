package com.bytedance.ee.bear.doc.structure;

import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class StructureMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    private C6095s pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_table_group_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "structureV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Doc_More_Structure);
    }

    private void showFixedStructure() {
        this.pluginHost.mo19549a(StructurePlugin.class, $$Lambda$6DWnLf87lQH4yaqUenRYx2HG_lA.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        StructurePlugin structurePlugin = (StructurePlugin) this.pluginHost.mo19540a(StructurePlugin.class);
        if (structurePlugin != null) {
            return structurePlugin.exitStructure();
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        showFixedStructure();
        if (getMoreInfo() instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "catalog", "none", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
        }
        getHost().mo39166c();
    }

    public StructureMoreItemV2(C6095s sVar) {
        this.pluginHost = sVar;
    }
}
