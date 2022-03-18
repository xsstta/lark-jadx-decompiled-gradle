package com.bytedance.ee.bear.doc.cover.selectcover.official;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.request.p095a.AbstractC2520h;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.diskmanager.Biz;
import com.bytedance.ee.bear.diskmanager.CCMStorage;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverData;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.widgets.C11841g;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.p078b.p079a.C2057g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 &2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003&'(B\u0005¢\u0006\u0002\u0010\u0003J@\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u001c\u0010\u0018\u001a\u00020\n2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012H\u0016J:\u0010\u001f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010!\u001a\u00020\n2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010#J\u000e\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter$CoverImageViewHolder;", "()V", "mCoverClickListener", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OnOfficialCoverClickListener;", "mCoverItemList", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverItem;", "driveLoadImage", "", "context", "Landroid/content/Context;", "token", "", "imageView", "Landroid/widget/ImageView;", "width", "", "height", "skeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "priority", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "renderCoverImage", "localPath", "setData", "coverItemList", "", "setOnCoverClickListener", "listener", "Companion", "CoverImageViewHolder", "ViewTarget", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.a */
public final class CoverImageAdapter extends RecyclerView.Adapter<CoverImageViewHolder> {

    /* renamed from: b */
    public static final Companion f15416b = new Companion(null);

    /* renamed from: a */
    public OnOfficialCoverClickListener f15417a;

    /* renamed from: c */
    private final List<OfficialCoverData.CoverItem> f15418c = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter$Companion;", "", "()V", "COVER_IMAGE_REQUEST_LENGTH", "", "COVER_IMAGE_SPAN_COUNT", "TAG", "", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter$CoverImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter;Landroid/view/View;)V", "image", "Landroidx/appcompat/widget/AppCompatImageView;", "getImage", "()Landroidx/appcompat/widget/AppCompatImageView;", "setImage", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.a$b */
    public final class CoverImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CoverImageAdapter f15419a;

        /* renamed from: b */
        private AppCompatImageView f15420b;

