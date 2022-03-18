package com.bytedance.ee.bear.widgets;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.CompoundButton;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog;", "", "context", "Landroid/content/Context;", "confirmCallBack", "Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$ConfirmCallBack;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$ConfirmCallBack;)V", "getContext", "()Landroid/content/Context;", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "disMissCallBack", "Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$DismissCallBack;", "getDisMissCallBack", "()Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$DismissCallBack;", "setDisMissCallBack", "(Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$DismissCallBack;)V", "isConfirmed", "", "()Z", "setConfirmed", "(Z)V", "isNeedRemind", "mPreference", "Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "showDialog", "", "Companion", "ConfirmCallBack", "DismissCallBack", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.widgets.b */
public final class ConfirmStorageDialog {

    /* renamed from: c */
    public static final String f31832c = f31832c;

    /* renamed from: d */
    public static final Companion f31833d = new Companion(null);

    /* renamed from: i */
    private static final String f31834i = f31834i;

    /* renamed from: a */
    public final PersistenceSharedPreference f31835a = new PersistenceSharedPreference(f31834i);

    /* renamed from: b */
    public ConfirmCallBack f31836b;

    /* renamed from: e */
    private DismissCallBack f31837e;

    /* renamed from: f */
    private boolean f31838f;

    /* renamed from: g */
    private Dialog f31839g;

    /* renamed from: h */
    private final Context f31840h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$ConfirmCallBack;", "", "onContinue", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.b$b */
    public interface ConfirmCallBack {
        void onContinue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$DismissCallBack;", "", "onCancel", "", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.b$c */
    public interface DismissCallBack {
        void onCancel();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/widgets/ConfirmStorageDialog$Companion;", "", "()V", ConfirmStorageDialog.f31832c, "", "PREF_NAME", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final DismissCallBack mo45260a() {
        return this.f31837e;
    }

    /* renamed from: b */
    public final boolean mo45263b() {
        return this.f31838f;
    }

    /* renamed from: c */
    public final Dialog mo45264c() {
        return this.f31839g;
    }

    /* renamed from: d */
    public final void mo45265d() {
        Dialog dialog = this.f31839g;
        if (dialog != null) {
            dialog.show();
        }
    }

    /* renamed from: e */
    private final boolean m49030e() {
        return ((Boolean) this.f31835a.mo34038b(f31832c, true)).booleanValue();
    }

    /* renamed from: a */
    public final void mo45261a(DismissCallBack cVar) {
        this.f31837e = cVar;
    }

    /* renamed from: a */
    public final void mo45262a(boolean z) {
        this.f31838f = z;
    }

    public ConfirmStorageDialog(Context context, ConfirmCallBack bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "confirmCallBack");
        this.f31840h = context;
        this.f31836b = bVar;
        if (m49030e()) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            BearUDCheckBoxDialogBuilder a = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(context).title(R.string.Doc_Widget_Tip)).titleBold(true)).titleGravity(17)).message(R.string.Doc_Widget_StoreFileToSDCard)).messageGravity(8388611)).mo45380a(false);
            String string = context.getString(R.string.Doc_Widget_NotRemind);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Widget_NotRemind)");
            this.f31839g = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) a.mo45379a(string).mo45377a(R.color.text_caption).mo45378a(new CompoundButton.OnCheckedChangeListener() {
                /* class com.bytedance.ee.bear.widgets.ConfirmStorageDialog.C118201 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Intrinsics.checkParameterIsNotNull(compoundButton, "buttonView");
                    booleanRef.element = !z;
                }
            }).addActionButton(R.id.ud_dialog_btn_primary, R.string.Doc_Widget_Continue, new DialogInterface.OnClickListener(this) {
                /* class com.bytedance.ee.bear.widgets.ConfirmStorageDialog.DialogInterface$OnClickListenerC118212 */

                /* renamed from: a */
                final /* synthetic */ ConfirmStorageDialog f31842a;

                {
                    this.f31842a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f31842a.f31835a.mo34037a(ConfirmStorageDialog.f31832c, Boolean.valueOf(booleanRef.element));
                    this.f31842a.f31836b.onContinue();
                    this.f31842a.mo45262a(true);
                }
            })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.CreationMobile_Docs_Cancel_Button, (DialogInterface.OnClickListener) null)).onDismissListener(new DialogInterface.OnDismissListener(this) {
                /* class com.bytedance.ee.bear.widgets.ConfirmStorageDialog.DialogInterface$OnDismissListenerC118223 */

                /* renamed from: a */
                final /* synthetic */ ConfirmStorageDialog f31844a;

                {
                    this.f31844a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    DismissCallBack a;
                    if (!this.f31844a.mo45263b() && (a = this.f31844a.mo45260a()) != null) {
                        a.onCancel();
                    }
                }
            })).build();
            return;
        }
        this.f31836b.onContinue();
    }
}
