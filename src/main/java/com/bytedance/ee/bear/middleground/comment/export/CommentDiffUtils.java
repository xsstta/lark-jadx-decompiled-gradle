package com.bytedance.ee.bear.middleground.comment.export;

import android.text.TextUtils;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.util.p718t.C13743h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!J(\u0010#\u001a\u00020!2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/CommentDiffUtils;", "", "()V", CommentDiffUtils.f24831i, "", "getACTIVITY_CONFIGURATION", "()Ljava/lang/String;", "CONTAINS_VALUE", "", "getCONTAINS_VALUE", "()I", CommentDiffUtils.f24827e, "getEDITSTATUS", CommentDiffUtils.f24830h, "getIMAGE", CommentDiffUtils.f24829g, "getNAME", CommentDiffUtils.f24826d, "getREACTION", CommentDiffUtils.f24828f, "getSENDINGSTATUS", "TAG", "getTAG", CommentDiffUtils.f24825c, "getTEXT", "diff", "", "adapter", "Lcom/bytedance/ee/bear/middleground/comment/export/ICardAdapter;", "commentList", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "forceContentDiff", "", "orientationHasChange", "isDiffCommentImageList", "oldImageList", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "newImageList", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.c */
public final class CommentDiffUtils {

    /* renamed from: a */
    public static final CommentDiffUtils f24823a = new CommentDiffUtils();

    /* renamed from: b */
    private static final String f24824b = "";

    /* renamed from: c */
    private static final String f24825c = f24825c;

    /* renamed from: d */
    private static final String f24826d = f24826d;

    /* renamed from: e */
    private static final String f24827e = f24827e;

    /* renamed from: f */
    private static final String f24828f = f24828f;

    /* renamed from: g */
    private static final String f24829g = f24829g;

    /* renamed from: h */
    private static final String f24830h = f24830h;

    /* renamed from: i */
    private static final String f24831i = f24831i;

    /* renamed from: j */
    private static final int f24832j = 1;

    private CommentDiffUtils() {
    }

    /* renamed from: a */
    public final String mo35266a() {
        return f24825c;
    }

    /* renamed from: b */
    public final String mo35269b() {
        return f24826d;
    }

    /* renamed from: c */
    public final String mo35270c() {
        return f24827e;
    }

    /* renamed from: d */
    public final String mo35271d() {
        return f24828f;
    }

    /* renamed from: e */
    public final String mo35272e() {
        return f24829g;
    }

    /* renamed from: f */
    public final String mo35273f() {
        return f24830h;
    }

    /* renamed from: g */
    public final String mo35274g() {
        return f24831i;
    }

    /* renamed from: h */
    public final int mo35275h() {
        return f24832j;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/middleground/comment/export/CommentDiffUtils$diff$itemsDiff$1", "Lcom/bytedance/ee/util/ui/RecyclerItemsDiff$ItemComparable;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.export.c$b */
    public static final class C9223b implements C13743h.AbstractC13745b<CommentBean.CommentDetail> {

        /* renamed from: a */
        final /* synthetic */ boolean f24834a;

        C9223b(boolean z) {
            this.f24834a = z;
        }

        /* renamed from: b */
        public boolean mo34853b(CommentBean.CommentDetail commentDetail, CommentBean.CommentDetail commentDetail2) {
            boolean z;
            if (this.f24834a) {
                return false;
            }
            if (commentDetail != null) {
                z = commentDetail.equals(commentDetail2);
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo34851a(CommentBean.CommentDetail commentDetail, CommentBean.CommentDetail commentDetail2) {
            boolean z;
            boolean z2;
            String compatibleReplyIdBeforeSend;
            String reply_id;
            String str;
            String str2 = null;
            if (commentDetail == null || (reply_id = commentDetail.getReply_id()) == null) {
                z = false;
            } else {
                if (commentDetail2 != null) {
                    str = commentDetail2.getReply_id();
                } else {
                    str = null;
                }
                z = reply_id.equals(str);
            }
            if (!z) {
                if (commentDetail == null || (compatibleReplyIdBeforeSend = commentDetail.getCompatibleReplyIdBeforeSend()) == null) {
                    z2 = false;
                } else {
                    if (commentDetail2 != null) {
                        str2 = commentDetail2.getCompatibleReplyIdBeforeSend();
                    }
                    z2 = compatibleReplyIdBeforeSend.equals(str2);
                }
                if (z2) {
                    return true;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo35268a(List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list2) {
        if (list == null || list2 == null) {
            if (!(list2 == null && list == null)) {
                return true;
            }
        } else if (list.size() != list2.size()) {
            return true;
        } else {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity = list.get(i);
                CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity2 = list2.get(i);
                String uuid = commentImageEntity.getUuid();
                String str = uuid;
                if (!TextUtils.isEmpty(str)) {
                    if (!TextUtils.equals(str, commentImageEntity2.getUuid()) && !TextUtils.equals(C9225l.m38238b(uuid), commentImageEntity2.getToken())) {
                        return true;
                    }
                } else if (!TextUtils.equals(commentImageEntity.getToken(), commentImageEntity2.getToken())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "oldItem", "", "kotlin.jvm.PlatformType", "newItem", "getChangePayload"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.export.c$a */
    static final class C9222a<T> implements C13743h.AbstractC13744a<Object> {

        /* renamed from: a */
        final /* synthetic */ boolean f24833a;

        C9222a(boolean z) {
            this.f24833a = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)) != false) goto L_0x004c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00e4  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0134  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.os.Bundle mo34848a(java.lang.Object r6, java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 324
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.export.CommentDiffUtils.C9222a.mo34848a(java.lang.Object, java.lang.Object):android.os.Bundle");
        }
    }

    /* renamed from: a */
    public final void mo35267a(ICardAdapter iCardAdapter, List<? extends CommentBean.CommentDetail> list, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(list, "commentList");
        if (iCardAdapter != null) {
            C13743h hVar = new C13743h(iCardAdapter.getData(), list, new C9223b(z));
            hVar.mo50704a(new C9222a(z2));
            C1374g.C1377b a = C1374g.m6298a(hVar, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(itemsDiff, false)");
            a.mo7412a((RecyclerView.Adapter) iCardAdapter);
            iCardAdapter.setData(list);
        }
    }
}
