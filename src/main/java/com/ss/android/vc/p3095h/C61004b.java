package com.ss.android.vc.p3095h;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.C60657a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60768m;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.al;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63597a;
import com.ss.android.vc.net.request.C63601d;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.request.VcBizTask;
import com.ss.android.vc.statistics.p3180a.C63688c;
import java.util.Map;

/* renamed from: com.ss.android.vc.h.b */
public class C61004b {

    /* renamed from: a */
    private static volatile C60657a f152863a;

    /* renamed from: b */
    private static al m237250b() {
        return new al() {
            /* class com.ss.android.vc.p3095h.C61004b.C610051 */

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: b */
            public boolean mo208742b() {
                return VideoChatModuleDependency.m236632e();
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: e */
            public SparseArray<Integer> mo208745e() {
                return C63601d.m249418a();
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: c */
            public String mo208743c() {
                return ar.m236694a().getString(R.string.View_G_ServerNoTitle);
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: d */
            public String mo208744d() {
                return VideoChatModuleDependency.getLoginDependency().getTenantId();
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: a */
            public boolean mo208740a() {
                return VideoChatModuleDependency.getLoginDependency().mo196421c();
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: a */
            public boolean mo208741a(Participant participant) {
                return ParticipantUtil.m248735d(participant);
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: a */
            public RichText mo208736a(com.ss.android.lark.widget.richtext.RichText richText) {
                return VideoChatModuleDependency.getRichTextDependency().parsePbFromRichText(richText);
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: a */
            public com.ss.android.lark.widget.richtext.RichText mo208737a(RichText richText) {
                return VideoChatModuleDependency.getRichTextDependency().parseRichTextFromPb(richText);
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: a */
            public Map<String, OpenChatter> mo208738a(Map<String, Chatter> map) {
                return VideoChatModuleDependency.getChatDependency().fromPbChatterMap(map);
            }

            @Override // com.ss.android.vc.dependency.al
            /* renamed from: a */
            public void mo208739a(ErrorResult errorResult, final VcBizTask.onErrorCallback onerrorcallback, Object obj, String str) {
                if (errorResult != null) {
                    final C63602e eVar = new C63602e(errorResult);
                    C63688c.m249671a(errorResult.getErrorCode(), obj, str, errorResult.getDebugMsg());
                    if (eVar.f160598a == null || !eVar.f160598a.is_show) {
                        onerrorcallback.onError(eVar);
                        return;
                    }
                    final VcMsgInfo vcMsgInfo = eVar.f160598a;
                    if (C610072.f152868a[vcMsgInfo.type.ordinal()] == 1) {
                        C60768m.m236110a(vcMsgInfo, (Context) null);
                        eVar.f160600c = true;
                        onerrorcallback.onError(eVar);
                    } else if ((!C63597a.m249415b(eVar.mo219899a()) || vcMsgInfo.is_override) && vcMsgInfo.msg_i18n_key != null) {
                        VcBizSender.m249235b(vcMsgInfo.msg_i18n_key.newKey, vcMsgInfo.msg_i18n_key.params).mo219889a(new AbstractC63598b<String>() {
                            /* class com.ss.android.vc.p3095h.C61004b.C610051.C610061 */

                            @Override // com.ss.android.vc.net.request.AbstractC63598b
                            public void onError(C63602e eVar) {
                                onerrorcallback.onError(eVar);
                            }

                            /* renamed from: a */
                            public void onSuccess(String str) {
                                if (!TextUtils.isEmpty(str)) {
                                    if (vcMsgInfo.type != VcMsgInfo.Type.POPUP) {
                                        C60738ac.m236031a(str, (long) vcMsgInfo.expire);
                                    }
                                    eVar.f160598a.message = str;
                                    eVar.f160600c = true;
                                }
                                onerrorcallback.onError(eVar);
                            }
                        });
                    } else {
                        eVar.f160600c = C61004b.m237249a(eVar.mo219899a(), vcMsgInfo);
                        onerrorcallback.onError(eVar);
                    }
                }
            }
        };
    }

    /* renamed from: com.ss.android.vc.h.b$2 */
    static /* synthetic */ class C610072 {

        /* renamed from: a */
        static final /* synthetic */ int[] f152868a;

        static {
            int[] iArr = new int[VcMsgInfo.Type.values().length];
            f152868a = iArr;
            try {
                iArr[VcMsgInfo.Type.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static C60657a m237248a() {
        C60700b.m235851b("NetWorkModuleProvider", "[init]", "start");
        if (f152863a == null) {
            synchronized (C61004b.class) {
                if (f152863a == null) {
                    f152863a = new C60657a(m237250b());
                }
            }
        }
        C60700b.m235851b("NetWorkModuleProvider", "[init]", "end");
        return f152863a;
    }

    /* renamed from: a */
    public static boolean m237249a(int i, VcMsgInfo vcMsgInfo) {
        if (!C63597a.m249415b(i)) {
            return false;
        }
        C60738ac.m236025a(C63597a.m249414a(i), (long) vcMsgInfo.expire);
        return true;
    }
}
