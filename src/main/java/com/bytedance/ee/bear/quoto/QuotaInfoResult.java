package com.bytedance.ee.bear.quoto;

import com.bytedance.ee.bear.contract.NetService;
import java.io.Serializable;
import java.util.List;

public class QuotaInfoResult extends NetService.Result<DataDTO> {

    public static class DataDTO implements Serializable {
        private QuotaInfo owner;
        private QuotaInfo tenant;
        private QuotaInfo user;

        public static class ContactsDTO implements Serializable {
            private String enName;
            private String name;
            private String uid;

            public String getEnName() {
                return this.enName;
            }

            public String getName() {
                return this.name;
            }

            public String getUid() {
                return this.uid;
            }

            public String toString() {
                return "ContactsDTO{uid='" + this.uid + '\'' + ", name='" + this.name + '\'' + ", enName='" + this.enName + '\'' + '}';
            }

            public void setEnName(String str) {
                this.enName = str;
            }

            public void setName(String str) {
                this.name = str;
            }

            public void setUid(String str) {
                this.uid = str;
            }
        }

        public static class QuotaInfo implements Serializable {
            private List<ContactsDTO> contacts;
            private String id;
            private long limit;
            private long usage;

            public List<ContactsDTO> getContacts() {
                return this.contacts;
            }

            public String getId() {
                return this.id;
            }

            public long getLimit() {
                return this.limit;
            }

            public long getUsage() {
                return this.usage;
            }

            public String toString() {
                return "TenantDTO{id='" + this.id + '\'' + ", usage=" + this.usage + ", limit=" + this.limit + ", contacts=" + this.contacts + '}';
            }

            public void setContacts(List<ContactsDTO> list) {
                this.contacts = list;
            }

            public void setId(String str) {
                this.id = str;
            }

            public void setLimit(long j) {
                this.limit = j;
            }

            public void setUsage(long j) {
                this.usage = j;
            }
        }

        public QuotaInfo getOwner() {
            return this.owner;
        }

        public QuotaInfo getTenant() {
            return this.tenant;
        }

        public QuotaInfo getUser() {
            return this.user;
        }

        public String toString() {
            return "DataDTO{tenant=" + this.tenant + ", user=" + this.user + ", owner=" + this.owner + '}';
        }

        public void setOwner(QuotaInfo quotaInfo) {
            this.owner = quotaInfo;
        }

        public void setTenant(QuotaInfo quotaInfo) {
            this.tenant = quotaInfo;
        }

        public void setUser(QuotaInfo quotaInfo) {
            this.user = quotaInfo;
        }
    }
}
