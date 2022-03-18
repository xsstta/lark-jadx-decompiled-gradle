package com.larksuite.component.openplatform.core.plugin.vc.audio.sync;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3312p.p3313a.AbstractC66561a;
import com.tt.miniapp.p3312p.p3313a.C66562b;
import com.tt.miniapp.p3312p.p3315c.C66570a;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.vc.audio.sync.a */
public class C25513a extends AbstractC66715a {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return "addAudioTrack";
    }

    public C25513a() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        int i;
        int i2;
        int i3;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(this.f168426a);
            String optString = jSONObject.optString("videoPath");
            JSONArray optJSONArray = jSONObject.optJSONArray("audioParams");
            if (TextUtils.isEmpty(optString)) {
                String generateIllegalParamExtraInfo = ApiCallResultHelper.generateIllegalParamExtraInfo("videoPath");
                mo88647a(generateIllegalParamExtraInfo);
                return mo232451b(generateIllegalParamExtraInfo);
            }
            if (optJSONArray != null) {
                if (optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    C66562b.C66563a[] aVarArr = new C66562b.C66563a[length];
                    int i5 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i6);
                        String optString2 = optJSONObject.optString("audioPath");
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("audioRange");
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("videoRange");
                        if (!TextUtils.isEmpty(optString2)) {
                            if (optJSONArray2 != null) {
                                if (optJSONArray2.length() >= 2) {
                                    if (optJSONArray3 != null) {
                                        if (optJSONArray3.length() >= 2) {
                                            String c = mo232454e().mo235044c(optString2);
                                            int optInt = optJSONArray2.optInt(0);
                                            int optInt2 = optJSONArray2.optInt(1);
                                            int optInt3 = optJSONArray3.optInt(0);
                                            int optInt4 = optJSONArray3.optInt(1);
                                            if (optInt < 0) {
                                                i = 0;
                                            } else {
                                                i = optInt;
                                            }
                                            if (optInt2 == -1) {
                                                optInt2 = C66570a.m260077b(c);
                                            }
                                            if (optInt2 != 0) {
                                                if (i < optInt2) {
                                                    if (optInt3 < 0) {
                                                        i2 = 0;
                                                    } else {
                                                        i2 = optInt3;
                                                    }
                                                    if (optInt4 == -1) {
                                                        optInt4 = C66570a.m260077b(optString);
                                                    }
                                                    if (optInt4 != 0) {
                                                        if (i2 < optInt4) {
                                                            int i7 = optInt2 - i;
                                                            int i8 = optInt4 - i2;
                                                            if (i7 < i8) {
                                                                i3 = i7 + i2;
                                                            } else if (i7 > i8) {
                                                                i3 = optInt4;
                                                                i4 = i8 + i;
                                                                aVarArr[i6] = new C66562b.C66563a(c, i, i4, i2, i3);
                                                                i5++;
                                                            } else {
                                                                i3 = optInt4;
                                                            }
                                                            i4 = optInt2;
                                                            aVarArr[i6] = new C66562b.C66563a(c, i, i4, i2, i3);
                                                            i5++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i5 == 0) {
                        mo88647a("the count of audio track is 0");
                        return mo232451b("the count of audio track is 0");
                    }
                    String d = m91069d(mo232454e().mo235044c(optString));
                    C66570a.m260075a(d, m91070e(d), aVarArr, new AbstractC66561a() {
                        /* class com.larksuite.component.openplatform.core.plugin.vc.audio.sync.C25513a.C255141 */

                        @Override // com.tt.miniapp.p3312p.p3313a.AbstractC66561a
                        /* renamed from: a */
                        public void mo88648a(int i, String str) {
                            String str2;
                            AppBrandLogger.m52828d("tma_ApiAddAudioTrackCtrl", "onFail: " + str);
                            if (i == -1000) {
                                str2 = "feature not support";
                            } else if (i == -1001) {
                                str2 = "invalid params";
                            } else {
                                str2 = "editing fail";
                            }
                            C25513a.this.mo88647a(str2);
                        }
                    });
                    return mo232456g();
                }
            }
            String generateIllegalParamExtraInfo2 = ApiCallResultHelper.generateIllegalParamExtraInfo("audioParams");
            mo88647a(generateIllegalParamExtraInfo2);
            return mo232451b(generateIllegalParamExtraInfo2);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_ApiAddAudioTrackCtrl", "act", e);
            return mo232445a(e);
        }
    }

    public C25513a(String str) {
        super(str);
    }

    /* renamed from: c */
    private void m91068c(String str) {
        IJsBridge jsBridge = AppbrandApplicationImpl.getInst(mo232455f()).getJsBridge();
        if (jsBridge != null) {
            jsBridge.sendMsgToJsCore("addAudioTrackStateChange", str);
        }
    }

    /* renamed from: e */
    private String m91070e(String str) {
        File file = new File(str);
        String name = file.getName();
        File parentFile = file.getParentFile();
        if (!TextUtils.equals(name, "audio_mix.mp4")) {
            return new File(parentFile, "audio_mix.mp4").getAbsolutePath();
        }
        return new File(parentFile, System.currentTimeMillis() + ".mp4").getAbsolutePath();
    }

    /* renamed from: a */
    public void mo88647a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", "fail");
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "addAudioTrackStateChange:fail " + str);
            m91068c(jSONObject.toString());
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("tma_ApiAddAudioTrackCtrl", "callbackFail", e);
        }
    }

    /* renamed from: d */
    private String m91069d(String str) {
        File file = new File(str);
        String name = file.getName();
        if (!TextUtils.equals(name, "audio_mix.mp4")) {
            return str;
        }
        File parentFile = file.getParentFile();
        File file2 = new File(parentFile, System.currentTimeMillis() + name);
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return file2.getAbsolutePath();
        }
        return str;
    }
}
