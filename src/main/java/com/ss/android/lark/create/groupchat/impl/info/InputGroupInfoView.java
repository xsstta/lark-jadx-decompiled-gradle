package com.ss.android.lark.create.groupchat.impl.info;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract;
import com.ss.android.lark.create.groupchat.impl.util.Utils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.EditTextLengthFilter;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002$%B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001bH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView;", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView;", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$ViewDependency;", "isCreateTopicGroup", "", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$ViewDependency;Z)V", "getContext", "()Landroid/content/Context;", "delegate", "Lcom/ss/android/lark/create/groupchat/impl/info/IInputGroupInfoContract$IView$Delegate;", "getDependency", "()Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$ViewDependency;", "()Z", "getRootView", "()Landroid/view/View;", "create", "", "destroy", "enableConfirmBtn", C63954b.f161494a, "initView", "chatName", "", "chatDesc", "onGroupChatCreate", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "setViewDelegate", "p0", "showError", "errorMsg", "Companion", "ViewDependency", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.info.f */
public final class InputGroupInfoView implements IInputGroupInfoContract.IView {

    /* renamed from: b */
    public static final Companion f93721b = new Companion(null);

    /* renamed from: a */
    public IInputGroupInfoContract.IView.Delegate f93722a;

    /* renamed from: c */
    private final Context f93723c;

    /* renamed from: d */
    private final View f93724d;

    /* renamed from: e */
    private final ViewDependency f93725e;

    /* renamed from: f */
    private final boolean f93726f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$ViewDependency;", "", "closePage", "", "onGroupChatCreate", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "isCreateTopicGroup", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo133992a();

        /* renamed from: a */
        void mo133993a(Chat chat, boolean z);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$Companion;", "", "()V", "DESC_MAX_LENGTH", "", "NAME_MAX_LENGTH", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$initView$4", "Lcom/ss/android/lark/utils/EditTextLengthFilter$ExceedLengthListener;", "onExceed", "", "originString", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$f */
    public static final class C36320f implements EditTextLengthFilter.ExceedLengthListener {
        @Override // com.ss.android.lark.utils.EditTextLengthFilter.ExceedLengthListener
        /* renamed from: a */
        public void mo134006a(CharSequence charSequence) {
        }

        C36320f() {
        }
    }

    /* renamed from: a */
    public final Context mo133999a() {
        return this.f93723c;
    }

    /* renamed from: b */
    public final View mo134001b() {
        return this.f93724d;
    }

