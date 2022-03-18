package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.contract.AccountService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/list/ToCUtil;", "", "()V", "canShowExternalTag", "", "account", "Lcom/bytedance/ee/bear/contract/AccountService$Account;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.t */
public final class ToCUtil {

    /* renamed from: a */
    public static final ToCUtil f23737a = new ToCUtil();

    private ToCUtil() {
    }

    /* renamed from: a */
    public final boolean mo33873a(AccountService.Account account) {
        if (account == null || account.mo19681c()) {
            return false;
        }
        return true;
    }
}
