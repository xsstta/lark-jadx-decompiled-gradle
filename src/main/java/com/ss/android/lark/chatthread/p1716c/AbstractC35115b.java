package com.ss.android.lark.chatthread.p1716c;

import android.content.Context;
import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatthread.p1716c.AbstractC35115b.AbstractC35116a;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.richtext.RichText;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.ss.android.lark.chatthread.c.b */
public interface AbstractC35115b<Value, D extends AbstractC35116a> extends IModel {

    /* renamed from: com.ss.android.lark.chatthread.c.b$a */
    public interface AbstractC35116a {
        /* renamed from: a */
        Context mo129488a();

        /* renamed from: a */
        void mo129489a(String str);

        /* renamed from: a */
        void mo129490a(String str, int i, String str2, boolean z, int[] iArr);

        /* renamed from: a */
        void mo129491a(String str, PushSpeechRecognitionStatus.Status status);
    }

    /* renamed from: a */
    Message mo129415a(Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback iGetDataCallback);

    /* renamed from: a */
    Message mo129416a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo129418a(Context context, String str);

    /* renamed from: a */
    void mo129420a(Message message, String str, String str2, int i);

    /* renamed from: a */
    void mo129421a(Message message, String str, String str2, String str3, int i);

    /* renamed from: a */
    void mo129423a(D d);

    /* renamed from: a */
    void mo129425a(IStickerDependency.StickerFileInfo stickerFileInfo);

    /* renamed from: a */
    void mo129427a(String str, int i);

    /* renamed from: a */
    void mo129431a(String str, RichText richText);

    /* renamed from: a */
    void mo129432a(String str, RichText richText, String str2, RichText richText2);

    /* renamed from: a */
    void mo129434a(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo129435a(String str, String str2, RichText richText);

    /* renamed from: a */
    void mo129436a(String str, String str2, String str3, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo129437a(String str, boolean z);

    /* renamed from: a */
    void mo129439a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

    /* renamed from: a */
    void mo129440a(List<Photo> list, String str, String str2);

    /* renamed from: a */
    void mo129441a(List<String> list, boolean z, String str, String str2);

    /* renamed from: b */
    void mo129444b(IGetDataCallback<Chatter> iGetDataCallback);

    /* renamed from: b */
    void mo129446b(String str, int i);

    /* renamed from: c */
    void mo129452c(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: e */
    void mo129456e(String str);

    /* renamed from: f */
    void mo129458f(String str);

    /* renamed from: g */
    void mo129459g();

    /* renamed from: g */
    void mo129460g(String str);

    /* renamed from: i */
    boolean mo129462i();
}
