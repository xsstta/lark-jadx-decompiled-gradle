package com.ss.android.lark.chat.entity.translate;

import android.text.TextUtils;
import com.bytedance.lark.pb.im.v1.LanguagesConfiguration;
import com.bytedance.lark.pb.im.v1.SrcLanguageConfig;
import com.bytedance.lark.pb.im.v1.TranslateScopeMask;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TranslateLanguageSetting implements Serializable {
    private Set<String> disAutoTranslateKeySet;
    private Map<String, Integer> displayConfigMap;
    private int globalAutoTranslateScope;
    private int globalDisplayConfig;
    private List<LanguageInfo> supportedLanguageList;
    private String targetLanguageKey;

    public Set<String> getDisAutoTranslateKeySet() {
        return this.disAutoTranslateKeySet;
    }

    public Map<String, Integer> getDisplayConfigMap() {
        return this.displayConfigMap;
    }

    public int getGlobalAutoTranslateScope() {
        return this.globalAutoTranslateScope;
    }

    public int getGlobalDisplayConfig() {
        return this.globalDisplayConfig;
    }

    public List<LanguageInfo> getSupportedLanguageList() {
        return this.supportedLanguageList;
    }

    public String getTargetLanguageKey() {
        return this.targetLanguageKey;
    }

    public boolean isGlobalAutoTranslate() {
        if ((this.globalAutoTranslateScope & TranslateScopeMask.LARK_MESSAGE_MASK.getValue()) != 0) {
            return true;
        }
        return false;
    }

    public String getTargetLanguageName() {
        List<LanguageInfo> list = this.supportedLanguageList;
        if (list == null || this.targetLanguageKey == null) {
            return "";
        }
        for (LanguageInfo languageInfo : list) {
            if (this.targetLanguageKey.equals(languageInfo.getKey())) {
                return languageInfo.getDisplayName();
            }
        }
        return "";
    }

    public void setDisAutoTranslateKeySet(Set<String> set) {
        this.disAutoTranslateKeySet = set;
    }

    public void setDisplayConfigMap(Map<String, Integer> map) {
        this.displayConfigMap = map;
    }

    public void setGlobalAutoTranslateScope(int i) {
        this.globalAutoTranslateScope = i;
    }

    public void setGlobalDisplayConfig(int i) {
        this.globalDisplayConfig = i;
    }

    public void setSupportedLanguageList(List<LanguageInfo> list) {
        this.supportedLanguageList = list;
    }

    public void setTargetLanguageKey(String str) {
        this.targetLanguageKey = str;
    }

    public boolean needTranslate(String str) {
        if (TextUtils.equals(str, "not_lang") || TextUtils.equals(str, getTargetLanguageKey()) || getDisAutoTranslateKeySet().contains(str)) {
            return false;
        }
        return true;
    }

    public int getDisplayRule(String str) {
        Integer num = 0;
        Map<String, Integer> map = this.displayConfigMap;
        if (map != null) {
            num = map.get(str);
        }
        if (num == null || num.intValue() == 0) {
            num = Integer.valueOf(this.globalDisplayConfig);
        }
        return num.intValue();
    }

    public TranslateLanguageSetting(LanguagesConfiguration languagesConfiguration, Map<String, LanguagesConfiguration> map) {
        setDisplayRule(languagesConfiguration, map);
    }

    public void setDisplayRule(LanguagesConfiguration languagesConfiguration, Map<String, LanguagesConfiguration> map) {
        int i;
        if (languagesConfiguration != null) {
            i = languagesConfiguration.rule.getValue();
        } else {
            i = 0;
        }
        this.globalDisplayConfig = i;
        this.displayConfigMap = new HashMap();
        for (Map.Entry<String, LanguagesConfiguration> entry : map.entrySet()) {
            this.displayConfigMap.put(entry.getKey(), Integer.valueOf(entry.getValue().rule.getValue()));
        }
    }

    public TranslateLanguageSetting(String str, List<String> list, Map<String, String> map) {
        this(str, list, map, new HashMap());
    }

    public TranslateLanguageSetting(String str, List<String> list, Map<String, String> map, Map<String, SrcLanguageConfig> map2) {
        this.targetLanguageKey = str;
        if (!(list == null || map == null)) {
            this.supportedLanguageList = new ArrayList();
            for (String str2 : list) {
                if (map.containsKey(str2)) {
                    LanguageInfo languageInfo = new LanguageInfo(str2, map.get(str2));
                    languageInfo.setCurLanguageDisplayName(map2);
                    this.supportedLanguageList.add(languageInfo);
                }
            }
        }
    }

    public TranslateLanguageSetting(int i, String str, List<String> list, Map<String, String> map, List<String> list2, LanguagesConfiguration languagesConfiguration, Map<String, LanguagesConfiguration> map2, Map<String, SrcLanguageConfig> map3) {
        this(str, list, map, map3);
        this.globalAutoTranslateScope = i;
        this.disAutoTranslateKeySet = new HashSet(list2);
        setDisplayRule(languagesConfiguration, map2);
    }
}
