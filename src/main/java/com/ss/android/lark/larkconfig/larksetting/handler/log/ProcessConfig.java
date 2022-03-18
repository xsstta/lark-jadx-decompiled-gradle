package com.ss.android.lark.larkconfig.larksetting.handler.log;

import com.ss.android.lark.log.alog.ProcessItemConfig;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lcom/ss/android/lark/larkconfig/larksetting/handler/log/ProcessConfig;", "", "main", "Lcom/ss/android/lark/log/alog/ProcessItemConfig;", "p0", "mini", "mail", "sandbox", "wschannel", "push", "pushService", "default", "(Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;Lcom/ss/android/lark/log/alog/ProcessItemConfig;)V", "getDefault", "()Lcom/ss/android/lark/log/alog/ProcessItemConfig;", "setDefault", "(Lcom/ss/android/lark/log/alog/ProcessItemConfig;)V", "getMail", "setMail", "getMain", "setMain", "getMini", "setMini", "getP0", "setP0", "getPush", "setPush", "getPushService", "setPushService", "getSandbox", "setSandbox", "getWschannel", "setWschannel", "larksetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ProcessConfig {

    /* renamed from: default  reason: not valid java name */
    private ProcessItemConfig f175369default;
    private ProcessItemConfig mail;
    private ProcessItemConfig main;
    private ProcessItemConfig mini;
    private ProcessItemConfig p0;
    private ProcessItemConfig push;
    private ProcessItemConfig pushService;
    private ProcessItemConfig sandbox;
    private ProcessItemConfig wschannel;

    public ProcessConfig() {
        this(null, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    public final ProcessItemConfig getDefault() {
        return this.f175369default;
    }

    public final ProcessItemConfig getMail() {
        return this.mail;
    }

    public final ProcessItemConfig getMain() {
        return this.main;
    }

    public final ProcessItemConfig getMini() {
        return this.mini;
    }

    public final ProcessItemConfig getP0() {
        return this.p0;
    }

    public final ProcessItemConfig getPush() {
        return this.push;
    }

    public final ProcessItemConfig getPushService() {
        return this.pushService;
    }

    public final ProcessItemConfig getSandbox() {
        return this.sandbox;
    }

    public final ProcessItemConfig getWschannel() {
        return this.wschannel;
    }

    public final void setDefault(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.f175369default = processItemConfig;
    }

    public final void setMail(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.mail = processItemConfig;
    }

    public final void setMain(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.main = processItemConfig;
    }

    public final void setMini(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.mini = processItemConfig;
    }

    public final void setP0(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.p0 = processItemConfig;
    }

    public final void setPush(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.push = processItemConfig;
    }

    public final void setPushService(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.pushService = processItemConfig;
    }

    public final void setSandbox(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.sandbox = processItemConfig;
    }

    public final void setWschannel(ProcessItemConfig processItemConfig) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "<set-?>");
        this.wschannel = processItemConfig;
    }

    public ProcessConfig(ProcessItemConfig processItemConfig, ProcessItemConfig processItemConfig2, ProcessItemConfig processItemConfig3, ProcessItemConfig processItemConfig4, ProcessItemConfig processItemConfig5, ProcessItemConfig processItemConfig6, ProcessItemConfig processItemConfig7, ProcessItemConfig processItemConfig8, ProcessItemConfig processItemConfig9) {
        Intrinsics.checkParameterIsNotNull(processItemConfig, "main");
        Intrinsics.checkParameterIsNotNull(processItemConfig2, "p0");
        Intrinsics.checkParameterIsNotNull(processItemConfig3, "mini");
        Intrinsics.checkParameterIsNotNull(processItemConfig4, "mail");
        Intrinsics.checkParameterIsNotNull(processItemConfig5, "sandbox");
        Intrinsics.checkParameterIsNotNull(processItemConfig6, "wschannel");
        Intrinsics.checkParameterIsNotNull(processItemConfig7, "push");
        Intrinsics.checkParameterIsNotNull(processItemConfig8, "pushService");
        Intrinsics.checkParameterIsNotNull(processItemConfig9, "default");
        this.main = processItemConfig;
        this.p0 = processItemConfig2;
        this.mini = processItemConfig3;
        this.mail = processItemConfig4;
        this.sandbox = processItemConfig5;
        this.wschannel = processItemConfig6;
        this.push = processItemConfig7;
        this.pushService = processItemConfig8;
        this.f175369default = processItemConfig9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProcessConfig(com.ss.android.lark.log.alog.ProcessItemConfig r16, com.ss.android.lark.log.alog.ProcessItemConfig r17, com.ss.android.lark.log.alog.ProcessItemConfig r18, com.ss.android.lark.log.alog.ProcessItemConfig r19, com.ss.android.lark.log.alog.ProcessItemConfig r20, com.ss.android.lark.log.alog.ProcessItemConfig r21, com.ss.android.lark.log.alog.ProcessItemConfig r22, com.ss.android.lark.log.alog.ProcessItemConfig r23, com.ss.android.lark.log.alog.ProcessItemConfig r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.larkconfig.larksetting.handler.log.ProcessConfig.<init>(com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, com.ss.android.lark.log.alog.ProcessItemConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
