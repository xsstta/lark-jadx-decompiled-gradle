package com.bytedance.ee.bear.document.feed;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.comment.C5711a;
import com.bytedance.ee.bear.document.comment.bean.ShowCardsJsData;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageConfig;

/* renamed from: com.bytedance.ee.bear.document.feed.a */
public class C5797a extends AbstractC1142af {
    private C1177w<ShowCardsJsData> dataFeedPanel = new C1177w<>();
    private int panelHeight = 0;
    private boolean show = false;
    private C1177w<Boolean> showFeedPanel = new C1177w<>();
    private boolean whole = false;

    public LiveData<ShowCardsJsData> getDataFeedPanel() {
        return this.dataFeedPanel;
    }

    public int getPanelHeight() {
        return this.panelHeight;
    }

    public LiveData<Boolean> getShowFeedPanel() {
        return this.showFeedPanel;
    }

    public boolean isShowing() {
        return this.show;
    }

    public boolean isWhole() {
        return this.whole;
    }

    public void resetValue() {
        this.showFeedPanel.mo5929b((Boolean) null);
        this.dataFeedPanel.mo5929b((ShowCardsJsData) null);
        this.panelHeight = 0;
        this.whole = false;
        this.show = false;
    }

    public void setPanelHeight(int i) {
        this.panelHeight = i;
    }

    public void setShow(boolean z) {
        this.show = z;
    }

    public void setWhole(boolean z) {
        this.whole = z;
    }

    public void setFeedPanel(Boolean bool) {
        this.showFeedPanel.mo5929b(bool);
    }

    /* access modifiers changed from: package-private */
    public MessageConfig jsConfig2MessageConfig(AbstractC4941c cVar, String str, String str2, boolean z, boolean z2, ShowFeedModel showFeedModel, DocViewModel docViewModel) {
        boolean z3;
        DocumentInfo documentInfoData = docViewModel.getDocumentInfoData();
        boolean z4 = false;
        if (documentInfoData == null || !documentInfoData.getDocPermission().mo38591a().canEdit()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (documentInfoData != null && documentInfoData.getDocPermission().mo38591a().canCopy()) {
            z4 = true;
        }
        TranslateConfig b = ((C5711a) C4950k.m20476a(cVar, C5711a.class)).getTranslateConfig().mo5927b();
        MessageConfig messageConfig = new MessageConfig();
        messageConfig.setToken(str);
        messageConfig.setAuto(z2);
        messageConfig.setDocumentType(C8275a.m34055d(str2));
        messageConfig.setOwner(z);
        messageConfig.setUserAction(showFeedModel.isUserAction());
        messageConfig.setLoadingSuccess(true);
        messageConfig.setCanCopy(z4);
        messageConfig.setCanComment(showFeedModel.isCanComment());
        messageConfig.setCanReopen(showFeedModel.isCanReopen());
        if (b != null) {
            messageConfig.setTranslateConfig(b);
        }
        messageConfig.setCanEdit(z3);
        messageConfig.setCanReaction(showFeedModel.isCanReaction());
        messageConfig.setCanResolve(true);
        messageConfig.setCanShowMore(showFeedModel.isCanShowMore());
        messageConfig.setCanShowVoice(showFeedModel.isCanShowVoice());
        return messageConfig;
    }
}
