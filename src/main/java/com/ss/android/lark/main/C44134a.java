package com.ss.android.lark.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.IMainDrawerListener;
import com.ss.android.lark.biz.core.api.IPushAccountBadgeListener;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.app.AbstractC44324h;
import com.ss.android.lark.main.app.C44237e;
import com.ss.android.lark.main.app.C44238f;
import com.ss.android.lark.main.app.C44325i;
import com.ss.android.lark.main.app.DefaultDualActivity;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.main.app.drawer.p2232a.C44212a;
import com.ss.android.lark.main.app.tab.C44373s;
import com.ss.android.lark.main.app.tab.TabPreloadController;
import com.ss.android.lark.main.app.widgets.C44428b;
import com.ss.android.lark.main.app.widgets.MainDrawerListenerManager;
import com.ss.android.lark.main.app.widgets.tenant.TenantInfoUtils;
import com.ss.android.lark.main.guide.TenantSwitchGuideAgent;
import com.ss.android.lark.main.interfaces.IMainManisService;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.p2235b.C44492b;
import com.ss.android.lark.main.router.C44508c;
import com.ss.android.lark.main.router.RouterActivity;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.utils.MagicWindowUtil;
import ee.android.framework.manis.C68183b;
import io.reactivex.AbstractC69009q;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.main.a */
public class C44134a {

    /* renamed from: a */
    private static volatile AbstractC44136a f112076a;

    /* renamed from: b */
    private AbstractC29555b f112077b = new C44238f();

    /* renamed from: a */
    public static AbstractC44136a m174959a() {
        return f112076a;
    }

    /* renamed from: b */
    public AbstractC29555b mo157098b() {
        return this.f112077b;
    }

