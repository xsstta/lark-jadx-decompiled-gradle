package com.ss.android.lark.moments.impl.feed.model.updater;

import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.moments.impl.common.utils.PreviewUtils;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/HotCommentPreviewUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "commentId", "", "previews", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "model", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "(Ljava/lang/String;Ljava/util/Map;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;)V", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.f */
public final class HotCommentPreviewUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final String f119962a;

    /* renamed from: b */
    private final Map<String, UrlPreviewEntity> f119963b;

    /* renamed from: c */
    private final MomentsBaseViewModel f119964c;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, UrlPreviewEntity> entry : this.f119963b.entrySet()) {
            hashMap.put(entry.getKey(), new PreviewHangPoint("", entry.getKey(), iMomentsItemBase.mo166379a(), entry.getKey(), false, entry.getValue()));
        }
        if (!(iMomentsItemBase instanceof MomentsPostVM)) {
            return iMomentsItemBase;
        }
        MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
        List<IMomentsComment> I = fVar.mo166424I();
        if (I != null) {
            List<IMomentsComment> list = I;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                if (Intrinsics.areEqual(t.mo166379a(), this.f119962a)) {
                    if (t != null) {
                        T t2 = t;
                        t = (T) MomentsCommentVM.m187494a(t2, null, null, null, PreviewUtils.f119253a.mo166211a(this.f119962a, PreviewUtils.f119253a.mo166210a(t2), this.f119963b), this.f119964c, false, null, null, null, null, 999, null);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM");
                    }
                }
                arrayList2.add(t);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return MomentsPostVM.m187537a(fVar, null, null, arrayList, null, null, this.f119964c, null, false, null, null, null, 2011, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.preview.UrlPreviewEntity> */
    /* JADX WARN: Multi-variable type inference failed */
    public HotCommentPreviewUpdater(String str, Map<String, ? extends UrlPreviewEntity> map, MomentsBaseViewModel momentsBaseViewModel) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(map, "previews");
        Intrinsics.checkParameterIsNotNull(momentsBaseViewModel, "model");
        this.f119962a = str;
        this.f119963b = map;
        this.f119964c = momentsBaseViewModel;
    }
}
