package com.bytedance.ee.bear.templates.center.list;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u000e¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eHÆ\u0003J\u001b\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u000eHÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u000eHÆ\u0001J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\u0013\u0010.\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0011HÖ\u0001J\t\u00102\u001a\u00020\u000fHÖ\u0001J\u0019\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R#\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00069"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/Category;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "name", "", "hasMore", "", "templates", "", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "categoryId", "", "loadFirstTab", "templateMap", "", "", "categoryPage", "", "", "(Ljava/lang/CharSequence;ZLjava/util/List;JZLjava/util/Map;Ljava/util/Map;)V", "getCategoryId", "()J", "setCategoryId", "(J)V", "getCategoryPage", "()Ljava/util/Map;", "getHasMore", "()Z", "setHasMore", "(Z)V", "getLoadFirstTab", "setLoadFirstTab", "getName", "()Ljava/lang/CharSequence;", "getTemplateMap", "getTemplates", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class Category implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11474b();
    public static final Companion Companion = new Companion(null);
    private long categoryId;
    private final Map<Integer, List<TemplateV4>> categoryPage;
    private boolean hasMore;
    private boolean loadFirstTab;
    private final CharSequence name;
    private final Map<String, TemplateV4> templateMap;
    private final List<TemplateV4> templates;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.Category$b */
    public static class C11474b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((TemplateV4) TemplateV4.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            long readLong = parcel.readLong();
            boolean z2 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            while (readInt2 != 0) {
                linkedHashMap.put(parcel.readString(), (TemplateV4) TemplateV4.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
            while (readInt3 != 0) {
                Integer valueOf = Integer.valueOf(parcel.readInt());
                int readInt4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt4);
                while (readInt4 != 0) {
                    arrayList2.add((TemplateV4) TemplateV4.CREATOR.createFromParcel(parcel));
                    readInt4--;
                }
                linkedHashMap2.put(valueOf, arrayList2);
                readInt3--;
            }
            return new Category(charSequence, z, arrayList, readLong, z2, linkedHashMap, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Category[i];
        }
    }

    public Category() {
        this(null, false, null, 0, false, null, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
    }

    public static /* synthetic */ Category copy$default(Category category, CharSequence charSequence, boolean z, List list, long j, boolean z2, Map map, Map map2, int i, Object obj) {
        return category.copy((i & 1) != 0 ? category.name : charSequence, (i & 2) != 0 ? category.hasMore : z, (i & 4) != 0 ? category.templates : list, (i & 8) != 0 ? category.categoryId : j, (i & 16) != 0 ? category.loadFirstTab : z2, (i & 32) != 0 ? category.templateMap : map, (i & 64) != 0 ? category.categoryPage : map2);
    }

    public final CharSequence component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final List<TemplateV4> component3() {
        return this.templates;
    }

    public final long component4() {
        return this.categoryId;
    }

    public final boolean component5() {
        return this.loadFirstTab;
    }

    public final Map<String, TemplateV4> component6() {
        return this.templateMap;
    }

    public final Map<Integer, List<TemplateV4>> component7() {
        return this.categoryPage;
    }

    public final Category copy(CharSequence charSequence, boolean z, List<TemplateV4> list, long j, boolean z2, Map<String, TemplateV4> map, Map<Integer, List<TemplateV4>> map2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "name");
        Intrinsics.checkParameterIsNotNull(list, "templates");
        Intrinsics.checkParameterIsNotNull(map, "templateMap");
        Intrinsics.checkParameterIsNotNull(map2, "categoryPage");
        return new Category(charSequence, z, list, j, z2, map, map2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Category) {
                Category category = (Category) obj;
                if (Intrinsics.areEqual(this.name, category.name)) {
                    if ((this.hasMore == category.hasMore) && Intrinsics.areEqual(this.templates, category.templates)) {
                        if (this.categoryId == category.categoryId) {
                            if (!(this.loadFirstTab == category.loadFirstTab) || !Intrinsics.areEqual(this.templateMap, category.templateMap) || !Intrinsics.areEqual(this.categoryPage, category.categoryPage)) {
                                return false;
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
        CharSequence charSequence = this.name;
        int i = 0;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        boolean z = this.hasMore;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        List<TemplateV4> list = this.templates;
        int hashCode2 = list != null ? list.hashCode() : 0;
        long j = this.categoryId;
        int i7 = (((i6 + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z2 = this.loadFirstTab;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i8 = (i7 + i2) * 31;
        Map<String, TemplateV4> map = this.templateMap;
        int hashCode3 = (i8 + (map != null ? map.hashCode() : 0)) * 31;
        Map<Integer, List<TemplateV4>> map2 = this.categoryPage;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Category(name=" + this.name + ", hasMore=" + this.hasMore + ", templates=" + this.templates + ", categoryId=" + this.categoryId + ", loadFirstTab=" + this.loadFirstTab + ", templateMap=" + this.templateMap + ", categoryPage=" + this.categoryPage + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        TextUtils.writeToParcel(this.name, parcel, 0);
        parcel.writeInt(this.hasMore ? 1 : 0);
        List<TemplateV4> list = this.templates;
        parcel.writeInt(list.size());
        for (TemplateV4 templateV4 : list) {
            templateV4.writeToParcel(parcel, 0);
        }
        parcel.writeLong(this.categoryId);
        parcel.writeInt(this.loadFirstTab ? 1 : 0);
        Map<String, TemplateV4> map = this.templateMap;
        parcel.writeInt(map.size());
        for (Map.Entry<String, TemplateV4> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, 0);
        }
        Map<Integer, List<TemplateV4>> map2 = this.categoryPage;
        parcel.writeInt(map2.size());
        for (Map.Entry<Integer, List<TemplateV4>> entry2 : map2.entrySet()) {
            parcel.writeInt(entry2.getKey().intValue());
            List<TemplateV4> value = entry2.getValue();
            parcel.writeInt(value.size());
            for (TemplateV4 templateV42 : value) {
                templateV42.writeToParcel(parcel, 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/list/Category$Companion;", "", "()V", "CUSTOM_OWNER_ID", "", "CUSTOM_SHARE_ID", "DEFAULT_CATEGORY_ID", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.list.Category$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final Map<Integer, List<TemplateV4>> getCategoryPage() {
        return this.categoryPage;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getLoadFirstTab() {
        return this.loadFirstTab;
    }

    public final CharSequence getName() {
        return this.name;
    }

    public final Map<String, TemplateV4> getTemplateMap() {
        return this.templateMap;
    }

    public final List<TemplateV4> getTemplates() {
        return this.templates;
    }

    public final void setCategoryId(long j) {
        this.categoryId = j;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLoadFirstTab(boolean z) {
        this.loadFirstTab = z;
    }

    public Category(CharSequence charSequence, boolean z, List<TemplateV4> list, long j, boolean z2, Map<String, TemplateV4> map, Map<Integer, List<TemplateV4>> map2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "name");
        Intrinsics.checkParameterIsNotNull(list, "templates");
        Intrinsics.checkParameterIsNotNull(map, "templateMap");
        Intrinsics.checkParameterIsNotNull(map2, "categoryPage");
        this.name = charSequence;
        this.hasMore = z;
        this.templates = list;
        this.categoryId = j;
        this.loadFirstTab = z2;
        this.templateMap = map;
        this.categoryPage = map2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Category(java.lang.CharSequence r9, boolean r10, java.util.List r11, long r12, boolean r14, java.util.Map r15, java.util.Map r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17 & 1
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = ""
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto L_0x000a
        L_0x0009:
            r0 = r9
        L_0x000a:
            r1 = r17 & 2
            if (r1 == 0) goto L_0x0010
            r1 = 0
            goto L_0x0011
        L_0x0010:
            r1 = r10
        L_0x0011:
            r2 = r17 & 4
            if (r2 == 0) goto L_0x001d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            goto L_0x001e
        L_0x001d:
            r2 = r11
        L_0x001e:
            r3 = r17 & 8
            if (r3 == 0) goto L_0x0025
            r3 = -1
            goto L_0x0026
        L_0x0025:
            r3 = r12
        L_0x0026:
            r5 = r17 & 16
            if (r5 == 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = r14
        L_0x002d:
            r6 = r17 & 32
            if (r6 == 0) goto L_0x0039
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r6 = (java.util.Map) r6
            goto L_0x003a
        L_0x0039:
            r6 = r15
        L_0x003a:
            r7 = r17 & 64
            if (r7 == 0) goto L_0x0046
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Map r7 = (java.util.Map) r7
            goto L_0x0048
        L_0x0046:
            r7 = r16
        L_0x0048:
            r9 = r8
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r15 = r5
            r16 = r6
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.center.list.Category.<init>(java.lang.CharSequence, boolean, java.util.List, long, boolean, java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
