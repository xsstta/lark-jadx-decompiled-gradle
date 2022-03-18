package com.bytedance.ies.xelement.picker;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.bytedance.ies.xelement.localize.LocalizeAdapter;
import com.bytedance.ies.xelement.picker.p819b.C14500b;
import com.bytedance.ies.xelement.picker.p819b.C14501c;
import com.bytedance.ies.xelement.picker.p819b.C14502d;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14507a;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14513g;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14514h;
import com.bytedance.ies.xelement.picker.p822e.AbstractC14516j;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.ui.view.C26840a;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u001aH\u0014J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010$\u001a\u00020\u00192\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u000eH\u0007J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u000eH\u0007J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000eH\u0007J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0013H\u0007JB\u0010/\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002JB\u00100\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J6\u00101\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e03032\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u000103H\u0002J/\u00106\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e032\n\b\u0002\u00107\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0002\u00108JB\u00109\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002J6\u0010:\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e03032\u0010\b\u0002\u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u000103H\u0002J/\u0010;\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e032\n\b\u0002\u00107\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0002\u00108JB\u0010<\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/bytedance/ies/xelement/picker/LynxPickerView;", "Lcom/lynx/tasm/behavior/ui/view/UISimpleView;", "Lcom/lynx/tasm/behavior/ui/view/AndroidView;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "adapter", "Lcom/bytedance/ies/xelement/localize/LocalizeAdapter;", "(Lcom/lynx/tasm/behavior/LynxContext;Lcom/bytedance/ies/xelement/localize/LocalizeAdapter;)V", "enableCancelEvent", "", "enableChangeEvent", "enableColumnChangeEvent", "enableConfirmEvent", "end", "", "fields", "localizeAdapter", "mode", "range", "Lcom/lynx/react/bridge/Dynamic;", "rangeKey", "separator", "start", "value", "createDatePicker", "", "Landroid/content/Context;", "createLegacyDatePicker", "createLegacyMultiSelectorPicker", "createLegacySingleSelectorPicker", "createLegacyTimePicker", "createMultiSelectorPicker", "createSingleSelectorPicker", "createTimePicker", "createView", "setEnd", "setEvents", "events", "", "Lcom/lynx/tasm/event/EventsListener;", "setFields", "setMode", "setRange", "setRangeKey", "setSeparator", "setStart", "setValue", "showDatePicker", "showLegacyDatePicker", "showLegacyMultiSelectorPicker", "items", "", "indexes", "", "showLegacySingleSelectorPicker", "index", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/Integer;)V", "showLegacyTimePicker", "showMultiSelectorPicker", "showSingleSelectorPicker", "showTimePicker", "Companion", "x-element-picker_newelement"}, mo238835k = 1, mv = {1, 1, 16})
public final class LynxPickerView extends UISimpleView<C26840a> {

    /* renamed from: f */
    public static final Companion f38208f = new Companion(null);

    /* renamed from: a */
    public String f38209a = "selector";

    /* renamed from: b */
    public boolean f38210b;

    /* renamed from: c */
    public boolean f38211c;

    /* renamed from: d */
    public boolean f38212d;

    /* renamed from: e */
    public boolean f38213e;

    /* renamed from: g */
    private AbstractC26517a f38214g;

    /* renamed from: h */
    private AbstractC26517a f38215h;

    /* renamed from: i */
    private AbstractC26517a f38216i;

    /* renamed from: j */
    private String f38217j;

    /* renamed from: k */
    private String f38218k;

    /* renamed from: l */
    private String f38219l;

    /* renamed from: m */
    private String f38220m;

    /* renamed from: n */
    private LocalizeAdapter f38221n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ies/xelement/picker/LynxPickerView$Companion;", "", "()V", "BIND_CANCEL", "", "BIND_CHANGE", "BIND_COLUMN_CHANGE", "BIND_CONFIRM", "MODE_DATE", "MODE_DATE_LEGACY", "MODE_MULTISELECTOR", "MODE_MULTISELECTOR_LEGACY", "MODE_SELECTOR", "MODE_SELECTOR_LEGACY", "MODE_TIME", "MODE_TIME_LEGACY", "TAG", "x-element-picker_newelement"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$d */
    public static final class C14478d implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38225a;

