package com.ss.android.lark.chat.entity.message.content;

import android.content.Context;
import com.alibaba.fastjson.annotation.JSONType;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001DB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001a\u0010(\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010*\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001c\u0010-\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u000e\u00100\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001aR\u001c\u00104\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR\u001a\u00107\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR\u001a\u0010:\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001c\u0010=\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000e¨\u0006E"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/AudioContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "audio2TextStartTime", "", "getAudio2TextStartTime", "()J", "setAudio2TextStartTime", "(J)V", "audioToken", "", "getAudioToken", "()Ljava/lang/String;", "setAudioToken", "(Ljava/lang/String;)V", "audioWaveBytes", "", "getAudioWaveBytes", "()[B", "setAudioWaveBytes", "([B)V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "fileState", "Lcom/ss/android/lark/chat/entity/message/content/AudioContent$AudioState;", "getFileState", "()Lcom/ss/android/lark/chat/entity/message/content/AudioContent$AudioState;", "setFileState", "(Lcom/ss/android/lark/chat/entity/message/content/AudioContent$AudioState;)V", "isAudioWithText", "", "()Z", "setAudioWithText", "(Z)V", "isNeedHideText", "setNeedHideText", "isRecognizeFinished", "setRecognizeFinished", "key", "getKey", "setKey", "localFilePath", "getLocalFilePath", "setLocalFilePath", "localSequenceId", "progress", "getProgress", "setProgress", "recognizedText", "getRecognizedText", "setRecognizedText", "sequenceId", "getSequenceId", "setSequenceId", "size", "getSize", "setSize", "uploadId", "getUploadId", "setUploadId", "formatDuration", "context", "Landroid/content/Context;", "getLocalSequenceId", "AudioState", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "AudioContent")
public final class AudioContent extends Content {
    private long audio2TextStartTime;
    private String audioToken;
    private byte[] audioWaveBytes;
    private int duration;
    private AudioState fileState = AudioState.DOWNLOAD;
    private boolean isAudioWithText;
    private boolean isNeedHideText = true;
    private boolean isRecognizeFinished = true;
    private String key = "";
    private String localFilePath;
    private int localSequenceId;
    private int progress;
    private String recognizedText = "";
    private int sequenceId;
    private long size;
    private String uploadId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/AudioContent$AudioState;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DOWNLOAD", "DOWNLOADING", "UPLOADING", "DONE", "RECORDING", "DONE_OPEN", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum AudioState {
        DOWNLOAD("下载文件"),
        DOWNLOADING("下载中"),
        UPLOADING("传输中"),
        DONE("打开文件"),
        RECORDING("录制中"),
        DONE_OPEN("下载并打开");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        private AudioState(String str) {
            this.value = str;
        }
    }

    public final long getAudio2TextStartTime() {
        return this.audio2TextStartTime;
    }

    public final String getAudioToken() {
        return this.audioToken;
    }

    public final byte[] getAudioWaveBytes() {
        return this.audioWaveBytes;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final AudioState getFileState() {
        return this.fileState;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLocalFilePath() {
        return this.localFilePath;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getRecognizedText() {
        return this.recognizedText;
    }

    public final int getSequenceId() {
        return this.sequenceId;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    public final boolean isAudioWithText() {
        return this.isAudioWithText;
    }

    public final boolean isNeedHideText() {
        return this.isNeedHideText;
    }

    public final boolean isRecognizeFinished() {
        return this.isRecognizeFinished;
    }

    public final int getLocalSequenceId() {
        int i = this.localSequenceId + 1;
        this.localSequenceId = i;
        return i;
    }

    public final void setAudio2TextStartTime(long j) {
        this.audio2TextStartTime = j;
    }

    public final void setAudioToken(String str) {
        this.audioToken = str;
    }

    public final void setAudioWaveBytes(byte[] bArr) {
        this.audioWaveBytes = bArr;
    }

    public final void setAudioWithText(boolean z) {
        this.isAudioWithText = z;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setLocalFilePath(String str) {
        this.localFilePath = str;
    }

    public final void setNeedHideText(boolean z) {
        this.isNeedHideText = z;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setRecognizeFinished(boolean z) {
        this.isRecognizeFinished = z;
    }

    public final void setRecognizedText(String str) {
        this.recognizedText = str;
    }

    public final void setSequenceId(int i) {
        this.sequenceId = i;
    }

    public final void setSize(long j) {
        this.size = j;
    }

    public final void setUploadId(String str) {
        this.uploadId = str;
    }

    public final void setFileState(AudioState audioState) {
        Intrinsics.checkParameterIsNotNull(audioState, "<set-?>");
        this.fileState = audioState;
    }

    public final void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }

    public final String formatDuration(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        int i = this.duration + ParticipantRepo.f117150c;
        this.duration = i;
        int i2 = i / 1000;
        this.duration = i2;
        long j = (long) (i2 / 60);
        long j2 = (long) (i2 % 60);
        if (j != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("" + String.valueOf(j) + UIUtils.getString(context, R.string.Lark_Legacy_MinuteLabel));
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            sb.append(format);
            sb.append(UIUtils.getString(context, R.string.Lark_Legacy_SecondLabel));
            return sb.toString();
        }
        return "" + String.valueOf(j2) + UIUtils.getString(context, R.string.Lark_Legacy_SecondLabel);
    }
}
