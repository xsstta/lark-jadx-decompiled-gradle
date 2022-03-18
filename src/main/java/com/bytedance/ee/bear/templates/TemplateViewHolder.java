package com.bytedance.ee.bear.templates;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2520h;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.glide.p383a.C7748b;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.templates.center.list.C11510d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.C11841g;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p717s.C13723a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u000234B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J(\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010-\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180/H\u0002J\u001e\u00100\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180/H\u0016J\u0018\u00101\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\t2\u0006\u00102\u001a\u00020 H\u0002R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \r*\u0004\u0018\u00010\u00150\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewHolder;", "Lcom/bytedance/ee/bear/templates/ITemplateViewHolder;", "view", "Landroid/view/View;", "layoutType", "Lcom/bytedance/ee/bear/templates/LayoutType;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "createType", "", "(Landroid/view/View;Lcom/bytedance/ee/bear/templates/LayoutType;Lcom/bytedance/ee/bear/service/ServiceContext;I)V", "coverImg", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "labelTxt", "Landroid/widget/TextView;", "moreIv", "operationTagImg", "templateNameTxt", "thumbnailImg", "thumbnailLayout", "Landroid/widget/FrameLayout;", "typeIcon", "displayCover", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "displayMixture", "displayThumbnail", "getBackgroundByType", ShareHitPoint.f121869d, "getCoverDownloadUrl", "", "coverDownloadUrl", "coverToken", "getHeat", "heat", "", "loadCover", "iv", "loadThumbnail", "objToken", "thumbnailExtra", "Lcom/bytedance/ee/bear/templates/ThumbnailExtra;", "showBottomLabel", "showMoreIv", "deleteListener", "Lkotlin/Function0;", "showTemplate", "showTemplateIconAndName", "templateName", "Companion", "ViewTarget", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.i */
public final class TemplateViewHolder extends ITemplateViewHolder {

    /* renamed from: e */
    public static final int f31040e = ((((C13655e.m55409a() - C11510d.f30971b) - C11510d.f30970a) / 2) - C13655e.m55411a(16));

    /* renamed from: f */
    public static final int f31041f = C13655e.m55411a(83);

    /* renamed from: g */
    public static final Companion f31042g = new Companion(null);

    /* renamed from: a */
    public final ImageView f31043a;

    /* renamed from: b */
    public final ImageView f31044b;

    /* renamed from: c */
    public final View f31045c;

    /* renamed from: d */
    public final LayoutType f31046d;

    /* renamed from: h */
    private final ImageView f31047h;

    /* renamed from: i */
    private final FrameLayout f31048i;

    /* renamed from: j */
    private final ImageView f31049j;

    /* renamed from: k */
    private final ImageView f31050k;

    /* renamed from: l */
    private final TextView f31051l;

    /* renamed from: m */
    private final TextView f31052m;

    /* renamed from: n */
    private final C10917c f31053n;

    /* renamed from: o */
    private final int f31054o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewHolder$Companion;", "", "()V", "DOWNLOAD_FILE_ALL_PATH", "", "TAG", "ivHeight", "", "getIvHeight", "()I", "ivgWidth", "getIvgWidth", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.templates.ITemplateViewHolder
    /* renamed from: a */
    public void mo43935a(TemplateV4 templateV4, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        Intrinsics.checkParameterIsNotNull(function0, "deleteListener");
        this.f31045c.setAlpha(templateV4.getEnable() ? 1.0f : 0.3f);
        boolean z = true;
        if (templateV4.getDisplayType() == 1) {
            m48015a(templateV4);
        } else if (templateV4.getDisplayType() == 2) {
            m48019c(templateV4);
        } else {
            m48017b(templateV4);
        }
        m48018b(templateV4, function0);
        ImageView imageView = this.f31043a;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "operationTagImg");
        imageView.setVisibility(8);
        if (templateV4.getOperationalLabel().length() != 0) {
            z = false;
        }
        if (!z) {
            ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f31045c.getContext()).mo10414a(new C13664a(templateV4.getOperationalLabel())).mo11155l()).mo10401b((AbstractC2536f) new C11530e(this)).mo11144c(C13655e.m55411a(100), C13655e.m55411a(14))).mo10399a(this.f31043a);
        }
        m48013a(templateV4.getObjType(), templateV4.getName());
        m48020d(templateV4);
    }

    /* renamed from: a */
    private final void m48016a(String str, int i, ThumbnailExtra thumbnailExtra, TemplateV4 templateV4) {
        C7754c cVar = new C7754c("", thumbnailExtra.getThumbnail(), i, thumbnailExtra.getType(), thumbnailExtra.getDecryptKey(), "", "template", true, "v4.1", this.f31049j, this.f31053n);
        this.f31049j.setTag(R.id.thumbnail_tag, templateV4.getObjToken());
        ImageView imageView = this.f31049j;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "thumbnailImg");
        C2124f a = ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(imageView.getContext()).mo10430i().mo11129a(AbstractC2354j.f7812b)).mo11130a((AbstractC2393i<Bitmap>) new C7748b(f31041f, f31040e))).mo11143c(R.drawable.template_load_fail)).mo10395a((Object) cVar);
        ImageView imageView2 = this.f31049j;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "thumbnailImg");
        a.mo10397a((AbstractC2522j) new ViewTarget(this, imageView2, str, false, templateV4));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\r\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00022\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewHolder$ViewTarget;", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "destImg", "Landroid/widget/ImageView;", "tag", "", "isCover", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "(Lcom/bytedance/ee/bear/templates/TemplateViewHolder;Landroid/widget/ImageView;Ljava/lang/String;ZLcom/bytedance/ee/bear/templates/TemplateV4;)V", "attachListener", "com/bytedance/ee/bear/templates/TemplateViewHolder$ViewTarget$attachListener$1", "Lcom/bytedance/ee/bear/templates/TemplateViewHolder$ViewTarget$attachListener$1;", "isLoadFinish", "runnable", "Ljava/lang/Runnable;", "skeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "hideSkeletonAnim", "", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onLoadStarted", "placeholder", "onResourceReady", "resource", "glideAnimation", "Lcom/bumptech/glide/request/transition/Transition;", "postSkeletonAnim", "showSkeletonAnim", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.i$b */
    public final class ViewTarget extends AbstractC2520h<Bitmap> {

        /* renamed from: a */
        public final Runnable f31055a = new RunnableC11525b(this);

        /* renamed from: b */
        public final ImageView f31056b;

        /* renamed from: c */
        final /* synthetic */ TemplateViewHolder f31057c;

        /* renamed from: d */
        private C2057g f31058d;

        /* renamed from: e */
        private boolean f31059e;

        /* renamed from: f */
        private final View$OnAttachStateChangeListenerC11524a f31060f = new View$OnAttachStateChangeListenerC11524a(this);

        /* renamed from: g */
        private final String f31061g;

        /* renamed from: h */
        private final boolean f31062h;

        /* renamed from: i */
        private final TemplateV4 f31063i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.i$b$b */
        static final class RunnableC11525b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTarget f31065a;

            RunnableC11525b(ViewTarget bVar) {
                this.f31065a = bVar;
            }

            public final void run() {
                this.f31065a.mo44271b();
            }
        }

        /* renamed from: c */
        private final void m48022c() {
            this.f31056b.postDelayed(this.f31055a, 100);
            this.f31056b.addOnAttachStateChangeListener(this.f31060f);
        }

        /* renamed from: d */
        private final void m48023d() {
            try {
                C2057g gVar = this.f31058d;
                if (gVar != null) {
                    gVar.mo10130b();
                }
                this.f31056b.removeOnAttachStateChangeListener(this.f31060f);
            } catch (Exception e) {
                C13479a.m54759a("TemplateViewHolder2", "hideSkeletonAnim(): ", e);
            }
        }

        /* renamed from: b */
        public final void mo44271b() {
            int i;
            if (!this.f31059e) {
                if (this.f31062h) {
                    i = this.f31057c.f31046d.getCoverSkeletonLayId();
                } else {
                    i = this.f31057c.f31046d.getThumbnailSkeletonLayId();
                }
                this.f31058d = C11841g.m49167a(this.f31056b).mo10151a(i).mo10154b(R.color.bg_body_overlay).mo10153a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/templates/TemplateViewHolder$ViewTarget$attachListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.i$b$a */
        public static final class View$OnAttachStateChangeListenerC11524a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ ViewTarget f31064a;

            public void onViewAttachedToWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            View$OnAttachStateChangeListenerC11524a(ViewTarget bVar) {
                this.f31064a = bVar;
            }

            public void onViewDetachedFromWindow(View view) {
                this.f31064a.f31056b.removeCallbacks(this.f31064a.f31055a);
            }
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: c */
        public void mo11172c(Drawable drawable) {
            super.mo11172c(drawable);
            m48022c();
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: b */
        public void mo10444b(Drawable drawable) {
            super.mo10444b(drawable);
            this.f31059e = true;
            C13479a.m54758a("TemplateViewHolder2", "onLoadFailed(): ");
            m48023d();
            if (Intrinsics.areEqual(this.f31056b.getTag(R.id.thumbnail_tag), this.f31061g)) {
                this.f31056b.setScaleType(ImageView.ScaleType.CENTER);
                this.f31056b.setImageDrawable(drawable);
                return;
            }
            C13479a.m54758a("TemplateViewHolder2", "onResourceReady()... tag not equals");
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo44270a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
        }

        /* renamed from: a */
        public void mo44270a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
            Intrinsics.checkParameterIsNotNull(bitmap, "resource");
            this.f31059e = true;
            m48023d();
            if (Intrinsics.areEqual(this.f31056b.getTag(R.id.thumbnail_tag), this.f31061g)) {
                this.f31056b.setImageBitmap(bitmap);
            } else {
                C13479a.m54758a("TemplateViewHolder2", "onResourceReady()... tag not equals");
            }
        }

        public ViewTarget(TemplateViewHolder iVar, ImageView imageView, String str, boolean z, TemplateV4 templateV4) {
            Intrinsics.checkParameterIsNotNull(imageView, "destImg");
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(templateV4, "template");
            this.f31057c = iVar;
            this.f31056b = imageView;
            this.f31061g = str;
            this.f31062h = z;
            this.f31063i = templateV4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/TemplateViewHolder$showMoreIv$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.i$c */
    public static final class C11526c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ TemplateViewHolder f31066a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31067b;

        /* renamed from: c */
        final /* synthetic */ Function0 f31068c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.i$c$b */
        static final class C11528b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C11526c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11528b(C11526c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                TemplateReportV2.f31015b.mo44260g(this.this$0.f31067b.getReportToken());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.i$c$a */
        static final class C11527a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C11526c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11527a(C11526c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                TemplateReport.f31011b.mo44231b("share");
                TemplateReport.f31011b.mo44231b("click_share");
                TemplateReportV2.f31015b.mo44252d(this.this$0.f31067b);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            TemplateUtils gVar = TemplateUtils.f31021a;
            Context context = this.f31066a.f31045c.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            gVar.mo44262a(context, this.f31067b.getObjType(), this.f31067b.getObjToken(), new C11527a(this), new C11528b(this), this.f31068c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11526c(TemplateViewHolder iVar, TemplateV4 templateV4, Function0 function0, int i) {
            super(i);
            this.f31066a = iVar;
            this.f31067b = templateV4;
            this.f31068c = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.i$d */
    public static final class RunnableC11529d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TemplateViewHolder f31069a;

        RunnableC11529d(TemplateViewHolder iVar) {
            this.f31069a = iVar;
        }

        public final void run() {
            Rect rect = new Rect(this.f31069a.f31044b.getLeft() - C13655e.m55411a(20), this.f31069a.f31044b.getTop() - C13655e.m55411a(20), this.f31069a.f31045c.getRight(), this.f31069a.f31045c.getBottom());
            ViewParent parent = this.f31069a.f31044b.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.setTouchDelegate(new TouchDelegate(rect, this.f31069a.f31044b));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/templates/TemplateViewHolder$showTemplate$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "p0", "Lcom/bumptech/glide/load/engine/GlideException;", "p1", "", "p2", "Lcom/bumptech/glide/request/target/Target;", "p3", "onResourceReady", "Lcom/bumptech/glide/load/DataSource;", "p4", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.i$e */
    public static final class C11530e implements AbstractC2536f<Drawable> {

        /* renamed from: a */
        final /* synthetic */ TemplateViewHolder f31070a;

        @Override // com.bumptech.glide.request.AbstractC2536f
        /* renamed from: a */
        public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11530e(TemplateViewHolder iVar) {
            this.f31070a = iVar;
        }

        /* renamed from: a */
        public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
            ImageView imageView = this.f31070a.f31043a;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "operationTagImg");
            imageView.setVisibility(0);
            this.f31070a.f31043a.setImageDrawable(drawable);
            return true;
        }
    }

    /* renamed from: a */
    private final int m48010a(int i) {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        if (i == aVar.mo32555b()) {
            return R.drawable.template_shadow_blue;
        }
        C8275a aVar2 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
        if (i == aVar2.mo32555b()) {
            return R.drawable.template_shadow_green;
        }
        C8275a aVar3 = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
        if (i == aVar3.mo32555b()) {
            return R.drawable.template_shadow_wathet;
        }
        if (i == 8) {
            return R.drawable.template_shadow_cyan;
        }
        return R.drawable.template_shadow_blue;
    }

    /* renamed from: b */
    private final void m48017b(TemplateV4 templateV4) {
        this.f31047h.setBackgroundResource(m48010a(templateV4.getObjType()));
        FrameLayout frameLayout = this.f31048i;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "thumbnailLayout");
        frameLayout.setVisibility(0);
        ImageView imageView = this.f31049j;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "thumbnailImg");
        m48014a(imageView, templateV4);
    }

    /* renamed from: c */
    private final void m48019c(TemplateV4 templateV4) {
        this.f31047h.setBackgroundResource(m48010a(templateV4.getObjType()));
        FrameLayout frameLayout = this.f31048i;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "thumbnailLayout");
        frameLayout.setVisibility(0);
        m48016a(templateV4.getObjToken(), templateV4.getObjType(), templateV4.getThumbnailExtra(), templateV4);
    }

    /* renamed from: a */
    private final String m48011a(long j) {
        long j2 = (long) 1000;
        if (j < j2) {
            return String.valueOf(j);
        }
        long j3 = (long) 9999;
        if (j2 <= j && j3 >= j) {
            DecimalFormat decimalFormat = new DecimalFormat("0.#");
            decimalFormat.setRoundingMode(RoundingMode.FLOOR);
            return decimalFormat.format(Float.valueOf(((float) j) / ((float) 1000))) + "k";
        }
        DecimalFormat decimalFormat2 = new DecimalFormat("0.#");
        decimalFormat2.setRoundingMode(RoundingMode.FLOOR);
        return decimalFormat2.format(Float.valueOf(((float) j) / ((float) HwBuildEx.VersionCodes.CUR_DEVELOPMENT))) + "w";
    }

    /* renamed from: d */
    private final void m48020d(TemplateV4 templateV4) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String string = this.f31045c.getContext().getString(R.string.Doc_List_template_shared_by_failed);
        Intrinsics.checkExpressionValueIsNotNull(string, "view.context.getString(R…emplate_shared_by_failed)");
        int bottomLabelType = templateV4.getBottomLabelType();
        boolean z = true;
        if (bottomLabelType == 1) {
            TextView textView = this.f31052m;
            Intrinsics.checkExpressionValueIsNotNull(textView, "labelTxt");
            if (templateV4.getHeat() < 0) {
                str = string;
            } else {
                str = C10539a.m43639a(this.f31045c.getContext(), R.string.Doc_List_TemplateUseNUmber, "TemplateUsedPeople", m48011a(templateV4.getHeat()));
            }
            textView.setText(str);
        } else if (bottomLabelType == 2) {
            TextView textView2 = this.f31052m;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "labelTxt");
            if (templateV4.getCreateTime() <= 0) {
                str2 = string;
            } else {
                str2 = C10539a.m43639a(this.f31045c.getContext(), R.string.Doc_List_template_custom_created_by_me_v2, "time", C13723a.m55666f(this.f31045c.getContext(), templateV4.getCreateTime() * ((long) 1000)));
            }
            textView2.setText(str2);
        } else if (bottomLabelType == 3) {
            TextView textView3 = this.f31052m;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "labelTxt");
            if (templateV4.getUserName().length() != 0) {
                z = false;
            }
            if (z) {
                str3 = string;
            } else {
                str3 = C10539a.m43639a(this.f31045c.getContext(), R.string.Doc_List_template_custom_shared_by_v2, "share_name", templateV4.getUserName());
            }
            textView3.setText(str3);
        } else if (bottomLabelType == 4) {
            TextView textView4 = this.f31052m;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "labelTxt");
            if (templateV4.getUpdateTime() <= 0) {
                str4 = string;
            } else {
                str4 = C10539a.m43639a(this.f31045c.getContext(), R.string.CreationMobile_Template_RecentlyUsedTime, "time", C13723a.m55666f(this.f31045c.getContext(), templateV4.getLastUsedTime() * ((long) 1000)));
            }
            textView4.setText(str4);
        } else if (bottomLabelType == 5) {
            TextView textView5 = this.f31052m;
            Intrinsics.checkExpressionValueIsNotNull(textView5, "labelTxt");
            if (templateV4.getUpdateTime() <= 0) {
                str5 = string;
            } else {
                str5 = C10539a.m43639a(this.f31045c.getContext(), R.string.CreationMobile_Operation_CreatedonSomeTime, "time", C13723a.m55666f(this.f31045c.getContext(), templateV4.getUpdateTime() * ((long) 1000)));
            }
            textView5.setText(str5);
        }
    }

    /* renamed from: a */
    private final void m48015a(TemplateV4 templateV4) {
        this.f31047h.setBackgroundColor(0);
        ImageView imageView = this.f31047h;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "coverImg");
        imageView.setVisibility(0);
        FrameLayout frameLayout = this.f31048i;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "thumbnailLayout");
        frameLayout.setVisibility(8);
        ImageView imageView2 = this.f31047h;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "coverImg");
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView3 = this.f31047h;
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "coverImg");
        m48014a(imageView3, templateV4);
    }

    /* renamed from: b */
    private final void m48018b(TemplateV4 templateV4, Function0<Unit> function0) {
        if (this.f31044b == null) {
            return;
        }
        if (templateV4.getSource() != 2) {
            this.f31044b.setVisibility(8);
            return;
        }
        this.f31044b.setVisibility(0);
        this.f31044b.setOnClickListener(new C11526c(this, templateV4, function0, LocationRequest.PRIORITY_INDOOR));
        this.f31044b.post(new RunnableC11529d(this));
    }

    /* renamed from: a */
    private final String m48012a(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return str;
        }
        C13479a.m54775e("TemplateViewHolder2", "coverDownloadUrl is empty, join url by coverToken");
        return "https://" + C6313i.f17510b + "/space/api/box/stream/download/all/" + str2;
    }

    /* renamed from: a */
    private final void m48013a(int i, String str) {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        int b = aVar.mo32555b();
        int i2 = R.drawable.ud_icon_file_doc_colorful;
        if (i != b) {
            C8275a aVar2 = C8275a.f22372e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
            if (i == aVar2.mo32555b()) {
                i2 = R.drawable.ud_icon_file_sheet_colorful;
            } else {
                C8275a aVar3 = C8275a.f22374g;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
                if (i == aVar3.mo32555b()) {
                    i2 = R.drawable.ud_icon_file_mindnote_colorful;
                } else {
                    C8275a aVar4 = C8275a.f22373f;
                    Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.BITABLE");
                    if (i == aVar4.mo32555b()) {
                        i2 = R.drawable.ud_icon_file_bitable_colorful;
                    } else {
                        C8275a aVar5 = C8275a.f22378k;
                        Intrinsics.checkExpressionValueIsNotNull(aVar5, "DocumentType.DOCX");
                        if (i == aVar5.mo32555b()) {
                            i2 = R.drawable.ud_icon_file_docx_colorful;
                        }
                    }
                }
            }
        }
        this.f31050k.setImageResource(i2);
        TextView textView = this.f31051l;
        Intrinsics.checkExpressionValueIsNotNull(textView, "templateNameTxt");
        textView.setText(str);
    }

    /* renamed from: a */
    private final void m48014a(ImageView imageView, TemplateV4 templateV4) {
        imageView.setTag(R.id.thumbnail_tag, templateV4.getObjToken());
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f31045c.getContext()).mo10430i().mo10395a((Object) new C13664a(m48012a(templateV4.getCoverDownloadUrl(), templateV4.getCoverToken()))).mo11143c((int) R.drawable.template_load_fail)).mo11130a((AbstractC2393i<Bitmap>) new C7748b(f31041f, f31040e))).mo10397a((AbstractC2522j) new ViewTarget(this, imageView, templateV4.getObjToken(), true, templateV4));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateViewHolder(View view, LayoutType layoutType, C10917c cVar, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(layoutType, "layoutType");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f31045c = view;
        this.f31046d = layoutType;
        this.f31053n = cVar;
        this.f31054o = i;
        this.f31047h = (ImageView) view.findViewById(R.id.coverImg);
        this.f31043a = (ImageView) view.findViewById(R.id.operationLabelImg);
        this.f31048i = (FrameLayout) view.findViewById(R.id.thumbnailLayout);
        this.f31049j = (ImageView) view.findViewById(R.id.thumbnailImg);
        this.f31050k = (ImageView) view.findViewById(R.id.typeIcon);
        this.f31051l = (TextView) view.findViewById(R.id.templateNameTxt);
        this.f31052m = (TextView) view.findViewById(R.id.labelTxt);
        this.f31044b = (ImageView) view.findViewById(R.id.moreIv);
    }
}
