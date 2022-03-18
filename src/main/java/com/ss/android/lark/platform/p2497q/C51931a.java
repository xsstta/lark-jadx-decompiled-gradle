package com.ss.android.lark.platform.p2497q;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.aj;
import com.ss.android.lark.biz.core.api.ak;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatQRCodeInfoResponse;
import com.ss.android.lark.biz.im.api.IScreenshotCallBack;
import com.ss.android.lark.biz.im.api.LKPType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1775l.AbstractC36232b;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.platform.applink.C51707a;
import com.ss.android.lark.platform.browser.BrowserModuleProvider;
import com.ss.android.lark.platform.statistics.p2502b.C51973e;
import com.ss.android.lark.platform.statistics.perf.C51997c;
import com.ss.android.lark.qrcode.QRCodeModule;
import com.ss.android.lark.qrcode.p2553a.AbstractC52938a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.span.C59176n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.platform.q.a */
public class C51931a {

    /* renamed from: a */
    public static String f128980a = "(^https://.*\\.feishu.cn/.*\\?share_chat_token=.*)|(^https://lark.bytedance.net/\\?share_chat_token=.*)|(^https://.*\\.larksuite.com/.*\\?share_chat_token=.*)";

    /* renamed from: b */
    public static String f128981b = "^((http(s)?://.*\\.zjurl.cn)|(http(s)?://.*\\.feishu.cn))/.*add_contact(/)?\\?token=.*|(^https://.*\\.larksuite.com/.*add_contact(/)?\\?token=.*)";

    /* renamed from: com.ss.android.lark.platform.q.a$a */
    public static class C51946a {

        /* renamed from: a */
        public static final AbstractC52938a f128994a = C51931a.m201433b();
    }

    /* renamed from: a */
    public static QRCodeModule m201432a() {
        return new QRCodeModule(C51946a.f128994a);
    }

    /* renamed from: b */
    public static AbstractC52938a m201433b() {
        return new AbstractC52938a() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519321 */

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: e */
            public long mo178111e() {
                return C51973e.m201592j();
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: a */
            public void mo178100a() {
                C36083a.m141486a().getVideoConferenceDependency().mo133149f();
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: d */
            public boolean mo178110d() {
                return C36083a.m141486a().getVideoConferenceDependency().mo133150g();
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: c */
            public List<IQRCodeScanResultHandler> mo178108c() {
                ArrayList arrayList = new ArrayList();
                C36083a.m141486a().getOpenFeatureDependency().mo133000b(arrayList);
                return arrayList;
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: b */
            public List<IQRCodeScanResultHandler> mo178105b() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C51931a.m201434c());
                arrayList.add(C51931a.m201435d());
                arrayList.add(C51931a.m201436e());
                arrayList.add(C51931a.m201437f());
                arrayList.add(C51931a.m201438g());
                arrayList.add(C51931a.m201439h());
                arrayList.add(C51931a.m201440i());
                arrayList.add(C51931a.m201441j());
                arrayList.add(C51931a.m201442k());
                C36083a.m141486a().getOpenFeatureDependency().mo132995a(arrayList);
                return arrayList;
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: a */
            public void mo178101a(Context context) {
                BrowserModuleProvider.m200667a().mo106840a(context);
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: b */
            public void mo178106b(Context context) {
                C36083a.m141486a().getOpenPlatformDependency().mo133032b(context);
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: c */
            public boolean mo178109c(String str) {
                return C59176n.m229858b().matcher(str).find();
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: b */
            public boolean mo178107b(String str) {
                Uri parse = Uri.parse(str);
                if (parse == null || parse.getHost() == null || !parse.getHost().equals("microapp")) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: a */
            public boolean mo178103a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: a */
            public void mo178102a(Context context, final AbstractC52938a.AbstractC52939a aVar) {
                C36083a.m141486a().getIMDependency().mo132825a(context, LKPType.QrCodeScan, new IScreenshotCallBack() {
                    /* class com.ss.android.lark.platform.p2497q.C51931a.C519321.C519331 */

                    @Override // com.ss.android.lark.biz.im.api.IScreenshotCallBack
                    /* renamed from: a */
                    public void mo106758a(int i) {
                        AbstractC52938a.AbstractC52939a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo180848a(i);
                        }
                    }

                    @Override // com.ss.android.lark.biz.im.api.IScreenshotCallBack
                    /* renamed from: a */
                    public void mo106759a(String str) {
                        AbstractC52938a.AbstractC52939a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo180849a(str);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.qrcode.p2553a.AbstractC52938a
            /* renamed from: a */
            public boolean mo178104a(String str, Context context, int i) {
                int i2 = 2;
                if (i == 2) {
                    i2 = 3;
                }
                return C51707a.m200495a().mo103469a(context, str, i2);
            }
        };
    }

    /* renamed from: c */
    public static IQRCodeScanResultHandler m201434c() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519363 */

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (!C26284k.m95186b(ajVar.mo105591a())) {
                    return false;
                }
                return C36083a.m141486a().getIMDependency().mo132880a(ajVar.mo105591a(), str);
            }
        };
    }

    /* renamed from: d */
    public static IQRCodeScanResultHandler m201435d() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519374 */

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                int i2 = 2;
                if (i == 2) {
                    i2 = 3;
                }
                if (!C51707a.m200495a().mo103469a(ajVar.mo105591a(), str, i2)) {
                    return false;
                }
                C51707a.m200495a().mo103471b(ajVar.mo105591a(), str, i2);
                return true;
            }
        };
    }

    /* renamed from: e */
    public static IQRCodeScanResultHandler m201436e() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519385 */

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (!TextUtils.equals("lark://client/chat/help", str)) {
                    return false;
                }
                C36083a.m141486a().getIMDependency().mo132937g(ajVar.mo105591a());
                return true;
            }
        };
    }

