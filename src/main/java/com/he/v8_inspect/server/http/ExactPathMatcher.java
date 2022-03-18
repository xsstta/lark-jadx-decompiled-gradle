package com.he.v8_inspect.server.http;

public class ExactPathMatcher implements PathMatcher {
    private final String mPath;

    public ExactPathMatcher(String str) {
        this.mPath = str;
    }

    @Override // com.he.v8_inspect.server.http.PathMatcher
    public boolean match(String str) {
        return this.mPath.equals(str);
    }
}
