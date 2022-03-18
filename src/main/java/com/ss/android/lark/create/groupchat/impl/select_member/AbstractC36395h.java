package com.ss.android.lark.create.groupchat.impl.select_member;

import android.content.Intent;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.h */
public interface AbstractC36395h {

    /* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.h$a */
    public interface AbstractC36396a extends IModel {
        /* renamed from: a */
        List<C36391e> mo134177a();

        /* renamed from: b */
        GroupCreateInfo mo134178b();
    }

    /* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.h$b */
    public interface AbstractC36397b extends IView<AbstractC36398a> {

        /* renamed from: com.ss.android.lark.create.groupchat.impl.select_member.h$b$a */
        public interface AbstractC36398a extends IView.IViewDelegate {
        }

        /* renamed from: a */
        void mo134156a();

        /* renamed from: a */
        void mo134158a(int i, int i2, Intent intent);

        /* renamed from: a */
        void mo134162a(List<C36391e> list, GroupCreateInfo groupCreateInfo);

        /* renamed from: b */
        void mo134163b();
    }
}
