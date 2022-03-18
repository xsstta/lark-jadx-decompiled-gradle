package com.bytedance.ee.bear.templates.banner;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.bumptech.glide.request.AbstractC2510a;
import com.bumptech.glide.request.C2537g;
import com.bytedance.ee.bear.bizwidget.banner.p272a.AbstractC4866a;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.NiceImageView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.DocumentCreateHelper;
import com.bytedance.ee.bear.list.create.C8237e;
import com.bytedance.ee.bear.list.create.C8241g;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.topic.TopicFragment;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 &2\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0002&'B\u0017\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J(\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0016J \u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000eH\u0002R\u0019\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerAdapter;", "Lcom/bytedance/ee/bear/bizwidget/banner/adapter/BannerAdapter;", "Lcom/bytedance/ee/bear/templates/banner/BannerData;", "Lcom/bytedance/ee/bear/templates/banner/TemplateBannerAdapter$ImageHolder;", "datas", "", "(Ljava/util/List;)V", "connectServiceContext", "Lcom/bytedance/ee/bear/contract/ConnectionService;", "kotlin.jvm.PlatformType", "getConnectServiceContext", "()Lcom/bytedance/ee/bear/contract/ConnectionService;", "hasReportShow", "", "", "getHasReportShow", "()Ljava/util/Set;", "originDatas", "getOriginDatas", "()Ljava/util/List;", "setOriginDatas", "routeService", "Lcom/bytedance/ee/bear/route/RouteService;", "getRouteService", "()Lcom/bytedance/ee/bear/route/RouteService;", "onBindView", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "position", "size", "onCreateHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "reportBannerShowOrClick", "isShow", "", "Companion", "ImageHolder", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.banner.a */
public final class TemplateBannerAdapter extends AbstractC4866a<BannerData, ImageHolder> {

    /* renamed from: b */
    public static final Companion f30752b = new Companion(null);

    /* renamed from: c */
    private final ConnectionService f30753c = C5084ad.m20847d();