    /* renamed from: a */
    public void mo157096a(boolean z, String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        C44373s.m176069a().mo157635a(z, str, str2, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo157093a(AbstractC69009q<Pair<Activity, String>> qVar) {
        m174961m().mo157631a(qVar);
    }

    /* renamed from: a */
    public void mo157089a(AbstractC44324h hVar) {
        if (hVar != null) {
            C44325i.m175831a().mo157438a(hVar);
        }
    }

    /* renamed from: a */
    public void mo157090a(AbstractC44544a aVar) {
        C44325i.m175831a().mo157440a(aVar);
    }

    /* renamed from: a */
    public void mo157095a(boolean z) {
        Log.m165379d("MainModule", "showTenantSwitchGuideV3IfNeed");
        TenantSwitchGuideAgent.f112846a.mo157926a(z);
    }

    /* renamed from: a */
    public void mo157092a(AbstractC49405t tVar) {
        TenantInfoUtils.f112730a.mo157791a(tVar);
    }

    /* renamed from: a */
    public void mo157094a(List<TenantInfo> list, List<TenantInfo.PendingUser> list2, IGetDataCallback<List<TenantInfo>> iGetDataCallback) {
        TenantInfoUtils.f112730a.mo157793a(list, list2, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo157091a(AbstractC44546c cVar) {
        C44428b.m176318a(cVar);
    }

    /* renamed from: m */
    private C44373s m174961m() {
        return C44373s.m176069a();
    }

    /* renamed from: e */
    public List<String> mo157110e() {
        return C44237e.m175445a();
    }

    /* renamed from: f */
    public String mo157112f() {
        return MainActivity.class.getName();
    }

    /* renamed from: i */
    public void mo157118i() {
        TenantInfoUtils.f112730a.mo157788a();
    }

    /* renamed from: j */
    public Set<AbstractC49405t> mo157120j() {
        return TenantInfoUtils.f112730a.mo157799d();
    }

    /* renamed from: k */
    public void mo157122k() {
        TenantInfoUtils.f112730a.mo157795b();
    }

    /* renamed from: l */
    public void mo157123l() {
        TenantInfoUtils.f112730a.mo157798c();
    }

    /* renamed from: g */
    public boolean mo157115g() {
        return C44325i.m175831a().mo157446b();
    }

    /* renamed from: h */
    public void mo157116h() {
        C44373s.m176069a().mo157644e();
        C44325i.m175831a().mo157447c();
    }

    /* renamed from: c */
    public IMainManisService mo157105c() {
        return (IMainManisService) C68183b.m264839a().mo237086a(m174959a().mo133253i(), IMainManisService.class);
    }

    /* renamed from: d */
    public String mo157109d() {
        return m174961m().mo157642d();
    }

    /* renamed from: c */
    public void mo157107c(Context context) {
        mo157083a(context);
    }

    /* renamed from: a */
    public static String m174960a(Activity activity) {
        return C44508c.m176549a(activity);
    }

    /* renamed from: b */
    public void mo157099b(Context context) {
        TabPreloadController.m176135b(context);
    }

    /* renamed from: g */
    public void mo157114g(String str) {
        C44325i.m175831a().mo157445b(str);
    }

    /* renamed from: h */
    public void mo157117h(String str) {
        C44325i.m175831a().mo157448c(str);
    }

    public C44134a(AbstractC44136a aVar) {
        f112076a = aVar;
    }

    /* renamed from: b */
    public int mo157097b(String str) {
        return m174961m().mo157640c(str);
    }

    /* renamed from: d */
    public <T extends View> T mo157108d(String str) {
        return (T) ((View) C44373s.m176069a().mo157638b(str));
    }

    /* renamed from: f */
    public void mo157113f(String str) {
        C44325i.m175831a().mo157442a(str);
    }

    /* renamed from: i */
    public void mo157119i(String str) {
        C44325i.m175831a().mo157449d(str);
    }

    /* renamed from: a */
    public TabType mo157080a(String str) {
        return m174961m().mo157627a(m174959a().mo133253i(), str);
    }

    /* renamed from: b */
    public void mo157100b(final IGetDataCallback iGetDataCallback) {
        TenantInfoUtils.f112730a.mo157789a(new IGetDataCallback<Map<String, Integer>>() {
            /* class com.ss.android.lark.main.C44134a.C441351 */

            /* renamed from: a */
            public void onSuccess(Map<String, Integer> map) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(map);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    /* renamed from: e */
    public boolean mo157111e(String str) {
        AbstractC44136a.C44142ac.AbstractC44143a aVar;
        Map<String, AbstractC44136a.C44142ac.AbstractC44143a> E = m174959a().mo133185E();
        if (E == null || (aVar = E.get(str)) == null) {
            return false;
        }
        return aVar.isEnable();
    }

    /* renamed from: j */
    public boolean mo157121j(String str) {
        if (str == null || !str.equals(C44373s.m176069a().mo157642d())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo157101b(IPushAccountBadgeListener aeVar) {
        TenantInfoUtils.f112730a.mo157796b(aeVar);
    }

    /* renamed from: c */
    public String mo157106c(String str) {
        return m174961m().mo157639b(m174959a().mo133253i(), str);
    }

    /* renamed from: a */
    public void mo157083a(Context context) {
        f112076a.mo133182B().mo133364b("preload_data", null);
        TabPreloadController.m176133a(context);
        f112076a.mo133182B().mo133362a();
    }

    /* renamed from: b */
    public void mo157102b(IMainDrawerListener xVar) {
        MainDrawerListenerManager.f112748a.mo157810a().mo157809b(xVar);
    }

    /* renamed from: b */
    public void mo157103b(AbstractC44544a aVar) {
        C44325i.m175831a().mo157444b(aVar);
    }

    /* renamed from: b */
    public void mo157104b(AbstractC49405t tVar) {
        TenantInfoUtils.f112730a.mo157797b(tVar);
    }

    /* renamed from: a */
    public void mo157086a(IGetDataCallback<Boolean> iGetDataCallback) {
        C44373s.m176069a().mo157629a(iGetDataCallback);
    }

    /* renamed from: a */
    public void mo157087a(IPushAccountBadgeListener aeVar) {
        TenantInfoUtils.f112730a.mo157790a(aeVar);
    }

    /* renamed from: a */
    public void mo157088a(IMainDrawerListener xVar) {
        MainDrawerListenerManager.f112748a.mo157810a().mo157808a(xVar);
    }

    /* renamed from: a */
    public void mo157082a(Activity activity, IGetDataCallback<List<Pair<String, View>>> iGetDataCallback) {
        C44492b.m176503a(activity, iGetDataCallback);
    }

    /* renamed from: a */
    public void mo157081a(Activity activity, Activity activity2) {
        if ((activity2 == null || !activity2.getClass().getSimpleName().equals(DefaultDualActivity.class.getSimpleName())) && activity != null && activity != null && MagicWindowUtil.m224687e(activity)) {
            activity.startActivity(new Intent(activity, DefaultDualActivity.class));
        }
    }

    /* renamed from: a */
    public void mo157084a(Context context, Uri uri) {
        Intent intent = new Intent(context, RouterActivity.class);
        intent.setData(uri);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo157085a(LKUIBadgeView lKUIBadgeView, int i, boolean z) {
        C44212a.m175385a(lKUIBadgeView, i, z);
    }
}
