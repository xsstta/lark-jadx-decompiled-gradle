package com.ss.android.lark.mail.impl.home.menu.label;

import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.menu.C42585j;

/* renamed from: com.ss.android.lark.mail.impl.home.menu.label.a */
public class C42589a extends C42585j {

    /* renamed from: g */
    public MailLabelEntity f108382g;

    public C42589a(int i, MailLabelEntity mailLabelEntity) {
        super(i, mailLabelEntity.mo151528l(), mailLabelEntity.mo151500b(), mailLabelEntity.mo151510d());
        int i2;
        this.f108382g = mailLabelEntity;
        if (mailLabelEntity.mo151529m()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        this.f108369e = i2;
        if ("OTHER".equals(mailLabelEntity.mo151527k())) {
            this.f108368d = true;
        } else {
            this.f108368d = false;
        }
    }
}
