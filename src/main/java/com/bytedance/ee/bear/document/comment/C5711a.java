package com.bytedance.ee.bear.document.comment;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.comment.bean.ShowCardsJsData;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.edit.component.document.AbstractC7593a;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.export.CommentAnimationListener;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.log.C13479a;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;

/* renamed from: com.bytedance.ee.bear.document.comment.a */
public class C5711a extends AbstractC7593a {
    private AbstractC6054a atOrientationHandler = $$Lambda$a$hFySqdwdSwK3y2PhJ3odDOi_MlM.INSTANCE;
    private int changeDefaultPanelHeight = ((int) C7728a.m30906c());
    private int changeMaxPanelHeight = ((int) C7728a.m30905b());
    private int changeMinPanelHeight = ((int) C7728a.m30902a());
    private boolean changePanelHeightFlag = false;
    private C1177w<Boolean> changeShowHeight = new C1177w<>();
    private C1177w<CommentAnimationListener> commentAnimationLiveData = new C1177w<>();
    private C5715c<ShowCardsJsData> commentCardRequest = new C5715c<>();
    private C1177w<CommentInputRequest> commentInputRequest = new C1177w<>();
    private AbstractC6054a editOrientationHandler = $$Lambda$a$f3SVvz7LqdxHfEo89r0PH7hnHJs.INSTANCE;
    private C1177w<String> feedUpdate = new C1177w<>();
    private AbstractC6054a fullOrientationHandler = $$Lambda$a$C198_7VOffdziQJtPN4zj411uwQ.INSTANCE;
    private AbstractC6054a inputOrientationHandler = $$Lambda$a$l3xwYSudSUN2JLIzSSTIthM4_Q.INSTANCE;
    private C1177w<Boolean> isShowingComment = new C1177w<>();
    private C1177w<Integer> panelHeight = new C1177w<>();
    private AbstractC6054a partOrientationHandler = $$Lambda$a$2MwkVZuV9k41n_5Lvr0ai9SGiDs.INSTANCE;
    private C1177w<TranslateConfig> translateConfig = new C1177w<>();

    static /* synthetic */ boolean lambda$new$0() {
        return false;
    }

    static /* synthetic */ boolean lambda$new$1() {
        return true;
    }

    static /* synthetic */ boolean lambda$new$2() {
        return true;
    }

    static /* synthetic */ boolean lambda$new$3() {
        return true;
    }

    static /* synthetic */ boolean lambda$new$4() {
        return true;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return Comment.f24093e;
    }

    public String toString() {
        return "CommentPanel";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.comment.a$a */
    public static class C5712a implements Serializable {
        private String tmpId;
        private String type;

        public String getType() {
            return this.type;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, (Object) this.type);
            jSONObject.put("tmpId", (Object) this.tmpId);
            return jSONObject;
        }

        public void setType(String str) {
            this.type = str;
        }

        C5712a(String str, String str2) {
            this.type = str;
            this.tmpId = str2;
        }
    }

    public AbstractC6054a getAtOrientationHandler() {
        return this.atOrientationHandler;
    }

    public int getChangeDefaultPanelHeight() {
        return this.changeDefaultPanelHeight;
    }

    public int getChangeMaxPanelHeight() {
        return this.changeMaxPanelHeight;
    }

    public int getChangeMinPanelHeight() {
        return this.changeMinPanelHeight;
    }

    public C1177w<Boolean> getChangeShowHeight() {
        return this.changeShowHeight;
    }

    public C1177w<CommentAnimationListener> getCommentAnimationLiveData() {
        return this.commentAnimationLiveData;
    }

    public LiveData<ShowCardsJsData> getCommentCardsRequest() {
        return this.commentCardRequest;
    }

    public LiveData<CommentInputRequest> getCommentInputRequest() {
        return this.commentInputRequest;
    }

    public AbstractC6054a getEditOrientationHandler() {
        return this.editOrientationHandler;
    }

    public C1177w<String> getFeedUpdate() {
        return this.feedUpdate;
    }

