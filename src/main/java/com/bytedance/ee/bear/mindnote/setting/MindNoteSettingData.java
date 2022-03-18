package com.bytedance.ee.bear.mindnote.setting;

import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class MindNoteSettingData implements NonProguard {
    private String activeStructureKey;
    private String activeThemeKey;
    private List<StructureItem> structures = new ArrayList();
    private List<ThemeItem> themes = new ArrayList();

    public String getActiveStructureKey() {
        return this.activeStructureKey;
    }

    public String getActiveThemeKey() {
        return this.activeThemeKey;
    }

    public List<StructureItem> getStructures() {
        return this.structures;
    }

    public List<ThemeItem> getThemes() {
        return this.themes;
    }

    MindNoteSettingData() {
    }

    public String toString() {
        return "MindNoteSettingData{activeStructureKey='" + this.activeStructureKey + '\'' + ", activeThemeKey='" + this.activeThemeKey + '\'' + ", structures=" + this.structures + ", themes=" + this.themes + '}';
    }

    public void setActiveStructureKey(String str) {
        this.activeStructureKey = str;
    }

    public void setActiveThemeKey(String str) {
        this.activeThemeKey = str;
    }

    public void setStructures(List<StructureItem> list) {
        this.structures = list;
    }

    public void setThemes(List<ThemeItem> list) {
        this.themes = list;
    }
}
