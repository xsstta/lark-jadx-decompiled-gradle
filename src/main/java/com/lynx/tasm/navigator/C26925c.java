package com.lynx.tasm.navigator;

import android.text.TextUtils;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.lynx.tasm.navigator.c */
public class C26925c {

    /* renamed from: c */
    private static C26925c f66862c = new C26925c();

    /* renamed from: a */
    private Stack<C26918a> f66863a = new Stack<>();

    /* renamed from: b */
    private Map<AbstractC26924b, C26918a> f66864b = new HashMap();

    /* renamed from: d */
    private AbstractC26929f f66865d;

    /* renamed from: e */
    private int f66866e = Integer.MAX_VALUE;

    /* renamed from: a */
    public static C26925c m97826a() {
        return f66862c;
    }

    /* renamed from: b */
    public void mo95762b() {
        C26918a c = mo95764c();
        if (c != null) {
            c.mo95750a();
        }
    }

    private C26925c() {
    }

    /* renamed from: c */
    public C26918a mo95764c() {
        Stack<C26918a> stack = this.f66863a;
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return this.f66863a.peek();
    }

    /* renamed from: a */
    public void mo95760a(ReadableMap readableMap) {
        C26918a c = mo95764c();
        if (c != null) {
            c.mo95751a(readableMap);
        }
    }

    /* renamed from: a */
    public void mo95761a(String str, Map<String, Object> map) {
        C26918a c;
        if (!TextUtils.isEmpty(str)) {
            AbstractC26929f fVar = this.f66865d;
            if ((fVar == null || !fVar.mo95770a(str, map)) && (c = mo95764c()) != null) {
                c.mo95753a(str, map);
            }
        }
    }

    /* renamed from: b */
    public void mo95763b(String str, Map<String, Object> map) {
        C26918a c;
        if (!TextUtils.isEmpty(str) && (c = mo95764c()) != null) {
            c.mo95755b(str, map);
        }
    }
}
