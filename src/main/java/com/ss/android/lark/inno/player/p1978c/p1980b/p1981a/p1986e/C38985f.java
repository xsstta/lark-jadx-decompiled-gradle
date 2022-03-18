package com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.inno.player.c.b.a.e.f */
public class C38985f extends AbstractC38973a<AbstractC38974b> {

    /* renamed from: a */
    private C38986a f100166a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m153843a(View view) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142626a(float f) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142627a(int i) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142628a(int i, int i2, boolean z) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: a */
    public void mo142629a(boolean z) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: b */
    public void mo142630b(int i) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: b */
    public void mo142631b(boolean z) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: c */
    public void mo142633c(boolean z) {
    }

    @Override // com.ss.android.lark.inno.player.p1978c.p1980b.p1981a.p1986e.AbstractC38973a
    /* renamed from: c */
    public void mo142632c() {
        mo142587a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo142665d() {
        LayoutInflater.from(getContext()).inflate(R.layout.inno_livevideo_layer_mini_layer_toolbar, (ViewGroup) this, true);
        C38986a aVar = new C38986a(this);
        this.f100166a = aVar;
        aVar.f100167a.setOnClickListener($$Lambda$f$QZF0kOLM8VUxkW8dldOF7UoPza0.INSTANCE);
    }

    public C38985f(Context context) {
        super(context);
        mo142665d();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.inno.player.c.b.a.e.f$a */
    public static class C38986a {

        /* renamed from: a */
        public ImageView f100167a;

        public C38986a(View view) {
            this.f100167a = (ImageView) view.findViewById(R.id.video_mini_close);
        }
    }
}
