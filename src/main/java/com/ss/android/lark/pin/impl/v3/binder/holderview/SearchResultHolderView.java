package com.ss.android.lark.pin.impl.v3.binder.holderview;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.SearchResult;
import com.ss.android.lark.pin.dto.SearchResultInfo;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.C51620g;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001bH\u0002J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u001bH\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006!"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/SearchResultHolderView;", "Lcom/ss/android/lark/pin/impl/v3/binder/holderview/BaseHolderView2;", "Lcom/ss/android/lark/pin/impl/v3/binder/viewholder/SearchResultViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "is24HourTime", "", "()Z", "set24HourTime", "(Z)V", "getContentViewWidth", "", "onBindViewHolder", "", "viewHolder", "position", "item", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "processRichSubTitleAsync", "holder", "messageInfo", "Lcom/ss/android/lark/pin/dto/SearchResultInfo;", "setMessageChatAvatar", "setMessageChatName", "setMessageContent", "setMessageTime", "Companion", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.q */
public final class SearchResultHolderView extends AbstractC51540b<C51620g> {

    /* renamed from: a */
    public static final Companion f128366a = new Companion(null);

    /* renamed from: b */
    private boolean f128367b = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/SearchResultHolderView$Companion;", "", "()V", "AVATAR_SIZE", "", "MESSAGE_CONTENT_MARGIN", "", "SEARCH_AVATAR_HOLDER_WIDTH", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.q$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo177583a() {
        return (DeviceUtils.getScreenWidth(this.f146181d) - ((int) C25653b.m91892a(this.f146181d, 76.0f))) - ((int) C25653b.m91892a(this.f146181d, 32.0f));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.q$b */
    public static final class RunnableC51574b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchResultHolderView f128368a;

        /* renamed from: b */
        final /* synthetic */ SearchResultInfo f128369b;

        /* renamed from: c */
        final /* synthetic */ C51620g f128370c;

        RunnableC51574b(SearchResultHolderView qVar, SearchResultInfo dVar, C51620g gVar) {
            this.f128368a = qVar;
            this.f128369b = dVar;
            this.f128370c = gVar;
        }

