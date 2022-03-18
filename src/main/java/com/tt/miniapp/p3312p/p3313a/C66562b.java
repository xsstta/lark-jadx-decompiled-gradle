package com.tt.miniapp.p3312p.p3313a;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tt.miniapp.p.a.b */
public class C66562b {

    /* renamed from: a */
    private String f168063a;

    /* renamed from: b */
    private Size f168064b;

    /* renamed from: c */
    private int f168065c;

    /* renamed from: d */
    private int f168066d;

    /* renamed from: e */
    private List<C66565c> f168067e;

    /* renamed from: f */
    private List<C66563a> f168068f;

    /* renamed from: g */
    private List<Object> f168069g;

    /* renamed from: h */
    private List<String> f168070h;

    /* renamed from: a */
    public String mo232146a() {
        return this.f168063a;
    }

    /* renamed from: b */
    public Size mo232147b() {
        return this.f168064b;
    }

    /* renamed from: c */
    public List<C66565c> mo232148c() {
        return this.f168067e;
    }

    /* renamed from: d */
    public List<C66563a> mo232149d() {
        return this.f168068f;
    }

    /* renamed from: e */
    public List<String> mo232150e() {
        return this.f168070h;
    }

    /* renamed from: com.tt.miniapp.p.a.b$b */
    public static class C66564b {

        /* renamed from: a */
        public String f168076a;

        /* renamed from: b */
        public Size f168077b;

        /* renamed from: c */
        public int f168078c;

        /* renamed from: d */
        public int f168079d;

        /* renamed from: e */
        public List<C66565c> f168080e = new ArrayList();

        /* renamed from: f */
        public List<C66563a> f168081f = new ArrayList();

        /* renamed from: g */
        public List<Object> f168082g = new ArrayList();

        /* renamed from: h */
        public List<String> f168083h = new ArrayList();

        /* renamed from: a */
        public C66562b mo232156a() {
            return new C66562b(this);
        }

        /* renamed from: a */
        public C66564b mo232152a(Size size) {
            this.f168077b = size;
            return this;
        }

        /* renamed from: a */
        public C66564b mo232153a(C66563a aVar) {
            this.f168081f.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C66564b mo232154a(C66565c cVar) {
            this.f168080e.add(cVar);
            return this;
        }

        /* renamed from: a */
        public C66564b mo232155a(String str) {
            this.f168076a = str;
            return this;
        }
    }

    /* renamed from: com.tt.miniapp.p.a.b$c */
    public static class C66565c {

        /* renamed from: a */
        public String f168084a;

        /* renamed from: b */
        public int f168085b;

        /* renamed from: c */
        public int f168086c;

        /* renamed from: d */
        public float f168087d;

        public String toString() {
            return "VideoElement{path='" + this.f168084a + '\'' + ", startTime=" + this.f168085b + ", endTime=" + this.f168086c + ", speed=" + this.f168087d + '}';
        }

        public C66565c(String str, int i, int i2, float f) {
            this.f168084a = str;
            this.f168085b = i;
            this.f168086c = i2;
            this.f168087d = f;
        }
    }

    /* renamed from: com.tt.miniapp.p.a.b$a */
    public static class C66563a {

        /* renamed from: a */
        public String f168071a;

        /* renamed from: b */
        public int f168072b;

        /* renamed from: c */
        public int f168073c;

        /* renamed from: d */
        public int f168074d;

        /* renamed from: e */
        public int f168075e;

        public String toString() {
            return "AudioElement{path='" + this.f168071a + '\'' + ", startTime=" + this.f168072b + ", endTime=" + this.f168073c + ", seqInTime=" + this.f168074d + ", seqOutTime=" + this.f168075e + '}';
        }

        public C66563a(String str, int i, int i2, int i3, int i4) {
            this.f168071a = str;
            this.f168072b = i;
            this.f168073c = i2;
            this.f168074d = i3;
            this.f168075e = i4;
        }
    }

    public C66562b(C66564b bVar) {
        this.f168063a = bVar.f168076a;
        this.f168064b = bVar.f168077b;
        this.f168065c = bVar.f168078c;
        this.f168066d = bVar.f168079d;
        this.f168067e = bVar.f168080e;
        this.f168068f = bVar.f168081f;
        this.f168069g = bVar.f168082g;
        this.f168070h = bVar.f168083h;
    }
}
