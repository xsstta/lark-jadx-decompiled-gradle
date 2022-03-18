package com.bytedance.ee.bear.drive.biz.upload.filepicker.model;

public class User extends AID {
    private static final long serialVersionUID = 8250909336356908786L;

    @Override // com.bytedance.ee.bear.drive.biz.upload.filepicker.model.AID
    public String toString() {
        return "User [" + super.toString() + "]";
    }

    public User(int i, String str) {
        super(i, str);
    }
}
