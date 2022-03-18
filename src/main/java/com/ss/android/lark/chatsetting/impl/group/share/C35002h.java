package com.ss.android.lark.chatsetting.impl.group.share;

import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.share.h */
public class C35002h {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.h$a */
    public interface AbstractC35003a extends IModel {
        /* renamed from: a */
        String mo128990a();

        /* renamed from: b */
        int mo128991b();

        /* renamed from: c */
        Chat mo128992c();

        /* renamed from: d */
        Bundle mo128993d();

        /* renamed from: e */
        boolean mo128994e();

        /* renamed from: f */
        boolean mo128995f();

        /* renamed from: g */
        boolean mo128996g();

        /* renamed from: h */
        boolean mo128997h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.h$b */
    public interface AbstractC35004b extends IView<AbstractC35005a> {

        /* renamed from: com.ss.android.lark.chatsetting.impl.group.share.h$b$a */
        public interface AbstractC35005a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo128952a(int i, int i2, Intent intent);

        /* renamed from: a */
        void mo128955a(String str);

        /* renamed from: a */
        void mo128956a(boolean z, boolean z2, boolean z3, boolean z4, int i, Bundle bundle, Chat chat);

        /* renamed from: b */
        void mo128957b(String str);
    }
}
