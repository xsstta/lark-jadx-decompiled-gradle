package com.ss.android.lark.rust.track.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.statistics.v1.Track;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.rust.track.service.AbstractC53193a;
import com.ss.android.lark.rust.track.service.AbstractC53194b;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.rust.track.impl.f */
public class C53180f implements AbstractC53194b {

    /* renamed from: a */
    private final C53177e f131488a = new C53177e();

    /* renamed from: b */
    private final List<AbstractC53193a> f131489b = new CopyOnWriteArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.rust.track.impl.f$a */
    public static final class C53182a {

        /* renamed from: a */
        public static final C53180f f131491a = new C53180f();
    }

    /* renamed from: a */
    public static C53180f m205805a() {
        return C53182a.f131491a;
    }

    @Override // com.ss.android.lark.rust.track.service.AbstractC53194b
    /* renamed from: b */
    public void mo181604b() {
        C53248k.m205912a().mo181698a(Command.PUSH_TRACK, "rustPushTrack", new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.rust.track.impl.C53180f.C531811 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C53180f.this.mo181603a(bArr, str, z, z2);
            }
        });
        m205806a(this.f131488a.mo181600a());
    }

    /* renamed from: a */
    private void m205806a(AbstractC53193a aVar) {
        if (aVar != null) {
            this.f131489b.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo181603a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            Track decode = Track.ADAPTER.decode(bArr);
            if (decode != null) {
                RustTrackEntity a = C53166a.m205775a(decode);
                for (AbstractC53193a aVar : this.f131489b) {
                    if (aVar != null) {
                        aVar.mo181602a(a);
                    }
                }
            }
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }
}
