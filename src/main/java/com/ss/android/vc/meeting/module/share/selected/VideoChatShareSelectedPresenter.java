package com.ss.android.vc.meeting.module.share.selected;

import android.view.View;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.module.share.VideoChatShareItem;
import com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract;
import com.ss.android.vc.meeting.module.share.selecteddialog.OnSaveListener;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u001e\u001fBE\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0014J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u000eJ\u0006\u0010\u001d\u001a\u00020\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IModel;", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView;", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView$Delegate;", "mDialog", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "mRootView", "Landroid/view/View;", "mSelectedData", "Ljava/util/ArrayList;", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "Lkotlin/collections/ArrayList;", "mSelectedFromInvite", "", "mSelectedGroupCount", "", "mOnSaveListener", "Lcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;Landroid/view/View;Ljava/util/ArrayList;ZILcom/ss/android/vc/meeting/module/share/selecteddialog/OnSaveListener;)V", "getMDialog", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "getMRootView", "()Landroid/view/View;", "create", "", "createViewDelegate", "initPresenter", "isReachListBottom", "isReachListTop", "ViewDelegate", "ViewDependency", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.a.f */
public final class VideoChatShareSelectedPresenter extends BasePresenter<IVideoChatShareSelectedContract.IModel, IVideoChatShareSelectedContract.IView, IVideoChatShareSelectedContract.IView.Delegate> {

    /* renamed from: a */
    private final AbstractC61222a f158584a;

    /* renamed from: b */
    private final View f158585b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J#\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter$ViewDependency;", "", "cancel", "", "save", "deletedArray", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "groupCount", "", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;I)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.f$b */
    public interface ViewDependency {
        /* renamed from: a */
        void mo217578a();

        /* renamed from: a */
        void mo217579a(VideoChatShareItem[] videoChatShareItemArr, int i);
    }

    /* renamed from: c */
    public final AbstractC61222a mo217577c() {
        return this.f158584a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IVideoChatShareSelectedContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo217576b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00060\nj\b\u0012\u0004\u0012\u00020\u0006`\u000bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter$ViewDelegate;", "Lcom/ss/android/vc/meeting/module/share/selected/IVideoChatShareSelectedContract$IView$Delegate;", "(Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter;)V", "deleteItem", "", "item", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "position", "", "getData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getDeletedGroupCount", "getDeleteds", "", "()[Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "getGroupCount", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.f$a */
    public final class ViewDelegate implements IVideoChatShareSelectedContract.IView.Delegate {
        @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IView.Delegate
        /* renamed from: a */
        public VideoChatShareItem[] mo217555a() {
            return ((IVideoChatShareSelectedContract.IModel) VideoChatShareSelectedPresenter.this.getModel()).mo217548a();
        }

        @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IView.Delegate
        /* renamed from: b */
        public int mo217556b() {
            return ((IVideoChatShareSelectedContract.IModel) VideoChatShareSelectedPresenter.this.getModel()).mo217550c();
        }

        @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IView.Delegate
        /* renamed from: c */
        public ArrayList<VideoChatShareItem> mo217557c() {
            return ((IVideoChatShareSelectedContract.IModel) VideoChatShareSelectedPresenter.this.getModel()).mo217549b();
        }

        @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IView.Delegate
        /* renamed from: d */
        public int mo217558d() {
            return ((IVideoChatShareSelectedContract.IModel) VideoChatShareSelectedPresenter.this.getModel()).mo217551d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.ss.android.vc.meeting.module.share.selected.IVideoChatShareSelectedContract.IView.Delegate
        /* renamed from: a */
        public void mo217554a(VideoChatShareItem videoChatShareItem, int i) {
            Intrinsics.checkParameterIsNotNull(videoChatShareItem, "item");
            ((IVideoChatShareSelectedContract.IModel) VideoChatShareSelectedPresenter.this.getModel()).mo217547a(videoChatShareItem, i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J#\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter$mDependency$1", "Lcom/ss/android/vc/meeting/module/share/selected/VideoChatShareSelectedPresenter$ViewDependency;", "cancel", "", "save", "deletedArray", "", "Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;", "groupCount", "", "([Lcom/ss/android/vc/meeting/module/share/VideoChatShareItem;I)V", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.share.a.f$c */
    public static final class C62949c implements ViewDependency {

        /* renamed from: a */
        final /* synthetic */ VideoChatShareSelectedPresenter f158587a;

        /* renamed from: b */
        final /* synthetic */ OnSaveListener f158588b;

        @Override // com.ss.android.vc.meeting.module.share.selected.VideoChatShareSelectedPresenter.ViewDependency
        /* renamed from: a */
        public void mo217578a() {
            AbstractC61222a c = this.f158587a.mo217577c();
            if (c != null) {
                c.dismiss();
            }
        }

        C62949c(VideoChatShareSelectedPresenter fVar, OnSaveListener aVar) {
            this.f158587a = fVar;
            this.f158588b = aVar;
        }

        @Override // com.ss.android.vc.meeting.module.share.selected.VideoChatShareSelectedPresenter.ViewDependency
        /* renamed from: a */
        public void mo217579a(VideoChatShareItem[] videoChatShareItemArr, int i) {
            Intrinsics.checkParameterIsNotNull(videoChatShareItemArr, "deletedArray");
            OnSaveListener aVar = this.f158588b;
            if (aVar != null) {
                aVar.mo217589a(videoChatShareItemArr, i);
            }
            AbstractC61222a c = this.f158587a.mo217577c();
            if (c != null) {
                c.dismiss();
            }
        }
    }

    /* renamed from: b */
    public final void mo217576b() {
        ((IVideoChatShareSelectedContract.IView) getView()).mo217553a(((IVideoChatShareSelectedContract.IModel) getModel()).mo217549b());
        ((IVideoChatShareSelectedContract.IView) getView()).mo217552a(((IVideoChatShareSelectedContract.IModel) getModel()).mo217549b().size() - ((IVideoChatShareSelectedContract.IModel) getModel()).mo217551d(), ((IVideoChatShareSelectedContract.IModel) getModel()).mo217551d());
    }

    public VideoChatShareSelectedPresenter(AbstractC61222a aVar, View view, ArrayList<VideoChatShareItem> arrayList, boolean z, int i, OnSaveListener aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "mDialog");
        Intrinsics.checkParameterIsNotNull(view, "mRootView");
        Intrinsics.checkParameterIsNotNull(arrayList, "mSelectedData");
        Intrinsics.checkParameterIsNotNull(aVar2, "mOnSaveListener");
        this.f158584a = aVar;
        this.f158585b = view;
        setView(new VideoChatShareSelectedView(view, new C62949c(this, aVar2)));
        setModel(new VideoChatShareSelectedModel(arrayList, i, z));
        ((IVideoChatShareSelectedContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
