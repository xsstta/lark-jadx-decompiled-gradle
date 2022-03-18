package com.bytedance.ee.bear.imageviewer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0259b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.ComponentCallbacks2C2126g;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.request.p095a.AbstractC2513c;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.ee.bear.attachment.filereader.AbstractC4283a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageCommentData;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageType;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5186a;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5189d;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5190e;
import com.bytedance.ee.bear.drive.AbstractC6317a;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.imageviewer.C7846e;
import com.bytedance.ee.bear.imageviewer.view.DiagramWebView;
import com.bytedance.ee.bear.imageviewer.view.LargeImageView;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.bytedance.ee.util.io.C13671b;
import com.bytedance.ee.util.io.C13674e;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.io.C13680g;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.bytedance.ee.util.p718t.C13748k;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.imageviewer.e */
public class C7846e implements AbstractC7666d, AbstractC7843b {

    /* renamed from: k */
    static final /* synthetic */ boolean f21167k = true;

    /* renamed from: A */
    private al f21168A;

    /* renamed from: B */
    private Dialog f21169B;

    /* renamed from: C */
    private IStatusBar f21170C;

    /* renamed from: D */
    private Dialog f21171D;

    /* renamed from: E */
    private C7842a f21172E = new C7842a(C5234y.m21391b());

    /* renamed from: F */
    private View.OnLongClickListener f21173F = new View.OnLongClickListener() {
        /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$byi0_iakhjxSKMT3oYihnS__TOw */

        public final boolean onLongClick(View view) {
            return C7846e.this.m31459g(view);
        }
    };

    /* renamed from: G */
    private C11811a f21174G;

    /* renamed from: H */
    private C68289a f21175H = new C68289a();

    /* renamed from: I */
    private AbstractC7665c f21176I;

    /* renamed from: J */
    private C11789c.AbstractC11791a f21177J = new C11789c.AbstractC11791a() {
        /* class com.bytedance.ee.bear.imageviewer.C7846e.C78471 */

        @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
        public boolean interceptSetStatusBarColor(Activity activity, int i, boolean z) {
            return C7846e.f21167k;
        }

        @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
        public boolean interceptSetSystemUiVisibility(Activity activity, int i) {
            return C7846e.f21167k;
        }
    };

    /* renamed from: K */
    private C10917c f21178K = new C10917c(new C10929e());

    /* renamed from: L */
    private String f21179L = "";

    /* renamed from: M */
    private int f21180M = 0;

    /* renamed from: N */
    private String f21181N;

    /* renamed from: O */
    private ImageData.Position f21182O;

    /* renamed from: a */
    public FragmentActivity f21183a;

    /* renamed from: b */
    public TextView f21184b;

    /* renamed from: c */
    public List<ImageData.Image> f21185c = new ArrayList();

    /* renamed from: d */
    public int f21186d;

    /* renamed from: e */
    public ComponentCallbacks2C2126g f21187e;

    /* renamed from: f */
    public AbstractC5187b f21188f;

    /* renamed from: g */
    public AbstractC5181a f21189g;

    /* renamed from: h */
    public AbstractC5184b f21190h;

    /* renamed from: i */
    public List<DiagramWebView> f21191i = new ArrayList();

    /* renamed from: j */
    public View.OnClickListener f21192j = new View.OnClickListener() {
        /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$H3OouK7FgwoacWaU7tpbUfwgTc */

        public final void onClick(View view) {
            C7846e.this.m31461h((C7846e) view);
        }
    };

    /* renamed from: l */
    private Fragment f21193l;

    /* renamed from: m */
    private LifecycleOwner f21194m;

    /* renamed from: n */
    private ViewPager f21195n;

    /* renamed from: o */
    private C7857e f21196o;

    /* renamed from: p */
    private ImageView f21197p;

    /* renamed from: q */
    private ImageView f21198q;

    /* renamed from: r */
    private ImageData f21199r;

    /* renamed from: s */
    private ImageCommentData f21200s;

    /* renamed from: t */
    private C1177w<ImageCommentData> f21201t = new C1177w<>();

    /* renamed from: u */
    private C1177w<ImageData> f21202u = new C1177w<>();

    /* renamed from: v */
    private TextView f21203v;

    /* renamed from: w */
    private AbstractC5188c f21204w;

    /* renamed from: x */
    private AbstractC5189d f21205x;

    /* renamed from: y */
    private AbstractC5190e f21206y;

    /* renamed from: z */
    private AbstractC5186a f21207z;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.imageviewer.e$a */
    public interface AbstractC7853a {
        /* renamed from: a */
        void mo30672a(Uri uri);

        /* renamed from: a */
        void mo30673a(Throwable th);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    public boolean t_() {
        return f21167k;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31425a(String str, View view) {
        AbstractC5184b bVar = this.f21190h;
        if (bVar != null) {
            bVar.mo20697d();
        }
        AbstractC5189d dVar = this.f21205x;
        if (dVar != null) {
            dVar.mo20762c();
        }
        this.f21178K.mo41508c(ak.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$kOUPLyIYl9503gOEVopzKzaBRS4 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((ak) obj).handleQrResult(this.f$0);
            }
        }).mo238001b($$Lambda$e$dtA7o28hAiFCxP_3Ugx6bf2i0s.INSTANCE, $$Lambda$e$p1ufw1dUKpt1yt4yCYbCjlWai4.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.imageviewer.AbstractC7843b
    /* renamed from: a */
    public void mo30652a(FragmentActivity fragmentActivity, Fragment fragment, LifecycleOwner lifecycleOwner, Bundle bundle) {
        this.f21183a = fragmentActivity;
        this.f21194m = lifecycleOwner;
        this.f21193l = fragment;
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(fragmentActivity, AbstractC7665c.class);
        this.f21176I = cVar;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
        if (bundle != null) {
            this.f21179L = bundle.getString("extra_token", "");
            this.f21180M = bundle.getInt("extra_type", 0);
            this.f21181N = bundle.getString("extra_enter_anim_uuid", "");
            bundle.remove("extra_enter_anim_uuid");
            this.f21182O = (ImageData.Position) bundle.getParcelable("extra_enter_anim_pos");
        }
    }

    @Override // com.bytedance.ee.bear.imageviewer.AbstractC7843b
    /* renamed from: a */
    public View mo30649a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.imageviewer_fragment_view_pager, viewGroup, false);
    }

    @Override // com.bytedance.ee.bear.imageviewer.AbstractC7843b
    /* renamed from: a */
    public void mo30651a(View view, ImageData imageData) {
        AbstractC5188c cVar = this.f21204w;
        if (cVar != null) {
            cVar.mo20757a();
        }
        C13479a.m54772d("ImageViewer", "onViewCreated");
        this.f21199r = imageData;
        m31466n();
        m31436b(view);
        m31467o();
        m31464l();
    }

