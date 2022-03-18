package com.bytedance.ee.bear.document.titlebar.badge;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u001e\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u000bJ\u0006\u0010\u0016\u001a\u00020\u000bJ\u0016\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\u0016\u0010\u001d\u001a\u00020\u00192\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/document/titlebar/badge/TitleBarBadgeStrategyManger;", "", "()V", "docMoreBadgeStrategyList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/document/titlebar/badge/ITitleBarBadgeStrategy;", "Lkotlin/collections/ArrayList;", "docTitleShareBadgeStrategyList", "driveMoreBadgeStrategyList", "driveShareBadgeStrategyList", "addDocMoreStrategy", "", "strategy", "addDocShareStrategy", "addDriveMoreStrategy", "addDriveShareStrategy", "addMoreStrategy", "list", "", "markDocMoreBadgeNotNew", "markDocShareBadgeNotNew", "markDriveMoreBadgeNotNew", "markDriveShareBadgeNotNew", "markMoreBadgeNotNew", "needDocShowMoreBadge", "", "needDocShowShareBadge", "needDriveShowMoreBadge", "needDriveShowShareBadge", "needShowMoreBadge", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.titlebar.a.e */
public final class TitleBarBadgeStrategyManger {

    /* renamed from: a */
    private final ArrayList<ITitleBarBadgeStrategy> f17267a = CollectionsKt.arrayListOf(new MultiTaskMoreBadgeStrategy());

    /* renamed from: b */
    private final ArrayList<ITitleBarBadgeStrategy> f17268b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<ITitleBarBadgeStrategy> f17269c = CollectionsKt.arrayListOf(new MultiTaskMoreBadgeStrategy());

    /* renamed from: d */
    private final ArrayList<ITitleBarBadgeStrategy> f17270d = new ArrayList<>();

    /* renamed from: b */
    public final void mo25035b() {
        m25003b(this.f17267a);
    }

    /* renamed from: d */
    public final void mo25039d() {
        m25003b(this.f17268b);
    }

    /* renamed from: f */
    public final void mo25041f() {
        m25003b(this.f17269c);
    }

    /* renamed from: h */
    public final void mo25043h() {
        m25003b(this.f17270d);
    }

    /* renamed from: e */
    public final boolean mo25040e() {
        return m25002a(this.f17269c);
    }

    /* renamed from: g */
    public final boolean mo25042g() {
        return m25002a(this.f17270d);
    }

    /* renamed from: c */
    public final boolean mo25038c() {
        return m25002a(this.f17268b);
    }

    /* renamed from: a */
    public final boolean mo25034a() {
        return m25002a(this.f17267a);
    }

    /* renamed from: a */
    public final void mo25033a(ITitleBarBadgeStrategy cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "strategy");
        m25001a(this.f17267a, cVar);
    }

    /* renamed from: b */
    public final void mo25036b(ITitleBarBadgeStrategy cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "strategy");
        m25001a(this.f17268b, cVar);
    }

    /* renamed from: c */
    public final void mo25037c(ITitleBarBadgeStrategy cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "strategy");
        m25001a(this.f17269c, cVar);
    }

    /* renamed from: a */
    private final boolean m25002a(List<ITitleBarBadgeStrategy> list) {
        for (ITitleBarBadgeStrategy cVar : list) {
            if (cVar.mo25030b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m25003b(List<ITitleBarBadgeStrategy> list) {
        for (ITitleBarBadgeStrategy cVar : list) {
            if (cVar.mo25030b() && cVar.mo25032d()) {
                cVar.mo25031c();
            }
        }
    }

    /* renamed from: a */
    private final void m25001a(List<ITitleBarBadgeStrategy> list, ITitleBarBadgeStrategy cVar) {
        for (ITitleBarBadgeStrategy cVar2 : list) {
            if (Intrinsics.areEqual(cVar2.mo25029a(), cVar.mo25029a())) {
                return;
            }
        }
        list.add(cVar);
    }
}
