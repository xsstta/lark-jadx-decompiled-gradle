package com.larksuite.component.openplatform.core.plugin.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.util.C67045l;
import com.tt.miniapphost.util.C67586c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67858b;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ApiSupportType(apiName = {"chooseImage"}, support = {AppType.WebAPP, AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.media.a */
public class C25027a extends AbstractC65797c {

    /* renamed from: a */
    public int f61149a = 9;

    /* renamed from: b */
    public boolean f61150b;

    /* renamed from: c */
    public boolean f61151c;

    /* renamed from: d */
    private boolean f61152d;

    /* renamed from: e */
    private boolean f61153e;

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    public C25027a() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("chooseImage");
    }

    /* renamed from: b */
    public boolean mo88091b() {
        if (!this.f61152d || this.f61153e) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo88092c() {
        if (!this.f61152d || !this.f61153e) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m90301d() throws JSONException {
        int intValue = ((Integer) this.f165820j.mo234985a("count", 9)).intValue();
        this.f61149a = intValue;
        if (intValue <= 0) {
            this.f61149a = 9;
        }
        if (this.f61149a > 20) {
            this.f61149a = 20;
        }
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = (JSONArray) this.f165820j.mo234984a("sourceType");
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(jSONArray.getString(i));
            }
        }
        this.f61150b = hashSet.contains("camera");
        this.f61151c = hashSet.contains("album");
        HashSet hashSet2 = new HashSet();
        JSONArray jSONArray2 = (JSONArray) this.f165820j.mo234984a("sizeType");
        if (jSONArray2 != null) {
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                hashSet2.add(jSONArray2.getString(i2));
            }
        }
        this.f61152d = hashSet2.contains("original");
        this.f61153e = hashSet2.contains("compressed");
        if (hashSet2.size() == 0) {
            this.f61152d = true;
            this.f61153e = true;
        }
    }

    /* renamed from: b */
    private void m90299b(final Activity activity) {
        mo230475h().mo235021a(activity, mo230472e(), C66578b.C66579a.m260120e(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25027a.C250281 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.CAMERA");
                C25027a.this.mo230475h().mo235022a(activity, C25027a.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.C25027a.C250281.C250291 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        if (C25027a.this.f61151c) {
                            C25027a.this.mo88090a(activity);
                        } else {
                            C25027a.this.mo230475h().mo235018a(activity);
                        }
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        C25027a.this.mo230476i();
                        C25027a.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                C25027a.this.mo230476i();
                C25027a.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    /* renamed from: a */
    private void m90297a(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTO");
        AppBrandLogger.m52830i("ChooseImageHandler", "handlePhotoPickerResult. keepOrigin:" + booleanExtra);
        if (!C67858b.m263996a(stringArrayListExtra)) {
            m90298a(stringArrayListExtra, booleanExtra);
            return;
        }
        AppBrandLogger.m52829e("ChooseImageHandler", "photos is empty");
        mo230493c("photos is empty");
    }

    /* renamed from: b */
    private void m90300b(Intent intent) {
        AppBrandLogger.m52830i("ChooseImageHandler", "handleCameraResult.");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTO");
        if (!C67858b.m263996a(stringArrayListExtra)) {
            m90298a(stringArrayListExtra, mo88091b());
            return;
        }
        AppBrandLogger.m52829e("ChooseImageHandler", "cameraPhotoPath is empty");
        mo230493c("cameraPhotoPath is empty");
    }

    /* renamed from: a */
    public void mo88090a(final Activity activity) {
        mo230475h().mo235021a(activity, mo230472e(), C66578b.C66579a.m260121f(mo230473f()), new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25027a.C250302 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                HashSet hashSet = new HashSet();
                hashSet.add("android.permission.WRITE_EXTERNAL_STORAGE");
                hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
                C25027a.this.mo230475h().mo235022a(activity, C25027a.this.mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
                    /* class com.larksuite.component.openplatform.core.plugin.media.C25027a.C250302.C250311 */

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87574a() {
                        AppBrandLogger.m52830i("ChooseImageHandler", "openLarkPhotoPicker");
                        C25027a.this.mo230475h().mo235020a(activity, C25027a.this.f61149a, C25027a.this.mo88092c(), C25027a.this.mo88091b(), C25027a.this.f61150b);
                    }

                    @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
                    /* renamed from: a */
                    public void mo87575a(String str) {
                        C25027a.this.mo230476i();
                        C25027a.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
                    }
                });
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                C25027a.this.mo230476i();
                C25027a.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
            }
        });
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("ChooseImageHandler", "handleAPI param:", this.f165820j.mo234988d());
        Activity f = mo230475h().mo235051f();
        if (f == null) {
            mo230481a(ApiCode.GENERAL_UNKONW_ERROR);
            AppBrandLogger.m52830i("ChooseImageHandler", "activity is null");
            return;
        }
        try {
            m90301d();
            if (this.f61150b) {
                m90299b(f);
            } else if (this.f61151c) {
                mo88090a(f);
            } else {
                this.f61151c = true;
                this.f61150b = true;
                m90299b(f);
            }
        } catch (JSONException e) {
            mo230481a(ApiCode.GENERAL_JSON_ERROR);
            AppBrandLogger.m52829e("ChooseImageHandler", "initArgs:" + e);
        }
    }

    public C25027a(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* renamed from: a */
    private void m90298a(final List<String> list, final boolean z) {
        Observable.create(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.media.C25027a.C250323 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    AppBrandLogger.m52830i("ChooseImageHandler", "handleImageFiles");
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (String str : list) {
                        File file = new File(str);
                        if (file.exists()) {
                            File a = C25027a.this.mo88089a(file, z);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("path", C25027a.this.mo230475h().mo235048d(a.toString()));
                            jSONObject.put("size", C67586c.m263052c(a));
                            jSONArray.put(jSONObject);
                            jSONArray2.put(C25027a.this.mo230475h().mo235048d(a.getPath()));
                        } else {
                            AppBrandLogger.m52829e("ChooseImageHandler", "file is not exist. path:" + str);
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("tempFiles", jSONArray);
                    jSONObject2.put("tempFilePaths", jSONArray2);
                    C25027a.this.mo230492b(jSONObject2);
                } catch (Exception e) {
                    C25027a aVar = C25027a.this;
                    aVar.mo230493c("handleImageFiles exception:" + e.getMessage());
                    AppBrandLogger.m52829e("ChooseImageHandler", "handleImageFiles", e);
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    /* renamed from: a */
    public File mo88089a(File file, boolean z) throws IOException {
        String str;
        String path = file.getPath();
        if (!z) {
            if (path.endsWith(".png")) {
                File d = mo230475h().mo235047d();
                File file2 = new File(d, System.currentTimeMillis() + ".png");
                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.PNG, 75, file2.toString());
                return file2;
            } else if (path.endsWith(".jpg")) {
                File d2 = mo230475h().mo235047d();
                File file3 = new File(d2, System.currentTimeMillis() + ".jpg");
                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.JPEG, 75, file3.toString());
                return file3;
            } else if (path.endsWith(".jpeg")) {
                File d3 = mo230475h().mo235047d();
                File file4 = new File(d3, System.currentTimeMillis() + ".jpeg");
                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.JPEG, 75, file4.toString());
                return file4;
            }
        }
        int lastIndexOf = file.getName().lastIndexOf(".");
        if (lastIndexOf > 0) {
            str = file.getName().substring(lastIndexOf);
        } else {
            str = "";
        }
        File d4 = mo230475h().mo235047d();
        File file5 = new File(d4, System.currentTimeMillis() + str);
        IOUtils.copyFile(file, file5, false);
        return file5;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.larksuite.framework.apiplugin.AbstractC25937e, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        AppBrandLogger.m52830i("ChooseImageHandler", "handleActivityResult, reqCode" + i + " resultCode" + i2);
        if (i2 == 0) {
            mo230493c("cancel");
            return true;
        }
        if (i2 == -1) {
            if (i == 20010) {
                m90300b(intent);
                return true;
            } else if (i == 20014) {
                m90297a(intent);
                return true;
            } else {
                mo230493c("requestCode is not match:" + i);
            }
        }
        mo230493c(ApiCallResultHelper.generateUnknownErrorExtraInfo("handleActivityResult"));
        return false;
    }
}
