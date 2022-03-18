package com.larksuite.component.universe_design.checkbox;

import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.checkbox.a */
public final /* synthetic */ class C25728a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f63141a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f63142b;

    static {
        int[] iArr = new int[UDCheckBox.CheckBoxSize.values().length];
        f63141a = iArr;
        iArr[UDCheckBox.CheckBoxSize.SMALL_SIZE.ordinal()] = 1;
        iArr[UDCheckBox.CheckBoxSize.NORMAL_SIZE.ordinal()] = 2;
        int[] iArr2 = new int[UDCheckBox.CheckBoxType.values().length];
        f63142b = iArr2;
        iArr2[UDCheckBox.CheckBoxType.CHECK_BOX.ordinal()] = 1;
        iArr2[UDCheckBox.CheckBoxType.RADIO.ordinal()] = 2;
        iArr2[UDCheckBox.CheckBoxType.CHECK_MARK.ordinal()] = 3;
    }
}
