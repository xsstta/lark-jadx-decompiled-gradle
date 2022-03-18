package com.ss.android.lark.collaboration.p1730a;

import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.util.List;

/* renamed from: com.ss.android.lark.collaboration.a.a */
public interface AbstractC35340a {
    /* renamed from: a */
    void mo130063a(Context context, ImageView imageView, String str, String str2, LoadParams loadParams);

    /* renamed from: a */
    void mo130064a(Context context, Contact contact, String str, int i, int i2, C36516a<?> aVar);

    /* renamed from: a */
    void mo130065a(List<String> list, String str, ContactSource contactSource, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    boolean mo130066a(String str, boolean z);
}
