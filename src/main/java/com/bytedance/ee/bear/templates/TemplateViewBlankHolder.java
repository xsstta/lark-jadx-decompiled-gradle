package com.bytedance.ee.bear.templates;

import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.list.create.CreateControl;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0016R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewBlankHolder;", "Lcom/bytedance/ee/bear/templates/ITemplateViewHolder;", "view", "Landroid/view/View;", "layoutType", "Lcom/bytedance/ee/bear/templates/LayoutType;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Landroid/view/View;Lcom/bytedance/ee/bear/templates/LayoutType;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "blankLabelTxt", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "enable", "", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "getBlankLabelTxt", "", "objType", "showTemplate", "", "deleteListener", "Lkotlin/Function0;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.h */
public final class TemplateViewBlankHolder extends ITemplateViewHolder {

    /* renamed from: a */
    public static final Companion f31035a = new Companion(null);

    /* renamed from: b */
    private final TextView f31036b;

    /* renamed from: c */
    private final View f31037c;

    /* renamed from: d */
    private final LayoutType f31038d;

    /* renamed from: e */
    private final C10917c f31039e;

    /* renamed from: a */
    private final int m48007a(int i) {
        return i != 3 ? i != 8 ? i != 11 ? R.string.CreationMobile_Template_Doc_Blanklabel : R.string.CreationMobile_Template_Mindnote_Blanklabel : R.string.CreationMobile_Template_Bitable_Blanklabel : R.string.CreationMobile_Template_Sheet_Blanklabel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateViewBlankHolder$Companion;", "", "()V", "TAG", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final boolean m48008a(TemplateV4 templateV4) {
        if (templateV4.getEnable() || CreateControl.m33799a(templateV4.getObjType())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.templates.ITemplateViewHolder
    /* renamed from: a */
    public void mo43935a(TemplateV4 templateV4, Function0<Unit> function0) {
        float f;
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        Intrinsics.checkParameterIsNotNull(function0, "deleteListener");
        View view = this.f31037c;
        if (m48008a(templateV4)) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        view.setAlpha(f);
        this.f31036b.setText(m48007a(templateV4.getObjType()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateViewBlankHolder(View view, LayoutType layoutType, C10917c cVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(layoutType, "layoutType");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f31037c = view;
        this.f31038d = layoutType;
        this.f31039e = cVar;
        this.f31036b = (TextView) view.findViewById(R.id.blankLabelTxt);
    }
}
