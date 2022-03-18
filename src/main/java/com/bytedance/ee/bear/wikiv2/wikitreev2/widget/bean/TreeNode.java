package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;
import java.util.HashMap;
import java.util.Map;

public final class TreeNode implements Parcelable, NonProguard, Cloneable {
    public static final Parcelable.Creator<TreeNode> CREATOR = new Parcelable.Creator<TreeNode>() {
        /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode.C124561 */

        /* renamed from: a */
        public TreeNode[] newArray(int i) {
            return new TreeNode[i];
        }

        /* renamed from: a */
        public TreeNode createFromParcel(Parcel parcel) {
            return new TreeNode(parcel);
        }
    };
    public boolean has_child;
    public boolean is_star;
    public Map<String, C12457a> ns = new HashMap();
    public String obj_token;
    public int obj_type;
    public String origin_space_id;
    public String origin_wiki_token;
    public String parent_wiki_token;
    public WikNodePerm perm;
    public double sort_id;
    public String space_id;
    public String title;
    public int wiki_node_type;
    public String wiki_token;

    public int describeContents() {
        return 0;
    }

    public int getNodeType() {
        return C12459b.m51814a(this);
    }

    public boolean isShortcut() {
        return C12459b.m51820d(this.wiki_node_type);
    }

    public TreeNode() {
    }

    @Override // java.lang.Object
    public TreeNode clone() {
        TreeNode treeNode;
        Exception e;
        TreeNode treeNode2 = new TreeNode();
        try {
            treeNode = (TreeNode) super.clone();
            try {
                treeNode.ns = new HashMap();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            treeNode = treeNode2;
            e = e3;
            C13479a.m54759a("Wiki_TreeNode", "clone treeNode fail.", e);
            return treeNode;
        }
        return treeNode;
    }

    public static TreeNode createFavoriteRoot(String str) {
        return createRoot(str, "wikiroot%favorite", -1);
    }

    public static TreeNode createSingleRoot(String str) {
        return createRoot(str, "wikiroot%single", -2);
    }

    public C12457a getNsOrCreate(String str) {
        C12457a aVar = this.ns.get(str);
        if (aVar != null) {
            return aVar;
        }
        C12457a aVar2 = new C12457a(str);
        this.ns.put(str, aVar2);
        return aVar2;
    }

    public static TreeNode createNone(String str) {
        TreeNode treeNode = new TreeNode();
        treeNode.space_id = str;
        treeNode.wiki_token = String.valueOf(treeNode.hashCode());
        treeNode.wiki_node_type = -3;
        treeNode.parent_wiki_token = "";
        treeNode.obj_type = C8275a.f22369b.mo32555b();
        return treeNode;
    }

    protected TreeNode(Parcel parcel) {
        this.space_id = parcel.readString();
        this.wiki_token = parcel.readString();
        this.obj_token = parcel.readString();
        this.obj_type = parcel.readInt();
        this.title = parcel.readString();
        this.parent_wiki_token = parcel.readString();
        this.sort_id = parcel.readDouble();
        this.wiki_node_type = parcel.readInt();
        this.origin_wiki_token = parcel.readString();
        this.origin_space_id = parcel.readString();
    }

    public static TreeNode createVirtualRoot(String str, String str2) {
        return createRoot(str, str2, 2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.space_id);
        parcel.writeString(this.wiki_token);
        parcel.writeString(this.obj_token);
        parcel.writeInt(this.obj_type);
        parcel.writeString(this.title);
        parcel.writeString(this.parent_wiki_token);
        parcel.writeDouble(this.sort_id);
        parcel.writeInt(this.wiki_node_type);
        parcel.writeString(this.origin_wiki_token);
        parcel.writeString(this.origin_space_id);
    }

    private static TreeNode createRoot(String str, String str2, int i) {
        TreeNode treeNode = new TreeNode();
        treeNode.space_id = str;
        treeNode.wiki_token = str2;
        treeNode.wiki_node_type = i;
        treeNode.parent_wiki_token = "";
        treeNode.obj_type = C8275a.f22369b.mo32555b();
        return treeNode;
    }
}
