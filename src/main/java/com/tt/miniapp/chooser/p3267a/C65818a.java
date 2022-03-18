package com.tt.miniapp.chooser.p3267a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.tt.miniapp.entity.Folder;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.util.C67590h;
import java.text.MessageFormat;
import java.util.ArrayList;

/* renamed from: com.tt.miniapp.chooser.a.a */
public class C65818a extends BaseAdapter {

    /* renamed from: a */
    ArrayList<Folder> f165871a;

    /* renamed from: b */
    int f165872b;

    /* renamed from: c */
    private LayoutInflater f165873c;

    /* renamed from: d */
    private Context f165874d;

    public long getItemId(int i) {
        return 0;
    }

    public int getCount() {
        return this.f165871a.size();
    }

    /* renamed from: a */
    public ArrayList<MediaEntity> mo230539a() {
        return this.f165871a.get(this.f165872b).mo231045a();
    }

    /* renamed from: a */
    public void mo230540a(ArrayList<Folder> arrayList) {
        this.f165871a = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public Folder getItem(int i) {
        return this.f165871a.get(i);
    }

    /* renamed from: b */
    public void mo230541b(int i) {
        if (this.f165872b != i) {
            this.f165872b = i;
            notifyDataSetChanged();
        }
    }

    public C65818a(ArrayList<Folder> arrayList, Context context) {
        this.f165873c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f165871a = arrayList;
        this.f165874d = context;
    }

    /* renamed from: com.tt.miniapp.chooser.a.a$a */
    class C65819a {

        /* renamed from: a */
        ImageView f165875a;

        /* renamed from: b */
        ImageView f165876b;

        /* renamed from: c */
        TextView f165877c;

        /* renamed from: d */
        TextView f165878d;

        /* renamed from: e */
        TextView f165879e;

        C65819a(View view) {
            this.f165875a = (ImageView) view.findViewById(R.id.microapp_m_cover);
            this.f165877c = (TextView) view.findViewById(R.id.microapp_m_name);
            this.f165878d = (TextView) view.findViewById(R.id.microapp_m_path);
            this.f165879e = (TextView) view.findViewById(R.id.microapp_m_size);
            this.f165876b = (ImageView) view.findViewById(R.id.microapp_m_indicator);
            view.setTag(this);
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C65819a aVar;
        int i2 = 0;
        if (view == null) {
            view = this.f165873c.inflate(R.layout.microapp_m_folders_view_item, viewGroup, false);
            aVar = new C65819a(view);
        } else {
            aVar = (C65819a) view.getTag();
        }
        Folder a = getItem(i);
        if (a.mo231045a().size() > 0) {
            HostDependManager inst = HostDependManager.getInst();
            Context context = this.f165874d;
            ImageView imageView = aVar.f165875a;
            inst.loadImage(context, imageView, Uri.parse("file://" + a.mo231045a().get(0).f170268a));
        } else {
            aVar.f165875a.setImageDrawable(ContextCompat.getDrawable(this.f165874d, R.drawable.microapp_m_default_image));
        }
        aVar.f165877c.setText(a.f166623a);
        aVar.f165879e.setText(MessageFormat.format("{0}{1}", Integer.valueOf(a.mo231045a().size()), C67590h.m263073a((int) R.string.microapp_m_count_string)));
        ImageView imageView2 = aVar.f165876b;
        if (this.f165872b != i) {
            i2 = 4;
        }
        imageView2.setVisibility(i2);
        return view;
    }
}
