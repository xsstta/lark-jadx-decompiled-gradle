package com.ss.android.lark.chatthread.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chatthread.view.AbstractC35205g.AbstractC35206a;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.richtext.RichText;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.ss.android.lark.chatthread.view.g */
public interface AbstractC35205g<T extends AbstractC35206a> extends IView<T> {

    /* renamed from: com.ss.android.lark.chatthread.view.g$a */
    public interface AbstractC35206a extends IView.IViewDelegate {
        /* renamed from: a */
        Message mo129516a(Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback iGetDataCallback);

        /* renamed from: a */
        Message mo129517a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        void mo129518a(Context context, String str);

        /* renamed from: a */
        void mo129519a(Context context, String str, String str2, Message.SourceType sourceType);

        /* renamed from: a */
        void mo129522a(Message message, String str, String str2, int i);

        /* renamed from: a */
        void mo129523a(Message message, String str, String str2, String str3, int i);

        /* renamed from: a */
        void mo129524a(MessageInfo messageInfo);

        /* renamed from: a */
        void mo129525a(IStickerDependency.StickerFileInfo stickerFileInfo);

        /* renamed from: a */
        void mo129526a(String str);

        /* renamed from: a */
        void mo129527a(String str, int i, int i2);

        /* renamed from: a */
        void mo129528a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo129529a(String str, RichText richText);

        /* renamed from: a */
        void mo129530a(String str, RichText richText, String str2, RichText richText2);

        /* renamed from: a */
        void mo129532a(String str, String str2, RichText richText);

        /* renamed from: a */
        void mo129533a(String str, String str2, String str3, Message.SourceType sourceType);

        /* renamed from: a */
        void mo129534a(String str, boolean z);

        /* renamed from: a */
        void mo129535a(List<String> list);

        /* renamed from: a */
        void mo129536a(List<Photo> list, String str, String str2);

        /* renamed from: a */
        void mo129537a(List<String> list, boolean z, String str, String str2);

        /* renamed from: c */
        void mo129543c(String str);

        /* renamed from: d */
        Chatter mo129544d();

        /* renamed from: d */
        void mo129545d(String str);

        /* renamed from: e */
        Chat mo129546e();

        /* renamed from: h */
        void mo129550h(String str);
    }

    /* renamed from: com.ss.android.lark.chatthread.view.g$b */
    public interface AbstractC35207b<T extends AbstractC35205g> {
        /* renamed from: a */
        Fragment mo129329a();

        /* renamed from: a */
        void mo129332a(T t);

        /* renamed from: a */
        void mo129333a(C58557a.C58559a aVar);

        /* renamed from: a */
        void mo129334a(C58633e.C58634a aVar);

        /* renamed from: a */
        void mo129335a(String str);

        /* renamed from: a */
        void mo129336a(boolean z, String str, int i, List<PhotoItem> list, View view, boolean z2);
    }

    /* renamed from: a */
    void mo129577a(String str, int i, String str2, boolean z, int[] iArr, boolean z2);

    /* renamed from: a */
    void mo129578a(String str, PushSpeechRecognitionStatus.Status status);

    /* renamed from: a */
    boolean mo129580a(int i, int i2, Intent intent);

    /* renamed from: q */
    void mo129592q();

    /* renamed from: q */
    void mo129593q(String str);

    /* renamed from: r */
    void mo129594r();

    /* renamed from: s */
    boolean mo129595s();

    /* renamed from: t */
    void mo129596t(String str);
}
