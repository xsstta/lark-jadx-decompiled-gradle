package com.larksuite.component.openplatform.core.loader.abs;

import android.os.Bundle;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;

/* renamed from: com.larksuite.component.openplatform.core.loader.abs.b */
public interface AbstractC24507b<E extends AbsMetaLoadEntity, M extends AbsAppMeta> {

    /* renamed from: com.larksuite.component.openplatform.core.loader.abs.b$a */
    public interface AbstractC24508a<M extends AbsAppMeta> {
        /* renamed from: a */
        void mo87190a();

        /* renamed from: a */
        void mo87191a(LoadTaskType loadTaskType, String str, String str2, Bundle bundle);

        /* renamed from: a */
        void mo87192a(M m);

        /* renamed from: a */
        void mo87193a(String str);

        /* renamed from: b */
        void mo87194b();
    }

    /* renamed from: a */
    <T extends AbstractC24509c> T mo87359a();
}
