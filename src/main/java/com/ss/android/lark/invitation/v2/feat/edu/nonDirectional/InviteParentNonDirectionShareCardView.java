package com.ss.android.lark.invitation.v2.feat.edu.nonDirectional;

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
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.bytedance.lark.pb.contact.v1.BizScenario;
import com.bytedance.lark.pb.contact.v1.EduCardOptions;
import com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest;
import com.bytedance.lark.pb.contact.v1.ImageOptions;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
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
import com.ss.android.lark.invitation.v2.feat.edu.bean.EduInvitation;
import com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.util.Map;

public class InviteParentNonDirectionShareCardView extends FrameLayout {

    /* renamed from: a */
    public String f102094a;

    /* renamed from: b */
    public EduCardOptions f102095b;

    /* renamed from: c */
    private CardView f102096c;

    /* renamed from: d */
    private RelativeLayout f102097d;

    /* renamed from: e */
    private TextView f102098e;

    /* renamed from: f */
    private TextView f102099f;

    /* renamed from: g */
    private ImageView f102100g;

    /* renamed from: h */
    private ImageView f102101h;

    /* renamed from: i */
    private View f102102i;

    /* renamed from: j */
    private TextView f102103j;

    /* renamed from: k */
    private TextView f102104k;

    /* renamed from: l */
    private View f102105l;

    /* renamed from: m */
    private LinearLayout f102106m;

    /* renamed from: n */
    private TextView f102107n;

    /* renamed from: o */
    private TextView f102108o;

    /* renamed from: p */
    private AbstractC40192a f102109p;

    /* renamed from: q */
    private EduInvitation f102110q;

    /* renamed from: com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView$a */
    public interface AbstractC40192a {
        /* renamed from: a */
        void mo145842a(String str);
    }

    public String getType() {
        return this.f102094a;
    }

    /* renamed from: a */
    public void mo145833a(String str, EduInvitation aVar) {
        this.f102110q = aVar;
        setType(str);
        m159305c();
        C53241h.m205898b("InvitationModule", "type: " + str);
        this.f102103j.setText(aVar.mo145783f());
        m159298a(aVar.mo145779b());
    }

