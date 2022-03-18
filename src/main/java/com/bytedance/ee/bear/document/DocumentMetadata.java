package com.bytedance.ee.bear.document;

import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.document.titlebar.NavigationTitle;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u00101\u001a\u00020\u0013H&J\b\u00102\u001a\u00020\u0013H&J\b\u00103\u001a\u00020\u0013H&J\b\u00104\u001a\u00020\bH&J\b\u00105\u001a\u00020\u0013H&J\b\u00106\u001a\u00020\u0013H&J\b\u00107\u001a\u00020\u0013H&J\u0010\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020:H&J\u0010\u0010;\u001a\u00020\u00132\u0006\u00109\u001a\u00020:H&J\u0018\u0010<\u001a\u00020=2\u0006\u0010/\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u0013H'J\u0010\u0010?\u001a\u00020=2\u0006\u0010\u0006\u001a\u00020\bH&J\u0012\u0010@\u001a\u00020=2\b\u0010'\u001a\u0004\u0018\u00010(H&J\u0010\u0010A\u001a\u00020=2\u0006\u0010*\u001a\u00020+H&J\u0012\u0010B\u001a\u00020=2\b\u0010-\u001a\u0004\u0018\u00010\bH&J\u0010\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020+H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0012\u0010\u0014\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0012\u0010\u001c\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\rR\u001a\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\nR\u001a\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\nR\u0012\u0010-\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\rR\u0012\u0010/\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\r¨\u0006E"}, d2 = {"Lcom/bytedance/ee/bear/document/DocumentMetadata;", "", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "getBearUrl", "()Lcom/bytedance/ee/bear/domain/BearUrl;", "docName", "Landroidx/lifecycle/LiveData;", "", "getDocName", "()Landroidx/lifecycle/LiveData;", "documentType", "getDocumentType", "()Ljava/lang/String;", "documentTypeValue", "", "getDocumentTypeValue", "()I", "isExternalUser", "", "isOwner", "()Z", "openSource", "Lcom/bytedance/ee/bear/contract/doc/DocsOpenSource;", "getOpenSource", "()Lcom/bytedance/ee/bear/contract/doc/DocsOpenSource;", "originBearUrl", "getOriginBearUrl", "originUrl", "getOriginUrl", "parentToken", "getParentToken", "showingIconInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/contract/icon/IconInfo;", "getShowingIconInfo", "()Landroidx/lifecycle/MutableLiveData;", "spaceId", "getSpaceId", "title", "", "getTitle", "titleInfo", "Lcom/bytedance/ee/bear/document/titlebar/NavigationTitle;", "getTitleInfo", "token", "getToken", "url", "getUrl", "allowCustomTitle", "allowCustomTitleMenu", "canCopy", "getCommonTemplatePreviewType", "isAnnounceDoc", "isAnnounceTemplatePreview", "isCommonTemplatePreview", "isDocumentType", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "isType", "requestDocumentInfo", "", "checkWiki", "setDocName", "setTitle", "setTitleInfo", "setToken", "updateTitle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "document-api_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.q */
public interface DocumentMetadata {
    boolean allowCustomTitle();

    boolean allowCustomTitleMenu();

    boolean canCopy();

    BearUrl getBearUrl();

    String getCommonTemplatePreviewType();

    LiveData<String> getDocName();

    String getDocumentType();

    int getDocumentTypeValue();

    DocsOpenSource getOpenSource();

    BearUrl getOriginBearUrl();

    String getOriginUrl();

    C1177w<IconInfo> getShowingIconInfo();

    String getSpaceId();

    LiveData<CharSequence> getTitle();

    LiveData<NavigationTitle> getTitleInfo();

    String getToken();

    String getUrl();

    boolean isAnnounceDoc();

    boolean isAnnounceTemplatePreview();

    boolean isCommonTemplatePreview();

    boolean isDocumentType(C8275a aVar);

    LiveData<Boolean> isExternalUser();

    boolean isOwner();

    boolean isType(C8275a aVar);

    void setDocName(String str);

    void setTitle(CharSequence charSequence);

    void updateTitle(NavigationTitle navigationTitle);
}
