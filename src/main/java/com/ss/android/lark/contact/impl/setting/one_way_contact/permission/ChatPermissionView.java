package com.ss.android.lark.contact.impl.setting.one_way_contact.permission;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract;
import com.ss.android.lark.contact.impl.statistics.PrivacyHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 \"2\u00020\u0001:\u0002\"#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000eH\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView;", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView;", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mViewDependency", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$ViewDependency;", "(Landroid/content/Context;Landroid/view/View;Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$ViewDependency;)V", "mCoordinationType", "", "mCoordinationType$annotations", "()V", "mDelegate", "Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView$Delegate;", "getMDelegate", "()Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView$Delegate;", "setMDelegate", "(Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/IChatPermissionContract$IView$Delegate;)V", "convertToContacts", "", "convertToEvery", "convertToEveryExceptDoc", "create", "destroy", "init", "initForDesktop", "initTitleBar", "setViewDelegate", "viewDelegate", "showGetFailToast", "showSetToast", "updateCoordinationAuth", "coordinationType", "Companion", "ViewDependency", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.d */
public final class ChatPermissionView implements IChatPermissionContract.IView {

    /* renamed from: d */
    public static final Companion f93158d = new Companion(null);

    /* renamed from: a */
    public int f93159a;

    /* renamed from: b */
    public IChatPermissionContract.IView.Delegate f93160b;

    /* renamed from: c */
    public final ViewDependency f93161c;

    /* renamed from: e */
    private final Context f93162e;

    /* renamed from: f */
    private final View f93163f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$ViewDependency;", "", "finishPage", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.d$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo132537a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$Companion;", "", "()V", "TAG", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m141336c();
    }

    /* renamed from: f */
    private final void m141339f() {
        Log.m165383e("ChatPermissionView", "Failed to get permission when entering the page");
        LKUIToast.show(this.f93162e, (int) R.string.Lark_Legacy_FailedtoLoadTryLater);
    }

    /* renamed from: a */
    public final IChatPermissionContract.IView.Delegate mo132544a() {
        IChatPermissionContract.IView.Delegate aVar = this.f93160b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        return aVar;
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract.IView
    /* renamed from: b */
    public void mo132547b() {
        Log.m165383e("ChatPermissionView", "Failed to get permission when entering the page");
        LKUIToast.show(this.f93162e, (int) R.string.Lark_Setting_PrivacySetupFailed);
    }

    /* renamed from: d */
    private final void m141337d() {
        if (DesktopUtil.m144301a(this.f93162e)) {
            ((CommonTitleBar) this.f93163f.findViewById(R.id.permission_titleBar)).setLeftClickListener(new C36045f(this));
        }
    }

    /* renamed from: g */
    private final void m141340g() {
        ImageView imageView = (ImageView) this.f93163f.findViewById(R.id.everyone_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.everyone_image");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) this.f93163f.findViewById(R.id.everyone_except_doc_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "mRootView.everyone_except_doc_image");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) this.f93163f.findViewById(R.id.contacts_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "mRootView.contacts_image");
        imageView3.setVisibility(8);
    }

    /* renamed from: h */
    private final void m141341h() {
        ImageView imageView = (ImageView) this.f93163f.findViewById(R.id.everyone_except_doc_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.everyone_except_doc_image");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) this.f93163f.findViewById(R.id.everyone_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "mRootView.everyone_image");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) this.f93163f.findViewById(R.id.contacts_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "mRootView.contacts_image");
        imageView3.setVisibility(8);
    }

    /* renamed from: i */
    private final void m141342i() {
        ImageView imageView = (ImageView) this.f93163f.findViewById(R.id.contacts_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mRootView.contacts_image");
        imageView.setVisibility(0);
        ImageView imageView2 = (ImageView) this.f93163f.findViewById(R.id.everyone_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "mRootView.everyone_image");
        imageView2.setVisibility(8);
        ImageView imageView3 = (ImageView) this.f93163f.findViewById(R.id.everyone_except_doc_image);
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "mRootView.everyone_except_doc_image");
        imageView3.setVisibility(8);
    }

    /* renamed from: c */
    private final void m141336c() {
        if (DesktopUtil.m144301a(this.f93162e)) {
            m141338e();
            m141337d();
        }
        ((ConstraintLayout) this.f93163f.findViewById(R.id.layout_everyone)).setOnClickListener(new C36042c(this));
        ((ConstraintLayout) this.f93163f.findViewById(R.id.layout_everyone_except_doc)).setOnClickListener(new C36043d(this));
        ((ConstraintLayout) this.f93163f.findViewById(R.id.layout_contacts)).setOnClickListener(new C36044e(this));
    }

    /* renamed from: e */
    private final void m141338e() {
        DesktopUtil.m144299a((TextView) this.f93163f.findViewById(R.id.everyone_text));
        DesktopUtil.m144299a((TextView) this.f93163f.findViewById(R.id.everyone_but_docs_text));
        DesktopUtil.m144299a((TextView) this.f93163f.findViewById(R.id.everyone_but_docs_explain_text));
        DesktopUtil.m144299a((TextView) this.f93163f.findViewById(R.id.contacts_text));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$init$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.d$c */
    public static final class C36042c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatPermissionView f93164a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36042c(ChatPermissionView dVar) {
            this.f93164a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            PrivacyHitPoint.f92909a.mo132207a("all");
            if (this.f93164a.f93159a != 1) {
                this.f93164a.mo132544a().mo132541a(1);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$init$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.d$d */
    public static final class C36043d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatPermissionView f93165a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36043d(ChatPermissionView dVar) {
            this.f93165a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            PrivacyHitPoint.f92909a.mo132207a("all_but_doc");
            if (this.f93165a.f93159a != 2) {
                this.f93165a.mo132544a().mo132541a(2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$init$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.d$e */
    public static final class C36044e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatPermissionView f93166a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36044e(ChatPermissionView dVar) {
            this.f93166a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            PrivacyHitPoint.f92909a.mo132207a("contacts");
            if (this.f93166a.f93159a != 3) {
                this.f93166a.mo132544a().mo132541a(3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/contact/impl/setting/one_way_contact/permission/ChatPermissionView$initTitleBar$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.impl.setting.one_way_contact.permission.d$f */
    public static final class C36045f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatPermissionView f93167a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36045f(ChatPermissionView dVar) {
            this.f93167a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f93167a.f93161c.mo132537a();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(IChatPermissionContract.IView.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f93160b = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.setting.one_way_contact.permission.IChatPermissionContract.IView
    /* renamed from: a */
    public void mo132545a(int i) {
        this.f93159a = i;
        if (i == 0) {
            m141339f();
        } else if (i == 1) {
            m141340g();
        } else if (i == 2) {
            m141341h();
        } else if (i != 3) {
            m141339f();
        } else {
            m141342i();
        }
    }

    public ChatPermissionView(Context context, View view, ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(bVar, "mViewDependency");
        this.f93162e = context;
        this.f93163f = view;
        this.f93161c = bVar;
    }
}
