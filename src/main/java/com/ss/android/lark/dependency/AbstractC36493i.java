package com.ss.android.lark.dependency;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.dependency.i */
public interface AbstractC36493i {

    /* renamed from: com.ss.android.lark.dependency.i$a */
    public interface AbstractC36494a {
        /* renamed from: a */
        void mo134653a();

        /* renamed from: a */
        void mo134654a(boolean z, String str);

        /* renamed from: b */
        void mo134655b();
    }

    /* renamed from: a */
    UserRelationResponse mo134645a(String str);

    /* renamed from: a */
    void mo134646a(Context context, String str, int i);

    /* renamed from: a */
    void mo134647a(Context context, String str, String str2, ArrayList<Contact> arrayList, AbstractC36494a aVar);

    /* renamed from: a */
    void mo134648a(String str, IGetDataCallback<UserRelationResponse> iGetDataCallback);

    /* renamed from: b */
    void mo134649b(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: c */
    void mo134650c(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: d */
    void mo134651d(String str, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: e */
    void mo134652e(String str, IGetDataCallback<Boolean> iGetDataCallback);
}
