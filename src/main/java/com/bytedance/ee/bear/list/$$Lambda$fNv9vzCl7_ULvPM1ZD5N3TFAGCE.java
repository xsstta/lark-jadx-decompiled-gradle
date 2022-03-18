package com.bytedance.ee.bear.list;

import android.os.IInterface;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.service.remote.C10959f;

/* renamed from: com.bytedance.ee.bear.list.-$$Lambda$fNv9vzCl7_ULvPM1ZD5N3TFAGCE  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$fNv9vzCl7_ULvPM1ZD5N3TFAGCE implements C10959f.AbstractC10961b {
    public static final /* synthetic */ $$Lambda$fNv9vzCl7_ULvPM1ZD5N3TFAGCE INSTANCE = new $$Lambda$fNv9vzCl7_ULvPM1ZD5N3TFAGCE();

    private /* synthetic */ $$Lambda$fNv9vzCl7_ULvPM1ZD5N3TFAGCE() {
    }

    @Override // com.bytedance.ee.bear.service.remote.C10959f.AbstractC10961b
    public final void notify(IInterface iInterface) {
        ((BinderListDataChangeCallback) iInterface).onFileClose();
    }
}
