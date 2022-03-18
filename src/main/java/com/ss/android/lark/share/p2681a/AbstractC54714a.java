package com.ss.android.lark.share.p2681a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.share.dto.C54722a;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.lark.share.a.a */
public interface AbstractC54714a {

    /* renamed from: com.ss.android.lark.share.a.a$a */
    public interface AbstractC54715a {
        /* renamed from: a */
        Message mo178400a(String str);

        /* renamed from: a */
        void mo178401a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo178402a(String str, Integer num, Uri uri, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo178403a(String str, Integer num, C54722a aVar, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo178404a(String str, Integer num, RichText richText, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo178405a(String str, Integer num, File file, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo178406a(String str, Integer num, String str2, String str3, String str4, String str5, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo178407a(String str, String str2, String str3, int i, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo178408a(String str, List<String> list, boolean z, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.share.a.a$b */
    public interface AbstractC54716b {
        /* renamed from: a */
        void mo178395a(Context context, CommonShareData commonShareData, boolean z);

        /* renamed from: a */
        void mo178396a(Context context, Message message, ShareModel shareModel);

        /* renamed from: b */
        void mo178397b(Context context, CommonShareData commonShareData, boolean z);
    }

    /* renamed from: com.ss.android.lark.share.a.a$c */
    public interface AbstractC54717c {
        /* renamed from: a */
        boolean mo178398a();

        /* renamed from: b */
        String mo178399b();
    }

    /* renamed from: com.ss.android.lark.share.a.a$d */
    public interface AbstractC54718d {
        /* renamed from: a */
        void mo178412a(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.share.a.a$e */
    public interface AbstractC54719e {
        /* renamed from: a */
        boolean mo178410a(Context context);

        /* renamed from: b */
        void mo178411b(Context context);
    }

    /* renamed from: a */
    Context mo178386a();

    /* renamed from: a */
    void mo178387a(Context context);

    /* renamed from: a */
    void mo178388a(Context context, Intent intent);

    /* renamed from: b */
    boolean mo178389b();

    /* renamed from: c */
    AbstractC54716b mo178390c();

    /* renamed from: d */
    AbstractC54717c mo178391d();

    /* renamed from: e */
    AbstractC54715a mo178392e();

    /* renamed from: f */
    AbstractC54719e mo178393f();

    /* renamed from: g */
    AbstractC54718d mo178394g();
}
