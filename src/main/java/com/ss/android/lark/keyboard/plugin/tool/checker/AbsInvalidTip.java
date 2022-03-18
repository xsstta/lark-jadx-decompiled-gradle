package com.ss.android.lark.keyboard.plugin.tool.checker;

import com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H$J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0004J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/checker/AbsInvalidTip;", "", "result", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "(Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;)V", "getResult", "()Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "getMsg", "", "getTipDuration", "limitVideoDuration", "", "getTipSize", "limitFileSize", "", "show", "", "showMsg", "msg", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.a */
public abstract class AbsInvalidTip {

    /* renamed from: a */
    private final VideoSendChecker.Result f103803a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo147424a(VideoSendChecker.Result result);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo147426a(String str);

    /* renamed from: a */
    public void mo147425a() {
        VideoSendChecker.Result result = VideoSendChecker.Result.VALID;
        VideoSendChecker.Result result2 = this.f103803a;
        if (result != result2) {
            mo147426a(mo147424a(result2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo147422a(int i) {
        return String.valueOf(i / 60);
    }

    public AbsInvalidTip(VideoSendChecker.Result result) {
        Intrinsics.checkParameterIsNotNull(result, "result");
        this.f103803a = result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo147423a(long j) {
        long j2 = (long) 1024;
        return String.valueOf((j / j2) / j2);
    }
}
