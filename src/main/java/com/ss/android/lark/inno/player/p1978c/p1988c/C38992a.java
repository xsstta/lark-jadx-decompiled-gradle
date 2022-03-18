package com.ss.android.lark.inno.player.p1978c.p1988c;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.inno.network.model.LivePlaybackInfoData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.lark.inno.player.c.c.a */
public class C38992a {

    /* renamed from: a */
    public List<C38994a> f100174a = new ArrayList();

    /* renamed from: b */
    public int f100175b = 0;

    /* renamed from: a */
    public C38994a mo142681a() {
        return mo142683b(this.f100175b);
    }

    /* renamed from: b */
    public String mo142684b() {
        C38994a a = mo142681a();
        if (a != null) {
            return a.f100176a;
        }
        return "";
    }

    /* renamed from: a */
    public void mo142682a(int i) {
        this.f100175b = i;
    }

    /* renamed from: a */
    public static C38992a m153888a(LivePlaybackInfoData livePlaybackInfoData) {
        if (livePlaybackInfoData == null) {
            return null;
        }
        C38992a aVar = new C38992a();
        aVar.f100175b = livePlaybackInfoData.default_resolution;
        for (LivePlaybackInfoData.PlaybackLineListDTO playbackLineListDTO : livePlaybackInfoData.line_list) {
            aVar.f100174a.add(new C38994a(playbackLineListDTO.play_url, playbackLineListDTO.resolution));
        }
        Collections.sort(aVar.f100174a, new Comparator<C38994a>() {
            /* class com.ss.android.lark.inno.player.p1978c.p1988c.C38992a.C389931 */

            /* renamed from: a */
            public int compare(C38994a aVar, C38994a aVar2) {
                return aVar.f100177b - aVar2.f100177b;
            }
        });
        return aVar;
    }

    /* renamed from: b */
    public C38994a mo142683b(int i) {
        for (C38994a aVar : this.f100174a) {
            if (aVar.f100177b == i) {
                return aVar;
            }
        }
        if (!CollectionUtils.isEmpty(this.f100174a)) {
            return this.f100174a.get(0);
        }
        return null;
    }

    /* renamed from: com.ss.android.lark.inno.player.c.c.a$a */
    public static class C38994a {

        /* renamed from: a */
        public String f100176a;

        /* renamed from: b */
        public int f100177b;

        public C38994a(String str, int i) {
            this.f100176a = str;
            this.f100177b = i;
        }
    }
}
