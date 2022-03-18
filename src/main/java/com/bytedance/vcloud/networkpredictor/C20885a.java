package com.bytedance.vcloud.networkpredictor;

import android.util.Log;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.bytedance.vcloud.networkpredictor.a */
public class C20885a implements AbstractC20887b, AbstractC20888c {

    /* renamed from: a */
    public AbstractC20889d f51135a;

    /* renamed from: b */
    private AbstractC20890e f51136b;

    /* renamed from: c */
    private Timer f51137c;

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public float mo70583a(int i, int i2, boolean z) {
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70585a(MLComponentManager mLComponentManager) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70586a(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70587a(String str, Map<String, Integer> map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70588a(Map map) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: b */
    public Map<String, String> mo70590b(int i) {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: c */
    public float mo70591c() {
        return -1.0f;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: c */
    public void mo70592c(int i) {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: d */
    public void mo70593d() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: e */
    public SpeedPredictorResultCollection mo70594e() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: f */
    public SpeedPredictorResultCollection mo70595f() {
        return null;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: g */
    public void mo70596g() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: h */
    public void mo70597h() {
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: b */
    public float mo70589b() {
        return mo70582a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70601a() {
        Timer timer = new Timer("awemeSpeedPredictor");
        this.f51137c = timer;
        timer.schedule(new TimerTask() {
            /* class com.bytedance.vcloud.networkpredictor.C20885a.C208861 */

            public void run() {
                C20885a.this.f51135a.mo70604a();
            }
        }, 500, 500);
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public float mo70582a(int i) {
        return (float) this.f51135a.mo70609b();
    }

    public C20885a(AbstractC20890e eVar) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls;
        this.f51136b = eVar;
        try {
            cls = Class.forName("com.bytedance.vcloud.iesnetworkpredictnative.NetworkSpeedManager");
        } catch (ClassNotFoundException unused) {
            Log.d("AwemeSpeedPredictor", "AwemeSpeedPredictor: No Class Find");
            cls = null;
        }
        Method method = cls.getMethod("getInstance", new Class[0]);
        if (method == null) {
            Log.d("AwemeSpeedPredictor", "AwemeSpeedPredictor: No Class GetInstance Method Find");
        }
        AbstractC20889d dVar = (AbstractC20889d) method.invoke(null, new Object[0]);
        this.f51135a = dVar;
        if (dVar == null) {
            Log.d("AwemeSpeedPredictor", "AwemeSpeedPredictor: No instance Obj Produce");
        }
        this.f51136b = eVar;
    }

    /* renamed from: a */
    public void mo70602a(int i, AbstractC20891f fVar) {
        if (i == 4) {
            Timer timer = this.f51137c;
            if (timer != null) {
                timer.cancel();
            }
            this.f51135a.mo70606a(4);
        } else if (i == 5) {
            this.f51135a.mo70607a(this);
            this.f51135a.mo70608a(fVar);
            this.f51135a.mo70606a(5);
            mo70601a();
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70584a(long j, long j2, long j3) {
        if (j2 > 0) {
            double d = (double) j;
            this.f51135a.mo70605a((8.0d * d) / (((double) j2) / 1000.0d), d, j2);
        }
    }
}
