package com.ss.android.lark.inno.network.model;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.inno.network.model.LiveStreamInfoData;

/* renamed from: com.ss.android.lark.inno.network.model.b */
public class C38941b {

    /* renamed from: a */
    public C38938a f100052a;

    /* renamed from: b */
    public C38938a f100053b;

    /* renamed from: c */
    public boolean f100054c;

    /* renamed from: a */
    public C38938a mo142538a() {
        if (this.f100054c) {
            return this.f100052a;
        }
        return this.f100053b;
    }

    /* renamed from: a */
    public static C38941b m153662a(LiveStreamInfoData liveStreamInfoData) {
        boolean z;
        if (liveStreamInfoData == null || CollectionUtils.isEmpty(liveStreamInfoData.channelList)) {
            return null;
        }
        C38941b bVar = new C38941b();
        for (LiveStreamInfoData.C38934a aVar : liveStreamInfoData.channelList) {
            if (!aVar.f100025a || !aVar.f100026b) {
                z = false;
            } else {
                z = true;
            }
            bVar.f100054c = z;
            if (aVar.f100026b) {
                bVar.f100052a = C38938a.m153657a(aVar);
            } else {
                bVar.f100053b = C38938a.m153657a(aVar);
            }
        }
        return bVar;
    }
}
