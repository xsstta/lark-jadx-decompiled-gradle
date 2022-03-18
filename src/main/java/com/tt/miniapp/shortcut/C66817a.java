package com.tt.miniapp.shortcut;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.tt.miniapphost.entity.MicroSchemaEntity;
import java.util.HashMap;

/* renamed from: com.tt.miniapp.shortcut.a */
public class C66817a {

    /* renamed from: a */
    public String f168558a;

    /* renamed from: b */
    public String f168559b;

    /* renamed from: c */
    public String f168560c;

    /* renamed from: d */
    public int f168561d;

    /* renamed from: e */
    public String f168562e;

    /* renamed from: a */
    public String mo232734a() {
        return this.f168558a;
    }

    /* renamed from: b */
    public String mo232736b() {
        return this.f168559b;
    }

    /* renamed from: c */
    public String mo232737c() {
        return this.f168560c;
    }

    /* renamed from: d */
    public String mo232738d() {
        return this.f168562e;
    }

    /* renamed from: com.tt.miniapp.shortcut.a$a */
    public static class C66818a {

        /* renamed from: a */
        private C66817a f168563a = new C66817a();

        /* renamed from: a */
        public C66817a mo232741a() {
            this.f168563a.f168562e = m260712b();
            return this.f168563a;
        }

        /* renamed from: b */
        private String m260712b() {
            return CharacterUtils.md5Hex(this.f168563a.f168560c + this.f168563a.f168558a + this.f168563a.f168559b);
        }

        /* renamed from: a */
        public C66818a mo232739a(int i) {
            this.f168563a.f168561d = i;
            return this;
        }

        /* renamed from: b */
        public C66818a mo232742b(String str) {
            this.f168563a.f168559b = str;
            return this;
        }

        /* renamed from: c */
        public C66818a mo232743c(String str) {
            this.f168563a.f168560c = str;
            return this;
        }

        /* renamed from: a */
        public C66818a mo232740a(String str) {
            this.f168563a.f168558a = str;
            return this;
        }
    }

    /* renamed from: e */
    private String m260706e() {
        HashMap hashMap = new HashMap();
        hashMap.put("launch_from", "desktop");
        hashMap.put("location", "short_cut");
        return new MicroSchemaEntity.Builder().appId(this.f168560c).host(m260705a(this.f168561d)).bdpLog(hashMap).build().toSchema();
    }

    /* renamed from: a */
    private MicroSchemaEntity.Host m260705a(int i) {
        if (i == 2) {
            return MicroSchemaEntity.Host.MICROGAME;
        }
        return MicroSchemaEntity.Host.MICROAPP;
    }

    /* renamed from: a */
    public void mo232735a(Intent intent) {
        if (intent != null) {
            intent.putExtra("key_shortcut_id", this.f168562e);
            intent.setData(Uri.parse(m260706e()));
        }
    }
}
