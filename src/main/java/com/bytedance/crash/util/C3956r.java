package com.bytedance.crash.util;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.r */
public class C3956r {

    /* renamed from: a */
    private final Writer f12058a;

    /* renamed from: b */
    private final List<EnumC3957a> f12059b = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.util.r$a */
    public enum EnumC3957a {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public String toString() {
        return "";
    }

    /* renamed from: a */
    public static void m16469a(JSONObject jSONObject, Writer writer) throws Throwable {
        new C3956r(writer).m16468a(jSONObject);
        writer.flush();
    }

    /* renamed from: a */
    private void m16468a(JSONObject jSONObject) throws JSONException, IOException {
        m16472c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m16471b(next).m16463a(jSONObject.get(next));
        }
        m16473d();
    }

    /* renamed from: a */
    private C3956r m16460a() throws JSONException, IOException {
        return m16462a(EnumC3957a.EMPTY_ARRAY, "[");
    }

    /* renamed from: b */
    private C3956r m16470b() throws JSONException, IOException {
        return m16461a(EnumC3957a.EMPTY_ARRAY, EnumC3957a.NONEMPTY_ARRAY, "]");
    }

    /* renamed from: c */
    private C3956r m16472c() throws JSONException, IOException {
        return m16462a(EnumC3957a.EMPTY_OBJECT, "{");
    }

    /* renamed from: d */
    private C3956r m16473d() throws JSONException, IOException {
        return m16461a(EnumC3957a.EMPTY_OBJECT, EnumC3957a.NONEMPTY_OBJECT, "}");
    }

    /* renamed from: e */
    private EnumC3957a m16474e() {
        List<EnumC3957a> list = this.f12059b;
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    private void m16475f() throws JSONException, IOException {
        EnumC3957a e = m16474e();
        if (e == EnumC3957a.NONEMPTY_OBJECT) {
            this.f12058a.write(44);
        } else if (e != EnumC3957a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        m16464a(EnumC3957a.DANGLING_KEY);
    }

    /* renamed from: g */
    private void m16476g() throws JSONException, IOException {
        if (!this.f12059b.isEmpty()) {
            EnumC3957a e = m16474e();
            if (e == EnumC3957a.EMPTY_ARRAY) {
                m16464a(EnumC3957a.NONEMPTY_ARRAY);
            } else if (e == EnumC3957a.NONEMPTY_ARRAY) {
                this.f12058a.write(44);
            } else if (e == EnumC3957a.DANGLING_KEY) {
                this.f12058a.write(":");
                m16464a(EnumC3957a.NONEMPTY_OBJECT);
            } else if (e != EnumC3957a.NULL) {
                throw new JSONException("Nesting problem");
            }
        }
    }

    /* renamed from: b */
    private C3956r m16471b(String str) throws JSONException, IOException {
        m16475f();
        m16465a(str);
        return this;
    }

    private C3956r(Writer writer) {
        this.f12058a = writer;
    }

    /* renamed from: a */
    private C3956r m16463a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            m16466a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            m16468a((JSONObject) obj);
            return this;
        } else {
            m16476g();
            if (obj == null || obj == JSONObject.NULL) {
                this.f12058a.write("null");
            } else if (obj instanceof Boolean) {
                this.f12058a.write(String.valueOf(obj));
            } else if (obj instanceof Number) {
                this.f12058a.write(JSONObject.numberToString((Number) obj));
            } else {
                m16465a(obj.toString());
            }
            return this;
        }
    }

    /* renamed from: a */
    private void m16464a(EnumC3957a aVar) {
        List<EnumC3957a> list = this.f12059b;
        list.set(list.size() - 1, aVar);
    }

    /* renamed from: a */
    private void m16465a(String str) throws IOException {
        this.f12058a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.f12058a.write("\\f");
            } else if (charAt == '\r') {
                this.f12058a.write("\\r");
            } else if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                this.f12058a.write(92);
                this.f12058a.write(charAt);
            } else {
                switch (charAt) {
                    case '\b':
                        this.f12058a.write("\\b");
                        continue;
                    case '\t':
                        this.f12058a.write("\\t");
                        continue;
                    case '\n':
                        this.f12058a.write("\\n");
                        continue;
                    default:
                        if (charAt > 31) {
                            this.f12058a.write(charAt);
                            break;
                        } else {
                            this.f12058a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                            continue;
                        }
                }
            }
        }
        this.f12058a.write("\"");
    }

    /* renamed from: a */
    private void m16466a(JSONArray jSONArray) throws JSONException, IOException {
        m16460a();
        for (int i = 0; i < jSONArray.length(); i++) {
            m16463a(jSONArray.get(i));
        }
        m16470b();
    }

    /* renamed from: a */
    private C3956r m16462a(EnumC3957a aVar, String str) throws JSONException, IOException {
        m16476g();
        this.f12059b.add(aVar);
        this.f12058a.write(str);
        return this;
    }

    /* renamed from: a */
    public static void m16467a(JSONArray jSONArray, Writer writer) throws Throwable {
        new C3956r(writer).m16466a(jSONArray);
        writer.flush();
    }

    /* renamed from: a */
    private C3956r m16461a(EnumC3957a aVar, EnumC3957a aVar2, String str) throws JSONException, IOException {
        m16474e();
        List<EnumC3957a> list = this.f12059b;
        list.remove(list.size() - 1);
        this.f12058a.write(str);
        return this;
    }
}
