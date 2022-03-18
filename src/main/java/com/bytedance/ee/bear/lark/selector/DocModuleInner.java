package com.bytedance.ee.bear.lark.selector;

import android.text.TextUtils;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.DocType;

public class DocModuleInner {

    public @interface DocIconColor {
    }

    /* renamed from: a */
    public static int m32268a(DocType docType) {
        int i = C80651.f21593a[docType.ordinal()];
        if (i == 2) {
            return R.drawable.ic_svg_filter_doc_sheet;
        }
        if (i == 3) {
            return R.drawable.ic_svg_filter_doc_bitable;
        }
        if (i == 4) {
            return R.drawable.ic_svg_filter_doc_mindnote;
        }
        if (i == 5) {
            return R.drawable.ic_svg_filter_doc_file;
        }
        if (i != 6) {
            return R.drawable.ic_svg_filter_doc_doc;
        }
        return R.drawable.ic_svg_filter_doc_slide;
    }

    /* renamed from: b */
    public static int m32272b(DocType docType) {
        int i = C80651.f21593a[docType.ordinal()];
        if (i == 1) {
            return R.drawable.icon_doc_mini_doc;
        }
        if (i == 2) {
            return R.drawable.icon_doc_mini_sheet;
        }
        if (i == 3) {
            return R.drawable.icon_doc_mini_bitable;
        }
        if (i == 4) {
            return R.drawable.icon_doc_mini_mindnote;
        }
        if (i != 6) {
            return 0;
        }
        return R.drawable.icon_doc_mini_slide;
    }

    /* renamed from: a */
    public static int m32271a(DocType docType, String str) {
        return m32270a(docType, DocType.UNKNOWN_DOC_TYPE, str);
    }

    /* renamed from: b */
    public static int m32273b(DocType docType, String str) {
        if (docType == null) {
            return R.drawable.ud_icon_wiki_unknow_circle_colorful;
        }
        int i = -1;
        int i2 = C80651.f21593a[docType.ordinal()];
        if (i2 == 1) {
            i = 2;
        } else if (i2 == 2) {
            i = 3;
        } else if (i2 == 3) {
            i = 8;
        } else if (i2 == 4) {
            i = 11;
        } else if (i2 == 5) {
            i = 12;
        } else if (i2 == 7) {
            i = 22;
        }
        return C7713a.m30839a(i, str);
    }

    /* renamed from: a */
    public static int m32269a(DocType docType, int i) {
        switch (docType) {
            case SHEET:
                if (i == 2) {
                    return R.drawable.ic_svg_doc_sheet_inline_gray;
                }
                if (i == 0) {
                    return R.drawable.ic_svg_doc_sheet_inline_blue;
                }
                if (i == 3) {
                    return R.drawable.ic_svg_doc_sheet_inline_blue_light;
                }
                return R.drawable.ic_svg_doc_sheet_inline_white;
            case BITABLE:
                if (i == 2) {
                    return R.drawable.ic_svg_doc_bitable_inline_gray;
                }
                if (i == 0) {
                    return R.drawable.ic_svg_doc_bitable_inline_blue;
                }
                if (i == 3) {
                    return R.drawable.ic_svg_doc_bitable_inline_blue_light;
                }
                return R.drawable.ic_svg_doc_bitable_inline_white;
            case MINDNOTE:
                if (i == 2) {
                    return R.drawable.ic_svg_doc_mindnode_inline_gray;
                }
                if (i == 0) {
                    return R.drawable.ic_svg_doc_mindnode_inline_blue;
                }
                if (i == 3) {
                    return R.drawable.ic_svg_doc_mindnode_inline_blue_light;
                }
                return R.drawable.ic_svg_doc_mindnode_inline_white;
            case FILE:
                if (i == 2) {
                    return R.drawable.ic_svg_doc_file_inline_gray;
                }
                if (i == 0) {
                    return R.drawable.ic_svg_doc_file_inline_blue;
                }
                if (i == 3) {
                    return R.drawable.ic_svg_doc_file_inline_blue_light;
                }
                return R.drawable.ic_svg_doc_file_inline_white;
            case SLIDE:
                if (i == 2) {
                    return R.drawable.ic_svg_doc_slide_inline_gray;
                }
                if (i == 0) {
                    return R.drawable.ic_svg_doc_slide_inline_blue;
                }
                if (i == 3) {
                    return R.drawable.ic_svg_doc_slide_inline_blue_light;
                }
                return R.drawable.ic_svg_doc_slide_inline_white;
            case DOCX:
                if (i == 2) {
                    return R.drawable.ic_svg_doc_docx_inline_gray;
                }
                if (i == 0) {
                    return R.drawable.ic_svg_doc_docx_inline_blue;
                }
                if (i == 3) {
                    return R.drawable.ic_svg_doc_docx_inline_blue_light;
                }
                return R.drawable.ic_svg_doc_docx_inline_white;
            default:
                if (i == 2) {
                    return R.drawable.ic_svg_doc_doc_inline_gray;
                }
                if (i == 0) {
                    return R.drawable.ic_svg_doc_doc_inline_blue;
                }
                if (i == 3) {
                    return R.drawable.ic_svg_doc_doc_inline_blue_light;
                }
                return R.drawable.ic_svg_doc_doc_inline_white;
        }
    }

    /* renamed from: a */
    public static int m32270a(DocType docType, DocType docType2, String str) {
        if (docType == null) {
            return R.drawable.ud_icon_file_round_doc_colorful;
        }
        switch (C80651.f21593a[docType.ordinal()]) {
            case 1:
                return R.drawable.ud_icon_file_round_doc_colorful;
            case 2:
                return R.drawable.ud_icon_file_round_sheet_colorful;
            case 3:
                return R.drawable.ud_icon_file_round_bitable_colorful;
            case 4:
                return R.drawable.ud_icon_file_round_mindnote_colorful;
            case 5:
                String g = C26311p.m95287g(str);
                if (!TextUtils.isEmpty(g) && g.contains(".")) {
                    g = g.replace(".", "");
                }
                return C7713a.m30841a(g);
            case 6:
                return R.drawable.ud_icon_file_round_slide_colorful;
            case 7:
                return R.drawable.ud_icon_file_round_docx_colorful;
            case 8:
                return m32273b(docType2, str);
            default:
                return R.drawable.ud_icon_file_round_unknow_colorful;
        }
    }
}
