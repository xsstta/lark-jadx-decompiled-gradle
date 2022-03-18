package com.ss.android.lark.chat.entity.chatter;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/entity/chatter/TagType;", "", "Ljava/io/Serializable;", "order", "", "bgColor", "textColor", "(Ljava/lang/String;IIII)V", "getBgColor", "()I", "getOrder", "getTextColor", GrsBaseInfo.CountryCodeSource.UNKNOWN, "CLASS_TEACHER", "DISCIPLINE_TEACHER", "CLASS", "ADMIN_USER", "EDU", "KA", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum TagType implements Serializable {
    UNKNOWN(0, R.color.udtoken_tag_neutral_bg_normal, R.color.udtoken_tag_neutral_text_normal),
    CLASS_TEACHER(100, R.color.udtoken_tag_bg_blue, R.color.udtoken_tag_text_s_blue),
    DISCIPLINE_TEACHER(100, R.color.udtoken_tag_bg_turquoise, R.color.udtoken_tag_text_s_turquoise),
    CLASS(0, R.color.udtoken_tag_bg_wathet, R.color.udtoken_tag_text_s_wathet),
    ADMIN_USER(50, R.color.udtoken_tag_bg_purple, R.color.udtoken_tag_text_s_purple),
    EDU(0, R.color.udtoken_tag_bg_blue, R.color.udtoken_tag_text_s_blue),
    KA(0, R.color.udtoken_tag_bg_red, R.color.udtoken_tag_text_s_red);
    
    private final int bgColor;
    private final int order;
    private final int textColor;

    public final int getBgColor() {
        return this.bgColor;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    private TagType(int i, int i2, int i3) {
        this.order = i;
        this.bgColor = i2;
        this.textColor = i3;
    }
}
