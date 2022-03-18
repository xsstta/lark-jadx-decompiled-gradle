package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.basic.v1.UrlPreviewHangPoint;
import com.bytedance.lark.pb.moments.v1.Comment;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.moments.impl.common.utils.PreviewUtils;
import com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/ReplyCommentPreviewUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "previews", "", "", "Lcom/ss/android/lark/chat/entity/preview/UrlPreviewEntity;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "(Ljava/util/Map;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;)V", "getUrlPreviewHangPoint", "Lcom/bytedance/lark/pb/basic/v1/UrlPreviewHangPoint;", "item", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "update", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.q */
public final class ReplyCommentPreviewUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final Map<String, UrlPreviewEntity> f119986a;

    /* renamed from: b */
    private final IMomentsCommentModel f119987b;

    /* renamed from: b */
    public final Map<String, UrlPreviewHangPoint> mo167045b(IMomentsItemBase iMomentsItemBase) {
        Comment D;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (!(iMomentsItemBase instanceof MomentsCommentVM) || (D = ((MomentsCommentVM) iMomentsItemBase).mo166375D()) == null) {
            return null;
        }
        return D.url_preview_hang_point_map;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        Map<String, PreviewHangPoint> a = PreviewUtils.f119253a.mo166211a(iMomentsItemBase.mo166379a(), mo167045b(iMomentsItemBase), this.f119986a);
        if (iMomentsItemBase instanceof MomentsCommentVM) {
            return MomentsCommentVM.m187494a((MomentsCommentVM) iMomentsItemBase, null, null, null, a, this.f119987b, false, null, null, null, null, 999, null);
        }
        return iMomentsItemBase;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.lark.chat.entity.preview.UrlPreviewEntity> */
    /* JADX WARN: Multi-variable type inference failed */
    public ReplyCommentPreviewUpdater(Map<String, ? extends UrlPreviewEntity> map, IMomentsCommentModel aVar) {
        Intrinsics.checkParameterIsNotNull(map, "previews");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f119986a = map;
        this.f119987b = aVar;
    }
}
