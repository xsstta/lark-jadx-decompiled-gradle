package com.ss.android.lark.keyboard.plugin.tool.aa.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.widget.C41112g;
import com.ss.android.lark.keyboard.widget.IPluginLayoutManager;
import com.ss.android.lark.keyboard.widget.KBPluginContainerView;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0017R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginContainer;", "Lcom/ss/android/lark/keyboard/widget/KBPluginContainerView;", "context", "Landroid/content/Context;", "subIcons", "", "Landroid/view/View;", "exitAction", "Lkotlin/Function0;", "", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "backIconView", "subPluginIcons", "Ljava/util/LinkedList;", "verticalPadding", "", "getVerticalPadding", "()I", "initSelf", "initSubPluginIcons", "insertBackView", "setBackViewVisibility", "visibility", "setBackViewVisibility$im_keyboard_release", "AaSubPluginLayoutManager", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.a */
public final class AaStylePluginContainer extends KBPluginContainerView {

    /* renamed from: b */
    public static final Companion f103717b = new Companion(null);

    /* renamed from: a */
    public final Function0<Unit> f103718a;

    /* renamed from: c */
    private final LinkedList<View> f103719c;

    /* renamed from: d */
    private View f103720d;

    /* renamed from: e */
    private final int f103721e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginContainer$Companion;", "", "()V", "WRAP_CONTENT", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.keyboard.widget.KBPluginContainerView
    public int getVerticalPadding() {
        return this.f103721e;
    }

    /* renamed from: b */
    private final void m161507b() {
        setOrientation(0);
        setGravity(8388627);
    }

    /* renamed from: c */
    private final void m161508c() {
        AppCompatImageView a = C40679d.m160787a(getContext(), R.id.kb_plugin_style_back, R.drawable.ic_sub_plugin_back, false);
        Intrinsics.checkExpressionValueIsNotNull(a, "backIcon");
        a.setSelected(true);
        a.setOnClickListener(new View$OnClickListenerC40805c(this));
        a.setPadding(0, 0, C57582a.m223611b(getContext(), (int) R.dimen.keyboard_icon_padding_ig_aa), 0);
        this.f103719c.add(0, a);
    }

    /* renamed from: d */
    private final void m161509d() {
        LinkedList<View> linkedList = this.f103719c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedList, 10));
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            frameLayout.addView(it.next());
            arrayList.add(frameLayout);
        }
        ArrayList<FrameLayout> arrayList2 = arrayList;
        this.f103720d = (View) CollectionsKt.first((List) arrayList2);
        for (FrameLayout frameLayout2 : arrayList2) {
            addView(frameLayout2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.a$c */
    public static final class View$OnClickListenerC40805c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AaStylePluginContainer f103723a;

        View$OnClickListenerC40805c(AaStylePluginContainer aVar) {
            this.f103723a = aVar;
        }

        public final void onClick(View view) {
            this.f103723a.f103718a.invoke();
        }
    }

    public final void setBackViewVisibility$im_keyboard_release(int i) {
        View view = this.f103720d;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/aa/widget/AaStylePluginContainer$AaSubPluginLayoutManager;", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "()V", "onLayoutPlugin", "", "container", "Landroid/widget/LinearLayout;", "visibleChildViews", "", "Landroid/view/View;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.a.b.a$a */
    private static final class AaSubPluginLayoutManager implements IPluginLayoutManager {
        @Override // com.ss.android.lark.keyboard.widget.IPluginLayoutManager
        /* renamed from: a */
        public void mo147347a(LinearLayout linearLayout, List<? extends View> list) {
            Intrinsics.checkParameterIsNotNull(linearLayout, "container");
            Intrinsics.checkParameterIsNotNull(list, "visibleChildViews");
            int b = C57582a.m223611b(linearLayout.getContext(), (int) R.dimen.keyboard_icon_horizontal_margin_ig_aa);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C41112g.m163058a(it.next(), b, 0, 2, null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AaStylePluginContainer(Context context, List<? extends View> list, Function0<Unit> function0) {
        super(context, null, 0, 0, 14, null);
        Intrinsics.checkParameterIsNotNull(list, "subIcons");
        Intrinsics.checkParameterIsNotNull(function0, "exitAction");
        this.f103718a = function0;
        this.f103719c = new LinkedList<>(list);
        this.f103721e = C57582a.m223611b(context, (int) R.dimen.keyboard_icon_vertical_margin_ig_aa);
        m161507b();
        m161508c();
        m161509d();
        setOnClickListener(View$OnClickListenerC408041.f103722a);
        setPluginLayoutManager(new AaSubPluginLayoutManager());
    }
}
