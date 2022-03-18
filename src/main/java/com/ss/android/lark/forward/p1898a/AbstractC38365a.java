package com.ss.android.lark.forward.p1898a;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.im.v1.BatchTransmitResponse;
import com.bytedance.lark.pb.im.v1.MergeForwardMessagesResponse;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget;
import com.bytedance.lark.pb.im.v1.TransmitResponse;
import com.bytedance.lark.pb.im.v1.TransmitTarget;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ShareDataForwardData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.forward.dto.C38389a;
import com.ss.android.lark.forward.dto.CalendarForwardData;
import com.ss.android.lark.forward.dto.CardLink;
import com.ss.android.lark.forward.dto.StickImage;
import com.ss.android.lark.image.entity.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.ss.android.lark.forward.a.a */
public interface AbstractC38365a {

    /* renamed from: com.ss.android.lark.forward.a.a$a */
    public interface AbstractC38366a {
        /* renamed from: a */
        boolean mo140456a();

        /* renamed from: b */
        String mo140457b();
    }

    /* renamed from: com.ss.android.lark.forward.a.a$b */
    public interface AbstractC38367b {
        /* renamed from: a */
        Intent mo140458a(ArrayList<String> arrayList, boolean z);

        /* renamed from: a */
        Content mo140459a(CalendarForwardData calendarForwardData);

        /* renamed from: a */
        void mo140460a();

        /* renamed from: a */
        void mo140461a(TextView textView, TextView textView2, GifImageView gifImageView, Content content);

