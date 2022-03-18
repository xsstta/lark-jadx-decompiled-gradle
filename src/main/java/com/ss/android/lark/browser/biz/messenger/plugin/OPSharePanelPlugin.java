package com.ss.android.lark.browser.biz.messenger.plugin;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.lark.webview.container.impl.menu.C19885d;
import com.larksuite.component.openplatform.plugins.utils.ApiCode;
import com.larksuite.component.openplatform.plugins.utils.C25613c;
import com.larksuite.component.webview.container.dto.C25835f;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.UG;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.biz.messenger.plugin.OPSharePanelPlugin;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class OPSharePanelPlugin extends AbstractC25889a {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public int priority() {
        return 3;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.browser.biz.messenger.plugin.OPSharePanelPlugin$a */
    public static class C29869a implements C19885d.AbstractC19890c {

        /* renamed from: a */
        public String f74604a;

        /* renamed from: b */
        private AbstractC25905b f74605b;

        /* renamed from: c */
        private UG.ShareRequest f74606c;

        /* renamed from: d */
        private AbstractC25897h<UG.ShareResponse> f74607d;

        @Override // com.bytedance.lark.webview.container.impl.menu.C19885d.AbstractC19890c
        public void onMenuItemClick() {
            this.f74606c.mChannelType = new ArrayList<String>() {
                /* class com.ss.android.lark.browser.biz.messenger.plugin.OPSharePanelPlugin.C29869a.C298701 */

                {
                    add(C29869a.this.f74604a);
                }
            };
            this.f74605b.mo92209a("share", this.f74606c, new AbstractC25897h() {
                /* class com.ss.android.lark.browser.biz.messenger.plugin.$$Lambda$OPSharePanelPlugin$a$I1qt3fIb2dIwNvlqNdqTBWRyg */

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25897h
                public final void callback(Object obj) {
                    OPSharePanelPlugin.C29869a.this.m110438a((UG.ShareResponse) obj);
                }
            }, UG.ShareResponse.class);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m110438a(UG.ShareResponse shareResponse) {
            AbstractC25897h<UG.ShareResponse> hVar = this.f74607d;
            if (hVar != null) {
                hVar.callback(shareResponse);
            } else {
                Log.m165383e("OPSharePanelPlugin", "invoke is null");
            }
        }

        public C29869a(String str, AbstractC25905b bVar, UG.ShareRequest shareRequest, AbstractC25897h<UG.ShareResponse> hVar) {
            this.f74604a = str;
            this.f74605b = bVar;
            this.f74606c = shareRequest;
            this.f74607d = hVar;
        }
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        if ("share".equals(lKEvent.mo92146m()) && lKEvent.mo92147n() != null) {
            UG.ShareRequest shareRequest = (UG.ShareRequest) JSON.parseObject(lKEvent.mo92147n().toString(), UG.ShareRequest.class);
            checkChannelType(shareRequest);
            if (shareRequest.mChannelType.size() == 1) {
                Log.m165389i("OPSharePanelPlugin", "process handle to UG Share");
                return lKEvent.mo92155v();
            }
        }
        return super.handleEvent(lKEvent);
    }

    private boolean checkChannelType(UG.ShareRequest shareRequest) {
        ArrayList arrayList = new ArrayList();
        for (UG.ShareChannelType shareChannelType : UG.ShareChannelType.values()) {
            arrayList.add(shareChannelType.mValue);
        }
        if (shareRequest.mChannelType.isEmpty()) {
            return true;
        }
        Iterator<String> it = shareRequest.mChannelType.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (TextUtils.isEmpty(next)) {
                it.remove();
            } else if (!arrayList.contains(next)) {
                return false;
            }
        }
        return true;
    }

    private void callbackFail(AbstractC25897h<UG.ShareResponse> hVar, int i, String str) {
        UG.ShareResponse shareResponse = new UG.ShareResponse();
        shareResponse.mErrorCode = i;
        shareResponse.mErrorMessage = str;
        hVar.callback(shareResponse);
    }

    public /* synthetic */ void lambda$shareAsync$0$OPSharePanelPlugin(AbstractC25905b bVar, List list, final AbstractC25897h hVar) {
        C19885d.m72578b(bVar.mo92207a(), list, new C25835f.C25837a("").mo91912a(2).mo91917d(bVar.mo92207a().getString(R.string.OpenPlatform_Share_ShareTitle)).mo91914a(), new C19885d.AbstractC19888a() {
            /* class com.ss.android.lark.browser.biz.messenger.plugin.OPSharePanelPlugin.C298681 */

            @Override // com.bytedance.lark.webview.container.impl.menu.C19885d.AbstractC19888a
            /* renamed from: a */
            public void mo67391a() {
                UG.ShareResponse shareResponse = new UG.ShareResponse();
                shareResponse.mErrorCode = ApiCode.GENERAL_CANCEL.code;
                shareResponse.mErrorMessage = ApiCode.GENERAL_CANCEL.msg;
                hVar.callback(shareResponse);
            }
        });
    }

    @LKPluginFunction(async = true, eventName = {"share"})
    public void shareAsync(UG.ShareRequest shareRequest, AbstractC25905b bVar, AbstractC25897h<UG.ShareResponse> hVar) {
        boolean z;
        Log.m165389i("OPSharePanelPlugin", "handle share panel!");
        UG.ShareContentType[] values = UG.ShareContentType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (values[i].mValue.equals(shareRequest.mContentType)) {
                if (UG.ShareContentType.TEXT.mValue.equals(shareRequest.mContentType)) {
                    if (TextUtils.isEmpty(shareRequest.mContent)) {
                        Log.m165383e("OPSharePanelPlugin", "content type is text,but content is empty.");
                        callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "content is empty");
                        return;
                    }
                } else if (UG.ShareContentType.IMAGE.mValue.equals(shareRequest.mContentType)) {
                    if (TextUtils.isEmpty(shareRequest.mImage)) {
                        Log.m165383e("OPSharePanelPlugin", "content type is image,but image invalid.");
                        callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "image base64 invalid!");
                        return;
                    }
                } else if (UG.ShareContentType.WEB_URL.mValue.equals(shareRequest.mContentType) && (TextUtils.isEmpty(shareRequest.mUrl) || TextUtils.isEmpty(shareRequest.mTitle))) {
                    Log.m165383e("OPSharePanelPlugin", "content type is url,but url or title is empty. url:" + shareRequest.mUrl + " title:" + shareRequest.mTitle);
                    callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "url or title is empty");
                    return;
                }
                z = true;
            } else {
                i++;
            }
        }
        if (!z) {
            Log.m165389i("OPSharePanelPlugin", "content type is invalid");
            callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "content type not support");
        } else if (!checkChannelType(shareRequest)) {
            Log.m165383e("OPSharePanelPlugin", "share error.");
            callbackFail(hVar, ApiCode.GENERAL_PARAM.code, "share error. not support this channel type");
        } else {
            LinkedList linkedList = new LinkedList();
            if (shareRequest.mChannelType.isEmpty()) {
                shareRequest.mChannelType.add(UG.ShareChannelType.WX.mValue);
                shareRequest.mChannelType.add(UG.ShareChannelType.WX_TIMELINE.mValue);
            }
            for (String str : shareRequest.mChannelType) {
                Log.m165389i("OPSharePanelPlugin", "channel type:" + str);
                C29869a aVar = new C29869a(str, bVar, shareRequest, hVar);
                if (UG.ShareChannelType.WX.mValue.equals(str)) {
                    linkedList.add(createShareItem(bVar.mo92207a(), R.drawable.ud_icon_wechat_colorful, R.string.OpenPlatform_Share_WeChat, aVar));
                } else if (UG.ShareChannelType.WX_TIMELINE.mValue.equals(str)) {
                    linkedList.add(createShareItem(bVar.mo92207a(), R.drawable.ud_icon_wechat_friend_colorful, R.string.OpenPlatform_Share_WeChat_Moments, aVar));
                } else if (UG.ShareChannelType.SYSTEM.mValue.equals(str)) {
                    C19885d.C19889b createShareItem = createShareItem(bVar.mo92207a(), R.drawable.ud_icon_more_outlined, R.string.Lark_Legacy_MoreTipLabel, aVar);
                    createShareItem.mo67393a(false);
                    linkedList.add(createShareItem);
                }
            }
            C25613c.m91382a(new Runnable(bVar, linkedList, hVar) {
                /* class com.ss.android.lark.browser.biz.messenger.plugin.$$Lambda$OPSharePanelPlugin$buvXZLDnEb9fNYbDSPwMrAJ4Mw */
                public final /* synthetic */ AbstractC25905b f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ AbstractC25897h f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    OPSharePanelPlugin.this.lambda$shareAsync$0$OPSharePanelPlugin(this.f$1, this.f$2, this.f$3);
                }
            });
        }
    }

    private C19885d.C19889b createShareItem(Context context, int i, int i2, C29869a aVar) {
        C19885d.C19889b bVar = new C19885d.C19889b(UIUtils.getString(context, i2), aVar);
        bVar.mo67395b(i);
        bVar.mo67393a(true);
        return bVar;
    }
}
