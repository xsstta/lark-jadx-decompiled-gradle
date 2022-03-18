package com.bytedance.geckox.policy.loop;

import com.bytedance.geckox.C14218d;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.policy.loop.b */
public class C14315b {

    /* renamed from: d */
    private static C14315b f37611d;

    /* renamed from: a */
    private C14218d f37612a;

    /* renamed from: b */
    private Map<String, C14316c> f37613b = new ConcurrentHashMap();

    /* renamed from: c */
    private Map<String, Integer> f37614c = new ConcurrentHashMap();

    /* renamed from: e */
    private AtomicBoolean f37615e = new AtomicBoolean(true);

    /* renamed from: a */
    public static C14315b m57703a() {
        if (f37611d == null) {
            synchronized (C14315b.class) {
                if (f37611d == null) {
                    f37611d = new C14315b();
                }
            }
        }
        return f37611d;
    }

    private C14315b() {
        this.f37614c.put(LoopInterval.LoopLevel.lv_1.name(), 600);
        this.f37614c.put(LoopInterval.LoopLevel.lv_2.name(), 1200);
        this.f37614c.put(LoopInterval.LoopLevel.lv_3.name(), 1800);
    }

    /* renamed from: a */
    private C14316c m57704a(OptionCheckUpdateParams optionCheckUpdateParams) {
        LoopInterval.LoopLevel loopLevel = optionCheckUpdateParams.getLoopLevel();
        if (loopLevel == null) {
            return null;
        }
        String name = loopLevel.name();
        if (this.f37613b.get(name) != null) {
            return this.f37613b.get(name);
        }
        C14316c cVar = new C14316c(name, this.f37614c.get(name).intValue());
        cVar.mo52374a(new C14319d(this.f37612a, loopLevel));
        this.f37613b.put(loopLevel.name(), cVar);
        return cVar;
    }

    /* renamed from: a */
    public void mo52369a(GeckoGlobalConfig geckoGlobalConfig) {
        C14276b.m57604a("gecko-debug-tag", "loop manager init");
        this.f37612a = new C14218d.C14220a(geckoGlobalConfig.mo52033a()).mo52154a(geckoGlobalConfig.mo52036d()).mo52163b(geckoGlobalConfig.mo52040h()).mo52155a(geckoGlobalConfig.mo52034b()).mo52156a(geckoGlobalConfig.mo52039g()).mo52166c(geckoGlobalConfig.mo52035c()).mo52165b("gecko").mo52161a("gecko").mo52162a();
    }

    /* renamed from: a */
    public synchronized void mo52371a(Map<String, LoopInterval> map) {
        if (map != null) {
            C14276b.m57604a("gecko-debug-tag", "loop interval update", map);
            for (String str : map.keySet()) {
                C14316c cVar = this.f37613b.get(str);
                LoopInterval loopInterval = map.get(str);
                if (!(cVar == null || loopInterval == null)) {
                    cVar.mo52373a(loopInterval.getInterval());
                    this.f37614c.put(str, Integer.valueOf(loopInterval.getInterval()));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo52370a(String str, List<String> list, Map<String, List<CheckRequestBodyModel.TargetChannel>> map, OptionCheckUpdateParams optionCheckUpdateParams) {
        C14316c a = m57704a(optionCheckUpdateParams);
        if (a != null) {
            a.mo52375a(str, list, map, optionCheckUpdateParams.getCustomParam());
            if (this.f37615e.get()) {
                a.mo52372a();
            }
        }
    }
}
