package com.ss.android.lark.chatsetting.impl.group.info.time;

import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.chatsetting.impl.group.GroupShareUtil;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/IModel;", "chatId", "", "sourceType", "(Ljava/lang/String;Ljava/lang/String;)V", "chatSettingService", "Lcom/ss/android/lark/chatsetting/service/ChatSettingService;", "mInitShareTimeType", "", "getInitShareTimeType", "initData", "", "Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeBean;", "initShareTimeType", "", "saveGroupShareTimeType", ShareHitPoint.f121869d, "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.d */
public final class GroupShareTimeModel extends BaseModel implements IModel {

    /* renamed from: a */
    public static final Companion f89518a = new Companion(null);

    /* renamed from: b */
    private final ChatSettingService f89519b = ChatSettingService.f88988a;

    /* renamed from: c */
    private int f89520c;

    /* renamed from: d */
    private final String f89521d;

    /* renamed from: e */
    private final String f89522e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/info/time/GroupShareTimeModel$Companion;", "", "()V", "PARAMS_GROUP_SHARE_TIME", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.info.time.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.time.IModel
    /* renamed from: c */
    public int mo128061c() {
        return this.f89520c;
    }

    /* renamed from: b */
    public void mo128060b() {
        this.f89520c = this.f89519b.mo127453a(this.f89521d, this.f89522e);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.time.IModel
    /* renamed from: a */
    public List<GroupShareTimeBean> mo128058a() {
        boolean z;
        boolean z2;
        mo128060b();
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        String b = GroupShareUtil.m134455b(0);
        if (this.f89520c == 0) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new GroupShareTimeBean(b, 0, z));
        String b2 = GroupShareUtil.m134455b(1);
        if (1 == this.f89520c) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList.add(new GroupShareTimeBean(b2, 1, z2));
        String b3 = GroupShareUtil.m134455b(2);
        if (2 == this.f89520c) {
            z3 = true;
        }
        arrayList.add(new GroupShareTimeBean(b3, 2, z3));
        return arrayList;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.info.time.IModel
    /* renamed from: a */
    public void mo128059a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f89519b.mo127460a(str, this.f89522e, i);
    }

    public GroupShareTimeModel(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "sourceType");
        this.f89521d = str;
        this.f89522e = str2;
    }
}
