package com.ss.android.lark.moments.impl.common.widget.keyboard.at;

import android.app.Activity;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.widget.AutoCompleteTextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtDependency;", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency;", "activity", "Landroid/app/Activity;", "api", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/IMomentsGetIdentityTypeApi;", "(Landroid/app/Activity;Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/IMomentsGetIdentityTypeApi;)V", "getActivity", "()Landroid/app/Activity;", "getApi", "()Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/IMomentsGetIdentityTypeApi;", "getAtInputResultStatus", "", "chatId", "", "isClickAtBtn", "", "isDisableAtFunction", "parseAtSelectorResult", "", "Lcom/ss/android/lark/keyboard/plugin/tool/at/IAtDependency$ChatterInfo;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "startAtSelectList", "", "requestCode", "editText", "Landroid/widget/AutoCompleteTextView;", "listener", "Landroid/preference/PreferenceManager$OnActivityResultListener;", "startAtSelector", "stopAtSelectList", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.c */
public final class MomentsAtDependency implements IAtDependency {

    /* renamed from: a */
    private final Activity f119318a;

    /* renamed from: b */
    private final IMomentsGetIdentityTypeApi f119319b;

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public int mo127064a(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        return z ? 1 : 0;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public void mo127066a() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public List<IAtDependency.ChatterInfo> mo127065a(Intent intent) {
        Serializable serializable;
        if (intent != null) {
            serializable = intent.getSerializableExtra("chatter_info");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            SearchBaseInfo searchBaseInfo = (SearchBaseInfo) serializable;
            ArrayList arrayList = new ArrayList();
            String title = searchBaseInfo.getTitle();
            Intrinsics.checkExpressionValueIsNotNull(title, "info.title");
            String id = searchBaseInfo.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "info.id");
            arrayList.add(new IAtDependency.ChatterInfo(id, title, false, false));
            return arrayList;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public void mo127067a(int i) {
        int i2;
        if (this.f119319b.mo166275a() == MomentsPublishViewModel.IdentityType.NORMAL) {
            this.f119318a.startActivityForResult(new Intent(this.f119318a, MomentsAtSelectActivity.class), i);
            return;
        }
        Activity activity = this.f119318a;
        if (this.f119319b.mo166275a() == MomentsPublishViewModel.IdentityType.ANONYMOUS) {
            i2 = R.string.Lark_Community_UnableAnonymousMentionToast;
        } else {
            i2 = R.string.Lark_Community_UnableNicknameMentionToast;
        }
        LKUIToast.show(this.f119318a, UIUtils.getString(activity, i2));
    }

    public MomentsAtDependency(Activity activity, IMomentsGetIdentityTypeApi aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "api");
        this.f119318a = activity;
        this.f119319b = aVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.at.IAtDependency
    /* renamed from: a */
    public void mo127068a(int i, AutoCompleteTextView autoCompleteTextView, PreferenceManager.OnActivityResultListener onActivityResultListener) {
        int i2;
        Intrinsics.checkParameterIsNotNull(autoCompleteTextView, "editText");
        Intrinsics.checkParameterIsNotNull(onActivityResultListener, "listener");
        if (this.f119319b.mo166275a() == MomentsPublishViewModel.IdentityType.NORMAL) {
            this.f119318a.startActivityForResult(new Intent(this.f119318a, MomentsAtSelectActivity.class), i);
            return;
        }
        Activity activity = this.f119318a;
        if (this.f119319b.mo166275a() == MomentsPublishViewModel.IdentityType.ANONYMOUS) {
            i2 = R.string.Lark_Community_UnableAnonymousMentionToast;
        } else {
            i2 = R.string.Lark_Community_UnableNicknameMentionToast;
        }
        LKUIToast.show(this.f119318a, UIUtils.getString(activity, i2));
    }
}
