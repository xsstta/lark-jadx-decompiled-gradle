package com.ss.android.lark.leanmode.p2120b;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.leanmode.AbstractC41239a;
import com.ss.android.lark.leanmode.dto.C41262a;

/* renamed from: com.ss.android.lark.leanmode.b.a */
public interface AbstractC41243a {

    /* renamed from: com.ss.android.lark.leanmode.b.a$a */
    public interface AbstractC41244a {

        /* renamed from: com.ss.android.lark.leanmode.b.a$a$a */
        public interface AbstractC41245a {
            void onAppStateChange(boolean z);
        }

        /* renamed from: a */
        void mo143884a(AbstractC41245a aVar);

        /* renamed from: b */
        void mo143885b(AbstractC41245a aVar);
    }

    /* renamed from: com.ss.android.lark.leanmode.b.a$b */
    public interface AbstractC41246b {
        void onResult(String str);
    }

    /* renamed from: com.ss.android.lark.leanmode.b.a$c */
    public interface AbstractC41247c {
        void onResult(boolean z);
    }

    /* renamed from: a */
    Context mo143867a();

    /* renamed from: a */
    void mo143868a(Context context, String str, String str2, ImageView imageView);

    /* renamed from: a */
    void mo143869a(Context context, String str, String str2, AbstractC41246b bVar);

    /* renamed from: a */
    void mo143870a(AbstractC41239a aVar);

    /* renamed from: a */
    void mo143871a(AbstractC41247c cVar);

    /* renamed from: a */
    void mo143872a(C41262a aVar);

    /* renamed from: a */
    void mo143873a(boolean z, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo143874a(String str);

    /* renamed from: b */
    Activity mo143875b();

    /* renamed from: b */
    void mo143876b(AbstractC41239a aVar);

    /* renamed from: c */
    void mo143877c();

    /* renamed from: d */
    String mo143878d();

    /* renamed from: e */
    String mo143879e();

    /* renamed from: f */
    String mo143880f();

    /* renamed from: g */
    boolean mo143881g();

    /* renamed from: h */
    AbstractC41244a mo143882h();
}
