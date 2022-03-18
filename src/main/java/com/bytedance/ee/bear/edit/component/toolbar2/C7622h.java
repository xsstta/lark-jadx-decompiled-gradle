package com.bytedance.ee.bear.edit.component.toolbar2;

import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.h */
public class C7622h {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.h$1 */
    public static /* synthetic */ class C76231 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20690a;

        /* renamed from: b */
        static final /* synthetic */ int[] f20691b;

        /* renamed from: c */
        static final /* synthetic */ int[] f20692c;

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|(3:67|68|70)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|70) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00bb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0100 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x010c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0124 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0130 */
        static {
            /*
            // Method dump skipped, instructions count: 317
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.edit.component.toolbar2.C7622h.C76231.<clinit>():void");
        }
    }

    /* renamed from: a */
    protected static int m30581a(ItemIdV2 itemIdV2) {
        if (itemIdV2 instanceof ToolbarPrimaryItemId.BlockTransformSecondaryItemId) {
            return m30583a((ToolbarPrimaryItemId.BlockTransformSecondaryItemId) itemIdV2);
        }
        if (itemIdV2 instanceof ToolbarPrimaryItemId.TextTransformSecondaryItemId) {
            return m30584a((ToolbarPrimaryItemId.TextTransformSecondaryItemId) itemIdV2);
        }
        if (itemIdV2 instanceof ToolbarPrimaryItemId.AlignTransformSecondaryItemId) {
            return m30582a((ToolbarPrimaryItemId.AlignTransformSecondaryItemId) itemIdV2);
        }
        return 0;
    }

    /* renamed from: a */
    private static int m30582a(ToolbarPrimaryItemId.AlignTransformSecondaryItemId alignTransformSecondaryItemId) {
        int i = C76231.f20692c[alignTransformSecondaryItemId.ordinal()];
        if (i == 1) {
            return R.drawable.ud_icon_reduce_indentation_outlined;
        }
        if (i == 2) {
            return R.drawable.ud_icon_increase_indentation_outlined;
        }
        if (i == 3) {
            return R.drawable.ud_icon_left_alignment_outlined;
        }
        if (i == 4) {
            return R.drawable.ud_icon_center_alignment_outlined;
        }
        if (i != 5) {
            return 0;
        }
        return R.drawable.ud_icon_right_alignment_outlined;
    }

    /* renamed from: a */
    private static int m30583a(ToolbarPrimaryItemId.BlockTransformSecondaryItemId blockTransformSecondaryItemId) {
        switch (C76231.f20690a[blockTransformSecondaryItemId.ordinal()]) {
            case 1:
                return R.drawable.ic_svg_doc_plain_text_icon;
            case 2:
                return R.drawable.ud_icon_h1_outlined;
            case 3:
                return R.drawable.ud_icon_h2_outlined;
            case 4:
                return R.drawable.ud_icon_h3_outlined;
            case 5:
                return R.drawable.ud_icon_h4_outlined;
            case 6:
                return R.drawable.ud_icon_h5_outlined;
            case 7:
                return R.drawable.ud_icon_h6_outlined;
            case 8:
                return R.drawable.ud_icon_h7_outlined;
            case 9:
                return R.drawable.ud_icon_h8_outlined;
            case 10:
                return R.drawable.ud_icon_h9_outlined;
            case 11:
                return R.drawable.ud_icon_todo_outlined;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                return R.drawable.ud_icon_disorder_list_outlined;
            case 13:
                return R.drawable.ud_icon_order_list_outlined;
            case 14:
                return R.drawable.ud_icon_codeblock_outlined;
            case 15:
                return R.drawable.ud_icon_reference_outlined;
            case 16:
                return R.drawable.ud_icon_divider_outlined;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static int m30584a(ToolbarPrimaryItemId.TextTransformSecondaryItemId textTransformSecondaryItemId) {
        switch (C76231.f20691b[textTransformSecondaryItemId.ordinal()]) {
            case 1:
                return R.drawable.ud_icon_bold_outlined;
            case 2:
                return R.drawable.ud_icon_italic_outlined;
            case 3:
                return R.drawable.ud_icon_underline_outlined;
            case 4:
                return R.drawable.ud_icon_horizontal_line_outlined;
            case 5:
                return R.drawable.ud_icon_fontcolor_outlined;
            case 6:
                return R.drawable.ud_icon_code_outlined;
            default:
                return 0;
        }
    }
}
