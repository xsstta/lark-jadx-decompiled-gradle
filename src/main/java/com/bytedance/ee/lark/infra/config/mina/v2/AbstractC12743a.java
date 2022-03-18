package com.bytedance.ee.lark.infra.config.mina.v2;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.lark.infra.config.mina.v2.ConfigModel;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.lang.reflect.ParameterizedType;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.v2.a */
public abstract class AbstractC12743a<T extends ConfigModel> extends AbstractC12744b {

    /* renamed from: a */
    private final Class<T> f34110a = ((Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]);

    /* renamed from: b */
    private T m52735b() {
        try {
            return this.f34110a.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            AppBrandLogger.m52830i("AbsSettingGenericHandler", "Exception when newInstance", e);
            return null;
        }
    }

    /* renamed from: a */
    public T mo48247a() {
        String settingFromLocal = getSettingFromLocal(getSettingKey(), "");
        if (TextUtils.isEmpty(settingFromLocal)) {
            AppBrandLogger.m52830i("AbsSettingGenericHandler", "json is null for", getSettingKey());
            return m52735b();
        }
        T t = (T) ((ConfigModel) JSON.parseObject(settingFromLocal, this.f34110a));
        if (t != null) {
            return t;
        }
        AppBrandLogger.m52830i("AbsSettingGenericHandler", "JSON.parseObject() return null");
        return m52735b();
    }
}
