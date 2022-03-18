package com.bytedance.bdturing;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.bdturing.C3553h;
import com.bytedance.bdturing.p209e.C3542b;
import com.bytedance.bdturing.verify.request.SmarterVerifyRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SmarterVerifyView extends FrameLayout {

    /* renamed from: a */
    private AbstractC3526b f11123a;

    /* renamed from: b */
    private C3553h f11124b = new C3553h();

    public void setCallBack(AbstractC3526b bVar) {
        this.f11123a = bVar;
    }

    public SmarterVerifyView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo14253a(JSONObject jSONObject) {
        C3520a a = C3520a.m14831a();
        SmarterVerifyRequest kVar = new SmarterVerifyRequest("smartest_verify", jSONObject);
        kVar.mo14344c(false);
        a.mo14272a(C3542b.m14901a(getContext()), kVar, this.f11123a);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!C3520a.m14831a().mo14276d()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11124b.mo14360a();
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.f11124b.mo14361a(motionEvent, new C3553h.AbstractC3554a() {
                /* class com.bytedance.bdturing.SmarterVerifyView.C35151 */

                @Override // com.bytedance.bdturing.C3553h.AbstractC3554a
                /* renamed from: a */
                public void mo14252a(JSONObject jSONObject) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("click_coordinate");
                        jSONArray.put(SmarterVerifyView.this.getWidth());
                        jSONArray.put(SmarterVerifyView.this.getHeight());
                        Log.i("SmarterVerifyView", "data = " + jSONObject);
                        SmarterVerifyView.this.mo14253a(jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
            return false;
        }
    }

    public SmarterVerifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmarterVerifyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
