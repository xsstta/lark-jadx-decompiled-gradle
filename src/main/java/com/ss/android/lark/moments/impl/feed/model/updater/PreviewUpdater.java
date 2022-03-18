package com.ss.android.lark.moments.impl.feed.model.updater;

import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.moments.impl.common.utils.PreviewUtils;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/PreviewUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "previews", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "model", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "(Ljava/util/Map;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;)V", "getModel", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "getPreviews", "()Ljava/util/Map;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.m */
public final class PreviewUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final Map<String, UrlPreviewEntity> f119978a;

    /* renamed from: b */
    private final MomentsBaseViewModel f119979b;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        Map<String, PreviewHangPoint> a = PreviewUtils.f119253a.mo166211a(iMomentsItemBase.mo166379a(), PreviewUtils.f119253a.mo166210a(iMomentsItemBase), this.f119978a);
        if (iMomentsItemBase instanceof MomentsPostVM) {
            return MomentsPostVM.m187537a((MomentsPostVM) iMomentsItemBase, null, null, null, null, a, this.f119979b, null, false, null, null, null, 1999, null);
        }
        if (iMomentsItemBase instanceof MomentsCommentVM) {
            return MomentsCommentVM.m187494a((MomentsCommentVM) iMomentsItemBase, null, null, null, a, this.f119979b, false, null, null, null, null, 999, null);
        }
        return iMomentsItemBase;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.preview.UrlPreviewEntity> */
    /* JADX WARN: Multi-variable type inference failed */
    public PreviewUpdater(Map<String, ? extends UrlPreviewEntity> map, MomentsBaseViewModel momentsBaseViewModel) {
        Intrinsics.checkParameterIsNotNull(map, "previews");
        Intrinsics.checkParameterIsNotNull(momentsBaseViewModel, "model");
        this.f119978a = map;
        this.f119979b = momentsBaseViewModel;
    }
}
