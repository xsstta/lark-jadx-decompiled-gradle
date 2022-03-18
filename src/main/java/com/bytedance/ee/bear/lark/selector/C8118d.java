package com.bytedance.ee.bear.lark.selector;

import com.bytedance.ee.bear.dto.C7584a;
import com.bytedance.ee.bear.dto.SearchResponse;
import com.bytedance.ee.bear.lark.p414b.AbstractC7988a;
import com.bytedance.ee.bear.lark.p414b.AbstractC8001l;
import com.bytedance.ee.bear.lark.p414b.AbstractC8010s;
import com.bytedance.ee.bear.lark.selector.DocSelectorViewData;
import com.bytedance.ee.bear.lark.selector.base.AbstractC8104c;
import com.bytedance.ee.bear.lark.selector.base.C8111f;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.space.doc.v1.DocHistory;
import com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryRequest;
import com.bytedance.lark.pb.space.doc.v1.GetDocsHistoryResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.doc.entity.C36837b;
import com.ss.android.lark.doc.entity.C36838c;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.doc.entity.Icon;
import com.ss.android.lark.sdk.SdkSender;
import io.reactivex.disposables.C68289a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.lark.selector.d */
public class C8118d extends BaseModel implements AbstractC8104c<DocSelectorViewData> {

    /* renamed from: a */
    public boolean f21689a;

    /* renamed from: b */
    public String f21690b;

    /* renamed from: c */
    public int f21691c;

    /* renamed from: d */
    public List<DocSelectorViewData> f21692d = new ArrayList();

    /* renamed from: e */
    private C68289a f21693e = new C68289a();

    @Override // com.bytedance.ee.bear.lark.selector.base.AbstractC8104c
    /* renamed from: a */
    public boolean mo31274a() {
        return this.f21689a;
    }

    /* renamed from: b */
    public DocSelectorViewData mo31275c() {
        return DocSelectorViewData.newBuilder().mo31192a(true).mo31193a();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f21693e.mo237935a();
    }

    @Override // com.bytedance.ee.bear.lark.selector.base.AbstractC8104c
    /* renamed from: a */
    public void mo31272a(UIGetDataCallback<List<DocSelectorViewData>> uIGetDataCallback) {
        String str = this.f21690b;
        int i = this.f21691c;
        m32410a(str, i, i + 30, uIGetDataCallback);
    }

