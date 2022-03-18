package com.bytedance.ee.bear.templates.preview.group;

import com.alibaba.fastjson.JSONArray;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class SaveTemplateTokens {

    /* renamed from: a */
    public List<Tokens> f31167a;

    public static class Tokens implements NonProguard {
        public String new_obj_token;
        public String template_token;
    }

    /* renamed from: a */
    public static SaveTemplateTokens m48121a(String str) {
        SaveTemplateTokens saveTemplateTokens = new SaveTemplateTokens();
        saveTemplateTokens.f31167a = JSONArray.parseArray(str, Tokens.class);
        return saveTemplateTokens;
    }

    /* renamed from: b */
    public String mo44481b(String str) {
        for (Tokens tokens : this.f31167a) {
            if (tokens.template_token.equals(str)) {
                return tokens.new_obj_token;
            }
        }
        return "";
    }
}
