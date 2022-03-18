package com.bytedance.vcloud.mlcomponent_api;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MLComponentManager {

    /* renamed from: a */
    ReentrantReadWriteLock f51115a;

    /* renamed from: b */
    final ReentrantReadWriteLock.ReadLock f51116b;

    /* renamed from: c */
    final ReentrantReadWriteLock.WriteLock f51117c = this.f51115a.writeLock();

    /* renamed from: d */
    private String f51118d;

    /* renamed from: e */
    private long f51119e;

    private native ArrayList _calculate(long j, Map map);

    private native long _createMLComponent(String str);

    private native boolean _enable(long j);

    private native boolean _prepareAlreadyFinish(long j);

    private native void _release(long j);

    private native void _setDownloader(long j, IMLComponentDownLoader iMLComponentDownLoader);

    private native void _setEngineStateListener(long j, IMLComponentStateListener iMLComponentStateListener);

    private native void _setLoggerEventListener(long j, IMLComponentLogger iMLComponentLogger);

    private native void _setMLConfigModel(long j, IMLComponentConfigModel iMLComponentConfigModel);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70581a() {
        C20883c.m76025a();
        if (!C20883c.f51123a) {
            C20882b.m76024a("mlComponent", "no tfengine for networkPredict");
        }
    }

    /* renamed from: a */
    public MLComponentManager mo70577a(IMLComponentConfigModel iMLComponentConfigModel) {
        this.f51116b.lock();
        long j = this.f51119e;
        if (j == 0) {
            this.f51116b.unlock();
            return this;
        }
        _setMLConfigModel(j, iMLComponentConfigModel);
        this.f51116b.unlock();
        return this;
    }

    public MLComponentManager(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock(false);
        this.f51115a = reentrantReadWriteLock;
        this.f51116b = reentrantReadWriteLock.readLock();
        this.f51118d = str;
        C20881a.m76023a();
        if (!C20881a.f51120a) {
            C20882b.m76024a("mlComponent", "[mlComponent] no mlcomponent native loaded");
            return;
        }
        long _createMLComponent = _createMLComponent(str);
        this.f51119e = _createMLComponent;
        if (_createMLComponent == 0) {
            C20882b.m76024a("mlComponent", "[mlcomponent] mlcomponent native new fail");
        }
        mo70581a();
    }

    /* renamed from: a */
    public MLComponentManager mo70578a(IMLComponentDownLoader iMLComponentDownLoader) {
        this.f51116b.lock();
        long j = this.f51119e;
        if (j == 0) {
            this.f51116b.unlock();
            return this;
        }
        _setDownloader(j, iMLComponentDownLoader);
        this.f51116b.unlock();
        return this;
    }

    /* renamed from: a */
    public MLComponentManager mo70579a(IMLComponentLogger iMLComponentLogger) {
        this.f51116b.lock();
        long j = this.f51119e;
        if (j == 0) {
            this.f51116b.unlock();
            return this;
        }
        _setLoggerEventListener(j, iMLComponentLogger);
        this.f51116b.unlock();
        return this;
    }

    /* renamed from: a */
    public MLComponentManager mo70580a(IMLComponentStateListener iMLComponentStateListener) {
        this.f51116b.lock();
        long j = this.f51119e;
        if (j == 0) {
            this.f51116b.unlock();
            return this;
        }
        _setEngineStateListener(j, iMLComponentStateListener);
        this.f51116b.unlock();
        return this;
    }
}
