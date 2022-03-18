package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.chooser.C65817a;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"chooseVideo"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.media.b */
public class C25033b extends AbstractC65797c {

    /* renamed from: a */
    public int f61163a = 60;

    /* renamed from: b */
    public boolean f61164b;

    /* renamed from: c */
    public boolean f61165c;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25033b() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("chooseVideo");
    }

    /* renamed from: b */
    private void m90316b() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = (JSONArray) this.f165820j.mo234984a("sourceType");
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        this.f61164b = arrayList.contains("camera");
        this.f61165c = arrayList.contains("album");
        int intValue = ((Integer) this.f165820j.mo234985a("maxDuration", 60)).intValue();
        this.f61163a = intValue;
        if (intValue > 180) {
            this.f61163a = 180;
        }
        if (this.f61163a <= 0) {
            this.f61163a = 60;
        }
    }

    /* renamed from: b */
    private void m90317b(final Activity activity) {
        mo230475h().mo235021a(activity, mo230472e(), C66578b.C66579a.m260120e(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25033b.C250341 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                AppBrandLogger.m52830i("ChooseVideoHandler", C25033b.this.f165818h, "CAMERA permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.CAMERA");
                C25033b.this.mo230475h().mo235022a(activity, C25033b.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.C25033b.C250341.C250351 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (C25033b.this.f61165c) {
                            C25033b.this.mo88094a(activity);
                        } else {
                            C25033b.this.mo230475h().mo235027a(C25033b.this.mo230473f(), C25033b.this.f61163a, C25033b.this.f61165c, C25033b.this.f61164b, C25033b.this.f165820j.mo234988d());
                        }
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        AppBrandLogger.m52830i("ChooseVideoHandler", C25033b.this.f165818h, "CAMERA system permission granted");
                        C25033b.this.mo230476i();
                        C25033b.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                AppBrandLogger.m52830i("ChooseVideoHandler", C25033b.this.f165818h, "CAMERA permission denied");
                C25033b.this.mo230476i();
                C25033b.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    /* renamed from: a */
    public String mo88093a(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(".")) <= 0 || lastIndexOf >= str.length()) {
            return "";
        }
        return str.substring(lastIndexOf);
    }

    /* renamed from: d */
    private void m90318d(final String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            mo230481a(ApiCode.GENERAL_CANCEL);
        }
        Observable.create(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25033b.C250383 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                int i;
                int i2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    File d = C25033b.this.mo230475h().mo235047d();
                    File file = new File(d, System.currentTimeMillis() + C25033b.this.mo88093a(str));
                    IOUtils.copyFile(new File(str), file, false);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    if (frameAtTime != null) {
                        i = frameAtTime.getWidth();
                        i2 = frameAtTime.getHeight();
                    } else {
                        i2 = 0;
                        i = 0;
                    }
                    try {
                        long parseLong = Long.parseLong(extractMetadata) / 1000;
                        if (parseLong > ((long) C25033b.this.f61163a)) {
                            C25033b.this.mo230481a(ApiCode.CHOOSEVIDEO_OVER_MAX_DURATION);
                            return;
                        }
                        jSONObject.put("duration", parseLong);
                        jSONObject.put("tempFilePath", C25033b.this.mo230475h().mo235048d(file.getCanonicalPath()));
                        jSONObject.put("size", file.length());
                        jSONObject.put("width", i);
                        jSONObject.put("height", i2);
                        C25033b.this.mo230492b(jSONObject);
                    } catch (NumberFormatException e) {
                        C25033b.this.mo230486a(e);
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    C25033b.this.mo230486a(e2);
                    AppBrandLogger.m52830i("ChooseVideoHandler", "act exception:" + e2);
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    /* renamed from: a */
    public void mo88094a(final Activity activity) {
        mo230475h().mo235021a(activity, mo230472e(), C66578b.C66579a.m260121f(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25033b.C250362 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                AppBrandLogger.m52830i("ChooseVideoHandler", C25033b.this.f165818h, "ALBUM permission granted");
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
                hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
                C25033b.this.mo230475h().mo235022a(activity, C25033b.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.C25033b.C250362.C250371 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        C25033b.this.mo230475h().mo235027a(C25033b.this.mo230473f(), C25033b.this.f61163a, C25033b.this.f61165c, C25033b.this.f61164b, C25033b.this.f165820j.mo234988d());
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        AppBrandLogger.m52830i("ChooseVideoHandler", C25033b.this.f165818h, "SDCARD permission denied");
                        C25033b.this.mo230476i();
                        C25033b.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                AppBrandLogger.m52830i("ChooseVideoHandler", C25033b.this.f165818h, "ALBUM permission denied");
                C25033b.this.mo230476i();
                C25033b.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("ChooseVideoHandler", this.f165818h, ": handleAPI enter");
        Activity f = mo230475h().mo235051f();
        if (f == null) {
            AppBrandLogger.m52829e("ChooseVideoHandler", this.f165818h, " handleAPI, activity is null");
            mo230493c("activity is null");
            return;
        }
        try {
            m90316b();
            AppBrandLogger.m52830i("ChooseVideoHandler", this.f165818h, ": handleAPI, containsCamera: ", Boolean.valueOf(this.f61164b), ", containsAlbum: ", Boolean.valueOf(this.f61165c));
            if (this.f61164b) {
                m90317b(f);
            } else if (this.f61165c) {
                mo88094a(f);
            } else {
                m90317b(f);
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("ChooseVideoHandler", this.f165818h, " handleAPI init error: " + e.getMessage(), e);
            mo230486a(e);
        }
    }

    public C25033b(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        AppBrandLogger.m52830i("ChooseVideoHandler", "handleActivityResult requestCode:" + i + " resultCode:" + i2);
        if (i == 4) {
            if (i2 != 19901026 || intent == null) {
                mo230493c("");
                AppBrandLogger.m52830i("ChooseVideoHandler", "result code error or data is null");
            } else {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("select_result");
                if (parcelableArrayListExtra == null || parcelableArrayListExtra.size() <= 0) {
                    mo230481a(ApiCode.GENERAL_CANCEL);
                } else {
                    m90318d(((MediaEntity) parcelableArrayListExtra.get(0)).f170268a);
                }
            }
            return true;
        } else if (i == 9) {
            if (i2 == -1) {
                String str = C65817a.f165869a;
                if (TextUtils.isEmpty(str)) {
                    mo230493c("");
                    AppBrandLogger.m52830i("ChooseVideoHandler", "currentCamerVideoPath is empty");
                } else if (new File(str).exists()) {
                    m90318d(str);
                } else {
                    mo230493c("");
                    AppBrandLogger.m52830i("ChooseVideoHandler", ApiCallResultHelper.generateFileNotExistInfo(str));
                }
            } else {
                mo230481a(ApiCode.GENERAL_CANCEL);
            }
            return true;
        } else {
            mo230493c("handle activityResult fail");
            AppBrandLogger.m52830i("ChooseVideoHandler", ApiCallResultHelper.generateUnknownErrorExtraInfo("handleActivityResult"));
            return false;
        }
    }
}
