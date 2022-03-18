package com.ss.android.lark.sticker.p2714a;

import android.text.TextUtils;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sticker.C54996a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.sticker.a.c */
public class C54998c {

    /* renamed from: a */
    private Map<String, CopyOnWriteArrayList<AbstractC55002d>> f135937a;

    /* renamed from: b */
    private AbstractC29580b f135938b;

    /* renamed from: c */
    private AbstractC29579a f135939c;

    /* renamed from: com.ss.android.lark.sticker.a.c$a */
    private static class C55001a {

        /* renamed from: a */
        public static final C54998c f135942a = new C54998c();
    }

    /* renamed from: a */
    public static C54998c m213641a() {
        return C55001a.f135942a;
    }

    /* renamed from: b */
    private void m213642b() {
        this.f135938b = new AbstractC29580b() {
            /* class com.ss.android.lark.sticker.p2714a.C54998c.C549991 */

            @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29580b
            public void onPushDownloadStatus(String str, boolean z) {
                C54998c.this.mo187823a(str, z);
            }
        };
        this.f135939c = new AbstractC29579a() {
            /* class com.ss.android.lark.sticker.p2714a.C54998c.C550002 */

            @Override // com.ss.android.lark.biz.core.api.resource.AbstractC29579a
            public void onPushDownloadProgress(String str, int i, long j, long j2) {
                C54998c.this.mo187820a(str, i, j, j2);
            }
        };
    }

    private C54998c() {
        this.f135937a = new HashMap(16);
        m213642b();
        m213643c();
    }

    /* renamed from: c */
    private void m213643c() {
        C54996a.m213619a().mo144100d().mo144113a(this.f135938b);
        C54996a.m213619a().mo144100d().mo144112a(this.f135939c);
    }

    /* renamed from: b */
    public synchronized void mo187824b(String str, AbstractC55002d dVar) {
        CopyOnWriteArrayList<AbstractC55002d> copyOnWriteArrayList = this.f135937a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(dVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo187821a(String str, AbstractC55002d dVar) {
        CopyOnWriteArrayList<AbstractC55002d> copyOnWriteArrayList = this.f135937a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (!copyOnWriteArrayList.contains(dVar)) {
            copyOnWriteArrayList.add(dVar);
            this.f135937a.put(str, copyOnWriteArrayList);
        }
    }

    /* renamed from: a */
    public void mo187823a(String str, boolean z) {
        C53241h.m205899c("DownloadStickerSetManager", "onPushDownloadStatus called. key:" + str + ", status:" + z);
        CopyOnWriteArrayList<AbstractC55002d> copyOnWriteArrayList = this.f135937a.get(str);
        if (copyOnWriteArrayList != null) {
            for (AbstractC55002d dVar : copyOnWriteArrayList) {
                if (z) {
                    dVar.mo187825a(str);
                } else {
                    dVar.mo187827b(str);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo187822a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            C54996a.m213619a().mo144100d().mo144114a(str, str2, str3);
        }
    }

    /* renamed from: a */
    public void mo187820a(String str, int i, long j, long j2) {
        CopyOnWriteArrayList<AbstractC55002d> copyOnWriteArrayList = this.f135937a.get(str);
        if (copyOnWriteArrayList != null) {
            for (AbstractC55002d dVar : copyOnWriteArrayList) {
                dVar.mo187826a(str, i, j2, j);
            }
        }
    }
}
