package com.bytedance.frameworks.baselib.network.http.parser;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CacheControlParser {

    /* renamed from: a */
    private static final Pattern f36997a = Pattern.compile("\\s*([\\w\\-]+)\\s*(=)?\\s*(\\d+|\\\"([^\"\\\\]*(\\\\.[^\"\\\\]*)*)+\\\")?\\s*");

    /* renamed from: b */
    private HashMap<Directive, String> f36998b = new HashMap<>();

    /* renamed from: a */
    public String mo51770a(Directive directive) {
        return this.f36998b.get(directive);
    }

    public enum Directive {
        MAXAGE,
        MAXSTALE,
        MINFRESH,
        NOCACHE,
        NOSTORE,
        NOTRANSFORM,
        ONLYIFCACHED,
        MUSTREVALIDATE,
        PRIVATE,
        PROXYREVALIDATE,
        PUBLIC,
        SMAXAGE,
        UNKNOWN;

        public static Directive select(String str) {
            try {
                return valueOf(str.toUpperCase().replaceAll("-", ""));
            } catch (Exception unused) {
                return UNKNOWN;
            }
        }
    }

    public CacheControlParser(String str) {
        Matcher matcher = f36997a.matcher(str);
        while (matcher.find()) {
            Directive select = Directive.select(matcher.group(1));
            if (select != Directive.UNKNOWN) {
                this.f36998b.put(select, matcher.group(3));
            }
        }
    }
}
