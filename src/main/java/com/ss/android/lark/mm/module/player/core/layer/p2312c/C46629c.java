package com.ss.android.lark.mm.module.player.core.layer.p2312c;

import com.ss.android.lark.mm.module.player.core.layer.p2312c.C46627b;
import com.ss.android.lark.mm.module.player.core.subtitle.MmSubtitles;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.c.c */
public class C46629c {

    /* renamed from: a */
    public MmSubtitles f117347a = new MmSubtitles();

    /* renamed from: b */
    public C46627b.AbstractC46628a f117348b;

    /* renamed from: a */
    public MmSubtitles mo163830a() {
        return this.f117347a;
    }

    /* renamed from: b */
    public boolean mo163833b() {
        MmSubtitles mmSubtitles = this.f117347a;
        if (mmSubtitles == null || mmSubtitles.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo163831a(C46627b.AbstractC46628a aVar) {
        this.f117348b = aVar;
    }

    public C46629c(String str, String str2) {
        mo163832a(str, str2);
    }

    /* renamed from: a */
    public void mo163832a(String str, String str2) {
        C47057a.m186267b(str, str2).mo165338a(new AbstractC47070c<MmSubtitles>() {
            /* class com.ss.android.lark.mm.module.player.core.layer.p2312c.C46629c.C466301 */

            /* renamed from: a */
            public void mo161289a(MmSubtitles mmSubtitles) {
                C46629c.this.f117347a = mmSubtitles;
                if (C46629c.this.f117348b != null) {
                    C46629c.this.f117348b.mo163741a();
                }
            }

            @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
            /* renamed from: a */
            public void mo161288a(C47068a aVar) {
                C45855f.m181663b("MmLayerSubtitleContext", "onError " + aVar);
                if (C46629c.this.f117348b != null) {
                    C46629c.this.f117348b.mo163741a();
                }
            }
        }, true);
    }
}
