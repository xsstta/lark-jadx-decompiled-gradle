package com.bytedance.ee.bear.middleground.comment.widget;

import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.widget.CommentTextView;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10160d;
import com.bytedance.ee.bear.p398i.C7832d;
import com.bytedance.ee.bear.p398i.C7836h;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p519p.C10462b;
import com.bytedance.ee.bear.p519p.C10463c;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J$\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/widget/RichTextInjector;", "", "()V", "TAG", "", "initPermission", "", "textView", "Landroid/widget/TextView;", "permissionTag", "inject", "commentTextView", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "userId", "listener", "Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;", "requestPermission", "permissionInitializer", "Lkotlin/Lazy;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.widget.a */
public final class RichTextInjector {

    /* renamed from: a */
    public static final RichTextInjector f25015a = new RichTextInjector();

    private RichTextInjector() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.a$d */
    static final class C9303d extends Lambda implements Function0<Unit> {
        final /* synthetic */ CommentTextView $commentTextView;
        final /* synthetic */ String $permissionTag;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9303d(CommentTextView commentTextView, String str) {
            super(0);
            this.$commentTextView = commentTextView;
            this.$permissionTag = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RichTextInjector.f25015a.mo35508a(this.$commentTextView, this.$permissionTag);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ShareHitPoint.f121868c, "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.a$a */
    public static final class C9300a extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ String $permissionTag;
        final /* synthetic */ TextView $textView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9300a(TextView textView, String str) {
            super(1);
            this.$textView = textView;
            this.$permissionTag = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            C10462b[] bVarArr;
            boolean z;
            try {
                CharSequence text = this.$textView.getText();
                C13479a.m54764b("RichTextInjector", "tag:" + this.$permissionTag);
                if ((text instanceof SpannableString) && (bVarArr = (C10462b[]) ((SpannableString) text).getSpans(0, text.length(), C10462b.class)) != null) {
                    C10463c[] cVarArr = (C10463c[]) ((SpannableString) text).getSpans(0, text.length(), C10463c.class);
                    List parseArray = JSON.parseArray(str, Info.class);
                    int length = bVarArr.length;
                    for (int i = 0; i < length; i++) {
                        Intrinsics.checkExpressionValueIsNotNull(parseArray, "list");
                        int size = parseArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str2 = ((Info) parseArray.get(i2)).token;
                            C10462b bVar = bVarArr[i];
                            Intrinsics.checkExpressionValueIsNotNull(bVar, "iconSpans[i]");
                            if (Intrinsics.areEqual(str2, bVar.mo39742b()) && ((Info) parseArray.get(i2)).code == 0) {
                                C10462b bVar2 = bVarArr[i];
                                Intrinsics.checkExpressionValueIsNotNull(bVar2, "iconSpans[i]");
                                boolean z2 = true;
                                if (!((Info) parseArray.get(i2)).readAble) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bVar2.mo39741a(z);
                                C10463c cVar = cVarArr[i];
                                Intrinsics.checkExpressionValueIsNotNull(cVar, "docsFileSpans[i]");
                                if (((Info) parseArray.get(i2)).readAble) {
                                    z2 = false;
                                }
                                cVar.mo39748a(z2);
                                C13479a.m54764b("RichTextInjector", " invalidate");
                            }
                        }
                    }
                    this.$textView.invalidate();
                }
            } catch (Exception e) {
                C13479a.m54761a("RichTextInjector", e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/comment/widget/RichTextInjector$inject$2", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView$IAfterSetText;", "afterSetText", "", "textView", "Landroid/widget/TextView;", "onViewAttachedToWindow", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.a$c */
    public static final class C9302c implements CommentTextView.AbstractView$OnAttachStateChangeListenerC9297a {

        /* renamed from: a */
        final /* synthetic */ String f25019a;

        /* renamed from: b */
        final /* synthetic */ Lazy f25020b;

        @Override // com.bytedance.ee.bear.middleground.comment.widget.CommentTextView.AbstractView$OnAttachStateChangeListenerC9297a
        /* renamed from: a */
        public void mo35499a(TextView textView) {
            Intrinsics.checkParameterIsNotNull(textView, "textView");
            RichTextInjector.f25015a.mo35509a(textView, this.f25019a, this.f25020b);
        }

        public void onViewAttachedToWindow(View view) {
            if (view instanceof TextView) {
                this.f25020b.getValue();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            ((AbstractC10160d) KoinJavaComponent.m268613a(AbstractC10160d.class, null, null, 6, null)).mo37763a(this.f25019a);
        }

        C9302c(String str, Lazy lazy) {
            this.f25019a = str;
            this.f25020b = lazy;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/bytedance/ee/bear/middleground/comment/widget/RichTextInjector$inject$1", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView$IParser;", "parse", "", "text", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.widget.a$b */
    public static final class C9301b implements CommentTextView.AbstractC9298b {

        /* renamed from: a */
        final /* synthetic */ CommentTextView f25016a;

        /* renamed from: b */
        final /* synthetic */ String f25017b;

        /* renamed from: c */
        final /* synthetic */ AbstractC10460a.AbstractC10461a f25018c;

        @Override // com.bytedance.ee.bear.middleground.comment.widget.CommentTextView.AbstractC9298b
        /* renamed from: a */
        public CharSequence mo35500a(CharSequence charSequence) {
            String str;
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            try {
                return new C7836h(this.f25016a, this.f25017b, this.f25018c).apply(new C7832d().apply(str)).f21147a;
            } catch (Throwable th) {
                C13479a.m54773d("RichTextInjector", "Failed to parse atContent!", th);
                return charSequence;
            }
        }

        C9301b(CommentTextView commentTextView, String str, AbstractC10460a.AbstractC10461a aVar) {
            this.f25016a = commentTextView;
            this.f25017b = str;
            this.f25018c = aVar;
        }
    }

    /* renamed from: a */
    public final void mo35508a(TextView textView, String str) {
        C13479a.m54764b("RichTextInjector", "init:" + str);
        ((AbstractC10160d) KoinJavaComponent.m268613a(AbstractC10160d.class, null, null, 6, null)).mo37764a(str, new C9300a(textView, str));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m38468a(CommentTextView commentTextView, String str, AbstractC10460a.AbstractC10461a aVar) {
        Intrinsics.checkParameterIsNotNull(commentTextView, "commentTextView");
        commentTextView.setParser(new C9301b(commentTextView, str, aVar));
        String str2 = commentTextView.getClass().getSimpleName() + '@' + commentTextView.hashCode();
        commentTextView.setAfterSetText(new C9302c(str2, LazyKt.lazy(new C9303d(commentTextView, str2))));
    }

    /* renamed from: a */
    public final void mo35509a(TextView textView, String str, Lazy<?> lazy) {
        lazy.getValue();
        CharSequence text = textView.getText();
        if (!(text instanceof SpannableString)) {
            text = null;
        }
        SpannableString spannableString = (SpannableString) text;
        if (spannableString != null) {
            C10462b[] bVarArr = (C10462b[]) spannableString.getSpans(0, spannableString.length(), C10462b.class);
            if (bVarArr != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (C10462b bVar : bVarArr) {
                    Intrinsics.checkExpressionValueIsNotNull(bVar, "iconSpan");
                    String b = bVar.mo39742b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "iconSpan.token");
                    arrayList.add(b);
                    C8275a b2 = C10599b.m43905b(bVar.mo39740a());
                    Intrinsics.checkExpressionValueIsNotNull(b2, "AtUtils.getDocumentTypeU…entionType(iconSpan.type)");
                    arrayList2.add(b2);
                }
                C13479a.m54764b("RichTextInjector", "add: tag:" + str);
                ((AbstractC10160d) KoinJavaComponent.m268613a(AbstractC10160d.class, null, null, 6, null)).mo37765a(arrayList2, arrayList);
            }
        }
    }
}
