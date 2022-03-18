package com.ss.android.lark.edu.creategroup.secondarypage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.edu.EduModule;
import com.ss.android.lark.edu.creategroup.GroupNameModifyActivity;
import com.ss.android.lark.edu.dto.ClassInfo;
import com.ss.android.lark.edu.p1822a.AbstractC36920a;
import com.ss.android.lark.edu.service.EduService;
import com.ss.android.lark.edu.util.CallBackBuilder;
import com.ss.android.lark.edu.util.EduStatisticUtil;
import com.ss.android.lark.edu.util.ErrorHandler;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010&\u001a\u00020\u0016H\u0002J\u0012\u0010'\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/secondarypage/CreateGroupDetailFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "backController", "Lcom/ss/android/lark/edu/creategroup/secondarypage/IBackEventController;", "(Lcom/ss/android/lark/edu/creategroup/secondarypage/IBackEventController;)V", "btnConfirmCreateGroup", "Landroid/widget/Button;", "classInfo", "Lcom/ss/android/lark/edu/dto/ClassInfo;", "getClassInfo", "()Lcom/ss/android/lark/edu/dto/ClassInfo;", "classInfo$delegate", "Lkotlin/Lazy;", "groupAvatar", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "groupName", "Landroid/widget/TextView;", "groupNameItem", "Landroid/view/ViewGroup;", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "bindEvent", "", "bindView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "setupView", "updateGroupName", "Companion", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.creategroup.secondarypage.b */
public final class CreateGroupDetailFragment extends BaseFragment {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f94979a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CreateGroupDetailFragment.class), "classInfo", "getClassInfo()Lcom/ss/android/lark/edu/dto/ClassInfo;"))};

    /* renamed from: e */
    public static final Companion f94980e = new Companion(null);

    /* renamed from: b */
    public Button f94981b;

    /* renamed from: c */
    public TextView f94982c;

    /* renamed from: d */
    public final IBackEventController f94983d;

    /* renamed from: f */
    private CommonTitleBar f94984f;

    /* renamed from: g */
    private LKUIRoundedImageView2 f94985g;

    /* renamed from: h */
    private ViewGroup f94986h;

    /* renamed from: i */
    private final Lazy f94987i = LazyKt.lazy(new C36953e(this));

    /* renamed from: j */
    private HashMap f94988j;

    /* renamed from: a */
    public final ClassInfo mo136370a() {
        Lazy lazy = this.f94987i;
        KProperty kProperty = f94979a[0];
        return (ClassInfo) lazy.getValue();
    }

    /* renamed from: b */
    public void mo136371b() {
        HashMap hashMap = this.f94988j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo136371b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/edu/creategroup/secondarypage/CreateGroupDetailFragment$Companion;", "", "()V", "REQUEST_GROUP_NAME", "", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.secondarypage.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/edu/dto/ClassInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.secondarypage.b$e */
    static final class C36953e extends Lambda implements Function0<ClassInfo> {
        final /* synthetic */ CreateGroupDetailFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36953e(CreateGroupDetailFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ClassInfo invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                Intrinsics.throwNpe();
            }
            Parcelable parcelable = arguments.getParcelable("key_class_info");
            if (parcelable == null) {
                Intrinsics.throwNpe();
            }
            return (ClassInfo) parcelable;
        }
    }

    /* renamed from: e */
    private final void m145859e() {
        CommonTitleBar commonTitleBar = this.f94984f;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setLeftClickListener(new View$OnClickListenerC36947b(this));
        ViewGroup viewGroup = this.f94986h;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("groupNameItem");
        }
        viewGroup.setOnClickListener(new View$OnClickListenerC36948c(this));
        Button button = this.f94981b;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnConfirmCreateGroup");
        }
        button.setOnClickListener(new View$OnClickListenerC36949d(this));
    }

    /* renamed from: c */
    private final void m145857c() {
        View view = getView();
        if (view != null) {
            View findViewById = view.findViewById(R.id.title_bar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.title_bar)");
            this.f94984f = (CommonTitleBar) findViewById;
            View findViewById2 = view.findViewById(R.id.group_avatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.group_avatar)");
            this.f94985g = (LKUIRoundedImageView2) findViewById2;
            View findViewById3 = view.findViewById(R.id.group_name_wrapper);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.group_name_wrapper)");
            this.f94986h = (ViewGroup) findViewById3;
            View findViewById4 = view.findViewById(R.id.btn_confirm_create_group);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.btn_confirm_create_group)");
            this.f94981b = (Button) findViewById4;
            View findViewById5 = view.findViewById(R.id.tv_group_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.tv_group_name)");
            this.f94982c = (TextView) findViewById5;
        }
    }

    /* renamed from: d */
    private final void m145858d() {
        CommonTitleBar commonTitleBar = this.f94984f;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        commonTitleBar.setMainTitleColor(ContextCompat.getColor(commonTitleBar.getContext(), R.color.lkui_N900));
        String string = commonTitleBar.getContext().getString(R.string.Lark_Education_XGradeYClassSchoolParentGroupTitle);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(\n     …ssSchoolParentGroupTitle)");
        ClassInfo a = mo136370a();
        Intrinsics.checkExpressionValueIsNotNull(a, "classInfo");
        commonTitleBar.setTitle(UIHelper.mustacheFormat(string, "ClassName", a.mo136390b()));
        TextView textView = this.f94982c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("groupName");
        }
        ClassInfo a2 = mo136370a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "classInfo");
        textView.setText(a2.mo136390b());
        ClassInfo a3 = mo136370a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "classInfo");
        a3.mo136396d(AvatarSource.f94977a.mo136369a());
        int a4 = (int) C25653b.m91892a(getContext(), 72.0f);
        ClassInfo a5 = mo136370a();
        Intrinsics.checkExpressionValueIsNotNull(a5, "classInfo");
        IRequestCreator override = ImageLoader.with(getContext()).load(AvatarImage.Builder.obtain(a5.mo136398e(), null, a4, a4).build()).override(a4, a4);
        LKUIRoundedImageView2 lKUIRoundedImageView2 = this.f94985g;
        if (lKUIRoundedImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("groupAvatar");
        }
        override.into(lKUIRoundedImageView2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.secondarypage.b$b */
    public static final class View$OnClickListenerC36947b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupDetailFragment f94989a;

        View$OnClickListenerC36947b(CreateGroupDetailFragment bVar) {
            this.f94989a = bVar;
        }

        public final void onClick(View view) {
            this.f94989a.finish();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m145854a(CreateGroupDetailFragment bVar) {
        TextView textView = bVar.f94982c;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("groupName");
        }
        return textView;
    }

    /* renamed from: b */
    public static final /* synthetic */ Button m145856b(CreateGroupDetailFragment bVar) {
        Button button = bVar.f94981b;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnConfirmCreateGroup");
        }
        return button;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m145857c();
        m145858d();
        m145859e();
    }

    public CreateGroupDetailFragment(IBackEventController cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "backController");
        this.f94983d = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.secondarypage.b$c */
    public static final class View$OnClickListenerC36948c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupDetailFragment f94990a;

        View$OnClickListenerC36948c(CreateGroupDetailFragment bVar) {
            this.f94990a = bVar;
        }

        public final void onClick(View view) {
            Intent intent = new Intent(this.f94990a.getContext(), GroupNameModifyActivity.class);
            intent.putExtra("gourp_name", CreateGroupDetailFragment.m145854a(this.f94990a).getText());
            this.f94990a.startActivityForResult(intent, 10086);
        }
    }

    /* renamed from: a */
    private final void m145855a(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gourp_name");
            TextView textView = this.f94982c;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("groupName");
            }
            CharSequence text = textView.getText();
            String str = stringExtra;
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, text)) {
                TextView textView2 = this.f94982c;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("groupName");
                }
                textView2.setText(str);
                ClassInfo a = mo136370a();
                Intrinsics.checkExpressionValueIsNotNull(a, "classInfo");
                a.mo136391b(stringExtra);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.creategroup.secondarypage.b$d */
    public static final class View$OnClickListenerC36949d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreateGroupDetailFragment f94991a;

        View$OnClickListenerC36949d(CreateGroupDetailFragment bVar) {
            this.f94991a = bVar;
        }

        public final void onClick(final View view) {
            CreateGroupDetailFragment.m145856b(this.f94991a).setEnabled(false);
            this.f94991a.f94983d.mo136364a(false);
            LKUIToast.showLoading(this.f94991a.getContext(), (int) R.string.Lark_Legacy_CreatingGroup);
            EduService aVar = EduService.f94922a;
            ClassInfo a = this.f94991a.mo136370a();
            Intrinsics.checkExpressionValueIsNotNull(a, "classInfo");
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "it.context");
            aVar.mo136308a(a, context, new CallBackBuilder().mo136379a((Function1) new Function1<String, Unit>() {
                /* class com.ss.android.lark.edu.creategroup.secondarypage.CreateGroupDetailFragment.View$OnClickListenerC36949d.C369501 */

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke(str);
                    return Unit.INSTANCE;
                }

                public final void invoke(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "chatId");
                    EduStatisticUtil.m145872a(str, 1);
                    LKUIToast.cancelLoading();
                    AbstractC36920a b = EduModule.f94921b.mo136305b();
                    if (b != null) {
                        View view = view;
                        Intrinsics.checkExpressionValueIsNotNull(view, "it");
                        b.mo136300a(view.getContext(), str);
                    }
                }
            }).mo136383b(new Function1<ErrorResult, Unit>(this) {
                /* class com.ss.android.lark.edu.creategroup.secondarypage.CreateGroupDetailFragment.View$OnClickListenerC36949d.C369512 */
                final /* synthetic */ View$OnClickListenerC36949d this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ErrorResult errorResult) {
                    invoke(errorResult);
                    return Unit.INSTANCE;
                }

                public final void invoke(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    ClassInfo a = this.this$0.f94991a.mo136370a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "classInfo");
                    EduStatisticUtil.m145872a(a.mo136395d(), 0);
                    Context context = this.this$0.f94991a.getContext();
                    if (context == null) {
                        Intrinsics.throwNpe();
                    }
                    String string = context.getString(R.string.Lark_Education_CreateGroupFailedGeneralToast);
                    Intrinsics.checkExpressionValueIsNotNull(string, "context!!.getString(R.st…eGroupFailedGeneralToast)");
                    ErrorHandler cVar = ErrorHandler.f95004a;
                    Context context2 = this.this$0.f94991a.getContext();
                    if (context2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(context2, "context!!");
                    LKUIToast.loadFail(this.this$0.f94991a.getContext(), cVar.mo136386a(errorResult, context2, string));
                }
            }).mo136380a(true).mo136378a((Function0<Unit>) new Function0<Unit>(this) {
                /* class com.ss.android.lark.edu.creategroup.secondarypage.CreateGroupDetailFragment.View$OnClickListenerC36949d.C369523 */
                final /* synthetic */ View$OnClickListenerC36949d this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    CreateGroupDetailFragment.m145856b(this.this$0.f94991a).setEnabled(true);
                    this.this$0.f94991a.f94983d.mo136364a(true);
                }
            }).mo136377a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10086) {
            m145855a(intent);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.activity_create_group_detail, viewGroup, false);
    }
}
