package com.bytedance.ee.bear.more.moreprotocol;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\u000b\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/MoreItemGroup;", "", "()V", "groupType", "", "moreItemList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/more/moreprotocol/IBaseMoreItem;", "Lkotlin/collections/ArrayList;", "showDivider", "", "addMoreItem", "moreItem", "enable", "checkGroup", "", "getGroupType", "getMoreItemList", "hideDivider", "isShowDivider", "setGroupType", "Companion", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.more.moreprotocol.c */
public final class MoreItemGroup {

    /* renamed from: a */
    public static final Companion f27621a = new Companion(null);

    /* renamed from: b */
    private int f27622b = 3;

    /* renamed from: c */
    private final ArrayList<IBaseMoreItem> f27623c = new ArrayList<>();

    /* renamed from: d */
    private boolean f27624d;

    /* renamed from: a */
    public final MoreItemGroup mo39168a() {
        this.f27624d = false;
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/MoreItemGroup$Companion;", "", "()V", "GROUP_TYPE_CUSTOM", "", "GROUP_TYPE_GRID", "GROUP_TYPE_NORMAL", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.moreprotocol.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo39172b() {
        return this.f27622b;
    }

    /* renamed from: c */
    public final ArrayList<IBaseMoreItem> mo39173c() {
        return this.f27623c;
    }

    /* renamed from: d */
    public final boolean mo39174d() {
        return this.f27624d;
    }

    /* renamed from: e */
    private final void m42716e() {
        if (this.f27622b == 2 && this.f27623c.size() > 0) {
            throw new IllegalArgumentException("custom group only allow one moreItem");
        }
    }

    /* renamed from: a */
    public final MoreItemGroup mo39169a(int i) {
        this.f27622b = i;
        return this;
    }

    /* renamed from: a */
    public final MoreItemGroup mo39170a(IBaseMoreItem iBaseMoreItem) {
        if (iBaseMoreItem != null) {
            m42716e();
            this.f27623c.add(iBaseMoreItem);
        }
        return this;
    }

    /* renamed from: a */
    public final MoreItemGroup mo39171a(IBaseMoreItem iBaseMoreItem, boolean z) {
        if (z && iBaseMoreItem != null) {
            m42716e();
            this.f27623c.add(iBaseMoreItem);
        }
        return this;
    }
}
