package com.bytedance.ee.bear.templates.center.list;

import com.bytedance.ee.bear.contract.NetService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001Be\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0002j\b\u0012\u0004\u0012\u00020\b`\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u0019\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0002j\b\u0012\u0004\u0012\u00020\b`\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003Jk\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0002j\b\u0012\u0004\u0012\u00020\b`\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0002j\b\u0012\u0004\u0012\u00020\b`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u0006."}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/TemplateGroupTab;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/center/list/Category;", "Lkotlin/collections/ArrayList;", ShareHitPoint.f121868c, "", "categoryTabList", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "hasMore", "", "hasData", "shareIndex", "", "err", "", "buffer", "size", "(ILjava/util/ArrayList;ZZLjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;I)V", "getBuffer", "()Ljava/lang/String;", "getCategoryTabList", "()Ljava/util/ArrayList;", "getErr", "()Ljava/lang/Throwable;", "getHasData", "()Z", "getHasMore", "getShareIndex", "getSize", "()I", "getSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TemplateGroupTab extends NetService.Result<ArrayList<Category>> {
    private final String buffer;
    private final ArrayList<CategoryTab> categoryTabList;
    private final Throwable err;
    private final boolean hasData;
    private final boolean hasMore;
    private final String shareIndex;
    private final int size;
    private final int source;

    public static /* synthetic */ TemplateGroupTab copy$default(TemplateGroupTab templateGroupTab, int i, ArrayList arrayList, boolean z, boolean z2, String str, Throwable th, String str2, int i2, int i3, Object obj) {
        return templateGroupTab.copy((i3 & 1) != 0 ? templateGroupTab.source : i, (i3 & 2) != 0 ? templateGroupTab.categoryTabList : arrayList, (i3 & 4) != 0 ? templateGroupTab.hasMore : z, (i3 & 8) != 0 ? templateGroupTab.hasData : z2, (i3 & 16) != 0 ? templateGroupTab.shareIndex : str, (i3 & 32) != 0 ? templateGroupTab.err : th, (i3 & 64) != 0 ? templateGroupTab.buffer : str2, (i3 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? templateGroupTab.size : i2);
    }

    public final int component1() {
        return this.source;
    }

    public final ArrayList<CategoryTab> component2() {
        return this.categoryTabList;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final boolean component4() {
        return this.hasData;
    }

    public final String component5() {
        return this.shareIndex;
    }

    public final Throwable component6() {
        return this.err;
    }

    public final String component7() {
        return this.buffer;
    }

    public final int component8() {
        return this.size;
    }

    public final TemplateGroupTab copy(int i, ArrayList<CategoryTab> arrayList, boolean z, boolean z2, String str, Throwable th, String str2, int i2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "categoryTabList");
        Intrinsics.checkParameterIsNotNull(str, "shareIndex");
        Intrinsics.checkParameterIsNotNull(str2, "buffer");
        return new TemplateGroupTab(i, arrayList, z, z2, str, th, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TemplateGroupTab) {
                TemplateGroupTab templateGroupTab = (TemplateGroupTab) obj;
                if ((this.source == templateGroupTab.source) && Intrinsics.areEqual(this.categoryTabList, templateGroupTab.categoryTabList)) {
                    if (this.hasMore == templateGroupTab.hasMore) {
                        if ((this.hasData == templateGroupTab.hasData) && Intrinsics.areEqual(this.shareIndex, templateGroupTab.shareIndex) && Intrinsics.areEqual(this.err, templateGroupTab.err) && Intrinsics.areEqual(this.buffer, templateGroupTab.buffer)) {
                            if (this.size == templateGroupTab.size) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.source * 31;
        ArrayList<CategoryTab> arrayList = this.categoryTabList;
        int i2 = 0;
        int hashCode = (i + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        boolean z = this.hasMore;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        boolean z2 = this.hasData;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        int i8 = (i7 + i3) * 31;
        String str = this.shareIndex;
        int hashCode2 = (i8 + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.err;
        int hashCode3 = (hashCode2 + (th != null ? th.hashCode() : 0)) * 31;
        String str2 = this.buffer;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode3 + i2) * 31) + this.size;
    }

    public String toString() {
        return "TemplateGroupTab(source=" + this.source + ", categoryTabList=" + this.categoryTabList + ", hasMore=" + this.hasMore + ", hasData=" + this.hasData + ", shareIndex=" + this.shareIndex + ", err=" + this.err + ", buffer=" + this.buffer + ", size=" + this.size + ")";
    }

    public final String getBuffer() {
        return this.buffer;
    }

    public final ArrayList<CategoryTab> getCategoryTabList() {
        return this.categoryTabList;
    }

    public final Throwable getErr() {
        return this.err;
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getShareIndex() {
        return this.shareIndex;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSource() {
        return this.source;
    }

    public TemplateGroupTab(int i, ArrayList<CategoryTab> arrayList, boolean z, boolean z2, String str, Throwable th, String str2, int i2) {
        Intrinsics.checkParameterIsNotNull(arrayList, "categoryTabList");
        Intrinsics.checkParameterIsNotNull(str, "shareIndex");
        Intrinsics.checkParameterIsNotNull(str2, "buffer");
        this.source = i;
        this.categoryTabList = arrayList;
        this.hasMore = z;
        this.hasData = z2;
        this.shareIndex = str;
        this.err = th;
        this.buffer = str2;
        this.size = i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TemplateGroupTab(int r9, java.util.ArrayList r10, boolean r11, boolean r12, java.lang.String r13, java.lang.Throwable r14, java.lang.String r15, int r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r10
        L_0x000d:
            r2 = r0 & 4
            r3 = 0
            if (r2 == 0) goto L_0x0014
            r2 = 0
            goto L_0x0015
        L_0x0014:
            r2 = r11
        L_0x0015:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = r12
        L_0x001c:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0023
            java.lang.String r5 = "0"
            goto L_0x0024
        L_0x0023:
            r5 = r13
        L_0x0024:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x002c
            r6 = 0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            goto L_0x002d
        L_0x002c:
            r6 = r14
        L_0x002d:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0034
            java.lang.String r7 = ""
            goto L_0x0035
        L_0x0034:
            r7 = r15
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r3 = r16
        L_0x003c:
            r10 = r8
            r11 = r9
            r12 = r1
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.center.list.TemplateGroupTab.<init>(int, java.util.ArrayList, boolean, boolean, java.lang.String, java.lang.Throwable, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
