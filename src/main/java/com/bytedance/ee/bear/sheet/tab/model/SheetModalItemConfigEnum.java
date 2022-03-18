package com.bytedance.ee.bear.sheet.tab.model;

import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

public enum SheetModalItemConfigEnum {
    CREATE_SHEET("create_sheet", R.drawable.ud_icon_sheet_table_outlined),
    CREATE_GRID("create_grid", R.drawable.ud_icon_bitablegrid_outlined),
    CREATE_KANBAN("create_kanban", R.drawable.ud_icon_bitablekanban_outlined),
    CREATE_BITABLE("create_bitable", R.drawable.ud_icon_file_bitable_outlined),
    DELETE("delete", R.drawable.ud_icon_delete_trash_outlined),
    RENAME("rename", R.drawable.ud_icon_rename_outlined),
    COPY("copy", R.drawable.ud_icon_copy_outlined);
    
    private static Map<String, SheetModalItemConfigEnum> itemsMap = new HashMap();
    public String itemId;
    public int leftIconRes;

    static {
        SheetModalItemConfigEnum[] values = values();
        for (SheetModalItemConfigEnum sheetModalItemConfigEnum : values) {
            itemsMap.put(sheetModalItemConfigEnum.itemId, sheetModalItemConfigEnum);
        }
    }

    public static SheetModalItemConfigEnum getModalItem(String str) {
        return itemsMap.get(str);
    }

    private SheetModalItemConfigEnum(String str) {
        this.itemId = str;
    }

    private SheetModalItemConfigEnum(String str, int i) {
        this.itemId = str;
        this.leftIconRes = i;
    }
}
