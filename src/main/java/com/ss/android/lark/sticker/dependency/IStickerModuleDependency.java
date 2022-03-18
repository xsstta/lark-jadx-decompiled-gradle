package com.ss.android.lark.sticker.dependency;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.StickerSetDownloadState;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.sticker.dto.C55077c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

public interface IStickerModuleDependency {

    public interface IForwardDependency {

        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ForwardLocation {
        }

        /* renamed from: a */
        void mo144109a(Activity activity, String str);

        /* renamed from: a */
        void mo144110a(Context context, Message message, String str, String str2);

        /* renamed from: b */
        void mo144111b(Activity activity, String str);
    }

    /* renamed from: com.ss.android.lark.sticker.dependency.IStickerModuleDependency$a */
    public interface AbstractC55070a {
        /* renamed from: a */
        boolean mo144120a(long j, long j2, String str);
    }

    /* renamed from: com.ss.android.lark.sticker.dependency.IStickerModuleDependency$b */
    public interface AbstractC55071b {
        /* renamed from: a */
        void mo144112a(AbstractC29579a aVar);

        /* renamed from: a */
        void mo144113a(AbstractC29580b bVar);

        /* renamed from: a */
        void mo144114a(String str, String str2, String str3);

        /* renamed from: a */
        void mo144115a(List<String> list, String str, IGetDataCallback<StickerSetDownloadState> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.sticker.dependency.IStickerModuleDependency$c */
    public interface AbstractC55072c {
        /* renamed from: a */
        int mo144117a();

        /* renamed from: a */
        void mo144118a(Context context, String str);

        /* renamed from: b */
        String mo144119b();
    }

    /* renamed from: com.ss.android.lark.sticker.dependency.IStickerModuleDependency$d */
    public interface AbstractC55073d {
        /* renamed from: a */
        void mo144116a(Context context, ImageView imageView, String str, LoadParams loadParams);
    }

    /* renamed from: com.ss.android.lark.sticker.dependency.IStickerModuleDependency$e */
    public interface AbstractC55074e {
        /* renamed from: a */
        Map<String, C55077c> mo144104a(String str, List<String> list);

        /* renamed from: a */
        void mo144106a(String str, List<String> list, IGetDataCallback<Map<String, C55077c>> iGetDataCallback);

        /* renamed from: b */
        Map<String, C55077c> mo144107b(String str, List<String> list);
    }

    /* renamed from: a */
    Context mo144097a();

    /* renamed from: b */
    AbstractC55074e mo144098b();

    /* renamed from: c */
    IForwardDependency mo144099c();

    /* renamed from: d */
    AbstractC55071b mo144100d();

    /* renamed from: e */
    AbstractC55073d mo144101e();

    /* renamed from: f */
    AbstractC55072c mo144102f();

    /* renamed from: g */
    AbstractC55070a mo144103g();
}
