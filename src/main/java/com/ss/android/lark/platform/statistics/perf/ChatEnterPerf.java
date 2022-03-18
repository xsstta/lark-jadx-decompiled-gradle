package com.ss.android.lark.platform.statistics.perf;

import com.ss.android.lark.platform.statistics.p2502b.C51979h;
import com.ss.android.lark.utils.statistics.PerfLog;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fJ\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u000fJ\u0006\u0010\u001b\u001a\u00020\u000fJ\u0010\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u001d\u001a\u00020\u000fJ\u0006\u0010\u001e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u0006\u0010 \u001a\u00020\u000fJ\u0006\u0010!\u001a\u00020\u000fJ\u0006\u0010\"\u001a\u00020\u000fJ\u0006\u0010#\u001a\u00020\u000fJ\u0006\u0010$\u001a\u00020\u000fJ\u0006\u0010%\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/lark/platform/statistics/perf/ChatEnterPerf;", "", "()V", "KEY_BIND_MESSAGE", "", "KEY_CHECK_CHAT_TIME", "KEY_FIRST_WINDOW", "KEY_GET_LAUNCH_INFO", "KEY_INIT_VIEW", "KEY_LOAD_LOCAL_DATA", "KEY_LOAD_NET_DATA", "KEY_MESSAGE_DELAY", "KEY_OPEN_CHAT", "KEY_OPEN_CHAT_ACTIVITY", "endBindMessage", "", "log", "endCheckChat", "endFirstWindow", "endGetChatInfo", "endInitView", "endLoadLocalData", "endLoadNetData", "endMessageDelay", "endOpenChatActivity", "endRenderList", "openEnd", "openStart", "startBindMessage", "startCheckChat", "startFirstWindow", "startGetChatInfo", "startInitView", "startLoadLocalData", "startLoadNetData", "startMessageDelay", "startOpenChatActivity", "startRenderList", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.statistics.perf.a */
public final class ChatEnterPerf {

    /* renamed from: a */
    public static final ChatEnterPerf f129118a = new ChatEnterPerf();

    private ChatEnterPerf() {
    }

    /* renamed from: a */
    public final void mo178214a() {
        PerfLog.start("open_chat", "");
        C51979h.m201608a("open_chat");
    }

    /* renamed from: b */
    public final void mo178215b() {
        PerfLog.end("open_chat", "");
        C51979h.m201611b("open_chat");
    }

    /* renamed from: c */
    public final void mo178216c() {
        PerfLog.start("get_chat_launcher_info", "");
        C51979h.m201609a("open_chat", "get_chat_launcher_info");
    }

    /* renamed from: d */
    public final void mo178217d() {
        PerfLog.end("get_chat_launcher_info", "");
        C51979h.m201611b("get_chat_launcher_info");
    }

    /* renamed from: e */
    public final void mo178218e() {
        PerfLog.start("first_window", "");
        C51979h.m201609a("open_chat", "first_window");
    }

    /* renamed from: f */
    public final void mo178219f() {
        PerfLog.end("first_window", "");
        C51979h.m201611b("first_window");
    }

    /* renamed from: g */
    public final void mo178220g() {
        PerfLog.start("load_net_data", "");
        C51979h.m201609a("open_chat", "load_net_data");
    }

    /* renamed from: h */
    public final void mo178221h() {
        PerfLog.end("load_net_data", "");
        C51979h.m201611b("load_net_data");
    }

    /* renamed from: i */
    public final void mo178222i() {
        PerfLog.start("load_local_data", "");
        C51979h.m201609a("open_chat", "load_local_data");
    }

    /* renamed from: j */
    public final void mo178223j() {
        PerfLog.end("load_local_data", "");
        C51979h.m201611b("load_local_data");
    }

    /* renamed from: k */
    public final void mo178224k() {
        PerfLog.start("init_view", "");
        C51979h.m201609a("open_chat", "init_view");
    }

    /* renamed from: l */
    public final void mo178225l() {
        PerfLog.end("init_view", "");
        C51979h.m201611b("init_view");
    }

    /* renamed from: m */
    public final void mo178226m() {
        PerfLog.start("load_net_data", "");
        C51979h.m201609a("open_chat", "load_net_data");
    }

    /* renamed from: n */
    public final void mo178227n() {
        PerfLog.end("load_net_data", "");
        C51979h.m201611b("load_net_data");
    }

    /* renamed from: o */
    public final void mo178228o() {
        PerfLog.start("message_data_delay_cost", "");
        C51979h.m201609a("open_chat", "message_data_delay_cost");
    }

    /* renamed from: p */
    public final void mo178229p() {
        PerfLog.end("message_data_delay_cost", "");
        C51979h.m201611b("message_data_delay_cost");
    }

    /* renamed from: q */
    public final void mo178230q() {
        PerfLog.start("open_chat_activity", "");
        C51979h.m201609a("open_chat", "open_chat_activity");
    }

    /* renamed from: r */
    public final void mo178231r() {
        PerfLog.end("open_chat_activity", "");
        C51979h.m201611b("open_chat_activity");
    }
}
