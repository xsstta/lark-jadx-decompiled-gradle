package com.ss.android.medialib.presenter;

import android.media.AudioRecord;

/* renamed from: com.ss.android.medialib.presenter.f */
public class C59423f {

    /* renamed from: a */
    private AbstractC59416a f147540a;

    /* renamed from: a */
    public void mo202663a(AudioRecord audioRecord, int i, int i2, String str) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (i2 == 0) {
                            this.f147540a.mo202656g(audioRecord, str);
                        } else {
                            this.f147540a.mo202657h(audioRecord, str);
                        }
                    }
                } else if (i2 == 0) {
                    this.f147540a.mo202654e(audioRecord, str);
                } else {
                    this.f147540a.mo202655f(audioRecord, str);
                }
            } else if (i2 == 0) {
                this.f147540a.mo202652c(audioRecord, str);
            } else {
                this.f147540a.mo202653d(audioRecord, str);
            }
        } else if (i2 == 0) {
            this.f147540a.mo202650a(audioRecord, str);
        } else {
            this.f147540a.mo202651b(audioRecord, str);
        }
    }
}
