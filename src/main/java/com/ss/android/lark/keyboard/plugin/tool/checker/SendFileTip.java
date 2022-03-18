package com.ss.android.lark.keyboard.plugin.tool.checker;

import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.VideoSendConfig;
import com.ss.android.lark.utils.VideoSettingUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH$J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/checker/SendFileTip;", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/AbsInvalidTip;", "result", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "(Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;)V", "getMsg", "", "onCancel", "", "onSendFile", "showMsg", "msg", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.d */
public abstract class SendFileTip extends AbsInvalidTip {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo147429b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo147430c();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendFileTip(VideoSendChecker.Result result) {
        super(result);
        Intrinsics.checkParameterIsNotNull(result, "result");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.checker.AbsInvalidTip
    /* renamed from: a */
    public void mo147426a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        new C25639g(LarkContext.getApplication()).mo89237b(str).mo89251j(2).mo89238b(true).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.Lark_Legacy_CancelTip), new DialogInterface$OnClickListenerC40825a(this)).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.getString(R.string.Lark_Legacy_PickerSend), new DialogInterface$OnClickListenerC40826b(this)).mo89244d();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.plugin.tool.checker.AbsInvalidTip
    /* renamed from: a */
    public String mo147424a(VideoSendChecker.Result result) {
        Intrinsics.checkParameterIsNotNull(result, "result");
        VideoSendConfig a = VideoSettingUtils.m224293a();
        String a2 = mo147423a(a.getLimitFileSize());
        String a3 = mo147422a(a.getLimitVideoDuration());
        switch (C40827e.f103808a[result.ordinal()]) {
            case 1:
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Chat_VideoFileExceedsNumMBAttachment, "num", a2);
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…tachment, \"num\", tipSize)");
                return mustacheFormat;
            case 2:
                String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Lark_Chat_VideoLongerNumMinAttachment, "num", a3);
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "UIHelper.mustacheFormat(…             tipDuration)");
                return mustacheFormat2;
            case 3:
                String string = UIHelper.getString(R.string.Lark_Chat_VideoResolutionExceedLimitAttach);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…olutionExceedLimitAttach)");
                return string;
            case 4:
                String string2 = UIHelper.getString(R.string.Lark_Chat_VideoFrameRateExceedLimitAttach);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…ameRateExceedLimitAttach)");
                return string2;
            case 5:
                String string3 = UIHelper.getString(R.string.Lark_Chat_VideoBitRateExceedLimitAttach);
                Intrinsics.checkExpressionValueIsNotNull(string3, "UIHelper.getString(R.str…BitRateExceedLimitAttach)");
                return string3;
            case 6:
                String string4 = UIHelper.getString(R.string.Lark_IMVideo_InvalidVideoFormatSentAsFile_PopupText);
                Intrinsics.checkExpressionValueIsNotNull(string4, "UIHelper.getString(R.str…rmatSentAsFile_PopupText)");
                return string4;
            default:
                String string5 = UIHelper.getString(R.string.Lark_Chat_VideoSizeExceedsLimit);
                Intrinsics.checkExpressionValueIsNotNull(string5, "UIHelper.getString(R.str…at_VideoSizeExceedsLimit)");
                return string5;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.d$a */
    static final class DialogInterface$OnClickListenerC40825a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SendFileTip f103806a;

        DialogInterface$OnClickListenerC40825a(SendFileTip dVar) {
            this.f103806a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f103806a.mo147429b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.checker.d$b */
    static final class DialogInterface$OnClickListenerC40826b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SendFileTip f103807a;

        DialogInterface$OnClickListenerC40826b(SendFileTip dVar) {
            this.f103807a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f103807a.mo147430c();
        }
    }
}
