package com.oppo.oiface;

import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.util.Log;
import android.util.Slog;
import com.oppo.oiface.IOIfaceNotifier;
import com.oppo.oiface.IOIfaceService;
import java.lang.ref.WeakReference;

public class OifaceManager {

    /* renamed from: a */
    public static IOIfaceService f66918a;

    /* renamed from: d */
    private static OifaceManager f66919d;

    /* renamed from: f */
    private static int f66920f;

    /* renamed from: b */
    public WeakReference<AbstractC26969a> f66921b;

    /* renamed from: c */
    public IOIfaceNotifier f66922c = new IOIfaceNotifier.Stub() {
        /* class com.oppo.oiface.OifaceManager.BinderC269682 */

        @Override // com.oppo.oiface.IOIfaceNotifier
        public void onSystemNotify(String str) throws RemoteException {
            Log.d("OppoManager", "notify info is:" + str + "mytid:" + Process.myTid());
            if (OifaceManager.this.f66921b != null && OifaceManager.this.f66921b.get() != null) {
                OifaceManager.this.f66921b.get().mo95872a(str);
            }
        }
    };

    /* renamed from: e */
    private IBinder f66923e;

    /* renamed from: g */
    private IBinder.DeathRecipient f66924g = new IBinder.DeathRecipient() {
        /* class com.oppo.oiface.OifaceManager.C269671 */

        public void binderDied() {
            OifaceManager.f66918a = null;
        }
    };

    public enum AType {
        ACTIVITY_SWITCH,
        DIALOG_SWITCH,
        TAB_SWITCH,
        LOAD_INFO,
        UPLOAD_INFO,
        OTHER_SWITCH
    }

    /* renamed from: b */
    public boolean mo95869b() {
        return mo95866a(10, -1, -1);
    }

    private OifaceManager() {
        m98003c();
    }

    /* renamed from: a */
    public static OifaceManager m98002a() {
        if (f66918a == null) {
            synchronized (OifaceManager.class) {
                if (f66918a == null) {
                    f66919d = new OifaceManager();
                }
            }
        }
        return f66919d;
    }

    /* renamed from: c */
    private boolean m98003c() {
        if (f66920f > 10) {
            return false;
        }
        IBinder checkService = ServiceManager.checkService("oiface");
        this.f66923e = checkService;
        IOIfaceService asInterface = IOIfaceService.Stub.asInterface(checkService);
        f66918a = asInterface;
        if (asInterface != null) {
            try {
                this.f66923e.linkToDeath(this.f66924g, 0);
                f66920f = 0;
                return true;
            } catch (Exception unused) {
                Slog.d("OppoManager", "connectOifaceService error");
                f66918a = null;
            }
        } else {
            f66920f++;
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo95868a(String str) {
        if (f66918a == null && !m98003c()) {
            return false;
        }
        try {
            return f66918a.registerClient(str, this.f66922c.asBinder());
        } catch (RemoteException e) {
            f66918a = null;
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo95867a(int i, AType aType) {
        return mo95866a(9, i, aType.ordinal());
    }

    /* renamed from: b */
    public boolean mo95870b(int i, AType aType) {
        return mo95866a(8, i, aType.ordinal());
    }

    /* renamed from: a */
    public boolean mo95866a(int i, int i2, int i3) {
        if (f66918a == null && !m98003c()) {
            return false;
        }
        try {
            f66918a.generalSingal("{\"actionType\":" + i + ",\"actionTime\":" + i2 + ",\"extra\":" + i3 + "}");
            return true;
        } catch (Exception e) {
            f66918a = null;
            Slog.d("OppoManager", "actionType:" + i + " generalSingal error:" + e);
            return false;
        }
    }
}