    @Override // com.bytedance.ee.bear.imageviewer.AbstractC7843b
    /* renamed from: a */
    public void mo30650a(Configuration configuration) {
        mo30666g();
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20674a(ImageCommentData imageCommentData) {
        this.f21201t.mo5929b(imageCommentData);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20671a() {
        m31475w();
        m31473u();
        m31474v();
    }

    /* renamed from: a */
    public void mo30659a(View view) {
        view.setOnLongClickListener(this.f21173F);
        this.f21197p.setEnabled(f21167k);
        this.f21198q.setEnabled(f21167k);
        boolean b = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36543b(this.f21180M, this.f21179L);
        this.f21197p.setEnabled(f21167k);
        this.f21197p.setImageResource(b ? R.drawable.doc_comment_download_enable : R.drawable.doc_comment_download_unable);
        this.f21197p.setOnClickListener(new View.OnClickListener(b) {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$fQUUdISHtjkFOW5Ktkcr4vio0 */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C7846e.this.m31431a((C7846e) this.f$1, (boolean) view);
            }
        });
        this.f21203v.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$PRmMSc00wzIVjOU6HQ3fKb3_yU */

            public final void onClick(View view) {
                C7846e.this.m31447d((C7846e) view);
            }
        });
        this.f21198q.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$0I7ie46ENsPgdxkMCzoFb0kCRg */

