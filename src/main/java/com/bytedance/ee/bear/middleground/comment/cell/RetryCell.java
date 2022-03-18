package com.bytedance.ee.bear.middleground.comment.cell;

import android.app.Dialog;
import android.view.View;
import androidx.appcompat.app.DialogC0259b;
import androidx.core.graphics.C0768a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.p449g.C9232e;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019JP\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019JZ\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/cell/RetryCell;", "", "()V", "TAG", "", "deleteComment", "Landroid/app/Dialog;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "commentId", "replyId", "retryCreateComment", "", "content", "list", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "quote", "parentType", "parentToken", "localCommentId", "position", "bizParams", "", "retryEditComment", "retryRelpyComment", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.a.c */
public final class RetryCell {

    /* renamed from: a */
    public static final RetryCell f24184a = new RetryCell();

    private RetryCell() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.c$b */
    static final class C8977b<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ DataControl f24191a;

        C8977b(DataControl cVar) {
            this.f24191a = cVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            DataControl cVar = this.f24191a;
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            cVar.mo34705a(str, Action.PUBLISH);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.c$d */
    static final class C8979d<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ DataControl f24193a;

        C8979d(DataControl cVar) {
            this.f24193a = cVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            DataControl cVar = this.f24193a;
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            cVar.mo34705a(str, Action.PUBLISH);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.c$c */
    static final class C8978c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DataControl f24192a;

        C8978c(DataControl cVar) {
            this.f24192a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("RetryCell", th);
            DataControl cVar = this.f24192a;
            String message = th.getMessage();
            if (message == null) {
                message = "{}";
            }
            cVar.mo34705a(message, Action.PUBLISH);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.c$e */
    static final class C8980e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DataControl f24194a;

        C8980e(DataControl cVar) {
            this.f24194a = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("RetryCell", th);
            DataControl cVar = this.f24194a;
            String message = th.getMessage();
            if (message == null) {
                message = "{}";
            }
            cVar.mo34705a(message, Action.PUBLISH);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.c$a */
    public static final class View$OnClickListenerC8974a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Config f24185a;

        /* renamed from: b */
        final /* synthetic */ String f24186b;

        /* renamed from: c */
        final /* synthetic */ String f24187c;

        /* renamed from: d */
        final /* synthetic */ DataControl f24188d;

        View$OnClickListenerC8974a(Config fVar, String str, String str2, DataControl cVar) {
            this.f24185a = fVar;
            this.f24186b = str;
            this.f24187c = str2;
            this.f24188d = cVar;
        }

        public final void onClick(View view) {
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            if (aVar.mo32553a().equals(this.f24185a.mo35332j().mo32553a())) {
                this.f24185a.mo35325e().mo35302a("delete_click", this.f24186b, this.f24187c, null);
            }
            AbstractC68307f a = C9232e.m38293a(DataControl.C9096a.m37729a(this.f24188d, this.f24186b, this.f24187c, false, 4, null), null, 1, null);
            if (a != null) {
                a.mo238001b(new Consumer<String>(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.cell.RetryCell.View$OnClickListenerC8974a.C89751 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC8974a f24189a;

                    {
                        this.f24189a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(String str) {
                        DataControl cVar = this.f24189a.f24188d;
                        Intrinsics.checkExpressionValueIsNotNull(str, "it");
                        cVar.mo34705a(str, Action.DELETE);
                    }
                }, new Consumer<Throwable>(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.cell.RetryCell.View$OnClickListenerC8974a.C89762 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC8974a f24190a;

                    {
                        this.f24190a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(Throwable th) {
                        C13479a.m54761a("RetryCell", th);
                        DataControl cVar = this.f24190a.f24188d;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "{}";
                        }
                        cVar.mo34705a(message, Action.DELETE);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final Dialog mo34419a(Config fVar, DataControl cVar, String str, String str2) {
        float f;
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(str2, "replyId");
        if (C0768a.m3714b(-1, UIUtils.getColor(fVar.mo35279a(), R.color.bg_body)) <= ((double) 3.0f)) {
            f = -1.0f;
        } else {
            f = 0.4f;
        }
        DialogC0259b a = C11811a.m48976a(fVar.mo35279a()).mo45221a(fVar.mo35279a().getText(R.string.Doc_Comment_Delete), new View$OnClickListenerC8974a(fVar, str, str2, cVar)).mo45213a().mo45212a(f);
        a.show();
        Intrinsics.checkExpressionValueIsNotNull(a, "dialog");
        return a;
    }

    /* renamed from: a */
    public final void mo34421a(DataControl cVar, String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, Map<Object, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(str2, "commentId");
        Intrinsics.checkParameterIsNotNull(str3, "replyId");
        AbstractC68307f a = C9232e.m38293a(DataControl.C9096a.m37730a(cVar, str, list, str2, false, null, null, false, str3, str4, map, SmEvents.EVENT_NW, null), null, 1, null);
        if (a != null) {
            a.mo238001b(new C8979d(cVar), new C8980e(cVar));
        }
    }

    /* renamed from: a */
    public final void mo34420a(DataControl cVar, String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<Object, ? extends Object> map) {
        String str9;
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(str3, "commentId");
        Intrinsics.checkParameterIsNotNull(str4, "replyId");
        if (str2 == null) {
            C13479a.m54758a("RetryCell", "retryCreateComment quote == null");
        }
        if (str2 != null) {
            str9 = str2;
        } else {
            str9 = "";
        }
        AbstractC68307f a = C9232e.m38293a(cVar.mo34699a(str, list, false, "", str9, false, str5, str6, str3, str4, str7, str8, map), null, 1, null);
        if (a != null) {
            a.mo238001b(new C8977b(cVar), new C8978c(cVar));
        }
    }
}
