package com.bytedance.ee.bear.wikiv2.spacedetail;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.wikiv2.spacedetail.SpaceBean;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wikiv2.spacedetail.c */
public class C12387c extends RecyclerView.Adapter<C12390b> {

    /* renamed from: a */
    private List<SpaceBean.MembersBean> f33241a;

    /* renamed from: b */
    private Context f33242b;

    /* renamed from: c */
    private boolean f33243c;

    /* renamed from: d */
    private AbstractC12389a f33244d;

    /* renamed from: com.bytedance.ee.bear.wikiv2.spacedetail.c$a */
    public interface AbstractC12389a {
        void onClickUser(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SpaceBean.MembersBean> list = this.f33241a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo47195a(AbstractC12389a aVar) {
        this.f33244d = aVar;
    }

    public C12387c(Context context) {
        this.f33242b = context;
    }

    /* renamed from: com.bytedance.ee.bear.wikiv2.spacedetail.c$b */
    public static class C12390b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public UDAvatar f33246a;

        /* renamed from: b */
        public TextView f33247b;

        /* renamed from: c */
        public TextView f33248c;

        /* renamed from: d */
        public TextView f33249d;

        public C12390b(View view) {
            super(view);
            this.f33246a = (UDAvatar) view.findViewById(R.id.iv_member_avatar);
            this.f33247b = (TextView) view.findViewById(R.id.tv_member_name);
            this.f33248c = (TextView) view.findViewById(R.id.tv_member_department);
            this.f33249d = (TextView) view.findViewById(R.id.tv_member_permission);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m51529a(String str, View view) {
        AbstractC12389a aVar = this.f33244d;
        if (aVar != null) {
            aVar.onClickUser(str);
        }
    }

    /* renamed from: a */
    private void m51528a(View view, String str) {
        view.setOnClickListener(new View.OnClickListener(str) {
            /* class com.bytedance.ee.bear.wikiv2.spacedetail.$$Lambda$c$Yzwb3MQld6ejzWVJVd02KUFX41s */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C12387c.lambda$Yzwb3MQld6ejzWVJVd02KUFX41s(C12387c.this, this.f$1, view);
            }
        });
    }

    /* renamed from: b */
    private void m51530b(C12390b bVar, int i) {
        bVar.f33246a.setImageDrawable(new ColorDrawable(i));
        bVar.f33247b.setBackgroundColor(i);
        bVar.f33248c.setBackgroundColor(i);
        bVar.f33249d.setBackgroundColor(i);
    }

    /* renamed from: a */
    public C12390b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12390b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wiki_space_detail_member_item, viewGroup, false));
    }

    /* renamed from: a */
    public void mo47197a(List<SpaceBean.MembersBean> list, boolean z) {
        this.f33241a = list;
        this.f33243c = z;
    }

    /* renamed from: a */
    public void onBindViewHolder(C12390b bVar, int i) {
        if (this.f33241a == null) {
            C13479a.m54758a("WikiSpaceMemberAdapter", "mMembersBeanList is null");
        } else if (this.f33243c) {
            C13479a.m54764b("WikiSpaceMemberAdapter", "mIsPlaceHolderMode is true");
            m51530b(bVar, this.f33242b.getResources().getColor(R.color.bg_body_overlay));
        } else {
            m51530b(bVar, this.f33242b.getResources().getColor(R.color.bg_body));
            SpaceBean.MembersBean membersBean = this.f33241a.get(i);
            bVar.f33247b.setText(membersBean.getMember_name());
            if (membersBean.getDescription() == null || membersBean.getDescription().trim().isEmpty()) {
                bVar.f33248c.setVisibility(8);
            } else {
                bVar.f33248c.setVisibility(0);
                bVar.f33248c.setText(membersBean.getDescription());
            }
            if (membersBean.getMember_role() == SpaceBean.MembersBean.MEMBER_ADMIN) {
                bVar.f33249d.setText(this.f33242b.getResources().getString(R.string.Doc_Wiki_SpaceDetail_RoleAdmin));
            } else {
                bVar.f33249d.setText(this.f33242b.getResources().getString(R.string.Doc_Wiki_SpaceDetail_RoleMember));
            }
            if (!TextUtils.isEmpty(membersBean.getIcon_url())) {
                ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f33242b).mo10414a(new C13664a(membersBean.getIcon_url())).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo11143c(R.drawable.facade_common_avatar_place_holder)).mo10392a((AbstractC2536f) new AbstractC2536f<Drawable>() {
                    /* class com.bytedance.ee.bear.wikiv2.spacedetail.C12387c.C123881 */

                    /* renamed from: a */
                    public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
                        return false;
                    }

                    @Override // com.bumptech.glide.request.AbstractC2536f
                    /* renamed from: a */
                    public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
                        C13479a.m54758a("WikiSpaceMemberAdapter", "bindImage glide onException");
                        C13479a.m54761a("WikiSpaceMemberAdapter", glideException);
                        return false;
                    }
                }).mo10399a((ImageView) bVar.f33246a);
            } else if (membersBean.getMember_type() == 18) {
                bVar.f33246a.setImageResource(R.drawable.icon_collaborator_organization);
            } else if (membersBean.getMember_type() == 22) {
                bVar.f33246a.setImageResource(R.drawable.icon_collaborator_usergroup);
            } else {
                C13479a.m54758a("WikiSpaceMemberAdapter", "membersBean getIcon_url is null");
                bVar.f33246a.setImageResource(R.drawable.facade_common_avatar_place_holder);
            }
            if (membersBean.getMember_type() == 1 || membersBean.getMember_type() == 0) {
                m51528a(bVar.f33246a, membersBean.getMember_id());
            } else {
                bVar.f33246a.setOnClickListener(null);
            }
        }
    }
}
