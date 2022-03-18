package com.ss.android.lark.widget.recyclerview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.trace.p155a.C3069b;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0016\u0018\u0000 02\u00020\u0001:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e0\u001dJ\n\u0010\u001f\u001a\u0004\u0018\u00010\u0012H\u0002J\n\u0010 \u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0014J\u0006\u0010#\u001a\u00020\u001bJ\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001bH\u0014J\b\u0010(\u001a\u00020\u001bH\u0014J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u000eJ\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u0014J\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u0019J\u0006\u0010/\u001a\u00020\u001bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mExtra", "Lorg/json/JSONObject;", "mFpsCallback", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView$IFpsCallback;", "mFpsTracer", "Lcom/bytedance/apm/trace/fps/FpsTracer;", "mInputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "mIsHideKeyBoardOnScroll", "", "mMonitorFps", "mOnKeyboardDismissingScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "mSceneTag", "", "addExtra", "", "map", "", "", "getInputMethodManager", "getSceneTag", "hideKeyBoardOnScroll", "isEnable", "hideKeyboard", "initFastScroller", "initFpsTrace", "initOnKeyboardDismissingListener", "onAttachedToWindow", "onDetachedFromWindow", "setFpsCallback", "fpsCallback", "setMonitorFps", "monitorFps", "setSceneTag", "sceneTag", "setupScrollBar", "Companion", "IFpsCallback", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
public class CommonRecyclerView extends RecyclerView {

    /* renamed from: p */
    public static final Companion f146076p = new Companion(null);

    /* renamed from: a */
    private boolean f146077a;

    /* renamed from: b */
    private String f146078b;

    /* renamed from: c */
    private JSONObject f146079c;

    /* renamed from: d */
    private RecyclerView.OnScrollListener f146080d;

    /* renamed from: e */
    private InputMethodManager f146081e;

    /* renamed from: m */
    public C3069b f146082m;

    /* renamed from: n */
    public boolean f146083n;

    /* renamed from: o */
    public IFpsCallback f146084o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView$IFpsCallback;", "", "callback", "", "fps", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.recyclerview.CommonRecyclerView$b */
    public interface IFpsCallback {
        void callback(double d);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView$Companion;", "", "()V", "REPORT_EVENT", "", "REPORT_KEY_FPS", "REPORT_KEY_SCENE", "TAG", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.recyclerview.CommonRecyclerView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void mo166921a() {
        this.f146080d = new C58958e(this);
    }

    /* renamed from: c */
    public final void mo200038c() {
        if (DesktopUtil.m144301a(getContext())) {
            m228853e();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RecyclerView.OnScrollListener onScrollListener = this.f146080d;
        if (onScrollListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnKeyboardDismissingScrollListener");
        }
        removeOnScrollListener(onScrollListener);
    }

    private final InputMethodManager getInputMethodManager() {
        if (this.f146081e == null) {
            this.f146081e = (InputMethodManager) getContext().getSystemService("input_method");
        }
        return this.f146081e;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f146077a) {
            mo166922b();
        }
        RecyclerView.OnScrollListener onScrollListener = this.f146080d;
        if (onScrollListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnKeyboardDismissingScrollListener");
        }
        addOnScrollListener(onScrollListener);
    }

    /* renamed from: b */
    private final void mo166922b() {
        if (this.f146082m == null) {
            C3069b bVar = new C3069b(getSceneTag(), C26284k.m95186b(getContext()), this.f146079c);
            this.f146082m = bVar;
            if (bVar != null) {
                bVar.mo12925a(new C58956c(this));
            }
            addOnScrollListener(new C58957d(this));
        }
    }

