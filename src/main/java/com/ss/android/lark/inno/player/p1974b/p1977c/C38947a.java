package com.ss.android.lark.inno.player.p1974b.p1977c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

/* renamed from: com.ss.android.lark.inno.player.b.c.a */
public class C38947a {

    /* renamed from: a */
    public AbstractC38949a f100105a;

    /* renamed from: b */
    private Handler f100106b = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.lark.inno.player.p1974b.p1977c.C38947a.HandlerC389481 */

        public void handleMessage(Message message) {
            if (message.what == 1) {
                if (C38947a.this.f100105a != null) {
                    C38947a.this.f100105a.onProgressUpdate();
                }
                obtainMessage(1).sendToTarget();
            }
        }
    };

    /* renamed from: c */
    private int f100107c = ParticipantRepo.f117150c;

    /* renamed from: com.ss.android.lark.inno.player.b.c.a$a */
    public interface AbstractC38949a {
        void onProgressUpdate();
    }

    /* renamed from: b */
    public void mo142548b() {
        this.f100106b.removeMessages(1);
    }

    /* renamed from: a */
    public void mo142547a() {
        this.f100106b.removeMessages(1);
        this.f100106b.obtainMessage(1).sendToTarget();
    }

    public C38947a(int i, AbstractC38949a aVar) {
        this.f100107c = i;
        this.f100105a = aVar;
    }
}
