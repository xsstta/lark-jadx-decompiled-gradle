package com.ss.android.lark.mail.impl.service.p2215a;

import com.bytedance.lark.pb.basic.v1.Command;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.mulprocess.entity.ByteArray;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.C43227b;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.IMailPush;
import com.ss.android.lark.sdk.C53248k;
import ee.android.framework.manis.C68183b;

/* renamed from: com.ss.android.lark.mail.impl.service.a.a */
public abstract class AbstractC43286a {
    /* renamed from: a */
    public abstract void mo154969a(byte[] bArr, String str, boolean z, boolean z2);

    /* renamed from: b */
    public abstract Command mo154970b();

    /* renamed from: c */
    public boolean mo154971c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo154972d();

    /* renamed from: a */
    public void mo154968a() {
        C53248k.m205912a().mo181697a(mo154970b(), new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.mail.impl.service.p2215a.AbstractC43286a.C432871 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                Log.m165388i("BasePushProcessor onPush");
                if (!AbstractC43286a.this.mo154972d() || !C43296d.m172004b()) {
                    AbstractC43286a.this.mo154969a(bArr, str, z, z2);
                    if (AbstractC43286a.this.mo154971c() && C43227b.f109992b) {
                        IMailPush iMailPush = (IMailPush) C68183b.m264839a().mo237086a(C41816b.m166115a().mo150132b(), IMailPush.class);
                        if (iMailPush == null) {
                            Log.m165388i("webprocess BasePushProcessor mailPush == null");
                            return;
                        }
                        ByteArray byteArray = new ByteArray();
                        byteArray.mo154622a(bArr);
                        iMailPush.push(AbstractC43286a.this.mo154970b().getValue(), byteArray, str, z, z2);
                        return;
                    }
                    return;
                }
                Log.m165388i("BasePushProcessor PushBlocker");
            }
        });
    }
}
