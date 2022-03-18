package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground.calendar.bean.WebEditorStyle;
import com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a;
import com.bytedance.ee.bear.middleground.calendar.p440a.C8891a;
import com.bytedance.ee.bear.middleground.calendar.plugin.EditorInitHelper;
import com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.p1500b.C31164a;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionSaveData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.DescriptionShowData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0003J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u000e\u0010!\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment$DescriptionFragmentAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionShowData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment$DescriptionFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionShowData;)V", "TAG_LOG", "", "mDescWebEditor", "Lcom/bytedance/ee/bear/middleground/calendar/pool/WebEditorWrapper;", "mDescriptionData", "mDescriptionFragmentAction", "mIsFromLocalRecover", "", "bindToolBar", "", "initDescWebEditor", "initDescriptionData", "initTitleBar", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "updateData", "DescriptionFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i */
public final class EditDescriptionFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public WebEditorWrapper f80640a;

    /* renamed from: b */
    public DescriptionFragmentAction f80641b;

    /* renamed from: e */
    private final String f80642e;

    /* renamed from: f */
    private boolean f80643f;

    /* renamed from: g */
    private DescriptionShowData f80644g;

    /* renamed from: h */
    private HashMap f80645h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment$DescriptionFragmentAction;", "", "onBackPressed", "", "onSavePressed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/DescriptionSaveData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$a */
    public interface DescriptionFragmentAction {
        /* renamed from: a */
        void mo114357a();

        /* renamed from: a */
        void mo114358a(DescriptionSaveData aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80645h == null) {
            this.f80645h = new HashMap();
        }
        View view = (View) this.f80645h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80645h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80645h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    public EditDescriptionFragment() {
        this.f80642e = "EditDescriptionFragment";
        this.f80643f = true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRenderProcessGone"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$b */
    public static final class C31727b implements AbstractC8921a {

        /* renamed from: a */
        final /* synthetic */ EditDescriptionFragment f80646a;

        C31727b(EditDescriptionFragment iVar) {
            this.f80646a = iVar;
        }

        @Override // com.bytedance.ee.bear.middleground.calendar.editor.AbstractC8921a
        /* renamed from: a */
        public final void mo34221a() {
            Log.m165389i(this.f80646a.TAG, C32673y.m125378d("Webview render process gone!"));
            FragmentActivity activity = this.f80646a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        KeyboardUtils.hideKeyboard(getContext());
        WebEditorWrapper webEditorWrapper = this.f80640a;
        if (webEditorWrapper == null) {
            return true;
        }
        webEditorWrapper.hasModify(new C31735e(this));
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        WebEditorWrapper webEditorWrapper = this.f80640a;
        if (webEditorWrapper != null) {
            webEditorWrapper.setRenderProcessListener(null);
        }
        WebEditorWrapper webEditorWrapper2 = this.f80640a;
        if (webEditorWrapper2 != null) {
            webEditorWrapper2.destroy();
        }
    }

    /* renamed from: c */
    private final void m120092c() {
        C8891a aVar;
        WebEditorWrapper webEditorWrapper = this.f80640a;
        if (webEditorWrapper != null) {
            aVar = webEditorWrapper.getCalendarWebView();
        } else {
            aVar = null;
        }
        FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.pluginUIContainer);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "pluginUIContainer");
        frameLayout.setVisibility(0);
        if (aVar != null) {
            FrameLayout frameLayout2 = (FrameLayout) mo109250a(R.id.pluginUIContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "pluginUIContainer");
            EditorInitHelper.f24081a.mo34223a(this, aVar, frameLayout2);
        }
    }

    /* renamed from: f */
    private final void m120094f() {
        ((CommonTitleBar) mo109250a(R.id.description_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.description_title_bar)).setLeftImageDrawable(null);
        ((CommonTitleBar) mo109250a(R.id.description_title_bar)).setLeftText(R.string.Calendar_Common_Cancel);
        ((CommonTitleBar) mo109250a(R.id.description_title_bar)).setTitle(R.string.Calendar_Edit_Description);
        ((CommonTitleBar) mo109250a(R.id.description_title_bar)).setLeftClickListener(new C31728c(this));
        ((CommonTitleBar) mo109250a(R.id.description_title_bar)).addAction(new C31729d(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.lkui_B500));
    }

    /* renamed from: b */
    private final void m120091b() {
        WebEditorWrapper b = C31164a.m116337a().mo112896b(getContext());
        this.f80640a = b;
        if (b != null) {
            b.setRenderProcessListener(new C31727b(this));
        }
        WebEditorWrapper webEditorWrapper = this.f80640a;
        boolean z = false;
        if (webEditorWrapper != null) {
            webEditorWrapper.setVisibility(0);
        }
        WebEditorWrapper webEditorWrapper2 = this.f80640a;
        if (webEditorWrapper2 != null) {
            webEditorWrapper2.setFocusable(true);
        }
        WebEditorWrapper webEditorWrapper3 = this.f80640a;
        if (webEditorWrapper3 != null) {
            webEditorWrapper3.requestFocus();
        }
        WebEditorWrapper webEditorWrapper4 = this.f80640a;
        if (webEditorWrapper4 != null) {
            webEditorWrapper4.setEditable(true);
        }
        KeyboardUtils.showKeyboard(getActivity());
        WebEditorStyle.C8917a aVar = new WebEditorStyle.C8917a();
        aVar.mo34203a(UIUtils.dp2px(getContext(), 60.0f));
        aVar.mo34204a(16, 16, 16, 0);
        aVar.mo34206b(C32634ae.m125178a(R.color.text_title));
        aVar.mo34207c(C32634ae.m125178a(R.color.bg_body));
        WebEditorWrapper webEditorWrapper5 = this.f80640a;
        if (webEditorWrapper5 != null) {
            webEditorWrapper5.setCustomStyle(aVar.mo34205a());
        }
        WebEditorWrapper webEditorWrapper6 = this.f80640a;
        if (webEditorWrapper6 != null) {
            webEditorWrapper6.setPlaceHolder(C32634ae.m125182b(R.string.Calendar_Edit_InputDescription));
        }
        m120092c();
        m120093d();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        ((LinearLayout) mo109250a(R.id.description_root)).addView(this.f80640a, 2, layoutParams);
        String str = this.f80642e;
        StringBuilder sb = new StringBuilder();
        sb.append("initDescWebEditorFG; mDescWebEditor is null: ");
        if (this.f80640a == null) {
            z = true;
        }
        sb.append(z);
        Log.m165389i(str, C32673y.m125377c(sb.toString()));
    }

    /* renamed from: d */
    private final void m120093d() {
        DescriptionShowData bVar = this.f80644g;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDescriptionData");
        }
        boolean z = true;
        if (bVar.mo115073a() == IEditContract.DescriptionShowType.SHOW_CONTENT) {
            WebEditorWrapper webEditorWrapper = this.f80640a;
            if (webEditorWrapper != null) {
                DescriptionShowData bVar2 = this.f80644g;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDescriptionData");
                }
                webEditorWrapper.setContent(bVar2.mo115074b());
            }
            String str = this.f80642e;
            StringBuilder sb = new StringBuilder();
            sb.append("setContent; mDescWebEditor is null: ");
            if (this.f80640a != null) {
                z = false;
            }
            sb.append(z);
            Log.m165389i(str, C32673y.m125377c(sb.toString()));
            return;
        }
        DescriptionShowData bVar3 = this.f80644g;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDescriptionData");
        }
        if (bVar3.mo115073a() == IEditContract.DescriptionShowType.SHOW_DATA) {
            WebEditorWrapper webEditorWrapper2 = this.f80640a;
            if (webEditorWrapper2 != null) {
                DescriptionShowData bVar4 = this.f80644g;
                if (bVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDescriptionData");
                }
                webEditorWrapper2.setData(bVar4.mo115074b());
            }
            String str2 = this.f80642e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setData; mDescWebEditor is null: ");
            if (this.f80640a != null) {
                z = false;
            }
            sb2.append(z);
            Log.m165389i(str2, C32673y.m125377c(sb2.toString()));
            return;
        }
        DescriptionShowData bVar5 = this.f80644g;
        if (bVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDescriptionData");
        }
        if (bVar5.mo115073a() == IEditContract.DescriptionShowType.SHOW_NULL) {
            WebEditorWrapper webEditorWrapper3 = this.f80640a;
            if (webEditorWrapper3 != null) {
                webEditorWrapper3.clear();
            }
            WebEditorWrapper webEditorWrapper4 = this.f80640a;
            if (webEditorWrapper4 != null) {
                webEditorWrapper4.setContent("");
            }
            String str3 = this.f80642e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("clear; mDescWebEditor is null: ");
            if (this.f80640a != null) {
                z = false;
            }
            sb3.append(z);
            Log.m165389i(str3, C32673y.m125377c(sb3.toString()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$c */
    public static final class C31728c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EditDescriptionFragment f80647a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31728c(EditDescriptionFragment iVar) {
            this.f80647a = iVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80647a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ DescriptionFragmentAction m120090a(EditDescriptionFragment iVar) {
        DescriptionFragmentAction aVar = iVar.f80641b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDescriptionFragmentAction");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment$initTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d */
    public static final class C31729d extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ EditDescriptionFragment f80648a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            WebEditorWrapper webEditorWrapper = this.f80648a.f80640a;
            if (webEditorWrapper != null) {
                webEditorWrapper.getText(new C31730a(this));
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "textContent", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d$a */
        public static final class C31730a<T> implements ValueCallback<String> {

            /* renamed from: a */
            final /* synthetic */ C31729d f80649a;

            C31730a(C31729d dVar) {
                this.f80649a = dVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
                if (r1 != null) goto L_0x001d;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onReceiveValue(final java.lang.String r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = ""
                    if (r5 == 0) goto L_0x001c
                    if (r5 == 0) goto L_0x0014
                    r1 = r5
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
                    java.lang.String r1 = r1.toString()
                    if (r1 == 0) goto L_0x001c
                    goto L_0x001d
                L_0x0014:
                    kotlin.TypeCastException r5 = new kotlin.TypeCastException
                    java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
                    r5.<init>(r0)
                    throw r5
                L_0x001c:
                    r1 = r0
                L_0x001d:
                    java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L_0x0042
                    java.lang.String r1 = "\n"
                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                    r1 = r1 ^ 1
                    if (r1 == 0) goto L_0x0042
                    com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d r0 = r4.f80649a
                    com.ss.android.lark.calendar.impl.features.events.edit.fragment.i r0 = r0.f80648a
                    com.bytedance.ee.bear.middleground.calendar.pool.WebEditorWrapper r0 = r0.f80640a
                    if (r0 == 0) goto L_0x0063
                    com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d$a$1 r1 = new com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d$a$1
                    r1.<init>(r4, r5)
                    android.webkit.ValueCallback r1 = (android.webkit.ValueCallback) r1
                    r0.getData(r1)
                    goto L_0x0063
                L_0x0042:
                    com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d r5 = r4.f80649a
                    com.ss.android.lark.calendar.impl.features.events.edit.fragment.i r5 = r5.f80648a
                    android.content.Context r5 = r5.getContext()
                    com.larksuite.framework.utils.KeyboardUtils.hideKeyboard(r5)
                    com.ss.android.lark.calendar.impl.features.events.edit.data.a r5 = new com.ss.android.lark.calendar.impl.features.events.edit.data.a
                    r5.<init>(r0, r0, r0)
                    android.os.Handler r0 = new android.os.Handler
                    r0.<init>()
                    com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d$a$2 r1 = new com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$d$a$2
                    r1.<init>(r4, r5)
                    java.lang.Runnable r1 = (java.lang.Runnable) r1
                    r2 = 100
                    r0.postDelayed(r1, r2)
                L_0x0063:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditDescriptionFragment.C31729d.C31730a.onReceiveValue(java.lang.String):void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31729d(EditDescriptionFragment iVar, String str, int i) {
            super(str, i);
            this.f80648a = iVar;
        }
    }

    /* renamed from: a */
    public final void mo115544a(DescriptionShowData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80644g = bVar;
        m120093d();
        WebEditorWrapper webEditorWrapper = this.f80640a;
        if (webEditorWrapper != null) {
            webEditorWrapper.requestFocus();
        }
        KeyboardUtils.showKeyboard(getActivity());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "hasModify", "", "kotlin.jvm.PlatformType", "onReceiveValue", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$e */
    public static final class C31735e<T> implements ValueCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ EditDescriptionFragment f80658a;

        C31735e(EditDescriptionFragment iVar) {
            this.f80658a = iVar;
        }

        /* renamed from: a */
        public final void onReceiveValue(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "hasModify");
            if (bool.booleanValue()) {
                Context context = this.f80658a.getContext();
                if (context != null) {
                    Intrinsics.checkExpressionValueIsNotNull(context, "it");
                    ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Alert_UnsavedDesAlert)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31737a(this))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
                    return;
                }
                return;
            }
            new Handler().postDelayed(new Runnable(this) {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditDescriptionFragment.C31735e.RunnableC317361 */

                /* renamed from: a */
                final /* synthetic */ C31735e f80659a;

                {
                    this.f80659a = r1;
                }

                public final void run() {
                    EditDescriptionFragment.m120090a(this.f80659a.f80658a).mo114357a();
                }
            }, 100);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditDescriptionFragment$onBackPressed$1$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.i$e$a */
        public static final class DialogInterface$OnClickListenerC31737a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C31735e f80660a;

            DialogInterface$OnClickListenerC31737a(C31735e eVar) {
                this.f80660a = eVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                new Handler().postDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditDescriptionFragment.C31735e.DialogInterface$OnClickListenerC31737a.RunnableC317381 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnClickListenerC31737a f80661a;

                    {
                        this.f80661a = r1;
                    }

                    public final void run() {
                        EditDescriptionFragment.m120090a(this.f80661a.f80660a.f80658a).mo114357a();
                    }
                }, 100);
            }
        }
    }

    public EditDescriptionFragment(DescriptionFragmentAction aVar, DescriptionShowData bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80642e = "EditDescriptionFragment";
        this.f80641b = aVar;
        this.f80644g = bVar;
        this.f80643f = false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80643f) {
            m120094f();
            m120091b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_description, (ViewGroup) null);
    }
}
