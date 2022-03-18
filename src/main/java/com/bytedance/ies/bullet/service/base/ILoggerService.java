package com.bytedance.ies.bullet.service.base;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import com.bytedance.ies.bullet.service.base.api.LogLevel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/ILoggerService;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "loggerConfig", "Lcom/bytedance/ies/bullet/service/base/ILoggerConfig;", "getLoggerConfig", "()Lcom/bytedance/ies/bullet/service/base/ILoggerConfig;", "onLog", "", "msg", "", "level", "Lcom/bytedance/ies/bullet/service/base/api/LogLevel;", "onReject", "e", "", "extraMsg", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.d */
public interface ILoggerService extends IBulletService {
    /* renamed from: a */
    void mo33919a(String str, LogLevel logLevel);

    /* renamed from: a */
    void mo33920a(Throwable th, String str);
}
