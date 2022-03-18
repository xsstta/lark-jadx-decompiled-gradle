package com.ss.android.lark.mm.module.detail.contentdetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.live.settings.C41524a;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.MmDetailActivity;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ClickButtonEvent;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.videoshop.api.C64107n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailFileAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailFileAdapter$MMFileHolder;", "()V", "files", "", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$File$FileInfo;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "list", "", "MMFileHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.a.e */
public final class MmContentDetailFileAdapter extends RecyclerView.Adapter<MMFileHolder> {

    /* renamed from: a */
    private final List<MmBaseInfo.File.FileInfo> f115790a = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailFileAdapter$MMFileHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "dp10", "", "fileTitle", "Landroid/widget/TextView;", "fileView", "Landroid/widget/ImageView;", "settings", "Lcom/ss/android/lark/live/settings/VcInnoSettings;", "getView", "()Landroid/view/View;", "bind", "", "file", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$File$FileInfo;", "getDocIcon", ShareHitPoint.f121869d, "", "setClickListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.e$a */
    public static final class MMFileHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final C41524a f115791a = new C41524a();

        /* renamed from: b */
        private final ImageView f115792b;

        /* renamed from: c */
        private final TextView f115793c;

        /* renamed from: d */
        private final int f115794d = C57582a.m223600a(10);

        /* renamed from: e */
        private final View f115795e;

