package com.bytedance.ee.bear.templates.scene;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/SceneFragment;", "Lcom/bytedance/ee/bear/templates/scene/BaseSceneFragment;", "()V", "topicId", "", "getTopicId", "()Ljava/lang/String;", "setTopicId", "(Ljava/lang/String;)V", "getIModel", "Lcom/bytedance/ee/bear/templates/scene/SceneModel;", "getIPresenter", "Lcom/bytedance/ee/bear/templates/scene/BaseScenePresenter;", "model", "view", "Lcom/bytedance/ee/bear/templates/scene/ISceneView;", "getIView", "rootView", "Landroid/view/View;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.scene.f */
public final class SceneFragment extends BaseSceneFragment {

    /* renamed from: a */
    public static final Companion f31286a = new Companion(null);

    /* renamed from: b */
    private String f31287b = "";

    /* renamed from: c */
    private HashMap f31288c;

    @Override // com.bytedance.ee.bear.templates.scene.BaseSceneFragment
    /* renamed from: b */
    public void mo44588b() {
        HashMap hashMap = this.f31288c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.templates.scene.BaseSceneFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo44588b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/templates/scene/SceneFragment$Companion;", "", "()V", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "topicId", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.scene.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo44608a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "topicId");
            Fragment instantiate = Fragment.instantiate(context, SceneFragment.class.getName(), new Bundle());
            if (instantiate != null) {
                SceneFragment fVar = (SceneFragment) instantiate;
                fVar.mo44607a(str);
                return fVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.templates.scene.SceneFragment");
        }
    }

    @Override // com.bytedance.ee.bear.templates.scene.BaseSceneFragment
    /* renamed from: a */
    public SceneModel mo44587a() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        return new SceneModel(requireActivity);
    }

    /* renamed from: a */
    public final void mo44607a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f31287b = str;
    }

    @Override // com.bytedance.ee.bear.templates.scene.BaseSceneFragment
    /* renamed from: a */
    public ISceneView mo44586a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        return new BaseSceneView(requireActivity, this, view, this.f31287b);
    }

    @Override // com.bytedance.ee.bear.templates.scene.BaseSceneFragment
    /* renamed from: a */
    public BaseScenePresenter mo44585a(SceneModel gVar, ISceneView eVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "model");
        Intrinsics.checkParameterIsNotNull(eVar, "view");
        return new BaseScenePresenter(this, gVar, eVar);
    }
}
