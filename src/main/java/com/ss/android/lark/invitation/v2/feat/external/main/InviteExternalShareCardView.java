package com.ss.android.lark.invitation.v2.feat.external.main;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lark.pb.contact.v1.BizScenario;
import com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest;
import com.bytedance.lark.pb.contact.v1.ImageOptions;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.util.C40102d;
import com.ss.android.lark.inv.export.util.C40103e;
import com.ss.android.lark.inv.export.util.C40107f;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40111j;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40146y;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.invitation.v2.feat.external.bean.C40219a;
import com.ss.android.lark.invitation.v2.feat.external.bean.InvitationInfo;
import com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView;
import com.ss.android.lark.invitation.v2.feat.member.debug.InviteDebugActivity;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.util.Map;

public class InviteExternalShareCardView extends FrameLayout {

    /* renamed from: a */
    public ImageView f102306a;

    /* renamed from: b */
    public String f102307b;

    /* renamed from: c */
    public InvitationInfo f102308c;

    /* renamed from: d */
    public String f102309d;

    /* renamed from: e */
    private ConstraintLayout f102310e;

    /* renamed from: f */
    private ConstraintLayout f102311f;

    /* renamed from: g */
    private ViewGroup f102312g;

    /* renamed from: h */
    private TextView f102313h;

    /* renamed from: i */
    private TextView f102314i;

    /* renamed from: j */
    private ImageView f102315j;

    /* renamed from: k */
    private View f102316k;

    /* renamed from: l */
    private TextView f102317l;

    /* renamed from: m */
    private TextView f102318m;

    /* renamed from: n */
    private LinearLayout f102319n;

    /* renamed from: o */
    private TextView f102320o;

    /* renamed from: p */
    private TextView f102321p;

    /* renamed from: q */
    private AbstractC40266b f102322q;

    /* renamed from: r */
    private C40219a f102323r;

    /* renamed from: s */
    private AbstractC40267c f102324s;

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView$b */
    public interface AbstractC40266b {
        /* renamed from: a */
        void mo146068a(String str);
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView$c */
    public interface AbstractC40267c {
    }

    public String getType() {
        return this.f102307b;
    }

    /* renamed from: a */
    public void mo146053a(String str, C40219a aVar) {
        this.f102323r = aVar;
        mo146052a(str, aVar.mo145909a(str));
    }

    /* renamed from: a */
    public void mo146052a(String str, InvitationInfo invitationInfo) {
        this.f102308c = invitationInfo;
        setType(str);
        m159579d();
        C53241h.m205898b("InvitationModule", "type: " + str);
        C40147z.m159161a("linkUrl", this.f102308c.invUrl);
        C40147z.m159161a("qrUrl", this.f102308c.qrUrl);
        this.f102317l.setText(this.f102308c.getInviteMsg());
        m159572a(this.f102308c.qrUrl);
    }

