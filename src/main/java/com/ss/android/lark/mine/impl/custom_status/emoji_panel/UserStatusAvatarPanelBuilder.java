package com.ss.android.lark.mine.impl.custom_status.emoji_panel;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.ss.android.lark.mine.impl.custom_status.emoji_panel.UserStatusAvatarPanelController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "avatarKeyList", "", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "getAvatarKeyList", "()Ljava/util/List;", "setAvatarKeyList", "(Ljava/util/List;)V", "clickListener", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;", "getClickListener", "()Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;", "setClickListener", "(Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/UserStatusAvatarPanelController$OnAvatarItemClickListener;)V", "recommendSize", "", "getRecommendSize", "()I", "setRecommendSize", "(I)V", "avatarItemClickListener", "listener", "avatarItems", "values", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.c */
public final class UserStatusAvatarPanelBuilder extends UDBaseDialogBuilder<UserStatusAvatarPanelBuilder> {

    /* renamed from: a */
    private List<AvatarViewData> f115088a = new ArrayList();

    /* renamed from: b */
    private UserStatusAvatarPanelController.OnAvatarItemClickListener f115089b;

    /* renamed from: c */
    private int f115090c;

    /* renamed from: a */
    public final List<AvatarViewData> mo160450a() {
        return this.f115088a;
    }

    /* renamed from: b */
    public final UserStatusAvatarPanelController.OnAvatarItemClickListener mo160451b() {
        return this.f115089b;
    }

    /* renamed from: c */
    public final int mo160452c() {
        return this.f115090c;
    }

    /* renamed from: a */
    public final UserStatusAvatarPanelBuilder mo160447a(int i) {
        UserStatusAvatarPanelBuilder cVar = this;
        cVar.f115090c = i;
        return cVar;
    }

    /* renamed from: a */
    public final UserStatusAvatarPanelBuilder mo160448a(UserStatusAvatarPanelController.OnAvatarItemClickListener bVar) {
        UserStatusAvatarPanelBuilder cVar = this;
        cVar.f115089b = bVar;
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStatusAvatarPanelBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        controller(new UserStatusAvatarPanelController(context));
    }

    /* renamed from: a */
    public final UserStatusAvatarPanelBuilder mo160449a(List<AvatarViewData> list) {
        Intrinsics.checkParameterIsNotNull(list, "values");
        UserStatusAvatarPanelBuilder cVar = this;
        List<AvatarViewData> list2 = cVar.f115088a;
        list2.clear();
        list2.addAll(list);
        return cVar;
    }
}
