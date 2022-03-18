package com.ss.android.lark.pin.p2466a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.p1665e.AbstractC33988a;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.image.transform.CropTransformation;
import com.ss.android.lark.pin.dto.C51487b;
import com.ss.android.lark.pin.dto.C51488f;
import com.ss.android.lark.pin.dto.ChatPinMessageEntity;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.pin.a.a */
public interface AbstractC51472a {

    /* renamed from: com.ss.android.lark.pin.a.a$a */
    public interface AbstractC51473a {
        /* renamed from: a */
        void mo144052a(String str);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$b */
    public interface AbstractC51474b {

        /* renamed from: com.ss.android.lark.pin.a.a$b$a */
        public interface AbstractC51475a {
            /* renamed from: a */
            void mo177255a();

            /* renamed from: a */
            void mo177256a(C51488f fVar);
        }

        /* renamed from: a */
        Chatter mo144058a(String str);

        /* renamed from: a */
        C33982a mo144059a(C14928Entity entity, String str);

        /* renamed from: a */
        Image mo144060a(ImageContent imageContent);

        /* renamed from: a */
        Image mo144061a(MediaContent mediaContent);

        /* renamed from: a */
        C51487b mo144062a(MergeForwardContent mergeForwardContent);

        /* renamed from: a */
        String mo144063a(Chatter chatter);

        /* renamed from: a */
        List<Message> mo144064a(C14928Entity entity, List<String> list);

        /* renamed from: a */
        void mo144066a(Activity activity, MergeForwardContent mergeForwardContent, int i, String str);

        /* renamed from: a */
        void mo144067a(Context context, View view, Message message);

        /* renamed from: a */
        void mo144068a(Context context, TextView textView, Message message);

        /* renamed from: a */
        void mo144069a(Context context, Message message);

        /* renamed from: a */
        void mo144070a(Context context, String str, int i);

        /* renamed from: a */
        void mo144071a(Context context, String str, int i, boolean z);

        /* renamed from: a */
        void mo144072a(Context context, String str, Message message);

        /* renamed from: a */
        void mo144073a(Context context, String str, String str2);

        /* renamed from: a */
        void mo144074a(Message message, boolean z);

        /* renamed from: a */
        void mo144075a(RichText richText, AbstractC51475a aVar);

        /* renamed from: a */
        void mo144076a(RichTextView richTextView, boolean z);

        /* renamed from: a */
        void mo144077a(boolean z);

        /* renamed from: a */
        boolean mo144078a();

        /* renamed from: b */
        Chat mo144079b(String str);

        /* renamed from: b */
        CharSequence mo144080b(Context context, Message message);

        /* renamed from: c */
        Chatter mo144081c(String str);

        /* renamed from: d */
        Chat mo144082d(String str);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$c */
    public interface AbstractC51476c {
        /* renamed from: a */
        boolean mo144053a(Chat chat);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$d */
    public interface AbstractC51477d {
        /* renamed from: a */
        int mo144085a(int i, boolean z);

        /* renamed from: a */
        int mo144086a(DocType docType, String str);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$e */
    public interface AbstractC51478e {
        /* renamed from: a */
        void mo144056a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$f */
    public interface AbstractC51479f {
        /* renamed from: a */
        void mo144048a(String str, boolean z);

        /* renamed from: a */
        boolean mo144049a(String str);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$g */
    public interface AbstractC51480g {
        /* renamed from: a */
        void mo144054a(Context context, ImageView imageView, Image image, String str, int i, int i2, Drawable drawable, Drawable drawable2, boolean z, boolean z2, CropTransformation cropTransformation);

        /* renamed from: a */
        void mo144055a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$h */
    public interface AbstractC51481h {
        /* renamed from: a */
        void mo144051a();
    }

    /* renamed from: com.ss.android.lark.pin.a.a$i */
    public interface AbstractC51482i {

        /* renamed from: com.ss.android.lark.pin.a.a$i$a */
        public interface AbstractC51483a {
            void onPushMessage(MessageInfo messageInfo);
        }

        /* renamed from: a */
        void mo144043a(String str, String str2, AbstractC51483a aVar);

        /* renamed from: b */
        void mo144044b(String str, String str2, AbstractC51483a aVar);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$j */
    public interface AbstractC51484j {
        /* renamed from: a */
        void mo144046a(String str, String str2, long j, String str3, int i, IGetDataCallback<ChatPinMessageEntity> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$k */
    public interface AbstractC51485k {
        /* renamed from: a */
        void mo144050a(Context context, Message message);
    }

    /* renamed from: com.ss.android.lark.pin.a.a$l */
    public interface AbstractC51486l {
        /* renamed from: a */
        <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo144057a(Context context, AbstractC33988a<T> aVar);
    }

    /* renamed from: a */
    <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo144016a(Context context, AbstractC33988a<T> aVar);

    /* renamed from: a */
    void mo144017a(Context context, Message message);

    /* renamed from: a */
    void mo144018a(Context context, Message message, LocationContent locationContent);

    /* renamed from: a */
    void mo144019a(Context context, String str);

    /* renamed from: a */
    void mo144020a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4);

    /* renamed from: a */
    void mo144021a(View view, AbbreviationInfo abbreviationInfo, float f, float f2);

    /* renamed from: a */
    void mo144022a(String str, Activity activity);

    /* renamed from: a */
    boolean mo144023a();

    /* renamed from: a */
    boolean mo144024a(Context context, String str, int i);

    /* renamed from: b */
    void mo144025b();

    /* renamed from: b */
    void mo144026b(Context context, Message message);

    /* renamed from: b */
    void mo144027b(Context context, String str);

    /* renamed from: c */
    AbstractC51482i mo144028c();

    /* renamed from: c */
    void mo144029c(Context context, Message message);

    /* renamed from: d */
    boolean mo144030d();

    /* renamed from: e */
    String mo144031e();

    /* renamed from: f */
    AbstractC51480g mo144032f();

    /* renamed from: g */
    AbstractC51478e mo144033g();

    /* renamed from: h */
    AbstractC51486l mo144034h();

    /* renamed from: i */
    AbstractC51474b mo144035i();

    /* renamed from: j */
    AbstractC51477d mo144036j();

    /* renamed from: k */
    AbstractC51484j mo144037k();

    /* renamed from: l */
    AbstractC51479f mo144038l();

    /* renamed from: m */
    AbstractC51485k mo144039m();

    /* renamed from: n */
    AbstractC51481h mo144040n();

    /* renamed from: o */
    AbstractC51473a mo144041o();

    /* renamed from: p */
    AbstractC51476c mo144042p();
}
