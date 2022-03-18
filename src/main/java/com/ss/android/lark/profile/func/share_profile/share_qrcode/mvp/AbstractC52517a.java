package com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp;

import android.graphics.Bitmap;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.a */
public interface AbstractC52517a {

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.a$a */
    public interface AbstractC52518a extends AbstractC52510c.AbstractC52511a {

        /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.a$a$a */
        public interface AbstractC52519a {
            /* renamed from: a */
            void mo179530a(Bitmap bitmap);
        }

        /* renamed from: a */
        void mo179528a(AbstractC52519a aVar);

        /* renamed from: d */
        void mo179529d(IGetDataCallback<Bitmap> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.a$b */
    public interface AbstractC52520b extends AbstractC52510c.AbstractC52512b<AbstractC52521a> {

        /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.mvp.a$b$a */
        public interface AbstractC52521a extends AbstractC52510c.AbstractC52512b.AbstractC52513a {
            /* renamed from: a */
            void mo179531a();
        }
    }
}
