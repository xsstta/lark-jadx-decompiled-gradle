package com.ss.android.lark.chat.utils;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36903e;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.chat.utils.b */
public class C34332b {

    /* renamed from: a */
    static AbstractC36474h f88661a = C29990c.m110930b();

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m133116c(AudioContent audioContent) {
        audioContent.setAudioWaveBytes(C36903e.m145675a().mo136253a(audioContent.getLocalFilePath()));
    }

    /* renamed from: b */
    public static void m133114b(AudioContent audioContent) {
        if (audioContent != null && audioContent.getAudioWaveBytes() == null && !TextUtils.isEmpty(audioContent.getLocalFilePath())) {
            audioContent.setAudioWaveBytes(C36903e.m145675a().mo136253a(audioContent.getLocalFilePath()));
        }
    }

    /* renamed from: a */
    public static void m133111a(AudioContent audioContent) {
        if (audioContent != null && audioContent.getAudioWaveBytes() == null && !TextUtils.isEmpty(audioContent.getLocalFilePath())) {
            C57865c.m224576a(new Runnable() {
                /* class com.ss.android.lark.chat.utils.$$Lambda$b$OuLHmlktQQsZelBjRm0c1NzWFJI */

                public final void run() {
                    C34332b.m133116c(AudioContent.this);
                }
            });
        }
    }

    /* renamed from: b */
    private static boolean m133115b(Message message) {
        AudioContent audioContent = (AudioContent) message.getContent();
        if (audioContent == null || audioContent.getFileState() == AudioContent.AudioState.DOWNLOADING || TextUtils.isEmpty(audioContent.getKey())) {
            return true;
        }
        String localFilePath = audioContent.getLocalFilePath();
        String b = C57881t.m224625b(f88661a.mo134528a(), audioContent.getKey(), audioContent.getKey());
        if (!TextUtils.isEmpty(localFilePath)) {
            if (new File(localFilePath).exists()) {
                return true;
            }
            return false;
        } else if (TextUtils.isEmpty(b) || !new File(b).exists()) {
            return false;
        } else {
            audioContent.setLocalFilePath(b);
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m133113a(Message message) {
        if (message != null && message.getType() == Message.Type.AUDIO && !message.isMessageDisable()) {
            return m133115b(message);
        }
        return true;
    }

    /* renamed from: a */
    public static void m133109a(Message message, boolean z) {
        if (!m133113a(message)) {
            final AudioContent audioContent = (AudioContent) message.getContent();
            m133110a(message, z, new UIGetDataCallback(new IGetDataCallback<String>() {
                /* class com.ss.android.lark.chat.utils.C34332b.C343331 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165378d(errorResult.toString());
                    audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    if (TextUtils.isEmpty(str)) {
                        audioContent.setFileState(AudioContent.AudioState.DOWNLOAD);
                        return;
                    }
                    audioContent.setProgress(100);
                    audioContent.setFileState(AudioContent.AudioState.DONE);
                    audioContent.setLocalFilePath(str);
                    C34332b.m133111a(audioContent);
                }
            }));
        }
    }

    /* renamed from: a */
    public static void m133110a(Message message, boolean z, final IGetDataCallback<String> iGetDataCallback) {
        String str;
        int i;
        String key = ((AudioContent) message.getContent()).getKey();
        if (z) {
            str = null;
        } else {
            str = C57881t.m224603B(f88661a.mo134528a());
        }
        if (message.getSourceType() == Message.SourceType.TYPE_FROM_FAVORITE) {
            i = 2;
        } else {
            i = -99;
        }
        f88661a.mo134546a(key, str, i, new IGetDataCallback<String>() {
            /* class com.ss.android.lark.chat.utils.C34332b.C343342 */

            /* renamed from: a */
            public void onSuccess(String str) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(str);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m133112a(Set<String> set, boolean z, final IGetDataCallback<Map<String, String>> iGetDataCallback) {
        String str;
        AbstractC36474h hVar = f88661a;
        if (z) {
            str = null;
        } else {
            str = C57881t.m224603B(hVar.mo134528a());
        }
        hVar.mo134547a(set, str, new IGetDataCallback<Map<String, String>>() {
            /* class com.ss.android.lark.chat.utils.C34332b.C343353 */

            /* renamed from: a */
            public void onSuccess(Map<String, String> map) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(map);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        });
    }
}
