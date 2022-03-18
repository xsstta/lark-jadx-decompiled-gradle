package com.bytedance.ee.bear.document.customheader;

import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/MenuEnum;", "", "imageResId", "", "imageResTint", "(Ljava/lang/String;III)V", "getImageResId", "()I", "getImageResTint", "doc_embedded_mindnote_exit", "appeal_exit", "smartable_fullscreen_exit", "smartable_fullscreen_more", "smartable_fullscreen_undo", "smartable_fullscreen_redo", "search", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum MenuEnum {
    doc_embedded_mindnote_exit(R.drawable.ud_icon_left_outlined, R.color.facade_selector_icon_n1),
    appeal_exit(R.drawable.ud_icon_left_outlined, R.color.facade_selector_icon_n1),
    smartable_fullscreen_exit(R.drawable.icon_fullscreen_exit_nor, R.color.facade_selector_icon_n1),
    smartable_fullscreen_more(R.drawable.ud_icon_more_outlined, R.color.facade_selector_icon_n1),
    smartable_fullscreen_undo(R.drawable.ud_icon_undo_outlined, R.color.facade_selector_icon_n1),
    smartable_fullscreen_redo(R.drawable.ud_icon_redo_outlined, R.color.facade_selector_icon_n1),
    search(R.drawable.icon_tool_findandreplace_nor, R.color.facade_selector_icon_n1);
    
    private final int imageResId;
    private final int imageResTint;

    public final int getImageResId() {
        return this.imageResId;
    }

    public final int getImageResTint() {
        return this.imageResTint;
    }

    private MenuEnum(int i, int i2) {
        this.imageResId = i;
        this.imageResTint = i2;
    }
}
