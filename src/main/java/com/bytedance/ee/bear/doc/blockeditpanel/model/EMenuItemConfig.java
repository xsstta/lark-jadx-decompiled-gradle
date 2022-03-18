package com.bytedance.ee.bear.doc.blockeditpanel.model;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

public enum EMenuItemConfig {
    STYLE("style", R.drawable.ud_icon_text_aa_outlined, new C5344a(new C5345b(R.color.ud_N700)), new C5344a(new C5345b(R.color.ud_N600)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_N500, 0.1f))),
    COMMENT(Comment.f24093e, R.drawable.ud_icon_add_comment_outlined, new C5344a(new C5345b(R.color.ud_Y500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_Y600)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_Y500, 0.1f))),
    COPY_LINK("copyLink", R.drawable.icon_global_link_nor, new C5344a(new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_B500, 0.1f))),
    CUT("cut", R.drawable.ud_icon_screenshots_outlined, new C5344a(new C5345b(R.color.ud_G500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_G500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_G500, 0.1f))),
    COPY("copy", R.drawable.ud_icon_copy_outlined, new C5344a(new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_B500, 0.1f))),
    DELETE("delete", R.drawable.ud_icon_delete_trash_outlined, new C5344a(new C5345b(R.color.ud_R500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_R500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_R500, 0.1f))),
    ALIGN("align", R.drawable.ud_icon_typography_outlined, new C5344a(new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_B500, 0.1f))),
    VIEW("view", R.drawable.icon_global_view_outlined, new C5344a(new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_B500, 0.1f))),
    DEBUG_BLOCK("DEBUG_BLOCK", R.drawable.icon_calendar_tittle_outlined, new C5344a(new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_B500, 0.1f))),
    REFRESH_BLOCK("REFRESH_BLOCK", R.drawable.icon_replace_outlined, new C5344a(new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_B500)), new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_B500, 0.1f))),
    SEPARATOR("separator"),
    PlainText("plainText", R.drawable.ud_icon_text2_outlined, R.drawable.shape_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H1("h1", R.drawable.ud_icon_h1_outlined, R.drawable.shape_left_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H2("h2", R.drawable.ud_icon_h2_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H3("h3", R.drawable.ud_icon_h3_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H4("h4", R.drawable.ud_icon_h4_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H5("h5", R.drawable.ud_icon_h5_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H6("h6", R.drawable.ud_icon_h6_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H7("h7", R.drawable.ud_icon_h7_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H8("h8", R.drawable.ud_icon_h8_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    H9("h9", R.drawable.ud_icon_h9_outlined, R.drawable.shape_right_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    HN("hn", R.drawable.ud_icon_hn_outlined, R.drawable.shape_right_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    BLOCK_QUOTE("blockquote", R.drawable.ud_icon_reference_outlined, R.drawable.shape_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    CODE_BLOCK("insertcodeblock", R.drawable.ud_icon_codeblock_outlined, R.drawable.shape_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    CHECKBOX("checkbox", R.drawable.ud_icon_todo_outlined, R.drawable.shape_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    ORDERED_LIST("insertorderedlist", R.drawable.ud_icon_order_list_outlined, R.drawable.shape_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    UNORDERED_LIST("insertunorderedlist", R.drawable.ud_icon_disorder_list_outlined, R.drawable.shape_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    BOLD("bold", R.drawable.ud_icon_bold_outlined, R.drawable.shape_left_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    ITALIC("italic", R.drawable.ud_icon_italic_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    UNDERLINE("underline", R.drawable.ud_icon_underline_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    STRIKE_THROUGH("strikethrough", R.drawable.ud_icon_horizontal_line_outlined, R.drawable.shape_right_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    INLINE_CODE("inlinecode", R.drawable.ud_icon_code_outlined, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    HIGHLIGHT("highlight", R.drawable.ud_icon_fontcolor_outlined, R.drawable.shape_left_corners_radius_8, highlightIconBackgroundCSW(), null, downArrowIconBackgroundCSW()),
    BLOCK_BACKGROUND("blockbackground", R.drawable.ud_icon_style_set_outlined, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    INDENT_RIGHT("indentright", R.drawable.ud_icon_increase_indentation_outlined, R.drawable.shape_right_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    INDENT_LEFT("indentleft", R.drawable.ud_icon_reduce_indentation_outlined, R.drawable.shape_left_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    ALIGN_LEFT("alignleft", R.drawable.ud_icon_left_alignment_outlined, R.drawable.shape_left_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    ALIGN_CENTER("aligncenter", R.drawable.ud_icon_center_alignment_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    ALIGN_RIGHT("alignright", R.drawable.ud_icon_right_alignment_outlined, R.drawable.shape_right_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    INDENT_TRANSFORM("indentTransform"),
    TEXT_TRANSFORM("textTransform"),
    ALIGN_TRANSFORM("alignTransform"),
    TEXT_BLOCK_TRANSFORM("textBlockTransform"),
    CARD_VIEW("cardview", R.drawable.icon_tool_card_view_nor, viewPanelIconCSW(), viewPanelTextCSW(), viewPanelBackgroundCSW()),
    TEXT_VIEW("textview", R.drawable.icon_tool_inline_view_nor, viewPanelIconCSW(), viewPanelTextCSW(), viewPanelBackgroundCSW()),
    PREVIEW_VIEW("previewview", R.drawable.icon_tool_preview_view_nor, viewPanelIconCSW(), viewPanelTextCSW(), viewPanelBackgroundCSW()),
    BLOCK_ALIGN_LEFT("blockalignleft", R.drawable.ud_icon_left_alignment_outlined, R.drawable.shape_left_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    BLOCK_ALIGN_CENTER("blockaligncenter", R.drawable.ud_icon_center_alignment_outlined, R.drawable.shape_corners_no_radius, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    BLOCK_ALIGN_RIGHT("blockalignright", R.drawable.ud_icon_right_alignment_outlined, R.drawable.shape_right_corners_radius_8, coloredBgIconCSW(), null, coloredBgIconBackgroundCSW()),
    UNKNOWN("unknown");
    
    private static Map<String, EMenuItemConfig> sMenuItemConfigMap = new HashMap();
    public C5344a backgroundStateColorList;
    public int bgRes = -1;
    public C5344a iconStateColorList;
    public String id;
    public int imageRes = -1;
    public C5344a textStateColorList;

    private static C5344a coloredBgIconBackgroundCSW() {
        return new C5344a(new C5345b(R.color.bg_body_overlay), new C5345b(R.color.fill_pressed, 0.1f), new C5345b(R.color.fill_active, 0.1f), new C5345b(R.color.ud_B900, 0.16f), new C5345b(R.color.bg_body_overlay));
    }

    private static C5344a coloredBgIconCSW() {
        return new C5344a(new C5345b(R.color.icon_n1), new C5345b(R.color.ud_N800), new C5345b(R.color.primary_pri_500), new C5345b(R.color.ud_B500), new C5345b(R.color.ud_N400));
    }

    private static C5344a downArrowIconBackgroundCSW() {
        return new C5344a(new C5345b(R.color.bg_filler), new C5345b(R.color.fill_pressed, 0.1f), new C5345b(R.color.fill_active, 0.15f), new C5345b(R.color.ud_B800, 0.22f), new C5345b(R.color.ud_N300));
    }

    private static C5344a highlightIconBackgroundCSW() {
        return new C5344a(new C5345b(R.color.bg_body_overlay), new C5345b(R.color.fill_pressed, 0.1f), new C5345b(R.color.fill_active, 0.1f), new C5345b(R.color.ud_B900, 0.16f), new C5345b(R.color.ud_N100));
    }

    private static C5344a noColoredBgIconBackgroundCSW() {
        return new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_N900, 0.1f), new C5345b(R.color.ud_B500, 0.1f), new C5345b(R.color.ud_B900, 0.16f), new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED));
    }

    private static C5344a noColoredBgIconCSW() {
        return new C5344a(new C5345b(R.color.ud_N800), new C5345b(R.color.ud_N800), new C5345b(R.color.ud_B500), new C5345b(R.color.ud_B500), new C5345b(R.color.ud_N400));
    }

    private static C5344a viewPanelBackgroundCSW() {
        return new C5344a(new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED), new C5345b(R.color.ud_N900, 0.1f), new C5345b(R.color.ud_B500, 0.1f), new C5345b(R.color.ud_B900, 0.16f), new C5345b(R.color.transparent, BitmapDescriptorFactory.HUE_RED));
    }

    private static C5344a viewPanelIconCSW() {
        return new C5344a(new C5345b(R.color.ud_N800), new C5345b(R.color.ud_N800), new C5345b(R.color.ud_B500), new C5345b(R.color.ud_B500), new C5345b(R.color.ud_N400));
    }

    private static C5344a viewPanelTextCSW() {
        return new C5344a(new C5345b(R.color.ud_N600), new C5345b(R.color.ud_N600), new C5345b(R.color.ud_B500), new C5345b(R.color.ud_B500), new C5345b(R.color.ud_N400));
    }

    static {
        EMenuItemConfig[] values = values();
        for (EMenuItemConfig eMenuItemConfig : values) {
            sMenuItemConfigMap.put(eMenuItemConfig.id, eMenuItemConfig);
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig$a */
    public static class C5344a {

        /* renamed from: a */
        public C5345b f15245a;

        /* renamed from: b */
        public C5345b f15246b;

        /* renamed from: c */
        public C5345b f15247c;

        /* renamed from: d */
        public C5345b f15248d;

        /* renamed from: e */
        public C5345b f15249e;

        public C5344a(C5345b bVar) {
            this.f15249e = bVar;
            this.f15247c = bVar;
            this.f15246b = bVar;
            this.f15248d = bVar;
            this.f15245a = bVar;
        }

        public C5344a(C5345b bVar, C5345b bVar2) {
            this.f15249e = bVar;
            this.f15245a = bVar2;
            this.f15247c = bVar2;
            this.f15248d = bVar2;
            this.f15246b = bVar;
        }

        public C5344a(C5345b bVar, C5345b bVar2, C5345b bVar3, C5345b bVar4, C5345b bVar5) {
            this.f15245a = bVar2;
            this.f15246b = bVar5;
            this.f15248d = bVar4;
            this.f15249e = bVar;
            this.f15247c = bVar3;
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.blockeditpanel.model.EMenuItemConfig$b */
    public static class C5345b {

        /* renamed from: a */
        public int f15250a = -1;

        /* renamed from: b */
        public float f15251b = 1.0f;

        public C5345b(int i) {
            this.f15250a = i;
        }

        public C5345b(int i, float f) {
            this.f15250a = i;
            this.f15251b = f;
        }
    }

    public static EMenuItemConfig getMenuItemConfigById(String str) {
        EMenuItemConfig eMenuItemConfig = sMenuItemConfigMap.get(str);
        if (eMenuItemConfig == null) {
            return UNKNOWN;
        }
        return eMenuItemConfig;
    }

    private EMenuItemConfig(String str) {
        this.id = str;
    }

    private EMenuItemConfig(String str, int i) {
        this.id = str;
        this.imageRes = i;
    }

    private EMenuItemConfig(String str, int i, int i2) {
        this.id = str;
        this.imageRes = i;
        this.bgRes = i2;
    }

    private EMenuItemConfig(String str, int i, C5344a aVar) {
        this.id = str;
        this.imageRes = i;
        this.iconStateColorList = aVar;
    }

    private EMenuItemConfig(String str, int i, int i2, C5344a aVar) {
        this.id = str;
        this.imageRes = i;
        this.bgRes = i2;
        this.iconStateColorList = aVar;
    }

    private EMenuItemConfig(String str, int i, C5344a aVar, C5344a aVar2, C5344a aVar3) {
        this.id = str;
        this.imageRes = i;
        this.iconStateColorList = aVar;
        this.textStateColorList = aVar2;
        this.backgroundStateColorList = aVar3;
    }

    private EMenuItemConfig(String str, int i, int i2, C5344a aVar, C5344a aVar2, C5344a aVar3) {
        this.id = str;
        this.imageRes = i;
        this.bgRes = i2;
        this.iconStateColorList = aVar;
        this.textStateColorList = aVar2;
        this.backgroundStateColorList = aVar3;
    }
}
