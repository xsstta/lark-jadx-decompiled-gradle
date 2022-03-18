package com.ss.android.lark.mm.module.detail.menu.p2298a.p2300b;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.p078b.p079a.C2057g;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.module.detail.baseinfo.BaseUserType;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.menu.p2298a.p2299a.C46106a;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47085h;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.widget.BaseDialog;
import com.ss.android.lark.mm.widget.moreDetails.repo.MmMoreDetails;

/* renamed from: com.ss.android.lark.mm.module.detail.menu.a.b.a */
public class C46109a extends BaseDialog {

    /* renamed from: c */
    public AbstractC46112a f116183c;

    /* renamed from: d */
    C2057g f116184d;

    /* renamed from: e */
    C2057g f116185e;

    /* renamed from: f */
    C2057g f116186f;

    /* renamed from: g */
    C2057g f116187g;

    /* renamed from: h */
    private View$OnClickListenerC46113b f116188h;

    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a.b.a$a */
    public interface AbstractC46112a {
        /* renamed from: a */
        MmBaseInfo mo161972a();

        /* renamed from: b */
        String mo161973b();
    }

    /* renamed from: g */
    public void mo161989g() {
        this.f116184d.mo10130b();
        this.f116185e.mo10130b();
        this.f116186f.mo10130b();
        this.f116187g.mo10130b();
    }

    /* renamed from: h */
    public void mo161990h() {
        this.f116188h.f116200j.setVisibility(0);
        this.f116188h.f116201k.setVisibility(0);
        this.f116188h.f116203m.setVisibility(0);
        this.f116188h.f116202l.setVisibility(0);
    }

    /* renamed from: j */
    private void m182642j() {
        this.f116184d = C2052c.m8961a(this.f116188h.f116200j).mo10151a(R.layout.mm_more_details_skeleton).mo10152a(UIUtils.canShowSkeleton()).mo10153a();
        this.f116185e = C2052c.m8961a(this.f116188h.f116201k).mo10151a(R.layout.mm_more_details_skeleton).mo10152a(UIUtils.canShowSkeleton()).mo10153a();
        this.f116186f = C2052c.m8961a(this.f116188h.f116202l).mo10151a(R.layout.mm_more_details_skeleton).mo10152a(UIUtils.canShowSkeleton()).mo10153a();
        this.f116187g = C2052c.m8961a(this.f116188h.f116203m).mo10151a(R.layout.mm_more_details_skeleton).mo10152a(UIUtils.canShowSkeleton()).mo10153a();
    }

    /* renamed from: i */
    private void m182641i() {
        if (getView() != null) {
            View$OnClickListenerC46113b bVar = new View$OnClickListenerC46113b(getView());
            this.f116188h = bVar;
            C45853e.m181658a(bVar.f116191a, this.f116183c.mo161972a().getOwnerInfo().getAvatarUrl(), R.drawable.mm_shape_more_details_avatar_placeholder);
            this.f116188h.f116192b.setText(this.f116183c.mo161972a().getOwnerInfo().getUserName());
            this.f116188h.f116194d.setText(FormatUtil.f118607a.mo165483a(Long.valueOf(this.f116183c.mo161972a().getStartTime())));
            if (this.f116183c.mo161972a().isHasStatistics()) {
                this.f116188h.f116199i.setVisibility(8);
            } else {
                this.f116188h.f116199i.setVisibility(0);
            }
            m182642j();
            new C46106a().mo161983a(this.f116183c.mo161973b(), this.f116183c.mo161972a().getObjectToken(), new C46106a.AbstractC46108a() {
                /* class com.ss.android.lark.mm.module.detail.menu.p2298a.p2300b.C46109a.C461101 */

                @Override // com.ss.android.lark.mm.module.detail.menu.p2298a.p2299a.C46106a.AbstractC46108a
                /* renamed from: a */
                public void mo161985a(C47068a aVar) {
                    C45859k.m181686a(new Runnable() {
                        /* class com.ss.android.lark.mm.module.detail.menu.p2298a.p2300b.C46109a.C461101.RunnableC461111 */

                        public void run() {
                            if (C47098d.m186534a(C46109a.this)) {
                                C46109a.this.mo161989g();
                                C46109a.this.mo161990h();
                            }
                        }
                    }, 1000);
                }

                @Override // com.ss.android.lark.mm.module.detail.menu.p2298a.p2299a.C46106a.AbstractC46108a
                /* renamed from: a */
                public void mo161986a(MmMoreDetails mmMoreDetails) {
                    if (C47098d.m186534a(C46109a.this)) {
                        C46109a.this.mo161989g();
                        C46109a.this.mo161988a(mmMoreDetails);
                    }
                }
            });
            C47083e.m186424a(C47085h.m186430a(this.f116183c.mo161972a()), "vc_minutes_more_information_view");
        }
    }

