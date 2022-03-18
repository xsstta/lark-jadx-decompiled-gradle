package com.bytedance.ee.bear.doc.translate;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u000b2\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u0016\u0010\u001e\u001a\u00020\u000b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010 R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/doc/translate/ChooseLanguageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/doc/translate/ChooseLanguageAdapter$ChooseLanguageItemViewHolder;", "()V", "TAG", "", "languages", "", "Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "onItemClickListener", "Lkotlin/Function1;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedLanguage", "getSelectedLanguage", "()Lcom/bytedance/ee/bear/doc/translate/LanguageModel;", "setSelectedLanguage", "(Lcom/bytedance/ee/bear/doc/translate/LanguageModel;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "ChooseLanguageItemViewHolder", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.translate.b */
public final class ChooseLanguageAdapter extends RecyclerView.Adapter<ChooseLanguageItemViewHolder> {

    /* renamed from: a */
    public final String f15799a = "ChooseLanguageAdapter";

    /* renamed from: b */
    public List<LanguageModel> f15800b = new ArrayList();

    /* renamed from: c */
    private Function1<? super LanguageModel, Unit> f15801c;

    /* renamed from: d */
    private LanguageModel f15802d;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.doc.translate.LanguageModel, kotlin.Unit>, kotlin.jvm.functions.Function1<com.bytedance.ee.bear.doc.translate.LanguageModel, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<LanguageModel, Unit> mo22221a() {
        return this.f15801c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15800b.size();
    }

    /* renamed from: a */
    public final void mo22222a(LanguageModel languageModel) {
        this.f15802d = languageModel;
    }

    /* renamed from: a */
    public final void mo22225a(Function1<? super LanguageModel, Unit> function1) {
        this.f15801c = function1;
    }

    /* renamed from: a */
    public final void mo22224a(List<? extends LanguageModel> list) {
        if (list == null || list.isEmpty()) {
            this.f15800b.clear();
            notifyDataSetChanged();
        } else if (!Intrinsics.areEqual(this.f15800b, list)) {
            this.f15800b.clear();
            this.f15800b.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public ChooseLanguageItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.choose_language_rv_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…           parent, false)");
        return new ChooseLanguageItemViewHolder(this, inflate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/doc/translate/ChooseLanguageAdapter$ChooseLanguageItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "root", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/doc/translate/ChooseLanguageAdapter;Landroid/view/View;)V", "languageTv", "Landroid/widget/TextView;", "selectedIv", "Landroid/widget/ImageView;", "setContent", "", "text", "", "selected", "", "isLast", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.translate.b$a */
    public final class ChooseLanguageItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f15803a;

        /* renamed from: b */
        final /* synthetic */ ChooseLanguageAdapter f15804b;

        /* renamed from: c */
        private final TextView f15805c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChooseLanguageItemViewHolder(ChooseLanguageAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "root");
            this.f15804b = bVar;
            View findViewById = view.findViewById(R.id.language_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.language_text)");
            this.f15805c = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.selected_language_iv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.selected_language_iv)");
            this.f15803a = (ImageView) findViewById2;
            this.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e(this) {
                /* class com.bytedance.ee.bear.doc.translate.ChooseLanguageAdapter.ChooseLanguageItemViewHolder.C55701 */

                /* renamed from: a */
                final /* synthetic */ ChooseLanguageItemViewHolder f15806a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f15806a = r1;
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    Object obj;
                    LanguageModel languageModel = null;
                    if (view != null) {
                        obj = view.getTag();
                    } else {
                        obj = null;
                    }
                    if (obj instanceof LanguageModel) {
                        languageModel = obj;
                    }
                    LanguageModel languageModel2 = languageModel;
                    if (languageModel2 != null) {
                        this.f15806a.f15803a.setVisibility(0);
                        Function1<LanguageModel, Unit> a = this.f15806a.f15804b.mo22221a();
                        if (a != null) {
                            a.invoke(languageModel2);
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo22226a(String str, boolean z, boolean z2) {
            int i;
            if (TextUtils.isEmpty(str)) {
                String str2 = this.f15804b.f15799a;
                C13479a.m54758a(str2, "Set language error!, text is null or empty!. languageList: " + this.f15804b.f15800b);
                str = "";
            }
            this.f15805c.setText(str);
            ImageView imageView = this.f15803a;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ChooseLanguageItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        LanguageModel languageModel = this.f15800b.get(i);
        boolean z = true;
        if (getItemCount() - 1 != i) {
            z = false;
        }
        View view = aVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        view.setTag(languageModel);
        aVar.mo22226a(languageModel.getDisplayText(), Objects.equals(this.f15802d, languageModel), z);
    }
}