        /* renamed from: a */
        public final View mo161362a() {
            return this.f115795e;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.a.e$a$a */
        public static final class C45930a extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ MmBaseInfo.File.FileInfo $file;
            final /* synthetic */ MMFileHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45930a(MMFileHolder aVar, MmBaseInfo.File.FileInfo fileInfo) {
                super(1);
                this.this$0 = aVar;
                this.$file = fileInfo;
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
                C45855f.m181664c("MmContentDetailFileAdapter", "click link, url: " + this.$file.getFileUrl());
                if (!this.this$0.f115791a.mo149412b(this.$file.getFileUrl())) {
                    IMmDepend a = C45899c.m181859a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                    a.getBrowserDepend().mo144660a(C64107n.m251616a(), this.$file.getFileUrl());
                } else if (this.this$0.f115791a.mo149414c(this.$file.getFileUrl())) {
                    MinutesListActivity.Companion aVar = MinutesListActivity.f116750b;
                    IMmDepend a2 = C45899c.m181859a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
                    IMmDepend.AbstractC45871b contextDepend = a2.getContextDepend();
                    Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
                    Context a3 = contextDepend.mo144557a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "MmDepend.impl().contextDepend.context");
                    String fileUrl = this.$file.getFileUrl();
                    Intrinsics.checkExpressionValueIsNotNull(fileUrl, "file.fileUrl");
                    MinutesListActivity.Companion.m183527a(aVar, a3, fileUrl, 14, null, 8, null);
                } else {
                    MmDetailActivity.Companion aVar2 = MmDetailActivity.f115761d;
                    IMmDepend a4 = C45899c.m181859a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "MmDepend.impl()");
                    IMmDepend.AbstractC45871b contextDepend2 = a4.getContextDepend();
                    Intrinsics.checkExpressionValueIsNotNull(contextDepend2, "MmDepend.impl().contextDepend");
                    Context a5 = contextDepend2.mo144557a();
                    Intrinsics.checkExpressionValueIsNotNull(a5, "MmDepend.impl().contextDepend.context");
                    String fileUrl2 = this.$file.getFileUrl();
                    Intrinsics.checkExpressionValueIsNotNull(fileUrl2, "file.fileUrl");
                    MmDetailActivity.Companion.m182008a(aVar2, a5, fileUrl2, 14, null, null, null, 56, null);
                }
                ClickButtonEvent aVar3 = new ClickButtonEvent("open_share_link", null, null, null, null, this.$file.getFid(), null, 94, null);
                Context context = this.this$0.mo161362a().getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
                aVar3.mo165434a(context).mo165437a();
                C47083e.m186423a(this.this$0.mo161362a().getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("open_share_link").mo165423e("none").mo165413a("file_id", C57859q.m224565a(this.$file.getFid())).mo165421c());
            }
        }

        /* renamed from: b */
        public final void mo161364b(MmBaseInfo.File.FileInfo fileInfo) {
            Intrinsics.checkParameterIsNotNull(fileInfo, "file");
            C47110e.m186573a(this.f115795e, new C45930a(this, fileInfo));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MMFileHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f115795e = view;
            View findViewById = view.findViewById(R.id.doc_type);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.doc_type)");
            this.f115792b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.doc_title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.doc_title)");
            this.f115793c = (TextView) findViewById2;
        }

        /* renamed from: a */
        public final void mo161363a(MmBaseInfo.File.FileInfo fileInfo) {
            int i;
            Intrinsics.checkParameterIsNotNull(fileInfo, "file");
            this.f115793c.setText(fileInfo.getFileTitle());
            ImageView imageView = this.f115792b;
            String fileIcon = fileInfo.getFileIcon();
            Intrinsics.checkExpressionValueIsNotNull(fileIcon, "file.fileIcon");
            imageView.setImageResource(m182047a(fileIcon));
            ViewGroup.LayoutParams layoutParams = this.f115795e.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (getAdapterPosition() != 0) {
                    i = this.f115794d;
                } else {
                    i = 0;
                }
                marginLayoutParams.topMargin = i;
                this.f115795e.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }

        /* renamed from: a */
        private final int m182047a(String str) {
            switch (str.hashCode()) {
                case -794682742:
                    if (str.equals("icon-file-text")) {
                        return R.drawable.ud_icon_file_link_text_outlined;
                    }
                    break;
                case -794583961:
                    if (str.equals("icon-file-word")) {
                        return R.drawable.ud_icon_file_link_word_outlined;
                    }
                    break;
                case 273693217:
                    if (str.equals("icon-file-mindnote")) {
                        return R.drawable.ud_icon_file_link_mindnote_outlined;
                    }
                    break;
                case 781325674:
                    if (str.equals("icon-file-bitable")) {
                        return R.drawable.ud_icon_file_link_bitable_outlined;
                    }
                    break;
                case 850614977:
                    if (str.equals("icon-file-unknow")) {
                        return R.drawable.ud_icon_file_link_unknow_outlined;
                    }
                    break;
                case 944192501:
                    if (str.equals("icon-file-pdf")) {
                        return R.drawable.ud_icon_file_link_pdf_outlined;
                    }
                    break;
                case 944192887:
                    if (str.equals("icon-file-ppt")) {
                        return R.drawable.ud_icon_file_link_ppt_outlined;
                    }
                    break;
                case 944202276:
                    if (str.equals("icon-file-zip")) {
                        return R.drawable.ud_icon_file_link_zip_outlined;
                    }
                    break;
                case 1117549081:
                    if (str.equals("icon-file-audio")) {
                        return R.drawable.ud_icon_file_link_audio_outlined;
                    }
                    break;
                case 1121331450:
                    if (str.equals("icon-file-excel")) {
                        return R.drawable.ud_icon_file_link_excel_outlined;
                    }
                    break;
                case 1124695966:
                    if (str.equals("icon-file-image")) {
                        return R.drawable.ud_icon_file_link_image_outlined;
                    }
                    break;
                case 1133786018:
                    if (str.equals("icon-file-sheet")) {
                        return R.drawable.ud_icon_file_link_sheet_outlined;
                    }
                    break;
                case 1133908980:
                    if (str.equals("icon-file-slide")) {
                        return R.drawable.ud_icon_file_link_slide_outlined;
                    }
                    break;
                case 1136585406:
                    if (str.equals("icon-file-video")) {
                        return R.drawable.ud_icon_file_link_video_outlined;
                    }
                    break;
            }
            return R.drawable.ud_icon_file_link_otherfile_outlined;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f115790a.size();
    }

    /* renamed from: a */
    public final void mo161361a(List<? extends MmBaseInfo.File.FileInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f115790a.clear();
        this.f115790a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public MMFileHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_share_file_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new MMFileHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(MMFileHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo161363a(this.f115790a.get(i));
        aVar.mo161364b(this.f115790a.get(i));
    }
}
