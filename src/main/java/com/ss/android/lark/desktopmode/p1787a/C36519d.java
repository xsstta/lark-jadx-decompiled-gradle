package com.ss.android.lark.desktopmode.p1787a;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.base.MainWindowParams;
import com.ss.android.lark.desktopmode.p1788b.p1789a.C36535d;
import com.ss.android.lark.desktopmode.p1788b.p1790b.AbstractC36536a;
import com.ss.android.lark.desktopmode.p1788b.p1790b.C36537b;
import com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36544b;
import com.ss.android.lark.desktopmode.p1788b.p1791c.C36538a;
import com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c;
import com.ss.android.lark.desktopmode.p1788b.p1792d.C36548b;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36553a;
import com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36554b;
import com.ss.android.lark.desktopmode.p1788b.p1793e.C36557c;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.desktopmode.a.d */
public class C36519d {

    /* renamed from: a */
    public C36538a f94034a;

    /* renamed from: b */
    public C36535d f94035b;

    /* renamed from: c */
    private C36557c f94036c;

    /* renamed from: d */
    private AbstractC36551c f94037d;

    /* renamed from: e */
    private C36537b f94038e;

    /* renamed from: f */
    private boolean f94039f;

    /* renamed from: g */
    private boolean f94040g;

    /* renamed from: h */
    private HashMap<String, String> f94041h;

    /* renamed from: i */
    private AbstractC36527c f94042i;

    /* renamed from: j */
    private Activity f94043j;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.desktopmode.a.d$b */
    public static final class C36526b {

        /* renamed from: a */
        public static final C36519d f94056a = new C36519d();
    }

    /* renamed from: com.ss.android.lark.desktopmode.a.d$c */
    public interface AbstractC36527c {

        /* renamed from: com.ss.android.lark.desktopmode.a.d$c$a */
        public interface AbstractC36528a {
            /* renamed from: a */
            void mo134843a(String str, String str2);
        }

        /* renamed from: a */
        Activity mo134837a();

        /* renamed from: b */
        FragmentManager mo134838b();

        /* renamed from: c */
        Map<ContainerType, C36525a> mo134839c();

        /* renamed from: d */
        DrawerLayout mo134840d();

        /* renamed from: e */
        FrameLayout mo134841e();

        /* renamed from: f */
        AbstractC36528a mo134842f();
    }

    /* renamed from: g */
    public void mo134825g() {
    }

    /* renamed from: a */
    public static C36519d m144080a() {
        return C36526b.f94056a;
    }

    /* renamed from: h */
    public Activity mo134826h() {
        return this.f94043j;
    }

    /* renamed from: a */
    public void mo134812a(AbstractC36553a aVar) {
        if (this.f94039f) {
            this.f94036c.mo134910a(aVar);
        }
    }

    /* renamed from: a */
    public void mo134813a(String str) {
        if (this.f94039f) {
            this.f94036c.mo134918c(str);
            this.f94036c.mo134914a(str);
        }
    }

    /* renamed from: a */
    public void mo134814a(String str, boolean z) {
        if (this.f94039f) {
            this.f94036c.mo134917b(str);
            if (this.f94040g && z) {
                m144084i();
            }
        }
    }

    /* renamed from: a */
    public void mo134808a(C36516a aVar, MainWindowParams mainWindowParams) {
        mo134809a(aVar, mainWindowParams, (String) null, -1);
    }

    /* renamed from: a */
    public void mo134809a(C36516a aVar, MainWindowParams mainWindowParams, String str, int i) {
        aVar.setFragmentParams(mainWindowParams);
        if (this.f94039f) {
            m144081a(str, i, aVar);
            ContainerType containerType = aVar.getFragmentParams().getContainerType();
            this.f94036c.mo134915a(((MainWindowParams) aVar.getFragmentParams()).getTabName(), containerType, aVar);
            if (this.f94040g || mainWindowParams.isBringToFront()) {
                m144084i();
            }
        }
    }

    /* renamed from: a */
    public void mo134811a(AbstractC36536a aVar) {
        if (this.f94039f) {
            this.f94038e.mo134865a(aVar);
        }
    }

    /* renamed from: a */
    public boolean mo134816a(KeyEvent keyEvent) {
        if (!this.f94039f) {
            return false;
        }
        return this.f94038e.mo134866a(keyEvent);
    }

    /* renamed from: a */
    public void mo134815a(boolean z) {
        this.f94040g = z;
    }

