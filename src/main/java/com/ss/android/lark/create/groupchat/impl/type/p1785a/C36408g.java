package com.ss.android.lark.create.groupchat.impl.type.p1785a;

import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.impl.type.fragment.TypeSelectorFragmentView;
import com.ss.android.lark.create.groupchat.impl.widget.GroupModeSelector;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.type.a.g */
public final /* synthetic */ class C36408g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f93938a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f93939b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f93940c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f93941d;

    static {
        int[] iArr = new int[GroupModeSelector.SelectedStatus.values().length];
        f93938a = iArr;
        iArr[GroupModeSelector.SelectedStatus.LEFT_SELECTED.ordinal()] = 1;
        iArr[GroupModeSelector.SelectedStatus.MIDDLE_SELECTED.ordinal()] = 2;
        iArr[GroupModeSelector.SelectedStatus.RIGHT_SELECTED.ordinal()] = 3;
        int[] iArr2 = new int[GroupModeSelector.SelectedStatus.values().length];
        f93939b = iArr2;
        iArr2[GroupModeSelector.SelectedStatus.LEFT_SELECTED.ordinal()] = 1;
        iArr2[GroupModeSelector.SelectedStatus.MIDDLE_SELECTED.ordinal()] = 2;
        iArr2[GroupModeSelector.SelectedStatus.RIGHT_SELECTED.ordinal()] = 3;
        int[] iArr3 = new int[CreateGroupMode.values().length];
        f93940c = iArr3;
        iArr3[CreateGroupMode.CONVERSATION_MODE.ordinal()] = 1;
        iArr3[CreateGroupMode.SECRET_MODE.ordinal()] = 2;
        iArr3[CreateGroupMode.TOPIC_MODE.ordinal()] = 3;
        int[] iArr4 = new int[TypeSelectorFragmentView.ChatUIMode.values().length];
        f93941d = iArr4;
        iArr4[TypeSelectorFragmentView.ChatUIMode.NORMAL.ordinal()] = 1;
        iArr4[TypeSelectorFragmentView.ChatUIMode.NORMAL_NO_TITLE.ordinal()] = 2;
        iArr4[TypeSelectorFragmentView.ChatUIMode.ONLY.ordinal()] = 3;
        iArr4[TypeSelectorFragmentView.ChatUIMode.DISMISS.ordinal()] = 4;
    }
}