        /* renamed from: a */
        public final AppCompatImageView mo21605a() {
            return this.f15420b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CoverImageViewHolder(CoverImageAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15419a = aVar;
            View findViewById = view.findViewById(R.id.cover_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.cover_image)");
            this.f15420b = (AppCompatImageView) findViewById;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15418c.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.a$e */
    public static final class RunnableC5403e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CoverImageAdapter f15431a;

        /* renamed from: b */
        final /* synthetic */ Context f15432b;

        /* renamed from: c */
        final /* synthetic */ String f15433c;

        /* renamed from: d */
        final /* synthetic */ int f15434d;

        /* renamed from: e */
        final /* synthetic */ int f15435e;

        /* renamed from: f */
        final /* synthetic */ ImageView f15436f;

        /* renamed from: g */
        final /* synthetic */ C2057g f15437g;

        RunnableC5403e(CoverImageAdapter aVar, Context context, String str, int i, int i2, ImageView imageView, C2057g gVar) {
            this.f15431a = aVar;
            this.f15432b = context;
            this.f15433c = str;
            this.f15434d = i;
            this.f15435e = i2;
            this.f15436f = imageView;
            this.f15437g = gVar;
        }

        public final void run() {
            ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f15432b).mo10430i().mo10396a(this.f15433c).mo11129a(AbstractC2354j.f7811a)).mo11143c(R.drawable.doc_cover_error_view)).mo11144c(this.f15434d, this.f15435e)).mo10397a((AbstractC2522j) new ViewTarget(this.f15431a, this.f15436f, this.f15437g));
        }
    }

    /* renamed from: a */
    public final void mo21603a(OnOfficialCoverClickListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        this.f15417a = fVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\b\b\u0000\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter$ViewTarget;", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "img", "Landroid/widget/ImageView;", "skeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "(Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter;Landroid/widget/ImageView;Lcom/ethanhua/skeleton/ViewSkeletonScreen;)V", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "p1", "Lcom/bumptech/glide/request/transition/Transition;", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.a$c */
    public final class ViewTarget extends AbstractC2520h<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ CoverImageAdapter f15421a;

        /* renamed from: b */
        private final ImageView f15422b;

        /* renamed from: c */
        private final C2057g f15423c;

        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: b */
        public void mo10444b(Drawable drawable) {
            super.mo10444b(drawable);
            this.f15423c.mo10130b();
            this.f15422b.setImageDrawable(drawable);
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo21606a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
        }

        /* renamed from: a */
        public void mo21606a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
            Intrinsics.checkParameterIsNotNull(bitmap, "resource");
            this.f15423c.mo10130b();
            this.f15422b.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f15422b.setImageBitmap(bitmap);
        }

        public ViewTarget(CoverImageAdapter aVar, ImageView imageView, C2057g gVar) {
            Intrinsics.checkParameterIsNotNull(imageView, "img");
            Intrinsics.checkParameterIsNotNull(gVar, "skeleton");
            this.f15421a = aVar;
            this.f15422b = imageView;
            this.f15423c = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter$onBindViewHolder$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.a$d */
    public static final class View$OnClickListenerC5402d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f15424a;

        /* renamed from: b */
        final /* synthetic */ CoverImageAdapter f15425b;

        /* renamed from: c */
        final /* synthetic */ CoverImageViewHolder f15426c;

        /* renamed from: d */
        final /* synthetic */ Ref.IntRef f15427d;

        /* renamed from: e */
        final /* synthetic */ Ref.IntRef f15428e;

        /* renamed from: f */
        final /* synthetic */ C2057g f15429f;

        /* renamed from: g */
        final /* synthetic */ OfficialCoverData.CoverItem f15430g;

        View$OnClickListenerC5402d(String str, CoverImageAdapter aVar, CoverImageViewHolder bVar, Ref.IntRef intRef, Ref.IntRef intRef2, C2057g gVar, OfficialCoverData.CoverItem coverItem) {
            this.f15424a = str;
            this.f15425b = aVar;
            this.f15426c = bVar;
            this.f15427d = intRef;
            this.f15428e = intRef2;
            this.f15429f = gVar;
            this.f15430g = coverItem;
        }

        public final void onClick(View view) {
            OnOfficialCoverClickListener fVar = this.f15425b.f15417a;
            if (fVar != null) {
                fVar.mo21621a(this.f15424a, this.f15430g.getMimeType());
            }
        }
    }

    /* renamed from: a */
    public final void mo21604a(List<OfficialCoverData.CoverItem> list) {
        if (list != null) {
            this.f15418c.clear();
            this.f15418c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public CoverImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_cover_image_item, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new CoverImageViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(CoverImageViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        OfficialCoverData.CoverItem coverItem = this.f15418c.get(i);
        C2057g a = C11841g.m49167a(bVar.mo21605a()).mo10154b(R.color.space_kit_n200).mo10151a(R.layout.doc_cover_skeleton_view).mo10153a();
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "it");
        int e = C13749l.m55760e(view.getContext());
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.doc_cover_padding);
        intRef.element = (((e - dimensionPixelSize) - view.getResources().getDimensionPixelSize(R.dimen.doc_cover_padding)) - (view.getResources().getDimensionPixelSize(R.dimen.doc_cover_item_space) * 4)) / 4;
        intRef2.element = (int) (((float) intRef.element) * 0.68f);
        view.setLayoutParams(new ViewGroup.LayoutParams(intRef.element, intRef2.element));
        String token = coverItem.getToken();
        if (token != null) {
            View view2 = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "holder.itemView.context");
            int i2 = intRef.element;
            int i3 = intRef2.element;
            Intrinsics.checkExpressionValueIsNotNull(a, "skeleton");
            m21951a(context, token, bVar.mo21605a(), i2, i3, a, coverItem.getPriority());
            bVar.mo21605a().setOnClickListener(new View$OnClickListenerC5402d(token, this, bVar, intRef, intRef2, a, coverItem));
        }
    }

    /* renamed from: a */
    public final void mo21601a(Context context, String str, ImageView imageView, int i, int i2, C2057g gVar) {
        Context context2;
        if (context != null) {
            if (!(context instanceof Activity)) {
                context2 = null;
            } else {
                context2 = context;
            }
            Activity activity = (Activity) context2;
            if (activity == null || !activity.isFinishing()) {
                C13742g.m55705a(new RunnableC5403e(this, context, str, i, i2, imageView, gVar));
            }
        }
    }

    /* renamed from: a */
    private final void m21951a(Context context, String str, ImageView imageView, int i, int i2, C2057g gVar, int i3) {
        File file = new File(CCMStorage.f15230a.mo21334b(context, Biz.DOCS, "cover"));
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(File.separator);
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ENGLISH");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("_cover.png");
            String sb2 = sb.toString();
            boolean exists = new File(sb2).exists();
            C13479a.m54772d("DocCover_OfficialCoverSelectionFragment", "driveLoadImage()... localPath = " + sb2 + ", isExist = " + exists);
            if (exists) {
                mo21601a(context, sb2, imageView, i, i2, gVar);
                return;
            }
            DownloadRequestInfo a = new DownloadRequestInfo.C9355a().mo35662a(sb2).mo35666b(str).mo35659a(DownloadRequestInfo.DownloadType.COVER).mo35660a(new DownloadRequestInfo.C9356b(360, 360, "near")).mo35656a(i3).mo35658a(new CoverImageAdapter$driveLoadImage$downloadCallback$1(this, context, sb2, imageView, i, i2, gVar)).mo35664a();
            Intrinsics.checkExpressionValueIsNotNull(a, "DownloadRequestInfo.Buil…\n                .build()");
            ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19649a(a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
