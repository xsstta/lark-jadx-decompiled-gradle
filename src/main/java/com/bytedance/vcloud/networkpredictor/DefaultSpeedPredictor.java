package com.bytedance.vcloud.networkpredictor;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.vcloud.mlcomponent_api.MLComponentManager;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

public class DefaultSpeedPredictor implements Handler.Callback, AbstractC20887b {

    /* renamed from: a */
    public Handler f51125a;

    /* renamed from: b */
    ReentrantReadWriteLock f51126b;

    /* renamed from: c */
    final ReentrantReadWriteLock.ReadLock f51127c;

    /* renamed from: d */
    final ReentrantReadWriteLock.WriteLock f51128d = this.f51126b.writeLock();

    /* renamed from: e */
    private long f51129e;

    /* renamed from: f */
    private MLComponentManager f51130f;

    /* renamed from: g */
    private Thread f51131g;

    private native void _close(long j);

    private native long _create(int i);

    private native float _getAverageDownloadSpeed(long j, int i, int i2, boolean z);

    private native double _getDoubleValue(long j, int i, double d);

    private native Map<String, String> _getDownloadSpeed(long j, int i);

    private native int _getIntValue(long j, int i, int i2);

    private native float _getLastPredictConfidence(long j);

    private native long _getLongValue(long j, int i, long j2);

    private native SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds(long j);

    private native SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds(long j);

    private native float _getPredictSpeed(long j, int i);

    private native String _getVersion();

    private native void _prepare(long j);

    private native void _release(long j);

    private native void _setConfigSpeedInfo(long j, Map<String, String> map);

    private native void _setDoubleValue(long j, int i, double d);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setModelComponent(long j, MLComponentManager mLComponentManager);

    private native void _setSpeedQueueSize(long j, int i);

    private native void _setStringValue(long j, int i, String str);

    private native void _start(long j);

    private native void _update(long j, ArrayList<C20899l> arrayList, Map<String, Integer> map);

    private native void _updateOldWithStreamId(long j, ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map);

    private native void _updateWithSizeTime(long j, long j2, long j3, long j4);

    /* renamed from: a */
    public static Thread m76026a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70588a(Map map) {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return;
        }
        _setConfigSpeedInfo(j, map);
        this.f51127c.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: b */
    public float mo70589b() {
        return mo70582a(0);
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: c */
    public float mo70591c() {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return -1.0f;
        }
        float _getLastPredictConfidence = _getLastPredictConfidence(j);
        this.f51127c.unlock();
        return _getLastPredictConfidence;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: e */
    public SpeedPredictorResultCollection mo70594e() {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalPredictSpeeds = _getMultidimensionalPredictSpeeds(j);
        this.f51127c.unlock();
        return _getMultidimensionalPredictSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: f */
    public SpeedPredictorResultCollection mo70595f() {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return null;
        }
        SpeedPredictorResultCollection _getMultidimensionalDownloadSpeeds = _getMultidimensionalDownloadSpeeds(j);
        this.f51127c.unlock();
        return _getMultidimensionalDownloadSpeeds;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: g */
    public void mo70596g() {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return;
        }
        _prepare(j);
        this.f51127c.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: h */
    public void mo70597h() {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return;
        }
        _start(j);
        this.f51127c.unlock();
    }

    /* renamed from: a */
    private void m76027a() {
        Handler handler = this.f51125a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f51125a.getLooper().quit();
            this.f51125a = null;
            this.f51131g = null;
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: d */
    public void mo70593d() {
        this.f51128d.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51128d.unlock();
            return;
        }
        _close(j);
        _release(this.f51129e);
        this.f51129e = 0;
        m76027a();
        this.f51128d.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: b */
    public Map<String, String> mo70590b(int i) {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return null;
        }
        Map<String, String> _getDownloadSpeed = _getDownloadSpeed(j, i);
        this.f51127c.unlock();
        return _getDownloadSpeed;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return true;
        }
        C20898k kVar = (C20898k) message.obj;
        _updateOldWithStreamId(this.f51129e, kVar.f51147d, kVar.f51148e);
        return true;
    }

