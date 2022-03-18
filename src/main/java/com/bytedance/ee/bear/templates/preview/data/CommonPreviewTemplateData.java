package com.bytedance.ee.bear.templates.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u0019\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0003Ji\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/data/CommonPreviewTemplateData;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "templateSource", "", "templateCenterSource", "templateSort", "templateTag", "parentToken", "module", "initIndex", "", "list", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/templates/preview/data/Item;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;)V", "getInitIndex", "()I", "getList", "()Ljava/util/ArrayList;", "getModule", "()Ljava/lang/String;", "getParentToken", "getTemplateCenterSource", "getTemplateSort", "getTemplateSource", "getTemplateTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommonPreviewTemplateData implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11569a();
    private final int initIndex;
    private final ArrayList<Item> list;
    private final String module;
    private final String parentToken;
    private final String templateCenterSource;
    private final String templateSort;
    private final String templateSource;
    private final String templateTag;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.data.CommonPreviewTemplateData$a */
    public static class C11569a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList.add((Item) Item.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new CommonPreviewTemplateData(readString, readString2, readString3, readString4, readString5, readString6, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommonPreviewTemplateData[i];
        }
    }

    public static /* synthetic */ CommonPreviewTemplateData copy$default(CommonPreviewTemplateData commonPreviewTemplateData, String str, String str2, String str3, String str4, String str5, String str6, int i, ArrayList arrayList, int i2, Object obj) {
        return commonPreviewTemplateData.copy((i2 & 1) != 0 ? commonPreviewTemplateData.templateSource : str, (i2 & 2) != 0 ? commonPreviewTemplateData.templateCenterSource : str2, (i2 & 4) != 0 ? commonPreviewTemplateData.templateSort : str3, (i2 & 8) != 0 ? commonPreviewTemplateData.templateTag : str4, (i2 & 16) != 0 ? commonPreviewTemplateData.parentToken : str5, (i2 & 32) != 0 ? commonPreviewTemplateData.module : str6, (i2 & 64) != 0 ? commonPreviewTemplateData.initIndex : i, (i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? commonPreviewTemplateData.list : arrayList);
    }

    public final String component1() {
        return this.templateSource;
    }

    public final String component2() {
        return this.templateCenterSource;
    }

    public final String component3() {
        return this.templateSort;
    }

    public final String component4() {
        return this.templateTag;
    }

    public final String component5() {
        return this.parentToken;
    }

    public final String component6() {
        return this.module;
    }

    public final int component7() {
        return this.initIndex;
    }

    public final ArrayList<Item> component8() {
        return this.list;
    }

    public final CommonPreviewTemplateData copy(String str, String str2, String str3, String str4, String str5, String str6, int i, ArrayList<Item> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "templateSource");
        Intrinsics.checkParameterIsNotNull(str2, "templateCenterSource");
        Intrinsics.checkParameterIsNotNull(str3, "templateSort");
        Intrinsics.checkParameterIsNotNull(str4, "templateTag");
        Intrinsics.checkParameterIsNotNull(str5, "parentToken");
        Intrinsics.checkParameterIsNotNull(str6, "module");
        Intrinsics.checkParameterIsNotNull(arrayList, "list");
        return new CommonPreviewTemplateData(str, str2, str3, str4, str5, str6, i, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommonPreviewTemplateData) {
                CommonPreviewTemplateData commonPreviewTemplateData = (CommonPreviewTemplateData) obj;
                if (Intrinsics.areEqual(this.templateSource, commonPreviewTemplateData.templateSource) && Intrinsics.areEqual(this.templateCenterSource, commonPreviewTemplateData.templateCenterSource) && Intrinsics.areEqual(this.templateSort, commonPreviewTemplateData.templateSort) && Intrinsics.areEqual(this.templateTag, commonPreviewTemplateData.templateTag) && Intrinsics.areEqual(this.parentToken, commonPreviewTemplateData.parentToken) && Intrinsics.areEqual(this.module, commonPreviewTemplateData.module)) {
                    if (!(this.initIndex == commonPreviewTemplateData.initIndex) || !Intrinsics.areEqual(this.list, commonPreviewTemplateData.list)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.templateSource;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.templateCenterSource;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.templateSort;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.templateTag;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.parentToken;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.module;
        int hashCode6 = (((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.initIndex) * 31;
        ArrayList<Item> arrayList = this.list;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "CommonPreviewTemplateData(templateSource=" + this.templateSource + ", templateCenterSource=" + this.templateCenterSource + ", templateSort=" + this.templateSort + ", templateTag=" + this.templateTag + ", parentToken=" + this.parentToken + ", module=" + this.module + ", initIndex=" + this.initIndex + ", list=" + this.list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.templateSource);
        parcel.writeString(this.templateCenterSource);
        parcel.writeString(this.templateSort);
        parcel.writeString(this.templateTag);
        parcel.writeString(this.parentToken);
        parcel.writeString(this.module);
        parcel.writeInt(this.initIndex);
        ArrayList<Item> arrayList = this.list;
        parcel.writeInt(arrayList.size());
        for (Item item : arrayList) {
            item.writeToParcel(parcel, 0);
        }
    }

    public final int getInitIndex() {
        return this.initIndex;
    }

    public final ArrayList<Item> getList() {
        return this.list;
    }

    public final String getModule() {
        return this.module;
    }

    public final String getParentToken() {
        return this.parentToken;
    }

    public final String getTemplateCenterSource() {
        return this.templateCenterSource;
    }

    public final String getTemplateSort() {
        return this.templateSort;
    }

    public final String getTemplateSource() {
        return this.templateSource;
    }

    public final String getTemplateTag() {
        return this.templateTag;
    }

    public CommonPreviewTemplateData(String str, String str2, String str3, String str4, String str5, String str6, int i, ArrayList<Item> arrayList) {
        Intrinsics.checkParameterIsNotNull(str, "templateSource");
        Intrinsics.checkParameterIsNotNull(str2, "templateCenterSource");
        Intrinsics.checkParameterIsNotNull(str3, "templateSort");
        Intrinsics.checkParameterIsNotNull(str4, "templateTag");
        Intrinsics.checkParameterIsNotNull(str5, "parentToken");
        Intrinsics.checkParameterIsNotNull(str6, "module");
        Intrinsics.checkParameterIsNotNull(arrayList, "list");
        this.templateSource = str;
        this.templateCenterSource = str2;
        this.templateSort = str3;
        this.templateTag = str4;
        this.parentToken = str5;
        this.module = str6;
        this.initIndex = i;
        this.list = arrayList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CommonPreviewTemplateData(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.util.ArrayList r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r12
        L_0x0009:
            r0 = r20 & 2
            if (r0 == 0) goto L_0x000f
            r4 = r1
            goto L_0x0010
        L_0x000f:
            r4 = r13
        L_0x0010:
            r0 = r20 & 4
            if (r0 == 0) goto L_0x0016
            r5 = r1
            goto L_0x0017
        L_0x0016:
            r5 = r14
        L_0x0017:
            r0 = r20 & 8
            if (r0 == 0) goto L_0x001d
            r6 = r1
            goto L_0x001e
        L_0x001d:
            r6 = r15
        L_0x001e:
            r0 = r20 & 16
            if (r0 == 0) goto L_0x0024
            r7 = r1
            goto L_0x0026
        L_0x0024:
            r7 = r16
        L_0x0026:
            r0 = r20 & 32
            if (r0 == 0) goto L_0x002c
            r8 = r1
            goto L_0x002e
        L_0x002c:
            r8 = r17
        L_0x002e:
            r2 = r11
            r9 = r18
            r10 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.preview.data.CommonPreviewTemplateData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
