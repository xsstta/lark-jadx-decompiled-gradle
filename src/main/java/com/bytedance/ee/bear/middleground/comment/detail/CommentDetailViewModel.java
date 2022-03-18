package com.bytedance.ee.bear.middleground.comment.detail;

import com.bytedance.ee.bear.architecture.DisposableBase;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u0014\u001a\u00020\nJU\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 J,\u0010!\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/detail/CommentDetailViewModel;", "Lcom/bytedance/ee/bear/architecture/DisposableBase;", "()V", "canReplyComment", "", "getCanReplyComment", "()Z", "setCanReplyComment", "(Z)V", "commentId", "", "commentRecord", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "isEditStatus", "getData", "getEditMessageId", "getInputRequest", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "defaultText", "list", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "quote", "parentToken", "parentType", "retryType", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "initViewModel", "", "isInEdit", "setData", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.d.a */
public final class CommentDetailViewModel extends DisposableBase {

    /* renamed from: a */
    public static final Companion f24689a = new Companion(null);

    /* renamed from: b */
    private Config f24690b;

    /* renamed from: c */
    private DataControl f24691c;

    /* renamed from: d */
    private boolean f24692d;

    /* renamed from: e */
    private String f24693e = "";

    /* renamed from: f */
    private final List<CommentBean.CommentDetail> f24694f = new ArrayList();

    /* renamed from: g */
    private boolean f24695g = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/detail/CommentDetailViewModel$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final boolean mo34886b() {
        return this.f24695g;
    }

    /* renamed from: d */
    public final boolean mo34888d() {
        return this.f24692d;
    }

    /* renamed from: e */
    public final List<CommentBean.CommentDetail> mo34889e() {
        return this.f24694f;
    }

    /* renamed from: c */
    public final String mo34887c() {
        try {
            String reply_id = this.f24694f.get(0).getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentRecord[0].reply_id");
            return reply_id;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    private final void m38013a(List<CommentBean.CommentDetail> list) {
        this.f24694f.clear();
        this.f24694f.addAll(list);
    }

    /* renamed from: a */
    public final void mo34885a(Config fVar, DataControl cVar, String str, List<CommentBean.CommentDetail> list) {
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(list, "commentRecord");
        m38013a(list);
        this.f24690b = fVar;
        this.f24691c = cVar;
        this.f24693e = str;
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (i == 0) {
                this.f24692d = t2.isEditStatus();
            }
            i = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest mo34884a(java.lang.String r9, java.util.List<? extends com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Integer r14) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.detail.CommentDetailViewModel.mo34884a(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest");
    }
}
