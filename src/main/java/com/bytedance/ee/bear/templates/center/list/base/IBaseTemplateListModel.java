package com.bytedance.ee.bear.templates.center.list.base;

import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.center.list.TemplateGroupTab;
import com.larksuite.framework.mvp.IModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 !2\u00020\u0001:\u0001!J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H&J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&J>\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J2\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel;", "Lcom/larksuite/framework/mvp/IModel;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "lastIndex", "", "filterType", "", "isLoadMore", "", "categoryId", "", "pageNumber", "createTemplate", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "parentToken", "module", "getCacheKey", "getFilterTypeLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "getParser", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", ShareHitPoint.f121868c, "cacheKey", "needCache", "loadData", "loadMore", "switchDocToDocXFilterType", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.center.list.a.e */
public interface IBaseTemplateListModel extends IModel {

    /* renamed from: b */
    public static final Companion f30931b = Companion.f30932a;

    /* renamed from: a */
    NetService.AbstractC5074c<TemplateGroupTab> mo44200a(int i, int i2, String str, boolean z, boolean z2, long j);

    /* renamed from: a */
    NetService.C5076e mo44201a(String str, int i, boolean z, long j, int i2);

    /* renamed from: a */
    AbstractC68307f<DocumentCreateInfo> mo44134a(TemplateV4 templateV4, String str, String str2);

    /* renamed from: a */
    AbstractC68307f<TemplateGroupTab> mo44135a(String str, int i);

    /* renamed from: a */
    AbstractC68307f<TemplateGroupTab> mo44136a(String str, int i, long j, int i2);

    /* renamed from: a */
    boolean mo44139a(int i);

    /* renamed from: d */
    String mo44202d();

    /* renamed from: e */
    LiveData<C8275a> mo44203e();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/base/IBaseTemplateListModel$Companion;", "", "()V", "FILTER_TYPE_NONE", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.e$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f30932a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.a.e$b */
    public static final class C11502b {
        /* renamed from: a */
        public static /* synthetic */ AbstractC68307f m47833a(IBaseTemplateListModel eVar, String str, int i, long j, int i2, int i3, Object obj) {
            int i4;
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    j = -1;
                }
                if ((i3 & 8) != 0) {
                    i4 = 0;
                } else {
                    i4 = i2;
                }
                return eVar.mo44136a(str, i, j, i4);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMore");
        }
    }
}
