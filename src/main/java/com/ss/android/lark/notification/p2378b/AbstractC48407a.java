package com.ss.android.lark.notification.p2378b;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.notification.dto.C48444c;
import com.ss.android.lark.notification.dto.NotificationSettingItem;
import com.ss.android.lark.notification.dto.NotificationSettingV2;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48566a;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48567b;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48568c;
import com.ss.android.lark.notification.setting.p2388a.p2389a.AbstractC48569d;
import java.util.Map;

/* renamed from: com.ss.android.lark.notification.b.a */
public interface AbstractC48407a {

    /* renamed from: com.ss.android.lark.notification.b.a$a */
    public interface AbstractC48408a {

        /* renamed from: com.ss.android.lark.notification.b.a$a$a */
        public interface AbstractC48409a {
            /* renamed from: a */
            void mo169359a(boolean z);
        }

        /* renamed from: a */
        void mo169357a(AbstractC48409a aVar);

        /* renamed from: a */
        boolean mo169358a();
    }

    /* renamed from: com.ss.android.lark.notification.b.a$b */
    public interface AbstractC48410b {
        /* renamed from: a */
        int mo169360a();

        /* renamed from: a */
        void mo169361a(Notification notification, int i);

        /* renamed from: a */
        void mo169362a(Context context, int i);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$c */
    public interface AbstractC48411c {
        /* renamed from: a */
        void mo169363a(Context context, String str);

