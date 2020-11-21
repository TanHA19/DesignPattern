package com.atguigu.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType implements Serializable,Cloneable {
	public String name;
	public DeepCloneableTarget deepCloneableTarget;
	public DeepProtoType() {
		super();
	}
	
	// ���ʵ�� ��ʽһ ��¡
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object deep = null;
		deep = super.clone();
		// �������������Խ��е�������
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
		return deep;
	}
	
	// ��� ��ʽ2 ͨ���������л�
	public Object deepClone() {
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		DeepProtoType readObject = null;
		try {
			// ���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(oos);
			oos.writeObject(this); 
			
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			readObject = (DeepProtoType) ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return readObject;
	}
}
