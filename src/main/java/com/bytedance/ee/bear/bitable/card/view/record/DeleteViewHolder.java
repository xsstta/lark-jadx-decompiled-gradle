package com.bytedance.ee.bear.bitable.card.view.record;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.util.C13612d;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/record/DeleteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "delegate", "Lcom/bytedance/ee/bear/bitable/card/view/record/DeleteViewHolder$IDeleteDelegate;", "deleteBtn", "Landroid/widget/TextView;", "deleteDialog", "Lcom/bytedance/ee/bear/widgets/ActionSheet;", "setDeleteDelegate", "", "setTopMargin", "margin", "", "setVisible", "visible", "", "showDeleteDialog", "context", "Landroid/content/Context;", "Companion", "IDeleteDelegate", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.a.c */
public final class DeleteViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: c */
    public static final Companion f13386c = new Companion(null);

    /* renamed from: a */
    public IDeleteDelegate f13387a;

    /* renamed from: b */
    public C11811a f13388b;

    /* renamed from: d */
    private final TextView f13389d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/record/DeleteViewHolder$IDeleteDelegate;", "", "onDeleteClick", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.c$b */
    public interface IDeleteDelegate {
        /* renamed from: b */
        void mo17905b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/record/DeleteViewHolder$Companion;", "", "()V", "ID_DELETE_BUTTON", "", "ID_DELETE_TITLE", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/record/DeleteViewHolder$showDeleteDialog$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.c$d */
    public static final class View$OnClickListenerC4546d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteViewHolder f13392a;

        View$OnClickListenerC4546d(DeleteViewHolder cVar) {
            this.f13392a = cVar;
        }

        public final void onClick(View view) {
            this.f13392a.f13388b = null;
        }
    }

    /* renamed from: a */
    public final void mo17903a(IDeleteDelegate bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f13387a = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/bitable/card/view/record/DeleteViewHolder$showDeleteDialog$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.a.c$c */
    public static final class View$OnClickListenerC4545c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DeleteViewHolder f13391a;

        View$OnClickListenerC4545c(DeleteViewHolder cVar) {
            this.f13391a = cVar;
        }

        public final void onClick(View view) {
            DeleteViewHolder.m18882a(this.f13391a).mo17905b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IDeleteDelegate m18882a(DeleteViewHolder cVar) {
        IDeleteDelegate bVar = cVar.f13387a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("delegate");
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo17901a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f13389d.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i;
            this.f13389d.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        View findViewById = view.findViewById(R.id.tv_bitable_cell_delete);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.tv_bitable_cell_delete)");
        TextView textView = (TextView) findViewById;
        this.f13389d = textView;
        textView.setOnClickListener(new AbstractView$OnClickListenerC11839e(this) {
            /* class com.bytedance.ee.bear.bitable.card.view.record.DeleteViewHolder.C45441 */

            /* renamed from: a */
            final /* synthetic */ DeleteViewHolder f13390a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f13390a = r1;
            }

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Intrinsics.checkParameterIsNotNull(view, "v");
                C13612d.m55254a(view);
                DeleteViewHolder cVar = this.f13390a;
                Context context = view.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
                cVar.mo17902a(context);
            }
        });
    }

    /* renamed from: a */
    public final void mo17902a(Context context) {
        C11811a a = C11811a.m48976a(context);
        a.mo45214a(R.string.Doc_Block_DeleteRecordQuery);
        a.mo45225b(R.string.Bitable_Common_ButtonDelete, new View$OnClickListenerC4545c(this));
        a.mo45218a(new View$OnClickListenerC4546d(this));
        a.mo45231c();
        this.f13388b = a;
    }

    /* renamed from: a */
    public final void mo17904a(boolean z) {
        int i;
        C11811a aVar;
        C11811a aVar2;
        TextView textView = this.f13389d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (!z && (aVar = this.f13388b) != null && aVar.mo45233e() && (aVar2 = this.f13388b) != null) {
            aVar2.mo45232d();
        }
    }
}
