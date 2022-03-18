package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.net.C5203d;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.ChoosePolicyUtil;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPublicPermissionManager;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManagerDispatcher;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10154a;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.n */
public class C10071n {
    /* renamed from: a */
    private static boolean m41914a(int i, boolean z, boolean z2, boolean z3) {
        C13479a.m54764b("LinkShareUtils", "type:" + i + ", adminCanCross:" + z + ", externalAccess:" + z2 + ", isLinkShareAnyone:" + z3);
        if (!z || !z2 || i == C8275a.f22380m.mo32555b()) {
            return true;
        }
        return z3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41912a(AbstractC10154a aVar, String str, int i, String str2, boolean z, DialogInterface dialogInterface, int i2) {
        aVar.mo38590a();
        PermissionAnalyticV2.m39692m(str, i, str2, z);
    }

    /* renamed from: a */
    private static void m41913a(String str, int i, Dialog dialog) {
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(str, String.valueOf(i), dialog);
    }

    /* renamed from: a */
    public static void m41907a(Context context, Throwable th) {
        C13479a.m54761a("LinkShareUtils", th);
        if (C5203d.m21235a(th, 10029)) {
            Toast.showFailureText(context, (int) R.string.CreationMobile_ECM_ExternalShare_Enable_toast0);
        } else if (C5203d.m21235a(th, 10040)) {
            Toast.showFailureText(context, (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
        } else {
            Toast.showFailureText(context, (int) R.string.Doc_Facade_SetFailed);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41910a(AbstractC10154a aVar, Context context, Throwable th) throws Exception {
        aVar.mo38590a();
        m41907a(context, th);
    }

    /* renamed from: a */
    private static String m41901a(Context context, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        if (i == C8275a.f22370c.mo32555b()) {
            if (z2) {
                i4 = R.string.Doc_Share_FolderBOverseaAnonymousVisit;
            } else {
                i4 = R.string.Doc_Share_FolderBNoExternalAnonymousVisit;
            }
            return context.getString(i4);
        } else if (z2) {
            if (z) {
                i3 = R.string.Doc_Permission_AnonymousVisitTips_AddVariable;
            } else {
                i3 = R.string.Doc_Permission_AnonymousEditTips_AddVariable;
            }
            return C10539a.m43639a(context, i3, "doc_type", ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31510b(context, i));
        } else {
            if (z) {
                i2 = R.string.Doc_Permission_AnonymousVisitWithPrivacyTips_AddVariable;
            } else {
                i2 = R.string.Doc_Permission_AnonymousEditWithPrivacyTips_AddVariable;
            }
            return context.getString(i2);
        }
    }

    /* renamed from: a */
    private static void m41905a(final Context context, int i, String str, boolean z, boolean z2, final AbstractC10154a aVar) {
        int i2 = 1;
        if (i == C8275a.f22370c.mo32555b()) {
            FolderPermissionManagerDispatcher.m41256a(z).mo37733a(FolderPermissionManagerDispatcher.m41257a(str, ShareFolderPublicPermission.getLinkShareAnyonePerm(z), true, z)).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$kbrUURE_VAUtPUV9cGfHu1j7i_A */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    SimpleRequestResult simpleRequestResult = (SimpleRequestResult) obj;
                    AbstractC10154a.this.mo38590a();
                }
            }, new Consumer(context) {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$G1npodQqlCb9cgLYvJWUpLZJweU */
                public final /* synthetic */ Context f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C10071n.m41910a(AbstractC10154a.this, this.f$1, (Throwable) obj);
                }
            });
            return;
        }
        if (!z2) {
            i2 = 2;
        }
        new DocPublicPermissionManager(PermFGUtils.m39533b()).mo38467d(str, i, i2, new AbstractC10169g() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10071n.C100721 */

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17110a() {
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17111a(int i) {
                aVar.mo38590a();
            }

            @Override // com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g
            /* renamed from: a */
            public void mo17112a(Throwable th) {
                aVar.mo38590a();
                C10071n.m41907a(context, th);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m41917b(AbstractC10154a aVar, String str, int i, String str2, boolean z, DialogInterface dialogInterface, int i2) {
        aVar.mo38590a();
        PermissionAnalyticV2.m39617a(str, i, str2, z, false);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41908a(DialogInterface.OnClickListener onClickListener, String str, int i, String str2, boolean z, String str3, DialogInterface dialogInterface, int i2) {
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i2);
        }
        PermissionAnalyticV2.m39618a(str, i, str2, z, false, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m41916b(DialogInterface.OnClickListener onClickListener, String str, int i, String str2, boolean z, String str3, DialogInterface dialogInterface, int i2) {
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i2);
        }
        PermissionAnalyticV2.m39618a(str, i, str2, z, true, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41909a(DialogInterface dialogInterface, Context context, int i, String str, boolean z, boolean z2, AbstractC10154a aVar, DialogInterface dialogInterface2, int i2) {
        dialogInterface.dismiss();
        m41905a(context, i, str, z, z2, aVar);
    }

    /* renamed from: a */
    public static void m41902a(Context context, int i, String str, String str2, boolean z, String str3, boolean z2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        boolean F = C4511g.m18594d().mo17345F();
        boolean C = C4511g.m18594d().mo17342C();
        C13479a.m54764b("LinkShareUtils", "isOverSea:" + F + ", isKA" + C);
        if (F || C) {
            m41918c(context, i, str, str2, z, str3, z2, onClickListener, onClickListener2);
        } else {
            m41915b(context, i, str, str2, z, str3, z2, onClickListener, onClickListener2);
        }
    }

    /* renamed from: c */
    private static void m41918c(Context context, int i, String str, String str2, boolean z, String str3, boolean z2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Dialog a = m41900a(context, m41901a(context, i, z2, true), str, i, str2, z, str3, onClickListener, onClickListener2);
        a.show();
        m41913a(str, i, a);
        PermissionAnalyticV2.m39609a(str, i, str2, z, str3);
    }

    /* renamed from: a */
    private static Dialog m41900a(Context context, String str, String str2, int i, String str3, boolean z, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        return new BearUDDialogBuilder(context).mo45344a(R.string.Doc_Share_Confirm).mo45357b(str).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface.OnClickListener(onClickListener, str2, i, str3, z, str4) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$7YUELRJeX8roSDrvHhcQWc64FHw */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ String f$5;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C10071n.m41916b(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener(onClickListener2, str2, i, str3, z, str4) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$piZrUGfdd7XiVWo_3Sq_eDuYSw */
            public final /* synthetic */ DialogInterface.OnClickListener f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ String f$5;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C10071n.m41908a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, dialogInterface, i);
            }
        }).mo45355a();
    }

    /* renamed from: b */
    private static void m41915b(Context context, int i, String str, String str2, boolean z, String str3, boolean z2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        final C10917c a = ar.m20936a();
        String a2 = m41901a(context, i, z2, false);
        Dialog a3 = m41900a(context, a2, str, i, str2, z, str3, onClickListener, onClickListener2);
        a3.show();
        final PolicyConfig policyConfig = (PolicyConfig) C4211a.m17514a().mo16532a("policy_config", PolicyConfig.class, new PolicyConfig());
        ChoosePolicyUtil.m41676a((TextView) a3.findViewById(R.id.ud_dialog_content_message_tv), context, i, a2, new ChoosePolicyUtil.OnPolicyViewClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10071n.C100732 */

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.ChoosePolicyUtil.OnPolicyViewClickListener
            /* renamed from: a */
            public void mo38306a() {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(ChoosePolicyUtil.m41677b(a, policyConfig));
            }

            @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.ChoosePolicyUtil.OnPolicyViewClickListener
            /* renamed from: b */
            public void mo38307b() {
                ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(ChoosePolicyUtil.m41675a(a, policyConfig));
            }
        });
        m41913a(str, i, a3);
        PermissionAnalyticV2.m39609a(str, i, str2, z, str3);
    }

    /* renamed from: a */
    private static void m41904a(Context context, int i, String str, boolean z, AbstractC10154a aVar, String str2, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        UDDialog uDDialog;
        String str3;
        String str4;
        if (i == C8275a.f22370c.mo32555b()) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z) {
            if (z5) {
                str4 = context.getString(R.string.CreationMobile_Docs_Share_ExternalShareOwnerTips_folder);
            } else {
                str4 = C10539a.m43639a(context, R.string.Doc_Share_ExternalShareOwnerTips_AddVariable, "doc_type", ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31510b(context, i));
            }
            uDDialog = new BearUDDialogBuilder(context).mo45344a(R.string.Doc_Share_ExternalShareOwnerTitle).mo45357b(str4).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_TurnOn, new DialogInterface.OnClickListener(context, i, str, str2, z2, z3, z4, aVar) {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$ONCXl2aviAZ101ZEShpdDLERua0 */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ int f$1;
                public final /* synthetic */ String f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ boolean f$5;
                public final /* synthetic */ boolean f$6;
                public final /* synthetic */ AbstractC10154a f$7;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                    this.f$6 = r7;
                    this.f$7 = r8;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C10071n.m41903a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, dialogInterface, i);
                }
            }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_NotNow, new DialogInterface.OnClickListener(str, i, str2, z2) {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$RQMTryI4O0mjBPoLdTcjtsdAqeg */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C10071n.m41917b(AbstractC10154a.this, this.f$1, this.f$2, this.f$3, this.f$4, dialogInterface, i);
                }
            }).mo45358b(false).mo45355a();
            PermissionAnalyticV2.m39688k(str, i, str2, z2);
        } else {
            if (z5) {
                str3 = context.getString(R.string.CreationMobile_Docs_Share_ExternalShareCollTips_folder);
            } else {
                str3 = C10539a.m43639a(context, R.string.Doc_Share_ExternalShareCollTips_AddVariable, "doc_type", ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31510b(context, i));
            }
            uDDialog = new BearUDDialogBuilder(context).mo45357b(str3).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_GotIt, new DialogInterface.OnClickListener(str, i, str2, z2) {
                /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$OOX6dTlk2p4otMv2hLGKP1BjuEM */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ boolean f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C10071n.m41912a(AbstractC10154a.this, this.f$1, this.f$2, this.f$3, this.f$4, dialogInterface, i);
                }
            }).mo45355a();
            PermissionAnalyticV2.m39690l(str, i, str2, z2);
        }
        uDDialog.show();
        m41913a(str, i, uDDialog);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m41903a(Context context, int i, String str, String str2, boolean z, boolean z2, boolean z3, AbstractC10154a aVar, DialogInterface dialogInterface, int i2) {
        m41902a(context, i, str, str2, z, "from_share", true, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(dialogInterface, context, i, str, z2, z3, aVar) {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.$$Lambda$n$rXntsZQ_A2yLGV89TP7kZxUY60Y */
            public final /* synthetic */ DialogInterface f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ boolean f$5;
            public final /* synthetic */ AbstractC10154a f$6;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C10071n.m41909a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, dialogInterface, i);
            }
        }, (DialogInterface.OnClickListener) null);
        PermissionAnalyticV2.m39617a(str, i, str2, z, true);
    }

    /* renamed from: a */
    public static void m41906a(Context context, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AbstractC10154a aVar, String str2, boolean z6, boolean z7) {
        if (m41914a(i, z3, z4, z)) {
            C13479a.m54764b("LinkShareUtils", "showExternalShareTips(), need not show tips");
            aVar.mo38590a();
            return;
        }
        m41904a(context, i, str, z2, aVar, str2, z6, z5, z7);
    }
}
