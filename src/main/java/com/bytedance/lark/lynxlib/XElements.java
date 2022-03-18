package com.bytedance.lark.lynxlib;

import android.content.Context;
import com.bytedance.ies.xelement.banner.LynxSwiperItemView;
import com.bytedance.ies.xelement.banner.LynxSwiperView;
import com.bytedance.ies.xelement.input.LynxInputView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.LynxPickerView;
import com.lynx.component.svg.UISvg;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26622a;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.canvas.LynxHeliumCanvas;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¨\u0006\f"}, d2 = {"Lcom/bytedance/lark/lynxlib/XElements;", "", "()V", "getBehaviors", "", "Lcom/lynx/tasm/behavior/Behavior;", "iLynxEnv", "Lcom/bytedance/lark/lynxlib/ILynxEnv;", "localizeAdapter", "Lcom/bytedance/ies/xelement/localize/LocalizeAdapter;", "ctx", "Landroid/content/Context;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.lark.lynxlib.f */
public final class XElements {

    /* renamed from: a */
    public static final XElements f38642a = new XElements();

    private XElements() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/lark/lynxlib/XElements$localizeAdapter$1", "Lcom/bytedance/ies/xelement/localize/LocalizeAdapter;", "localize", "", "", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$h */
    public static final class C14604h implements LocalizeAdapter {

        /* renamed from: a */
        final /* synthetic */ Context f38644a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14596e f38645b;

        @Override // com.bytedance.ies.xelement.localize.LocalizeAdapter
        /* renamed from: a */
        public Map<String, String> mo53213a() {
            HashMap hashMap = new HashMap();
            String string = this.f38644a.getString(this.f38645b.mo50270b());
            Intrinsics.checkExpressionValueIsNotNull(string, "ctx.getString(iLynxEnv.cancelResID)");
            hashMap.put("cancel", string);
            String string2 = this.f38644a.getString(this.f38645b.mo50271c());
            Intrinsics.checkExpressionValueIsNotNull(string2, "ctx.getString(iLynxEnv.confirmResID)");
            hashMap.put("confirm", string2);
            hashMap.put("wheel_text_bound_text", "");
            return hashMap;
        }

        C14604h(Context context, AbstractC14596e eVar) {
            this.f38644a = context;
            this.f38645b = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/XElements$getBehaviors$1", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$a */
    public static final class C14597a extends C26622a {
        C14597a(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new LynxInputView(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/XElements$getBehaviors$2", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$b */
    public static final class C14598b extends C26622a {
        C14598b(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new LynxTextAreaView(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/XElements$getBehaviors$4", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$d */
    public static final class C14600d extends C26622a {
        C14600d(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new LynxSwiperView(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/XElements$getBehaviors$5", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$e */
    public static final class C14601e extends C26622a {
        C14601e(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new LynxSwiperItemView(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/XElements$getBehaviors$6", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$f */
    public static final class C14602f extends C26622a {
        C14602f(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            return new LynxHeliumCanvas(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/XElements$getBehaviors$7", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$g */
    public static final class C14603g extends C26622a {
        C14603g(String str) {
            super(str);
        }

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            return new UISvg(lVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/lark/lynxlib/XElements$getBehaviors$3", "Lcom/lynx/tasm/behavior/Behavior;", "createUI", "Lcom/lynx/tasm/behavior/ui/LynxUI;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "lark-lynx-lib_usRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.lark.lynxlib.f$c */
    public static final class C14599c extends C26622a {

        /* renamed from: a */
        final /* synthetic */ AbstractC14596e f38643a;

        @Override // com.lynx.tasm.behavior.C26622a
        /* renamed from: a */
        public LynxUI<?> mo33935a(AbstractC26684l lVar) {
            Intrinsics.checkParameterIsNotNull(lVar, "context");
            Context applicationContext = lVar.getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
            return new LynxPickerView(lVar, XElements.m59084a(applicationContext, this.f38643a));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14599c(AbstractC14596e eVar, String str) {
            super(str);
            this.f38643a = eVar;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<C26622a> m59085a(AbstractC14596e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "iLynxEnv");
        return CollectionsKt.listOf((Object[]) new C26622a[]{new C14597a("input"), new C14598b("textarea"), new C14599c(eVar, "picker"), new C14600d("swiper"), new C14601e("swiper-item"), new C14602f("canvas"), new C14603g("svg")});
    }

    @JvmStatic
    /* renamed from: a */
    public static final LocalizeAdapter m59084a(Context context, AbstractC14596e eVar) {
        return new C14604h(context, eVar);
    }
}
