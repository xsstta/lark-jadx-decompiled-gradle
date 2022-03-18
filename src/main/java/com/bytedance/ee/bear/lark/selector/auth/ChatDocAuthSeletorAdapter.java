package com.bytedance.ee.bear.lark.selector.auth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ee.bear.lark.selector.DocModuleInner;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocPermPair;
import com.ss.android.lark.doc.entity.DocPermission;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ToggleButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ChatDocAuthSeletorAdapter extends RecyclerView.Adapter<DocAuthViewHolder> implements View.OnClickListener, ToggleButton.AbstractC58310a {

    /* renamed from: a */
    private LayoutInflater f21620a;

    /* renamed from: b */
    private AbstractC8074a f21621b;

    /* renamed from: c */
    private List<DocResult> f21622c;

    /* renamed from: d */
    private HashMap<String, DocPermPair.PermType> f21623d = new HashMap<>();

    /* renamed from: e */
    private HashSet<Integer> f21624e = new HashSet<>();

    /* renamed from: com.bytedance.ee.bear.lark.selector.auth.ChatDocAuthSeletorAdapter$a */
    public interface AbstractC8074a {
        /* renamed from: a */
        void mo31222a();
    }

    /* renamed from: c */
    public HashMap<String, DocPermPair.PermType> mo31219c() {
        return this.f21623d;
    }

    /* renamed from: b */
    public int mo31218b() {
        return this.f21624e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f21622c.size();
    }

    public class DocAuthViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private DocAuthViewHolder f21625a;

        @Override // butterknife.Unbinder
        public void unbind() {
            DocAuthViewHolder docAuthViewHolder = this.f21625a;
            if (docAuthViewHolder != null) {
                this.f21625a = null;
                docAuthViewHolder.docAuthItemCheckbox = null;
                docAuthViewHolder.docAuthItemIcon = null;
                docAuthViewHolder.docAuthItemName = null;
                docAuthViewHolder.docAuthItemDesc = null;
                docAuthViewHolder.docPermSwitcher = null;
                docAuthViewHolder.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public DocAuthViewHolder_ViewBinding(DocAuthViewHolder docAuthViewHolder, View view) {
            this.f21625a = docAuthViewHolder;
            docAuthViewHolder.docAuthItemCheckbox = (UDCheckBox) Utils.findRequiredViewAsType(view, R.id.doc_auth_item_checkbox, "field 'docAuthItemCheckbox'", UDCheckBox.class);
            docAuthViewHolder.docAuthItemIcon = (ImageView) Utils.findRequiredViewAsType(view, R.id.doc_auth_item_icon, "field 'docAuthItemIcon'", ImageView.class);
            docAuthViewHolder.docAuthItemName = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_auth_item_name, "field 'docAuthItemName'", TextView.class);
            docAuthViewHolder.docAuthItemDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.doc_auth_item_desc, "field 'docAuthItemDesc'", TextView.class);
            docAuthViewHolder.docPermSwitcher = (ToggleButton) Utils.findRequiredViewAsType(view, R.id.doc_auth_item_permission_switcher, "field 'docPermSwitcher'", ToggleButton.class);
            docAuthViewHolder.divider = Utils.findRequiredView(view, R.id.doc_auth_item_divider, "field 'divider'");
        }
    }

    /* renamed from: a */
    public List<DocResult> mo31214a() {
        ArrayList arrayList = new ArrayList(this.f21624e.size());
        Iterator<Integer> it = this.f21624e.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f21622c.get(it.next().intValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo31216a(AbstractC8074a aVar) {
        this.f21621b = aVar;
    }

    /* renamed from: a */
    public DocResult mo31213a(int i) {
        return this.f21622c.get(i);
    }

    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (this.f21624e.contains(Integer.valueOf(intValue))) {
            this.f21624e.remove(Integer.valueOf(intValue));
        } else {
            this.f21624e.add(Integer.valueOf(intValue));
        }
        notifyItemChanged(intValue);
        AbstractC8074a aVar = this.f21621b;
        if (aVar != null) {
            aVar.mo31222a();
        }
    }

    /* renamed from: a */
    public DocAuthViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DocAuthViewHolder(this.f21620a, viewGroup, this, this);
    }

    @Override // com.ss.android.lark.widget.ToggleButton.AbstractC58310a
    /* renamed from: a */
    public void mo31217a(ToggleButton toggleButton, boolean z) {
        DocPermPair.PermType permType;
        HashMap<String, DocPermPair.PermType> hashMap = this.f21623d;
        String url = ((DocResult) toggleButton.getTag()).getDoc().getUrl();
        if (z) {
            permType = DocPermPair.PermType.EDIT;
        } else {
            permType = DocPermPair.PermType.READ;
        }
        hashMap.put(url, permType);
    }

    /* renamed from: a */
    public void onBindViewHolder(DocAuthViewHolder docAuthViewHolder, int i) {
        DocResult a = mo31213a(i);
        docAuthViewHolder.mo31221a(i, mo31213a(i), this.f21624e.contains(Integer.valueOf(i)), this.f21623d.get(a.getDoc().getUrl()));
    }

    public ChatDocAuthSeletorAdapter(Context context, List<DocResult> list) {
        boolean z;
        this.f21620a = LayoutInflater.from(context);
        this.f21622c = new ArrayList(list);
        for (int i = 0; i < this.f21622c.size(); i++) {
            this.f21624e.add(Integer.valueOf(i));
            DocResult docResult = this.f21622c.get(i);
            Iterator<DocPermission> it = docResult.getDocCard().getPermissions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                DocPermission next = it.next();
                if (next.isSet()) {
                    this.f21623d.put(docResult.getDoc().getUrl(), DocPermPair.PermType.forNumber(next.getPermTypeNum()));
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.f21623d.put(docResult.getDoc().getUrl(), DocPermPair.PermType.READ);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class DocAuthViewHolder extends RecyclerView.ViewHolder {
        @BindView(8530)
        View divider;
        @BindView(8528)
        UDCheckBox docAuthItemCheckbox;
        @BindView(8529)
        TextView docAuthItemDesc;
        @BindView(8531)
        ImageView docAuthItemIcon;
        @BindView(8532)
        TextView docAuthItemName;
        @BindView(8533)
        ToggleButton docPermSwitcher;

        public DocAuthViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener, ToggleButton.AbstractC58310a aVar) {
            super(layoutInflater.inflate(R.layout.chat_doc_auth_select_item, viewGroup, false));
            ButterKnife.bind(this, this.itemView);
            this.itemView.setOnClickListener(onClickListener);
            this.docPermSwitcher.setOnCheckedChangeListener(aVar);
        }

        /* renamed from: a */
        public void mo31221a(int i, DocResult docResult, boolean z, DocPermPair.PermType permType) {
            boolean z2;
            boolean z3;
            this.docPermSwitcher.setTag(docResult);
            this.docPermSwitcher.setTag(docResult);
            this.itemView.setTag(Integer.valueOf(i));
            Doc doc = docResult.getDoc();
            this.docAuthItemIcon.setImageResource(DocModuleInner.m32271a(doc.getDocType(), doc.getName()));
            String name = doc.getName();
            String ownerName = doc.getOwnerName();
            this.docAuthItemCheckbox.setChecked(z);
            this.docAuthItemName.setText(name);
            this.docAuthItemDesc.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_DocsPreviewOwner, "owner", ownerName));
            boolean z4 = false;
            if (docResult.getDocCard() == null || docResult.getDocCard().getPermissions().size() <= 1) {
                z2 = false;
            } else {
                z2 = true;
            }
            ToggleButton toggleButton = this.docPermSwitcher;
            if (permType == DocPermPair.PermType.EDIT) {
                z3 = true;
            } else {
                z3 = false;
            }
            toggleButton.setChecked(z3);
            ToggleButton toggleButton2 = this.docPermSwitcher;
            if (z2 || permType == DocPermPair.PermType.EDIT) {
                z4 = true;
            }
            toggleButton2.setEnabled(z4);
        }
    }
}
