package com.ss.android.lark.mail.impl.validator.lexer;

/* renamed from: com.ss.android.lark.mail.impl.validator.lexer.b */
public final class C43898b implements AbstractC43899c {

    /* renamed from: a */
    private String f111360a;

    /* renamed from: b */
    private String f111361b;

    @Override // com.ss.android.lark.mail.impl.validator.lexer.AbstractC43899c
    public String getName() {
        return this.f111360a;
    }

    @Override // com.ss.android.lark.mail.impl.validator.lexer.AbstractC43899c
    public String getText() {
        return this.f111361b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC43899c.class.isInstance(obj)) {
            return false;
        }
        return this.f111360a.equals(((AbstractC43899c) obj).getName());
    }

    public C43898b(String str, String str2) {
        this.f111360a = str;
        this.f111361b = str2;
    }
}
