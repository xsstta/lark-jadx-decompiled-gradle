package com.ss.android.bytedcert.p1308f.p1309a.p1313d;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.bytedcert.callback.AbstractC28340i;
import com.ss.android.bytedcert.cvlibrary.FaceLiveness;
import com.ss.android.bytedcert.cvlibrary.FaceVerify;
import com.ss.android.bytedcert.cvlibrary.StillLiveness;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.bytedcert.manager.C28396a;
import com.ss.android.bytedcert.manager.C28418c;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.p1305c.AbstractC28321a;
import com.ss.android.bytedcert.p1308f.p1309a.p1311b.C28362a;
import com.ss.android.bytedcert.utils.C28432b;
import com.ss.android.bytedcert.utils.C28433c;
import com.ss.android.bytedcert.utils.C28441g;
import com.ss.android.bytedcert.view.AbstractC28443a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.f.a.d.a */
public class C28374a extends AbstractC28378b {

    /* renamed from: e */
    public static final String[] f71310e = {"tt_face_v", "tt_faceverify_v", "tt_stillliveness_v"};

    /* renamed from: i */
    public static String f71311i;

    /* renamed from: A */
    private List<Integer> f71312A = new ArrayList();

    /* renamed from: a */
    final String f71313a = "res/action_liveness/tt_liveness_v7.0.model";

    /* renamed from: b */
    String f71314b;

    /* renamed from: c */
    String f71315c;

    /* renamed from: d */
    String f71316d;

    /* renamed from: f */
    public Context f71317f;

    /* renamed from: g */
    public AbstractC28340i f71318g;

    /* renamed from: h */
    public BytedCertManager f71319h;

    /* renamed from: j */
    public boolean f71320j;

    /* renamed from: k */
    public float f71321k;

    /* renamed from: l */
    public TextView f71322l;

    /* renamed from: m */
    public String f71323m = "";

    /* renamed from: n */
    private FaceLiveness f71324n;

    /* renamed from: o */
    private FaceVerify f71325o;

    /* renamed from: p */
    private StillLiveness f71326p;

    /* renamed from: q */
    private volatile long f71327q;

    /* renamed from: r */
    private AbstractC28443a f71328r;

    /* renamed from: s */
    private AbstractC28321a f71329s;

    /* renamed from: t */
    private int f71330t = 2;

    /* renamed from: u */
    private final String[] f71331u = {"blink", "open_mouth", "nod", "shake_head"};

    /* renamed from: v */
    private final String[] f71332v = {"检测尚未完成", "检测成功", "超时未检测到第一张有效人脸", "单个动作超时", "人脸丢失超过最大允许次数", "人脸REID超时", "做错动作，可能是视频攻击", "静默活体检测失败", "过程中人脸不一致"};

    /* renamed from: w */
    private String[] f71333w;

    /* renamed from: x */
    private String[] f71334x;

    /* renamed from: y */
    private String f71335y = "0";

    /* renamed from: z */
    private String f71336z = "";

