package com.ss.android.lark.main.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import androidx.core.util.C0844e;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.fragment.C44273e;
import com.ss.android.lark.main.app.tab.C44373s;
import com.ss.android.lark.main.app.tab.C44384t;
import com.ss.android.lark.main.app.tab.p2233a.C44357a;
import com.ss.android.lark.main.app.title.C44404a;
import com.ss.android.lark.main.app.title.MainTitle;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44549f;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.AbstractC44557j;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.maincore.TabType;
import com.ss.android.lark.maincore.dto.TabAppInfo;
import com.ss.android.lark.maincore.dto.TabInfo;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.main.app.k */
public class C44331k {

    /* renamed from: a */
    private static final int f112406a;

    /* renamed from: n */
    private static Map<String, String> f112407n = new HashMap();

    /* renamed from: b */
    private Map<String, Integer> f112408b = new LinkedHashMap();

    /* renamed from: c */
    private AbstractC44552i f112409c;

    /* renamed from: d */
    private List<AbstractC44552i> f112410d = new ArrayList();

    /* renamed from: e */
    private List<String> f112411e = new ArrayList();

    /* renamed from: f */
    private Map<String, AbstractC44552i> f112412f = new LinkedHashMap();

    /* renamed from: g */
    private String f112413g;

    /* renamed from: h */
    private TabInfo f112414h;

    /* renamed from: i */
    private String f112415i;

    /* renamed from: j */
    private Map<String, AbstractC44136a.C44142ac> f112416j;

    /* renamed from: k */
    private Context f112417k = null;

    /* renamed from: l */
    private WeakReference<AbstractC44548e> f112418l = null;

    /* renamed from: m */
    private WeakReference<C44404a> f112419m = null;

    /* renamed from: c */
    public AbstractC44552i mo157461c() {
        return this.f112409c;
    }

    /* renamed from: d */
    public List<AbstractC44552i> mo157462d() {
        return this.f112410d;
    }

    /* renamed from: e */
    public String mo157465e() {
        return this.f112413g;
    }

    /* renamed from: a */
    public void mo157454a(AbstractC44552i iVar) {
        if (iVar != null) {
            this.f112411e.add(iVar.mo31311b());
        }
    }

    /* renamed from: a */
    public void mo157453a(IGetDataCallback<C0844e<String, C44357a>> iGetDataCallback) {
        if (iGetDataCallback != null) {
            String P = C44134a.m174959a().mo133196P();
            TabInfo tabInfo = this.f112414h;
            List<TabAppInfo> emptyList = tabInfo == null ? Collections.emptyList() : tabInfo.getMainApps();
            TabInfo tabInfo2 = this.f112414h;
            CoreThreadPool.getSerialTaskHandler().post(new RunnableC44332a(P, UserSP.getInstance(), emptyList, tabInfo2 == null ? Collections.emptyList() : tabInfo2.getNavApps(), iGetDataCallback));
        }
    }

