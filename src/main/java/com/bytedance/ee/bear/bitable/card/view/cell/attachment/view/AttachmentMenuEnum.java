package com.bytedance.ee.bear.bitable.card.view.cell.attachment.view;

import android.util.SparseArray;
import com.larksuite.suite.R;

public enum AttachmentMenuEnum {
    DELETE(0, R.string.Doc_Facade_Delete);
    
    private static final SparseArray<AttachmentMenuEnum> mapValues = new SparseArray<>();
    private int id;
    private int titleResId;

    public int getId() {
        return this.id;
    }

    public int getTitleResId() {
        return this.titleResId;
    }

    static {
        AttachmentMenuEnum[] values = values();
        for (AttachmentMenuEnum attachmentMenuEnum : values) {
            mapValues.put(attachmentMenuEnum.id, attachmentMenuEnum);
        }
    }

    public static AttachmentMenuEnum valueOf(int i) {
        return mapValues.get(i);
    }

    private AttachmentMenuEnum(int i, int i2) {
        this.id = i;
        this.titleResId = i2;
    }
}
