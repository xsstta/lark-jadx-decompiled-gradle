package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;

/* renamed from: com.google.firebase.heartbeatinfo.a */
public class C22793a implements HeartBeatInfo {

    /* renamed from: a */
    private C22795c f56342a;

    /* renamed from: a */
    public static Component<HeartBeatInfo> m82808a() {
        return Component.builder(HeartBeatInfo.class).add(Dependency.required(Context.class)).factory(C22794b.m82811a()).build();
    }

    private C22793a(Context context) {
        this.f56342a = C22795c.m82812a(context);
    }

    /* renamed from: a */
    static /* synthetic */ HeartBeatInfo m82809a(ComponentContainer componentContainer) {
        return new C22793a((Context) componentContainer.get(Context.class));
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    /* renamed from: a */
    public HeartBeatInfo.HeartBeat mo79223a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a = this.f56342a.mo79226a(str, currentTimeMillis);
        boolean a2 = this.f56342a.mo79225a(currentTimeMillis);
        if (a && a2) {
            return HeartBeatInfo.HeartBeat.COMBINED;
        }
        if (a2) {
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        if (a) {
            return HeartBeatInfo.HeartBeat.SDK;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }
}
