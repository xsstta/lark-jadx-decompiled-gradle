package com.ss.android.lark.keyboard.plugin.tool.aa.widget;

import android.view.ViewGroup;
import androidx.transition.C1556v;
import com.ss.android.lark.keyboard.plugin.tool.plugingroup.IPluginGroupTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginTransition;", "Lcom/ss/android/lark/keyboard/plugin/tool/plugingroup/IPluginGroupTransition;", "()V", "enterTransition", "Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/KeyboardTransitionSlice;", "exitTransition", "enter", "", "sceneRoot", "Landroid/view/ViewGroup;", "exit", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.b */
public final class AaStylePluginTransition implements IPluginGroupTransition {

    /* renamed from: a */
    private final KeyboardTransitionSlice f103724a = new KeyboardTransitionSlice(1);

    /* renamed from: b */
    private final KeyboardTransitionSlice f103725b = new KeyboardTransitionSlice(2);

    @Override // com.ss.android.lark.keyboard.plugin.tool.plugingroup.IPluginGroupTransition
    /* renamed from: a */
    public void mo147349a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "sceneRoot");
        C1556v.m7131a(viewGroup, this.f103724a);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.plugingroup.IPluginGroupTransition
    /* renamed from: b */
    public void mo147350b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "sceneRoot");
        C1556v.m7131a(viewGroup, this.f103725b);
    }
}
