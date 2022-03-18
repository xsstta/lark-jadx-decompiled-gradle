package com.tt.refer.common.config;

import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH&JE\u0010\n\u001a\u00020\u000326\u0010\u000b\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r0\f\"\u0014\u0012\u0004\u0012\u00020\u0005\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/tt/refer/common/config/IConfigStrategy;", "Lcom/bytedance/ee/lark/infra/sandbox/context/IBaseService;", "build", "", "json", "", "registerCommand", "command", "listener", "Lcom/tt/refer/common/config/IStrategyListener;", "run", "args", "", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.common.b.d */
public interface IConfigStrategy extends IBaseService {
    /* renamed from: a */
    void mo235126a(String str, IStrategyListener eVar);

    /* renamed from: a */
    void mo235127a(Pair<String, ? extends Object>... pairArr);
}
