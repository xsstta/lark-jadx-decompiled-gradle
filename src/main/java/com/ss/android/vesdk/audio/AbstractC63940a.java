package com.ss.android.vesdk.audio;

import com.bytedance.bpea.basics.PrivacyCert;
import com.ss.android.vesdk.C64027k;

/* renamed from: com.ss.android.vesdk.audio.a */
public interface AbstractC63940a {
    int init(C64027k kVar);

    void release(PrivacyCert privacyCert);

    int start(PrivacyCert privacyCert);

    int stop(PrivacyCert privacyCert);
}
