package com.ss.android.lark.feed.app.team.p1869a;

import com.bytedance.lark.pb.im.v1.PushItems;
import com.ss.android.lark.team.entity.Item;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.a.f */
public final /* synthetic */ class C37859f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f97108a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f97109b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f97110c;

    static {
        int[] iArr = new int[PushItems.Action.values().length];
        f97108a = iArr;
        iArr[PushItems.Action.UPDATE.ordinal()] = 1;
        iArr[PushItems.Action.DELETE.ordinal()] = 2;
        int[] iArr2 = new int[Item.Type.values().length];
        f97109b = iArr2;
        iArr2[Item.Type.TEAM.ordinal()] = 1;
        iArr2[Item.Type.CHAT.ordinal()] = 2;
        int[] iArr3 = new int[Item.Type.values().length];
        f97110c = iArr3;
        iArr3[Item.Type.TEAM.ordinal()] = 1;
        iArr3[Item.Type.CHAT.ordinal()] = 2;
    }
}
