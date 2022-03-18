package com.bytedance.ee.bear.doc.translate;

import com.bytedance.ee.bear.document.menu.MenuData;
import java.util.List;

public class TranslateMenuData extends MenuData {
    private int display_language_index;
    private List<String> display_languages;
    private List<String> languages;

    public int getDisplay_language_index() {
        return this.display_language_index;
    }

    public List<String> getDisplay_languages() {
        return this.display_languages;
    }

    public List<String> getLanguages() {
        return this.languages;
    }

    @Override // com.bytedance.ee.bear.document.menu.MenuData
    public String toString() {
        return "TranslateMenuData{languages=" + this.languages + ", display_language_index=" + this.display_language_index + ", display_languages=" + this.display_languages + '}';
    }

    public void setDisplay_language_index(int i) {
        this.display_language_index = i;
    }

    public void setDisplay_languages(List<String> list) {
        this.display_languages = list;
    }

    public void setLanguages(List<String> list) {
        this.languages = list;
    }
}
