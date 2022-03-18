package com.ss.android.lark.member_manage.impl.atselector.bean;

import android.text.TextUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.bean.a */
public class C44977a implements Comparable<C44977a> {

    /* renamed from: a */
    private String f113871a;

    /* renamed from: b */
    private String f113872b;

    /* renamed from: c */
    private String f113873c;

    /* renamed from: d */
    private String f113874d;

    /* renamed from: e */
    private String f113875e;

    /* renamed from: f */
    private List<String> f113876f;

    /* renamed from: g */
    private List<String> f113877g;

    /* renamed from: h */
    private Chatter.ChatterType f113878h;

    /* renamed from: i */
    private ChatterDescription f113879i;

    /* renamed from: j */
    private boolean f113880j;

    /* renamed from: k */
    private String f113881k;

    /* renamed from: l */
    private WorkStatus f113882l;

    /* renamed from: m */
    private long f113883m;

    /* renamed from: n */
    private boolean f113884n;

    /* renamed from: o */
    private List<TagInfo> f113885o;

    /* renamed from: p */
    private String f113886p;

    /* renamed from: a */
    public String mo159184a() {
        return this.f113871a;
    }

    /* renamed from: b */
    public String mo159185b() {
        return this.f113873c;
    }

    /* renamed from: c */
    public String mo159186c() {
        return this.f113874d;
    }

    /* renamed from: d */
    public List<String> mo159188d() {
        return this.f113876f;
    }

    /* renamed from: e */
    public Chatter.ChatterType mo159189e() {
        return this.f113878h;
    }

    /* renamed from: f */
    public ChatterDescription mo159190f() {
        return this.f113879i;
    }

    /* renamed from: g */
    public String mo159191g() {
        return this.f113881k;
    }

    /* renamed from: h */
    public WorkStatus mo159192h() {
        return this.f113882l;
    }

    /* renamed from: i */
    public long mo159193i() {
        return this.f113883m;
    }

    /* renamed from: j */
    public String mo159194j() {
        return this.f113886p;
    }

    /* renamed from: k */
    public boolean mo159195k() {
        return this.f113884n;
    }

    /* renamed from: l */
    public List<TagInfo> mo159196l() {
        return this.f113885o;
    }

    /* renamed from: a */
    public int compareTo(C44977a aVar) {
        String str = this.f113874d;
        if (!TextUtils.isEmpty(this.f113881k) && !this.f113881k.equals("#")) {
            str = this.f113881k;
        }
        String g = aVar.mo159191g();
        if (TextUtils.isEmpty(g) || g.equals("#")) {
            g = aVar.mo159186c();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.compareToIgnoreCase(g) == 0) {
            return this.f113871a.compareTo(aVar.mo159184a());
        }
        return str.compareToIgnoreCase(g);
    }

    public C44977a(String str, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, Chatter.ChatterType chatterType, ChatterDescription chatterDescription, boolean z, String str6, WorkStatus workStatus, long j, boolean z2, List<TagInfo> list3, String str7) {
        this.f113871a = str;
        this.f113872b = str2;
        this.f113873c = str3;
        this.f113874d = str4;
        this.f113875e = str5;
        this.f113876f = list;
        this.f113877g = list2;
        this.f113878h = chatterType;
        this.f113879i = chatterDescription;
        this.f113880j = z;
        this.f113881k = str6;
        this.f113882l = workStatus;
        this.f113883m = j;
        this.f113884n = z2;
        this.f113885o = list3;
        this.f113886p = str7;
    }
}
