package com.ss.android.lark.tab.space.list.mvp.base.adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u0011*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0001\u0011B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/HighColorDelegate;", "H", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VD", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getExtraWidth", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;)I", "getHighColorMaxWidth", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.d */
public abstract class HighColorDelegate<H extends RecyclerView.ViewHolder, VD extends BaseListViewData> {

    /* renamed from: a */
    public static final Companion f136497a = new Companion(null);

    /* renamed from: b */
    private final Context f136498b;

    /* renamed from: b */
    public abstract int mo188530b(H h, VD vd);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/HighColorDelegate$Companion;", "", "()V", "AVATAR_SIZE_DP", "", "AVATAR_TITLE_MARGIN_DP", "ITEM_MARGIN_END_DP", "ITEM_MARGIN_START_DP", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Context mo188531b() {
        return this.f136498b;
    }

    public HighColorDelegate(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f136498b = context;
    }

    /* renamed from: a */
    public int mo188529a(H h, VD vd) {
        Intrinsics.checkParameterIsNotNull(h, "holder");
        Intrinsics.checkParameterIsNotNull(vd, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int screenWidth = DeviceUtils.getScreenWidth(this.f136498b);
        int dp2px = UIUtils.dp2px(this.f136498b, (float) 32);
        return screenWidth - (((dp2px + UIUtils.dp2px(this.f136498b, (float) 35)) + mo188530b(h, vd)) + UIUtils.dp2px(this.f136498b, (float) 16));
    }
}
