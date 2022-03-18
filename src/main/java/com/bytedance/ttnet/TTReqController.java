package com.bytedance.ttnet;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.retrofit2.C20642m;
import com.bytedance.ttnet.p913d.C20765a;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TTReqController implements WeakHandler.IHandler, C20642m.AbstractC20645a {

    /* renamed from: a */
    private static final String f50701a = "TTReqController";

    /* renamed from: b */
    private static boolean f50702b;

    /* renamed from: c */
    private static final AtomicLong f50703c = new AtomicLong(0);

    /* renamed from: d */
    private static final AtomicInteger f50704d = new AtomicInteger(0);

    /* renamed from: e */
    private static final AtomicInteger f50705e = new AtomicInteger(0);

    /* renamed from: f */
    private static final Map<Runnable, Executor> f50706f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ReadWriteLock f50707g;

    /* renamed from: h */
    private static final Lock f50708h;

    /* renamed from: i */
    private static final Lock f50709i;

    /* renamed from: j */
    private static final Condition f50710j;

    /* renamed from: k */
    private static HandlerThread f50711k = m75526b("RequestController-Handler");

    /* renamed from: m */
    private static boolean f50712m = false;

    /* renamed from: n */
    private static final Set<String> f50713n = new CopyOnWriteArraySet();

    /* renamed from: o */
    private static final Set<String> f50714o = new CopyOnWriteArraySet();

    /* renamed from: p */
    private static int f50715p = 0;

    /* renamed from: q */
    private static long f50716q = 0;

    /* renamed from: r */
    private static int f50717r = 10;

    /* renamed from: l */
    private WeakHandler f50718l = new WeakHandler(f50711k.getLooper(), this);

    public enum P0DoneReasonEnum {
        P0_NOT_DONE,
        MODULE_DISABLE,
        P0_COUNT_DONE,
        P1_MAX_SIZE,
        P0_TIME_OUT
    }

    public enum ReleaseReasonEnum {
        RELEASE_COUNTDOWN,
        RELEASE_SWITCH,
        RELEASE_P0BACK
    }

    /* renamed from: b */
    public static HandlerThread m75526b(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m75529f() {
        if (System.currentTimeMillis() - f50703c.get() >= f50716q && f50704d.get() >= 0) {
            m75523a(ReleaseReasonEnum.RELEASE_COUNTDOWN);
        }
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20645a
    /* renamed from: a */
    public boolean mo69464a() {
        if (!f50702b || !f50712m) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public int mo69973c() {
        if (f50705e.get() > 3) {
            return new Random().nextInt(f50715p);
        }
        return 0;
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20645a
    /* renamed from: b */
    public void mo69466b() {
        f50709i.lock();
        while (!m75527d()) {
            try {
                f50710j.await(5000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                f50709i.unlock();
                throw th;
            }
        }
        Thread.sleep((long) mo69973c());
        f50709i.unlock();
    }

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        f50707g = reentrantReadWriteLock;
        f50708h = reentrantReadWriteLock.writeLock();
        ReentrantLock reentrantLock = new ReentrantLock();
        f50709i = reentrantLock;
        f50710j = reentrantLock.newCondition();
        f50711k.start();
    }

    /* renamed from: d */
    private boolean m75527d() {
        P0DoneReasonEnum p0DoneReasonEnum = P0DoneReasonEnum.P0_NOT_DONE;
        if (!f50702b) {
            p0DoneReasonEnum = P0DoneReasonEnum.MODULE_DISABLE;
        } else if (f50704d.get() <= 0) {
            p0DoneReasonEnum = P0DoneReasonEnum.P0_COUNT_DONE;
        } else if (f50705e.get() > f50717r) {
            p0DoneReasonEnum = P0DoneReasonEnum.P1_MAX_SIZE;
        } else if (System.currentTimeMillis() - f50703c.get() > f50716q) {
            p0DoneReasonEnum = P0DoneReasonEnum.P0_TIME_OUT;
        }
        if (Logger.debug()) {
            String str = f50701a;
            Logger.m15167d(str, "p1 check p0 done, reason is " + p0DoneReasonEnum);
        }
        if (p0DoneReasonEnum != P0DoneReasonEnum.P0_NOT_DONE) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m75528e() {
        P0DoneReasonEnum p0DoneReasonEnum = P0DoneReasonEnum.P0_NOT_DONE;
        if (!f50702b) {
            p0DoneReasonEnum = P0DoneReasonEnum.MODULE_DISABLE;
        } else if (f50704d.get() <= 0) {
            p0DoneReasonEnum = P0DoneReasonEnum.P0_COUNT_DONE;
        } else if (System.currentTimeMillis() - f50703c.get() > f50716q) {
            p0DoneReasonEnum = P0DoneReasonEnum.P0_TIME_OUT;
        }
        if (Logger.debug()) {
            String str = f50701a;
            Logger.m15167d(str, "p2 check p0 done, reason is " + p0DoneReasonEnum);
        }
        if (p0DoneReasonEnum != P0DoneReasonEnum.P0_NOT_DONE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m75524a(Map.Entry entry) {
        ((Executor) entry.getValue()).execute((Runnable) entry.getKey());
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20645a
    /* renamed from: a */
    public int mo69462a(String str) {
        if (C20765a.m75667a(str, f50713n)) {
            f50703c.set(System.currentTimeMillis());
            f50704d.incrementAndGet();
            this.f50718l.postDelayed(new Runnable() {
                /* class com.bytedance.ttnet.$$Lambda$TTReqController$UyRTTWPmfTuMfGWZL8pKUTaow */

                public final void run() {
                    TTReqController.m270156lambda$UyRTTWPmfTuMfGWZL8pKUTaow(TTReqController.this);
                }
            }, f50716q);
            return 0;
        } else if (!C20765a.m75667a(str, f50714o)) {
            f50705e.incrementAndGet();
            return 1;
        } else if (!m75528e()) {
            return 2;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    private void m75523a(ReleaseReasonEnum releaseReasonEnum) {
        if (Logger.debug()) {
            String str = f50701a;
            Logger.m15170e(str, "controller, release p1 request, reason is " + releaseReasonEnum);
        }
        Lock lock = f50709i;
        lock.lock();
        try {
            f50710j.signalAll();
            lock.unlock();
            f50708h.lock();
            Iterator<Map.Entry<Runnable, Executor>> it = f50706f.entrySet().iterator();
            while (it.hasNext()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable(it.next()) {
                    /* class com.bytedance.ttnet.$$Lambda$TTReqController$ZWLGiUUtifMcw428vYQXcAeLM */
                    public final /* synthetic */ Map.Entry f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void run() {
                        TTReqController.m270157lambda$ZWLGiUUtifMcw428vYQXcAeLM(this.f$0);
                    }
                }, (long) mo69973c());
                it.remove();
            }
            f50708h.unlock();
        } catch (Throwable th) {
            f50709i.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public static void m75525a(JSONObject jSONObject) {
        f50712m = false;
        JSONObject optJSONObject = jSONObject.optJSONObject("runtime_req_ctl_config");
        if (optJSONObject != null) {
            f50712m = true;
            f50713n.clear();
            f50714o.clear();
            try {
                JSONArray optJSONArray = optJSONObject.optJSONArray("p0");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("p2");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        f50713n.add(optJSONArray.get(i).toString());
                    }
                }
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        f50714o.add(optJSONArray2.get(i2).toString());
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            f50716q = (long) optJSONObject.optInt("p0_countdown", 0);
            f50715p = optJSONObject.optInt("p1_random", 0);
            f50717r = optJSONObject.optInt("p1_maxCount", 10);
            if (Logger.debug()) {
                String str = f50701a;
                Logger.m15170e(str, "sP0PathSet is " + f50713n);
                Logger.m15170e(str, "sP2PathSet is " + f50714o);
                Logger.m15170e(str, "sP0Countdown is " + f50716q);
                Logger.m15170e(str, "sP1Random is " + f50715p);
                Logger.m15170e(str, "sP1MaxCount is " + f50717r);
            }
        }
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20645a
    /* renamed from: a */
    public void mo69463a(int i) {
        if (i == 0) {
            AtomicInteger atomicInteger = f50704d;
            if (atomicInteger.get() > 0) {
                atomicInteger.decrementAndGet();
                if (atomicInteger.get() == 0) {
                    m75523a(ReleaseReasonEnum.RELEASE_P0BACK);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            AtomicInteger atomicInteger2 = f50705e;
            if (atomicInteger2.get() > 0) {
                atomicInteger2.decrementAndGet();
            }
        }
    }

    @Override // com.bytedance.retrofit2.C20642m.AbstractC20645a
    /* renamed from: a */
    public boolean mo69465a(Executor executor, Runnable runnable) {
        if (m75527d()) {
            return false;
        }
        Lock lock = f50708h;
        lock.lock();
        f50706f.put(runnable, executor);
        lock.unlock();
        return true;
    }
}
