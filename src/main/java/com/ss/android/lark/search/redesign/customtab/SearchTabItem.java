package com.ss.android.lark.search.redesign.customtab;

import android.graphics.drawable.Drawable;
import com.ss.android.lark.pb.searches.SearchTab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\rJ\b\u0010\u0010\u001a\u00020\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0012\u001a\u00020\u0001H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/SearchTabItem;", "Lcom/ss/android/lark/search/redesign/customtab/TabItem;", "searchTab", "Lcom/ss/android/lark/pb/searches/SearchTab;", "name", "", "icon", "Landroid/graphics/drawable/Drawable;", "needShow", "", "unmovable", "primaryOnly", "added", "(Lcom/ss/android/lark/pb/searches/SearchTab;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZZZZ)V", "getSearchTab", "()Lcom/ss/android/lark/pb/searches/SearchTab;", "toAddedItem", "toRemovedItem", "toggle", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.customtab.d */
public final class SearchTabItem extends TabItem {

    /* renamed from: b */
    private final SearchTab f132654b;

    /* renamed from: m */
    public final SearchTab mo183288m() {
        return this.f132654b;
    }

    @Override // com.ss.android.lark.search.redesign.customtab.TabItem
    /* renamed from: j */
    public TabItem mo183246f() {
        SearchTabItem dVar = new SearchTabItem(this.f132654b, mo183255r(), mo183256s(), mo183257t(), mo183275g(), mo183276h(), !mo183277i());
        dVar.mo183240a(mo183253p());
        dVar.mo183242a(mo183254q());
        return dVar;
    }

    @Override // com.ss.android.lark.search.redesign.customtab.TabItem
    /* renamed from: k */
    public TabItem mo183243d() {
        if (mo183277i()) {
            return this;
        }
        SearchTabItem dVar = new SearchTabItem(this.f132654b, mo183255r(), mo183256s(), mo183257t(), mo183275g(), mo183276h(), true);
        dVar.mo183240a(mo183253p());
        dVar.mo183242a(mo183254q());
        return dVar;
    }

    @Override // com.ss.android.lark.search.redesign.customtab.TabItem
    /* renamed from: l */
    public TabItem mo183244e() {
        if (!mo183277i()) {
            return this;
        }
        SearchTabItem dVar = new SearchTabItem(this.f132654b, mo183255r(), mo183256s(), mo183257t(), mo183275g(), mo183276h(), false);
        dVar.mo183240a(mo183253p());
        dVar.mo183242a(mo183254q());
        return dVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchTabItem(SearchTab searchTab, String str, Drawable drawable, boolean z, boolean z2, boolean z3, boolean z4) {
        super(str, drawable, z, z2, z3, z4);
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f132654b = searchTab;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchTabItem(com.ss.android.lark.pb.searches.SearchTab r10, java.lang.String r11, android.graphics.drawable.Drawable r12, boolean r13, boolean r14, boolean r15, boolean r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto L_0x0009
            r0 = 0
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r4 = r0
            goto L_0x000a
        L_0x0009:
            r4 = r12
        L_0x000a:
            r0 = r17 & 64
            if (r0 == 0) goto L_0x0011
            r0 = 0
            r8 = 0
            goto L_0x0013
        L_0x0011:
            r8 = r16
        L_0x0013:
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.search.redesign.customtab.SearchTabItem.<init>(com.ss.android.lark.pb.searches.SearchTab, java.lang.String, android.graphics.drawable.Drawable, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
