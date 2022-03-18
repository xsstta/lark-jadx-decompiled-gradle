package com.ss.android.lark.widget.audioview;

import android.content.Context;
import android.view.View;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;

/* renamed from: com.ss.android.lark.widget.audioview.a */
public interface AbstractC58321a {

    /* renamed from: com.ss.android.lark.widget.audioview.a$a */
    public interface AbstractC58322a {
        /* renamed from: a */
        void mo122668a(View view);

        /* renamed from: b */
        boolean mo122669b(View view);
    }

    /* renamed from: a */
    void mo136734a();

    /* renamed from: b */
    void mo136735b();

    /* renamed from: c */
    void mo136736c();

    /* renamed from: d */
    void mo136737d();

    /* renamed from: e */
    void mo136738e();

    /* renamed from: f */
    void mo136739f();

    Context getContext();

    String getDurationText();

    float getProgress();

    Object getTag(int i);

    void setDelegate(PlayControlBar.AbstractC58473a aVar);

    void setDuration(int i);

    void setListener(AbstractC58322a aVar);

    void setProgress(float f);

    void setTag(Object obj);
}
