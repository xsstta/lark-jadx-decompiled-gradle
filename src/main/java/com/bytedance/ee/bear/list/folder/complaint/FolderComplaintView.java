package com.bytedance.ee.bear.list.folder.complaint;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.list.folder.complaint.AbstractC8354i;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.ProgressParams;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.mvp.C26034b;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0016R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/list/folder/complaint/FolderComplaintView;", "Lcom/larksuite/framework/mvp/BaseView;", "Lcom/bytedance/ee/bear/list/folder/complaint/IFolderComplaintView$IViewDelegate;", "Lcom/bytedance/ee/bear/list/folder/complaint/IFolderComplaintView;", "mRootView", "Landroid/view/View;", "mName", "", "mDesc", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "mBtnSend", "Lcom/larksuite/component/universe_design/button/UDButton;", "create", "", "hideComplaintLoading", "initView", "showComplaintLoading", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.folder.complaint.e */
public final class FolderComplaintView extends C26034b<AbstractC8354i.AbstractC8355a> implements AbstractC8354i {

    /* renamed from: a */
    public final View f22557a;

    /* renamed from: b */
    private UDButton f22558b;

    /* renamed from: c */
    private final String f22559c;

    /* renamed from: d */
    private final String f22560d;

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m34579d();
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.AbstractC8354i
    /* renamed from: b */
    public void mo32790b() {
        UDButton uDButton = this.f22558b;
        if (uDButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBtnSend");
        }
        C25717e.m92484a(uDButton, (int) R.string.appealing_submit);
    }

    @Override // com.bytedance.ee.bear.list.folder.complaint.AbstractC8354i
    /* renamed from: a */
    public void mo32789a() {
        UDButton uDButton = this.f22558b;
        if (uDButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBtnSend");
        }
        C25717e.m92492a(uDButton, new C8350b(this));
    }

    /* renamed from: d */
    private final void m34579d() {
        TextView textView = (TextView) this.f22557a.findViewById(R.id.list_folder_name);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvName");
        textView.setText(this.f22559c);
        TextView textView2 = (TextView) this.f22557a.findViewById(R.id.list_folder_desc);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "tvDesc");
        textView2.setText(this.f22560d);
        View findViewById = this.f22557a.findViewById(R.id.list_btn_send_complaint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R….list_btn_send_complaint)");
        UDButton uDButton = (UDButton) findViewById;
        this.f22558b = uDButton;
        if (uDButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBtnSend");
        }
        uDButton.setOnClickListener(new C8349a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/list/folder/complaint/FolderComplaintView$initView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folder.complaint.e$a */
    public static final class C8349a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ FolderComplaintView f22561a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8349a(FolderComplaintView eVar) {
            this.f22561a = eVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (((AbstractC8354i.AbstractC8355a) this.f22561a.mo92555c()) != null) {
                AbstractC8354i.AbstractC8355a aVar = (AbstractC8354i.AbstractC8355a) this.f22561a.mo92555c();
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                aVar.mo32788a(view);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/larksuite/component/universe_design/button/ProgressParams;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.folder.complaint.e$b */
    static final class C8350b extends Lambda implements Function1<ProgressParams, Unit> {
        final /* synthetic */ FolderComplaintView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8350b(FolderComplaintView eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProgressParams dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(ProgressParams dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "$receiver");
            dVar.mo90321a(Integer.valueOf((int) R.string.CreationMobile_Appealing_Submit));
            Context context = this.this$0.f22557a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mRootView.context");
            dVar.mo90337c(Integer.valueOf(UDColorUtils.getColor(context, R.color.static_white)));
            dVar.mo90319a(0);
            Context context2 = this.this$0.f22557a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "mRootView.context");
            dVar.mo90336c((int) UDDimenUtils.m93307a(context2, 6.0f));
            Context context3 = this.this$0.f22557a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "mRootView.context");
            dVar.mo90338d((int) UDDimenUtils.m93307a(context3, 2.0f));
        }
    }

    public FolderComplaintView(View view, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(str, "mName");
        Intrinsics.checkParameterIsNotNull(str2, "mDesc");
        this.f22557a = view;
        this.f22559c = str;
        this.f22560d = str2;
    }
}
