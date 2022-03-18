package com.ss.android.lark.moments.impl.privatechat;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "", "()V", "ToAskDialog", "ToSecretChat", "ToSendSuccessDialog", "ToWaitDialog", "ToastNotAllowed", "ToastUnknownError", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToAskDialog;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToWaitDialog;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToSendSuccessDialog;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToastNotAllowed;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToSecretChat;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToastUnknownError;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.f.e */
public abstract class SecretChatRequestResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToAskDialog;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "askData", "Lcom/ss/android/lark/moments/impl/privatechat/AskData;", "(Lcom/ss/android/lark/moments/impl/privatechat/AskData;)V", "getAskData", "()Lcom/ss/android/lark/moments/impl/privatechat/AskData;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.e$a */
    public static final class ToAskDialog extends SecretChatRequestResult {

        /* renamed from: a */
        private final AskData f119743a;

        /* renamed from: a */
        public final AskData mo166886a() {
            return this.f119743a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ToAskDialog(AskData aVar) {
            super(null);
            Intrinsics.checkParameterIsNotNull(aVar, "askData");
            this.f119743a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToSecretChat;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "chatId", "", "(Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.e$b */
    public static final class ToSecretChat extends SecretChatRequestResult {

        /* renamed from: a */
        private final String f119744a;

        /* renamed from: a */
        public final String mo166887a() {
            return this.f119744a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ToSecretChat(String str) {
            super(null);
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            this.f119744a = str;
        }
    }

    private SecretChatRequestResult() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToSendSuccessDialog;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "()V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.e$c */
    public static final class ToSendSuccessDialog extends SecretChatRequestResult {

        /* renamed from: a */
        public static final ToSendSuccessDialog f119745a = new ToSendSuccessDialog();

        private ToSendSuccessDialog() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToWaitDialog;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "()V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.e$d */
    public static final class ToWaitDialog extends SecretChatRequestResult {

        /* renamed from: a */
        public static final ToWaitDialog f119746a = new ToWaitDialog();

        private ToWaitDialog() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToastNotAllowed;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "()V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.e$e */
    public static final class ToastNotAllowed extends SecretChatRequestResult {

        /* renamed from: a */
        public static final ToastNotAllowed f119747a = new ToastNotAllowed();

        private ToastNotAllowed() {
            super(null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult$ToastUnknownError;", "Lcom/ss/android/lark/moments/impl/privatechat/SecretChatRequestResult;", "()V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.f.e$f */
    public static final class ToastUnknownError extends SecretChatRequestResult {

        /* renamed from: a */
        public static final ToastUnknownError f119748a = new ToastUnknownError();

        private ToastUnknownError() {
            super(null);
        }
    }

    public /* synthetic */ SecretChatRequestResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
