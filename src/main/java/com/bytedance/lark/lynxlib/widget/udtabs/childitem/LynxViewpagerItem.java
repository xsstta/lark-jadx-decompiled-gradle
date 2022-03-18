package com.bytedance.lark.lynxlib.widget.udtabs.childitem;

import android.content.Context;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.C26840a;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0014J\r\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u001e\u0010\u0016\u001a\u00020\u00112\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/childitem/LynxViewpagerItem;", "Lcom/lynx/tasm/behavior/ui/UIGroup;", "Lcom/lynx/tasm/behavior/ui/view/AndroidView;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "mEnableIsAttached", "", "mPropChaneListener", "Lcom/bytedance/lark/lynxlib/widget/udtabs/childitem/LynxViewpagerItem$IPropChaneListener;", "tag", "", "createView", "Landroid/content/Context;", "getTag", "getTag$ud_tabs_release", "sendIsAttachedEvent", "", "attach", "index", "", "sendIsAttachedEvent$ud_tabs_release", "setEvents", "events", "", "Lcom/lynx/tasm/event/EventsListener;", "setPropChaneListener", "setPropChaneListener$ud_tabs_release", "setTag", "Companion", "IPropChaneListener", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
public final class LynxViewpagerItem extends UIGroup<C26840a> {

    /* renamed from: a */
    public static final Companion f38701a = new Companion(null);

    /* renamed from: b */
    private String f38702b;

    /* renamed from: c */
    private IPropChaneListener f38703c;

    /* renamed from: d */
    private boolean f38704d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/childitem/LynxViewpagerItem$IPropChaneListener;", "", "onTagChange", "", "tag", "", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.childitem.LynxViewpagerItem$b */
    public interface IPropChaneListener {
        /* renamed from: a */
        void mo53920a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/udtabs/childitem/LynxViewpagerItem$Companion;", "", "()V", "BIND_ON_ATTACH", "", "LABEL", "ud-tabs_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.udtabs.childitem.LynxViewpagerItem$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final String mo53300d() {
        return String.valueOf(this.f38702b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26840a mo33942b(Context context) {
        return new C26840a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxViewpagerItem(AbstractC26684l lVar) {
        super(lVar);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
    }

    /* renamed from: a */
    public final void mo53945a(IPropChaneListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mPropChaneListener");
        this.f38703c = bVar;
    }

    @LynxProp(name = "tag")
    public final void setTag(String str) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        this.f38702b = str;
        IPropChaneListener bVar = this.f38703c;
        if (bVar != null) {
            bVar.mo53920a(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        if (map != null) {
            this.f38704d = map.containsKey("attach");
        }
    }

    /* renamed from: a */
    public final void mo53946a(boolean z, int i) {
        if (this.f38704d) {
            AbstractC26684l u = mo95039u();
            Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
            EventEmitter i2 = u.mo94687i();
            C26547c cVar = new C26547c(mo94576q(), "attach");
            cVar.mo94347a("attach", Boolean.valueOf(z));
            cVar.mo94347a("tag", mo53300d());
            cVar.mo94347a("index", Integer.valueOf(i));
            i2.mo94075a(cVar);
        }
    }
}
