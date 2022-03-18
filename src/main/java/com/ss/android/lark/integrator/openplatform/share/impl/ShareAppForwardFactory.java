package com.ss.android.lark.integrator.openplatform.share.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.IForwardProxyExecutor;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppDataV2;
import com.ss.android.lark.openplatform.shareApp.dto.ShareAppType;
import com.ss.android.lark.pb.appshare.CardLink;
import com.ss.android.lark.pb.appshare.ShareApp;
import com.ss.android.lark.pb.appshare.ShareAppCardV2Request;
import com.ss.android.lark.pb.appshare.ShareAppCardV2Response;
import com.ss.android.lark.pb.appshare.ShareAppPage;
import com.ss.android.lark.pb.appshare.ShareH5;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareAppForwardFactory {

    /* access modifiers changed from: private */
    public static class ForwardProxyExecutor implements IForwardProxyExecutor {
        public static final Parcelable.Creator<ForwardProxyExecutor> CREATOR = new Parcelable.Creator<ForwardProxyExecutor>() {
            /* class com.ss.android.lark.integrator.openplatform.share.impl.ShareAppForwardFactory.ForwardProxyExecutor.C399462 */

            /* renamed from: a */
            public ForwardProxyExecutor[] newArray(int i) {
                return new ForwardProxyExecutor[i];
            }

            /* renamed from: a */
            public ForwardProxyExecutor createFromParcel(Parcel parcel) {
                return new ForwardProxyExecutor();
            }
        };

        /* renamed from: a */
        public ICoreApi f101646a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

        @Override // com.ss.android.lark.forward.dto.template.IForwardProxyExecutor
        /* renamed from: a */
        public void mo140900a(Activity activity) {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
        }

        ForwardProxyExecutor() {
        }

        @Override // com.ss.android.lark.forward.dto.template.IForwardProxyExecutor
        /* renamed from: a */
        public void mo140901a(List<ForwardTarget> list, Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
            ShareAppDataV2 shareAppDataV2 = (ShareAppDataV2) bundle.getSerializable("share_data");
            int i = bundle.getInt("share_type");
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = new ArrayList();
            for (ForwardTarget forwardTarget : list) {
                arrayList.add(forwardTarget.mo140567b());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", forwardTarget.mo140567b());
                    jSONObject.put("name", forwardTarget.mo140568c());
                    jSONObject.put("avatar", forwardTarget.mo140569d());
                    jSONObject.put("isBot", forwardTarget.mo140571e());
                    if (forwardTarget.mo140572f() != null) {
                        if (forwardTarget.mo140572f().isP2PChat()) {
                            jSONObject.put("chatType", "0");
                        } else {
                            jSONObject.put("chatType", "1");
                        }
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            Intent intent = new Intent();
            intent.putExtra("share_data", jSONArray.toString());
            aVar.mo140599a(-1, intent);
            ShareAppForwardFactory.m158560a(shareAppDataV2, ShareAppType.valueOf(i), arrayList, bundle.getString("key_param_addition_note"), new IGetDataCallback<Boolean>() {
                /* class com.ss.android.lark.integrator.openplatform.share.impl.ShareAppForwardFactory.ForwardProxyExecutor.C399451 */

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    C53241h.m205899c("ShareAppForwardFactory", " send share note message success " + bool);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C53241h.m205894a("ShareAppForwardFactory", " send note message " + errorResult.getDebugMsg());
                    if (ForwardProxyExecutor.this.f101646a.isAppreciableForwardError(errorResult)) {
                        aVar.mo140601a((String) null, false);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m158561a(List<String> list, String str) {
        if (!TextUtils.isEmpty(str)) {
            ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    iCoreApi.sendMessage(str2, str, null, null);
                }
            }
        }
    }

    /* renamed from: a */
    public static ForwardTemplate m158559a(Context context, ShareAppDataV2 shareAppDataV2, ShareAppType shareAppType) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        boolean z = false;
        aVar.mo140610a(new ForwardFeature.C38394a().mo140776b(false).mo140777b());
        if (shareAppType != ShareAppType.SHARE_APP_H5) {
            z = true;
        }
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(z).mo140846b());
        Bundle bundle = new Bundle();
        bundle.putSerializable("share_data", shareAppDataV2);
        bundle.putInt("share_type", shareAppType.getNumber());
        aVar.mo140609a(bundle);
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(1).mo140814b());
        return aVar.mo140616a(new ForwardProxyExecutor());
    }

    /* renamed from: a */
    public static void m158560a(ShareAppDataV2 shareAppDataV2, ShareAppType shareAppType, final List<String> list, final String str, final IGetDataCallback<Boolean> iGetDataCallback) {
        ShareAppCardV2Request.C49543a aVar = new ShareAppCardV2Request.C49543a();
        CardLink cardLink = new CardLink(shareAppDataV2.getHref(), shareAppDataV2.getIosHref(), shareAppDataV2.getAndroidHref(), shareAppDataV2.getPcHref());
        if (shareAppType == ShareAppType.SHARE_APP) {
            aVar.mo172774a(new ShareApp.C49541a().mo172768a(shareAppDataV2.getAppId()).mo172767a(cardLink).mo172769a(list).build()).mo172775a(ShareAppCardV2Request.AppShareType.SHARE_APP);
        } else if (shareAppType == ShareAppType.SHARE_APP_PAGE) {
            aVar.mo172776a(new ShareAppPage.C49547a().mo172787a(shareAppDataV2.getAppId()).mo172786a(cardLink).mo172790b(shareAppDataV2.getTitle()).mo172791c(shareAppDataV2.getImgKey()).mo172788a(list).build()).mo172775a(ShareAppCardV2Request.AppShareType.SHARE_APP_PAGE);
        } else if (shareAppType == ShareAppType.SHARE_APP_H5) {
            aVar.mo172777a(new ShareH5.C49549a().mo172795a(cardLink).mo172801d(shareAppDataV2.getAppId()).mo172796a(shareAppDataV2.getTitle()).mo172799b(shareAppDataV2.getImgKey()).mo172800c(shareAppDataV2.getDesc()).mo172797a(list).build()).mo172775a(ShareAppCardV2Request.AppShareType.SHARE_APP_H5);
        }
        SdkSender.sendPassThroughRequest(Command.APP_SHARE_V2, aVar, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.integrator.openplatform.share.impl.ShareAppForwardFactory.C399431 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ShareAppForwardFactory.m158561a(list, str);
                iGetDataCallback.onSuccess(bool);
            }
        }, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.integrator.openplatform.share.impl.ShareAppForwardFactory.C399442 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                ShareAppCardV2Response.ADAPTER.decode(bArr);
                return true;
            }
        });
    }
}
