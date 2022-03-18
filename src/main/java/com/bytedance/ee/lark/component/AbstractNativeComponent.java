package com.bytedance.ee.lark.component;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.lark.component.p607a.C12717a;
import com.bytedance.ee.lark.component.p607a.p611d.C12723a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import org.json.JSONException;

public abstract class AbstractNativeComponent implements AbstractC12716a {
    private ViewGroup mContainer;
    private Context mContext;
    private JSONObject mData;
    private JSONObject mDataExtra;
    public C12717a mNativeComponentContext;
    private C12723a mNativeComponentModel;
    private String mViewId;
    private String mViewType;

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public ViewGroup getContainer() {
        return this.mContainer;
    }

    public Context getContext() {
        return this.mContext;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public JSONObject getData() {
        return this.mData;
    }

    public JSONObject getDataExtra() {
        return this.mDataExtra;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public String getViewId() {
        return this.mViewId;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public String getViewType() {
        return this.mViewType;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public int getZIndex() {
        C12723a aVar = this.mNativeComponentModel;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo48179b();
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public int getHeight() {
        if (this.mNativeComponentModel == null) {
            return 0;
        }
        return Math.round(this.mContext.getResources().getDisplayMetrics().density * this.mNativeComponentModel.mo48182e());
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public int getWidth() {
        if (this.mNativeComponentModel == null) {
            return 0;
        }
        return Math.round(this.mContext.getResources().getDisplayMetrics().density * this.mNativeComponentModel.mo48181d());
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void bindContainer(ViewGroup viewGroup) {
        this.mContainer = viewGroup;
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void updateData(JSONObject jSONObject) {
        C12723a aVar = this.mNativeComponentModel;
        if (aVar != null) {
            aVar.mo48178a(jSONObject);
            this.mData = jSONObject;
        }
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void bindData(C12723a aVar) {
        if (aVar == null || aVar.mo48176a() == null) {
            Log.m165383e("AbstractNativeComponent", "component model data is invalid");
            return;
        }
        this.mNativeComponentModel = aVar;
        this.mDataExtra = aVar.mo48180c();
        this.mData = aVar.mo48176a();
    }

    public void fireEvent(final String str, final JSONObject jSONObject) {
        this.mContainer.post(new Runnable() {
            /* class com.bytedance.ee.lark.component.AbstractNativeComponent.RunnableC127141 */

            public void run() {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put(ShareHitPoint.f121869d, AbstractNativeComponent.this.getViewType());
                    jSONObject2.put("event", str);
                    jSONObject2.put("id", AbstractNativeComponent.this.getViewId());
                    jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject);
                    jSONObject.put("callbackID", "nativeComponentAction");
                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject2);
                    jSONObject.put("callbackType", "continued");
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put("bizDomain", "open_platform");
                    jSONObject.put("extra", jSONObject3);
                    AbstractNativeComponent.this.mNativeComponentContext.mo48167b().evaluateJavascript(String.format("LarkWebViewJavaScriptBridge.nativeCallBack(%s)", jSONObject.toString()), new ValueCallback<String>() {
                        /* class com.bytedance.ee.lark.component.AbstractNativeComponent.RunnableC127141.C127151 */

                        /* renamed from: a */
                        public void onReceiveValue(String str) {
                            Log.m165389i("AbstractNativeComponent", "onReceiveValue, value = " + str);
                        }
                    });
                } catch (JSONException e) {
                    Log.m165383e("AbstractNativeComponent", "fireEvent, JSON exception = " + e.getMessage());
                }
            }
        });
    }

    @Override // com.bytedance.ee.lark.component.AbstractC12716a
    public void setWidthAndHeight(int i, int i2) {
        if (this.mNativeComponentModel != null) {
            float f = this.mContext.getResources().getDisplayMetrics().density;
            this.mNativeComponentModel.mo48177a(((float) i) / f, ((float) i2) / f);
        }
    }

    public AbstractNativeComponent(C12717a aVar, String str, String str2) {
        this.mViewId = str;
        this.mViewType = str2;
        this.mNativeComponentContext = aVar;
        this.mContext = aVar.mo48166a();
    }
}
