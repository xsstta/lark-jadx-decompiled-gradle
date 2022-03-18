package com.ss.android.lark.locationmessage.dependency;

import android.content.Context;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.location.p2146b.AbstractC41561d;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.location.p2146b.AbstractC41569h;
import com.ss.android.lark.locationmessage.C41597c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface IMessageLocationDependency {

    public interface IForwardDependency {

        @Retention(RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ForwardLocation {
        }

        /* renamed from: a */
        void mo143926a(Context context, Message message);
    }

    /* renamed from: com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency$a */
    public interface AbstractC41602a {
        /* renamed from: a */
        void mo143917a(String str, String str2, String str3, LocationContent locationContent, String str4, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency$b */
    public interface AbstractC41603b {
        /* renamed from: a */
        void mo143924a(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);

        /* renamed from: b */
        void mo143925b(List<String> list, IGetDataCallback<List<FavoriteMessageInfo>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency$c */
    public interface AbstractC41604c {
        /* renamed from: a */
        Image mo143920a(com.bytedance.lark.pb.basic.v1.Image image);

        /* renamed from: a */
        Image mo143921a(ImageSet imageSet);

        /* renamed from: a */
        void mo143922a(Context context, ImageView imageView, Image image, LoadParams loadParams);

        /* renamed from: b */
        Image mo143923b(ImageSet imageSet);
    }

    /* renamed from: com.ss.android.lark.locationmessage.dependency.IMessageLocationDependency$d */
    public interface AbstractC41605d {
        /* renamed from: a */
        AbstractC41561d mo143927a();

        /* renamed from: a */
        boolean mo143928a(Context context, C41597c.AbstractC41601a aVar);

        /* renamed from: a */
        double[] mo143929a(double d, double d2);

        /* renamed from: b */
        AbstractC41569h mo143930b();

        /* renamed from: b */
        boolean mo143931b(double d, double d2);

        /* renamed from: c */
        AbstractC41562e mo143932c();
    }

    /* renamed from: a */
    Context mo143908a();

    /* renamed from: b */
    boolean mo143909b();

    /* renamed from: c */
    String mo143910c();

    /* renamed from: d */
    C41597c mo143911d();

    /* renamed from: e */
    AbstractC41602a mo143912e();

    /* renamed from: f */
    AbstractC41604c mo143913f();

    /* renamed from: g */
    AbstractC41603b mo143914g();

    /* renamed from: h */
    IForwardDependency mo143915h();

    /* renamed from: i */
    AbstractC41605d mo143916i();
}