    /* renamed from: a */
    public void mo157455a(List<TabAppInfo> list, List<TabAppInfo> list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(list2);
        UserSP.getInstance().putJSONArray("last_all_tab_app_info", arrayList);
        UserSP.getInstance().putJSONArray("last_main_tab_app_info", list);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.k$b */
    public static class C44334b implements AbstractC44549f {

        /* renamed from: a */
        private C44404a f112427a;

        /* renamed from: b */
        private String f112428b;

        @Override // com.ss.android.lark.maincore.ITitleController
        /* renamed from: a */
        public int mo99189a() {
            return this.f112427a.mo99189a();
        }

        @Override // com.ss.android.lark.maincore.ITitleController
        /* renamed from: b */
        public ITitleController.Style mo99193b() {
            return this.f112427a.mo99193b();
        }

        @Override // com.ss.android.lark.maincore.AbstractC44549f
        /* renamed from: e */
        public View mo99197e() {
            return this.f112427a.mo99197e();
        }

        @Override // com.ss.android.lark.maincore.ITitleController
        /* renamed from: c */
        public Bitmap mo99195c() {
            if (TextUtils.equals(this.f112427a.mo157717f(), this.f112428b)) {
                return this.f112427a.mo99195c();
            }
            return null;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44549f
        /* renamed from: d */
        public View mo99196d() {
            if (TextUtils.equals(this.f112427a.mo157717f(), this.f112428b)) {
                return this.f112427a.mo157718g();
            }
            return null;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44549f
        /* renamed from: a */
        public void mo99190a(View view) {
            ((MainTitle) this.f112427a.mo99197e()).mo157673a(view);
        }

        @Override // com.ss.android.lark.maincore.ITitleController
        /* renamed from: a */
        public void mo99191a(ITitleInfo iTitleInfo) {
            if (TextUtils.equals(this.f112427a.mo157717f(), this.f112428b)) {
                this.f112427a.mo99191a(iTitleInfo);
            }
        }

        @Override // com.ss.android.lark.maincore.ITitleController
        /* renamed from: b */
        public void mo99194b(boolean z) {
            if (TextUtils.equals(this.f112427a.mo157717f(), this.f112428b)) {
                this.f112427a.mo99194b(z);
            }
        }

        @Override // com.ss.android.lark.maincore.ITitleController
        /* renamed from: a */
        public void mo99192a(boolean z) {
            if (TextUtils.equals(this.f112427a.mo157717f(), this.f112428b)) {
                this.f112427a.mo99192a(z);
            }
        }

        public C44334b(C44404a aVar, String str) {
            this.f112427a = aVar;
            this.f112428b = str;
        }
    }

    /* renamed from: f */
    private void m175856f() {
        this.f112408b.clear();
        this.f112410d.clear();
        this.f112414h = null;
    }

    static {
        int i;
        if (DesktopUtil.m144301a(UIHelper.getContext())) {
            i = 10;
        } else {
            i = 6;
        }
        f112406a = i;
    }

    public C44331k() {
        C44373s.m176069a().mo157646g();
    }

    /* renamed from: b */
    public void mo157458b() {
        for (AbstractC44552i iVar : this.f112410d) {
            if (iVar != null) {
                iVar.mo31316g();
            }
        }
        this.f112410d.clear();
        this.f112417k = null;
        WeakReference<AbstractC44548e> weakReference = this.f112418l;
        if (weakReference != null) {
            weakReference.clear();
            this.f112418l = null;
        }
        WeakReference<C44404a> weakReference2 = this.f112419m;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.f112419m = null;
        }
        Map<String, AbstractC44136a.C44142ac> map = this.f112416j;
        if (map != null) {
            map.clear();
            this.f112416j = null;
        }
        C44373s.m176069a().mo157647h();
        C44373s.m176069a().mo157644e();
    }

    /* renamed from: com.ss.android.lark.main.app.k$a */
    private static class RunnableC44332a implements Runnable {

        /* renamed from: a */
        public String f112420a;

        /* renamed from: b */
        IGetDataCallback<C0844e<String, C44357a>> f112421b;

        /* renamed from: c */
        private UserSP f112422c;

        /* renamed from: d */
        private List<TabAppInfo> f112423d;

        /* renamed from: e */
        private List<TabAppInfo> f112424e;

        public void run() {
            List jSONArray = this.f112422c.getJSONArray("last_main_tab_app_info", TabAppInfo.class);
            List jSONArray2 = this.f112422c.getJSONArray("last_all_tab_app_info", TabAppInfo.class);
            List<TabAppInfo> list = this.f112423d;
            if (list != null && !list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f112423d);
                List<TabAppInfo> list2 = this.f112424e;
                if (list2 != null) {
                    arrayList.addAll(list2);
                }
                if (jSONArray2 == null || jSONArray2.isEmpty()) {
                    UserSP.getInstance().putJSONArray("last_all_tab_app_info", arrayList);
                }
                if (jSONArray == null || jSONArray.isEmpty()) {
                    UserSP.getInstance().putJSONArray("last_main_tab_app_info", this.f112423d);
                    return;
                }
                final C44357a aVar = new C44357a();
                List<TabAppInfo> arrayList2 = new ArrayList<>(this.f112423d);
                List<TabAppInfo> arrayList3 = new ArrayList<>(jSONArray);
                arrayList2.removeAll(jSONArray);
                m175878a(arrayList2);
                arrayList3.removeAll(this.f112423d);
                m175878a(arrayList3);
                aVar.mo157543a(arrayList2);
                aVar.mo157547b(arrayList3);
                if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
                    if (jSONArray.size() == this.f112423d.size()) {
                        int i = 0;
                        while (true) {
                            if (i >= jSONArray.size()) {
                                break;
                            } else if (!((TabAppInfo) jSONArray.get(i)).equals(this.f112423d.get(i))) {
                                aVar.mo157544a(true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    } else {
                        Log.m165397w("MainModule_TabController", "same tab, but size not match; last=" + C44384t.m176129a(jSONArray) + ", current=" + C44384t.m176129a(this.f112423d));
                    }
                }
                this.f112422c.putJSONArray("last_main_tab_app_info", this.f112423d);
                if (aVar.mo157545a()) {
                    Log.m165389i("MainModule_TabController", "main tab diff result: " + aVar);
                } else {
                    Log.m165389i("MainModule_TabController", "main tab was same with last time");
                }
                ArrayList arrayList4 = new ArrayList(arrayList);
                if (jSONArray2 != null && arrayList4.removeAll(jSONArray2)) {
                    aVar.mo157549c(arrayList4);
                }
                this.f112422c.putJSONArray("last_all_tab_app_info", arrayList);
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.main.app.C44331k.RunnableC44332a.RunnableC443331 */

                    public void run() {
                        if (RunnableC44332a.this.f112421b != null) {
                            RunnableC44332a.this.f112421b.onSuccess(new C0844e<>(RunnableC44332a.this.f112420a, aVar));
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        private void m175878a(List<TabAppInfo> list) {
            Iterator<TabAppInfo> it = list.iterator();
            while (it.hasNext()) {
                TabAppInfo next = it.next();
                if (next == null) {
                    it.remove();
                } else if (next.getName() == null) {
                    it.remove();
                } else if (TextUtils.isEmpty(next.getName().getCn())) {
                    it.remove();
                } else if (TextUtils.isEmpty(next.getName().getJp())) {
                    it.remove();
                } else if (TextUtils.isEmpty(next.getName().getUs())) {
                    it.remove();
                }
            }
        }

        public RunnableC44332a(String str, UserSP userSP, List<TabAppInfo> list, List<TabAppInfo> list2, IGetDataCallback<C0844e<String, C44357a>> iGetDataCallback) {
            this.f112420a = str;
            this.f112422c = userSP;
            this.f112423d = list;
            this.f112424e = list2;
            this.f112421b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public void mo157451a() {
        if (!CollectionUtils.isEmpty(this.f112412f)) {
            this.f112412f.clear();
            this.f112411e.clear();
        }
    }

    /* renamed from: h */
    public void mo157468h(String str) {
        this.f112413g = str;
    }

    /* renamed from: b */
    public void mo157459b(String str) {
        this.f112411e.remove(str);
    }

    /* renamed from: f */
    public AbstractC44552i mo157466f(String str) {
        return mo157450a(str, false);
    }

    /* renamed from: a */
    public static String m175850a(String str) {
        return f112407n.get(str);
    }

    /* renamed from: e */
    public AbstractC44552i mo157464e(String str) {
        return this.f112412f.get(str);
    }

    /* renamed from: a */
    private boolean m175853a(TabAppInfo tabAppInfo) {
        if (tabAppInfo == null) {
            return false;
        }
        if ("gadget".equals(tabAppInfo.getAppType()) || "webapp".equals(tabAppInfo.getAppType())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m175855b(TabAppInfo tabAppInfo) {
        if (tabAppInfo == null) {
            return false;
        }
        if (m175853a(tabAppInfo) || "appCenter".equals(tabAppInfo.getKey())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int mo157460c(String str) {
        int i = -1;
        for (String str2 : this.f112411e) {
            if (str2 != null) {
                i++;
                if (TextUtils.equals(str2, str)) {
                    break;
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    public boolean mo157463d(String str) {
        for (String str2 : this.f112411e) {
            if (str2 != null && TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public Integer mo157467g(String str) {
        if (!this.f112408b.containsKey(str)) {
            return -1;
        }
        return this.f112408b.get(str);
    }

    /* renamed from: b */
    public C44273e mo157456b(AbstractC44552i iVar) {
        if (!this.f112411e.contains(iVar.mo31311b())) {
            this.f112411e.add(iVar.mo31311b());
            Log.m165389i("MainModule_TabController", "loadContentFragment:" + iVar.mo31311b());
        }
        return new C44273e(iVar.mo31318i(), iVar.mo31311b());
    }

    /* renamed from: i */
    public TabType mo157469i(String str) {
        TabInfo tabInfo = this.f112414h;
        if (tabInfo == null) {
            return TabType.Main;
        }
        if (tabInfo.getMainAppNames().contains(str)) {
            return TabType.Main;
        }
        if (tabInfo.getNavAppNames().contains(str)) {
            return TabType.Navigation;
        }
        return TabType.Others;
    }

    /* renamed from: j */
    private AbstractC44552i m175857j(String str) {
        if ("gadget".equals(str) || "webapp".equals(str)) {
            return null;
        }
        AbstractC44552i e = mo157464e(str);
        if (e != null) {
            return e;
        }
        Map<String, AbstractC44136a.C44142ac> map = this.f112416j;
        if (map != null && this.f112418l != null && this.f112419m != null) {
            for (AbstractC44136a.C44142ac acVar : map.values()) {
                if (acVar.mo157127a().equals(str)) {
                    AbstractC44548e eVar = this.f112418l.get();
                    C44404a aVar = this.f112419m.get();
                    if (this.f112417k == null || eVar == null || aVar == null) {
                        break;
                    }
                    boolean b = DesktopUtil.m144307b();
                    AbstractC44552i createTabPageSpec = acVar.mo157131d().createTabPageSpec(this.f112417k, eVar, b ? null : new C44334b(aVar, str));
                    if (!b || (createTabPageSpec instanceof AbstractC36553a)) {
                        this.f112412f.put(str, createTabPageSpec);
                        return createTabPageSpec;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m175854a(String str, List<AbstractC44552i> list) {
        if (list == null) {
            return false;
        }
        for (AbstractC44552i iVar : list) {
            if (iVar != null && TextUtils.equals(iVar.mo31311b(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC44552i mo157450a(String str, boolean z) {
        List<AbstractC44552i> list = this.f112410d;
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (AbstractC44552i iVar : this.f112410d) {
            if (iVar != null && TextUtils.equals(iVar.mo31311b(), str)) {
                return iVar;
            }
        }
        if (z) {
            return m175857j(str);
        }
        return null;
    }

    /* renamed from: b */
    public List<String> mo157457b(Context context, AbstractC44548e eVar, C44404a aVar) {
        C44373s.m176069a().mo157644e();
        TabInfo tabInfo = this.f112414h;
        ArrayList<AbstractC44552i> arrayList = new ArrayList(this.f112410d);
        mo157452a(context, eVar, aVar);
        List<AbstractC44552i> list = this.f112410d;
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC44552i iVar : arrayList) {
            if (tabInfo != null && m175855b(tabInfo.getTabAppInfoByKey(iVar.mo31311b()))) {
                arrayList2.add(iVar.mo31311b());
            } else if (!m175854a(iVar.mo31311b(), list)) {
                arrayList2.add(iVar.mo31311b());
                if (DesktopUtil.m144301a(context)) {
                    C36512a.m144041a().mo134767a(iVar.mo31311b());
                }
            }
        }
        this.f112411e.removeAll(arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    public void mo157452a(Context context, AbstractC44548e eVar, C44404a aVar) {
        this.f112417k = context;
        this.f112418l = new WeakReference<>(eVar);
        this.f112419m = new WeakReference<>(aVar);
        m175856f();
        TabInfo b = C44373s.m176069a().mo157637b();
        this.f112416j = new HashMap(C44134a.m174959a().mo133232b(context));
        Log.m165389i("MainModule_TabController", "load tab info mAllTabPageItems " + this.f112416j.size());
        if (b == null) {
            Log.m165383e("MainModule_TabController", "load tab info failed; tabInfo = null , is desktop mode = " + DesktopUtil.m144301a(context));
            m175852a(this.f112416j, context, eVar, aVar);
            return;
        }
        Log.m165389i("MainModule_TabController", "load tab info; is desktop mode = " + DesktopUtil.m144301a(context));
        List<TabAppInfo> mainApps = b.getMainApps();
        List<TabAppInfo> navApps = b.getNavApps();
        m175851a(context, eVar, aVar, 0, mainApps);
        m175851a(context, eVar, aVar, 0, navApps);
        if (this.f112410d.size() == 0) {
            Log.m165383e("MainModule_TabController", "custom tab fg is on, but tab size is empty");
            m175852a(this.f112416j, context, eVar, aVar);
        } else {
            this.f112409c = this.f112410d.get(0);
            this.f112414h = b;
            this.f112415i = C44134a.m174959a().mo133196P();
        }
        if (this.f112409c != null) {
            C44373s.m176069a().mo157632a(this.f112409c.mo31311b());
        }
    }

    /* renamed from: a */
    private void m175852a(Map<String, AbstractC44136a.C44142ac> map, Context context, AbstractC44548e eVar, C44404a aVar) {
        C44334b bVar;
        m175856f();
        boolean a = DesktopUtil.m144301a(context);
        int i = 0;
        for (String str : map.keySet()) {
            if (i >= f112406a) {
                Log.m165397w("MainModule_TabController", "filter tab cause fg off strategy; tab name = " + str);
            } else {
                AbstractC44136a.C44142ac acVar = map.get(str);
                if (acVar.mo157130c() != null && acVar.mo157130c().isEnable()) {
                    acVar.mo157128a(i);
                    AbstractC44552i e = mo157464e(str);
                    if (e == null) {
                        AbstractC44136a.C44142ac.AbstractC44145c d = acVar.mo157131d();
                        if (a) {
                            bVar = null;
                        } else {
                            bVar = new C44334b(aVar, str);
                        }
                        e = d.createTabPageSpec(context, eVar, bVar);
                    }
                    if (a && !this.f112411e.contains(str)) {
                        if (e instanceof AbstractC36553a) {
                            C36512a.m144041a().mo134766a((AbstractC36553a) e);
                        }
                    }
                    if (acVar.mo157129b()) {
                        this.f112409c = e;
                    }
                    this.f112410d.add(e);
                    this.f112408b.put(str, Integer.valueOf(i));
                    this.f112412f.put(str, e);
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private void m175851a(Context context, AbstractC44548e eVar, C44404a aVar, int i, List<TabAppInfo> list) {
        if (list != null) {
            for (TabAppInfo tabAppInfo : list) {
                int a = m175849a(context, eVar, aVar, i, tabAppInfo);
                if (i == a) {
                    Log.m165397w("MainModule_TabController", "missed tab item for nav; name = " + tabAppInfo.getKey());
                }
                i = a;
            }
        }
    }

    /* renamed from: a */
    private int m175849a(Context context, AbstractC44548e eVar, C44404a aVar, int i, TabAppInfo tabAppInfo) {
        C44334b bVar;
        boolean a = DesktopUtil.m144301a(context);
        AbstractC44136a.C44142ac acVar = this.f112416j.get(tabAppInfo.getKey());
        if (acVar == null) {
            Log.m165383e("MainModule_TabController", "AllTabPageItems missed " + tabAppInfo.getKey());
            Iterator<String> it = this.f112416j.keySet().iterator();
            while (it.hasNext()) {
                Log.m165383e("MainModule_TabController", "AllTabPageItems " + it.next());
            }
            if (C44134a.m174959a().mo133232b(context).get(tabAppInfo.getKey()) == null) {
                return i;
            }
            this.f112416j = C44134a.m174959a().mo133232b(context);
        }
        AbstractC44552i e = mo157464e(tabAppInfo.getKey());
        if (e == null) {
            AbstractC44136a.C44142ac.AbstractC44145c d = acVar.mo157131d();
            if (a) {
                bVar = null;
            } else {
                bVar = new C44334b(aVar, tabAppInfo.getKey());
            }
            e = d.createTabPageSpec(context, eVar, bVar);
        } else if (e instanceof AbstractC44557j) {
            ((AbstractC44557j) e).mo158102a(tabAppInfo);
        }
        if (e == null) {
            return i;
        }
        int i2 = i + 1;
        this.f112408b.put(tabAppInfo.getKey(), Integer.valueOf(i));
        f112407n.put(e.mo31311b(), tabAppInfo.getKey());
        if (a && !this.f112411e.contains(e.mo31311b())) {
            if (!(e instanceof AbstractC36553a)) {
                return i2;
            }
            C36512a.m144041a().mo134766a((AbstractC36553a) e);
        }
        this.f112410d.add(e);
        if (!m175853a(tabAppInfo)) {
            this.f112412f.put(tabAppInfo.getKey(), e);
        }
        return i2;
    }
}
