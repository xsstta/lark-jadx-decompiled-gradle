package com.bytedance.ee.bear.wiki.spacedetail;

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
import com.bytedance.ee.bear.wiki.spacedetail.SpaceBean;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wiki.spacedetail.c */
public class C12045c extends RecyclerView.Adapter<C12048b> {

    /* renamed from: a */
    private List<SpaceBean.MembersBean> f32519a;

    /* renamed from: b */
    private Context f32520b;

    /* renamed from: c */
    private boolean f32521c;

    /* renamed from: d */
    private AbstractC12047a f32522d;

    /* renamed from: com.bytedance.ee.bear.wiki.spacedetail.c$a */
    public interface AbstractC12047a {
        void onClickUser(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<SpaceBean.MembersBean> list = this.f32519a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public void mo46132a(AbstractC12047a aVar) {
        this.f32522d = aVar;
    }

    public C12045c(Context context) {
        this.f32520b = context;
    }

    /* renamed from: com.bytedance.ee.bear.wiki.spacedetail.c$b */
    public static class C12048b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public UDAvatar f32524a;

        /* renamed from: b */
        public TextView f32525b;

        /* renamed from: c */
        public TextView f32526c;

        /* renamed from: d */
        public TextView f32527d;

        public C12048b(View view) {
            super(view);
            this.f32524a = (UDAvatar) view.findViewById(R.id.iv_member_avatar);
            this.f32525b = (TextView) view.findViewById(R.id.tv_member_name);
            this.f32526c = (TextView) view.findViewById(R.id.tv_member_department);
            this.f32527d = (TextView) view.findViewById(R.id.tv_member_permission);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49893a(String str, View view) {
        AbstractC12047a aVar = this.f32522d;
        if (aVar != null) {
            aVar.onClickUser(str);
        }
    }

    /* renamed from: a */
    private void m49892a(View view, String str) {
        view.setOnClickListener(new View.OnClickListener(str) {
            /* class com.bytedance.ee.bear.wiki.spacedetail.$$Lambda$c$gOcsG3_97Oku2TELUvK7R5C1lk */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C12045c.m270042lambda$gOcsG3_97Oku2TELUvK7R5C1lk(C12045c.this, this.f$1, view);
            }
        });
    }

    /* renamed from: b */
    private void m49894b(C12048b bVar, int i) {
        bVar.f32524a.setImageDrawable(new ColorDrawable(i));
        bVar.f32525b.setBackgroundColor(i);
        bVar.f32526c.setBackgroundColor(i);
        bVar.f32527d.setBackgroundColor(i);
    }

    /* renamed from: a */
    public C12048b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12048b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wiki_space_member_list_item, viewGroup, false));
    }

    /* renamed from: a */
    public void mo46134a(List<SpaceBean.MembersBean> list, boolean z) {
        this.f32519a = list;
        this.f32521c = z;
    }

    /* renamed from: a */
    public void onBindViewHolder(C12048b bVar, int i) {
        if (this.f32519a == null) {
            C13479a.m54758a("WikiSpaceMemberAdapter", "mMembersBeanList is null");
        } else if (this.f32521c) {
            C13479a.m54764b("WikiSpaceMemberAdapter", "mIsPlaceHolderMode is true");
            m49894b(bVar, this.f32520b.getResources().getColor(R.color.bg_body_overlay));
        } else {
            m49894b(bVar, this.f32520b.getResources().getColor(R.color.bg_body));
            SpaceBean.MembersBean membersBean = this.f32519a.get(i);
            bVar.f32525b.setText(membersBean.getMember_name());
            if (membersBean.getDescription() == null || membersBean.getDescription().trim().isEmpty()) {
                bVar.f32526c.setVisibility(8);
            } else {
                bVar.f32526c.setVisibility(0);
                bVar.f32526c.setText(membersBean.getDescription());
            }
            if (membersBean.getMember_role() >= 4) {
                bVar.f32527d.setText(this.f32520b.getResources().getString(R.string.Doc_Wiki_SpaceDetail_RoleAdmin));
            } else {
                bVar.f32527d.setText(this.f32520b.getResources().getString(R.string.Doc_Wiki_SpaceDetail_RoleMember));
            }
            if (!TextUtils.isEmpty(membersBean.getIcon_url())) {
                ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f32520b).mo10414a(new C13664a(membersBean.getIcon_url())).mo11123a((int) R.drawable.facade_common_avatar_place_holder)).mo11143c(R.drawable.facade_common_avatar_place_holder)).mo10392a((AbstractC2536f) new AbstractC2536f<Drawable>() {
                    /* class com.bytedance.ee.bear.wiki.spacedetail.C12045c.C120461 */

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
                }).mo10399a((ImageView) bVar.f32524a);
            } else if (membersBean.getMember_type() == 18 || membersBean.getMember_type() == 3) {
                bVar.f32524a.setImageResource(R.drawable.icon_collaborator_organization);
            } else if (membersBean.getMember_type() == 22) {
                bVar.f32524a.setImageResource(R.drawable.icon_collaborator_usergroup);
            } else {
                C13479a.m54758a("WikiSpaceMemberAdapter", "membersBean getIcon_url is null");
                bVar.f32524a.setImageResource(R.drawable.facade_common_avatar_place_holder);
            }
            if (membersBean.getMember_type() == 1) {
                m49892a(bVar.f32524a, membersBean.getMember_id());
            } else {
                bVar.f32524a.setOnClickListener(null);
            }
        }
    }
}