    /* renamed from: f */
    public static IQRCodeScanResultHandler m201437f() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519396 */

            /* renamed from: a */
            private String m201466a() {
                return C51931a.f128980a + "|(^https://.*\\." + C36882a.m145561e() + "/.*\\?share_chat_token=.*)";
            }

            /* renamed from: a */
            private boolean m201468a(String str) {
                return Pattern.matches(m201466a(), str);
            }

            /* renamed from: b */
            private String m201469b(String str) {
                return Uri.parse(str).getQueryParameter("share_chat_token");
            }

            /* renamed from: a */
            private void m201467a(final String str, final Context context) {
                if (!TextUtils.isEmpty(str)) {
                    C36083a.m141486a().getIMDependency().mo132859a(str, new UIGetDataCallback<>(new IGetDataCallback<ChatQRCodeInfoResponse>() {
                        /* class com.ss.android.lark.platform.p2497q.C51931a.C519396.C519401 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            LKUIToast.show(context, errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_AnalysQRFail)));
                        }

                        /* renamed from: a */
                        public void onSuccess(ChatQRCodeInfoResponse chatQRCodeInfoResponse) {
                            boolean z;
                            String str;
                            int i;
                            if (chatQRCodeInfoResponse == null || chatQRCodeInfoResponse.getChat() == null) {
                                onError(new ErrorResult(""));
                                return;
                            }
                            boolean isAlreadyInChat = chatQRCodeInfoResponse.isAlreadyInChat();
                            Chat chat = chatQRCodeInfoResponse.getChat();
                            if (isAlreadyInChat) {
                                C519396.this.mo178115a(chat.getId(), chat.getChatMode(), chat.isSecret(), context);
                            } else if (chatQRCodeInfoResponse.getChat().isEdu()) {
                                C519396.this.mo178113a(context, chat.getId(), str, C36083a.m141486a().getPassportDependency().mo133088g(), chatQRCodeInfoResponse.getInviterId(), false);
                            } else {
                                String g = C36083a.m141486a().getPassportDependency().mo133088g();
                                boolean equals = TextUtils.equals(chat.getTenantId(), g);
                                boolean z2 = false;
                                String showMsg = chatQRCodeInfoResponse.getShowMsg();
                                if (!equals) {
                                    Iterator<TenantInfo> it = C36083a.m141486a().getPassportDependency().mo133106y().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (TextUtils.equals(it.next().getTenantId(), chat.getTenantId())) {
                                                z2 = true;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        i = R.string.Lark_Chat_Scan_QRcode_Group_External_SwitchOrganization_Tip;
                                    } else if (chatQRCodeInfoResponse.isInviteCanAddMember()) {
                                        i = R.string.Lark_Chat_Scan_QRcode_Group_External_ApplyOrganizationPermissionYes_Tip;
                                    } else {
                                        i = R.string.Lark_Chat_Scan_QRcode_Group_External_ApplyOrganizationPermissionNo_Tip;
                                    }
                                    str = UIHelper.mustacheFormat(i, "GROUP_QRCODE_TENANT_NAME", showMsg);
                                    z = z2;
                                } else {
                                    str = "";
                                    z = false;
                                }
                                Log.m165389i("QRCodeHandler", "joinGroupChat：currUserTenantId = " + g + " , chat id = " + chat.getId() + " , chat tenantId = " + chat.getTenantId() + " , inviterId = " + chatQRCodeInfoResponse.getInviterId() + " , isInviteCanAddMember = " + chatQRCodeInfoResponse.isInviteCanAddMember() + " , inviteUrl = " + chatQRCodeInfoResponse.getInviteUrl());
                                C519396.this.mo178114a(chat, chatQRCodeInfoResponse.getInviterId(), str, context, equals, chatQRCodeInfoResponse.isInviteCanAddMember(), str, z, chat.isCrossTenant(), chat.getTenantId(), chatQRCodeInfoResponse.getInviteUrl());
                            }
                        }
                    }));
                }
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (!m201468a(str)) {
                    return false;
                }
                m201467a(m201469b(str), ajVar.mo105591a());
                return true;
            }

