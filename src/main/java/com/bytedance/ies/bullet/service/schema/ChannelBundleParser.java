package com.bytedance.ies.bullet.service.schema;

import android.net.Uri;
import android.util.Log;
import com.bytedance.ies.bullet.service.base.ChannelBundleModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\n \n*\u0004\u0018\u00010\b0\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011J\u000e\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ies/bullet/service/schema/ChannelBundleParser;", "", "()V", "PREFIX_PATTERN", "", "TAG", "sPatternCacheMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/regex/Pattern;", "buildPrefixPattern", "kotlin.jvm.PlatformType", "prefix", "createOrGetPattern", "parse", "Lcom/bytedance/ies/bullet/service/base/ChannelBundleModel;", "uri", "prefixList", "", "isNotNullOrEmpty", "", "x-schema_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.schema.a */
public final class ChannelBundleParser {

    /* renamed from: a */
    public static final ChannelBundleParser f37959a = new ChannelBundleParser();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Pattern> f37960b = new ConcurrentHashMap<>();

    private ChannelBundleParser() {
    }

    /* renamed from: c */
    private final boolean m58174c(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final Pattern m58172a(String str) {
        ConcurrentHashMap<String, Pattern> concurrentHashMap = f37960b;
        Pattern pattern = concurrentHashMap.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern b = m58173b(str);
        Intrinsics.checkExpressionValueIsNotNull(b, "pattern");
        concurrentHashMap.put(str, b);
        return b;
    }

    /* renamed from: b */
    private final Pattern m58173b(String str) {
        return Pattern.compile(str + "/(([^/]+)/([^?]*))");
    }

    /* renamed from: a */
    public final ChannelBundleModel mo52804a(String str, List<String> list) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(list, "prefixList");
        ChannelBundleModel aVar = new ChannelBundleModel("", "", false);
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return aVar;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(uri)");
        String path = parse.getPath();
        String str3 = path;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return aVar;
        }
        try {
            for (T t : list) {
                if (t.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    ChannelBundleParser aVar2 = f37959a;
                    Pattern a = aVar2.m58172a(t);
                    Matcher matcher = a.matcher(path);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        String group = matcher.group(2);
                        String group2 = matcher.group(3);
                        if (aVar2.m58174c(group) && aVar2.m58174c(group2)) {
                            Intrinsics.checkExpressionValueIsNotNull(group, "channel");
                            aVar.mo52621a(group);
                            Intrinsics.checkExpressionValueIsNotNull(group2, "bundlePath");
                            aVar.mo52624b(group2);
                            aVar.mo52622a(true);
                            return aVar;
                        }
                    }
                    if (!aVar.mo52625c()) {
                        Matcher matcher2 = a.matcher(str);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String group3 = matcher2.group(2);
                            String group4 = matcher2.group(3);
                            if (aVar2.m58174c(group3) && aVar2.m58174c(group4)) {
                                Intrinsics.checkExpressionValueIsNotNull(group3, "channel");
                                aVar.mo52621a(group3);
                                Intrinsics.checkExpressionValueIsNotNull(group4, "bundlePath");
                                aVar.mo52624b(group4);
                                aVar.mo52622a(true);
                                return aVar;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            Log.w("ChannelBundleParser", "ChannelBundleModel parse error: " + e.getMessage());
        }
        return aVar;
    }
}
