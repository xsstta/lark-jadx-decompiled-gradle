package com.ss.android.openbusiness.bot;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.openbusiness.C59480b;
import com.ss.android.openbusiness.bot.list.GroupBotListActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/openbusiness/bot/GroupBotRouter;", "", "()V", "Companion", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.openbusiness.bot.a */
public final class GroupBotRouter {

    /* renamed from: a */
    public static final Companion f147721a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/openbusiness/bot/GroupBotRouter$Companion;", "", "()V", "TAG", "", "entry", "", "context", "Landroid/content/Context;", "chatId", "isExternal", "", "openBotDetail", "botId", "isAddToGroup", "openbusiness_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.openbusiness.bot.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo202820a(Context context, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Log.m165389i("GroupBotRouter", "open BotList page");
            GroupBotListActivity.f147758g.mo202870a(context, new ArrayList<>(), str, z);
        }

        /* renamed from: a */
        public final void mo202819a(Context context, String str, String str2, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "botId");
            Intrinsics.checkParameterIsNotNull(str2, "chatId");
            Log.m165389i("GroupBotRouter", "open BotSearch page");
            C59480b.m230865a().mo144872a(context, str, str2, z);
        }
    }
}
