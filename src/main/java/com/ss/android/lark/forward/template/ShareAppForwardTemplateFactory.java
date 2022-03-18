package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.BaseShareData;
import com.ss.android.lark.forward.dto.CardLink;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ShareAppPage;
import com.ss.android.lark.forward.dto.ShareCommonH5;
import com.ss.android.lark.forward.dto.ShareLittleApp;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.IForwardProxyExecutor;
import com.ss.android.lark.forward.impl.statistics.AppreciablePerformance;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareAppForwardTemplateFactory {

    /* access modifiers changed from: private */
    public static class ForwardProxyExecutor implements IForwardProxyExecutor {
        public static final Parcelable.Creator<ForwardProxyExecutor> CREATOR = new Parcelable.Creator<ForwardProxyExecutor>() {
            /* class com.ss.android.lark.forward.template.ShareAppForwardTemplateFactory.ForwardProxyExecutor.C384862 */

            /* renamed from: a */
            public ForwardProxyExecutor[] newArray(int i) {
                return new ForwardProxyExecutor[i];
            }

            /* renamed from: a */
            public ForwardProxyExecutor createFromParcel(Parcel parcel) {
                return new ForwardProxyExecutor();
            }
        };

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
        public void mo140901a(List<ForwardTarget> list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
            final String a = AppreciablePerformance.f98815c.mo140988a("ForwardPickFragment", 5);
            BaseShareData baseShareData = (BaseShareData) bundle.getParcelable("share_data");
            JSONArray jSONArray = new JSONArray();
            final ArrayList arrayList = new ArrayList();
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
            C384851 r18 = new IGetDataCallback<String>() {
                /* class com.ss.android.lark.forward.template.ShareAppForwardTemplateFactory.ForwardProxyExecutor.C384851 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    AppreciablePerformance.f98815c.mo140996b(a, 5);
                    ShareAppForwardTemplateFactory.m151807a(arrayList, bundle.getString("key_param_addition_note"));
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    AppreciablePerformance.f98815c.mo140991a(errorResult.getErrorCode(), errorResult.getMessage(), "ForwardPickFragment", 5);
                    if (!TemplateFactoryUtils.m151923a(errorResult)) {
                        aVar.mo140601a((String) null, false);
                    }
                }
            };
            if (baseShareData.mo140523a() != null) {
                AbstractC38365a.AbstractC38368c d = C38364a.m151054a().mo140442d();
                if (baseShareData instanceof ShareLittleApp) {
                    d.mo140484a(arrayList, 1, ((ShareLittleApp) baseShareData).mo140632b(), baseShareData.mo140523a(), "", "", "", r18);
                } else if (baseShareData instanceof ShareAppPage) {
                    ShareAppPage shareAppPage = (ShareAppPage) baseShareData;
                    d.mo140484a(arrayList, 2, shareAppPage.mo140618b(), baseShareData.mo140523a(), shareAppPage.mo140619c(), shareAppPage.mo140620d(), "", r18);
                } else if (baseShareData instanceof ShareCommonH5) {
                    CardLink a2 = baseShareData.mo140523a();
                    ShareCommonH5 shareCommonH5 = (ShareCommonH5) baseShareData;
                    d.mo140484a(arrayList, 3, "", a2, shareCommonH5.mo140625b(), shareCommonH5.mo140626c(), shareCommonH5.mo140627d(), r18);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m151807a(List<String> list, String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    C38364a.m151054a().mo140442d().mo140483a(str2, str, (Map<String, String>) null, (IGetDataCallback<String>) null);
                }
            }
        }
    }
}
