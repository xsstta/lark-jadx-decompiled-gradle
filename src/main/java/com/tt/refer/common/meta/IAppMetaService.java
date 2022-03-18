package com.tt.refer.common.meta;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.tt.refer.common.meta.base.AbsAppMeta;
import com.tt.refer.common.meta.base.AbsMetaLoadEntity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IAppMetaService<T extends AbsAppMeta, E extends AbsMetaLoadEntity> extends IBaseService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheControl {
    }

    /* renamed from: com.tt.refer.common.meta.IAppMetaService$a */
    public interface AbstractC67782a<T> {
        /* renamed from: a */
        void mo50337a(T t);

        /* renamed from: a */
        void mo50338a(String str, String str2);
    }

    /* renamed from: a */
    T mo50349a(Context context, E e);

    /* renamed from: a */
    boolean mo235256a(Context context, String str, String str2);

    /* renamed from: b */
    boolean mo235257b(Context context, E e);
}
