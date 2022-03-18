package com.bytedance.ee.bear.block.jira;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/block/jira/JiraUtil;", "", "()V", "CLOUD_REGEX", "", "PROTOCOL_REGEX", "SERVER_REGEX", "TOP_10_DOMAIN_REGEX", "checkIsJiraDomain", "", "url", "block-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.jira.d */
public final class JiraUtil {

    /* renamed from: a */
    public static final JiraUtil f14454a = new JiraUtil();

    private JiraUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m20229a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        return Pattern.compile("(https?|s?ftp|ftps|nfs|ssh)?(.+\\.atlassian)|(.*jira.*\\..+)\\.(com|cn|tk|de|net|org|uk|info|nl|ru)").matcher(str).find();
    }
}
