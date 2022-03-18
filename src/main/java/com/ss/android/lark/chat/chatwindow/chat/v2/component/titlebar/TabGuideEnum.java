package com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Init of enum DOC_SPACE can be incorrect */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TabGuideEnum;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "title", "", "detail", "(Ljava/lang/String;ILcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;Ljava/lang/String;Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "getTitle", "getType", "()Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "DOC_SPACE", GrsBaseInfo.CountryCodeSource.UNKNOWN, "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum TabGuideEnum {
    DOC_SPACE(r4, r5, r6),
    UNKNOWN(ChatTab.ChatTabType.UNKNOWN, "", "");
    
    public static final Companion Companion = new Companion(null);
    private final String detail;
    private final String title;
    private final ChatTab.ChatTabType type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TabGuideEnum$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/titlebar/TabGuideEnum;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "valueOf", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.titlebar.TabGuideEnum$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ChatTab.ChatTabType getType() {
        return this.type;
    }

    static {
        ChatTab.ChatTabType chatTabType = ChatTab.ChatTabType.DOC_SPACE;
        Intrinsics.checkExpressionValueIsNotNull(UIHelper.getString(R.string.Lark_Onboarding_GroupAddTabsTitle), "UIHelper.getString(R.str…arding_GroupAddTabsTitle)");
        Intrinsics.checkExpressionValueIsNotNull(UIHelper.getString(R.string.Lark_Onboarding_GroupAddTabsDesc), "UIHelper.getString(R.str…oarding_GroupAddTabsDesc)");
    }

    private TabGuideEnum(ChatTab.ChatTabType chatTabType, String str, String str2) {
        this.type = chatTabType;
        this.title = str;
        this.detail = str2;
    }
}
