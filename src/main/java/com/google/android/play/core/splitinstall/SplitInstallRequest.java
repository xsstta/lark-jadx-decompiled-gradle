package com.google.android.play.core.splitinstall;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SplitInstallRequest {

    /* renamed from: a */
    private final List<String> f56109a;

    /* renamed from: b */
    private final List<Locale> f56110b;

    public static class Builder {

        /* renamed from: a */
        private final List<String> f56111a = new ArrayList();

        /* renamed from: b */
        private final List<Locale> f56112b = new ArrayList();

        private Builder() {
        }

        /* synthetic */ Builder(byte[] bArr) {
        }

        public Builder addLanguage(Locale locale) {
            this.f56112b.add(locale);
            return this;
        }

        public Builder addModule(String str) {
            this.f56111a.add(str);
            return this;
        }

        public SplitInstallRequest build() {
            return new SplitInstallRequest(this);
        }
    }

    /* synthetic */ SplitInstallRequest(Builder builder) {
        this.f56109a = new ArrayList(builder.f56111a);
        this.f56110b = new ArrayList(builder.f56112b);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public List<Locale> getLanguages() {
        return this.f56110b;
    }

    public List<String> getModuleNames() {
        return this.f56109a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f56109a, this.f56110b);
    }
}
