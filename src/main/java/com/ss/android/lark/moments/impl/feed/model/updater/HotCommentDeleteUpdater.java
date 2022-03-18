package com.ss.android.lark.moments.impl.feed.model.updater;

import com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.commonvo.item.MomentsDetailLabelItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/HotCommentDeleteUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "commentId", "", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;", "(Ljava/lang/String;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;)V", "getModel", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.e */
public final class HotCommentDeleteUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final String f119960a;

    /* renamed from: b */
    private final IMomentsPostModel f119961b;

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.lark.moments.impl.commonvo.item.f */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        ArrayList arrayList = null;
        boolean z = true;
        if (iMomentsItemBase instanceof MomentsPostVM) {
            MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
            List<IMomentsComment> I = fVar.mo166424I();
            if (I != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : I) {
                    if (!Intrinsics.areEqual(t.mo166379a(), this.f119960a)) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            }
            return MomentsPostVM.m187537a(fVar, null, null, arrayList, null, null, this.f119961b, null, false, null, null, null, 2011, null);
        } else if (!(iMomentsItemBase instanceof MomentsDetailLabelItem)) {
            return iMomentsItemBase;
        } else {
            MomentsDetailLabelItem fVar2 = (MomentsDetailLabelItem) iMomentsItemBase;
            if (fVar2.mo166483c().mo166484a() <= 1) {
                z = false;
            }
            if (z) {
                arrayList = fVar2;
            }
            return (IMomentsItemBase) arrayList;
        }
    }

    public HotCommentDeleteUpdater(String str, IMomentsPostModel bVar) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        this.f119960a = str;
        this.f119961b = bVar;
    }
}
