package com.ss.android.openbusiness.bot.net;

import com.huawei.hms.actions.SearchIntents;
import com.ss.android.openbusiness.bot.net.data.C59537a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/ss/android/openbusiness/bot/net/IBotDataService;", "", "getAddedBotList", "", "chatId", "", "callResult", "Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "getCanAddBotList", "searchBot", SearchIntents.EXTRA_QUERY, "CallResult", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.openbusiness.bot.net.b */
public interface IBotDataService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/openbusiness/bot/net/IBotDataService$CallResult;", "", "onFail", "", "errorMsg", "", "onSuccess", "botListResult", "Lcom/ss/android/openbusiness/bot/net/data/BotListResult;", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.net.b$a */
    public interface CallResult {
        /* renamed from: a */
        void mo202850a(C59537a aVar);

        /* renamed from: a */
        void mo202851a(String str);
    }

    /* renamed from: a */
    void mo202884a(String str, CallResult aVar);

    /* renamed from: a */
    void mo202885a(String str, String str2, CallResult aVar);

    /* renamed from: b */
    void mo202886b(String str, CallResult aVar);
}