    /* renamed from: a */
    public void mo146051a(String str, int i, int i2) {
        C40146y.m159159a(new Runnable(str, i, i2) {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$YS2n3iruvfi4VKtlTAdgD7tMXNU */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                InviteExternalShareCardView.lambda$YS2n3iruvfi4VKtlTAdgD7tMXNU(InviteExternalShareCardView.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* renamed from: a */
    public void mo146050a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_ShareFailed);
        } else {
            C40157a.m159177a(getContext(), bitmap, new OnShareCallback() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView.C402634 */

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public boolean intercept(ShareActionType shareActionType) {
                    return false;
                }

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public void onSuccess(ShareActionType shareActionType) {
                    InvHitPoint.m160353a(shareActionType, InviteExternalShareCardView.this.f102309d);
                    InvHitPoint.m160357a("qr_code", "share_qr_code", shareActionType, InviteExternalShareCardView.this.f102308c.uniqueId);
                    InvApmUtils.m158968a("ug_invite_external_nondirectional_share", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "qrcode"), Pair.create("item", shareActionType.name())));
                }

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                    if (shareError.equals(NOT_INSTALLED)) {
                        ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
                    } else if (shareError.equals(SAVE_FAILED)) {
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
                    }
                    InvApmUtils.m158961a("ug_invite_external_nondirectional_share", C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "qrcode"), Pair.create("item", shareActionType.name())), shareError.getCode(), shareError.getMsg());
                }
            });
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m159583h() {
        this.f102310e.setEnabled(true);
    }

    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m159584i() {
        this.f102310e.setEnabled(false);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f102310e.animate().cancel();
    }

    /* renamed from: f */
    private void m159581f() {
        C40157a.m159183a(getContext(), this.f102308c.getShareTitle(), this.f102308c.getInviteMsg(), this.f102308c.invUrl, new OnShareCallback() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView.C402645 */

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public boolean intercept(ShareActionType shareActionType) {
                return false;
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onSuccess(ShareActionType shareActionType) {
                if (shareActionType == ShareActionType.COPY) {
                    InviteExternalShareCardView.this.mo146054b();
                    return;
                }
                InvHitPoint.m160364b(shareActionType, InviteExternalShareCardView.this.f102309d);
                InvHitPoint.m160357a("link", "share_link", shareActionType, InviteExternalShareCardView.this.f102308c.uniqueId);
                InvApmUtils.m158968a("ug_invite_external_nondirectional_share", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "link"), Pair.create("item", shareActionType.name())));
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                if (OnShareCallback.NOT_INSTALLED.equals(shareError)) {
                    ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
                }
                InvApmUtils.m158961a("ug_invite_external_nondirectional_share", C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "link"), Pair.create("item", shareActionType.name())), shareError.getCode(), shareError.getMsg());
            }
        });
    }

    /* renamed from: d */
    private void m159579d() {
        this.f102313h.setText(this.f102308c.userName);
        this.f102314i.setText(this.f102308c.teamName);
        C40125p.m159094a(this.f102308c.userAvatarKey, C40147z.m159160a().getLoginDependency().mo145582a(), this.f102315j);
    }

    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m159582g() {
        m159580e();
        this.f102310e.animate().scaleX(1.0f).setDuration(150).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$8a_c6C4P0Jo2boJrUU7cszOqi0 */

            public final void run() {
                InviteExternalShareCardView.m270645lambda$8a_c6C4P0Jo2boJrUU7cszOqi0(InviteExternalShareCardView.this);
            }
        }).start();
    }

    /* renamed from: e */
    private void m159580e() {
        if ("qr_code".equals(this.f102307b)) {
            m159566a(0.5f);
            this.f102316k.setVisibility(0);
            this.f102317l.setVisibility(8);
            this.f102321p.setText(UIHelper.getString(R.string.Lark_Contact_ShareQRCodeSaveImage_Button));
            this.f102318m.setVisibility(0);
            this.f102318m.setText(UIHelper.mustacheFormat((int) R.string.Lark_Profile_AddExternalContactQRCode_Desc));
            InvHitPoint.m160335N(this.f102309d);
        } else if ("link".equals(this.f102307b)) {
            m159566a(BitmapDescriptorFactory.HUE_RED);
            this.f102316k.setVisibility(8);
            this.f102317l.setVisibility(0);
            this.f102321p.setText(UIHelper.getString(R.string.Lark_Legacy_Copy));
            this.f102318m.setVisibility(8);
            InvHitPoint.m160336O(this.f102309d);
        }
        AbstractC40266b bVar = this.f102322q;
        if (bVar != null) {
            bVar.mo146068a(this.f102307b);
        }
    }

    /* renamed from: c */
    public void mo146055c() {
        if ("qr_code".equals(this.f102307b)) {
            this.f102307b = "link";
        } else if ("link".equals(this.f102307b)) {
            this.f102307b = "qr_code";
        } else {
            return;
        }
        C40219a aVar = this.f102323r;
        if (aVar != null) {
            this.f102308c = aVar.mo145909a(this.f102307b);
        }
        this.f102310e.animate().scaleX(BitmapDescriptorFactory.HUE_RED).setInterpolator(new AccelerateInterpolator()).setDuration(150).withStartAction(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$hA9iIYt_jdZ6XPIoDstwlkkh6gY */

            public final void run() {
                InviteExternalShareCardView.lambda$hA9iIYt_jdZ6XPIoDstwlkkh6gY(InviteExternalShareCardView.this);
            }
        }).withEndAction(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$1udaMGn2b1nzjJKEmZixWzl0Wg0 */

            public final void run() {
                InviteExternalShareCardView.lambda$1udaMGn2b1nzjJKEmZixWzl0Wg0(InviteExternalShareCardView.this);
            }
        }).start();
    }

    /* renamed from: b */
    public void mo146054b() {
        C40107f.m159012a(this.f102308c.getInviteMsg());
        ViewUtils.m224145a((int) R.string.Lark_Legacy_CopyReady);
        InvHitPoint.m160341T(this.f102309d);
        InvHitPoint.m160358a("link", "copy_link", this.f102308c.uniqueId);
        InvApmUtils.m158971b("ug_invite_external_nondirectional_copy");
    }

    /* renamed from: a */
    public void mo146049a() {
        Activity a = ViewUtils.m224141a(getContext());
        if (a == null) {
            C53241h.m205894a("InvitationModule", "activity is null");
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
            return;
        }
        C57805b.m224333d(a, new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$df_PoDWOfKYYfaQSmQIoPm3P_HQ */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                InviteExternalShareCardView.lambda$df_PoDWOfKYYfaQSmQIoPm3P_HQ(InviteExternalShareCardView.this, z);
            }
        });
    }

    public void setFrom(String str) {
        this.f102309d = str;
    }

    public void setOnModeChangedListener(AbstractC40266b bVar) {
        this.f102322q = bVar;
    }

    public void setOnSettingClickListener(AbstractC40267c cVar) {
        this.f102324s = cVar;
    }

    /* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView$a */
    public static class C40265a extends C40111j.C40114a {

        /* renamed from: a */
        private ImageView f102329a;

        public C40265a(ImageView imageView) {
            this.f102329a = imageView;
        }

        @Override // com.ss.android.lark.inv.export.util.C40111j.C40114a
        /* renamed from: g */
        public Bitmap mo145686g(int i, int i2) {
            Bitmap a = C40102d.m159001a(this.f102329a);
            if (a == null || a.isRecycled()) {
                return null;
            }
            return Bitmap.createScaledBitmap(a, i, i2, true);
        }
    }

    public InviteExternalShareCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m159578c(Bitmap bitmap) {
        this.f102306a.setImageBitmap(bitmap);
    }

    /* renamed from: a */
    private void m159566a(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f102312g.getLayoutParams();
        layoutParams.f2834z = f;
        this.f102312g.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m159576b(String str) {
        mo146051a(str, this.f102306a.getWidth(), this.f102306a.getHeight());
    }

    public void setShowSaveOrCopyLinkTextView(TextView textView) {
        this.f102321p = textView;
        C40103e.m159005a(textView, new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView.View$OnClickListenerC402612 */

            public void onClick(View view) {
                if ("qr_code".equals(InviteExternalShareCardView.this.f102307b)) {
                    InviteExternalShareCardView.this.mo146049a();
                } else if ("link".equals(InviteExternalShareCardView.this.f102307b)) {
                    InviteExternalShareCardView.this.mo146054b();
                }
            }
        });
    }

    public void setShowShareTextView(TextView textView) {
        this.f102320o = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$3vsnVPGpcQKT2WoKJZcGhbElkOc */

            public final void onClick(View view) {
                InviteExternalShareCardView.lambda$3vsnVPGpcQKT2WoKJZcGhbElkOc(InviteExternalShareCardView.this, view);
            }
        });
    }

    private void setType(String str) {
        if (str == null || !str.equals(this.f102307b)) {
            this.f102307b = str;
            m159580e();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m159569a(View view) {
        if ("qr_code".equals(this.f102307b)) {
            m159570a(new ApiUtils.AbstractC57748a() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$GuzQMTp2ZM3kAMYENaU1S8sTT8 */

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    InviteExternalShareCardView.this.mo146050a((Bitmap) obj);
                }
            });
        } else if ("link".equals(this.f102307b)) {
            m159581f();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m159574b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        } else {
            C40146y.m159159a(new Runnable(bitmap, C57881t.m224651w(aj.m224263a())) {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$KU381bm5pxzTMYWjg1ilI7frU */
                public final /* synthetic */ Bitmap f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    InviteExternalShareCardView.m270644lambda$KU381bm5pxzTMYWjg1ilI7frU(this.f$0, this.f$1);
                }
            });
        }
    }

    /* renamed from: a */
    private void m159570a(final ApiUtils.AbstractC57748a<Bitmap> aVar) {
        C57768af.m224220b(getContext(), new C57768af.AbstractRunnableC57773c<Bitmap>() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView.C402623 */

            /* renamed from: a */
            public Bitmap mo130916b() {
                InvApmUtils.m158958a("ug_invite_external_nondirectional_get_save_or_share_qrcode");
                InvApmUtils.m158958a("ug_invite_external_nondir_get_save_or_share_qr");
                C57768af.C57772b bVar = new C57768af.C57772b();
                GetDynamicMediaRequest.C16236a aVar = new GetDynamicMediaRequest.C16236a();
                aVar.mo58176a(BizScenario.ContactCard);
                aVar.mo58178a(new ImageOptions.C16314a().mo58348a(ImageOptions.ResolutionType.HighDefinition).build());
                C40111j.m159029a(aVar, new C40265a(InviteExternalShareCardView.this.f102306a), new ApiUtils.AbstractC57748a() {
                    /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$3$0uYBqJRzT_EdWJw0l41CHpWw6uU */

                    @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                    public final void consume(Object obj) {
                        InviteExternalShareCardView.C402623.lambda$0uYBqJRzT_EdWJw0l41CHpWw6uU(C57768af.C57772b.this, (SdkSender.C53233d) obj);
                    }
                });
                return (Bitmap) bVar.mo196071a();
            }

            /* renamed from: a */
            public void mo130914a(Bitmap bitmap) {
                aVar.consume(bitmap);
            }

            /* renamed from: a */
            public static /* synthetic */ void m159594a(C57768af.C57772b bVar, SdkSender.C53233d dVar) {
                if (dVar.f131573b != null) {
                    InvApmUtils.m158959a("ug_invite_external_nondirectional_get_save_or_share_qrcode", dVar.f131573b);
                    InvApmUtils.m158959a("ug_invite_external_nondir_get_save_or_share_qr", dVar.f131573b);
                } else {
                    InvApmUtils.m158967a("ug_invite_external_nondirectional_get_save_or_share_qrcode", true);
                    InvApmUtils.m158967a("ug_invite_external_nondir_get_save_or_share_qr", true);
                }
                bVar.mo196072a(dVar.f131572a);
            }
        }.mo196073a(5000, new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$uRnfS7INKWE3Ohj5FhcjtbzdBP4 */

            public final void run() {
                InviteExternalShareCardView.lambda$uRnfS7INKWE3Ohj5FhcjtbzdBP4(ApiUtils.AbstractC57748a.this);
            }
        }));
    }

    /* renamed from: a */
    private void m159567a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.inv_share_card_view, (ViewGroup) this, true);
        this.f102310e = (ConstraintLayout) findViewById(R.id.scvCv);
        this.f102311f = (ConstraintLayout) findViewById(R.id.scvShowInfoRl);
        this.f102312g = (ViewGroup) findViewById(R.id.rl_title);
        this.f102313h = (TextView) findViewById(R.id.scvShowInfoNameTv);
        this.f102314i = (TextView) findViewById(R.id.scvShowInfoTenantTv);
        this.f102315j = (ImageView) findViewById(R.id.scvShowInfoAvatarCiv);
        this.f102306a = (ImageView) findViewById(R.id.scvShowInfoInviteLinkQrIv);
        this.f102316k = findViewById(R.id.scvShowInfoInviteLinkQrIvParent);
        this.f102317l = (TextView) findViewById(R.id.scvShowInfoInviteLinkTextTv);
        this.f102318m = (TextView) findViewById(R.id.scvShowTipTv);
        this.f102319n = (LinearLayout) findViewById(R.id.scvShowBottomOperateLl);
        if (C40147z.m159164d()) {
            setOnClickListener(new C57832h.AbstractView$OnClickListenerC57837c(5) {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.InviteExternalShareCardView.C402601 */

                @Override // com.ss.android.lark.utils.C57832h.AbstractView$OnClickListenerC57837c
                /* renamed from: a */
                public void mo146064a(View view, int i) {
                }

                @Override // com.ss.android.lark.utils.C57832h.AbstractView$OnClickListenerC57837c
                /* renamed from: a */
                public void mo146063a(View view) {
                    InviteDebugActivity.m159937a(InviteExternalShareCardView.this.getContext());
                }
            });
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m159571a(File file) {
        if (file == null) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
            return;
        }
        ViewUtils.m224145a((int) R.string.Lark_Legacy_QrCodeSaveAlbum);
        C26311p.m95268a(aj.m224263a(), file.getAbsolutePath());
    }

    /* renamed from: a */
    private void m159572a(String str) {
        this.f102306a.post(new Runnable(str) {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$nT0dek_dkWa7774vRX60Rt_QNjs */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                InviteExternalShareCardView.lambda$nT0dek_dkWa7774vRX60Rt_QNjs(InviteExternalShareCardView.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m159573a(boolean z) {
        if (z) {
            m159570a(new ApiUtils.AbstractC57748a() {
                /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$E1wuvSuDaXCXK3EInB40K_1cuR0 */

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    InviteExternalShareCardView.lambda$E1wuvSuDaXCXK3EInB40K_1cuR0(InviteExternalShareCardView.this, (Bitmap) obj);
                }
            });
            InvHitPoint.m160340S(this.f102309d);
            InvHitPoint.m160358a("qr_code", "save_qr_code", this.f102308c.uniqueId);
        } else {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        }
        InvApmUtils.m158967a("ug_invite_external_nondirectional_save_qrcode_permisson", z);
        InvApmUtils.m158967a("ug_invite_external_nondir_save_qr_permisson", z);
    }

    public InviteExternalShareCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m159567a(context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m159568a(Bitmap bitmap, String str) {
        ViewUtils.m224148a(new Runnable(C40102d.m159003a(bitmap, str)) {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$SnJvGDKXDLTAqfZhB68mSKufufw */
            public final /* synthetic */ File f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                InviteExternalShareCardView.lambda$SnJvGDKXDLTAqfZhB68mSKufufw(this.f$0);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m159577b(String str, int i, int i2) {
        Bitmap encodeQRCode = C40147z.m159160a().encodeQRCode(str, i, i2, 0);
        if (encodeQRCode == null || encodeQRCode.isRecycled()) {
            C53241h.m205894a("InvitationModule", "encodeQRCode failed.");
            InvApmUtils.m158967a("ug_invite_external_nondirectional_load_qrcode", false);
            return;
        }
        InvApmUtils.m158967a("ug_invite_external_nondirectional_load_qrcode", true);
        ViewUtils.m224148a(new Runnable(encodeQRCode) {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$InviteExternalShareCardView$hEp4l11zIgybo44F5d96Eq9M22Q */
            public final /* synthetic */ Bitmap f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                InviteExternalShareCardView.lambda$hEp4l11zIgybo44F5d96Eq9M22Q(InviteExternalShareCardView.this, this.f$1);
            }
        });
    }
}
