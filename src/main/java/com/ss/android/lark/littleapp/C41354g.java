package com.ss.android.lark.littleapp;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.abtest.experiment.C12958a;
import com.bytedance.ee.larkbrand.abtest.experiment.C12959b;
import com.bytedance.ee.larkbrand.abtest.experiment.C12960c;
import com.bytedance.ee.larkbrand.abtest.experiment.C12961d;
import com.bytedance.ee.larkbrand.abtest.experiment.C12962e;
import com.bytedance.ee.larkbrand.abtest.experiment.C12963f;
import com.bytedance.ee.larkbrand.abtest.experiment.C12964g;
import com.bytedance.ee.larkbrand.abtest.experiment.C12965h;
import com.bytedance.ee.larkbrand.abtest.experiment.C12966i;
import com.bytedance.ee.larkbrand.abtest.experiment.C12967j;
import com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity;
import com.bytedance.ee.larkbrand.network.glide.GlideRequest;
import com.bytedance.ee.larkbrand.utils.C13380x;
import com.larksuite.component.openplatform.core.plugin.passport.C25464i;
import com.larksuite.component.openplatform.plugins.config.LKPluginConfig;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.abtest.api.p1324a.AbstractC28490a;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import com.ss.android.lark.littleapp.p2123a.C41299a;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.p2126d.C41319a;
import com.ss.android.lark.littleapp.plugin.OfflineFaceCheckPlugin;
import com.ss.android.lark.littleapp.plugin.OfflineFacePreparePlugin;
import com.ss.android.lark.littleapp.plugin.OfflineFaceStartPlugin;
import com.ss.android.lark.littleapp.plugin.chooseimage.ChooseImagePlugin;
import com.ss.android.lark.littleapp.plugin.chooseimage.ChooseMediaPlugin;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.littleapp.service.p2132a.C41437d;
import com.ss.android.lark.littleapp.view.C41468d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.notification.export.AbstractNotification;
import com.ss.android.lark.utils.ApiUtils;
import com.tt.refer.common.base.AppType;
import com.tt.refer.impl.business.file.C67923b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import okhttp3.OkHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.g */
public class C41354g {

    /* renamed from: a */
    private static final List<AbstractC28490a> f105176a;

    /* renamed from: g */
    public static List<AbstractC28490a> m163940g() {
        return f105176a;
    }

    /* renamed from: b */
    public ILittleAppService mo148943b() {
        return C41437d.m164411e();
    }

    /* renamed from: c */
    public IDiskCleanTask mo148945c() {
        return new C67923b();
    }

    /* renamed from: f */
    public AppType mo148948f() {
        return C41299a.m163737a();
    }

    /* renamed from: h */
    public void mo148949h() {
        mo148943b().mo149180c();
    }

    /* renamed from: j */
    public void mo148950j() {
        AppCookieJarMgr.f34120a.mo48264a();
    }

    /* renamed from: a */
    public static AbstractC41301a m163939a() {
        return (AbstractC41301a) ApiUtils.getApi(AbstractC41301a.class);
    }

    /* renamed from: d */
    public OkHttpClient mo148946d() {
        return C12843b.m53036a(15000, 10000, 30000);
    }

    /* renamed from: e */
    public List<AbstractNotification> mo148947e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C41319a());
        return arrayList;
    }

    static {
        ArrayList arrayList = new ArrayList();
        f105176a = arrayList;
        arrayList.add(new C12961d());
        arrayList.add(new C12959b());
        arrayList.add(new C12964g());
        arrayList.add(new C12966i());
        arrayList.add(new C12960c());
        arrayList.add(new C12963f());
        arrayList.add(new C41299a());
        arrayList.add(new C12967j());
        arrayList.add(new C12958a());
        arrayList.add(new C12965h());
        arrayList.add(new C12962e());
    }

    /* renamed from: i */
    public static List<LKPluginConfig> m163941i() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new LKPluginConfig.C25571a().mo88746a(OfflineFaceCheckPlugin.class).mo88748a(Arrays.asList("checkLocalFaceVerify")).mo88749a());
        linkedList.add(new LKPluginConfig.C25571a().mo88746a(OfflineFacePreparePlugin.class).mo88748a(Arrays.asList("prepareLocalFaceVerify")).mo88749a());
        linkedList.add(new LKPluginConfig.C25571a().mo88746a(OfflineFaceStartPlugin.class).mo88748a(Arrays.asList("startLocalFaceVerify")).mo88749a());
        linkedList.add(new LKPluginConfig.C25571a().mo88745a(new ChooseImagePlugin()).mo88749a());
        linkedList.add(new LKPluginConfig.C25571a().mo88745a(new ChooseMediaPlugin()).mo88749a());
        return linkedList;
    }

    /* renamed from: b */
    public boolean mo148944b(Context context) {
        return C26252ad.m94992a(context).contains(":miniapp");
    }

    /* renamed from: a */
    public void mo148936a(Context context) {
        ILittleAppService b = mo148943b();
        b.mo149172b();
        b.mo149146a(context);
        AppCookieJarMgr.f34120a.mo48264a();
    }

    /* renamed from: a */
    public void mo148941a(boolean z) {
        mo148943b().mo149158a(z);
        AppCookieJarMgr.f34120a.mo48264a();
    }

    /* renamed from: a */
    public void mo148937a(Context context, int i) {
        mo148943b().mo149147a(context, i);
    }

    /* renamed from: a */
    public String mo148935a(String str, String str2, String str3) {
        if (str2 != null) {
            str = C13380x.m54429a(str, "required_launch_ability", str2);
        }
        if (str3 == null) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__trigger_id__", str3);
            return C13380x.m54429a(str, "bdp_launch_query", Uri.encode(jSONObject.toString()));
        } catch (JSONException unused) {
            Log.m165383e("LittleAppModule", "json error trigger_id");
            return str;
        }
    }

    /* renamed from: a */
    public void mo148938a(Context context, String str, int i) {
        C41437d.m164411e().mo149151a(context, str, i);
    }

    /* renamed from: a */
    public void mo148939a(Context context, String str, C25464i.AbstractC25468c cVar) {
        C41437d.m164411e().mo149200a(context, str, cVar);
    }

    /* renamed from: a */
    public boolean mo148942a(String str, Context context, int i) {
        if (!C41437d.m164411e().mo149206g(str)) {
            return false;
        }
        C41437d.m164411e().mo149151a(context, str, i);
        return true;
    }

    /* renamed from: a */
    public AbstractC44552i mo148934a(Context context, AbstractC44548e eVar, ITitleController iTitleController, TabAppInfo tabAppInfo) {
        mo148943b().mo149144a();
        Log.m165389i("LittleAppModule", "createGadgetPageSpec and init gadget");
        return new C41468d(context, eVar, iTitleController, tabAppInfo);
    }

    /* renamed from: a */
    public void mo148940a(Fragment fragment, List<GlideRequest> list, int i, PhotoPreviewActivity.AbstractC13169b bVar) {
        fragment.startActivity(PhotoPreviewActivity.m53805a(fragment.getContext(), list, (List<GlideRequest>) null, (List<GlideRequest>) null, i, bVar));
    }
}
