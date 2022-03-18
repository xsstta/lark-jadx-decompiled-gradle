package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import android.util.Log;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionExecutor;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011J\b\u0010\u0012\u001a\u00020\u0010H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModel;", "Landroidx/lifecycle/ViewModel;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "TAG", "", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "permSetInfoLiveData", "Landroidx/lifecycle/MutableLiveData;", "getPermSetInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "permSetInfoLiveData$delegate", "Lkotlin/Lazy;", "fetchPublicPermission", "", "Landroidx/lifecycle/LiveData;", "onCleared", "updatePermSetInfo", "publicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.e */
public final class DocPermissionSetViewModel extends AbstractC1142af {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(DocPermissionSetViewModel.class), "permSetInfoLiveData", "getPermSetInfoLiveData()Landroidx/lifecycle/MutableLiveData;"))};
    public final String TAG = "DocPermissionSetViewModel";
    private final C68289a compositeDisposable = new C68289a();
    public final DocPermSetInfo permSetInfo;
    private final Lazy permSetInfoLiveData$delegate = LazyKt.lazy(new C10013c(this));

    /* renamed from: getPermSetInfoLiveData  reason: collision with other method in class */
    public final C1177w<DocPermSetInfo> m269863getPermSetInfoLiveData() {
        Lazy lazy = this.permSetInfoLiveData$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C1177w) lazy.getValue();
    }

    public final LiveData<DocPermSetInfo> getPermSetInfoLiveData() {
        return m269863getPermSetInfoLiveData();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.e$c */
    static final class C10013c extends Lambda implements Function0<C1177w<DocPermSetInfo>> {
        final /* synthetic */ DocPermissionSetViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10013c(DocPermissionSetViewModel eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1177w<DocPermSetInfo> invoke() {
            return new C1177w<>(this.this$0.permSetInfo);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.mo237935a();
    }

    public final void fetchPublicPermission() {
        this.compositeDisposable.mo237937a(DocPermissionExecutor.f26846a.mo38087d(this.permSetInfo.mo38827c(), this.permSetInfo.mo38825b()).mo238001b(new C10011a(this), new C10012b(this)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.e$a */
    public static final class C10011a<T> implements Consumer<IDocPublicPermission> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetViewModel f27056a;

        C10011a(DocPermissionSetViewModel eVar) {
            this.f27056a = eVar;
        }

        /* renamed from: a */
        public final void accept(IDocPublicPermission iDocPublicPermission) {
            DocPermissionSetViewModel eVar = this.f27056a;
            Intrinsics.checkExpressionValueIsNotNull(iDocPublicPermission, "it");
            eVar.updatePermSetInfo(iDocPublicPermission);
        }
    }

    public final void updatePermSetInfo(IDocPublicPermission iDocPublicPermission) {
        this.permSetInfo.mo38819a(iDocPublicPermission);
        m269863getPermSetInfoLiveData().mo5929b(this.permSetInfo);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.e$b */
    public static final class C10012b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ DocPermissionSetViewModel f27057a;

        C10012b(DocPermissionSetViewModel eVar) {
            this.f27057a = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Log.e(this.f27057a.TAG, "fetchPublicPermission()....error", th);
            this.f27057a.m269863getPermSetInfoLiveData().mo5929b(this.f27057a.permSetInfo);
        }
    }

    public DocPermissionSetViewModel(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.permSetInfo = docPermSetInfo;
    }
}
