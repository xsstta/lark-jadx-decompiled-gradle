package com.lynx.devtoolwrapper;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Toast;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.lynx.devtoolwrapper.e */
public class C26494e {

    /* renamed from: a */
    private boolean f65492a;

    /* renamed from: b */
    private Object f65493b;

    /* renamed from: c */
    private Method f65494c;

    /* renamed from: d */
    private Method f65495d;

    /* renamed from: e */
    private Method f65496e;

    /* renamed from: f */
    private Method f65497f;

    /* renamed from: g */
    private Method f65498g;

    /* renamed from: h */
    private Field f65499h;

    /* renamed from: i */
    private Field f65500i;

    /* renamed from: j */
    private boolean f65501j;

    /* renamed from: k */
    private Method f65502k;

    /* renamed from: l */
    private Context f65503l;

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.devtoolwrapper.e$a */
    public static class C26496a {

        /* renamed from: a */
        public static final C26494e f65504a = new C26494e();
    }

    /* renamed from: a */
    public static C26494e m96054a() {
        return C26496a.f65504a;
    }

    private C26494e() {
        m96056c();
    }

    /* renamed from: c */
    private void m96056c() {
        try {
            this.f65502k = Class.forName("com.lynx.devtool.helper.TelemetryConnector").getMethod("enableTelemetryDebug", new Class[0]);
            this.f65501j = true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private boolean m96055b() {
        if (!LynxEnv.m96123e().mo94107n()) {
            Context context = this.f65503l;
            if (context != null) {
                Toast.makeText(context, "Lynx initialization not finished!", 0).show();
            }
            LLog.m96427d("LynxDevtoolGlobalHelper", "liblynx.so not loaded!");
            return false;
        } else if (this.f65492a) {
            return true;
        } else {
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.LynxGlobalDebugBridge");
                Method method = cls.getMethod("getInstance", new Class[0]);
                this.f65494c = cls.getMethod("shouldPrepareRemoteDebug", String.class);
                this.f65495d = cls.getMethod("prepareRemoteDebug", String.class);
                this.f65496e = cls.getMethod("setContext", Context.class);
                this.f65497f = cls.getDeclaredMethod("showDebugView", ViewGroup.class);
                this.f65498g = cls.getDeclaredMethod("registerCardListener", AbstractC26493d.class);
                this.f65499h = cls.getField("APP_NAME");
                this.f65500i = cls.getField("APP_VERSION");
                this.f65493b = method.invoke(null, new Object[0]);
                this.f65492a = true;
            } catch (ClassNotFoundException unused) {
                LLog.m96427d("LynxDevtoolGlobalHelper", "Could not find LynxGlobalDebugBridge. Shall ignore this exception if expected.");
            } catch (NoSuchMethodException e) {
                LLog.m96427d("LynxDevtoolGlobalHelper", e.toString());
            } catch (NoSuchFieldException e2) {
                LLog.m96427d("LynxDevtoolGlobalHelper", e2.toString());
            } catch (IllegalAccessException e3) {
                LLog.m96427d("LynxDevtoolGlobalHelper", e3.toString());
            } catch (InvocationTargetException e4) {
                LLog.m96427d("LynxDevtoolGlobalHelper", e4.toString());
            }
            return this.f65492a;
        }
    }

    /* renamed from: a */
    public void mo93943a(AbstractC26493d dVar) {
        if (m96055b()) {
            try {
                this.f65498g.invoke(this.f65493b, dVar);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public boolean mo93944a(String str) {
        if (!m96055b()) {
            return false;
        }
        try {
            return ((Boolean) this.f65494c.invoke(this.f65493b, str)).booleanValue();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public boolean mo93945b(String str) {
        if (!m96055b()) {
            return false;
        }
        if (!LynxEnv.m96123e().mo94104k()) {
            Context context = this.f65503l;
            if (context != null) {
                Toast.makeText(context, "Debugging not supported in this package", 0).show();
            }
            LLog.m96427d("LynxDevtoolGlobalHelper", "Debugging not supported in this package");
            return false;
        } else if (!LynxEnv.m96123e().mo94105l()) {
            Context context2 = this.f65503l;
            if (context2 != null) {
                Toast.makeText(context2, "Devtool not enabled, turn on the switch!", 0).show();
            }
            LLog.m96427d("LynxDevtoolGlobalHelper", "Devtool not enabled, turn on the switch!");
            return false;
        } else {
            try {
                return ((Boolean) this.f65495d.invoke(this.f65493b, str)).booleanValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }
}
