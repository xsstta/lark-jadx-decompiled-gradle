package com.ss.android.lark.mm.module.record.detail.subtitle;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.record.model.MmRecordPara;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import com.ss.android.lark.mm.utils.MmDateUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "paras", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/mm/module/record/model/MmRecordPara;", "Lkotlin/collections/ArrayList;", "getItemCount", "", "getLastPara", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "", "MmRecordSubtitleViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.a.d */
public final class MmRecordSubtitleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private final ArrayList<MmRecordPara> f118036a = new ArrayList<>();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f118036a.size();
    }

    /* renamed from: a */
    public final MmRecordPara mo164664a() {
        if (this.f118036a.isEmpty()) {
            return null;
        }
        return this.f118036a.get(0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/subtitle/MmRecordSubtitleAdapter$MmRecordSubtitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "container", "Landroid/view/View;", "(Landroid/view/View;)V", "getContainer", "()Landroid/view/View;", "paraTimeTv", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "sp", "Landroid/text/SpannableStringBuilder;", "subtitleContentView", "bind", "", "para", "Lcom/ss/android/lark/mm/module/record/model/MmRecordPara;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.a.d$a */
    public static final class MmRecordSubtitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final TextView f118037a;

        /* renamed from: b */
        private final TextView f118038b;

        /* renamed from: c */
        private final SpannableStringBuilder f118039c = new SpannableStringBuilder();

        /* renamed from: d */
        private final View f118040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MmRecordSubtitleViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "container");
            this.f118040d = view;
            this.f118037a = (TextView) view.findViewById(R.id.paraTimeTv);
            this.f118038b = (TextView) view.findViewById(R.id.subtitleContentView);
        }

        /* renamed from: a */
        public final void mo164666a(MmRecordPara mmRecordPara) {
            Intrinsics.checkParameterIsNotNull(mmRecordPara, "para");
            this.f118039c.clearSpans();
            this.f118039c.clear();
            int size = mmRecordPara.getSentences().size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                MmRecordSentence mmRecordSentence = mmRecordPara.getSentences().get(i);
                Intrinsics.checkExpressionValueIsNotNull(mmRecordSentence, "para.sentences[index]");
                SpannableString spannableString = new SpannableString(mmRecordSentence.getSentences());
                if (i == mmRecordPara.getSentences().size() - 1) {
                    MmRecordSentence mmRecordSentence2 = mmRecordPara.getSentences().get(i);
                    Intrinsics.checkExpressionValueIsNotNull(mmRecordSentence2, "para.sentences[index]");
                    if (!mmRecordSentence2.isFinal()) {
                        Context context = this.f118040d.getContext();
                        Intrinsics.checkExpressionValueIsNotNull(context, "container.context");
                        spannableString.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(context, R.color.text_placeholder)), 0, spannableString.length(), 17);
                        this.f118039c.append((CharSequence) spannableString);
                    }
                }
                Context context2 = this.f118040d.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "container.context");
                spannableString.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(context2, R.color.text_title)), 0, spannableString.length(), 17);
                this.f118039c.append((CharSequence) spannableString);
            }
            if (this.f118039c.length() == 0) {
                z = true;
            }
            if (!z) {
                TextView textView = this.f118038b;
                Intrinsics.checkExpressionValueIsNotNull(textView, "subtitleContentView");
                textView.setText(this.f118039c);
                String startTime = mmRecordPara.getStartTime();
                if (startTime == null) {
                    startTime = mmRecordPara.getPid();
                }
                TextView textView2 = this.f118037a;
                Intrinsics.checkExpressionValueIsNotNull(textView2, "paraTimeTv");
                Intrinsics.checkExpressionValueIsNotNull(startTime, "starTime");
                textView2.setText(MmDateUtil.m186536a((int) (Long.parseLong(startTime) / ((long) 1000))));
            }
        }
    }

    /* renamed from: a */
    public final void mo164665a(List<? extends MmRecordPara> list) {
        Intrinsics.checkParameterIsNotNull(list, "paras");
        this.f118036a.clear();
        this.f118036a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof MmRecordSubtitleViewHolder) {
            MmRecordPara mmRecordPara = this.f118036a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(mmRecordPara, "paras.get(position)");
            ((MmRecordSubtitleViewHolder) viewHolder).mo164666a(mmRecordPara);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_record_subtitle_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…itle_item, parent, false)");
        return new MmRecordSubtitleViewHolder(inflate);
    }
}
