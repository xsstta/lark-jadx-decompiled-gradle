package com.ss.android.lark.moments.impl.commonvo.item;

import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "labelType", "", "countProvider", "Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem$ICountProvider;", "(ILcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem$ICountProvider;)V", "getCountProvider", "()Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem$ICountProvider;", "id", "", "getId", "()Ljava/lang/String;", "getLabelType", "()I", "getItemType", "isContentSame", "", "diffable", "isItemSame", "Companion", "ICountProvider", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.item.f */
public final class MomentsDetailLabelItem implements IMomentsItemBase {

    /* renamed from: a */
    public static final Companion f119483a = new Companion(null);

    /* renamed from: b */
    private final String f119484b = "MomentsDetailCountItem";

    /* renamed from: c */
    private final int f119485c;

    /* renamed from: d */
    private final ICountProvider f119486d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem$ICountProvider;", "", "providerCurrentCount", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.commonvo.item.f$b */
    public interface ICountProvider {
        /* renamed from: a */
        int mo166484a();
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/item/MomentsDetailLabelItem$Companion;", "", "()V", "ITEM_ID", "", "LABEL_TYPE_ALL", "", "LABEL_TYPE_HOT", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.commonvo.item.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f119484b;
    }

    /* renamed from: b */
    public final int mo166481b() {
        return this.f119485c;
    }

    /* renamed from: c */
    public final ICountProvider mo166483c() {
        return this.f119486d;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_DETAIL_COUNT_HEAD.ordinal();
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        if (iMomentsItemBase == null || !(iMomentsItemBase instanceof MomentsDetailLabelItem) || this.f119485c != ((MomentsDetailLabelItem) iMomentsItemBase).f119485c) {
            return false;
        }
        return true;
    }

    public MomentsDetailLabelItem(int i, ICountProvider bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "countProvider");
        this.f119485c = i;
        this.f119486d = bVar;
    }
}
