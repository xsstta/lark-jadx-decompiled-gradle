package com.ss.android.lark.setting.page.content.common.dto;

import android.util.SparseArray;
import com.bytedance.lark.pb.basic.v1.DisplayRule;
import com.bytedance.lark.pb.im.v1.TranslateScopeMask;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.C54307a;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MineTranslateLanguageSetting implements Serializable {
    public static final int OPTION_ALL_TRANSLATE;
    public static final int OPTION_MESSAGE_COMMENT_TRANSLATE;
    public static final int OPTION_MESSAGE_TRANSLATE;
    public static final SparseArray<Integer> sDisplayRuleIndexMap;
    public static final SparseArray<Integer> sOptionIndexMap;
    private List<String> blackWebTranslateUrls;
    private int defaultDisplayRule;
    private Set<String> disAutoTranslateKeySet;
    private int globalAutoTranslateScope;
    private Map<String, Integer> specificDisplayRuleMap;
    private List<LanguageInfo> srcLanguages;
    private List<LanguageInfo> supportedLanguageList;
    private String targetLanguageKey;
    private List<String> webLanguageKeys;

    /* renamed from: com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting$a */
    public static class C54162a {

        /* renamed from: a */
        public static final int f134062a = DisplayRule.WITH_ORIGINAL.getValue();

        /* renamed from: b */
        public static final int f134063b = DisplayRule.ONLY_TRANSLATION.getValue();
    }

    /* renamed from: com.ss.android.lark.setting.page.content.common.dto.MineTranslateLanguageSetting$b */
    public static class C54163b {

        /* renamed from: a */
        public static final int f134064a = TranslateScopeMask.UNKNOWN_TRANSLATE_SCOPE_MASK.getValue();

        /* renamed from: b */
        public static final int f134065b;

        /* renamed from: c */
        public static final int f134066c;

        /* renamed from: d */
        public static final int f134067d;

        /* renamed from: e */
        public static final int f134068e;

        /* renamed from: f */
        public static final int f134069f;

        /* renamed from: g */
        public static final int f134070g;

        /* renamed from: h */
        public static final int f134071h;

        /* renamed from: i */
        private int f134072i;

        /* renamed from: f */
        public int mo185405f() {
            return this.f134072i;
        }

        /* renamed from: a */
        public boolean mo185398a() {
            if (this.f134072i != f134064a) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo185400b() {
            int i = this.f134072i;
            int i2 = f134065b;
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo185402c() {
            int i = this.f134072i;
            int i2 = f134068e;
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo185403d() {
            int i = this.f134072i;
            int i2 = f134069f;
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo185404e() {
            int i = this.f134072i;
            int i2 = f134070g;
            if ((i & i2) == i2) {
                return true;
            }
            return false;
        }

        static {
            int value = TranslateScopeMask.LARK_MESSAGE_MASK.getValue();
            f134065b = value;
            int value2 = TranslateScopeMask.DOC_BODY_MASK.getValue();
            f134066c = value2;
            int value3 = TranslateScopeMask.DOC_COMMENT_MASK.getValue();
            f134067d = value3;
            int value4 = TranslateScopeMask.WEB_XML.getValue();
            f134068e = value4;
            int value5 = TranslateScopeMask.DOC_MASK.getValue();
            f134069f = value5;
            int value6 = TranslateScopeMask.EMAIL.getValue();
            f134070g = value6;
            int i = value | value2 | value3 | value4 | value5;
            if (!C54307a.m210867b()) {
                value6 = 0;
            }
            f134071h = i | value6;
        }

        public C54163b(int i) {
            this.f134072i = i;
        }

        /* renamed from: a */
        public static C54163b m210276a(int i) {
            return new C54163b(i);
        }

        /* renamed from: b */
        public void mo185399b(int i) {
            this.f134072i = i | this.f134072i;
        }

        /* renamed from: c */
        public void mo185401c(int i) {
            this.f134072i = (~i) & this.f134072i;
        }
    }

    public List<String> getBlackWebTranslateUrls() {
        return this.blackWebTranslateUrls;
    }

    public int getDefaultDisplayRule() {
        return this.defaultDisplayRule;
    }

    public Set<String> getDisAutoTranslateKeySet() {
        return this.disAutoTranslateKeySet;
    }

    public int getGlobalAutoTranslateScope() {
        return this.globalAutoTranslateScope;
    }

    public Map<String, Integer> getSpecificDisplayRuleMap() {
        return this.specificDisplayRuleMap;
    }

    public List<LanguageInfo> getSrcLanguages() {
        return this.srcLanguages;
    }

    public List<LanguageInfo> getSupportedLanguageList() {
        return this.supportedLanguageList;
    }

    public String getTargetLanguageKey() {
        return this.targetLanguageKey;
    }

    public List<String> getWebLanguageKeys() {
        return this.webLanguageKeys;
    }

    public boolean isGlobalAutoTranslate() {
        if (this.globalAutoTranslateScope != 0) {
            return true;
        }
        return false;
    }

    static {
        int value = TranslateScopeMask.LARK_MESSAGE_MASK.getValue();
        OPTION_MESSAGE_TRANSLATE = value;
        int value2 = TranslateScopeMask.DOC_COMMENT_MASK.getValue() | value;
        OPTION_MESSAGE_COMMENT_TRANSLATE = value2;
        int value3 = TranslateScopeMask.DOC_BODY_MASK.getValue() | value2;
        OPTION_ALL_TRANSLATE = value3;
        SparseArray<Integer> sparseArray = new SparseArray<>();
        sOptionIndexMap = sparseArray;
        SparseArray<Integer> sparseArray2 = new SparseArray<>();
        sDisplayRuleIndexMap = sparseArray2;
        sparseArray.put(0, 0);
        sparseArray.put(1, Integer.valueOf(value));
        sparseArray.put(2, Integer.valueOf(value2));
        sparseArray.put(3, Integer.valueOf(value3));
        sparseArray2.put(0, Integer.valueOf(DisplayRule.WITH_ORIGINAL.getValue()));
        sparseArray2.put(1, Integer.valueOf(DisplayRule.ONLY_TRANSLATION.getValue()));
    }

    public void setBlackWebTranslateUrls(List<String> list) {
        this.blackWebTranslateUrls = list;
    }

    public void setDefaultDisplayRule(int i) {
        this.defaultDisplayRule = i;
    }

    public void setDisAutoTranslateKeySet(Set<String> set) {
        this.disAutoTranslateKeySet = set;
    }

    public void setGlobalAutoTranslateScope(int i) {
        this.globalAutoTranslateScope = i;
    }

    public void setSpecificDisplayRuleMap(Map<String, Integer> map) {
        this.specificDisplayRuleMap = map;
    }

    public void setSrcLanguages(List<LanguageInfo> list) {
        this.srcLanguages = list;
    }

    public void setSupportedLanguageList(List<LanguageInfo> list) {
        this.supportedLanguageList = list;
    }

    public void setTargetLanguageKey(String str) {
        this.targetLanguageKey = str;
    }

    public void setWebLanguageKeys(List<String> list) {
        this.webLanguageKeys = list;
    }

    public static int getDisplayRuleIndex(int i) {
        return sDisplayRuleIndexMap.get(i, Integer.valueOf(DisplayRule.WITH_ORIGINAL.getValue())).intValue();
    }

    public static int getIndexDisplayRule(int i) {
        SparseArray<Integer> sparseArray = sDisplayRuleIndexMap;
        int indexOfValue = sparseArray.indexOfValue(Integer.valueOf(i));
        if (indexOfValue == -1) {
            indexOfValue = 0;
        }
        return sparseArray.keyAt(indexOfValue);
    }

    public static int getIndexOption(int i) {
        SparseArray<Integer> sparseArray = sOptionIndexMap;
        int indexOfValue = sparseArray.indexOfValue(Integer.valueOf(i));
        if (indexOfValue == -1) {
            indexOfValue = 0;
        }
        return sparseArray.keyAt(indexOfValue);
    }

    public static int getOptionIndex(int i) {
        return sOptionIndexMap.get(i, 0).intValue();
    }

    public MineTranslateLanguageSetting(int i, String str, List<LanguageInfo> list, Set<String> set, int i2, Map<String, Integer> map, List<LanguageInfo> list2, List<String> list3, List<String> list4) {
        this.globalAutoTranslateScope = i;
        this.targetLanguageKey = str;
        this.supportedLanguageList = list == null ? Collections.emptyList() : list;
        this.disAutoTranslateKeySet = set;
        this.defaultDisplayRule = i2;
        this.specificDisplayRuleMap = map == null ? Collections.emptyMap() : map;
        this.srcLanguages = list2 == null ? Collections.emptyList() : list2;
        this.blackWebTranslateUrls = list3 == null ? Collections.emptyList() : list3;
        this.webLanguageKeys = list4;
    }
}
