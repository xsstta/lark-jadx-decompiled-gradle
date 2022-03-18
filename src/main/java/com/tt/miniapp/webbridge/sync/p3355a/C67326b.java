package com.tt.miniapp.webbridge.sync.p3355a;

import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.framework.utils.UIUtils;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.util.C67589g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.webbridge.sync.a.b */
public class C67326b {

    /* renamed from: a */
    public IAppContext f169880a;

    /* renamed from: b */
    public LinkedHashMap<String, String> f169881b = new LinkedHashMap<>();

    /* renamed from: c */
    public Rect f169882c = new Rect();

    /* renamed from: d */
    public AbstractC67331d f169883d;

    /* renamed from: e */
    public ActionMode f169884e;

    /* renamed from: f */
    private C67328a f169885f = new C67328a();

    /* renamed from: com.tt.miniapp.webbridge.sync.a.b$d */
    public interface AbstractC67331d {
        /* renamed from: a */
        void mo234015a(boolean z);
    }

    /* renamed from: a */
    public void mo233999a() {
        ActionMode actionMode = this.f169884e;
        if (actionMode != null) {
            actionMode.finish();
            this.f169884e = null;
        }
    }

    /* renamed from: com.tt.miniapp.webbridge.sync.a.b$a */
    private class C67328a {

        /* renamed from: b */
        private LinkedHashMap<String, String> f169887b;

        /* renamed from: c */
        private String f169888c;

        /* renamed from: a */
        public void mo234002a(String str) {
            this.f169888c = str;
        }

        private C67328a() {
            this.f169887b = new LinkedHashMap<>();
        }

        /* renamed from: a */
        public void mo234001a(ActionMode actionMode) {
            m262216b(String.valueOf(actionMode.getTag()));
            if (C67326b.this.f169883d != null) {
                C67326b.this.f169883d = null;
            }
            if (!(C67326b.this.f169884e == null || C67326b.this.f169884e == actionMode)) {
                C67326b.this.f169884e.finish();
            }
            this.f169887b.clear();
            C67326b.this.f169884e = null;
        }

        /* renamed from: b */
        private void m262216b(String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tag", str);
                AppbrandApplicationImpl.getInst(C67326b.this.f169880a).getRenderViewManager().publish(AppbrandApplicationImpl.getInst(C67326b.this.f169880a).getRenderViewManager().getCurrentIRender().getRenderViewId(), "popoverMenuDismiss", jSONObject.toString());
            } catch (JSONException e) {
                AppBrandLogger.m52829e("PopoverMenuManager", "handle popover dismiss json error, e = " + e.getMessage());
            }
        }

