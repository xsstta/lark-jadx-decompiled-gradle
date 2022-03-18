package com.ss.android.lark.keyboard.plugin.tool.voice;

import com.ss.android.lark.widget.richtext.RichText;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH&J(\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H&J(\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH&J*\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/IRecordListener;", "", "onAudio2Text", "", "onAudioRecorded", "strFileName", "", "cid", "duration", "", "needRecognized", "", "onCancelRecord", "onClearResult", "onPanelHeightChanged", "height", "onPrepareForRecord", "onlyText", "onSendAudio", "onSendAudioText", "content", "onSendText", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "onStartRecord", "onUpdateAudio", "buffer", "Ljava/nio/ByteBuffer;", "volume", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.b */
public interface IRecordListener {
    /* renamed from: a */
    void mo123901a();

    /* renamed from: a */
    void mo123902a(int i);

    /* renamed from: a */
    void mo123903a(String str);

    /* renamed from: a */
    void mo123904a(String str, RichText richText);

    /* renamed from: a */
    void mo123905a(String str, String str2, int i, boolean z);

    /* renamed from: a */
    void mo123906a(String str, String str2, boolean z, boolean z2);

    /* renamed from: a */
    void mo123907a(ByteBuffer byteBuffer, int i, double d, boolean z);

    /* renamed from: b */
    void mo123908b();

    /* renamed from: b */
    void mo123909b(String str);

    /* renamed from: b */
    void mo123910b(String str, String str2, boolean z, boolean z2);

    /* renamed from: c */
    void mo123911c();
}
