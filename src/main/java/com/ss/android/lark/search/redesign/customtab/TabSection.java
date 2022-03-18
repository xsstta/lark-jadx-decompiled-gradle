package com.ss.android.lark.search.redesign.customtab;

import com.p943f.p944a.AbstractC20966c;
import com.p943f.p944a.C20981l;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/TabSection;", "Lcom/xwray/groupie/Section;", "header", "Lcom/xwray/groupie/Group;", "children", "", "(Lcom/xwray/groupie/Group;Ljava/util/Collection;)V", "equals", "", "other", "", "hashCode", "", "setHeader", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.customtab.g */
public final class TabSection extends C20981l {

    /* renamed from: a */
    private final AbstractC20966c f132660a;

    public int hashCode() {
        AbstractC20966c cVar = this.f132660a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!Intrinsics.areEqual(getClass(), obj.getClass()))) {
            return false;
        }
        return Intrinsics.areEqual(this.f132660a, ((TabSection) obj).f132660a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabSection(AbstractC20966c cVar, Collection<? extends AbstractC20966c> collection) {
        super(cVar, collection);
        Intrinsics.checkParameterIsNotNull(collection, "children");
        this.f132660a = cVar;
    }
}