    /* renamed from: a */
    public void mo134810a(final AbstractC36527c cVar) {
        this.f94042i = cVar;
        this.f94043j = cVar.mo134837a();
        this.f94038e = new C36537b();
        C36548b bVar = new C36548b();
        this.f94037d = bVar;
        this.f94036c = new C36557c(bVar);
        this.f94034a = new C36538a(this.f94037d);
        this.f94035b = new C36535d(this.f94037d);
        this.f94037d.mo134894a(new AbstractC36551c.AbstractC36552a() {
            /* class com.ss.android.lark.desktopmode.p1787a.C36519d.C365212 */

            @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c.AbstractC36552a
            /* renamed from: a */
            public FragmentManager mo134828a() {
                return cVar.mo134838b();
            }

            @Override // com.ss.android.lark.desktopmode.p1788b.p1792d.AbstractC36551c.AbstractC36552a
            /* renamed from: b */
            public Map<ContainerType, Integer> mo134829b() {
                HashMap hashMap = new HashMap(5);
                for (C36525a aVar : cVar.mo134839c().values()) {
                    hashMap.put(aVar.f94055c, Integer.valueOf(aVar.f94053a));
                }
                return hashMap;
            }
        });
        m144083c(cVar);
        m144082b(cVar);
        this.f94039f = true;
    }

    private C36519d() {
        this.f94041h = new HashMap<>();
    }

    /* renamed from: c */
    public void mo134821c() {
        if (this.f94039f) {
            this.f94034a.mo134877d();
        }
    }

    /* renamed from: d */
    public void mo134822d() {
        if (this.f94039f) {
            this.f94034a.mo134875c();
        }
    }

    /* renamed from: f */
    public void mo134824f() {
        UICallbackExecutor.executeDelayed(new Runnable() {
            /* class com.ss.android.lark.desktopmode.p1787a.C36519d.RunnableC365201 */

            public void run() {
                for (C36516a aVar : C36519d.this.mo134823e()) {
                    aVar.onWindowFocusChanged(true);
                }
            }
        }, 100);
    }

    /* renamed from: i */
    private void m144084i() {
        Activity activity = this.f94043j;
        Intent intent = new Intent(activity, activity.getClass());
        intent.setFlags(272629760);
        this.f94043j.startActivity(intent);
    }

    /* renamed from: b */
    public String mo134818b() {
        if (!this.f94039f) {
            return null;
        }
        return this.f94036c.mo134909a();
    }

    /* renamed from: e */
    public List<C36516a> mo134823e() {
        ArrayList arrayList = new ArrayList();
        C36516a b = mo134817b(ContainerType.Float);
        if (b != null) {
            arrayList.add(b);
            return arrayList;
        }
        C36516a b2 = mo134817b(ContainerType.Drawer);
        if (b2 != null) {
            arrayList.add(b2);
        }
        arrayList.addAll(new ArrayList(this.f94036c.mo134919d(this.f94036c.mo134909a()).values()));
        return arrayList;
    }

    /* renamed from: b */
    public C36516a mo134817b(ContainerType containerType) {
        return this.f94037d.mo134897b(containerType);
    }

    /* renamed from: b */
    private void m144082b(final AbstractC36527c cVar) {
        this.f94034a.mo134871a(new AbstractC36544b.AbstractC36545a() {
            /* class com.ss.android.lark.desktopmode.p1787a.C36519d.C365223 */

            @Override // com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36544b.AbstractC36545a
            /* renamed from: a */
            public DrawerLayout mo134830a() {
                return cVar.mo134840d();
            }

            @Override // com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36544b.AbstractC36545a
            /* renamed from: c */
            public FrameLayout mo134832c() {
                return cVar.mo134841e();
            }

            @Override // com.ss.android.lark.desktopmode.p1788b.p1791c.AbstractC36544b.AbstractC36545a
            /* renamed from: b */
            public View mo134831b() {
                C36525a aVar = cVar.mo134839c().get(ContainerType.Drawer);
                if (aVar != null) {
                    return aVar.f94054b;
                }
                return null;
            }
        });
    }

    /* renamed from: a */
    public void mo134801a(View view) {
        if (this.f94039f) {
            this.f94034a.mo134869a(view);
        }
    }