    @Override // com.bytedance.ee.bear.lark.selector.base.AbstractC8104c
    /* renamed from: a */
    public void mo31271a(final C8111f<List<DocSelectorViewData>> fVar) {
        this.f21690b = "";
        this.f21691c = 0;
        if (CollectionUtils.isNotEmpty(this.f21692d)) {
            this.f21689a = false;
            if (fVar != null) {
                fVar.onSuccess(this.f21692d);
            }
        }
        m32409a(30, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<C36838c>() {
            /* class com.bytedance.ee.bear.lark.selector.C8118d.C81191 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                fVar.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(C36838c cVar) {
                boolean z;
                List<C36837b> a = cVar.mo135975a();
                ArrayList arrayList = new ArrayList(a.size());
                for (int i = 0; i < a.size(); i++) {
                    C36837b bVar = a.get(i);
                    AbstractC8001l lVar = (AbstractC8001l) KoinJavaComponent.m268610a(AbstractC8001l.class);
                    DocSelectorViewData.C8067a a2 = DocSelectorViewData.newBuilder().mo31190a(bVar.mo135955a()).mo31188a(bVar.mo135961b()).mo31194b(bVar.mo135965c()).mo31195b(bVar.mo135969e()).mo31198c(lVar.mo31005a(lVar.mo31004a(bVar.mo135969e()))).mo31199d(bVar.mo135967d()).mo31187a(bVar.mo135971f());
                    if (!bVar.mo135972g() || ((AbstractC7988a) KoinJavaComponent.m268610a(AbstractC7988a.class)).mo30979b()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    arrayList.add(a2.mo31197b(z).mo31189a(bVar.mo135973h()).mo31193a());
                }
                C8118d.this.f21692d.clear();
                C8118d.this.f21692d.addAll(arrayList);
                C8118d.this.f21689a = false;
                C8118d.this.f21691c = cVar.mo135979b();
                fVar.onSuccess(arrayList);
            }
        }));
    }

    /* renamed from: a */
    private void m32409a(int i, IGetDataCallback<C36838c> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.GET_DOCS_HISTORY, new GetDocsHistoryRequest.C19255a().mo65706a(0L).mo65708b(Long.valueOf((long) i)), iGetDataCallback, new SdkSender.IParser<C36838c>() {
            /* class com.bytedance.ee.bear.lark.selector.C8118d.C81202 */

            /* renamed from: a */
            public C36838c parse(byte[] bArr) throws IOException {
                GetDocsHistoryResponse decode = GetDocsHistoryResponse.ADAPTER.decode(bArr);
                List<DocHistory> list = decode.docs;
                C36838c cVar = new C36838c();
                cVar.mo135978a(decode.has_more.booleanValue());
                cVar.mo135976a(decode.total.intValue());
                ArrayList arrayList = new ArrayList();
                for (DocHistory docHistory : list) {
                    C36837b bVar = new C36837b();
                    bVar.mo135959a(docHistory.url);
                    bVar.mo135964b(docHistory.title);
                    bVar.mo135966c(docHistory.creator_id);
                    bVar.mo135968d(docHistory.editor_id);
                    bVar.mo135957a(DocType.forNumber(docHistory.doc_type.getValue()));
                    if (docHistory.wiki_subtype != null) {
                        bVar.mo135963b(DocType.forNumber(docHistory.wiki_subtype.getValue()));
                    }
                    bVar.mo135962b(docHistory.open_time.longValue());
                    bVar.mo135956a(docHistory.update_time.longValue());
                    bVar.mo135960a(docHistory.is_cross_tenant.booleanValue());
                    Icon icon = new Icon();
                    if (docHistory.icon != null) {
                        icon.setType(docHistory.icon.type.getValue());
                        icon.setValue(docHistory.icon.value);
                    }
                    bVar.mo135958a(icon);
                    arrayList.add(bVar);
                }
                cVar.mo135977a(arrayList);
                return cVar;
            }
        });
    }

    @Override // com.bytedance.ee.bear.lark.selector.base.AbstractC8104c
    /* renamed from: a */
    public void mo31273a(String str, UIGetDataCallback<List<DocSelectorViewData>> uIGetDataCallback) {
        this.f21690b = str;
        this.f21691c = 0;
        m32410a(str, 0, 30, uIGetDataCallback);
    }

    /* renamed from: a */
    private void m32410a(String str, final int i, int i2, final UIGetDataCallback<List<DocSelectorViewData>> uIGetDataCallback) {
        ((AbstractC8010s) KoinJavaComponent.m268610a(AbstractC8010s.class)).mo31023a(str, i, i2, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<SearchResponse>() {
            /* class com.bytedance.ee.bear.lark.selector.C8118d.C81213 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                uIGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(SearchResponse searchResponse) {
                boolean z;
                if (C8118d.this.f21690b.equals(searchResponse.getSearchKey())) {
                    C8118d.this.f21689a = searchResponse.isHasMore();
                    C8118d.this.f21691c = i + searchResponse.getMetaList().size();
                    ArrayList arrayList = new ArrayList();
                    for (C7584a aVar : searchResponse.getMetaList()) {
                        DocSelectorViewData.C8067a b = DocSelectorViewData.newBuilder().mo31199d(aVar.mo29815a()).mo31190a(aVar.mo29820f()).mo31188a(aVar.mo29818d()).mo31194b(aVar.mo29825k()).mo31198c(aVar.mo29821g()).mo31195b(aVar.mo29822h()).mo31187a(aVar.mo29819e()).mo31191a(aVar.mo29816b()).mo31196b(aVar.mo29817c());
                        if (!aVar.mo29823i() || ((AbstractC7988a) KoinJavaComponent.m268610a(AbstractC7988a.class)).mo30979b()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        arrayList.add(b.mo31197b(z).mo31189a(aVar.mo29824j()).mo31193a());
                    }
                    uIGetDataCallback.onSuccess(arrayList);
                }
            }
        }));
    }
}
