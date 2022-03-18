package com.ss.android.lark.widget.p2932c;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.p2932c.C58339d;

/* renamed from: com.ss.android.lark.widget.c.a */
public class C58329a extends C58339d.C58341a {

    /* renamed from: n */
    private int f143506n = -1;

    /* renamed from: o */
    private int f143507o = -1;

    /* renamed from: com.ss.android.lark.widget.c.a$a */
    public static class C58331a {

        /* renamed from: a */
        public int f143508a = -1;

        /* renamed from: b */
        public int f143509b = -1;

        /* renamed from: c */
        private int f143510c;

        /* renamed from: d */
        private String f143511d;

        /* renamed from: e */
        private C58339d.AbstractC58343b f143512e;

        /* renamed from: f */
        private int f143513f = -1;

        /* renamed from: g */
        private int f143514g = -1;

        /* renamed from: h */
        private int f143515h;

        /* renamed from: i */
        private int f143516i = -1;

        /* renamed from: a */
        public int mo197543a() {
            return this.f143510c;
        }

        /* renamed from: b */
        public int mo197547b() {
            return this.f143515h;
        }

        /* renamed from: c */
        public int mo197549c() {
            return this.f143516i;
        }

        /* renamed from: e */
        public C58339d.AbstractC58343b mo197553e() {
            return this.f143512e;
        }

        /* renamed from: f */
        public int mo197554f() {
            return this.f143513f;
        }

        /* renamed from: g */
        public int mo197555g() {
            return this.f143514g;
        }

        /* renamed from: h */
        public int mo197556h() {
            return this.f143508a;
        }

        /* renamed from: i */
        public int mo197557i() {
            return this.f143509b;
        }

        /* renamed from: d */
        public String mo197552d() {
            return this.f143511d;
        }

        /* renamed from: j */
        public C58329a mo197558j() {
            return new C58329a(this);
        }

        /* renamed from: d */
        public C58331a mo197551d(int i) {
            this.f143508a = i;
            return this;
        }

        /* renamed from: a */
        public C58331a mo197544a(int i) {
            this.f143515h = i;
            return this;
        }

        /* renamed from: b */
        public C58331a mo197548b(int i) {
            this.f143516i = i;
            return this;
        }

        /* renamed from: c */
        public C58331a mo197550c(int i) {
            this.f143514g = i;
            return this;
        }

        /* renamed from: a */
        public C58331a mo197545a(C58339d.AbstractC58343b bVar) {
            this.f143512e = bVar;
            return this;
        }

        /* renamed from: a */
        public C58331a mo197546a(String str) {
            this.f143511d = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.lark.widget.c.a$b */
    private static class C58332b {

        /* renamed from: a */
        TextView f143517a;

        /* renamed from: b */
        ImageView f143518b;

        /* renamed from: c */
        View f143519c;

        /* renamed from: d */
        View f143520d;

        /* renamed from: e */
        View f143521e;

        private C58332b() {
        }
    }

    public C58329a(C58331a aVar) {
        super(aVar.mo197553e());
        this.f143506n = aVar.mo197547b();
        this.f143507o = aVar.mo197549c();
        this.f143534d = aVar.mo197554f();
        this.f143531a = aVar.mo197543a();
        this.f143532b = aVar.mo197552d();
        this.f143534d = aVar.mo197554f();
        this.f143535e = aVar.mo197555g();
        this.f143537g = aVar.mo197556h();
        this.f143538h = aVar.mo197557i();
    }

    @Override // com.ss.android.lark.widget.p2932c.C58339d.C58341a
    /* renamed from: a */
    public View mo197542a(BaseAdapter baseAdapter, Context context, int i, View view, ViewGroup viewGroup) {
        C58332b bVar;
        if (view == null || !(view.getTag() instanceof C58332b)) {
            C58332b bVar2 = new C58332b();
            View inflate = LayoutInflater.from(context).inflate(R.layout.global_custom_dialog_list_item, viewGroup, false);
            bVar2.f143519c = inflate.findViewById(R.id.divider);
            bVar2.f143517a = (TextView) inflate.findViewById(R.id.text_menu);
            bVar2.f143518b = (ImageView) inflate.findViewById(R.id.icon);
            bVar2.f143521e = inflate.findViewById(R.id.layout_container);
            bVar2.f143520d = inflate;
            inflate.setTag(bVar2);
            bVar = bVar2;
            view = inflate;
        } else {
            bVar = (C58332b) view.getTag();
        }
        bVar.f143517a.setText(this.f143532b);
        if (!this.f143539i) {
            bVar.f143519c.setVisibility(8);
        } else if (i == baseAdapter.getCount() - 1) {
            bVar.f143519c.setVisibility(8);
        } else {
            bVar.f143519c.setVisibility(0);
        }
        if (this.f143536f != -1) {
            bVar.f143517a.setTextSize((float) this.f143536f);
        }
        if (this.f143535e != -1) {
            bVar.f143517a.setTextColor(context.getResources().getColor(this.f143535e));
        }
        if (this.f143534d != -1) {
            view.setBackgroundResource(this.f143534d);
        }
        if (this.f143537g != -1) {
            bVar.f143519c.setBackgroundResource(this.f143537g);
        }
        if (this.f143506n != -1) {
            bVar.f143518b.setImageResource(this.f143506n);
        }
        if (this.f143507o != -1) {
            bVar.f143518b.setImageTintList(C0215a.m652a(context, this.f143507o));
            bVar.f143518b.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        }
        if (this.f143542l != -1) {
            bVar.f143521e.getLayoutParams().height = this.f143542l;
        }
        if (this.f143543m != -1) {
            ViewGroup.LayoutParams layoutParams = bVar.f143517a.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f143543m;
            }
        }
        return view;
    }
}
