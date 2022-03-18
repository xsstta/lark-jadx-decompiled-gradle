package com.tt.miniapp.p3299l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.p3299l.p3300a.C66289a;
import com.tt.miniapp.p3299l.p3300a.C66290b;
import com.tt.miniapp.p3299l.p3300a.C66295c;
import com.tt.miniapp.view.dialog.C67179c;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import com.tt.p3255a.AbstractC65676a;
import com.tt.p3255a.C65678c;
import com.tt.refer.common.util.C67866g;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.l.a */
public class C66284a {

    /* renamed from: a */
    public static long f167276a;

    /* renamed from: b */
    public static String f167277b;

    /* renamed from: a */
    private static void m259353a(final FragmentActivity fragmentActivity, final Runnable runnable, C66295c cVar, final boolean z, final IAppContext iAppContext) {
        Bundle bundle = new Bundle();
        bundle.putString("key_image_uri", cVar.f167301a);
        bundle.putString("key_text_title", cVar.f167302b);
        bundle.putString("key_btn_color", cVar.f167303c);
        bundle.putString("key_btn_text", cVar.f167304d);
        C66290b bVar = new C66290b();
        bVar.mo231685a(iAppContext);
        bVar.setArguments(bundle);
        f167276a = System.currentTimeMillis();
        bVar.mo231686a(new C66290b.AbstractC66293a() {
            /* class com.tt.miniapp.p3299l.C66284a.C662862 */

            @Override // com.tt.miniapp.p3299l.p3300a.C66290b.AbstractC66293a
            /* renamed from: a */
            public void mo231679a() {
                C66284a.m259355a(runnable);
                C66284a.m259351a(fragmentActivity, z, iAppContext);
            }
        });
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || supportFragmentManager == null || supportFragmentManager.isStateSaved()) {
            m259355a(runnable);
            return;
        }
        try {
            bVar.mo5511a(supportFragmentManager, "");
        } catch (IllegalStateException e) {
            AppBrandLogger.eWithThrowable("tma_ReenterGuideHelper", "show reenter dialog exp", e);
            m259355a(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[SYNTHETIC, Splitter:B:25:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b A[SYNTHETIC, Splitter:B:30:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A[SYNTHETIC, Splitter:B:38:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009d A[SYNTHETIC, Splitter:B:43:0x009d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m259354a(java.io.File r7, com.tt.miniapp.p3299l.p3300a.C66289a r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3299l.C66284a.m259354a(java.io.File, com.tt.miniapp.l.a.a):void");
    }

    /* renamed from: a */
    public static void m259355a(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    private static boolean m259356a(File file, boolean z) {
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            return false;
        }
        try {
            if (file.createNewFile() && z) {
                m259354a(file, new C66289a());
            }
            return false;
        } catch (IOException e) {
            AppBrandLogger.m52829e("tma_ReenterGuideHelper", e);
            return true;
        }
    }

    /* renamed from: b */
    public static C66289a m259357b(final Context context, final IAppContext iAppContext) {
        FutureTask futureTask = new FutureTask(new Callable<C66289a>() {
            /* class com.tt.miniapp.p3299l.C66284a.CallableC662873 */

            /* renamed from: a */
            public C66289a call() {
                return C66284a.m259347a(new File(context.getFilesDir(), ".reuse_cnt"), iAppContext);
            }
        });
        C67554l.m262725b().execute(futureTask);
        try {
            return (C66289a) futureTask.get(1800, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_ReenterGuideHelper", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052 A[SYNTHETIC, Splitter:B:25:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060 A[SYNTHETIC, Splitter:B:30:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[SYNTHETIC, Splitter:B:45:0x00b2] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0 A[SYNTHETIC, Splitter:B:50:0x00c0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tt.miniapp.p3299l.p3300a.C66289a m259347a(java.io.File r10, com.bytedance.ee.lark.infra.sandbox.context.IAppContext r11) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.p3299l.C66284a.m259347a(java.io.File, com.bytedance.ee.lark.infra.sandbox.context.IAppContext):com.tt.miniapp.l.a.a");
    }

    /* renamed from: a */
    private static C66295c m259349a(Context context, boolean z) {
        String str;
        C66295c cVar = new C66295c();
        if (z) {
            str = C12738a.m52729b(context, Settings.BDP_REENTER_TIPS, Settings.BdpReenterTips.TMG).toString();
        } else {
            str = C12738a.m52729b(context, Settings.BDP_REENTER_TIPS, Settings.BdpReenterTips.TMA).toString();
        }
        AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: setting json: " + str);
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                cVar.f167301a = jSONObject.optString("image", cVar.f167301a);
                cVar.f167303c = jSONObject.optString("buttonColor", cVar.f167303c);
                cVar.f167304d = jSONObject.optString("buttonText", cVar.f167304d);
                cVar.f167302b = jSONObject.optString("title", cVar.f167302b);
                cVar.f167305e = jSONObject.optInt("count", 0);
                JSONArray optJSONArray = jSONObject.optJSONArray("blackList");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            cVar.f167306f.add(optString);
                        }
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.m52829e("tma_ReenterGuideHelper", e);
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public static void m259350a(Context context, IAppContext iAppContext) {
        AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: preload");
        f167277b = null;
        final C66295c a = m259348a(context, AppbrandApplicationImpl.getInst(iAppContext).getAppInfo(), iAppContext);
        if (a == null) {
            AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: need't preload");
            return;
        }
        Resources resources = context.getResources();
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.microapp_m_reenter_guide_dialog_image_width);
        float dimensionPixelSize2 = (((float) resources.getDimensionPixelSize(R.dimen.microapp_m_reenter_guide_dialog_image_height)) / dimensionPixelSize) * C67590h.m263065a(context, (float) C67179c.m261841a(context, true)[0]);
        final ImageView imageView = new ImageView(context);
        int i = (int) dimensionPixelSize;
        int i2 = (int) dimensionPixelSize2;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: preload start.");
        try {
            HostDependManager.getInst().loadImage(context, new C65678c(a.f167301a).mo229921a(new ColorDrawable(0)).mo229920a(i, i2).mo229923a(new AbstractC65676a() {
                /* class com.tt.miniapp.p3299l.C66284a.C662851 */
            }).mo229922a(imageView));
        } catch (RuntimeException e) {
            AppBrandLogger.eWithThrowable("tma_ReenterGuideHelper", "r64091: preload error", e);
        }
    }

    /* renamed from: a */
    public static void m259351a(final Context context, final boolean z, final IAppContext iAppContext) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.p3299l.C66284a.C662884 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: updateFileConfig");
                File file = new File(context.getFilesDir(), ".reuse_cnt");
                C66289a b = C66284a.m259357b(context, iAppContext);
                if (b != null) {
                    if (z) {
                        b.f167291c++;
                    } else {
                        b.f167290b++;
                    }
                    b.f167289a = C66284a.f167276a;
                    C66284a.m259354a(file, b);
                }
            }
        }, C67554l.m262725b());
    }

    /* renamed from: a */
    public static void m259352a(FragmentActivity fragmentActivity, Runnable runnable, IAppContext iAppContext) {
        AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: checkReenterGuideTip");
        if (fragmentActivity == null || fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            m259355a(runnable);
            return;
        }
        AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
        C66295c a = m259348a(fragmentActivity, appInfo, iAppContext);
        if (a == null) {
            m259355a(runnable);
        } else if (!TextUtils.equals(f167277b, a.f167301a)) {
            AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: checkReenterGuideTip: can't dialog(!preload)");
            m259355a(runnable);
        } else {
            AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: checkReenterGuideTip: dialog(cnt=" + a.f167307g + ",max=" + a.f167305e + ")");
            m259353a(fragmentActivity, runnable, a, appInfo.isGame(), iAppContext);
        }
    }

    /* renamed from: a */
    private static C66295c m259348a(Context context, AppInfoEntity appInfoEntity, IAppContext iAppContext) {
        boolean z;
        int i;
        boolean z2 = true;
        if (context == null || appInfoEntity == null) {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("r64091: checkNull4Stop: ctx null?");
            if (context == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", info null?");
            if (appInfoEntity != null) {
                z2 = false;
            }
            sb.append(z2);
            objArr[0] = sb.toString();
            AppBrandLogger.m52828d("tma_ReenterGuideHelper", objArr);
            return null;
        }
        C66295c a = m259349a(context, appInfoEntity.isGame());
        if (TextUtils.isEmpty(a.f167301a) || a.f167305e <= 0 || TextUtils.isEmpty(a.f167302b) || TextUtils.isEmpty(a.f167303c) || TextUtils.isEmpty(a.f167304d)) {
            AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: checkNull4Stop: " + a);
            return null;
        } else if (a.f167306f.isEmpty() || !a.f167306f.contains(appInfoEntity.appId)) {
            C66289a b = m259357b(context, iAppContext);
            int i2 = Integer.MIN_VALUE;
            if (b != null) {
                if (appInfoEntity.isGame()) {
                    i = b.f167291c;
                } else {
                    i = b.f167290b;
                }
                i2 = i;
                if (i2 >= 0) {
                    a.f167307g = i2;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (i2 < a.f167305e && currentTimeMillis > b.f167289a + 86400000) {
                        return a;
                    }
                    AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: checkNull4Stop: need't dialog(cnt=" + i2 + ",max=" + a.f167305e + ";tg:" + (currentTimeMillis - b.f167289a) + " )");
                    return null;
                }
            }
            AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: checkNull4Stop: can't dialog(cnt=" + i2 + ",cgf=" + b + ")");
            return null;
        } else {
            AppBrandLogger.m52828d("tma_ReenterGuideHelper", "r64091: checkNull4Stop: app is in blacklist");
            return null;
        }
    }
}
