package com.bytedance.ee.bear.document.titlebar.badge;

import com.bytedance.ee.bear.guide.p396b.C7811a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/document/titlebar/badge/DocsAppShareBadgeStrategy;", "Lcom/bytedance/ee/bear/document/titlebar/badge/ITitleBarBadgeStrategy;", ShareHitPoint.f121869d, "", "isOwner", "", "(IZ)V", "()Z", "getType", "()I", "autoMarkNotNewAfterClick", "getId", "", "isNew", "markNotNew", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.titlebar.a.b */
public final class DocsAppShareBadgeStrategy implements ITitleBarBadgeStrategy {

    /* renamed from: a */
    private final int f17263a;

    /* renamed from: b */
    private final boolean f17264b;

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: a */
    public String mo25029a() {
        return "mobile_doc_share_callout";
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: c */
    public void mo25031c() {
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: d */
    public boolean mo25032d() {
        return false;
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: b */
    public boolean mo25030b() {
        boolean z;
        boolean a = C7811a.m31302a(this.f17264b);
        C8275a aVar = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.SHEET");
        if (aVar.mo32555b() == this.f17263a) {
            z = true;
        } else {
            z = false;
        }
        C13479a.m54764b("DocsAppShareBadgeStrategy", "shouldShowBadge=" + a + ", isSheet=" + z);
        if (!a || z) {
            return false;
        }
        return true;
    }

    public DocsAppShareBadgeStrategy(int i, boolean z) {
        this.f17263a = i;
        this.f17264b = z;
    }
}
