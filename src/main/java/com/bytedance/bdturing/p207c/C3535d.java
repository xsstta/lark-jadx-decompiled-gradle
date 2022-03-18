package com.bytedance.bdturing.p207c;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.bytedance.bdturing.BdTuringConfig;
import com.bytedance.bdturing.C3567l;
import com.bytedance.bdturing.p209e.C3542b;
import com.bytedance.bdturing.twiceverify.C3582c;
import com.huawei.hms.adapter.internal.CommonCode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c.d */
public class C3535d implements AbstractC3528a {

    /* renamed from: a */
    public Activity f11167a;

    public C3535d(Activity activity) {
        this.f11167a = activity;
    }

    /* renamed from: b */
    public void mo14317b(String str) {
        Activity activity = this.f11167a;
        if (activity != null) {
            Toast.makeText(activity, str, 0).show();
        }
    }

    /* renamed from: a */
    public void mo14313a(final C3534c cVar) {
        try {
            final JSONObject jSONObject = new JSONObject(cVar.f11163c);
            C3567l.m15030a().mo14386a(new Runnable() {
                /* class com.bytedance.bdturing.p207c.C3535d.RunnableC35361 */

                /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0061 A[SYNTHETIC, Splitter:B:17:0x0061] */
                /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[Catch:{ Exception -> 0x00e7, all -> 0x00ca }] */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[Catch:{ Exception -> 0x00e7, all -> 0x00ca }] */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[Catch:{ Exception -> 0x00e7, all -> 0x00ca }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                    // Method dump skipped, instructions count: 259
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.p207c.C3535d.RunnableC35361.run():void");
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo14314a(String str) {
        if (this.f11167a != null) {
            C3582c.m15126a().mo14435c().mo14428a(this.f11167a, str);
        }
    }

    @Override // com.bytedance.bdturing.p207c.AbstractC3528a
    /* renamed from: b */
    public void mo14302b(C3534c cVar) {
        try {
            if (cVar.f11162b != null) {
                String str = cVar.f11162b;
                char c = 65535;
                switch (str.hashCode()) {
                    case -433891794:
                        if (str.equals("second_verify.close")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -431325456:
                        if (str.equals("second_verify.fetch")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -418116003:
                        if (str.equals("second_verify.toast")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -268991152:
                        if (str.equals("second_verify.hideLoading")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 103102532:
                        if (str.equals("second_verify.isSmsAvailable")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 239578933:
                        if (str.equals("second_verify.showLoading")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1807041893:
                        if (str.equals("second_verify.openSms")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        mo14313a(cVar);
                        return;
                    case 1:
                        JSONObject jSONObject = new JSONObject(cVar.f11163c);
                        mo14312a(jSONObject.optInt("status_code"), jSONObject.optString("message"));
                        return;
                    case 2:
                        C3582c.m15126a().mo14435c().mo14427a();
                        return;
                    case 3:
                        mo14317b(new JSONObject(cVar.f11163c).optString("text"));
                        return;
                    case 4:
                        mo14314a(new JSONObject(cVar.f11163c).optString("text"));
                        return;
                    case 5:
                        cVar.mo14311a(1, null);
                        return;
                    case 6:
                        JSONObject jSONObject2 = new JSONObject(cVar.f11163c);
                        mo14315a(jSONObject2.optString("phone_number"), jSONObject2.optString("sms_content"));
                        return;
                    default:
                        return;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo14312a(int i, String str) {
        C3582c.AbstractC3584a e = C3582c.m15126a().mo14437e();
        if (e != null) {
            if (i == 0) {
                e.mo14356a();
            } else {
                e.mo14357a(i, str);
            }
            Activity activity = this.f11167a;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public void mo14315a(String str, String str2) {
        if (this.f11167a != null) {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", str2);
            this.f11167a.startActivity(intent);
        }
    }

    /* renamed from: a */
    public void mo14316a(JSONObject jSONObject, BdTuringConfig bdTuringConfig, Activity activity) throws JSONException {
        if (!jSONObject.has("app_name")) {
            jSONObject.put("app_name", bdTuringConfig.mo14215d());
        }
        if (!jSONObject.has("app_version")) {
            jSONObject.put("app_version", bdTuringConfig.mo14216e());
        }
        if (!jSONObject.has("aid")) {
            jSONObject.put("aid", bdTuringConfig.mo14214c());
        }
        if (!jSONObject.has("iid")) {
            jSONObject.put("iid", bdTuringConfig.mo14225n());
        }
        if (!jSONObject.has("device_id")) {
            jSONObject.put("device_id", bdTuringConfig.mo14226o());
        }
        if (!jSONObject.has("device_model")) {
            jSONObject.put("device_model", bdTuringConfig.mo14222k());
        }
        if (!jSONObject.has("device_brand")) {
            jSONObject.put("device_brand", bdTuringConfig.mo14221j());
        }
        if (!jSONObject.has("os_type")) {
            jSONObject.put("os_type", bdTuringConfig.mo14204a());
        }
        if (!jSONObject.has("os_version")) {
            jSONObject.put("os_version", bdTuringConfig.mo14223l());
        }
        if (!jSONObject.has("channel")) {
            jSONObject.put("channel", bdTuringConfig.mo14220i());
        }
        if (!jSONObject.has("region")) {
            jSONObject.put("region", bdTuringConfig.mo14210b());
        }
        if (!jSONObject.has("sdk_version")) {
            jSONObject.put("sdk_version", bdTuringConfig.mo14218g());
        }
        if (!jSONObject.has("language")) {
            jSONObject.put("language", bdTuringConfig.mo14217f());
        }
        if (!jSONObject.has("time")) {
            jSONObject.put("time", System.currentTimeMillis());
        }
        if (!jSONObject.has("locale")) {
            jSONObject.put("locale", bdTuringConfig.mo14228q());
        }
        if (!jSONObject.has(CommonCode.MapKey.HAS_RESOLUTION) && activity != null) {
            jSONObject.put(CommonCode.MapKey.HAS_RESOLUTION, C3542b.m14907b(activity));
        }
    }
}
