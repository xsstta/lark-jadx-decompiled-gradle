package com.ss.android.lark.mm.module.detail.subtitles;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.utils.ClipBoardUtil;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.selectable.AbstractC47166a;
import com.ss.android.lark.mm.widget.selectable.SelectableTextHelper;
import com.ss.android.lark.mm.widget.texthighlightbg.MmHighlightBgTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001>B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u00107\u001a\u000208H\u0002J\u0006\u00109\u001a\u00020\u000bJ\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR4\u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010)\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010(@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\"\u00104\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000f¨\u0006?"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitleContentTextView;", "Lcom/ss/android/lark/mm/widget/texthighlightbg/MmHighlightBgTextView;", "mContext", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "contentView", "Landroid/view/View;", "copyTextCallback", "Lkotlin/Function0;", "", "getCopyTextCallback", "()Lkotlin/jvm/functions/Function0;", "setCopyTextCallback", "(Lkotlin/jvm/functions/Function0;)V", "depend", "Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitleContentTextView$IMmSubtitleContentTextViewDepend;", "getDepend", "()Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitleContentTextView$IMmSubtitleContentTextViewDepend;", "setDepend", "(Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitleContentTextView$IMmSubtitleContentTextViewDepend;)V", "onClickCallback", "Lkotlin/Function1;", "", "getOnClickCallback", "()Lkotlin/jvm/functions/Function1;", "setOnClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "onLongClickCallback", "getOnLongClickCallback", "setOnLongClickCallback", "onStartCommentCallback", "Lkotlin/Function3;", "", "getOnStartCommentCallback", "()Lkotlin/jvm/functions/Function3;", "setOnStartCommentCallback", "(Lkotlin/jvm/functions/Function3;)V", "<set-?>", "Lcom/ss/android/lark/mm/widget/selectable/SelectableTextHelper;", "selectableTextHelper", "getSelectableTextHelper", "()Lcom/ss/android/lark/mm/widget/selectable/SelectableTextHelper;", "selectedColor", "getSelectedColor", "()I", "startClickTime", "", "tvComment", "tvDivider", "tvViewOriginText", "viewOriginalTextCallback", "getViewOriginalTextCallback", "setViewOriginalTextCallback", "getMode", "Lcom/ss/android/lark/mm/widget/selectable/SelectableTextHelper$Mode;", "initSelectableTextHelper", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "IMmSubtitleContentTextViewDepend", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmSubtitleContentTextView extends MmHighlightBgTextView {

    /* renamed from: a */
    public SelectableTextHelper f116269a;

    /* renamed from: c */
    private long f116270c;

    /* renamed from: e */
    private View f116271e;

    /* renamed from: f */
    private Function1<? super Integer, Unit> f116272f;

    /* renamed from: g */
    private Function0<Unit> f116273g;

    /* renamed from: h */
    private Function3<? super Integer, ? super Integer, ? super String, Unit> f116274h;

    /* renamed from: i */
    private Function0<Unit> f116275i;

    /* renamed from: j */
    private Function0<Unit> f116276j;

    /* renamed from: k */
    private IMmSubtitleContentTextViewDepend f116277k;

    /* renamed from: l */
    private View f116278l;

    /* renamed from: m */
    private View f116279m;

    /* renamed from: n */
    private View f116280n;

    /* renamed from: o */
    private final int f116281o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitleContentTextView$IMmSubtitleContentTextViewDepend;", "", "canComment", "", "isPlaying", "isTranslateMode", "isUnCompletedStatus", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView$a */
    public interface IMmSubtitleContentTextViewDepend {
        /* renamed from: a */
        boolean mo162153a();

        /* renamed from: b */
        boolean mo162154b();

        /* renamed from: c */
        boolean mo162155c();

        /* renamed from: d */
        boolean mo162156d();
    }

    public final Function0<Unit> getCopyTextCallback() {
        return this.f116276j;
    }

    public final IMmSubtitleContentTextViewDepend getDepend() {
        return this.f116277k;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getOnClickCallback() {
        return this.f116272f;
    }

    public final Function0<Unit> getOnLongClickCallback() {
        return this.f116273g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.o<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.o<java.lang.Integer, java.lang.Integer, java.lang.String, kotlin.Unit> */
    public final Function3<Integer, Integer, String, Unit> getOnStartCommentCallback() {
        return this.f116274h;
    }

    public final SelectableTextHelper getSelectableTextHelper() {
        return this.f116269a;
    }

    public final int getSelectedColor() {
        return this.f116281o;
    }

    public final Function0<Unit> getViewOriginalTextCallback() {
        return this.f116275i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mm/widget/selectable/SelectableTextHelper$Mode;", "getMode"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView$c */
    public static final class C46141c implements SelectableTextHelper.AbstractC47164c {

        /* renamed from: a */
        final /* synthetic */ MmSubtitleContentTextView f116283a;

        C46141c(MmSubtitleContentTextView mmSubtitleContentTextView) {
            this.f116283a = mmSubtitleContentTextView;
        }

        @Override // com.ss.android.lark.mm.widget.selectable.SelectableTextHelper.AbstractC47164c
        /* renamed from: a */
        public final SelectableTextHelper.Mode mo162159a() {
            return this.f116283a.getMode();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/MmSubtitleContentTextView$initSelectableTextHelper$1", "Lcom/ss/android/lark/mm/widget/selectable/OnSelectListener;", "onTextLongClicked", "", "onTextSelected", "content", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView$b */
    public static final class C46140b implements AbstractC47166a {

        /* renamed from: a */
        final /* synthetic */ MmSubtitleContentTextView f116282a;

        @Override // com.ss.android.lark.mm.widget.selectable.AbstractC47166a
        /* renamed from: a */
        public void mo162158a(CharSequence charSequence) {
        }

        @Override // com.ss.android.lark.mm.widget.selectable.AbstractC47166a
        /* renamed from: a */
        public void mo162157a() {
            Function0<Unit> onLongClickCallback = this.f116282a.getOnLongClickCallback();
            if (onLongClickCallback != null) {
                onLongClickCallback.invoke();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46140b(MmSubtitleContentTextView mmSubtitleContentTextView) {
            this.f116282a = mmSubtitleContentTextView;
        }
    }

    public final SelectableTextHelper.Mode getMode() {
        IMmSubtitleContentTextViewDepend aVar = this.f116277k;
        if (aVar == null || !aVar.mo162153a()) {
            IMmSubtitleContentTextViewDepend aVar2 = this.f116277k;
            if (aVar2 == null || !aVar2.mo162155c()) {
                return SelectableTextHelper.Mode.NORMAL;
            }
            return SelectableTextHelper.Mode.UNCOMPLETED;
        }
        IMmSubtitleContentTextViewDepend aVar3 = this.f116277k;
        if (aVar3 == null || !aVar3.mo162154b()) {
            return SelectableTextHelper.Mode.SUBTITLE_TRANSLATE;
        }
        return SelectableTextHelper.Mode.SUBTITLE_TRANSLATE_PLAYING;
    }

    /* renamed from: a */
    public final void mo162133a() {
        boolean z;
        IMmSubtitleContentTextViewDepend aVar;
        this.f116269a = new SelectableTextHelper.C47162a(this, this.f116271e).mo165834b(this.f116281o).mo165831a(20.0f).mo165832a(Color.parseColor("#0071E8")).mo165833a();
        IMmSubtitleContentTextViewDepend aVar2 = this.f116277k;
        int i = 0;
        if ((aVar2 == null || !aVar2.mo162153a()) && ((aVar = this.f116277k) == null || aVar.mo162156d())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view = this.f116280n;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f116278l;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        } else {
            View view3 = this.f116280n;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.f116278l;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        View view5 = this.f116279m;
        if (view5 != null) {
            IMmSubtitleContentTextViewDepend aVar3 = this.f116277k;
            if (aVar3 == null || !aVar3.mo162153a()) {
                i = 8;
            }
            view5.setVisibility(i);
        }
        SelectableTextHelper selectableTextHelper = this.f116269a;
        if (selectableTextHelper != null) {
            selectableTextHelper.mo165813a(new C46140b(this));
        }
        SelectableTextHelper selectableTextHelper2 = this.f116269a;
        if (selectableTextHelper2 != null) {
            selectableTextHelper2.mo165812a(new C46141c(this));
        }
    }

    public final void setCopyTextCallback(Function0<Unit> function0) {
        this.f116276j = function0;
    }

    public final void setDepend(IMmSubtitleContentTextViewDepend aVar) {
        this.f116277k = aVar;
    }

    public final void setOnClickCallback(Function1<? super Integer, Unit> function1) {
        this.f116272f = function1;
    }

    public final void setOnLongClickCallback(Function0<Unit> function0) {
        this.f116273g = function0;
    }

    public final void setOnStartCommentCallback(Function3<? super Integer, ? super Integer, ? super String, Unit> oVar) {
        this.f116274h = oVar;
    }

    public final void setViewOriginalTextCallback(Function0<Unit> function0) {
        this.f116275i = function0;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f116270c = System.currentTimeMillis();
        } else if (action == 1 && System.currentTimeMillis() - this.f116270c < ((long) LocationRequest.PRIORITY_HD_ACCURACY)) {
            Layout layout = getLayout();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (layout != null) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) y), x);
                C45855f.m181664c("MmSubtitleContentTextView", "click subtitle word");
                Function1<? super Integer, Unit> function1 = this.f116272f;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(offsetForHorizontal));
                }
            } else {
                C45855f.m181666e("MmSubtitleContentTextView", "layout is null");
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSubtitleContentTextView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mm_layout_menu_windows, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…ayout_menu_windows, null)");
        this.f116271e = inflate;
        this.f116281o = UDColorUtils.getColor(context, R.color.ud_B500_20);
        View findViewById = this.f116271e.findViewById(R.id.tv_copy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById<View>(R.id.tv_copy)");
        C47110e.m186573a(findViewById, new Function1<View, Unit>(this) {
            /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView.C461371 */
            final /* synthetic */ MmSubtitleContentTextView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                String str;
                Intrinsics.checkParameterIsNotNull(view, "it");
                C45855f.m181664c("MmSubtitleContentTextView", "start copy");
                SelectableTextHelper selectableTextHelper = this.this$0.getSelectableTextHelper();
                if (selectableTextHelper != null && (str = selectableTextHelper.mo165814b().f118946c) != null) {
                    ClipBoardUtil.f118606a.mo165481a(context, str.toString());
                    C45858j.m181677a((int) R.string.MMWeb_G_CopiedSuccessfully);
                    selectableTextHelper.mo165821g();
                    Function0<Unit> copyTextCallback = this.this$0.getCopyTextCallback();
                    if (copyTextCallback != null) {
                        copyTextCallback.invoke();
                    }
                }
            }
        });
        View findViewById2 = this.f116271e.findViewById(R.id.tv_comment);
        this.f116278l = findViewById2;
        if (findViewById2 != null) {
            C47110e.m186573a(findViewById2, new Function1<View, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView.C461382 */
                final /* synthetic */ MmSubtitleContentTextView this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    boolean z;
                    Function3<Integer, Integer, String, Unit> onStartCommentCallback;
                    Intrinsics.checkParameterIsNotNull(view, "it");
                    C45855f.m181664c("MmSubtitleContentTextView", "start comment");
                    SelectableTextHelper selectableTextHelper = this.this$0.getSelectableTextHelper();
                    if (selectableTextHelper != null) {
                        int i = selectableTextHelper.mo165814b().f118944a;
                        int i2 = selectableTextHelper.mo165814b().f118945b;
                        String str = selectableTextHelper.mo165814b().f118946c;
                        selectableTextHelper.mo165821g();
                        if (i != -1 && i2 != -1) {
                            String str2 = str;
                            if (str2 == null || StringsKt.isBlank(str2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && (onStartCommentCallback = this.this$0.getOnStartCommentCallback()) != null) {
                                onStartCommentCallback.invoke(Integer.valueOf(i), Integer.valueOf(i2), str);
                            }
                        }
                    }
                }
            });
        }
        View findViewById3 = this.f116271e.findViewById(R.id.tv_view_origin_text);
        this.f116279m = findViewById3;
        if (findViewById3 != null) {
            C47110e.m186573a(findViewById3, new Function1<View, Unit>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView.C461393 */
                final /* synthetic */ MmSubtitleContentTextView this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "it");
                    C45855f.m181664c("MmSubtitleContentTextView", "view original content");
                    SelectableTextHelper selectableTextHelper = this.this$0.getSelectableTextHelper();
                    if (selectableTextHelper != null) {
                        selectableTextHelper.mo165821g();
                    }
                    Function0<Unit> viewOriginalTextCallback = this.this$0.getViewOriginalTextCallback();
                    if (viewOriginalTextCallback != null) {
                        viewOriginalTextCallback.invoke();
                    }
                }
            });
        }
        this.f116280n = this.f116271e.findViewById(R.id.divider);
    }
}
