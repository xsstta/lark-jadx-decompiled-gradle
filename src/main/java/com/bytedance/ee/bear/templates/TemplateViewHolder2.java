package com.bytedance.ee.bear.templates;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import com.bytedance.ee.bear.appsetting.C4211a;
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
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u000212B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J(\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010*\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160-H\u0002J\u001e\u0010.\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160-H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \r*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewHolder2;", "Lcom/bytedance/ee/bear/templates/ITemplateViewHolder;", "view", "Landroid/view/View;", "layoutType", "Lcom/bytedance/ee/bear/templates/LayoutType;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "createType", "", "(Landroid/view/View;Lcom/bytedance/ee/bear/templates/LayoutType;Lcom/bytedance/ee/bear/service/ServiceContext;I)V", "labelTxt", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "moreIv", "Landroid/widget/ImageView;", "operationTagImg", "templateNameTxt", "thumbnailImg", "topView", "typeIcon", "displayMixture", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "displayThumbnail", "getCoverDownloadUrl", "", "coverDownloadUrl", "coverToken", "getHeat", "heat", "", "getTransformation", "Lcom/bytedance/ee/bear/facade/glide/thumbnail/LeftCropForView;", "loadCover", "iv", "loadThumbnail", "objToken", ShareHitPoint.f121869d, "thumbnailExtra", "Lcom/bytedance/ee/bear/templates/ThumbnailExtra;", "showBottomLabel", "showMoreIv", "deleteListener", "Lkotlin/Function0;", "showTemplate", "showTemplateIconAndName", "showTopColor", "Companion", "ViewTarget", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.j */
public final class TemplateViewHolder2 extends ITemplateViewHolder {

    /* renamed from: e */
    public static final int f31071e = ((((C13655e.m55409a() - C11510d.f30971b) - C11510d.f30970a) / 2) - C13655e.m55411a(12));

    /* renamed from: f */
    public static final int f31072f = C13655e.m55411a(89);

    /* renamed from: g */
    public static final int f31073g = C13655e.m55411a((int) SmActions.ACTION_ONTHECALL_EXIT);

    /* renamed from: h */
    public static final int f31074h = C13655e.m55411a(76);

    /* renamed from: i */
    public static final Companion f31075i = new Companion(null);

    /* renamed from: a */
    public final ImageView f31076a;

    /* renamed from: b */
    public final ImageView f31077b;

    /* renamed from: c */
    public final View f31078c;

    /* renamed from: d */
    public final LayoutType f31079d;

    /* renamed from: j */
    private final ImageView f31080j;

    /* renamed from: k */
    private final ImageView f31081k;

    /* renamed from: l */
    private final TextView f31082l;

    /* renamed from: m */
    private final TextView f31083m;

    /* renamed from: n */
    private final View f31084n;

    /* renamed from: o */
    private final C10917c f31085o;

    /* renamed from: p */
    private final int f31086p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewHolder2$Companion;", "", "()V", "DOWNLOAD_FILE_ALL_PATH", "", "TAG", "ivHeight", "", "getIvHeight", "()I", "ivHeightForRecommend", "getIvHeightForRecommend", "ivWidthForRecommend", "getIvWidthForRecommend", "ivgWidth", "getIvgWidth", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.j$a */
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
        this.f31078c.setAlpha(templateV4.getEnable() ? 1.0f : 0.3f);
        boolean z = false;
        if (templateV4.isSceneTemplate()) {
            this.f31080j.setPadding(0, 0, 0, 0);
        } else {
            this.f31080j.setPadding(C13655e.m55411a(6), C13655e.m55411a(4), C13655e.m55411a(6), 0);
        }
        if (templateV4.getDisplayType() == 2) {
            m48040b(templateV4);
        } else {
            m48038a(templateV4);
        }
        m48041b(templateV4, function0);
        ImageView imageView = this.f31076a;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "operationTagImg");
        imageView.setVisibility(8);
        if (templateV4.getOperationalLabelV2().length() == 0) {
            z = true;
        }
        if (!z) {
            ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f31078c.getContext()).mo10414a(new C13664a(templateV4.getOperationalLabelV2())).mo11155l()).mo10401b((AbstractC2536f) new C11537e(this)).mo11144c(C13655e.m55411a(100), C13655e.m55411a(14))).mo10399a(this.f31076a);
        }
        m48042c(templateV4);
        m48036a(templateV4.getObjType());
        m48043d(templateV4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u000b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00022\u0010\u0010\u001c\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002R\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewHolder2$ViewTarget;", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "destImg", "Landroid/widget/ImageView;", "tag", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "(Lcom/bytedance/ee/bear/templates/TemplateViewHolder2;Landroid/widget/ImageView;Ljava/lang/String;Lcom/bytedance/ee/bear/templates/TemplateV4;)V", "attachListener", "com/bytedance/ee/bear/templates/TemplateViewHolder2$ViewTarget$attachListener$1", "Lcom/bytedance/ee/bear/templates/TemplateViewHolder2$ViewTarget$attachListener$1;", "isLoadFinish", "", "runnable", "Ljava/lang/Runnable;", "skeleton", "Lcom/ethanhua/skeleton/ViewSkeletonScreen;", "hideSkeletonAnim", "", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onLoadStarted", "placeholder", "onResourceReady", "resource", "glideAnimation", "Lcom/bumptech/glide/request/transition/Transition;", "postSkeletonAnim", "showSkeletonAnim", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.j$b */
    public final class ViewTarget extends AbstractC2520h<Bitmap> {

        /* renamed from: a */
        public final Runnable f31087a = new RunnableC11532b(this);

        /* renamed from: b */
        public final ImageView f31088b;

        /* renamed from: c */
        final /* synthetic */ TemplateViewHolder2 f31089c;

        /* renamed from: d */
        private C2057g f31090d;

        /* renamed from: e */
        private boolean f31091e;

        /* renamed from: f */
        private final View$OnAttachStateChangeListenerC11531a f31092f = new View$OnAttachStateChangeListenerC11531a(this);

        /* renamed from: g */
        private final String f31093g;

        /* renamed from: h */
        private final TemplateV4 f31094h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.j$b$b */
        static final class RunnableC11532b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewTarget f31096a;

            RunnableC11532b(ViewTarget bVar) {
                this.f31096a = bVar;
            }

            public final void run() {
                this.f31096a.mo44278b();
            }
        }

        /* renamed from: c */
        private final void m48045c() {
            this.f31088b.postDelayed(this.f31087a, 100);
            this.f31088b.addOnAttachStateChangeListener(this.f31092f);
        }

        /* renamed from: d */
        private final void m48046d() {
            try {
                C2057g gVar = this.f31090d;
                if (gVar != null) {
                    gVar.mo10130b();
                }
                this.f31088b.removeOnAttachStateChangeListener(this.f31092f);
            } catch (Exception e) {
                C13479a.m54759a("TemplateViewHolder2", "hideSkeletonAnim(): ", e);
            }
        }

        /* renamed from: b */
        public final void mo44278b() {
            ImageView imageView;
            if (!this.f31091e) {
                int thumbnailSkeletonLayId = this.f31089c.f31079d.getThumbnailSkeletonLayId();
                if (this.f31089c.f31079d == LayoutType.TYPE_RECOMMEND || this.f31089c.f31079d == LayoutType.TYPE_RECOMMEND2) {
                    imageView = this.f31088b;
                } else {
                    ViewParent parent = this.f31088b.getParent();
                    if (parent != null) {
                        imageView = (View) parent;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                    }
                }
                this.f31090d = C11841g.m49167a(imageView).mo10151a(thumbnailSkeletonLayId).mo10154b(R.color.bg_body_overlay).mo10153a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/templates/TemplateViewHolder2$ViewTarget$attachListener$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.j$b$a */
        public static final class View$OnAttachStateChangeListenerC11531a implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ ViewTarget f31095a;

            public void onViewAttachedToWindow(View view) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            View$OnAttachStateChangeListenerC11531a(ViewTarget bVar) {
                this.f31095a = bVar;
            }

            public void onViewDetachedFromWindow(View view) {
                this.f31095a.f31088b.removeCallbacks(this.f31095a.f31087a);
            }
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: c */
        public void mo11172c(Drawable drawable) {
            super.mo11172c(drawable);
            m48045c();
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: b */
        public void mo10444b(Drawable drawable) {
            super.mo10444b(drawable);
            this.f31091e = true;
            C13479a.m54758a("TemplateViewHolder2", "onLoadFailed(): ");
            m48046d();
            if (Intrinsics.areEqual(this.f31088b.getTag(R.id.thumbnail_tag), this.f31093g)) {
                this.f31088b.setScaleType(ImageView.ScaleType.CENTER);
                this.f31088b.setImageDrawable(drawable);
                return;
            }
            C13479a.m54758a("TemplateViewHolder2", "onResourceReady()... tag not equals");
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo44277a((Bitmap) obj, (AbstractC2529b<? super Bitmap>) bVar);
        }

        /* renamed from: a */
        public void mo44277a(Bitmap bitmap, AbstractC2529b<? super Bitmap> bVar) {
            Intrinsics.checkParameterIsNotNull(bitmap, "resource");
            this.f31091e = true;
            m48046d();
            if (Intrinsics.areEqual(this.f31088b.getTag(R.id.thumbnail_tag), this.f31093g)) {
                this.f31088b.setImageBitmap(bitmap);
            } else {
                C13479a.m54758a("TemplateViewHolder2", "onResourceReady()... tag not equals");
            }
        }

        public ViewTarget(TemplateViewHolder2 jVar, ImageView imageView, String str, TemplateV4 templateV4) {
            Intrinsics.checkParameterIsNotNull(imageView, "destImg");
            Intrinsics.checkParameterIsNotNull(str, "tag");
            Intrinsics.checkParameterIsNotNull(templateV4, "template");
            this.f31089c = jVar;
            this.f31088b = imageView;
            this.f31093g = str;
            this.f31094h = templateV4;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/TemplateViewHolder2$showMoreIv$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.j$c */
    public static final class C11533c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ TemplateViewHolder2 f31097a;

        /* renamed from: b */
        final /* synthetic */ TemplateV4 f31098b;

        /* renamed from: c */
        final /* synthetic */ Function0 f31099c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.j$c$b */
        static final class C11535b extends Lambda implements Function0<Unit> {
            final /* synthetic */ C11533c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11535b(C11533c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                TemplateReportV2.f31015b.mo44260g(this.this$0.f31098b.getReportToken());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.j$c$a */
        static final class C11534a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C11533c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11534a(C11533c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                TemplateReport.f31011b.mo44231b("share");
                TemplateReport.f31011b.mo44231b("click_share");
                TemplateReportV2.f31015b.mo44252d(this.this$0.f31098b);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            TemplateUtils gVar = TemplateUtils.f31021a;
            Context context = this.f31097a.f31078c.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
            gVar.mo44262a(context, this.f31098b.getObjType(), this.f31098b.getObjToken(), new C11534a(this), new C11535b(this), this.f31099c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11533c(TemplateViewHolder2 jVar, TemplateV4 templateV4, Function0 function0, int i) {
            super(i);
            this.f31097a = jVar;
            this.f31098b = templateV4;
            this.f31099c = function0;
        }
    }

    /* renamed from: a */
    private final C7748b m48033a() {
        int i = C11538k.f31102a[this.f31079d.ordinal()];
        if (i == 1 || i == 2) {
            return new C7748b(f31074h, f31073g);
        }
        return new C7748b(f31072f, f31071e);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.j$d */
    public static final class RunnableC11536d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TemplateViewHolder2 f31100a;

        RunnableC11536d(TemplateViewHolder2 jVar) {
            this.f31100a = jVar;
        }

        public final void run() {
            Rect rect = new Rect(this.f31100a.f31077b.getLeft() - C13655e.m55411a(20), this.f31100a.f31077b.getTop() - C13655e.m55411a(20), this.f31100a.f31078c.getRight(), this.f31100a.f31078c.getBottom());
            ViewParent parent = this.f31100a.f31077b.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.setTouchDelegate(new TouchDelegate(rect, this.f31100a.f31077b));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"com/bytedance/ee/bear/templates/TemplateViewHolder2$showTemplate$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "p0", "Lcom/bumptech/glide/load/engine/GlideException;", "p1", "", "p2", "Lcom/bumptech/glide/request/target/Target;", "p3", "onResourceReady", "Lcom/bumptech/glide/load/DataSource;", "p4", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.j$e */
    public static final class C11537e implements AbstractC2536f<Drawable> {

        /* renamed from: a */
        final /* synthetic */ TemplateViewHolder2 f31101a;

        @Override // com.bumptech.glide.request.AbstractC2536f
        /* renamed from: a */
        public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11537e(TemplateViewHolder2 jVar) {
            this.f31101a = jVar;
        }

        /* renamed from: a */
        public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
            ImageView imageView = this.f31101a.f31076a;
            Intrinsics.checkExpressionValueIsNotNull(imageView, "operationTagImg");
            imageView.setVisibility(0);
            this.f31101a.f31076a.setImageDrawable(drawable);
            return true;
        }
    }

    /* renamed from: a */
    private final void m48038a(TemplateV4 templateV4) {
        ImageView imageView = this.f31080j;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "thumbnailImg");
        m48037a(imageView, templateV4);
    }

    /* renamed from: b */
    private final void m48040b(TemplateV4 templateV4) {
        m48039a(templateV4.getObjToken(), templateV4.getObjType(), templateV4.getThumbnailExtra(), templateV4);
    }

    /* renamed from: a */
    private final String m48034a(long j) {
        if (j < ((long) 1000)) {
            return String.valueOf(j);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        return decimalFormat.format(Float.valueOf(((float) j) / ((float) 1000))) + "k";
    }

    /* renamed from: c */
    private final void m48042c(TemplateV4 templateV4) {
        int objType = templateV4.getObjType();
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        int b = aVar.mo32555b();
        int i = R.drawable.ud_icon_file_doc_colorful;
        if (objType != b) {
            C8275a aVar2 = C8275a.f22372e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
            if (objType == aVar2.mo32555b()) {
                i = R.drawable.ud_icon_file_sheet_colorful;
            } else {
                C8275a aVar3 = C8275a.f22374g;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
                if (objType == aVar3.mo32555b()) {
                    i = R.drawable.ud_icon_file_mindnote_colorful;
                } else if (objType == 8) {
                    i = R.drawable.ud_icon_file_bitable_colorful;
                } else {
                    C8275a aVar4 = C8275a.f22378k;
                    Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.DOCX");
                    if (objType == aVar4.mo32555b()) {
                        i = R.drawable.ud_icon_file_docx_colorful;
                    }
                }
            }
        }
        if (templateV4.isSceneTemplate()) {
            i = R.drawable.ud_icon_file_folder_colorful;
        }
        this.f31081k.setImageResource(i);
        TextView textView = this.f31082l;
        Intrinsics.checkExpressionValueIsNotNull(textView, "templateNameTxt");
        textView.setText(templateV4.getName());
    }

    /* renamed from: a */
    private final void m48036a(int i) {
        View view = this.f31084n;
        Context context = this.f31078c.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        Resources resources = context.getResources();
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        int b = aVar.mo32555b();
        int i2 = R.color.primary_pri_300;
        if (i != b) {
            C8275a aVar2 = C8275a.f22372e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
            if (i == aVar2.mo32555b()) {
                i2 = R.color.function_success_300;
            } else {
                C8275a aVar3 = C8275a.f22374g;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
                if (i == aVar3.mo32555b()) {
                    i2 = R.color.ud_W200;
                } else if (i == 8) {
                    i2 = R.color.ud_T300;
                } else {
                    C8275a aVar4 = C8275a.f22378k;
                    Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.DOCX");
                    if (i == aVar4.mo32555b()) {
                        i2 = R.color.ud_I300;
                    }
                }
            }
        }
        view.setBackgroundColor(resources.getColor(i2));
    }

    /* renamed from: d */
    private final void m48043d(TemplateV4 templateV4) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String string = this.f31078c.getContext().getString(R.string.Doc_List_template_shared_by_failed);
        Intrinsics.checkExpressionValueIsNotNull(string, "view.context.getString(R…emplate_shared_by_failed)");
        int bottomLabelType = templateV4.getBottomLabelType();
        boolean z = false;
        if (bottomLabelType == 1) {
            if (templateV4.getAuthorName().length() == 0) {
                z = true;
            }
            if (z) {
                str = "";
            } else {
                str = this.f31078c.getContext().getText(R.string.Doc_Doc_Author) + ": " + templateV4.getAuthorName() + " | ";
            }
            TextView textView = this.f31083m;
            Intrinsics.checkExpressionValueIsNotNull(textView, "labelTxt");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (templateV4.getHeat() >= 0) {
                string = C10539a.m43639a(this.f31078c.getContext(), R.string.Doc_List_TemplateUseNUmber, "TemplateUsedPeople", m48034a(templateV4.getHeat()));
            }
            sb.append(string);
            textView.setText(sb.toString());
        } else if (bottomLabelType == 2) {
            TextView textView2 = this.f31083m;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "labelTxt");
            if (templateV4.getCreateTime() <= 0) {
                str2 = string;
            } else {
                str2 = C10539a.m43639a(this.f31078c.getContext(), R.string.Doc_List_template_custom_created_by_me_v2, "time", C13723a.m55666f(this.f31078c.getContext(), templateV4.getCreateTime() * ((long) 1000)));
            }
            textView2.setText(str2);
        } else if (bottomLabelType == 3) {
            TextView textView3 = this.f31083m;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "labelTxt");
            if (templateV4.getUserName().length() == 0) {
                z = true;
            }
            if (z || templateV4.getShareTime() <= 0) {
                str3 = string;
            } else {
                str3 = C10539a.m43639a(this.f31078c.getContext(), R.string.Doc_List_template_custom_shared_by_v2, "share_name", templateV4.getUserName());
            }
            textView3.setText(str3);
        } else if (bottomLabelType == 4) {
            TextView textView4 = this.f31083m;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "labelTxt");
            if (templateV4.getUpdateTime() <= 0) {
                str4 = string;
            } else {
                str4 = C10539a.m43639a(this.f31078c.getContext(), R.string.CreationMobile_Template_RecentlyUsedTime, "time", C13723a.m55666f(this.f31078c.getContext(), templateV4.getLastUsedTime() * ((long) 1000)));
            }
            textView4.setText(str4);
        } else if (bottomLabelType == 5) {
            TextView textView5 = this.f31083m;
            Intrinsics.checkExpressionValueIsNotNull(textView5, "labelTxt");
            if (templateV4.getUpdateTime() <= 0) {
                str5 = string;
            } else {
                str5 = C10539a.m43639a(this.f31078c.getContext(), R.string.CreationMobile_Operation_CreatedonSomeTime, "time", C13723a.m55666f(this.f31078c.getContext(), templateV4.getUpdateTime() * ((long) 1000)));
            }
            textView5.setText(str5);
        }
    }

    /* renamed from: b */
    private final void m48041b(TemplateV4 templateV4, Function0<Unit> function0) {
        boolean z;
        if (this.f31077b == null) {
            return;
        }
        if (templateV4.getSource() != 2) {
            this.f31077b.setVisibility(8);
            return;
        }
        int i = this.f31086p;
        if (i == 5 || i == 2) {
            if (templateV4.getObjType() == 8) {
                z = true;
            } else {
                z = false;
            }
            boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.diy_bitable_template_enable", false);
            if (!z || a) {
                this.f31077b.setVisibility(0);
                this.f31077b.setOnClickListener(new C11533c(this, templateV4, function0, LocationRequest.PRIORITY_INDOOR));
                this.f31077b.post(new RunnableC11536d(this));
                return;
            }
            return;
        }
        this.f31077b.setVisibility(8);
    }

    /* renamed from: a */
    private final String m48035a(String str, String str2) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C13479a.m54775e("TemplateViewHolder2", "coverDownloadUrl is empty, join url by coverToken");
            str = "https://" + C6313i.f17510b + "/space/api/box/stream/download/all/" + str2;
        }
        String uri = Uri.parse(str).buildUpon().appendQueryParameter("mount_point", "explorer").build().toString();
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(url).buildUpon…      .build().toString()");
        return uri;
    }

    /* renamed from: a */
    private final void m48037a(ImageView imageView, TemplateV4 templateV4) {
        imageView.setTag(R.id.thumbnail_tag, templateV4.getObjToken());
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f31078c.getContext()).mo10430i().mo10395a((Object) new C13664a(m48035a(templateV4.getCoverDownloadUrl(), templateV4.getCoverToken()))).mo11143c((int) R.drawable.template_load_fail)).mo11130a((AbstractC2393i<Bitmap>) m48033a())).mo10397a((AbstractC2522j) new ViewTarget(this, imageView, templateV4.getObjToken(), templateV4));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateViewHolder2(View view, LayoutType layoutType, C10917c cVar, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(layoutType, "layoutType");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f31078c = view;
        this.f31079d = layoutType;
        this.f31085o = cVar;
        this.f31086p = i;
        this.f31076a = (ImageView) view.findViewById(R.id.operationLabelImg);
        this.f31080j = (ImageView) view.findViewById(R.id.templateImg);
        this.f31081k = (ImageView) view.findViewById(R.id.typeIcon);
        this.f31082l = (TextView) view.findViewById(R.id.templateNameTxt);
        this.f31083m = (TextView) view.findViewById(R.id.labelTxt);
        this.f31077b = (ImageView) view.findViewById(R.id.moreIv);
        this.f31084n = view.findViewById(R.id.template_top);
    }

    /* renamed from: a */
    private final void m48039a(String str, int i, ThumbnailExtra thumbnailExtra, TemplateV4 templateV4) {
        C7754c cVar = new C7754c("", thumbnailExtra.getThumbnail(), i, thumbnailExtra.getType(), thumbnailExtra.getDecryptKey(), "", "template", true, "v4.1", this.f31080j, this.f31085o);
        this.f31080j.setTag(R.id.thumbnail_tag, templateV4.getObjToken());
        ImageView imageView = this.f31080j;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "thumbnailImg");
        C2124f a = ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(imageView.getContext()).mo10430i().mo11129a(AbstractC2354j.f7812b)).mo11130a((AbstractC2393i<Bitmap>) m48033a())).mo11143c(R.drawable.template_load_fail)).mo10395a((Object) cVar);
        ImageView imageView2 = this.f31080j;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "thumbnailImg");
        a.mo10397a((AbstractC2522j) new ViewTarget(this, imageView2, str, templateV4));
    }
}
