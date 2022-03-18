package com.ss.android.lark.searchcommon;

import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@AppConfig(key = "suite_search_client_config")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/SearchArgsSetting;", "", "()V", "debounceMs", "", "emptyChatLen", "", "onScreenLimitTimeMs", "topNLimit", "toString", "", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchArgsSetting {

    /* renamed from: e */
    public static final Companion f133114e = new Companion(null);
    @SerializedName("search_in_chat_messages_empty_char_length")

    /* renamed from: a */
    public int f133115a;
    @SerializedName("search_top_n_report_limit")

    /* renamed from: b */
    public int f133116b = 5;
    @SerializedName("search_debounce_ms")

    /* renamed from: c */
    public long f133117c = 200;
    @SerializedName("search_main_onscreen_waiting_time")

    /* renamed from: d */
    public int f133118d = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/searchcommon/SearchArgsSetting$Companion;", "", "()V", "DEFAULT_DEBOUNCE_MS", "", "DEFAULT_EMPTY_CHAR_LEN", "", "DEFAULT_ON_SCREEN_LIMIT_TIME_MS", "DEFAULT_TOP_N_LIMIT", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.SearchArgsSetting$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public String toString() {
        return "SearchArgsSetting{emptyChatLen=" + this.f133115a + ", topNLimit=" + this.f133116b + ", debounceMs=" + this.f133117c + ", onScreenLimitTimeMs=" + this.f133118d + '}';
    }
}
