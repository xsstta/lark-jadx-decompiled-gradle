package com.bytedance.ee.bear.middleground.comment.translate;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R$\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/translate/CommentTranslateImpl;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/ICommentTranslate;", "()V", "translateStatus", "", "", "", "getTranslateStatus", "()Ljava/util/Map;", "diffViewShowOrigin", "config", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "item", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "reactionWindowShowOrigin", "reactionWindowShowPackUpOrigin", "reactionWindowShowTranslate", "showDiffView", "showTranslateContent", "showTranslateIcon", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.f.b */
public final class CommentTranslateImpl implements ICommentTranslate {

    /* renamed from: a */
    private final Map<String, Boolean> f24839a = CommentTranslate.f24837a.mo35291a();

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: a */
    public Map<String, Boolean> mo35258a() {
        return this.f24839a;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: a */
    public boolean mo35259a(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        return CommentTranslate.f24837a.mo35292a(translateConfig, commentDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: b */
    public boolean mo35260b(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        return CommentTranslate.f24837a.mo35297f(translateConfig, commentDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: c */
    public boolean mo35261c(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        return CommentTranslate.f24837a.mo35298g(translateConfig, commentDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: d */
    public boolean mo35262d(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        return CommentTranslate.f24837a.mo35293b(translateConfig, commentDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: e */
    public boolean mo35263e(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        return CommentTranslate.f24837a.mo35294c(translateConfig, commentDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: f */
    public boolean mo35264f(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        return CommentTranslate.f24837a.mo35295d(translateConfig, commentDetail);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.bean.ICommentTranslate
    /* renamed from: g */
    public boolean mo35265g(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        return CommentTranslate.f24837a.mo35296e(translateConfig, commentDetail);
    }
}
