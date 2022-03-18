package com.bytedance.ee.bear.list.homepage.title;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.list.homepage.title.e */
public class C8507e implements AbstractC8505c {

    /* renamed from: a */
    private final Context f22999a;

    /* renamed from: b */
    private final ITitleController f23000b;

    /* renamed from: c */
    private final C8508f f23001c;

    /* renamed from: d */
    private final C8504b f23002d;

    /* renamed from: e */
    private final View.OnClickListener f23003e;

    /* renamed from: f */
    private final C8506d f23004f;

    /* renamed from: g */
    private int f23005g;

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleType() {
        return 0;
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleBarHeight() {
        return this.f23000b.mo99189a();
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public View getCreateView() {
        return this.f23002d.mo33242a().getContentView();
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: k */
    public void mo33198k() {
        this.f23004f.mo33246a();
        this.f23005g = this.f23000b.mo99189a();
        mo33249a(false);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33175a() {
        C8503a b = this.f23002d.mo33243b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        this.f23001c.mo33253a(arrayList);
        this.f23001c.mo33251a(ITitleInfo.IconStyle.Hide);
        this.f23000b.mo99191a(this.f23001c);
    }

    /* renamed from: a */
    public void mo33249a(boolean z) {
        this.f23000b.mo99192a(z);
        this.f23001c.mo33254a(true);
    }

    /* renamed from: b */
    public void mo33250b(boolean z) {
        this.f23000b.mo99194b(z);
        this.f23001c.mo33254a(false);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setSearchViewClickListener(View.OnClickListener onClickListener) {
        this.f23002d.mo33243b().mo33239a(this.f23003e);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setTitle(String str) {
        this.f23001c.mo33252a(str);
        this.f23000b.mo99191a(this.f23001c);
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33176a(int i, int i2) {
        int a = this.f23004f.mo33245a(this.f23005g, i2);
        this.f23005g = a;
        float a2 = this.f23004f.mo33244a(a);
        boolean a3 = this.f23004f.mo33247a(a2);
        C13479a.m54772d("TitleControllerWrapper", "onScrollBy, height:" + this.f23005g + ", alpha:" + a2 + ", visible:" + a3);
        if (a3) {
            mo33249a(true);
        } else {
            mo33250b(true);
        }
    }

    public C8507e(Context context, ITitleController iTitleController, C8508f fVar, View.OnClickListener onClickListener) {
        this.f22999a = context;
        this.f23000b = iTitleController;
        this.f23001c = fVar;
        this.f23003e = onClickListener;
        int a = iTitleController.mo99189a();
        this.f23005g = a;
        this.f23004f = new C8506d(a, a);
        this.f23002d = new C8504b(context);
    }
}
