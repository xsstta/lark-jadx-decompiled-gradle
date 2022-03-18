package androidx.p034e.p035a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: androidx.e.a.a */
public final class C0978a {

    /* renamed from: f */
    private static final Object f3681f = new Object();

    /* renamed from: g */
    private static C0978a f3682g;

    /* renamed from: a */
    private final Context f3683a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<C0981b>> f3684b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C0981b>> f3685c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C0980a> f3686d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f3687e;

    /* access modifiers changed from: private */
    /* renamed from: androidx.e.a.a$b */
    public static final class C0981b {

        /* renamed from: a */
        final IntentFilter f3691a;

        /* renamed from: b */
        final BroadcastReceiver f3692b;

        /* renamed from: c */
        boolean f3693c;

        /* renamed from: d */
        boolean f3694d;

        public String toString() {
            StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
            sb.append("Receiver{");
            sb.append(this.f3692b);
            sb.append(" filter=");
            sb.append(this.f3691a);
            if (this.f3694d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }

        C0981b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f3691a = intentFilter;
            this.f3692b = broadcastReceiver;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.f3690b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.f3690b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.f3694d != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.f3692b.onReceive(r10.f3683a, r4.f3689a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4989a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<androidx.e.a.a$b>> r0 = r10.f3684b
            monitor-enter(r0)
            java.util.ArrayList<androidx.e.a.a$a> r1 = r10.f3686d     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x000d:
            androidx.e.a.a$a[] r2 = new androidx.p034e.p035a.C0978a.C0980a[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<androidx.e.a.a$a> r3 = r10.f3686d     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<androidx.e.a.a$a> r3 = r10.f3686d     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList<androidx.e.a.a$b> r5 = r4.f3690b
            int r5 = r5.size()
            r6 = 0
        L_0x0027:
            if (r6 >= r5) goto L_0x0041
            java.util.ArrayList<androidx.e.a.a$b> r7 = r4.f3690b
            java.lang.Object r7 = r7.get(r6)
            androidx.e.a.a$b r7 = (androidx.p034e.p035a.C0978a.C0981b) r7
            boolean r8 = r7.f3694d
            if (r8 != 0) goto L_0x003e
            android.content.BroadcastReceiver r7 = r7.f3692b
            android.content.Context r8 = r10.f3683a
            android.content.Intent r9 = r4.f3689a
            r7.onReceive(r8, r9)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p034e.p035a.C0978a.mo4989a():void");
    }

    /* renamed from: a */
    public static C0978a m4782a(Context context) {
        C0978a aVar;
        synchronized (f3681f) {
            if (f3682g == null) {
                f3682g = new C0978a(context.getApplicationContext());
            }
            aVar = f3682g;
        }
        return aVar;
    }

    private C0978a(Context context) {
        this.f3683a = context;
        this.f3687e = new Handler(context.getMainLooper()) {
            /* class androidx.p034e.p035a.C0978a.HandlerC09791 */

            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    C0978a.this.mo4989a();
                }
            }
        };
    }

    /* renamed from: a */
    public void mo4990a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3684b) {
            ArrayList<C0981b> remove = this.f3684b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C0981b bVar = remove.get(size);
                    bVar.f3694d = true;
                    for (int i = 0; i < bVar.f3691a.countActions(); i++) {
                        String action = bVar.f3691a.getAction(i);
                        ArrayList<C0981b> arrayList = this.f3685c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C0981b bVar2 = arrayList.get(size2);
                                if (bVar2.f3692b == broadcastReceiver) {
                                    bVar2.f3694d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f3685c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo4992a(Intent intent) {
        boolean z;
        String str;
        ArrayList<C0981b> arrayList;
        String str2;
        int i;
        ArrayList arrayList2;
        String str3;
        synchronized (this.f3684b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f3683a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            if ((intent.getFlags() & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C0981b> arrayList3 = this.f3685c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C0981b bVar = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f3691a);
                    }
                    if (bVar.f3693c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList = arrayList3;
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        arrayList2 = arrayList4;
                    } else {
                        i = i2;
                        str2 = action;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                        str = resolveTypeIfNeeded;
                        int match = bVar.f3691a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            if (arrayList2 == null) {
                                arrayList4 = new ArrayList();
                            } else {
                                arrayList4 = arrayList2;
                            }
                            arrayList4.add(bVar);
                            bVar.f3693c = true;
                            i2 = i + 1;
                            action = str2;
                            arrayList3 = arrayList;
                            resolveTypeIfNeeded = str;
                        } else if (z) {
                            if (match == -4) {
                                str3 = "category";
                            } else if (match == -3) {
                                str3 = "action";
                            } else if (match == -2) {
                                str3 = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
                            } else if (match != -1) {
                                str3 = "unknown reason";
                            } else {
                                str3 = ShareHitPoint.f121869d;
                            }
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + str3);
                        }
                    }
                    arrayList4 = arrayList2;
                    i2 = i + 1;
                    action = str2;
                    arrayList3 = arrayList;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        ((C0981b) arrayList4.get(i3)).f3693c = false;
                    }
                    this.f3686d.add(new C0980a(intent, arrayList4));
                    if (!this.f3687e.hasMessages(1)) {
                        this.f3687e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.e.a.a$a */
    public static final class C0980a {

        /* renamed from: a */
        final Intent f3689a;

        /* renamed from: b */
        final ArrayList<C0981b> f3690b;

        C0980a(Intent intent, ArrayList<C0981b> arrayList) {
            this.f3689a = intent;
            this.f3690b = arrayList;
        }
    }

    /* renamed from: a */
    public void mo4991a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f3684b) {
            C0981b bVar = new C0981b(intentFilter, broadcastReceiver);
            ArrayList<C0981b> arrayList = this.f3684b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f3684b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(bVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C0981b> arrayList2 = this.f3685c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f3685c.put(action, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }
}
