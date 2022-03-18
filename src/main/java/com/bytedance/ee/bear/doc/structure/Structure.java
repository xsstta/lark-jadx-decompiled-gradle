package com.bytedance.ee.bear.doc.structure;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.bytedance.ee.util.p718t.C13749l;
import java.util.Arrays;
import java.util.Random;

public class Structure implements BaseJSModel {
    public Paragraph[] paragraphs;

    public static class Paragraph implements BaseJSModel {
        public boolean collapse;
        private String hash;
        public int level;
        public boolean showCollapse;
        public boolean showParagraph;
        public String title;
        public int top;

        public Paragraph() {
            this.showParagraph = true;
        }

        public String getHash() {
            String str = this.hash;
            if (str == null) {
                return "-1";
            }
            return str;
        }

        public String getTitle() {
            String str = this.title;
            if (str == null) {
                return "";
            }
            return str;
        }

        public int hashCode() {
            int i;
            String str = this.hash;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str2 = this.title;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((((i3 + i2) * 31) + this.level) * 31) + this.top;
        }

        public String toString() {
            return "Paragraph{hash='" + this.hash + '\'' + ", title='" + this.title + '\'' + ", level=" + this.level + ", top=" + this.top + ", collapse=" + this.collapse + '}';
        }

        public void setHash(String str) {
            this.hash = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Paragraph paragraph = (Paragraph) obj;
            if (this.level != paragraph.level || this.top != paragraph.top) {
                return false;
            }
            String str = this.hash;
            if (str == null ? paragraph.hash != null : !str.equals(paragraph.hash)) {
                return false;
            }
            if (this.showParagraph != paragraph.showParagraph || this.showCollapse != paragraph.showCollapse || this.collapse != paragraph.collapse) {
                return false;
            }
            String str2 = this.title;
            String str3 = paragraph.title;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        public Paragraph(String str, int i, int i2) {
            this.showParagraph = true;
            this.title = str;
            this.level = i;
            this.top = i2;
        }

        public Paragraph(String str, int i, int i2, boolean z, boolean z2, boolean z3) {
            this(str, i, i2);
            this.showParagraph = z;
            this.showCollapse = z2;
            this.collapse = z3;
        }
    }

    /* access modifiers changed from: package-private */
    public int getParagraphCount() {
        Paragraph[] paragraphArr = this.paragraphs;
        if (paragraphArr == null) {
            return 0;
        }
        return paragraphArr.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.paragraphs);
    }

    public String toString() {
        return "Structure{paragraphs=" + Arrays.toString(this.paragraphs) + '}';
    }

    /* access modifiers changed from: package-private */
    public void transformDip2Px() {
        Paragraph[] paragraphArr = this.paragraphs;
        if (paragraphArr != null) {
            for (Paragraph paragraph : paragraphArr) {
                paragraph.top = C13749l.m55738a(paragraph.top);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void trimAllTitle() {
        Paragraph[] paragraphArr = this.paragraphs;
        if (paragraphArr != null) {
            for (Paragraph paragraph : paragraphArr) {
                if (paragraph.title != null) {
                    paragraph.title = paragraph.title.trim();
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.paragraphs, ((Structure) obj).paragraphs);
    }

    /* access modifiers changed from: package-private */
    public Paragraph getParagraph(int i) {
        if (i < 0 || i > getParagraphCount() - 1) {
            return null;
        }
        return this.paragraphs[i];
    }

    public static Structure testData(int i) {
        Structure structure = new Structure();
        Paragraph[] paragraphArr = new Paragraph[8];
        structure.paragraphs = paragraphArr;
        int length = paragraphArr.length;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < length) {
            int nextInt = random.nextInt(20);
            sb.setLength(0);
            for (int i3 = 0; i3 < nextInt; i3++) {
                sb.append('x');
            }
            sb.append(i2);
            int i4 = i2 + 1;
            structure.paragraphs[i2] = new Paragraph(sb.toString(), i4, (i2 * i) / length);
            i2 = i4;
        }
        return structure;
    }

    public static boolean equals(Structure structure, Structure structure2) {
        if (structure != null) {
            return structure.equals(structure2);
        }
        if (structure2 == null) {
            return true;
        }
        return false;
    }

    public static boolean countEquals(Structure structure, Structure structure2) {
        int i;
        int i2;
        if (structure == null) {
            i = 0;
        } else {
            i = structure.getParagraphCount();
        }
        if (structure2 == null) {
            i2 = 0;
        } else {
            i2 = structure2.getParagraphCount();
        }
        if (i == i2) {
            return true;
        }
        return false;
    }
}