    public AbstractC6054a getFullOrientationHandler() {
        return this.fullOrientationHandler;
    }

    public AbstractC6054a getInputOrientationHandler() {
        return this.inputOrientationHandler;
    }

    public C1177w<Integer> getPanelHeight() {
        return this.panelHeight;
    }

    public AbstractC6054a getPartOrientationHandler() {
        return this.partOrientationHandler;
    }

    public C1177w<TranslateConfig> getTranslateConfig() {
        return this.translateConfig;
    }

    public boolean isChangePanelHeightFlag() {
        return this.changePanelHeightFlag;
    }

    public C1177w<Boolean> isShowingComment() {
        return this.isShowingComment;
    }

    public void closeCard() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121869d, "show_cards");
        execJS("javascript:biz.comment.cancel", jSONObject);
    }

    public void reset() {
        this.commentInputRequest.mo5929b((CommentInputRequest) null);
        this.commentCardRequest.mo5929b((Object) null);
        this.panelHeight.mo5929b((Integer) null);
        this.feedUpdate.mo5929b((String) null);
        this.translateConfig.mo5929b((TranslateConfig) null);
        this.changePanelHeightFlag = false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void onKeyboardStateChanged(int i) {
        super.onKeyboardStateChanged(i);
    }

    public void setChangeDefaultPanelHeight(int i) {
        this.changeDefaultPanelHeight = i;
    }

    public void setChangeMaxPanelHeight(int i) {
        this.changeMaxPanelHeight = i;
    }

    public void setChangeMinPanelHeight(int i) {
        this.changeMinPanelHeight = i;
    }

    public void setChangePanelHeightFlag(boolean z) {
        this.changePanelHeightFlag = z;
    }

    public void setChangeShowHeight(boolean z) {
        this.changeShowHeight.mo5926a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        if (this.panelHeight.mo5927b() != null) {
            return this.panelHeight.mo5927b().intValue();
        }
        return 0;
    }

    public void setPanelHeight(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("height", (Object) Integer.valueOf(i));
        execJS("javascript:lark.biz.util.setPanelHeight", jSONObject);
    }

    public void updateCommentCardsRequest(ShowCardsJsData showCardsJsData) {
        C13479a.m54764b("CommentPanelViewModel", "updateCommentCardsRequest:" + showCardsJsData);
        ((C1177w) getCommentCardsRequest()).mo5929b(showCardsJsData);
    }

    public void updateCommentInputRequest(CommentInputRequest commentInputRequest2) {
        C13479a.m54764b("CommentPanelViewModel", "updateCommentInputRequest:" + commentInputRequest2);
        ((C1177w) getCommentInputRequest()).mo5929b(commentInputRequest2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void execJS(String str, JSONObject jSONObject) {
        super.execJS(str, jSONObject);
    }

    public void getDetailReaction(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("referType", (Object) str);
        jSONObject.put("referKey", (Object) str2);
        execJS("javascript:window.lark.biz.reaction.getDetail", jSONObject);
    }

    public JSONObject getInputCancelParam(boolean z, String str) {
        boolean z2;
        String str2;
        C13479a.m54764b("CommentPanelViewModel", "clearInputRequest by cancel?" + z);
        CommentInputRequest b = this.commentInputRequest.mo5927b();
        if (b == null || !b.isForWhole()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            str2 = "whole_comment";
        } else {
            str2 = "doc_comment";
        }
        JSONObject jSONObject = new C5712a(str2, str).toJSONObject();
        jSONObject.put("action", (Object) "cancel");
        this.commentInputRequest.mo5929b((CommentInputRequest) null);
        return jSONObject;
    }

    public void setDetailPanelStatus(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(UpdateKey.STATUS, (Object) Integer.valueOf(i));
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            jSONObject.put("referType", (Object) str);
            jSONObject.put("referKey", (Object) str2);
        }
        execJS("javascript:window.lark.biz.reaction.setDetailPanelStatus", jSONObject);
    }
}
