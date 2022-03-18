package com.tt.miniapp.webbridge.sync;

import android.app.Activity;
import android.text.TextUtils;
import android.text.format.Time;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ui.HostOptionUiDepend;
import com.tt.refer.common.annotation.ApiHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

@ApiHandler(eventName = "showDatePickerView")
/* renamed from: com.tt.miniapp.webbridge.sync.l */
public class C67369l extends AbstractC67337b {
    @Override // com.tt.option.ext.AbstractC67628l
    public String getApiName() {
        return "showDatePickerView";
    }

    @Override // com.tt.option.ext.AbstractC67628l
    public String act() {
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            String optString = jSONObject.optString("mode");
            if (TextUtils.equals(optString, "time")) {
                return m262234b(jSONObject);
            }
            if (TextUtils.equals(optString, "date")) {
                return mo234041a(jSONObject);
            }
            AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "unsupported mode");
            return makeFailMsg("unsupported mode");
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int[] mo234045b(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            return null;
        }
        return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
    }

    /* renamed from: b */
    private String m262234b(JSONObject jSONObject) throws Exception {
        JSONObject optJSONObject = jSONObject.optJSONObject("range");
        String string = optJSONObject.getString("start");
        String string2 = optJSONObject.getString("end");
        String optString = jSONObject.optString("current");
        int[] b = mo234045b(string);
        if (b == null) {
            b = mo234045b("00:00");
        }
        final int i = b[0];
        final int i2 = b[1];
        int[] b2 = mo234045b(string2);
        if (b2 == null) {
            b2 = mo234045b("23:59");
        }
        final int i3 = b2[0];
        final int i4 = b2[1];
        int[] b3 = mo234045b(optString);
        if (b3 == null) {
            Time time = new Time("GMT+8");
            time.setToNow();
            b3 = new int[]{time.hour, time.minute};
        }
        final int i5 = b3[0];
        final int i6 = b3[1];
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.webbridge.sync.C67369l.RunnableC673701 */

            public void run() {
                if (C67369l.this.mRender == null) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "render is null");
                    return;
                }
                Activity currentActivity = C67369l.this.mRender.getCurrentActivity();
                if (currentActivity == null) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "activity is null");
                    C67369l lVar = C67369l.this;
                    lVar.invokeHandler(lVar.makeFailMsg("activity is null"));
                } else if (currentActivity.isFinishing()) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "activity is finishing");
                    C67369l lVar2 = C67369l.this;
                    lVar2.invokeHandler(lVar2.makeFailMsg("activity is finishing"));
                } else {
                    C67369l.this.mo234042a(currentActivity, i, i2, i3, i4, i5, i6);
                }
            }
        });
        return CharacterUtils.empty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo234041a(JSONObject jSONObject) throws Exception {
        final String str;
        JSONObject optJSONObject = jSONObject.optJSONObject("range");
        String replace = optJSONObject.getString("start").replace("/", "-");
        String replace2 = optJSONObject.getString("end").replace("/", "-");
        String replace3 = jSONObject.optString("current").replace("/", "-");
        if (TextUtils.isEmpty(jSONObject.optString("fields"))) {
            str = "day";
        } else {
            str = jSONObject.optString("fields");
        }
        if (TextUtils.isEmpty(replace)) {
            replace = "2010-1-1";
        }
        if (TextUtils.isEmpty(replace2)) {
            replace2 = "2100-12-31";
        }
        if (TextUtils.isEmpty(replace3)) {
            replace3 = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
        }
        final int[] a = mo234044a(replace, str);
        final int[] a2 = mo234044a(replace2, str);
        final int[] a3 = mo234044a(replace3, str);
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.tt.miniapp.webbridge.sync.C67369l.RunnableC673723 */

            public void run() {
                if (C67369l.this.mRender == null) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "render is null");
                    return;
                }
                Activity currentActivity = C67369l.this.mRender.getCurrentActivity();
                if (currentActivity == null) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "activity is null");
                    C67369l lVar = C67369l.this;
                    lVar.invokeHandler(lVar.makeFailMsg("activity is null"));
                } else if (currentActivity.isFinishing()) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", "activity is finishing");
                    C67369l lVar2 = C67369l.this;
                    lVar2.invokeHandler(lVar2.makeFailMsg("activity is finishing"));
                } else {
                    C67369l.this.mo234043a(currentActivity, str, a, a2, a3);
                }
            }
        });
        return CharacterUtils.empty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo234044a(String str, String str2) {
        String[] split = str.split("-");
        if (TextUtils.equals(str2, "day")) {
            if (split.length == 3) {
                return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])};
            }
            throw new IllegalArgumentException("should have year month day");
        } else if (TextUtils.equals(str2, "month")) {
            if (split.length >= 2) {
                return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
            }
            throw new IllegalArgumentException("should have year month at least");
        } else if (!TextUtils.equals(str2, "year")) {
            return null;
        } else {
            if (split.length >= 1) {
                return new int[]{Integer.parseInt(split[0])};
            }
            throw new IllegalArgumentException("should have year at least");
        }
    }

    public C67369l(RenderViewManager.IRender iRender, String str, int i) {
        super(iRender, str, i);
    }

    /* renamed from: a */
    public void mo234043a(Activity activity, String str, int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (TextUtils.equals(str, "year")) {
            int i10 = iArr[0];
            int i11 = iArr2[0];
            i3 = iArr3[0];
            i6 = i11;
            i8 = -1;
            i7 = -1;
            i5 = -1;
            i4 = -1;
            i2 = -1;
            i = -1;
            i9 = i10;
        } else if (TextUtils.equals(str, "month")) {
            int i12 = iArr[0];
            i8 = iArr[1];
            int i13 = iArr2[0];
            int i14 = iArr2[1];
            i3 = iArr3[0];
            i2 = iArr3[1];
            i5 = i14;
            i4 = -1;
            i = -1;
            i9 = i12;
            i6 = i13;
            i7 = -1;
        } else if (TextUtils.equals(str, "day")) {
            int i15 = iArr[0];
            int i16 = iArr[1];
            i7 = iArr[2];
            i6 = iArr2[0];
            i5 = iArr2[1];
            i4 = iArr2[2];
            int i17 = iArr3[0];
            i3 = i17;
            i2 = iArr3[1];
            i = iArr3[2];
            i9 = i15;
            i8 = i16;
        } else {
            i9 = -1;
            i8 = -1;
            i7 = -1;
            i6 = -1;
            i5 = -1;
            i4 = -1;
            i3 = -1;
            i2 = -1;
            i = -1;
        }
        HostDependManager.getInst().showDatePickerView(activity, this.mArgs, str, i9, i8, i7, i6, i5, i4, i3, i2, i, new HostOptionUiDepend.AbstractC67689a<String>() {
            /* class com.tt.miniapp.webbridge.sync.C67369l.C673734 */

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: a */
            public void mo234047a() {
                AppBrandLogger.m52830i("tma_ShowDatePickerViewHandler", "on cancel");
                C67369l.this.mo234020a("showDatePickerView");
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: b */
            public void mo234050b() {
                AppBrandLogger.m52830i("tma_ShowDatePickerViewHandler", "on dismiss");
                C67369l.this.mo234020a("showDatePickerView");
            }

            /* renamed from: a */
            public void mo234052a(String str, String str2, String str3) {
                String str4 = "";
                if (!TextUtils.isEmpty(str)) {
                    str4 = str4 + str;
                    if (!TextUtils.isEmpty(str2)) {
                        str4 = str4 + "-" + str2;
                        if (!TextUtils.isEmpty(str3)) {
                            str4 = str4 + "-" + str3;
                        }
                    }
                }
                AppBrandLogger.m52828d("tma_ShowDatePickerViewHandler", "datePicker onDatePicked result ", str4);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67369l.this.buildErrorMsg("showDatePickerView", "ok"));
                    jSONObject.put("value", str4);
                    AppbrandApplicationImpl.getInst(C67369l.this.iAppContext).getRenderViewManager().invokeHandler(C67369l.this.mRender.getRenderViewId(), C67369l.this.mCallBackId, jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", e);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo234042a(Activity activity, int i, int i2, int i3, int i4, int i5, int i6) {
        HostDependManager.getInst().showTimePickerView(activity, this.mArgs, i, i2, i3, i4, i5, i6, new HostOptionUiDepend.AbstractC67694f<String>() {
            /* class com.tt.miniapp.webbridge.sync.C67369l.C673712 */

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: a */
            public void mo234047a() {
                AppBrandLogger.m52830i("tma_ShowDatePickerViewHandler", " on cancel");
                C67369l.this.mo234020a("showDatePickerView");
            }

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67692d
            /* renamed from: b */
            public void mo234050b() {
                AppBrandLogger.m52830i("tma_ShowDatePickerViewHandler", " on dismiss");
                C67369l.this.mo234020a("showDatePickerView");
            }

            /* renamed from: a */
            public void mo234048a(String str, String str2) {
                AppBrandLogger.m52830i("tma_ShowDatePickerViewHandler", "timePicker hour ", str, " minute ", str2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.tt.frontendapiinterface.ApiHandler.API_CALLBACK_ERRMSG, C67369l.this.buildErrorMsg("showDatePickerView", "ok"));
                    jSONObject.put("value", str + ":" + str2);
                    AppbrandApplicationImpl.getInst(C67369l.this.iAppContext).getRenderViewManager().invokeHandler(C67369l.this.mRender.getRenderViewId(), C67369l.this.mCallBackId, jSONObject.toString());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("tma_ShowDatePickerViewHandler", e);
                }
            }
        });
    }
}
