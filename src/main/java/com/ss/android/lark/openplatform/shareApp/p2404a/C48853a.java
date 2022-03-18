package com.ss.android.lark.openplatform.shareApp.p2404a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.common.C48822a;
import com.ss.android.lark.openplatform.openapp.dto.AppShareInfo;
import com.ss.android.lark.openplatform.openapp.dto.PlatformType;
import com.ss.android.lark.openplatform.p2401c.C48820c;
import com.ss.android.lark.openplatform.shareApp.dto.AbstractC48867a;
import com.ss.android.lark.openplatform.shareApp.dto.C48868b;
import com.ss.android.lark.openplatform.shareApp.dto.C48869c;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppDataV2;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppType;
import com.ss.android.lark.openplatform.shareApp.p2405b.C48864a;
import com.ss.android.lark.openplatform.shareApp.p2405b.C48866b;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40647n;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.container.LarkShareContainer;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig;
import com.ss.android.lark.thirdshare.container.p2744b.C55730a;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.shareApp.a.a */
public class C48853a {
    /* renamed from: a */
    public static void m192476a(final Context context, final String str, final C48869c cVar, final AbstractC48867a aVar) {
        final String f = cVar != null ? cVar.mo170690f() : "";
        m192477a(f, str);
        C48864a.m192492a(C40647n.f103113a, f, str);
        if (context == null || cVar == null || !cVar.mo170692g()) {
            StringBuilder sb = new StringBuilder();
            sb.append(" share info not useable ");
            sb.append(cVar == null);
            C53241h.m205894a("ShareAppUtil", sb.toString());
            return;
        }
        final ShareAppResult shareAppResult = new ShareAppResult(ShareAppResult.ShareTab.TAB_CHAT);
        cVar.mo170694i();
        if (TextUtils.isEmpty(cVar.mo170686d())) {
            cVar.mo170683b(Uri.parse(C48822a.m192355f()).buildUpon().appendQueryParameter("appId", f).appendQueryParameter("op_tracking", str).toString());
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(LarkShareContainerUiConfig.Tab.f137477d.mo189933a(context.getString(R.string.OpenPlatform_Share_AppCardTab), "single"));
        arrayList.add(LarkShareContainerUiConfig.Tab.f137477d.mo189934b(context.getString(R.string.OpenPlatform_Share_AppLinkTab), "round_rect"));
        arrayList.add(LarkShareContainerUiConfig.Tab.f137477d.mo189935c(context.getString(R.string.OpenPlatform_Share_QrCodeTab), "round_rect"));
        final LarkShareContainerConfig larkShareContainerConfig = new LarkShareContainerConfig();
        final C488541 r4 = new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488541 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                AbstractC48867a aVar = aVar;
                if (aVar != null) {
                    aVar.mo142988a(bool.booleanValue(), "");
                }
                C48853a.m192478a(f, str, "success", "card");
                C48864a.m192492a(C48866b.f122758g, f, str);
                C53241h.m205899c("ShareAppUtil", " send note card success " + bool);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                AbstractC48867a aVar = aVar;
                if (aVar != null) {
                    aVar.mo142988a(false, errorResult.getDebugMsg());
                }
                C48853a.m192478a(f, str, "failure", "card");
                C48864a.m192492a(C48866b.f122759h, f, str);
                C53241h.m205899c("ShareAppUtil", " send note card err " + errorResult.getDebugMsg());
            }
        };
        larkShareContainerConfig.mo189876a(LarkShareContainerConfig.InappConfig.f137445c.mo189890a(context.getString(R.string.OpenPlatform_Share_ShareToTtl), new LarkShareContainerConfig.ForwardCallback() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488574 */

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.ForwardCallback
            /* renamed from: a */
            public void mo146275a(List<? extends C55730a> list, String str) {
                C53241h.m205899c("ShareAppUtil", "on forword " + list.size());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C55730a aVar : list) {
                    arrayList.add(aVar.mo189946a());
                    arrayList2.add(new C48868b(aVar.mo189946a(), aVar.mo189947b(), aVar.mo189948c()));
                }
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_CHAT);
                shareAppResult.mo170672a(arrayList2);
                ShareAppDataV2 shareAppDataV2 = new ShareAppDataV2();
                shareAppDataV2.setAppId(f);
                shareAppDataV2.setCardLink(cVar.mo170686d(), cVar.mo170686d(), cVar.mo170686d(), cVar.mo170686d());
                if (cVar.mo170679a() == ShareAppType.SHARE_APP_PAGE) {
                    shareAppDataV2.setTitle(cVar.mo170688e());
                    shareAppDataV2.setImgKey(cVar.mo170695j());
                } else if (cVar.mo170679a() == ShareAppType.SHARE_APP_H5) {
                    shareAppDataV2.setDesc(cVar.mo170696k());
                }
                OpenPlatformModule.m192198d().sendShareCardMessage(shareAppDataV2, cVar.mo170679a(), arrayList, str, r4);
                new OPMonitor("openplatform_application_share_click").addCategoryValue("op_tracking", str).addCategoryValue("subview", "card").addCategoryValue("click", "confirm").addCategoryValue("target", "none").addCategoryValue("application_id", f).addCategoryValue("scene_type", "none").addCategoryValue("solution_id", "none").reportPlatform(4).flush();
            }
        }));
        final C488585 r0 = new LarkShareContainerConfig.LinkCallback() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488585 */

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.LinkCallback
            public void onCopied() {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_LINK);
                AbstractC48867a aVar = aVar;
                if (aVar != null) {
                    aVar.mo142989b();
                }
                C48864a.m192492a(C48866b.f122762k, f, str);
                C53241h.m205899c("ShareAppUtil", "copy share link");
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onSuccess(ShareActionType shareActionType) {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_LINK);
                C48853a.m192478a(f, str, "success", "link");
                C53241h.m205899c("ShareAppUtil", " share link success ");
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_LINK);
                C48853a.m192478a(f, str, "failure", "link");
                C53241h.m205899c("ShareAppUtil", " share link fail " + shareError.getMsg());
            }
        };
        larkShareContainerConfig.mo189877a(new LarkShareContainerConfig.LinkConfigSupplier() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488596 */

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.LinkConfigSupplier
            /* renamed from: a */
            public LarkShareContainerConfig.LinkConfig mo146276a() {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_LINK);
                return C48853a.m192470a(context, cVar, r0);
            }
        });
        final C488607 r02 = new LarkShareContainerConfig.QrcodeCallback() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488607 */

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
            public void noNoPermission() {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_QRCODE);
                AbstractC48867a aVar = aVar;
                if (aVar != null) {
                    aVar.mo142990b(false, "save share qrcode no permission");
                }
                C48864a.m192495b(C48866b.f122764m, f, str).addCategoryValue("message", "save share qrcode no permission").flush();
                C53241h.m205899c("ShareAppUtil", "save share qrcode no permission");
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onSuccess(ShareActionType shareActionType) {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_QRCODE);
                C48853a.m192478a(f, str, "success", "qr_code");
                C53241h.m205899c("ShareAppUtil", " share qr success ");
            }

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveFailed(String str) {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_QRCODE);
                AbstractC48867a aVar = aVar;
                if (aVar != null) {
                    aVar.mo142990b(false, str);
                }
                C48864a.m192495b(C48866b.f122764m, f, str).addCategoryValue("message", str).flush();
                C53241h.m205899c("ShareAppUtil", "save share qrcode file ");
            }

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveSuccess(File file) {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_QRCODE);
                AbstractC48867a aVar = aVar;
                if (aVar != null) {
                    aVar.mo142990b(true, "");
                }
                C48864a.m192492a(C48866b.f122763l, f, str);
                C53241h.m205899c("ShareAppUtil", "save share qrcode success ");
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_QRCODE);
                C48853a.m192478a(f, str, "failure", "qr_code");
                C53241h.m205899c("ShareAppUtil", " share qr err " + shareError.getMsg());
            }
        };
        larkShareContainerConfig.mo189878a(new LarkShareContainerConfig.QrcodeConfigSupplier() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488618 */

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.QrcodeConfigSupplier
            /* renamed from: a */
            public LarkShareContainerConfig.QrcodeConfig mo146278a() {
                shareAppResult.mo170671a(ShareAppResult.ShareTab.TAB_QRCODE);
                return C48853a.m192472a(context, cVar, r02);
            }
        });
        LarkShareContainer.f137484c.mo189939a(context, new LarkShareContainer.LarkShareContainerSupplier() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488629 */

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainer.LarkShareContainerSupplier
            /* renamed from: a */
            public LarkShareContainer mo146279a() {
                return new LarkShareContainer(new LarkShareContainerUiConfig(context.getString(R.string.OpenPlatform_Share_ShareTtl), "inapp", arrayList, new LarkShareContainerUiConfig.UiCallback() {
                    /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488629.C488631 */

                    @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig.UiCallback
                    /* renamed from: b */
                    public void mo146281b() {
                        if (aVar != null) {
                            aVar.mo142987a(shareAppResult);
                        }
                        C48864a.m192492a(C48866b.f122757f, f, str);
                        C48853a.m192478a(f, str, "cancel", C48853a.m192474a(shareAppResult.mo170670a()));
                        C53241h.m205899c("ShareAppUtil", " cancel share container");
                    }

                    @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerUiConfig.UiCallback
                    /* renamed from: a */
                    public void mo146280a() {
                        if (aVar != null) {
                            aVar.mo142986a();
                        }
                        C48864a.m192492a(C48866b.f122756e, f, str);
                        new OPMonitor("openplatform_application_share_view").addCategoryValue("op_tracking", str).addCategoryValue("subview", "card").addCategoryValue("application_id", f).addCategoryValue("scene_type", "none").addCategoryValue("solution_id", "none").reportPlatform(4).flush();
                        C53241h.m205899c("ShareAppUtil", " show share container");
                    }
                }), larkShareContainerConfig);
            }
        });
    }

    /* renamed from: a */
    private static String m192475a(ShareAppType shareAppType) {
        return C488563.f122726a[shareAppType.ordinal()] != 2 ? "lark.container.app.share.link" : "lark.container.app_page.share.link";
    }

    /* renamed from: a */
    private static void m192477a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("entry_name", str2);
            jSONObject.put("op_tracking", str2);
        } catch (JSONException e) {
            C53241h.m205895a("ShareAppUtil", "op share click json put err ", e);
        }
        OpenPlatformModule.m192198d().sendEvent("op_share_click", jSONObject);
    }

    /* renamed from: a */
    public static void m192478a(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", str);
            jSONObject.put("entry_name", str2);
            jSONObject.put(UpdateKey.STATUS, str3);
            jSONObject.put("share_type", str4);
            jSONObject.put("op_tracking", str2);
        } catch (JSONException e) {
            C53241h.m205895a("ShareAppUtil", "op share finish json put err ", e);
        }
        OpenPlatformModule.m192198d().sendEvent("op_share_finish", jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.openplatform.shareApp.a.a$3 */
    public static /* synthetic */ class C488563 {

        /* renamed from: a */
        static final /* synthetic */ int[] f122726a;

        /* renamed from: b */
        static final /* synthetic */ int[] f122727b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult$ShareTab[] r0 = com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult.ShareTab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488563.f122727b = r0
                r1 = 1
                com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult$ShareTab r2 = com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult.ShareTab.TAB_CHAT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488563.f122727b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult$ShareTab r3 = com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult.ShareTab.TAB_LINK     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488563.f122727b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult$ShareTab r3 = com.ss.android.lark.openplatform.shareApp.dto.ShareAppResult.ShareTab.TAB_QRCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.ss.android.lark.openplatform.shareApp.dto.ShareAppType[] r2 = com.ss.android.lark.openplatform.shareApp.dto.ShareAppType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488563.f122726a = r2
                com.ss.android.lark.openplatform.shareApp.dto.ShareAppType r3 = com.ss.android.lark.openplatform.shareApp.dto.ShareAppType.SHARE_APP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488563.f122726a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.ss.android.lark.openplatform.shareApp.dto.ShareAppType r2 = com.ss.android.lark.openplatform.shareApp.dto.ShareAppType.SHARE_APP_PAGE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488563.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static LarkShareContainerConfig.LinkConfig m192469a(Context context) {
        return LarkShareContainerConfig.LinkConfig.f137448h.mo189908a(context.getString(R.string.Lark_Legacy_PersoncardResetError), new LarkShareContainerConfig.RetryCallback() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.AnonymousClass11 */

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.RetryCallback
            /* renamed from: a */
            public void mo146277a() {
                C53241h.m205899c("ShareAppUtil", " share link retry ");
            }
        });
    }

    /* renamed from: b */
    private static LarkShareContainerConfig.QrcodeConfig m192479b(Context context) {
        return LarkShareContainerConfig.QrcodeConfig.f137460f.mo189923a(context.getString(R.string.Lark_Legacy_PersoncardResetError), new LarkShareContainerConfig.RetryCallback() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.C488552 */

            @Override // com.ss.android.lark.thirdshare.container.LarkShareContainerConfig.RetryCallback
            /* renamed from: a */
            public void mo146277a() {
                C53241h.m205899c("ShareAppUtil", " share qr retry ");
            }
        });
    }

    /* renamed from: b */
    private static String m192480b(ShareAppType shareAppType) {
        if (C488563.f122726a[shareAppType.ordinal()] != 2) {
            return "lark.container.app.share.qrcode";
        }
        return "lark.container.app_page.share.qrcode";
    }

    /* renamed from: a */
    public static AppShareInfo m192468a(final String str) {
        int i;
        String c = C48822a.m192352c();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cli_id", str);
            jSONObject.put("lark_version", OpenPlatformModule.m192198d().getAppVersionName());
            if (OpenPlatformModule.m192198d().isDeskTopMode()) {
                i = PlatformType.PlatformTypeAndroidpad.getNumber();
            } else {
                i = PlatformType.PlatformTypeAndroidMobile.getNumber();
            }
            jSONObject.put("platform", i);
        } catch (JSONException e) {
            C53241h.m205895a("ShareAppUtil", " get app share info err ", e);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + OpenPlatformModule.m192198d().getSession());
        return (AppShareInfo) SdkSender.syncSend(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(c).mo55533c(jSONObject.toString()).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap), new SdkSender.IParser<AppShareInfo>() {
            /* class com.ss.android.lark.openplatform.shareApp.p2404a.C48853a.AnonymousClass10 */

            /* renamed from: a */
            public AppShareInfo parse(byte[] bArr) throws IOException {
                try {
                    JSONObject jSONObject = new JSONObject(SendHttpResponse.ADAPTER.decode(bArr).json_body);
                    int i = jSONObject.getInt("code");
                    if (i == 0) {
                        AppShareInfo appShareInfo = (AppShareInfo) new Gson().fromJson(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), AppShareInfo.class);
                        C48864a.m192492a(C48866b.f122765n, str, "");
                        return appShareInfo;
                    }
                    String optString = jSONObject.optString("msg");
                    C53241h.m205894a("ShareAppUtil", " get share info err msg " + optString);
                    C48864a.m192495b(C48866b.f122766o, str, "").addCategoryValue("code", Integer.valueOf(i)).flush();
                    return null;
                } catch (Exception e) {
                    C53241h.m205895a("ShareAppUtil", " get share info err ", e);
                    return null;
                }
            }
        });
    }

    /* renamed from: a */
    public static String m192474a(ShareAppResult.ShareTab shareTab) {
        int i = C488563.f122727b[shareTab.ordinal()];
        if (i == 2) {
            return "link";
        }
        if (i != 3) {
            return "card";
        }
        return "qr_code";
    }

    /* renamed from: a */
    public static LarkShareContainerConfig.LinkConfig m192470a(Context context, C48869c cVar, LarkShareContainerConfig.LinkCallback linkCallback) {
        if (cVar.mo170682b() != null && !TextUtils.isEmpty(cVar.mo170684c())) {
            return m192471a(context, cVar.mo170682b(), cVar.mo170679a(), cVar.mo170684c(), linkCallback);
        }
        if (cVar.mo170682b() == null) {
            AppShareInfo a = m192468a(cVar.mo170690f());
            if (a == null) {
                return m192469a(context);
            }
            cVar.mo170689e(a.getAppName());
            cVar.mo170687d(a.getAvatarKey());
            cVar.mo170691f(a.getAppDesc());
            cVar.mo170694i();
        }
        if (TextUtils.isEmpty(cVar.mo170684c())) {
            String a2 = C48820c.m192347a(cVar.mo170686d(), "op_share", 0);
            if (TextUtils.isEmpty(a2)) {
                return m192469a(context);
            }
            cVar.mo170681a(a2);
        }
        return m192471a(context, cVar.mo170682b(), cVar.mo170679a(), cVar.mo170684c(), linkCallback);
    }

    /* renamed from: a */
    public static LarkShareContainerConfig.QrcodeConfig m192472a(Context context, C48869c cVar, LarkShareContainerConfig.QrcodeCallback qrcodeCallback) {
        if (cVar.mo170682b() != null && !TextUtils.isEmpty(cVar.mo170684c())) {
            return m192473a(cVar.mo170682b(), cVar.mo170679a(), cVar.mo170684c(), qrcodeCallback);
        }
        if (cVar.mo170682b() == null) {
            AppShareInfo a = m192468a(cVar.mo170690f());
            if (a == null) {
                return m192479b(context);
            }
            cVar.mo170689e(a.getAppName());
            cVar.mo170687d(a.getAvatarKey());
            cVar.mo170691f(a.getAppDesc());
            cVar.mo170694i();
        }
        if (TextUtils.isEmpty(cVar.mo170684c())) {
            String a2 = C48820c.m192347a(cVar.mo170686d(), "op_share", 0);
            if (TextUtils.isEmpty(a2)) {
                return m192479b(context);
            }
            cVar.mo170681a(a2);
        }
        return m192473a(cVar.mo170682b(), cVar.mo170679a(), cVar.mo170684c(), qrcodeCallback);
    }

    /* renamed from: a */
    private static LarkShareContainerConfig.QrcodeConfig m192473a(LarkShareContainerConfig.Head head, ShareAppType shareAppType, String str, LarkShareContainerConfig.QrcodeCallback qrcodeCallback) {
        LarkShareContainerConfig.QrcodeConfig a = LarkShareContainerConfig.QrcodeConfig.f137460f.mo189924a(m192480b(shareAppType), head, str, qrcodeCallback);
        a.mo189914b(UIHelper.mustacheFormat((int) R.string.OpenPlatform_Share_QrCodeDesc));
        return a;
    }

    /* renamed from: a */
    private static LarkShareContainerConfig.LinkConfig m192471a(Context context, LarkShareContainerConfig.Head head, ShareAppType shareAppType, String str, LarkShareContainerConfig.LinkCallback linkCallback) {
        HashMap hashMap = new HashMap();
        hashMap.put("link", str);
        hashMap.put("APP_DISPLAY_NAME", UIHelper.getString(R.string.Lark_App_Name));
        return LarkShareContainerConfig.LinkConfig.f137448h.mo189909a(m192475a(shareAppType), context.getString(R.string.OpenPlatform_Share_LinkCopiedTtl), head, UIHelper.mustacheFormat((int) R.string.OpenPlatform_Share_SharePlaceholder, hashMap), str, linkCallback);
    }
}
