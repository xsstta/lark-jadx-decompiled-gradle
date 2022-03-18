package com.bytedance.ee.bear.list.create;

import java.util.Objects;

public class SelectCreationMenuItem {

    /* renamed from: a */
    private ItemType f22190a;

    /* renamed from: b */
    private String f22191b;

    /* renamed from: c */
    private int f22192c;

    /* renamed from: d */
    private boolean f22193d;

    /* renamed from: e */
    private boolean f22194e;

    /* renamed from: f */
    private boolean f22195f;

    /* renamed from: g */
    private boolean f22196g;

    public enum ItemType {
        ADD_DOC(1, "ADD_DOC"),
        ADD_SHEET(2, "ADD_SHEET"),
        ADD_MINDNOTE(3, "ADD_MIND_NOTE"),
        ADD_FOLDER(4, "ADD_FOLDER"),
        UPLOAD_PHOTOS(5, "UPLOAD_PHOTOS"),
        UPLOAD_FILE(6, "UPLOAD_FILE"),
        ADD_BITABLE(10, "ADD_BITABLE"),
        ADD_DOCX(11, "ADD_DOCX");
        
        String tag;
        public int type;

        public String getTag() {
            return this.tag;
        }

        public int getType() {
            return this.type;
        }

        private ItemType(int i, String str) {
            this.type = i;
            this.tag = str;
        }
    }

    /* renamed from: a */
    public ItemType mo32307a() {
        return this.f22190a;
    }

    /* renamed from: b */
    public String mo32308b() {
        return this.f22191b;
    }

    /* renamed from: c */
    public int mo32309c() {
        return this.f22192c;
    }

    /* renamed from: d */
    public boolean mo32310d() {
        return this.f22193d;
    }

    /* renamed from: e */
    public boolean mo32311e() {
        return this.f22195f;
    }

    /* renamed from: f */
    public boolean mo32313f() {
        return this.f22196g;
    }

    public int hashCode() {
        return Objects.hash(this.f22190a, this.f22191b, Integer.valueOf(this.f22192c), Boolean.valueOf(this.f22193d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelectCreationMenuItem selectCreationMenuItem = (SelectCreationMenuItem) obj;
        if (this.f22191b == selectCreationMenuItem.f22191b && this.f22192c == selectCreationMenuItem.f22192c && this.f22193d == selectCreationMenuItem.f22193d && this.f22190a == selectCreationMenuItem.f22190a) {
            return true;
        }
        return false;
    }

    public SelectCreationMenuItem(ItemType itemType, String str, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.f22190a = itemType;
        this.f22191b = str;
        this.f22192c = i;
        this.f22194e = z;
        this.f22195f = z2;
        this.f22196g = z3;
        if (!z || !z2 || !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f22193d = z4;
    }
}
