package com.ss.android.lark.mm.module.detail.translate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ignition.widget.setting_group.SettingGroupHelper;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.record.detail.MmRecordDetailActivity;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BaseDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "()V", "depend", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog$IMmTranslateMenuDependency;", "getDepend", "()Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog$IMmTranslateMenuDependency;", "setDepend", "(Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog$IMmTranslateMenuDependency;)V", "translateChangeCallback", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "", "getTranslateChangeCallback", "()Lkotlin/jvm/functions/Function1;", "setTranslateChangeCallback", "(Lkotlin/jvm/functions/Function1;)V", "getHitPointLanguageValue", "", "langType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "IMmTranslateMenuDependency", "TranslateMenuAdapter", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.translate.d */
public final class MmTranslateMenuDialog extends BaseDialog {

    /* renamed from: c */
    private Function1<? super MmTranslateLangType, Unit> f116649c;

    /* renamed from: d */
    private IMmTranslateMenuDependency f116650d;

    /* renamed from: e */
    private HashMap f116651e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog$IMmTranslateMenuDependency;", "", "getSubtitleLanguages", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$SubtitleLanguage;", "getTranslateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isFilterOriginalLang", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.d$a */
    public interface IMmTranslateMenuDependency {
        /* renamed from: a */
        MmTranslateLangType mo161300a();

        /* renamed from: b */
        List<MmBaseInfo.SubtitleLanguage> mo161301b();

        /* renamed from: c */
        boolean mo161302c();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J \u0010\u0018\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog$TranslateMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onSelectTranslateLangCallback", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnSelectTranslateLangCallback", "()Lkotlin/jvm/functions/Function1;", "selectedTranslateLangType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "subtitleLanguages", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$SubtitleLanguage;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "", "TranslateMenuViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.d$b */
    public static final class TranslateMenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        public final List<MmBaseInfo.SubtitleLanguage> f116652a = new ArrayList();

        /* renamed from: b */
        private MmTranslateLangType f116653b = MmTranslateLangType.DEFAULT;

        /* renamed from: c */
        private final Function1<String, Unit> f116654c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateMenuDialog$TranslateMenuAdapter$TranslateMenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "divider", "getDivider", "()Landroid/view/View;", "langNameTv", "Landroid/widget/TextView;", "getLangNameTv", "()Landroid/widget/TextView;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.translate.d$b$a */
        public static final class TranslateMenuViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            private final TextView f116655a;

            /* renamed from: b */
            private final View f116656b;

            /* renamed from: a */
            public final TextView mo162775a() {
                return this.f116655a;
            }

            /* renamed from: b */
            public final View mo162776b() {
                return this.f116656b;
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public TranslateMenuViewHolder(View view) {
                super(view);
                Intrinsics.checkParameterIsNotNull(view, "contentView");
                View findViewById = view.findViewById(R.id.langNameTv);
                Intrinsics.checkExpressionValueIsNotNull(findViewById, "contentView.findViewById(R.id.langNameTv)");
                this.f116655a = (TextView) findViewById;
                View findViewById2 = view.findViewById(R.id.divider);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "contentView.findViewById(R.id.divider)");
                this.f116656b = findViewById2;
            }
        }

