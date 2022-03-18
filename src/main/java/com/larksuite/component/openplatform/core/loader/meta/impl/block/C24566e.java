package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import com.tt.refer.common.meta.base.AbsMetaLoadEntity;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.e */
public class C24566e {

    /* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.e$a */
    public static class C24567a extends AbsMetaLoadEntity {

        /* renamed from: a */
        private String f60555a;

        /* renamed from: a */
        public String mo87528a() {
            return this.f60555a;
        }

        @Override // com.tt.refer.common.meta.base.AbsMetaLoadEntity
        public String getVersionType() {
            return super.getVersionType();
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("Entity->");
            stringBuffer.append("appId:");
            stringBuffer.append(this.appId);
            stringBuffer.append("blockTypeId:");
            stringBuffer.append(this.identifier);
            stringBuffer.append("versionType:");
            stringBuffer.append(this.versionType);
            return stringBuffer.toString();
        }

        @Override // com.tt.refer.common.meta.base.AbsMetaLoadEntity
        public void setVersionType(String str) {
            super.setVersionType(str);
        }

        /* renamed from: a */
        public void mo87529a(String str) {
            this.f60555a = str;
        }

        public C24567a(String str, String str2) {
            this.appId = str;
            this.identifier = str2;
        }
    }
}
