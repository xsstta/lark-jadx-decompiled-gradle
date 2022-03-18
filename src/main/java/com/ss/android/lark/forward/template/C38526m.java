package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.videoconference.v1.ShareVideoChatRequest;
import com.ss.android.lark.pb.videoconference.v1.ShareVideoChatResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.forward.template.m */
public class C38526m {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m151926a(byte[] bArr) throws IOException {
        return ShareVideoChatResponse.ADAPTER.decode(bArr);
    }

    /* renamed from: b */
    private static AbstractC38405a m151929b(Context context, String str, String str2) {
        return new AbstractC38405a(str, str2, context) {
            /* class com.ss.android.lark.forward.template.$$Lambda$m$IHlq7tOvJwjrTapjV98cNSYnUXM */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Context f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
            public final void onForward(List list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
                C38526m.m151927a(this.f$0, this.f$1, this.f$2, list, bundle, aVar);
            }
        };
    }

    /* renamed from: a */
    public static ForwardTemplate m151925a(Context context, String str, String str2) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140610a(new ForwardFeature.C38394a().mo140775a(false).mo140780e(true).mo140777b());
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140898c(UIHelper.getString(R.string.Lark_View_ShareMeetingToColon)).mo140897b());
        return aVar.mo140617a(m151929b(context, str, str2));
    }

    /* renamed from: a */
    public static void m151928a(List<String> list, Bundle bundle, String str) {
        String string = bundle.getString("key_param_addition_note");
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(str)) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(string)) {
                    C38364a.m151054a().mo140442d().mo140483a(str2, string, (Map<String, String>) null, (IGetDataCallback<String>) null);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m151927a(String str, final String str2, final Context context, List list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ForwardTarget) it.next()).mo140567b());
        }
        SdkSender.asynSendRequestNonWrap(Command.SHARE_VIDEO_CHAT, new ShareVideoChatRequest.C51054a().mo176246a(str).mo176247a(new ArrayList()).mo176250b(arrayList).mo176249b(str2).mo176245a(ShareVideoChatRequest.ShareFrom.FROM_QR_CODE), new IGetDataCallback<ShareVideoChatResponse>() {
            /* class com.ss.android.lark.forward.template.C38526m.C385271 */

            /* renamed from: a */
            public void onSuccess(ShareVideoChatResponse shareVideoChatResponse) {
                Log.m165389i("VideoChatForwardTemplateFactory", "[shareVideoChat] success " + shareVideoChatResponse.toString());
                if (shareVideoChatResponse == null || shareVideoChatResponse.banned_group_ids == null || shareVideoChatResponse.banned_group_ids.size() <= 0) {
                    C38526m.m151928a(arrayList, bundle, str2);
                    aVar.mo140599a(-1, (Intent) null);
                    return;
                }
                m151930b(shareVideoChatResponse);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (TemplateFactoryUtils.m151923a(errorResult)) {
                    aVar.mo140599a(-1, (Intent) null);
                    return;
                }
                Log.m165383e("VideoChatForwardTemplateFactory", "[shareVideoChat] error " + errorResult.toString());
                C38364a.m151054a().mo140455q().mo140521a(errorResult, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.forward.template.C38526m.C385271.C385281 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        aVar.mo140601a(str, false);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        aVar.mo140601a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_ChatViewForwardingFailed)), false);
                    }
                });
            }

            /* renamed from: b */
            private void m151930b(ShareVideoChatResponse shareVideoChatResponse) {
                String str;
                AbstractC38365a.AbstractC38368c d = C38364a.m151054a().mo140442d();
                if (d != null) {
                    StringBuilder sb = new StringBuilder();
                    for (String str2 : shareVideoChatResponse.banned_group_ids) {
                        Chat a = d.mo140469a(str2);
                        if (a != null && !TextUtils.isEmpty(a.getName())) {
                            sb.append(a.getName());
                            sb.append("、");
                        }
                    }
                    if (sb.length() - 1 >= 0) {
                        str = sb.substring(0, sb.length() - 1);
                        HashMap hashMap = new HashMap();
                        hashMap.put("group_count", shareVideoChatResponse.banned_group_ids.size() + "");
                        hashMap.put("group_name", str);
                        aVar.mo140600a(context.getResources().getString(R.string.View_M_FailedInvitation), UIHelper.mustacheFormat((int) R.string.View_M_BannedFromPostingGroupCountGroupName, hashMap), true);
                    }
                }
                str = "";
                HashMap hashMap2 = new HashMap();
                hashMap2.put("group_count", shareVideoChatResponse.banned_group_ids.size() + "");
                hashMap2.put("group_name", str);
                aVar.mo140600a(context.getResources().getString(R.string.View_M_FailedInvitation), UIHelper.mustacheFormat((int) R.string.View_M_BannedFromPostingGroupCountGroupName, hashMap2), true);
            }
        }, $$Lambda$m$hgnoKNEkNNfIA2xFf1kF2wWrv2U.INSTANCE);
    }
}
