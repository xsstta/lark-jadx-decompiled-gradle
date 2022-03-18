package com.ss.android.lark.fcm_download.manage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/fcm_download/manage/FCMDialogState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SHOW_DIALOG", "REJECT", "AGREE", "Companion", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum FCMDialogState {
    SHOW_DIALOG(1),
    REJECT(2),
    AGREE(3);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/fcm_download/manage/FCMDialogState$Companion;", "", "()V", "valueOf", "Lcom/ss/android/lark/fcm_download/manage/FCMDialogState;", "value", "", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.manage.FCMDialogState$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FCMDialogState mo136927a(int i) {
            if (i == 1) {
                return FCMDialogState.SHOW_DIALOG;
            }
            if (i == 2) {
                return FCMDialogState.REJECT;
            }
            if (i != 3) {
                return FCMDialogState.SHOW_DIALOG;
            }
            return FCMDialogState.AGREE;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private FCMDialogState(int i) {
        this.value = i;
    }
}
