package com.bytedance.ee.bear.document.contactservice;

import com.bytedance.ee.bear.contract.ak;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.document.contactservice.-$$Lambda$ZWpgxc4_nO_8C_LGo4thXlaIHpE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ZWpgxc4_nO_8C_LGo4thXlaIHpE implements Consumer {
    public static final /* synthetic */ $$Lambda$ZWpgxc4_nO_8C_LGo4thXlaIHpE INSTANCE = new $$Lambda$ZWpgxc4_nO_8C_LGo4thXlaIHpE();

    private /* synthetic */ $$Lambda$ZWpgxc4_nO_8C_LGo4thXlaIHpE() {
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        ((ak) obj).goToCustomService();
    }
}
