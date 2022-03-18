package com.bytedance.ee.bear.document;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.SimpleListDataChangeCallback;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.doc.follow.impl.C5438c;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfo;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoProvider;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.titlebar.NavigationTitle;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13604b;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.koin.java.KoinJavaComponent;

public class DocViewModel extends AbstractC1142af implements DocumentMetadata {
    public final String TAG;
    private BearUrl bearUrl;
    public final C1177w<Boolean> deleted;
    private String docFeedId;
    private final C1177w<String> docName;
    private DocumentInfoProvider documentInfoProvider;
    private C1177w<Map<String, Object>> extraData;
    private final C1177w<Boolean> isExternalUser;
    private C1177w<Boolean> isShowingHistory;
    private final DocDataListener mDocDataListener;
    private C1177w<IconInfo> mIconInfo;
    private C1177w<IconInfo> mIconInfoData;
    private final C1177w<NavigationTitle> mTitleInfo;
    private DocsOpenSource openSource;
    private BearUrl originBearUrl;
    private String originUrl;
    private String parentToken;
    private String previewListStr;
    private Bundle remindBinder;
    private final C10917c serviceContext;
    private final C10929e services;
    private String sourceType;
    private String spaceId;
    private String templatePreviewTitle;
    private final C1177w<CharSequence> title;
    private final C1177w<String> token;
    private String url;
    private WikiInfo wikiInfo;

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public BearUrl getBearUrl() {
        return this.bearUrl;
    }

    public LiveData<Boolean> getDeleted() {
        return this.deleted;
    }

    public C1177w<Map<String, Object>> getDocExtra() {
        return this.extraData;
    }

