package com.tt.miniapp.shortcut;

public class ShortcutResult {

    /* renamed from: a */
    private Result f168552a;

    /* renamed from: b */
    private String f168553b;

    public enum Result {
        SUCCESS,
        FAIL,
        NEED_CHECK
    }

    /* renamed from: a */
    public Result mo232721a() {
        return this.f168552a;
    }

    /* renamed from: b */
    public String mo232722b() {
        return this.f168553b;
    }

    public ShortcutResult(Result result, String str) {
        this.f168552a = result;
        this.f168553b = str;
    }
}
