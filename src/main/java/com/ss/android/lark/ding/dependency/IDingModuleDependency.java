package com.ss.android.lark.ding.dependency;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.ding.dto.C36637b;
import com.ss.android.lark.ding.dto.C36638c;
import com.ss.android.lark.ding.p1803a.AbstractC36619a;
import com.ss.android.lark.image.entity.Image;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public interface IDingModuleDependency {

    public interface ISettingDependency {

        @Retention(RetentionPolicy.SOURCE)
        public @interface TimeFormat {
        }

        /* renamed from: a */
        int mo135114a();

        /* renamed from: a */
        void mo135115a(IGetDataCallback<List<String>> iGetDataCallback);

        /* renamed from: a */
        void mo135116a(boolean z);

        /* renamed from: a */
        boolean mo135117a(long j);

        /* renamed from: b */
        boolean mo135118b(boolean z);
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$a */
    public interface AbstractC36623a {
        /* renamed from: a */
        boolean mo135119a(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$b */
    public interface AbstractC36624b {
        /* renamed from: a */
        int mo135120a();

        /* renamed from: a */
        void mo135121a(Context context, String str, DialogInterface.OnDismissListener onDismissListener);

        /* renamed from: b */
        int mo135122b();

        /* renamed from: c */
        String mo135123c();
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$c */
    public interface AbstractC36625c {
        /* renamed from: a */
        IChatParser mo135124a();

        /* renamed from: a */
        MessageInfo mo135125a(String str);

        /* renamed from: a */
        C36637b mo135126a(MergeForwardContent mergeForwardContent);

        /* renamed from: a */
        Image mo135127a(ImageContent imageContent);

        /* renamed from: a */
        CharSequence mo135128a(Context context, Message message, int i);

        /* renamed from: a */
        CharSequence mo135129a(Message message);

        /* renamed from: a */
        String mo135130a(Context context, Message message);

        /* renamed from: a */
        String mo135131a(Chatter chatter);

        /* renamed from: a */
        String mo135132a(Chatter chatter, boolean z);

        /* renamed from: a */
        Map<String, Message> mo135133a(List<String> list);

        /* renamed from: a */
        void mo135134a(Context context, String str, int i, int i2);

        /* renamed from: a */
        void mo135135a(String str, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo135136a(List<String> list, IGetDataCallback<List<Chatter>> iGetDataCallback);

        /* renamed from: b */
        AbstractC32810b mo135137b();

        /* renamed from: b */
        Chat mo135138b(String str);

        /* renamed from: b */
        C36638c mo135139b(Context context, Message message);

        /* renamed from: b */
        Map<String, Chat> mo135140b(List<String> list);

        /* renamed from: c */
        Chatter mo135141c(String str);

        /* renamed from: c */
        void mo135142c();

        /* renamed from: d */
        void mo135143d(String str);
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$d */
    public interface AbstractC36626d {

        /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$d$a */
        public interface AbstractC36627a {
            /* renamed from: a */
            void mo135146a();

            /* renamed from: a */
            void mo135147a(boolean z, String str);

            /* renamed from: b */
            void mo135148b();
        }

        /* renamed from: a */
        void mo135144a(Context context, String str, String str2, String str3, AbstractC36627a aVar);

        /* renamed from: a */
        void mo135145a(Context context, String str, String str2, String str3, String str4, List<Contact> list, AbstractC36627a aVar, int i, C36516a<?> aVar2);
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$e */
    public interface AbstractC36628e {
        /* renamed from: a */
        String mo135149a();

        /* renamed from: b */
        String mo135150b();
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$f */
    public interface AbstractC36629f {
        /* renamed from: a */
        void mo135151a(Context context, ImageView imageView, String str, int i, int i2, Drawable drawable, Drawable drawable2);

        /* renamed from: a */
        void mo135152a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$g */
    public interface AbstractC36630g {
        /* renamed from: a */
        boolean mo135153a();
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$h */
    public interface AbstractC36631h {
        /* renamed from: a */
        String mo135154a();

        /* renamed from: b */
        boolean mo135155b();
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$i */
    public interface AbstractC36632i {
        /* renamed from: a */
        Intent mo135156a(Context context, String str, Bundle bundle);

        /* renamed from: a */
        String mo135157a();
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$j */
    public interface AbstractC36633j {
        /* renamed from: a */
        void mo135158a(IGetDataCallback iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$k */
    public interface AbstractC36634k {
        /* renamed from: a */
        PendingIntent mo135159a(Message message, boolean z, boolean z2);

        /* renamed from: a */
        void mo135160a(String str, String str2, String str3, String str4);

        /* renamed from: a */
        boolean mo135161a(int i);

        /* renamed from: b */
        boolean mo135162b(int i);

        /* renamed from: c */
        String mo135163c(int i);
    }

    /* renamed from: com.ss.android.lark.ding.dependency.IDingModuleDependency$l */
    public interface AbstractC36635l {
        /* renamed from: a */
        void mo135164a(AbstractC36619a aVar);

        /* renamed from: b */
        void mo135165b(AbstractC36619a aVar);
    }

    /* renamed from: a */
    Context mo135096a();

    /* renamed from: b */
    boolean mo135097b();

    /* renamed from: c */
    int mo135098c();

    /* renamed from: d */
    AbstractC36635l mo135099d();

    /* renamed from: e */
    AbstractC36630g mo135100e();

    /* renamed from: f */
    ISettingDependency mo135101f();

    /* renamed from: g */
    AbstractC36631h mo135102g();

    /* renamed from: h */
    AbstractC36629f mo135103h();

    /* renamed from: i */
    AbstractC36625c mo135104i();

    /* renamed from: j */
    AbstractC36634k mo135105j();

    /* renamed from: k */
    AbstractC36632i mo135106k();

    /* renamed from: l */
    AbstractC36633j mo135107l();

    /* renamed from: m */
    AbstractC36628e mo135108m();

    /* renamed from: n */
    AbstractC36623a mo135109n();

    /* renamed from: o */
    boolean mo135110o();

    /* renamed from: p */
    AbstractC36626d mo135111p();

    /* renamed from: q */
    AbstractC36624b mo135112q();

    /* renamed from: r */
    void mo135113r();
}