    public C46109a(AbstractC46112a aVar) {
        this.f116183c = aVar;
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.menu.a.b.a$b */
    public class View$OnClickListenerC46113b implements View.OnClickListener {

        /* renamed from: a */
        public UDAvatar f116191a;

        /* renamed from: b */
        public TextView f116192b;

        /* renamed from: c */
        public View f116193c;

        /* renamed from: d */
        public TextView f116194d;

        /* renamed from: e */
        public TextView f116195e;

        /* renamed from: f */
        public TextView f116196f;

        /* renamed from: g */
        public TextView f116197g;

        /* renamed from: h */
        public TextView f116198h;

        /* renamed from: i */
        public ImageView f116199i;

        /* renamed from: j */
        public View f116200j;

        /* renamed from: k */
        public View f116201k;

        /* renamed from: l */
        public View f116202l;

        /* renamed from: m */
        public View f116203m;

        public void onClick(View view) {
            if (view.getId() == R.id.udOwner || view.getId() == R.id.tvOwnerName) {
                C45855f.m181664c("MoreDetailsDialog", "click avatar, open profile");
                C45899c.m181859a().getHostDepend().mo144633a(view.getContext(), C46109a.this.f116183c.mo161972a().getOwnerId(), BaseUserType.USER);
            } else if (view.getId() == R.id.ivViewTabNotice) {
                C45855f.m181664c("MoreDetailsDialog", "click notice");
                String string = C46109a.this.getString(R.string.MMWeb_G_StatsCountedFrom202011C_Tooltip);
                C46109a aVar = C46109a.this;
                aVar.mo161987a(aVar.getContext(), "", string);
            } else if (view.getId() == R.id.close) {
                C46109a.this.mo5513b();
            }
        }

        public View$OnClickListenerC46113b(View view) {
            this.f116191a = (UDAvatar) view.findViewById(R.id.udOwner);
            this.f116193c = view.findViewById(R.id.close);
            this.f116192b = (TextView) view.findViewById(R.id.tvOwnerName);
            this.f116194d = (TextView) view.findViewById(R.id.tvCreatedTime);
            this.f116195e = (TextView) view.findViewById(R.id.tvViewersNum);
            this.f116196f = (TextView) view.findViewById(R.id.tvPageViewsNum);
            this.f116197g = (TextView) view.findViewById(R.id.tvReactionsNum);
            this.f116198h = (TextView) view.findViewById(R.id.tvCommentsNum);
            this.f116199i = (ImageView) view.findViewById(R.id.ivViewTabNotice);
            this.f116200j = view.findViewById(R.id.viewersSkeletonContainer);
            this.f116201k = view.findViewById(R.id.pageViewsSkeletonContainer);
            this.f116202l = view.findViewById(R.id.reactionSkeletonContainer);
            this.f116203m = view.findViewById(R.id.commentSkeletonContainer);
            UDAvatar uDAvatar = this.f116191a;
            if (uDAvatar != null) {
                uDAvatar.setOnClickListener(this);
            }
            TextView textView = this.f116192b;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            ImageView imageView = this.f116199i;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
            View view2 = this.f116193c;
            if (view2 != null) {
                view2.setOnClickListener(this);
            }
        }
    }

    /* renamed from: a */
    public void mo161988a(MmMoreDetails mmMoreDetails) {
        this.f116188h.f116195e.setVisibility(0);
        this.f116188h.f116195e.setText(String.valueOf(mmMoreDetails.getUserView()));
        this.f116188h.f116196f.setVisibility(0);
        this.f116188h.f116196f.setText(String.valueOf(mmMoreDetails.getPageView()));
        this.f116188h.f116197g.setVisibility(0);
        this.f116188h.f116197g.setText(String.valueOf(mmMoreDetails.getReactionUserNum()));
        this.f116188h.f116198h.setVisibility(0);
        this.f116188h.f116198h.setText(String.valueOf(mmMoreDetails.getCommentNum()));
        this.f116188h.f116200j.setVisibility(8);
        this.f116188h.f116201k.setVisibility(8);
        this.f116188h.f116203m.setVisibility(8);
        this.f116188h.f116202l.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m182641i();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.mm_dialog_more_details, viewGroup, false);
    }

    /* renamed from: a */
    public void mo161987a(Context context, String str, String str2) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(str)).message(str2)).actionButtonOrientation(UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL)).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_StatsCountedFrom202011_GotIt_Button, (DialogInterface.OnClickListener) null)).show();
    }
}