    /* renamed from: c */
    public final ViewDependency mo134002c() {
        return this.f93725e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/create/groupchat/impl/info/InputGroupInfoView$initView$5", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$g */
    public static final class C36321g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ InputGroupInfoView f93730a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36321g(InputGroupInfoView fVar) {
            this.f93730a = fVar;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            LKUIButton lKUIButton = (LKUIButton) this.f93730a.mo134001b().findViewById(R.id.nextBtn);
            Intrinsics.checkExpressionValueIsNotNull(lKUIButton, "rootView.nextBtn");
            Editable editable2 = editable;
            lKUIButton.setEnabled(!TextUtils.isEmpty(editable2));
            ImageView imageView = (ImageView) this.f93730a.mo134001b().findViewById(R.id.mClearBtn);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.mClearBtn");
            if (TextUtils.isEmpty(editable2)) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IInputGroupInfoContract.IView.Delegate aVar) {
        this.f93722a = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$c */
    static final class View$OnClickListenerC36317c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputGroupInfoView f93727a;

        View$OnClickListenerC36317c(InputGroupInfoView fVar) {
            this.f93727a = fVar;
        }

        public final void onClick(View view) {
            this.f93727a.mo134002c().mo133992a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$d */
    static final class View$OnClickListenerC36318d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputGroupInfoView f93728a;

        View$OnClickListenerC36318d(InputGroupInfoView fVar) {
            this.f93728a = fVar;
        }

        public final void onClick(View view) {
            this.f93728a.mo134002c().mo133992a();
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IView
    /* renamed from: a */
    public void mo133983a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        this.f93725e.mo133993a(chat, this.f93726f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$h */
    static final class View$OnClickListenerC36322h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputGroupInfoView f93731a;

        View$OnClickListenerC36322h(InputGroupInfoView fVar) {
            this.f93731a = fVar;
        }

        public final void onClick(View view) {
            ((EditText) this.f93731a.mo134001b().findViewById(R.id.nameEt)).setText("");
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IView
    /* renamed from: a */
    public void mo133984a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "errorMsg");
        LKUIToast.show(this.f93723c, str);
    }

    @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IView
    /* renamed from: a */
    public void mo133986a(boolean z) {
        LKUIButton lKUIButton = (LKUIButton) this.f93724d.findViewById(R.id.nextBtn);
        Intrinsics.checkExpressionValueIsNotNull(lKUIButton, "rootView.nextBtn");
        lKUIButton.setEnabled(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.info.f$e */
    static final class View$OnClickListenerC36319e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputGroupInfoView f93729a;

        View$OnClickListenerC36319e(InputGroupInfoView fVar) {
            this.f93729a = fVar;
        }

        public final void onClick(View view) {
            IInputGroupInfoContract.IView.Delegate aVar;
            LKUIButton lKUIButton = (LKUIButton) this.f93729a.mo134001b().findViewById(R.id.nextBtn);
            Intrinsics.checkExpressionValueIsNotNull(lKUIButton, "rootView.nextBtn");
            lKUIButton.setEnabled(false);
            if (this.f93729a.mo133999a() != null && (aVar = this.f93729a.f93722a) != null) {
                Context a = this.f93729a.mo133999a();
                EditText editText = (EditText) this.f93729a.mo134001b().findViewById(R.id.nameEt);
                Intrinsics.checkExpressionValueIsNotNull(editText, "rootView.nameEt");
                aVar.mo133987a(a, editText.getText().toString(), "");
            }
        }
    }

    @Override // com.ss.android.lark.create.groupchat.impl.info.IInputGroupInfoContract.IView
    /* renamed from: a */
    public void mo133985a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "chatName");
        Intrinsics.checkParameterIsNotNull(str2, "chatDesc");
        if (this.f93726f) {
            ((CommonTitleBar) this.f93724d.findViewById(R.id.titlebar)).setTitle(UIHelper.getString(R.string.Lark_Groups_CreateGroup));
            ((TextView) this.f93724d.findViewById(R.id.group_name_tip)).setText(UIHelper.getString(R.string.Lark_Groups_Name));
            ((EditText) this.f93724d.findViewById(R.id.nameEt)).setHint(UIHelper.getString(R.string.Lark_Groups_NameDescription));
        } else {
            ((CommonTitleBar) this.f93724d.findViewById(R.id.titlebar)).setTitle(UIHelper.getString(R.string.Lark_Legacy_Groupchat));
        }
        if (DesktopUtil.m144301a(this.f93723c)) {
            CommonTitleBar commonTitleBar = (CommonTitleBar) this.f93724d.findViewById(R.id.titlebar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar, "rootView.titlebar");
            commonTitleBar.getLeftLayout().setOnClickListener(new View$OnClickListenerC36317c(this));
            CommonTitleBar commonTitleBar2 = (CommonTitleBar) this.f93724d.findViewById(R.id.titlebar);
            Intrinsics.checkExpressionValueIsNotNull(commonTitleBar2, "rootView.titlebar");
            commonTitleBar2.getLeftText().setOnClickListener(new View$OnClickListenerC36318d(this));
        }
        LKUIButton lKUIButton = (LKUIButton) this.f93724d.findViewById(R.id.nextBtn);
        Intrinsics.checkExpressionValueIsNotNull(lKUIButton, "rootView.nextBtn");
        String str3 = str;
        lKUIButton.setEnabled(!TextUtils.isEmpty(str3));
        ((LKUIButton) this.f93724d.findViewById(R.id.nextBtn)).setOnClickListener(new View$OnClickListenerC36319e(this));
        ((EditText) this.f93724d.findViewById(R.id.nameEt)).setText(str3);
        EditText editText = (EditText) this.f93724d.findViewById(R.id.nameEt);
        Intrinsics.checkExpressionValueIsNotNull(editText, "rootView.nameEt");
        editText.setFilters(new EditTextLengthFilter[]{new EditTextLengthFilter(80, new C36320f())});
        ((EditText) this.f93724d.findViewById(R.id.nameEt)).addTextChangedListener(new C36321g(this));
        ((ImageView) this.f93724d.findViewById(R.id.mClearBtn)).setOnClickListener(new View$OnClickListenerC36322h(this));
        ((EditText) this.f93724d.findViewById(R.id.nameEt)).requestFocus();
        Utils.f93572a.mo133837a(this.f93723c);
    }

    public InputGroupInfoView(Context context, View view, ViewDependency bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f93723c = context;
        this.f93724d = view;
        this.f93725e = bVar;
        this.f93726f = z;
    }
}