    /* renamed from: d */
    public final void mo200039d() {
        try {
            InputMethodManager inputMethodManager = getInputMethodManager();
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            }
            clearFocus();
        } catch (IllegalArgumentException e) {
            Log.m165383e("CommonRecyclerView", "hide keyboard exception:" + e.getMessage());
        }
    }

    /* renamed from: e */
    private final void m228853e() {
        Drawable drawable = getContext().getDrawable(R.drawable.thumb_drawable);
        if (drawable != null) {
            StateListDrawable stateListDrawable = (StateListDrawable) drawable;
            Drawable drawable2 = getContext().getDrawable(R.drawable.line_drawable);
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Resources resources = context.getResources();
            new C58975b(this, stateListDrawable, drawable2, stateListDrawable, drawable2, UIUtils.dp2px(getContext(), 5.0f), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.StateListDrawable");
    }

    public String getSceneTag() {
        String str;
        String str2 = this.f146078b;
        if (str2 != null) {
            return str2;
        }
        String str3 = null;
        try {
            Resources resources = getResources();
            ViewParent parent = getParent();
            if (parent != null) {
                str = resources.getResourceEntryName(((ViewGroup) parent).getId());
                try {
                    str3 = getResources().getResourceEntryName(getId());
                } catch (Exception unused) {
                }
                String str4 = str;
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                    str = str + '/' + str3;
                } else if (TextUtils.isEmpty(str4)) {
                    str = str3;
                }
                this.f146078b = str;
                if (TextUtils.isEmpty(str)) {
                    this.f146078b = "CommonRecyclerView";
                }
                return this.f146078b;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        } catch (Exception unused2) {
            str = str3;
        }
    }

    /* renamed from: a */
    public final void mo200037a(boolean z) {
        this.f146083n = z;
    }

    public final void setMonitorFps(boolean z) {
        this.f146077a = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/widget/recyclerview/CommonRecyclerView$initFpsTrace$onScrollChangeListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.recyclerview.CommonRecyclerView$d */
    public static final class C58957d extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CommonRecyclerView f146086a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58957d(CommonRecyclerView commonRecyclerView) {
            this.f146086a = commonRecyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (i != 0) {
                C3069b bVar = this.f146086a.f146082m;
                if (bVar != null) {
                    bVar.mo12923a();
                }
                C58994g.m228967a();
                return;
            }
            C3069b bVar2 = this.f146086a.f146082m;
            if (bVar2 != null) {
                bVar2.mo12926b();
            }
            C58994g.m228969b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"com/ss/android/lark/widget/recyclerview/CommonRecyclerView$initOnKeyboardDismissingListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "isKeyboardDismissedByScroll", "", "()Z", "setKeyboardDismissedByScroll", "(Z)V", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "state", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.recyclerview.CommonRecyclerView$e */
    public static final class C58958e extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ CommonRecyclerView f146087a;

        /* renamed from: b */
        private boolean f146088b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C58958e(CommonRecyclerView commonRecyclerView) {
            this.f146087a = commonRecyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            if (!this.f146087a.f146083n) {
                return;
            }
            if (i == 0) {
                this.f146088b = false;
            } else if (i == 1 && !this.f146088b) {
                this.f146087a.mo200039d();
                this.f146088b = true ^ this.f146088b;
            }
        }
    }

    public final void setFpsCallback(IFpsCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "fpsCallback");
        this.f146084o = bVar;
    }

    public final void setSceneTag(String str) {
        Intrinsics.checkParameterIsNotNull(str, "sceneTag");
        this.f146078b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommonRecyclerView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "fpsCallBack"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.recyclerview.CommonRecyclerView$c */
    public static final class C58956c implements C3069b.AbstractC3076d {

        /* renamed from: a */
        final /* synthetic */ CommonRecyclerView f146085a;

        C58956c(CommonRecyclerView commonRecyclerView) {
            this.f146085a = commonRecyclerView;
        }

        @Override // com.bytedance.apm.trace.p155a.C3069b.AbstractC3076d
        public final void fpsCallBack(double d) {
            IFpsCallback bVar = this.f146085a.f146084o;
            if (bVar != null) {
                bVar.callback(d);
            }
            if (C26284k.m95186b(this.f146085a.getContext())) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", this.f146085a.getSceneTag());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("fps", d);
                ApmAgent.monitorEvent("bytest_scroll_fps", jSONObject, jSONObject2, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo200036a(Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(map, "map");
        if (this.f146079c == null) {
            this.f146079c = new JSONObject();
        }
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            JSONObject jSONObject = this.f146079c;
            if (jSONObject != null) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommonRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f146077a = true;
        this.f146083n = true;
        mo166921a();
    }
}
