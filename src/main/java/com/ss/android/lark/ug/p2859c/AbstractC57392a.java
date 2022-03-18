package com.ss.android.lark.ug.p2859c;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.larksuite.framework.callback.IGetDataCallback;
import io.reactivex.AbstractC69009q;

/* renamed from: com.ss.android.lark.ug.c.a */
public interface AbstractC57392a {

    /* renamed from: com.ss.android.lark.ug.c.a$a */
    public interface AbstractC57393a {
        /* renamed from: a */
        boolean mo194677a(String str);

        /* renamed from: b */
        void mo194678b(String str);
    }

    /* renamed from: com.ss.android.lark.ug.c.a$b */
    public interface AbstractC57394b {
        /* renamed from: a */
        void mo194679a(AbstractC69009q<Pair<Activity, String>> qVar);

        /* renamed from: a */
        void mo194680a(boolean z);
    }

    /* renamed from: com.ss.android.lark.ug.c.a$c */
    public interface AbstractC57395c {
        /* renamed from: a */
        void mo194681a(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    /* renamed from: a */
    Fragment mo194661a(String str, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2);

    /* renamed from: a */
    String mo194662a();

    /* renamed from: a */
    String mo194663a(DomainSettings.Alias alias);

    /* renamed from: a */
    String mo194664a(String str);

    /* renamed from: a */
    void mo194665a(Context context);

    /* renamed from: a */
    void mo194666a(Context context, String str, String str2);

    /* renamed from: a */
    void mo194667a(String str, Bundle bundle);

    /* renamed from: b */
    String mo194668b();

    /* renamed from: b */
    void mo194669b(String str);

    /* renamed from: b */
    boolean mo194670b(Context context);

    /* renamed from: c */
    String mo194671c();

    /* renamed from: d */
    Context mo194672d();

    /* renamed from: e */
    Activity mo194673e();

    /* renamed from: f */
    AbstractC57394b mo194674f();

    /* renamed from: g */
    AbstractC57395c mo194675g();

    /* renamed from: h */
    AbstractC57393a mo194676h();
}