            /* renamed from: a */
            public void mo178115a(String str, Chat.ChatMode chatMode, boolean z, Context context) {
                C36083a.m141486a().getIMDependency().mo132823a(context, ChatBundle.m109259a().mo105927a(str).mo105926a(chatMode).mo105936d(z).mo105923a(ChatBundle.SourceType.SEARCH).mo105929a());
            }

            /* renamed from: a */
            public void mo178113a(Context context, String str, String str2, String str3, String str4, boolean z) {
                AbstractC36232b.m142703a().mo178821b().mo105579a(context, str, str2, str3, str4, z);
            }

            /* renamed from: a */
            public void mo178114a(Chat chat, String str, String str2, Context context, boolean z, boolean z2, String str3, boolean z3, boolean z4, String str4, String str5) {
                AbstractC36232b.m142703a().mo178821b().mo105580a(context, chat.getId(), str2, str, z, z2, str3, z3, z4, str4, str5, false);
            }
        };
    }

    /* renamed from: g */
    public static IQRCodeScanResultHandler m201438g() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519417 */

            /* renamed from: a */
            private boolean m201476a(String str) {
                return !TextUtils.isEmpty(m201477b(str));
            }

            /* renamed from: b */
            private String m201477b(String str) {
                try {
                    return JSONObject.parseObject(str).getJSONObject("qrlogin").getString("token");
                } catch (Exception unused) {
                    return null;
                }
            }

            /* renamed from: a */
            private void m201475a(String str, Context context) {
                m201478b(m201477b(str), context);
            }

            /* renamed from: b */
            private void m201478b(final String str, final Context context) {
                IQRLoginService l = C36083a.m141486a().getPassportDependency().mo133093l();
                if (l != null) {
                    l.qrLoginCheck(str, new IGetDataCallback<BaseStepData>() {
                        /* class com.ss.android.lark.platform.p2497q.C51931a.C519417.C519421 */

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("QRCodeModuleProvider", errorResult.toString());
                        }

                        /* renamed from: a */
                        public void onSuccess(BaseStepData baseStepData) {
                            if (baseStepData.stepInfo != null) {
                                C519417.this.mo178117a(context, str, baseStepData);
                            } else {
                                LKUIToast.show(context, UIHelper.getString(R.string.Lark_Legacy_Checkfail));
                            }
                        }
                    });
                }
            }

            /* renamed from: a */
            public void mo178117a(Context context, String str, BaseStepData baseStepData) {
                C36083a.m141486a().getPassportDependency().mo133062a(context, str, baseStepData);
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (!m201476a(str)) {
                    return false;
                }
                m201475a(str, ajVar.mo105591a());
                return true;
            }
        };
    }

    /* renamed from: h */
    public static IQRCodeScanResultHandler m201439h() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519438 */

            /* renamed from: a */
            private String m201482a() {
                return C51931a.f128981b + "|(^https://.*\\." + C36882a.m145561e() + "/.*add_contact(/)?\\?token=.*)";
            }

            /* renamed from: a */
            private boolean m201484a(String str) {
                return Pattern.matches(m201482a(), str);
            }

            /* renamed from: b */
            private String m201485b(String str) {
                return Uri.parse(str).getQueryParameter("token");
            }

            /* renamed from: a */
            private void m201483a(Context context, String str) {
                AbstractC29542ad b = AbstractC36232b.m142703a().mo178821b();
                ContactSource contactSource = new ContactSource();
                contactSource.setSourceType(1);
                b.mo105570a(context, str, contactSource);
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (!m201484a(str)) {
                    return false;
                }
                String b = m201485b(str);
                if (TextUtils.isEmpty(b)) {
                    return true;
                }
                m201483a(ajVar.mo105591a(), b);
                return true;
            }
        };
    }

    /* renamed from: i */
    public static IQRCodeScanResultHandler m201440i() {
        return new ak() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519449 */

            @Override // com.ss.android.lark.biz.core.api.ak
            /* renamed from: a */
            public boolean mo105597a() {
                return false;
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, final aj ajVar, int i) {
                return C36083a.m141486a().getPassportDependency().mo133099r().mo172436b(ajVar.mo105591a(), str, new IGetDataCallback<Boolean>() {
                    /* class com.ss.android.lark.platform.p2497q.C51931a.C519449.C519451 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        ajVar.mo105594b();
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ajVar.mo105594b();
                    }
                });
            }
        };
    }

    /* renamed from: j */
    public static IQRCodeScanResultHandler m201441j() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.AnonymousClass10 */

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (C59176n.m229858b().matcher(str).find()) {
                    m201457a(str, ajVar.mo105591a(), i);
                    return true;
                } else if (!BrowserModuleProvider.m200667a().mo106858b(str)) {
                    return false;
                } else {
                    m201457a(str, ajVar.mo105591a(), i);
                    return true;
                }
            }

            /* renamed from: a */
            private void m201457a(String str, Context context, int i) {
                boolean z = false;
                if (C37239a.m146648b().mo136952a("lark.browser.qr.process.main", false) && !BrowserModuleProvider.m200667a().mo106856b(context)) {
                    z = true;
                }
                Log.m165389i("QRCodeModuleProvider", "openUrl openUrlFromMainProcess : " + z);
                UrlParams.Source source = UrlParams.Source.QR;
                if (i == 2) {
                    source = UrlParams.Source.SCAN_PARSE;
                } else if (i == 3) {
                    source = UrlParams.Source.SCAN_CAMERA;
                }
                Bundle bundle = new Bundle();
                bundle.putString("PARAM_PROCESS_START_SOURCE", "QR_SCAN_WEB_VIEW");
                C51997c.m201743a("key_doc", ChatBundle.SourceType.PROFILE);
                BrowserModuleProvider.m200667a().mo106850a("messenger", "messenger_qr");
                BrowserModuleProvider.m200667a().mo106844a(context, str, UrlParams.m108857a().mo105516a(bundle).mo105518a(source).mo105530c(z).mo105523a(), C36083a.m141486a().getCCMDependency().mo132717c());
            }
        };
    }

    /* renamed from: k */
    public static IQRCodeScanResultHandler m201442k() {
        return new IQRCodeScanResultHandler() {
            /* class com.ss.android.lark.platform.p2497q.C51931a.C519342 */

            /* renamed from: a */
            private boolean m201460a(String str) {
                try {
                    Uri parse = Uri.parse(str);
                    if (!"lark".equalsIgnoreCase(parse.getScheme()) || !"client".equalsIgnoreCase(parse.getHost()) || !"/helpdesk".equalsIgnoreCase(parse.getPath())) {
                        return false;
                    }
                    return true;
                } catch (Exception unused) {
                    Log.m165383e("InitQRCodeHandlerTask", "uri parce exception. scan result:" + str);
                    return false;
                }
            }

            /* renamed from: a */
            private void m201459a(final Context context, String str, String str2) {
                C36083a.m141486a().getIMDependency().mo132900b(C44134a.m174959a().mo133257m().mo133350b(), str, str2, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.platform.p2497q.C51931a.C519342.C519351 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        C44134a.m174959a().mo133261q().mo133327a(context, str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("QRCodeModuleProvider", "openHelpDeskById getOnCallChatId error:" + errorResult.toString());
                    }
                });
            }

            @Override // com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler
            /* renamed from: a */
            public boolean mo105369a(String str, aj ajVar, int i) {
                if (TextUtils.isEmpty(str) || !m201460a(str)) {
                    return false;
                }
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("id");
                String queryParameter2 = parse.getQueryParameter("extra");
                Context a = ajVar.mo105591a();
                if (TextUtils.isEmpty(queryParameter2)) {
                    queryParameter2 = null;
                }
                m201459a(a, queryParameter, queryParameter2);
                return true;
            }
        };
    }
}