    /* renamed from: d */
    private final AbstractC10740f f30754d = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null));

    /* renamed from: e */
    private final Set<Integer> f30755e = new LinkedHashSet();

    /* renamed from: f */
    private List<BannerData> f30756f = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerAdapter$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/templates/banner/TemplateBannerAdapter$ImageHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.a$b */
    public static final class ImageHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private ImageView f30757a;

        /* renamed from: a */
        public final ImageView mo43971a() {
            return this.f30757a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ImageHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f30757a = (ImageView) view;
        }
    }

    /* renamed from: b */
    public final ConnectionService mo43967b() {
        return this.f30753c;
    }

    /* renamed from: c */
    public final AbstractC10740f mo43969c() {
        return this.f30754d;
    }

    /* renamed from: d */
    public final List<BannerData> mo43970d() {
        return this.f30756f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/banner/TemplateBannerAdapter$onBindView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.banner.a$c */
    public static final class C11440c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ TemplateBannerAdapter f30758a;

        /* renamed from: b */
        final /* synthetic */ ImageHolder f30759b;

        /* renamed from: c */
        final /* synthetic */ BannerData f30760c;

        /* renamed from: d */
        final /* synthetic */ int f30761d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "documentCreateInfo", "Lcom/bytedance/ee/bear/contract/create/DocumentCreateInfo;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.banner.a$c$a */
        static final class C11441a<T> implements Consumer<DocumentCreateInfo> {

            /* renamed from: a */
            final /* synthetic */ C11440c f30762a;

            /* renamed from: b */
            final /* synthetic */ C10917c f30763b;

            C11441a(C11440c cVar, C10917c cVar2) {
                this.f30762a = cVar;
                this.f30763b = cVar2;
            }

            /* renamed from: a */
            public final void accept(DocumentCreateInfo documentCreateInfo) {
                Intrinsics.checkParameterIsNotNull(documentCreateInfo, "documentCreateInfo");
                C13479a.m54764b("ImageAdapter", "create template success");
                C8241g.m33840a(this.f30762a.f30759b.mo43971a().getContext(), "", "template_create", this.f30763b, documentCreateInfo.f14845d);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.templates.banner.a$c$b */
        static final class C11442b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ C11440c f30764a;

            /* renamed from: b */
            final /* synthetic */ C10917c f30765b;

            C11442b(C11440c cVar, C10917c cVar2) {
                this.f30764a = cVar;
                this.f30765b = cVar2;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "throwable");
                C13479a.m54758a("ImageAdapter", "create template failed, throwable = " + th);
                C8241g.m33835a(this.f30764a.f30759b.mo43971a().getContext(), new C8237e(this.f30765b, "", "module", "template_create"), C8275a.m34050a(this.f30764a.f30760c.getObjType()), null, this.f30765b, th);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            FragmentManager supportFragmentManager;
            FragmentTransaction beginTransaction;
            FragmentTransaction customAnimations;
            FragmentTransaction addToBackStack;
            ConnectionService b = this.f30758a.mo43967b();
            Intrinsics.checkExpressionValueIsNotNull(b, "connectServiceContext");
            ConnectionService.NetworkState b2 = b.mo20038b();
            if (b2 == null || !b2.mo20041b()) {
                Toast.showFailureText(this.f30759b.mo43971a().getContext(), (int) R.string.Doc_Facade_Offline);
                return;
            }
            this.f30758a.mo43966a(false, this.f30760c, this.f30761d);
            C10917c cVar = new C10917c(new C10929e());
            if (this.f30760c.getType() == 1) {
                new DocumentCreateHelper(cVar).mo31351a(this.f30760c.getObjToken(), this.f30760c.getObjType(), "", false, "", true, "templatecenter_banner").mo238028f(15, TimeUnit.SECONDS).mo237985a(C11678b.m48481e()).mo238001b(new C11441a(this, cVar), new C11442b(this, cVar));
                return;
            }
            String str = "";
            if (this.f30760c.getType() == 2) {
                Context context = this.f30759b.mo43971a().getContext();
                if (!(context instanceof FragmentActivity)) {
                    context = null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (customAnimations = beginTransaction.setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out)) != null) {
                    TopicFragment.Companion aVar = TopicFragment.f31441a;
                    Context context2 = this.f30759b.mo43971a().getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context2, "holder.imageView.context");
                    String topicId = this.f30760c.getTopicId();
                    if (topicId != null) {
                        str = topicId;
                    }
                    FragmentTransaction add = customAnimations.add(R.id.container, aVar.mo44750a(context2, str));
                    if (add != null && (addToBackStack = add.addToBackStack(null)) != null) {
                        addToBackStack.commitAllowingStateLoss();
                    }
                }
            } else if (this.f30760c.getType() == 5) {
                StringBuilder sb = new StringBuilder();
                C6313i a = C6313i.m25327a();
                C8275a b3 = C8275a.m34052b(this.f30760c.getObjType());
                Intrinsics.checkExpressionValueIsNotNull(b3, "DocumentType.getDocumentType(data.objType)");
                sb.append(a.mo25382a(b3.mo32553a(), this.f30760c.getObjToken(), str));
                sb.append("?from=template_preview&collectionId=");
                sb.append(this.f30760c.getCollection_id());
                String sb2 = sb.toString();
                RouteBean routeBean = new RouteBean();
                routeBean.mo40620g(1);
                ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(sb2, routeBean);
            } else {
                C13479a.m54764b("ImageAdapter", "not sensitivity ~ jump_link_url : " + this.f30760c.getJump_link_url());
                this.f30758a.mo43969c().mo17292a(this.f30760c.getJump_link_url());
            }
        }

        C11440c(TemplateBannerAdapter aVar, ImageHolder bVar, BannerData bannerData, int i) {
            this.f30758a = aVar;
            this.f30759b = bVar;
            this.f30760c = bannerData;
            this.f30761d = i;
        }
    }

    public TemplateBannerAdapter(List<BannerData> list) {
        super(list);
        this.f30756f = list;
    }

    /* renamed from: b */
    public ImageHolder mo19046a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        NiceImageView niceImageView = new NiceImageView(viewGroup.getContext());
        niceImageView.setCornerRadius(4);
        niceImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        niceImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new ImageHolder(niceImageView);
    }

    /* renamed from: a */
    public final void mo43966a(boolean z, BannerData bannerData, int i) {
        String str;
        if (bannerData.getType() == 1) {
            str = "single template";
        } else if (bannerData.getType() == 2) {
            str = "album";
        } else {
            str = "openlink";
        }
        if (z) {
            TemplateReport.f31011b.mo44224a(mo19042a(), str, String.valueOf(bannerData.getBanner_id()));
            TemplateReportV2.f31015b.mo44256e(String.valueOf(bannerData.getBanner_id()));
            return;
        }
        TemplateReport.f31011b.mo44230b(mo19042a(), str, String.valueOf(bannerData.getBanner_id()));
        TemplateReportV2.f31015b.mo44253d(String.valueOf(bannerData.getBanner_id()));
    }

    /* renamed from: a */
    public void mo19047a(ImageHolder bVar, BannerData bannerData, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        Intrinsics.checkParameterIsNotNull(bannerData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        mo43966a(true, bannerData, i);
        new C2537g();
        Context context = bVar.mo43971a().getContext();
        if (!(context instanceof FragmentActivity)) {
            context = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity == null || !fragmentActivity.isFinishing()) {
            ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(bVar.mo43971a().getContext()).mo10430i().mo10395a((Object) new C13664a(bannerData.getUrl())).mo10391a((AbstractC2510a<?>) C2537g.m10789b((AbstractC2393i<Bitmap>) new C2452w(C13749l.m55738a(4)))).mo11143c((int) R.drawable.list_template_error)).mo11129a(AbstractC2354j.f7814d)).mo10399a(bVar.mo43971a());
            bVar.mo43971a().setOnClickListener(new C11440c(this, bVar, bannerData, i));
        }
    }
}
