package com.bytedance.ee.bear.docshost;

public interface LoginIdentifyService {

    public enum LoginIdentify {
        single_LarkDocs,
        single_Lark,
        Suite_single_LarkDocs,
        Suite_single_Lark,
        Suite_enterprise_LarkDocs,
        Suite_enterprise_Lark
    }

    /* renamed from: a */
    <T> T mo22256a(String str);
}
