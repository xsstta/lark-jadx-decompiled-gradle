package com.ss.android.lark.mail.impl.message.p2205e;

import com.bytedance.lark.pb.email.client.v1.MailMutMultiLabelResponse;
import com.bytedance.lark.pb.email.client.v1.ReportType;
import com.bytedance.lark.pb.email.client.v1.ThreadSecurityLevel;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.C42099l;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.view.AbsMessageTemplateView;
import com.ss.android.lark.mail.impl.message.view.p2212c.C43194a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.e.a */
public class C42886a {
    /* renamed from: a */
    public void mo153892a(String str, String str2, String str3) {
        Log.m165389i("RishReportViewModel", "closeBanner");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        C42176e.m168344a().mo152226a(arrayList, str3, new ArrayList(), new ArrayList(), ReportType.CLOSED.getValue(), str2, new IGetDataCallback<MailMutMultiLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.C428937 */

            /* renamed from: a */
            public void onSuccess(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
                Log.m165389i("RishReportViewModel", "closeBanner moveThreadListLabel onSuccess");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("RishReportViewModel", "closeBanner moveThreadListLabel onError");
            }
        });
    }

    /* renamed from: a */
    public static void m170828a(ArrayList<String> arrayList, String str, String str2) {
        Log.m165389i("RishReportViewModel", "reportMessageNotWebview fromLabelID: " + str2);
        final ArrayList arrayList2 = new ArrayList();
        if (!"TRASH".equals(str2) && !"SPAM".equals(str2)) {
            arrayList2.add("SPAM");
        }
        C42176e.m168344a().mo152226a(arrayList, str2, arrayList2, new ArrayList(), ReportType.SPAM.getValue(), str, new IGetDataCallback<MailMutMultiLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.C428893 */

            /* renamed from: a */
            public void onSuccess(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
                Log.m165389i("RishReportViewModel", "reportMessage moveThreadListLabel onSuccess");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("RishReportViewModel", "reportMessage moveThreadListLabel onError");
            }
        });
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.RunnableC428904 */

            public void run() {
                if (!CollectionUtils.isEmpty(arrayList2)) {
                    MailToast.m173702a(C43819s.m173684a((int) R.string.Mail_ReportTrash_ReportedMovedToTrashMobile), R.drawable.ud_icon_yes_outlined, R.color.static_white);
                } else {
                    MailToast.m173702a(C43819s.m173684a((int) R.string.Mail_ReportTrash_ReportedMobile), R.drawable.ud_icon_yes_outlined, R.color.static_white);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo153894a(String str, String str2, final List<C42097j> list, final AbsMessageTemplateView absMessageTemplateView, final C43194a aVar) {
        C42176e.m168344a().mo152235b(str, str2, new IGetDataCallback<C42099l>() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.C428948 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("RishReportViewModel", "onMailItemUpdate getMessageList onError");
            }

            /* renamed from: a */
            public void onSuccess(C42099l lVar) {
                boolean z;
                final boolean z2;
                boolean z3;
                absMessageTemplateView.mo154319a(lVar);
                Log.m165389i("RishReportViewModel", "onMailItemUpdate getMessageList onSuccess");
                for (int i = 0; i < list.size(); i++) {
                    final MailMessage g = ((C42097j) list.get(i)).mo151964g();
                    int i2 = 0;
                    while (true) {
                        z = true;
                        if (i2 >= lVar.mo151973a().size()) {
                            z = false;
                            break;
                        }
                        final MailMessage g2 = lVar.mo151973a().get(i2).mo151964g();
                        if (g.mo151581b().equals(g2.mo151581b())) {
                            if (!(g2.mo151562O() == g.mo151562O() && g2.mo151565a() == g.mo151565a() && g2.mo151563P() == g.mo151563P())) {
                                if (g2.mo151563P() || g2.mo151565a() == ThreadSecurityLevel.PHISHING || g2.mo151565a() == ThreadSecurityLevel.SPOOF) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (g2.mo151562O() == ReportType.CLOSED || g2.mo151562O() == ReportType.HAM) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                Log.m165389i("RishReportViewModel", "onMailItemUpdate isRisky:" + z2 + " shouldShowBanner:" + z3 + " newMessage:" + g2.mo151581b());
                                C43849u.m173826a(new Runnable() {
                                    /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.C428948.RunnableC428951 */

                                    public void run() {
                                        String str;
                                        C43194a aVar = aVar;
                                        String[] strArr = new String[3];
                                        strArr[0] = g2.mo151581b();
                                        if (z2) {
                                            str = "false";
                                        } else {
                                            str = "true";
                                        }
                                        strArr[1] = str;
                                        strArr[2] = "" + g2.mo151562O().getValue();
                                        aVar.mo154603b(null, "updateSafetyBanner", strArr);
                                    }
                                });
                            }
                            if (g.mo151561N() != g2.mo151561N()) {
                                absMessageTemplateView.mo154324a(g2.mo151581b(), g2);
                            }
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        Log.m165389i("RishReportViewModel", "onMailItemUpdate not isFind and delete ");
                        C43849u.m173826a(new Runnable() {
                            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.C428948.RunnableC428962 */

                            public void run() {
                                aVar.mo154603b(null, "removeMessage", g.mo151581b(), "false");
                            }
                        });
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo153895b(String str, final String str2, String str3, final int i, final C43194a aVar) {
        Log.m165389i("RishReportViewModel", "trustMessage");
        ArrayList arrayList = new ArrayList();
        arrayList.add("INBOX");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        C42176e.m168344a().mo152226a(arrayList2, str3, arrayList, new ArrayList(), ReportType.HAM.getValue(), str2, new IGetDataCallback<MailMutMultiLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.C428915 */

            /* renamed from: a */
            public void onSuccess(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
                Log.m165389i("RishReportViewModel", "trustMessage moveThreadListLabel onSuccess");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("RishReportViewModel", "trustMessage moveThreadListLabel onError");
            }
        });
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.RunnableC428926 */

            public void run() {
                if (i > 1) {
                    aVar.mo154603b(null, "removeMessage", str2, "true");
                }
                MailToast.m173700a(C43819s.m173684a((int) R.string.Mail_ReportTrash_LabelNormalMovedToInboxMobile));
            }
        });
    }

    /* renamed from: a */
    public void mo153893a(String str, final String str2, String str3, final int i, final C43194a aVar) {
        Log.m165389i("RishReportViewModel", "reportMessage fromLabelID: " + str3);
        final ArrayList arrayList = new ArrayList();
        if (!"TRASH".equals(str3) && !"SPAM".equals(str3)) {
            arrayList.add("SPAM");
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(str);
        C42176e.m168344a().mo152226a(arrayList2, str3, arrayList, new ArrayList(), ReportType.SPAM.getValue(), str2, new IGetDataCallback<MailMutMultiLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.C428871 */

            /* renamed from: a */
            public void onSuccess(MailMutMultiLabelResponse mailMutMultiLabelResponse) {
                Log.m165389i("RishReportViewModel", "reportMessage moveThreadListLabel onSuccess");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165389i("RishReportViewModel", "reportMessage moveThreadListLabel onError");
            }
        });
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.p2205e.C42886a.RunnableC428882 */

            public void run() {
                if (!CollectionUtils.isEmpty(arrayList)) {
                    if (i > 1) {
                        aVar.mo154603b(null, "removeMessage", str2, "true");
                    }
                    MailToast.m173702a(C43819s.m173684a((int) R.string.Mail_ReportTrash_ReportedMovedToTrashMobile), R.drawable.ud_icon_yes_outlined, R.color.static_white);
                    return;
                }
                MailToast.m173702a(C43819s.m173684a((int) R.string.Mail_ReportTrash_ReportedMobile), R.drawable.ud_icon_yes_outlined, R.color.static_white);
            }
        });
    }
}