    public String getDocFeedId() {
        return this.docFeedId;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public LiveData<String> getDocName() {
        return this.docName;
    }

    public DocumentInfoProvider getDocumentInfoProvider() {
        return this.documentInfoProvider;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public DocsOpenSource getOpenSource() {
        return this.openSource;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public BearUrl getOriginBearUrl() {
        return this.originBearUrl;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public String getOriginUrl() {
        return this.originUrl;
    }

    public String getParentToken() {
        return this.parentToken;
    }

    public String getPreviewListStr() {
        return this.previewListStr;
    }

    public Bundle getRemindBinder() {
        return this.remindBinder;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public String getSpaceId() {
        return this.spaceId;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public LiveData<CharSequence> getTitle() {
        return this.title;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public C1177w<NavigationTitle> getTitleInfo() {
        return this.mTitleInfo;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public String getUrl() {
        return this.url;
    }

    public WikiInfo getWikiInfo() {
        return this.wikiInfo;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public LiveData<Boolean> isExternalUser() {
        return this.isExternalUser;
    }

    public LiveData<String> liveDocObjToken() {
        return this.token;
    }

    public String toString() {
        return this.TAG;
    }

    public DocViewModel() {
        this(null);
    }

    private boolean isHistoryDoc() {
        return C5171a.m21152b(this.originUrl);
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean allowCustomTitle() {
        return !isHistoryDoc();
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean allowCustomTitleMenu() {
        return !isHistoryDoc();
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public String getCommonTemplatePreviewType() {
        return C5171a.m21153c(this.bearUrl);
    }

    public String getSourceType() {
        String str = this.sourceType;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean isAnnounceDoc() {
        return C5171a.m21150a(this.originUrl);
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean isAnnounceTemplatePreview() {
        return C5171a.m21149a(this.bearUrl);
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean isCommonTemplatePreview() {
        return C5171a.m21151b(this.bearUrl);
    }

    public boolean isOpenFromLarkFeed() {
        return C13604b.m55237a(this.originUrl);
    }

    public boolean isSubscriptDoc() {
        return C5171a.m21154c(this.originUrl);
    }

    public C1177w<DocumentInfo> liveDocumentInfoData() {
        return this.documentInfoProvider.mo23146b();
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean canCopy() {
        return getDocumentInfoData().canCopy();
    }

    public DocumentInfo getDocumentInfoData() {
        return liveDocumentInfoData().mo5927b();
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public int getDocumentTypeValue() {
        return C8275a.m34051b(getDocumentType());
    }

    public String getDocumentTypeValueString() {
        return String.valueOf(getDocumentTypeValue());
    }

    public C1177w<IconInfo> getIconInfoData() {
        if (this.mIconInfoData == null) {
            this.mIconInfoData = new C1177w<>();
        }
        return this.mIconInfoData;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public C1177w<IconInfo> getShowingIconInfo() {
        if (this.mIconInfo == null) {
            this.mIconInfo = new C1177w<>();
        }
        return this.mIconInfo;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public String getToken() {
        return this.token.mo5927b();
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean isOwner() {
        DocumentInfo documentInfoData = getDocumentInfoData();
        if (documentInfoData == null || !documentInfoData.isOwner()) {
            return false;
        }
        return true;
    }

    public C1177w<Boolean> isShowingHistory() {
        if (this.isShowingHistory == null) {
            this.isShowingHistory = new C1177w<>();
        }
        return this.isShowingHistory;
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public String getDocumentType() {
        BearUrl bearUrl2 = this.bearUrl;
        if (bearUrl2 != null) {
            return bearUrl2.f17446a;
        }
        C13479a.m54775e(this.TAG, "getDocumentRealTypeName While bear url null!");
        return "";
    }

    public boolean isCanEdit() {
        DocumentInfo documentInfoData = getDocumentInfoData();
        if (documentInfoData != null) {
            return documentInfoData.canEdit();
        }
        C13479a.m54758a(this.TAG, "documentInfo is null!");
        return false;
    }

    public boolean isConferenceRecords() {
        Uri parse = Uri.parse(this.originUrl);
        if (getOpenSource() != DocsOpenSource.calendar || !TextUtils.equals(parse.getQueryParameter("sourceType"), "conference_records")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        C13479a.m54764b(this.TAG, "onCleared");
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31508b(this.mDocDataListener);
    }

    public String getDocTitle() {
        CharSequence b;
        String b2 = this.docName.mo5927b();
        if (TextUtils.isEmpty(b2) && (b = this.title.mo5927b()) != null) {
            b2 = b.toString();
        }
        if (TextUtils.isEmpty(b2)) {
            return "";
        }
        return b2;
    }

    public void setDocumentInfoProvider(DocumentInfoProvider dVar) {
        this.documentInfoProvider = dVar;
    }

    /* access modifiers changed from: private */
    public class DocDataListener extends SimpleListDataChangeCallback {
        private DocDataListener() {
        }

        public /* synthetic */ void lambda$onRename$1$DocViewModel$DocDataListener(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OfflineRenameData offlineRenameData = (OfflineRenameData) it.next();
                if (offlineRenameData != null) {
                    onRename(offlineRenameData.getObjToken(), offlineRenameData.getNewName());
                }
            }
        }

        public /* synthetic */ void lambda$onRename$0$DocViewModel$DocDataListener(String str) {
            if (C5890a.m23710c() == C8275a.f22372e.mo32555b() || C5890a.m23710c() == C8275a.f22373f.mo32555b()) {
                DocViewModel.this.setTitle(str);
            }
            DocViewModel.this.setDocName(str);
            if (DocViewModel.this.getDocumentInfoData() != null) {
                DocViewModel.this.getDocumentInfoData().setTitle(str);
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onDelete(String str) {
            C13479a.m54764b(DocViewModel.this.TAG, "DocDataListener，onDelete ");
            if (TextUtils.equals(str, DocViewModel.this.getToken())) {
                DocViewModel.this.deleted.mo5926a((Boolean) true);
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onRename(List<OfflineRenameData> list) {
            C13479a.m54764b(DocViewModel.this.TAG, "DocDataListener，onRenameList");
            if (list != null && list.size() > 0) {
                C13742g.m55711d(new Runnable(list) {
                    /* class com.bytedance.ee.bear.document.$$Lambda$DocViewModel$DocDataListener$ECMZd2_KM479yEGYr6oG3QkwHRk */
                    public final /* synthetic */ List f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        DocViewModel.DocDataListener.this.lambda$onRename$1$DocViewModel$DocDataListener(this.f$1);
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onRename(String str, String str2) {
            C13479a.m54764b(DocViewModel.this.TAG, "DocDataListener，onRename");
            if (TextUtils.equals(str, DocViewModel.this.getToken())) {
                C13742g.m55711d(new Runnable(str2) {
                    /* class com.bytedance.ee.bear.document.$$Lambda$DocViewModel$DocDataListener$bEW8tOo4hX19NHr6jl_zefbb8yc */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        DocViewModel.DocDataListener.this.lambda$onRename$0$DocViewModel$DocDataListener(this.f$1);
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onPin(String str, boolean z) {
            String str2 = DocViewModel.this.TAG;
            C13479a.m54764b(str2, "DocDataListener, onPin()...isPin = " + z);
            DocumentInfo documentInfoData = DocViewModel.this.getDocumentInfoData();
            if (documentInfoData != null) {
                documentInfoData.setPined(z);
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onStar(String str, boolean z) {
            String str2 = DocViewModel.this.TAG;
            C13479a.m54764b(str2, "DocDataListener，onStar()...isStar = " + z);
            DocumentInfo documentInfoData = DocViewModel.this.getDocumentInfoData();
            if (documentInfoData != null) {
                documentInfoData.setStared(z);
            }
        }

        @Override // com.bytedance.ee.bear.contract.SimpleListDataChangeCallback, com.bytedance.ee.bear.contract.am.AbstractC5112e
        public void onSubscribe(String str, boolean z) {
            String str2 = DocViewModel.this.TAG;
            C13479a.m54764b(str2, "DocDataListener, onSubscribe()...isSubscribe = " + z);
            DocumentInfo documentInfoData = DocViewModel.this.getDocumentInfoData();
            if (documentInfoData != null) {
                documentInfoData.setSubscribe(z);
            }
        }
    }

    public static C1144ai.AbstractC1146b newFactory(final Bundle bundle) {
        return new C1144ai.AbstractC1146b() {
            /* class com.bytedance.ee.bear.document.DocViewModel.C56081 */

            @Override // androidx.lifecycle.C1144ai.AbstractC1146b
            public <T extends AbstractC1142af> T create(Class<T> cls) {
                return new DocViewModel(bundle);
            }
        };
    }

    private static String parseDocName(Bundle bundle) {
        return bundle.getString("node_name");
    }

    private void updateDocumentInfoData(DocumentInfo documentInfo) {
        liveDocumentInfoData().mo5929b(documentInfo);
    }

    public <T> T getService(Class<T> cls) {
        return (T) this.services.mo41522a(cls);
    }

    public void requestDocumentInfo(String str) {
        requestDocumentInfo(str, false);
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean isDocumentType(C8275a aVar) {
        return aVar.mo32553a().equals(getDocumentType());
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public boolean isType(C8275a aVar) {
        return aVar.mo32553a().equals(this.originBearUrl.f17446a);
    }

    public void setToken(String str) {
        C13742g.m55711d(new Runnable(str) {
            /* class com.bytedance.ee.bear.document.$$Lambda$DocViewModel$ppg4rfl_De851_cvqybmx40TwN0 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DocViewModel.this.lambda$setToken$0$DocViewModel(this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: doSetToken */
    public void lambda$setToken$0$DocViewModel(String str) {
        C5890a.m23703a(str);
        if (!TextUtils.equals(str, this.token.mo5927b())) {
            this.token.mo5929b(str);
        }
    }

    private void setBearUrl(BearUrl bearUrl2) {
        this.url = bearUrl2.f17450e;
        this.bearUrl = bearUrl2;
        if (this.originUrl == null) {
            this.originUrl = bearUrl2.f17450e;
            this.originBearUrl = bearUrl2;
        }
        setToken(bearUrl2.f17447b);
    }

    private void setExternalUser(Boolean bool) {
        if (!objEquals(this.isExternalUser.mo5927b(), bool)) {
            this.isExternalUser.mo5929b(bool);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public void setDocName(String str) {
        if (!TextUtils.equals(this.docName.mo5927b(), str) && str != null) {
            this.docName.mo5929b(str);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.equals(this.title.mo5927b(), charSequence)) {
            this.title.mo5929b(charSequence);
        }
    }

    public void setTitleInfo(NavigationTitle navigationTitle) {
        if (!Objects.equals(navigationTitle, this.mTitleInfo.mo5927b())) {
            this.mTitleInfo.mo5929b(navigationTitle);
        }
    }

    public DocViewModel(Bundle bundle) {
        this.TAG = "DocViewModel#" + Integer.toHexString(hashCode());
        this.openSource = DocsOpenSource.unknown;
        C10929e eVar = new C10929e();
        this.services = eVar;
        this.serviceContext = new C10917c(eVar);
        this.title = new C1177w<>();
        this.mTitleInfo = new C1177w<>();
        this.docName = new C1177w<>();
        this.isExternalUser = new C1177w<>();
        this.token = new C1177w<>();
        this.deleted = new C1177w<>();
        this.extraData = new C1177w<>();
        DocDataListener docDataListener = new DocDataListener();
        this.mDocDataListener = docDataListener;
        ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31483a(docDataListener);
        readArgs(bundle);
        parseOriginUrl(bundle);
    }

    public void setUrl(String str) {
        Object obj;
        String str2 = this.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("setUrl:");
        if (TextUtils.isEmpty(str)) {
            obj = "EMPTY";
        } else {
            obj = Integer.valueOf(str.hashCode());
        }
        sb.append(obj);
        C13479a.m54764b(str2, sb.toString());
        this.url = C6313i.m25327a().mo25398f(str);
        BearUrl g = C6313i.m25327a().mo25399g(this.url);
        this.bearUrl = g;
        if (this.originUrl == null) {
            this.originUrl = str;
            this.originBearUrl = g;
        }
        setToken(g.f17447b);
    }

    @Override // com.bytedance.ee.bear.document.DocumentMetadata
    public void updateTitle(NavigationTitle navigationTitle) {
        if (navigationTitle == null || C5171a.m21149a(this.bearUrl)) {
            C13479a.m54775e(this.TAG, "NavigationTitle is null or isAnnounceTemplatePreview");
            return;
        }
        if (allowCustomTitle()) {
            setTitleInfo(navigationTitle);
            setTitle(navigationTitle.getTitle());
            getShowingIconInfo().mo5929b(navigationTitle.getIcon_info());
        }
        if (!TextUtils.isEmpty(navigationTitle.getDocName())) {
            setDocName(navigationTitle.getDocName());
        }
        setExternalUser(navigationTitle.isExternal());
    }

    private void readArgs(Bundle bundle) {
        if (bundle != null) {
            BearUrl bearUrl2 = (BearUrl) bundle.getParcelable("bear_url");
            if (bearUrl2 != null) {
                setBearUrl(bearUrl2);
            } else {
                setUrl(bundle.getString("url"));
            }
            this.docName.mo5929b(parseDocName(bundle));
            this.parentToken = bundle.getString("parent_token");
            this.docFeedId = bundle.getString("doc_feed_id");
            this.sourceType = bundle.getString("source_type");
            this.remindBinder = bundle.getBundle("remind_binder");
            this.spaceId = bundle.getString("space_id");
            WikiInfo wikiInfo2 = (WikiInfo) bundle.getSerializable("wiki_info");
            this.wikiInfo = wikiInfo2;
            if (wikiInfo2 != null) {
                setUrl(C6313i.m25327a().mo25382a(this.wikiInfo.getObjTypeString(), this.wikiInfo.getObjToken(), null));
            }
            Map map = (Map) bundle.getSerializable("extra_data_map");
            if (map != null) {
                this.previewListStr = (String) map.get("template_preview_list");
            }
        }
    }

    public void parseOriginUrl(Bundle bundle) {
        try {
            Uri parse = Uri.parse(this.originUrl);
            if (!TextUtils.isEmpty(this.originUrl)) {
                String queryParameter = parse.getQueryParameter("from");
                if (C5438c.m22048a(bundle)) {
                    this.openSource = DocsOpenSource.vc;
                } else if (DocsOpenSource.calendar.name().equals(queryParameter)) {
                    this.openSource = DocsOpenSource.calendar;
                } else if (DocsOpenSource.docs_feed.name().equals(queryParameter)) {
                    this.openSource = DocsOpenSource.docs_feed;
                } else if (DocsOpenSource.template_preview.name().equals(queryParameter)) {
                    this.openSource = DocsOpenSource.template_preview;
                } else if (DocsOpenSource.chat_tab.name().equals(queryParameter)) {
                    this.openSource = DocsOpenSource.chat_tab;
                } else {
                    this.openSource = DocsOpenSource.unknown;
                }
                String str = this.TAG;
                C13479a.m54764b(str, "openSource:" + this.openSource);
            }
        } catch (Exception unused) {
            C13479a.m54758a(this.TAG, "illegal url to judge !");
        }
    }

    private static boolean objEquals(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public void setExtraData(String str, Object obj) {
        Map<String, Object> b = this.extraData.mo5927b();
        if (b == null) {
            b = new HashMap<>();
        }
        b.put(str, obj);
        this.extraData.mo5929b(b);
    }

    public void requestDocumentInfo(String str, boolean z) {
        boolean z2;
        DocumentInfoProvider dVar = this.documentInfoProvider;
        String str2 = this.originUrl;
        String str3 = this.spaceId;
        String token2 = getToken();
        if (this.openSource == DocsOpenSource.vc) {
            z2 = true;
        } else {
            z2 = false;
        }
        dVar.mo23145a(str, str2, str3, token2, z2, isType(C8275a.f22377j), z);
    }
}
