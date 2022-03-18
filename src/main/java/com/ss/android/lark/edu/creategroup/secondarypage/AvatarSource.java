package com.ss.android.lark.edu.creategroup.secondarypage;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0005R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/secondarypage/AvatarSource;", "", "()V", "ids", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAvatarKey", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.creategroup.secondarypage.a */
public final class AvatarSource {

    /* renamed from: a */
    public static final AvatarSource f94977a = new AvatarSource();

    /* renamed from: b */
    private static final ArrayList<String> f94978b = CollectionsKt.arrayListOf("default-avatar_100f43a5-7dfc-4cba-8eac-93ca9496a96d", "default-avatar_13c2bea9-06d8-4540-a8c2-c8f014dd148a", "default-avatar_44ae0ca3-e140-494b-956f-78091e348435", "default-avatar_0cda3662-875a-4354-94d2-83e7393c7123", "default-avatar_40d1790f-e108-418f-90a6-6a4bba4bf018", "default-avatar_24fc117c-9654-4aab-9e48-0ada1d20f0b6", "default-avatar_505bdec1-3019-492d-8a4e-0b0af1e238c8", "default-avatar_9fb72564-d52a-49b0-9de8-f79071a02286");

    private AvatarSource() {
    }

    /* renamed from: a */
    public final String mo136369a() {
        ArrayList<String> arrayList = f94978b;
        String str = arrayList.get(((int) (Math.random() * ((double) 100))) % arrayList.size());
        Intrinsics.checkExpressionValueIsNotNull(str, "ids[pos]");
        return str;
    }
}
