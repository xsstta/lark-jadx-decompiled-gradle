package com.bytedance.vcloud.abrmodule;

import java.util.List;
import java.util.Map;

public class DefaultABRModule implements AbstractC20879g {

    /* renamed from: a */
    private long f51074a;

    /* renamed from: b */
    private int f51075b = -1;

    private native void _addBufferInfo(long j, int i, String str, long j2, long j3, long j4);

    private native long _create();

    private native double _getDoubleValue(long j, int i, double d);

    private native float _getFloatValue(long j, int i, float f);

    private native long _getLongValue(long j, int i, long j2);

    private native ABRResult _getPredict(long j);

    private native String _getVersion();

    private native void _release(long j);

    private native ABRResult _select(long j, int i, int i2);

    private native void _setDataSource(long j, IPlayStateSupplier iPlayStateSupplier);

    private native void _setDeviceInfo(long j, IDeviceInfo iDeviceInfo);

    private native void _setDoubleValue(long j, int i, double d);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setInfoListener(long j, IABRInfoListener iABRInfoListener);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setMediaInfo(long j, List<Object> list, List<Object> list2);

    private native void _setSRBenchmark(long j, Map<Integer, Integer> map);

    private native void _setSRBenchmarkMap(long j, Map<Integer, List<Integer>> map);

    private native void _setStringValue(long j, int i, String str);

    private native void _start(long j, int i, int i2);

    private native void _stop(long j);

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public String mo70538a() {
        if (this.f51074a == 0) {
            return "j_2.5.0";
        }
        return _getVersion();
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: c */
    public void mo70551c() {
        long j = this.f51074a;
        if (j != 0) {
            _stop(j);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: d */
    public void mo70553d() {
        long j = this.f51074a;
        if (j != 0) {
            _release(j);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: b */
    public ABRResult mo70549b() {
        long j = this.f51074a;
        if (j == 0) {
            return null;
        }
        return _getPredict(j);
    }

    public DefaultABRModule() {
        C20874d.m75986a();
        if (C20874d.f51099a) {
            long _create = _create();
            this.f51074a = _create;
            _setIntValue(_create, 0, C20873c.m75963a());
            _setIntValue(this.f51074a, 1, C20873c.m75966b());
            _setIntValue(this.f51074a, 3, C20873c.m75969c());
            _setIntValue(this.f51074a, 4, C20873c.m75972d());
            _setIntValue(this.f51074a, 5, C20873c.m75975e());
            _setIntValue(this.f51074a, 37, C20873c.m75985n());
            _setFloatValue(this.f51074a, 8, C20873c.m75977f());
            _setFloatValue(this.f51074a, 9, C20873c.m75978g());
            _setFloatValue(this.f51074a, 10, C20873c.m75979h());
            _setFloatValue(this.f51074a, 11, C20873c.m75980i());
            _setDoubleValue(this.f51074a, 29, C20873c.m75981j());
            _setDoubleValue(this.f51074a, 30, C20873c.m75982k());
            _setDoubleValue(this.f51074a, 31, C20873c.m75983l());
            _setDoubleValue(this.f51074a, 32, C20873c.m75984m());
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70543a(IABRInfoListener iABRInfoListener) {
        long j = this.f51074a;
        if (j != 0) {
            _setInfoListener(j, iABRInfoListener);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70544a(IPlayStateSupplier iPlayStateSupplier) {
        long j = this.f51074a;
        if (j != 0) {
            try {
                _setDataSource(j, iPlayStateSupplier);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70546a(Map<Integer, List<Integer>> map) {
        long j = this.f51074a;
        if (j != 0) {
            _setSRBenchmarkMap(j, map);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: b */
    public float mo70547b(int i, float f) {
        long j = this.f51074a;
        if (j == 0) {
            return f;
        }
        return _getFloatValue(j, i, f);
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70539a(int i, float f) {
        long j = this.f51074a;
        if (j != 0) {
            _setFloatValue(j, i, f);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: b */
    public long mo70548b(int i, long j) {
        long j2 = this.f51074a;
        if (j2 == 0) {
            return j;
        }
        if (i == 19) {
            return (long) this.f51075b;
        }
        return _getLongValue(j2, i, j);
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: c */
    public void mo70552c(int i, int i2) {
        long j = this.f51074a;
        if (j != 0) {
            this.f51075b = i;
            _start(j, i, i2);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70540a(int i, int i2) {
        long j = this.f51074a;
        if (j != 0) {
            _setIntValue(j, i, i2);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70541a(int i, long j) {
        long j2 = this.f51074a;
        if (j2 != 0) {
            _setLongValue(j2, i, j);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: b */
    public ABRResult mo70550b(int i, int i2) {
        long j = this.f51074a;
        if (j == 0) {
            return null;
        }
        return _select(j, i, i2);
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70545a(List<Object> list, List<Object> list2) {
        long j = this.f51074a;
        if (j != 0) {
            _setMediaInfo(j, list, list2);
        }
    }

    @Override // com.bytedance.vcloud.abrmodule.AbstractC20879g
    /* renamed from: a */
    public void mo70542a(int i, String str, long j, long j2, long j3) {
        long j4 = this.f51074a;
        if (j4 != 0) {
            _addBufferInfo(j4, i, str, j, j2, j3);
        }
    }
}
