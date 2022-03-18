package com.bytedance.ee.bear.templates.search.base;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.larksuite.framework.mvp.IModel;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H&J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H&J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/templates/search/base/ISearchListModel;", "Lcom/larksuite/framework/mvp/IModel;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "offset", "", "searchKey", "", "buffer", "createTemplate", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "module", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "isLoadMore", "", "loadMore", "loadSearchData", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.search.a.f */
public interface ISearchListModel extends IModel {
    /* renamed from: a */
    NetService.C5076e mo44654a(int i, String str, String str2);

    /* renamed from: a */
    AbstractC68307f<DocumentCreateInfo> mo44656a(TemplateV4 templateV4, String str, String str2);

    /* renamed from: a */
    AbstractC68307f<TemplateGroupTab> mo44657a(String str);

    /* renamed from: b */
    AbstractC68307f<TemplateGroupTab> mo44658b(int i, String str, String str2);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.search.a.f$a */
    public static final class C11650a {
        /* renamed from: a */
        public static /* synthetic */ NetService.C5076e m48340a(ISearchListModel fVar, int i, String str, String str2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    str = "";
                }
                if ((i2 & 4) != 0) {
                    str2 = "";
                }
                return fVar.mo44654a(i, str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildRequest");
        }
    }
}
