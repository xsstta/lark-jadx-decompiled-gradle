package com.ss.android.lark.chatsetting.impl.group.ownership.applicant;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplyDialogUtil;", "", "()V", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.i */
public final class ApplyDialogUtil {

    /* renamed from: a */
    public static final Companion f89614a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplyDialogUtil$Companion;", "", "()V", "showChatChatterApplyDialog", "", "context", "Landroid/content/Context;", "way", "Lcom/ss/android/lark/biz/im/api/ChatSettingApplyWay;", "confirmListener", "Lcom/ss/android/lark/biz/im/api/ChatSettingApplyDialogConfirmClickListener;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/applicant/ApplyDialogUtil$Companion$showChatChatterApplyDialog$1", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder$LifecycleCallback;", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "onCreated", "", "dialog", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.i$a$a */
        public static final class C34705a extends C25639g.AbstractC25641b<DialogC25637f> {

            /* renamed from: a */
            final /* synthetic */ Ref.ObjectRef f89615a;

            /* renamed from: b */
            final /* synthetic */ Context f89616b;

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: b */
            public void mo89274b(DialogC25637f fVar) {
                super.mo89274b(fVar);
                TextView textView = null;
                this.f89615a.element = fVar != null ? (T) ((EditText) fVar.findViewById(R.id.mReasonEt)) : null;
                T t = this.f89615a.element;
                if (t != null) {
                    t.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
                }
                if (fVar != null) {
                    textView = (TextView) fVar.findViewById(R.id.mDescTv);
                }
                if (textView != null) {
                    textView.setText(UIUtils.getString(this.f89616b, R.string.Lark_Legacy_MembershipApprovalEnabledPlaceholder));
                }
            }

            C34705a(Ref.ObjectRef objectRef, Context context) {
                this.f89615a = objectRef;
                this.f89616b = context;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "iDialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.applicant.i$a$b */
        public static final class DialogInterface$OnClickListenerC34706b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC29611c f89617a;

            /* renamed from: b */
            final /* synthetic */ Ref.ObjectRef f89618b;

            /* renamed from: c */
            final /* synthetic */ Ref.ObjectRef f89619c;

            DialogInterface$OnClickListenerC34706b(AbstractC29611c cVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
                this.f89617a = cVar;
                this.f89618b = objectRef;
                this.f89619c = objectRef2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                View view;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                AbstractC29611c cVar = this.f89617a;
                T t = this.f89618b.element;
                Editable editable = null;
                if (t != null) {
                    view = t.mo89219b();
                } else {
                    view = null;
                }
                T t2 = this.f89619c.element;
                if (t2 != null) {
                    editable = t2.getText();
                }
                cVar.onClick(view, String.valueOf(editable));
            }
        }

        /* renamed from: a */
        public final void mo128146a(Context context, ChatSettingApplyWay chatSettingApplyWay, AbstractC29611c cVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(chatSettingApplyWay, "way");
            Intrinsics.checkParameterIsNotNull(cVar, "confirmListener");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) null;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = (T) null;
            new C25639g(context).mo89258q(R.layout.group_applicant_dialog).mo89265x(R.style.UtilsPopDialog).mo89258q(R.layout.group_applicant_dialog).mo89230a(new C34705a(objectRef, context)).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_Confirm, new DialogInterface$OnClickListenerC34706b(cVar, objectRef2, objectRef)).mo89233b().show();
        }
    }
}
