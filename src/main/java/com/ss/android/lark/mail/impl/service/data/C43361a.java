package com.ss.android.lark.mail.impl.service.data;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.service.data.AbsDataManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.lark.mail.impl.service.data.a */
public class C43361a<T> extends AbsDataManager.AbstractC43360b {

    /* renamed from: a */
    AbsDataManager.AbstractC43360b f110217a;

    /* renamed from: b */
    AtomicBoolean f110218b;

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
    /* renamed from: a */
    public void mo152964a() {
        AtomicBoolean atomicBoolean = this.f110218b;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            this.f110217a.mo152964a();
        } else {
            Log.m165389i(this.f110217a.toString(), "onStart , but cancel");
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
    /* renamed from: a */
    public void mo152965a(ErrorResult errorResult) {
        AtomicBoolean atomicBoolean = this.f110218b;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            this.f110217a.mo152965a(errorResult);
        } else {
            Log.m165389i(this.f110217a.toString(), "onLoadError , but cancel");
        }
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
    public boolean equals(Object obj) {
        if (obj != null && this.f110217a != null && obj.getClass() == this.f110217a.getClass()) {
            return obj.equals(this.f110217a);
        }
        if (obj != null) {
            return obj.equals(this.f110217a);
        }
        return false;
    }

    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
    /* renamed from: a */
    public void mo152967a(Object obj) {
        AtomicBoolean atomicBoolean = this.f110218b;
        if (atomicBoolean == null || !atomicBoolean.get()) {
            this.f110217a.mo152967a(obj);
        } else {
            Log.m165389i(this.f110217a.toString(), "onSucceedLoad , but cancel");
        }
    }

    public C43361a(AbsDataManager.AbstractC43360b bVar, AtomicBoolean atomicBoolean) {
        this.f110217a = bVar;
        this.f110218b = atomicBoolean;
    }
}
