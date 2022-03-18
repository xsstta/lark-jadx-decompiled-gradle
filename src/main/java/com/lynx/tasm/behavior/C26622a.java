package com.lynx.tasm.behavior;

import com.lynx.tasm.AbstractC26544a;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;

/* renamed from: com.lynx.tasm.behavior.a */
public class C26622a {

    /* renamed from: a */
    private String f65900a;

    /* renamed from: b */
    private final boolean f65901b;

    /* renamed from: a */
    public ShadowNode mo67433a() {
        return null;
    }

    /* renamed from: b */
    public AbstractC26544a mo94568b() {
        return null;
    }

    /* renamed from: d */
    public LynxFlattenUI mo94571d(AbstractC26684l lVar) {
        return null;
    }

    /* renamed from: e */
    public LynxFlattenUI mo94573e(AbstractC26684l lVar) {
        return null;
    }

    /* renamed from: f */
    public LynxBaseUI mo94574f(AbstractC26684l lVar) {
        return null;
    }

    /* renamed from: c */
    public final boolean mo94570c() {
        return this.f65901b;
    }

    /* renamed from: d */
    public String mo94572d() {
        return this.f65900a;
    }

    public String toString() {
        return "[" + getClass().getSimpleName() + " - " + this.f65900a + "]";
    }

    public C26622a(String str) {
        this(str, false);
    }

    /* renamed from: a */
    public LynxUI mo33935a(AbstractC26684l lVar) {
        throw new RuntimeException(this.f65900a + " is a virtual node, do not have real ui!");
    }

    /* renamed from: c */
    public LynxUI mo94569c(AbstractC26684l lVar) {
        throw new RuntimeException(this.f65900a + " is a virtual node, do not have real ui!");
    }

    public C26622a(String str, boolean z) {
        this.f65900a = str;
        this.f65901b = z;
    }
}
