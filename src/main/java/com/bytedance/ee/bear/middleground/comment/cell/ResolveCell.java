package com.bytedance.ee.bear.middleground.comment.cell;

import android.app.Dialog;
import android.view.View;
import androidx.appcompat.app.DialogC0259b;
import androidx.core.graphics.C0768a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.p449g.C9232e;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/cell/ResolveCell;", "", "()V", "showResolve", "Landroid/app/Dialog;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "commentId", "", "isWhole", "", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.a.b */
public final class ResolveCell {

    /* renamed from: a */
    public static final Companion f24177a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/cell/ResolveCell$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.a.b$b */
    public static final class View$OnClickListenerC8971b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Config f24178a;

        /* renamed from: b */
        final /* synthetic */ String f24179b;

        /* renamed from: c */
        final /* synthetic */ DataControl f24180c;

        /* renamed from: d */
        final /* synthetic */ boolean f24181d;

        View$OnClickListenerC8971b(Config fVar, String str, DataControl cVar, boolean z) {
            this.f24178a = fVar;
            this.f24179b = str;
            this.f24180c = cVar;
            this.f24181d = z;
        }

        public final void onClick(View view) {
            C8275a aVar = C8275a.f22375h;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
            if (aVar.mo32553a().equals(this.f24178a.mo35332j().mo32553a())) {
                this.f24178a.mo35325e().mo35302a("finish_click", this.f24179b, null, null);
            }
            AbstractC68307f a = C9232e.m38293a(this.f24180c.mo34700a(this.f24179b, this.f24181d), null, 1, null);
            if (a != null) {
                a.mo238001b(new Consumer<String>(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.cell.ResolveCell.View$OnClickListenerC8971b.C89721 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC8971b f24182a;

                    {
                        this.f24182a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(String str) {
                        DataControl cVar = this.f24182a.f24180c;
                        Intrinsics.checkExpressionValueIsNotNull(str, "it");
                        cVar.mo34705a(str, Action.RESOLVE);
                    }
                }, new Consumer<Throwable>(this) {
                    /* class com.bytedance.ee.bear.middleground.comment.cell.ResolveCell.View$OnClickListenerC8971b.C89732 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC8971b f24183a;

                    {
                        this.f24183a = r1;
                    }

                    /* renamed from: a */
                    public final void accept(Throwable th) {
                        C13479a.m54761a("ResolveCell", th);
                        DataControl cVar = this.f24183a.f24180c;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "{}";
                        }
                        cVar.mo34705a(message, Action.RESOLVE);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final Dialog mo34415a(Config fVar, DataControl cVar, String str, boolean z) {
        float f;
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        if (C0768a.m3714b(-1, UIUtils.getColor(fVar.mo35279a(), R.color.bg_body)) <= ((double) 3.0f)) {
            f = -1.0f;
        } else {
            f = 0.4f;
        }
        DialogC0259b a = C11811a.m48976a(fVar.mo35279a()).mo45215a(R.string.Doc_Comment_Resolve, new View$OnClickListenerC8971b(fVar, str, cVar, z)).mo45213a().mo45212a(f);
        a.show();
        Intrinsics.checkExpressionValueIsNotNull(a, "dialog");
        return a;
    }
}
