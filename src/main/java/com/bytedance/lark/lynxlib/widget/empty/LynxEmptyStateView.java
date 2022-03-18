package com.bytedance.lark.lynxlib.widget.empty;

import android.content.Context;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.suite.R;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0016\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0007J\u001e\u0010\u0018\u001a\u00020\u00152\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0007H\u0007J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0007H\u0007J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0007H\u0007J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\nH\u0007J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\nH\u0007J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0007H\u0007J\u0010\u0010/\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0007H\u0007J\u0010\u00102\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\nH\u0007J\u0010\u00103\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0007H\u0007J\u0010\u00104\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u00105\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0007H\u0007J\u0010\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0007H\u0007J\u0010\u00108\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/empty/LynxEmptyStateView;", "Lcom/lynx/tasm/behavior/ui/view/UISimpleView;", "Lcom/larksuite/component/universe_design/emptystate/UDEmptyState;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "mDesc", "", "mEmptyState", "mEnableHyperlinkClick", "", "mEnableLinkActionClick", "mEnablePrimaryClick", "mEnableSecondaryClick", "mHyperlink", "mHyperlinkClickListener", "Landroid/view/View$OnClickListener;", "createView", "Landroid/content/Context;", "needCustomLayout", "refreshDesc", "", "setDesc", "desc", "setEvents", "events", "", "Lcom/lynx/tasm/event/EventsListener;", "setHyperlink", "hyperlink", "setImageBottomMargin", "margin", "", "setImageResId", "resIdStr", "setImageSize", "size", "", "setImageSizeMode", "mode", "setLinkAction", "text", "setLinkActionEnabled", "enable", "setPrimaryActionEnabled", "setPrimaryActionStyle", "style", "setPrimaryActionTopMargin", "setPrimaryText", "primaryText", "setSecondaryActionEnabled", "setSecondaryActionStyle", "setSecondaryActionTopMargin", "setSecondaryText", "setTitle", "title", "setTitleBottomMargin", "Companion", "ud-empty_release"}, mo238835k = 1, mv = {1, 1, 13})
public class LynxEmptyStateView extends UISimpleView<UDEmptyState> {

    /* renamed from: e */
    public static final Companion f38646e = new Companion(null);

    /* renamed from: a */
    public boolean f38647a;

    /* renamed from: b */
    public boolean f38648b;

    /* renamed from: c */
    public boolean f38649c;

    /* renamed from: d */
    public boolean f38650d;

    /* renamed from: f */
    private String f38651f;

    /* renamed from: g */
    private View.OnClickListener f38652g;

    /* renamed from: h */
    private UDEmptyState f38653h;