        C14478d(LynxPickerView lynxPickerView) {
            this.f38225a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38225a.f38210b) {
                AbstractC26684l u = this.f38225a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38225a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$f */
    public static final class C14480f implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38227a;

        C14480f(LynxPickerView lynxPickerView) {
            this.f38227a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38227a.f38210b) {
                AbstractC26684l u = this.f38227a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38227a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$i */
    public static final class C14483i implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38230a;

        C14483i(LynxPickerView lynxPickerView) {
            this.f38230a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38230a.f38210b) {
                AbstractC26684l u = this.f38230a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38230a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onCancel", "com/bytedance/ies/xelement/picker/LynxPickerView$showLegacySingleSelectorPicker$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$k */
    public static final class C14485k implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38234a;

        /* renamed from: b */
        final /* synthetic */ List f38235b;

        /* renamed from: c */
        final /* synthetic */ Integer f38236c;

        C14485k(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f38234a = lynxPickerView;
            this.f38235b = list;
            this.f38236c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38234a.f38210b) {
                AbstractC26684l u = this.f38234a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38234a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$m */
    public static final class C14487m implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38238a;

        C14487m(LynxPickerView lynxPickerView) {
            this.f38238a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38238a.f38210b) {
                AbstractC26684l u = this.f38238a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38238a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$p */
    public static final class C14490p implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38241a;

        C14490p(LynxPickerView lynxPickerView) {
            this.f38241a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38241a.f38210b) {
                AbstractC26684l u = this.f38241a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38241a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onCancel", "com/bytedance/ies/xelement/picker/LynxPickerView$showSingleSelectorPicker$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$r */
    public static final class C14492r implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38245a;

        /* renamed from: b */
        final /* synthetic */ List f38246b;

        /* renamed from: c */
        final /* synthetic */ Integer f38247c;

        C14492r(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f38245a = lynxPickerView;
            this.f38246b = list;
            this.f38247c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38245a.f38210b) {
                AbstractC26684l u = this.f38245a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38245a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCancel"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$t */
    public static final class C14494t implements AbstractC14507a {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38249a;

        C14494t(LynxPickerView lynxPickerView) {
            this.f38249a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14507a
        /* renamed from: a */
        public final void mo53380a() {
            if (this.f38249a.f38210b) {
                AbstractC26684l u = this.f38249a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                u.mo94687i().mo94075a(new C26547c(this.f38249a.mo94576q(), "cancel"));
            }
            Log.d("LynxPickerView", "onCancel");
        }
    }

    @LynxProp(name = "end")
    public final void setEnd(String str) {
        Intrinsics.checkParameterIsNotNull(str, "end");
        this.f38218k = str;
    }

    @LynxProp(name = "fields")
    public final void setFields(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fields");
        this.f38219l = str;
    }

    @LynxProp(name = "mode")
    public final void setMode(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mode");
        this.f38209a = str;
    }

    @LynxProp(name = "range")
    public final void setRange(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "range");
        this.f38215h = aVar;
    }

    @LynxProp(name = "range-key")
    public final void setRangeKey(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "rangeKey");
        this.f38216i = aVar;
    }

    @LynxProp(name = "separator")
    public final void setSeparator(String str) {
        Intrinsics.checkParameterIsNotNull(str, "separator");
        this.f38220m = str;
    }

    @LynxProp(name = "start")
    public final void setStart(String str) {
        Intrinsics.checkParameterIsNotNull(str, "start");
        this.f38217j = str;
    }

    @LynxProp(name = "value")
    public final void setValue(AbstractC26517a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "value");
        this.f38214g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C26840a mo33942b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C26840a aVar = new C26840a(context);
        aVar.setOnClickListener(new View$OnClickListenerC14476b(this, context));
        return aVar;
    }

    /* renamed from: e */
    public final void mo53364e(Context context) {
        String str;
        String str2 = this.f38217j;
        String str3 = this.f38218k;
        AbstractC26517a aVar = this.f38214g;
        if (aVar != null) {
            str = aVar.mo94069e();
        } else {
            str = null;
        }
        m58599a(context, str2, str3, str, this.f38219l, this.f38220m);
    }

    /* renamed from: f */
    public final void mo53365f(Context context) {
        String str;
        String str2 = this.f38217j;
        String str3 = this.f38218k;
        AbstractC26517a aVar = this.f38214g;
        if (aVar != null) {
            str = aVar.mo94069e();
        } else {
            str = null;
        }
        m58602b(context, str2, str3, str, this.f38219l, this.f38220m);
    }

    /* renamed from: i */
    public final void mo53368i(Context context) {
        String str;
        String str2 = this.f38217j;
        String str3 = this.f38218k;
        AbstractC26517a aVar = this.f38214g;
        if (aVar != null) {
            str = aVar.mo94069e();
        } else {
            str = null;
        }
        m58605c(context, str2, str3, str, this.f38219l, this.f38220m);
    }

    /* renamed from: j */
    public final void mo53369j(Context context) {
        String str;
        String str2 = this.f38217j;
        String str3 = this.f38218k;
        AbstractC26517a aVar = this.f38214g;
        if (aVar != null) {
            str = aVar.mo94069e();
        } else {
            str = null;
        }
        m58606d(context, str2, str3, str, this.f38219l, this.f38220m);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "indexs", "", "", "kotlin.jvm.PlatformType", "", "onConfirm"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$g */
    public static final class C14481g implements AbstractC14514h {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38228a;

        C14481g(LynxPickerView lynxPickerView) {
            this.f38228a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14514h
        /* renamed from: a */
        public final void mo53381a(List<Integer> list) {
            if (this.f38228a.f38213e) {
                AbstractC26684l u = this.f38228a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38228a.mo94576q(), "confirm");
                cVar.mo94347a("value", list);
                i.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onConfirm: " + list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "indexs", "", "", "kotlin.jvm.PlatformType", "", "onConfirm", "com/bytedance/ies/xelement/picker/LynxPickerView$showLegacySingleSelectorPicker$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$j */
    public static final class C14484j implements AbstractC14514h {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38231a;

        /* renamed from: b */
        final /* synthetic */ List f38232b;

        /* renamed from: c */
        final /* synthetic */ Integer f38233c;

        C14484j(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f38231a = lynxPickerView;
            this.f38232b = list;
            this.f38233c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14514h
        /* renamed from: a */
        public final void mo53381a(List<Integer> list) {
            if (this.f38231a.f38213e) {
                AbstractC26684l u = this.f38231a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38231a.mo94576q(), "confirm");
                cVar.mo94347a("value", list.get(0));
                i.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onConfirm: " + list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "indexs", "", "", "kotlin.jvm.PlatformType", "", "onConfirm"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$n */
    public static final class C14488n implements AbstractC14514h {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38239a;

        C14488n(LynxPickerView lynxPickerView) {
            this.f38239a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14514h
        /* renamed from: a */
        public final void mo53381a(List<Integer> list) {
            if (this.f38239a.f38211c) {
                AbstractC26684l u = this.f38239a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38239a.mo94576q(), "change");
                cVar.mo94347a("value", list);
                i.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onConfirm: " + list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "indexs", "", "", "kotlin.jvm.PlatformType", "", "onConfirm", "com/bytedance/ies/xelement/picker/LynxPickerView$showSingleSelectorPicker$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$q */
    public static final class C14491q implements AbstractC14514h {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38242a;

        /* renamed from: b */
        final /* synthetic */ List f38243b;

        /* renamed from: c */
        final /* synthetic */ Integer f38244c;

        C14491q(LynxPickerView lynxPickerView, List list, Integer num) {
            this.f38242a = lynxPickerView;
            this.f38243b = list;
            this.f38244c = num;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14514h
        /* renamed from: a */
        public final void mo53381a(List<Integer> list) {
            if (this.f38242a.f38211c) {
                AbstractC26684l u = this.f38242a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38242a.mo94576q(), "change");
                cVar.mo94347a("value", list.get(0));
                i.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onConfirm: " + list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ies/xelement/picker/LynxPickerView$createView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$b */
    public static final class View$OnClickListenerC14476b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38222a;

        /* renamed from: b */
        final /* synthetic */ Context f38223b;

        View$OnClickListenerC14476b(LynxPickerView lynxPickerView, Context context) {
            this.f38222a = lynxPickerView;
            this.f38223b = context;
        }

        public final void onClick(View view) {
            String str = this.f38222a.f38209a;
            switch (str.hashCode()) {
                case -1698645471:
                    if (str.equals("multiSelectorLegacy")) {
                        this.f38222a.mo53367h(this.f38223b);
                        return;
                    }
                    return;
                case -1364270024:
                    if (str.equals("multiSelector")) {
                        this.f38222a.mo53363d(this.f38223b);
                        return;
                    }
                    return;
                case 3076014:
                    if (str.equals("date")) {
                        this.f38222a.mo53365f(this.f38223b);
                        return;
                    }
                    return;
                case 3560141:
                    if (str.equals("time")) {
                        this.f38222a.mo53364e(this.f38223b);
                        return;
                    }
                    return;
                case 317445399:
                    if (str.equals("dateLegacy")) {
                        this.f38222a.mo53369j(this.f38223b);
                        return;
                    }
                    return;
                case 578692342:
                    if (str.equals("timeLegacy")) {
                        this.f38222a.mo53368i(this.f38223b);
                        return;
                    }
                    return;
                case 1191572447:
                    if (str.equals("selector")) {
                        this.f38222a.mo53362c(this.f38223b);
                        return;
                    }
                    return;
                case 1434529928:
                    if (str.equals("selectorLegacy")) {
                        this.f38222a.mo53366g(this.f38223b);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: c */
    public final void mo53362c(Context context) {
        boolean z;
        ReadableArray f;
        String e;
        AbstractC26517a aVar = this.f38215h;
        if (aVar != null) {
            boolean z2 = true;
            if (aVar.mo94071g() != ReadableType.Array || aVar.mo94065a()) {
                z = false;
            } else {
                z = true;
            }
            Integer num = null;
            if (!z) {
                aVar = null;
            }
            if (!(aVar == null || (f = aVar.mo94070f()) == null)) {
                if (f.size() <= 0 || f.isNull(0)) {
                    z2 = false;
                }
                if (!z2) {
                    f = null;
                }
                if (f != null) {
                    ArrayList arrayList = new ArrayList();
                    if (f.getType(0) == ReadableType.String) {
                        ArrayList<Object> arrayList2 = f.toArrayList();
                        if (arrayList2 != null) {
                            arrayList.addAll(arrayList2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        }
                    } else {
                        AbstractC26517a aVar2 = this.f38216i;
                        if (!(aVar2 == null || (e = aVar2.mo94069e()) == null)) {
                            int size = f.size();
                            for (int i = 0; i < size; i++) {
                                String string = f.getMap(i).getString(e);
                                Intrinsics.checkExpressionValueIsNotNull(string, "array.getMap(i).getString(key)");
                                arrayList.add(string);
                            }
                        }
                    }
                    AbstractC26517a aVar3 = this.f38214g;
                    if (aVar3 != null) {
                        num = Integer.valueOf(aVar3.mo94068d());
                    }
                    m58600a(context, arrayList, num);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo53363d(Context context) {
        boolean z;
        ReadableArray f;
        ReadableArray f2;
        ReadableArray f3;
        String string;
        AbstractC26517a aVar = this.f38215h;
        if (aVar != null) {
            if (aVar.mo94071g() != ReadableType.Array || aVar.mo94065a()) {
                z = false;
            } else {
                z = true;
            }
            ArrayList arrayList = null;
            if (!z) {
                aVar = null;
            }
            if (!(aVar == null || (f = aVar.mo94070f()) == null)) {
                ArrayList arrayList2 = new ArrayList();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    ReadableArray array = f.getArray(i);
                    ArrayList arrayList3 = new ArrayList();
                    if (!array.isNull(0)) {
                        if (array.getType(0) == ReadableType.String) {
                            ArrayList<Object> arrayList4 = array.toArrayList();
                            if (arrayList4 != null) {
                                arrayList3.addAll(C69121n.m265989f(arrayList4));
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                            }
                        } else {
                            AbstractC26517a aVar2 = this.f38216i;
                            if (!(aVar2 == null || (f3 = aVar2.mo94070f()) == null || (string = f3.getString(i)) == null)) {
                                int size2 = array.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    String string2 = array.getMap(i2).getString(string);
                                    Intrinsics.checkExpressionValueIsNotNull(string2, "column.getMap(j).getString(key)");
                                    arrayList3.add(string2);
                                }
                            }
                        }
                    }
                    arrayList2.add(arrayList3);
                }
                AbstractC26517a aVar3 = this.f38214g;
                ArrayList<Object> arrayList5 = (aVar3 == null || (f2 = aVar3.mo94070f()) == null) ? null : f2.toArrayList();
                if (!C69121n.m265988e(arrayList5)) {
                    arrayList5 = null;
                }
                ArrayList<Object> arrayList6 = arrayList5;
                if (arrayList6 != null) {
                    ArrayList<Object> arrayList7 = arrayList6;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                    Iterator<T> it = arrayList7.iterator();
                    while (it.hasNext()) {
                        arrayList8.add(Integer.valueOf((int) it.next().doubleValue()));
                    }
                    arrayList = arrayList8;
                }
                m58601a(context, arrayList2, arrayList);
            }
        }
    }

    /* renamed from: g */
    public final void mo53366g(Context context) {
        boolean z;
        ReadableArray f;
        String e;
        AbstractC26517a aVar = this.f38215h;
        if (aVar != null) {
            boolean z2 = true;
            if (aVar.mo94071g() != ReadableType.Array || aVar.mo94065a()) {
                z = false;
            } else {
                z = true;
            }
            Integer num = null;
            if (!z) {
                aVar = null;
            }
            if (!(aVar == null || (f = aVar.mo94070f()) == null)) {
                if (f.size() <= 0 || f.isNull(0)) {
                    z2 = false;
                }
                if (!z2) {
                    f = null;
                }
                if (f != null) {
                    ArrayList arrayList = new ArrayList();
                    if (f.getType(0) == ReadableType.String) {
                        ArrayList<Object> arrayList2 = f.toArrayList();
                        if (arrayList2 != null) {
                            arrayList.addAll(arrayList2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        }
                    } else {
                        AbstractC26517a aVar2 = this.f38216i;
                        if (!(aVar2 == null || (e = aVar2.mo94069e()) == null)) {
                            int size = f.size();
                            for (int i = 0; i < size; i++) {
                                String string = f.getMap(i).getString(e);
                                Intrinsics.checkExpressionValueIsNotNull(string, "array.getMap(i).getString(key)");
                                arrayList.add(string);
                            }
                        }
                    }
                    AbstractC26517a aVar3 = this.f38214g;
                    if (aVar3 != null) {
                        num = Integer.valueOf(aVar3.mo94068d());
                    }
                    m58603b(context, arrayList, num);
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo53367h(Context context) {
        boolean z;
        ReadableArray f;
        ReadableArray f2;
        ReadableArray f3;
        String string;
        AbstractC26517a aVar = this.f38215h;
        if (aVar != null) {
            if (aVar.mo94071g() != ReadableType.Array || aVar.mo94065a()) {
                z = false;
            } else {
                z = true;
            }
            ArrayList arrayList = null;
            if (!z) {
                aVar = null;
            }
            if (!(aVar == null || (f = aVar.mo94070f()) == null)) {
                ArrayList arrayList2 = new ArrayList();
                int size = f.size();
                for (int i = 0; i < size; i++) {
                    ReadableArray array = f.getArray(i);
                    ArrayList arrayList3 = new ArrayList();
                    if (!array.isNull(0)) {
                        if (array.getType(0) == ReadableType.String) {
                            ArrayList<Object> arrayList4 = array.toArrayList();
                            if (arrayList4 != null) {
                                arrayList3.addAll(C69121n.m265989f(arrayList4));
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.String>");
                            }
                        } else {
                            AbstractC26517a aVar2 = this.f38216i;
                            if (!(aVar2 == null || (f3 = aVar2.mo94070f()) == null || (string = f3.getString(i)) == null)) {
                                int size2 = array.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    String string2 = array.getMap(i2).getString(string);
                                    Intrinsics.checkExpressionValueIsNotNull(string2, "column.getMap(j).getString(key)");
                                    arrayList3.add(string2);
                                }
                            }
                        }
                    }
                    arrayList2.add(arrayList3);
                }
                AbstractC26517a aVar3 = this.f38214g;
                ArrayList<Object> arrayList5 = (aVar3 == null || (f2 = aVar3.mo94070f()) == null) ? null : f2.toArrayList();
                if (!C69121n.m265988e(arrayList5)) {
                    arrayList5 = null;
                }
                ArrayList<Object> arrayList6 = arrayList5;
                if (arrayList6 != null) {
                    ArrayList<Object> arrayList7 = arrayList6;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
                    Iterator<T> it = arrayList7.iterator();
                    while (it.hasNext()) {
                        arrayList8.add(Integer.valueOf((int) it.next().doubleValue()));
                    }
                    arrayList = arrayList8;
                }
                m58604b(context, arrayList2, arrayList);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53260a(Map<String, ? extends C26545a> map) {
        super.mo53260a((Map<String, C26545a>) map);
        Log.d("LynxPickerView", "setEvents: " + map);
        if (map != null) {
            this.f38210b = map.containsKey("cancel");
            this.f38211c = map.containsKey("change");
            this.f38212d = map.containsKey("columnchange");
            this.f38213e = map.containsKey("confirm");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxPickerView(AbstractC26684l lVar, LocalizeAdapter aVar) {
        super(lVar);
        Intrinsics.checkParameterIsNotNull(lVar, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "adapter");
        this.f38221n = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "date", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "onConfirm"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$c */
    public static final class C14477c implements AbstractC14516j {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38224a;

        C14477c(LynxPickerView lynxPickerView) {
            this.f38224a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14516j
        /* renamed from: a */
        public final void mo53379a(String str, View view) {
            if (this.f38224a.f38211c) {
                AbstractC26684l u = this.f38224a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38224a.mo94576q(), "change");
                cVar.mo94347a("value", str);
                i.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onDateSelect: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "date", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "onConfirm"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$e */
    public static final class C14479e implements AbstractC14516j {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38226a;

        C14479e(LynxPickerView lynxPickerView) {
            this.f38226a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14516j
        /* renamed from: a */
        public final void mo53379a(String str, View view) {
            if (this.f38226a.f38213e) {
                AbstractC26684l u = this.f38226a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38226a.mo94576q(), "confirm");
                cVar.mo94347a("value", str);
                i.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onDateSelect: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "date", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "onConfirm"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$l */
    public static final class C14486l implements AbstractC14516j {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38237a;

        C14486l(LynxPickerView lynxPickerView) {
            this.f38237a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14516j
        /* renamed from: a */
        public final void mo53379a(String str, View view) {
            if (this.f38237a.f38213e) {
                AbstractC26684l u = this.f38237a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38237a.mo94576q(), "confirm");
                cVar.mo94347a("value", str);
                i.mo94075a(cVar);
            }
            Log.i("LynxPickerView", "onTimeSelect: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "date", "", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Landroid/view/View;", "onConfirm"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$s */
    public static final class C14493s implements AbstractC14516j {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38248a;

        C14493s(LynxPickerView lynxPickerView) {
            this.f38248a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14516j
        /* renamed from: a */
        public final void mo53379a(String str, View view) {
            if (this.f38248a.f38211c) {
                AbstractC26684l u = this.f38248a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i = u.mo94687i();
                C26547c cVar = new C26547c(this.f38248a.mo94576q(), "change");
                cVar.mo94347a("value", str);
                i.mo94075a(cVar);
            }
            Log.i("LynxPickerView", "onTimeSelect: " + str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00042\u000e\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "", "kotlin.jvm.PlatformType", "", "column", "index", "onChange", "(Ljava/util/List;ILjava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$h */
    public static final class C14482h implements AbstractC14513g {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38229a;

        C14482h(LynxPickerView lynxPickerView) {
            this.f38229a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14513g
        /* renamed from: a */
        public final void mo53382a(List<Integer> list, int i, Integer num) {
            if (this.f38229a.f38211c) {
                AbstractC26684l u = this.f38229a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i2 = u.mo94687i();
                C26547c cVar = new C26547c(this.f38229a.mo94576q(), "change");
                cVar.mo94347a("column", Integer.valueOf(i));
                cVar.mo94347a("value", num);
                i2.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onChange: column:" + i + " index:" + num);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u00032\u0006\u0010\u0007\u001a\u00020\u00042\u000e\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "", "kotlin.jvm.PlatformType", "", "column", "index", "onChange", "(Ljava/util/List;ILjava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.xelement.picker.LynxPickerView$o */
    public static final class C14489o implements AbstractC14513g {

        /* renamed from: a */
        final /* synthetic */ LynxPickerView f38240a;

        C14489o(LynxPickerView lynxPickerView) {
            this.f38240a = lynxPickerView;
        }

        @Override // com.bytedance.ies.xelement.picker.p822e.AbstractC14513g
        /* renamed from: a */
        public final void mo53382a(List<Integer> list, int i, Integer num) {
            if (this.f38240a.f38212d) {
                AbstractC26684l u = this.f38240a.mo95039u();
                Intrinsics.checkExpressionValueIsNotNull(u, "lynxContext");
                EventEmitter i2 = u.mo94687i();
                C26547c cVar = new C26547c(this.f38240a.mo94576q(), "columnchange");
                cVar.mo94347a("column", Integer.valueOf(i));
                cVar.mo94347a("value", num);
                i2.mo94075a(cVar);
            }
            Log.d("LynxPickerView", "onChange: column:" + i + " index:" + num);
        }
    }

    /* renamed from: a */
    private final void m58600a(Context context, List<String> list, Integer num) {
        C14501c cVar = new C14501c(context);
        cVar.mo53398a(this.f38221n);
        cVar.mo53400a(new C14491q(this, list, num));
        cVar.mo53389a(new C14492r(this, list, num));
        cVar.mo53401a(CollectionsKt.mutableListOf(list));
        if (num != null) {
            cVar.mo53402b(CollectionsKt.mutableListOf(Integer.valueOf(num.intValue())));
        }
        cVar.mo53403b().mo53466b(this.f66253Z);
    }

    /* renamed from: b */
    private final void m58603b(Context context, List<String> list, Integer num) {
        C14501c cVar = new C14501c(context);
        cVar.mo53398a(this.f38221n);
        cVar.mo53400a(new C14484j(this, list, num));
        cVar.mo53389a(new C14485k(this, list, num));
        cVar.mo53401a(CollectionsKt.mutableListOf(list));
        if (num != null) {
            cVar.mo53402b(CollectionsKt.mutableListOf(Integer.valueOf(num.intValue())));
        }
        cVar.mo53403b().mo53466b(this.f66253Z);
    }

    /* renamed from: a */
    private final void m58601a(Context context, List<? extends List<String>> list, List<Integer> list2) {
        ((C14501c) new C14501c(context).mo53398a(this.f38221n).mo53400a(new C14488n(this)).mo53399a(new C14489o(this)).mo53389a(new C14490p(this))).mo53401a((List<List<String>>) list).mo53402b(list2).mo53403b().mo53466b(this.f66253Z);
    }

    /* renamed from: b */
    private final void m58604b(Context context, List<? extends List<String>> list, List<Integer> list2) {
        ((C14501c) new C14501c(context).mo53398a(this.f38221n).mo53400a(new C14481g(this)).mo53399a(new C14482h(this)).mo53389a(new C14483i(this))).mo53401a((List<List<String>>) list).mo53402b(list2).mo53403b().mo53466b(this.f66253Z);
    }

    /* renamed from: a */
    private final void m58599a(Context context, String str, String str2, String str3, String str4, String str5) {
        ((C14502d) new C14502d(context).mo53404a(this.f38221n).mo53405a(new C14493s(this)).mo53389a(new C14494t(this))).mo53408b(str5).mo53406a(str4).mo53407a(str, str2).mo53410c(str3).mo53409b().mo53466b(this.f66253Z);
    }

    /* renamed from: b */
    private final void m58602b(Context context, String str, String str2, String str3, String str4, String str5) {
        ((C14500b) new C14500b(context).mo53391a(this.f38221n).mo53392a(new C14477c(this)).mo53389a(new C14478d(this))).mo53395b(str5).mo53393a(str4).mo53394a(str, str2).mo53397c(str3).mo53396b().mo53466b(this.f66253Z);
    }

    /* renamed from: c */
    private final void m58605c(Context context, String str, String str2, String str3, String str4, String str5) {
        ((C14502d) new C14502d(context).mo53404a(this.f38221n).mo53405a(new C14486l(this)).mo53389a(new C14487m(this))).mo53408b(str5).mo53406a(str4).mo53407a(str, str2).mo53410c(str3).mo53409b().mo53466b(this.f66253Z);
    }

    /* renamed from: d */
    private final void m58606d(Context context, String str, String str2, String str3, String str4, String str5) {
        ((C14500b) new C14500b(context).mo53391a(this.f38221n).mo53392a(new C14479e(this)).mo53389a(new C14480f(this))).mo53395b(str5).mo53393a(str4).mo53394a(str, str2).mo53397c(str3).mo53396b().mo53466b(this.f66253Z);
    }
}
