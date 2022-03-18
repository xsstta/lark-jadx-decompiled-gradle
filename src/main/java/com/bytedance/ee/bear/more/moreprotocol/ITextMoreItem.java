package com.bytedance.ee.bear.more.moreprotocol;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IIconFontMoreItem;", "getUnableTips", "", "isEnable", "", "needShowBadge", "onClick", "", "more-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface ITextMoreItem extends IIconFontMoreItem {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem$a */
    public static final class C10238a {
        /* renamed from: a */
        public static boolean m42705a(ITextMoreItem iTextMoreItem) {
            return true;
        }

        /* renamed from: b */
        public static String m42706b(ITextMoreItem iTextMoreItem) {
            return "";
        }

        /* renamed from: c */
        public static boolean m42707c(ITextMoreItem iTextMoreItem) {
            return false;
        }
    }

    String getUnableTips();

    boolean isEnable();

    boolean needShowBadge();

    void onClick();
}
