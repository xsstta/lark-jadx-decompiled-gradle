package com.ss.android.lark.collaboration;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.collaboration.statics.CollaborationHitPoint;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/collaboration/ApplyCollabUtils;", "", "()V", "BlockTipDialog", "Companion", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.collaboration.c */
public final class ApplyCollabUtils {

    /* renamed from: a */
    public static final Companion f91389a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00042\b\b\u0001\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/collaboration/ApplyCollabUtils$Companion;", "", "()V", "EXTRA_KEY_CONTACT_LIST", "", "TAG", "string", "kotlin.jvm.PlatformType", "value", "", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.c$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo130100a(int i) {
            return UIHelper.getString(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/collaboration/ApplyCollabUtils$BlockTipDialog;", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IBlockTipBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callback", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IDialogBuilder$IDialogCallback;", "cancelText", "", "kotlin.jvm.PlatformType", "content", "getContext", "()Landroid/content/Context;", "fromTag", "title", "show", "", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.c$a */
    public static final class BlockTipDialog implements IInitBuilder.IBlockTipBuilder {

        /* renamed from: a */
        public IInitBuilder.IDialogBuilder.IDialogCallback f91390a;

        /* renamed from: b */
        private String f91391b = ApplyCollabUtils.f91389a.mo130100a(R.string.Lark_Legacy_LarkTip);

        /* renamed from: c */
        private String f91392c = ApplyCollabUtils.f91389a.mo130100a(R.string.Lark_NewContacts_CantCallOrVideoMeetingDueToBlock);

        /* renamed from: d */
        private String f91393d = ApplyCollabUtils.f91389a.mo130100a(R.string.Lark_NewContacts_GotItGeneral);

        /* renamed from: e */
        private String f91394e = "";

        /* renamed from: f */
        private final Context f91395f;

        /* renamed from: a */
        public void mo130092a() {
            C25639g gVar = new C25639g(this.f91395f);
            gVar.mo89237b(this.f91391b);
            gVar.mo89251j(2);
            gVar.mo89238b(true);
            gVar.mo89242c(this.f91392c);
            gVar.mo89247e(false);
            gVar.mo89245d(0.3f);
            C25639g.C25640a aVar = new C25639g.C25640a();
            aVar.mo89266a(R.id.lkui_dialog_btn_right);
            aVar.mo89271d(R.color.lkui_B500);
            aVar.mo89268a(this.f91393d);
            aVar.mo89267a(new DialogInterface$OnClickListenerC35356a(this));
            gVar.mo89229a(aVar);
            gVar.mo89227a(new DialogInterface$OnDismissListenerC35357b(this));
            gVar.mo89239c();
            CollaborationHitPoint.f91388a.mo130090a(this.f91394e);
        }

        /* renamed from: e */
        public BlockTipDialog mo105552a(String str) {
            BlockTipDialog aVar = this;
            if (str != null) {
                aVar.f91391b = str;
            }
            return aVar;
        }

        /* renamed from: f */
        public BlockTipDialog mo105553b(String str) {
            BlockTipDialog aVar = this;
            if (str != null) {
                aVar.f91392c = str;
            }
            return aVar;
        }

        /* renamed from: g */
        public BlockTipDialog mo105554c(String str) {
            BlockTipDialog aVar = this;
            if (str != null) {
                aVar.f91393d = str;
            }
            return aVar;
        }

        /* renamed from: h */
        public BlockTipDialog mo105555d(String str) {
            BlockTipDialog aVar = this;
            if (str != null) {
                aVar.f91394e = str;
            }
            return aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/ss/android/lark/collaboration/ApplyCollabUtils$BlockTipDialog$show$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.collaboration.c$a$b */
        public static final class DialogInterface$OnDismissListenerC35357b implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ BlockTipDialog f91397a;

            DialogInterface$OnDismissListenerC35357b(BlockTipDialog aVar) {
                this.f91397a = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                IInitBuilder.IDialogBuilder.IDialogCallback aVar = this.f91397a.f91390a;
                if (aVar != null) {
                    aVar.mo105558b();
                }
            }
        }

        /* renamed from: b */
        public BlockTipDialog mo105551a(IInitBuilder.IDialogBuilder.IDialogCallback aVar) {
            BlockTipDialog aVar2 = this;
            if (aVar != null) {
                aVar2.f91390a = aVar;
            }
            return aVar2;
        }

        public BlockTipDialog(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f91395f = context;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/collaboration/ApplyCollabUtils$BlockTipDialog$show$1$1$1", "com/ss/android/lark/collaboration/ApplyCollabUtils$BlockTipDialog$$special$$inlined$apply$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.collaboration.c$a$a */
        public static final class DialogInterface$OnClickListenerC35356a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ BlockTipDialog f91396a;

            DialogInterface$OnClickListenerC35356a(BlockTipDialog aVar) {
                this.f91396a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                IInitBuilder.IDialogBuilder.IDialogCallback aVar = this.f91396a.f91390a;
                if (aVar != null) {
                    aVar.mo105556a();
                }
            }
        }
    }
}
