package com.ss.android.lark.forward.template;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.dto.template.IForwardProxyExecutor;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareForwardTemplateFactory {

    /* access modifiers changed from: private */
    public static class ForwardProxyExecutor implements IForwardProxyExecutor {
        public static final Parcelable.Creator<ForwardProxyExecutor> CREATOR = new Parcelable.Creator<ForwardProxyExecutor>() {
            /* class com.ss.android.lark.forward.template.ShareForwardTemplateFactory.ForwardProxyExecutor.C384912 */

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
        public void mo140901a(List<ForwardTarget> list, Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
            Message message = (Message) bundle.getSerializable("share_data");
            JSONArray jSONArray = new JSONArray();
            ArrayList<String> arrayList = new ArrayList();
            for (ForwardTarget forwardTarget : list) {
                arrayList.add(forwardTarget.mo140567b());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", forwardTarget.mo140567b());
                    jSONObject.put("name", forwardTarget.mo140568c());
                    jSONObject.put("avatar", forwardTarget.mo140569d());
                    if (forwardTarget.mo140572f() != null) {
                        jSONObject.put("chatType", forwardTarget.mo140572f().isP2PChat());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (String str : arrayList) {
                if (!TextUtils.isEmpty(str)) {
                    C38364a.m151054a().mo140442d().mo140478a(str, message, new IGetDataCallback<String>() {
                        /* class com.ss.android.lark.forward.template.ShareForwardTemplateFactory.ForwardProxyExecutor.C384901 */

                        /* renamed from: a */
                        public void onSuccess(String str) {
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            if (!TemplateFactoryUtils.m151923a(errorResult) && !atomicBoolean.get()) {
                                atomicBoolean.set(true);
                                aVar.mo140601a((String) null, false);
                            }
                        }
                    });
                }
            }
            Intent intent = new Intent();
            intent.putExtra("share_data", jSONArray.toString());
            aVar.mo140599a(-1, intent);
        }
    }

    /* renamed from: a */
    public static ForwardTemplate m151836a(Context context, Message message, ShareModel shareModel) {
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        aVar.mo140610a(new ForwardFeature.C38394a().mo140780e(false).mo140777b());
        ForwardViewDependency.C38404a aVar2 = new ForwardViewDependency.C38404a();
        BasicDialogContent.C38391a aVar3 = new BasicDialogContent.C38391a();
        aVar.mo140615a(aVar2.mo140891a(aVar3.mo140730a(UIUtils.getString(context, R.string.Lark_Legacy_ShareHolder) + shareModel.getTitle()).mo140732a()).mo140897b());
        aVar.mo140612a(new ForwardLaunchParam.C38396a().mo140813a(1).mo140814b());
        Bundle bundle = new Bundle();
        bundle.putSerializable("share_data", message);
        aVar.mo140609a(bundle);
        return aVar.mo140616a(new ForwardProxyExecutor());
    }
}