            public final void onClick(View view) {
                C7846e.this.m31442c((C7846e) view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31431a(boolean z, View view) {
        if (z) {
            AbstractC5184b bVar = this.f21190h;
            if (bVar != null) {
                bVar.mo20700g();
                this.f21190h.mo20692a(m31397A());
            }
            AbstractC5190e eVar = this.f21206y;
            if (eVar != null) {
                eVar.mo20765b(mo20680c());
            }
            m31398B();
            return;
        }
        Toast.showText(mo30665f(), (int) R.string.CreationMobile_ECM_AdminDisableToast);
    }

    /* renamed from: a */
    public String mo30657a(int i) {
        ImageData.Image image;
        ImageData imageData = this.f21199r;
        return (imageData == null || imageData.getImageList() == null || (image = this.f21199r.getImageList().get(i)) == null) ? "" : m31415a(image.getOriginalSrc());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31430a(boolean z) {
        C13479a.m54764b("ImageViewer", "checkStoragePermissions()... isGrant = " + z);
        if (!z) {
            ((AbstractC4283a) KoinJavaComponent.m268610a(AbstractC4283a.class)).mo16875b();
        } else if (C36808a.m145211c() == 1) {
            Toast.showText(mo30665f(), mo30665f().getString(R.string.CreationMobile_ECM_SecuritySettingKAToast), 1, f21167k);
        } else if (m31410N()) {
            m31411O();
        } else {
            m31400D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31427a(String str, File file) throws Exception {
        if (file == null) {
            C13479a.m54758a("ImageViewer", "senToLark error: file is null");
            Toast.showFailureText(mo30665f(), this.f21183a.getString(R.string.Doc_Doc_SendToLarkFailed), 0);
            return;
        }
        Uri a = C13671b.m55462a(mo30665f().getApplicationContext(), file.getName(), null, null);
        C13671b.m55469a(mo30665f().getApplicationContext(), file.getAbsolutePath(), a);
        if (C13681h.m55561a(str)) {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath.contains(".")) {
                File file2 = new File(absolutePath.substring(0, absolutePath.lastIndexOf(".")) + "." + C13674e.m55482a(file));
                C13675f.m55514b(file, file2);
                Uri a2 = C13671b.m55462a(mo30665f().getApplicationContext(), file2.getName(), null, C13680g.f35878a);
                C13671b.m55469a(mo30665f().getApplicationContext(), file2.getAbsolutePath(), a2);
                mo30658a(a2);
                return;
            }
            mo30658a(a);
            return;
        }
        mo30658a(a);
    }

    /* renamed from: a */
    public void mo30658a(Uri uri) {
        if (uri != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            this.f21175H.mo237937a(this.f21178K.mo41508c(ak.class).mo238020d(new Function(arrayList) {
                /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$1DkkT3ngV3h_14GDpFQlqRzuN7s */
                public final /* synthetic */ ArrayList f$0;

                {
                    this.f$0 = r1;
                }

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return ((ak) obj).shareImages(null, null, this.f$0);
                }
            }).mo238001b($$Lambda$e$fKlSu8ODZXRcYvQND_nyDQZuNrc.INSTANCE, $$Lambda$e$miXBoSCaX22FniW0e0l8nV_3dI.INSTANCE));
            return;
        }
        C13479a.m54758a("ImageViewer", "shareToLark() failed: file is null");
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20675a(ImageData imageData) {
        this.f21175H.mo237937a(C7845d.m31395a(imageData).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$AdTi8nYHYtfBUwcSP0c0cJD5voY */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.this.m31443c((C7846e) ((ImageData) obj));
            }
        }, $$Lambda$e$qTCuYGMyFr9F4fYUqgZXvBfvZ0.INSTANCE));
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20679a(AbstractC5190e eVar) {
        this.f21206y = eVar;
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20678a(AbstractC5188c cVar) {
        this.f21204w = cVar;
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20677a(AbstractC5187b bVar) {
        this.f21188f = bVar;
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20673a(AbstractC5184b bVar) {
        this.f21190h = bVar;
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20672a(AbstractC5181a aVar) {
        this.f21189g = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20676a(AbstractC5186a aVar) {
        this.f21207z = aVar;
    }

    /* renamed from: a */
    public void mo30660a(LargeImageView largeImageView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        if (!C13681h.m55561a(str)) {
            mo30662a(new File(str), largeImageView);
        } else if (((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20410a(str)) {
            mo30661a(largeImageView, str, str2, DownloadRequestInfo.DownloadType.IMG);
        } else {
            m31424a(largeImageView, str, str2, f21167k);
        }
    }

    /* renamed from: a */
    public void mo30661a(LargeImageView largeImageView, String str, String str2, DownloadRequestInfo.DownloadType downloadType) {
        ConnectionService.NetworkState b = C5084ad.m20847d().mo20038b();
        C1177w wVar = new C1177w();
        C13748k.m55732a(new Runnable(wVar, downloadType, largeImageView, str, str2) {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$AWjt8W5SSJdKaaOJ95OrfLtgHso */
            public final /* synthetic */ C1177w f$1;
            public final /* synthetic */ DownloadRequestInfo.DownloadType f$2;
            public final /* synthetic */ LargeImageView f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void run() {
                C7846e.this.m31421a((C7846e) this.f$1, (C1177w) this.f$2, (DownloadRequestInfo.DownloadType) this.f$3, (LargeImageView) this.f$4, this.f$5);
            }
        });
        ((AbstractC6317a) KoinJavaComponent.m268610a(AbstractC6317a.class)).mo20409a(str, (b == null || b.mo20041b()) ? f21167k : false, new C7855c(wVar), downloadType, this.f21179L, this.f21180M);
    }

    /* renamed from: a */
    public void mo30663a(String str, String str2, LargeImageView largeImageView) {
        if (TextUtils.equals(str, str2) || TextUtils.isEmpty(str2)) {
            m31420a((Drawable) null, largeImageView);
        } else {
            mo30660a(largeImageView, str2, str2);
        }
    }

    /* renamed from: a */
    public void mo30664a(boolean z, String str, String str2, File file, LargeImageView largeImageView) {
        C13479a.m54764b("ImageViewer", "onResourceReady");
        if (file != null) {
            String a = C13674e.m55482a(file);
            C13479a.m54772d("ImageViewer", "image type = " + a);
            if (TextUtils.equals(a, "html")) {
                try {
                    C13675f.m55527d(file);
                } catch (IOException e) {
                    C13479a.m54759a("ImageViewer", "FileUtils forceDelete file failed " + file, e);
                }
                if (z) {
                    C13479a.m54764b("ImageViewer", "loadResourceFinished(): retry");
                    m31424a(largeImageView, str, str2, TextUtils.equals(str, str2) ^ f21167k);
                    return;
                }
                return;
            }
            mo30662a(file, largeImageView);
        }
    }

    /* renamed from: a */
    public void mo30662a(File file, LargeImageView largeImageView) {
        if (file == null || largeImageView == null) {
            C13479a.m54758a("ImageViewer", "loadLocalImageFile(): file is null ,view = " + largeImageView);
            return;
        }
        largeImageView.mo30687a(this.f21187e, file);
        mo30659a(largeImageView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31428a(String str, String str2) {
        m31426a(str2, new AbstractC7853a() {
            /* class com.bytedance.ee.bear.imageviewer.C7846e.C78515 */

            @Override // com.bytedance.ee.bear.imageviewer.C7846e.AbstractC7853a
            /* renamed from: a */
            public void mo30672a(Uri uri) {
                C7846e.this.mo30658a(uri);
            }

            @Override // com.bytedance.ee.bear.imageviewer.C7846e.AbstractC7853a
            /* renamed from: a */
            public void mo30673a(Throwable th) {
                C13479a.m54758a("ImageViewer", "sendDiagramToLark failed");
            }
        });
    }

    /* renamed from: a */
    private void m31426a(String str, AbstractC7853a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.mo30673a(new Throwable());
            return;
        }
        AbstractC68307f a = AbstractC68307f.m265083a(str).mo237985a(C11678b.m48479c()).mo238020d(new Function<String, Uri>() {
            /* class com.bytedance.ee.bear.imageviewer.C7846e.C78526 */

            /* renamed from: a */
            public Uri apply(String str) throws Exception {
                String substring = str.substring(str.indexOf(",") + 1);
                OutputStream outputStream = null;
                Uri a = C13671b.m55462a(C7846e.this.mo30665f(), "/picture/" + System.currentTimeMillis() + ".png", null, C13680g.f35878a);
                byte[] decode = Base64.decode(substring, 0);
                for (int i = 0; i < decode.length; i++) {
                    if (decode[i] < 0) {
                        decode[i] = (byte) (decode[i] + 256);
                    }
                }
                if (a != null) {
                    try {
                        outputStream = C13671b.m55465a(C7846e.this.mo30665f(), a);
                        outputStream.write(decode);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                return a;
            }
        }).mo237985a(C11678b.m48481e());
        aVar.getClass();
        $$Lambda$oD4TxFiwJE8yiyb6DX35qk8zq0 r0 = new Consumer() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$oD4TxFiwJE8yiyb6DX35qk8zq0 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.AbstractC7853a.this.mo30672a((Uri) obj);
            }
        };
        aVar.getClass();
        a.mo238001b(r0, new Consumer() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$UefOmOSqzGKcwBu1yW9QxSX78Ew */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.AbstractC7853a.this.mo30673a((Throwable) obj);
            }
        });
    }

    /* renamed from: v */
    private void m31474v() {
        AbstractC7665c cVar = this.f21176I;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
    }

    /* renamed from: f */
    public Context mo30665f() {
        FragmentActivity fragmentActivity = this.f21183a;
        if (fragmentActivity == null) {
            return C13615c.f35773a;
        }
        return fragmentActivity;
    }

    /* renamed from: j */
    public void mo30669j() {
        this.f21197p.setEnabled(false);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        m31475w();
        return f21167k;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.imageviewer.e$e */
    public class C7857e extends PagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            if (view == obj) {
                return C7846e.f21167k;
            }
            return false;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return C7846e.this.f21185c.size();
        }

        private C7857e() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            DiagramWebView diagramWebView;
            String uuid = C7846e.this.f21185c.get(i).getUuid();
            if (ImageType.getType(uuid) == ImageType.DIAGRAM) {
                DiagramWebView diagramWebView2 = new DiagramWebView(C7846e.this.mo30665f());
                C7846e.this.f21191i.add(diagramWebView2);
                if (C7846e.this.f21189g != null) {
                    C7846e.this.f21189g.mo20687a(uuid, C7846e.this.f21186d, new AbstractC5181a.AbstractC5183b() {
                        /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$e$PkmYKKmKZVGeVf8qXDZEzj_SF9Y */

                        @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a.AbstractC5183b
                        public final void onDataReceived(String str, String str2) {
                            DiagramWebView.this.mo30680a((DiagramWebView) str2);
                        }
                    });
                }
                diagramWebView2.setOnClickListener(C7846e.this.f21192j);
                C7846e.this.mo30659a(diagramWebView2);
                diagramWebView = diagramWebView2;
            } else {
                LargeImageView largeImageView = new LargeImageView(C7846e.this.mo30665f());
                largeImageView.setOnClickListener(C7846e.this.f21192j);
                C7846e.this.mo30660a(largeImageView, C7846e.this.f21185c.get(i).getOriginalSrc(), C7846e.this.f21185c.get(i).getSrc());
                diagramWebView = largeImageView;
            }
            diagramWebView.setTag(uuid);
            viewGroup.addView(diagramWebView);
            return diagramWebView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof DiagramWebView) {
                DiagramWebView diagramWebView = (DiagramWebView) obj;
                C7846e.this.f21191i.remove(diagramWebView);
                diagramWebView.mo30679a();
                diagramWebView.destroy();
            } else {
                C7846e.this.f21187e.mo10416a((View) obj);
            }
            viewGroup.removeView((View) obj);
        }
    }

    /* renamed from: F */
    private void m31402F() {
        int i;
        ImageView imageView = this.f21197p;
        if (m31407K()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: G */
    private void m31403G() {
        int i;
        ImageView imageView = this.f21198q;
        if (m31408L()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: O */
    private void m31411O() {
        m31423a(new AbstractC5181a.AbstractC5182a() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$3HBHqfgZrUmRTx9SPFx_MlMd1Y */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a.AbstractC5182a
            public final void onDataReceived(String str, String str2) {
                C7846e.this.m31439b((C7846e) str, str2);
            }
        });
    }

    /* renamed from: P */
    private void m31412P() {
        m31423a(new AbstractC5181a.AbstractC5182a() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$vYMjcfSuF6nr3N5A4HVCBLKo_U4 */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a.AbstractC5182a
            public final void onDataReceived(String str, String str2) {
                C7846e.this.m31428a((C7846e) str, str2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m31413Q() {
        new ImageEnterAnimator().mo30655a(this.f21195n, this.f21182O);
    }

    /* renamed from: p */
    private void m31468p() {
        this.f21187e = ComponentCallbacks2C2115c.m9142a(this.f21193l);
    }

    /* renamed from: h */
    public void mo30667h() {
        mo30666g();
        m31402F();
        m31403G();
    }

    /* renamed from: A */
    private String m31397A() {
        ImageData imageData = this.f21199r;
        if (imageData == null || imageData.getImage() == null) {
            return "";
        }
        return m31415a(this.f21199r.getImage().getOriginalSrc());
    }

    /* renamed from: B */
    private void m31398B() {
        C13708c.m55598a(C13615c.f35773a, "android.permission.WRITE_EXTERNAL_STORAGE", C13615c.f35773a.getString(R.string.Doc_Facade_PermissionStorage), new AbstractC13707b() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$1m13FyhM7V7hIl_QHrhU2_Zh864 */

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                C7846e.this.m31430a((C7846e) z);
            }
        });
    }

    /* renamed from: I */
    private boolean m31405I() {
        if (m31409M() == null || !m31409M().isComment()) {
            return false;
        }
        return f21167k;
    }

    /* renamed from: J */
    private boolean m31406J() {
        if (m31409M() == null || !m31409M().isCommentable()) {
            return false;
        }
        return f21167k;
    }

    /* renamed from: K */
    private boolean m31407K() {
        if (m31409M() == null || !m31409M().isCopy()) {
            return false;
        }
        return f21167k;
    }

    /* renamed from: L */
    private boolean m31408L() {
        if (m31409M() == null || !m31409M().isDelete()) {
            return false;
        }
        return f21167k;
    }

    /* renamed from: N */
    private boolean m31410N() {
        String c = mo20680c();
        if (TextUtils.isEmpty(c) || !c.contains(ImageType.DIAGRAM.uuidPrefix)) {
            return false;
        }
        return f21167k;
    }

    /* renamed from: l */
    private void m31464l() {
        this.f21201t.mo5923a(this.f21194m, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$HNKSsTNtxPVUF8GM64OJIYQYMYg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7846e.this.m31437b((C7846e) ((ImageCommentData) obj));
            }
        });
        this.f21202u.mo5923a(this.f21194m, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$C_KYjB6VqcEYA7sdlW_MzboO9Zk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7846e.this.m31452e((C7846e) ((ImageData) obj));
            }
        });
    }

    /* renamed from: u */
    private void m31473u() {
        FragmentActivity fragmentActivity = this.f21183a;
        if (fragmentActivity != null) {
            C11789c.m48871b(fragmentActivity, this.f21177J);
        }
        IStatusBar aVar = this.f21170C;
        if (aVar != null) {
            aVar.mo50689b();
        }
    }

    /* renamed from: w */
    private void m31475w() {
        C13479a.m54764b("ImageViewer", "notifyDelegateToClose()");
        AbstractC5188c cVar = this.f21204w;
        if (cVar != null) {
            cVar.mo20758a(mo20680c());
        }
    }

    /* renamed from: y */
    private void m31477y() {
        this.f21185c.clear();
        this.f21185c.addAll(this.f21199r.getImageList());
        this.f21196o.notifyDataSetChanged();
        m31478z();
    }

    /* renamed from: i */
    public ImageType mo30668i() {
        return ImageType.getType(mo20680c());
    }

    /* renamed from: H */
    private boolean m31404H() {
        if (mo30665f() == null) {
            return false;
        }
        if (mo30665f().getResources().getConfiguration().orientation == 1 || C13653a.m55399c(mo30665f())) {
            return f21167k;
        }
        return false;
    }

    /* renamed from: n */
    private void m31466n() {
        if (f21167k || this.f21183a != null) {
            IStatusBar a = StatusBarManager.m55628a(this.f21183a);
            this.f21170C = a;
            a.mo50687a();
            this.f21170C.mo50688a(-16777216, f21167k);
            C11789c.m48866a(this.f21183a, this.f21177J);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: q */
    private void m31469q() {
        C7857e eVar = new C7857e();
        this.f21196o = eVar;
        this.f21195n.setAdapter(eVar);
        this.f21195n.addOnPageChangeListener(new C7856d());
        this.f21195n.setCurrentItem(this.f21186d);
        this.f21195n.setOffscreenPageLimit(0);
        if (!TextUtils.isEmpty(this.f21181N) && this.f21182O != null) {
            this.f21195n.post(new Runnable() {
                /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$BXPfco72STcg37WXqWHNf87D7ts */

                public final void run() {
                    C7846e.this.m31413Q();
                }
            });
        }
    }

    /* renamed from: r */
    private boolean m31470r() {
        if (this.f21199r.getImageList().size() != this.f21185c.size()) {
            return f21167k;
        }
        for (int i = 0; i < this.f21185c.size(); i++) {
            if (!this.f21185c.get(i).equals(this.f21199r.getImageList().get(i))) {
                return f21167k;
            }
        }
        return false;
    }

    /* renamed from: x */
    private void m31476x() {
        Dialog dialog = this.f21169B;
        if (dialog != null && dialog.isShowing()) {
            this.f21169B.dismiss();
        }
        if (this.f21186d >= this.f21185c.size() - 1) {
            this.f21186d = this.f21199r.getImageList().size() - 1;
        }
        m31477y();
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: c */
    public String mo20680c() {
        ImageData imageData = this.f21199r;
        if (imageData == null) {
            C13479a.m54775e("ImageViewer", "getCurrentImageUUID(): mCurrentImageData is null");
            return "";
        }
        List<ImageData.Image> imageList = imageData.getImageList();
        if (imageList == null || imageList.isEmpty()) {
            C13479a.m54775e("ImageViewer", "getCurrentImageUUID(): imageList.isEmpty()");
            return "";
        }
        if (this.f21186d >= imageList.size()) {
            this.f21186d = imageList.size() - 1;
        }
        return imageList.get(this.f21186d).getUuid();
    }

    /* renamed from: C */
    private void m31399C() {
        AbstractC5184b bVar = this.f21190h;
        if (bVar != null) {
            bVar.mo20701h();
        }
        AbstractC5190e eVar = this.f21206y;
        if (eVar != null) {
            eVar.mo20766c(mo20680c());
        }
        new BearUDDialogBuilder(this.f21183a).mo45362d(R.string.Doc_Doc_DeleteImageConfirm).mo45345a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Delete, R.color.function_danger_500, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$T0L9zGjOFh48ki3PgJWFddr19i8 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7846e.this.m31419a((C7846e) dialogInterface, (DialogInterface) i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45349a($$Lambda$WKyTEX5b2irF8MDZBc9hut9ta4A.INSTANCE).mo45355a().show();
    }

    /* renamed from: D */
    private void m31400D() {
        String realSrc = this.f21185c.get(this.f21186d).getRealSrc();
        C13479a.m54772d("ImageViewer", "save imgUrl = " + C13598b.m55197d(realSrc));
        this.f21175H.mo237937a(AbstractC68307f.m265083a(realSrc).mo237985a(C11678b.m48477a()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$RodON0UMX8qhxrRt5cz3sEDFA4 */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7846e.this.m31450e((String) obj);
            }
        }).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$tswA7lxBgsQ_ifZYuIWc07Hos */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7846e.this.m31414a((File) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$gyfyO8tYToQkBsjaWbiXUNDr6g */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.this.m31435b((C7846e) ((Uri) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$6M92etGDf43s5omC5v2lm8k0B5Q */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.this.m31449d((C7846e) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: E */
    private void m31401E() {
        String realSrc = this.f21185c.get(this.f21186d).getRealSrc();
        C13479a.m54764b("ImageViewer", "save imgUrl = " + C13598b.m55197d(realSrc));
        this.f21175H.mo237937a(AbstractC68307f.m265083a(realSrc).mo238004b(C11678b.m48477a()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$f7SPJVvI0KA2URY3baao_dcsM */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7846e.this.m31446d((String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(realSrc) {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$qCqmxFP64StO1c_c_Ul1qbiMHA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.this.m31427a((C7846e) this.f$1, (String) ((File) obj));
            }
        }, $$Lambda$e$h1F4K4v5ZtrqASQRUOn0WUjOA2E.INSTANCE));
    }

    /* renamed from: M */
    private ImageData.ToolStatus m31409M() {
        ImageData.ToolStatus singleToolStatus;
        ImageData imageData = this.f21199r;
        if (imageData == null || imageData.getImageList() == null || this.f21199r.getImageList().isEmpty()) {
            C13479a.m54758a("ImageViewer", "getCurrentToolStatus()... mCurrentImageData or mCurrentImageData.getImageList() is empty");
            return null;
        }
        if (this.f21186d >= this.f21199r.getImageList().size()) {
            this.f21186d = this.f21199r.getImageList().size() - 1;
        }
        if (this.f21186d < 0 || (singleToolStatus = this.f21199r.getImageList().get(this.f21186d).getSingleToolStatus()) == null) {
            return this.f21199r.getToolStatus();
        }
        return singleToolStatus;
    }

    /* renamed from: k */
    private void m31463k() {
        Dialog dialog;
        if (this.f21174G != null || ((dialog = this.f21169B) != null && dialog.isShowing())) {
            C13479a.m54772d("ImageViewer", "ActionSheet has shown...");
            return;
        }
        this.f21174G = C11811a.m48976a(mo30665f());
        if (this.f21168A.mo17344E() == 1) {
            this.f21174G.mo45215a(R.string.Doc_Doc_SendToChat, new View.OnClickListener() {
                /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$hQYlKvOG9cvrgMT3xRPSGl1ulE */

                public final void onClick(View view) {
                    C7846e.this.m31454f((C7846e) view);
                }
            });
        }
        this.f21175H.mo237937a(AbstractC68307f.m265083a(this.f21185c.get(this.f21186d).getRealSrc()).mo238004b(C11678b.m48477a()).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$FSYlvJ2W2hlkgX3lvRqjhcOs7Fk */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7846e.this.m31462i((String) obj);
            }
        }).mo238014c(new Function() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$OvpUfwTE7znVgBVXUHgWmQRKBXo */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7846e.this.m31460h((String) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$ygesGQUaJi3foNzHgfP7ww_4iV8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.this.m31455f((C7846e) ((String) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$ZlyYhy0806Is82gbpecy2VRr5xo */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C7846e.this.m31456f((C7846e) ((Throwable) obj));
            }
        }));
    }

    /* renamed from: m */
    private void m31465m() {
        boolean z;
        ImageData imageData = this.f21199r;
        if (imageData != null && imageData.getImageList() != null) {
            if (!m31470r()) {
                C13479a.m54764b("ImageViewer", "updateImageData(), imageData == mLastImageData");
                m31438b(this.f21199r);
                return;
            }
            if (this.f21199r.getImageList().size() < this.f21185c.size()) {
                z = f21167k;
            } else {
                z = false;
            }
            if (!z) {
                m31471s();
                m31477y();
            } else if (m31471s()) {
                AbstractC5187b bVar = this.f21188f;
                if (bVar != null) {
                    bVar.mo20754a();
                }
                Dialog dialog = this.f21171D;
                if (dialog != null && dialog.isShowing()) {
                    m31476x();
                    this.f21171D.dismiss();
                }
                m31472t();
            } else {
                m31477y();
            }
            mo30667h();
            AbstractC5184b bVar2 = this.f21190h;
            if (bVar2 != null) {
                bVar2.mo20691a(mo30668i());
            }
        }
    }

    /* renamed from: o */
    private void m31467o() {
        this.f21168A = C4511g.m18594d();
        ImageData imageData = this.f21199r;
        if (imageData == null || imageData.getImage() == null || this.f21199r.getImageList() == null || this.f21199r.getImageList().isEmpty()) {
            m31475w();
        } else {
            this.f21175H.mo237937a(C7845d.m31395a(this.f21199r).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$p3aK_gVlXcZugJNJcGacecrp_ZE */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C7846e.this.m31448d((C7846e) ((ImageData) obj));
                }
            }, $$Lambda$e$zXqdd_HdZayBPK_cR92LYtyXzvA.INSTANCE));
        }
    }

    /* renamed from: s */
    private boolean m31471s() {
        String uuid = this.f21185c.get(this.f21186d).getUuid();
        if (uuid == null) {
            C13479a.m54775e("ImageViewer", "isDelCurrentImage(): uuid is null");
            return false;
        }
        for (int i = 0; i < this.f21199r.getImageList().size(); i++) {
            if (TextUtils.equals(uuid, this.f21199r.getImageList().get(i).getUuid())) {
                this.f21186d = i;
                return false;
            }
        }
        return f21167k;
    }

    /* renamed from: t */
    private void m31472t() {
        UDDialog a = new BearUDDialogBuilder(mo30665f()).mo45362d(R.string.Doc_Doc_ImageDeletedTip).mo45365f(R.color.ud_N600).mo45360c(17).mo45343a(260.0f).mo45366g(0).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$XpPJDOg7ZpE7YwPoBrcBg5a70Ew */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C7846e.this.m31434b((C7846e) dialogInterface, (DialogInterface) i);
            }
        }).mo45361c(false).mo45355a();
        this.f21171D = a;
        a.show();
    }

    /* renamed from: z */
    private void m31478z() {
        if (this.f21195n.getCurrentItem() == this.f21186d) {
            mo30666g();
        }
        this.f21195n.setCurrentItem(this.f21186d);
        AbstractC5187b bVar = this.f21188f;
        if (bVar != null) {
            bVar.mo20755a(mo20680c(), this.f21186d);
        }
        C13479a.m54764b("ImageViewer", "refreshImageData(): uuid = " + mo20680c());
        TextView textView = this.f21184b;
        textView.setText((this.f21186d + 1) + "/" + this.f21185c.size());
    }

    @Override // com.bytedance.ee.bear.imageviewer.AbstractC7843b
    /* renamed from: d */
    public void mo30653d() {
        C13479a.m54772d("ImageViewer", "onDestroyView");
        for (DiagramWebView diagramWebView : this.f21191i) {
            diagramWebView.mo30679a();
            diagramWebView.destroy();
        }
        this.f21191i.clear();
        this.f21175H.dispose();
        m31473u();
        m31474v();
        AbstractC5184b bVar = this.f21190h;
        if (bVar != null) {
            bVar.mo20690a();
        }
    }

    @Override // com.bytedance.ee.bear.imageviewer.AbstractC7843b
    /* renamed from: e */
    public void mo30654e() {
        AbstractC5188c cVar = this.f21204w;
        if (cVar != null) {
            cVar.mo20759b();
        }
    }

    /* renamed from: g */
    public void mo30666g() {
        boolean z;
        if (!m31405I()) {
            this.f21203v.setVisibility(8);
            return;
        }
        boolean z2 = false;
        this.f21203v.setVisibility(0);
        int a = C25653b.m91893a(C13615c.f35773a.getResources().getColor(R.color.space_kit_n00), 0.25f);
        ImageCommentData imageCommentData = this.f21200s;
        if (imageCommentData != null) {
            ImageCommentData.ImageCommentInfo imageCommentInfo = imageCommentData.getImageCommentDataMap().get(mo20680c());
            if (imageCommentInfo == null || imageCommentInfo.getCommentCount() <= 0) {
                this.f21203v.setCompoundDrawablePadding(0);
                this.f21203v.setText("");
            } else {
                this.f21203v.setCompoundDrawablePadding(C27144b.m98678a(7.0f));
                this.f21203v.setText(String.valueOf(imageCommentInfo.getCommentCount()));
            }
            if (imageCommentInfo == null || !imageCommentInfo.isCommentable()) {
                z = false;
            } else {
                z = f21167k;
            }
            TextView textView = this.f21203v;
            if (z && m31404H()) {
                z2 = f21167k;
            }
            textView.setEnabled(z2);
            TextView textView2 = this.f21203v;
            if (z) {
                a = -1;
            }
            textView2.setTextColor(a);
            return;
        }
        C13479a.m54775e("ImageViewer", "Image Comment data is null");
        this.f21203v.setCompoundDrawablePadding(0);
        this.f21203v.setText("");
        TextView textView3 = this.f21203v;
        if (m31406J() && m31404H()) {
            z2 = f21167k;
        }
        textView3.setEnabled(z2);
        this.f21203v.setTextColor(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31418a(DialogInterface dialogInterface) {
        this.f21174G = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m31442c(View view) {
        m31399C();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m31461h(View view) {
        m31475w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.bytedance.ee.bear.imageviewer.e$b */
    public static class C7854b {

        /* renamed from: a */
        int f21222a;

        /* renamed from: b */
        String f21223b;

        public C7854b(int i) {
            this.f21222a = i;
        }

        public C7854b(int i, String str) {
            this.f21222a = i;
            this.f21223b = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.imageviewer.e$c */
    public static class C7855c implements AbstractC6317a.AbstractC6318a {

        /* renamed from: a */
        C1177w<C7854b> f21224a;

        public C7855c(C1177w<C7854b> wVar) {
            this.f21224a = wVar;
        }

        @Override // com.bytedance.ee.bear.drive.AbstractC6317a.AbstractC6318a
        /* renamed from: a */
        public void mo25411a(String str) {
            this.f21224a.mo5926a(new C7854b(1));
        }

        @Override // com.bytedance.ee.bear.drive.AbstractC6317a.AbstractC6318a
        /* renamed from: a */
        public void mo25412a(String str, String str2) {
            this.f21224a.mo5926a(new C7854b(3, str2));
        }

        @Override // com.bytedance.ee.bear.drive.AbstractC6317a.AbstractC6318a
        /* renamed from: a */
        public void mo25413a(String str, String str2, int i) {
            C13479a.m54764b("ImageViewer", "onDownloadFail()... key = " + str2 + ", errorCode = " + i);
            this.f21224a.mo5926a(new C7854b(2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.imageviewer.e$d */
    public class C7856d implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        private C7856d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i == 1) {
                C7846e.this.f21187e.mo10428g();
                return;
            }
            if (C7846e.this.f21187e.mo10420a()) {
                C7846e.this.f21187e.mo10427f();
            }
            if (i == 2 && C7846e.this.f21190h != null) {
                C7846e.this.f21190h.mo20693b();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            C7846e.this.f21186d = i;
            C7846e.this.f21184b.setVisibility(0);
            TextView textView = C7846e.this.f21184b;
            textView.setText((C7846e.this.f21186d + 1) + "/" + C7846e.this.f21185c.size());
            C7846e.this.mo30667h();
            if (C7846e.this.f21188f != null) {
                C7846e.this.f21188f.mo20755a(C7846e.this.mo20680c(), C7846e.this.f21186d);
            }
            if (C7846e.this.f21190h != null) {
                C7846e.this.f21190h.mo20691a(C7846e.this.mo30668i());
                C7846e.this.f21190h.mo20696c(C7846e.this.mo30657a(i));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31437b(ImageCommentData imageCommentData) {
        this.f21200s = imageCommentData;
        C13479a.m54764b("ImageViewer", "updateImageCommentData");
        mo30666g();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m31443c(ImageData imageData) throws Exception {
        C13479a.m54772d("ImageViewer", "handle()...accept");
        this.f21202u.mo5929b(imageData);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m31451e(View view) {
        AbstractC5189d dVar = this.f21205x;
        if (dVar != null) {
            dVar.mo20763d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m31462i(String str) throws Exception {
        File b = m31450e(str);
        if (b == null) {
            return "";
        }
        return b.getAbsolutePath();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m31447d(View view) {
        AbstractC5190e eVar = this.f21206y;
        if (eVar != null) {
            eVar.mo20764a(mo20680c());
        }
        this.f21190h.mo20694b(m31397A());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m31452e(ImageData imageData) {
        if (this.f21199r != imageData) {
            C13479a.m54764b("ImageViewer", "updateImageData");
            this.f21199r = imageData;
            m31465m();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m31454f(View view) {
        AbstractC5184b bVar = this.f21190h;
        if (bVar != null) {
            bVar.mo20695c();
        }
        AbstractC5189d dVar = this.f21205x;
        if (dVar != null) {
            dVar.mo20760a();
        }
        if (m31410N()) {
            m31412P();
        } else {
            m31401E();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ boolean m31459g(View view) {
        if (!m31407K()) {
            return f21167k;
        }
        m31463k();
        return f21167k;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ AbstractC70020b m31460h(String str) throws Exception {
        return this.f21178K.mo41508c(ak.class).mo238020d(new Function(str) {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$FlMVUf00ojjjEae2leWcYv8vyL0 */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return ((ak) obj).recognizeQRCode(this.f$0);
            }
        });
    }

    /* renamed from: a */
    private String m31415a(String str) {
        if (str == null) {
            return "";
        }
        try {
            String path = Uri.parse(str).getPath();
            String substring = path.substring(0, path.lastIndexOf("/"));
            return substring.substring(substring.lastIndexOf("/") + 1, substring.length());
        } catch (Exception e) {
            C13479a.m54758a("ImageViewer", "getImageToken error " + e);
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public File m31450e(String str) {
        try {
            if (C13681h.m55561a(str)) {
                return (File) ((C2124f) this.f21187e.mo10414a(new C13664a(str)).mo11129a(AbstractC2354j.f7813c)).mo10405b(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
            }
            return new File(str);
        } catch (Exception e) {
            C13479a.m54759a("ImageViewer", "getFileFromUrl(): failed ", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m31449d(Throwable th) throws Exception {
        C13479a.m54761a("ImageViewer", th);
        Toast.showFailureText(mo30665f(), this.f21183a.getString(R.string.Doc_Facade_SaveFailed), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m31456f(Throwable th) throws Exception {
        this.f21174G = null;
        C13479a.m54758a("ImageViewer", "initActionSheet(), throwable:" + th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Uri m31414a(File file) throws Exception {
        if (file == null) {
            return null;
        }
        Uri a = C13671b.m55462a(mo30665f(), new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "/picture/" + "." + C13674e.m55482a(file), null, C13680g.f35878a);
        C13671b.m55469a(mo30665f(), file.getAbsolutePath(), a);
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31435b(Uri uri) throws Exception {
        if (uri != null) {
            C13671b.m55476e(mo30665f(), uri);
            ((AbstractC4283a) KoinJavaComponent.m268610a(AbstractC4283a.class)).mo16873a();
            return;
        }
        Toast.showFailureText(mo30665f(), this.f21183a.getString(R.string.Doc_Facade_SaveFailed), 0);
    }

    /* renamed from: b */
    private void m31436b(View view) {
        this.f21197p = (ImageView) view.findViewById(R.id.doc_iv_download);
        this.f21198q = (ImageView) view.findViewById(R.id.doc_iv_delete);
        this.f21184b = (TextView) view.findViewById(R.id.doc_tv_index);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        this.f21195n = viewPager;
        viewPager.setPageMargin((int) (this.f21183a.getResources().getDisplayMetrics().density * 15.0f));
        TextView textView = (TextView) view.findViewById(R.id.doc_tv_comment);
        this.f21203v = textView;
        textView.setCompoundDrawablePadding(0);
        this.f21203v.setText("");
        this.f21203v.setEnabled(false);
        this.f21197p.setEnabled(false);
        this.f21198q.setEnabled(false);
        C5084ad.m20847d().mo20037a().mo5923a(this.f21194m, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$TitMclYcjguak7asBuY0angYsGo */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C7846e.this.m31422a((C7846e) ((ConnectionService.NetworkState) obj));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m31448d(ImageData imageData) throws Exception {
        this.f21185c.clear();
        this.f21185c.addAll(this.f21199r.getImageList());
        int i = 0;
        while (true) {
            if (i >= this.f21185c.size()) {
                break;
            } else if (TextUtils.equals(this.f21199r.getImage().getUuid(), this.f21185c.get(i).getUuid())) {
                this.f21186d = i;
                break;
            } else {
                i++;
            }
        }
        this.f21184b.setText(String.format("%s/%s", Integer.valueOf(this.f21186d + 1), Integer.valueOf(this.f21185c.size())));
        m31468p();
        m31469q();
        mo30667h();
        this.f21202u.mo5929b(this.f21199r);
        AbstractC5184b bVar = this.f21190h;
        if (bVar != null) {
            bVar.mo20691a(mo30668i());
            this.f21190h.mo20699f();
            this.f21190h.mo20696c(m31397A());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m31455f(String str) throws Exception {
        float f;
        if (!TextUtils.isEmpty(str)) {
            C13479a.m54764b("ImageViewer", "initActionSheet(), result:" + C13598b.m55197d(str));
            this.f21174G.mo45215a(R.string.Doc_Doc_ScanQRCode, new View.OnClickListener(str) {
                /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$BRzYD2RQIQ2Z93Jp7RwLS_AL2P0 */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C7846e.this.m31425a((C7846e) this.f$1, (String) view);
                }
            });
        } else {
            C13479a.m54764b("ImageViewer", "initActionSheet(), result is null");
        }
        boolean b = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36543b(this.f21180M, this.f21179L);
        C11811a aVar = this.f21174G;
        C11816b.C11818a a = C11816b.m49006a().mo45254a(mo30665f().getText(R.string.Doc_Doc_SaveImage));
        if (b) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        aVar.mo45219a(a.mo45250a(f).mo45253a(new View.OnClickListener(b) {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$jyDffXinXcTVS7N_Jk_bf0wNziQ */
            public final /* synthetic */ boolean f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C7846e.this.m31441b((C7846e) this.f$1, (boolean) view);
            }
        }).mo45257a());
        this.f21174G.mo45218a(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$OPwjRtbq7ooI0F2EamMZoWWZOc */

            public final void onClick(View view) {
                C7846e.this.m31451e((C7846e) view);
            }
        });
        DialogC0259b b2 = this.f21174G.mo45224b();
        this.f21169B = b2;
        b2.setOnShowListener(new DialogInterface.OnShowListener() {
            /* class com.bytedance.ee.bear.imageviewer.$$Lambda$e$WLJu6MxHnKE5goWMMyyGBbH3W2M */

            public final void onShow(DialogInterface dialogInterface) {
                C7846e.this.m31418a((C7846e) dialogInterface);
            }
        });
        this.f21169B.show();
    }

    /* renamed from: b */
    private void m31438b(ImageData imageData) {
        int i;
        ImageData.Image image = imageData.getImage();
        if (image == null || this.f21186d >= this.f21185c.size() || (i = this.f21186d) < 0 || this.f21185c.get(i) == null) {
            C13479a.m54764b("ImageViewer", "swipeImage(): break image = " + image);
            return;
        }
        String uuid = image.getUuid();
        if (TextUtils.isEmpty(uuid)) {
            C13479a.m54764b("ImageViewer", "updateImageData(): new image uuid is empty");
        } else if (uuid.equals(this.f21185c.get(this.f21186d).getUuid())) {
            C13479a.m54764b("ImageViewer", "updateImageData(): new image is current image");
        } else {
            for (int i2 = 0; i2 < this.f21199r.getImageList().size(); i2++) {
                if (TextUtils.equals(uuid, this.f21199r.getImageList().get(i2).getUuid())) {
                    this.f21186d = i2;
                }
            }
            m31478z();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31422a(ConnectionService.NetworkState networkState) {
        if (networkState != null) {
            m31403G();
        }
    }

    /* renamed from: a */
    private void m31423a(AbstractC5181a.AbstractC5182a aVar) {
        String c = mo20680c();
        AbstractC5181a aVar2 = this.f21189g;
        if (aVar2 != null) {
            aVar2.mo20686a(c, this.f21186d, aVar);
        }
    }

    /* renamed from: a */
    private void m31420a(Drawable drawable, LargeImageView largeImageView) {
        this.f21197p.setEnabled(false);
        largeImageView.mo30686a();
        AbstractC5187b bVar = this.f21188f;
        if (bVar != null) {
            bVar.mo20756b(mo20680c(), this.f21186d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31434b(DialogInterface dialogInterface, int i) {
        ImageData imageData = this.f21199r;
        if (imageData == null || imageData.getImageList() == null || this.f21199r.getImageList().size() == 0) {
            m31475w();
        } else {
            m31476x();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31419a(DialogInterface dialogInterface, int i) {
        AbstractC5184b bVar = this.f21190h;
        if (bVar != null) {
            bVar.mo20702i();
        }
        ImageData.Image findImageByPosition = this.f21199r.findImageByPosition(this.f21186d);
        if (findImageByPosition != null) {
            AbstractC5186a aVar = this.f21207z;
            if (aVar != null) {
                aVar.onConfirmDelete(findImageByPosition.getUuid());
                return;
            }
            return;
        }
        C13479a.m54758a("ImageViewer", "current image is null");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31439b(String str, String str2) {
        m31426a(str2, new AbstractC7853a() {
            /* class com.bytedance.ee.bear.imageviewer.C7846e.C78504 */

            @Override // com.bytedance.ee.bear.imageviewer.C7846e.AbstractC7853a
            /* renamed from: a */
            public void mo30672a(Uri uri) {
                ((AbstractC4283a) KoinJavaComponent.m268610a(AbstractC4283a.class)).mo16873a();
                if (uri != null) {
                    C13671b.m55476e(C7846e.this.mo30665f(), uri);
                }
            }

            @Override // com.bytedance.ee.bear.imageviewer.C7846e.AbstractC7853a
            /* renamed from: a */
            public void mo30673a(Throwable th) {
                Toast.showFailureText(C7846e.this.mo30665f(), C7846e.this.f21183a.getString(R.string.Doc_Facade_SaveFailed), 0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31441b(boolean z, View view) {
        if (z) {
            AbstractC5184b bVar = this.f21190h;
            if (bVar != null) {
                bVar.mo20698e();
            }
            AbstractC5189d dVar = this.f21205x;
            if (dVar != null) {
                dVar.mo20761b();
            }
            m31398B();
            return;
        }
        Toast.showText(mo30665f(), (int) R.string.CreationMobile_ECM_AdminDisableToast);
    }

    /* renamed from: a */
    private void m31424a(final LargeImageView largeImageView, final String str, final String str2, final boolean z) {
        ((C2124f) this.f21187e.mo10433l().mo10395a((Object) new C13664a(Uri.decode(str))).mo11129a(AbstractC2354j.f7813c)).mo10397a((AbstractC2522j) new AbstractC2513c<File>() {
            /* class com.bytedance.ee.bear.imageviewer.C7846e.C78493 */

            @Override // com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public void mo11036a(Drawable drawable) {
                C13479a.m54772d("ImageViewer", "onLoadCleared");
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: c */
            public void mo11172c(Drawable drawable) {
                C13479a.m54772d("ImageViewer", "onLoadStarted");
                super.mo11172c(drawable);
                C7846e.this.mo30669j();
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: b */
            public void mo10444b(Drawable drawable) {
                C13479a.m54758a("ImageViewer", "onLoadFailed， error:");
                C7846e.this.mo30663a(str, str2, largeImageView);
            }

            /* renamed from: a */
            public void mo30671a(File file, AbstractC2529b<? super File> bVar) {
                C7846e.this.mo30664a(z, str, str2, file, largeImageView);
            }

            @Override // com.bumptech.glide.request.p095a.AbstractC2522j
            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
                mo30671a((File) obj, (AbstractC2529b<? super File>) bVar);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31421a(C1177w wVar, final DownloadRequestInfo.DownloadType downloadType, final LargeImageView largeImageView, final String str, final String str2) {
        wVar.mo5923a(this.f21194m, new AbstractC1178x<C7854b>() {
            /* class com.bytedance.ee.bear.imageviewer.C7846e.C78482 */

            /* renamed from: a */
            public void onChanged(C7854b bVar) {
                if (bVar != null) {
                    int i = bVar.f21222a;
                    if (i == 1) {
                        C7846e.this.mo30669j();
                    } else if (i != 2) {
                        if (i == 3) {
                            C7846e.this.mo30662a(new File(bVar.f21223b), largeImageView);
                        }
                    } else if (downloadType == DownloadRequestInfo.DownloadType.IMG) {
                        C7846e.this.mo30661a(largeImageView, str, str2, DownloadRequestInfo.DownloadType.COVER);
                    } else {
                        C7846e.this.mo30663a(str, str2, largeImageView);
                    }
                }
            }
        });
    }
}
