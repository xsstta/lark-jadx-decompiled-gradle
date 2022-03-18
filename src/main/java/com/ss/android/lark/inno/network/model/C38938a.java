package com.ss.android.lark.inno.network.model;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.inno.network.model.LiveStreamInfoData;
import com.ss.android.lark.mm.depend.C45899c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.network.model.a */
public class C38938a {

    /* renamed from: a */
    public int f100037a;

    /* renamed from: b */
    public boolean f100038b;

    /* renamed from: c */
    public boolean f100039c;

    /* renamed from: d */
    public C38940b f100040d;

    /* renamed from: e */
    public C38940b f100041e;

    /* renamed from: a */
    public String mo142536a() {
        if (this.f100039c) {
            return C45899c.m181859a().getContextDepend().mo144557a().getString(R.string.Common_G_Player_Intranet);
        }
        return C45899c.m181859a().getContextDepend().mo144557a().getString(R.string.Common_G_Player_Extranet);
    }

    /* renamed from: com.ss.android.lark.inno.network.model.a$a */
    public static class C38939a {

        /* renamed from: a */
        public int f100042a;

        /* renamed from: b */
        public int f100043b;

        /* renamed from: c */
        public String f100044c;

        /* renamed from: d */
        public String f100045d;

        /* renamed from: e */
        public String f100046e;

        /* renamed from: f */
        public String f100047f;

        /* renamed from: g */
        public String f100048g;

        public String toString() {
            return "LivePullStreamDesc{resolution=" + this.f100042a + ", vBitrate=" + this.f100043b + ", flvURL='" + this.f100044c + '\'' + ", hlsURL='" + this.f100045d + '\'' + ", rtmpURL='" + this.f100046e + '\'' + ", cmafURL='" + this.f100047f + '\'' + ", dashURL='" + this.f100048g + '\'' + '}';
        }

        /* renamed from: a */
        public static C38939a m153659a(LiveStreamInfoData.C38936c cVar) {
            if (cVar == null) {
                return null;
            }
            C38939a aVar = new C38939a();
            aVar.f100042a = cVar.f100035b;
            aVar.f100043b = cVar.f100036c;
            if (cVar.f100034a != null) {
                aVar.f100044c = cVar.f100034a.f100029a;
                aVar.f100045d = cVar.f100034a.f100030b;
                aVar.f100046e = cVar.f100034a.f100031c;
                aVar.f100047f = cVar.f100034a.f100032d;
                aVar.f100048g = cVar.f100034a.f100033e;
            }
            return aVar;
        }
    }

    /* renamed from: com.ss.android.lark.inno.network.model.a$b */
    public static class C38940b {

        /* renamed from: a */
        public int f100049a;

        /* renamed from: b */
        public boolean f100050b;

        /* renamed from: c */
        public List<C38939a> f100051c = new ArrayList();

        /* renamed from: a */
        public static C38940b m153661a(LiveStreamInfoData.StreamInfoLineListDTO streamInfoLineListDTO) {
            if (streamInfoLineListDTO == null) {
                return null;
            }
            C38940b bVar = new C38940b();
            bVar.f100049a = streamInfoLineListDTO.defaultResolution;
            bVar.f100050b = streamInfoLineListDTO.isBackup;
            for (LiveStreamInfoData.C38936c cVar : streamInfoLineListDTO.pullURLList) {
                bVar.f100051c.add(C38939a.m153659a(cVar));
            }
            Collections.sort(bVar.f100051c, $$Lambda$a$b$WtAKIWDCMDh4IvQ31xgdtf86Ik.INSTANCE);
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ int m153660a(C38939a aVar, C38939a aVar2) {
            return aVar.f100042a - aVar2.f100042a;
        }
    }

    /* renamed from: a */
    public static C38938a m153657a(LiveStreamInfoData.C38934a aVar) {
        if (aVar == null) {
            return null;
        }
        C38938a aVar2 = new C38938a();
        aVar2.f100037a = aVar.f100027c;
        aVar2.f100038b = aVar.f100025a;
        aVar2.f100039c = aVar.f100026b;
        if (!CollectionUtils.isEmpty(aVar.f100028d)) {
            for (LiveStreamInfoData.StreamInfoLineListDTO streamInfoLineListDTO : aVar.f100028d) {
                if (streamInfoLineListDTO.isBackup) {
                    aVar2.f100040d = C38940b.m153661a(streamInfoLineListDTO);
                } else {
                    aVar2.f100041e = C38940b.m153661a(streamInfoLineListDTO);
                }
            }
        }
        return aVar2;
    }
}