        /* renamed from: a */
        private boolean m262215a(Menu menu) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < menu.size(); i++) {
                if (menu.getItem(i).getGroupId() == 0) {
                    arrayList.add(menu.getItem(i));
                }
            }
            if (arrayList.size() != this.f169887b.size()) {
                return true;
            }
            int i2 = 0;
            for (Map.Entry<String, String> entry : this.f169887b.entrySet()) {
                if (!entry.getValue().contentEquals(((MenuItem) arrayList.get(i2)).getTitle())) {
                    return true;
                }
                i2++;
            }
            return false;
        }

        /* renamed from: a */
        private void m262214a(String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("tag", str2);
                AppbrandApplicationImpl.getInst(C67326b.this.f169880a).getRenderViewManager().publish(AppbrandApplicationImpl.getInst(C67326b.this.f169880a).getRenderViewManager().getCurrentIRender().getRenderViewId(), "popoverMenuSelected", jSONObject.toString());
            } catch (JSONException e) {
                AppBrandLogger.m52829e("PopoverMenuManager", "handle item click json error, e = " + e.getMessage());
            }
        }

        /* renamed from: b */
        public boolean mo234005b(ActionMode actionMode, Menu menu) {
            if (C67326b.this.f169881b != null && !C67326b.this.f169881b.isEmpty()) {
                this.f169887b.clear();
                this.f169887b.putAll(C67326b.this.f169881b);
            }
            if (m262215a(menu)) {
                menu.removeGroup(0);
                int i = 0;
                for (String str : this.f169887b.values()) {
                    menu.add(0, 0, i, str);
                    i++;
                }
                if (C67326b.this.f169883d != null) {
                    C67326b.this.f169883d.mo234015a(true);
                }
                return true;
            }
            if (C67326b.this.f169883d != null) {
                C67326b.this.f169883d.mo234015a(true);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo234003a(ActionMode actionMode, Menu menu) {
            if (!(C67326b.this.f169884e == null || C67326b.this.f169884e == actionMode)) {
                C67326b.this.f169884e.finish();
            }
            menu.clear();
            C67326b.this.f169884e = actionMode;
            C67326b.this.f169884e.setTag(this.f169888c);
            return true;
        }

        /* renamed from: a */
        public boolean mo234004a(ActionMode actionMode, MenuItem menuItem) {
            boolean z;
            CharSequence title = menuItem.getTitle();
            Iterator<Map.Entry<String, String>> it = this.f169887b.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Map.Entry<String, String> next = it.next();
                if (title.equals(next.getValue())) {
                    m262214a(next.getKey(), String.valueOf(actionMode.getTag()));
                    z = true;
                    break;
                }
            }
            actionMode.finish();
            return z;
        }
    }

    /* renamed from: com.tt.miniapp.webbridge.sync.a.b$b */
    private class C67329b extends ActionMode.Callback2 {

        /* renamed from: b */
        private C67328a f169890b;

        /* renamed from: c */
        private double f169891c;

        /* renamed from: d */
        private double f169892d;

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f169890b.mo234001a(actionMode);
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f169890b.mo234004a(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f169890b.mo234003a(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f169890b.mo234005b(actionMode, menu);
        }

        public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
            if (!C67326b.this.f169882c.isEmpty()) {
                int i = C67326b.this.f169882c.top;
                int i2 = C67326b.this.f169882c.bottom;
                int screenHeight = UIUtils.getScreenHeight(C67326b.this.f169880a.getApplicationContext());
                int a = C67589g.m263062a(100.0d);
                if (i - C67589g.m263062a(this.f169891c) < a) {
                    C67326b.this.f169882c.top = 0;
                }
                if (C67326b.this.f169882c.top < a && i2 + C67589g.m263062a(this.f169892d) > screenHeight - a) {
                    C67326b.this.f169882c.top = screenHeight / 2;
                }
                rect.set(C67326b.this.f169882c);
                return;
            }
            super.onGetContentRect(actionMode, view, rect);
        }

        public C67329b(String str, double d, double d2, C67328a aVar) {
            this.f169890b = aVar;
            this.f169891c = d;
            this.f169892d = d2;
            aVar.mo234002a(str);
        }
    }

    /* renamed from: com.tt.miniapp.webbridge.sync.a.b$c */
    private class ActionMode$CallbackC67330c implements ActionMode.Callback {

        /* renamed from: b */
        private C67328a f169894b;

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f169894b.mo234001a(actionMode);
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f169894b.mo234004a(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f169894b.mo234003a(actionMode, menu);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.f169894b.mo234005b(actionMode, menu);
        }

        public ActionMode$CallbackC67330c(String str, C67328a aVar) {
            this.f169894b = aVar;
            aVar.mo234002a(str);
        }
    }

    /* renamed from: a */
    public static C67326b m262211a(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234277G();
    }

    /* renamed from: a */
    public void mo234000a(IAppContext iAppContext, RenderViewManager.IRender iRender, LinkedHashMap<String, String> linkedHashMap, Rect rect, String str, double d, double d2, AbstractC67331d dVar) {
        this.f169880a = iAppContext;
        this.f169883d = dVar;
        this.f169881b = linkedHashMap;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f169882c = rect;
            iRender.getRootView().startActionMode(new C67329b(str, d, d2, this.f169885f), 1);
            return;
        }
        iRender.getRootView().startActionMode(new ActionMode$CallbackC67330c(str, this.f169885f));
    }
}
