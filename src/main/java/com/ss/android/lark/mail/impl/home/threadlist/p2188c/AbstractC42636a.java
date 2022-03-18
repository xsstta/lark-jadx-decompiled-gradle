package com.ss.android.lark.mail.impl.home.threadlist.p2188c;

import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailThread;

/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.c.a */
public abstract class AbstractC42636a implements AbstractC42637b {

    /* renamed from: a */
    protected static final int f108507a;

    /* renamed from: b */
    protected static final int f108508b;

    /* renamed from: c */
    protected static final int f108509c;

    /* renamed from: d */
    protected static final int f108510d;

    /* renamed from: e */
    protected static final int[] f108511e;

    /* renamed from: f */
    protected static final int[] f108512f;

    /* renamed from: g */
    protected static final int[] f108513g = {14, 14, 14, 14};

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: a */
    public void mo153203a(MailThread mailThread, String str) {
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: b */
    public void mo153205b(MailThread mailThread, String str) {
    }

    static {
        int color = UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.ud_W500);
        f108507a = color;
        int color2 = UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.ud_T400);
        f108508b = color2;
        int color3 = UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.ud_N400);
        f108509c = color3;
        int color4 = UIUtils.getColor(C41816b.m166115a().mo150132b(), R.color.static_white);
        f108510d = color4;
        f108511e = new int[]{color, color3, color2, color3};
        f108512f = new int[]{color4, color4, color4, color4};
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: c */
    public int[] mo153207c(MailThread mailThread) {
        return f108513g;
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: a */
    public int[] mo153204a(MailThread mailThread) {
        return f108511e;
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b
    /* renamed from: b */
    public int[] mo153206b(MailThread mailThread) {
        return f108512f;
    }
}
