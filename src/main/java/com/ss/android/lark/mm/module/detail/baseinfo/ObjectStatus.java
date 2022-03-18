package com.ss.android.lark.mm.module.detail.baseinfo;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0019B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/ObjectStatus;", "", "Ljava/io/Serializable;", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Deleted", "Trash", "Recording", "WaitASR", "Complete", "Failed", "Transcode", "Uploading", "WaitDiarization", "Pending", "PendingLowPriority", "FileCorrupted", "RealTimeRecording", "RealTimePause", "RealTimeCompleteUploading", "RealTimeCompleteForced", "RealTimeCompleteUpload", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum ObjectStatus implements Serializable {
    Deleted(-2),
    Trash(-1),
    Recording(0),
    WaitASR(1),
    Complete(2),
    Failed(3),
    Transcode(4),
    Uploading(5),
    WaitDiarization(11),
    Pending(12),
    PendingLowPriority(13),
    FileCorrupted(31),
    RealTimeRecording(40),
    RealTimePause(41),
    RealTimeCompleteUploading(42),
    RealTimeCompleteForced(43),
    RealTimeCompleteUpload(44);
    
    public static final Companion Companion = new Companion(null);
    private final int value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/baseinfo/ObjectStatus$Companion;", "", "()V", "canTransfer", "", "value", "", "(Ljava/lang/Integer;)Z", "isDeleted", "isProcessing", "isRecording", "isRecordingExcludeUploaded", "isRecordingReal", "isRecordingUploading", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo161606a(Integer num) {
            int value = ObjectStatus.Deleted.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo161610e(Integer num) {
            int value = ObjectStatus.RealTimeRecording.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = ObjectStatus.RealTimePause.getValue();
                if (num != null && num.intValue() == value2) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo161611f(Integer num) {
            int value = ObjectStatus.RealTimeCompleteUploading.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = ObjectStatus.RealTimeCompleteForced.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = ObjectStatus.RealTimeCompleteUpload.getValue();
                    if (num != null && num.intValue() == value3) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public final boolean mo161607b(Integer num) {
            int value = ObjectStatus.Recording.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = ObjectStatus.Transcode.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = ObjectStatus.Uploading.getValue();
                    if (num == null || num.intValue() != value3) {
                        int value4 = ObjectStatus.WaitDiarization.getValue();
                        if (num == null || num.intValue() != value4) {
                            int value5 = ObjectStatus.Pending.getValue();
                            if (num == null || num.intValue() != value5) {
                                int value6 = ObjectStatus.PendingLowPriority.getValue();
                                if (num != null && num.intValue() == value6) {
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo161608c(Integer num) {
            int value = ObjectStatus.RealTimeRecording.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = ObjectStatus.RealTimePause.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = ObjectStatus.RealTimeCompleteUploading.getValue();
                    if (num == null || num.intValue() != value3) {
                        int value4 = ObjectStatus.RealTimeCompleteForced.getValue();
                        if (num == null || num.intValue() != value4) {
                            int value5 = ObjectStatus.RealTimeCompleteUpload.getValue();
                            if (num != null && num.intValue() == value5) {
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        /* renamed from: d */
        public final boolean mo161609d(Integer num) {
            int value = ObjectStatus.RealTimeRecording.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = ObjectStatus.RealTimePause.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = ObjectStatus.RealTimeCompleteUploading.getValue();
                    if (num == null || num.intValue() != value3) {
                        int value4 = ObjectStatus.RealTimeCompleteForced.getValue();
                        if (num != null && num.intValue() == value4) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: g */
        public final boolean mo161612g(Integer num) {
            int value = ObjectStatus.WaitASR.getValue();
            if (num == null || num.intValue() != value) {
                int value2 = ObjectStatus.Complete.getValue();
                if (num == null || num.intValue() != value2) {
                    int value3 = ObjectStatus.Transcode.getValue();
                    if (num == null || num.intValue() != value3) {
                        int value4 = ObjectStatus.WaitDiarization.getValue();
                        if (num == null || num.intValue() != value4) {
                            int value5 = ObjectStatus.Pending.getValue();
                            if (num == null || num.intValue() != value5) {
                                int value6 = ObjectStatus.PendingLowPriority.getValue();
                                if (num != null && num.intValue() == value6) {
                                    return true;
                                }
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    public final int getValue() {
        return this.value;
    }

    private ObjectStatus(int i) {
        this.value = i;
    }
}
