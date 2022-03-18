package com.bytedance.ee.android.file.picker.lib.mvp;

import com.bytedance.ee.android.file.picker.lib.mvp.IModel;
import com.bytedance.ee.android.file.picker.lib.mvp.IView;
import com.bytedance.ee.android.file.picker.lib.mvp.IView.IViewDelegate;
import com.bytedance.ee.android.file.picker.lib.utils.UIExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0004*\b\b\u0002\u0010\u0005*\u00020\u00062\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0007B\u0007\b\u0016¢\u0006\u0002\u0010\bB\u0017\b\u0016\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0002\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0017J\r\u0010\u0018\u001a\u00028\u0002H$¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0017R\u001c\u0010\t\u001a\u00028\u0000X.¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u00028\u0001X.¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/android/file/picker/lib/mvp/BasePresenter;", "M", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IModel;", "V", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IView;", "VD", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IView$IViewDelegate;", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IPresenter;", "()V", "model", "view", "(Lcom/bytedance/ee/android/file/picker/lib/mvp/IModel;Lcom/bytedance/ee/android/file/picker/lib/mvp/IView;)V", "getModel", "()Lcom/bytedance/ee/android/file/picker/lib/mvp/IModel;", "setModel", "(Lcom/bytedance/ee/android/file/picker/lib/mvp/IModel;)V", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IModel;", "getView", "()Lcom/bytedance/ee/android/file/picker/lib/mvp/IView;", "setView", "(Lcom/bytedance/ee/android/file/picker/lib/mvp/IView;)V", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IView;", "create", "", "createViewDelegate", "()Lcom/bytedance/ee/android/file/picker/lib/mvp/IView$IViewDelegate;", "destroy", "file-picker-lib_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.android.file.picker.lib.d.b */
public abstract class BasePresenter<M extends IModel, V extends IView<VD>, VD extends IView.IViewDelegate> implements IPresenter<M, V> {

    /* renamed from: b */
    public V f12280b;

    /* renamed from: c */
    public M f12281c;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract VD mo15860d();

    public BasePresenter() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "M", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IModel;", "V", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IView;", "VD", "Lcom/bytedance/ee/android/file/picker/lib/mvp/IView$IViewDelegate;", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.android.file.picker.lib.d.b$a */
    public static final class RunnableC4043a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BasePresenter f12282a;

        RunnableC4043a(BasePresenter bVar) {
            this.f12282a = bVar;
        }

        public final void run() {
            this.f12282a.mo15861e().mo15856c();
        }
    }

    /* renamed from: e */
    public final V mo15861e() {
        V v = this.f12280b;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        return v;
    }

    /* renamed from: f */
    public final M mo15862f() {
        M m = this.f12281c;
        if (m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        return m;
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    /* renamed from: c */
    public void mo15856c() {
        M m = this.f12281c;
        if (m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        m.mo15856c();
        UIExecutor.f12485a.mo16120a(new RunnableC4043a(this));
    }

    @Override // com.bytedance.ee.android.file.picker.lib.mvp.ILifecycle
    public void j_() {
        V v = this.f12280b;
        if (v == null) {
            Intrinsics.throwUninitializedPropertyAccessException("view");
        }
        v.j_();
        M m = this.f12281c;
        if (m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("model");
        }
        m.j_();
    }

    /* renamed from: a */
    public final void mo15858a(M m) {
        Intrinsics.checkParameterIsNotNull(m, "<set-?>");
        this.f12281c = m;
    }

    /* renamed from: a */
    public final void mo15859a(V v) {
        Intrinsics.checkParameterIsNotNull(v, "<set-?>");
        this.f12280b = v;
    }

    public BasePresenter(M m, V v) {
        Intrinsics.checkParameterIsNotNull(m, "model");
        Intrinsics.checkParameterIsNotNull(v, "view");
        this.f12280b = v;
        this.f12281c = m;
        v.mo15864a(mo15860d());
    }
}
