package com.ss.android.lark.tab.space.list.mvp.base;

import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000eJ\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "", "onItemClick", "", "viewData", "position", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;I)V", "onItemPartialClick", "partialClickAction", "", "(Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;ILjava/lang/String;)V", "PartialClickAction", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public interface OnItemListener<T extends BaseListViewData> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener$PartialClickAction;", "", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface PartialClickAction {
        public static final Companion Companion = Companion.f136469a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/OnItemListener$PartialClickAction$Companion;", "", "()V", "SPACE_PARTIAL_OPEN_CHAT", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.OnItemListener$PartialClickAction$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f136469a = new Companion();

            private Companion() {
            }
        }
    }

    /* renamed from: a */
    void mo188509a(T t, int i);

    /* renamed from: a */
    void mo188510a(T t, int i, String str);
}
