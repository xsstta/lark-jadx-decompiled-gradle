package com.bytedance.ee.larkbrand.nativeMoudule.photo;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.AbstractFutureC2532c;
import com.bumptech.glide.request.p095a.AbstractC2520h;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.storage.filemanager.vivocompat.MediaStoreHelper;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b;
import com.bytedance.ee.larkbrand.network.glide.GlideRequest;
import com.bytedance.ee.larkbrand.utils.C13351i;
import com.bytedance.ee.larkbrand.utils.C13373r;
import com.bytedance.ee.larkbrand.utils.DebugUtils;
import com.bytedance.ee.larkbrand.utils.LarkGlideImageUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.C57759a;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapphost.process.C67556a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u000b\u000e\u0018\u0000 T2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001TB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018H\u0002J\u0012\u0010#\u001a\u0004\u0018\u00010\u00182\u0006\u0010$\u001a\u00020\u0018H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\b\u0010*\u001a\u00020 H\u0002J*\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u0006H\u0002J\u0012\u00100\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102H\u0016J&\u00103\u001a\u0004\u0018\u00010'2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00101\u001a\u0004\u0018\u000102H\u0016J4\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010>2\u0006\u0010?\u001a\u00020\u001bH\u0016J+\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020\u00062\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180C2\u0006\u0010D\u001a\u00020EH\u0016¢\u0006\u0002\u0010FJ>\u0010G\u001a\u00020\u001b2\b\u0010H\u001a\u0004\u0018\u00010\u00032\b\u0010;\u001a\u0004\u0018\u00010<2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010>2\b\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010?\u001a\u00020\u001bH\u0016J\u001a\u0010K\u001a\u00020 2\u0006\u0010&\u001a\u00020'2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0014\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020 H\u0002J\u001a\u0010S\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010'H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/bumptech/glide/request/RequestListener;", "Ljava/io/File;", "()V", "FAILED", "", "SUCCESS", "glideRequest", "Lcom/bumptech/glide/RequestManager;", "loadImageTarget", "com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$loadImageTarget$1", "Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$loadImageTarget$1;", "loadThumbNailTarget", "com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$loadThumbNailTarget$1", "Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$loadThumbNailTarget$1;", "loadingView", "Landroid/widget/ProgressBar;", "originImageUrl", "Lcom/bytedance/ee/larkbrand/network/glide/GlideRequest;", "photoView", "Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/LargeImageView;", "placeHolderUrl", "qrCodeContent", "", "saveUrl", "showOriginItem", "", "startLoadLargeImageTime", "", "url", "createItems", "", "getContent", "filePath", "getQRCodeContent", "photoPath", "initView", "view", "Landroid/view/View;", "loadCacheImage", "loadImage", "loadImageFail", "loadImgEvent", "eventName", "duration", "file", "state", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onLoadFailed", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "onViewCreated", "parseHeader", "Lcom/bumptech/glide/load/model/Headers;", "headerJson", "postShowPhoto", "context", "Landroid/content/Context;", "saveFile", "setPlayView", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b */
public final class NewPreviewFragment extends Fragment implements AbstractC2536f<File> {

    /* renamed from: n */
    public static final Companion f34969n = new Companion(null);

    /* renamed from: a */
    public GlideRequest f34970a;

    /* renamed from: b */
    public GlideRequest f34971b;

    /* renamed from: c */
    public GlideRequest f34972c;

    /* renamed from: d */
    public String f34973d;

    /* renamed from: e */
    public boolean f34974e;

    /* renamed from: f */
    public ComponentCallbacks2C2126g f34975f;

    /* renamed from: g */
    public ProgressBar f34976g;

    /* renamed from: h */
    public LargeImageView f34977h;

    /* renamed from: i */
    public long f34978i;

    /* renamed from: j */
    public final int f34979j;

    /* renamed from: k */
    public final int f34980k = 1;

    /* renamed from: l */
    public final C13195j f34981l = new C13195j(this);

    /* renamed from: m */
    public final C13198k f34982m = new C13198k(this);

    /* renamed from: o */
    private GlideRequest f34983o;

    /* renamed from: p */
    private HashMap f34984p;

