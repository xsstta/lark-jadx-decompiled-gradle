package com.bytedance.bdturing;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.bdturing.C3553h;
import com.bytedance.bdturing.p207c.AbstractC3528a;
import com.bytedance.bdturing.p207c.C3529b;
import com.bytedance.bdturing.p207c.C3534c;
import com.bytedance.bdturing.p207c.C3537e;
import com.bytedance.bdturing.p209e.C3542b;
import com.bytedance.bdturing.verify.request.RiskInfoRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SmarterVerifyButton extends VerifyWebView {

    /* renamed from: a */
    public long f11113a;

    /* renamed from: b */
    public boolean f11114b;

    /* renamed from: c */
    public C3553h f11115c = new C3553h();

    /* renamed from: d */
    public AbstractC3526b f11116d;

    /* renamed from: e */
    public AbstractC3571m f11117e = new AbstractC3571m() {
        /* class com.bytedance.bdturing.SmarterVerifyButton.C35132 */

        @Override // com.bytedance.bdturing.AbstractC3571m
        /* renamed from: a */
        public void mo14250a() {
            SmarterVerifyButton.this.f11113a = System.currentTimeMillis();
            SmarterVerifyButton.this.f11131h = true;
            EventReport.m14807a(0, "success");
        }

        @Override // com.bytedance.bdturing.AbstractC3571m
        /* renamed from: a */
        public void mo14251a(int i, String str) {
            EventReport.m14807a(i, str);
        }
    };

    /* renamed from: j */
    private C3529b f11118j;

    /* renamed from: k */
    private AbstractC3528a f11119k = new C3537e() {
        /* class com.bytedance.bdturing.SmarterVerifyButton.C35121 */

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14248a(C3534c cVar) {
            cVar.mo14311a(1, C3520a.m14831a().mo14275c().mo14212b(5));
        }

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14249a(String str, AbstractC3526b bVar) {
            C3520a a = C3520a.m14831a();
            Activity a2 = C3542b.m14901a(SmarterVerifyButton.this.getContext());
            RiskInfoRequest jVar = new RiskInfoRequest(str);
            jVar.mo14344c(false);
            a.mo14272a(a2, jVar, bVar);
        }

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14247a(int i, String str, String str2, String str3, String str4) {
            if (SmarterVerifyButton.this.f11116d == null) {
                return;
            }
            if (i == 0) {
                SmarterVerifyButton.this.f11114b = true;
                SmarterVerifyButton.this.f11116d.mo14294b(i, null);
                return;
            }
            SmarterVerifyButton.this.f11116d.mo14293a(i, null);
        }
    };

    public void setCallback(AbstractC3526b bVar) {
        this.f11116d = bVar;
    }

    /* renamed from: a */
    public void mo14244a(JSONObject jSONObject) {
        this.f11118j.mo14304a(C3534c.m14872a(1, "bytedcert.verifyData", "call", jSONObject, "bytedcert.verifyData"));
    }

    public SmarterVerifyButton(Context context) {
        super(context);
    }

    @Override // com.bytedance.bdturing.VerifyWebView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!C3520a.m14831a().mo14276d() || !this.f11131h || this.f11114b) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11115c.mo14360a();
        } else if (action == 1) {
            this.f11115c.mo14361a(motionEvent, new C3553h.AbstractC3554a() {
                /* class com.bytedance.bdturing.SmarterVerifyButton.C35143 */

                @Override // com.bytedance.bdturing.C3553h.AbstractC3554a
                /* renamed from: a */
                public void mo14252a(JSONObject jSONObject) {
                    try {
                        jSONObject.put("operate_duration", SmarterVerifyButton.this.f11115c.mo14362b() - SmarterVerifyButton.this.f11113a);
                        JSONArray jSONArray = jSONObject.getJSONArray("click_coordinate");
                        jSONArray.put(SmarterVerifyButton.this.getWidth());
                        jSONArray.put(SmarterVerifyButton.this.getHeight());
                        Log.i("SmarterVerifyButton", "data = " + jSONObject);
                        SmarterVerifyButton.this.mo14244a(jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return super.onTouchEvent(motionEvent);
    }

    public SmarterVerifyButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
