package com.ss.android.lark.searchcommon.view.avataritem.checkbox;

import com.larksuite.component.ui.list.IComponentBinder;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxModel;", "()V", "bind", "", "view", "model", "unbind", "CheckBoxBinderHolder", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.b.a */
public final class CheckBoxBinder implements IComponentBinder<UDCheckBox, CheckBoxModel> {

    /* renamed from: a */
    public static final CheckBoxBinder f133519a = CheckBoxBinderHolder.f133521a.mo184701a();

    /* renamed from: b */
    public static final Companion f133520b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxBinder$CheckBoxBinderHolder;", "", "()V", "instance", "Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxBinder;", "getInstance", "()Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxBinder;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.avataritem.b.a$a */
    private static final class CheckBoxBinderHolder {

        /* renamed from: a */
        public static final CheckBoxBinderHolder f133521a = new CheckBoxBinderHolder();

        /* renamed from: b */
        private static final CheckBoxBinder f133522b = new CheckBoxBinder(null);

        private CheckBoxBinderHolder() {
        }

        /* renamed from: a */
        public final CheckBoxBinder mo184701a() {
            return f133522b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxBinder$Companion;", "", "()V", "instance", "Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxBinder;", "getInstance", "()Lcom/ss/android/lark/searchcommon/view/avataritem/checkbox/CheckBoxBinder;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.avataritem.b.a$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final CheckBoxBinder mo184702a() {
            return CheckBoxBinder.f133519a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CheckBoxBinder() {
    }

    public /* synthetic */ CheckBoxBinder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public void mo88913a(UDCheckBox uDCheckBox) {
        Intrinsics.checkParameterIsNotNull(uDCheckBox, "view");
        uDCheckBox.setVisibility(8);
    }

    /* renamed from: a */
    public void mo88915a(UDCheckBox uDCheckBox, CheckBoxModel bVar) {
        UDCheckBox.CheckBoxType checkBoxType;
        Intrinsics.checkParameterIsNotNull(uDCheckBox, "view");
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        if (bVar.mo184708c()) {
            uDCheckBox.setVisibility(0);
            uDCheckBox.setEnabled(bVar.mo184706b());
            uDCheckBox.setChecked(bVar.mo184704a());
            if (bVar.mo184709d()) {
                checkBoxType = UDCheckBox.CheckBoxType.RADIO;
            } else {
                checkBoxType = UDCheckBox.CheckBoxType.CHECK_BOX;
            }
            uDCheckBox.setType(checkBoxType);
            return;
        }
        uDCheckBox.setVisibility(8);
    }
}