    /* renamed from: a */
    public void mo145832a(String str, int i, int i2) {
        C40146y.m159159a(new Runnable(str, i, i2) {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$_yTWiZd6_nsHC_HbFMgrG11Wmgg */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                InviteParentNonDirectionShareCardView.lambda$_yTWiZd6_nsHC_HbFMgrG11Wmgg(InviteParentNonDirectionShareCardView.this, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m159311h() {
        this.f102096c.setEnabled(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m159312i() {
        this.f102096c.setEnabled(false);
    }

    /* renamed from: f */
    private void m159309f() {
        C40157a.m159179a(getContext(), this.f102110q, new OnShareCallback() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView.C401914 */

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public boolean intercept(ShareActionType shareActionType) {
                return false;
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onSuccess(ShareActionType shareActionType) {
                if (shareActionType == ShareActionType.COPY) {
                    ViewUtils.m224145a((int) R.string.Lark_Legacy_CopyReady);
                    return;
                }
                InvApmUtils.m158968a("ug_invite_parent_nondirectional_share", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "link"), Pair.create("item", shareActionType.name())));
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                if (OnShareCallback.NOT_INSTALLED.equals(shareError)) {
                    ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
                }
                InvApmUtils.m158961a("ug_invite_parent_nondirectional_share", C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "link"), Pair.create("item", shareActionType.name())), shareError.getCode(), shareError.getMsg());
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f102096c.animate().cancel();
    }

    /* renamed from: b */
    public void mo145834b() {
        C40107f.m159012a(this.f102110q.mo145783f());
        ViewUtils.m224145a((int) R.string.Lark_Legacy_CopyReady);
        InvApmUtils.m158971b("ug_invite_parent_nondirectional_copy");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m159310g() {
        m159308e();
        this.f102096c.animate().scaleX(1.0f).setDuration(150).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$E6uideMZ2bTEv0j_G1IVXhzk7kI */

            public final void run() {
                InviteParentNonDirectionShareCardView.lambda$E6uideMZ2bTEv0j_G1IVXhzk7kI(InviteParentNonDirectionShareCardView.this);
            }
        }).start();
    }

    /* renamed from: c */
    private void m159305c() {
        this.f102098e.setText(this.f102110q.mo145780c());
        this.f102099f.setText(this.f102110q.mo145782e().tenant_name);
        this.f102104k.setText(UIHelper.mustacheFormat((int) R.string.Lark_Education_ExpireDate, "eduExpiredTime", this.f102110q.mo145786i()));
        C40125p.m159094a(this.f102110q.mo145781d(), C40147z.m159160a().getLoginDependency().mo145582a(), this.f102100g);
    }

    /* renamed from: d */
    private void m159307d() {
        if ("qr_code".equals(this.f102094a)) {
            this.f102094a = "link";
        } else {
            this.f102094a = "qr_code";
        }
        this.f102096c.animate().scaleX(BitmapDescriptorFactory.HUE_RED).setInterpolator(new AccelerateInterpolator()).setDuration(150).withStartAction(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$cQ0CVkHREEbayWaTUEHua6NNsY */

            public final void run() {
                InviteParentNonDirectionShareCardView.m270641lambda$cQ0CVkHREEbayWaTUEHua6NNsY(InviteParentNonDirectionShareCardView.this);
            }
        }).withEndAction(new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$4d7J515KycFGkgtHKnNdUP9OKQk */

            public final void run() {
                InviteParentNonDirectionShareCardView.lambda$4d7J515KycFGkgtHKnNdUP9OKQk(InviteParentNonDirectionShareCardView.this);
            }
        }).start();
    }

    /* renamed from: e */
    private void m159308e() {
        if ("qr_code".equals(this.f102094a)) {
            this.f102101h.setVisibility(0);
            this.f102102i.setVisibility(0);
            this.f102103j.setVisibility(4);
            this.f102105l.setVisibility(4);
            this.f102108o.setText(UIHelper.getString(R.string.Lark_Contact_ShareQRCodeSaveImage_Button));
        } else if ("link".equals(this.f102094a)) {
            this.f102101h.setVisibility(4);
            this.f102102i.setVisibility(4);
            this.f102103j.setVisibility(0);
            this.f102105l.setVisibility(0);
            this.f102108o.setText(UIHelper.getString(R.string.Lark_Legacy_Copy));
        }
        AbstractC40192a aVar = this.f102109p;
        if (aVar != null) {
            aVar.mo145842a(this.f102094a);
        }
    }

    /* renamed from: a */
    public void mo145830a() {
        Activity a = ViewUtils.m224141a(getContext());
        if (a == null) {
            C53241h.m205894a("InvitationModule", "activity is null");
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
            return;
        }
        C57805b.m224333d(a, new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$xC3UsnAXZTfY_XuHfjYb0wNh0AE */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                InviteParentNonDirectionShareCardView.lambda$xC3UsnAXZTfY_XuHfjYb0wNh0AE(InviteParentNonDirectionShareCardView.this, z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159301b(View view) {
        m159307d();
    }

    public void setEduCardOptions(EduCardOptions eduCardOptions) {
        this.f102095b = eduCardOptions;
    }

    public void setOnModeChangedListener(AbstractC40192a aVar) {
        this.f102109p = aVar;
    }

    public InviteParentNonDirectionShareCardView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m159306c(Bitmap bitmap) {
        this.f102101h.setImageBitmap(bitmap);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159303b(String str) {
        mo145832a(str, this.f102101h.getWidth(), this.f102101h.getHeight());
    }

    /* renamed from: a */
    private void m159296a(final ApiUtils.AbstractC57748a<Bitmap> aVar) {
        C57768af.m224220b(getContext(), new C57768af.AbstractRunnableC57773c<Bitmap>() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView.C401892 */

            /* renamed from: a */
            public Bitmap mo130916b() {
                InvApmUtils.m158958a("ug_invite_parent_nondirectional_get_save_or_share_qrcode");
                InvApmUtils.m158958a("ug_invite_parent_nondir_get_save_or_share_qr");
                C57768af.C57772b bVar = new C57768af.C57772b();
                GetDynamicMediaRequest.C16236a aVar = new GetDynamicMediaRequest.C16236a();
                aVar.mo58176a(BizScenario.EduCard);
                aVar.mo58178a(new ImageOptions.C16314a().mo58348a(ImageOptions.ResolutionType.HighDefinition).build());
                aVar.mo58177a(InviteParentNonDirectionShareCardView.this.f102095b);
                C40111j.m159030a(aVar, new ApiUtils.AbstractC57748a() {
                    /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$2$mOf90d4Ra2mdRmfmgGddLZrw46w */

                    @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                    public final void consume(Object obj) {
                        InviteParentNonDirectionShareCardView.C401892.lambda$mOf90d4Ra2mdRmfmgGddLZrw46w(C57768af.C57772b.this, (SdkSender.C53233d) obj);
                    }
                });
                return (Bitmap) bVar.mo196071a();
            }

            /* renamed from: a */
            public void mo130914a(Bitmap bitmap) {
                aVar.consume(bitmap);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m159318a(C57768af.C57772b bVar, SdkSender.C53233d dVar) {
                if (dVar.f131573b != null) {
                    InvApmUtils.m158959a("ug_invite_parent_nondirectional_get_save_or_share_qrcode", dVar.f131573b);
                    InvApmUtils.m158959a("ug_invite_parent_nondir_get_save_or_share_qr", dVar.f131573b);
                } else {
                    InvApmUtils.m158967a("ug_invite_parent_nondirectional_get_save_or_share_qrcode", true);
                    InvApmUtils.m158967a("ug_invite_parent_nondir_get_save_or_share_qr", true);
                }
                bVar.mo196072a(dVar.f131572a);
            }
        }.mo196073a(5000, new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$2hBKMLi44NwUfmXSfH6bVXXvzYU */

            public final void run() {
                InviteParentNonDirectionShareCardView.lambda$2hBKMLi44NwUfmXSfH6bVXXvzYU(ApiUtils.AbstractC57748a.this);
            }
        }));
    }

    private void setType(String str) {
        if (str == null || !str.equals(this.f102094a)) {
            this.f102094a = str;
            m159308e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159295a(View view) {
        if ("qr_code".equals(this.f102094a)) {
            m159296a(new ApiUtils.AbstractC57748a() {
                /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$vWm4iFQamnCTE4pjgxxn5TBdU */

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    InviteParentNonDirectionShareCardView.this.mo145831a((Bitmap) obj);
                }
            });
            InvHitPoint.m160351a(1, 2);
            return;
        }
        m159309f();
        InvHitPoint.m160370c(3);
        InvHitPoint.m160351a(2, 2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m159300b(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        } else {
            C40146y.m159159a(new Runnable(bitmap, C57881t.m224651w(aj.m224263a())) {
                /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$m0uEhZKi8YEPiMcVcfScQS_hr0 */
                public final /* synthetic */ Bitmap f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    InviteParentNonDirectionShareCardView.m270642lambda$m0uEhZKi8YEPiMcVcfScQS_hr0(this.f$0, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m159297a(File file) {
        if (file == null) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
            return;
        }
        ViewUtils.m224145a((int) R.string.Lark_Legacy_QrCodeSaveAlbum);
        C26311p.m95268a(aj.m224263a(), file.getAbsolutePath());
    }

    /* renamed from: a */
    private void m159298a(String str) {
        this.f102101h.post(new Runnable(str) {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$d01vCOnfl5fwL2tYA1j0yqJ59WU */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                InviteParentNonDirectionShareCardView.lambda$d01vCOnfl5fwL2tYA1j0yqJ59WU(InviteParentNonDirectionShareCardView.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    private void m159293a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.inv_invite_parent_nondirection_share_card_view, (ViewGroup) this, true);
        this.f102096c = (CardView) findViewById(R.id.scvCv);
        this.f102097d = (RelativeLayout) findViewById(R.id.scvShowInfoRl);
        this.f102102i = findViewById(R.id.scvShowInfoToggleLinkView);
        this.f102105l = findViewById(R.id.scvShowInfoToggleQrView);
        this.f102098e = (TextView) findViewById(R.id.scvShowInfoNameTv);
        this.f102099f = (TextView) findViewById(R.id.scvShowInfoTenantTv);
        this.f102100g = (ImageView) findViewById(R.id.scvShowInfoAvatarCiv);
        this.f102101h = (ImageView) findViewById(R.id.scvShowInfoInviteLinkQrIv);
        this.f102103j = (TextView) findViewById(R.id.scvShowInfoInviteLinkTextTv);
        this.f102104k = (TextView) findViewById(R.id.scvShowExpiredTimeTv);
        this.f102106m = (LinearLayout) findViewById(R.id.scvShowBottomOperateLl);
        this.f102107n = (TextView) findViewById(R.id.scvShowShareTv);
        this.f102108o = (TextView) findViewById(R.id.scvShowSaveOrCopyLinkTv);
        $$Lambda$InviteParentNonDirectionShareCardView$Ia7ftpN4AClgNWiYJ4e64VP2z8 r7 = new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$Ia7ftpN4AClgNWiYJ4e64VP2z8 */

            public final void onClick(View view) {
                InviteParentNonDirectionShareCardView.m270640lambda$Ia7ftpN4AClgNWiYJ4e64VP2z8(InviteParentNonDirectionShareCardView.this, view);
            }
        };
        this.f102102i.setOnClickListener(r7);
        this.f102105l.setOnClickListener(r7);
        this.f102107n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$BCfKdf5gUQYbe7DwzuPw5ItlxMA */

            public final void onClick(View view) {
                InviteParentNonDirectionShareCardView.lambda$BCfKdf5gUQYbe7DwzuPw5ItlxMA(InviteParentNonDirectionShareCardView.this, view);
            }
        });
        C40103e.m159005a(this.f102108o, new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView.View$OnClickListenerC401881 */

            public void onClick(View view) {
                if ("qr_code".equals(InviteParentNonDirectionShareCardView.this.f102094a)) {
                    InviteParentNonDirectionShareCardView.this.mo145830a();
                    InvHitPoint.m160351a(1, 1);
                } else if ("link".equals(InviteParentNonDirectionShareCardView.this.f102094a)) {
                    InviteParentNonDirectionShareCardView.this.mo145834b();
                    InvHitPoint.m160351a(2, 1);
                }
            }
        });
        if (DesktopUtil.m144307b()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f));
            layoutParams.setMargins(UIHelper.dp2px(24.0f), UIHelper.dp2px(34.0f), 0, 0);
            this.f102100g.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f102098e.getLayoutParams();
            layoutParams2.setMargins(UIHelper.dp2px(16.0f), UIHelper.dp2px(32.0f), UIHelper.dp2px(24.0f), 0);
            this.f102098e.setLayoutParams(layoutParams2);
            this.f102098e.setTextSize(18.0f);
            this.f102099f.setTextSize(12.0f);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f102101h.getLayoutParams();
            layoutParams3.width = UIHelper.dp2px(132.0f);
            layoutParams3.height = UIHelper.dp2px(132.0f);
            this.f102101h.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f102102i.getLayoutParams();
            layoutParams4.height = UIHelper.dp2px(48.0f);
            layoutParams4.width = UIHelper.dp2px(48.0f);
            this.f102102i.setLayoutParams(layoutParams4);
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) this.f102105l.getLayoutParams();
            layoutParams5.height = UIHelper.dp2px(48.0f);
            layoutParams5.width = UIHelper.dp2px(48.0f);
            this.f102105l.setLayoutParams(layoutParams5);
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f102106m.getLayoutParams();
            layoutParams6.height = UIHelper.dp2px(48.0f);
            layoutParams6.addRule(3, R.id.scvShowExpiredTimeLl);
            this.f102106m.setLayoutParams(layoutParams6);
            LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) this.f102108o.getLayoutParams();
            layoutParams7.height = UIHelper.dp2px(32.0f);
            layoutParams7.weight = 1.0f;
            this.f102108o.setLayoutParams(layoutParams7);
            this.f102108o.setTextSize(14.0f);
            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) this.f102107n.getLayoutParams();
            layoutParams8.height = UIHelper.dp2px(32.0f);
            layoutParams8.weight = 1.0f;
            this.f102107n.setLayoutParams(layoutParams8);
            this.f102107n.setTextSize(14.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159299a(boolean z) {
        if (z) {
            m159296a(new ApiUtils.AbstractC57748a() {
                /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$ZkqLkkA1URRlHgXS4_wWSmNo0H4 */

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    InviteParentNonDirectionShareCardView.lambda$ZkqLkkA1URRlHgXS4_wWSmNo0H4(InviteParentNonDirectionShareCardView.this, (Bitmap) obj);
                }
            });
        } else {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        }
        InvApmUtils.m158967a("ug_invite_parent_nondirectional_save_qrcode_permisson", z);
        InvApmUtils.m158967a("ug_invite_parent_nondir_save_qr_permisson", z);
    }

    /* renamed from: a */
    public void mo145831a(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_ShareFailed);
        } else {
            C40157a.m159189d(getContext(), bitmap, new OnShareCallback() {
                /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.InviteParentNonDirectionShareCardView.C401903 */

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public void onSuccess(ShareActionType shareActionType) {
                    if (shareActionType.equals(ShareActionType.SAVE)) {
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_QrCodeSaveAlbum);
                        return;
                    }
                    InvApmUtils.m158968a("ug_invite_parent_nondirectional_share", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "qrcode"), Pair.create("item", shareActionType.name())));
                }

                @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                    if (shareError.equals(NOT_INSTALLED)) {
                        ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
                    } else if (shareError.equals(SAVE_FAILED)) {
                        ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
                    }
                    InvApmUtils.m158961a("ug_invite_parent_nondirectional_share", C40108g.m159014a(Pair.create(ShareHitPoint.f121869d, "qrcode"), Pair.create("item", shareActionType.name())), shareError.getCode(), shareError.getMsg());
                }
            });
        }
    }

    public InviteParentNonDirectionShareCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m159293a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m159294a(Bitmap bitmap, String str) {
        ViewUtils.m224148a(new Runnable(C40102d.m159003a(bitmap, str)) {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$HyqANfcmshsk_7BR8mfr1BgQwLg */
            public final /* synthetic */ File f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                InviteParentNonDirectionShareCardView.lambda$HyqANfcmshsk_7BR8mfr1BgQwLg(this.f$0);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m159304b(String str, int i, int i2) {
        Bitmap encodeQRCode = C40147z.m159160a().encodeQRCode(str, i, i2, 0);
        if (encodeQRCode == null || encodeQRCode.isRecycled()) {
            C53241h.m205894a("InvitationModule", "encodeQRCode failed.");
            InvApmUtils.m158967a("ug_invite_parent_nondirectional_load_qrcode", false);
            return;
        }
        InvApmUtils.m158967a("ug_invite_parent_nondirectional_load_qrcode", true);
        ViewUtils.m224148a(new Runnable(encodeQRCode) {
            /* class com.ss.android.lark.invitation.v2.feat.edu.nonDirectional.$$Lambda$InviteParentNonDirectionShareCardView$6r8U7xtbGmQtDCsePj7NAhTrDiw */
            public final /* synthetic */ Bitmap f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                InviteParentNonDirectionShareCardView.lambda$6r8U7xtbGmQtDCsePj7NAhTrDiw(InviteParentNonDirectionShareCardView.this, this.f$1);
            }
        });
    }
}
