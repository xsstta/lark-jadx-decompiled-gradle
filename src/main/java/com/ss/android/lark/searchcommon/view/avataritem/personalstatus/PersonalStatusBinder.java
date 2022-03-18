package com.ss.android.lark.searchcommon.view.avataritem.personalstatus;

import android.text.TextUtils;
import android.widget.ImageView;
import com.larksuite.component.ui.list.IComponentBinder;
import com.ss.android.lark.reaction.p2557b.C52977a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/personalstatus/PersonalStatusBinder;", "Lcom/larksuite/component/ui/list/IComponentBinder;", "Landroid/widget/ImageView;", "Lcom/ss/android/lark/searchcommon/view/avataritem/personalstatus/PersonalStatus;", "()V", "bind", "", "view", "model", "unbind", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.d.b */
public final class PersonalStatusBinder implements IComponentBinder<ImageView, PersonalStatus> {

    /* renamed from: a */
    public static final PersonalStatusBinder f133533a = new PersonalStatusBinder();

    private PersonalStatusBinder() {
    }

    /* renamed from: a */
    public void mo88913a(ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo88915a(ImageView imageView, PersonalStatus aVar) {
        Intrinsics.checkParameterIsNotNull(imageView, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        if (!TextUtils.isEmpty(aVar.mo184716a())) {
            imageView.setVisibility(0);
            C52977a.m205190a().mo180995a(imageView, aVar.mo184716a());
            return;
        }
        imageView.setVisibility(8);
    }
}
