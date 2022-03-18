package com.ss.android.lark.invitation.v2.feat.member.contact;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.common.C40334b;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.contact.a */
public class C40351a {

    /* renamed from: a */
    private static final int f102521a = 2131296323;

    /* renamed from: b */
    private static final int f102522b = 2131296324;

    /* renamed from: a */
    public static void m159928a(ErrorResult errorResult) {
        Log.m165383e("InvitationModule", errorResult.toString());
        String displayMsg = errorResult.getDisplayMsg();
        if (!TextUtils.isEmpty(displayMsg)) {
            ViewUtils.m224150a(displayMsg);
        }
    }

    /* renamed from: a */
    public static void m159930a(boolean z) {
        int i;
        if (z) {
            i = f102521a;
        } else {
            i = f102522b;
        }
        C57783ah.m224245a().mo196094b(i);
    }

    /* renamed from: a */
    private static void m159923a(Context context, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("SUM", String.valueOf(i));
        hashMap.put("SUC_SUM", String.valueOf(i));
        new C25639g(context).mo89247e(true).mo89248g(R.string.Lark_Invitation_MembersBatchFeedSucTitle).mo89238b(true).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Invitation_MembersBatchFeedSucContent, hashMap)).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Invitation_MembersBatchConfirmButton), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.C40351a.DialogInterface$OnClickListenerC403554 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo89239c();
    }

    /* renamed from: a */
    public static void m159929a(List<ContactMobileBean> list, boolean z) {
        int i;
        if (z) {
            i = f102521a;
        } else {
            i = f102522b;
        }
        C57783ah.m224245a().mo196093a(i, list);
    }

    /* renamed from: a */
    public static void m159927a(final Context context, final boolean z, final String str) {
        int i;
        if (z) {
            i = f102521a;
        } else {
            i = f102522b;
        }
        m159930a(z);
        C57783ah.m224245a().mo196092a(i, (C57783ah.AbstractC57787c) new C57783ah.AbstractC57787c() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.C40351a.C403521 */

            @Override // com.ss.android.lark.utils.C57783ah.AbstractC57787c
            public void handleMessage(C57783ah.C57786b bVar) {
                Object b = bVar.mo196098b();
                if (!(b instanceof List)) {
                    Log.m165397w("InvitationModule", "UiMessage -> error type");
                    return;
                }
                List<ContactMobileBean> list = (List) b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (z) {
                    for (ContactMobileBean contactMobileBean : list) {
                        if (!arrayList.contains(contactMobileBean.getEmail())) {
                            arrayList.add(contactMobileBean.getEmail());
                            arrayList2.add(contactMobileBean.getName());
                        }
                    }
                } else {
                    for (ContactMobileBean contactMobileBean2 : list) {
                        String phoneE164 = contactMobileBean2.getPhoneE164();
                        if (!arrayList.contains(phoneE164)) {
                            arrayList.add(phoneE164);
                            arrayList2.add(contactMobileBean2.getName());
                        }
                    }
                }
                C40351a.m159926a(context, arrayList, arrayList2, z, str);
            }
        });
    }

    /* renamed from: a */
    private static void m159925a(Context context, List<String> list, List<String> list2, Map<String, InvitationServiceApi.C40082a> map) {
        new C40334b(context, list, list2, map).mo197765f();
    }

    /* renamed from: a */
    public static void m159924a(Context context, List<String> list, List<String> list2, SdkSender.C53233d<InvitationServiceApi.C40084c> dVar) {
        T t = dVar.f131572a;
        if (t.f101876a) {
            ViewUtils.m224150a(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny));
            return;
        }
        Map<String, InvitationServiceApi.C40082a> map = t.f101877b;
        if (map.size() == 0) {
            m159923a(context, list.size());
            InvHitPoint.m160345X("suc");
            return;
        }
        m159925a(context, list, list2, map);
        if (list.size() == map.size()) {
            InvHitPoint.m160345X("fail");
        } else {
            InvHitPoint.m160345X("mixed");
        }
    }

    /* renamed from: a */
    public static void m159926a(final Context context, final List<String> list, final List<String> list2, final boolean z, final String str) {
        final InvitationServiceApi.C40083b bVar = new InvitationServiceApi.C40083b(list, list2);
        C57768af.m224220b(context, new C57768af.AbstractRunnableC57773c<SdkSender.C53233d<InvitationServiceApi.C40084c>>() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.C40351a.C403543 */

            /* renamed from: a */
            public SdkSender.C53233d<InvitationServiceApi.C40084c> mo130916b() {
                return C40147z.m159162b().invite(bVar, z, str);
            }

            /* renamed from: a */
            public void mo130914a(SdkSender.C53233d<InvitationServiceApi.C40084c> dVar) {
                ErrorResult errorResult = dVar.f131573b;
                if (errorResult != null) {
                    C40351a.m159928a(errorResult);
                } else {
                    C40351a.m159924a(context, list, list2, dVar);
                }
            }
        }.mo196073a(10000, new Runnable() {
            /* class com.ss.android.lark.invitation.v2.feat.member.contact.C40351a.RunnableC403532 */

            public void run() {
                Log.m165383e("InvitationModule", "timeout");
                ViewUtils.m224144a();
            }
        }));
    }
}