    @Override // com.ss.android.bytedcert.p1308f.p1309a.p1313d.AbstractC28378b
    /* renamed from: a */
    public int mo101076a(int[] iArr, float[] fArr) {
        Logger.m15167d("debug1 face liveness", "SetParam");
        if (this.f71327q == 0) {
            return -1;
        }
        if (!(iArr == null || iArr.length == 0 || fArr == null || fArr.length == 0)) {
            for (int i = 0; i < iArr.length; i++) {
                int native_FL_SetConfig = this.f71324n.native_FL_SetConfig(this.f71327q, iArr[i], fArr[i]);
                if (native_FL_SetConfig != 0) {
                    return native_FL_SetConfig;
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    public float mo101081e() {
        return ((Activity) this.f71317f).getWindow().getAttributes().screenBrightness;
    }

    @Override // com.ss.android.bytedcert.p1308f.p1309a.p1313d.AbstractC28378b
    /* renamed from: b */
    public int mo101078b() {
        if (this.f71327q == 0) {
            return -1;
        }
        return this.f71324n.native_FL_ResetHandle(this.f71327q, C28362a.f71253m, this.f71336z);
    }

    /* renamed from: d */
    public int mo101080d() {
        if (this.f71326p == null) {
            StillLiveness stillLiveness = new StillLiveness();
            this.f71326p = stillLiveness;
            int native_SL_CreateHandler = stillLiveness.native_SL_CreateHandler(this.f71314b, this.f71316d);
            if (native_SL_CreateHandler != 0) {
                Logger.m15170e("FaceLivenessTask", "Create verify handle err: " + native_SL_CreateHandler);
                C28418c.m104143c().f71478j = C28317a.C28318a.f71162z;
                m104072a(false, C28317a.C28318a.f71162z);
                return native_SL_CreateHandler;
            }
        }
        byte[] bArr = C28418c.m104143c().f71471c;
        int i = C28418c.m104143c().f71475g;
        int native_SL_DoPredict = this.f71326p.native_SL_DoPredict(bArr, 0, i, C28418c.m104143c().f71474f, i * 4, 0);
        if (native_SL_DoPredict != 0) {
            Logger.m15170e("FaceLivenessTask", "still liveness error: " + native_SL_DoPredict);
            C28418c.m104143c().f71478j = C28317a.C28318a.f71126A;
            m104072a(false, C28317a.C28318a.f71126A);
        }
        m104072a(true, (Pair<Integer, String>) null);
        return native_SL_DoPredict;
    }

    @Override // com.ss.android.bytedcert.p1308f.p1309a.p1313d.AbstractC28378b
    /* renamed from: a */
    public int mo101071a() {
        if (this.f71327q == 0) {
            return -1;
        }
        int native_FL_ReleaseHandle = this.f71324n.native_FL_ReleaseHandle(this.f71327q, C28362a.f71253m, this.f71336z);
        this.f71327q = 0;
        mo101077a(this.f71321k);
        FaceVerify faceVerify = this.f71325o;
        if (faceVerify != null) {
            native_FL_ReleaseHandle = faceVerify.native_FV_ReleaseHandle();
        }
        StillLiveness stillLiveness = this.f71326p;
        if (stillLiveness != null) {
            return stillLiveness.native_SL_ReleaseHandle();
        }
        return native_FL_ReleaseHandle;
    }

    /* renamed from: c */
    public int mo101079c() {
        if (this.f71325o == null) {
            FaceVerify faceVerify = new FaceVerify();
            this.f71325o = faceVerify;
            int native_FV_CreateHandler = faceVerify.native_FV_CreateHandler(this.f71314b, this.f71315c);
            if (native_FV_CreateHandler != 0) {
                Logger.m15170e("FaceLivenessTask", "Create verify handle err: " + native_FV_CreateHandler);
                C28418c.m104143c().f71478j = C28317a.C28318a.f71127B;
                m104074b(false, C28317a.C28318a.f71127B);
                return native_FV_CreateHandler;
            }
            int a = mo101074a(this.f71319h.getLiveInfo().f71366g);
            if (a != 0) {
                Logger.m15170e("FaceLivenessTask", "add ori image error: " + a);
                C28418c.m104143c().f71478j = C28317a.C28318a.f71128C;
                m104074b(false, C28317a.C28318a.f71128C);
                return a;
            }
        }
        byte[] bArr = C28418c.m104143c().f71471c;
        int i = C28418c.m104143c().f71475g;
        int native_FV_Verify = this.f71325o.native_FV_Verify(bArr, 0, i, C28418c.m104143c().f71474f, i * 4, 0);
        if (native_FV_Verify != 0) {
            Logger.m15170e("FaceLivenessTask", "face verify error: " + native_FV_Verify);
            C28418c.m104143c().f71478j = C28317a.C28318a.f71128C;
            m104074b(false, C28317a.C28318a.f71128C);
        }
        m104074b(true, null);
        return native_FV_Verify;
    }

    /* renamed from: a */
    public void mo101077a(final float f) {
        ((Activity) this.f71317f).runOnUiThread(new Runnable() {
            /* class com.ss.android.bytedcert.p1308f.p1309a.p1313d.C28374a.RunnableC283773 */

            public void run() {
                Window window = ((Activity) C28374a.this.f71317f).getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.screenBrightness = f;
                window.setAttributes(attributes);
            }
        });
    }

    /* renamed from: a */
    private void m104070a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("detection_type", str);
        }
        C28432b.m104208a("face_detection_success", hashMap);
    }

    /* renamed from: b */
    private void m104073b(String str) {
        List<Integer> list = this.f71312A;
        if (!(list == null || list.size() == 0)) {
            try {
                int size = this.f71312A.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    Integer num = this.f71312A.get(i);
                    if (num != null) {
                        jSONArray.put(num);
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prompt_info", jSONArray);
                jSONObject.put("prompt_result", str);
                C28432b.m104209a("face_detection_prompt", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!str.equals("0")) {
                this.f71312A.clear();
            }
        }
    }

    /* renamed from: a */
    public int mo101074a(Bitmap bitmap) {
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int width = bitmap.getWidth();
        return this.f71325o.native_FV_AddOri(array, 0, width, bitmap.getHeight(), width * 4, 0);
    }

    /* renamed from: a */
    private void m104071a(String str, int i) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("detection_type", str);
        }
        hashMap.put("fail_reason", f71311i);
        hashMap.put("error_code", String.valueOf(i));
        C28432b.m104208a("face_detection_fail", hashMap);
    }

    /* renamed from: b */
    private void m104074b(boolean z, Pair<Integer, String> pair) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        try {
            jSONObject.put("result", str);
            if (pair != null) {
                jSONObject.put("error_msg", pair.second);
                jSONObject.put("error_code", String.valueOf(pair.first));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C28432b.m104209a("cert_offline_face_verify", jSONObject);
    }

    /* renamed from: a */
    private void m104072a(boolean z, Pair<Integer, String> pair) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        try {
            jSONObject.put("result", str);
            if (pair != null) {
                jSONObject.put("error_msg", pair.second);
                jSONObject.put("error_code", String.valueOf(pair.first));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C28432b.m104209a("cert_do_still_liveness", jSONObject);
    }

    @Override // com.ss.android.bytedcert.p1308f.p1309a.p1313d.AbstractC28378b
    /* renamed from: a */
    public int mo101073a(Context context, Bundle bundle) {
        this.f71319h = BytedCertManager.getInstance();
        this.f71317f = context;
        this.f71328r = (AbstractC28443a) context;
        this.f71329s = (AbstractC28321a) context;
        this.f71318g = (AbstractC28340i) context;
        this.f71321k = mo101081e();
        Resources resources = this.f71317f.getResources();
        this.f71334x = resources.getStringArray(R.array.byted_liveness_prompt_info);
        this.f71333w = resources.getStringArray(R.array.byted_liveness_actions);
        FaceLiveness faceLiveness = new FaceLiveness();
        this.f71324n = faceLiveness;
        this.f71327q = faceLiveness.native_FL_CreateHandler();
        if (this.f71327q == 0) {
            Logger.m15167d("FaceLivenessTask", "Create handle err: " + this.f71327q);
            return 1;
        }
        C28433c.m104216a(context, "res/action_liveness/tt_liveness_v7.0.model");
        String b = C28433c.m104217b(context, "res/action_liveness/tt_liveness_v7.0.model");
        int native_FL_SetModle = this.f71324n.native_FL_SetModle(this.f71327q, b);
        if (native_FL_SetModle != 0) {
            Logger.m15170e("FaceLivenessTask", " err SetModle in FaceLiveness, code: " + native_FL_SetModle);
            if (native_FL_SetModle == -5) {
                File file = new File(b);
                if (file.exists()) {
                    file.delete();
                }
            }
            return native_FL_SetModle;
        }
        this.f71322l = (TextView) ((Activity) context).findViewById(R.id.tv_task_board);
        this.f71322l.setTranslationY((float) (-((int) (C28441g.m104239b(context) + UIUtils.dip2Px(context, 50.0f)))));
        this.f71322l.setVisibility(0);
        this.f71322l.setTextColor(BytedCertManager.getInstance().getThemeConfig().mo100959f());
        if (this.f71319h.getLiveInfo().f71364e) {
            String modulePath = BytedCertManager.getInstance().getModulePath();
            String[] strArr = f71310e;
            this.f71314b = C28433c.m104212a(modulePath, strArr[0]);
            this.f71315c = C28433c.m104212a(BytedCertManager.getInstance().getModulePath(), strArr[1]);
            this.f71316d = C28433c.m104212a(BytedCertManager.getInstance().getModulePath(), strArr[2]);
        }
        if (C28396a.m104125a().mo101170b()) {
            this.f71330t = 0;
        }
        return 0;
    }

    @Override // com.ss.android.bytedcert.p1308f.p1309a.p1313d.AbstractC28378b
    /* renamed from: a */
    public int mo101072a(int i, int[] iArr, int i2) {
        Logger.m15167d("debug1 face liveness", "SetParam");
        if (this.f71327q == 0) {
            return -1;
        }
        int native_FL_SetParamFromBytes = this.f71324n.native_FL_SetParamFromBytes(this.f71327q, 1, 1, i, 0, 0, 0);
        if (native_FL_SetParamFromBytes != 0) {
            return native_FL_SetParamFromBytes;
        }
        int[] iArr2 = new int[4];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr2[i3] = iArr[i3];
        }
        int native_FL_SetParamFromBytes2 = this.f71324n.native_FL_SetParamFromBytes(this.f71327q, 2, i2, iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
        if (native_FL_SetParamFromBytes2 != 0) {
            return native_FL_SetParamFromBytes2;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0129, code lost:
        if (r5.get(r5.size() - 1).intValue() != r8) goto L_0x012b;
     */
    @Override // com.ss.android.bytedcert.p1308f.p1309a.p1313d.AbstractC28378b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo101075a(byte[] r31, int r32, byte[] r33, int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 937
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.bytedcert.p1308f.p1309a.p1313d.C28374a.mo101075a(byte[], int, byte[], int, int):int");
    }
}