        /* renamed from: a */
        public final Function1<String, Unit> mo162773a() {
            return this.f116654c;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f116652a.size();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.translate.d$b$b */
        static final class C46306b extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ int $position;
            final /* synthetic */ TranslateMenuAdapter this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46306b(TranslateMenuAdapter bVar, int i) {
                super(1);
                this.this$0 = bVar;
                this.$position = i;
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
                C45855f.m181664c("MmTranslateMenuDialog", "select translate lang, " + this.this$0.f116652a.get(this.$position).getLanguage());
                Function1<String, Unit> a = this.this$0.mo162773a();
                String language = this.this$0.f116652a.get(this.$position).getLanguage();
                Intrinsics.checkExpressionValueIsNotNull(language, "subtitleLanguages[position].language");
                a.invoke(language);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TranslateMenuAdapter(Function1<? super String, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onSelectTranslateLangCallback");
            this.f116654c = function1;
        }

        /* renamed from: a */
        public final void mo162774a(List<? extends MmBaseInfo.SubtitleLanguage> list, MmTranslateLangType mmTranslateLangType) {
            if (list != null) {
                this.f116653b = mmTranslateLangType;
                this.f116652a.clear();
                this.f116652a.addAll(list);
                notifyDataSetChanged();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_translate_lang_item, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…lang_item, parent, false)");
            return new TranslateMenuViewHolder(inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            int i2;
            Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
            if (viewHolder instanceof TranslateMenuViewHolder) {
                TranslateMenuViewHolder aVar = (TranslateMenuViewHolder) viewHolder;
                aVar.mo162775a().setText(this.f116652a.get(i).getLanguageName());
                TextView a = aVar.mo162775a();
                String language = this.f116652a.get(i).getLanguage();
                MmTranslateLangType mmTranslateLangType = this.f116653b;
                if (mmTranslateLangType != null) {
                    str = mmTranslateLangType.getValue();
                } else {
                    str = null;
                }
                a.setSelected(Intrinsics.areEqual(language, str));
                View view = viewHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                C47110e.m186573a(view, new C46306b(this, i));
                View b = aVar.mo162776b();
                if (i != getItemCount() - 1) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                b.setVisibility(i2);
            }
        }
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f116651e == null) {
            this.f116651e = new HashMap();
        }
        View view = (View) this.f116651e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116651e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f116651e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType, kotlin.Unit>, kotlin.jvm.functions.Function1<com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType, kotlin.Unit> */
    /* renamed from: g */
    public final Function1<MmTranslateLangType, Unit> mo162771g() {
        return this.f116649c;
    }

    /* renamed from: h */
    public final IMmTranslateMenuDependency mo162772h() {
        return this.f116650d;
    }

    /* renamed from: a */
    public final void mo162769a(IMmTranslateMenuDependency aVar) {
        this.f116650d = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.d$c */
    static final class C46307c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmTranslateMenuDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46307c(MmTranslateMenuDialog dVar) {
            super(1);
            this.this$0 = dVar;
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
            C45855f.m181664c("MmTranslateMenuDialog", "cancel");
            this.this$0.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.translate.d$d */
    static final class C46308d extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ MmTranslateMenuDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46308d(MmTranslateMenuDialog dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            String str2;
            MmTranslateLangType mmTranslateLangType;
            String str3;
            MmTranslateLangType a;
            Intrinsics.checkParameterIsNotNull(str, "it");
            IMmTranslateMenuDependency h = this.this$0.mo162772h();
            MmTranslateLangType mmTranslateLangType2 = null;
            if (h == null || (a = h.mo161300a()) == null) {
                str2 = null;
            } else {
                str2 = a.getValue();
            }
            if (!Intrinsics.areEqual(str2, str)) {
                Function1<MmTranslateLangType, Unit> g = this.this$0.mo162771g();
                if (g != null) {
                    g.invoke(MmTranslateLangType.Companion.mo162757a(str));
                }
                FragmentActivity activity = this.this$0.getActivity();
                C47086i a2 = C47086i.m186432a().mo165409a("subtitle_language_change");
                MmTranslateMenuDialog dVar = this.this$0;
                IMmTranslateMenuDependency h2 = dVar.mo162772h();
                if (h2 != null) {
                    mmTranslateLangType = h2.mo161300a();
                } else {
                    mmTranslateLangType = null;
                }
                C47083e.m186423a(activity, "vc_mm_click_button", a2.mo165413a("from_language", dVar.mo162768a(mmTranslateLangType)).mo165413a("action_language", this.this$0.mo162768a(MmTranslateLangType.Companion.mo162757a(str))).mo165421c());
                if (this.this$0.getActivity() instanceof MmRecordDetailActivity) {
                    str3 = "vc_minutes_recording_click";
                } else {
                    str3 = "vc_minutes_detail_click";
                }
                FragmentActivity activity2 = this.this$0.getActivity();
                C47086i e = C47086i.m186432a().mo165422d("subtitle_language_change").mo165423e("none");
                MmTranslateMenuDialog dVar2 = this.this$0;
                IMmTranslateMenuDependency h3 = dVar2.mo162772h();
                if (h3 != null) {
                    mmTranslateLangType2 = h3.mo161300a();
                }
                C47083e.m186423a(activity2, str3, e.mo165428j(dVar2.mo162768a(mmTranslateLangType2)).mo165429k(this.this$0.mo162768a(MmTranslateLangType.Companion.mo162757a(str))).mo165421c());
            }
            this.this$0.u_();
        }
    }

    /* renamed from: a */
    public final void mo162770a(Function1<? super MmTranslateLangType, Unit> function1) {
        this.f116649c = function1;
    }

    /* renamed from: a */
    public final String mo162768a(MmTranslateLangType mmTranslateLangType) {
        int i;
        if (mmTranslateLangType == null || (i = C46309e.f116657a[mmTranslateLangType.ordinal()]) == 1) {
            return "default";
        }
        if (i == 2) {
            return "ja_jp";
        }
        if (i == 3) {
            return "en_us";
        }
        if (i != 4) {
            return "default";
        }
        return "zh_cn";
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo142944a(R.id.translateMenuRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "translateMenuRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        TranslateMenuAdapter bVar = new TranslateMenuAdapter(new C46308d(this));
        RecyclerView recyclerView2 = (RecyclerView) mo142944a(R.id.translateMenuRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "translateMenuRv");
        recyclerView2.setAdapter(bVar);
        IMmTranslateMenuDependency aVar = this.f116650d;
        MmTranslateLangType mmTranslateLangType = null;
        ArrayList b = aVar != null ? aVar.mo161301b() : null;
        IMmTranslateMenuDependency aVar2 = this.f116650d;
        if (aVar2 != null && aVar2.mo161302c()) {
            if (b != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : b) {
                    if (!Intrinsics.areEqual(t.getLanguage(), MmTranslateLangType.DEFAULT.getValue())) {
                        arrayList.add(t);
                    }
                }
                b = arrayList;
            } else {
                b = null;
            }
        }
        IMmTranslateMenuDependency aVar3 = this.f116650d;
        if (aVar3 != null) {
            mmTranslateLangType = aVar3.mo161300a();
        }
        bVar.mo162774a(b, mmTranslateLangType);
        RecyclerView recyclerView3 = (RecyclerView) mo142944a(R.id.translateMenuRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "translateMenuRv");
        SettingGroupHelper.m88814a(recyclerView3, false, R.color.mm_bg_setting_group_item);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo142944a(R.id.closeIv);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "closeIv");
        C47110e.m186573a(appCompatImageView, new C46307c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_dialog_tranlate, viewGroup, false);
    }
}