    /* renamed from: d */
    public void mo49297d() {
        HashMap hashMap = this.f34984p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo49297d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$Companion;", "", "()V", "HEADER", "", "IMAGE_URL", "ORIGIN_IMAGE_URL", "PLACE_HOLDER", "TAG", "WRITE_EXTERNAL_STORAGE_REQUEST_CODE", "", "newInstance", "Lcom/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment;", "url", "Lcom/bytedance/ee/larkbrand/network/glide/GlideRequest;", "originImageUrl", "placeHolder", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final NewPreviewFragment mo49298a(GlideRequest glideRequest, GlideRequest glideRequest2, GlideRequest glideRequest3) {
            Intrinsics.checkParameterIsNotNull(glideRequest, "url");
            NewPreviewFragment bVar = new NewPreviewFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("url", glideRequest);
            if (glideRequest2 != null) {
                bundle.putParcelable("originUrl", glideRequest2);
            }
            if (glideRequest3 != null) {
                bundle.putParcelable("placeholder", glideRequest3);
            }
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: a */
    public boolean mo11205a(File file, Object obj, AbstractC2522j<File> jVar, DataSource dataSource, boolean z) {
        if (!(getContext() instanceof PhotoPreviewActivity)) {
            return false;
        }
        Context context = getContext();
        if (context != null) {
            ((PhotoPreviewActivity) context).mo49251a();
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$createItems$imageSave$1", "Lcom/bytedance/ee/larkbrand/nativeMoudule/rich/bean/ItemBean;", "getName", "", "onItemClick", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$d */
    public static final class C13189d implements AbstractC13234b {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34989a;

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: b */
        public void mo49300b() {
            this.f34989a.mo49295b();
        }

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: a */
        public String mo49299a() {
            Context context = this.f34989a.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            String string = context.getString(R.string.lark_brand_save_image);
            Intrinsics.checkExpressionValueIsNotNull(string, "context!!.getString(R.st…ng.lark_brand_save_image)");
            return string;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13189d(NewPreviewFragment bVar) {
            this.f34989a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$loadThumbNailTarget$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Ljava/io/File;", "onResourceReady", "", "resource", "glideAnimation", "Lcom/bumptech/glide/request/transition/Transition;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$k */
    public static final class C13198k extends AbstractC2520h<File> {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34995a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$k$a */
        public static final class C13199a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C13198k this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13199a(C13198k kVar) {
                super(0);
                this.this$0 = kVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                ProgressBar progressBar = this.this$0.f34995a.f34976g;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13198k(NewPreviewFragment bVar) {
            this.f34995a = bVar;
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo49308a((File) obj, (AbstractC2529b<? super File>) bVar);
        }

        /* renamed from: a */
        public void mo49308a(File file, AbstractC2529b<? super File> bVar) {
            Intrinsics.checkParameterIsNotNull(file, "resource");
            NewPreviewFragment bVar2 = this.f34995a;
            String path = file.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "resource.path");
            bVar2.mo49291a(path);
            LargeImageView largeImageView = this.f34995a.f34977h;
            if (largeImageView != null) {
                largeImageView.mo49226a(this.f34995a.f34975f, file);
            }
            LargeImageView largeImageView2 = this.f34995a.f34977h;
            if (largeImageView2 != null) {
                largeImageView2.setLoadPreviewSuccessListener(new C13199a(this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$getContent$1", "Lcom/bytedance/ee/lark/infra/foundation/schedulers/Function;", "", "fun", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$f */
    public static final class C13191f extends Function<String> {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34991a;

        /* renamed from: b */
        final /* synthetic */ String f34992b;

        /* renamed from: a */
        public String fun() {
            return this.f34991a.mo49294b(this.f34992b);
        }

        C13191f(NewPreviewFragment bVar, String str) {
            this.f34991a = bVar;
            this.f34992b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$createItems$cancel$1", "Lcom/bytedance/ee/larkbrand/nativeMoudule/rich/bean/ItemBean;", "getName", "", "onItemClick", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$b */
    public static final class C13184b implements AbstractC13234b {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34985a;

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: b */
        public void mo49300b() {
        }

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: a */
        public String mo49299a() {
            Context context = this.f34985a.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            String string = context.getString(R.string.lark_brand_cancel);
            Intrinsics.checkExpressionValueIsNotNull(string, "context!!.getString(R.string.lark_brand_cancel)");
            return string;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13184b(NewPreviewFragment bVar) {
            this.f34985a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$createItems$imageOrigin$1", "Lcom/bytedance/ee/larkbrand/nativeMoudule/rich/bean/ItemBean;", "getName", "", "onItemClick", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$c */
    public static final class C13185c implements AbstractC13234b {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34986a;

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: a */
        public String mo49299a() {
            Context context = this.f34986a.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            String string = context.getString(R.string.lark_brand_origin_image);
            Intrinsics.checkExpressionValueIsNotNull(string, "context!!.getString(R.st….lark_brand_origin_image)");
            return string;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0010\u0010\t\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$createItems$imageOrigin$1$onItemClick$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Ljava/io/File;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "resource", "glideAnimation", "Lcom/bumptech/glide/request/transition/Transition;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$c$a */
        public static final class C13186a extends AbstractC2520h<File> {

            /* renamed from: a */
            final /* synthetic */ C13185c f34987a;

            /* renamed from: b */
            final /* synthetic */ long f34988b;

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$c$a$a */
            public static final class C13187a extends Lambda implements Function0<Unit> {
                final /* synthetic */ C13186a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C13187a(C13186a aVar) {
                    super(0);
                    this.this$0 = aVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    ProgressBar progressBar = this.this$0.f34987a.f34986a.f34976g;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    this.this$0.f34987a.f34986a.f34972c = this.this$0.f34987a.f34986a.f34971b;
                    this.this$0.f34987a.f34986a.f34974e = false;
                }
            }

            /* access modifiers changed from: package-private */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$c$a$b */
            public static final class C13188b extends Lambda implements Function1<Exception, Unit> {
                final /* synthetic */ C13186a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C13188b(C13186a aVar) {
                    super(1);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                    invoke(exc);
                    return Unit.INSTANCE;
                }

                public final void invoke(Exception exc) {
                    this.this$0.mo10444b((Drawable) null);
                }
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: b */
            public void mo10444b(Drawable drawable) {
                String str;
                super.mo10444b(drawable);
                DebugUtils.Companion aVar = DebugUtils.f35244a;
                DebugUtils.Companion aVar2 = DebugUtils.f35244a;
                GlideRequest glideRequest = this.f34987a.f34986a.f34971b;
                if (glideRequest != null) {
                    str = glideRequest.mo49492a();
                } else {
                    str = null;
                }
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "originImageUrl?.url!!");
                aVar.mo49649a("event_preview_image", DebugUtils.Companion.m54327a(aVar2, false, str, "request fail", null, 8, null));
                this.f34987a.f34986a.mo49292a("mp_image_preview", System.currentTimeMillis() - this.f34988b, (File) null, this.f34987a.f34986a.f34980k);
                this.f34987a.f34986a.mo49296c();
            }

            C13186a(C13185c cVar, long j) {
                this.f34987a = cVar;
                this.f34988b = j;
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                mo49301a((File) obj, (AbstractC2529b<? super File>) bVar);
            }

            /* renamed from: a */
            public void mo49301a(File file, AbstractC2529b<? super File> bVar) {
                Intrinsics.checkParameterIsNotNull(file, "resource");
                this.f34987a.f34986a.mo49292a("mp_image_preview", System.currentTimeMillis() - this.f34988b, file, this.f34987a.f34986a.f34979j);
                if (this.f34987a.f34986a.getContext() != null) {
                    Context context = this.f34987a.f34986a.getContext();
                    if (context != null) {
                        ComponentCallbacks2C2115c.m9151c(context).mo10417a((AbstractC2522j<?>) this.f34987a.f34986a.f34981l);
                        LargeImageView largeImageView = this.f34987a.f34986a.f34977h;
                        if (largeImageView != null) {
                            largeImageView.mo49226a(this.f34987a.f34986a.f34975f, file);
                        }
                        LargeImageView largeImageView2 = this.f34987a.f34986a.f34977h;
                        if (largeImageView2 != null) {
                            largeImageView2.setLoadPreviewSuccessListener(new C13187a(this));
                        }
                        LargeImageView largeImageView3 = this.f34987a.f34986a.f34977h;
                        if (largeImageView3 != null) {
                            largeImageView3.setLoadFailListener(new C13188b(this));
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
            }
        }

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: b */
        public void mo49300b() {
            C2124f<Drawable> fVar;
            if (this.f34986a.getContext() != null && this.f34986a.f34971b != null) {
                ProgressBar progressBar = this.f34986a.f34976g;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                long currentTimeMillis = System.currentTimeMillis();
                ComponentCallbacks2C2126g gVar = this.f34986a.f34975f;
                if (gVar != null) {
                    fVar = gVar.mo10414a(this.f34986a.f34971b);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    C13186a aVar = (C13186a) fVar.mo10402b((AbstractC2522j) new C13186a(this, currentTimeMillis));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13185c(NewPreviewFragment bVar) {
            this.f34986a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$createItems$qrCode$1", "Lcom/bytedance/ee/larkbrand/nativeMoudule/rich/bean/ItemBean;", "getName", "", "onItemClick", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$e */
    public static final class C13190e implements AbstractC13234b {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34990a;

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: a */
        public String mo49299a() {
            Context context = this.f34990a.getContext();
            if (context == null) {
                Intrinsics.throwNpe();
            }
            String string = context.getString(R.string.lark_brand_identify_qrcode);
            Intrinsics.checkExpressionValueIsNotNull(string, "context!!.getString(R.st…rk_brand_identify_qrcode)");
            return string;
        }

        @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.AbstractC13234b
        /* renamed from: b */
        public void mo49300b() {
            if (!TextUtils.isEmpty(this.f34990a.f34973d)) {
                LarkExtensionManager instance = LarkExtensionManager.getInstance();
                Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
                instance.getExtension().decodeQRCodeActivity(this.f34990a.f34973d, this.f34990a.getActivity());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13190e(NewPreviewFragment bVar) {
            this.f34990a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$h */
    public static final class C13193h extends Lambda implements Function0<Unit> {
        final /* synthetic */ GlideRequest $url;
        final /* synthetic */ NewPreviewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13193h(NewPreviewFragment bVar, GlideRequest glideRequest) {
            super(0);
            this.this$0 = bVar;
            this.$url = glideRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ProgressBar progressBar = this.this$0.f34976g;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            this.this$0.f34972c = this.$url;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0010\u0010\t\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$loadImageTarget$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Ljava/io/File;", "onLoadFailed", "", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "onResourceReady", "file", "glideAnimation", "Lcom/bumptech/glide/request/transition/Transition;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$j */
    public static final class C13195j extends AbstractC2520h<File> {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34994a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$j$a */
        public static final class C13196a extends Lambda implements Function0<Unit> {
            final /* synthetic */ C13195j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13196a(C13195j jVar) {
                super(0);
                this.this$0 = jVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                ProgressBar progressBar = this.this$0.f34994a.f34976g;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                if (this.this$0.f34994a.f34971b != null) {
                    this.this$0.f34994a.f34974e = true;
                }
                this.this$0.f34994a.f34972c = this.this$0.f34994a.f34970a;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$j$b */
        public static final class C13197b extends Lambda implements Function1<Exception, Unit> {
            final /* synthetic */ C13195j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13197b(C13195j jVar) {
                super(1);
                this.this$0 = jVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke(exc);
                return Unit.INSTANCE;
            }

            public final void invoke(Exception exc) {
                this.this$0.mo10444b((Drawable) null);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13195j(NewPreviewFragment bVar) {
            this.f34994a = bVar;
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2511a, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: b */
        public void mo10444b(Drawable drawable) {
            String str;
            DebugUtils.Companion aVar = DebugUtils.f35244a;
            DebugUtils.Companion aVar2 = DebugUtils.f35244a;
            GlideRequest glideRequest = this.f34994a.f34970a;
            if (glideRequest != null) {
                str = glideRequest.mo49492a();
            } else {
                str = null;
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "url?.url!!");
            aVar.mo49649a("event_preview_image", DebugUtils.Companion.m54327a(aVar2, false, str, "request fail", null, 8, null));
            this.f34994a.mo49292a("mp_image_preview", System.currentTimeMillis() - this.f34994a.f34978i, (File) null, this.f34994a.f34980k);
            this.f34994a.mo49296c();
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo49306a((File) obj, (AbstractC2529b<? super File>) bVar);
        }

        /* renamed from: a */
        public void mo49306a(File file, AbstractC2529b<? super File> bVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(file, "file");
            this.f34994a.mo49292a("mp_image_preview", System.currentTimeMillis() - this.f34994a.f34978i, file, this.f34994a.f34979j);
            NewPreviewFragment bVar2 = this.f34994a;
            String path = file.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "file.path");
            bVar2.mo49291a(path);
            DebugUtils.Companion aVar = DebugUtils.f35244a;
            DebugUtils.Companion aVar2 = DebugUtils.f35244a;
            GlideRequest glideRequest = this.f34994a.f34970a;
            if (glideRequest != null) {
                str = glideRequest.mo49492a();
            } else {
                str = null;
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "url?.url!!");
            aVar.mo49649a("event_preview_image", DebugUtils.Companion.m54327a(aVar2, false, str, "request success", null, 8, null));
            if (this.f34994a.getContext() != null && this.f34994a.getActivity() != null) {
                FragmentActivity activity = this.f34994a.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                if (!activity.isDestroyed()) {
                    Context context = this.f34994a.getContext();
                    if (context != null) {
                        ComponentCallbacks2C2115c.m9151c(context).mo10417a((AbstractC2522j<?>) this.f34994a.f34982m);
                        LargeImageView largeImageView = this.f34994a.f34977h;
                        if (largeImageView != null) {
                            largeImageView.mo49226a(this.f34994a.f34975f, file);
                        }
                        LargeImageView largeImageView2 = this.f34994a.f34977h;
                        if (largeImageView2 != null) {
                            largeImageView2.setLoadPreviewSuccessListener(new C13196a(this));
                        }
                        LargeImageView largeImageView3 = this.f34994a.f34977h;
                        if (largeImageView3 != null) {
                            largeImageView3.setLoadFailListener(new C13197b(this));
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49289a() {
        ArrayList arrayList = new ArrayList();
        C13189d dVar = new C13189d(this);
        C13185c cVar = new C13185c(this);
        C13184b bVar = new C13184b(this);
        C13190e eVar = new C13190e(this);
        arrayList.add(dVar);
        if (this.f34974e) {
            arrayList.add(cVar);
        }
        if (!TextUtils.isEmpty(this.f34973d)) {
            arrayList.add(eVar);
        }
        arrayList.add(bVar);
        C13351i.m54347a(getContext(), arrayList);
    }

    /* renamed from: b */
    public final void mo49295b() {
        Observable.create(new C13201m(this)).schudleOn(Schedulers.shortIO()).observeOn(Schedulers.ui()).subscribe(new C13202n(this));
    }

    /* renamed from: c */
    public final void mo49296c() {
        if (getActivity() != null) {
            ToastManager.showShortToast(getActivity(), getString(R.string.lark_brand_load_fail));
            ProgressBar progressBar = this.f34976g;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$saveFile$2", "Lcom/bytedance/ee/lark/infra/foundation/schedulers/Subscriber$ResultableSubscriber;", "Ljava/io/File;", "onError", "", "throwable", "", "onSuccess", "file", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$n */
    public static final class C13202n extends Subscriber.ResultableSubscriber<File> {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34999a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$saveFile$2$onSuccess$1", "Lcom/bytedance/ee/lark/infra/foundation/schedulers/Action;", "act", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$n$a */
        public static final class C13203a extends Action {

            /* renamed from: a */
            final /* synthetic */ C13202n f35000a;

            /* renamed from: b */
            final /* synthetic */ File f35001b;

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                LarkGlideImageUtils.ImageType a = LarkGlideImageUtils.m54239a(this.f35001b);
                Intrinsics.checkExpressionValueIsNotNull(a, "LarkGlideImageUtils.getFileImageType(file)");
                String value = a.getValue();
                try {
                    MediaStoreHelper.m53185a(this.f35000a.f34999a.getContext(), this.f35001b, String.valueOf(System.currentTimeMillis()) + "." + value);
                    ToastManager.showShortToast(this.f35000a.f34999a.getContext(), this.f35000a.f34999a.getString(R.string.lark_brand_save_success));
                } catch (Exception e) {
                    AppBrandLogger.m52829e("NewPreviewFragment", "saveImage exception", e);
                    ToastManager.showShortToast(this.f35000a.f34999a.getContext(), this.f35000a.f34999a.getString(R.string.lark_brand_save_fail));
                }
            }

            C13203a(C13202n nVar, File file) {
                this.f35000a = nVar;
                this.f35001b = file;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13202n(NewPreviewFragment bVar) {
            this.f34999a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(File file) {
            if (this.f34999a.getContext() == null) {
                AppBrandLogger.m52829e("NewPreviewFragment", "save file error! context must not be null!");
            } else if (file == null) {
                ToastManager.showShortToast(this.f34999a.getContext(), this.f34999a.getString(R.string.lark_brand_save_fail));
            } else if (C13373r.m54381a(this.f34999a.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) {
                Observable.create(new C13203a(this, file)).schudleOn(Schedulers.shortIO()).subscribeSimple();
            } else {
                this.f34999a.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
            }
        }

        @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
        public void onError(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "throwable");
            AppBrandLogger.m52829e("NewPreviewFragment", "save file error: " + th.getMessage());
            if (this.f34999a.getActivity() != null) {
                ToastManager.showShortToast(this.f34999a.getActivity(), this.f34999a.getString(R.string.lark_brand_save_fail));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$l */
    public static final class RunnableC13200l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34996a;

        /* renamed from: b */
        final /* synthetic */ Context f34997b;

        RunnableC13200l(NewPreviewFragment bVar, Context context) {
            this.f34996a = bVar;
            this.f34997b = context;
        }

        public final void run() {
            int[] iArr;
            int i;
            int i2;
            if (C57759a.m224180a(this.f34997b)) {
                if (DesktopUtil.m144301a(this.f34997b)) {
                    iArr = new int[2];
                    LargeImageView largeImageView = this.f34996a.f34977h;
                    if (largeImageView != null) {
                        i = largeImageView.getWidth();
                    } else {
                        i = DeviceUtils.getScreenWidth(this.f34997b);
                    }
                    iArr[0] = i;
                    LargeImageView largeImageView2 = this.f34996a.f34977h;
                    if (largeImageView2 != null) {
                        i2 = largeImageView2.getHeight();
                    } else {
                        i2 = DeviceUtils.getScreenHeight(this.f34997b);
                    }
                    iArr[1] = i2;
                } else {
                    iArr = new int[]{DeviceUtils.getScreenWidth(this.f34997b), DeviceUtils.getScreenHeight(this.f34997b)};
                }
                LargeImageView largeImageView3 = this.f34996a.f34977h;
                if (largeImageView3 != null) {
                    largeImageView3.setMaxAvailableSize(iArr);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$saveFile$1", "Lcom/bytedance/ee/lark/infra/foundation/schedulers/Function;", "Ljava/io/File;", "fun", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$m */
    public static final class C13201m extends Function<File> {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34998a;

        /* renamed from: a */
        public File fun() {
            File file;
            C2124f<Drawable> a;
            AbstractFutureC2532c<File> b;
            try {
                ComponentCallbacks2C2126g gVar = this.f34998a.f34975f;
                if (gVar == null || (a = gVar.mo10414a(this.f34998a.f34972c)) == null || (b = a.mo10405b(Integer.MIN_VALUE, Integer.MIN_VALUE)) == null) {
                    file = null;
                } else {
                    file = (File) b.get();
                }
                if (file == null || !file.exists()) {
                    AppBrandLogger.m52829e("NewPreviewFragment", "get file from: " + this.f34998a.f34972c + "failed! File not exists!");
                }
                return file;
            } catch (Exception e) {
                AppBrandLogger.m52829e("NewPreviewFragment", "get file from: " + this.f34998a.f34972c + "failed! " + e.getMessage());
                e.printStackTrace();
                return null;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13201m(NewPreviewFragment bVar) {
            this.f34998a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/larkbrand/nativeMoudule/photo/NewPreviewFragment$getContent$2", "Lcom/bytedance/ee/lark/infra/foundation/schedulers/Subscriber$NoConcernSubscriber;", "", "onSuccess", "", "temContent", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$g */
    public static final class C13192g extends Subscriber.NoConcernSubscriber<String> {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f34993a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C13192g(NewPreviewFragment bVar) {
            this.f34993a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f34993a.f34973d = str;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$i */
    public static final class C13194i extends Lambda implements Function1<Exception, Unit> {
        final /* synthetic */ GlideRequest $url;
        final /* synthetic */ NewPreviewFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13194i(NewPreviewFragment bVar, GlideRequest glideRequest) {
            super(1);
            this.this$0 = bVar;
            this.$url = glideRequest;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
            invoke(exc);
            return Unit.INSTANCE;
        }

        public final void invoke(Exception exc) {
            this.this$0.mo49290a(this.$url);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$p */
    public static final class View$OnLongClickListenerC13205p implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f35003a;

        View$OnLongClickListenerC13205p(NewPreviewFragment bVar) {
            this.f35003a = bVar;
        }

        public final boolean onLongClick(View view) {
            this.f35003a.mo49289a();
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
    }

    /* renamed from: a */
    private final void m53862a(Context context) {
        UICallbackExecutor.post(new RunnableC13200l(this, context));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.b$o */
    public static final class View$OnClickListenerC13204o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewPreviewFragment f35002a;

        View$OnClickListenerC13204o(NewPreviewFragment bVar) {
            this.f35002a = bVar;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f35002a.getActivity();
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(17432576, 17432577);
            }
        }
    }

    /* renamed from: a */
    private final void m53863a(View view) {
        this.f34976g = (ProgressBar) view.findViewById(R.id.loading);
        this.f34977h = (LargeImageView) view.findViewById(R.id.photo_view);
    }

    /* renamed from: b */
    public final String mo49294b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return LarkHostDependManager.f34682b.mo49086a().mo48918a(str);
    }

    /* renamed from: b */
    private final boolean m53865b(GlideRequest glideRequest) {
        File a;
        if (getContext() == null || (a = LarkGlideImageUtils.m54241a(getContext(), glideRequest.mo49492a())) == null || !a.exists()) {
            return false;
        }
        String path = a.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "file.path");
        mo49291a(path);
        LargeImageView largeImageView = this.f34977h;
        if (largeImageView != null) {
            largeImageView.mo49226a(this.f34975f, a);
        }
        LargeImageView largeImageView2 = this.f34977h;
        if (largeImageView2 != null) {
            largeImageView2.setLoadPreviewSuccessListener(new C13193h(this, glideRequest));
        }
        LargeImageView largeImageView3 = this.f34977h;
        if (largeImageView3 == null) {
            return true;
        }
        largeImageView3.setLoadFailListener(new C13194i(this, glideRequest));
        return true;
    }

    /* renamed from: a */
    public final void mo49290a(GlideRequest glideRequest) {
        C2124f<File> m;
        C2124f<File> a;
        C2124f<File> a2;
        ComponentCallbacks2C2126g gVar;
        C2124f<File> m2;
        C2124f<File> a3;
        C2124f<File> a4;
        if (!(this.f34983o == null || (gVar = this.f34975f) == null || (m2 = gVar.mo10434m()) == null || (a3 = m2.mo10395a((Object) glideRequest)) == null || (a4 = a3.mo10392a((AbstractC2536f<File>) this)) == null)) {
            C13198k kVar = (C13198k) a4.mo10397a((AbstractC2522j) this.f34982m);
        }
        this.f34978i = System.currentTimeMillis();
        ComponentCallbacks2C2126g gVar2 = this.f34975f;
        if (gVar2 != null && (m = gVar2.mo10434m()) != null && (a = m.mo10395a((Object) glideRequest)) != null && (a2 = a.mo10392a((AbstractC2536f<File>) this)) != null) {
            C13195j jVar = (C13195j) a2.mo10397a((AbstractC2522j) this.f34981l);
        }
    }

    /* renamed from: a */
    public final void mo49291a(String str) {
        Observable.create(new C13191f(this, str)).schudleOn(Schedulers.shortIO()).subscribe(new C13192g(this));
    }

    /* renamed from: a */
    private final void m53864a(GlideRequest glideRequest, View view) {
        if (getContext() != null) {
            if (view != null) {
                view.setVisibility(0);
            }
            this.f34974e = false;
            GlideRequest glideRequest2 = this.f34971b;
            if (glideRequest2 != null) {
                if (glideRequest2 == null) {
                    Intrinsics.throwNpe();
                }
                if (m53865b(glideRequest2)) {
                    this.f34974e = false;
                } else {
                    this.f34974e = true;
                    mo49290a(glideRequest);
                }
            } else {
                mo49290a(glideRequest);
            }
            DebugUtils.Companion aVar = DebugUtils.f35244a;
            DebugUtils.Companion aVar2 = DebugUtils.f35244a;
            String a = glideRequest.mo49492a();
            Intrinsics.checkExpressionValueIsNotNull(a, "url.url");
            aVar.mo49649a("event_preview_image", DebugUtils.Companion.m54327a(aVar2, true, a, null, null, 12, null));
            LargeImageView largeImageView = this.f34977h;
            if (largeImageView != null) {
                largeImageView.setOnClickListener(new View$OnClickListenerC13204o(this));
            }
            LargeImageView largeImageView2 = this.f34977h;
            if (largeImageView2 != null) {
                largeImageView2.setOnLongClickListener(new View$OnLongClickListenerC13205p(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            m53863a(view);
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            m53862a(context);
            Bundle arguments = getArguments();
            if (arguments != null) {
                Context context2 = getContext();
                if (context2 == null) {
                    Intrinsics.throwNpe();
                }
                this.f34975f = ComponentCallbacks2C2115c.m9151c(context2);
                GlideRequest glideRequest = (GlideRequest) arguments.getParcelable("url");
                this.f34970a = glideRequest;
                this.f34972c = glideRequest;
                this.f34971b = (GlideRequest) arguments.getParcelable("originUrl");
                this.f34983o = (GlideRequest) arguments.getParcelable("placeholder");
                GlideRequest glideRequest2 = this.f34970a;
                if (glideRequest2 != null) {
                    m53864a(glideRequest2, this.f34976g);
                }
            } else {
                arguments = null;
            }
            if (arguments != null) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.lark_brand_fragment_preview_item, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "permissions");
        Intrinsics.checkParameterIsNotNull(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 101) {
            return;
        }
        if (iArr[0] == 0) {
            mo49295b();
            return;
        }
        AppBrandLogger.m52829e("NewPreviewFragment", "save file error! Permission not granted!");
        ToastManager.showShortToast(getActivity(), getString(R.string.lark_brand_save_fail));
    }

    /* renamed from: a */
    public final void mo49292a(String str, long j, File file, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", i);
        if (file != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getPath(), options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            jSONObject.put("duration", j);
            jSONObject.put("img_size", file.length());
            jSONObject.put("img_width", i2);
            jSONObject.put("img_height", i3);
            if (getContext() != null) {
                jSONObject.put("screen_width", C67043j.m261275b(getContext()));
                jSONObject.put("screen_height", C67043j.m261267a(getContext()));
            }
        }
        C67556a.m262937a(str, jSONObject, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[Catch:{ Exception -> 0x001c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    @Override // com.bumptech.glide.request.AbstractC2536f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11204a(com.bumptech.glide.load.engine.GlideException r3, java.lang.Object r4, com.bumptech.glide.request.p095a.AbstractC2522j<java.io.File> r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.larkbrand.nativeMoudule.photo.NewPreviewFragment.mo11204a(com.bumptech.glide.load.engine.GlideException, java.lang.Object, com.bumptech.glide.request.a.j, boolean):boolean");
    }
}
