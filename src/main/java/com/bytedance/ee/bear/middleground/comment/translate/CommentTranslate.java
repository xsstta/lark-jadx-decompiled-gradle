package com.bytedance.ee.bear.middleground.comment.translate;

import android.text.TextUtils;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.log.C13479a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/translate/CommentTranslate;", "", "()V", "TAG", "", "translateStatus", "", "", "getTranslateStatus", "()Ljava/util/Map;", "diffViewShowOrigin", "config", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "item", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "reactionWindowShowOrigin", "reactionWindowShowPackUpOrigin", "reactionWindowShowTranslate", "showDiffView", "showTranslateContent", "showTranslateIcon", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.f.a */
public final class CommentTranslate {

    /* renamed from: a */
    public static final CommentTranslate f24837a = new CommentTranslate();

    /* renamed from: b */
    private static final Map<String, Boolean> f24838b = new LinkedHashMap();

    private CommentTranslate() {
    }

    /* renamed from: a */
    public final Map<String, Boolean> mo35291a() {
        return f24838b;
    }

    /* renamed from: a */
    public final boolean mo35292a(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        boolean show = translateConfig.getShow();
        boolean areEqual = Intrinsics.areEqual(commentDetail.getTranslate_status(), "success");
        boolean z2 = false;
        if (translateConfig.getType() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true);
        if (show && areEqual && z && z3) {
            z2 = true;
        }
        C13479a.m54764b("CommentTranslate", "content show: " + z2 + " 1:" + show + " 2:" + areEqual + " 3:" + z + " 4：" + z3);
        return z2;
    }

    /* renamed from: e */
    public final boolean mo35296e(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        boolean show = translateConfig.getShow();
        boolean areEqual = Intrinsics.areEqual(commentDetail.getTranslate_status(), "success");
        boolean z = !TextUtils.isEmpty(commentDetail.getContent());
        if (!show || !areEqual || !z || !(!Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo35298g(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        boolean show = translateConfig.getShow();
        boolean z2 = false;
        if (translateConfig.getType() == 3 || !Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true)) {
            z = false;
        } else {
            z = true;
        }
        if (show && z) {
            z2 = true;
        }
        C13479a.m54764b("CommentTranslate", "diffViewShowOrigin: " + z2 + " 1:" + show + " 2:" + z);
        return z2;
    }

    /* renamed from: b */
    public final boolean mo35293b(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        boolean show = translateConfig.getShow();
        boolean areEqual = Intrinsics.areEqual(commentDetail.getTranslate_status(), "loading");
        boolean areEqual2 = Intrinsics.areEqual(commentDetail.getTranslate_status(), "success");
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true);
        boolean z3 = !TextUtils.isEmpty(commentDetail.getContent());
        if (!show || ((!areEqual && !areEqual2) || !z2 || !z3)) {
            z = false;
        }
        C13479a.m54764b("CommentTranslate", "translateIcon show: " + z + " 1:" + show + " 2a:" + areEqual + ' ' + "2b:" + areEqual2 + " 3:" + z2 + " 4:" + z3);
        return z;
    }

    /* renamed from: c */
    public final boolean mo35294c(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        boolean show = translateConfig.getShow();
        boolean z2 = false;
        if (commentDetail.getTranslate_status() == null || Intrinsics.areEqual(commentDetail.getTranslate_status(), "default") || Intrinsics.areEqual(commentDetail.getTranslate_status(), "error")) {
            z = true;
        } else {
            z = false;
        }
        boolean areEqual = Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true);
        boolean z3 = !TextUtils.isEmpty(commentDetail.getContent());
        if (show && ((z || areEqual) && z3)) {
            z2 = true;
        }
        C13479a.m54764b("CommentTranslate", "reactionWindowShowTranslate show: " + z2 + " 1:" + show + " 2a:" + z + " 2b: " + areEqual);
        return z2;
    }

    /* renamed from: d */
    public final boolean mo35295d(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        boolean show = translateConfig.getShow();
        boolean areEqual = Intrinsics.areEqual(commentDetail.getTranslate_status(), "success");
        boolean z2 = false;
        if (translateConfig.getType() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true);
        boolean z4 = !TextUtils.isEmpty(commentDetail.getContent());
        if (show && areEqual && z && z3 && z4) {
            z2 = true;
        }
        C13479a.m54764b("CommentTranslate", "reactionWindowShowOrigin: " + z2 + " 1:" + show + " 2:" + areEqual + ' ' + "3:" + z + " 4:" + z3 + " 5" + z4);
        return z2;
    }

    /* renamed from: f */
    public final boolean mo35297f(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(translateConfig, "config");
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        boolean show = translateConfig.getShow();
        boolean areEqual = Intrinsics.areEqual(commentDetail.getTranslate_status(), "success");
        boolean z4 = false;
        if (translateConfig.getType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (translateConfig.getType() == 3 || !Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = !Intrinsics.areEqual((Object) f24838b.get(commentDetail.getReply_id()), (Object) true);
        if (show && areEqual && z3 && z5) {
            z4 = true;
        }
        C13479a.m54764b("CommentTranslate", "showDiffView: " + z4 + " 1:" + show + " 2:" + areEqual + " 3b:" + z + " 3c:" + z2 + " 4:" + z5);
        return z4;
    }
}