    public DefaultSpeedPredictor(int i) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.f51126b = reentrantReadWriteLock;
        this.f51127c = reentrantReadWriteLock.readLock();
        C20894i.m76088a();
        if (!C20894i.f51140a) {
            C20897j.m76090a("SpeedPredictor", "[SpeedPredictor] no predictor native loaded");
            return;
        }
        this.f51129e = _create(i);
        C20893h.m76087a(0);
        _setIntValue(this.f51129e, 0, C20893h.m76086a());
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: c */
    public void mo70592c(int i) {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return;
        }
        _setSpeedQueueSize(j, i);
        this.f51127c.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public float mo70582a(int i) {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return -1.0f;
        }
        float _getPredictSpeed = _getPredictSpeed(j, i);
        this.f51127c.unlock();
        return _getPredictSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70585a(MLComponentManager mLComponentManager) {
        this.f51130f = mLComponentManager;
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return;
        }
        _setModelComponent(j, this.f51130f);
        this.f51127c.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70586a(ISpeedRecordOld iSpeedRecordOld, Map<String, Integer> map) {
        this.f51127c.lock();
        if (this.f51129e == 0) {
            this.f51127c.unlock();
            return;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.f51131g == null) {
                Thread a = m76026a(new Thread() {
                    /* class com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor.C208841 */

                    public void run() {
                        if (Looper.myLooper() == null) {
                            Looper.prepare();
                        }
                        DefaultSpeedPredictor.this.f51125a = new Handler(this);
                        Looper.loop();
                    }
                });
                this.f51131g = a;
                a.setName("speed_predict_update_thread");
                this.f51131g.start();
            }
            if (this.f51125a != null) {
                C20898k kVar = new C20898k();
                kVar.f51144a = 0;
                kVar.f51147d = iSpeedRecordOld;
                kVar.f51148e = map;
                Message obtainMessage = this.f51125a.obtainMessage();
                obtainMessage.what = 0;
                obtainMessage.obj = kVar;
                obtainMessage.sendToTarget();
            }
        } else {
            _updateOldWithStreamId(this.f51129e, iSpeedRecordOld, map);
        }
        this.f51127c.unlock();
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70587a(String str, Map<String, Integer> map) {
        this.f51127c.lock();
        if (this.f51129e == 0 || str == null || str.length() < 0 || map == null || map.size() < 0) {
            this.f51127c.unlock();
            return;
        }
        this.f51127c.unlock();
        try {
            JSONArray optJSONArray = new JSONObject(str).optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ArrayList<C20899l> arrayList = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = optJSONArray.getJSONObject(i);
                    C20899l lVar = new C20899l();
                    lVar.mo70611a(jSONObject);
                    arrayList.add(lVar);
                } catch (Throwable unused) {
                }
            }
            this.f51127c.lock();
            _update(this.f51129e, arrayList, map);
            this.f51127c.unlock();
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public float mo70583a(int i, int i2, boolean z) {
        this.f51127c.lock();
        long j = this.f51129e;
        if (j == 0) {
            this.f51127c.unlock();
            return -1.0f;
        }
        float _getAverageDownloadSpeed = _getAverageDownloadSpeed(j, i, i2, z);
        this.f51127c.unlock();
        return _getAverageDownloadSpeed;
    }

    @Override // com.bytedance.vcloud.networkpredictor.AbstractC20887b
    /* renamed from: a */
    public void mo70584a(long j, long j2, long j3) {
        this.f51127c.lock();
        long j4 = this.f51129e;
        if (j4 == 0) {
            this.f51127c.unlock();
            return;
        }
        _updateWithSizeTime(j4, j, j2, j3);
        this.f51127c.unlock();
    }
}
