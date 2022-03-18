package com.bytedance.ee.bear.drive.biz.upload.filepicker.config;

public enum FilePickerSettings {
    SETTINGS_SORT_MODE("sort_mode", NavigationSortMode.NAME_ASC),
    SETTINGS_SHOW_DIRS_FIRST("show_dirs_first", Boolean.TRUE),
    SETTINGS_SHOW_HIDDEN("show_hidden", Boolean.FALSE),
    SETTINGS_SHOW_SYSTEM("show_system", Boolean.FALSE),
    SETTINGS_SHOW_SYMLINKS("show_symlinks", Boolean.FALSE);
    
    private final Object mDefaultValue;
    private final String mId;

    public Object getDefaultValue() {
        return this.mDefaultValue;
    }

    public String getId() {
        return this.mId;
    }

    private FilePickerSettings(String str, Object obj) {
        this.mId = str;
        this.mDefaultValue = obj;
    }
}
