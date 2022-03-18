package com.ss.android.lark.mail.impl.p2167f;

import com.ss.android.lark.diskmanage.Biz;
import com.ss.android.lark.diskmanage.CleanResult;
import com.ss.android.lark.diskmanage.DefaultAutoCleanItem;
import com.ss.android.lark.diskmanage.RemoteConfig;
import com.ss.android.lark.diskmanage.clean.IDiskCleanTask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.f.a */
public class C42106a implements IDiskCleanTask {
    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: c */
    public double mo135618c() {
        return 0.0d;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public Biz mo135615a() {
        return Biz.MAIL;
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: b */
    public CleanResult mo135617b() {
        return new CleanResult();
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: d */
    public List<DefaultAutoCleanItem> mo135619d() {
        return new ArrayList();
    }

    @Override // com.ss.android.lark.diskmanage.clean.IDiskCleanTask
    /* renamed from: a */
    public CleanResult mo135616a(RemoteConfig dVar) {
        return new CleanResult();
    }
}
