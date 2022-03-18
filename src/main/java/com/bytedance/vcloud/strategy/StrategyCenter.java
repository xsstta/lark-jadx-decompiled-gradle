package com.bytedance.vcloud.strategy;

import android.util.Log;
import com.huawei.hms.android.HwBuildEx;

public class StrategyCenter {

    /* renamed from: a */
    private long f51174a;

    /* renamed from: b */
    private boolean f51175b;

    /* renamed from: c */
    private int f51176c = 3;

    /* renamed from: d */
    private IStrategyEventListener f51177d;

    private native void _addMedia(long j, String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z);

    private native void _businessEvent(long j, int i, int i2);

    private native void _businessEvent(long j, int i, String str);

    private native long _create(IStrategyEventListener iStrategyEventListener);

    private native void _createPlayer(long j, long j2, String str, String str2);

    private native void _createScene(long j, String str);

    private native void _destroyScene(long j, String str);

    private native void _focusMedia(long j, String str, int i);

    private native int _iPlayerVersion(long j);

    private native boolean _isIOManagerVersionMatch(long j);

    private native void _makeCurrentPlayer(long j, String str);

    private native void _moveToScene(long j, String str);

    private native void _playSelection(long j, String str, int i, int i2);

    private native void _release(long j);

    private native void _releasePlayer(long j, String str, String str2);

    private native void _removeAllMedia(long j, String str, int i);

    private native void _removeMedia(long j, String str, String str2);

    private native void _setAlgorithmJson(long j, int i, String str);

    private native void _setAppInfo(long j, String str);

    private native void _setEventListener(long j, IStrategyEventListener iStrategyEventListener);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setIOManager(long j, long j2, long j3);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setIntervalMS(long j, int i);

    private native void _setLogCallback(long j, ILogCallback iLogCallback);

    private native void _setPlayTaskProgress(long j, float f);

    private native void _setProbeType(long j, int i);

    private native void _setSettingsInfo(long j, String str, String str2);

    private native void _setStateSupplier(long j, IStrategyStateSupplier iStrategyStateSupplier);

    private native void _start(long j);

    private native void _stop(long j);

    /* renamed from: b */
    public boolean mo70647b() {
        return this.f51175b;
    }

    /* renamed from: a */
    public boolean mo70641a() {
        return this.f51174a != 0;
    }

    /* renamed from: a */
    public void mo70640a(boolean z) {
        if (!mo70641a()) {
            if (z) {
                C20904a.m76134a();
                if (!C20904a.f51178a) {
                    Log.i("StrategyCenter", "load library fail.");
                    return;
                }
            }
            this.f51174a = _create(this.f51177d);
        }
    }

    /* renamed from: a */
    public void mo70638a(String str, ISelectBitrateListener iSelectBitrateListener, String str2, boolean z) {
        long j = this.f51174a;
        if (j != 0) {
            _addMedia(j, str, iSelectBitrateListener, str2, z);
        }
    }

    /* renamed from: a */
    public void mo70639a(String str, String str2) {
        long j = this.f51174a;
        if (j != 0) {
            _removeMedia(j, str, str2);
        }
    }

    /* renamed from: c */
    public void mo70648c() {
        long j = this.f51174a;
        if (j != 0) {
            _stop(j);
            this.f51175b = false;
        }
    }

    /* renamed from: e */
    public int mo70652e() {
        long j = this.f51174a;
        if (j == 0) {
            return -1;
        }
        return _iPlayerVersion(j);
    }

    /* renamed from: d */
    public boolean mo70651d() {
        long j = this.f51174a;
        if (j == 0) {
            return false;
        }
        return _isIOManagerVersionMatch(j);
    }

    public StrategyCenter(IStrategyEventListener iStrategyEventListener) {
        this.f51177d = iStrategyEventListener;
    }

    /* renamed from: d */
    public void mo70650d(String str) {
        long j = this.f51174a;
        if (j != 0) {
            _makeCurrentPlayer(j, str);
        }
    }

    /* renamed from: c */
    public void mo70649c(String str) {
        long j = this.f51174a;
        if (j != 0) {
            _moveToScene(j, str);
        }
    }

    /* renamed from: e */
    public void mo70653e(String str) {
        long j = this.f51174a;
        if (j != 0) {
            _setAppInfo(j, str);
        }
    }

    /* renamed from: b */
    public void mo70644b(String str) {
        long j = this.f51174a;
        if (j != 0) {
            _destroyScene(j, str);
        }
    }

    /* renamed from: a */
    public void mo70633a(ILogCallback iLogCallback) {
        long j = this.f51174a;
        if (j != 0) {
            _setLogCallback(j, iLogCallback);
        }
    }

    /* renamed from: b */
    public void mo70646b(boolean z) {
        if (!this.f51175b) {
            mo70640a(z);
            if (this.f51174a != 0) {
                mo70629a(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, this.f51176c);
                _start(this.f51174a);
                this.f51175b = true;
            }
        }
    }

    /* renamed from: a */
    public void mo70634a(IStrategyStateSupplier iStrategyStateSupplier) {
        long j = this.f51174a;
        if (j != 0) {
            _setStateSupplier(j, iStrategyStateSupplier);
        }
    }

    /* renamed from: a */
    public void mo70635a(String str) {
        long j = this.f51174a;
        if (j != 0 && str != null) {
            _createScene(j, str);
        }
    }

    /* renamed from: a */
    public void mo70630a(int i, String str) {
        long j = this.f51174a;
        if (j != 0) {
            _setAlgorithmJson(j, i, str);
        }
    }

    /* renamed from: b */
    public void mo70642b(int i, int i2) {
        long j = this.f51174a;
        if (j != 0) {
            _businessEvent(j, i, i2);
        }
    }

    /* renamed from: a */
    public void mo70629a(int i, int i2) {
        if (i == 10000) {
            this.f51176c = i2;
        }
        long j = this.f51174a;
        if (j != 0) {
            _setIntValue(j, i, i2);
        }
    }

    /* renamed from: b */
    public void mo70643b(int i, String str) {
        long j = this.f51174a;
        if (j != 0) {
            _businessEvent(j, i, str);
        }
    }

    /* renamed from: a */
    public void mo70631a(long j, long j2) {
        long j3 = this.f51174a;
        if (j3 != 0) {
            _setIOManager(j3, j, j2);
        }
    }

    /* renamed from: b */
    public void mo70645b(String str, int i) {
        long j = this.f51174a;
        if (j != 0) {
            _focusMedia(j, str, i);
        }
    }

    /* renamed from: a */
    public void mo70636a(String str, int i) {
        long j = this.f51174a;
        if (j != 0) {
            _removeAllMedia(j, str, i);
        }
    }

    /* renamed from: a */
    public void mo70632a(long j, String str, String str2) {
        long j2 = this.f51174a;
        if (j2 != 0) {
            _createPlayer(j2, j, str, str2);
        }
    }

    /* renamed from: a */
    public void mo70637a(String str, int i, int i2) {
        long j = this.f51174a;
        if (j != 0) {
            _playSelection(j, str, i, i2);
        }
    }
}
