package com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.IPDFPageLoader;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0004&'()B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0014J\u000e\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00060\u0010R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pageCount", "", "pageLoader", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/IPDFPageLoader;", "pageSizeF", "Landroid/util/SizeF;", "selectedPage", "spanCount", "thumbAdapter", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$PDFThumbnailAdapter;", "thumbSpacing", "viewDelegate", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$ViewDelegate;)V", "addScrollListener", "", "init", "initView", "gridSpacing", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "setSelected", "page", "setVisible", "visible", "", "Companion", "PDFThumbnailAdapter", "PageViewHolder", "ViewDelegate", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PDFThumbnailView extends RecyclerView {

    /* renamed from: f */
    public static final Companion f20093f = new Companion(null);

    /* renamed from: a */
    public int f20094a;

    /* renamed from: b */
    public SizeF f20095b;

    /* renamed from: c */
    public IPDFPageLoader f20096c;

    /* renamed from: d */
    public int f20097d = -1;

    /* renamed from: e */
    public int f20098e = C7473f.m29883a();

    /* renamed from: g */
    private final PDFThumbnailAdapter f20099g = new PDFThumbnailAdapter();

    /* renamed from: h */
    private int f20100h;

    /* renamed from: i */
    private ViewDelegate f20101i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$ViewDelegate;", "", "onItemClick", "", "page", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView$d */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo29057a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$PageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageLayout", "Landroid/widget/RelativeLayout;", "getImageLayout", "()Landroid/widget/RelativeLayout;", "setImageLayout", "(Landroid/widget/RelativeLayout;)V", "pageNumber", "Landroid/widget/TextView;", "getPageNumber", "()Landroid/widget/TextView;", "setPageNumber", "(Landroid/widget/TextView;)V", "thumbImage", "Landroid/widget/ImageView;", "getThumbImage", "()Landroid/widget/ImageView;", "setThumbImage", "(Landroid/widget/ImageView;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView$c */
    public static final class PageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private RelativeLayout f20105a;

        /* renamed from: b */
        private ImageView f20106b;

        /* renamed from: c */
        private TextView f20107c;

        /* renamed from: a */
        public final RelativeLayout mo29093a() {
            return this.f20105a;
        }

        /* renamed from: b */
        public final ImageView mo29094b() {
            return this.f20106b;
        }

        /* renamed from: c */
        public final TextView mo29095c() {
            return this.f20107c;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PageViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(R.id.item_image_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.item_image_layout)");
            this.f20105a = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.item_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.item_image)");
            this.f20106b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.item_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.item_text)");
            this.f20107c = (TextView) findViewById3;
        }
    }

    public final ViewDelegate getViewDelegate() {
        return this.f20101i;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$PDFThumbnailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$PageViewHolder;", "(Lcom/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView$b */
    public final class PDFThumbnailAdapter extends RecyclerView.Adapter<PageViewHolder> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return PDFThumbnailView.this.f20094a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PDFThumbnailAdapter() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView$b$a */
        public static final class View$OnClickListenerC7458a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ PDFThumbnailAdapter f20103a;

            /* renamed from: b */
            final /* synthetic */ int f20104b;

            View$OnClickListenerC7458a(PDFThumbnailAdapter bVar, int i) {
                this.f20103a = bVar;
                this.f20104b = i;
            }

            public final void onClick(View view) {
                ViewDelegate viewDelegate = PDFThumbnailView.this.getViewDelegate();
                if (viewDelegate != null) {
                    viewDelegate.mo29057a(this.f20104b);
                }
            }
        }

        /* renamed from: a */
        public PageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drive_controls_thumbnails_view_grid_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…grid_item, parent, false)");
            return new PageViewHolder(inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(PageViewHolder cVar, int i) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(cVar, "holder");
            C7473f.m29885a(cVar.mo29093a(), PDFThumbnailView.this.f20098e);
            cVar.mo29095c().setText(String.valueOf(i + 1));
            TextView c = cVar.mo29095c();
            if (i == PDFThumbnailView.this.f20097d) {
                z = true;
            } else {
                z = false;
            }
            c.setSelected(z);
            cVar.mo29093a().setOnClickListener(new View$OnClickListenerC7458a(this, i));
            SizeF a = C7473f.m29884a(cVar.mo29093a(), PDFThumbnailView.m29810a(PDFThumbnailView.this));
            IPDFPageLoader aVar = PDFThumbnailView.this.f20096c;
            if (aVar != null) {
                aVar.mo29109a(cVar.mo29094b(), new IPDFPageLoader.LoadConfig(i, (int) a.getWidth(), (int) a.getHeight(), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f), false, false));
            }
        }
    }

    /* renamed from: a */
    private final void m29811a() {
        addOnScrollListener(new C7459e(this));
    }

    public final void setViewDelegate(ViewDelegate dVar) {
        this.f20101i = dVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/drive/view/preview/ttreader/pdf/tron/PDFThumbnailView$addScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFThumbnailView$e */
    public static final class C7459e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ PDFThumbnailView f20108a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7459e(PDFThumbnailView pDFThumbnailView) {
            this.f20108a = pDFThumbnailView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i != 0) {
                IPDFPageLoader aVar = this.f20108a.f20096c;
                if (aVar != null) {
                    aVar.mo29110b();
                    return;
                }
                return;
            }
            IPDFPageLoader aVar2 = this.f20108a.f20096c;
            if (aVar2 != null) {
                aVar2.mo29108a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SizeF m29810a(PDFThumbnailView pDFThumbnailView) {
        SizeF sizeF = pDFThumbnailView.f20095b;
        if (sizeF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageSizeF");
        }
        return sizeF;
    }

    public final void setVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    public final void setSelected(int i) {
        if (getVisibility() != 8 && i >= 0 && i < this.f20094a) {
            int i2 = this.f20097d;
            this.f20097d = i;
            this.f20099g.notifyItemChanged(i2);
            this.f20099g.notifyItemChanged(i);
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PDFThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        int b = C7473f.m29886b();
        this.f20100h = b;
        m29812a(this.f20098e, b);
    }

    /* renamed from: a */
    private final void m29812a(int i, int i2) {
        setHasFixedSize(true);
        setLayoutManager(new GridLayoutManager(getContext(), i));
        addItemDecoration(new C7472e(i, i2, false));
        setAdapter(this.f20099g);
        setNestedScrollingEnabled(false);
        m29811a();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (Intrinsics.areEqual(view, this) && i != 0) {
            C13479a.m54764b("PDFThumbnailView", "PDFThumbnailView.GONE, cancel all thumbnail request. ");
            IPDFPageLoader aVar = this.f20096c;
            if (aVar != null) {
                aVar.mo29111c();
            }
        }
    }

    /* renamed from: a */
    public final void mo29084a(int i, SizeF sizeF, IPDFPageLoader aVar) {
        Intrinsics.checkParameterIsNotNull(sizeF, "pageSizeF");
        Intrinsics.checkParameterIsNotNull(aVar, "pageLoader");
        C13479a.m54764b("PDFThumbnailView", "PDFThumbnailView.init, pageCount: " + i + ", pageSizeF: " + sizeF);
        this.f20094a = i;
        this.f20095b = sizeF;
        this.f20096c = aVar;
        this.f20099g.notifyDataSetChanged();
    }
}
