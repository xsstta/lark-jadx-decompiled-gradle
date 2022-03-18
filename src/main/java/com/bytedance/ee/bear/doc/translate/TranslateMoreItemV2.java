package com.bytedance.ee.bear.doc.translate;

import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import org.koin.java.KoinJavaComponent;

public class TranslateMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    private C6095s pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_translate_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "translateV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_Translate);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38977a("translateV2");
    }

    private void translate() {
        this.pluginHost.mo19549a(TranslatePlugin.class, $$Lambda$TranslateMoreItemV2$0uRKRPpWjS80wGLQtiJoQ3vy4sA.INSTANCE);
        this.pluginHost.mo19549a(EditModeSwitchPlugin.class, $$Lambda$TranslateMoreItemV2$vOUw6kRlVhGUKfgKWvoiqIBAceU.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        if (getMoreInfo() == null) {
            C13479a.m54775e("TranslateMoreItemV2", "moreInfo == null");
            return false;
        }
        TranslatePlugin translatePlugin = (TranslatePlugin) this.pluginHost.mo19540a(TranslatePlugin.class);
        if (translatePlugin == null || !translatePlugin.isEnableTranslate()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        translate();
        if ((getMoreInfo() instanceof DocMoreInfo) && C5234y.m21391b() != null) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            AbstractC5233x b = C5234y.m21391b();
            b.mo21087d("TranslateMoreItemV2");
            b.mo21077a("TranslateMoreItemV2");
            b.mo21078a("TranslateMoreItemV2", "token", aVar.mo39041h());
            b.mo21078a("TranslateMoreItemV2", ShareHitPoint.f121869d, String.valueOf(aVar.mo39036e()));
            boolean z = aVar instanceof WikiMoreInfo;
            b.mo21078a("TranslateMoreItemV2", "is_wiki", String.valueOf(z));
            b.mo21078a("TranslateMoreItemV2", "is_at_vc", String.valueOf(aVar.mo39008D()));
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "translate", "ccm_space_translate_view", "", "", "", z, aVar.mo39008D());
        }
        getHost().mo39166c();
    }

    public TranslateMoreItemV2(C6095s sVar) {
        this.pluginHost = sVar;
    }

    static /* synthetic */ void lambda$translate$0(TranslatePlugin translatePlugin) {
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38980b("translateV2");
        translatePlugin.translate();
    }
}
