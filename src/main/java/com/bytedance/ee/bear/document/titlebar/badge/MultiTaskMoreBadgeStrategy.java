package com.bytedance.ee.bear.document.titlebar.badge;

import com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/titlebar/badge/MultiTaskMoreBadgeStrategy;", "Lcom/bytedance/ee/bear/document/titlebar/badge/ITitleBarBadgeStrategy;", "()V", "TAG", "", "TITLE_ID_MULTI_TASK", "getId", "isNew", "", "markNotNew", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.titlebar.a.d */
public final class MultiTaskMoreBadgeStrategy implements ITitleBarBadgeStrategy {

    /* renamed from: a */
    private final String f17265a = "MultiTaskMoreBadge";

    /* renamed from: b */
    private final String f17266b = "title_multiTask";

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: a */
    public String mo25029a() {
        return this.f17266b;
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: d */
    public boolean mo25032d() {
        return ITitleBarBadgeStrategy.C6197a.m24996a(this);
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: c */
    public void mo25031c() {
        ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38980b(this.f17266b);
    }

    @Override // com.bytedance.ee.bear.document.titlebar.badge.ITitleBarBadgeStrategy
    /* renamed from: b */
    public boolean mo25030b() {
        boolean a = ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38977a(this.f17266b);
        String str = this.f17265a;
        C13479a.m54764b(str, "isNew: " + a);
        return a;
    }
}