        /* renamed from: a */
        void mo169364a(Context context, String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$d */
    public interface AbstractC48412d {
        void inject(Bundle bundle);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$e */
    public interface AbstractC48413e {
        /* renamed from: a */
        Intent mo169366a(String str);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$f */
    public interface AbstractC48414f {
        /* renamed from: a */
        Bundle mo169367a(Bundle bundle);

        /* renamed from: a */
        Bundle mo169368a(String str, int i, AbstractC48412d dVar);

        /* renamed from: a */
        Bundle mo169369a(String str, boolean z, String str2, String str3, AbstractC48412d dVar);

        /* renamed from: a */
        String mo169370a();

        /* renamed from: a */
        void mo169371a(Bundle bundle, String str, int i);

        /* renamed from: b */
        String mo169372b();
    }

    /* renamed from: com.ss.android.lark.notification.b.a$h */
    public interface AbstractC48419h {
        /* renamed from: a */
        Intent mo169384a(String str);

        /* renamed from: a */
        Intent mo169385a(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$i */
    public interface AbstractC48420i {
        /* renamed from: a */
        boolean mo169386a(String str);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$j */
    public interface AbstractC48421j {
        /* renamed from: a */
        Bundle mo169387a(Bundle bundle);

        /* renamed from: a */
        String mo169388a();

        /* renamed from: b */
        String mo169389b();
    }

    /* renamed from: com.ss.android.lark.notification.b.a$k */
    public interface AbstractC48422k {

        /* renamed from: com.ss.android.lark.notification.b.a$k$a */
        public interface AbstractC48423a {
            /* renamed from: a */
            void mo169393a(String str);
        }

        /* renamed from: a */
        String mo169390a();

        /* renamed from: a */
        void mo169391a(AbstractC48423a aVar);

        /* renamed from: b */
        boolean mo169392b();
    }

    /* renamed from: com.ss.android.lark.notification.b.a$l */
    public interface AbstractC48424l {
        /* renamed from: a */
        Intent mo169394a(String str);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$m */
    public interface AbstractC48425m {
        /* renamed from: a */
        Intent mo169395a(Context context, Bundle bundle, int i);

        /* renamed from: a */
        Intent mo169396a(Context context, String str, Bundle bundle);

        /* renamed from: a */
        Bundle mo169397a(Bundle bundle);

        /* renamed from: b */
        Bundle mo169398b(Bundle bundle);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$n */
    public interface AbstractC48426n {
        /* renamed from: a */
        Intent mo169399a(String str, String str2, String str3, int i);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$o */
    public interface AbstractC48427o {
        /* renamed from: a */
        NotificationSettingItem mo169400a(String str);

        /* renamed from: a */
        void mo169401a(long j, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo169402a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo169403a(NotificationSettingV2 notificationSettingV2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo169404a(AbstractC48566a aVar);

        /* renamed from: a */
        void mo169405a(AbstractC48567b bVar);

        /* renamed from: a */
        void mo169406a(AbstractC48568c cVar);

        /* renamed from: a */
        void mo169407a(AbstractC48569d dVar);

        /* renamed from: a */
        void mo169408a(String str, NotificationSettingItem notificationSettingItem);

        /* renamed from: a */
        void mo169409a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo169410a();

        /* renamed from: a */
        boolean mo169411a(boolean z);

        /* renamed from: b */
        void mo169412b(IGetDataCallback<NotificationSettingV2> iGetDataCallback);

        /* renamed from: b */
        void mo169413b(AbstractC48566a aVar);

        /* renamed from: b */
        void mo169414b(AbstractC48567b bVar);

        /* renamed from: b */
        void mo169415b(AbstractC48568c cVar);

        /* renamed from: b */
        void mo169416b(AbstractC48569d dVar);

        /* renamed from: b */
        void mo169417b(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        boolean mo169418b();

        /* renamed from: c */
        void mo169419c(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        void mo169420c(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        boolean mo169421c();

        /* renamed from: d */
        void mo169422d(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: d */
        boolean mo169423d();

        /* renamed from: e */
        boolean mo169424e();

        /* renamed from: f */
        boolean mo169425f();

        /* renamed from: g */
        C48444c mo169426g();

        /* renamed from: h */
        boolean mo169427h();

        /* renamed from: i */
        boolean mo169428i();

        /* renamed from: j */
        String mo169429j();
    }

    /* renamed from: com.ss.android.lark.notification.b.a$p */
    public interface AbstractC48428p {
        Intent getLaunchTodoTransPageIntent(String str);
    }

    /* renamed from: com.ss.android.lark.notification.b.a$q */
    public interface AbstractC48429q {

        /* renamed from: com.ss.android.lark.notification.b.a$q$a */
        public interface AbstractC48430a {
            /* renamed from: a */
            void mo169435a(Map<String, Integer> map);
        }

        /* renamed from: com.ss.android.lark.notification.b.a$q$b */
        public interface AbstractC48431b {
            /* renamed from: a */
            void mo169436a(boolean z);
        }

        /* renamed from: a */
        void mo169431a(IGetDataCallback<Map<String, Integer>> iGetDataCallback);

        /* renamed from: a */
        void mo169432a(AbstractC48430a aVar);

        /* renamed from: a */
        void mo169433a(AbstractC48431b bVar);

        /* renamed from: a */
        boolean mo169434a();
    }

    /* renamed from: a */
    Context mo169335a();

    /* renamed from: a */
    String mo169336a(String str);

    /* renamed from: a */
    void mo169337a(Context context, OfflineNotice offlineNotice);

    /* renamed from: a */
    void mo169338a(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: b */
    AbstractC48408a mo169339b();

    /* renamed from: c */
    AbstractC48425m mo169340c();

    /* renamed from: d */
    AbstractC48427o mo169341d();

    /* renamed from: e */
    AbstractC48429q mo169342e();

    /* renamed from: f */
    AbstractC48414f mo169343f();

    /* renamed from: g */
    AbstractC48421j mo169344g();

    /* renamed from: h */
    AbstractC48422k mo169345h();

    /* renamed from: i */
    AbstractC48419h mo169346i();

    /* renamed from: j */
    AbstractC48426n mo169347j();

    /* renamed from: k */
    AbstractC48413e mo169348k();

    /* renamed from: l */
    AbstractC48428p mo169349l();

    /* renamed from: m */
    AbstractC48415g mo169350m();

    /* renamed from: n */
    AbstractC48424l mo169351n();

    /* renamed from: o */
    AbstractC48420i mo169352o();

    /* renamed from: p */
    AbstractC48411c mo169353p();

    /* renamed from: q */
    void mo169354q();

    /* renamed from: r */
    boolean mo169355r();

    /* renamed from: s */
    AbstractC48410b mo169356s();

    /* renamed from: com.ss.android.lark.notification.b.a$g */
    public interface AbstractC48415g {

        /* renamed from: com.ss.android.lark.notification.b.a$g$b */
        public interface AbstractC48417b {
            /* renamed from: a */
            void mo169382a(boolean z);
        }

        /* renamed from: com.ss.android.lark.notification.b.a$g$c */
        public interface AbstractC48418c {
            /* renamed from: a */
            void mo169383a();
        }

        /* renamed from: a */
        C48416a mo169373a();

        /* renamed from: a */
        void mo169374a(AbstractC48417b bVar);

        /* renamed from: a */
        void mo169375a(AbstractC48418c cVar);

        /* renamed from: a */
        void mo169376a(boolean z);

        /* renamed from: a */
        void mo169377a(boolean z, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo169378b(boolean z);

        /* renamed from: b */
        void mo169379b(boolean z, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        boolean mo169380b();

        /* renamed from: c */
        boolean mo169381c();

        /* renamed from: com.ss.android.lark.notification.b.a$g$a */
        public static class C48416a {

            /* renamed from: a */
            public boolean f121884a;

            /* renamed from: b */
            public boolean f121885b;

            public C48416a(boolean z, boolean z2) {
                this.f121884a = z;
                this.f121885b = z2;
            }
        }
    }
}
