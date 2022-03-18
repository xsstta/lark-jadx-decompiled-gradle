package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.AttachmentEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.C4587a;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 22\u00020\u0001:\u00012B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\tJ\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J0\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0014J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0010J\u0010\u0010\"\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010$J)\u0010%\u001a\u0004\u0018\u00010&2\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010)\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010+¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u00142\u0010\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010/J\b\u00101\u001a\u00020\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentGridView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAttachmentAdapter", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentAdapter;", "mGridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "mIsLandscape", "", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "init", "", "notifyItemChanged", "position", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onLayout", "changed", "l", "t", "r", C63954b.f161494a, "onOrientationChanged", "isLandscape", "setAttachmentViewDelegate", "attachmentViewDelegate", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/IAttachmentViewDelegate;", "setCustomMenus", "Lcom/bytedance/ee/bear/facade/common/TouchStartIntercept;", "menus", "", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentMenuEnum;", "customMenuListener", "Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentAdapter$OnCustomMenuListener;", "([Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentMenuEnum;Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentAdapter$OnCustomMenuListener;)Lcom/bytedance/ee/bear/facade/common/TouchStartIntercept;", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/cell/AttachmentEntity;", "updateView", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AttachmentGridView extends LinearLayout {

    /* renamed from: d */
    public static final Companion f13555d = new Companion(null);

    /* renamed from: a */
    public C4587a f13556a;

    /* renamed from: b */
    public GridLayoutManager f13557b;

    /* renamed from: c */
    public boolean f13558c;

    /* renamed from: e */
    private RecyclerView f13559e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/attachment/view/AttachmentGridView$Companion;", "", "()V", "PORTRAIT_GRID_SPAN_COUNT", "", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentGridView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentGridView$b */
    public static final class RunnableC4584b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AttachmentGridView f13560a;

        /* renamed from: b */
        final /* synthetic */ int f13561b;

        RunnableC4584b(AttachmentGridView attachmentGridView, int i) {
            this.f13560a = attachmentGridView;
            this.f13561b = i;
        }

        public final void run() {
            AttachmentGridView.m19060b(this.f13560a).notifyItemChanged(this.f13561b);
        }
    }

    /* renamed from: b */
    private final void m19061b() {
        C13742g.m55711d(new RunnableC4585c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentGridView$c */
    public static final class RunnableC4585c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AttachmentGridView f13562a;

        RunnableC4585c(AttachmentGridView attachmentGridView) {
            this.f13562a = attachmentGridView;
        }

        public final void run() {
            if (this.f13562a.f13558c) {
                this.f13562a.post(new Runnable(this) {
                    /* class com.bytedance.ee.bear.bitable.card.view.cell.attachment.view.AttachmentGridView.RunnableC4585c.RunnableC45861 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC4585c f13563a;

                    {
                        this.f13563a = r1;
                    }

                    public final void run() {
                        if (this.f13563a.f13562a.getWidth() > 0) {
                            int b = AttachmentGridView.m19058a(this.f13563a.f13562a).mo6502b();
                            int width = this.f13563a.f13562a.getWidth() / C13749l.m55738a(86);
                            if (width != b) {
                                AttachmentGridView.m19058a(this.f13563a.f13562a).mo6500a(width);
                            }
                            AttachmentGridView.m19060b(this.f13563a.f13562a).notifyDataSetChanged();
                        }
                    }
                });
                return;
            }
            AttachmentGridView.m19058a(this.f13562a).mo6500a(3);
            AttachmentGridView.m19060b(this.f13562a).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private final void m19059a() {
        View.inflate(getContext(), R.layout.bitable_card_attachment_grid_layout, this);
        View findViewById = findViewById(R.id.attachment_grid_view_root_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.attachment_grid_view_root_rv)");
        this.f13559e = (RecyclerView) findViewById;
        this.f13557b = new AttachmentGridView$init$1(this, getContext(), 3);
        RecyclerView recyclerView = this.f13559e;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        GridLayoutManager gridLayoutManager = this.f13557b;
        if (gridLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLayoutManager");
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView2 = this.f13559e;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        boolean z = true;
        recyclerView2.setHasFixedSize(true);
        C4587a aVar = new C4587a();
        this.f13556a = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentAdapter");
        }
        aVar.setHasStableIds(true);
        RecyclerView recyclerView3 = this.f13559e;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
        }
        C4587a aVar2 = this.f13556a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentAdapter");
        }
        recyclerView3.setAdapter(aVar2);
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        if (resources.getConfiguration().orientation != 2) {
            z = false;
        }
        this.f13558c = z;
    }

    public AttachmentGridView(Context context) {
        super(context);
        m19059a();
    }

    /* renamed from: a */
    public static final /* synthetic */ GridLayoutManager m19058a(AttachmentGridView attachmentGridView) {
        GridLayoutManager gridLayoutManager = attachmentGridView.f13557b;
        if (gridLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGridLayoutManager");
        }
        return gridLayoutManager;
    }

    /* renamed from: b */
    public static final /* synthetic */ C4587a m19060b(AttachmentGridView attachmentGridView) {
        C4587a aVar = attachmentGridView.f13556a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentAdapter");
        }
        return aVar;
    }

    public final void setAttachmentViewDelegate(AbstractC4596c cVar) {
        C4587a aVar = this.f13556a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentAdapter");
        }
        aVar.mo18096a(cVar);
    }

    public final void setData(List<? extends AttachmentEntity> list) {
        C4587a aVar = this.f13556a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentAdapter");
        }
        aVar.mo18097a((List<AttachmentEntity>) list);
        m19061b();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        if (configuration == null || 2 != configuration.orientation) {
            z = false;
        } else {
            z = true;
        }
        mo18081a(z);
    }

    /* renamed from: a */
    public final void mo18080a(int i) {
        C13742g.m55711d(new RunnableC4584b(this, i));
    }

    /* renamed from: a */
    public final void mo18081a(boolean z) {
        if (this.f13558c != z) {
            this.f13558c = z;
            m19061b();
        }
    }

    public AttachmentGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19059a();
    }

    /* renamed from: a */
    public final AbstractC7720n mo18079a(AttachmentMenuEnum[] attachmentMenuEnumArr, C4587a.AbstractC4590a aVar) {
        C4587a aVar2 = this.f13556a;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttachmentAdapter");
        }
        return aVar2.mo18092a(attachmentMenuEnumArr, aVar);
    }

    public AttachmentGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19059a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f13558c) {
            m19061b();
        }
    }
}
