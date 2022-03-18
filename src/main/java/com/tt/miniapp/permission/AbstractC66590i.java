package com.tt.miniapp.permission;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tt.miniapp.permission.i */
public abstract class AbstractC66590i {

    /* renamed from: a */
    private final Set<String> f168144a = new HashSet(1);

    /* renamed from: b */
    private Looper f168145b = Looper.getMainLooper();

    /* renamed from: a */
    public abstract void mo48890a();

    /* renamed from: a */
    public abstract void mo48891a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo232197a(Set<String> set) {
        this.f168144a.addAll(set);
    }

    /* renamed from: b */
    public synchronized boolean mo232200b(String str) {
        Log.d("PermissionsResultAction", "Permission not found: " + str);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized boolean mo232198a(String str, int i) {
        if (i == 0) {
            return mo232199a(str, Permissions.GRANTED);
        }
        return mo232199a(str, Permissions.DENIED);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized boolean mo232199a(final String str, Permissions permissions) {
        this.f168144a.remove(str);
        if (permissions == Permissions.GRANTED) {
            if (this.f168144a.isEmpty()) {
                new Handler(this.f168145b).post(new Runnable() {
                    /* class com.tt.miniapp.permission.AbstractC66590i.RunnableC665911 */

                    public void run() {
                        C66588h.m260183a().mo232193a(str, 0);
                        AbstractC66590i.this.mo48890a();
                    }
                });
                return true;
            }
        } else if (permissions == Permissions.DENIED) {
            new Handler(this.f168145b).post(new Runnable() {
                /* class com.tt.miniapp.permission.AbstractC66590i.RunnableC665922 */

                public void run() {
                    C66588h.m260183a().mo232193a(str, 1);
                    AbstractC66590i.this.mo48891a(str);
                }
            });
            return true;
        } else if (permissions == Permissions.NOT_FOUND) {
            if (!mo232200b(str)) {
                new Handler(this.f168145b).post(new Runnable() {
                    /* class com.tt.miniapp.permission.AbstractC66590i.RunnableC665944 */

                    public void run() {
                        C66588h.m260183a().mo232193a(str, 1);
                        AbstractC66590i.this.mo48891a(str);
                    }
                });
                return true;
            } else if (this.f168144a.isEmpty()) {
                new Handler(this.f168145b).post(new Runnable() {
                    /* class com.tt.miniapp.permission.AbstractC66590i.RunnableC665933 */

                    public void run() {
                        C66588h.m260183a().mo232193a(str, 2);
                        AbstractC66590i.this.mo48890a();
                    }
                });
                return true;
            }
        }
        return false;
    }
}