    /* renamed from: c */
    private void m144083c(final AbstractC36527c cVar) {
        this.f94036c.mo134912a(new AbstractC36554b.AbstractC36555a() {
            /* class com.ss.android.lark.desktopmode.p1787a.C36519d.C365234 */

            @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36554b.AbstractC36555a
            /* renamed from: a */
            public View mo134833a() {
                C36525a aVar = cVar.mo134839c().get(ContainerType.Left);
                if (aVar != null) {
                    return aVar.f94054b;
                }
                return null;
            }

            @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36554b.AbstractC36555a
            /* renamed from: b */
            public View mo134834b() {
                C36525a aVar = cVar.mo134839c().get(ContainerType.Right);
                if (aVar != null) {
                    return aVar.f94054b;
                }
                return null;
            }

            @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36554b.AbstractC36555a
            /* renamed from: c */
            public View mo134835c() {
                C36525a aVar = cVar.mo134839c().get(ContainerType.ALL);
                if (aVar != null) {
                    return aVar.f94054b;
                }
                return null;
            }
        });
        this.f94036c.mo134913a(new AbstractC36554b.AbstractC36556b() {
            /* class com.ss.android.lark.desktopmode.p1787a.C36519d.C365245 */

            @Override // com.ss.android.lark.desktopmode.p1788b.p1793e.AbstractC36554b.AbstractC36556b
            /* renamed from: a */
            public void mo134836a(String str, String str2) {
                C36519d.this.f94035b.mo134862a();
                C36519d.this.f94034a.mo134877d();
                C36519d.this.f94034a.mo134873b();
                cVar.mo134842f().mo134843a(str, str2);
            }
        });
    }

    /* renamed from: a */
    public Rect mo134800a(ContainerType containerType) {
        C36525a aVar;
        Rect rect = new Rect();
        AbstractC36527c cVar = this.f94042i;
        if (!(cVar == null || (aVar = cVar.mo134839c().get(containerType)) == null || aVar.f94054b == null)) {
            aVar.f94054b.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    /* renamed from: b */
    public void mo134819b(AbstractC36536a aVar) {
        if (this.f94039f) {
            this.f94038e.mo134867b(aVar);
        }
    }

    /* renamed from: a */
    public void mo134802a(C36516a aVar) {
        if (this.f94039f) {
            if (aVar.getFragmentParams() instanceof MainWindowParams) {
                this.f94037d.mo134901c(aVar);
            } else if (aVar.getFragmentParams() instanceof DrawerParams) {
                this.f94034a.mo134868a();
            } else if (aVar.getFragmentParams() instanceof FloatWindowParams) {
                this.f94035b.mo134864b(aVar);
            }
        }
    }

    /* renamed from: b */
    public void mo134820b(String str) {
        if (this.f94039f) {
            this.f94036c.mo134918c(str);
        }
    }

    /* renamed from: a */
    public void mo134804a(C36516a aVar, DrawerParams drawerParams) {
        mo134805a(aVar, drawerParams, (String) null, -1);
    }

    /* renamed from: a */
    public void mo134806a(C36516a aVar, FloatWindowParams floatWindowParams) {
        mo134807a(aVar, floatWindowParams, (String) null, -1);
    }

    /* renamed from: com.ss.android.lark.desktopmode.a.d$a */
    public static class C36525a {

        /* renamed from: a */
        public int f94053a;

        /* renamed from: b */
        public View f94054b;

        /* renamed from: c */
        public ContainerType f94055c;

        public C36525a(int i, View view, ContainerType containerType) {
            this.f94053a = i;
            this.f94054b = view;
            this.f94055c = containerType;
        }
    }

    /* renamed from: a */
    private void m144081a(String str, int i, C36516a aVar) {
        if (str != null && i > -1) {
            this.f94041h.put(aVar.getFragmentInfoId(), str);
            aVar.setRequestCode(i);
        }
    }

    /* renamed from: a */
    public void mo134803a(C36516a aVar, Intent intent, int i, int i2) {
        String remove = this.f94041h.remove(aVar.getFragmentInfoId());
        if (remove != null) {
            C36516a d = this.f94037d.mo134903d(remove);
            if (d != null) {
                d.onActivityResult(i, i2, intent);
            } else {
                Log.m165397w("DesktopModeManager", "finishForResultFromFragment: Fragment NOT found, abandon result");
            }
        }
    }

    /* renamed from: a */
    public void mo134805a(C36516a aVar, DrawerParams drawerParams, String str, int i) {
        aVar.setFragmentParams(drawerParams);
        if (this.f94039f) {
            m144081a(str, i, aVar);
            this.f94034a.mo134870a(aVar);
            if (this.f94040g || drawerParams.isBringToFront()) {
                m144084i();
            }
        }
    }

    /* renamed from: a */
    public void mo134807a(C36516a aVar, FloatWindowParams floatWindowParams, String str, int i) {
        aVar.setFragmentParams(floatWindowParams);
        if (this.f94039f) {
            m144081a(str, i, aVar);
            this.f94035b.mo134863a(aVar);
            if (this.f94040g || floatWindowParams.isBringToFront()) {
                m144084i();
            }
        }
    }
}
