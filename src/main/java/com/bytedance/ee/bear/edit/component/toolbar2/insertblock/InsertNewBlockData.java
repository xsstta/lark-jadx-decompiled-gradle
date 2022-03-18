package com.bytedance.ee.bear.edit.component.toolbar2.insertblock;

import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u00064"}, d2 = {"Lcom/bytedance/ee/bear/edit/component/toolbar2/insertblock/InsertNewBlockData;", "", "iconId", "", "key", "", "shouldShowInputMethodAfterClick", "", "backgroundColorId", "iconColorId", "(Ljava/lang/String;IILjava/lang/String;ZII)V", "getBackgroundColorId", "()I", "setBackgroundColorId", "(I)V", "getIconColorId", "setIconColorId", "getIconId", "setIconId", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getShouldShowInputMethodAfterClick", "()Z", "setShouldShowInputMethodAfterClick", "(Z)V", "h1", "h2", "h3", "h4", "h5", "h6", "h7", "h8", "h9", "orderedList", "unorderedList", "checkbox", "codeList", "blockQuote", "insertImage", "insertTable", "insertFile", "insertSeparator", "mentionUser", "mentionChat", "mentionFile", "equation", "calloutBlock", "insertCalendar", "insertReminder", "edit-component_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum InsertNewBlockData {
    h1(R.drawable.ud_icon_h1_outlined, "h1", true, 0, R.color.icon_n1),
    h2(R.drawable.ud_icon_h2_outlined, "h2", true, 0, R.color.icon_n1),
    h3(R.drawable.ud_icon_h3_outlined, "h3", true, 0, R.color.icon_n1),
    h4(R.drawable.ud_icon_h4_outlined, "h4", true, 0, R.color.icon_n1),
    h5(R.drawable.ud_icon_h5_outlined, "h5", true, 0, R.color.icon_n1),
    h6(R.drawable.ud_icon_h6_outlined, "h6", true, 0, R.color.icon_n1),
    h7(R.drawable.ud_icon_h7_outlined, "h7", true, 0, R.color.icon_n1),
    h8(R.drawable.ud_icon_h8_outlined, "h8", true, 0, R.color.icon_n1),
    h9(R.drawable.ud_icon_h9_outlined, "h9", true, 0, R.color.icon_n1),
    orderedList(R.drawable.ud_icon_order_list_outlined, "orderedList", true, 0, R.color.icon_n1),
    unorderedList(R.drawable.ud_icon_disorder_list_outlined, "unorderedList", true, 0, R.color.icon_n1),
    checkbox(R.drawable.ud_icon_todo_outlined, "checkbox", true, 0, R.color.icon_n1),
    codeList(R.drawable.ud_icon_codeblock_outlined, "codeList", true, 0, R.color.icon_n1),
    blockQuote(R.drawable.ud_icon_reference_outlined, "blockQuote", true, 0, R.color.icon_n1),
    insertImage(R.drawable.ud_icon_image_outlined, "insertImage", false, R.color.ud_Y50, R.color.ud_Y500),
    insertTable(R.drawable.ud_icon_borders_outlined, "insertTable", true, R.color.ud_T50, R.color.ud_T500),
    insertFile(R.drawable.ud_icon_attachment_outlined, "insertFile", true, R.color.ud_O50, R.color.ud_O500),
    insertSeparator(R.drawable.ud_icon_divider_outlined, "insertSeparator", true, R.color.ud_I50, R.color.ud_I500),
    mentionUser(R.drawable.ud_icon_member_outlined, "mentionUser", true, R.color.ud_B50, R.color.ud_B500),
    mentionChat(R.drawable.ud_icon_group_card_outlined, "mentionChat", true, R.color.ud_W50, R.color.ud_W500),
    mentionFile(R.drawable.ud_icon_space_outlined, "mentionFile", true, R.color.ud_B50, R.color.ud_B500),
    equation(R.drawable.ud_icon_latex_outlined, "equation", false, 0, 0, 28, null),
    calloutBlock(R.drawable.ud_icon_callout_outlined, "calloutBlock", true, R.color.ud_Y50, R.color.ud_Y500),
    insertCalendar(R.drawable.ud_icon_calendar_line_outlined, "insertCalendar", true, R.color.ud_O50, R.color.ud_O500),
    insertReminder(R.drawable.ud_icon_alarm_clock_outlined, "insertReminder", true, R.color.ud_B50, R.color.ud_B500);
    
    private int backgroundColorId;
    private int iconColorId;
    private int iconId;
    private String key;
    private boolean shouldShowInputMethodAfterClick;

    public final int getBackgroundColorId() {
        return this.backgroundColorId;
    }

    public final int getIconColorId() {
        return this.iconColorId;
    }

    public final int getIconId() {
        return this.iconId;
    }

    public final String getKey() {
        return this.key;
    }

    public final boolean getShouldShowInputMethodAfterClick() {
        return this.shouldShowInputMethodAfterClick;
    }

    public final void setBackgroundColorId(int i) {
        this.backgroundColorId = i;
    }

    public final void setIconColorId(int i) {
        this.iconColorId = i;
    }

    public final void setIconId(int i) {
        this.iconId = i;
    }

    public final void setShouldShowInputMethodAfterClick(boolean z) {
        this.shouldShowInputMethodAfterClick = z;
    }

    public final void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }

    private InsertNewBlockData(int i, String str, boolean z, int i2, int i3) {
        this.iconId = i;
        this.key = str;
        this.shouldShowInputMethodAfterClick = z;
        this.backgroundColorId = i2;
        this.iconColorId = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* synthetic */ InsertNewBlockData(int r12, java.lang.String r13, boolean r14, int r15, int r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r17 & 4
            if (r0 == 0) goto L_0x0007
            r0 = 1
            r6 = 1
            goto L_0x0008
        L_0x0007:
            r6 = r14
        L_0x0008:
            r0 = r17 & 8
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r7 = 0
            goto L_0x0010
        L_0x000f:
            r7 = r15
        L_0x0010:
            r0 = r17 & 16
            if (r0 == 0) goto L_0x0016
            r8 = 0
            goto L_0x0018
        L_0x0016:
            r8 = r16
        L_0x0018:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.InsertNewBlockData.<init>(java.lang.String, int, int, java.lang.String, boolean, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
