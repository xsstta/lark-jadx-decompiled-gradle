package com.ss.android.lark.chatsetting.impl.group.avatar.mvp;

import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import java.util.List;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.d */
public interface AbstractC34597d {

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.d$a */
    public interface AbstractC34598a extends IModel {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.d$a$a */
        public interface AbstractC34599a {
        }

        /* renamed from: a */
        int mo127810a(int i);

        /* renamed from: a */
        void mo127760a(IGetDataCallback<AvatarMeta> iGetDataCallback);

        /* renamed from: b */
        void mo127814b(IGetDataCallback<List<String>> iGetDataCallback);

        /* renamed from: c */
        int[] mo127815c();
    }

    /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.d$b */
    public interface AbstractC34600b extends IView<AbstractC34601a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.mvp.d$b$a */
        public interface AbstractC34601a extends IView.IViewDelegate {
            /* renamed from: a */
            int mo127806a(int i);

            /* renamed from: a */
            void mo127752a(Context context, Bitmap bitmap, AvatarMeta avatarMeta);

            /* renamed from: a */
            void mo127753a(String str, AvatarMeta avatarMeta);

            /* renamed from: f */
            int[] mo127807f();

            /* renamed from: g */
            void mo127808g();
        }

        /* renamed from: a */
        void mo127794a(int i, String str, AvatarMeta.Type type);

        /* renamed from: a */
        void mo127796a(String str);

        /* renamed from: a */
        void mo127797a(List<String> list);

        /* renamed from: b */
        void mo127798b(String str);

        /* renamed from: d */
        void mo127799d();

        /* renamed from: e */
        void mo127800e();
    }
}