        public final void run() {
            int i;
            AbstractC51472a.AbstractC51477d j;
            SearchResult a = this.f128369b.mo177283a();
            String str = a.mo177276d().get(0);
            Doc doc = null;
            Iterator<Doc> it = a.mo177280f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Doc next = it.next();
                String name = next.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "doc.name");
                if (name != null) {
                    String lowerCase = name.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str, false, 2, (Object) null)) {
                        doc = next;
                        break;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            if (doc != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("$" + doc.getName());
                C58508e.C58510a a2 = new C58508e.C58510a(this.f128368a.f146181d, new C58508e.C58511b(doc.getName())).mo198336a("");
                EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f128370c.f128445p;
                Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView, "holder.contentTV");
                C58508e.C58510a b = a2.mo198338b((int) ellipsizedEmojiconTextView.getTextSize());
                AbstractC51472a a3 = PinModule.f128091b.mo177253a();
                if (a3 == null || (j = a3.mo144036j()) == null) {
                    i = 0;
                } else {
                    DocType docType = doc.getDocType();
                    Intrinsics.checkExpressionValueIsNotNull(docType, "target.docType");
                    i = j.mo144085a(docType.getNumber(), true);
                }
                C58508e.C58510a a4 = b.mo198333a(i);
                Intrinsics.checkExpressionValueIsNotNull(a4, "Builder(mContext, Target…cType.number, true) ?: 0)");
                spannableStringBuilder.setSpan(a4.mo198337a(), 0, 1, 17);
                int a5 = this.f128368a.mo177583a();
                List<String> d = a.mo177276d();
                EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = this.f128370c.f128445p;
                Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView2, "holder.contentTV");
                TextPaint paint = ellipsizedEmojiconTextView2.getPaint();
                EllipsizedEmojiconTextView ellipsizedEmojiconTextView3 = this.f128370c.f128445p;
                Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView3, "holder.contentTV");
                final SpannableString a6 = C57782ag.m224236a(spannableStringBuilder, d, paint, a5, C57582a.m223616d(ellipsizedEmojiconTextView3.getContext(), R.color.function_info_500));
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getUIExecutor().execute(new Runnable(this) {
                    /* class com.ss.android.lark.pin.impl.v3.binder.holderview.SearchResultHolderView.RunnableC51574b.RunnableC515751 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC51574b f128371a;

                    {
                        this.f128371a = r1;
                    }

                    public final void run() {
                        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f128371a.f128370c.f128445p;
                        ellipsizedEmojiconTextView.setVisibility(0);
                        ellipsizedEmojiconTextView.setTranslateEmojiCode(false);
                        ellipsizedEmojiconTextView.setText(a6);
                    }
                });
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchResultHolderView(Context context) {
        super(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C51620g mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        C51620g a = C51620g.C51621a.m200248a(layoutInflater, viewGroup);
        Intrinsics.checkExpressionValueIsNotNull(a, "SearchResultViewHolder.F…eate(inflater, container)");
        return a;
    }

    /* renamed from: e */
    private final void m200145e(C51620g gVar, SearchResultInfo dVar) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC51574b(this, dVar, gVar));
    }

    /* renamed from: a */
    private final void m200141a(C51620g gVar, SearchResultInfo dVar) {
        SearchResult a = dVar.mo177283a();
        TextView textView = gVar.f128443n;
        Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.nameTV");
        List<String> c = a.mo177273c();
        TextView textView2 = gVar.f128443n;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "viewHolder.nameTV");
        textView.setText(C57782ag.m224235a(a.mo177278e(), c, C57582a.m223616d(textView2.getContext(), R.color.function_info_500)));
    }

    /* renamed from: d */
    private final void m200144d(C51620g gVar, SearchResultInfo dVar) {
        TextView textView = gVar.f128444o;
        Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.timeTV");
        Context context = this.f146181d;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        textView.setText(SearchCommonUtils.m209227a(context, dVar.mo177396g().getUpdateTime(), this.f128367b));
    }

    /* renamed from: b */
    private final void m200142b(C51620g gVar, SearchResultInfo dVar) {
        boolean z;
        AbstractC51472a.AbstractC51480g f;
        if (dVar.mo177393d().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            gVar.f128442m.setImageResource(R.color.lkui_transparent);
            return;
        }
        String d = dVar.mo177393d();
        String c = dVar.mo177392c();
        AbstractC51472a a = PinModule.f128091b.mo177253a();
        if (a != null && (f = a.mo144032f()) != null) {
            Context context = this.f146181d;
            LKUIRoundedImageView lKUIRoundedImageView = gVar.f128442m;
            float f2 = (float) 40;
            f.mo144055a(context, d, c, lKUIRoundedImageView, UIHelper.dp2px(f2), UIHelper.dp2px(f2));
        }
    }

    /* renamed from: c */
    private final void m200143c(C51620g gVar, SearchResultInfo dVar) {
        SearchResult a = dVar.mo177283a();
        boolean z = true;
        if (!a.mo177280f().isEmpty()) {
            m200145e(gVar, dVar);
            return;
        }
        if (a.mo177269b().length() <= 0) {
            z = false;
        }
        if (z) {
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView = gVar.f128445p;
            Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView, "viewHolder.contentTV");
            ellipsizedEmojiconTextView.setTranslateEmojiCode(false);
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = gVar.f128445p;
            Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView2, "viewHolder.contentTV");
            List<String> d = a.mo177276d();
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView3 = gVar.f128445p;
            Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView3, "viewHolder.contentTV");
            TextPaint paint = ellipsizedEmojiconTextView3.getPaint();
            int a2 = mo177583a();
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView4 = gVar.f128445p;
            Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView4, "viewHolder.contentTV");
            ellipsizedEmojiconTextView2.setText(C57782ag.m224236a(a.mo177269b(), d, paint, a2, C57582a.m223616d(ellipsizedEmojiconTextView4.getContext(), R.color.function_info_500)));
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView5 = gVar.f128445p;
            Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView5, "viewHolder.contentTV");
            ellipsizedEmojiconTextView5.setVisibility(0);
            return;
        }
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView6 = gVar.f128445p;
        Intrinsics.checkExpressionValueIsNotNull(ellipsizedEmojiconTextView6, "viewHolder.contentTV");
        ellipsizedEmojiconTextView6.setVisibility(8);
    }

    /* renamed from: a */
    public void mo177520a(C51620g gVar, int i, PinInfo bVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(bVar, "item");
        if (bVar instanceof SearchResultInfo) {
            SearchResultInfo dVar = (SearchResultInfo) bVar;
            m200141a(gVar, dVar);
            m200142b(gVar, dVar);
            m200143c(gVar, dVar);
            m200144d(gVar, dVar);
        }
    }
}