        /* renamed from: a */
        void mo140462a(CalendarForwardData calendarForwardData, String str, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo140463a(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        boolean mo140464a(Message message);

        /* renamed from: b */
        int mo140465b();

        /* renamed from: c */
        void mo140466c();

        /* renamed from: d */
        boolean mo140467d();
    }

    /* renamed from: com.ss.android.lark.forward.a.a$c */
    public interface AbstractC38368c {
        /* renamed from: a */
        int mo140468a();

        /* renamed from: a */
        Chat mo140469a(String str);

        /* renamed from: a */
        Image mo140470a(ImageContent imageContent);

        /* renamed from: a */
        Image mo140471a(MediaContent mediaContent);

        /* renamed from: a */
        String mo140472a(Chat chat);

        /* renamed from: a */
        String mo140473a(Message message);

        /* renamed from: a */
        Map<String, Chat> mo140474a(List<String> list);

        /* renamed from: a */
        void mo140475a(Context context, String str, List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo140476a(Context context, String str, boolean z);

        /* renamed from: a */
        void mo140477a(ShareObject shareObject, List<ShareTarget> list, IGetDataCallback<ShareAsMessageResponse> iGetDataCallback);

        /* renamed from: a */
        void mo140478a(String str, Message message, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo140479a(String str, String str2, Chat chat, String str3, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo140480a(String str, String str2, String str3);

        /* renamed from: a */
        void mo140481a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo140482a(String str, String str2, List<String> list, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo140483a(String str, String str2, Map<String, String> map, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo140484a(List<String> list, int i, String str, CardLink cardLink, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo140485a(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback);

        /* renamed from: a */
        void mo140486a(List<String> list, String str, List<Transmit2ThreadTarget> list2, String str2, IGetDataCallback<TransmitResponse> iGetDataCallback);

        /* renamed from: a */
        void mo140487a(List<String> list, List<String> list2, Content content, boolean z, boolean z2, String str, boolean z3, String str2, List<Transmit2ThreadTarget> list3, IGetDataCallback<MergeForwardMessagesResponse> iGetDataCallback);

        /* renamed from: a */
        void mo140488a(List<String> list, List<TransmitTarget> list2, String str, IGetDataCallback<BatchTransmitResponse> iGetDataCallback);

        /* renamed from: b */
        Chat mo140489b(String str);

        /* renamed from: b */
        String mo140490b();

        /* renamed from: b */
        Map<String, Message> mo140491b(List<String> list);

        /* renamed from: b */
        void mo140492b(List<String> list, IGetDataCallback<Map<String, ? extends OpenChat>> iGetDataCallback);

        /* renamed from: c */
        int mo140493c();

        /* renamed from: c */
        Chatter mo140494c(String str);

        /* renamed from: c */
        Map<String, Chatter> mo140495c(List<String> list);

        /* renamed from: d */
        int mo140496d();

        /* renamed from: d */
        String mo140497d(String str);

        /* renamed from: d */
        Map<String, Chat> mo140498d(List<String> list);

        /* renamed from: e */
        Chat mo140499e(String str);

        /* renamed from: f */
        void mo140500f(String str);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$d */
    public interface AbstractC38369d {
        /* renamed from: a */
        Map<String, Integer> mo140501a(Map<String, String> map);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$e */
    public interface AbstractC38370e {
        /* renamed from: a */
        String mo140502a();

        /* renamed from: a */
        void mo140503a(C36516a aVar, int i);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$f */
    public interface AbstractC38371f {
        /* renamed from: a */
        List<C38389a> mo140504a();
    }

    /* renamed from: com.ss.android.lark.forward.a.a$g */
    public interface AbstractC38372g {
        /* renamed from: a */
        void mo140505a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$h */
    public interface AbstractC38373h {
        /* renamed from: a */
        Locale mo140506a();

        /* renamed from: b */
        Locale mo140507b();
    }

    /* renamed from: com.ss.android.lark.forward.a.a$i */
    public interface AbstractC38374i {
        void shareMomentsPost(List<String> list, String str, int i, String str2, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$j */
    public interface AbstractC38375j {
        /* renamed from: a */
        void mo140509a(Context context, String str, String str2, CardContent cardContent, boolean z, AbstractC38377l lVar);

        /* renamed from: a */
        void mo140510a(Context context, List<String> list, CardContent cardContent, boolean z, AbstractC38377l lVar);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$k */
    public interface AbstractC38376k {
        /* renamed from: a */
        String mo140511a(String str, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$l */
    public interface AbstractC38377l {
        /* renamed from: a */
        void mo140512a(boolean z, boolean z2, String str);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$m */
    public interface AbstractC38378m {
        /* renamed from: a */
        boolean mo140513a(long j);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$n */
    public interface AbstractC38379n {
        /* renamed from: a */
        void mo140514a(ShareDataForwardData shareDataForwardData, int i);

        /* renamed from: a */
        void mo140515a(Chat chat, ShareDataForwardData shareDataForwardData);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$o */
    public interface AbstractC38380o {
        /* renamed from: a */
        int mo140516a();

        /* renamed from: a */
        Intent mo140517a(ArrayList<String> arrayList, String str, String str2);

        /* renamed from: a */
        void mo140518a(TextView textView, TextView textView2, GifImageView gifImageView, Content content);

        /* renamed from: a */
        void mo140519a(TextView textView, TextView textView2, GifImageView gifImageView, String str);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$p */
    public interface AbstractC38381p {
        /* renamed from: a */
        void mo140520a(TextView textView, TextView textView2, ImageView imageView, Content content);

        /* renamed from: a */
        void mo140521a(ErrorResult errorResult, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.forward.a.a$q */
    public static class C38382q {

        /* renamed from: a */
        public String f98603a;

        /* renamed from: b */
        public String f98604b;
    }

    /* renamed from: a */
    Context mo140434a();

    /* renamed from: a */
    void mo140435a(Dialog dialog);

    /* renamed from: a */
    void mo140436a(Context context, ImageView imageView, StickImage stickImage);

    /* renamed from: a */
    void mo140437a(Context context, String str, String str2, Bundle bundle);

    /* renamed from: a */
    void mo140438a(String str, List<String> list, List<C38382q> list2, IGetDataCallback<Map<String, String>> iGetDataCallback);

    /* renamed from: a */
    boolean mo140439a(String str);

    /* renamed from: b */
    void mo140440b();

    /* renamed from: c */
    AbstractC38373h mo140441c();

    /* renamed from: d */
    AbstractC38368c mo140442d();

    /* renamed from: e */
    AbstractC38371f mo140443e();

    /* renamed from: f */
    AbstractC38372g mo140444f();

    /* renamed from: g */
    AbstractC38366a mo140445g();

    /* renamed from: h */
    AbstractC38367b mo140446h();

    /* renamed from: i */
    AbstractC38380o mo140447i();

    /* renamed from: j */
    AbstractC38374i mo140448j();

    /* renamed from: k */
    AbstractC38370e mo140449k();

    /* renamed from: l */
    AbstractC38378m mo140450l();

    /* renamed from: m */
    AbstractC38379n mo140451m();

    /* renamed from: n */
    AbstractC38369d mo140452n();

    /* renamed from: o */
    AbstractC38375j mo140453o();

    /* renamed from: p */
    AbstractC38376k mo140454p();

    /* renamed from: q */
    AbstractC38381p mo140455q();
}
