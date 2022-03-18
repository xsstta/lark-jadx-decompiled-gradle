package com.ss.android.lark.utils;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.utils.ah */
public final class C57783ah implements Handler.Callback {

    /* renamed from: a */
    private static final boolean f142305a = m224247b();

    /* renamed from: b */
    private final Handler f142306b;

    /* renamed from: c */
    private final C57786b f142307c;

    /* renamed from: d */
    private final SparseArray<List<AbstractC57787c>> f142308d;

    /* renamed from: e */
    private final List<AbstractC57787c> f142309e;

    /* renamed from: f */
    private final List<AbstractC57787c> f142310f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.ah$a */
    public static final class C57785a {

        /* renamed from: a */
        public static final C57783ah f142311a = new C57783ah();
    }

    /* renamed from: com.ss.android.lark.utils.ah$c */
    public interface AbstractC57787c {
        void handleMessage(C57786b bVar);
    }

    /* renamed from: a */
    public static C57783ah m224245a() {
        return C57785a.f142311a;
    }

    /* renamed from: com.ss.android.lark.utils.ah$b */
    public static final class C57786b {

        /* renamed from: a */
        private Message f142312a;

        /* renamed from: a */
        public int mo196096a() {
            m224252c();
            return this.f142312a.what;
        }

        /* renamed from: b */
        public Object mo196098b() {
            m224252c();
            return this.f142312a.obj;
        }

        /* renamed from: c */
        private void m224252c() {
            if (this.f142312a == null) {
                throw new IllegalStateException("You can't use LocalMessage instance from a non-UI thread. Extract the data from LocalMessage and don't hold a reference to it outside of handleMessage()");
            }
        }

        public String toString() {
            m224252c();
            StringBuilder sb = new StringBuilder();
            sb.append("{ id=");
            sb.append(mo196096a());
            if (mo196098b() != null) {
                sb.append(" obj=");
                sb.append(mo196098b());
            }
            sb.append(" }");
            return sb.toString();
        }

        /* renamed from: a */
        public void mo196097a(Message message) {
            this.f142312a = message;
        }

        private C57786b(Message message) {
            this.f142312a = message;
        }
    }

    private C57783ah() {
        this.f142306b = new Handler(Looper.getMainLooper(), this);
        this.f142307c = new C57786b(null);
        this.f142308d = new SparseArray<>();
        this.f142309e = new ArrayList();
        this.f142310f = new ArrayList();
    }

    /* renamed from: b */
    private static boolean m224247b() {
        try {
            ApplicationInfo applicationInfo = LarkContext.getApplication().getPackageManager().getApplicationInfo(LarkContext.getApplication().getPackageName(), 0);
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo196091a(int i) {
        this.f142306b.sendEmptyMessage(i);
    }

    /* renamed from: b */
    public void mo196094b(int i) {
        List<AbstractC57787c> list;
        if (f142305a && ((list = this.f142308d.get(i)) == null || list.size() == 0)) {
            Log.m165397w("UiMessageUtils", "Trying to remove specific listeners that are not registered. ID " + i);
        }
        synchronized (this.f142308d) {
            this.f142308d.delete(i);
        }
    }

    public boolean handleMessage(Message message) {
        this.f142307c.mo196097a(message);
        if (f142305a) {
            m224246a(this.f142307c);
        }
        synchronized (this.f142308d) {
            List<AbstractC57787c> list = this.f142308d.get(message.what);
            if (list != null) {
                if (list.size() == 0) {
                    this.f142308d.remove(message.what);
                } else {
                    this.f142310f.addAll(list);
                    for (AbstractC57787c cVar : this.f142310f) {
                        cVar.handleMessage(this.f142307c);
                    }
                    this.f142310f.clear();
                }
            }
        }
        synchronized (this.f142309e) {
            if (this.f142309e.size() > 0) {
                this.f142310f.addAll(this.f142309e);
                for (AbstractC57787c cVar2 : this.f142310f) {
                    cVar2.handleMessage(this.f142307c);
                }
                this.f142310f.clear();
            }
        }
        this.f142307c.mo196097a(null);
        return true;
    }

    /* renamed from: a */
    private void m224246a(C57786b bVar) {
        List<AbstractC57787c> list = this.f142308d.get(bVar.mo196096a());
        if ((list == null || list.size() == 0) && this.f142309e.size() == 0) {
            Log.m165397w("UiMessageUtils", "Delivering FAILED for message ID " + bVar.mo196096a() + ". No listeners. " + bVar.toString());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Delivering message ID ");
        sb.append(bVar.mo196096a());
        sb.append(", Specific listeners: ");
        if (list == null || list.size() == 0) {
            sb.append(0);
        } else {
            sb.append(list.size());
            sb.append(" [");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i).getClass().getSimpleName());
                if (i < list.size() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        }
        sb.append(", Universal listeners: ");
        synchronized (this.f142309e) {
            if (this.f142309e.size() == 0) {
                sb.append(0);
            } else {
                sb.append(this.f142309e.size());
                sb.append(" [");
                for (int i2 = 0; i2 < this.f142309e.size(); i2++) {
                    sb.append(this.f142309e.get(i2).getClass().getSimpleName());
                    if (i2 < this.f142309e.size() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("], Message: ");
            }
        }
        sb.append(bVar.toString());
        Log.m165389i("UiMessageUtils", sb.toString());
    }

    /* renamed from: a */
    public final void mo196093a(int i, Object obj) {
        Handler handler = this.f142306b;
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    /* renamed from: a */
    public void mo196092a(int i, AbstractC57787c cVar) {
        synchronized (this.f142308d) {
            List<AbstractC57787c> list = this.f142308d.get(i);
            if (list == null) {
                list = new ArrayList<>();
                this.f142308d.put(i, list);
            }
            if (!list.contains(cVar)) {
                list.add(cVar);
            }
        }
    }
}