    /* renamed from: i */
    private String f38654i;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/lark/lynxlib/widget/empty/LynxEmptyStateView$Companion;", "", "()V", "BIND_HYPERLINK_CLICK", "", "BIND_LINK_ACTION_CLICK", "BIND_PRIMARY_CLICK", "BIND_SECONDARY_CLICK", "LABEL", "TAG", "createDefaultEmptyState", "Lcom/larksuite/component/universe_design/emptystate/UDEmptyState;", "context", "Landroid/content/Context;", "ud-empty_release"}, mo238835k = 1, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.empty.LynxEmptyStateView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final UDEmptyState mo53888a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            UDEmptyState uDEmptyState = new UDEmptyState(context);
            uDEmptyState.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return uDEmptyState;
        }
    }

    /* renamed from: d */
    private final void m59094d() {
        boolean z;
        String str;
        String str2 = this.f38651f;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (str = this.f38654i) != null) {
            String str3 = str;
            String str4 = this.f38651f;
            if (str4 == null) {
                Intrinsics.throwNpe();
            }
            if (StringsKt.contains$default((CharSequence) str3, (CharSequence) str4, false, 2, (Object) null)) {
                SpannableString spannableString = new SpannableString(this.f38654i);
                String str5 = this.f38654i;
                if (str5 == null) {
                    Intrinsics.throwNpe();
                }
                String str6 = str5;
                String str7 = this.f38651f;
                if (str7 == null) {
                    Intrinsics.throwNpe();
                }
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str6, str7, 0, false, 6, (Object) null);
                String str8 = this.f38651f;
                if (str8 == null) {
                    Intrinsics.throwNpe();
                }
                spannableString.setSpan(new UDEmptyState.OperableTextSpan(this.f38652g), indexOf$default, str8.length() + indexOf$default, 33);
                UDEmptyState uDEmptyState = this.f38653h;
                if (uDEmptyState != null) {
                    uDEmptyState.setDesc(spannableString);
                    return;
                }
                return;
            }
        }
        UDEmptyState uDEmptyState2 = this.f38653h;
        if (uDEmptyState2 != null) {
            uDEmptyState2.setDesc(this.f38654i);
        }
    }

    public LynxEmptyStateView(AbstractC26684l lVar) {
        super(lVar);
    }

    @LynxProp(name = "desc-inline-hyperlink")
    public final void setHyperlink(String str) {
        this.f38651f = str;
        m59094d();
    }

    @LynxProp(name = "image-bottom-margin")
    public final void setImageBottomMargin(int i) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setImageBottomMargin(i);
        }
    }

    @LynxProp(name = "link-action-enable")
    public final void setLinkActionEnabled(boolean z) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setLinkActionEnabled(z);
        }
    }

    @LynxProp(name = "primary-action-enable")
    public final void setPrimaryActionEnabled(boolean z) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setPrimaryActionEnabled(z);
        }
    }

    @LynxProp(name = "primary-action-top-margin")
    public final void setPrimaryActionTopMargin(int i) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setPrimaryActionTopMargin(i);
        }
    }

    @LynxProp(name = "secondary-action-enable")
    public final void setSecondaryActionEnabled(boolean z) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setSecondaryActionEnabled(z);
        }
    }

    @LynxProp(name = "secondary-action-top-margin")
    public final void setSecondaryActionTopMargin(int i) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setSecondaryActionTopMargin(i);
        }
    }

    @LynxProp(name = "title-bottom-margin")
    public final void setTitleBottomMargin(int i) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setTitleBottomMargin(i);
        }
    }

    @LynxProp(name = "desc")
    public final void setDesc(String str) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        this.f38654i = str;
        m59094d();
    }

    @LynxProp(name = "image-size")
    public final void setImageSize(float f) {
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setImageSize(Float.valueOf(f));
        }
    }

    @LynxProp(name = "link-action")
    public final void setLinkAction(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setLinkAction(str);
        }
    }

    @LynxProp(name = "primary-text")
    public final void setPrimaryText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "primaryText");
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setPrimaryText(str);
        }
    }

    @LynxProp(name = "secondary-text")
    public final void setSecondaryText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setSecondaryText(str);
        }
    }

    @LynxProp(name = "title")
    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setTitle(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.empty.LynxEmptyStateView$b */
    public static final class View$OnClickListenerC14605b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxEmptyStateView f38655a;

        View$OnClickListenerC14605b(LynxEmptyStateView lynxEmptyStateView) {
            this.f38655a = lynxEmptyStateView;
        }

        public final void onClick(View view) {
            if (this.f38655a.f38647a) {
                AbstractC26684l u = this.f38655a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38655a.mo94576q(), "hyperlinkclick"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.empty.LynxEmptyStateView$c */
    public static final class View$OnClickListenerC14606c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxEmptyStateView f38656a;

        View$OnClickListenerC14606c(LynxEmptyStateView lynxEmptyStateView) {
            this.f38656a = lynxEmptyStateView;
        }

        public final void onClick(View view) {
            if (this.f38656a.f38650d) {
                AbstractC26684l u = this.f38656a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38656a.mo94576q(), "linkactionclick"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.empty.LynxEmptyStateView$d */
    public static final class View$OnClickListenerC14607d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxEmptyStateView f38657a;

        View$OnClickListenerC14607d(LynxEmptyStateView lynxEmptyStateView) {
            this.f38657a = lynxEmptyStateView;
        }

        public final void onClick(View view) {
            if (this.f38657a.f38648b) {
                AbstractC26684l u = this.f38657a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38657a.mo94576q(), "primaryclick"));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.lark.lynxlib.widget.empty.LynxEmptyStateView$e */
    public static final class View$OnClickListenerC14608e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxEmptyStateView f38658a;

        View$OnClickListenerC14608e(LynxEmptyStateView lynxEmptyStateView) {
            this.f38658a = lynxEmptyStateView;
        }

        public final void onClick(View view) {
            if (this.f38658a.f38649c) {
                AbstractC26684l u = this.f38658a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38658a.mo94576q(), "secondaryclick"));
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, C26545a> map) {
        super.mo53260a(map);
        Log.d("LynxEmptyStateView", "events: " + map);
        if (map != null) {
            this.f38650d = map.containsKey("linkactionclick");
            this.f38649c = map.containsKey("secondaryclick");
            this.f38648b = map.containsKey("primaryclick");
            this.f38647a = map.containsKey("hyperlinkclick");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UDEmptyState mo33942b(Context context) {
        if (context == null) {
            return null;
        }
        this.f38653h = f38646e.mo53888a(context);
        View$OnClickListenerC14607d dVar = new View$OnClickListenerC14607d(this);
        View$OnClickListenerC14606c cVar = new View$OnClickListenerC14606c(this);
        View$OnClickListenerC14608e eVar = new View$OnClickListenerC14608e(this);
        this.f38652g = new View$OnClickListenerC14605b(this);
        UDEmptyState uDEmptyState = this.f38653h;
        if (uDEmptyState != null) {
            uDEmptyState.setPrimaryClickListener(dVar);
        }
        UDEmptyState uDEmptyState2 = this.f38653h;
        if (uDEmptyState2 != null) {
            uDEmptyState2.setSecondaryClickListener(eVar);
        }
        UDEmptyState uDEmptyState3 = this.f38653h;
        if (uDEmptyState3 != null) {
            uDEmptyState3.setOnLinkActionClickListener(cVar);
        }
        return this.f38653h;
    }

    @LynxProp(name = "img-res-id-str")
    public final void setImageResId(String str) {
        UDEmptyState uDEmptyState;
        UDEmptyState uDEmptyState2;
        Intrinsics.checkParameterIsNotNull(str, "resIdStr");
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 1263810733) {
            if (hashCode == 1652695476 && lowerCase.equals("illustration_empty_neutral_no_content") && (uDEmptyState2 = this.f38653h) != null) {
                uDEmptyState2.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_neutral_no_content));
            }
        } else if (lowerCase.equals("illustration_empty_negative_load_failed") && (uDEmptyState = this.f38653h) != null) {
            uDEmptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        }
    }

    @LynxProp(name = "image-size-mode")
    public final void setImageSizeMode(String str) {
        UDEmptyState uDEmptyState;
        UDEmptyState uDEmptyState2;
        Intrinsics.checkParameterIsNotNull(str, "mode");
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 102742843) {
            if (hashCode == 109548807 && lowerCase.equals("small") && (uDEmptyState2 = this.f38653h) != null) {
                uDEmptyState2.setImageSizeResource(R.dimen.ud_emptystate_image_size_small);
            }
        } else if (lowerCase.equals("large") && (uDEmptyState = this.f38653h) != null) {
            uDEmptyState.setImageSizeResource(R.dimen.ud_emptystate_image_size_large);
        }
    }

    @LynxProp(name = "primary-action-style")
    public final void setPrimaryActionStyle(String str) {
        UDEmptyState uDEmptyState;
        UDEmptyState uDEmptyState2;
        Intrinsics.checkParameterIsNotNull(str, "style");
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode == -1083981670 && lowerCase.equals("text-link") && (uDEmptyState2 = this.f38653h) != null) {
                uDEmptyState2.setPrimaryActionStyle(UDEmptyState.ButtonStyle.TEXT_LINK);
            }
        } else if (lowerCase.equals("button") && (uDEmptyState = this.f38653h) != null) {
            uDEmptyState.setPrimaryActionStyle(UDEmptyState.ButtonStyle.BUTTON);
        }
    }

    @LynxProp(name = "secondary-action-style")
    public final void setSecondaryActionStyle(String str) {
        UDEmptyState uDEmptyState;
        UDEmptyState uDEmptyState2;
        Intrinsics.checkParameterIsNotNull(str, "style");
        Locale locale = Locale.ROOT;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.ROOT");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1377687758) {
            if (hashCode == -1083981670 && lowerCase.equals("text-link") && (uDEmptyState2 = this.f38653h) != null) {
                uDEmptyState2.setSecondaryActionStyle(UDEmptyState.ButtonStyle.TEXT_LINK);
            }
        } else if (lowerCase.equals("button") && (uDEmptyState = this.f38653h) != null) {
            uDEmptyState.setSecondaryActionStyle(UDEmptyState.ButtonStyle.BUTTON);
        }
    }
}
