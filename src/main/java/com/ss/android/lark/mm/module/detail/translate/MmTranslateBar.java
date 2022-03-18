package com.ss.android.lark.mm.module.detail.translate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "callback", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar$IMmTranslateBarCallback;", "getCallback", "()Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar$IMmTranslateBarCallback;", "setCallback", "(Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar$IMmTranslateBarCallback;)V", "setCurrentLang", "", "curLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "IMmTranslateBarCallback", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MmTranslateBar extends ConstraintLayout {

    /* renamed from: a */
    private IMmTranslateBarCallback f116635a;

    /* renamed from: b */
    private HashMap f116636b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateBar$IMmTranslateBarCallback;", "", "changeTranslateLang", "", "exitTranslate", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.MmTranslateBar$a */
    public interface IMmTranslateBarCallback {
        /* renamed from: a */
        void mo161304a();

        /* renamed from: b */
        void mo161305b();
    }

    public MmTranslateBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public MmTranslateBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo162750a(int i) {
        if (this.f116636b == null) {
            this.f116636b = new HashMap();
        }
        View view = (View) this.f116636b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116636b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final IMmTranslateBarCallback getCallback() {
        return this.f116635a;
    }

    public final void setCallback(IMmTranslateBarCallback aVar) {
        this.f116635a = aVar;
    }

    public final void setCurrentLang(MmTranslateLangType mmTranslateLangType) {
        int i;
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "curLang");
        TextView textView = (TextView) mo162750a(R.id.curLangTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "curLangTv");
        Context context = getContext();
        int i2 = C46304b.f116645a[mmTranslateLangType.ordinal()];
        if (i2 == 1) {
            i = R.string.MMWeb_G_OriginalLanguage;
        } else if (i2 == 2) {
            i = R.string.MMWeb_G_SimplifiedChinese;
        } else if (i2 == 3) {
            i = R.string.MMWeb_G_Japanese;
        } else if (i2 == 4) {
            i = R.string.MMWeb_G_English;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(context.getString(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmTranslateBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.mm_translate_bar, this);
        TextView textView = (TextView) mo162750a(R.id.exitTranslateTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "exitTranslateTv");
        C47110e.m186573a(textView, new Function1<View, Unit>(this) {
            /* class com.ss.android.lark.mm.module.detail.translate.MmTranslateBar.C462981 */
            final /* synthetic */ MmTranslateBar this$0;

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
                C45855f.m181664c("MmTranslateBar", "exit translate");
                IMmTranslateBarCallback callback = this.this$0.getCallback();
                if (callback != null) {
                    callback.mo161304a();
                }
            }
        });
        TextView textView2 = (TextView) mo162750a(R.id.curLangTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "curLangTv");
        C47110e.m186572a(textView2, C57582a.m223600a(15));
        TextView textView3 = (TextView) mo162750a(R.id.curLangTv);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "curLangTv");
        C47110e.m186573a(textView3, new Function1<View, Unit>(this) {
            /* class com.ss.android.lark.mm.module.detail.translate.MmTranslateBar.C462992 */
            final /* synthetic */ MmTranslateBar this$0;

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
                C45855f.m181664c("MmTranslateBar", "change translate lang");
                IMmTranslateBarCallback callback = this.this$0.getCallback();
                if (callback != null) {
                    callback.mo161305b();
                }
            }
        });
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MmTranslateBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
